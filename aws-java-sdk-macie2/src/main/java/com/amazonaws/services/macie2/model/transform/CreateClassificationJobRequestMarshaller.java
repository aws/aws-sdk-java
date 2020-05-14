/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateClassificationJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateClassificationJobRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<List> CUSTOMDATAIDENTIFIERIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customDataIdentifierIds").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> INITIALRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initialRun").build();
    private static final MarshallingInfo<String> JOBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobType").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> S3JOBDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3JobDefinition").build();
    private static final MarshallingInfo<Integer> SAMPLINGPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("samplingPercentage").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULEFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduleFrequency").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateClassificationJobRequestMarshaller instance = new CreateClassificationJobRequestMarshaller();

    public static CreateClassificationJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateClassificationJobRequest createClassificationJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createClassificationJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createClassificationJobRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getCustomDataIdentifierIds(), CUSTOMDATAIDENTIFIERIDS_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getInitialRun(), INITIALRUN_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getJobType(), JOBTYPE_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getS3JobDefinition(), S3JOBDEFINITION_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getSamplingPercentage(), SAMPLINGPERCENTAGE_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getScheduleFrequency(), SCHEDULEFREQUENCY_BINDING);
            protocolMarshaller.marshall(createClassificationJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
