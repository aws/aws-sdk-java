/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import javax.annotation.Generated;

/**
 * <p>
 * An exception indicating there was a conflict during a delete operation. The following delete operations can cause a
 * conflict exception:
 * </p>
 * <ul>
 * <li>
 * <p>
 * DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
 * <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
 * <code>DetectorVersions</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
 * <code>ACTIVE</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
 * <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.frauddetector.model.AmazonFraudDetectorException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

}
