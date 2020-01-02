/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RequestDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestDetailsJsonUnmarshaller implements Unmarshaller<RequestDetails, JsonUnmarshallerContext> {

    public RequestDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        RequestDetails requestDetails = new RequestDetails();

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
                if (context.testExpression("ExportAssetToSignedUrl", targetDepth)) {
                    context.nextToken();
                    requestDetails.setExportAssetToSignedUrl(ExportAssetToSignedUrlRequestDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportAssetsToS3", targetDepth)) {
                    context.nextToken();
                    requestDetails.setExportAssetsToS3(ExportAssetsToS3RequestDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImportAssetFromSignedUrl", targetDepth)) {
                    context.nextToken();
                    requestDetails.setImportAssetFromSignedUrl(ImportAssetFromSignedUrlRequestDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImportAssetsFromS3", targetDepth)) {
                    context.nextToken();
                    requestDetails.setImportAssetsFromS3(ImportAssetsFromS3RequestDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return requestDetails;
    }

    private static RequestDetailsJsonUnmarshaller instance;

    public static RequestDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequestDetailsJsonUnmarshaller();
        return instance;
    }
}
