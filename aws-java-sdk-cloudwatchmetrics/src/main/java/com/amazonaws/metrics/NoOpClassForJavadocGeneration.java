/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.metrics;

/**
 * A NOOP class that is used only for javadoc generation to succeed.
 */
public class NoOpClassForJavadocGeneration {

    /**
     * A NOOP class that is present only for javadoc generation to succeed. We
     * skip the javadoc generation for internal only classes. That leaves us
     * with only package-info.java file in this package. When javadoc is
     * generated for this package, the javadoc tool fails to generate the
     * package summary and as a result it fails to generate javadoc jar.
     *
     * This causes a problem in our maven push as maven needs a javadoc jar and
     * a sources jar. Adding this class would create the javadoc jar.
     *
     * For more information, see
     * http://stackoverflow.com/questions/1138390/javadoc
     * -for-package-info-java-only
     *
     * and the corresponding JDK bug report is
     * http://bugs.java.com/bugdatabase/view_bug.do?bug_id=4492654
     */
}
