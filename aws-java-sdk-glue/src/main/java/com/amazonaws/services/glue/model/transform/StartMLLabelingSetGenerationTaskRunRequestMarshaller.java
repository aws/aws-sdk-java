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
 * StartMLLabelingSetGenerationTaskRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartMLLabelingSetGenerationTaskRunRequestMarshaller {

    private static final MarshallingInfo<String> TRANSFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformId").build();
    private static final MarshallingInfo<String> OUTPUTS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputS3Path").build();

    private static final StartMLLabelingSetGenerationTaskRunRequestMarshaller instance = new StartMLLabelingSetGenerationTaskRunRequestMarshaller();

    public static StartMLLabelingSetGenerationTaskRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartMLLabelingSetGenerationTaskRunRequest startMLLabelingSetGenerationTaskRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (startMLLabelingSetGenerationTaskRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startMLLabelingSetGenerationTaskRunRequest.getTransformId(), TRANSFORMID_BINDING);
            protocolMarshaller.marshall(startMLLabelingSetGenerationTaskRunRequest.getOutputS3Path(), OUTPUTS3PATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
