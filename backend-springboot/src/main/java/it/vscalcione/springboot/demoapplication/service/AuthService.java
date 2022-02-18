package it.vscalcione.springboot.demoapplication.service;

import it.vscalcione.springboot.demoapplication.dto.RegistrationRequest;
import it.vscalcione.springboot.demoapplication.model.User;
import it.vscalcione.springboot.demoapplication.model.VerificationToken;

public interface AuthService {

    void signup(RegistrationRequest registrationRequest);
    String generateVerificationToken(User user);
    void verifyAccount(String token);
    void fetchUserAndEnable(VerificationToken verificationToken);
}
