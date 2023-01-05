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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RowLevelPermissionTagRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RowLevelPermissionTagRuleMarshaller {

    private static final MarshallingInfo<String> TAGKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagKey").build();
    private static final MarshallingInfo<String> COLUMNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnName").build();
    private static final MarshallingInfo<String> TAGMULTIVALUEDELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagMultiValueDelimiter").build();
    private static final MarshallingInfo<String> MATCHALLVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MatchAllValue").build();

    private static final RowLevelPermissionTagRuleMarshaller instance = new RowLevelPermissionTagRuleMarshaller();

    public static RowLevelPermissionTagRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RowLevelPermissionTagRule rowLevelPermissionTagRule, ProtocolMarshaller protocolMarshaller) {

        if (rowLevelPermissionTagRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rowLevelPermissionTagRule.getTagKey(), TAGKEY_BINDING);
            protocolMarshaller.marshall(rowLevelPermissionTagRule.getColumnName(), COLUMNNAME_BINDING);
            protocolMarshaller.marshall(rowLevelPermissionTagRule.getTagMultiValueDelimiter(), TAGMULTIVALUEDELIMITER_BINDING);
            protocolMarshaller.marshall(rowLevelPermissionTagRule.getMatchAllValue(), MATCHALLVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
