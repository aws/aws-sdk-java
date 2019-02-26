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

import static org.hamcrest.Matchers.comparesEqualTo;
import static com.amazonaws.util.JavaVersionParser.JAVA_VERSION_PROPERTY;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.amazonaws.util.JavaVersionParser.JavaVersion;
import com.amazonaws.util.JavaVersionParser.KnownJavaVersions;

import nl.jqno.equalsverifier.EqualsVerifier;

public class JavaVersionParserTest {

    @Test
    public void verifyHashCodeAndEquals_JavaVersion() {
        EqualsVerifier.forClass(JavaVersion.class).verify();
    }

    @Test
    public void getCurrentVersion_VersionIsCachedInMemory() {
        System.setProperty(JAVA_VERSION_PROPERTY, "1.6.0_40");
        JavaVersion currentVersion = JavaVersionParser.getCurrentJavaVersion();
        System.setProperty(JAVA_VERSION_PROPERTY, "1.7.1_80");
        JavaVersion versionAfterChangingProperty = JavaVersionParser.getCurrentJavaVersion();
        assertEquals(currentVersion, versionAfterChangingProperty);
    }

    @Test
    public void nullVersion_ReturnsUnknownVersion() {
        JavaVersion version = JavaVersionParser.parseJavaVersion(null);
        assertJavaVersionsEqual(jv(null, null, null, null), version);
        assertEquals(KnownJavaVersions.UNKNOWN, version.getKnownVersion());
    }

