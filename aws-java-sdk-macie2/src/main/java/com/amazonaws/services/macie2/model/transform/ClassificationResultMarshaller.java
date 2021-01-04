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
package com.amazonaws.services.macie2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClassificationResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClassificationResultMarshaller {

    private static final MarshallingInfo<Boolean> ADDITIONALOCCURRENCES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalOccurrences").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMDATAIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customDataIdentifiers").build();
    private static final MarshallingInfo<String> MIMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mimeType").build();
    private static final MarshallingInfo<List> SENSITIVEDATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sensitiveData").build();
    private static final MarshallingInfo<Long> SIZECLASSIFIED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sizeClassified").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("status").build();

    private static final ClassificationResultMarshaller instance = new ClassificationResultMarshaller();

    public static ClassificationResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClassificationResult classificationResult, ProtocolMarshaller protocolMarshaller) {

        if (classificationResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(classificationResult.getAdditionalOccurrences(), ADDITIONALOCCURRENCES_BINDING);
            protocolMarshaller.marshall(classificationResult.getCustomDataIdentifiers(), CUSTOMDATAIDENTIFIERS_BINDING);
            protocolMarshaller.marshall(classificationResult.getMimeType(), MIMETYPE_BINDING);
            protocolMarshaller.marshall(classificationResult.getSensitiveData(), SENSITIVEDATA_BINDING);
            protocolMarshaller.marshall(classificationResult.getSizeClassified(), SIZECLASSIFIED_BINDING);
            protocolMarshaller.marshall(classificationResult.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
