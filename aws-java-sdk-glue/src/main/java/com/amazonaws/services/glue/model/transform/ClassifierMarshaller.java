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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClassifierMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClassifierMarshaller {

    private static final MarshallingInfo<StructuredPojo> GROKCLASSIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrokClassifier").build();
    private static final MarshallingInfo<StructuredPojo> XMLCLASSIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XMLClassifier").build();
    private static final MarshallingInfo<StructuredPojo> JSONCLASSIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JsonClassifier").build();
    private static final MarshallingInfo<StructuredPojo> CSVCLASSIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CsvClassifier").build();

    private static final ClassifierMarshaller instance = new ClassifierMarshaller();

    public static ClassifierMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Classifier classifier, ProtocolMarshaller protocolMarshaller) {

        if (classifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(classifier.getGrokClassifier(), GROKCLASSIFIER_BINDING);
            protocolMarshaller.marshall(classifier.getXMLClassifier(), XMLCLASSIFIER_BINDING);
            protocolMarshaller.marshall(classifier.getJsonClassifier(), JSONCLASSIFIER_BINDING);
            protocolMarshaller.marshall(classifier.getCsvClassifier(), CSVCLASSIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
