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
package com.amazonaws.services.kinesisvideo.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideo.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetImagesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetImagesRequestMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();
    private static final MarshallingInfo<String> IMAGESELECTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageSelectorType").build();
    private static final MarshallingInfo<java.util.Date> STARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> SAMPLINGINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SamplingInterval").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<Map> FORMATCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FormatConfig").build();
    private static final MarshallingInfo<Integer> WIDTHPIXELS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WidthPixels").build();
    private static final MarshallingInfo<Integer> HEIGHTPIXELS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeightPixels").build();
    private static final MarshallingInfo<Long> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final GetImagesRequestMarshaller instance = new GetImagesRequestMarshaller();

    public static GetImagesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetImagesRequest getImagesRequest, ProtocolMarshaller protocolMarshaller) {

        if (getImagesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getImagesRequest.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getImageSelectorType(), IMAGESELECTORTYPE_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getStartTimestamp(), STARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getEndTimestamp(), ENDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getSamplingInterval(), SAMPLINGINTERVAL_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getFormatConfig(), FORMATCONFIG_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getWidthPixels(), WIDTHPIXELS_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getHeightPixels(), HEIGHTPIXELS_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getImagesRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
