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
package com.amazonaws.services.inspector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetExclusionsPreviewRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetExclusionsPreviewRequestMarshaller {

    private static final MarshallingInfo<String> ASSESSMENTTEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assessmentTemplateArn").build();
    private static final MarshallingInfo<String> PREVIEWTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("previewToken").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> LOCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("locale").build();

    private static final GetExclusionsPreviewRequestMarshaller instance = new GetExclusionsPreviewRequestMarshaller();

    public static GetExclusionsPreviewRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetExclusionsPreviewRequest getExclusionsPreviewRequest, ProtocolMarshaller protocolMarshaller) {

        if (getExclusionsPreviewRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getExclusionsPreviewRequest.getAssessmentTemplateArn(), ASSESSMENTTEMPLATEARN_BINDING);
            protocolMarshaller.marshall(getExclusionsPreviewRequest.getPreviewToken(), PREVIEWTOKEN_BINDING);
            protocolMarshaller.marshall(getExclusionsPreviewRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getExclusionsPreviewRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getExclusionsPreviewRequest.getLocale(), LOCALE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
