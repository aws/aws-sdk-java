/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.elasticbeanstalk.model.*;

/**
 * Interface for accessing AWSElasticBeanstalk.
 * AWS Elastic Beanstalk <p>
 * This is the AWS Elastic Beanstalk API Reference. This guide provides detailed information about AWS Elastic Beanstalk actions, data types,
 * parameters, and errors.
 * </p>
 * <p>
 * AWS Elastic Beanstalk is a tool that makes it easy for you to create, deploy, and manage scalable, fault-tolerant applications running on Amazon Web
 * Services cloud resources.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/elasticbeanstalk/"> AWS Elastic Beanstalk </a> details page. The
 * location of the lastest AWS Elastic Beanstalk WSDL is <a href="http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl">
 * http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl </a> .
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS Elastic Beanstalk supports the following region-specific endpoint:
 * </p>
 * 
 * <ul>
 * <li> https://elasticbeanstalk.us-east-1.amazonaws.com </li>
 * 
 * </ul>
 */
public interface AWSElasticBeanstalk {

    /**
     * Overrides the default endpoint for this client ("https://elasticbeanstalk.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticbeanstalk.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://elasticbeanstalk.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "elasticbeanstalk.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://elasticbeanstalk.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSElasticBeanstalk#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     *
     * @param checkDNSAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDNSAvailability service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CheckDNSAvailability service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CheckDNSAvailabilityResult checkDNSAvailability(CheckDNSAvailabilityRequest checkDNSAvailabilityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the configuration options that are used in a particular
     * configuration template or environment, or that a specified solution
     * stack defines. The description includes the values the options, their
     * default values, and an indication of the required action on a running
     * environment if an option value is changed.
     * </p>
     *
     * @param describeConfigurationOptionsRequest Container for the necessary
     *           parameters to execute the DescribeConfigurationOptions service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeConfigurationOptions service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationOptionsResult describeConfigurationOptions(DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <p>
     * <b>NOTE:</b>When you launch an environment using a configuration
     * template, the environment gets a copy of the template. You can delete
     * or modify the environment's copy of the template without affecting the
     * running environment.
     * </p>
     *
     * @param deleteConfigurationTemplateRequest Container for the necessary
     *           parameters to execute the DeleteConfigurationTemplate service method
     *           on AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteConfigurationTemplate(DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Launches an environment for the specified application using the
     * specified configuration.
     * </p>
     *
     * @param createEnvironmentRequest Container for the necessary parameters
     *           to execute the CreateEnvironment service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CreateEnvironment service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     * @throws TooManyEnvironmentsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates the Amazon S3 storage location for the account.
     * </p>
     * <p>
     * This location is used to store user log files.
     * </p>
     *
     * @param createStorageLocationRequest Container for the necessary
     *           parameters to execute the CreateStorageLocation service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CreateStorageLocation service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     * @throws S3SubscriptionRequiredException
     * @throws TooManyBucketsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStorageLocationResult createStorageLocation(CreateStorageLocationRequest createStorageLocationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a request to compile the specified type of information of
     * the deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the
     * last lines from the application server log files of every Amazon EC2
     * instance in your environment. Use RetrieveEnvironmentInfo to access
     * the compiled information.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> RetrieveEnvironmentInfo </li>
     * 
     * </ul>
     *
     * @param requestEnvironmentInfoRequest Container for the necessary
     *           parameters to execute the RequestEnvironmentInfo service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void requestEnvironmentInfo(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an application version for the specified application.
     * </p>
     * <p>
     * <b>NOTE:</b>Once you create an application version with a specified
     * Amazon S3 bucket and key location, you cannot change that Amazon S3
     * location. If you change the Amazon S3 location, you receive an
     * exception when you attempt to launch an environment from the
     * application version.
     * </p>
     *
     * @param createApplicationVersionRequest Container for the necessary
     *           parameters to execute the CreateApplicationVersion service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CreateApplicationVersion service method,
     *         as returned by AWSElasticBeanstalk.
     * 
     * @throws TooManyApplicationsException
     * @throws TooManyApplicationVersionsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateApplicationVersionResult createApplicationVersion(CreateApplicationVersionRequest createApplicationVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete an application version that is
     * associated with a running environment.
     * </p>
     *
     * @param deleteApplicationVersionRequest Container for the necessary
     *           parameters to execute the DeleteApplicationVersion service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     * @throws SourceBundleDeletionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApplicationVersion(DeleteApplicationVersionRequest deleteApplicationVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns descriptions for existing application versions.
     * </p>
     *
     * @param describeApplicationVersionsRequest Container for the necessary
     *           parameters to execute the DescribeApplicationVersions service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeApplicationVersions service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeApplicationVersionsResult describeApplicationVersions(DescribeApplicationVersionsRequest describeApplicationVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified application along with all associated versions
     * and configurations.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete an application that has a running
     * environment.
     * </p>
     *
     * @param deleteApplicationRequest Container for the necessary parameters
     *           to execute the DeleteApplication service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApplication(DeleteApplicationRequest deleteApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the specified application version to have the specified
     * properties.
     * </p>
     * <p>
     * <b>NOTE:</b> If a property (for example, description) is not provided,
     * the value remains unchanged. To clear properties, specify an empty
     * string.
     * </p>
     *
     * @param updateApplicationVersionRequest Container for the necessary
     *           parameters to execute the UpdateApplicationVersion service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the UpdateApplicationVersion service method,
     *         as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateApplicationVersionResult updateApplicationVersion(UpdateApplicationVersionRequest updateApplicationVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an application that has one configuration template named
     * <code>default</code> and no application versions.
     * </p>
     * <p>
     * <b>NOTE:</b> The default configuration template is for a 32-bit
     * version of the Amazon Linux operating system running the Tomcat 6
     * application container.
     * </p>
     *
     * @param createApplicationRequest Container for the necessary parameters
     *           to execute the CreateApplication service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the CreateApplication service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     * @throws TooManyApplicationsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     *
     * @param swapEnvironmentCNAMEsRequest Container for the necessary
     *           parameters to execute the SwapEnvironmentCNAMEs service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the specified configuration template to have the specified
     * properties or configuration option values.
     * </p>
     * <p>
     * <b>NOTE:</b> If a property (for example, ApplicationName) is not
     * provided, its value remains unchanged. To clear such properties,
     * specify an empty string.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> DescribeConfigurationOptions </li>
     * 
     * </ul>
     *
     * @param updateConfigurationTemplateRequest Container for the necessary
     *           parameters to execute the UpdateConfigurationTemplate service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the UpdateConfigurationTemplate service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateConfigurationTemplateResult updateConfigurationTemplate(UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the compiled information from a RequestEnvironmentInfo
     * request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> RequestEnvironmentInfo </li>
     * 
     * </ul>
     *
     * @param retrieveEnvironmentInfoRequest Container for the necessary
     *           parameters to execute the RetrieveEnvironmentInfo service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the RetrieveEnvironmentInfo service method,
     *         as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RetrieveEnvironmentInfoResult retrieveEnvironmentInfo(RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     *
     * @param listAvailableSolutionStacksRequest Container for the necessary
     *           parameters to execute the ListAvailableSolutionStacks service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the ListAvailableSolutionStacks service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks(ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <p>
     * <b>NOTE:</b> If a property (for example, description) is not provided,
     * the value remains unchanged. To clear these properties, specify an
     * empty string.
     * </p>
     *
     * @param updateApplicationRequest Container for the necessary parameters
     *           to execute the UpdateApplication service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the UpdateApplication service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     *
     * @param describeEnvironmentsRequest Container for the necessary
     *           parameters to execute the DescribeEnvironments service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeEnvironments service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEnvironmentsResult describeEnvironments(DescribeEnvironmentsRequest describeEnvironmentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     *
     * @param describeEnvironmentResourcesRequest Container for the necessary
     *           parameters to execute the DescribeEnvironmentResources service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeEnvironmentResources service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEnvironmentResourcesResult describeEnvironmentResources(DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     *
     * @param terminateEnvironmentRequest Container for the necessary
     *           parameters to execute the TerminateEnvironment service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the TerminateEnvironment service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TerminateEnvironmentResult terminateEnvironment(TerminateEnvironmentRequest terminateEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration
     * template or environment, and determines whether those values are
     * valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or
     * warnings associated with the selection of option values.
     * </p>
     *
     * @param validateConfigurationSettingsRequest Container for the
     *           necessary parameters to execute the ValidateConfigurationSettings
     *           service method on AWSElasticBeanstalk.
     * 
     * @return The response from the ValidateConfigurationSettings service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ValidateConfigurationSettingsResult validateConfigurationSettings(ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Causes the environment to restart the application container server
     * running on each Amazon EC2 instance.
     * </p>
     *
     * @param restartAppServerRequest Container for the necessary parameters
     *           to execute the RestartAppServer service method on AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void restartAppServer(RestartAppServerRequest restartAppServerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the draft configuration associated with the running
     * environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates
     * a draft configuration set. You can get the draft configuration using
     * DescribeConfigurationSettings while the update is in progress or if
     * the update fails. The <code>DeploymentStatus</code> for the draft
     * configuration indicates whether the deployment is in process or has
     * failed. The draft configuration remains in existence until it is
     * deleted with this action.
     * </p>
     *
     * @param deleteEnvironmentConfigurationRequest Container for the
     *           necessary parameters to execute the DeleteEnvironmentConfiguration
     *           service method on AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteEnvironmentConfiguration(DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the environment description, deploys a new application
     * version, updates the configuration settings to an entirely new
     * configuration template, or updates select configuration option values
     * in the running environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not
     * allowed and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or
     * individual settings, a draft configuration is created and
     * DescribeConfigurationSettings for this environment returns two setting
     * descriptions with different <code>DeploymentStatus</code> values.
     * </p>
     *
     * @param updateEnvironmentRequest Container for the necessary parameters
     *           to execute the UpdateEnvironment service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the UpdateEnvironment service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a configuration template. Templates are associated with a
     * specific application and are used to deploy different versions of the
     * application with the same configuration settings.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> DescribeConfigurationOptions </li>
     * <li> DescribeConfigurationSettings </li>
     * <li> ListAvailableSolutionStacks </li>
     * 
     * </ul>
     *
     * @param createConfigurationTemplateRequest Container for the necessary
     *           parameters to execute the CreateConfigurationTemplate service method
     *           on AWSElasticBeanstalk.
     * 
     * @return The response from the CreateConfigurationTemplate service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     * @throws TooManyConfigurationTemplatesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateConfigurationTemplateResult createConfigurationTemplate(CreateConfigurationTemplateRequest createConfigurationTemplateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a description of the settings for the specified configuration
     * set, that is, either a configuration template or the configuration set
     * associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated
     * with a running environment, it is possible to receive two sets of
     * setting descriptions. One is the deployed configuration set, and the
     * other is a draft configuration of an environment that is either in the
     * process of deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * 
     * <ul>
     * <li> DeleteEnvironmentConfiguration </li>
     * 
     * </ul>
     *
     * @param describeConfigurationSettingsRequest Container for the
     *           necessary parameters to execute the DescribeConfigurationSettings
     *           service method on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeConfigurationSettings service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationSettingsResult describeConfigurationSettings(DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     *
     * @param describeApplicationsRequest Container for the necessary
     *           parameters to execute the DescribeApplications service method on
     *           AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeApplications service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeApplicationsResult describeApplications(DescribeApplicationsRequest describeApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto
     * Scaling group, load balancer, etc.) for a specified environment and
     * forces a restart.
     * </p>
     *
     * @param rebuildEnvironmentRequest Container for the necessary
     *           parameters to execute the RebuildEnvironment service method on
     *           AWSElasticBeanstalk.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rebuildEnvironment(RebuildEnvironmentRequest rebuildEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6
     * weeks.
     * </p>
     * <p>
     * <b>NOTE:</b> This action returns the most recent 1,000 events from the
     * specified NextToken.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents service method on AWSElasticBeanstalk.
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates the Amazon S3 storage location for the account.
     * </p>
     * <p>
     * This location is used to store user log files.
     * </p>
     * 
     * @return The response from the CreateStorageLocation service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     * @throws S3SubscriptionRequiredException
     * @throws TooManyBucketsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStorageLocationResult createStorageLocation() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns descriptions for existing application versions.
     * </p>
     * 
     * @return The response from the DescribeApplicationVersions service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeApplicationVersionsResult describeApplicationVersions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void swapEnvironmentCNAMEs() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     * 
     * @return The response from the ListAvailableSolutionStacks service
     *         method, as returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @return The response from the DescribeEnvironments service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEnvironmentsResult describeEnvironments() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @return The response from the DescribeApplications service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeApplicationsResult describeApplications() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6
     * weeks.
     * </p>
     * <p>
     * <b>NOTE:</b> This action returns the most recent 1,000 events from the
     * specified NextToken.
     * </p>
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AWSElasticBeanstalk.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        