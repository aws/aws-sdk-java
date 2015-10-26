/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon API Gateway.
 */

public enum ApigatewayActions implements Action {

    /** Represents any action executed on Amazon API Gateway. */
    AllApigatewayActions("apigateway:*"),

    /** Action for the CreateApiKey operation. */
    CreateApiKey("apigateway:CreateApiKey"),
    /** Action for the CreateBasePathMapping operation. */
    CreateBasePathMapping("apigateway:CreateBasePathMapping"),
    /** Action for the CreateDeployment operation. */
    CreateDeployment("apigateway:CreateDeployment"),
    /** Action for the CreateDomainName operation. */
    CreateDomainName("apigateway:CreateDomainName"),
    /** Action for the CreateModel operation. */
    CreateModel("apigateway:CreateModel"),
    /** Action for the CreateResource operation. */
    CreateResource("apigateway:CreateResource"),
    /** Action for the CreateRestApi operation. */
    CreateRestApi("apigateway:CreateRestApi"),
    /** Action for the CreateStage operation. */
    CreateStage("apigateway:CreateStage"),
    /** Action for the DeleteApiKey operation. */
    DeleteApiKey("apigateway:DeleteApiKey"),
    /** Action for the DeleteBasePathMapping operation. */
    DeleteBasePathMapping("apigateway:DeleteBasePathMapping"),
    /** Action for the DeleteClientCertificate operation. */
    DeleteClientCertificate("apigateway:DeleteClientCertificate"),
    /** Action for the DeleteDeployment operation. */
    DeleteDeployment("apigateway:DeleteDeployment"),
    /** Action for the DeleteDomainName operation. */
    DeleteDomainName("apigateway:DeleteDomainName"),
    /** Action for the DeleteIntegration operation. */
    DeleteIntegration("apigateway:DeleteIntegration"),
    /** Action for the DeleteIntegrationResponse operation. */
    DeleteIntegrationResponse("apigateway:DeleteIntegrationResponse"),
    /** Action for the DeleteMethod operation. */
    DeleteMethod("apigateway:DeleteMethod"),
    /** Action for the DeleteMethodResponse operation. */
    DeleteMethodResponse("apigateway:DeleteMethodResponse"),
    /** Action for the DeleteModel operation. */
    DeleteModel("apigateway:DeleteModel"),
    /** Action for the DeleteResource operation. */
    DeleteResource("apigateway:DeleteResource"),
    /** Action for the DeleteRestApi operation. */
    DeleteRestApi("apigateway:DeleteRestApi"),
    /** Action for the DeleteStage operation. */
    DeleteStage("apigateway:DeleteStage"),
    /** Action for the FlushStageCache operation. */
    FlushStageCache("apigateway:FlushStageCache"),
    /** Action for the GenerateClientCertificate operation. */
    GenerateClientCertificate("apigateway:GenerateClientCertificate"),
    /** Action for the GetAccount operation. */
    GetAccount("apigateway:GetAccount"),
    /** Action for the GetApiKey operation. */
    GetApiKey("apigateway:GetApiKey"),
    /** Action for the GetApiKeys operation. */
    GetApiKeys("apigateway:GetApiKeys"),
    /** Action for the GetBasePathMapping operation. */
    GetBasePathMapping("apigateway:GetBasePathMapping"),
    /** Action for the GetBasePathMappings operation. */
    GetBasePathMappings("apigateway:GetBasePathMappings"),
    /** Action for the GetClientCertificate operation. */
    GetClientCertificate("apigateway:GetClientCertificate"),
    /** Action for the GetClientCertificates operation. */
    GetClientCertificates("apigateway:GetClientCertificates"),
    /** Action for the GetDeployment operation. */
    GetDeployment("apigateway:GetDeployment"),
    /** Action for the GetDeployments operation. */
    GetDeployments("apigateway:GetDeployments"),
    /** Action for the GetDomainName operation. */
    GetDomainName("apigateway:GetDomainName"),
    /** Action for the GetDomainNames operation. */
    GetDomainNames("apigateway:GetDomainNames"),
    /** Action for the GetIntegration operation. */
    GetIntegration("apigateway:GetIntegration"),
    /** Action for the GetIntegrationResponse operation. */
    GetIntegrationResponse("apigateway:GetIntegrationResponse"),
    /** Action for the GetMethod operation. */
    GetMethod("apigateway:GetMethod"),
    /** Action for the GetMethodResponse operation. */
    GetMethodResponse("apigateway:GetMethodResponse"),
    /** Action for the GetModel operation. */
    GetModel("apigateway:GetModel"),
    /** Action for the GetModelTemplate operation. */
    GetModelTemplate("apigateway:GetModelTemplate"),
    /** Action for the GetModels operation. */
    GetModels("apigateway:GetModels"),
    /** Action for the GetResource operation. */
    GetResource("apigateway:GetResource"),
    /** Action for the GetResources operation. */
    GetResources("apigateway:GetResources"),
    /** Action for the GetRestApi operation. */
    GetRestApi("apigateway:GetRestApi"),
    /** Action for the GetRestApis operation. */
    GetRestApis("apigateway:GetRestApis"),
    /** Action for the GetSdk operation. */
    GetSdk("apigateway:GetSdk"),
    /** Action for the GetStage operation. */
    GetStage("apigateway:GetStage"),
    /** Action for the GetStages operation. */
    GetStages("apigateway:GetStages"),
    /** Action for the PutIntegration operation. */
    PutIntegration("apigateway:PutIntegration"),
    /** Action for the PutIntegrationResponse operation. */
    PutIntegrationResponse("apigateway:PutIntegrationResponse"),
    /** Action for the PutMethod operation. */
    PutMethod("apigateway:PutMethod"),
    /** Action for the PutMethodResponse operation. */
    PutMethodResponse("apigateway:PutMethodResponse"),
    /** Action for the TestInvokeMethod operation. */
    TestInvokeMethod("apigateway:TestInvokeMethod"),
    /** Action for the UpdateAccount operation. */
    UpdateAccount("apigateway:UpdateAccount"),
    /** Action for the UpdateApiKey operation. */
    UpdateApiKey("apigateway:UpdateApiKey"),
    /** Action for the UpdateBasePathMapping operation. */
    UpdateBasePathMapping("apigateway:UpdateBasePathMapping"),
    /** Action for the UpdateClientCertificate operation. */
    UpdateClientCertificate("apigateway:UpdateClientCertificate"),
    /** Action for the UpdateDeployment operation. */
    UpdateDeployment("apigateway:UpdateDeployment"),
    /** Action for the UpdateDomainName operation. */
    UpdateDomainName("apigateway:UpdateDomainName"),
    /** Action for the UpdateIntegration operation. */
    UpdateIntegration("apigateway:UpdateIntegration"),
    /** Action for the UpdateIntegrationResponse operation. */
    UpdateIntegrationResponse("apigateway:UpdateIntegrationResponse"),
    /** Action for the UpdateMethod operation. */
    UpdateMethod("apigateway:UpdateMethod"),
    /** Action for the UpdateMethodResponse operation. */
    UpdateMethodResponse("apigateway:UpdateMethodResponse"),
    /** Action for the UpdateModel operation. */
    UpdateModel("apigateway:UpdateModel"),
    /** Action for the UpdateResource operation. */
    UpdateResource("apigateway:UpdateResource"),
    /** Action for the UpdateRestApi operation. */
    UpdateRestApi("apigateway:UpdateRestApi"),
    /** Action for the UpdateStage operation. */
    UpdateStage("apigateway:UpdateStage"),

    ;

    private final String action;

    private ApigatewayActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}