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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OTAUpdateInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OTAUpdateInfoJsonUnmarshaller implements Unmarshaller<OTAUpdateInfo, JsonUnmarshallerContext> {

    public OTAUpdateInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        OTAUpdateInfo oTAUpdateInfo = new OTAUpdateInfo();

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
                if (context.testExpression("otaUpdateId", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setOtaUpdateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("otaUpdateArn", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setOtaUpdateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targets", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setTargets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("awsJobExecutionsRolloutConfig", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setAwsJobExecutionsRolloutConfig(AwsJobExecutionsRolloutConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("targetSelection", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setTargetSelection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("otaUpdateFiles", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setOtaUpdateFiles(new ListUnmarshaller<OTAUpdateFile>(OTAUpdateFileJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("otaUpdateStatus", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setOtaUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsIotJobId", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setAwsIotJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsIotJobArn", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setAwsIotJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorInfo", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setErrorInfo(ErrorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("additionalParameters", targetDepth)) {
                    context.nextToken();
                    oTAUpdateInfo.setAdditionalParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return oTAUpdateInfo;
    }

    private static OTAUpdateInfoJsonUnmarshaller instance;

    public static OTAUpdateInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OTAUpdateInfoJsonUnmarshaller();
        return instance;
    }
}
