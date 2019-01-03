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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DefaultClusterParameters StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultClusterParametersStaxUnmarshaller implements Unmarshaller<DefaultClusterParameters, StaxUnmarshallerContext> {

    public DefaultClusterParameters unmarshall(StaxUnmarshallerContext context) throws Exception {
        DefaultClusterParameters defaultClusterParameters = new DefaultClusterParameters();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return defaultClusterParameters;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ParameterGroupFamily", targetDepth)) {
                    defaultClusterParameters.setParameterGroupFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    defaultClusterParameters.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Parameters", targetDepth)) {
                    defaultClusterParameters.withParameters(new ArrayList<Parameter>());
                    continue;
                }

                if (context.testExpression("Parameters/Parameter", targetDepth)) {
                    defaultClusterParameters.withParameters(ParameterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return defaultClusterParameters;
                }
            }
        }
    }

    private static DefaultClusterParametersStaxUnmarshaller instance;

    public static DefaultClusterParametersStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DefaultClusterParametersStaxUnmarshaller();
        return instance;
    }
}
