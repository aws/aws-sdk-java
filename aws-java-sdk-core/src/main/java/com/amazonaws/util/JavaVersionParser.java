/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @see http://www.oracle.com/technetwork/java/javase/versioning-naming-139433.html
 */
public class JavaVersionParser {

    public static final String JAVA_VERSION_PROPERTY = "java.version";

    private static String MAJOR_VERSION_FAMILY_PATTERN = "\\d+";
    private static String MAJOR_VERSION_PATTERN = "\\d+";
    private static String MAINTENANCE_NUMBER_PATTERN = "\\d+";
    private static String UPDATE_NUMBER_PATTERN = "\\d+";

    private static Pattern VERSION_REGEX = Pattern.compile(String.format("(%s)\\.(%s)\\.(%s)(?:_(%s))?.*",
            MAJOR_VERSION_FAMILY_PATTERN, MAJOR_VERSION_PATTERN, MAINTENANCE_NUMBER_PATTERN, UPDATE_NUMBER_PATTERN));

    private static final JavaVersion currentJavaVersion = parseJavaVersion(System.getProperty(JAVA_VERSION_PROPERTY));

    private JavaVersionParser() {
    }

    /**
     * @return The {@link JavaVersion} of this JVM.
     */
    public static JavaVersion getCurrentJavaVersion() {
        return currentJavaVersion;
    }

    public static JavaVersion parseJavaVersion(final String fullVersionString) {
        if (!StringUtils.isNullOrEmpty(fullVersionString)) {
            final Matcher matcher = VERSION_REGEX.matcher(fullVersionString);
            if (matcher.matches()) {
                final Integer majorVersionFamily = NumberUtils.tryParseInt(matcher.group(1));
                final Integer majorVersion = NumberUtils.tryParseInt(matcher.group(2));
                final Integer maintenanceNumber = NumberUtils.tryParseInt(matcher.group(3));
                final Integer updateNumber = NumberUtils.tryParseInt(matcher.group(4));
                return new JavaVersion(majorVersionFamily, majorVersion, maintenanceNumber, updateNumber);
            }
        }
        return JavaVersion.UNKNOWN;
    }

    /**
     * Struct like class representing a specific version of Java. Contains the major and minor
     * version identifiers and a descriptive enum identifying which major version this JVM belongs
     * to if we are able to identify it
     */
    public static final class JavaVersion implements Comparable<JavaVersion> {

        public static final JavaVersionParser.JavaVersion UNKNOWN = new JavaVersionParser.JavaVersion(null, null, null,
                null);

        private final Integer[] tokenizedVersion;
        private final Integer majorVersionFamily;
        private final Integer majorVersion;
        private final Integer maintenanceNumber;
        private final Integer updateNumber;
        private final KnownJavaVersions knownVersion;

        public JavaVersion(final Integer majorVersionFamily, final Integer majorVersion,
                final Integer maintenanceNumber, final Integer updateNumber) {
            this.majorVersionFamily = majorVersionFamily;
            this.majorVersion = majorVersion;
            this.maintenanceNumber = maintenanceNumber;
            this.updateNumber = updateNumber;
            this.knownVersion = KnownJavaVersions.fromMajorVersion(majorVersionFamily, majorVersion);
            this.tokenizedVersion = this.getTokenizedVersion();
        }

        private Integer[] getTokenizedVersion() {
            return new Integer[] { this.majorVersionFamily, this.majorVersion, this.maintenanceNumber,
                    this.updateNumber };
        }

        /**
         * @return Major version family if available. I.E. if the major version family string is
         *         '1.7.0_60' then the major version family will be 1
         */
        public Integer getMajorVersionFamily() {
            return this.majorVersionFamily;
        }

        /**
         * @return Major version ordinal if available. Examples include '6', '7', '8'
         */
        public Integer getMajorVersion() {
            return this.majorVersion;
        }

        /**
         * @return Major version string if available. Examples include '1.6', '1.7', '1.8'
         */
        public String getMajorVersionString() {
            return String.format("%d.%d", this.majorVersionFamily, this.majorVersion);
        }

        /**
         * @return Maintenance number of Java version. If the version is '1.6.1_20' then '1' is the
         *         maintenance number
         */
        public Integer getMaintenanceNumber() {
            return this.maintenanceNumber;
        }

        /**
         * @return Update number of Java version. If the version is '1.6.1_20' then '20' is the
         *         update number
         */
        public Integer getUpdateNumber() {
            return this.updateNumber;
        }

