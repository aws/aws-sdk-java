/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen;

import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.BasicCodeGenConfig;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.Metadata;
import com.amazonaws.codegen.model.intermediate.Protocol;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.ServiceMetadata;
import com.amazonaws.codegen.model.service.ServiceModel;
import java.util.HashMap;
import java.util.Map;

/**
 * Constructs the metadata that is required for generating the java client from the service meta data.
 */
final class AddMetadata {

    private static final Map<String, String> INTERFACE_NAME_TO_SERVICE_ID = new HashMap<>();

    static {
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonAthena", "Athena");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSAppSync", "AppSync");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonAutoScaling", "Auto Scaling");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSCloud9", "Cloud9");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonCloudDirectory", "CloudDirectory");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonCloudSearch", "CloudSearch");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonCloudSearchDomain", "CloudSearch Domain");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSCloudTrail", "CloudTrail");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonCloudWatch", "CloudWatch");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonCodeBuild", "CodeBuild");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSCodePipeline", "CodePipeline");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSCodeStar", "CodeStar");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonCognitoIdentity", "Cognito Identity");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSCognitoIdentityProvider", "Cognito Identity Provider");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonCognitoSync", "Cognito Sync");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSCostAndUsageReport", "Cost and Usage Report Service");
        INTERFACE_NAME_TO_SERVICE_ID.put("DataPipeline", "Data Pipeline");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonDax", "DAX");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonDirectConnect", "Direct Connect");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonDynamoDBStreams", "DynamoDB Streams");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonECR", "ECR");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonElasticFileSystem", "EFS");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonElastiCache", "ElastiCache");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonElasticTranscoder", "Elastic Transcoder");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonElasticLoadBalancing", "Elastic Load Balancing");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonElasticMapReduce", "EMR");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonGameLift", "GameLift");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonGlacier", "Glacier");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSGlue", "Glue");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSHealth", "Health");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonImportExport", "ImportExport");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonInspector", "Inspector");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSIotData", "IoT Data Plane");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSIoTJobsDataPlane", "IoT Jobs Data Plane");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonCloudWatchLogs", "CloudWatch Logs");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonMachineLearning", "Machine Learning");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSMarketplaceEntitlement", "Marketplace Entitlement Service");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSMarketplaceCommerceAnalytics", "Marketplace Commerce Analytics");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSMarketplaceMetering", "Marketplace Metering");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSMigrationHub", "Migration Hub");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSMobile", "Mobile");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSPricing", "Pricing");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSResourceGroupsTaggingAPI", "Resource Groups Tagging API");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonRoute53Domains", "Route 53 Domains");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonSageMakerService", "SageMaker");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonSimpleDB", "SimpleDB");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSShield", "Shield");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSServerMigration", "SMS");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonSnowball", "Snowball");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonSQS", "SQS");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSSupport", "Support");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonSimpleWorkflow", "SWF");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonWorkDocs", "WorkDocs");
        INTERFACE_NAME_TO_SERVICE_ID.put("AmazonWorkMail", "WorkMail");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSXRay", "XRay");
        INTERFACE_NAME_TO_SERVICE_ID.put("AWSGreengrass", "Greengrass");
    }

    public static Metadata constructMetadata(ServiceModel serviceModel,
                                             BasicCodeGenConfig codeGenConfig,
                                             CustomizationConfig customizationConfig) {
        final Metadata metadata = new Metadata();

        final ServiceMetadata serviceMetadata = serviceModel.getMetadata();
        final String interfaceName = codeGenConfig.getInterfaceName();
        final String packageName = codeGenConfig.getPackageName();
        final String asyncInterface = Utils
                .getAsyncInterfaceName(interfaceName);

        metadata.withApiVersion(serviceMetadata.getApiVersion())
                .withAsyncClient(Utils.getClientName(asyncInterface))
                .withAsyncInterface(asyncInterface)
                .withDefaultEndpoint(codeGenConfig.getEndpoint())
                .withDefaultEndpointWithoutHttpProtocol(
                        Utils.getDefaultEndpointWithoutHttpProtocol(codeGenConfig.getEndpoint()))
                .withDefaultRegion(codeGenConfig.getDefaultRegion())
                .withDocumentation(serviceModel.getDocumentation())
                .withPackageName(packageName)
                .withPackagePath(packageName.replace(".", "/"))
                .withServiceAbbreviation(serviceMetadata.getServiceAbbreviation())
                .withServiceFullName(serviceMetadata.getServiceFullName())
                .withServiceId(getServiceIdIfNotProvided(serviceMetadata, interfaceName))
                .withSyncClient(Utils.getClientName(interfaceName))
                .withSyncInterface(interfaceName)
                .withProtocol(Protocol.fromValue(serviceMetadata.getProtocol()))
                .withJsonVersion(serviceMetadata.getJsonVersion())
                .withEndpointPrefix(serviceMetadata.getEndpointPrefix())
                .withSigningName(serviceMetadata.getSigningName())
                .withRequiresApiKey(requiresApiKey(serviceModel))
                .withUid(serviceMetadata.getUid());

        final String jsonVersion = getJsonVersion(metadata, serviceMetadata);
        metadata.setJsonVersion(jsonVersion);

        // TODO: iterate through all the operations and check whether any of
        // them accept stream input
        metadata.setHasApiWithStreamInput(false);
        return metadata;
    }

    private static String getJsonVersion(Metadata metadata, ServiceMetadata serviceMetadata) {
        // TODO this should be defaulted in the C2J build tool
        if (serviceMetadata.getJsonVersion() == null && metadata.isJsonProtocol()) {
            return "1.1";
        } else {
            return serviceMetadata.getJsonVersion();
        }
    }

    /**
     * If any operation requires an API key we generate a setter on the builder.
     *
     * @return True if any operation requires an API key. False otherwise.
     */
    private static boolean requiresApiKey(ServiceModel serviceModel) {
        return serviceModel.getOperations().values().stream()
                .anyMatch(Operation::requiresApiKey);
    }

    /*
     * Get the serviceId from the map if it's missing from metadata.
     */
    private static String getServiceIdIfNotProvided(ServiceMetadata metadata, String interfaceName) {
        if (INTERFACE_NAME_TO_SERVICE_ID.containsKey(interfaceName)) {
            return INTERFACE_NAME_TO_SERVICE_ID.get(interfaceName);
        }

        String serviceId = metadata.getServiceId();

        if (serviceId != null) {
            return serviceId;
        }

        return Utils.deriveServiceId(interfaceName);
    }
}
