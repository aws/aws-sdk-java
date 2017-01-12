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
package com.amazonaws.services.cognitoidentity.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidentity.model.*;

import com.amazonaws.protocol.json.*;

/**
 * MappingRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MappingRuleJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MappingRule mappingRule, StructuredJsonGenerator jsonGenerator) {

        if (mappingRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (mappingRule.getClaim() != null) {
                jsonGenerator.writeFieldName("Claim").writeValue(mappingRule.getClaim());
            }
            if (mappingRule.getMatchType() != null) {
                jsonGenerator.writeFieldName("MatchType").writeValue(mappingRule.getMatchType());
            }
            if (mappingRule.getValue() != null) {
                jsonGenerator.writeFieldName("Value").writeValue(mappingRule.getValue());
            }
            if (mappingRule.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(mappingRule.getRoleARN());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MappingRuleJsonMarshaller instance;

    public static MappingRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MappingRuleJsonMarshaller();
        return instance;
    }

}
