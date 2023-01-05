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
package com.amazonaws.services.backup.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateReportPlanRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateReportPlanRequestMarshaller {

    private static final MarshallingInfo<String> REPORTPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportPlanName").build();
    private static final MarshallingInfo<String> REPORTPLANDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportPlanDescription").build();
    private static final MarshallingInfo<StructuredPojo> REPORTDELIVERYCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportDeliveryChannel").build();
    private static final MarshallingInfo<StructuredPojo> REPORTSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportSetting").build();
    private static final MarshallingInfo<Map> REPORTPLANTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReportPlanTags").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdempotencyToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateReportPlanRequestMarshaller instance = new CreateReportPlanRequestMarshaller();

    public static CreateReportPlanRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateReportPlanRequest createReportPlanRequest, ProtocolMarshaller protocolMarshaller) {

        if (createReportPlanRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createReportPlanRequest.getReportPlanName(), REPORTPLANNAME_BINDING);
            protocolMarshaller.marshall(createReportPlanRequest.getReportPlanDescription(), REPORTPLANDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createReportPlanRequest.getReportDeliveryChannel(), REPORTDELIVERYCHANNEL_BINDING);
            protocolMarshaller.marshall(createReportPlanRequest.getReportSetting(), REPORTSETTING_BINDING);
            protocolMarshaller.marshall(createReportPlanRequest.getReportPlanTags(), REPORTPLANTAGS_BINDING);
            protocolMarshaller.marshall(createReportPlanRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
