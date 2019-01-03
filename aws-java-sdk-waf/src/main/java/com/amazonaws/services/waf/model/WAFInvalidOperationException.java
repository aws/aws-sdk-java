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
 * The operation failed because there was nothing to do. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in the specified
 * <code>WebACL</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
 * <code>IPSet</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
 * <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists in the
 * specified <code>WebACL</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the <code>ByteMatchTuple</code>
 * already exists in the specified <code>WebACL</code>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFInvalidOperationException extends com.amazonaws.services.waf.model.AWSWAFException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFInvalidOperationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFInvalidOperationException(String message) {
        super(message);
    }

}
