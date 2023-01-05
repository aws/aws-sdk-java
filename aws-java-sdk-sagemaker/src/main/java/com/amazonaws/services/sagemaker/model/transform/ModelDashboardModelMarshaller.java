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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelDashboardModelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelDashboardModelMarshaller {

    private static final MarshallingInfo<StructuredPojo> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Model").build();
    private static final MarshallingInfo<List> ENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoints").build();
    private static final MarshallingInfo<StructuredPojo> LASTBATCHTRANSFORMJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastBatchTransformJob").build();
    private static final MarshallingInfo<List> MONITORINGSCHEDULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringSchedules").build();
    private static final MarshallingInfo<StructuredPojo> MODELCARD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelCard").build();

    private static final ModelDashboardModelMarshaller instance = new ModelDashboardModelMarshaller();

    public static ModelDashboardModelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelDashboardModel modelDashboardModel, ProtocolMarshaller protocolMarshaller) {

        if (modelDashboardModel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelDashboardModel.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(modelDashboardModel.getEndpoints(), ENDPOINTS_BINDING);
            protocolMarshaller.marshall(modelDashboardModel.getLastBatchTransformJob(), LASTBATCHTRANSFORMJOB_BINDING);
            protocolMarshaller.marshall(modelDashboardModel.getMonitoringSchedules(), MONITORINGSCHEDULES_BINDING);
            protocolMarshaller.marshall(modelDashboardModel.getModelCard(), MODELCARD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
