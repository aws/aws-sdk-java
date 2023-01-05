/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MultiRegionAccessPointReport StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiRegionAccessPointReportStaxUnmarshaller implements Unmarshaller<MultiRegionAccessPointReport, StaxUnmarshallerContext> {

    public MultiRegionAccessPointReport unmarshall(StaxUnmarshallerContext context) throws Exception {
        MultiRegionAccessPointReport multiRegionAccessPointReport = new MultiRegionAccessPointReport();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return multiRegionAccessPointReport;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Name", targetDepth)) {
                    multiRegionAccessPointReport.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Alias", targetDepth)) {
                    multiRegionAccessPointReport.setAlias(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedAt", targetDepth)) {
                    multiRegionAccessPointReport.setCreatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("PublicAccessBlock", targetDepth)) {
                    multiRegionAccessPointReport.setPublicAccessBlock(PublicAccessBlockConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    multiRegionAccessPointReport.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Regions", targetDepth)) {
                    multiRegionAccessPointReport.withRegions(new ArrayList<RegionReport>());
                    continue;
                }

                if (context.testExpression("Regions/Region", targetDepth)) {
                    multiRegionAccessPointReport.withRegions(RegionReportStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return multiRegionAccessPointReport;
                }
            }
        }
    }

    private static MultiRegionAccessPointReportStaxUnmarshaller instance;

    public static MultiRegionAccessPointReportStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MultiRegionAccessPointReportStaxUnmarshaller();
        return instance;
    }
}
