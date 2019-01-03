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
package com.amazonaws.services.kinesisfirehose.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DestinationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DestinationDescriptionMarshaller {

    private static final MarshallingInfo<String> DESTINATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationId").build();
    private static final MarshallingInfo<StructuredPojo> S3DESTINATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DestinationDescription").build();
    private static final MarshallingInfo<StructuredPojo> EXTENDEDS3DESTINATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedS3DestinationDescription").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTDESTINATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftDestinationDescription").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICSEARCHDESTINATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticsearchDestinationDescription").build();
    private static final MarshallingInfo<StructuredPojo> SPLUNKDESTINATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SplunkDestinationDescription").build();

    private static final DestinationDescriptionMarshaller instance = new DestinationDescriptionMarshaller();

    public static DestinationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DestinationDescription destinationDescription, ProtocolMarshaller protocolMarshaller) {

        if (destinationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(destinationDescription.getDestinationId(), DESTINATIONID_BINDING);
            protocolMarshaller.marshall(destinationDescription.getS3DestinationDescription(), S3DESTINATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(destinationDescription.getExtendedS3DestinationDescription(), EXTENDEDS3DESTINATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(destinationDescription.getRedshiftDestinationDescription(), REDSHIFTDESTINATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(destinationDescription.getElasticsearchDestinationDescription(), ELASTICSEARCHDESTINATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(destinationDescription.getSplunkDestinationDescription(), SPLUNKDESTINATIONDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
