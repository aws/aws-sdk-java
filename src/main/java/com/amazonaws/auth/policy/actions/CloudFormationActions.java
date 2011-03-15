/*
 * Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.auth.policy.Statement;
import com.amazonaws.services.cloudformation.AmazonCloudFormation;

/**
 * The available AWS access policy actions for AWS Cloud Formation.
 *
 * @see Statement#setActions(java.util.Collection)
 */
public enum CloudFormationActions implements Action {

	/**
	 * Action for the CreateStack operation on AWS Cloud Formation.
	 *
	 * @see AmazonCloudFormation#createStack(com.amazonaws.services.cloudformation.model.CreateStackRequest)
	 */
	CreateStack("cloudformation:CreateStack"),

    /**
     * Action for the DeleteStack operation on AWS Cloud Formation.
     *
     * @see AmazonCloudFormation#deleteStack(com.amazonaws.services.cloudformation.model.DeleteStackRequest)
     */
    DeleteStack("cloudformation:DeleteStack"),

    /**
     * Action for the DescribeStacks operation on AWS Cloud Formation.
     *
     * @see AmazonCloudFormation#describeStacks(com.amazonaws.services.cloudformation.model.DescribeStacksRequest)
     */
    DescribeStacks("cloudformation:DescribeStacks"),

    /**
     * Action for the DescribeStackEvents operation on AWS Cloud Formation.
     *
     * @see AmazonCloudFormation#describeStackEvents(com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest)
     */
    DescribeStackEvents("cloudformation:DescribeStackEvents"),

    /**
     * Action for the DescribeStackResources operation on AWS Cloud Formation.
     *
     * @see AmazonCloudFormation#describeStackResources(com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest)
     */
    DescribeStackResources("cloudformation:DescribeStackResources"),

    /**
     * Action for the GetTemplate operation on AWS Cloud Formation.
     *
     * @see AmazonCloudFormation#getTemplate(com.amazonaws.services.cloudformation.model.GetTemplateRequest)
     */
    GetTemplate("cloudformation:GetTemplate"),

    /**
     * Action for the ValidateTemplate operation on AWS Cloud Formation.
     *
     * @see AmazonCloudFormation#validateTemplate(com.amazonaws.services.cloudformation.model.ValidateTemplateRequest)
     */
    ValidateTemplate("cloudformation:ValidateTemplate");


	private final String action;

	private CloudFormationActions(String action) {
		this.action = action;
	}

	/* (non-Javadoc)
	 * @see com.amazonaws.auth.policy.Action#getActionName()
	 */
	@Override
	public String getActionName() {
		return action;
	}

}
