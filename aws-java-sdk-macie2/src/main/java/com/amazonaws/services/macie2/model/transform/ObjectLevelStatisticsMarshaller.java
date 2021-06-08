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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ObjectLevelStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ObjectLevelStatisticsMarshaller {

    private static final MarshallingInfo<Long> FILETYPE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fileType").build();
    private static final MarshallingInfo<Long> STORAGECLASS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("storageClass").build();
    private static final MarshallingInfo<Long> TOTAL_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("total").build();

    private static final ObjectLevelStatisticsMarshaller instance = new ObjectLevelStatisticsMarshaller();

    public static ObjectLevelStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ObjectLevelStatistics objectLevelStatistics, ProtocolMarshaller protocolMarshaller) {

        if (objectLevelStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(objectLevelStatistics.getFileType(), FILETYPE_BINDING);
            protocolMarshaller.marshall(objectLevelStatistics.getStorageClass(), STORAGECLASS_BINDING);
            protocolMarshaller.marshall(objectLevelStatistics.getTotal(), TOTAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
