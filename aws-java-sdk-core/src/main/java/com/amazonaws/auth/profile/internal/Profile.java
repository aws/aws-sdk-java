/*
 * Copyright 2014-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.profile.internal.securitytoken.RoleInfo;
import com.amazonaws.internal.StaticCredentialsProvider;

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

    /** Property name for specifying the IAM role to assume */
    static final String ROLE_ARN = "role_arn";

    /** Property name for specifying the IAM role session name */
    static final String ROLE_SESSION_NAME = "role_session_name";

    /** Property name for specifying the IAM role external id */
    static final String EXTERNAL_ID = "external_id";

    /** Property name for specifying the profile credentials to use when assuming a role */
    static final String SOURCE_PROFILE = "source_profile";

    /** The name of this profile */
    private final String profileName;

    /** Profile properties */
    private final Map<String, String> properties;

    /** Holds the AWS Credentials for the profile. */
    private final AWSCredentialsProvider awsCredentials;

    public Profile(String profileName, AWSCredentials awsCredentials) {
        Map<String, String> properties = new LinkedHashMap<String, String>();
        properties.put(AWS_ACCESS_KEY_ID, awsCredentials.getAWSAccessKeyId());
        properties.put(AWS_SECRET_ACCESS_KEY, awsCredentials.getAWSSecretKey());

        if (awsCredentials instanceof AWSSessionCredentials) {
            AWSSessionCredentials sessionCred = (AWSSessionCredentials)awsCredentials;
            properties.put(AWS_SESSION_TOKEN, sessionCred.getSessionToken());
        }

        this.profileName = profileName;
        this.properties = properties;
        this.awsCredentials = new StaticCredentialsProvider(awsCredentials);
    }

    public Profile(String profileName, String sourceProfile, AWSCredentialsProvider awsCredentials, RoleInfo roleInfo) {
        Map<String, String> properties = new LinkedHashMap<String, String>();
        properties.put(SOURCE_PROFILE, sourceProfile);
        properties.put(ROLE_ARN, roleInfo.getRoleArn());

        if (roleInfo.getRoleSessionName() != null) {
            properties.put(ROLE_SESSION_NAME, roleInfo.getRoleSessionName());
        }

        if (roleInfo.getExternalId() != null) {
            properties.put(EXTERNAL_ID, roleInfo.getExternalId());
        }

        this.profileName = profileName;
        this.properties = properties;
        this.awsCredentials = awsCredentials;
    }

    private Profile(String profileName, Map<String, String> properties,
                    AWSCredentialsProvider awsCredentials) {
        this.profileName = profileName;
        this.properties = properties;
        this.awsCredentials = awsCredentials;
    }

    /**
     * Ideally we should throw an exception when parsing the profile but for backwards compatiblity
     * we return a dummy profile that will throw an exception if it is used.
     *
     * @param profileName   Name of profile
     * @param invalidReason Reason why the profile is invalid
     * @return Dummy profile that will throw an exception if used to supply credentials.
     */
    static Profile createInvalidProfile(final String profileName, final String invalidReason) {
        return new Profile(profileName, null, new AWSCredentialsProvider() {
            @Override
            public AWSCredentials getCredentials() {
                throw invalidException();
            }

            @Override
            public void refresh() {
                throw invalidException();
            }

            private AmazonClientException invalidException() {
                return new AmazonClientException(
                        String.format("The profile %s is invalid. Reason: %s", profileName,
                                      invalidReason));
            }
        });
    }

    public String getProfileName() {
        return profileName;
    }

    public AWSCredentials getCredentials() {
        return awsCredentials.getCredentials();
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
        return new LinkedHashMap<String, String>(properties);
    }

    /**
     * Returns the value of a specific property that is included in this Profile instance.
     * @see Profile#getProperties()
     */
    public String getPropertyValue(String propertyName) {
        return getProperties().get(propertyName);
    }
}
