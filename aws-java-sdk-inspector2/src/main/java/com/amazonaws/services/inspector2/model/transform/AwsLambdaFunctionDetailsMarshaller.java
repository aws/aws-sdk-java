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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsLambdaFunctionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsLambdaFunctionDetailsMarshaller {

    private static final MarshallingInfo<List> ARCHITECTURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("architectures").build();
    private static final MarshallingInfo<String> CODESHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codeSha256").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRoleArn").build();
    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("functionName").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> LAYERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("layers").build();
    private static final MarshallingInfo<String> PACKAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageType").build();
    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runtime").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfig").build();

    private static final AwsLambdaFunctionDetailsMarshaller instance = new AwsLambdaFunctionDetailsMarshaller();

    public static AwsLambdaFunctionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsLambdaFunctionDetails awsLambdaFunctionDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsLambdaFunctionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getArchitectures(), ARCHITECTURES_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getCodeSha256(), CODESHA256_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getLastModifiedAt(), LASTMODIFIEDAT_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getLayers(), LAYERS_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getPackageType(), PACKAGETYPE_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getRuntime(), RUNTIME_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getVpcConfig(), VPCCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
