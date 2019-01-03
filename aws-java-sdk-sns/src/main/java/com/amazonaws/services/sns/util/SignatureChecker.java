/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sns.util;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.internal.SdkThreadLocalsRegistry;
import com.amazonaws.services.sns.message.SnsMessageManager;
import com.amazonaws.util.Base64;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Utility for validating signatures on a Simple Notification Service JSON message.
 *
 * @deprecated Use {@link SnsMessageManager} instead for both message unmarshalling and verification.
 */
@Deprecated
@ThreadSafe
public class SignatureChecker {

    private static final ThreadLocal<Signature> SIG_CHECKER = SdkThreadLocalsRegistry.register(new ThreadLocal<Signature>() {
        @Override
        protected Signature initialValue() {
            try {
                return Signature.getInstance("SHA1withRSA");
            } catch (NoSuchAlgorithmException e) {
                throw new SdkClientException("Could not create RSA Signature", e);
            }
        }
    });

    private final String NOTIFICATION_TYPE = "Notification";
    private final String SUBSCRIBE_TYPE = "SubscriptionConfirmation";
    private final String UNSUBSCRIBE_TYPE = "UnsubscribeConfirmation";

    private final String TYPE = "Type";
    private final String SUBSCRIBE_URL = "SubscribeURL";
    private final String MESSAGE = "Message";
    private final String TIMESTAMP = "Timestamp";
    private final String SIGNATURE_VERSION = "SignatureVersion";
    private final String SIGNATURE = "Signature";
    private final String MESSAGE_ID = "MessageId";
    private final String SUBJECT = "Subject";
    private final String TOPIC = "TopicArn";
    private final String TOKEN = "Token";
    private final Set<String> INTERESTING_FIELDS = new HashSet<String>(Arrays.asList(TYPE, SUBSCRIBE_URL, MESSAGE,
            TIMESTAMP, SIGNATURE, SIGNATURE_VERSION, MESSAGE_ID, SUBJECT, TOPIC, TOKEN));

    /**
     * Validates the signature on a Simple Notification Service message. No
     * Amazon-specific dependencies, just plain Java crypto and Jackson for
     * parsing
     *
     * @param message
     *            A JSON-encoded Simple Notification Service message. Note: the
     *            JSON may be only one level deep.
     * @param publicKey
     *            The Simple Notification Service public key, exactly as you'd
     *            see it when retrieved from the cert.
     *
     * @return True if the message was correctly validated, otherwise false.
     */
    public boolean verifyMessageSignature(String message, PublicKey publicKey) {

        // extract the type and signature parameters
        Map<String, String> parsed = parseJSON(message);

        return verifySignature(parsed, publicKey);
    }

    /**
     * Validates the signature on a Simple Notification Service message. No
     * Amazon-specific dependencies, just plain Java crypto
     *
     * @param parsedMessage
     *            A map of Simple Notification Service message.
     * @param publicKey
     *            The Simple Notification Service public key, exactly as you'd
     *            see it when retrieved from the cert.
     *
     * @return True if the message was correctly validated, otherwise false.
     */
    public boolean verifySignature(Map<String, String> parsedMessage, PublicKey publicKey) {
        boolean valid = false;
        String version = parsedMessage.get(SIGNATURE_VERSION);
        if (version.equals("1")) {
            // construct the canonical signed string
            String type = parsedMessage.get(TYPE);
            String signature = parsedMessage.get(SIGNATURE);
            String signed;
            if (type.equals(NOTIFICATION_TYPE)) {
                signed = stringToSign(publishMessageValues(parsedMessage));
            } else if (type.equals(SUBSCRIBE_TYPE)) {
                signed = stringToSign(subscribeMessageValues(parsedMessage));
            } else if (type.equals(UNSUBSCRIBE_TYPE)) {
                signed = stringToSign(subscribeMessageValues(parsedMessage)); // no difference, for now
            } else {
                throw new RuntimeException("Cannot process message of type " + type);
            }
            valid = verifySignature(signed, signature, publicKey);
        }
        return valid;
    }

    /**
     * Does the actual Java cryptographic verification of the signature. This
     * method does no handling of the many rare exceptions it is required to
     * catch.
     *
     * This can also be used to verify the signature from the x-amz-sns-signature http header
     *
     * @param message
     *            Exact string that was signed.  In the case of the x-amz-sns-signature header the
     *            signing string is the entire post body
     * @param signature
     *            Base64-encoded signature of the message
     * @return
     */
    public boolean verifySignature(String message, String signature, PublicKey publicKey){
        boolean result = false;
        try {
            byte[] sigbytes = Base64.decode(signature.getBytes());
            Signature sigChecker = SIG_CHECKER.get();
            sigChecker.initVerify(publicKey);
            sigChecker.update(message.getBytes());
            result = sigChecker.verify(sigbytes);
        } catch (InvalidKeyException e) {
            // Rare exception: The private key was incorrectly formatted
        } catch (SignatureException e) {
            // Rare exception: Catch-all exception for the signature checker
        }
        return result;
    }

    protected String stringToSign(SortedMap<String, String> signables) {
        // each key and value is followed by a newline
        StringBuilder sb = new StringBuilder();
        for(String k: signables.keySet()){
            sb.append(k).append("\n");
            sb.append(signables.get(k)).append("\n");
        }
        String result = sb.toString();
        return result;
    }

    private Map<String, String> parseJSON(String jsonmessage){
        Map<String, String> parsed = new HashMap<String, String>();
        JsonFactory jf = new JsonFactory();
        try {
            JsonParser parser = jf.createParser(jsonmessage);
            parser.nextToken(); //shift past the START_OBJECT that begins the JSON
            while (parser.nextToken() != JsonToken.END_OBJECT) {
                String fieldname = parser.getCurrentName();
                if (!INTERESTING_FIELDS.contains(fieldname)) {
                    parser.skipChildren();
                    continue;
                }
                parser.nextToken(); // move to value, or START_OBJECT/START_ARRAY
                String value;
                if (parser.getCurrentToken() == JsonToken.START_ARRAY)
                {
                    value = "";
                    boolean first = true;
                    while (parser.nextToken() != JsonToken.END_ARRAY)
                    {
                        if (!first) value += ",";
                        first = false;
                        value += parser.getText();
                    }
                }
                else
                {
                    value = parser.getText();
                }
                parsed.put(fieldname, value);
            }
        } catch (JsonParseException e) {
            // JSON could not be parsed
            e.printStackTrace();
        } catch (IOException e) {
            // Rare exception
        }
        return parsed;
    }

    private TreeMap<String, String> publishMessageValues(Map<String, String> parsedMessage){
        TreeMap<String, String> signables = new TreeMap<String, String>();
        String[] keys = { MESSAGE, MESSAGE_ID, SUBJECT, TYPE, TIMESTAMP, TOPIC };
        for(String key: keys){
            if(parsedMessage.containsKey(key)){
                signables.put(key, parsedMessage.get(key));
            }
        }
        return signables;
    }

    private TreeMap<String, String> subscribeMessageValues(Map<String, String> parsedMessage){
        TreeMap<String, String> signables = new TreeMap<String, String>();
        String[] keys = { SUBSCRIBE_URL, MESSAGE, MESSAGE_ID, TYPE, TIMESTAMP, TOKEN, TOPIC };
        for(String key: keys){
            if(parsedMessage.containsKey(key)){
                signables.put(key, parsedMessage.get(key));
            }
        }
        return signables;
    }
}