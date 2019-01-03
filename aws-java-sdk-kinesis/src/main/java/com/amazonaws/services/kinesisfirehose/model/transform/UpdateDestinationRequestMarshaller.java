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
 * UpdateDestinationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDestinationRequestMarshaller {

    private static final MarshallingInfo<String> DELIVERYSTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStreamName").build();
    private static final MarshallingInfo<String> CURRENTDELIVERYSTREAMVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentDeliveryStreamVersionId").build();
    private static final MarshallingInfo<String> DESTINATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationId").build();
    private static final MarshallingInfo<StructuredPojo> S3DESTINATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DestinationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> EXTENDEDS3DESTINATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedS3DestinationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTDESTINATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftDestinationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICSEARCHDESTINATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticsearchDestinationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> SPLUNKDESTINATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SplunkDestinationUpdate").build();

    private static final UpdateDestinationRequestMarshaller instance = new UpdateDestinationRequestMarshaller();

    public static UpdateDestinationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDestinationRequest updateDestinationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDestinationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDestinationRequest.getDeliveryStreamName(), DELIVERYSTREAMNAME_BINDING);
            protocolMarshaller.marshall(updateDestinationRequest.getCurrentDeliveryStreamVersionId(), CURRENTDELIVERYSTREAMVERSIONID_BINDING);
            protocolMarshaller.marshall(updateDestinationRequest.getDestinationId(), DESTINATIONID_BINDING);
            protocolMarshaller.marshall(updateDestinationRequest.getS3DestinationUpdate(), S3DESTINATIONUPDATE_BINDING);
            protocolMarshaller.marshall(updateDestinationRequest.getExtendedS3DestinationUpdate(), EXTENDEDS3DESTINATIONUPDATE_BINDING);
            protocolMarshaller.marshall(updateDestinationRequest.getRedshiftDestinationUpdate(), REDSHIFTDESTINATIONUPDATE_BINDING);
            protocolMarshaller.marshall(updateDestinationRequest.getElasticsearchDestinationUpdate(), ELASTICSEARCHDESTINATIONUPDATE_BINDING);
            protocolMarshaller.marshall(updateDestinationRequest.getSplunkDestinationUpdate(), SPLUNKDESTINATIONUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
