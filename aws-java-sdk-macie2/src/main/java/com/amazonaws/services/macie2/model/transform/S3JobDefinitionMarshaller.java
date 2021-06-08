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
 * S3JobDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3JobDefinitionMarshaller {

    private static final MarshallingInfo<List> BUCKETDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketDefinitions").build();
    private static final MarshallingInfo<StructuredPojo> SCOPING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scoping").build();
    private static final MarshallingInfo<StructuredPojo> BUCKETCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bucketCriteria").build();

    private static final S3JobDefinitionMarshaller instance = new S3JobDefinitionMarshaller();

    public static S3JobDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3JobDefinition s3JobDefinition, ProtocolMarshaller protocolMarshaller) {

        if (s3JobDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3JobDefinition.getBucketDefinitions(), BUCKETDEFINITIONS_BINDING);
            protocolMarshaller.marshall(s3JobDefinition.getScoping(), SCOPING_BINDING);
            protocolMarshaller.marshall(s3JobDefinition.getBucketCriteria(), BUCKETCRITERIA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
