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
package com.amazonaws.auth.profile;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.internal.Profile;
import com.amazonaws.auth.profile.internal.ProfilesConfigFileLoader;

/**
 * Loads the local AWS credential profiles from the standard location
 * (~/.aws/credentials), which can be easily overridden through the
 * <code>AWS_CREDENTIAL_PROFILES_FILE</code> environment variable or by specifying an
 * alternate credentials file location through this class' constructor.
 * <p>
 * The AWS credentials file format allows you to specify multiple profiles, each with
 * their own set of AWS security credentials:
 * <pre>
 * [default]
 * aws_access_key_id=testAccessKey
 * aws_secret_access_key=testSecretKey
 * aws_session_token=testSessionToken
 *
 * [test-user]
 * aws_access_key_id=testAccessKey
 * aws_secret_access_key=testSecretKey
 * aws_session_token=testSessionToken
 * </pre>
 *
 * <p>
 * These credential profiles allow you to share multiple sets of AWS security
 * credentails between different tools such as the AWS SDK for Java and the
 * AWS CLI.
 *
 * <p>
 * For more information on setting up AWS credential profiles, see:
 * http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html
 *
 * @see ProfileCredentialsProvider
 */
public class ProfilesConfigFile {

    private static final Log LOG = LogFactory.getLog(ProfilesConfigFile.class);

    /** Environment variable specifying an alternate location for the AWS credential profiles file */
    @Deprecated
    private static final String LEGACY_CONFIG_FILE_ENVIRONMENT_VARIABLE = "AWS_CONFIG_FILE";
    private static final String CREDENTIAL_PROFILES_FILE_ENVIRONMENT_VARIABLE = "AWS_CREDENTIAL_PROFILES_FILE";

    /** File name of the default location where the credential profiles are saved */
    @Deprecated
    private static final String LEGACY_CONFIG_PROFILES_FILENAME = "config";
    private static final String DEFAULT_CREDENTIAL_PROFILES_FILENAME = "credentials";

    /** Name of the default profile as specified in the configuration file. */
    public static final String DEFAULT_PROFILE_NAME = "default";

    private Map<String, Profile> profilesByName = new LinkedHashMap<String, Profile>();


    /**
     * Loads the AWS credential profiles file from the default location
     * (~/.aws/credentials) or from an alternate location if
     * <code>AWS_CREDENTIAL_PROFILES_FILE</code> is set.
     */
    public ProfilesConfigFile() throws AmazonClientException {
        this(getCredentialProfilesFile());
    }

    /**
     * Loads the AWS credential profiles from the file. The path of the file is
     * specified as a parameter to the constructor.
     */
    public ProfilesConfigFile(String filePath) {
        if (filePath == null) {
            throw new IllegalArgumentException(
                    "Unable to load AWS profiles: specified file path is null.");
        }
        loadProfiles(new File(filePath));
    }

    /**
     * Loads the AWS credential profiles from the file. The reference to the
     * file is specified as a parameter to the constructor.
     */
    public ProfilesConfigFile(File file) throws AmazonClientException {
        loadProfiles(file);
    }

    /**
     * Returns the AWS credentials for the specified profile.
     */
    public AWSCredentials getCredentials(String profile) {
        if (profilesByName.get(profile) == null) {
            throw new IllegalArgumentException(
                    "No AWS profile named '" + profile + "'");
        }
        return profilesByName.get(profile).getCredentials();
    }

    /**
     * Returns all the profiles declared in this config file.
     */
    public Map<String, Profile> getAllProfiles() {
        return new LinkedHashMap<String, Profile>(profilesByName);
    }

    private static File getCredentialProfilesFile() {
        String credentialProfilesFileOverride = System.getenv(CREDENTIAL_PROFILES_FILE_ENVIRONMENT_VARIABLE);
        if (credentialProfilesFileOverride == null) {
            String legacyConfigFileOverride = System.getenv(LEGACY_CONFIG_FILE_ENVIRONMENT_VARIABLE);
            if (legacyConfigFileOverride != null) {
                LOG.warn(String.format(
                            "Found the legacy environment variable [%s=%s]. " +
                            "Please use the latest environment variable to specify your credentials file override: [%s=%s]",
                            LEGACY_CONFIG_FILE_ENVIRONMENT_VARIABLE,
                            legacyConfigFileOverride,
                            CREDENTIAL_PROFILES_FILE_ENVIRONMENT_VARIABLE,
                            legacyConfigFileOverride));
            }
        }

        if (credentialProfilesFileOverride != null) {
            LOG.debug("Loading AWS credential profiles from overridden file: " + credentialProfilesFileOverride);
            return new File(credentialProfilesFileOverride);
        }

        String userHome = System.getProperty("user.home");
        if (userHome == null) {
            throw new AmazonClientException("Unable to load AWS profiles: "
                    + "'user.home' System property is not set.");
        }

        File awsDirectory = new File(userHome, ".aws");
        File credentialProfiles   = new File(awsDirectory, DEFAULT_CREDENTIAL_PROFILES_FILENAME);
        File legacyConfigProfiles = new File(awsDirectory, LEGACY_CONFIG_PROFILES_FILENAME);
        boolean foundCredentialProfiles   = credentialProfiles.exists()   && credentialProfiles.isFile();
        boolean foundlegacyConfigProfiles = legacyConfigProfiles.exists() && legacyConfigProfiles.isFile();
        if (!foundCredentialProfiles && foundlegacyConfigProfiles) {
            LOG.warn("Found the legacy config profiles file at ["
                    + legacyConfigProfiles.getAbsolutePath()
                    + "]. Please move it to the latest default location ["
                    + credentialProfiles + "].");
            return legacyConfigProfiles;
        }

        return credentialProfiles;
    }

    private void loadProfiles(File file) {
        profilesByName.putAll(ProfilesConfigFileLoader.loadProfiles(file));
    }

}
