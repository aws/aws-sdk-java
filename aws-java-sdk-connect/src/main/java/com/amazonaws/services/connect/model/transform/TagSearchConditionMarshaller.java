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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TagSearchConditionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TagSearchConditionMarshaller {

    private static final MarshallingInfo<String> TAGKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tagKey").build();
    private static final MarshallingInfo<String> TAGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tagValue").build();
    private static final MarshallingInfo<String> TAGKEYCOMPARISONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tagKeyComparisonType").build();
    private static final MarshallingInfo<String> TAGVALUECOMPARISONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tagValueComparisonType").build();

    private static final TagSearchConditionMarshaller instance = new TagSearchConditionMarshaller();

    public static TagSearchConditionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TagSearchCondition tagSearchCondition, ProtocolMarshaller protocolMarshaller) {

        if (tagSearchCondition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tagSearchCondition.getTagKey(), TAGKEY_BINDING);
            protocolMarshaller.marshall(tagSearchCondition.getTagValue(), TAGVALUE_BINDING);
            protocolMarshaller.marshall(tagSearchCondition.getTagKeyComparisonType(), TAGKEYCOMPARISONTYPE_BINDING);
            protocolMarshaller.marshall(tagSearchCondition.getTagValueComparisonType(), TAGVALUECOMPARISONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
