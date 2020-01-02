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
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrganizationConformancePackMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationConformancePackMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONCONFORMANCEPACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationConformancePackName").build();
    private static final MarshallingInfo<String> ORGANIZATIONCONFORMANCEPACKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationConformancePackArn").build();
    private static final MarshallingInfo<String> DELIVERYS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryS3Bucket").build();
    private static final MarshallingInfo<String> DELIVERYS3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryS3KeyPrefix").build();
    private static final MarshallingInfo<List> CONFORMANCEPACKINPUTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackInputParameters").build();
    private static final MarshallingInfo<List> EXCLUDEDACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludedAccounts").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTime").timestampFormat("unixTimestamp").build();

    private static final OrganizationConformancePackMarshaller instance = new OrganizationConformancePackMarshaller();

    public static OrganizationConformancePackMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationConformancePack organizationConformancePack, ProtocolMarshaller protocolMarshaller) {

        if (organizationConformancePack == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationConformancePack.getOrganizationConformancePackName(), ORGANIZATIONCONFORMANCEPACKNAME_BINDING);
            protocolMarshaller.marshall(organizationConformancePack.getOrganizationConformancePackArn(), ORGANIZATIONCONFORMANCEPACKARN_BINDING);
            protocolMarshaller.marshall(organizationConformancePack.getDeliveryS3Bucket(), DELIVERYS3BUCKET_BINDING);
            protocolMarshaller.marshall(organizationConformancePack.getDeliveryS3KeyPrefix(), DELIVERYS3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(organizationConformancePack.getConformancePackInputParameters(), CONFORMANCEPACKINPUTPARAMETERS_BINDING);
            protocolMarshaller.marshall(organizationConformancePack.getExcludedAccounts(), EXCLUDEDACCOUNTS_BINDING);
            protocolMarshaller.marshall(organizationConformancePack.getLastUpdateTime(), LASTUPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
