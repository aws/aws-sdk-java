/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.GetBucketEncryptionResult;
import com.amazonaws.services.s3.model.GetBucketPolicyStatusResult;
import com.amazonaws.services.s3.model.PolicyStatus;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.XmlUtils;
import java.io.InputStream;
import javax.xml.stream.events.XMLEvent;

/**
 * Unmarshaller for {@link GetBucketEncryptionResult}.
 */
public class GetBucketPolicyStatusStaxUnmarshaller implements Unmarshaller<GetBucketPolicyStatusResult, InputStream> {

    private static final GetBucketPolicyStatusStaxUnmarshaller instance = new GetBucketPolicyStatusStaxUnmarshaller();

    public static GetBucketPolicyStatusStaxUnmarshaller getInstance() {
        return instance;
    }

    private GetBucketPolicyStatusStaxUnmarshaller() {
    }

    @Override
    public GetBucketPolicyStatusResult unmarshall(InputStream inputStream) throws Exception {
        StaxUnmarshallerContext context
            = new StaxUnmarshallerContext(XmlUtils.getXmlInputFactory().createXMLEventReader(inputStream));
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        GetBucketPolicyStatusResult result = new GetBucketPolicyStatusResult();
        PolicyStatus policyStatus = new PolicyStatus();
        result.setPolicyStatus(policyStatus);

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return result;
            }
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("IsPublic", targetDepth)) {
                    policyStatus.setIsPublic(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
        }
    }

}
