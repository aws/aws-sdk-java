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
package com.amazonaws.services.appconfigdata.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.appconfigdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetLatestConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLatestConfigurationResultJsonUnmarshaller implements Unmarshaller<GetLatestConfigurationResult, JsonUnmarshallerContext> {

    public GetLatestConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLatestConfigurationResult getLatestConfigurationResult = new GetLatestConfigurationResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Next-Poll-Configuration-Token") != null) {
                context.setCurrentHeader("Next-Poll-Configuration-Token");
                getLatestConfigurationResult.setNextPollConfigurationToken(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("Next-Poll-Interval-In-Seconds") != null) {
                context.setCurrentHeader("Next-Poll-Interval-In-Seconds");
                getLatestConfigurationResult.setNextPollIntervalInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
            }
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                getLatestConfigurationResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            try {
                getLatestConfigurationResult.setConfiguration(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }

        return getLatestConfigurationResult;
    }

    private static GetLatestConfigurationResultJsonUnmarshaller instance;

    public static GetLatestConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLatestConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
