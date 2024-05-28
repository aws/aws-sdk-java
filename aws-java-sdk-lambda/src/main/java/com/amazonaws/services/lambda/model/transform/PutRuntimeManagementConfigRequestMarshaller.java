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
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutRuntimeManagementConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutRuntimeManagementConfigRequestMarshaller {

    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("FunctionName").build();
    private static final MarshallingInfo<String> QUALIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("Qualifier").build();
    private static final MarshallingInfo<String> UPDATERUNTIMEON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateRuntimeOn").build();
    private static final MarshallingInfo<String> RUNTIMEVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuntimeVersionArn").build();

    private static final PutRuntimeManagementConfigRequestMarshaller instance = new PutRuntimeManagementConfigRequestMarshaller();

    public static PutRuntimeManagementConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutRuntimeManagementConfigRequest putRuntimeManagementConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (putRuntimeManagementConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putRuntimeManagementConfigRequest.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(putRuntimeManagementConfigRequest.getQualifier(), QUALIFIER_BINDING);
            protocolMarshaller.marshall(putRuntimeManagementConfigRequest.getUpdateRuntimeOn(), UPDATERUNTIMEON_BINDING);
            protocolMarshaller.marshall(putRuntimeManagementConfigRequest.getRuntimeVersionArn(), RUNTIMEVERSIONARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
