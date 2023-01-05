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
package com.amazonaws.services.networkmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RouteAnalysisMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RouteAnalysisMarshaller {

    private static final MarshallingInfo<String> GLOBALNETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalNetworkId").build();
    private static final MarshallingInfo<String> OWNERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerAccountId").build();
    private static final MarshallingInfo<String> ROUTEANALYSISID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteAnalysisId").build();
    private static final MarshallingInfo<java.util.Date> STARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Source").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();
    private static final MarshallingInfo<Boolean> INCLUDERETURNPATH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeReturnPath").build();
    private static final MarshallingInfo<Boolean> USEMIDDLEBOXES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseMiddleboxes").build();
    private static final MarshallingInfo<StructuredPojo> FORWARDPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForwardPath").build();
    private static final MarshallingInfo<StructuredPojo> RETURNPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReturnPath").build();

    private static final RouteAnalysisMarshaller instance = new RouteAnalysisMarshaller();

    public static RouteAnalysisMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RouteAnalysis routeAnalysis, ProtocolMarshaller protocolMarshaller) {

        if (routeAnalysis == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routeAnalysis.getGlobalNetworkId(), GLOBALNETWORKID_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getOwnerAccountId(), OWNERACCOUNTID_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getRouteAnalysisId(), ROUTEANALYSISID_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getStartTimestamp(), STARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getIncludeReturnPath(), INCLUDERETURNPATH_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getUseMiddleboxes(), USEMIDDLEBOXES_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getForwardPath(), FORWARDPATH_BINDING);
            protocolMarshaller.marshall(routeAnalysis.getReturnPath(), RETURNPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
