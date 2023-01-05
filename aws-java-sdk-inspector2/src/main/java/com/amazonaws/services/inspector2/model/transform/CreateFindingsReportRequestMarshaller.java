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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFindingsReportRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFindingsReportRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> FILTERCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterCriteria").build();
    private static final MarshallingInfo<String> REPORTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reportFormat").build();
    private static final MarshallingInfo<StructuredPojo> S3DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3Destination").build();

    private static final CreateFindingsReportRequestMarshaller instance = new CreateFindingsReportRequestMarshaller();

    public static CreateFindingsReportRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFindingsReportRequest createFindingsReportRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFindingsReportRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFindingsReportRequest.getFilterCriteria(), FILTERCRITERIA_BINDING);
            protocolMarshaller.marshall(createFindingsReportRequest.getReportFormat(), REPORTFORMAT_BINDING);
            protocolMarshaller.marshall(createFindingsReportRequest.getS3Destination(), S3DESTINATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
