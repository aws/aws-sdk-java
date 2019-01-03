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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InputTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputTemplateJsonUnmarshaller implements Unmarshaller<InputTemplate, JsonUnmarshallerContext> {

    public InputTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        InputTemplate inputTemplate = new InputTemplate();

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
                if (context.testExpression("audioSelectorGroups", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setAudioSelectorGroups(new MapUnmarshaller<String, AudioSelectorGroup>(context.getUnmarshaller(String.class),
                            AudioSelectorGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("audioSelectors", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setAudioSelectors(new MapUnmarshaller<String, AudioSelector>(context.getUnmarshaller(String.class),
                            AudioSelectorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("captionSelectors", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setCaptionSelectors(new MapUnmarshaller<String, CaptionSelector>(context.getUnmarshaller(String.class),
                            CaptionSelectorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("deblockFilter", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setDeblockFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("denoiseFilter", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setDenoiseFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterEnable", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setFilterEnable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterStrength", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setFilterStrength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("imageInserter", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setImageInserter(ImageInserterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputClippings", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setInputClippings(new ListUnmarshaller<InputClipping>(InputClippingJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("programNumber", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setProgramNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("psiControl", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setPsiControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timecodeSource", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setTimecodeSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("videoSelector", targetDepth)) {
                    context.nextToken();
                    inputTemplate.setVideoSelector(VideoSelectorJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inputTemplate;
    }

    private static InputTemplateJsonUnmarshaller instance;

    public static InputTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputTemplateJsonUnmarshaller();
        return instance;
    }
}
