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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when the provided trail name is not valid. Trail names must meet the following requirements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
 * </p>
 * </li>
 * <li>
 * <p>
 * Start with a letter or number, and end with a letter or number
 * </p>
 * </li>
 * <li>
 * <p>
 * Be between 3 and 128 characters
 * </p>
 * </li>
 * <li>
 * <p>
 * Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and <code>my--namespace</code>
 * are invalid.
 * </p>
 * </li>
 * <li>
 * <p>
 * Not be in IP address format (for example, 192.168.5.4)
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidTrailNameException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidTrailNameException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidTrailNameException(String message) {
        super(message);
    }

}
