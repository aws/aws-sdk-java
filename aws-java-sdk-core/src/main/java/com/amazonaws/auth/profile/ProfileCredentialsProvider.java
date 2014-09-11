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

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

/**
 * Credentials provider based on AWS configuration profiles. This provider vends
 * AWSCredentials from the profile configuration file for the default profile,
 * or for a specific, named profile.
 * <p>
 * AWS credential profiles allow you to share multiple sets of AWS security
 * credentials between different tools like the AWS SDK for Java and the
 * AWS CLI.
 * <p>
 * See
 * http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html
 *
 * @see ProfilesConfigFile
 */
public class ProfileCredentialsProvider implements AWSCredentialsProvider {

    /**
     * The credential profiles file from which this provider loads the security
     * credentials.
     * Lazily loaded by the double-check idiom.
     */
    private volatile ProfilesConfigFile profilesConfigFile;

    /** The name of the credential profile */
    private final String profileName;

    /**
     * Creates a new profile credentials provider that returns the AWS security
     * credentials configured for the default profile.
     * Loading the credential file is deferred until the getCredentials() method
     * is called.
     */
    public ProfileCredentialsProvider() {
        this(ProfilesConfigFile.DEFAULT_PROFILE_NAME);
    }

    /**
     * Creates a new profile credentials provider that returns the AWS security
     * credentials configured for the named profile.
     * Loading the credential file is deferred until the getCredentials() method
     * is called.
     *
     * @param profileName
     *            The name of a local configuration profile.
     */
    public ProfileCredentialsProvider(String profileName) {
        this((ProfilesConfigFile)null, profileName);
    }

    /**
     * Creates a new profile credentials provider that returns the AWS security
     * credentials for the specified profiles configuration file and profile
     * name.
     *
     * @param profilesConfigFilePath
     *            The file path where the profile configuration file is located.
     * @param profileName
     *            The name of a configuration profile in the specified
     *            configuration file.
     */
    public ProfileCredentialsProvider(String profilesConfigFilePath, String profileName) {
        this(new ProfilesConfigFile(profilesConfigFilePath), profileName);
    }

    /**
     * Creates a new profile credentials provider that returns the AWS security
     * credentials for the specified profiles configuration file and profile
     * name.
     *
     * @param profilesConfigFile
     *            The profile configuration file containing the profiles used by
     *            this credentials provider.
     * @param profileName
     *            The name of a configuration profile in the specified
     *            configuration file.
     */
    public ProfileCredentialsProvider(ProfilesConfigFile profilesConfigFile, String profileName) {
        this.profilesConfigFile = profilesConfigFile;
        this.profileName = profileName;
    }

    @Override
    public AWSCredentials getCredentials() {
        if (profilesConfigFile == null) {
            synchronized (this) {
                if (profilesConfigFile == null) {
                    profilesConfigFile = new ProfilesConfigFile();
                }
            }
        }
        return profilesConfigFile.getCredentials(profileName);
    }

    @Override
    public void refresh() {}
}
