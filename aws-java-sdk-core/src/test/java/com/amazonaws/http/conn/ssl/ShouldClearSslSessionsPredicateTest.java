/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.http.conn.ssl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.net.ssl.SSLException;

import org.junit.Test;

import com.amazonaws.util.JavaVersionParser.JavaVersion;

public class ShouldClearSslSessionsPredicateTest {

    private static final JavaVersion AFFECTED_JAVA_8_VERSION = jv(1, 8, 0, 10);
    private static final JavaVersion AFFECTED_JAVA_7_VERSION = jv(1, 7, 0, 10);
    private static final JavaVersion AFFECTED_JAVA_6_VERSION = jv(1, 6, 0, 10);

    private static final JavaVersion AFFECTED_JVM = AFFECTED_JAVA_6_VERSION;
    private static final JavaVersion NON_AFFECTED_JVM = jv(1, 9, 0, 0);

    private static final SSLException NON_AFFECTED_SSL_EXCEPTION = new SSLException(
            "This message should not clear the session cache");
    private static final SSLException AFFECTED_SSL_EXCEPTION = new SSLException(
            "server certificate change is restricted blah");

    @Test
    public void exceptionContainsWhitelistedMessage_JvmIsAffected_ReturnsTrue() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(AFFECTED_JVM);
        assertTrue(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    @Test
    public void exceptionDoesNotContainWhitelistedMessage_JvmIsAffected_ReturnsFalse() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(AFFECTED_JVM);
        assertFalse(predicate.test(NON_AFFECTED_SSL_EXCEPTION));
    }

    @Test
    public void exceptionContainsWhitelistedMessage_JvmIsNotAffected_ReturnsFalse() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(NON_AFFECTED_JVM);
        assertFalse(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    @Test
    public void exceptionDoesNotContainWhitelistedMessage_JvmIsNotAffected_ReturnsFalse() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(NON_AFFECTED_JVM);
        assertFalse(predicate.test(NON_AFFECTED_SSL_EXCEPTION));
    }

    @Test
    public void noExceptionMessage_JvmIsAffected_ReturnsFalse() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(AFFECTED_JVM);
        assertFalse(predicate.test(new SSLException((String) null)));
    }

    @Test
    public void noExceptionMessage_JvmIsNotAffected_ReturnsFalse() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(NON_AFFECTED_JVM);
        assertFalse(predicate.test(new SSLException((String) null)));
    }

    @Test
    public void exceptionContainsWhitelistedMessage_WithJava6AffectedJvm_ReturnsTrue() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(AFFECTED_JAVA_6_VERSION);
        assertTrue(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    @Test
    public void exceptionContainsWhitelistedMessage_WithJava7AffectedJvm_ReturnsTrue() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(AFFECTED_JAVA_7_VERSION);
        assertTrue(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    @Test
    public void exceptionContainsWhitelistedMessage_WithJava8AffectedJvm_ReturnsTrue() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(AFFECTED_JAVA_8_VERSION);
        assertTrue(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    @Test
    public void exceptionContainsWhitelistedMessage_WithFixedJava7AffectedJvm_ReturnsFalse() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(
                ShouldClearSslSessionPredicate.FIXED_JAVA_7);
        assertFalse(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    @Test
    public void exceptionContainsWhitelistedMessage_WithFixedJava8AffectedJvm_ReturnsFalse() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(
                ShouldClearSslSessionPredicate.FIXED_JAVA_8);
        assertFalse(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    /**
     * Java9 is not affected in any version
     */
    @Test
    public void exceptionContainsWhitelistedMessage_WithJava9_ReturnsFalse() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(jv(1, 9, 0, 10));
        assertFalse(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    /**
     * If we can't determine the Java version we err on the side of caution and apply the workaround
     */
    @Test
    public void exceptionContainsWhitelistedMessage_WithUnknownJavaVersion_ReturnsTrue() {
        ShouldClearSslSessionPredicate predicate = new ShouldClearSslSessionPredicate(JavaVersion.UNKNOWN);
        assertTrue(predicate.test(AFFECTED_SSL_EXCEPTION));
    }

    /**
     * Convenience factory method for a {@link JavaVersion}
     */
    private static JavaVersion jv(int majorVersionFamily, int majorVersion, int maintenanceNumber, int updateNumber) {
        return new JavaVersion(majorVersionFamily, majorVersion, maintenanceNumber, updateNumber);
    }
}
