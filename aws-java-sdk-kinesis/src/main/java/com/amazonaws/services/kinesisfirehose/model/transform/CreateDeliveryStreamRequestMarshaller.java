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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDeliveryStreamRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDeliveryStreamRequestMarshaller {

    private static final MarshallingInfo<String> DELIVERYSTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStreamName").build();
    private static final MarshallingInfo<String> DELIVERYSTREAMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryStreamType").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMSOURCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamSourceConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> S3DESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DestinationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> EXTENDEDS3DESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedS3DestinationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTDESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftDestinationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICSEARCHDESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticsearchDestinationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SPLUNKDESTINATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SplunkDestinationConfiguration").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateDeliveryStreamRequestMarshaller instance = new CreateDeliveryStreamRequestMarshaller();

    public static CreateDeliveryStreamRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDeliveryStreamRequest createDeliveryStreamRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDeliveryStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDeliveryStreamRequest.getDeliveryStreamName(), DELIVERYSTREAMNAME_BINDING);
            protocolMarshaller.marshall(createDeliveryStreamRequest.getDeliveryStreamType(), DELIVERYSTREAMTYPE_BINDING);
            protocolMarshaller.marshall(createDeliveryStreamRequest.getKinesisStreamSourceConfiguration(), KINESISSTREAMSOURCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeliveryStreamRequest.getS3DestinationConfiguration(), S3DESTINATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeliveryStreamRequest.getExtendedS3DestinationConfiguration(), EXTENDEDS3DESTINATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeliveryStreamRequest.getRedshiftDestinationConfiguration(), REDSHIFTDESTINATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeliveryStreamRequest.getElasticsearchDestinationConfiguration(), ELASTICSEARCHDESTINATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeliveryStreamRequest.getSplunkDestinationConfiguration(), SPLUNKDESTINATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDeliveryStreamRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
