package it.vscalcione.springboot.demoapplication.service.impl;

import it.vscalcione.springboot.demoapplication.dto.RegistrationRequest;
import it.vscalcione.springboot.demoapplication.model.User;
import it.vscalcione.springboot.demoapplication.model.VerificationToken;
import it.vscalcione.springboot.demoapplication.repository.VerificationTokenRepository;
import it.vscalcione.springboot.demoapplication.service.AuthService;
import it.vscalcione.springboot.demoapplication.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final VerificationTokenRepository verificationTokenRepository;
    private final MailService mailService;

    @Transactional
    @Override
    public void signup(RegistrationRequest registrationRequest) {
        User user = new User();


    }

    @Override
    public String generateVerificationToken(User user) {
        return null;
    }

    @Override
    public void verifyAccount(String token) {

    }

    @Override
    public void fetchUserAndEnable(VerificationToken verificationToken) {

    }
}
