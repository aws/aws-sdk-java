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
 * WAF couldn’t perform the operation because your resource doesn't exist. If you've just created a resource that you're
 * using in this operation, you might just need to wait a few minutes. It can take from a few seconds to a number of
 * minutes for changes to propagate.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFNonexistentItemException extends com.amazonaws.services.wafv2.model.AWSWAFV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFNonexistentItemException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFNonexistentItemException(String message) {
        super(message);
    }

}
