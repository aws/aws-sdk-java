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
package com.amazonaws.services.marketplacecommerceanalytics.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplacecommerceanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GenerateDataSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GenerateDataSetRequestMarshaller {

    private static final MarshallingInfo<String> DATASETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSetType").build();
    private static final MarshallingInfo<java.util.Date> DATASETPUBLICATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSetPublicationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ROLENAMEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("roleNameArn").build();
    private static final MarshallingInfo<String> DESTINATIONS3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationS3BucketName").build();
    private static final MarshallingInfo<String> DESTINATIONS3PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationS3Prefix").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snsTopicArn").build();
    private static final MarshallingInfo<Map> CUSTOMERDEFINEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerDefinedValues").build();

    private static final GenerateDataSetRequestMarshaller instance = new GenerateDataSetRequestMarshaller();

    public static GenerateDataSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GenerateDataSetRequest generateDataSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (generateDataSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generateDataSetRequest.getDataSetType(), DATASETTYPE_BINDING);
            protocolMarshaller.marshall(generateDataSetRequest.getDataSetPublicationDate(), DATASETPUBLICATIONDATE_BINDING);
            protocolMarshaller.marshall(generateDataSetRequest.getRoleNameArn(), ROLENAMEARN_BINDING);
            protocolMarshaller.marshall(generateDataSetRequest.getDestinationS3BucketName(), DESTINATIONS3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(generateDataSetRequest.getDestinationS3Prefix(), DESTINATIONS3PREFIX_BINDING);
            protocolMarshaller.marshall(generateDataSetRequest.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(generateDataSetRequest.getCustomerDefinedValues(), CUSTOMERDEFINEDVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
