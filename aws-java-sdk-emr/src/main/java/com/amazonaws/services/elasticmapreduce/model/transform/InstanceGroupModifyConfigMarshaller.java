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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceGroupModifyConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceGroupModifyConfigMarshaller {

    private static final MarshallingInfo<String> INSTANCEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGroupId").build();
    private static final MarshallingInfo<Integer> INSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCount").build();
    private static final MarshallingInfo<List> EC2INSTANCEIDSTOTERMINATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EC2InstanceIdsToTerminate").build();
    private static final MarshallingInfo<StructuredPojo> SHRINKPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShrinkPolicy").build();
    private static final MarshallingInfo<List> CONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configurations").build();

    private static final InstanceGroupModifyConfigMarshaller instance = new InstanceGroupModifyConfigMarshaller();

    public static InstanceGroupModifyConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceGroupModifyConfig instanceGroupModifyConfig, ProtocolMarshaller protocolMarshaller) {

        if (instanceGroupModifyConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceGroupModifyConfig.getInstanceGroupId(), INSTANCEGROUPID_BINDING);
            protocolMarshaller.marshall(instanceGroupModifyConfig.getInstanceCount(), INSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(instanceGroupModifyConfig.getEC2InstanceIdsToTerminate(), EC2INSTANCEIDSTOTERMINATE_BINDING);
            protocolMarshaller.marshall(instanceGroupModifyConfig.getShrinkPolicy(), SHRINKPOLICY_BINDING);
            protocolMarshaller.marshall(instanceGroupModifyConfig.getConfigurations(), CONFIGURATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