        /**
         * @return {@link KnownJavaVersions} representing the major version of the Java version if
         *         it's identifiable
         */
        public KnownJavaVersions getKnownVersion() {
            return this.knownVersion;
        }

        @Override
        public int compareTo(final JavaVersion other) {
            for (int i = 0; i < this.tokenizedVersion.length; i++) {
                final int tokenComparison = ComparableUtils.safeCompare(this.tokenizedVersion[i],
                        other.tokenizedVersion[i]);
                // If one token is larger return the comparison otherwise proceed to next token
                if (tokenComparison != 0) {
                    return tokenComparison;
                }
            }
            return 0;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = (prime * result) + ((this.knownVersion == null) ? 0 : this.knownVersion.hashCode());
            result = (prime * result) + ((this.maintenanceNumber == null) ? 0 : this.maintenanceNumber.hashCode());
            result = (prime * result) + ((this.majorVersion == null) ? 0 : this.majorVersion.hashCode());
            result = (prime * result) + ((this.majorVersionFamily == null) ? 0 : this.majorVersionFamily.hashCode());
            result = (prime * result) + Arrays.hashCode(this.tokenizedVersion);
            result = (prime * result) + ((this.updateNumber == null) ? 0 : this.updateNumber.hashCode());
            return result;
        }

        @Override
        public boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            final JavaVersion other = (JavaVersion) obj;
            if (this.knownVersion != other.knownVersion) {
                return false;
            }
            if (this.maintenanceNumber == null) {
                if (other.maintenanceNumber != null) {
                    return false;
                }
            } else if (!this.maintenanceNumber.equals(other.maintenanceNumber)) {
                return false;
            }
            if (this.majorVersion == null) {
                if (other.majorVersion != null) {
                    return false;
                }
            } else if (!this.majorVersion.equals(other.majorVersion)) {
                return false;
            }
            if (this.majorVersionFamily == null) {
                if (other.majorVersionFamily != null) {
                    return false;
                }
            } else if (!this.majorVersionFamily.equals(other.majorVersionFamily)) {
                return false;
            }
            if (!Arrays.equals(this.tokenizedVersion, other.tokenizedVersion)) {
                return false;
            }
            if (this.updateNumber == null) {
                if (other.updateNumber != null) {
                    return false;
                }
            } else if (!this.updateNumber.equals(other.updateNumber)) {
                return false;
            }
            return true;
        }

    }

    /**
     * Enum representing all the Java versions we know about and a special enum value
     * {@link KnownJavaVersions#UNKNOWN} for ones we don't yet know about
     */
    public enum KnownJavaVersions {
        JAVA_6(1, 6),
        JAVA_7(1, 7),
        JAVA_8(1, 8),
        JAVA_9(1, 9),
        UNKNOWN(0, -1);

        private Integer knownMajorVersionFamily;
        private Integer knownMajorVersion;

        private KnownJavaVersions(final int majorVersionFamily, final int majorVersion) {
            this.knownMajorVersionFamily = majorVersionFamily;
            this.knownMajorVersion = Integer.valueOf(majorVersion);
        }

        /**
         * Tries to determine a known version from the parsed major version components
         *
         * @param majorVersionFamily
         *            Major version family of the JVM. Currently only 1 is known (i.e. '1.7')
         * @param majorVersion
         *            Major version of JVM (6, 7, 8, etc)
         * @return A {@link KnownJavaVersions} or {@link KnownJavaVersions#UNKNOWN} if unable to
         *         determine
         */
        public static KnownJavaVersions fromMajorVersion(final Integer majorVersionFamily, final Integer majorVersion) {
            for (final KnownJavaVersions version : KnownJavaVersions.values()) {
                if (version.isMajorVersion(majorVersionFamily, majorVersion)) {
                    return version;
                }
            }
            return UNKNOWN;
        }

        /**
         * @param majorVersionFamily
         *            Major version family of the JVM. Currently only 1 is known (i.e. '1.7')
         * @param majorVersion
         *            Major version of JVM (6, 7, 8, etc)
         * @return True if the major version is applicable to this Java Version
         */
        private boolean isMajorVersion(final Integer majorVersionFamily, final Integer majorVersion) {
            return this.knownMajorVersionFamily.equals(majorVersionFamily)
                    && this.knownMajorVersion.equals(majorVersion);
        }

    }
}
