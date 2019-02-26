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
import com.amazonaws.services.s3.model.ServerSideEncryptionConfiguration;
import com.amazonaws.services.s3.model.ServerSideEncryptionRule;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.XmlUtils;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;

/**
 * Unmarshaller for {@link GetBucketEncryptionResult}.
 */
public class GetBucketEncryptionStaxUnmarshaller implements Unmarshaller<GetBucketEncryptionResult, InputStream> {

    private static final GetBucketEncryptionStaxUnmarshaller instance = new GetBucketEncryptionStaxUnmarshaller();

    public static GetBucketEncryptionStaxUnmarshaller getInstance() {
        return instance;
    }

    private GetBucketEncryptionStaxUnmarshaller() {
    }

    @Override
    public GetBucketEncryptionResult unmarshall(InputStream inputStream) throws Exception {
        StaxUnmarshallerContext context
            = new StaxUnmarshallerContext(XmlUtils.getXmlInputFactory().createXMLEventReader(inputStream));
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        GetBucketEncryptionResult result = new GetBucketEncryptionResult();
        ServerSideEncryptionConfiguration sseConfig = new ServerSideEncryptionConfiguration();
        result.setServerSideEncryptionConfiguration(sseConfig);

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return result;
            }
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Rule", targetDepth)) {
                    if(sseConfig.getRules() == null){
                        sseConfig.setRules(new ArrayList<ServerSideEncryptionRule>());
                    }
                    sseConfig.getRules().add(ServerSideEncryptionRuleStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
        }
    }

}
