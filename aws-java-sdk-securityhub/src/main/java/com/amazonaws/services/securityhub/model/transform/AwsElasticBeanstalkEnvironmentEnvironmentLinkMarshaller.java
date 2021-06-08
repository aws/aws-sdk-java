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
 * AwsElasticBeanstalkEnvironmentEnvironmentLinkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElasticBeanstalkEnvironmentEnvironmentLinkMarshaller {

    private static final MarshallingInfo<String> ENVIRONMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentName").build();
    private static final MarshallingInfo<String> LINKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LinkName").build();

    private static final AwsElasticBeanstalkEnvironmentEnvironmentLinkMarshaller instance = new AwsElasticBeanstalkEnvironmentEnvironmentLinkMarshaller();

    public static AwsElasticBeanstalkEnvironmentEnvironmentLinkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElasticBeanstalkEnvironmentEnvironmentLink awsElasticBeanstalkEnvironmentEnvironmentLink, ProtocolMarshaller protocolMarshaller) {

        if (awsElasticBeanstalkEnvironmentEnvironmentLink == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentEnvironmentLink.getEnvironmentName(), ENVIRONMENTNAME_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentEnvironmentLink.getLinkName(), LINKNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
