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
package com.amazonaws.services.wafv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed because the specified policy isn't in the proper format.
 * </p>
 * <p>
 * The policy specifications must conform to the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The policy must be composed using IAM Policy version 2012-10-17 or version 2015-01-01.
 * </p>
 * </li>
 * <li>
 * <p>
 * The policy must include specifications for <code>Effect</code>, <code>Action</code>, and <code>Principal</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Effect</code> must specify <code>Allow</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Action</code> must specify <code>wafv2:CreateWebACL</code>, <code>wafv2:UpdateWebACL</code>, and
 * <code>wafv2:PutFirewallManagerRuleGroups</code>. WAF rejects any extra actions or wildcard actions in the policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * The policy must not include a <code>Resource</code> parameter.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM
 * Policies</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFInvalidPermissionPolicyException extends com.amazonaws.services.wafv2.model.AWSWAFV2Exception {
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
