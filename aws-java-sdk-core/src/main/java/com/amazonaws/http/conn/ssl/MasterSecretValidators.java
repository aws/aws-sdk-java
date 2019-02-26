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
package com.amazonaws.http.conn.ssl;

import java.net.Socket;

import com.amazonaws.http.conn.ssl.privileged.PrivilegedMasterSecretValidator;
import com.amazonaws.util.JavaVersionParser;
import com.amazonaws.util.JavaVersionParser.JavaVersion;

public class MasterSecretValidators {

    // Versions that the SKIP-TLS bug has been fixed in for each affected major version
    private static final JavaVersion FIXED_JAVA_6 = new JavaVersion(1, 6, 0, 91);
    private static final JavaVersion FIXED_JAVA_7 = new JavaVersion(1, 7, 0, 51);
    private static final JavaVersion FIXED_JAVA_8 = new JavaVersion(1, 8, 0, 31);

    /**
     * Interface to validate the master secret of a SSL session
     */
    public interface MasterSecretValidator {
        /**
         * @param socket
         *            SSLSocket containing master secret
         * @return True if master secret is considered valid, false otherwise
         */
        public boolean isMasterSecretValid(final Socket socket);
    }

    /**
     * The implementation of {@link MasterSecretValidator} depends on the JVM version. Certain JVMs
     * are affected by a serious bug that could allow a malicious MITM to negotiate a null master
     * secret. Non-affected JVMs return a dummy implementation that always returns true
     * 
     * @see http://www.oracle.com/technetwork/topics/security/cpujan2015-1972971.html
     * @see https://access.redhat.com/security/cve/CVE-2014-6593
     * @return The correct implementation of {@link MasterSecretValidator}
     */
    public static MasterSecretValidator getMasterSecretValidator() {
        return getMasterSecretValidator(JavaVersionParser.getCurrentJavaVersion());
    }

    /**
     * @param javaVersion
     *            Current Java version
     * @return An appropriate {@link MasterSecretValidator} per the Java version in use
     */
    public static MasterSecretValidator getMasterSecretValidator(JavaVersion javaVersion) {
        switch (javaVersion.getKnownVersion()) {
        case JAVA_6:
            if (javaVersion.compareTo(FIXED_JAVA_6) < 0) {
                return new PrivilegedMasterSecretValidator();
            }
            break;
        case JAVA_7:
            if (javaVersion.compareTo(FIXED_JAVA_7) < 0) {
                return new PrivilegedMasterSecretValidator();
            }
            break;
        case JAVA_8:
            if (javaVersion.compareTo(FIXED_JAVA_8) < 0) {
                return new PrivilegedMasterSecretValidator();
            }
            break;
        default:
            break;

        }
        return new NoOpMasterSecretValidator();

    }

    /**
     * Dummy implementation of {@link MasterSecretValidator} that always returns true. For JVMs that
     * aren't affected by the SKIP-TLS bug
     */
    public static class NoOpMasterSecretValidator implements MasterSecretValidator {

        @Override
        public boolean isMasterSecretValid(Socket socket) {
            return true;
        }

    }

}
