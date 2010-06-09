/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.importexport.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.importexport.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * List Jobs Request StAX Unmarshaller
 */
public class ListJobsRequestStaxUnmarshaller implements Unmarshaller<ListJobsRequest, StaxUnmarshallerContext> {

    

    public ListJobsRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListJobsRequest listJobsRequest = new ListJobsRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return listJobsRequest;

            if (event.isAttribute() || event.isStartElement()) {
                if (context.testExpression("MaxJobs", targetDepth)) {
                    listJobsRequest.setMaxJobs(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Marker", targetDepth)) {
                    listJobsRequest.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listJobsRequest;
                }
            }
        }
    }

    private static ListJobsRequestStaxUnmarshaller instance;
    public static ListJobsRequestStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ListJobsRequestStaxUnmarshaller();
        return instance;
    }
}
    