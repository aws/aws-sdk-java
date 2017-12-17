/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.math.pro.ak.util.cognito;

import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;
import com.bugsnag.Bugsnag;
import com.math.pro.ak.util.BugsnagUtil;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for all operations involving secret hash.
 */
public final class CognitoSecretHash {

    private static final String HMAC_SHA_256 = "HmacSHA256";
    private static final Bugsnag bugsnag = BugsnagUtil.getInstance();
    private static final Logger logger = LoggerFactory.getLogger(CognitoSecretHash.class);

    /**
     * Generates secret hash. Uses HMAC SHA256.
     *
     * @param userId REQUIRED: User ID
     * @param clientId REQUIRED: Client ID
     * @param clientSecret REQUIRED: Client secret
     * @return secret hash as a {@code String}, {@code null } if
     * {@code clinetSecret if null}
     */
    public static String getSecretHash(String userId, String clientId, String clientSecret) {
        // Arguments userId and clientId have to be not-null.
        if (userId == null) {
            logger.error("IOException", "user ID cannot be null");
        }

        if (clientId == null) {
            logger.error("IOException", "client ID cannot be null");
        }

        // Return null as secret hash if clientSecret is null.
        if (clientSecret == null) {
            return null;
        }

        final SecretKeySpec signingKey = new SecretKeySpec(clientSecret.getBytes(StringUtils.UTF8),
                HMAC_SHA_256);

        try {
            final Mac mac = Mac.getInstance(HMAC_SHA_256);
            mac.init(signingKey);
            mac.update(userId.getBytes(StringUtils.UTF8));
            final byte[] rawHmac = mac.doFinal(clientId.getBytes(StringUtils.UTF8));
            return new String(Base64.encode(rawHmac));
        } catch (final Exception e) {
            logger.error("IOException", "errors in HMAC calculation");
        }
        return "";
    }
}
