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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3SourceConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3SourceConfigMarshaller {

    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<List> TEMPLATEDPATHLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplatedPathList").build();
    private static final MarshallingInfo<List> HISTORICALDATAPATHLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HistoricalDataPathList").build();
    private static final MarshallingInfo<StructuredPojo> FILEFORMATDESCRIPTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileFormatDescriptor").build();

    private static final S3SourceConfigMarshaller instance = new S3SourceConfigMarshaller();

    public static S3SourceConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3SourceConfig s3SourceConfig, ProtocolMarshaller protocolMarshaller) {

        if (s3SourceConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3SourceConfig.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(s3SourceConfig.getTemplatedPathList(), TEMPLATEDPATHLIST_BINDING);
            protocolMarshaller.marshall(s3SourceConfig.getHistoricalDataPathList(), HISTORICALDATAPATHLIST_BINDING);
            protocolMarshaller.marshall(s3SourceConfig.getFileFormatDescriptor(), FILEFORMATDESCRIPTOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
