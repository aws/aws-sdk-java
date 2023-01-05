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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when the Amazon Web Services account making the request to create or update an organization
 * trail or event data store is not the management account for an organization in Organizations. For more information,
 * see <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
 * >Prepare For Creating a Trail For Your Organization</a> or <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an event data
 * store</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotOrganizationMasterAccountException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new NotOrganizationMasterAccountException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NotOrganizationMasterAccountException(String message) {
        super(message);
    }

}
