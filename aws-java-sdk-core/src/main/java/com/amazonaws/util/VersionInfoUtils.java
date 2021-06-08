/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.jar.JarInputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.internal.config.InternalConfig;

import static com.amazonaws.util.IOUtils.closeQuietly;

/**
 * Utility class for accessing AWS SDK versioning information.
 */
@ThreadSafe
public class VersionInfoUtils {
    /** The AWS SDK version info file with SDK versioning info */
    static final String VERSION_INFO_FILE = "/com/amazonaws/sdk/versionInfo.properties";

    /** SDK version info */
    private static volatile String version;

    /** SDK platform info */
    private static volatile String platform;

    /** User Agent info */
    private static volatile String userAgent;

    /** Shared logger for any issues while loading version information */
    private static final Log log = LogFactory.getLog(VersionInfoUtils.class);

    private static final String UNKNOWN = "unknown";

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
            synchronized(VersionInfoUtils.class) {
                if (version == null)
                    initializeVersion();
            }
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
            synchronized(VersionInfoUtils.class) {
                if (platform == null)
                    initializeVersion();
            }
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
            synchronized(VersionInfoUtils.class) {
                if (userAgent == null)
                    initializeUserAgent();
            }
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
        } finally {
            closeQuietly(inputStream, log);
        }
    }

    /**
     * Initializes the user agent string by loading a template from
     * {@code InternalConfig} and filling in the detected version/platform
     * info.
     */
    private static void initializeUserAgent() {
        userAgent = userAgent();
    }

    static String userAgent() {

        String ua = InternalConfig.Factory.getInternalConfig()
                .getUserAgentTemplate();

        if (ua == null) {
            return "aws-sdk-java";
        }

        ua = ua
            .replace("{platform}",  StringUtils.lowerCase(getPlatform()))
            .replace("{version}", getVersion())
            .replace("{os.name}", replaceSpaces(System.getProperty("os.name")))
            .replace("{os.version}", replaceSpaces(System.getProperty("os.version")))
            .replace("{java.vm.name}", replaceSpaces(System.getProperty("java.vm.name")))
            .replace("{java.vm.version}", replaceSpaces(System.getProperty("java.vm.version")))
            .replace("{java.version}", replaceSpaces(System.getProperty("java.version")))
            .replace("{java.vendor}", replaceSpaces(System.getProperty("java.vendor")))
	    ;

        if (ua.contains("{additional.languages}")) {
            ua = ua.replace("{additional.languages}", getAdditionalJvmLanguages());
        }


        String language = System.getProperty("user.language");
        String region = System.getProperty("user.region");

        String languageAndRegion = "";
        if (language != null && region != null) {
            languageAndRegion =
                    " " + replaceSpaces(language) + "_" + replaceSpaces(region);
        }
        ua = ua.replace("{language.and.region}", languageAndRegion);

        return ua;
    }

    /**
     * Replace any spaces in the input with underscores.
     *
     * @param input the input
     * @return the input with spaces replaced by underscores
     */
    private static String replaceSpaces(final String input) {
        return input == null ? UNKNOWN : input.replace(' ', '_');
    }

    private static String getAdditionalJvmLanguages() {
        StringBuilder versions = new StringBuilder();
        concat(versions, scalaVersion(), " ");
        concat(versions, clojureVersion(), " ");
        concat(versions, groovyVersion(), " ");
        concat(versions, jythonVersion(), " ");
        concat(versions, jrubyVersion(), " ");
        concat(versions, kotlinVersion(), " ");
        return versions.toString();
    }

    private static String scalaVersion() {
        return languageVersion("scala", "scala.util.Properties", "versionNumberString", true);
    }

    private static String clojureVersion() {
        return languageVersion("clojure", "clojure.core$clojure_version", "invokeStatic", true);
    }

    private static String groovyVersion() {
        return languageVersion("groovy", "groovy.lang.GroovySystem", "getVersion", true);
    }

    private static String jythonVersion() {
        return languageVersion("jython", "org.python.Version", "PY_VERSION", false);
    }

    private static String jrubyVersion() {
        return languageVersion("jruby", "org.jruby.runtime.Constants", "VERSION", false);
    }

    /**
     * Attempt to determine if Kotlin is on the classpath and if so what version is in use.
     * Can do this by either using the KotlinVersion class that was introduced in 1.1 or
     * via looking at the JAR's manifest versions for earlier versions.
     *
     * @return Kotlin version if any, else empty string
     */
    private static String kotlinVersion() {
        String version = kotlinVersionByClass();
        return version.equals("") ? kotlinVersionByJar() : version;
    }

    private static String kotlinVersionByClass() {
        StringBuilder kotlinVersion = new StringBuilder("");
        try {
            Class<?> versionClass = Class.forName("kotlin.KotlinVersion");
            kotlinVersion.append("kotlin");
            String version = versionClass.getField("CURRENT").get(null).toString();
            concat(kotlinVersion, version, "/");
        } catch (ClassNotFoundException e) {
            //ignore
        } catch (Exception e) {
            if (log.isTraceEnabled()){
                log.trace("Exception attempting to get Kotlin version.", e);
            }

        }
        return kotlinVersion.toString();
    }

    private static String kotlinVersionByJar() {
        StringBuilder kotlinVersion = new StringBuilder("");
        JarInputStream kotlinJar = null;
        try {
            Class<?> kotlinUnit = Class.forName("kotlin.Unit");
            kotlinVersion.append("kotlin");
            kotlinJar = new JarInputStream(kotlinUnit.getProtectionDomain().getCodeSource().getLocation().openStream());
            String version = kotlinJar.getManifest().getMainAttributes().getValue("Implementation-Version");
            concat(kotlinVersion, version, "/");
        } catch (ClassNotFoundException e) {
            //Ignore
        } catch (Exception e) {
            if (log.isTraceEnabled()) {
                log.trace("Exception attempting to get Kotlin version.", e);
            }
        } finally {
            closeQuietly(kotlinJar, log);
        }
        return kotlinVersion.toString();
    }

    /**
     * Attempt to determine if this language exists on the classpath and what it's version is
     * @param language the name of the language
     * @param className a class of that lanauge that exposes runtime version information
     * @param methodOrFieldName the static field or method name that holds the version number
     * @param isMethod whether the above is a field or method
     * @return the version number or empty string if the language does not exist on the classpath
     */
    private static String languageVersion(String language, String className, String methodOrFieldName, boolean isMethod) {
        StringBuilder sb = new StringBuilder();
        try {
            Class<?> clz = Class.forName(className);
            sb.append(language);
            String version = isMethod ? (String) clz.getMethod(methodOrFieldName).invoke(null) : (String) clz.getField(methodOrFieldName).get(null);
            concat(sb, version, "/");
        } catch (ClassNotFoundException e) {
            //Ignore
        } catch (Exception e) {
            if (log.isTraceEnabled()){
                log.trace("Exception attempting to get " + language + " version.", e);
            }
        }
        return sb.toString();
    }

    private static void concat(StringBuilder prefix, String suffix, String separator) {
        if (suffix != null && !suffix.isEmpty()) {
            prefix.append(separator).append(suffix);
        }
    }
}
