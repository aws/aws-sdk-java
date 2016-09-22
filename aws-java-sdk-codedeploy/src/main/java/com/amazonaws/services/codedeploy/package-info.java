/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <b>Overview</b>
 * </p>
 * <p>
 * This reference guide provides descriptions of the AWS CodeDeploy APIs. For more information about AWS CodeDeploy, see
 * the <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy User Guide</a>.
 * </p>
 * <p>
 * <b>Using the APIs</b>
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to work with the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Applications are unique identifiers used by AWS CodeDeploy to ensure the correct combinations of revisions,
 * deployment configurations, and deployment groups are being referenced during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update applications.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment configurations are sets of deployment rules and success and failure conditions used by AWS CodeDeploy
 * during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, and list deployment configurations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment groups are groups of instances to which application revisions can be deployed.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update deployment groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * Instances represent Amazon EC2 instances to which application revisions are deployed. Instances are identified by
 * their Amazon EC2 tags or Auto Scaling group names. Instances belong to deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get and list instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployments represent the process of deploying revisions to instances.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, get, list, and stop deployments.
 * </p>
 * </li>
 * <li>
 * <p>
 * Application revisions are archive files stored in Amazon S3 buckets or GitHub repositories. These revisions contain
 * source content (such as source code, web pages, executable files, and deployment scripts) along with an application
 * specification (AppSpec) file. (The AppSpec file is unique to AWS CodeDeploy; it defines the deployment actions you
 * want AWS CodeDeploy to execute.) For application revisions stored in Amazon S3 buckets, an application revision is
 * uniquely identified by its Amazon S3 object key and its ETag, version, or both. For application revisions stored in
 * GitHub repositories, an application revision is uniquely identified by its repository name and commit ID. Application
 * revisions are deployed through deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get, list, and register application revisions.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.codedeploy;

