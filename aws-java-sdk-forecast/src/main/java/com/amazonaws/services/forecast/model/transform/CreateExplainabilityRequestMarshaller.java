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
package com.amazonaws.services.forecast.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateExplainabilityRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateExplainabilityRequestMarshaller {

    private static final MarshallingInfo<String> EXPLAINABILITYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExplainabilityName").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<StructuredPojo> EXPLAINABILITYCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExplainabilityConfig").build();
    private static final MarshallingInfo<StructuredPojo> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schema").build();
    private static final MarshallingInfo<Boolean> ENABLEVISUALIZATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableVisualization").build();
    private static final MarshallingInfo<String> STARTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartDateTime").build();
    private static final MarshallingInfo<String> ENDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndDateTime").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateExplainabilityRequestMarshaller instance = new CreateExplainabilityRequestMarshaller();

    public static CreateExplainabilityRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateExplainabilityRequest createExplainabilityRequest, ProtocolMarshaller protocolMarshaller) {

        if (createExplainabilityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createExplainabilityRequest.getExplainabilityName(), EXPLAINABILITYNAME_BINDING);
            protocolMarshaller.marshall(createExplainabilityRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(createExplainabilityRequest.getExplainabilityConfig(), EXPLAINABILITYCONFIG_BINDING);
            protocolMarshaller.marshall(createExplainabilityRequest.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(createExplainabilityRequest.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(createExplainabilityRequest.getEnableVisualization(), ENABLEVISUALIZATION_BINDING);
            protocolMarshaller.marshall(createExplainabilityRequest.getStartDateTime(), STARTDATETIME_BINDING);
            protocolMarshaller.marshall(createExplainabilityRequest.getEndDateTime(), ENDDATETIME_BINDING);
            protocolMarshaller.marshall(createExplainabilityRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
