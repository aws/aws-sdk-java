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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsSecurityFindingFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSecurityFindingFiltersJsonUnmarshaller implements Unmarshaller<AwsSecurityFindingFilters, JsonUnmarshallerContext> {

    public AwsSecurityFindingFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsSecurityFindingFilters awsSecurityFindingFilters = new AwsSecurityFindingFilters();

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
                if (context.testExpression("ProductArn", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setAwsAccountId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("GeneratorId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setGeneratorId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("FirstObservedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setFirstObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("LastObservedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setLastObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setCreatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("SeverityProduct", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setSeverityProduct(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("SeverityNormalized", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setSeverityNormalized(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("SeverityLabel", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setSeverityLabel(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Confidence", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setConfidence(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Criticality", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setCriticality(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setTitle(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setDescription(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RecommendationText", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setRecommendationText(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("SourceUrl", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setSourceUrl(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ProductFields", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setProductFields(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setProductName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("CompanyName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setCompanyName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("UserDefinedFields", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setUserDefinedFields(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("MalwareName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setMalwareName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("MalwareType", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setMalwareType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("MalwarePath", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setMalwarePath(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("MalwareState", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setMalwareState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkDirection", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDirection(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkProtocol", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkProtocol(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkSourceIpV4", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourceIpV4(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("NetworkSourceIpV6", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourceIpV6(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("NetworkSourcePort", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourcePort(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkSourceDomain", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourceDomain(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkSourceMac", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourceMac(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkDestinationIpV4", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDestinationIpV4(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkDestinationIpV6", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDestinationIpV6(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkDestinationPort", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDestinationPort(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkDestinationDomain", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDestinationDomain(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ProcessName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setProcessName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ProcessPath", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setProcessPath(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ProcessPid", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessPid(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ProcessParentPid", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessParentPid(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ProcessLaunchedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessLaunchedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ProcessTerminatedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessTerminatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorType", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorValue", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorValue(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorCategory", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorCategory(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorLastObservedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorLastObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorSource", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorSource(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorSourceUrl", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorSourceUrl(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ResourcePartition", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourcePartition(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceRegion", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceRegion(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceTags", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceTags(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceType", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceImageId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceImageId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceIpV4Addresses", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceIpV4Addresses(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceIpV6Addresses", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceIpV6Addresses(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceKeyName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceKeyName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceIamInstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceIamInstanceProfileArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceVpcId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceVpcId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceSubnetId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceSubnetId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceLaunchedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceLaunchedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsS3BucketOwnerId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsS3BucketOwnerId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsS3BucketOwnerName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsS3BucketOwnerName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsIamAccessKeyUserName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsIamAccessKeyUserName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsIamAccessKeyStatus", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsIamAccessKeyStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsIamAccessKeyCreatedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsIamAccessKeyCreatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceContainerName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceContainerName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceContainerImageId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceContainerImageId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceContainerImageName", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceContainerImageName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceContainerLaunchedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceContainerLaunchedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceDetailsOther", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceDetailsOther(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ComplianceStatus", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setComplianceStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("VerificationState", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setVerificationState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("WorkflowState", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setWorkflowState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("RecordState", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setRecordState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RelatedFindingsProductArn", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setRelatedFindingsProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("RelatedFindingsId", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setRelatedFindingsId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NoteText", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNoteText(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("NoteUpdatedAt", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNoteUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("NoteUpdatedBy", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setNoteUpdatedBy(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Keyword", targetDepth)) {
                    context.nextToken();
                    awsSecurityFindingFilters.setKeyword(new ListUnmarshaller<KeywordFilter>(KeywordFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsSecurityFindingFilters;
    }

    private static AwsSecurityFindingFiltersJsonUnmarshaller instance;

    public static AwsSecurityFindingFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecurityFindingFiltersJsonUnmarshaller();
        return instance;
    }
}
