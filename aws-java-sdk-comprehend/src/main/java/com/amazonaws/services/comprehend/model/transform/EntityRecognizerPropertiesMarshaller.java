/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EntityRecognizerPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntityRecognizerPropertiesMarshaller {

    private static final MarshallingInfo<String> ENTITYRECOGNIZERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityRecognizerArn").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();
    private static final MarshallingInfo<java.util.Date> SUBMITTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubmitTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRAININGSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRAININGENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> RECOGNIZERMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecognizerMetadata").build();
    private static final MarshallingInfo<String> DATAACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataAccessRoleArn").build();
    private static final MarshallingInfo<String> VOLUMEKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeKmsKeyId").build();

    private static final EntityRecognizerPropertiesMarshaller instance = new EntityRecognizerPropertiesMarshaller();

    public static EntityRecognizerPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntityRecognizerProperties entityRecognizerProperties, ProtocolMarshaller protocolMarshaller) {

        if (entityRecognizerProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entityRecognizerProperties.getEntityRecognizerArn(), ENTITYRECOGNIZERARN_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getSubmitTime(), SUBMITTIME_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getTrainingStartTime(), TRAININGSTARTTIME_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getTrainingEndTime(), TRAININGENDTIME_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getRecognizerMetadata(), RECOGNIZERMETADATA_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getDataAccessRoleArn(), DATAACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(entityRecognizerProperties.getVolumeKmsKeyId(), VOLUMEKMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
