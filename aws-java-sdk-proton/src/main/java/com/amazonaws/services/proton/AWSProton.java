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
package com.amazonaws.services.proton;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.services.proton.waiters.AWSProtonWaiters;

/**
 * Interface for accessing AWS Proton.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.proton.AbstractAWSProton} instead.
 * </p>
 * <p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSProton {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "proton";

    /**
     * <p>
     * In a management account, an environment account connection request is accepted. When the environment account
     * connection request is accepted, AWS Proton can use the associated IAM role to provision environment
     * infrastructure resources in the associated environment account.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param acceptEnvironmentAccountConnectionRequest
     * @return Result of the AcceptEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.AcceptEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/AcceptEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptEnvironmentAccountConnectionResult acceptEnvironmentAccountConnection(
            AcceptEnvironmentAccountConnectionRequest acceptEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * Attempts to cancel an environment deployment on an <a>UpdateEnvironment</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-update.html">Update an environment</a> in the
     * <i>AWS Proton Administration guide</i>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateEnvironment</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelEnvironmentDeploymentRequest
     * @return Result of the CancelEnvironmentDeployment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CancelEnvironmentDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelEnvironmentDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    CancelEnvironmentDeploymentResult cancelEnvironmentDeployment(CancelEnvironmentDeploymentRequest cancelEnvironmentDeploymentRequest);

    /**
     * <p>
     * Attempts to cancel a service instance deployment on an <a>UpdateServiceInstance</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <i>Update a service instance</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-instance-update.html">AWS Proton Administration
     * guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-instance-update.html">AWS
     * Proton User guide</a>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateServiceInstance</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelServiceInstanceDeploymentRequest
     * @return Result of the CancelServiceInstanceDeployment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CancelServiceInstanceDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelServiceInstanceDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    CancelServiceInstanceDeploymentResult cancelServiceInstanceDeployment(CancelServiceInstanceDeploymentRequest cancelServiceInstanceDeploymentRequest);

    /**
     * <p>
     * Attempts to cancel a service pipeline deployment on an <a>UpdateServicePipeline</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <i>Update a service pipeline</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-pipeline-update.html">AWS Proton Administration
     * guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-pipeline-update.html">AWS
     * Proton User guide</a>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateServicePipeline</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelServicePipelineDeploymentRequest
     * @return Result of the CancelServicePipelineDeployment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CancelServicePipelineDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelServicePipelineDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    CancelServicePipelineDeploymentResult cancelServicePipelineDeployment(CancelServicePipelineDeploymentRequest cancelServicePipelineDeploymentRequest);

    /**
     * <p>
     * Deploy a new environment. An AWS Proton environment is created from an environment template that defines
     * infrastructure and resources that can be shared across services. For more information, see the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-environments.html">Environments</a> in the <i>AWS
     * Proton Administration Guide.</i>
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Create an environment account connection in an environment account so that environment infrastructure resources
     * can be provisioned in the environment account from the management account.
     * </p>
     * <p>
     * An environment account connection is a secure bi-directional connection between a <i>management account</i> and
     * an <i>environment account</i> that maintains authorization and permissions. For more information, see <a
     * href="proton/latest/adminguide/ag-env-account-connections.html">Environment account connections</a> in the <i>AWS
     * Proton Administration guide</i>.
     * </p>
     * 
     * @param createEnvironmentAccountConnectionRequest
     * @return Result of the CreateEnvironmentAccountConnection operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEnvironmentAccountConnectionResult createEnvironmentAccountConnection(
            CreateEnvironmentAccountConnectionRequest createEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * Create an environment template for AWS Proton. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment Templates</a> in
     * the <i>AWS Proton Administration Guide</i>.
     * </p>
     * <p>
     * You can create an environment template in one of the two following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Register and publish a <i>standard</i> environment template that instructs AWS Proton to deploy and manage
     * environment infrastructure.
     * </p>
     * </li>
     * <li>
     * <p>
     * Register and publish a <i>customer managed</i> environment template that connects AWS Proton to your existing
     * provisioned infrastructure that you manage. AWS Proton <i>doesn't</i> manage your existing provisioned
     * infrastructure. To create an environment template for customer provisioned and managed infrastructure, include
     * the <code>provisioning</code> parameter and set the value to <code>CUSTOMER_MANAGED</code>. For more information,
     * see <a href="https://docs.aws.amazon.com/proton/latest/adminguide/env-template-v1.html">Register and publish an
     * environment template</a> in the <i>AWS Proton Administration Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEnvironmentTemplateRequest
     * @return Result of the CreateEnvironmentTemplate operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEnvironmentTemplateResult createEnvironmentTemplate(CreateEnvironmentTemplateRequest createEnvironmentTemplateRequest);

    /**
     * <p>
     * Create a new major or minor version of an environment template. A major version of an environment template is a
     * version that <i>isn't</i> backwards compatible. A minor version of an environment template is a version that's
     * backwards compatible within its major version.
     * </p>
     * 
     * @param createEnvironmentTemplateVersionRequest
     * @return Result of the CreateEnvironmentTemplateVersion operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEnvironmentTemplateVersionResult createEnvironmentTemplateVersion(CreateEnvironmentTemplateVersionRequest createEnvironmentTemplateVersionRequest);

    /**
     * <p>
     * Create an AWS Proton service. An AWS Proton service is an instantiation of a service template and often includes
     * several service instances and pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-services.html">Services</a> in the <i>AWS Proton
     * Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-service.html">Services</a> in the <i>AWS Proton User
     * Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    CreateServiceResult createService(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Create a service template. The administrator creates a service template to define standardized infrastructure and
     * an optional CICD service pipeline. Developers, in turn, select the service template from AWS Proton. If the
     * selected service template includes a service pipeline definition, they provide a link to their source code
     * repository. AWS Proton then deploys and manages the infrastructure defined by the selected service template. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/managing-svc-templates.html">Service Templates</a> in
     * the <i>AWS Proton Administration Guide</i>.
     * </p>
     * 
     * @param createServiceTemplateRequest
     * @return Result of the CreateServiceTemplate operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    CreateServiceTemplateResult createServiceTemplate(CreateServiceTemplateRequest createServiceTemplateRequest);

    /**
     * <p>
     * Create a new major or minor version of a service template. A major version of a service template is a version
     * that <i>isn't</i> backwards compatible. A minor version of a service template is a version that's backwards
     * compatible within its major version.
     * </p>
     * 
     * @param createServiceTemplateVersionRequest
     * @return Result of the CreateServiceTemplateVersion operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateServiceTemplateVersionResult createServiceTemplateVersion(CreateServiceTemplateVersionRequest createServiceTemplateVersionRequest);

    /**
     * <p>
     * Delete an environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * In an environment account, delete an environment account connection.
     * </p>
     * <p>
     * After you delete an environment account connection that’s in use by an AWS Proton environment, AWS Proton
     * <i>can’t</i> manage the environment infrastructure resources until a new environment account connection is
     * accepted for the environment account and associated environment. You're responsible for cleaning up provisioned
     * resources that remain without an environment connection.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param deleteEnvironmentAccountConnectionRequest
     * @return Result of the DeleteEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentAccountConnectionResult deleteEnvironmentAccountConnection(
            DeleteEnvironmentAccountConnectionRequest deleteEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * If no other major or minor versions of an environment template exist, delete the environment template.
     * </p>
     * 
     * @param deleteEnvironmentTemplateRequest
     * @return Result of the DeleteEnvironmentTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentTemplateResult deleteEnvironmentTemplate(DeleteEnvironmentTemplateRequest deleteEnvironmentTemplateRequest);

    /**
     * <p>
     * If no other minor versions of an environment template exist, delete a major version of the environment template
     * if it's not the <code>Recommended</code> version. Delete the <code>Recommended</code> version of the environment
     * template if no other major versions or minor versions of the environment template exist. A major version of an
     * environment template is a version that's not backwards compatible.
     * </p>
     * <p>
     * Delete a minor version of an environment template if it <i>isn't</i> the <code>Recommended</code> version. Delete
     * a <code>Recommended</code> minor version of the environment template if no other minor versions of the
     * environment template exist. A minor version of an environment template is a version that's backwards compatible.
     * </p>
     * 
     * @param deleteEnvironmentTemplateVersionRequest
     * @return Result of the DeleteEnvironmentTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentTemplateVersionResult deleteEnvironmentTemplateVersion(DeleteEnvironmentTemplateVersionRequest deleteEnvironmentTemplateVersionRequest);

    /**
     * <p>
     * Delete a service.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * If no other major or minor versions of the service template exist, delete the service template.
     * </p>
     * 
     * @param deleteServiceTemplateRequest
     * @return Result of the DeleteServiceTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteServiceTemplateResult deleteServiceTemplate(DeleteServiceTemplateRequest deleteServiceTemplateRequest);

    /**
     * <p>
     * If no other minor versions of a service template exist, delete a major version of the service template if it's
     * not the <code>Recommended</code> version. Delete the <code>Recommended</code> version of the service template if
     * no other major versions or minor versions of the service template exist. A major version of a service template is
     * a version that <i>isn't</i> backwards compatible.
     * </p>
     * <p>
     * Delete a minor version of a service template if it's not the <code>Recommended</code> version. Delete a
     * <code>Recommended</code> minor version of the service template if no other minor versions of the service template
     * exist. A minor version of a service template is a version that's backwards compatible.
     * </p>
     * 
     * @param deleteServiceTemplateVersionRequest
     * @return Result of the DeleteServiceTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteServiceTemplateVersionResult deleteServiceTemplateVersion(DeleteServiceTemplateVersionRequest deleteServiceTemplateVersionRequest);

    /**
     * <p>
     * Get detail data for the AWS Proton pipeline service role.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Get detail data for an environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * In an environment account, view the detail data for an environment account connection.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param getEnvironmentAccountConnectionRequest
     * @return Result of the GetEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnvironmentAccountConnectionResult getEnvironmentAccountConnection(GetEnvironmentAccountConnectionRequest getEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * Get detail data for an environment template.
     * </p>
     * 
     * @param getEnvironmentTemplateRequest
     * @return Result of the GetEnvironmentTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    GetEnvironmentTemplateResult getEnvironmentTemplate(GetEnvironmentTemplateRequest getEnvironmentTemplateRequest);

    /**
     * <p>
     * View detail data for a major or minor version of an environment template.
     * </p>
     * 
     * @param getEnvironmentTemplateVersionRequest
     * @return Result of the GetEnvironmentTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnvironmentTemplateVersionResult getEnvironmentTemplateVersion(GetEnvironmentTemplateVersionRequest getEnvironmentTemplateVersionRequest);

    /**
     * <p>
     * Get detail data for a service.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetService" target="_top">AWS API
     *      Documentation</a>
     */
    GetServiceResult getService(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Get detail data for a service instance. A service instance is an instantiation of service template, which is
     * running in a specific environment.
     * </p>
     * 
     * @param getServiceInstanceRequest
     * @return Result of the GetServiceInstance operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetServiceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceInstance" target="_top">AWS API
     *      Documentation</a>
     */
    GetServiceInstanceResult getServiceInstance(GetServiceInstanceRequest getServiceInstanceRequest);

    /**
     * <p>
     * Get detail data for a service template.
     * </p>
     * 
     * @param getServiceTemplateRequest
     * @return Result of the GetServiceTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    GetServiceTemplateResult getServiceTemplate(GetServiceTemplateRequest getServiceTemplateRequest);

    /**
     * <p>
     * View detail data for a major or minor version of a service template.
     * </p>
     * 
     * @param getServiceTemplateVersionRequest
     * @return Result of the GetServiceTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceTemplateVersionResult getServiceTemplateVersion(GetServiceTemplateVersionRequest getServiceTemplateVersionRequest);

    /**
     * <p>
     * View a list of environment account connections.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param listEnvironmentAccountConnectionsRequest
     * @return Result of the ListEnvironmentAccountConnections operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListEnvironmentAccountConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentAccountConnections"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentAccountConnectionsResult listEnvironmentAccountConnections(ListEnvironmentAccountConnectionsRequest listEnvironmentAccountConnectionsRequest);

    /**
     * <p>
     * List major or minor versions of an environment template with detail data.
     * </p>
     * 
     * @param listEnvironmentTemplateVersionsRequest
     * @return Result of the ListEnvironmentTemplateVersions operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListEnvironmentTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentTemplateVersionsResult listEnvironmentTemplateVersions(ListEnvironmentTemplateVersionsRequest listEnvironmentTemplateVersionsRequest);

    /**
     * <p>
     * List environment templates.
     * </p>
     * 
     * @param listEnvironmentTemplatesRequest
     * @return Result of the ListEnvironmentTemplates operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListEnvironmentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentTemplatesResult listEnvironmentTemplates(ListEnvironmentTemplatesRequest listEnvironmentTemplatesRequest);

    /**
     * <p>
     * List environments with detail data summaries.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * List service instances with summaries of detail data.
     * </p>
     * 
     * @param listServiceInstancesRequest
     * @return Result of the ListServiceInstances operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListServiceInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ListServiceInstancesResult listServiceInstances(ListServiceInstancesRequest listServiceInstancesRequest);

    /**
     * <p>
     * List major or minor versions of a service template with detail data.
     * </p>
     * 
     * @param listServiceTemplateVersionsRequest
     * @return Result of the ListServiceTemplateVersions operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListServiceTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListServiceTemplateVersionsResult listServiceTemplateVersions(ListServiceTemplateVersionsRequest listServiceTemplateVersionsRequest);

    /**
     * <p>
     * List service templates with detail data.
     * </p>
     * 
     * @param listServiceTemplatesRequest
     * @return Result of the ListServiceTemplates operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListServiceTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    ListServiceTemplatesResult listServiceTemplates(ListServiceTemplatesRequest listServiceTemplatesRequest);

    /**
     * <p>
     * List services with summaries of detail data.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * List tags for a resource. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * In a management account, reject an environment account connection from another environment account.
     * </p>
     * <p>
     * After you reject an environment account connection request, you <i>won’t</i> be able to accept or use the
     * rejected environment account connection.
     * </p>
     * <p>
     * You <i>can’t</i> reject an environment account connection that is connected to an environment.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param rejectEnvironmentAccountConnectionRequest
     * @return Result of the RejectEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.RejectEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/RejectEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    RejectEnvironmentAccountConnectionResult rejectEnvironmentAccountConnection(
            RejectEnvironmentAccountConnectionRequest rejectEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * Tag a resource. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove a tag from a resource. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update the AWS Proton pipeline service account settings.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Update an environment.
     * </p>
     * <p>
     * If the environment is associated with an environment account connection, <i>don't</i> update or include the
     * <code>protonServiceRoleArn</code> parameter to update or connect to an environment account connection.
     * </p>
     * <p>
     * You can only update to a new environment account connection if it was created in the same environment account
     * that the current environment account connection was created in and associated with the current environment.
     * </p>
     * <p>
     * If the environment <i>isn't</i> associated with an environment account connection, <i>don't</i> update or include
     * the <code>environmentAccountConnectionId</code> parameter to update or connect to an environment account
     * connection.
     * </p>
     * <p>
     * You can update either the <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code>
     * parameter and value. You can’t update both.
     * </p>
     * <p>
     * There are four modes for updating an environment as described in the following. The <code>deploymentType</code>
     * field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that's higher than
     * the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * In an environment account, update an environment account connection to use a new IAM role.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param updateEnvironmentAccountConnectionRequest
     * @return Result of the UpdateEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnvironmentAccountConnectionResult updateEnvironmentAccountConnection(
            UpdateEnvironmentAccountConnectionRequest updateEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * Update an environment template.
     * </p>
     * 
     * @param updateEnvironmentTemplateRequest
     * @return Result of the UpdateEnvironmentTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnvironmentTemplateResult updateEnvironmentTemplate(UpdateEnvironmentTemplateRequest updateEnvironmentTemplateRequest);

    /**
     * <p>
     * Update a major or minor version of an environment template.
     * </p>
     * 
     * @param updateEnvironmentTemplateVersionRequest
     * @return Result of the UpdateEnvironmentTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnvironmentTemplateVersionResult updateEnvironmentTemplateVersion(UpdateEnvironmentTemplateVersionRequest updateEnvironmentTemplateVersionRequest);

    /**
     * <p>
     * Edit a service description or use a spec to add and delete service instances.
     * </p>
     * <note>
     * <p>
     * Existing service instances and the service pipeline <i>can't</i> be edited using this API. They can only be
     * deleted.
     * </p>
     * </note>
     * <p>
     * Use the <code>description</code> parameter to modify the description.
     * </p>
     * <p>
     * Edit the <code>spec</code> parameter to add or delete instances.
     * </p>
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest);

    /**
     * <p>
     * Update a service instance.
     * </p>
     * <p>
     * There are four modes for updating a service instance as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service instance is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateServiceInstanceRequest
     * @return Result of the UpdateServiceInstance operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateServiceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceInstance" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateServiceInstanceResult updateServiceInstance(UpdateServiceInstanceRequest updateServiceInstanceRequest);

    /**
     * <p>
     * Update the service pipeline.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateServicePipelineRequest
     * @return Result of the UpdateServicePipeline operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateServicePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServicePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateServicePipelineResult updateServicePipeline(UpdateServicePipelineRequest updateServicePipelineRequest);

    /**
     * <p>
     * Update a service template.
     * </p>
     * 
     * @param updateServiceTemplateRequest
     * @return Result of the UpdateServiceTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateServiceTemplateResult updateServiceTemplate(UpdateServiceTemplateRequest updateServiceTemplateRequest);

    /**
     * <p>
     * Update a major or minor version of a service template.
     * </p>
     * 
     * @param updateServiceTemplateVersionRequest
     * @return Result of the UpdateServiceTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateServiceTemplateVersionResult updateServiceTemplateVersion(UpdateServiceTemplateVersionRequest updateServiceTemplateVersionRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AWSProtonWaiters waiters();

}
