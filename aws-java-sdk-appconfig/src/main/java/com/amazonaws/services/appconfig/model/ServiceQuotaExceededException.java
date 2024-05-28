/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import javax.annotation.Generated;

/**
 * <p>
 * The number of one more AppConfig resources exceeds the maximum allowed. Verify that your environment doesn't exceed
 * the following service quotas:
 * </p>
 * <p>
 * Applications: 100 max
 * </p>
 * <p>
 * Deployment strategies: 20 max
 * </p>
 * <p>
 * Configuration profiles: 100 max per application
 * </p>
 * <p>
 * Environments: 20 max per application
 * </p>
 * <p>
 * To resolve this issue, you can delete one or more resources and try again. Or, you can request a quota increase. For
 * more information about quotas and to request an increase, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/appconfig.html#limits_appconfig">Service quotas for AppConfig</a>
 * in the Amazon Web Services General Reference.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.appconfig.model.AmazonAppConfigException {
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
