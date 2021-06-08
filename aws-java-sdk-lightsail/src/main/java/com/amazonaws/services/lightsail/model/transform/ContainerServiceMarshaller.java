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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerServiceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerServiceMarshaller {

    private static final MarshallingInfo<String> CONTAINERSERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerServiceName").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("location").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> POWER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("power").build();
    private static final MarshallingInfo<String> POWERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("powerId").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<StructuredPojo> STATEDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateDetail").build();
    private static final MarshallingInfo<Integer> SCALE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scale").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTDEPLOYMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentDeployment").build();
    private static final MarshallingInfo<StructuredPojo> NEXTDEPLOYMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nextDeployment").build();
    private static final MarshallingInfo<Boolean> ISDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isDisabled").build();
    private static final MarshallingInfo<String> PRINCIPALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("principalArn").build();
    private static final MarshallingInfo<String> PRIVATEDOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateDomainName").build();
    private static final MarshallingInfo<Map> PUBLICDOMAINNAMES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicDomainNames").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("url").build();

    private static final ContainerServiceMarshaller instance = new ContainerServiceMarshaller();

    public static ContainerServiceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerService containerService, ProtocolMarshaller protocolMarshaller) {

        if (containerService == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerService.getContainerServiceName(), CONTAINERSERVICENAME_BINDING);
            protocolMarshaller.marshall(containerService.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(containerService.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(containerService.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(containerService.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(containerService.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(containerService.getPower(), POWER_BINDING);
            protocolMarshaller.marshall(containerService.getPowerId(), POWERID_BINDING);
            protocolMarshaller.marshall(containerService.getState(), STATE_BINDING);
            protocolMarshaller.marshall(containerService.getStateDetail(), STATEDETAIL_BINDING);
            protocolMarshaller.marshall(containerService.getScale(), SCALE_BINDING);
            protocolMarshaller.marshall(containerService.getCurrentDeployment(), CURRENTDEPLOYMENT_BINDING);
            protocolMarshaller.marshall(containerService.getNextDeployment(), NEXTDEPLOYMENT_BINDING);
            protocolMarshaller.marshall(containerService.getIsDisabled(), ISDISABLED_BINDING);
            protocolMarshaller.marshall(containerService.getPrincipalArn(), PRINCIPALARN_BINDING);
            protocolMarshaller.marshall(containerService.getPrivateDomainName(), PRIVATEDOMAINNAME_BINDING);
            protocolMarshaller.marshall(containerService.getPublicDomainNames(), PUBLICDOMAINNAMES_BINDING);
            protocolMarshaller.marshall(containerService.getUrl(), URL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
