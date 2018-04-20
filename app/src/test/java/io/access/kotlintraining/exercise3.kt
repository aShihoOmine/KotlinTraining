package io.access.kotlintraining

import io.access.kotlintraining.*

class exercise3 {
    fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
        if (client == null || message == null) return;

        //PersonalInfo personalInfo = client.getPersonalInfo();
        var personalInfo = client.personalInfo;

        //String email = personalInfo.getEmail();
        var email = personalInfo?.email;

        mailer.sendMessage(email!!, message);
    }
}