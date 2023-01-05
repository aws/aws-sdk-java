/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * WAF couldn’t retrieve a resource that you specified for this operation. If you've just created a resource that you're
 * using in this operation, you might just need to wait a few minutes. It can take from a few seconds to a number of
 * minutes for changes to propagate. Verify the resources that you are specifying in your request parameters and then
 * retry the operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFUnavailableEntityException extends com.amazonaws.services.wafv2.model.AWSWAFV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFUnavailableEntityException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFUnavailableEntityException(String message) {
        super(message);
    }

}
