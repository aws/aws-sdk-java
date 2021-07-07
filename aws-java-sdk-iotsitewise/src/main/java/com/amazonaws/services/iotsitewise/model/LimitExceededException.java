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
package com.amazonaws.services.iotsitewise.model;

import javax.annotation.Generated;

/**
 * <p>
 * You've reached the limit for a resource. For example, this can occur if you're trying to associate more than the
 * allowed number of child assets or attempting to create more than the allowed number of properties for an asset model.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a>
 * in the <i>IoT SiteWise User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LimitExceededException extends com.amazonaws.services.iotsitewise.model.AWSIoTSiteWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }

}
