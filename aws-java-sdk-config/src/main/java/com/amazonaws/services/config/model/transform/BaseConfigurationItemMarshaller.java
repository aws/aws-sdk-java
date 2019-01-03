/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BaseConfigurationItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BaseConfigurationItemMarshaller {

    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<java.util.Date> CONFIGURATIONITEMCAPTURETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationItemCaptureTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CONFIGURATIONITEMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationItemStatus").build();
    private static final MarshallingInfo<String> CONFIGURATIONSTATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationStateId").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceId").build();
    private static final MarshallingInfo<String> RESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceName").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsRegion").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZone").build();
    private static final MarshallingInfo<java.util.Date> RESOURCECREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceCreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<Map> SUPPLEMENTARYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supplementaryConfiguration").build();

    private static final BaseConfigurationItemMarshaller instance = new BaseConfigurationItemMarshaller();

    public static BaseConfigurationItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BaseConfigurationItem baseConfigurationItem, ProtocolMarshaller protocolMarshaller) {

        if (baseConfigurationItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(baseConfigurationItem.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getConfigurationItemCaptureTime(), CONFIGURATIONITEMCAPTURETIME_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getConfigurationItemStatus(), CONFIGURATIONITEMSTATUS_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getConfigurationStateId(), CONFIGURATIONSTATEID_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getResourceName(), RESOURCENAME_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getAwsRegion(), AWSREGION_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getResourceCreationTime(), RESOURCECREATIONTIME_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(baseConfigurationItem.getSupplementaryConfiguration(), SUPPLEMENTARYCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
