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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEksClusterDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEksClusterDetailsMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityData").build();
    private static final MarshallingInfo<String> CLUSTERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterStatus").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Endpoint").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCESVPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourcesVpcConfig").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<StructuredPojo> LOGGING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Logging").build();

    private static final AwsEksClusterDetailsMarshaller instance = new AwsEksClusterDetailsMarshaller();

    public static AwsEksClusterDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEksClusterDetails awsEksClusterDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEksClusterDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEksClusterDetails.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(awsEksClusterDetails.getCertificateAuthorityData(), CERTIFICATEAUTHORITYDATA_BINDING);
            protocolMarshaller.marshall(awsEksClusterDetails.getClusterStatus(), CLUSTERSTATUS_BINDING);
            protocolMarshaller.marshall(awsEksClusterDetails.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(awsEksClusterDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(awsEksClusterDetails.getResourcesVpcConfig(), RESOURCESVPCCONFIG_BINDING);
            protocolMarshaller.marshall(awsEksClusterDetails.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(awsEksClusterDetails.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(awsEksClusterDetails.getLogging(), LOGGING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
