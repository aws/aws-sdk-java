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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnalyzerNameUnionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnalyzerNameUnionMarshaller {

    private static final MarshallingInfo<String> BINARYANALYZERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("binaryAnalyzerName").build();
    private static final MarshallingInfo<String> RUNTIMEANALYZERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runTimeAnalyzerName").build();
    private static final MarshallingInfo<String> SOURCECODEANALYZERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCodeAnalyzerName").build();

    private static final AnalyzerNameUnionMarshaller instance = new AnalyzerNameUnionMarshaller();

    public static AnalyzerNameUnionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnalyzerNameUnion analyzerNameUnion, ProtocolMarshaller protocolMarshaller) {

        if (analyzerNameUnion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(analyzerNameUnion.getBinaryAnalyzerName(), BINARYANALYZERNAME_BINDING);
            protocolMarshaller.marshall(analyzerNameUnion.getRunTimeAnalyzerName(), RUNTIMEANALYZERNAME_BINDING);
            protocolMarshaller.marshall(analyzerNameUnion.getSourceCodeAnalyzerName(), SOURCECODEANALYZERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
