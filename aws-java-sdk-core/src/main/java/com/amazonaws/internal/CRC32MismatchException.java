/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import java.io.IOException;

/**
 * The exception will be thrown when client side CRC32 checksum does not match the one from server side.
 */
public class CRC32MismatchException extends IOException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new CRC32MismatchException with the specified message, and root
     * cause.
     *
     * @param message
     *            An error message describing why this exception was thrown.
     * @param t
     *            The underlying cause of this exception.
     */
    public CRC32MismatchException(String message, Throwable t) {
        super(message, t);
    }

    /**
     * Creates a new CRC32MismatchException with the specified message.
     *
     * @param message
     *            An error message describing why this exception was thrown.
     */
    public CRC32MismatchException(String message) {
        super(message);
    }

}
