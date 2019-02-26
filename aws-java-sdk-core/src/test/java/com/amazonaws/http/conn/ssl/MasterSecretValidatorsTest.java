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

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.amazonaws.http.conn.ssl.MasterSecretValidators.MasterSecretValidator;
import com.amazonaws.http.conn.ssl.MasterSecretValidators.NoOpMasterSecretValidator;
import com.amazonaws.http.conn.ssl.privileged.PrivilegedMasterSecretValidator;
import com.amazonaws.util.JavaVersionParser.JavaVersion;

public class MasterSecretValidatorsTest {

    @Test
    public void java6() {
        assertMasterSecretValidatorImplForJavaVersion(PrivilegedMasterSecretValidator.class, jv(1, 6, 0, 90));
        assertMasterSecretValidatorImplForJavaVersion(NoOpMasterSecretValidator.class, jv(1, 6, 0, 91));
        assertMasterSecretValidatorImplForJavaVersion(NoOpMasterSecretValidator.class, jv(1, 6, 0, 92));
    }

    @Test
    public void java7() {
        assertMasterSecretValidatorImplForJavaVersion(PrivilegedMasterSecretValidator.class, jv(1, 7, 0, 50));
        assertMasterSecretValidatorImplForJavaVersion(NoOpMasterSecretValidator.class, jv(1, 7, 0, 51));
        assertMasterSecretValidatorImplForJavaVersion(NoOpMasterSecretValidator.class, jv(1, 7, 0, 52));
    }

    @Test
    public void java8() {
        assertMasterSecretValidatorImplForJavaVersion(PrivilegedMasterSecretValidator.class, jv(1, 8, 0, 30));
        assertMasterSecretValidatorImplForJavaVersion(NoOpMasterSecretValidator.class, jv(1, 8, 0, 31));
        assertMasterSecretValidatorImplForJavaVersion(NoOpMasterSecretValidator.class, jv(1, 8, 0, 32));
    }

    @Test
    public void java9() {
        assertMasterSecretValidatorImplForJavaVersion(NoOpMasterSecretValidator.class, jv(1, 9, 0, 0));
    }

    @Test
    public void unknownJavaVersion() {
        assertMasterSecretValidatorImplForJavaVersion(NoOpMasterSecretValidator.class, jv(1, 5, 0, 0));
    }

    /**
     * Asserts that the correct implementation of {@link MasterSecretValidator} is returned per the
     * JavaVersion
     * 
     * @param masterSecretValidatorImpl
     *            Expected implementation of {@link MasterSecretValidator}
     * @param javaVersion
     *            Java version used
     */
    private static void assertMasterSecretValidatorImplForJavaVersion(Class<? extends MasterSecretValidator> masterSecretValidatorImpl,
                                                                      JavaVersion javaVersion) {

        assertThat(MasterSecretValidators.getMasterSecretValidator(javaVersion), instanceOf(masterSecretValidatorImpl));
    }

    /**
     * Convenience factory method for a {@link JavaVersion}
     */
    private static JavaVersion jv(int majorVersionFamily, int majorVersion, int maintenanceNumber, int updateNumber) {
        return new JavaVersion(majorVersionFamily, majorVersion, maintenanceNumber, updateNumber);
    }
}
