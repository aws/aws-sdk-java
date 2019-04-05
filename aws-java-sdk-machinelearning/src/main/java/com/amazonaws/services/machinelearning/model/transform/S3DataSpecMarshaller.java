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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3DataSpecMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3DataSpecMarshaller {

    private static final MarshallingInfo<String> DATALOCATIONS3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLocationS3").build();
    private static final MarshallingInfo<String> DATAREARRANGEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRearrangement").build();
    private static final MarshallingInfo<String> DATASCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSchema").build();
    private static final MarshallingInfo<String> DATASCHEMALOCATIONS3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSchemaLocationS3").build();

    private static final S3DataSpecMarshaller instance = new S3DataSpecMarshaller();

    public static S3DataSpecMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3DataSpec s3DataSpec, ProtocolMarshaller protocolMarshaller) {

        if (s3DataSpec == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3DataSpec.getDataLocationS3(), DATALOCATIONS3_BINDING);
            protocolMarshaller.marshall(s3DataSpec.getDataRearrangement(), DATAREARRANGEMENT_BINDING);
            protocolMarshaller.marshall(s3DataSpec.getDataSchema(), DATASCHEMA_BINDING);
            protocolMarshaller.marshall(s3DataSpec.getDataSchemaLocationS3(), DATASCHEMALOCATIONS3_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
