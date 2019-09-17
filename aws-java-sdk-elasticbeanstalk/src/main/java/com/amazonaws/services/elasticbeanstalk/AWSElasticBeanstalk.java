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
package com.amazonaws.services.elasticbeanstalk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticbeanstalk.model.*;

/**
 * Interface for accessing Elastic Beanstalk.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticbeanstalk.AbstractAWSElasticBeanstalk} instead.
 * </p>
 * <p>
 * <fullname>AWS Elastic Beanstalk</fullname>
 * <p>
 * AWS Elastic Beanstalk makes it easy for you to create, deploy, and manage scalable, fault-tolerant applications
 * running on the Amazon Web Services cloud.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/elasticbeanstalk/">AWS Elastic
 * Beanstalk</a> details page. The location of the latest AWS Elastic Beanstalk WSDL is <a
 * href="http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl"
 * >http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl</a>. To install the Software
 * Development Kits (SDKs), Integrated Development Environment (IDE) Toolkits, and command line tools that enable you to
 * access the API, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of region-specific endpoints that AWS Elastic Beanstalk supports, go to <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">Regions and Endpoints</a> in
 * the <i>Amazon Web Services Glossary</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSElasticBeanstalk {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "elasticbeanstalk";

    /**
     * Overrides the default endpoint for this client ("https://elasticbeanstalk.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticbeanstalk.us-east-1.amazonaws.com") or a full URL, including
     * the protocol (ex: "https://elasticbeanstalk.us-east-1.amazonaws.com"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "elasticbeanstalk.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://elasticbeanstalk.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSElasticBeanstalk#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Cancels in-progress environment configuration update or application version deployment.
     * </p>
     * 
     * @param abortEnvironmentUpdateRequest
     * @return Result of the AbortEnvironmentUpdate operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.AbortEnvironmentUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/AbortEnvironmentUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    AbortEnvironmentUpdateResult abortEnvironmentUpdate(AbortEnvironmentUpdateRequest abortEnvironmentUpdateRequest);

    /**
     * Simplified method form for invoking the AbortEnvironmentUpdate operation.
     *
     * @see #abortEnvironmentUpdate(AbortEnvironmentUpdateRequest)
     */
    AbortEnvironmentUpdateResult abortEnvironmentUpdate();

    /**
     * <p>
     * Applies a scheduled managed action immediately. A managed action can be applied only if its status is
     * <code>Scheduled</code>. Get the status and action ID of a managed action with
     * <a>DescribeEnvironmentManagedActions</a>.
     * </p>
     * 
     * @param applyEnvironmentManagedActionRequest
     *        Request to execute a scheduled managed action immediately.
     * @return Result of the ApplyEnvironmentManagedAction operation returned by the service.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @throws ManagedActionInvalidStateException
     *         Cannot modify the managed action in its current state.
     * @sample AWSElasticBeanstalk.ApplyEnvironmentManagedAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ApplyEnvironmentManagedAction"
     *      target="_top">AWS API Documentation</a>
     */
    ApplyEnvironmentManagedActionResult applyEnvironmentManagedAction(ApplyEnvironmentManagedActionRequest applyEnvironmentManagedActionRequest);

    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     * 
     * @param checkDNSAvailabilityRequest
     *        Results message indicating whether a CNAME is available.
     * @return Result of the CheckDNSAvailability operation returned by the service.
     * @sample AWSElasticBeanstalk.CheckDNSAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CheckDNSAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    CheckDNSAvailabilityResult checkDNSAvailability(CheckDNSAvailabilityRequest checkDNSAvailabilityRequest);

    /**
     * <p>
     * Create or update a group of environments that each run a separate component of a single application. Takes a list
     * of version labels that specify application source bundles for each of the environments to create or update. The
     * name of each environment and other required information must be included in the source bundles in an environment
     * manifest named <code>env.yaml</code>. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html">Compose
     * Environments</a> for details.
     * </p>
     * 
     * @param composeEnvironmentsRequest
     *        Request to create or update a group of environments.
     * @return Result of the ComposeEnvironments operation returned by the service.
     * @throws TooManyEnvironmentsException
     *         The specified account has reached its limit of environments.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.ComposeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ComposeEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    ComposeEnvironmentsResult composeEnvironments(ComposeEnvironmentsRequest composeEnvironmentsRequest);

    /**
     * <p>
     * Creates an application that has one configuration template named <code>default</code> and no application
     * versions.
     * </p>
     * 
     * @param createApplicationRequest
     *        Request to create an application.
     * @return Result of the CreateApplication operation returned by the service.
     * @throws TooManyApplicationsException
     *         The specified account has reached its limit of applications.
     * @sample AWSElasticBeanstalk.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application version for the specified application. You can create an application version from a source
     * bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows:
     * </p>
     * <p>
     * Specify a commit in an AWS CodeCommit repository with <code>SourceBuildInformation</code>.
     * </p>
     * <p>
     * Specify a build in an AWS CodeBuild with <code>SourceBuildInformation</code> and <code>BuildConfiguration</code>.
     * </p>
     * <p>
     * Specify a source bundle in S3 with <code>SourceBundle</code>
     * </p>
     * <p>
     * Omit both <code>SourceBuildInformation</code> and <code>SourceBundle</code> to use the default sample
     * application.
     * </p>
     * <note>
     * <p>
     * Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that
     * Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an
     * environment from the application version.
     * </p>
     * </note>
     * 
     * @param createApplicationVersionRequest
     * @return Result of the CreateApplicationVersion operation returned by the service.
     * @throws TooManyApplicationsException
     *         The specified account has reached its limit of applications.
     * @throws TooManyApplicationVersionsException
     *         The specified account has reached its limit of application versions.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws S3LocationNotInServiceRegionException
     *         The specified S3 bucket does not belong to the S3 region in which the service is running. The following
     *         regions are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         IAD/us-east-1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PDX/us-west-2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DUB/eu-west-1
     *         </p>
     *         </li>
     * @throws CodeBuildNotInServiceRegionException
     *         AWS CodeBuild is not available in the specified region.
     * @sample AWSElasticBeanstalk.CreateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationVersionResult createApplicationVersion(CreateApplicationVersionRequest createApplicationVersionRequest);

    /**
     * <p>
     * Creates a configuration template. Templates are associated with a specific application and are used to deploy
     * different versions of the application with the same configuration settings.
     * </p>
     * <p>
     * Templates aren't associated with any environment. The <code>EnvironmentName</code> response element is always
     * <code>null</code>.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeConfigurationSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAvailableSolutionStacks</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationTemplateRequest
     *        Request to create a configuration template.
     * @return Result of the CreateConfigurationTemplate operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @throws TooManyConfigurationTemplatesException
     *         The specified account has reached its limit of configuration templates.
     * @sample AWSElasticBeanstalk.CreateConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationTemplateResult createConfigurationTemplate(CreateConfigurationTemplateRequest createConfigurationTemplateRequest);

    /**
     * <p>
     * Launches an environment for the specified application using the specified configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws TooManyEnvironmentsException
     *         The specified account has reached its limit of environments.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Create a new version of your custom platform.
     * </p>
     * 
     * @param createPlatformVersionRequest
     *        Request to create a new platform version.
     * @return Result of the CreatePlatformVersion operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @throws TooManyPlatformsException
     *         You have exceeded the maximum number of allowed platforms associated with the account.
     * @sample AWSElasticBeanstalk.CreatePlatformVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreatePlatformVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePlatformVersionResult createPlatformVersion(CreatePlatformVersionRequest createPlatformVersionRequest);

    /**
     * <p>
     * Creates a bucket in Amazon S3 to store application versions, logs, and other files used by Elastic Beanstalk
     * environments. The Elastic Beanstalk console and EB CLI call this API the first time you create an environment in
     * a region. If the storage location already exists, <code>CreateStorageLocation</code> still returns the bucket
     * name but does not create a new bucket.
     * </p>
     * 
     * @param createStorageLocationRequest
     * @return Result of the CreateStorageLocation operation returned by the service.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @throws S3SubscriptionRequiredException
     *         The specified account does not have a subscription to Amazon S3.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.CreateStorageLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateStorageLocation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateStorageLocationResult createStorageLocation(CreateStorageLocationRequest createStorageLocationRequest);

    /**
     * Simplified method form for invoking the CreateStorageLocation operation.
     *
     * @see #createStorageLocation(CreateStorageLocationRequest)
     */
    CreateStorageLocationResult createStorageLocation();

    /**
     * <p>
     * Deletes the specified application along with all associated versions and configurations. The application versions
     * will not be deleted from your Amazon S3 bucket.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application that has a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest
     *        Request to delete an application.
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @sample AWSElasticBeanstalk.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application version that is associated with a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationVersionRequest
     *        Request to delete an application version.
     * @return Result of the DeleteApplicationVersion operation returned by the service.
     * @throws SourceBundleDeletionException
     *         Unable to delete the Amazon S3 source bundle associated with the application version. The application
     *         version was deleted successfully.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @throws S3LocationNotInServiceRegionException
     *         The specified S3 bucket does not belong to the S3 region in which the service is running. The following
     *         regions are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         IAD/us-east-1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PDX/us-west-2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DUB/eu-west-1
     *         </p>
     *         </li>
     * @sample AWSElasticBeanstalk.DeleteApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationVersionResult deleteApplicationVersion(DeleteApplicationVersionRequest deleteApplicationVersionRequest);

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <note>
     * <p>
     * When you launch an environment using a configuration template, the environment gets a copy of the template. You
     * can delete or modify the environment's copy of the template without affecting the running environment.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationTemplateRequest
     *        Request to delete a configuration template.
     * @return Result of the DeleteConfigurationTemplate operation returned by the service.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @sample AWSElasticBeanstalk.DeleteConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationTemplateResult deleteConfigurationTemplate(DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest);

    /**
     * <p>
     * Deletes the draft configuration associated with the running environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates a draft configuration set. You can get the
     * draft configuration using <a>DescribeConfigurationSettings</a> while the update is in progress or if the update
     * fails. The <code>DeploymentStatus</code> for the draft configuration indicates whether the deployment is in
     * process or has failed. The draft configuration remains in existence until it is deleted with this action.
     * </p>
     * 
     * @param deleteEnvironmentConfigurationRequest
     *        Request to delete a draft environment configuration.
     * @return Result of the DeleteEnvironmentConfiguration operation returned by the service.
     * @sample AWSElasticBeanstalk.DeleteEnvironmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteEnvironmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentConfigurationResult deleteEnvironmentConfiguration(DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest);

    /**
     * <p>
     * Deletes the specified version of a custom platform.
     * </p>
     * 
     * @param deletePlatformVersionRequest
     * @return Result of the DeletePlatformVersion operation returned by the service.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @throws PlatformVersionStillReferencedException
     *         You cannot delete the platform version because there are still environments running on it.
     * @sample AWSElasticBeanstalk.DeletePlatformVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeletePlatformVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePlatformVersionResult deletePlatformVersion(DeletePlatformVersionRequest deletePlatformVersionRequest);

    /**
     * <p>
     * Returns attributes related to AWS Elastic Beanstalk that are associated with the calling AWS account.
     * </p>
     * <p>
     * The result currently has one set of attributes—resource quotas.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * <p>
     * Retrieve a list of application versions.
     * </p>
     * 
     * @param describeApplicationVersionsRequest
     *        Request to describe application versions.
     * @return Result of the DescribeApplicationVersions operation returned by the service.
     * @sample AWSElasticBeanstalk.DescribeApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeApplicationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationVersionsResult describeApplicationVersions(DescribeApplicationVersionsRequest describeApplicationVersionsRequest);

    /**
     * Simplified method form for invoking the DescribeApplicationVersions operation.
     *
     * @see #describeApplicationVersions(DescribeApplicationVersionsRequest)
     */
    DescribeApplicationVersionsResult describeApplicationVersions();

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @param describeApplicationsRequest
     *        Request to describe one or more applications.
     * @return Result of the DescribeApplications operation returned by the service.
     * @sample AWSElasticBeanstalk.DescribeApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeApplications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationsResult describeApplications(DescribeApplicationsRequest describeApplicationsRequest);

    /**
     * Simplified method form for invoking the DescribeApplications operation.
     *
     * @see #describeApplications(DescribeApplicationsRequest)
     */
    DescribeApplicationsResult describeApplications();

    /**
     * <p>
     * Describes the configuration options that are used in a particular configuration template or environment, or that
     * a specified solution stack defines. The description includes the values the options, their default values, and an
     * indication of the required action on a running environment if an option value is changed.
     * </p>
     * 
     * @param describeConfigurationOptionsRequest
     *        Result message containing a list of application version descriptions.
     * @return Result of the DescribeConfigurationOptions operation returned by the service.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.DescribeConfigurationOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeConfigurationOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationOptionsResult describeConfigurationOptions(DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest);

    /**
     * <p>
     * Returns a description of the settings for the specified configuration set, that is, either a configuration
     * template or the configuration set associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated with a running environment, it is possible to
     * receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft
     * configuration of an environment that is either in the process of deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteEnvironmentConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeConfigurationSettingsRequest
     *        Result message containing all of the configuration settings for a specified solution stack or
     *        configuration template.
     * @return Result of the DescribeConfigurationSettings operation returned by the service.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.DescribeConfigurationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeConfigurationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationSettingsResult describeConfigurationSettings(DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest);

    /**
     * <p>
     * Returns information about the overall health of the specified environment. The <b>DescribeEnvironmentHealth</b>
     * operation is only available with AWS Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeEnvironmentHealthRequest
     *        See the example below to learn how to create a request body.
     * @return Result of the DescribeEnvironmentHealth operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters is not valid. Please correct the input parameters and try the operation
     *         again.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribeEnvironmentHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentHealth"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentHealthResult describeEnvironmentHealth(DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest);

    /**
     * <p>
     * Lists an environment's completed and failed managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionHistoryRequest
     *        Request to list completed and failed managed actions.
     * @return Result of the DescribeEnvironmentManagedActionHistory operation returned by the service.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribeEnvironmentManagedActionHistory
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentManagedActionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentManagedActionHistoryResult describeEnvironmentManagedActionHistory(
            DescribeEnvironmentManagedActionHistoryRequest describeEnvironmentManagedActionHistoryRequest);

    /**
     * <p>
     * Lists an environment's upcoming and in-progress managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionsRequest
     *        Request to list an environment's upcoming and in-progress managed actions.
     * @return Result of the DescribeEnvironmentManagedActions operation returned by the service.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribeEnvironmentManagedActions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentManagedActions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentManagedActionsResult describeEnvironmentManagedActions(DescribeEnvironmentManagedActionsRequest describeEnvironmentManagedActionsRequest);

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     * 
     * @param describeEnvironmentResourcesRequest
     *        Request to describe the resources in an environment.
     * @return Result of the DescribeEnvironmentResources operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.DescribeEnvironmentResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentResources"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentResourcesResult describeEnvironmentResources(DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest);

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     *        Request to describe one or more environments.
     * @return Result of the DescribeEnvironments operation returned by the service.
     * @sample AWSElasticBeanstalk.DescribeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentsResult describeEnvironments(DescribeEnvironmentsRequest describeEnvironmentsRequest);

    /**
     * Simplified method form for invoking the DescribeEnvironments operation.
     *
     * @see #describeEnvironments(DescribeEnvironmentsRequest)
     */
    DescribeEnvironmentsResult describeEnvironments();

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6 weeks.
     * </p>
     * <note>
     * <p>
     * This action returns the most recent 1,000 events from the specified <code>NextToken</code>.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest
     *        Request to retrieve a list of events for an environment.
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AWSElasticBeanstalk.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEvents"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEvents(DescribeEventsRequest)
     */
    DescribeEventsResult describeEvents();

    /**
     * <p>
     * Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation
     * requires <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced.html">enhanced health
     * reporting</a>.
     * </p>
     * 
     * @param describeInstancesHealthRequest
     *        Parameters for a call to <code>DescribeInstancesHealth</code>.
     * @return Result of the DescribeInstancesHealth operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters is not valid. Please correct the input parameters and try the operation
     *         again.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribeInstancesHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeInstancesHealth"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstancesHealthResult describeInstancesHealth(DescribeInstancesHealthRequest describeInstancesHealthRequest);

    /**
     * <p>
     * Describes the version of the platform.
     * </p>
     * 
     * @param describePlatformVersionRequest
     * @return Result of the DescribePlatformVersion operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribePlatformVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribePlatformVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePlatformVersionResult describePlatformVersion(DescribePlatformVersionRequest describePlatformVersionRequest);

    /**
     * <p>
     * Returns a list of the available solution stack names, with the public version first and then in reverse
     * chronological order.
     * </p>
     * 
     * @param listAvailableSolutionStacksRequest
     * @return Result of the ListAvailableSolutionStacks operation returned by the service.
     * @sample AWSElasticBeanstalk.ListAvailableSolutionStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListAvailableSolutionStacks"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableSolutionStacksResult listAvailableSolutionStacks(ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest);

    /**
     * Simplified method form for invoking the ListAvailableSolutionStacks operation.
     *
     * @see #listAvailableSolutionStacks(ListAvailableSolutionStacksRequest)
     */
    ListAvailableSolutionStacksResult listAvailableSolutionStacks();

    /**
     * <p>
     * Lists the available platforms.
     * </p>
     * 
     * @param listPlatformVersionsRequest
     * @return Result of the ListPlatformVersions operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.ListPlatformVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListPlatformVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListPlatformVersionsResult listPlatformVersions(ListPlatformVersionsRequest listPlatformVersionsRequest);

    /**
     * <p>
     * Returns the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value
     * pairs.
     * </p>
     * <p>
     * Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about
     * environment tagging, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.tagging.html">Tagging Resources in
     * Your Elastic Beanstalk Environment</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN).
     * @throws ResourceTypeNotSupportedException
     *         The type of the specified Amazon Resource Name (ARN) isn't supported for this operation.
     * @sample AWSElasticBeanstalk.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a
     * specified environment and forces a restart.
     * </p>
     * 
     * @param rebuildEnvironmentRequest
     * @return Result of the RebuildEnvironment operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.RebuildEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RebuildEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    RebuildEnvironmentResult rebuildEnvironment(RebuildEnvironmentRequest rebuildEnvironmentRequest);

    /**
     * <p>
     * Initiates a request to compile the specified type of information of the deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the last lines from the application server log
     * files of every Amazon EC2 instance in your environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>bundle</code> compresses the application server log files for every
     * Amazon EC2 instance into a <code>.zip</code> file. Legacy and .NET containers do not support bundle logs.
     * </p>
     * <p>
     * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RetrieveEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestEnvironmentInfoRequest
     *        Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket.
     * @return Result of the RequestEnvironmentInfo operation returned by the service.
     * @sample AWSElasticBeanstalk.RequestEnvironmentInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RequestEnvironmentInfo"
     *      target="_top">AWS API Documentation</a>
     */
    RequestEnvironmentInfoResult requestEnvironmentInfo(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest);

    /**
     * <p>
     * Causes the environment to restart the application container server running on each Amazon EC2 instance.
     * </p>
     * 
     * @param restartAppServerRequest
     * @return Result of the RestartAppServer operation returned by the service.
     * @sample AWSElasticBeanstalk.RestartAppServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RestartAppServer"
     *      target="_top">AWS API Documentation</a>
     */
    RestartAppServerResult restartAppServer(RestartAppServerRequest restartAppServerRequest);

    /**
     * <p>
     * Retrieves the compiled information from a <a>RequestEnvironmentInfo</a> request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RequestEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param retrieveEnvironmentInfoRequest
     *        Request to download logs retrieved with <a>RequestEnvironmentInfo</a>.
     * @return Result of the RetrieveEnvironmentInfo operation returned by the service.
     * @sample AWSElasticBeanstalk.RetrieveEnvironmentInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RetrieveEnvironmentInfo"
     *      target="_top">AWS API Documentation</a>
     */
    RetrieveEnvironmentInfoResult retrieveEnvironmentInfo(RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest);

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * @param swapEnvironmentCNAMEsRequest
     *        Swaps the CNAMEs of two environments.
     * @return Result of the SwapEnvironmentCNAMEs operation returned by the service.
     * @sample AWSElasticBeanstalk.SwapEnvironmentCNAMEs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/SwapEnvironmentCNAMEs"
     *      target="_top">AWS API Documentation</a>
     */
    SwapEnvironmentCNAMEsResult swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest);

    /**
     * Simplified method form for invoking the SwapEnvironmentCNAMEs operation.
     *
     * @see #swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest)
     */
    SwapEnvironmentCNAMEsResult swapEnvironmentCNAMEs();

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     * 
     * @param terminateEnvironmentRequest
     *        Request to terminate an environment.
     * @return Result of the TerminateEnvironment operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.TerminateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/TerminateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    TerminateEnvironmentResult terminateEnvironment(TerminateEnvironmentRequest terminateEnvironmentRequest);

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided, the value remains unchanged. To clear
     * these properties, specify an empty string.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     *        Request to update an application.
     * @return Result of the UpdateApplication operation returned by the service.
     * @sample AWSElasticBeanstalk.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Modifies lifecycle settings for an application.
     * </p>
     * 
     * @param updateApplicationResourceLifecycleRequest
     * @return Result of the UpdateApplicationResourceLifecycle operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.UpdateApplicationResourceLifecycle
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateApplicationResourceLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationResourceLifecycleResult updateApplicationResourceLifecycle(
            UpdateApplicationResourceLifecycleRequest updateApplicationResourceLifecycleRequest);

    /**
     * <p>
     * Updates the specified application version to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided, the value remains unchanged. To clear
     * properties, specify an empty string.
     * </p>
     * </note>
     * 
     * @param updateApplicationVersionRequest
     * @return Result of the UpdateApplicationVersion operation returned by the service.
     * @sample AWSElasticBeanstalk.UpdateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationVersionResult updateApplicationVersion(UpdateApplicationVersionRequest updateApplicationVersionRequest);

    /**
     * <p>
     * Updates the specified configuration template to have the specified properties or configuration option values.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>ApplicationName</code>) is not provided, its value remains unchanged. To clear
     * such properties, specify an empty string.
     * </p>
     * </note>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateConfigurationTemplateRequest
     *        The result message containing the options for the specified solution stack.
     * @return Result of the UpdateConfigurationTemplate operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.UpdateConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationTemplateResult updateConfigurationTemplate(UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest);

    /**
     * <p>
     * Updates the environment description, deploys a new application version, updates the configuration settings to an
     * entirely new configuration template, or updates select configuration option values in the running environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or individual settings, a draft configuration is
     * created and <a>DescribeConfigurationSettings</a> for this environment returns two setting descriptions with
     * different <code>DeploymentStatus</code> values.
     * </p>
     * 
     * @param updateEnvironmentRequest
     *        Request to update an environment.
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed:
     * <code>TagsToAdd</code> for tags to add or update, and <code>TagsToRemove</code>.
     * </p>
     * <p>
     * Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about
     * environment tagging, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.tagging.html">Tagging Resources in
     * Your Elastic Beanstalk Environment</a>.
     * </p>
     * <p>
     * If you create a custom IAM user policy to control permission to this operation, specify one of the following two
     * virtual actions (or both) instead of the API operation name:
     * </p>
     * <dl>
     * <dt>elasticbeanstalk:AddTags</dt>
     * <dd>
     * <p>
     * Controls permission to call <code>UpdateTagsForResource</code> and pass a list of tags to add in the
     * <code>TagsToAdd</code> parameter.
     * </p>
     * </dd>
     * <dt>elasticbeanstalk:RemoveTags</dt>
     * <dd>
     * <p>
     * Controls permission to call <code>UpdateTagsForResource</code> and pass a list of tag keys to remove in the
     * <code>TagsToRemove</code> parameter.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For details about creating a custom user policy, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/AWSHowTo.iam.managed-policies.html#AWSHowTo.iam.policies"
     * >Creating a Custom User Policy</a>.
     * </p>
     * 
     * @param updateTagsForResourceRequest
     * @return Result of the UpdateTagsForResource operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @throws TooManyTagsException
     *         The number of tags in the resource would exceed the number of tags that each resource can have.</p>
     *         <p>
     *         To calculate this, the operation considers both the number of tags the resource already has and the tags
     *         this operation would add if it succeeded.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN).
     * @throws ResourceTypeNotSupportedException
     *         The type of the specified Amazon Resource Name (ARN) isn't supported for this operation.
     * @sample AWSElasticBeanstalk.UpdateTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTagsForResourceResult updateTagsForResource(UpdateTagsForResourceRequest updateTagsForResourceRequest);

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration template or environment, and determines whether
     * those values are valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or warnings associated with the selection of option
     * values.
     * </p>
     * 
     * @param validateConfigurationSettingsRequest
     *        A list of validation messages for a specified configuration template.
     * @return Result of the ValidateConfigurationSettings operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.ValidateConfigurationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ValidateConfigurationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    ValidateConfigurationSettingsResult validateConfigurationSettings(ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest);

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
