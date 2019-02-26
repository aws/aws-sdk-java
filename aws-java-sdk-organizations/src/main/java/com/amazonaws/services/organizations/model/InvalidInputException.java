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
package com.amazonaws.services.organizations.model;

import javax.annotation.Generated;

/**
 * <p>
 * The requested operation failed because you provided invalid values for one or more of the request parameters. This
 * exception includes a reason that contains additional information about the violated limit:
 * </p>
 * <note>
 * <p>
 * Some of the reasons in the following list might not be applicable to this specific API or operation:
 * </p>
 * </note>
 * <ul>
 * <li>
 * <p>
 * IMMUTABLE_POLICY: You specified a policy that is managed by AWS and can't be modified.
 * </p>
 * </li>
 * <li>
 * <p>
 * INPUT_REQUIRED: You must include a value for all required parameters.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_ENUM: You specified a value that isn't valid for that parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_FULL_NAME_TARGET: You specified a full name that contains invalid characters.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_LIST_MEMBER: You provided a list to a parameter that contains at least one invalid value.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_PARTY_TYPE_TARGET: You specified the wrong type of entity (account, organization, or email) as a party.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_PAGINATION_TOKEN: Get the value for the <code>NextToken</code> parameter from the response to a previous call
 * of the operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_PATTERN: You provided a value that doesn't match the required pattern.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_PATTERN_TARGET_ID: You specified a policy target ID that doesn't match the required pattern.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_ROLE_NAME: You provided a role name that isn't valid. A role name can't begin with the reserved prefix
 * <code>AWSServiceRoleFor</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_SYNTAX_ORGANIZATION_ARN: You specified an invalid Amazon Resource Name (ARN) for the organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * INVALID_SYNTAX_POLICY_ID: You specified an invalid policy ID.
 * </p>
 * </li>
 * <li>
 * <p>
 * MAX_FILTER_LIMIT_EXCEEDED: You can specify only one filter parameter for the operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * MAX_LENGTH_EXCEEDED: You provided a string parameter that is longer than allowed.
 * </p>
 * </li>
 * <li>
 * <p>
 * MAX_VALUE_EXCEEDED: You provided a numeric parameter that has a larger value than allowed.
 * </p>
 * </li>
 * <li>
 * <p>
 * MIN_LENGTH_EXCEEDED: You provided a string parameter that is shorter than allowed.
 * </p>
 * </li>
 * <li>
 * <p>
 * MIN_VALUE_EXCEEDED: You provided a numeric parameter that has a smaller value than allowed.
 * </p>
 * </li>
 * <li>
 * <p>
 * MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS: You can move an account only between entities in the same root.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidInputException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new InvalidInputException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidInputException(String message) {
        super(message);
    }

    /**
     * @param reason
     * @see InvalidInputExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see InvalidInputExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvalidInputExceptionReason
     */

    public InvalidInputException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @param reason
     * @see InvalidInputExceptionReason
     */

    public void setReason(InvalidInputExceptionReason reason) {
        withReason(reason);
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvalidInputExceptionReason
     */

    public InvalidInputException withReason(InvalidInputExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
