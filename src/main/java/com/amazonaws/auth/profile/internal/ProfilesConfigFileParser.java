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
package com.amazonaws.auth.profile.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfilesConfigFile;

public class ProfilesConfigFileParser {

    /** Property name for specifying the Amazon AWS Access Key */
    private static final String AWS_ACCESS_KEY_ID = "aws_access_key_id";

    /** Property name for specifying the Amazon AWS Secret Access Key */
    private static final String AWS_SECRET_ACCESS_KEY = "aws_secret_access_key";

    private static final Log LOG = LogFactory.getLog(ProfilesConfigFileParser.class);


    private static enum ProfileCredentialScannerState {
        READ_CONFIG_NAME, READ_KEY
    };

    public static Map<String, Profile> loadProfiles(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "Unable to load AWS profiles: specified file is null.");
        }

        if (!file.exists() || !file.isFile()) {
            throw new IllegalArgumentException(
                    "AWS profiles config file not found in the given path: "
                            + file.getAbsolutePath());
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            return loadProfiles(fis);
        } catch (IOException ioe) {
            throw new AmazonClientException(
                    "Unable to load AWS profiles config file at: " + file.getAbsolutePath(), ioe);
        } finally {
            if (fis != null) try {fis.close();} catch (IOException ioe) {}
        }
    }


    /**
     * Loads the credentials from the given input stream.
     *
     * @param is input stream from where the profile details are read.
     * @throws IOException
     */
    private static Map<String, Profile> loadProfiles(InputStream is) throws IOException {
        Scanner scanner = new Scanner(is);
        AWSCredentials credentials = null;
        String profileName = null;
        String accessKey = null;
        String secretKey = null;
        String line = null;
        boolean accessKeyRead = false;
        boolean secretKeyRead = false;
        ProfileCredentialScannerState scannerState = ProfileCredentialScannerState.READ_CONFIG_NAME;
        HashMap<String, Profile> profilesByName = new HashMap<String, Profile>();

        try {
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                line = line.trim();

                if (line.isEmpty()) continue;

                if (!line.startsWith("[")
                    && !line.startsWith(AWS_ACCESS_KEY_ID)
                    && !line.startsWith(AWS_SECRET_ACCESS_KEY)) {
                    LOG.info("Unsupported configuration setting: " + line);
                    continue;
                }

                switch (scannerState) {
                case READ_CONFIG_NAME:
                    profileName = parseProfileName(line);
                    scannerState = ProfileCredentialScannerState.READ_KEY;
                    break;
                case READ_KEY:
                    if(line.startsWith(AWS_ACCESS_KEY_ID) && !accessKeyRead){
                        accessKey = parseAccessKey(line);
                        accessKeyRead = true;
                    } else if(!secretKeyRead){
                        secretKey = parseSecretKey(line);
                        secretKeyRead = true;
                    } else {
                        throw new AmazonClientException("Unable to load Amazon AWS Credentials. File not in proper format.");
                    }
                    break;
                }

                if (accessKeyRead && secretKeyRead) {

                    assertParameterNotEmpty(profileName,
                            "Unable to load credentials into profile. ProfileName is empty. "
                                    + line);
                    assertParameterNotEmpty(accessKey,
                            "Unable to load credentials into profile. AWS Access Key ID is empty. "
                                    + line);
                    assertParameterNotEmpty(secretKey,
                            "Unable to load credentials into profile. AWS Secret Access Key is empty. "
                                    + line);

                    credentials = new BasicAWSCredentials(accessKey, secretKey);
                    profilesByName.put(profileName, new Profile(credentials));
                    scannerState = ProfileCredentialScannerState.READ_CONFIG_NAME;
                    accessKeyRead = false;
                    secretKeyRead = false;
                }
            }
            if (scannerState != ProfileCredentialScannerState.READ_CONFIG_NAME
                    || accessKeyRead || secretKeyRead) {
                throw new AmazonClientException(
                        "Unable to load credentials into profile. Profile Name or AWS Access Key ID or AWS Secret Access Key missing for a profile.");
            }

        } finally {
            scanner.close();
        }

        return profilesByName;
    }

    /**
     * Parses and returns the profile name from the given line data.
     */
    private static String parseProfileName(String line) {
        if (line.startsWith("[") && line.endsWith("]")) {
            String profileName = line.substring(1, line.length() - 1);
            if (profileName.trim().equals(ProfilesConfigFile.DEFAULT_PROFILE_NAME))
                return ProfilesConfigFile.DEFAULT_PROFILE_NAME;

            int separatorIndex = profileName.indexOf(" ");
            if (separatorIndex != -1)
                return profileName.substring(separatorIndex).trim();

        }
        throw new AmazonClientException(
                "Unable to load AWS profiles: Profile name not in proper format: " + line);
    }

    /**
     * Parses and returns the AWS Access key from the given line data.
     */
    private static String parseAccessKey(String line) {
        if (line.startsWith(AWS_ACCESS_KEY_ID) && line.indexOf("=") != -1) {
            return line.substring(line.indexOf("=") + 1).trim();
        }
        throw new AmazonClientException(
                "Unable to load AWS profiles: AWS Access Key ID not in proper format: " + line);
    }

    /**
     * Parses and returns the AWS Secret Key from the given line data.
     */
    private static String parseSecretKey(String line) {
        if (line.startsWith(AWS_SECRET_ACCESS_KEY) && line.indexOf("=") != -1) {
            return line.substring(line.indexOf("=") + 1).trim();
        }
        throw new AmazonClientException(
                "Unable to load AWS profiles: AWS Secret Access Key not in proper format: " + line);
    }

    /**
     * <p>
     * Asserts that the specified parameter value is not <code>empty</code> and if it is,
     * throws an <code>AmazonClientException</code> with the specified error message.
     * </p>
     *
     * @param parameterValue
     *            The parameter value being checked.
     * @param errorMessage
     *            The error message to include in the AmazonClientException
     *            if the specified parameter value is empty.
     */
    private static void assertParameterNotEmpty(String parameterValue, String errorMessage) {
        if (parameterValue.isEmpty()) throw new AmazonClientException(errorMessage);
    }



}