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
package com.amazonaws.services.mediapackage.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CmafPackageCreateOrUpdateParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafPackageCreateOrUpdateParametersJsonUnmarshaller implements Unmarshaller<CmafPackageCreateOrUpdateParameters, JsonUnmarshallerContext> {

    public CmafPackageCreateOrUpdateParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        CmafPackageCreateOrUpdateParameters cmafPackageCreateOrUpdateParameters = new CmafPackageCreateOrUpdateParameters();

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
                if (context.testExpression("encryption", targetDepth)) {
                    context.nextToken();
                    cmafPackageCreateOrUpdateParameters.setEncryption(CmafEncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hlsManifests", targetDepth)) {
                    context.nextToken();
                    cmafPackageCreateOrUpdateParameters.setHlsManifests(new ListUnmarshaller<HlsManifestCreateOrUpdateParameters>(
                            HlsManifestCreateOrUpdateParametersJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("segmentDurationSeconds", targetDepth)) {
                    context.nextToken();
                    cmafPackageCreateOrUpdateParameters.setSegmentDurationSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("segmentPrefix", targetDepth)) {
                    context.nextToken();
                    cmafPackageCreateOrUpdateParameters.setSegmentPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("streamSelection", targetDepth)) {
                    context.nextToken();
                    cmafPackageCreateOrUpdateParameters.setStreamSelection(StreamSelectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cmafPackageCreateOrUpdateParameters;
    }

    private static CmafPackageCreateOrUpdateParametersJsonUnmarshaller instance;

    public static CmafPackageCreateOrUpdateParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CmafPackageCreateOrUpdateParametersJsonUnmarshaller();
        return instance;
    }
}
