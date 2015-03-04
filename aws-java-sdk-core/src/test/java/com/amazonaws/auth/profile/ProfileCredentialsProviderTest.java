/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.profile;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.auth.AWSCredentials;

public class ProfileCredentialsProviderTest {

    private static String PROFILE_FILE =
            "ProfilesContainingOtherConfigurations.tst";

    private static String profileLocation = null;

    @BeforeClass
    public static void setUp() {
        URL url = ProfileCredentialsProviderTest.class
                .getResource("/resources/profileconfig/" + PROFILE_FILE);
        profileLocation = url.getFile();
    }

    @Test
    public void testDefault() {
        ProfileCredentialsProvider provider =
                new ProfileCredentialsProvider(profileLocation, null);

        AWSCredentials credentials = provider.getCredentials();

        // Yep, this is correct - they're backwards in
        // ProfilesContainingOtherConfigurations.tst
        Assert.assertEquals("defaultSecretAccessKey",
                credentials.getAWSAccessKeyId());

        Assert.assertEquals("defaultAccessKey", credentials.getAWSSecretKey());
    }

    @Test
    public void testEnvironmentVariable() throws Exception {
        Map<String, String> immutableEnv = System.getenv();

        Class<?> unMap = Class.forName("java.util.Collections$UnmodifiableMap");
        Field m = unMap.getDeclaredField("m");
        m.setAccessible(true);

        @SuppressWarnings("unchecked")
        Map<String, String> env = (Map<String, String>) m.get(immutableEnv);

        try {
            env.put(ProfilesConfigFile.AWS_PROFILE_ENVIRONMENT_VARIABLE,
                    "test");

            ProfileCredentialsProvider provider =
                    new ProfileCredentialsProvider(profileLocation, null);

            AWSCredentials credentials = provider.getCredentials();
            Assert.assertEquals("test", credentials.getAWSAccessKeyId());
            Assert.assertEquals("test key", credentials.getAWSSecretKey());

        } finally {
            env.remove(ProfilesConfigFile.AWS_PROFILE_ENVIRONMENT_VARIABLE);
        }
    }

    @Test
    public void testSystemProperty() {
        try {
            System.setProperty(
                    ProfilesConfigFile.AWS_PROFILE_SYSTEM_PROPERTY,
                    "test");

            ProfileCredentialsProvider provider =
                    new ProfileCredentialsProvider(profileLocation, null);

            AWSCredentials credentials = provider.getCredentials();
            Assert.assertEquals("test", credentials.getAWSAccessKeyId());
            Assert.assertEquals("test key", credentials.getAWSSecretKey());

        } finally {
            System.setProperty(
                    ProfilesConfigFile.AWS_PROFILE_SYSTEM_PROPERTY,
                    "");
        }
    }

    @Test
    public void testBoth() throws Exception {
        Map<String, String> immutableEnv = System.getenv();

        Class<?> unMap = Class.forName("java.util.Collections$UnmodifiableMap");
        Field m = unMap.getDeclaredField("m");
        m.setAccessible(true);

        @SuppressWarnings("unchecked")
        Map<String, String> env = (Map<String, String>) m.get(immutableEnv);

        try {
            // If both are set, env var should take precedence.
            env.put(ProfilesConfigFile.AWS_PROFILE_ENVIRONMENT_VARIABLE,
                    "test");

            System.setProperty(
                    ProfilesConfigFile.AWS_PROFILE_SYSTEM_PROPERTY,
                    "bogus");

            ProfileCredentialsProvider provider =
                    new ProfileCredentialsProvider(profileLocation, null);

            AWSCredentials credentials = provider.getCredentials();
            Assert.assertEquals("test", credentials.getAWSAccessKeyId());
            Assert.assertEquals("test key", credentials.getAWSSecretKey());

        } finally {
            System.setProperty(
                    ProfilesConfigFile.AWS_PROFILE_SYSTEM_PROPERTY,
                    "");

            env.remove(ProfilesConfigFile.AWS_PROFILE_ENVIRONMENT_VARIABLE);
        }
    }

    @Test
    public void testExplicit() throws Exception {

        Map<String, String> immutableEnv = System.getenv();

        Class<?> unMap = Class.forName("java.util.Collections$UnmodifiableMap");
        Field m = unMap.getDeclaredField("m");
        m.setAccessible(true);

        @SuppressWarnings("unchecked")
        Map<String, String> env = (Map<String, String>) m.get(immutableEnv);

        try {
            env.put(ProfilesConfigFile.AWS_PROFILE_ENVIRONMENT_VARIABLE,
                    "test");

            System.setProperty(
                    ProfilesConfigFile.AWS_PROFILE_SYSTEM_PROPERTY,
                    "test");

            // If an explicit override is provided, that beats anything else.
            ProfileCredentialsProvider provider =
                    new ProfileCredentialsProvider(profileLocation, "bogus");

            try {
                provider.getCredentials();
                Assert.fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }

        } finally {
            System.setProperty(
                    ProfilesConfigFile.AWS_PROFILE_SYSTEM_PROPERTY,
                    "");

            env.remove(ProfilesConfigFile.AWS_PROFILE_ENVIRONMENT_VARIABLE);
        }
    }
}
