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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListStageDevicesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListStageDevicesRequestMarshaller {

    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> EDGEDEPLOYMENTPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeDeploymentPlanName").build();
    private static final MarshallingInfo<Boolean> EXCLUDEDEVICESDEPLOYEDINOTHERSTAGE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeDevicesDeployedInOtherStage").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StageName").build();

    private static final ListStageDevicesRequestMarshaller instance = new ListStageDevicesRequestMarshaller();

    public static ListStageDevicesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListStageDevicesRequest listStageDevicesRequest, ProtocolMarshaller protocolMarshaller) {

        if (listStageDevicesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listStageDevicesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listStageDevicesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listStageDevicesRequest.getEdgeDeploymentPlanName(), EDGEDEPLOYMENTPLANNAME_BINDING);
            protocolMarshaller.marshall(listStageDevicesRequest.getExcludeDevicesDeployedInOtherStage(), EXCLUDEDEVICESDEPLOYEDINOTHERSTAGE_BINDING);
            protocolMarshaller.marshall(listStageDevicesRequest.getStageName(), STAGENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
