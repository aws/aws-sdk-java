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
package com.amazonaws.services.kms.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because the associated AWS CloudHSM cluster did not meet the configuration requirements for
 * a custom key store. The cluster must be configured with private subnets in at least two different Availability Zones
 * in the Region. Also, it must contain at least as many HSMs as the operation requires.
 * </p>
 * <p>
 * For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the AWS CloudHSM
 * cluster must have at least two active HSMs, each in a different Availability Zone. For the
 * <a>ConnectCustomKeyStore</a> operation, the AWS CloudHSM must contain at least one active HSM.
 * </p>
 * <p>
 * For information about creating a private subnet for a AWS CloudHSM cluster, see <a
 * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private Subnet</a> in the
 * <i>AWS CloudHSM User Guide</i>. To add HSMs, use the AWS CloudHSM <a
 * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudHsmClusterInvalidConfigurationException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CloudHsmClusterInvalidConfigurationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CloudHsmClusterInvalidConfigurationException(String message) {
        super(message);
    }

}
