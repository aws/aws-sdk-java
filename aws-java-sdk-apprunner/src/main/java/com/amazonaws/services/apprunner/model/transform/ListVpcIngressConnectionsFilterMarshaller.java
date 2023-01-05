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
package com.amazonaws.services.apprunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListVpcIngressConnectionsFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListVpcIngressConnectionsFilterMarshaller {

    private static final MarshallingInfo<String> SERVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceArn").build();
    private static final MarshallingInfo<String> VPCENDPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcEndpointId").build();

    private static final ListVpcIngressConnectionsFilterMarshaller instance = new ListVpcIngressConnectionsFilterMarshaller();

    public static ListVpcIngressConnectionsFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListVpcIngressConnectionsFilter listVpcIngressConnectionsFilter, ProtocolMarshaller protocolMarshaller) {

        if (listVpcIngressConnectionsFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listVpcIngressConnectionsFilter.getServiceArn(), SERVICEARN_BINDING);
            protocolMarshaller.marshall(listVpcIngressConnectionsFilter.getVpcEndpointId(), VPCENDPOINTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
