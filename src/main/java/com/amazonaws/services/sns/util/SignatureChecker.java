/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Map;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.apache.commons.codec.binary.Base64;

/**
 * Utility for validating signatures on a Simple Notification Service JSON message.
 */
public class SignatureChecker {

    private Signature sigChecker;

    private final String NOTIFICATION_TYPE = "Notification";
    private final String SUBSCRIBE_TYPE = "SubscriptionConfirmation";
    private final String UNSUBSCRIBE_TYPE = "UnsubscriptionConfirmation";

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
        boolean valid = false;
        // extract the type and signature parameters
        Map<String, String> parsed = parseJSON(message);
        String version = parsed.get(SIGNATURE_VERSION);
        if (version.equals("1")) {
            // construct the canonical signed string
            String type = parsed.get(TYPE);
            String signature = parsed.get(SIGNATURE);
            String signed = "";
            if (type.equals(NOTIFICATION_TYPE)) {
                signed = stringToSign(publishMessageValues(parsed));
            } else if (type.equals(SUBSCRIBE_TYPE)) {
                signed = stringToSign(subscribeMessageValues(parsed));
            } else if (type.equals(UNSUBSCRIBE_TYPE)) {
                signed = stringToSign(subscribeMessageValues(parsed)); // no difference, for now
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
     * @param message
     *            Exact string that was signed
     * @param signature
     *            Base64-encoded signature of the message
     * @return
     */
    public boolean verifySignature(String message, String signature, PublicKey publicKey){
        boolean result = false;
        byte[] sigbytes = null;
        try {
            sigbytes = Base64.decodeBase64(signature.getBytes());
            sigChecker = Signature.getInstance("SHA1withRSA"); //check the signature
            sigChecker.initVerify(publicKey);
            sigChecker.update(message.getBytes());
            result = sigChecker.verify(sigbytes);
        } catch (NoSuchAlgorithmException e) {
            // Rare exception: JVM does not support SHA1 with RSA
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
            JsonParser parser = jf.createJsonParser(jsonmessage);
            parser.nextToken(); //shift past the START_OBJECT that begins the JSON
            while (parser.nextToken() != JsonToken.END_OBJECT) {
                String fieldname = parser.getCurrentName();
                parser.nextToken(); // move to value, or START_OBJECT/START_ARRAY
                String value = parser.getText();
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
