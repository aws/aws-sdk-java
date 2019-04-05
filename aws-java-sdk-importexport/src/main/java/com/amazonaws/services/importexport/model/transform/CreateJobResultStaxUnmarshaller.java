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
package com.amazonaws.services.importexport.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.importexport.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CreateJobResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobResultStaxUnmarshaller implements Unmarshaller<CreateJobResult, StaxUnmarshallerContext> {

    public CreateJobResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateJobResult createJobResult = new CreateJobResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createJobResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("JobId", targetDepth)) {
                    createJobResult.setJobId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("JobType", targetDepth)) {
                    createJobResult.setJobType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Signature", targetDepth)) {
                    createJobResult.setSignature(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SignatureFileContents", targetDepth)) {
                    createJobResult.setSignatureFileContents(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("WarningMessage", targetDepth)) {
                    createJobResult.setWarningMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ArtifactList", targetDepth)) {
                    createJobResult.withArtifactList(new ArrayList<Artifact>());
                    continue;
                }

                if (context.testExpression("ArtifactList/member", targetDepth)) {
                    createJobResult.withArtifactList(ArtifactStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createJobResult;
                }
            }
        }
    }

    private static CreateJobResultStaxUnmarshaller instance;

    public static CreateJobResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateJobResultStaxUnmarshaller();
        return instance;
    }
}
