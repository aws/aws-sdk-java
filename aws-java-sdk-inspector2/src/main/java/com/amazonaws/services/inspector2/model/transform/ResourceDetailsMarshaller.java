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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> AWSEC2INSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsEc2Instance").build();
    private static final MarshallingInfo<StructuredPojo> AWSECRCONTAINERIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsEcrContainerImage").build();
    private static final MarshallingInfo<StructuredPojo> AWSLAMBDAFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsLambdaFunction").build();

    private static final ResourceDetailsMarshaller instance = new ResourceDetailsMarshaller();

    public static ResourceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceDetails resourceDetails, ProtocolMarshaller protocolMarshaller) {

        if (resourceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceDetails.getAwsEc2Instance(), AWSEC2INSTANCE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEcrContainerImage(), AWSECRCONTAINERIMAGE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsLambdaFunction(), AWSLAMBDAFUNCTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
