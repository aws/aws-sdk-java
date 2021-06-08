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
package com.amazonaws.services.augmentedairuntime.model;

import javax.annotation.Generated;

/**
 * <p>
 * You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of service
 * resources or operations for your AWS account. For a list of Amazon A2I service quotes, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/a2i.html">Amazon Augmented AI Service Quotes</a>. Delete some
 * resources or request an increase in your service quota. You can request a quota increase using Service Quotas or the
 * AWS Support Center. To request an increase, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Quotas</a> in the <i>AWS
 * General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.augmentedairuntime.model.AmazonAugmentedAIRuntimeException {
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
