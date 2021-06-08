/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntimev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexruntimev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutSessionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSessionResultJsonUnmarshaller implements Unmarshaller<PutSessionResult, JsonUnmarshallerContext> {

    public PutSessionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutSessionResult putSessionResult = new PutSessionResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                putSessionResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-messages") != null) {
                context.setCurrentHeader("x-amz-lex-messages");
                putSessionResult.setMessages(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-session-state") != null) {
                context.setCurrentHeader("x-amz-lex-session-state");
                putSessionResult.setSessionState(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-request-attributes") != null) {
                context.setCurrentHeader("x-amz-lex-request-attributes");
                putSessionResult.setRequestAttributes(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-lex-session-id") != null) {
                context.setCurrentHeader("x-amz-lex-session-id");
                putSessionResult.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        putSessionResult.setAudioStream(context.getHttpResponse().getContent());

        return putSessionResult;
    }

    private static PutSessionResultJsonUnmarshaller instance;

    public static PutSessionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutSessionResultJsonUnmarshaller();
        return instance;
    }
}
