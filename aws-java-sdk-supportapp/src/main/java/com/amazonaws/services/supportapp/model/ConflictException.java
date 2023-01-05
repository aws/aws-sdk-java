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
package com.amazonaws.services.supportapp.model;

import javax.annotation.Generated;

/**
 * <p>
 * Your request has a conflict. For example, you might receive this error if you try the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Add, update, or delete a Slack channel configuration before you add a Slack workspace to your Amazon Web Services
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Add a Slack channel configuration that already exists in your Amazon Web Services account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Delete a Slack channel configuration for a live chat channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * Delete a Slack workspace from your Amazon Web Services account that has an active live chat channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * Call the <code>RegisterSlackWorkspaceForOrganization</code> API from an Amazon Web Services account that doesn't
 * belong to an organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * Call the <code>RegisterSlackWorkspaceForOrganization</code> API from a member account, but the management account
 * hasn't registered that workspace yet for the organization.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.supportapp.model.AWSSupportAppException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

}
