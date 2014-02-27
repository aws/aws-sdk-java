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
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.internal.Profile;
import com.amazonaws.auth.profile.internal.ProfilesConfigFileParser;

/**
 * Loads the local AWS configuration profiles from the standard location
 * (~/.aws/config), which can be easily overridden through the
 * <code>AWS_CONFIG_FILE</code> environment variable or by specifying an
 * alternate config file location through this class' constructor.
 * <p>
 * The AWS config file format allows you to specify multiple profiles, each with
 * their own set of AWS security credentials:
 * <pre>
 * [default]
 * aws_access_key_id=testAccessKey
 * aws_secret_access_key=testSecretKey
 *
 * [profile test-user]
 * aws_access_key_id=testAccessKey
 * aws_secret_access_key=testSecretKey
 * </pre>
 *
 * <p>
 * These configuration profiles allow you to share multiple sets of AWS security
 * credentails between different tools such as the AWS SDK for Java and the
 * AWS CLI.
 *
 * <p>
 * For more information on setting up AWS configuration profiles, see:
 * http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html
 *
 * @see ProfileCredentialsProvider
 */
public class ProfilesConfigFile {

    private static final Log LOG = LogFactory.getLog(ProfilesConfigFile.class);

    /** Environment variable specifying an alternate location for the AWS profile config file */
    private static final String CONFIG_FILE_ENVIRONMENT_VARIABLE = "AWS_CONFIG_FILE";

    /** Name of the default profile as specified in the configuration file. */
    public static final String DEFAULT_PROFILE_NAME = "default";

    private Map<String, Profile> profilesByName = new HashMap<String, Profile>();


    /**
     * Loads the AWS profiles config file from the default location
     * (~/.aws/config) or from an alternate location if
     * <code>AWS_CONFIG_FILE</code> is set.
     */
    public ProfilesConfigFile() throws AmazonClientException {
        this(getConfigFile());
    }

    /**
     * Loads the AWS config profiles from the file. The path of the file is
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
     * Loads the AWS profiles from the file. The reference to the
     * file is specified as a parameter to the constructor.
     */
    public ProfilesConfigFile(File file) throws AmazonClientException {
        loadProfiles(file);
    }

    /**
     * Returns the AWS Credentials for the specified profile.
     */
    public AWSCredentials getCredentials(String profile) {
        if (profilesByName.get(profile) == null) {
            throw new IllegalArgumentException(
                    "No AWS profile named '" + profile + "'");
        }
        return profilesByName.get(profile).getCredentials();
    }

    private static File getConfigFile() {
        String configFileOverride = System.getenv(CONFIG_FILE_ENVIRONMENT_VARIABLE);
        if (configFileOverride != null) {
            LOG.debug("Loading AWS profile configuration from overridden file: " + configFileOverride);
            return new File(configFileOverride);
        }

        String userHome = System.getProperty("user.home");
        if (userHome == null) {
            throw new AmazonClientException("Unable to load AWS profiles: "
                    + "'user.home' System property is not set.");
        }

        File awsDirectory = new File(userHome, ".aws");
        return new File(awsDirectory, "config");
    }

    private void loadProfiles(File file) {
        profilesByName.putAll(ProfilesConfigFileParser.loadProfiles(file));
    }
}
