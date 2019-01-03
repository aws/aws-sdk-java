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
package com.amazonaws.services.directory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IpRouteInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IpRouteInfoMarshaller {

    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<String> CIDRIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CidrIp").build();
    private static final MarshallingInfo<String> IPROUTESTATUSMSG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IpRouteStatusMsg").build();
    private static final MarshallingInfo<java.util.Date> ADDEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IPROUTESTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IpRouteStatusReason").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();

    private static final IpRouteInfoMarshaller instance = new IpRouteInfoMarshaller();

    public static IpRouteInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IpRouteInfo ipRouteInfo, ProtocolMarshaller protocolMarshaller) {

        if (ipRouteInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ipRouteInfo.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(ipRouteInfo.getCidrIp(), CIDRIP_BINDING);
            protocolMarshaller.marshall(ipRouteInfo.getIpRouteStatusMsg(), IPROUTESTATUSMSG_BINDING);
            protocolMarshaller.marshall(ipRouteInfo.getAddedDateTime(), ADDEDDATETIME_BINDING);
            protocolMarshaller.marshall(ipRouteInfo.getIpRouteStatusReason(), IPROUTESTATUSREASON_BINDING);
            protocolMarshaller.marshall(ipRouteInfo.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
