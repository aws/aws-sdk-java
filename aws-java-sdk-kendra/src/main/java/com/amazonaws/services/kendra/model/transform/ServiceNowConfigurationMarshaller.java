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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceNowConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceNowConfigurationMarshaller {

    private static final MarshallingInfo<String> HOSTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HostUrl").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<String> SERVICENOWBUILDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNowBuildVersion").build();
    private static final MarshallingInfo<StructuredPojo> KNOWLEDGEARTICLECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KnowledgeArticleConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SERVICECATALOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCatalogConfiguration").build();
    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationType").build();

    private static final ServiceNowConfigurationMarshaller instance = new ServiceNowConfigurationMarshaller();

    public static ServiceNowConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceNowConfiguration serviceNowConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (serviceNowConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceNowConfiguration.getHostUrl(), HOSTURL_BINDING);
            protocolMarshaller.marshall(serviceNowConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(serviceNowConfiguration.getServiceNowBuildVersion(), SERVICENOWBUILDVERSION_BINDING);
            protocolMarshaller.marshall(serviceNowConfiguration.getKnowledgeArticleConfiguration(), KNOWLEDGEARTICLECONFIGURATION_BINDING);
            protocolMarshaller.marshall(serviceNowConfiguration.getServiceCatalogConfiguration(), SERVICECATALOGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(serviceNowConfiguration.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
