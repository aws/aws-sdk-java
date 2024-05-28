/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.neptunedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartLoaderJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartLoaderJobRequestMarshaller {

    private static final MarshallingInfo<String> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("source").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("format").build();
    private static final MarshallingInfo<String> S3BUCKETREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("region").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamRoleArn").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mode").build();
    private static final MarshallingInfo<Boolean> FAILONERROR_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failOnError").build();
    private static final MarshallingInfo<String> PARALLELISM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parallelism").build();
    private static final MarshallingInfo<Map> PARSERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parserConfiguration").build();
    private static final MarshallingInfo<Boolean> UPDATESINGLECARDINALITYPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateSingleCardinalityProperties").build();
    private static final MarshallingInfo<Boolean> QUEUEREQUEST_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queueRequest").build();
    private static final MarshallingInfo<List> DEPENDENCIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dependencies").build();
    private static final MarshallingInfo<Boolean> USERPROVIDEDEDGEIDS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userProvidedEdgeIds").build();

    private static final StartLoaderJobRequestMarshaller instance = new StartLoaderJobRequestMarshaller();

    public static StartLoaderJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartLoaderJobRequest startLoaderJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startLoaderJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startLoaderJobRequest.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getS3BucketRegion(), S3BUCKETREGION_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getFailOnError(), FAILONERROR_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getParallelism(), PARALLELISM_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getParserConfiguration(), PARSERCONFIGURATION_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getUpdateSingleCardinalityProperties(), UPDATESINGLECARDINALITYPROPERTIES_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getQueueRequest(), QUEUEREQUEST_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getDependencies(), DEPENDENCIES_BINDING);
            protocolMarshaller.marshall(startLoaderJobRequest.getUserProvidedEdgeIds(), USERPROVIDEDEDGEIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
