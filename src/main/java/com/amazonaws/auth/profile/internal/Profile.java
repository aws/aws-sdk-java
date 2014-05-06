/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.profile.internal;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.http.annotation.Immutable;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;

/**
 * Contains the information stored in an AWS profile, such as AWS security
 * credentials.
 */
@Immutable
public class Profile {

    /** Property name for specifying the Amazon AWS Access Key */
    static final String AWS_ACCESS_KEY_ID = "aws_access_key_id";

    /** Property name for specifying the Amazon AWS Secret Access Key */
    static final String AWS_SECRET_ACCESS_KEY = "aws_secret_access_key";

    /** Property name for specifying the Amazon AWS Session Token */
    static final String AWS_SESSION_TOKEN = "aws_session_token";

    /** The name of this profile */
    private final String profileName;

    /** Holds the AWS Credentials for the profile. */
    private final AWSCredentials awsCredentials;

    public Profile(String profileName, AWSCredentials awsCredentials) {
        this.profileName = profileName;
        this.awsCredentials = awsCredentials;
    }

    public String getProfileName() {
        return profileName;
    }

    public AWSCredentials getCredentials() {
        return awsCredentials;
    }

    /**
     * Returns a map of profile properties included in this Profile instance.
     * The returned properties corresponds to how this profile is described in
     * the credential profiles file, i.e., profiles with basic credentials
     * consist of two properties {"aws_access_key_id", "aws_secret_access_key"}
     * and profiles with session credentials have three properties, with an
     * additional "aws_session_token" property.
     */
    public Map<String, String> getProperties() {
        Map<String, String> properties = new LinkedHashMap<String, String>();
        properties.put(AWS_ACCESS_KEY_ID, awsCredentials.getAWSAccessKeyId());
        properties.put(AWS_SECRET_ACCESS_KEY, awsCredentials.getAWSSecretKey());

        if (awsCredentials instanceof AWSSessionCredentials) {
            AWSSessionCredentials sessionCred = (AWSSessionCredentials)awsCredentials;
            properties.put(AWS_SESSION_TOKEN, sessionCred.getSessionToken());
        }

        return properties;
    }

    /**
     * Returns the value of a specific property that is included in this Profile instance.
     * @see Profile#getProperties()
     */
    public String getPropertyValue(String propertyName) {
        return getProperties().get(propertyName);
    }
}
