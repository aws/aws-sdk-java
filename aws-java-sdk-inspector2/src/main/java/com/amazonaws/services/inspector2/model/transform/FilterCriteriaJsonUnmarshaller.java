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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FilterCriteria JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCriteriaJsonUnmarshaller implements Unmarshaller<FilterCriteria, JsonUnmarshallerContext> {

    public FilterCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        FilterCriteria filterCriteria = new FilterCriteria();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setAwsAccountId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("componentId", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setComponentId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("componentType", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setComponentType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ec2InstanceImageId", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEc2InstanceImageId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ec2InstanceSubnetId", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEc2InstanceSubnetId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ec2InstanceVpcId", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEc2InstanceVpcId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrImageArchitecture", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEcrImageArchitecture(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrImageHash", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEcrImageHash(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrImagePushedAt", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEcrImagePushedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrImageRegistry", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEcrImageRegistry(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrImageRepositoryName", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEcrImageRepositoryName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ecrImageTags", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setEcrImageTags(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("exploitAvailable", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setExploitAvailable(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("findingArn", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setFindingArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("findingStatus", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setFindingStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("findingType", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setFindingType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("firstObservedAt", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setFirstObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("fixAvailable", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setFixAvailable(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("inspectorScore", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setInspectorScore(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setLambdaFunctionExecutionRoleArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionLastModifiedAt", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setLambdaFunctionLastModifiedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionLayers", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setLambdaFunctionLayers(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionName", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setLambdaFunctionName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionRuntime", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setLambdaFunctionRuntime(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lastObservedAt", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setLastObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("networkProtocol", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setNetworkProtocol(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("portRange", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setPortRange(new ListUnmarshaller<PortRangeFilter>(PortRangeFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("relatedVulnerabilities", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setRelatedVulnerabilities(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setResourceId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceTags", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setResourceTags(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setResourceType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setSeverity(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setTitle(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("vendorSeverity", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setVendorSeverity(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("vulnerabilityId", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setVulnerabilityId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("vulnerabilitySource", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setVulnerabilitySource(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("vulnerablePackages", targetDepth)) {
                    context.nextToken();
                    filterCriteria.setVulnerablePackages(new ListUnmarshaller<PackageFilter>(PackageFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return filterCriteria;
    }

    private static FilterCriteriaJsonUnmarshaller instance;

    public static FilterCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FilterCriteriaJsonUnmarshaller();
        return instance;
    }
}
