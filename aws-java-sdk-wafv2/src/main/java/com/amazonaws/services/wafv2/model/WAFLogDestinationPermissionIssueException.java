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
 * The operation failed because you don't have the permissions that your logging configuration requires. For
 * information, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging web ACL traffic
 * information</a> in the <i>WAF Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFLogDestinationPermissionIssueException extends com.amazonaws.services.wafv2.model.AWSWAFV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFLogDestinationPermissionIssueException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFLogDestinationPermissionIssueException(String message) {
        super(message);
    }

}
