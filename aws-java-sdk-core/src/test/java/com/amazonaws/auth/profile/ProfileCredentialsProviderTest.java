/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.internal.Profile;

public class ProfileCredentialsProviderTest {

    private static final String DEFAULT_PROFILE_NAME = "default";

    private static String PROFILE_FILE =
            "ProfilesContainingOtherConfigurations.tst";

    private static String profileLocation = null;

    @BeforeClass
    public static void setUp() {
        profileLocation = getLocationForTestFile(PROFILE_FILE);
    }

    private static String getLocationForTestFile(String name) {
        URL url = ProfileCredentialsProviderTest.class
                .getResource("/resources/profileconfig/" + name);
        return url.getFile();
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

    @Test
    public void testUpdate() throws Exception {
        ProfilesConfigFile fixture = new ProfilesConfigFile(getLocationForTestFile("BasicProfile.tst"));
        File modifiable = File.createTempFile("UpdatableProfile", ".tst");
        ProfilesConfigFileWriter.dumpToFile(modifiable, true, fixture.getAllProfiles().values().toArray(new Profile[1]));

        ProfileCredentialsProvider test = new ProfileCredentialsProvider(modifiable.getPath(), null);
        AWSCredentials orig = test.getCredentials();
        Assert.assertEquals("defaultAccessKey", orig.getAWSAccessKeyId());
        Assert.assertEquals("defaultSecretAccessKey", orig.getAWSSecretKey());
        //Sleep to ensure that the timestamp on the file (when we modify it) is
        //distinguishably later from the original write.
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}

        ProfilesConfigFileWriter.modifyOneProfile(modifiable, DEFAULT_PROFILE_NAME, new Profile(DEFAULT_PROFILE_NAME, new BasicAWSCredentials("newAccessKey", "newSecretKey")));
        test.refresh();
        AWSCredentials updated = test.getCredentials();
        Assert.assertEquals("newAccessKey", updated.getAWSAccessKeyId());
        Assert.assertEquals("newSecretKey", updated.getAWSSecretKey());
    }

    @Test
    public void testForcedRefresh() throws Exception {
        ProfilesConfigFile profilesConfigFileBeforeRefresh = new ProfilesConfigFile(getLocationForTestFile("BasicProfile.tst"));
        File profilesFile = File.createTempFile("UpdatableProfile", ".tst");
        ProfilesConfigFileWriter.dumpToFile(profilesFile, true, profilesConfigFileBeforeRefresh.getAllProfiles().values().toArray(new Profile[1]));

        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider(profilesFile.getPath(), null);

        /*
         * Sleep for 1 second so that the profiles file last modified time has a chance to update.
         * If this wait is not here, com.amazonaws.auth.profile.ProfilesConfigFile.refresh() profileFile.lastModified() will not be updated, therefore the
         * credentials will not refresh.
         * 
         * This is also in testRefresh()
         */
        Thread.sleep(1000);
        ProfilesConfigFile profilesConfigFileAfterRefresh = new ProfilesConfigFile(getLocationForTestFile("BasicProfile2.tst"));
        ProfilesConfigFileWriter.dumpToFile(profilesFile, true, profilesConfigFileAfterRefresh.getAllProfiles().values().toArray(new Profile[1]));

        profileCredentialsProvider.setRefreshForceIntervalNanos(1l);

        AWSCredentials credentialsAfterRefresh = profileCredentialsProvider.getCredentials();

        Assert.assertEquals("credentialsAfterRefresh AWSAccessKeyId", "accessKey2", credentialsAfterRefresh.getAWSAccessKeyId());
        Assert.assertEquals("credentialsAfterRefresh AWSSecretKey", "secretAccessKey2", credentialsAfterRefresh.getAWSSecretKey());
    }

    @Test
    public void testRefresh() throws Exception {
        ProfilesConfigFile profilesConfigFileBeforeRefresh = new ProfilesConfigFile(getLocationForTestFile("BasicProfile.tst"));
        File profilesFile = File.createTempFile("UpdatableProfile", ".tst");
        ProfilesConfigFileWriter.dumpToFile(profilesFile, true, profilesConfigFileBeforeRefresh.getAllProfiles().values().toArray(new Profile[1]));

        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider(profilesFile.getPath(), null);

        Thread.sleep(1000); // see testForcedRefresh()
        ProfilesConfigFile profilesConfigFileAfterRefresh = new ProfilesConfigFile(getLocationForTestFile("BasicProfile2.tst"));
        ProfilesConfigFileWriter.dumpToFile(profilesFile, true, profilesConfigFileAfterRefresh.getAllProfiles().values().toArray(new Profile[1]));

        profileCredentialsProvider.setRefreshIntervalNanos(1l);

        AWSCredentials credentialsAfterRefresh = profileCredentialsProvider.getCredentials();

        Assert.assertEquals("credentialsAfterRefresh AWSAccessKeyId", "accessKey2", credentialsAfterRefresh.getAWSAccessKeyId());
        Assert.assertEquals("credentialsAfterRefresh AWSSecretKey", "secretAccessKey2", credentialsAfterRefresh.getAWSSecretKey());
    }
}
