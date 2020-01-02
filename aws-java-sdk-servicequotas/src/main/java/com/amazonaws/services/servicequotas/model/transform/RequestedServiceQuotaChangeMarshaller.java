/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicequotas.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicequotas.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RequestedServiceQuotaChangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RequestedServiceQuotaChangeMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> CASEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CaseId").build();
    private static final MarshallingInfo<String> SERVICECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCode").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceName").build();
    private static final MarshallingInfo<String> QUOTACODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuotaCode").build();
    private static final MarshallingInfo<String> QUOTANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuotaName").build();
    private static final MarshallingInfo<Double> DESIREDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredValue").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Created").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REQUESTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Requester").build();
    private static final MarshallingInfo<String> QUOTAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuotaArn").build();
    private static final MarshallingInfo<Boolean> GLOBALQUOTA_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalQuota").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();

    private static final RequestedServiceQuotaChangeMarshaller instance = new RequestedServiceQuotaChangeMarshaller();

    public static RequestedServiceQuotaChangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RequestedServiceQuotaChange requestedServiceQuotaChange, ProtocolMarshaller protocolMarshaller) {

        if (requestedServiceQuotaChange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(requestedServiceQuotaChange.getId(), ID_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getCaseId(), CASEID_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getQuotaCode(), QUOTACODE_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getQuotaName(), QUOTANAME_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getDesiredValue(), DESIREDVALUE_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getRequester(), REQUESTER_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getQuotaArn(), QUOTAARN_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getGlobalQuota(), GLOBALQUOTA_BINDING);
            protocolMarshaller.marshall(requestedServiceQuotaChange.getUnit(), UNIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
