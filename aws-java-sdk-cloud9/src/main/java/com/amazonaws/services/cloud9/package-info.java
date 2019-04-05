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

/**
 * <fullname>AWS Cloud9</fullname>
 * <p>
 * AWS Cloud9 is a collection of tools that you can use to code, build, run, test, debug, and release software in the
 * cloud.
 * </p>
 * <p>
 * For more information about AWS Cloud9, see the <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide">AWS
 * Cloud9 User Guide</a>.
 * </p>
 * <p>
 * AWS Cloud9 supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateEnvironmentEC2</code>: Creates an AWS Cloud9 development environment, launches an Amazon EC2 instance,
 * and then connects from the instance to the environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateEnvironmentMembership</code>: Adds an environment member to an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironment</code>: Deletes an environment. If an Amazon EC2 instance is connected to the environment,
 * also terminates the instance.
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

