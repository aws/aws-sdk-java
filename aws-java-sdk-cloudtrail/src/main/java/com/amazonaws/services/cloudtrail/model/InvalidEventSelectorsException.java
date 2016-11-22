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
package com.amazonaws.services.cloudtrail.model;

/**
 * <p>
 * This exception is thrown when the <code>PutEventSelectors</code> operation is called with an invalid number of event
 * selectors, data resources, or an invalid value for a parameter:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Specify a valid number of event selectors (1 to 5) for a trail.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify a valid number of data resources (1 to 50) for an event selector.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify a valid value for a parameter. For example, specifying the <code>ReadWriteType</code> parameter with a value
 * of <code>read-only</code> is invalid.
 * </p>
 * </li>
 * </ul>
 */
public class InvalidEventSelectorsException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidEventSelectorsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidEventSelectorsException(String message) {
        super(message);
    }

}
