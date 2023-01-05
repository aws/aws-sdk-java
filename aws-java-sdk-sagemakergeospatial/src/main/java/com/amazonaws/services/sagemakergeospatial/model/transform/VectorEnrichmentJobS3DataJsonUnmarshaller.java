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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VectorEnrichmentJobS3Data JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VectorEnrichmentJobS3DataJsonUnmarshaller implements Unmarshaller<VectorEnrichmentJobS3Data, JsonUnmarshallerContext> {

    public VectorEnrichmentJobS3Data unmarshall(JsonUnmarshallerContext context) throws Exception {
        VectorEnrichmentJobS3Data vectorEnrichmentJobS3Data = new VectorEnrichmentJobS3Data();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    vectorEnrichmentJobS3Data.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Uri", targetDepth)) {
                    context.nextToken();
                    vectorEnrichmentJobS3Data.setS3Uri(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return vectorEnrichmentJobS3Data;
    }

    private static VectorEnrichmentJobS3DataJsonUnmarshaller instance;

    public static VectorEnrichmentJobS3DataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VectorEnrichmentJobS3DataJsonUnmarshaller();
        return instance;
    }
}
