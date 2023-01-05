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
 * ModifyCustomDBEngineVersionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCustomDBEngineVersionResultStaxUnmarshaller implements Unmarshaller<ModifyCustomDBEngineVersionResult, StaxUnmarshallerContext> {

    public ModifyCustomDBEngineVersionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyCustomDBEngineVersionResult modifyCustomDBEngineVersionResult = new ModifyCustomDBEngineVersionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyCustomDBEngineVersionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Engine", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBParameterGroupFamily", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setDBParameterGroupFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineDescription", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setDBEngineDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineVersionDescription", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setDBEngineVersionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultCharacterSet", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setDefaultCharacterSet(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Image", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setImage(CustomDBEngineVersionAMIStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineMediaType", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setDBEngineMediaType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedCharacterSets", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedCharacterSets(new ArrayList<CharacterSet>());
                    continue;
                }

                if (context.testExpression("SupportedCharacterSets/CharacterSet", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedCharacterSets(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedNcharCharacterSets", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedNcharCharacterSets(new ArrayList<CharacterSet>());
                    continue;
                }

                if (context.testExpression("SupportedNcharCharacterSets/CharacterSet", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedNcharCharacterSets(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ValidUpgradeTarget", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withValidUpgradeTarget(new ArrayList<UpgradeTarget>());
                    continue;
                }

                if (context.testExpression("ValidUpgradeTarget/UpgradeTarget", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withValidUpgradeTarget(UpgradeTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedTimezones", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedTimezones(new ArrayList<Timezone>());
                    continue;
                }

                if (context.testExpression("SupportedTimezones/Timezone", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedTimezones(TimezoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExportableLogTypes", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withExportableLogTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExportableLogTypes/member", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withExportableLogTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsLogExportsToCloudwatchLogs", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setSupportsLogExportsToCloudwatchLogs(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsReadReplica", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setSupportsReadReplica(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedEngineModes", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedEngineModes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedEngineModes/member", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedEngineModes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedFeatureNames", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedFeatureNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedFeatureNames/member", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withSupportedFeatureNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsParallelQuery", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setSupportsParallelQuery(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsGlobalDatabases", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setSupportsGlobalDatabases(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MajorEngineVersion", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setMajorEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseInstallationFilesS3BucketName", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setDatabaseInstallationFilesS3BucketName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseInstallationFilesS3Prefix", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setDatabaseInstallationFilesS3Prefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineVersionArn", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setDBEngineVersionArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KMSKeyId", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setKMSKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TagList", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withTagList(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("TagList/Tag", targetDepth)) {
                    modifyCustomDBEngineVersionResult.withTagList(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsBabelfish", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setSupportsBabelfish(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomDBEngineVersionManifest", targetDepth)) {
                    modifyCustomDBEngineVersionResult.setCustomDBEngineVersionManifest(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyCustomDBEngineVersionResult;
                }
            }
        }
    }

    private static ModifyCustomDBEngineVersionResultStaxUnmarshaller instance;

    public static ModifyCustomDBEngineVersionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyCustomDBEngineVersionResultStaxUnmarshaller();
        return instance;
    }
}
