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
package com.amazonaws.services.polly.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SynthesizeSpeechResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SynthesizeSpeechResultJsonUnmarshaller implements Unmarshaller<SynthesizeSpeechResult, JsonUnmarshallerContext> {

    public SynthesizeSpeechResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SynthesizeSpeechResult synthesizeSpeechResult = new SynthesizeSpeechResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Content-Type") != null) {
                context.setCurrentHeader("Content-Type");
                synthesizeSpeechResult.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amzn-RequestCharacters") != null) {
                context.setCurrentHeader("x-amzn-RequestCharacters");
                synthesizeSpeechResult.setRequestCharacters(context.getUnmarshaller(Integer.class).unmarshall(context));
            }
        }

        synthesizeSpeechResult.setAudioStream(context.getHttpResponse().getContent());

        return synthesizeSpeechResult;
    }

    private static SynthesizeSpeechResultJsonUnmarshaller instance;

    public static SynthesizeSpeechResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SynthesizeSpeechResultJsonUnmarshaller();
        return instance;
    }
}
