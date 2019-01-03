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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> EC2INSTANCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2InstanceDetails").build();
    private static final MarshallingInfo<StructuredPojo> RDSINSTANCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RDSInstanceDetails").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTINSTANCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftInstanceDetails").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICACHEINSTANCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElastiCacheInstanceDetails").build();
    private static final MarshallingInfo<StructuredPojo> ESINSTANCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ESInstanceDetails").build();

    private static final InstanceDetailsMarshaller instance = new InstanceDetailsMarshaller();

    public static InstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceDetails instanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (instanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceDetails.getEC2InstanceDetails(), EC2INSTANCEDETAILS_BINDING);
            protocolMarshaller.marshall(instanceDetails.getRDSInstanceDetails(), RDSINSTANCEDETAILS_BINDING);
            protocolMarshaller.marshall(instanceDetails.getRedshiftInstanceDetails(), REDSHIFTINSTANCEDETAILS_BINDING);
            protocolMarshaller.marshall(instanceDetails.getElastiCacheInstanceDetails(), ELASTICACHEINSTANCEDETAILS_BINDING);
            protocolMarshaller.marshall(instanceDetails.getESInstanceDetails(), ESINSTANCEDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
