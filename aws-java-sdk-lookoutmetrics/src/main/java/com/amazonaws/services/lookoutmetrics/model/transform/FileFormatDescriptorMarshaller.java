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
package com.amazonaws.services.lookoutmetrics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FileFormatDescriptorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FileFormatDescriptorMarshaller {

    private static final MarshallingInfo<StructuredPojo> CSVFORMATDESCRIPTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CsvFormatDescriptor").build();
    private static final MarshallingInfo<StructuredPojo> JSONFORMATDESCRIPTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JsonFormatDescriptor").build();

    private static final FileFormatDescriptorMarshaller instance = new FileFormatDescriptorMarshaller();

    public static FileFormatDescriptorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FileFormatDescriptor fileFormatDescriptor, ProtocolMarshaller protocolMarshaller) {

        if (fileFormatDescriptor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fileFormatDescriptor.getCsvFormatDescriptor(), CSVFORMATDESCRIPTOR_BINDING);
            protocolMarshaller.marshall(fileFormatDescriptor.getJsonFormatDescriptor(), JSONFORMATDESCRIPTOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
