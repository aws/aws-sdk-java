/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCampaignRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCampaignRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> SIGNALCATALOGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signalCatalogArn").build();
    private static final MarshallingInfo<String> TARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("targetArn").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXPIRYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiryTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> POSTTRIGGERCOLLECTIONDURATION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postTriggerCollectionDuration").build();
    private static final MarshallingInfo<String> DIAGNOSTICSMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("diagnosticsMode").build();
    private static final MarshallingInfo<String> SPOOLINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spoolingMode").build();
    private static final MarshallingInfo<String> COMPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("compression").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("priority").build();
    private static final MarshallingInfo<List> SIGNALSTOCOLLECT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signalsToCollect").build();
    private static final MarshallingInfo<StructuredPojo> COLLECTIONSCHEME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectionScheme").build();
    private static final MarshallingInfo<List> DATAEXTRADIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataExtraDimensions").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateCampaignRequestMarshaller instance = new CreateCampaignRequestMarshaller();

    public static CreateCampaignRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCampaignRequest createCampaignRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCampaignRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCampaignRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getSignalCatalogArn(), SIGNALCATALOGARN_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getTargetArn(), TARGETARN_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getExpiryTime(), EXPIRYTIME_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getPostTriggerCollectionDuration(), POSTTRIGGERCOLLECTIONDURATION_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getDiagnosticsMode(), DIAGNOSTICSMODE_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getSpoolingMode(), SPOOLINGMODE_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getCompression(), COMPRESSION_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getSignalsToCollect(), SIGNALSTOCOLLECT_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getCollectionScheme(), COLLECTIONSCHEME_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getDataExtraDimensions(), DATAEXTRADIMENSIONS_BINDING);
            protocolMarshaller.marshall(createCampaignRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
