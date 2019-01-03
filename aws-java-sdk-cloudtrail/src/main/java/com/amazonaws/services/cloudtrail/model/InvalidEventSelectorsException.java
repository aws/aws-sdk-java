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
 * This exception is thrown when the <code>PutEventSelectors</code> operation is called with a number of event selectors
 * or data resources that is not valid. The combination of event selectors and data resources is not valid. A trail can
 * have up to 5 event selectors. A trail is limited to 250 data resources. These data resources can be distributed
 * across event selectors, but the overall total cannot exceed 250.
 * </p>
 * <p>
 * You can:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Specify a valid number of event selectors (1 to 5) for a trail.
 * </p>
 * </li>
 * <li>
 * <p>
 * Specify a valid number of data resources (1 to 250) for an event selector. The limit of number of resources on an
 * individual event selector is configurable up to 250. However, this upper limit is allowed only if the total number of
 * data resources does not exceed 250 across all event selectors for a trail.
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
