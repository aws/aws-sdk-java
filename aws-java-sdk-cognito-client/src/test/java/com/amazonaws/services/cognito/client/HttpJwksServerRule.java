package com.amazonaws.services.cognito.client;

import org.jose4j.jwk.JsonWebKeySet;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.lang.JoseException;
import org.junit.Before;
import org.junit.rules.ExternalResource;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class HttpJwksServerRule extends ExternalResource {

    private final HttpServerRule httpServer;
    private final TemporaryFolder folder;
    private RsaJsonWebKey rsaJsonWebKey;
    private String jwksUrl;

    public HttpJwksServerRule(HttpServerRule httpServer, TemporaryFolder folder) {
        this.httpServer = httpServer;
        this.folder = folder;
    }

    @Before
    public void before() throws JoseException, IOException {
        rsaJsonWebKey = getRsaJsonWebKey();
        jwksUrl = hostJwks(rsaJsonWebKey);
    }

    public String getJwksUrl() {
        return jwksUrl;
    }

    public String getJwt(JwtClaims claims) throws JoseException {
        return getJwt(claims, rsaJsonWebKey);
    }

    private String hostJwks(RsaJsonWebKey rsaJsonWebKey) throws IOException {
        JsonWebKeySet jsonWebKeySet = new JsonWebKeySet(rsaJsonWebKey);
        File jwksFile = folder.newFile("jwks.json");
        Files.write(jwksFile.toPath(), jsonWebKeySet.toJson().getBytes());
        String uri = "/jwks.json";
        httpServer.registerHandler(uri, new DownloadFileHttpHandler(jwksFile));
        return httpServer.getUriFor(uri);
    }

    public static String getJwt(JwtClaims claims, RsaJsonWebKey rsaJsonWebKey) throws JoseException {
        JsonWebSignature jws = new JsonWebSignature();
        jws.setPayload(claims.toJson());
        jws.setKey(rsaJsonWebKey.getPrivateKey());
        jws.setKeyIdHeaderValue(rsaJsonWebKey.getKeyId());
        jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
        return jws.getCompactSerialization();
    }

    public static RsaJsonWebKey getRsaJsonWebKey() throws JoseException {
        RsaJsonWebKey rsaJsonWebKey = RsaJwkGenerator.generateJwk(2048);
        rsaJsonWebKey.setKeyId("k1");
        return rsaJsonWebKey;
    }
}
