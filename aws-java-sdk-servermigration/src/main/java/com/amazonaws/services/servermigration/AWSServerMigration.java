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
package com.amazonaws.services.servermigration;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.servermigration.model.*;

/**
 * Interface for accessing SMS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servermigration.AbstractAWSServerMigration} instead.
 * </p>
 * <p>
 * <fullname>AAWS Sever Migration Service</fullname>
 * <p>
 * This is the <i>AWS Sever Migration Service API Reference</i>. It provides descriptions, syntax, and usage examples
 * for each of the actions and data types for the AWS Sever Migration Service (AWS SMS). The topic for each action shows
 * the Query API request parameters and the XML response. You can also view the XML request elements in the WSDL.
 * </p>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * To learn more about the Server Migration Service, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://aws.amazon.com/server-migration-service/">AWS Sever Migration Service product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/server-migration-service/latest/userguide/server-migration.html">AWS Sever
 * Migration Service User Guide</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServerMigration {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sms";

    /**
     * Overrides the default endpoint for this client ("sms.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sms.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "sms.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "sms.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "sms.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSServerMigration#setEndpoint(String)}, sets the regional endpoint for this client's
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
     * Creates an application. An application consists of one or more server groups. Each server group contain one or
     * more servers.
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to
     * AWS. Each replication run creates an Amazon Machine Image (AMI).
     * </p>
     * 
     * @param createReplicationJobRequest
     * @return Result of the CreateReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws ServerCannotBeReplicatedException
     *         The specified server cannot be replicated.
     * @throws ReplicationJobAlreadyExistsException
     *         The specified replication job already exists.
     * @throws NoConnectorsAvailableException
     *         There are no connectors available.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws TemporarilyUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSServerMigration.CreateReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/CreateReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateReplicationJobResult createReplicationJob(CreateReplicationJobRequest createReplicationJobRequest);

    /**
     * <p>
     * Deletes an existing application. Optionally deletes the launched stack associated with the application and all
     * AWS SMS replication jobs for servers in the application.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes existing launch configuration for an application.
     * </p>
     * 
     * @param deleteAppLaunchConfigurationRequest
     * @return Result of the DeleteAppLaunchConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.DeleteAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppLaunchConfigurationResult deleteAppLaunchConfiguration(DeleteAppLaunchConfigurationRequest deleteAppLaunchConfigurationRequest);

    /**
     * <p>
     * Deletes existing replication configuration for an application.
     * </p>
     * 
     * @param deleteAppReplicationConfigurationRequest
     * @return Result of the DeleteAppReplicationConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.DeleteAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppReplicationConfigurationResult deleteAppReplicationConfiguration(DeleteAppReplicationConfigurationRequest deleteAppReplicationConfigurationRequest);

    /**
     * <p>
     * Deletes the specified replication job.
     * </p>
     * <p>
     * After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon
     * S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
     * </p>
     * 
     * @param deleteReplicationJobRequest
     * @return Result of the DeleteReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws ReplicationJobNotFoundException
     *         The specified replication job does not exist.
     * @sample AWSServerMigration.DeleteReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteReplicationJobResult deleteReplicationJob(DeleteReplicationJobRequest deleteReplicationJobRequest);

    /**
     * <p>
     * Deletes all servers from your server catalog.
     * </p>
     * 
     * @param deleteServerCatalogRequest
     * @return Result of the DeleteServerCatalog operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @sample AWSServerMigration.DeleteServerCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteServerCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteServerCatalogResult deleteServerCatalog(DeleteServerCatalogRequest deleteServerCatalogRequest);

    /**
     * <p>
     * Disassociates the specified connector from AWS SMS.
     * </p>
     * <p>
     * After you disassociate a connector, it is no longer available to support replication jobs.
     * </p>
     * 
     * @param disassociateConnectorRequest
     * @return Result of the DisassociateConnector operation returned by the service.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @sample AWSServerMigration.DisassociateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DisassociateConnector" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateConnectorResult disassociateConnector(DisassociateConnectorRequest disassociateConnectorRequest);

    /**
     * <p>
     * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the
     * customer’s Amazon S3 bucket.
     * </p>
     * 
     * @param generateChangeSetRequest
     * @return Result of the GenerateChangeSet operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GenerateChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateChangeSet" target="_top">AWS API
     *      Documentation</a>
     */
    GenerateChangeSetResult generateChangeSet(GenerateChangeSetRequest generateChangeSetRequest);

    /**
     * <p>
     * Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon
     * S3 object in the customer’s Amazon S3 bucket.
     * </p>
     * 
     * @param generateTemplateRequest
     * @return Result of the GenerateTemplate operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GenerateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GenerateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    GenerateTemplateResult generateTemplate(GenerateTemplateRequest generateTemplateRequest);

    /**
     * <p>
     * Retrieve information about an application.
     * </p>
     * 
     * @param getAppRequest
     * @return Result of the GetApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppResult getApp(GetAppRequest getAppRequest);

    /**
     * <p>
     * Retrieves the application launch configuration associated with an application.
     * </p>
     * 
     * @param getAppLaunchConfigurationRequest
     * @return Result of the GetAppLaunchConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GetAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    GetAppLaunchConfigurationResult getAppLaunchConfiguration(GetAppLaunchConfigurationRequest getAppLaunchConfigurationRequest);

    /**
     * <p>
     * Retrieves an application replication configuration associatd with an application.
     * </p>
     * 
     * @param getAppReplicationConfigurationRequest
     * @return Result of the GetAppReplicationConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.GetAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetAppReplicationConfigurationResult getAppReplicationConfiguration(GetAppReplicationConfigurationRequest getAppReplicationConfigurationRequest);

    /**
     * <p>
     * Describes the connectors registered with the AWS SMS.
     * </p>
     * 
     * @param getConnectorsRequest
     * @return Result of the GetConnectors operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @sample AWSServerMigration.GetConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    GetConnectorsResult getConnectors(GetConnectorsRequest getConnectorsRequest);

    /**
     * <p>
     * Describes the specified replication job or all of your replication jobs.
     * </p>
     * 
     * @param getReplicationJobsRequest
     * @return Result of the GetReplicationJobs operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @sample AWSServerMigration.GetReplicationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetReplicationJobs" target="_top">AWS API
     *      Documentation</a>
     */
    GetReplicationJobsResult getReplicationJobs(GetReplicationJobsRequest getReplicationJobsRequest);

    /**
     * <p>
     * Describes the replication runs for the specified replication job.
     * </p>
     * 
     * @param getReplicationRunsRequest
     * @return Result of the GetReplicationRuns operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @sample AWSServerMigration.GetReplicationRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetReplicationRuns" target="_top">AWS API
     *      Documentation</a>
     */
    GetReplicationRunsResult getReplicationRuns(GetReplicationRunsRequest getReplicationRunsRequest);

    /**
     * <p>
     * Describes the servers in your server catalog.
     * </p>
     * <p>
     * Before you can describe your servers, you must import them using <a>ImportServerCatalog</a>.
     * </p>
     * 
     * @param getServersRequest
     * @return Result of the GetServers operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @sample AWSServerMigration.GetServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetServers" target="_top">AWS API
     *      Documentation</a>
     */
    GetServersResult getServers(GetServersRequest getServersRequest);

    /**
     * <p>
     * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you
     * want to import.
     * </p>
     * <p>
     * This call returns immediately, but might take additional time to retrieve all the servers.
     * </p>
     * 
     * @param importServerCatalogRequest
     * @return Result of the ImportServerCatalog operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws NoConnectorsAvailableException
     *         There are no connectors available.
     * @sample AWSServerMigration.ImportServerCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ImportServerCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    ImportServerCatalogResult importServerCatalog(ImportServerCatalogRequest importServerCatalogRequest);

    /**
     * <p>
     * Launches an application stack.
     * </p>
     * 
     * @param launchAppRequest
     * @return Result of the LaunchApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.LaunchApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/LaunchApp" target="_top">AWS API
     *      Documentation</a>
     */
    LaunchAppResult launchApp(LaunchAppRequest launchAppRequest);

    /**
     * <p>
     * Returns a list of summaries for all applications.
     * </p>
     * 
     * @param listAppsRequest
     * @return Result of the ListApps operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    ListAppsResult listApps(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Creates a launch configuration for an application.
     * </p>
     * 
     * @param putAppLaunchConfigurationRequest
     * @return Result of the PutAppLaunchConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.PutAppLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    PutAppLaunchConfigurationResult putAppLaunchConfiguration(PutAppLaunchConfigurationRequest putAppLaunchConfigurationRequest);

    /**
     * <p>
     * Creates or updates a replication configuration for an application.
     * </p>
     * 
     * @param putAppReplicationConfigurationRequest
     * @return Result of the PutAppReplicationConfiguration operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.PutAppReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutAppReplicationConfigurationResult putAppReplicationConfiguration(PutAppReplicationConfigurationRequest putAppReplicationConfigurationRequest);

    /**
     * <p>
     * Starts replicating an application.
     * </p>
     * 
     * @param startAppReplicationRequest
     * @return Result of the StartAppReplication operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.StartAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartAppReplication" target="_top">AWS API
     *      Documentation</a>
     */
    StartAppReplicationResult startAppReplication(StartAppReplicationRequest startAppReplicationRequest);

    /**
     * <p>
     * Starts an on-demand replication run for the specified replication job. This replication run starts immediately.
     * This replication run is in addition to the ones already scheduled.
     * </p>
     * <p>
     * There is a limit on the number of on-demand replications runs you can request in a 24-hour period.
     * </p>
     * 
     * @param startOnDemandReplicationRunRequest
     * @return Result of the StartOnDemandReplicationRun operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws ReplicationRunLimitExceededException
     *         You have exceeded the number of on-demand replication runs you can request in a 24-hour period.
     * @sample AWSServerMigration.StartOnDemandReplicationRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartOnDemandReplicationRun"
     *      target="_top">AWS API Documentation</a>
     */
    StartOnDemandReplicationRunResult startOnDemandReplicationRun(StartOnDemandReplicationRunRequest startOnDemandReplicationRunRequest);

    /**
     * <p>
     * Stops replicating an application.
     * </p>
     * 
     * @param stopAppReplicationRequest
     * @return Result of the StopAppReplication operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.StopAppReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StopAppReplication" target="_top">AWS API
     *      Documentation</a>
     */
    StopAppReplicationResult stopAppReplication(StopAppReplicationRequest stopAppReplicationRequest);

    /**
     * <p>
     * Terminates the stack for an application.
     * </p>
     * 
     * @param terminateAppRequest
     * @return Result of the TerminateApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.TerminateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/TerminateApp" target="_top">AWS API
     *      Documentation</a>
     */
    TerminateAppResult terminateApp(TerminateAppRequest terminateAppRequest);

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateAppRequest
     * @return Result of the UpdateApp operation returned by the service.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @sample AWSServerMigration.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAppResult updateApp(UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates the specified settings for the specified replication job.
     * </p>
     * 
     * @param updateReplicationJobRequest
     * @return Result of the UpdateReplicationJob operation returned by the service.
     * @throws InvalidParameterException
     *         A specified parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required parameter is missing.
     * @throws OperationNotPermittedException
     *         This operation is not allowed.
     * @throws UnauthorizedOperationException
     *         You lack permissions needed to perform this operation. Check your IAM policies, and ensure that you are
     *         using the correct access keys.
     * @throws ServerCannotBeReplicatedException
     *         The specified server cannot be replicated.
     * @throws ReplicationJobNotFoundException
     *         The specified replication job does not exist.
     * @throws InternalErrorException
     *         An internal error occurred.
     * @throws TemporarilyUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSServerMigration.UpdateReplicationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateReplicationJob" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateReplicationJobResult updateReplicationJob(UpdateReplicationJobRequest updateReplicationJobRequest);

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
