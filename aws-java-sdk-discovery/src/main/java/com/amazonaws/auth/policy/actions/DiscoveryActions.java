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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for AWS Application Discovery Service.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DiscoveryActions implements Action {

    /** Represents any action executed on AWS Application Discovery Service. */
    AllDiscoveryActions("discovery:*"),

    /** Action for the AssociateConfigurationItemsToApplication operation. */
    AssociateConfigurationItemsToApplication("discovery:AssociateConfigurationItemsToApplication"),
    /** Action for the BatchDeleteImportData operation. */
    BatchDeleteImportData("discovery:BatchDeleteImportData"),
    /** Action for the CreateApplication operation. */
    CreateApplication("discovery:CreateApplication"),
    /** Action for the CreateTags operation. */
    CreateTags("discovery:CreateTags"),
    /** Action for the DeleteApplications operation. */
    DeleteApplications("discovery:DeleteApplications"),
    /** Action for the DeleteTags operation. */
    DeleteTags("discovery:DeleteTags"),
    /** Action for the DescribeAgents operation. */
    DescribeAgents("discovery:DescribeAgents"),
    /** Action for the DescribeConfigurations operation. */
    DescribeConfigurations("discovery:DescribeConfigurations"),
    /** Action for the DescribeContinuousExports operation. */
    DescribeContinuousExports("discovery:DescribeContinuousExports"),
    /** Action for the DescribeExportConfigurations operation. */
    DescribeExportConfigurations("discovery:DescribeExportConfigurations"),
    /** Action for the DescribeExportTasks operation. */
    DescribeExportTasks("discovery:DescribeExportTasks"),
    /** Action for the DescribeImportTasks operation. */
    DescribeImportTasks("discovery:DescribeImportTasks"),
    /** Action for the DescribeTags operation. */
    DescribeTags("discovery:DescribeTags"),
    /** Action for the DisassociateConfigurationItemsFromApplication operation. */
    DisassociateConfigurationItemsFromApplication("discovery:DisassociateConfigurationItemsFromApplication"),
    /** Action for the ExportConfigurations operation. */
    ExportConfigurations("discovery:ExportConfigurations"),
    /** Action for the GetDiscoverySummary operation. */
    GetDiscoverySummary("discovery:GetDiscoverySummary"),
    /** Action for the ListConfigurations operation. */
    ListConfigurations("discovery:ListConfigurations"),
    /** Action for the ListServerNeighbors operation. */
    ListServerNeighbors("discovery:ListServerNeighbors"),
    /** Action for the StartContinuousExport operation. */
    StartContinuousExport("discovery:StartContinuousExport"),
    /** Action for the StartDataCollectionByAgentIds operation. */
    StartDataCollectionByAgentIds("discovery:StartDataCollectionByAgentIds"),
    /** Action for the StartExportTask operation. */
    StartExportTask("discovery:StartExportTask"),
    /** Action for the StartImportTask operation. */
    StartImportTask("discovery:StartImportTask"),
    /** Action for the StopContinuousExport operation. */
    StopContinuousExport("discovery:StopContinuousExport"),
    /** Action for the StopDataCollectionByAgentIds operation. */
    StopDataCollectionByAgentIds("discovery:StopDataCollectionByAgentIds"),
    /** Action for the UpdateApplication operation. */
    UpdateApplication("discovery:UpdateApplication"),

    ;

    private final String action;

    private DiscoveryActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
