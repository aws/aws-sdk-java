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
 * <fullname>AWS Cloud9</fullname>
 * <p>
 * AWS Cloud9 is a collection of tools that you can use to code, build, run, test, debug, and release software in the
 * cloud.
 * </p>
 * <p>
 * In the background, these tools are available through development environments running on Amazon Elastic Compute Cloud
 * (Amazon EC2) instances (known as <i>Amazon EC2 environments</i>), your own servers (known as <i>SSH
 * environments</i>), or a combination. This enables you to create and switch between multiple environments, with each
 * environment set up for a specific development project.
 * </p>
 * <p>
 * For more information about AWS Cloud9, see the <i>AWS Cloud9 User Guide</i>.
 * </p>
 * <p>
 * AWS Cloud9 supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateEnvironmentEC2</code>: Creates an AWS Cloud9 development environment, launches an Amazon EC2 instance,
 * and then hosts the environment on the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateEnvironmentMembership</code>: Adds an environment member to an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironment</code>: Deletes an environment. If the environment is hosted on an Amazon EC2 instance, also
 * terminates the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironmentMembership</code>: Deletes an environment member from an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentMemberships</code>: Gets information about environment members for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironments</code>: Gets information about environments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentStatus</code>: Gets status information for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListEnvironments</code>: Gets a list of environment identifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironment</code>: Changes the settings of an existing environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironmentMembership</code>: Changes the settings of an existing environment member for an environment.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.cloud9;

