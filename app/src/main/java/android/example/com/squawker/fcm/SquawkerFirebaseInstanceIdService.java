package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


/**
 * Created on 6/19/2017.
 */

public class SquawkerFirebaseInstanceIdService extends FirebaseInstanceIdService {
private static String LOG_TAG = SquawkerFirebaseInstanceIdService.class.getSimpleName();
    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d (LOG_TAG, refreshedToken);
        sendRegistrationToServer (refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
    }
}
