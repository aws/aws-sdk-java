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
package com.amazonaws.services.rekognition.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CopyProjectVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CopyProjectVersionRequestMarshaller {

    private static final MarshallingInfo<String> SOURCEPROJECTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceProjectArn").build();
    private static final MarshallingInfo<String> SOURCEPROJECTVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceProjectVersionArn").build();
    private static final MarshallingInfo<String> DESTINATIONPROJECTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationProjectArn").build();
    private static final MarshallingInfo<String> VERSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VersionName").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputConfig").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();

    private static final CopyProjectVersionRequestMarshaller instance = new CopyProjectVersionRequestMarshaller();

    public static CopyProjectVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CopyProjectVersionRequest copyProjectVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (copyProjectVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(copyProjectVersionRequest.getSourceProjectArn(), SOURCEPROJECTARN_BINDING);
            protocolMarshaller.marshall(copyProjectVersionRequest.getSourceProjectVersionArn(), SOURCEPROJECTVERSIONARN_BINDING);
            protocolMarshaller.marshall(copyProjectVersionRequest.getDestinationProjectArn(), DESTINATIONPROJECTARN_BINDING);
            protocolMarshaller.marshall(copyProjectVersionRequest.getVersionName(), VERSIONNAME_BINDING);
            protocolMarshaller.marshall(copyProjectVersionRequest.getOutputConfig(), OUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(copyProjectVersionRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(copyProjectVersionRequest.getKmsKeyId(), KMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
