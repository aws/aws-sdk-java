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
package com.amazonaws.services.kms.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because the Amazon VPC endpoint service configuration does not fulfill the requirements for
 * an external key store proxy. For details, see the exception message and <a
 * href="kms/latest/developerguide/vpc-connectivity.html#xks-vpc-requirements">review the requirements</a> for Amazon
 * VPC endpoint service connectivity for an external key store.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XksProxyVpcEndpointServiceInvalidConfigurationException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new XksProxyVpcEndpointServiceInvalidConfigurationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public XksProxyVpcEndpointServiceInvalidConfigurationException(String message) {
        super(message);
    }

}
