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
package com.amazonaws.services.omics.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartAnnotationImportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartAnnotationImportJobRequestMarshaller {

    private static final MarshallingInfo<String> DESTINATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationName").build();
    private static final MarshallingInfo<StructuredPojo> FORMATOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("formatOptions").build();
    private static final MarshallingInfo<List> ITEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("items").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<Boolean> RUNLEFTNORMALIZATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runLeftNormalization").build();

    private static final StartAnnotationImportJobRequestMarshaller instance = new StartAnnotationImportJobRequestMarshaller();

    public static StartAnnotationImportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartAnnotationImportJobRequest startAnnotationImportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startAnnotationImportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startAnnotationImportJobRequest.getDestinationName(), DESTINATIONNAME_BINDING);
            protocolMarshaller.marshall(startAnnotationImportJobRequest.getFormatOptions(), FORMATOPTIONS_BINDING);
            protocolMarshaller.marshall(startAnnotationImportJobRequest.getItems(), ITEMS_BINDING);
            protocolMarshaller.marshall(startAnnotationImportJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(startAnnotationImportJobRequest.getRunLeftNormalization(), RUNLEFTNORMALIZATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
