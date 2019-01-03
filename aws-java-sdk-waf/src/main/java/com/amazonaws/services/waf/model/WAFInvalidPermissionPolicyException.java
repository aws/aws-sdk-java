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
 * The operation failed because the specified policy is not in the proper format.
 * </p>
 * <p>
 * The policy is subject to the following restrictions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can attach only one policy with each <code>PutPermissionPolicy</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * The policy must include an <code>Effect</code>, <code>Action</code> and <code>Principal</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Effect</code> must specify <code>Allow</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>Action</code> in the policy must be <code>waf:UpdateWebACL</code>, <code>waf-regional:UpdateWebACL</code>,
 * <code>waf:GetRuleGroup</code> and <code>waf-regional:GetRuleGroup</code> . Any extra or wildcard actions in the
 * policy will be rejected.
 * </p>
 * </li>
 * <li>
 * <p>
 * The policy cannot include a <code>Resource</code> parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.
 * </p>
 * </li>
 * <li>
 * <p>
 * The user making the request must be the owner of the RuleGroup.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your policy must be composed using IAM Policy version 2012-10-17.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFInvalidPermissionPolicyException extends com.amazonaws.services.waf.model.AWSWAFException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFInvalidPermissionPolicyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFInvalidPermissionPolicyException(String message) {
        super(message);
    }

}
