/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * RedshiftIdcApplication StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftIdcApplicationStaxUnmarshaller implements Unmarshaller<RedshiftIdcApplication, StaxUnmarshallerContext> {

    public RedshiftIdcApplication unmarshall(StaxUnmarshallerContext context) throws Exception {
        RedshiftIdcApplication redshiftIdcApplication = new RedshiftIdcApplication();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return redshiftIdcApplication;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("IdcInstanceArn", targetDepth)) {
                    redshiftIdcApplication.setIdcInstanceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RedshiftIdcApplicationName", targetDepth)) {
                    redshiftIdcApplication.setRedshiftIdcApplicationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RedshiftIdcApplicationArn", targetDepth)) {
                    redshiftIdcApplication.setRedshiftIdcApplicationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IdentityNamespace", targetDepth)) {
                    redshiftIdcApplication.setIdentityNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IdcDisplayName", targetDepth)) {
                    redshiftIdcApplication.setIdcDisplayName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IamRoleArn", targetDepth)) {
                    redshiftIdcApplication.setIamRoleArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IdcManagedApplicationArn", targetDepth)) {
                    redshiftIdcApplication.setIdcManagedApplicationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IdcOnboardStatus", targetDepth)) {
                    redshiftIdcApplication.setIdcOnboardStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthorizedTokenIssuerList", targetDepth)) {
                    redshiftIdcApplication.withAuthorizedTokenIssuerList(new ArrayList<AuthorizedTokenIssuer>());
                    continue;
                }

                if (context.testExpression("AuthorizedTokenIssuerList/member", targetDepth)) {
                    redshiftIdcApplication.withAuthorizedTokenIssuerList(AuthorizedTokenIssuerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServiceIntegrations", targetDepth)) {
                    redshiftIdcApplication.withServiceIntegrations(new ArrayList<ServiceIntegrationsUnion>());
                    continue;
                }

                if (context.testExpression("ServiceIntegrations/member", targetDepth)) {
                    redshiftIdcApplication.withServiceIntegrations(ServiceIntegrationsUnionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return redshiftIdcApplication;
                }
            }
        }
    }

    private static RedshiftIdcApplicationStaxUnmarshaller instance;

    public static RedshiftIdcApplicationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftIdcApplicationStaxUnmarshaller();
        return instance;
    }
}
