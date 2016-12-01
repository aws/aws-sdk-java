/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AccountLimitMarshaller
 */
public class AccountLimitJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AccountLimit accountLimit, StructuredJsonGenerator jsonGenerator) {

        if (accountLimit == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (accountLimit.getTotalCodeSize() != null) {
                jsonGenerator.writeFieldName("TotalCodeSize").writeValue(accountLimit.getTotalCodeSize());
            }
            if (accountLimit.getCodeSizeUnzipped() != null) {
                jsonGenerator.writeFieldName("CodeSizeUnzipped").writeValue(accountLimit.getCodeSizeUnzipped());
            }
            if (accountLimit.getCodeSizeZipped() != null) {
                jsonGenerator.writeFieldName("CodeSizeZipped").writeValue(accountLimit.getCodeSizeZipped());
            }
            if (accountLimit.getConcurrentExecutions() != null) {
                jsonGenerator.writeFieldName("ConcurrentExecutions").writeValue(accountLimit.getConcurrentExecutions());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AccountLimitJsonMarshaller instance;

    public static AccountLimitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccountLimitJsonMarshaller();
        return instance;
    }

}
