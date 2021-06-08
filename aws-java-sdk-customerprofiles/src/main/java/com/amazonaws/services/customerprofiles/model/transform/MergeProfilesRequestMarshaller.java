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
package com.amazonaws.services.customerprofiles.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MergeProfilesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MergeProfilesRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> MAINPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MainProfileId").build();
    private static final MarshallingInfo<List> PROFILEIDSTOBEMERGED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileIdsToBeMerged").build();
    private static final MarshallingInfo<StructuredPojo> FIELDSOURCEPROFILEIDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldSourceProfileIds").build();

    private static final MergeProfilesRequestMarshaller instance = new MergeProfilesRequestMarshaller();

    public static MergeProfilesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MergeProfilesRequest mergeProfilesRequest, ProtocolMarshaller protocolMarshaller) {

        if (mergeProfilesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mergeProfilesRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(mergeProfilesRequest.getMainProfileId(), MAINPROFILEID_BINDING);
            protocolMarshaller.marshall(mergeProfilesRequest.getProfileIdsToBeMerged(), PROFILEIDSTOBEMERGED_BINDING);
            protocolMarshaller.marshall(mergeProfilesRequest.getFieldSourceProfileIds(), FIELDSOURCEPROFILEIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
