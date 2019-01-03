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
 * AWS WAF is not able to access the service linked role. This can be caused by a previous
 * <code>PutLoggingConfiguration</code> request, which can lock the service linked role for about 20 seconds. Please try
 * your request again. The service linked role can also be locked by a previous <code>DeleteServiceLinkedRole</code>
 * request, which can lock the role for 15 minutes or more. If you recently made a <code>DeleteServiceLinkedRole</code>,
 * wait at least 15 minutes and try the request again. If you receive this same exception again, you will have to wait
 * additional time until the role is unlocked.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFServiceLinkedRoleErrorException extends com.amazonaws.services.waf.model.AWSWAFException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFServiceLinkedRoleErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFServiceLinkedRoleErrorException(String message) {
        super(message);
    }

}
