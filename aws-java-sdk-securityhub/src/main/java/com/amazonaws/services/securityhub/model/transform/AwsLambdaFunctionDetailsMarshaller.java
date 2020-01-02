/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsLambdaFunctionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsLambdaFunctionDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Code").build();
    private static final MarshallingInfo<String> CODESHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeSha256").build();
    private static final MarshallingInfo<StructuredPojo> DEADLETTERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeadLetterConfig").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Environment").build();
    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionName").build();
    private static final MarshallingInfo<String> HANDLER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Handler").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyArn").build();
    private static final MarshallingInfo<String> LASTMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModified").build();
    private static final MarshallingInfo<List> LAYERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Layers").build();
    private static final MarshallingInfo<String> MASTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MasterArn").build();
    private static final MarshallingInfo<Integer> MEMORYSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemorySize").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevisionId").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Runtime").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<StructuredPojo> TRACINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TracingConfig").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();

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
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getCodeSha256(), CODESHA256_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getDeadLetterConfig(), DEADLETTERCONFIG_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getHandler(), HANDLER_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getLastModified(), LASTMODIFIED_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getLayers(), LAYERS_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getMasterArn(), MASTERARN_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getMemorySize(), MEMORYSIZE_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getRevisionId(), REVISIONID_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getRuntime(), RUNTIME_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getTracingConfig(), TRACINGCONFIG_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(awsLambdaFunctionDetails.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
