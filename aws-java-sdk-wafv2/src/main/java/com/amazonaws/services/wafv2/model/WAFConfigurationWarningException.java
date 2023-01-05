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
 * The operation failed because you are inspecting the web request body, headers, or cookies without specifying how to
 * handle oversize components. Rules that inspect the body must either provide an <code>OversizeHandling</code>
 * configuration or they must be preceded by a <code>SizeConstraintStatement</code> that blocks the body content from
 * being too large. Rules that inspect the headers or cookies must provide an <code>OversizeHandling</code>
 * configuration.
 * </p>
 * <p>
 * Provide the handling configuration and retry your operation.
 * </p>
 * <p>
 * Alternately, you can suppress this warning by adding the following tag to the resource that you provide to this
 * operation: <code>Tag</code> (key:<code>WAF:OversizeFieldsHandlingConstraintOptOut</code>, value:<code>true</code>).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFConfigurationWarningException extends com.amazonaws.services.wafv2.model.AWSWAFV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFConfigurationWarningException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFConfigurationWarningException(String message) {
        super(message);
    }

}
