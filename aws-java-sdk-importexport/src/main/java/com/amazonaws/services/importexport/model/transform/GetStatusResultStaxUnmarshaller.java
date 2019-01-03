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
 * GetStatusResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStatusResultStaxUnmarshaller implements Unmarshaller<GetStatusResult, StaxUnmarshallerContext> {

    public GetStatusResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetStatusResult getStatusResult = new GetStatusResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getStatusResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("JobId", targetDepth)) {
                    getStatusResult.setJobId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("JobType", targetDepth)) {
                    getStatusResult.setJobType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LocationCode", targetDepth)) {
                    getStatusResult.setLocationCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LocationMessage", targetDepth)) {
                    getStatusResult.setLocationMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProgressCode", targetDepth)) {
                    getStatusResult.setProgressCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProgressMessage", targetDepth)) {
                    getStatusResult.setProgressMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Carrier", targetDepth)) {
                    getStatusResult.setCarrier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TrackingNumber", targetDepth)) {
                    getStatusResult.setTrackingNumber(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogBucket", targetDepth)) {
                    getStatusResult.setLogBucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogKey", targetDepth)) {
                    getStatusResult.setLogKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ErrorCount", targetDepth)) {
                    getStatusResult.setErrorCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Signature", targetDepth)) {
                    getStatusResult.setSignature(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SignatureFileContents", targetDepth)) {
                    getStatusResult.setSignatureFileContents(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrentManifest", targetDepth)) {
                    getStatusResult.setCurrentManifest(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreationDate", targetDepth)) {
                    getStatusResult.setCreationDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ArtifactList", targetDepth)) {
                    getStatusResult.withArtifactList(new ArrayList<Artifact>());
                    continue;
                }

                if (context.testExpression("ArtifactList/member", targetDepth)) {
                    getStatusResult.withArtifactList(ArtifactStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getStatusResult;
                }
            }
        }
    }

    private static GetStatusResultStaxUnmarshaller instance;

    public static GetStatusResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetStatusResultStaxUnmarshaller();
        return instance;
    }
}
