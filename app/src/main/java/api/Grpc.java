package api;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.erza.registrationserviceapp.GreeterGrpc;
import com.example.erza.registrationserviceapp.HelloReply;
import com.example.erza.registrationserviceapp.HelloRequest;

import java.io.PrintWriter;
import java.io.StringWriter;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Created by jora on 11/18/17.
 */

public class Grpc {
    private final String HOST = "192.168.1.8";
    private final int PORT = 50051;
    private ManagedChannel mChannel;

    public Grpc(Context context) {
        try {
            mChannel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext(true).build();

            GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(mChannel);
            HelloRequest message = HelloRequest.newBuilder().setName("Buenos Dias").build();

            HelloReply reply = stub.sayHello(message);
            Toast.makeText(context, reply.getMessage(), Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            pw.flush();
            Log.e("eerrrror", "Grpc: Failed... : " + sw.toString());
        }
    }
}
