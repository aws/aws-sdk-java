/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The available AWS access control policy actions for AWS CloudFormation.
 */
public enum CloudFormationActions implements Action {
    /** Represents any action executed on AWS CloudFormation. */
    AllCloudFormationActions("CloudFormation:*"),

    /** Action for the CreateStack operation. */
    CreateStack("CloudFormation:CreateStack"),

    /** Action for the DeleteStack operation. */
    DeleteStack("CloudFormation:DeleteStack"),

    /** Action for the DescribeStackEvents operation. */
    DescribeStackEvents("CloudFormation:DescribeStackEvents"),

    /** Action for the DescribeStackResource operation. */
    DescribeStackResource("CloudFormation:DescribeStackResource"),

    /** Action for the DescribeStackResources operation. */
    DescribeStackResources("CloudFormation:DescribeStackResources"),

    /** Action for the DescribeStacks operation. */
    DescribeStacks("CloudFormation:DescribeStacks"),

    /** Action for the EstimateTemplateCost operation. */
    EstimateTemplateCost("CloudFormation:EstimateTemplateCost"),

    /** Action for the GetTemplate operation. */
    GetTemplate("CloudFormation:GetTemplate"),

    /** Action for the ListStacks operation. */
    ListStacks("CloudFormation:ListStacks"),

    /** Action for the ListStackResources operation. */
    ListStackResources("CloudFormation:ListStackResources"),

    /** Action for the UpdateStack operation. */
    UpdateStack("CloudFormation:UpdateStack"),

    /** Action for the ValidateTemplate operation. */
    ValidateTemplate("CloudFormation:ValidateTemplate");

    private final String action;

    private CloudFormationActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
