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
 * DeleteCustomDBEngineVersionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomDBEngineVersionResultStaxUnmarshaller implements Unmarshaller<DeleteCustomDBEngineVersionResult, StaxUnmarshallerContext> {

    public DeleteCustomDBEngineVersionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteCustomDBEngineVersionResult deleteCustomDBEngineVersionResult = new DeleteCustomDBEngineVersionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteCustomDBEngineVersionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Engine", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineVersion", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBParameterGroupFamily", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setDBParameterGroupFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineDescription", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setDBEngineDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineVersionDescription", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setDBEngineVersionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultCharacterSet", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setDefaultCharacterSet(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Image", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setImage(CustomDBEngineVersionAMIStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineMediaType", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setDBEngineMediaType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedCharacterSets", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedCharacterSets(new ArrayList<CharacterSet>());
                    continue;
                }

                if (context.testExpression("SupportedCharacterSets/CharacterSet", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedCharacterSets(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedNcharCharacterSets", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedNcharCharacterSets(new ArrayList<CharacterSet>());
                    continue;
                }

                if (context.testExpression("SupportedNcharCharacterSets/CharacterSet", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedNcharCharacterSets(CharacterSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ValidUpgradeTarget", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withValidUpgradeTarget(new ArrayList<UpgradeTarget>());
                    continue;
                }

                if (context.testExpression("ValidUpgradeTarget/UpgradeTarget", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withValidUpgradeTarget(UpgradeTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedTimezones", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedTimezones(new ArrayList<Timezone>());
                    continue;
                }

                if (context.testExpression("SupportedTimezones/Timezone", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedTimezones(TimezoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExportableLogTypes", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withExportableLogTypes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExportableLogTypes/member", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withExportableLogTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsLogExportsToCloudwatchLogs", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setSupportsLogExportsToCloudwatchLogs(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsReadReplica", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setSupportsReadReplica(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedEngineModes", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedEngineModes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedEngineModes/member", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedEngineModes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedFeatureNames", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedFeatureNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedFeatureNames/member", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withSupportedFeatureNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsParallelQuery", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setSupportsParallelQuery(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsGlobalDatabases", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setSupportsGlobalDatabases(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MajorEngineVersion", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setMajorEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseInstallationFilesS3BucketName", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setDatabaseInstallationFilesS3BucketName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DatabaseInstallationFilesS3Prefix", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setDatabaseInstallationFilesS3Prefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineVersionArn", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setDBEngineVersionArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KMSKeyId", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setKMSKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TagList", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withTagList(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("TagList/Tag", targetDepth)) {
                    deleteCustomDBEngineVersionResult.withTagList(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportsBabelfish", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setSupportsBabelfish(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomDBEngineVersionManifest", targetDepth)) {
                    deleteCustomDBEngineVersionResult.setCustomDBEngineVersionManifest(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteCustomDBEngineVersionResult;
                }
            }
        }
    }

    private static DeleteCustomDBEngineVersionResultStaxUnmarshaller instance;

    public static DeleteCustomDBEngineVersionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteCustomDBEngineVersionResultStaxUnmarshaller();
        return instance;
    }
}
