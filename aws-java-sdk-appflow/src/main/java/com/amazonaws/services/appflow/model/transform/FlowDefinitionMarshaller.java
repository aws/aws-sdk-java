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
package com.amazonaws.services.appflow.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FlowDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FlowDefinitionMarshaller {

    private static final MarshallingInfo<String> FLOWARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("flowArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> FLOWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("flowName").build();
    private static final MarshallingInfo<String> FLOWSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("flowStatus").build();
    private static final MarshallingInfo<String> SOURCECONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceConnectorType").build();
    private static final MarshallingInfo<String> DESTINATIONCONNECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationConnectorType").build();
    private static final MarshallingInfo<String> TRIGGERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("triggerType").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> LASTUPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedBy").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> LASTRUNEXECUTIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRunExecutionDetails").build();

    private static final FlowDefinitionMarshaller instance = new FlowDefinitionMarshaller();

    public static FlowDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FlowDefinition flowDefinition, ProtocolMarshaller protocolMarshaller) {

        if (flowDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(flowDefinition.getFlowArn(), FLOWARN_BINDING);
            protocolMarshaller.marshall(flowDefinition.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(flowDefinition.getFlowName(), FLOWNAME_BINDING);
            protocolMarshaller.marshall(flowDefinition.getFlowStatus(), FLOWSTATUS_BINDING);
            protocolMarshaller.marshall(flowDefinition.getSourceConnectorType(), SOURCECONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(flowDefinition.getDestinationConnectorType(), DESTINATIONCONNECTORTYPE_BINDING);
            protocolMarshaller.marshall(flowDefinition.getTriggerType(), TRIGGERTYPE_BINDING);
            protocolMarshaller.marshall(flowDefinition.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(flowDefinition.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(flowDefinition.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(flowDefinition.getLastUpdatedBy(), LASTUPDATEDBY_BINDING);
            protocolMarshaller.marshall(flowDefinition.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(flowDefinition.getLastRunExecutionDetails(), LASTRUNEXECUTIONDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
