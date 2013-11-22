/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Utility class for accessing AWS SDK versioning information.
 */
public class VersionInfoUtils {
    
    /** The AWS SDK version info file with SDK versioning info */
    private static final String VERSION_INFO_FILE = "com/amazonaws/sdk/versionInfo.properties";
    
    /** SDK version info */
    private static String version = null;

    /** SDK platform info */
    private static String platform = null;

    /** User Agent info */
    private static String userAgent = null;

    /** Shared logger for any issues while loading version information */
    private static Log log = LogFactory.getLog(VersionInfoUtils.class);

    /**
     * Returns the current version for the AWS SDK in which this class is
     * running. Version information is obtained from from the
     * versionInfo.properties file which the AWS Java SDK build process
     * generates.
     * 
     * @return The current version for the AWS SDK, if known, otherwise
     *         returns a string indicating that the version information is
     *         not available.
     */
    public static String getVersion() {
        if (version == null) {
            initializeVersion();
        }
        
        return version;
    }

    /**
     * Returns the current platform for the AWS SDK in which this class is
     * running. Version information is obtained from from the
     * versionInfo.properties file which the AWS Java SDK build process
     * generates.
     *
     * @return The current platform for the AWS SDK, if known, otherwise
     *         returns a string indicating that the platform information is
     *         not available.
     */
    public static String getPlatform() {
        if (platform == null) {
            initializeVersion();
        }
        
        return platform;
    }

     /**
     * @return Returns the User Agent string to be used when communicating with
	 * the AWS services.  The User Agent encapsulates SDK, Java, OS and
	 * region information.
     */
    public static String getUserAgent() {
        if (userAgent == null) {
            initializeUserAgent();
        }
        
        return userAgent;
    }

   /**
     * Loads the versionInfo.properties file from the AWS Java SDK and
     * stores the information so that the file doesn't have to be read the
     * next time the data is needed.
     */
    private static void initializeVersion() {
        InputStream inputStream = ClassLoaderHelper.getResourceAsStream(
                VERSION_INFO_FILE, true, VersionInfoUtils.class);
        Properties versionInfoProperties = new Properties();
        try {
            if (inputStream == null)
                throw new Exception(VERSION_INFO_FILE + " not found on classpath");
            
            versionInfoProperties.load(inputStream);
            version = versionInfoProperties.getProperty("version");
            platform = versionInfoProperties.getProperty("platform");
        } catch (Exception e) {
            log.info("Unable to load version information for the running SDK: " + e.getMessage());
            version = "unknown-version";
            platform = "java";
        }
    }
			
    /**
     * Loads the versionInfo.properties file from the AWS Java SDK and
     * stores the information so that the file doesn't have to be read the
     * next time the data is needed.
     */
    private static void initializeUserAgent() {
        StringBuilder buffer = new StringBuilder(1024);

        buffer.append("aws-sdk-");
        buffer.append(VersionInfoUtils.getPlatform().toLowerCase());
        buffer.append("/");

        buffer.append(VersionInfoUtils.getVersion());
        buffer.append(" ");
        buffer.append(replaceSpaces(System.getProperty("os.name")));
        buffer.append("/");
        buffer.append(replaceSpaces(System.getProperty("os.version")));

        buffer.append(" ");
        buffer.append(replaceSpaces(System.getProperty("java.vm.name")));
        buffer.append("/");
        buffer.append(replaceSpaces(System.getProperty("java.vm.version")));

        String language = System.getProperty("user.language");
        String region = System.getProperty("user.region");

        if (language != null && region != null) {
            buffer.append(" ");
            buffer.append(replaceSpaces(language));
            buffer.append("_");
            buffer.append(replaceSpaces(region));
        }

        userAgent = buffer.toString();
    }

    /**
     * Replace any spaces in the input with underscores.
     *
     * @param input the input
     * @return the input with spaces replaced by underscores
     */
    private static String replaceSpaces(final String input) {
        return input.replace(' ', '_');
    }
}
