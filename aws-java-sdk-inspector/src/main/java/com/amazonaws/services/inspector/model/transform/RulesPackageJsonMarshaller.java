/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.protocol.json.*;

/**
 * RulesPackageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RulesPackageJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RulesPackage rulesPackage, StructuredJsonGenerator jsonGenerator) {

        if (rulesPackage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (rulesPackage.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(rulesPackage.getArn());
            }
            if (rulesPackage.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(rulesPackage.getName());
            }
            if (rulesPackage.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(rulesPackage.getVersion());
            }
            if (rulesPackage.getProvider() != null) {
                jsonGenerator.writeFieldName("provider").writeValue(rulesPackage.getProvider());
            }
            if (rulesPackage.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(rulesPackage.getDescription());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RulesPackageJsonMarshaller instance;

    public static RulesPackageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RulesPackageJsonMarshaller();
        return instance;
    }

}
