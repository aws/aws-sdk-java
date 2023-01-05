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
package com.amazonaws.services.auditmanager.model;

import javax.annotation.Generated;

/**
 * <p>
 * You've reached your account quota for this resource type. To perform the requested action, delete some existing
 * resources or <a href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota
 * increase</a> from the Service Quotas console. For a list of Audit Manager service quotas, see <a
 * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and restrictions for
 * Audit Manager</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.auditmanager.model.AWSAuditManagerException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ServiceQuotaExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceQuotaExceededException(String message) {
        super(message);
    }

}
