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
package com.amazonaws.services.apprunner;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.apprunner.model.*;

/**
 * Interface for accessing AWS App Runner.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apprunner.AbstractAWSAppRunner} instead.
 * </p>
 * <p>
 * <fullname>AWS App Runner</fullname>
 * <p>
 * AWS App Runner is an application service that provides a fast, simple, and cost-effective way to go directly from an
 * existing container image or source code to a running service in the AWS cloud in seconds. You don't need to learn new
 * technologies, decide which compute service to use, or understand how to provision and configure AWS resources.
 * </p>
 * <p>
 * App Runner connects directly to your container registry or source code repository. It provides an automatic delivery
 * pipeline with fully managed operations, high performance, scalability, and security.
 * </p>
 * <p>
 * For more information about App Runner, see the <a href="https://docs.aws.amazon.com/apprunner/latest/dg/">AWS App
 * Runner Developer Guide</a>. For release information, see the <a
 * href="https://docs.aws.amazon.com/apprunner/latest/relnotes/">AWS App Runner Release Notes</a>.
 * </p>
 * <p>
 * To install the Software Development Kits (SDKs), Integrated Development Environment (IDE) Toolkits, and command line
 * tools that you can use to access the API, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of Region-specific endpoints that App Runner supports, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and quotas</a> in the
 * <i>AWS General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppRunner {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "apprunner";

    /**
     * <p>
     * Associate your own domain name with the AWS App Runner subdomain URL of your App Runner service.
     * </p>
     * <p>
     * After you call <code>AssociateCustomDomain</code> and receive a successful response, use the information in the
     * <a>CustomDomain</a> record that's returned to add CNAME records to your Domain Name System (DNS). For each mapped
     * domain name, add a mapping to the target App Runner subdomain and one or more certificate validation records. App
     * Runner then performs DNS validation to verify that you own or control the domain name that you associated. App
     * Runner tracks domain validity in a certificate stored in <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide">AWS Certificate Manager (ACM)</a>.
     * </p>
     * 
     * @param associateCustomDomainRequest
     * @return Result of the AssociateCustomDomain operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.AssociateCustomDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/AssociateCustomDomain"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateCustomDomainResult associateCustomDomain(AssociateCustomDomainRequest associateCustomDomainRequest);

    /**
     * <p>
     * Create an AWS App Runner automatic scaling configuration resource. App Runner requires this resource when you
     * create App Runner services that require non-default auto scaling settings. You can share an auto scaling
     * configuration across multiple services.
     * </p>
     * <p>
     * Create multiple revisions of a configuration by using the same <code>AutoScalingConfigurationName</code> and
     * different <code>AutoScalingConfigurationRevision</code> values. When you create a service, you can set it to use
     * the latest active revision of an auto scaling configuration or a specific revision.
     * </p>
     * <p>
     * Configure a higher <code>MinSize</code> to increase the spread of your App Runner service over more Availability
     * Zones in the AWS Region. The tradeoff is a higher minimal cost.
     * </p>
     * <p>
     * Configure a lower <code>MaxSize</code> to control your cost. The tradeoff is lower responsiveness during peak
     * demand.
     * </p>
     * 
     * @param createAutoScalingConfigurationRequest
     * @return Result of the CreateAutoScalingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ServiceQuotaExceededException
     *         App Runner can't create this resource. You've reached your account quota for this resource type.</p>
     *         <p>
     *         For App Runner per-resource quotas, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and
     *         quotas</a> in the <i>AWS General Reference</i>.
     * @sample AWSAppRunner.CreateAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAutoScalingConfigurationResult createAutoScalingConfiguration(CreateAutoScalingConfigurationRequest createAutoScalingConfigurationRequest);

    /**
     * <p>
     * Create an AWS App Runner connection resource. App Runner requires a connection resource when you create App
     * Runner services that access private repositories from certain third-party providers. You can share a connection
     * across multiple services.
     * </p>
     * <p>
     * A connection resource is needed to access GitHub repositories. GitHub requires a user interface approval process
     * through the App Runner console before you can use the connection.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ServiceQuotaExceededException
     *         App Runner can't create this resource. You've reached your account quota for this resource type.</p>
     *         <p>
     *         For App Runner per-resource quotas, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and
     *         quotas</a> in the <i>AWS General Reference</i>.
     * @sample AWSAppRunner.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Create an AWS App Runner service. After the service is created, the action also automatically starts a
     * deployment.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a href="https://docs.aws.amazon.com/apprunner/latest/api/API_ListOperations.html">ListOperations</a> call to
     * track the operation's progress.
     * </p>
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ServiceQuotaExceededException
     *         App Runner can't create this resource. You've reached your account quota for this resource type.</p>
     *         <p>
     *         For App Runner per-resource quotas, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and
     *         quotas</a> in the <i>AWS General Reference</i>.
     * @sample AWSAppRunner.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    CreateServiceResult createService(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Delete an AWS App Runner automatic scaling configuration resource. You can delete a specific revision or the
     * latest active revision. You can't delete a configuration that's used by one or more App Runner services.
     * </p>
     * 
     * @param deleteAutoScalingConfigurationRequest
     * @return Result of the DeleteAutoScalingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @sample AWSAppRunner.DeleteAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAutoScalingConfigurationResult deleteAutoScalingConfiguration(DeleteAutoScalingConfigurationRequest deleteAutoScalingConfigurationRequest);

    /**
     * <p>
     * Delete an AWS App Runner connection. You must first ensure that there are no running App Runner services that use
     * this connection. If there are any, the <code>DeleteConnection</code> action fails.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Delete an AWS App Runner service.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * Return a full description of an AWS App Runner automatic scaling configuration resource.
     * </p>
     * 
     * @param describeAutoScalingConfigurationRequest
     * @return Result of the DescribeAutoScalingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @sample AWSAppRunner.DescribeAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAutoScalingConfigurationResult describeAutoScalingConfiguration(DescribeAutoScalingConfigurationRequest describeAutoScalingConfigurationRequest);

    /**
     * <p>
     * Return a description of custom domain names that are associated with an AWS App Runner service.
     * </p>
     * 
     * @param describeCustomDomainsRequest
     * @return Result of the DescribeCustomDomains operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @sample AWSAppRunner.DescribeCustomDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeCustomDomains"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCustomDomainsResult describeCustomDomains(DescribeCustomDomainsRequest describeCustomDomainsRequest);

    /**
     * <p>
     * Return a full description of an AWS App Runner service.
     * </p>
     * 
     * @param describeServiceRequest
     * @return Result of the DescribeService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.DescribeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeService" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeServiceResult describeService(DescribeServiceRequest describeServiceRequest);

    /**
     * <p>
     * Disassociate a custom domain name from an AWS App Runner service.
     * </p>
     * <p>
     * Certificates tracking domain validity are associated with a custom domain and are stored in <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide">AWS Certificate Manager (ACM)</a>. These certificates
     * aren't deleted as part of this action. App Runner delays certificate deletion for 30 days after a domain is
     * disassociated from your service.
     * </p>
     * 
     * @param disassociateCustomDomainRequest
     * @return Result of the DisassociateCustomDomain operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.DisassociateCustomDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DisassociateCustomDomain"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateCustomDomainResult disassociateCustomDomain(DisassociateCustomDomainRequest disassociateCustomDomainRequest);

    /**
     * <p>
     * Returns a list of AWS App Runner automatic scaling configurations in your AWS account. You can query the
     * revisions for a specific configuration name or the revisions for all configurations in your account. You can
     * optionally query only the latest revision of each requested name.
     * </p>
     * 
     * @param listAutoScalingConfigurationsRequest
     * @return Result of the ListAutoScalingConfigurations operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.ListAutoScalingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListAutoScalingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListAutoScalingConfigurationsResult listAutoScalingConfigurations(ListAutoScalingConfigurationsRequest listAutoScalingConfigurationsRequest);

    /**
     * <p>
     * Returns a list of AWS App Runner connections that are associated with your AWS account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @return Result of the ListConnections operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.ListConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListConnections" target="_top">AWS API
     *      Documentation</a>
     */
    ListConnectionsResult listConnections(ListConnectionsRequest listConnectionsRequest);

    /**
     * <p>
     * Return a list of operations that occurred on an AWS App Runner service.
     * </p>
     * <p>
     * The resulting list of <a>OperationSummary</a> objects is sorted in reverse chronological order. The first object
     * on the list represents the last started operation.
     * </p>
     * 
     * @param listOperationsRequest
     * @return Result of the ListOperations operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @sample AWSAppRunner.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListOperations" target="_top">AWS API
     *      Documentation</a>
     */
    ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest);

    /**
     * <p>
     * Returns a list of running AWS App Runner services in your AWS account.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * List tags that are associated with for an AWS App Runner resource. The response contains a list of tag key-value
     * pairs.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Pause an active AWS App Runner service. App Runner reduces compute capacity for the service to zero and loses
     * state (for example, ephemeral storage is removed).
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param pauseServiceRequest
     * @return Result of the PauseService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.PauseService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/PauseService" target="_top">AWS API
     *      Documentation</a>
     */
    PauseServiceResult pauseService(PauseServiceRequest pauseServiceRequest);

    /**
     * <p>
     * Resume an active AWS App Runner service. App Runner provisions compute capacity for the service.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param resumeServiceRequest
     * @return Result of the ResumeService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.ResumeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ResumeService" target="_top">AWS API
     *      Documentation</a>
     */
    ResumeServiceResult resumeService(ResumeServiceRequest resumeServiceRequest);

    /**
     * <p>
     * Initiate a manual deployment of the latest commit in a source code repository or the latest image in a source
     * image repository to an AWS App Runner service.
     * </p>
     * <p>
     * For a source code repository, App Runner retrieves the commit and builds a Docker image. For a source image
     * repository, App Runner retrieves the latest Docker image. In both cases, App Runner then deploys the new image to
     * your service and starts a new container instance.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param startDeploymentRequest
     * @return Result of the StartDeployment operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    StartDeploymentResult startDeployment(StartDeploymentRequest startDeploymentRequest);

    /**
     * <p>
     * Add tags to, or update the tag values of, an App Runner resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove tags from an App Runner resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @sample AWSAppRunner.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update an AWS App Runner service. You can update the source configuration and instance configuration of the
     * service. You can also update the ARN of the auto scaling configuration resource that's associated with the
     * service. However, you can't change the name or the encryption configuration of the service. These can be set only
     * when you create the service.
     * </p>
     * <p>
     * To update the tags applied to your service, use the separate actions <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters aren't valid. Refer to the API action's document page, correct the input
     *         parameters, and try the action again.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN) in your AWS account.
     * @throws InvalidStateException
     *         You can't perform this action when the resource is in its current state.
     * @throws InternalServiceErrorException
     *         An unexpected service exception occurred.
     * @sample AWSAppRunner.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest);

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

}
