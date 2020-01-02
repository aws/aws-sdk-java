/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied because performing this operation violates a constraint.
 * </p>
 * <p>
 * Some of the reasons in the following list might not apply to this specific operation.
 * </p>
 * <ul>
 * <li>
 * <p>
 * You must meet the prerequisites for using tag policies. For information, see <a
 * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies-prereqs.html"
 * >Prerequisites and Permissions for Using Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * You must enable the tag policies service principal (<code>tagpolicies.tag.amazonaws.com</code>) to integrate with AWS
 * Organizations For information, see <a
 * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAWSServiceAccess.html"
 * >EnableAWSServiceAccess</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You must have a tag policy attached to the organization root, an OU, or an account.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConstraintViolationException extends com.amazonaws.services.resourcegroupstaggingapi.model.AWSResourceGroupsTaggingAPIException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConstraintViolationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConstraintViolationException(String message) {
        super(message);
    }

}
