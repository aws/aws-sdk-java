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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BucketStatisticsBySensitivityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BucketStatisticsBySensitivityMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLASSIFICATIONERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("classificationError").build();
    private static final MarshallingInfo<StructuredPojo> NOTCLASSIFIED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notClassified").build();
    private static final MarshallingInfo<StructuredPojo> NOTSENSITIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notSensitive").build();
    private static final MarshallingInfo<StructuredPojo> SENSITIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sensitive").build();

    private static final BucketStatisticsBySensitivityMarshaller instance = new BucketStatisticsBySensitivityMarshaller();

    public static BucketStatisticsBySensitivityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BucketStatisticsBySensitivity bucketStatisticsBySensitivity, ProtocolMarshaller protocolMarshaller) {

        if (bucketStatisticsBySensitivity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bucketStatisticsBySensitivity.getClassificationError(), CLASSIFICATIONERROR_BINDING);
            protocolMarshaller.marshall(bucketStatisticsBySensitivity.getNotClassified(), NOTCLASSIFIED_BINDING);
            protocolMarshaller.marshall(bucketStatisticsBySensitivity.getNotSensitive(), NOTSENSITIVE_BINDING);
            protocolMarshaller.marshall(bucketStatisticsBySensitivity.getSensitive(), SENSITIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
