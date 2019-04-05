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
package com.amazonaws.services.cloudsearchv2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TextArrayOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextArrayOptionsStaxUnmarshaller implements Unmarshaller<TextArrayOptions, StaxUnmarshallerContext> {

    public TextArrayOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        TextArrayOptions textArrayOptions = new TextArrayOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return textArrayOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DefaultValue", targetDepth)) {
                    textArrayOptions.setDefaultValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceFields", targetDepth)) {
                    textArrayOptions.setSourceFields(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReturnEnabled", targetDepth)) {
                    textArrayOptions.setReturnEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HighlightEnabled", targetDepth)) {
                    textArrayOptions.setHighlightEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AnalysisScheme", targetDepth)) {
                    textArrayOptions.setAnalysisScheme(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return textArrayOptions;
                }
            }
        }
    }

    private static TextArrayOptionsStaxUnmarshaller instance;

    public static TextArrayOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TextArrayOptionsStaxUnmarshaller();
        return instance;
    }
}
