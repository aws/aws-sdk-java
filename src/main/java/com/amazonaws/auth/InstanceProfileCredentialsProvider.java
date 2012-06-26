/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.EC2MetadataClient;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;

/**
 * Credentials provider implementation that loads credentials from the Amazon
 * EC2 Instance Metadata Service.
 */
public class InstanceProfileCredentialsProvider implements AWSCredentialsProvider {

    protected AWSCredentials credentials;
    protected Date credentialsExpiration;

    public AWSCredentials getCredentials() {
        if (needsToLoadCredentials()) loadCredentials();

        return credentials;
    }

    public void refresh() {
        loadCredentials();
    }

    protected boolean needsToLoadCredentials() {
        if (credentials == null) return true;

        if (credentialsExpiration != null) {
            int thresholdInMilliseconds = 1000 * 60 * 5;
            boolean withinExpirationThreshold = credentialsExpiration.getTime() - System.currentTimeMillis() < thresholdInMilliseconds;
            if (withinExpirationThreshold) return true;
        }

        return false;
    }

    private synchronized void loadCredentials() {
        try {
            String credentialsResponse = new EC2MetadataClient().getDefaultCredentials();
            JSONObject jsonObject = new JSONObject(credentialsResponse);

            if (jsonObject.has("Token")) {
                credentials = new BasicSessionCredentials(
                        jsonObject.getString("AccessKeyId"),
                        jsonObject.getString("SecretAccessKey"),
                        jsonObject.getString("Token"));
            } else {
                credentials = new BasicAWSCredentials(
                        jsonObject.getString("AccessKeyId"),
                        jsonObject.getString("SecretAccessKey"));
            }

            if (jsonObject.has("Expiration")) {
                /*
                 * TODO: The expiration string comes in a different format than
                 *       what we deal with in other parts of the SDK, so we have
                 *       to convert it to the ISO8601 syntax we expect.
                 */
                String expiration = jsonObject.getString("Expiration");
                expiration = expiration.replaceAll("\\+0000$", "Z");

                credentialsExpiration = new DateUtils().parseIso8601Date(expiration);
            }
        } catch (IOException e) {
            throw new AmazonClientException("Unable to load credentials from Amazon EC2 metadata service", e);
        } catch (JSONException e) {
            throw new AmazonClientException("Unable to parse credentials from Amazon EC2 metadata service", e);
        } catch (ParseException e) {
            throw new AmazonClientException("Unable to parse credentials expiration date from Amazon EC2 metadata service", e);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}