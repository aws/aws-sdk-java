/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>AWS CodeStar Connections</fullname>
 * <p>
 * This AWS CodeStar Connections API Reference provides descriptions and usage examples of the operations and data types
 * for the AWS CodeStar Connections API. You can use the connections API to work with connections and installations.
 * </p>
 * <p>
 * <i>Connections</i> are configurations that you use to connect AWS resources to external code repositories. Each
 * connection is a resource that can be given to services such as CodePipeline to connect to a third-party repository
 * such as Bitbucket. For example, you can add the connection in CodePipeline so that it triggers your pipeline when a
 * code change is made to your third-party code repository. Each connection is named and associated with a unique ARN
 * that is used to reference the connection.
 * </p>
 * <p>
 * When you create a connection, the console initiates a third-party connection handshake. <i>Installations</i> are the
 * apps that are used to conduct this handshake. For example, the installation for the Bitbucket provider type is the
 * Bitbucket app. When you create a connection, you can choose an existing installation or create one.
 * </p>
 * <p>
 * When you want to create a connection to an installed provider type such as GitHub Enterprise Server, you create a
 * <i>host</i> for your connections.
 * </p>
 * <p>
 * You can work with connections by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateConnection</a>, which creates a uniquely named connection that can be referenced by services such as
 * CodePipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteConnection</a>, which deletes the specified connection.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetConnection</a>, which returns information about the connection, including the connection status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListConnections</a>, which lists the connections associated with your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can work with hosts by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateHost</a>, which creates a host that represents the infrastructure where your provider is installed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteHost</a>, which deletes the specified host.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetHost</a>, which returns information about the host, including the setup status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListHosts</a>, which lists the hosts associated with your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can work with tags in AWS CodeStar Connections by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS
 * CodeStar Connections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in AWS CodeStar Connections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in AWS CodeStar Connections.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeStar Connections, see the <a
 * href="https://docs.aws.amazon.com/dtconsole/latest/userguide/welcome-connections.html">Developer Tools User
 * Guide</a>.
 * </p>
 */
package com.amazonaws.services.codestarconnections;

