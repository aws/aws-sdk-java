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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.auth.profile.internal.securitytoken.ProfileCredentialsService;
import com.amazonaws.auth.profile.internal.securitytoken.RoleInfo;
import com.amazonaws.util.StringUtils;

public class ProfilesConfigFileLoader {

    private static final Log LOG = LogFactory.getLog(ProfilesConfigFileLoader.class);

    public static Map<String, Profile> loadProfiles(File file, ProfileCredentialsService profileCredentialsService) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "Unable to load AWS profiles: specified file is null.");
        }

        if (!file.exists() || !file.isFile()) {
            throw new IllegalArgumentException(
                    "AWS credential profiles file not found in the given path: "
                    + file.getAbsolutePath());
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            return loadProfiles(fis, profileCredentialsService);
        } catch (IOException ioe) {
            throw new AmazonClientException(
                    "Unable to load AWS credential profiles file at: " + file.getAbsolutePath(), ioe);
        } finally {
            if (fis != null) try {fis.close();} catch (IOException ioe) {}
        }
    }

    /**
     * Loads the credential profiles from the given input stream.
     *
     * @param is input stream from where the profile details are read.
     * @throws IOException
     */
    private static Map<String, Profile> loadProfiles(InputStream is, ProfileCredentialsService profileCredentialsService) throws IOException {
        ProfilesConfigFileLoaderHelper helper = new ProfilesConfigFileLoaderHelper();
        Map<String, Map<String, String>> allProfileProperties = helper.parseProfileProperties(new Scanner(is));

        // Convert the loaded property map to credential objects
        Map<String, Profile> profilesByName = new LinkedHashMap<String, Profile>();

        for (Entry<String, Map<String, String>> entry : allProfileProperties.entrySet()) {
            String profileName = entry.getKey();
            Map<String, String> properties = entry.getValue();

            if (profileName.startsWith("profile ")) {
                LOG.warn("The legacy profile format requires the 'profile ' prefix before the profile name. "
                         + "The latest code does not require such prefix, and will consider it as part of the profile name. "
                         + "Please remove the prefix if you are seeing this warning.");
            }

            assertParameterNotEmpty(profileName,
                                    "Unable to load credentials into profile: ProfileName is empty.");

            if (properties.containsKey(Profile.ROLE_ARN)) {
                profilesByName.put(profileName, fromAssumeRole(profileName, properties, allProfileProperties, profileCredentialsService));
            } else {
                profilesByName.put(profileName, fromStaticCredentials(profileName, properties));
            }
        }

        return profilesByName;
    }

    private static Profile fromStaticCredentials(String profileName, Map<String, String> properties) {
        String accessKey = properties.get(Profile.AWS_ACCESS_KEY_ID);
        String secretKey = properties.get(Profile.AWS_SECRET_ACCESS_KEY);
        String sessionToken = properties.get(Profile.AWS_SESSION_TOKEN);

        if (StringUtils.isNullOrEmpty(accessKey)) {
            throw new AmazonClientException(
                    String.format("Unable to load credentials into profile [%s]: AWS Access Key ID is not specified.",
                                  profileName));
        }
        if (StringUtils.isNullOrEmpty(secretKey)) {
            throw new AmazonClientException(
                    String.format("Unable to load credentials into profile [%s]: AWS Secret Access Key is not specified.",
                                  profileName));
        }

        if (sessionToken == null) {
            return new Profile(profileName,
                               new BasicAWSCredentials(accessKey, secretKey));
        } else {
            if (sessionToken.isEmpty()) {
                throw new AmazonClientException(
                        String.format("Unable to load credentials into profile [%s]: AWS Session Token is empty.",
                                      profileName));
            }

            return new Profile(profileName,
                               new BasicSessionCredentials(accessKey, secretKey, sessionToken));
        }
    }

    private static Profile fromAssumeRole(String profileName, Map<String, String> properties,
                                          Map<String, Map<String, String>> allProfileProperties,
                                          ProfileCredentialsService profileCredentialsService) {
        String roleArn = properties.get(Profile.ROLE_ARN);
        String sourceProfileName = properties.get(Profile.SOURCE_PROFILE);
        String roleSessionName = properties.get(Profile.ROLE_SESSION_NAME);
        String externalId = properties.get(Profile.EXTERNAL_ID);

        if (StringUtils.isNullOrEmpty(sourceProfileName)) {
            return Profile.createInvalidProfile(profileName, String.format(
                    "Unable to load credentials into profile [%s]: Source profile name is not specified",
                    profileName));
        }

        Map<String, String> sourceProfileProperties = allProfileProperties.get(sourceProfileName);

        if (sourceProfileProperties == null) {
            return Profile.createInvalidProfile(profileName, String.format(
                    "Unable to load source profile [%s]: Source profile not found [%s]",
                    profileName, sourceProfileName));
        }

        String sourceAccessKey = sourceProfileProperties.get(Profile.AWS_ACCESS_KEY_ID);
        String sourceSecretKey = sourceProfileProperties.get(Profile.AWS_SECRET_ACCESS_KEY);
        String sourceSessionToken = sourceProfileProperties.get(Profile.AWS_SESSION_TOKEN);
        AWSCredentials sourceCredentials;

        if (StringUtils.isNullOrEmpty(sourceAccessKey)) {
            return Profile.createInvalidProfile(profileName, String.format(
                    "Unable to load credentials into profile [%s]: AWS Access Key ID is not specified in source profile [%s].",
                    profileName, sourceProfileName));
        }

        if (StringUtils.isNullOrEmpty(sourceSecretKey)) {
            return Profile.createInvalidProfile(profileName, String.format(
                    "Unable to load credentials into profile [%s]: AWS Secret Access Key is not specified in source profile [%s].",
                    profileName, sourceProfileName));
        }

        if (StringUtils.isNullOrEmpty(sourceSessionToken)) {
            sourceCredentials = new BasicAWSCredentials(sourceAccessKey, sourceSecretKey);
        } else {
            sourceCredentials = new BasicSessionCredentials(sourceAccessKey, sourceSecretKey,
                                                            sourceSessionToken);
        }

        if (StringUtils.isNullOrEmpty(roleSessionName)) {
            roleSessionName = "aws-sdk-java-" + System.currentTimeMillis();
        }

        RoleInfo roleInfo = new RoleInfo()
                .withRoleArn(roleArn)
                .withRoleSessionName(roleSessionName)
                .withExternalId(externalId)
                .withLongLivedCredentials(sourceCredentials);
        return new Profile(profileName, sourceProfileName, profileCredentialsService.getAssumeRoleCredentialsProvider(roleInfo), roleInfo);
    }

    /**
     * <p>
     * Asserts that the specified parameter value is neither <code>empty</code>
     * nor null, and if it is, throws an <code>AmazonClientException</code> with
     * the specified error message.
     * </p>
     *
     * @param parameterValue
     *            The parameter value being checked.
     * @param errorMessage
     *            The error message to include in the AmazonClientException if
     *            the specified parameter value is empty.
     */
    private static void assertParameterNotEmpty(String parameterValue, String errorMessage) {
        if (StringUtils.isNullOrEmpty(parameterValue)) {
            throw new AmazonClientException(errorMessage);
        }
    }

    /**
     * Implementation of AbstractProfilesConfigFileScanner that groups profile
     * properties into a map while scanning through the credentials profile.
     */
    private static class ProfilesConfigFileLoaderHelper extends AbstractProfilesConfigFileScanner {

        /**
         * Map from the parsed profile name to the map of all the property values
         * included the specific profile
         */
        protected final Map<String, Map<String, String>> allProfileProperties = new LinkedHashMap<String, Map<String, String>>();

        /**
         * Parses the input and returns a map of all the profile properties.
         */
        public Map<String, Map<String, String>> parseProfileProperties(Scanner scanner) {
            allProfileProperties.clear();
            run(scanner);
            return new LinkedHashMap<String, Map<String, String>>(allProfileProperties);
        }

        @Override
        protected void onEmptyOrCommentLine(String profileName, String line) {
            // Ignore empty or comment line
        }

        @Override
        protected void onProfileStartingLine(String newProfileName, String line) {
            // If the same profile name has already been declared, clobber the
            // previous one
            allProfileProperties.put(newProfileName, new HashMap<String, String>());
        }

        @Override
        protected void onProfileEndingLine(String prevProfileName) {
            // No-op
        }

        @Override
        protected void onProfileProperty(String profileName,
                                         String propertyKey, String propertyValue,
                                         boolean isSupportedProperty, String line) {
            if ( !isSupportedProperty ) {
                LOG.info(String.format(
                        "Skip unsupported property name %s in profile [%s].",
                        propertyKey, profileName));
                return;
            }

            // Not strictly necessary, since the abstract super class guarantees
            // onProfileStartingLine is always invoked before this method.
            // Just to be safe...
            if (allProfileProperties.get(profileName) == null) {
                allProfileProperties.put(profileName, new HashMap<String, String>());
            }

            Map<String, String> properties = allProfileProperties.get(profileName);

            if (properties.containsKey(propertyKey)) {
                throw new IllegalArgumentException(
                        "Duplicate property values for ["
                        + propertyKey + "].");
            }

            properties.put(propertyKey, propertyValue);
        }

        @Override
        protected void onEndOfFile() {
            // No-op
        }
    }

}
