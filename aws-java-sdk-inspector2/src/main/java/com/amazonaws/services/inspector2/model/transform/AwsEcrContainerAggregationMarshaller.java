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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcrContainerAggregationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcrContainerAggregationMarshaller {

    private static final MarshallingInfo<List> ARCHITECTURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("architectures").build();
    private static final MarshallingInfo<List> IMAGESHAS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageShas").build();
    private static final MarshallingInfo<List> IMAGETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageTags").build();
    private static final MarshallingInfo<List> REPOSITORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("repositories").build();
    private static final MarshallingInfo<List> RESOURCEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceIds").build();
    private static final MarshallingInfo<String> SORTBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sortBy").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sortOrder").build();

    private static final AwsEcrContainerAggregationMarshaller instance = new AwsEcrContainerAggregationMarshaller();

    public static AwsEcrContainerAggregationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcrContainerAggregation awsEcrContainerAggregation, ProtocolMarshaller protocolMarshaller) {

        if (awsEcrContainerAggregation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcrContainerAggregation.getArchitectures(), ARCHITECTURES_BINDING);
            protocolMarshaller.marshall(awsEcrContainerAggregation.getImageShas(), IMAGESHAS_BINDING);
            protocolMarshaller.marshall(awsEcrContainerAggregation.getImageTags(), IMAGETAGS_BINDING);
            protocolMarshaller.marshall(awsEcrContainerAggregation.getRepositories(), REPOSITORIES_BINDING);
            protocolMarshaller.marshall(awsEcrContainerAggregation.getResourceIds(), RESOURCEIDS_BINDING);
            protocolMarshaller.marshall(awsEcrContainerAggregation.getSortBy(), SORTBY_BINDING);
            protocolMarshaller.marshall(awsEcrContainerAggregation.getSortOrder(), SORTORDER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
