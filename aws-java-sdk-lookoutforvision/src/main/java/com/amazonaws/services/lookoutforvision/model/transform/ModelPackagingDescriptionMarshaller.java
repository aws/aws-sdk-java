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
package com.amazonaws.services.lookoutforvision.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutforvision.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelPackagingDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelPackagingDescriptionMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<String> PROJECTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectName").build();
    private static final MarshallingInfo<String> MODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelVersion").build();
    private static final MarshallingInfo<StructuredPojo> MODELPACKAGINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackagingConfiguration").build();
    private static final MarshallingInfo<String> MODELPACKAGINGJOBDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackagingJobDescription").build();
    private static final MarshallingInfo<String> MODELPACKAGINGMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackagingMethod").build();
    private static final MarshallingInfo<StructuredPojo> MODELPACKAGINGOUTPUTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackagingOutputDetails").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTimestamp").timestampFormat("unixTimestamp").build();

    private static final ModelPackagingDescriptionMarshaller instance = new ModelPackagingDescriptionMarshaller();

    public static ModelPackagingDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelPackagingDescription modelPackagingDescription, ProtocolMarshaller protocolMarshaller) {

        if (modelPackagingDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelPackagingDescription.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getProjectName(), PROJECTNAME_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getModelVersion(), MODELVERSION_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getModelPackagingConfiguration(), MODELPACKAGINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getModelPackagingJobDescription(), MODELPACKAGINGJOBDESCRIPTION_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getModelPackagingMethod(), MODELPACKAGINGMETHOD_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getModelPackagingOutputDetails(), MODELPACKAGINGOUTPUTDETAILS_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getCreationTimestamp(), CREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(modelPackagingDescription.getLastUpdatedTimestamp(), LASTUPDATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
