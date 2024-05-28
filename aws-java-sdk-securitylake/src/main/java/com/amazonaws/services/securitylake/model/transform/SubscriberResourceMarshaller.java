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
package com.amazonaws.services.securitylake.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubscriberResourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubscriberResourceMarshaller {

    private static final MarshallingInfo<List> ACCESSTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accessTypes").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> RESOURCESHAREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceShareArn").build();
    private static final MarshallingInfo<String> RESOURCESHARENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceShareName").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> S3BUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketArn").build();
    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sources").build();
    private static final MarshallingInfo<String> SUBSCRIBERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberArn").build();
    private static final MarshallingInfo<String> SUBSCRIBERDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberDescription").build();
    private static final MarshallingInfo<String> SUBSCRIBERENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberEndpoint").build();
    private static final MarshallingInfo<String> SUBSCRIBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberId").build();
    private static final MarshallingInfo<StructuredPojo> SUBSCRIBERIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberIdentity").build();
    private static final MarshallingInfo<String> SUBSCRIBERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberName").build();
    private static final MarshallingInfo<String> SUBSCRIBERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriberStatus").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();

    private static final SubscriberResourceMarshaller instance = new SubscriberResourceMarshaller();

    public static SubscriberResourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubscriberResource subscriberResource, ProtocolMarshaller protocolMarshaller) {

        if (subscriberResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subscriberResource.getAccessTypes(), ACCESSTYPES_BINDING);
            protocolMarshaller.marshall(subscriberResource.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(subscriberResource.getResourceShareArn(), RESOURCESHAREARN_BINDING);
            protocolMarshaller.marshall(subscriberResource.getResourceShareName(), RESOURCESHARENAME_BINDING);
            protocolMarshaller.marshall(subscriberResource.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(subscriberResource.getS3BucketArn(), S3BUCKETARN_BINDING);
            protocolMarshaller.marshall(subscriberResource.getSources(), SOURCES_BINDING);
            protocolMarshaller.marshall(subscriberResource.getSubscriberArn(), SUBSCRIBERARN_BINDING);
            protocolMarshaller.marshall(subscriberResource.getSubscriberDescription(), SUBSCRIBERDESCRIPTION_BINDING);
            protocolMarshaller.marshall(subscriberResource.getSubscriberEndpoint(), SUBSCRIBERENDPOINT_BINDING);
            protocolMarshaller.marshall(subscriberResource.getSubscriberId(), SUBSCRIBERID_BINDING);
            protocolMarshaller.marshall(subscriberResource.getSubscriberIdentity(), SUBSCRIBERIDENTITY_BINDING);
            protocolMarshaller.marshall(subscriberResource.getSubscriberName(), SUBSCRIBERNAME_BINDING);
            protocolMarshaller.marshall(subscriberResource.getSubscriberStatus(), SUBSCRIBERSTATUS_BINDING);
            protocolMarshaller.marshall(subscriberResource.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
