/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>AWS CodeDeploy</fullname>
 * <p>
 * AWS CodeDeploy is a deployment service that automates application deployments to Amazon EC2 instances, on-premises
 * instances running in your own facility, or serverless AWS Lambda functions.
 * </p>
 * <p>
 * You can deploy a nearly unlimited variety of application content, such as an updated Lambda function, code, web and
 * configuration files, executables, packages, scripts, multimedia files, and so on. AWS CodeDeploy can deploy
 * application content stored in Amazon S3 buckets, GitHub repositories, or Bitbucket repositories. You do not need to
 * make changes to your existing code before you can use AWS CodeDeploy.
 * </p>
 * <p>
 * AWS CodeDeploy makes it easier for you to rapidly release new features, helps you avoid downtime during application
 * deployment, and handles the complexity of updating your applications, without many of the risks associated with
 * error-prone manual deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Components</b>
 * </p>
 * <p>
 * Use the information in this guide to help you work with the following AWS CodeDeploy components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Application</b>: A name that uniquely identifies the application you want to deploy. AWS CodeDeploy uses this
 * name, which functions as a container, to ensure the correct combination of revision, deployment configuration, and
 * deployment group are referenced during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment group</b>: A set of individual instances or CodeDeploy Lambda applications. A Lambda deployment group
 * contains a group of applications. An EC2/On-premises deployment group contains individually tagged instances, Amazon
 * EC2 instances in Auto Scaling groups, or both.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment configuration</b>: A set of deployment rules and deployment success and failure conditions used by AWS
 * CodeDeploy during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment</b>: The process and the components used in the process of updating a Lambda function or of installing
 * content on one or more instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Application revisions</b>: For an AWS Lambda deployment, this is an AppSpec file that specifies the Lambda
 * function to update and one or more functions to validate deployment lifecycle events. For an EC2/On-premises
 * deployment, this is an archive file containing source content—source code, web pages, executable files, and
 * deployment scripts—along with an AppSpec file. Revisions are stored in Amazon S3 buckets or GitHub repositories. For
 * Amazon S3, a revision is uniquely identified by its Amazon S3 object key and its ETag, version, or both. For GitHub,
 * a revision is uniquely identified by its commit ID.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This guide also contains information to help you get details about the instances in your deployments, to make
 * on-premises instances available for AWS CodeDeploy deployments, and to get details about a Lambda function
 * deployment.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Information Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy User Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/codedeploy/latest/APIReference/">AWS CodeDeploy API Reference Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/cli/latest/reference/deploy/index.html">AWS CLI Reference for AWS CodeDeploy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://forums.aws.amazon.com/forum.jspa?forumID=179">AWS CodeDeploy Developer Forum</a>
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.codedeploy;

