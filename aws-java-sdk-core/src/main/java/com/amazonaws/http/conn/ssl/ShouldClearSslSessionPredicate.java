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

import com.amazonaws.internal.SdkPredicate;
import com.amazonaws.util.JavaVersionParser.JavaVersion;

import javax.net.ssl.SSLException;
import java.util.Arrays;
import java.util.List;

/**
 * Determines whether we should apply the workaround to bug that causes the SSL session cache to be
 * stuck in a bad state for either 24 hours or the next JVM restart. The workaround is to clear out
 * SSL sessions upon receiving an SSL exception. Whether we apply the workaround depends on the type
 * of SSL exception thrown and the JVM version in use.
 * 
 * @see <a href="http://tiny/1jjdylxma/wamazindeJava">http://tiny/1jjdylxma/wamazindeJava</a>
 */
public class ShouldClearSslSessionPredicate extends SdkPredicate<SSLException> {

    /**
     * Fixed per http://bugs.java.com/view_bug.do?bug_id=8075750
     */
    public static final JavaVersion FIXED_JAVA_7 = new JavaVersion(1, 7, 0, 85);

    /**
     * Fixed per http://bugs.java.com/view_bug.do?bug_id=8074944
     */
    public static final JavaVersion FIXED_JAVA_8 = new JavaVersion(1, 8, 0, 60);

    /**
     * Message that may indicate the SSL session cache is in a bad state and needs to be cleared.
     */
    private static List<String> EXCEPTION_MESSAGE_WHITELIST = Arrays.asList("server certificate change is restricted",
            "peer not authenticated");

    private final JavaVersion javaVersion;

    /**
     * @param javaVersion
     *            Current JVM version
     */
    public ShouldClearSslSessionPredicate(JavaVersion javaVersion) {
        this.javaVersion = javaVersion;
    }

    /**
     * @param sslEx
     *            SSLException thrown during connect
     * @return True is the SSL session cache should be cleared, false otherwise.
     */
    @Override
    public boolean test(SSLException sslEx) {
        return isExceptionAffected(sslEx.getMessage()) && isJvmAffected();
    }

    /**
     * @return True if the current JVM version is subject to the bug described above, false
     *         otherwise.
     */
    private boolean isJvmAffected() {
        switch (javaVersion.getKnownVersion()) {
        case JAVA_6:
            // Java 6 was not and will not be patched for this bug
            return true;
        case JAVA_7:
            return javaVersion.compareTo(FIXED_JAVA_7) < 0;
        case JAVA_8:
            return javaVersion.compareTo(FIXED_JAVA_8) < 0;
        case JAVA_9:
            // No Java 9 version is affected
            return false;
        case UNKNOWN:
            // If we can't determine the Java version err on the side of caution and apply the fix
            return true;
        }
        return true;
    }

    /**
     * Restrict the workaround to only certain types of SSLExceptions that indicate the bug may have
     * been encountered.
     * 
     * @param exceptionMessage
     *            Message of the {@link SSLException}
     * @return True if message indicates the bug may have been encountered, false otherwise
     */
    private boolean isExceptionAffected(final String exceptionMessage) {
        if (exceptionMessage != null) {
            for (String affectedMessage : EXCEPTION_MESSAGE_WHITELIST) {
                if (exceptionMessage.contains(affectedMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

}
