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
import com.amazonaws.services.s3.model.GetPublicAccessBlockResult;
import com.amazonaws.services.s3.model.PublicAccessBlockConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.XmlUtils;
import java.io.InputStream;
import javax.xml.stream.events.XMLEvent;

/**
 * Unmarshaller for {@link GetBucketEncryptionResult}.
 */
public class GetPublicAccessBlockStaxUnmarshaller implements Unmarshaller<GetPublicAccessBlockResult, InputStream> {

    private static final GetPublicAccessBlockStaxUnmarshaller instance = new GetPublicAccessBlockStaxUnmarshaller();

    public static GetPublicAccessBlockStaxUnmarshaller getInstance() {
        return instance;
    }

    private GetPublicAccessBlockStaxUnmarshaller() {
    }

    @Override
    public GetPublicAccessBlockResult unmarshall(InputStream inputStream) throws Exception {
        StaxUnmarshallerContext context
            = new StaxUnmarshallerContext(XmlUtils.getXmlInputFactory().createXMLEventReader(inputStream));
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        GetPublicAccessBlockResult result = new GetPublicAccessBlockResult();
        PublicAccessBlockConfiguration configuration = new PublicAccessBlockConfiguration();
        result.setPublicAccessBlockConfiguration(configuration);

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return result;
            }
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("BlockPublicAcls", targetDepth)) {
                    configuration.setBlockPublicAcls(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IgnorePublicAcls", targetDepth)) {
                    configuration.setIgnorePublicAcls(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BlockPublicPolicy", targetDepth)) {
                    configuration.setBlockPublicPolicy(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RestrictPublicBuckets", targetDepth)) {
                    configuration.setRestrictPublicBuckets(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
        }
    }

}
