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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PatchMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PatchMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<java.util.Date> RELEASEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReleaseDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CONTENTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentUrl").build();
    private static final MarshallingInfo<String> VENDOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Vendor").build();
    private static final MarshallingInfo<String> PRODUCTFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductFamily").build();
    private static final MarshallingInfo<String> PRODUCT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Product").build();
    private static final MarshallingInfo<String> CLASSIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Classification").build();
    private static final MarshallingInfo<String> MSRCSEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MsrcSeverity").build();
    private static final MarshallingInfo<String> KBNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KbNumber").build();
    private static final MarshallingInfo<String> MSRCNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MsrcNumber").build();
    private static final MarshallingInfo<String> LANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Language").build();

    private static final PatchMarshaller instance = new PatchMarshaller();

    public static PatchMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Patch patch, ProtocolMarshaller protocolMarshaller) {

        if (patch == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(patch.getId(), ID_BINDING);
            protocolMarshaller.marshall(patch.getReleaseDate(), RELEASEDATE_BINDING);
            protocolMarshaller.marshall(patch.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(patch.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(patch.getContentUrl(), CONTENTURL_BINDING);
            protocolMarshaller.marshall(patch.getVendor(), VENDOR_BINDING);
            protocolMarshaller.marshall(patch.getProductFamily(), PRODUCTFAMILY_BINDING);
            protocolMarshaller.marshall(patch.getProduct(), PRODUCT_BINDING);
            protocolMarshaller.marshall(patch.getClassification(), CLASSIFICATION_BINDING);
            protocolMarshaller.marshall(patch.getMsrcSeverity(), MSRCSEVERITY_BINDING);
            protocolMarshaller.marshall(patch.getKbNumber(), KBNUMBER_BINDING);
            protocolMarshaller.marshall(patch.getMsrcNumber(), MSRCNUMBER_BINDING);
            protocolMarshaller.marshall(patch.getLanguage(), LANGUAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
