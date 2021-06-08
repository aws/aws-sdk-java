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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRedshiftClusterClusterNodeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRedshiftClusterClusterNodeMarshaller {

    private static final MarshallingInfo<String> NODEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeRole").build();
    private static final MarshallingInfo<String> PRIVATEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateIpAddress").build();
    private static final MarshallingInfo<String> PUBLICIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublicIpAddress").build();

    private static final AwsRedshiftClusterClusterNodeMarshaller instance = new AwsRedshiftClusterClusterNodeMarshaller();

    public static AwsRedshiftClusterClusterNodeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRedshiftClusterClusterNode awsRedshiftClusterClusterNode, ProtocolMarshaller protocolMarshaller) {

        if (awsRedshiftClusterClusterNode == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRedshiftClusterClusterNode.getNodeRole(), NODEROLE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterClusterNode.getPrivateIpAddress(), PRIVATEIPADDRESS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterClusterNode.getPublicIpAddress(), PUBLICIPADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
