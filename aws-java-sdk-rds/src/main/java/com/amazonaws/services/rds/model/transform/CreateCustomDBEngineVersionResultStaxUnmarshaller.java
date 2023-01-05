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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CreateCustomDBEngineVersionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomDBEngineVersionResultStaxUnmarshaller implements Unmarshaller<CreateCustomDBEngineVersionResult, StaxUnmarshallerContext> {

    public CreateCustomDBEngineVersionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateCustomDBEngineVersionResult createCustomDBEngineVersionResult = new CreateCustomDBEngineVersionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createCustomDBEngineVersionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Engine", targetDepth)) {
                    createCustomDBEngineVersionResult.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    createCustomDBEngineVersionResult.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBParameterGroupFamily", targetDepth)) {
                    createCustomDBEngineVersionResult.setDBParameterGroupFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineDescription", targetDepth)) {
                    createCustomDBEngineVersionResult.setDBEngineDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineVersionDescription", targetDepth)) {
                    createCustomDBEngineVersionResult.setDBEngineVersionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultCharacterSet", targetDepth)) {
                    createCustomDBEngineVersionResult.setDefaultCharacterSet(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Image", targetDepth)) {
                    createCustomDBEngineVersionResult.setImage(CustomDBEngineVersionAMIStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineMediaType", targetDepth)) {
                    createCustomDBEngineVersionResult.setDBEngineMediaType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedCharacterSets", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedCharacterSets(new ArrayList<CharacterSet>());
                    continue;
                }

                if (context.testExpression("SupportedCharacterSets/CharacterSet", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedCharacterSets(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedNcharCharacterSets", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedNcharCharacterSets(new ArrayList<CharacterSet>());
                    continue;
                }

                if (context.testExpression("SupportedNcharCharacterSets/CharacterSet", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedNcharCharacterSets(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ValidUpgradeTarget", targetDepth)) {
                    createCustomDBEngineVersionResult.withValidUpgradeTarget(new ArrayList<UpgradeTarget>());
                    continue;
                }

                if (context.testExpression("ValidUpgradeTarget/UpgradeTarget", targetDepth)) {
                    createCustomDBEngineVersionResult.withValidUpgradeTarget(UpgradeTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedTimezones", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedTimezones(new ArrayList<Timezone>());
                    continue;
                }

                if (context.testExpression("SupportedTimezones/Timezone", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedTimezones(TimezoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExportableLogTypes", targetDepth)) {
                    createCustomDBEngineVersionResult.withExportableLogTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExportableLogTypes/member", targetDepth)) {
                    createCustomDBEngineVersionResult.withExportableLogTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsLogExportsToCloudwatchLogs", targetDepth)) {
                    createCustomDBEngineVersionResult.setSupportsLogExportsToCloudwatchLogs(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsReadReplica", targetDepth)) {
                    createCustomDBEngineVersionResult.setSupportsReadReplica(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedEngineModes", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedEngineModes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedEngineModes/member", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedEngineModes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedFeatureNames", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedFeatureNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedFeatureNames/member", targetDepth)) {
                    createCustomDBEngineVersionResult.withSupportedFeatureNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    createCustomDBEngineVersionResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsParallelQuery", targetDepth)) {
                    createCustomDBEngineVersionResult.setSupportsParallelQuery(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsGlobalDatabases", targetDepth)) {
                    createCustomDBEngineVersionResult.setSupportsGlobalDatabases(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MajorEngineVersion", targetDepth)) {
                    createCustomDBEngineVersionResult.setMajorEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseInstallationFilesS3BucketName", targetDepth)) {
                    createCustomDBEngineVersionResult.setDatabaseInstallationFilesS3BucketName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseInstallationFilesS3Prefix", targetDepth)) {
                    createCustomDBEngineVersionResult.setDatabaseInstallationFilesS3Prefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineVersionArn", targetDepth)) {
                    createCustomDBEngineVersionResult.setDBEngineVersionArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KMSKeyId", targetDepth)) {
                    createCustomDBEngineVersionResult.setKMSKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    createCustomDBEngineVersionResult.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TagList", targetDepth)) {
                    createCustomDBEngineVersionResult.withTagList(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("TagList/Tag", targetDepth)) {
                    createCustomDBEngineVersionResult.withTagList(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsBabelfish", targetDepth)) {
                    createCustomDBEngineVersionResult.setSupportsBabelfish(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomDBEngineVersionManifest", targetDepth)) {
                    createCustomDBEngineVersionResult.setCustomDBEngineVersionManifest(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createCustomDBEngineVersionResult;
                }
            }
        }
    }

    private static CreateCustomDBEngineVersionResultStaxUnmarshaller instance;

    public static CreateCustomDBEngineVersionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateCustomDBEngineVersionResultStaxUnmarshaller();
        return instance;
    }
}
