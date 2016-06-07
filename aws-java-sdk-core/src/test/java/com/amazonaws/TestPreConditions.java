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

package com.amazonaws;

import org.junit.Assume;

import com.amazonaws.util.JavaVersionParser;
import com.amazonaws.util.JavaVersionParser.KnownJavaVersions;

/**
 * Collection of common preconditions that must be met before a test to run. Used to conditionally
 * ignore tests in certain environments.
 */
public class TestPreConditions {

    /**
     * Precondition to assume the running environment is not Java6. Tests are skipped if run with a
     * Java6 JVM. Used to test features that are only compatible with later versions of Java such as
     * the client execution and request timeout features
     */
    public static void assumeNotJava6() {
        Assume.assumeFalse(isJava6());
    }

    /**
     * @return True if the current running JVM is Java6. False otherwise
     */
    private static boolean isJava6() {
        return JavaVersionParser.getCurrentJavaVersion().getKnownVersion() == KnownJavaVersions.JAVA_6;
    }
}
