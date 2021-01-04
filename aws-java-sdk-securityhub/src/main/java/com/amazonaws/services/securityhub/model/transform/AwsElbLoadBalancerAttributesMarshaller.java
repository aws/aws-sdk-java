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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsElbLoadBalancerAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElbLoadBalancerAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCESSLOG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessLog").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONDRAINING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionDraining").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionSettings").build();
    private static final MarshallingInfo<StructuredPojo> CROSSZONELOADBALANCING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrossZoneLoadBalancing").build();

    private static final AwsElbLoadBalancerAttributesMarshaller instance = new AwsElbLoadBalancerAttributesMarshaller();

    public static AwsElbLoadBalancerAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElbLoadBalancerAttributes awsElbLoadBalancerAttributes, ProtocolMarshaller protocolMarshaller) {

        if (awsElbLoadBalancerAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElbLoadBalancerAttributes.getAccessLog(), ACCESSLOG_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerAttributes.getConnectionDraining(), CONNECTIONDRAINING_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerAttributes.getConnectionSettings(), CONNECTIONSETTINGS_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerAttributes.getCrossZoneLoadBalancing(), CROSSZONELOADBALANCING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
