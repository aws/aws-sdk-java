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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetailsMarshaller {

    private static final MarshallingInfo<String> LOGDRIVER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogDriver").build();
    private static final MarshallingInfo<Map> OPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Options").build();
    private static final MarshallingInfo<List> SECRETOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretOptions").build();

    private static final AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetailsMarshaller instance = new AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetailsMarshaller();

    public static AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails awsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails.getLogDriver(), LOGDRIVER_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails.getOptions(), OPTIONS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails.getSecretOptions(), SECRETOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
