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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpsolverS3OutputFormatConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpsolverS3OutputFormatConfigMarshaller {

    private static final MarshallingInfo<String> FILETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fileType").build();
    private static final MarshallingInfo<StructuredPojo> PREFIXCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("prefixConfig").build();
    private static final MarshallingInfo<StructuredPojo> AGGREGATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationConfig").build();

    private static final UpsolverS3OutputFormatConfigMarshaller instance = new UpsolverS3OutputFormatConfigMarshaller();

    public static UpsolverS3OutputFormatConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpsolverS3OutputFormatConfig upsolverS3OutputFormatConfig, ProtocolMarshaller protocolMarshaller) {

        if (upsolverS3OutputFormatConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(upsolverS3OutputFormatConfig.getFileType(), FILETYPE_BINDING);
            protocolMarshaller.marshall(upsolverS3OutputFormatConfig.getPrefixConfig(), PREFIXCONFIG_BINDING);
            protocolMarshaller.marshall(upsolverS3OutputFormatConfig.getAggregationConfig(), AGGREGATIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
