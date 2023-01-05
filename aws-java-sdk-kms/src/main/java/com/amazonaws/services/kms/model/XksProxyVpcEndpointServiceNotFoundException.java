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
 * The request was rejected because KMS could not find the specified VPC endpoint service. Use
 * <a>DescribeCustomKeyStores</a> to verify the VPC endpoint service name for the external key store. Also, confirm that
 * the <code>Allow principals</code> list for the VPC endpoint service includes the KMS service principal for the
 * Region, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XksProxyVpcEndpointServiceNotFoundException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new XksProxyVpcEndpointServiceNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public XksProxyVpcEndpointServiceNotFoundException(String message) {
        super(message);
    }

}
