package com.amazonaws.services.cognito.client;

import org.junit.rules.RuleChain;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class JoseTestRules {
    private JoseTestRules() {
        // not intended for instantiation
    }

    static JwksRule testJwksServer() {
        return new JwksRule();
    }

    static class JwksRule implements TestRule {
        public final TemporaryFolder folder = new TemporaryFolder();
        public final HttpServerRule httpServer = new HttpServerRule();
        public final HttpJwksServerRule jwksServer = new HttpJwksServerRule(httpServer, folder);
        public final RuleChain chain = RuleChain.outerRule(httpServer)
                .around(folder)
                .around(jwksServer);

        @Override
        public Statement apply(Statement base, Description description) {
            return chain.apply(base, description);
        }
    }

    public static class CognitoJwksRule implements TestRule {
        private final JwksRule jwksRule = testJwksServer();
        public final CognitoHttpJwksServer jwksServer = new CognitoHttpJwksServer(jwksRule.jwksServer);

        @Override
        public Statement apply(Statement base, Description description) {
            return jwksRule.apply(base, description);
        }
    }

    public static CognitoJwksRule testCognitoJwksServer() {
        return new CognitoJwksRule();
    }
}
