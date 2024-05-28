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
package com.amazonaws.services.cloudformation.model;

import javax.annotation.Generated;

/**
 * <p>
 * The limit on resource scans has been exceeded. Reasons include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Exceeded the daily quota for resource scans.
 * </p>
 * </li>
 * <li>
 * <p>
 * A resource scan recently failed. You must wait 10 minutes before starting a new resource scan.
 * </p>
 * </li>
 * <li>
 * <p>
 * The last resource scan failed after exceeding 100,000 resources. When this happens, you must wait 24 hours before
 * starting a new resource scan.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceScanLimitExceededException extends com.amazonaws.services.cloudformation.model.AmazonCloudFormationException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceScanLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceScanLimitExceededException(String message) {
        super(message);
    }

}