    @Test
    public void emptyVersion_ReturnsUnknownVersion() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("");
        assertJavaVersionsEqual(jv(null, null, null, null), version);
        assertEquals(KnownJavaVersions.UNKNOWN, version.getKnownVersion());
    }

    @Test
    public void garbageVersion_ReturnsUnknownVersion() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("invalid-version");
        assertJavaVersionsEqual(jv(null, null, null, null), version);
        assertEquals(KnownJavaVersions.UNKNOWN, version.getKnownVersion());
    }

    @Test
    public void validJava6Version_WithUpdateNumber() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("1.6.0_65");
        assertJavaVersionsEqual(jv(1, 6, 0, 65), version);
        assertEquals(KnownJavaVersions.JAVA_6, version.getKnownVersion());
    }

    @Test
    public void validJava6Version_WithMultiDigitMaintenanceNumber() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("1.6.101_65");
        assertJavaVersionsEqual(jv(1, 6, 101, 65), version);
        assertEquals(KnownJavaVersions.JAVA_6, version.getKnownVersion());
    }

    @Test
    public void validJava6Version_WithoutUpdateNumber_WithIdentifier() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("1.6.3-65");
        assertJavaVersionsEqual(jv(1, 6, 3, null), version);
        assertEquals(KnownJavaVersions.JAVA_6, version.getKnownVersion());
    }

    @Test
    public void validJava7Version_WithUpdateNumber() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("1.7.0_1234");
        assertJavaVersionsEqual(jv(1, 7, 0, 1234), version);
        assertEquals(KnownJavaVersions.JAVA_7, version.getKnownVersion());
    }

    @Test
    public void validJava7Version_WithoutUpdateNumber() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("1.7.0");
        assertJavaVersionsEqual(jv(1, 7, 0, null), version);
        assertEquals(KnownJavaVersions.JAVA_7, version.getKnownVersion());
    }

    @Test
    public void validJava8Version_WithUpdateNumberAndIdentifier() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("1.8.0_12-b24");
        assertJavaVersionsEqual(jv(1, 8, 0, 12), version);
        assertEquals(KnownJavaVersions.JAVA_8, version.getKnownVersion());
    }

    @Test
    public void validJava9Version_NonZeroMaintenanceNumber_WithUpdateNumberAndIdentifier() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("1.9.1_00-someIdentifier");
        assertJavaVersionsEqual(jv(1, 9, 1, 0), version);
        assertEquals(KnownJavaVersions.JAVA_9, version.getKnownVersion());
    }

    @Test
    public void doubleDigitMajorVersion_ParsesMajorVersionCorrectly() {
        JavaVersion version = JavaVersionParser.parseJavaVersion("1.10.1_00");
        assertJavaVersionsEqual(jv(1, 10, 1, 0), version);
        assertEquals(KnownJavaVersions.UNKNOWN, version.getKnownVersion());
    }

    @Test
    public void compare_DifferentMajorVersions() {
        JavaVersion first = jv(1, 7, 0, 0);
        JavaVersion second = jv(1, 6, 0, 0);
        assertThat(first, greaterThan(second));
        assertThat(second, lessThan(first));
    }

    @Test
    public void compare_DifferentMaintenanceVersions() {
        JavaVersion first = jv(1, 7, 5, 0);
        JavaVersion second = jv(1, 7, 1, 0);
        assertThat(first, greaterThan(second));
        assertThat(second, lessThan(first));
    }

    @Test
    public void compare_DifferentUpdateNumbers() {
        JavaVersion first = jv(1, 7, 0, 60);
        JavaVersion second = jv(1, 7, 0, 40);
        assertThat(first, greaterThan(second));
        assertThat(second, lessThan(first));
    }

    @Test
    public void compare_NullUpdateNumbers() {
        JavaVersion first = jv(1, 7, 0, null);
        JavaVersion second = jv(1, 7, 0, null);
        assertThat(first, comparesEqualTo(second));
    }

    @Test
    public void compare_NullMaintenanceNumbers() {
        JavaVersion first = jv(1, 7, null, 0);
        JavaVersion second = jv(1, 7, null, 0);
        assertThat(first, comparesEqualTo(second));
    }

    @Test
    public void compare_NullMajorVersions() {
        JavaVersion first = jv(1, null, 0, 0);
        JavaVersion second = jv(1, null, 0, 0);
        assertThat(first, comparesEqualTo(second));
    }

    @Test
    public void compare_NullMajorVersionFamilies() {
        JavaVersion first = jv(null, 7, 0, 0);
        JavaVersion second = jv(null, 7, 0, 0);
        assertThat(first, comparesEqualTo(second));
    }

    @Test
    public void compare_EqualVersions() {
        JavaVersion first = jv(1, 7, 0, 60);
        JavaVersion second = jv(1, 7, 0, 60);
        assertThat(first, comparesEqualTo(second));
    }

    @Test
    public void compare_FirstVersionUnknown() {
        JavaVersion first = jv(1, 10, 0, 60);
        JavaVersion second = jv(1, 7, 0, 0);
        assertThat(first, greaterThan(second));
        assertThat(second, lessThan(first));
    }

    @Test
    public void compare_SecondVersionUnknown() {
        JavaVersion first = jv(1, 7, 0, 60);
        JavaVersion second = jv(1, 5, 0, 60);
        assertThat(first, greaterThan(second));
        assertThat(second, lessThan(first));
    }

    @Test
    public void compare_BothVersionsUnknown() {
        JavaVersion first = jv(1, 99, 0, 0);
        JavaVersion second = jv(1, 5, 0, 60);
        assertThat(first, greaterThan(second));
        assertThat(second, lessThan(first));
    }

    public static void assertIntEquals(int expected, Integer actual) {
        assertEquals(Integer.valueOf(expected), actual);
    }

    @Test
    public void knownJavaVersions_Java6() {
        assertEquals(KnownJavaVersions.JAVA_6, KnownJavaVersions.fromMajorVersion(1, 6));
    }

    @Test
    public void knownJavaVersions_Java7() {
        assertEquals(KnownJavaVersions.JAVA_7, KnownJavaVersions.fromMajorVersion(1, 7));
    }

    @Test
    public void knownJavaVersions_Java8() {
        assertEquals(KnownJavaVersions.JAVA_8, KnownJavaVersions.fromMajorVersion(1, 8));
    }

    @Test
    public void knownJavaVersions_Java9() {
        assertEquals(KnownJavaVersions.JAVA_9, KnownJavaVersions.fromMajorVersion(1, 9));
    }

    @Test
    public void unknownJavaVersions() {
        assertEquals(KnownJavaVersions.UNKNOWN, KnownJavaVersions.fromMajorVersion(1, 10));
        assertEquals(KnownJavaVersions.UNKNOWN, KnownJavaVersions.fromMajorVersion(-8, 0));
        assertEquals(KnownJavaVersions.UNKNOWN, KnownJavaVersions.fromMajorVersion(1, 91));
        assertEquals(KnownJavaVersions.UNKNOWN, KnownJavaVersions.fromMajorVersion(2, 0));
    }

    private static void assertJavaVersionsEqual(JavaVersion expected, JavaVersion actual) {
        assertEquals(expected.getMajorVersionFamily(), actual.getMajorVersionFamily());
        assertEquals(expected.getMajorVersion(), actual.getMajorVersion());
        assertEquals(expected.getMaintenanceNumber(), actual.getMaintenanceNumber());
        assertEquals(expected.getUpdateNumber(), actual.getUpdateNumber());
        assertEquals(expected.getMajorVersionString(), actual.getMajorVersionString());
        assertEquals(expected, actual);
    }

    /**
     * Convenience factory method for a {@link JavaVersion}
     */
    private static JavaVersion jv(Integer majorVersionFamily,
                                  Integer majorVersion,
                                  Integer maintenanceNumber,
                                  Integer updateNumber) {
        return new JavaVersion(majorVersionFamily, majorVersion, maintenanceNumber, updateNumber);
    }
}
