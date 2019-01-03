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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodeSigningMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodeSigningMarshaller {

    private static final MarshallingInfo<String> AWSSIGNERJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsSignerJobId").build();
    private static final MarshallingInfo<StructuredPojo> STARTSIGNINGJOBPARAMETER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startSigningJobParameter").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMCODESIGNING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customCodeSigning").build();

    private static final CodeSigningMarshaller instance = new CodeSigningMarshaller();

    public static CodeSigningMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodeSigning codeSigning, ProtocolMarshaller protocolMarshaller) {

        if (codeSigning == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codeSigning.getAwsSignerJobId(), AWSSIGNERJOBID_BINDING);
            protocolMarshaller.marshall(codeSigning.getStartSigningJobParameter(), STARTSIGNINGJOBPARAMETER_BINDING);
            protocolMarshaller.marshall(codeSigning.getCustomCodeSigning(), CUSTOMCODESIGNING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
