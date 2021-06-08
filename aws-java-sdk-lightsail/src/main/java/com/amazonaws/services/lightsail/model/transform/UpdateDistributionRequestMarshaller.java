/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDistributionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDistributionRequestMarshaller {

    private static final MarshallingInfo<String> DISTRIBUTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("distributionName").build();
    private static final MarshallingInfo<StructuredPojo> ORIGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("origin").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTCACHEBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultCacheBehavior").build();
    private static final MarshallingInfo<StructuredPojo> CACHEBEHAVIORSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheBehaviorSettings").build();
    private static final MarshallingInfo<List> CACHEBEHAVIORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheBehaviors").build();
    private static final MarshallingInfo<Boolean> ISENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isEnabled").build();

    private static final UpdateDistributionRequestMarshaller instance = new UpdateDistributionRequestMarshaller();

    public static UpdateDistributionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDistributionRequest updateDistributionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDistributionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDistributionRequest.getDistributionName(), DISTRIBUTIONNAME_BINDING);
            protocolMarshaller.marshall(updateDistributionRequest.getOrigin(), ORIGIN_BINDING);
            protocolMarshaller.marshall(updateDistributionRequest.getDefaultCacheBehavior(), DEFAULTCACHEBEHAVIOR_BINDING);
            protocolMarshaller.marshall(updateDistributionRequest.getCacheBehaviorSettings(), CACHEBEHAVIORSETTINGS_BINDING);
            protocolMarshaller.marshall(updateDistributionRequest.getCacheBehaviors(), CACHEBEHAVIORS_BINDING);
            protocolMarshaller.marshall(updateDistributionRequest.getIsEnabled(), ISENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
