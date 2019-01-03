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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetClusterCredentialsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClusterCredentialsResultStaxUnmarshaller implements Unmarshaller<GetClusterCredentialsResult, StaxUnmarshallerContext> {

    public GetClusterCredentialsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetClusterCredentialsResult getClusterCredentialsResult = new GetClusterCredentialsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getClusterCredentialsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DbUser", targetDepth)) {
                    getClusterCredentialsResult.setDbUser(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DbPassword", targetDepth)) {
                    getClusterCredentialsResult.setDbPassword(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Expiration", targetDepth)) {
                    getClusterCredentialsResult.setExpiration(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getClusterCredentialsResult;
                }
            }
        }
    }

    private static GetClusterCredentialsResultStaxUnmarshaller instance;

    public static GetClusterCredentialsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetClusterCredentialsResultStaxUnmarshaller();
        return instance;
    }
}
