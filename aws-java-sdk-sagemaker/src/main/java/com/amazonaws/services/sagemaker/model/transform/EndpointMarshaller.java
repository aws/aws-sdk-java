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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EndpointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EndpointMarshaller {

    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<String> ENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointArn").build();
    private static final MarshallingInfo<String> ENDPOINTCONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointConfigName").build();
    private static final MarshallingInfo<List> PRODUCTIONVARIANTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductionVariants").build();
    private static final MarshallingInfo<StructuredPojo> DATACAPTURECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataCaptureConfig").build();
    private static final MarshallingInfo<String> ENDPOINTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointStatus").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> MONITORINGSCHEDULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringSchedules").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final EndpointMarshaller instance = new EndpointMarshaller();

    public static EndpointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Endpoint endpoint, ProtocolMarshaller protocolMarshaller) {

        if (endpoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(endpoint.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(endpoint.getEndpointArn(), ENDPOINTARN_BINDING);
            protocolMarshaller.marshall(endpoint.getEndpointConfigName(), ENDPOINTCONFIGNAME_BINDING);
            protocolMarshaller.marshall(endpoint.getProductionVariants(), PRODUCTIONVARIANTS_BINDING);
            protocolMarshaller.marshall(endpoint.getDataCaptureConfig(), DATACAPTURECONFIG_BINDING);
            protocolMarshaller.marshall(endpoint.getEndpointStatus(), ENDPOINTSTATUS_BINDING);
            protocolMarshaller.marshall(endpoint.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(endpoint.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(endpoint.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(endpoint.getMonitoringSchedules(), MONITORINGSCHEDULES_BINDING);
            protocolMarshaller.marshall(endpoint.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
