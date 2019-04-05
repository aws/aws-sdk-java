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
package com.amazonaws.auth.profile;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.internal.AwsProfileNameLoader;
import com.amazonaws.auth.profile.internal.Profile;
import com.amazonaws.auth.profile.internal.securitytoken.ProfileCredentialsService;
import com.amazonaws.auth.profile.internal.securitytoken.RoleInfo;
import com.amazonaws.internal.StaticCredentialsProvider;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;

public class ProfileCredentialsProviderTest {

    private static final String DEFAULT_PROFILE_NAME = "default";

    private static File profileLocation = null;

    @BeforeClass
    public static void setUp() {
        profileLocation = ProfileResourceLoader.profilesContainingOtherConfiguration().asFile();
    }

    private ProfileCredentialsProvider newProvider() {
        return new ProfileCredentialsProvider(profileLocation.getAbsolutePath(), null);
    }

    @Test
    public void testDefault() {
        ProfileCredentialsProvider provider = newProvider();

        AWSCredentials credentials = provider.getCredentials();

        // Yep, this is correct - they're backwards in
        // ProfilesContainingOtherConfigurations.tst
        Assert.assertEquals("defaultSecretAccessKey", credentials.getAWSAccessKeyId());

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
            env.put(AwsProfileNameLoader.AWS_PROFILE_ENVIRONMENT_VARIABLE, "test");

            ProfileCredentialsProvider provider = newProvider();

            AWSCredentials credentials = provider.getCredentials();
            Assert.assertEquals("test", credentials.getAWSAccessKeyId());
            Assert.assertEquals("test key", credentials.getAWSSecretKey());

        } finally {
            env.remove(AwsProfileNameLoader.AWS_PROFILE_ENVIRONMENT_VARIABLE);
        }
    }

    @Test
    public void testSystemProperty() {
        try {
            System.setProperty(AwsProfileNameLoader.AWS_PROFILE_SYSTEM_PROPERTY, "test");

            ProfileCredentialsProvider provider = newProvider();

            AWSCredentials credentials = provider.getCredentials();
            Assert.assertEquals("test", credentials.getAWSAccessKeyId());
            Assert.assertEquals("test key", credentials.getAWSSecretKey());

        } finally {
            System.setProperty(AwsProfileNameLoader.AWS_PROFILE_SYSTEM_PROPERTY, "");
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
            env.put(AwsProfileNameLoader.AWS_PROFILE_ENVIRONMENT_VARIABLE, "test");

            System.setProperty(AwsProfileNameLoader.AWS_PROFILE_SYSTEM_PROPERTY, "bogus");

            ProfileCredentialsProvider provider = newProvider();

            AWSCredentials credentials = provider.getCredentials();
            Assert.assertEquals("test", credentials.getAWSAccessKeyId());
            Assert.assertEquals("test key", credentials.getAWSSecretKey());

        } finally {
            System.setProperty(AwsProfileNameLoader.AWS_PROFILE_SYSTEM_PROPERTY, "");

            env.remove(AwsProfileNameLoader.AWS_PROFILE_ENVIRONMENT_VARIABLE);
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
            env.put(AwsProfileNameLoader.AWS_PROFILE_ENVIRONMENT_VARIABLE, "test");

            System.setProperty(AwsProfileNameLoader.AWS_PROFILE_SYSTEM_PROPERTY, "test");

            // If an explicit override is provided, that beats anything else.
            ProfileCredentialsProvider provider = new ProfileCredentialsProvider(
                    profileLocation.getAbsolutePath(), "bogus");

            try {
                provider.getCredentials();
                Assert.fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException expected) {
            }

        } finally {
            System.setProperty(AwsProfileNameLoader.AWS_PROFILE_SYSTEM_PROPERTY, "");

            env.remove(AwsProfileNameLoader.AWS_PROFILE_ENVIRONMENT_VARIABLE);
        }
    }


    @Test
    public void testUpdate() throws Exception {
        ProfilesConfigFile fixture = new ProfilesConfigFile(
                ProfileResourceLoader.basicProfile().asFile());
        File modifiable = File.createTempFile("UpdatableProfile", ".tst");
        ProfilesConfigFileWriter.dumpToFile(modifiable, true, fixture.getAllProfiles().values()
                .toArray(new Profile[1]));

        ProfileCredentialsProvider test = new ProfileCredentialsProvider(modifiable.getPath(),
                                                                         null);
        AWSCredentials orig = test.getCredentials();
        Assert.assertEquals("defaultAccessKey", orig.getAWSAccessKeyId());
        Assert.assertEquals("defaultSecretAccessKey", orig.getAWSSecretKey());
        //Sleep to ensure that the timestamp on the file (when we modify it) is
        //distinguishably later from the original write.
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        Profile newProfile = new Profile(DEFAULT_PROFILE_NAME,
                                         new BasicAWSCredentials("newAccessKey", "newSecretKey"));
        ProfilesConfigFileWriter.modifyOneProfile(modifiable, DEFAULT_PROFILE_NAME, newProfile);
        test.refresh();
        AWSCredentials updated = test.getCredentials();
        Assert.assertEquals("newAccessKey", updated.getAWSAccessKeyId());
        Assert.assertEquals("newSecretKey", updated.getAWSSecretKey());
    }

    @Test
    public void testForcedRefresh() throws Exception {
        ProfilesConfigFile profilesConfigFileBeforeRefresh = new ProfilesConfigFile(
                ProfileResourceLoader.basicProfile().asFile());
        File profilesFile = File.createTempFile("UpdatableProfile", ".tst");
        ProfilesConfigFileWriter.dumpToFile(profilesFile, true,
                                            profilesConfigFileBeforeRefresh.getAllProfiles()
                                                    .values().toArray(new Profile[1]));

        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider(
                profilesFile.getPath(), null);

            /*
             * Sleep for 1 second so that the profiles file last modified time has a chance to update.
             * If this wait is not here, com.amazonaws.auth.profile.ProfilesConfigFile.refresh() profileFile.lastModified() will not be updated, therefore the
             * credentials will not refresh.
             *
             * This is also in testRefresh()
             */
        Thread.sleep(1000);
        ProfilesConfigFile profilesConfigFileAfterRefresh = new ProfilesConfigFile(
                ProfileResourceLoader.basicProfile2().asFile());
        ProfilesConfigFileWriter.dumpToFile(profilesFile, true,
                                            profilesConfigFileAfterRefresh.getAllProfiles().values()
                                                    .toArray(new Profile[1]));

        profileCredentialsProvider.setRefreshForceIntervalNanos(1l);

        AWSCredentials credentialsAfterRefresh = profileCredentialsProvider.getCredentials();

        Assert.assertEquals("credentialsAfterRefresh AWSAccessKeyId", "accessKey2",
                            credentialsAfterRefresh.getAWSAccessKeyId());
        Assert.assertEquals("credentialsAfterRefresh AWSSecretKey", "secretAccessKey2",
                            credentialsAfterRefresh.getAWSSecretKey());
    }

    @Test
    public void testRefresh() throws Exception {
        ProfilesConfigFile profilesConfigFileBeforeRefresh = new ProfilesConfigFile(
                ProfileResourceLoader.basicProfile().asFile());
        File profilesFile = File.createTempFile("UpdatableProfile", ".tst");
        ProfilesConfigFileWriter.dumpToFile(profilesFile, true,
                                            profilesConfigFileBeforeRefresh.getAllProfiles()
                                                    .values().toArray(new Profile[1]));

        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider(
                profilesFile.getPath(), null);

        Thread.sleep(1000); // see testForcedRefresh()
        ProfilesConfigFile profilesConfigFileAfterRefresh = new ProfilesConfigFile(
                ProfileResourceLoader.basicProfile2().asFile());
        ProfilesConfigFileWriter.dumpToFile(profilesFile, true,
                                            profilesConfigFileAfterRefresh.getAllProfiles().values()
                                                    .toArray(new Profile[1]));

        profileCredentialsProvider.setRefreshIntervalNanos(1l);

        AWSCredentials credentialsAfterRefresh = profileCredentialsProvider.getCredentials();

        Assert.assertEquals("credentialsAfterRefresh AWSAccessKeyId", "accessKey2",
                            credentialsAfterRefresh.getAWSAccessKeyId());
        Assert.assertEquals("credentialsAfterRefresh AWSSecretKey", "secretAccessKey2",
                            credentialsAfterRefresh.getAWSSecretKey());
    }

    @Test
    public void testAssumeRole() throws Exception {
        ProfilesConfigFile profilesFile = new ProfilesConfigFile(
                ProfileResourceLoader.profileWithRole().asFile(), new ProfileCredentialsService() {
            @Override
            public AWSCredentialsProvider getAssumeRoleCredentialsProvider(
                    RoleInfo targetRoleInfo) {
                AWSCredentials credentials = targetRoleInfo.getLongLivedCredentialsProvider()
                        .getCredentials();
                Assert.assertEquals("sourceProfile AWSAccessKeyId", "defaultAccessKey",
                                    credentials.getAWSAccessKeyId());
                Assert.assertEquals("sourceProfile AWSSecretKey", "defaultSecretAccessKey",
                                    credentials.getAWSSecretKey());
                Assert.assertEquals("role_arn", "arn:aws:iam::123456789012:role/testRole",
                                    targetRoleInfo.getRoleArn());
                Assert.assertNull("external_id", targetRoleInfo.getExternalId());
                Assert.assertTrue("role_session_name",
                                  targetRoleInfo.getRoleSessionName().startsWith("aws-sdk-java-"));
                return new StaticCredentialsProvider(
                        new BasicAWSCredentials("sessionAccessKey", "sessionSecretKey"));
            }
        });

        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider(
                profilesFile, "test");
        AWSCredentials credentials = profileCredentialsProvider.getCredentials();

        Assert.assertEquals("sessionAccessKey", credentials.getAWSAccessKeyId());
        Assert.assertEquals("sessionSecretKey", credentials.getAWSSecretKey());
    }

    @Test
    public void testAssumeRoleWithNameAndExternalId() throws Exception {
        ProfilesConfigFile profilesFile = new ProfilesConfigFile(
                ProfileResourceLoader.profileWithRole2().asFile(), new ProfileCredentialsService() {
            @Override
            public AWSCredentialsProvider getAssumeRoleCredentialsProvider(
                    RoleInfo targetRoleInfo) {
                AWSCredentials credentials = targetRoleInfo.getLongLivedCredentialsProvider()
                        .getCredentials();
                Assert.assertEquals("sourceProfile AWSAccessKeyId", "defaultAccessKey",
                                    credentials.getAWSAccessKeyId());
                Assert.assertEquals("sourceProfile AWSSecretKey", "defaultSecretAccessKey",
                                    credentials.getAWSSecretKey());
                Assert.assertEquals("role_arn", "arn:aws:iam::123456789012:role/testRole",
                                    targetRoleInfo.getRoleArn());
                Assert.assertEquals("external_id", "testExternalId",
                                    targetRoleInfo.getExternalId());
                Assert.assertEquals("role_session_name", "testSessionName",
                                    targetRoleInfo.getRoleSessionName());
                return new StaticCredentialsProvider(
                        new BasicAWSCredentials("sessionAccessKey", "sessionSecretKey"));
            }
        });

        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider(
                profilesFile, "test");
        AWSCredentials credentials = profileCredentialsProvider.getCredentials();

        Assert.assertEquals("sessionAccessKey", credentials.getAWSAccessKeyId());
        Assert.assertEquals("sessionSecretKey", credentials.getAWSSecretKey());
    }

    @Test
    public void testAssumeRoleWithSourceAfterRole() throws Exception {
        ProfilesConfigFile profilesFile = new ProfilesConfigFile(
                ProfileResourceLoader.profileWithSourceAfterRole().asFile(),
                new ProfileCredentialsService() {
                    @Override
                    public AWSCredentialsProvider getAssumeRoleCredentialsProvider(
                            RoleInfo targetRoleInfo) {
                        AWSCredentials credentials = targetRoleInfo
                                .getLongLivedCredentialsProvider().getCredentials();
                        Assert.assertEquals("sourceProfile AWSAccessKeyId", "defaultAccessKey",
                                            credentials.getAWSAccessKeyId());
                        Assert.assertEquals("sourceProfile AWSSecretKey", "defaultSecretAccessKey",
                                            credentials.getAWSSecretKey());
                        Assert.assertEquals("role_arn", "arn:aws:iam::123456789012:role/testRole",
                                            targetRoleInfo.getRoleArn());
                        Assert.assertNull("external_id", targetRoleInfo.getExternalId());
                        Assert.assertTrue("role_session_name", targetRoleInfo.getRoleSessionName()
                                .startsWith("aws-sdk-java-"));
                        return new StaticCredentialsProvider(
                                new BasicAWSCredentials("sessionAccessKey", "sessionSecretKey"));
                    }
                });

        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider(
                profilesFile, "test");
        AWSCredentials credentials = profileCredentialsProvider.getCredentials();

        Assert.assertEquals("sessionAccessKey", credentials.getAWSAccessKeyId());
        Assert.assertEquals("sessionSecretKey", credentials.getAWSSecretKey());
    }
}
