/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.waf.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed because you tried to add an object to or delete an object from another object that doesn't
 * exist. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that doesn't exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a <code>Rule</code> that
 * doesn't exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
 * <code>ByteMatchSet</code> that doesn't exist.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFNonexistentContainerException extends com.amazonaws.services.waf.model.AWSWAFException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFNonexistentContainerException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFNonexistentContainerException(String message) {
        super(message);
    }

}
