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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VpcLinkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VpcLinkMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroupIds").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetIds").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> VPCLINKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vpcLinkId").build();
    private static final MarshallingInfo<String> VPCLINKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcLinkStatus").build();
    private static final MarshallingInfo<String> VPCLINKSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcLinkStatusMessage").build();
    private static final MarshallingInfo<String> VPCLINKVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcLinkVersion").build();

    private static final VpcLinkMarshaller instance = new VpcLinkMarshaller();

    public static VpcLinkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VpcLink vpcLink, ProtocolMarshaller protocolMarshaller) {

        if (vpcLink == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vpcLink.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(vpcLink.getName(), NAME_BINDING);
            protocolMarshaller.marshall(vpcLink.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(vpcLink.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(vpcLink.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(vpcLink.getVpcLinkId(), VPCLINKID_BINDING);
            protocolMarshaller.marshall(vpcLink.getVpcLinkStatus(), VPCLINKSTATUS_BINDING);
            protocolMarshaller.marshall(vpcLink.getVpcLinkStatusMessage(), VPCLINKSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(vpcLink.getVpcLinkVersion(), VPCLINKVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
