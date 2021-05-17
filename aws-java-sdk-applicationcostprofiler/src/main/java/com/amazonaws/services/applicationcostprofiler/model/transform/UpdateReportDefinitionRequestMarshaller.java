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
package com.amazonaws.services.applicationcostprofiler.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationcostprofiler.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateReportDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateReportDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> REPORTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("reportId").build();
    private static final MarshallingInfo<String> REPORTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reportDescription").build();
    private static final MarshallingInfo<String> REPORTFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reportFrequency").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("format").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONS3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationS3Location").build();

    private static final UpdateReportDefinitionRequestMarshaller instance = new UpdateReportDefinitionRequestMarshaller();

    public static UpdateReportDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateReportDefinitionRequest updateReportDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateReportDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateReportDefinitionRequest.getReportId(), REPORTID_BINDING);
            protocolMarshaller.marshall(updateReportDefinitionRequest.getReportDescription(), REPORTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateReportDefinitionRequest.getReportFrequency(), REPORTFREQUENCY_BINDING);
            protocolMarshaller.marshall(updateReportDefinitionRequest.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(updateReportDefinitionRequest.getDestinationS3Location(), DESTINATIONS3LOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
