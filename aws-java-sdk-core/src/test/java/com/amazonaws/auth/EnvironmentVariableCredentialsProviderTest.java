/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.auth;

import static com.amazonaws.SDKGlobalConfiguration.ACCESS_KEY_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.ALTERNATE_ACCESS_KEY_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.ALTERNATE_SECRET_KEY_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_SESSION_TOKEN_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.SECRET_KEY_ENV_VAR;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.SdkClientException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import utils.EnvironmentVariableHelper;

/**
 * Tests for the EnvironmentVariableCredentialsProvider.
 */
public class EnvironmentVariableCredentialsProviderTest {

    private static final EnvironmentVariableHelper helper = new EnvironmentVariableHelper();

    private static final String ACCESS_KEY_ID = "ACCESS_KEY_ID";
    private static final String ALT_ACCESS_KEY_ID = "ALT_ACCESS_KEY_ID";

    private static final String SECRET_ACCESS_KEY = "SECRET_ACCESS_KEY";
    private static final String ALT_SECRET_ACCESS_KEY = "ALT_SECRET_ACCESS_KEY";

    private static final String AWS_SESSION_TOKEN  = "SESSION TOKEN";


    @After
    public void restoreOriginal() {
        helper.reset();
    }

    @Test
    public void envVars_settingStandardParameters_usesStandardValues()  {
        helper.set(ACCESS_KEY_ENV_VAR, ACCESS_KEY_ID);
        helper.set(ALTERNATE_ACCESS_KEY_ENV_VAR, ALT_ACCESS_KEY_ID);
        helper.set(SECRET_KEY_ENV_VAR, SECRET_ACCESS_KEY);
        helper.set(ALTERNATE_SECRET_KEY_ENV_VAR, ALT_SECRET_ACCESS_KEY);

        AWSCredentials credentials = new EnvironmentVariableCredentialsProvider().getCredentials();
        assertFalse(credentials instanceof AWSSessionCredentials);
        Assert.assertEquals(ACCESS_KEY_ID, credentials.getAWSAccessKeyId());
        Assert.assertEquals(SECRET_ACCESS_KEY, credentials.getAWSSecretKey());

    }

    @Test
    public void envVars_settingAlternativeParameters_usesAltValues()  {
        helper.set(ALTERNATE_ACCESS_KEY_ENV_VAR, ALT_ACCESS_KEY_ID);
        helper.set(ALTERNATE_SECRET_KEY_ENV_VAR, ALT_SECRET_ACCESS_KEY);

        AWSCredentials credentials = new EnvironmentVariableCredentialsProvider().getCredentials();

        Assert.assertEquals(ALT_ACCESS_KEY_ID, credentials.getAWSAccessKeyId());
        Assert.assertEquals(ALT_SECRET_ACCESS_KEY, credentials.getAWSSecretKey());

    }

    @Test(expected = SdkClientException.class)
    public void envVars_missingId_throwsError()  {
        helper.set(SECRET_KEY_ENV_VAR, SECRET_ACCESS_KEY);
        helper.set(ALTERNATE_SECRET_KEY_ENV_VAR, ALT_SECRET_ACCESS_KEY);

        new EnvironmentVariableCredentialsProvider().getCredentials();
    }

    @Test(expected = SdkClientException.class)
    public void envVars_missingSecretKey_throwsError()  {
        helper.set(ACCESS_KEY_ENV_VAR, ACCESS_KEY_ID);
        helper.set(ALTERNATE_ACCESS_KEY_ENV_VAR, ALT_ACCESS_KEY_ID);

        new EnvironmentVariableCredentialsProvider().getCredentials();
    }

    @Test(expected = SdkClientException.class)
    public void envVars_blankValues_throwsError()  {
        helper.set(ACCESS_KEY_ENV_VAR, "");
        helper.set(SECRET_KEY_ENV_VAR, "");

        new EnvironmentVariableCredentialsProvider().getCredentials();
    }

    @Test
    public void envVars_settingSessionToken_returnsSessionCredentials()  {
        helper.set(ACCESS_KEY_ENV_VAR, ACCESS_KEY_ID);
        helper.set(SECRET_KEY_ENV_VAR, SECRET_ACCESS_KEY);
        helper.set(AWS_SESSION_TOKEN_ENV_VAR, AWS_SESSION_TOKEN);

        AWSCredentials credentials = new EnvironmentVariableCredentialsProvider().getCredentials();

        assertNotNull(credentials);
        assertTrue(credentials instanceof AWSSessionCredentials);
        AWSSessionCredentials sessionCredentials = (AWSSessionCredentials) credentials;
        Assert.assertEquals(ACCESS_KEY_ID, sessionCredentials.getAWSAccessKeyId());
        Assert.assertEquals(SECRET_ACCESS_KEY, sessionCredentials.getAWSSecretKey());
        Assert.assertEquals(AWS_SESSION_TOKEN, sessionCredentials.getSessionToken());
    }

    @Test
    public void envVars_blankSessionToken_returnsBasicCredentials()  {
        helper.set(ACCESS_KEY_ENV_VAR, ACCESS_KEY_ID);
        helper.set(SECRET_KEY_ENV_VAR, SECRET_ACCESS_KEY);
        helper.set(AWS_SESSION_TOKEN_ENV_VAR, "");

        AWSCredentials credentials = new EnvironmentVariableCredentialsProvider().getCredentials();

        assertNotNull(credentials);
        assertFalse(credentials instanceof AWSSessionCredentials);
    }
}
