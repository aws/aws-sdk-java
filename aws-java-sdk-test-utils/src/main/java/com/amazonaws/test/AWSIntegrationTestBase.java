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
package com.amazonaws.test;

import java.io.InputStream;

import org.junit.BeforeClass;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.auth.PropertiesFileCredentialsProvider;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.util.IOUtils;

public abstract class AWSIntegrationTestBase {

    /**
     * Shared AWS credentials, loaded from a properties file.
     */
    private static AWSCredentials credentials;

    /** Default Properties Credentials file path */
    private static final String propertiesFilePath = System.getProperty("user.home")
            + "/.aws/awsTestAccount.properties";

    private static final String TEST_CREDENTIALS_PROFILE_NAME = "aws-java-sdk-test";

    private static final AWSCredentialsProviderChain chain = new AWSCredentialsProviderChain(
            new PropertiesFileCredentialsProvider(propertiesFilePath),
            new ProfileCredentialsProvider(TEST_CREDENTIALS_PROFILE_NAME), new EnvironmentVariableCredentialsProvider(),
            new SystemPropertiesCredentialsProvider());

    /**
     * Before of super class is guaranteed to be called before that of a subclass so the following
     * is safe. http://junit-team.github.io/junit/javadoc/latest/org/junit/Before.html
     */
    @BeforeClass
    public static void setUpCredentials() {
        if (credentials == null) {
            try {
                credentials = chain.getCredentials();
            } catch (Exception ignored) {
            }
        }
    }

    /**
     * @return AWSCredentials to use during tests. Setup by base fixture
     */
    protected static AWSCredentials getCredentials() {
        return credentials;
    }

    /**
     * Reads a system resource fully into a String
     * 
     * @param location
     *            Relative or absolute location of system resource.
     * @return String contents of resource file
     * @throws RuntimeException
     *             if any error occurs
     */
    protected String getResourceAsString(String location) {
        try {
            InputStream resourceStream = getClass().getResourceAsStream(location);
            String resourceAsString = IOUtils.toString(resourceStream);
            resourceStream.close();
            return resourceAsString;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
