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
package com.amazonaws.services.apprunner.model;

import javax.annotation.Generated;

/**
 * <p>
 * App Runner can't create this resource. You've reached your account quota for this resource type.
 * </p>
 * <p>
 * For App Runner per-resource quotas, see <a href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS
 * App Runner endpoints and quotas</a> in the <i>AWS General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.apprunner.model.AWSAppRunnerException {
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
