/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudsearch.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudsearch.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Domain Status StAX Unmarshaller
 */
public class DomainStatusStaxUnmarshaller implements Unmarshaller<DomainStatus, StaxUnmarshallerContext> {

    public DomainStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        DomainStatus domainStatus = new DomainStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return domainStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("DomainId", targetDepth)) {
                    domainStatus.setDomainId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    domainStatus.setDomainName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Created", targetDepth)) {
                    domainStatus.setCreated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Deleted", targetDepth)) {
                    domainStatus.setDeleted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NumSearchableDocs", targetDepth)) {
                    domainStatus.setNumSearchableDocs(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DocService", targetDepth)) {
                    domainStatus.setDocService(ServiceEndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SearchService", targetDepth)) {
                    domainStatus.setSearchService(ServiceEndpointStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequiresIndexDocuments", targetDepth)) {
                    domainStatus.setRequiresIndexDocuments(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Processing", targetDepth)) {
                    domainStatus.setProcessing(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SearchInstanceType", targetDepth)) {
                    domainStatus.setSearchInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SearchPartitionCount", targetDepth)) {
                    domainStatus.setSearchPartitionCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SearchInstanceCount", targetDepth)) {
                    domainStatus.setSearchInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return domainStatus;
                }
            }
        }
    }

    private static DomainStatusStaxUnmarshaller instance;
    public static DomainStatusStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DomainStatusStaxUnmarshaller();
        return instance;
    }
}
    