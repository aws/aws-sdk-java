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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RouterTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RouterTypeMarshaller {

    private static final MarshallingInfo<String> VENDOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vendor").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<String> SOFTWARE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("software").build();
    private static final MarshallingInfo<String> XSLTTEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xsltTemplateName").build();
    private static final MarshallingInfo<String> XSLTTEMPLATENAMEFORMACSEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("xsltTemplateNameForMacSec").build();
    private static final MarshallingInfo<String> ROUTERTYPEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("routerTypeIdentifier").build();

    private static final RouterTypeMarshaller instance = new RouterTypeMarshaller();

    public static RouterTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RouterType routerType, ProtocolMarshaller protocolMarshaller) {

        if (routerType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routerType.getVendor(), VENDOR_BINDING);
            protocolMarshaller.marshall(routerType.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(routerType.getSoftware(), SOFTWARE_BINDING);
            protocolMarshaller.marshall(routerType.getXsltTemplateName(), XSLTTEMPLATENAME_BINDING);
            protocolMarshaller.marshall(routerType.getXsltTemplateNameForMacSec(), XSLTTEMPLATENAMEFORMACSEC_BINDING);
            protocolMarshaller.marshall(routerType.getRouterTypeIdentifier(), ROUTERTYPEIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
