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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartImportLabelsTaskRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartImportLabelsTaskRunRequestMarshaller {

    private static final MarshallingInfo<String> TRANSFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformId").build();
    private static final MarshallingInfo<String> INPUTS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputS3Path").build();
    private static final MarshallingInfo<Boolean> REPLACEALLLABELS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplaceAllLabels").build();

    private static final StartImportLabelsTaskRunRequestMarshaller instance = new StartImportLabelsTaskRunRequestMarshaller();

    public static StartImportLabelsTaskRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartImportLabelsTaskRunRequest startImportLabelsTaskRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (startImportLabelsTaskRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startImportLabelsTaskRunRequest.getTransformId(), TRANSFORMID_BINDING);
            protocolMarshaller.marshall(startImportLabelsTaskRunRequest.getInputS3Path(), INPUTS3PATH_BINDING);
            protocolMarshaller.marshall(startImportLabelsTaskRunRequest.getReplaceAllLabels(), REPLACEALLLABELS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
