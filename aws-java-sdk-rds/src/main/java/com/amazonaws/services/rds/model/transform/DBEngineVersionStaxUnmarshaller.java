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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBEngineVersion StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBEngineVersionStaxUnmarshaller implements Unmarshaller<DBEngineVersion, StaxUnmarshallerContext> {

    public DBEngineVersion unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBEngineVersion dBEngineVersion = new DBEngineVersion();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBEngineVersion;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Engine", targetDepth)) {
                    dBEngineVersion.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBEngineVersion.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBParameterGroupFamily", targetDepth)) {
                    dBEngineVersion.setDBParameterGroupFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineDescription", targetDepth)) {
                    dBEngineVersion.setDBEngineDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineVersionDescription", targetDepth)) {
                    dBEngineVersion.setDBEngineVersionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultCharacterSet", targetDepth)) {
                    dBEngineVersion.setDefaultCharacterSet(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedCharacterSets", targetDepth)) {
                    dBEngineVersion.withSupportedCharacterSets(new ArrayList<CharacterSet>());
                    continue;
                }

                if (context.testExpression("SupportedCharacterSets/CharacterSet", targetDepth)) {
                    dBEngineVersion.withSupportedCharacterSets(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ValidUpgradeTarget", targetDepth)) {
                    dBEngineVersion.withValidUpgradeTarget(new ArrayList<UpgradeTarget>());
                    continue;
                }

                if (context.testExpression("ValidUpgradeTarget/UpgradeTarget", targetDepth)) {
                    dBEngineVersion.withValidUpgradeTarget(UpgradeTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedTimezones", targetDepth)) {
                    dBEngineVersion.withSupportedTimezones(new ArrayList<Timezone>());
                    continue;
                }

                if (context.testExpression("SupportedTimezones/Timezone", targetDepth)) {
                    dBEngineVersion.withSupportedTimezones(TimezoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExportableLogTypes", targetDepth)) {
                    dBEngineVersion.withExportableLogTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExportableLogTypes/member", targetDepth)) {
                    dBEngineVersion.withExportableLogTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsLogExportsToCloudwatchLogs", targetDepth)) {
                    dBEngineVersion.setSupportsLogExportsToCloudwatchLogs(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsReadReplica", targetDepth)) {
                    dBEngineVersion.setSupportsReadReplica(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedEngineModes", targetDepth)) {
                    dBEngineVersion.withSupportedEngineModes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedEngineModes/member", targetDepth)) {
                    dBEngineVersion.withSupportedEngineModes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedFeatureNames", targetDepth)) {
                    dBEngineVersion.withSupportedFeatureNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedFeatureNames/member", targetDepth)) {
                    dBEngineVersion.withSupportedFeatureNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBEngineVersion;
                }
            }
        }
    }

    private static DBEngineVersionStaxUnmarshaller instance;

    public static DBEngineVersionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBEngineVersionStaxUnmarshaller();
        return instance;
    }
}
