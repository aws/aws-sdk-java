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
package com.amazonaws.services.config.model;

import javax.annotation.Generated;

/**
 * <p>
 * For <code>PutConfigurationAggregator</code> API, you can see this exception for the following reasons:
 * </p>
 * <ul>
 * <li>
 * <p>
 * No permission to call <code>EnableAWSServiceAccess</code> API
 * </p>
 * </li>
 * <li>
 * <p>
 * The configuration aggregator cannot be updated because your AWS Organization management account or the delegated
 * administrator role changed. Delete this aggregator and create a new one with the current AWS Organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * The configuration aggregator is associated with a previous AWS Organization and AWS Config cannot aggregate data with
 * current AWS Organization. Delete this aggregator and create a new one with the current AWS Organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * You are not a registered delegated administrator for AWS Config with permissions to call
 * <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated administrator
 * for AWS Config service principle name before the delegated administrator creates an aggregator.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, AWS Config throws an
 * exception if APIs are called from member accounts. All APIs must be called from organization master account.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationAccessDeniedException extends com.amazonaws.services.config.model.AmazonConfigException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new OrganizationAccessDeniedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OrganizationAccessDeniedException(String message) {
        super(message);
    }

}
