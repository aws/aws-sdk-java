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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsElasticBeanstalkEnvironmentDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElasticBeanstalkEnvironmentDetailsMarshaller {

    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationName").build();
    private static final MarshallingInfo<String> CNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cname").build();
    private static final MarshallingInfo<String> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateCreated").build();
    private static final MarshallingInfo<String> DATEUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateUpdated").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ENDPOINTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointUrl").build();
    private static final MarshallingInfo<String> ENVIRONMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentArn").build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentId").build();
    private static final MarshallingInfo<List> ENVIRONMENTLINKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentLinks").build();
    private static final MarshallingInfo<String> ENVIRONMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentName").build();
    private static final MarshallingInfo<List> OPTIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptionSettings").build();
    private static final MarshallingInfo<String> PLATFORMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlatformArn").build();
    private static final MarshallingInfo<String> SOLUTIONSTACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SolutionStackName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> TIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tier").build();
    private static final MarshallingInfo<String> VERSIONLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VersionLabel").build();

    private static final AwsElasticBeanstalkEnvironmentDetailsMarshaller instance = new AwsElasticBeanstalkEnvironmentDetailsMarshaller();

    public static AwsElasticBeanstalkEnvironmentDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElasticBeanstalkEnvironmentDetails awsElasticBeanstalkEnvironmentDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsElasticBeanstalkEnvironmentDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getCname(), CNAME_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getDateUpdated(), DATEUPDATED_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getEndpointUrl(), ENDPOINTURL_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getEnvironmentArn(), ENVIRONMENTARN_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getEnvironmentLinks(), ENVIRONMENTLINKS_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getEnvironmentName(), ENVIRONMENTNAME_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getOptionSettings(), OPTIONSETTINGS_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getPlatformArn(), PLATFORMARN_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getSolutionStackName(), SOLUTIONSTACKNAME_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getTier(), TIER_BINDING);
            protocolMarshaller.marshall(awsElasticBeanstalkEnvironmentDetails.getVersionLabel(), VERSIONLABEL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
