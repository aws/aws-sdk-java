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
package com.amazonaws.services.servicequotas.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicequotas.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteServiceQuotaIncreaseRequestFromTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteServiceQuotaIncreaseRequestFromTemplateRequestMarshaller {

    private static final MarshallingInfo<String> SERVICECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCode").build();
    private static final MarshallingInfo<String> QUOTACODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QuotaCode").build();
    private static final MarshallingInfo<String> AWSREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsRegion").build();

    private static final DeleteServiceQuotaIncreaseRequestFromTemplateRequestMarshaller instance = new DeleteServiceQuotaIncreaseRequestFromTemplateRequestMarshaller();

    public static DeleteServiceQuotaIncreaseRequestFromTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteServiceQuotaIncreaseRequestFromTemplateRequest deleteServiceQuotaIncreaseRequestFromTemplateRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (deleteServiceQuotaIncreaseRequestFromTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteServiceQuotaIncreaseRequestFromTemplateRequest.getServiceCode(), SERVICECODE_BINDING);
            protocolMarshaller.marshall(deleteServiceQuotaIncreaseRequestFromTemplateRequest.getQuotaCode(), QUOTACODE_BINDING);
            protocolMarshaller.marshall(deleteServiceQuotaIncreaseRequestFromTemplateRequest.getAwsRegion(), AWSREGION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
