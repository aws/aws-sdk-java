/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

/**
 * <p>
 * The resource you are trying to access is unsupported on this Amazon Route 53 endpoint. Please consider using a newer
 * endpoint or a tool that does so.
 * </p>
 */
public class IncompatibleVersionException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new IncompatibleVersionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public IncompatibleVersionException(String message) {
        super(message);
    }

}
