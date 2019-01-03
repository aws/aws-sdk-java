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
package com.amazonaws.services.clouddirectory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ObjectAttributeActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ObjectAttributeActionMarshaller {

    private static final MarshallingInfo<String> OBJECTATTRIBUTEACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectAttributeActionType").build();
    private static final MarshallingInfo<StructuredPojo> OBJECTATTRIBUTEUPDATEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectAttributeUpdateValue").build();

    private static final ObjectAttributeActionMarshaller instance = new ObjectAttributeActionMarshaller();

    public static ObjectAttributeActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ObjectAttributeAction objectAttributeAction, ProtocolMarshaller protocolMarshaller) {

        if (objectAttributeAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(objectAttributeAction.getObjectAttributeActionType(), OBJECTATTRIBUTEACTIONTYPE_BINDING);
            protocolMarshaller.marshall(objectAttributeAction.getObjectAttributeUpdateValue(), OBJECTATTRIBUTEUPDATEVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
