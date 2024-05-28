/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.signer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.signer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetRevocationStatusRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetRevocationStatusRequestMarshaller {

    private static final MarshallingInfo<java.util.Date> SIGNATURETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("signatureTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> PLATFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("platformId").build();
    private static final MarshallingInfo<String> PROFILEVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("profileVersionArn").build();
    private static final MarshallingInfo<String> JOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("jobArn").build();
    private static final MarshallingInfo<List> CERTIFICATEHASHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("certificateHashes").build();

    private static final GetRevocationStatusRequestMarshaller instance = new GetRevocationStatusRequestMarshaller();

    public static GetRevocationStatusRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetRevocationStatusRequest getRevocationStatusRequest, ProtocolMarshaller protocolMarshaller) {

        if (getRevocationStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getRevocationStatusRequest.getSignatureTimestamp(), SIGNATURETIMESTAMP_BINDING);
            protocolMarshaller.marshall(getRevocationStatusRequest.getPlatformId(), PLATFORMID_BINDING);
            protocolMarshaller.marshall(getRevocationStatusRequest.getProfileVersionArn(), PROFILEVERSIONARN_BINDING);
            protocolMarshaller.marshall(getRevocationStatusRequest.getJobArn(), JOBARN_BINDING);
            protocolMarshaller.marshall(getRevocationStatusRequest.getCertificateHashes(), CERTIFICATEHASHES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
