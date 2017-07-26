/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <fullname>AWS CloudFormation</fullname>
 * <p>
 * AWS CloudFormation allows you to create and manage AWS infrastructure deployments predictably and repeatedly. You can
 * use AWS CloudFormation to leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic Block Store,
 * Amazon Simple Notification Service, Elastic Load Balancing, and Auto Scaling to build highly-reliable, highly
 * scalable, cost-effective applications without creating or configuring the underlying AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines
 * a collection of resources as a single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the resources for you.
 * </p>
 * <p>
 * For more information about AWS CloudFormation, see the <a href="http://aws.amazon.com/cloudformation/">AWS
 * CloudFormation Product Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific
 * AWS product, you can find the product's technical documentation at <a
 * href="http://docs.aws.amazon.com/">docs.aws.amazon.com</a>.
 * </p>
 * <p>
 * <i>APIs for stacks </i>
 * </p>
 * <p>
 * When you use AWS CloudFormation, you manage related resources as a single unit called a stack. You create, update,
 * and delete a collection of resources by creating, updating, and deleting stacks. All the resources in a stack are
 * defined by the stack's AWS CloudFormation template.
 * </p>
 * <p>
 * Actions
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CancelUpdateStack.html">
 * CancelUpdateStack</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ContinueUpdateRollback.html">
 * ContinueUpdateRollback</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStack.html">CreateStack</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeleteStack.html">DeleteStack</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackEvents.html">
 * DescribeStackEvents</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackResource.html">
 * DescribeStackResource</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackResources.html">
 * DescribeStackResources</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStacks.html">DescribeStacks</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_EstimateTemplateCost.html">
 * EstimateTemplateCost</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_GetStackPolicy.html">GetStackPolicy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_GetTemplate.html">GetTemplate</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_GetTemplateSummary.html">
 * GetTemplateSummary</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListExports.html">ListExports</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListImports.html">ListImports</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackResources.html">
 * ListStackResources</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStacks.html">ListStacks</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetStackPolicy.html">SetStackPolicy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStack.html">UpdateStack</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ValidateTemplate.html">ValidateTemplate<
 * /a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Data Types
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Export.html">Export</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ParameterConstraints.html">
 * ParameterConstraints</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ParameterDeclaration.html">
 * ParameterDeclaration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Stack.html">Stack</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackEvent.html">StackEvent</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackResource.html">StackResource</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackResourceDetail.html">
 * StackResourceDetail</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackResourceSummary.html">
 * StackResourceSummary</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackSummary.html">StackSummary</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Tag.html">Tag</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_TemplateParameter.html">
 * TemplateParameter</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>APIs for change sets</i>
 * </p>
 * <p>
 * If you need to make changes to the running resources in a stack, you update the stack. Before making changes to your
 * resources, you can generate a change set, which is summary of your proposed changes. Change sets allow you to see how
 * your changes might impact your running resources, especially for critical resources, before implementing them.
 * </p>
 * <p>
 * Actions
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateChangeSet.html">CreateChangeSet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeleteChangeSet.html">DeleteChangeSet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeChangeSet.html">
 * DescribeChangeSet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ExecuteChangeSet.html">ExecuteChangeSet<
 * /a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListChangeSets.html">ListChangeSets</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Data Types
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Change.html">Change</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ChangeSetSummary.html">ChangeSetSummary<
 * /a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ResourceChange.html">ResourceChange</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ResourceChangeDetail.html">
 * ResourceChangeDetail</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ResourceTargetDefinition.html">
 * ResourceTargetDefinition</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <i>APIs for stack sets</i>
 * </p>
 * <p>
 * AWS CloudFormation StackSets lets you create a collection, or stack set, of stacks that can automatically and safely
 * provision a common set of AWS resources across multiple AWS accounts and multiple AWS regions from a single AWS
 * CloudFormation template. When you create a stack set, AWS CloudFormation provisions a stack in each of the specified
 * accounts and regions by using the supplied AWS CloudFormation template and parameters. Stack sets let you manage a
 * common set of AWS resources in a selection of accounts and regions in a single operation.
 * </p>
 * <p>
 * Actions
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackInstances.html">
 * CreateStackInstances</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackSet.html">CreateStackSet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeleteStackInstances.html">
 * DeleteStackInstances</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DeleteStackSet.html">DeleteStackSet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackInstance.html">
 * DescribeStackInstance</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackSet.html">DescribeStackSet<
 * /a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_DescribeStackSetOperation.html">
 * DescribeStackSetOperation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackInstances.html">
 * ListStackInstances</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetOperationResults">
 * ListStackSetOperationResults</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSetOperations">
 * ListStackSetOperations</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ListStackSets">ListStackSets</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StopStackSetOperation.html">
 * StopStackSetOperation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html">UpdateStackSet</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Data Types
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackInstance.html.html">StackInstance</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackInstanceSummary.html.html">
 * StackInstanceSummary</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackSet.html">StackSet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackSetOperation.html.html">
 * StackSetOperation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackSetOperationPreferences.html.html">
 * StackSetOperationPreferences</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackSetOperationResultSummary.html.html"
 * >StackSetOperationResultSummary</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackSetOperationSummary.html.html">
 * StackSetOperationSummary</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_StackSetSummary.html">StackSetSummary</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Tag.html">Tag</a>
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.cloudformation;

