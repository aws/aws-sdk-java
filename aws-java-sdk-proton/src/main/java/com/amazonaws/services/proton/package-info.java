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
 * <p>
 * This is the AWS Proton Service API Reference. It provides descriptions, syntax and usage examples for each of the <a
 * href="https://docs.aws.amazon.com/proton/latest/APIReference/API_Operations.html">actions</a> and <a
 * href="https://docs.aws.amazon.com/proton/latest/APIReference/API_Types.html">data types</a> for the AWS Proton
 * service.
 * </p>
 * <p>
 * The documentation for each action shows the Query API request parameters and the XML response.
 * </p>
 * <p>
 * Alternatively, you can use the AWS CLI to access an API. For more information, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS Command Line Interface User
 * Guide</a>.
 * </p>
 * <p>
 * The AWS Proton service is a two-pronged automation framework. Administrators create service templates to provide
 * standardized infrastructure and deployment tooling for serverless and container based applications. Developers, in
 * turn, select from the available service templates to automate their application or service deployments.
 * </p>
 * <p>
 * Because administrators define the infrastructure and tooling that AWS Proton deploys and manages, they need
 * permissions to use all of the listed API operations.
 * </p>
 * <p>
 * When developers select a specific infrastructure and tooling set, AWS Proton deploys their applications. To monitor
 * their applications that are running on AWS Proton, developers need permissions to the service <i>create</i>,
 * <i>list</i>, <i>update</i> and <i>delete</i> API operations and the service instance <i>list</i> and <i>update</i>
 * API operations.
 * </p>
 * <p>
 * To learn more about AWS Proton administration, see the <a
 * href="https://docs.aws.amazon.com/proton/latest/adminguide/Welcome.html">AWS Proton Administration Guide</a>.
 * </p>
 * <p>
 * To learn more about deploying serverless and containerized applications on AWS Proton, see the <a
 * href="https://docs.aws.amazon.com/proton/latest/userguide/Welcome.html">AWS Proton User Guide</a>.
 * </p>
 * <p>
 * <b>Ensuring Idempotency</b>
 * </p>
 * <p>
 * When you make a mutating API request, the request typically returns a result before the asynchronous workflows of the
 * operation are complete. Operations might also time out or encounter other server issues before they're complete, even
 * if the request already returned a result. This might make it difficult to determine whether the request succeeded.
 * Moreover, you might need to retry the request multiple times to ensure that the operation completes successfully.
 * However, if the original request and the subsequent retries are successful, the operation occurs multiple times. This
 * means that you might create more resources than you intended.
 * </p>
 * <p>
 * <i>Idempotency</i> ensures that an API request action completes no more than one time. With an idempotent request, if
 * the original request action completes successfully, any subsequent retries complete successfully without performing
 * any further actions. However, the result might contain updated information, such as the current creation status.
 * </p>
 * <p>
 * The following lists of APIs are grouped according to methods that ensure idempotency.
 * </p>
 * <p>
 * <b>Idempotent create APIs with a client token</b>
 * </p>
 * <p>
 * The API actions in this list support idempotency with the use of a <i>client token</i>. The corresponding AWS CLI
 * commands also support idempotency using a client token. A client token is a unique, case-sensitive string of up to 64
 * ASCII characters. To make an idempotent API request using one of these actions, specify a client token in the
 * request. We recommend that you <i>don't</i> reuse the same client token for other API requests. If you don’t provide
 * a client token for these APIs, a default client token is automatically provided by SDKs.
 * </p>
 * <p>
 * Given a request action that has succeeded:
 * </p>
 * <p>
 * If you retry the request using the same client token and the same parameters, the retry succeeds without performing
 * any further actions other than returning the original resource detail data in the response.
 * </p>
 * <p>
 * If you retry the request using the same client token, but one or more of the parameters are different, the retry
 * throws a <code>ValidationException</code> with an <code>IdempotentParameterMismatch</code> error.
 * </p>
 * <p>
 * Client tokens expire eight hours after a request is made. If you retry the request with the expired token, a new
 * resource is created.
 * </p>
 * <p>
 * If the original resource is deleted and you retry the request, a new resource is created.
 * </p>
 * <p>
 * Idempotent create APIs with a client token:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CreateEnvironmentTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateServiceTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateEnvironmentAccountConnection
 * </p>
 * </li>
 * </ul>
 * 
 * <pre>
 * <code> &lt;p&gt; &lt;b&gt;Idempotent delete APIs&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Given a request action that has succeeded:&lt;/p&gt; &lt;p&gt;When you retry the request with an API from this group and the resource was deleted, its metadata is returned in the response.&lt;/p&gt; &lt;p&gt;If you retry and the resource doesn't exist, the response is empty.&lt;/p&gt; &lt;p&gt;In both cases, the retry succeeds.&lt;/p&gt; &lt;p&gt;Idempotent delete APIs:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentTemplate&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentTemplateVersion&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteServiceTemplate&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteServiceTemplateVersion&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentAccountConnection&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Asynchronous idempotent delete APIs&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Given a request action that has succeeded:&lt;/p&gt; &lt;p&gt;If you retry the request with an API from this group, if the original request delete operation status is &lt;code&gt;DELETE_IN_PROGRESS&lt;/code&gt;, the retry returns the resource detail data in the response without performing any further actions.&lt;/p&gt; &lt;p&gt;If the original request delete operation is complete, a retry returns an empty response.&lt;/p&gt; &lt;p&gt;Asynchronous idempotent delete APIs:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironment&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteService&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
 * </pre>
 */
package com.amazonaws.services.proton;

