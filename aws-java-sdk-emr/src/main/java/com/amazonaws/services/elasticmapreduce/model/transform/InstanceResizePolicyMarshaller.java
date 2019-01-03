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
 * InstanceResizePolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceResizePolicyMarshaller {

    private static final MarshallingInfo<List> INSTANCESTOTERMINATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstancesToTerminate").build();
    private static final MarshallingInfo<List> INSTANCESTOPROTECT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstancesToProtect").build();
    private static final MarshallingInfo<Integer> INSTANCETERMINATIONTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceTerminationTimeout").build();

    private static final InstanceResizePolicyMarshaller instance = new InstanceResizePolicyMarshaller();

    public static InstanceResizePolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceResizePolicy instanceResizePolicy, ProtocolMarshaller protocolMarshaller) {

        if (instanceResizePolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceResizePolicy.getInstancesToTerminate(), INSTANCESTOTERMINATE_BINDING);
            protocolMarshaller.marshall(instanceResizePolicy.getInstancesToProtect(), INSTANCESTOPROTECT_BINDING);
            protocolMarshaller.marshall(instanceResizePolicy.getInstanceTerminationTimeout(), INSTANCETERMINATIONTIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
