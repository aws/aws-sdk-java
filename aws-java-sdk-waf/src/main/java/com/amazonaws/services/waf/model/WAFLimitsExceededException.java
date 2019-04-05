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
package com.amazonaws.services.waf.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects that you can
 * create for an AWS account. For more information, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF Developer
 * Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFLimitsExceededException extends com.amazonaws.services.waf.model.AWSWAFException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFLimitsExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFLimitsExceededException(String message) {
        super(message);
    }

}
