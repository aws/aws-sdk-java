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
 * ServiceQuotaIncreaseRequestInTemplateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceQuotaIncreaseRequestInTemplateMarshaller {

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
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegion").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();
    private static final MarshallingInfo<Boolean> GLOBALQUOTA_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalQuota").build();

    private static final ServiceQuotaIncreaseRequestInTemplateMarshaller instance = new ServiceQuotaIncreaseRequestInTemplateMarshaller();

    public static ServiceQuotaIncreaseRequestInTemplateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceQuotaIncreaseRequestInTemplate serviceQuotaIncreaseRequestInTemplate, ProtocolMarshaller protocolMarshaller) {

        if (serviceQuotaIncreaseRequestInTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceQuotaIncreaseRequestInTemplate.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(serviceQuotaIncreaseRequestInTemplate.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(serviceQuotaIncreaseRequestInTemplate.getQuotaCode(), QUOTACODE_BINDING);
            protocolMarshaller.marshall(serviceQuotaIncreaseRequestInTemplate.getQuotaName(), QUOTANAME_BINDING);
            protocolMarshaller.marshall(serviceQuotaIncreaseRequestInTemplate.getDesiredValue(), DESIREDVALUE_BINDING);
            protocolMarshaller.marshall(serviceQuotaIncreaseRequestInTemplate.getAwsRegion(), AWSREGION_BINDING);
            protocolMarshaller.marshall(serviceQuotaIncreaseRequestInTemplate.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(serviceQuotaIncreaseRequestInTemplate.getGlobalQuota(), GLOBALQUOTA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
