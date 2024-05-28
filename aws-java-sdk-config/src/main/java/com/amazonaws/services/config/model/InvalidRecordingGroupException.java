/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates one of the following errors:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You have provided a combination of parameter values that is not valid. For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Setting the <code>allSupported</code> field of <a
 * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
 * <code>true</code>, but providing a non-empty list for the <code>resourceTypes</code>field of <a
 * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Setting the <code>allSupported</code> field of <a
 * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingGroup.html">RecordingGroup</a> to
 * <code>true</code>, but also setting the <code>useOnly</code> field of <a
 * href="https://docs.aws.amazon.com/config/latest/APIReference/API_RecordingStrategy.html">RecordingStrategy</a> to
 * <code>EXCLUSION_BY_RESOURCE_TYPES</code>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Every parameter is either null, false, or empty.
 * </p>
 * </li>
 * <li>
 * <p>
 * You have reached the limit of the number of resource types you can provide for the recording group.
 * </p>
 * </li>
 * <li>
 * <p>
 * You have provided resource types or a recording strategy that are not valid.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRecordingGroupException extends com.amazonaws.services.config.model.AmazonConfigException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidRecordingGroupException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRecordingGroupException(String message) {
        super(message);
    }

}
