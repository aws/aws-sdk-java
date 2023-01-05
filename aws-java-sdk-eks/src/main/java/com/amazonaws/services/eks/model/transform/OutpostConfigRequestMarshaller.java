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
package com.amazonaws.services.eks.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutpostConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutpostConfigRequestMarshaller {

    private static final MarshallingInfo<List> OUTPOSTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outpostArns").build();
    private static final MarshallingInfo<String> CONTROLPLANEINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlPlaneInstanceType").build();
    private static final MarshallingInfo<StructuredPojo> CONTROLPLANEPLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlPlanePlacement").build();

    private static final OutpostConfigRequestMarshaller instance = new OutpostConfigRequestMarshaller();

    public static OutpostConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutpostConfigRequest outpostConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (outpostConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outpostConfigRequest.getOutpostArns(), OUTPOSTARNS_BINDING);
            protocolMarshaller.marshall(outpostConfigRequest.getControlPlaneInstanceType(), CONTROLPLANEINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(outpostConfigRequest.getControlPlanePlacement(), CONTROLPLANEPLACEMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
