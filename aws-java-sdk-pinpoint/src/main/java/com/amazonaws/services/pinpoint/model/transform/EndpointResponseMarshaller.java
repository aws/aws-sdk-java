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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EndpointResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EndpointResponseMarshaller {

    private static final MarshallingInfo<String> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address").build();
    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();
    private static final MarshallingInfo<String> CHANNELTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelType").build();
    private static final MarshallingInfo<String> COHORTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CohortId").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<StructuredPojo> DEMOGRAPHIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Demographic").build();
    private static final MarshallingInfo<String> EFFECTIVEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EffectiveDate").build();
    private static final MarshallingInfo<String> ENDPOINTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointStatus").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Location").build();
    private static final MarshallingInfo<Map> METRICS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metrics").build();
    private static final MarshallingInfo<String> OPTOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OptOut").build();
    private static final MarshallingInfo<String> REQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RequestId").build();
    private static final MarshallingInfo<StructuredPojo> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("User").build();

    private static final EndpointResponseMarshaller instance = new EndpointResponseMarshaller();

    public static EndpointResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EndpointResponse endpointResponse, ProtocolMarshaller protocolMarshaller) {

        if (endpointResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(endpointResponse.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(endpointResponse.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(endpointResponse.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(endpointResponse.getChannelType(), CHANNELTYPE_BINDING);
            protocolMarshaller.marshall(endpointResponse.getCohortId(), COHORTID_BINDING);
            protocolMarshaller.marshall(endpointResponse.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(endpointResponse.getDemographic(), DEMOGRAPHIC_BINDING);
            protocolMarshaller.marshall(endpointResponse.getEffectiveDate(), EFFECTIVEDATE_BINDING);
            protocolMarshaller.marshall(endpointResponse.getEndpointStatus(), ENDPOINTSTATUS_BINDING);
            protocolMarshaller.marshall(endpointResponse.getId(), ID_BINDING);
            protocolMarshaller.marshall(endpointResponse.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(endpointResponse.getMetrics(), METRICS_BINDING);
            protocolMarshaller.marshall(endpointResponse.getOptOut(), OPTOUT_BINDING);
            protocolMarshaller.marshall(endpointResponse.getRequestId(), REQUESTID_BINDING);
            protocolMarshaller.marshall(endpointResponse.getUser(), USER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
