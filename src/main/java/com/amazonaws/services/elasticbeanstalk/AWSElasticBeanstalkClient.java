/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.services.elasticbeanstalk.model.transform.*;


/**
 * Client for accessing AWSElasticBeanstalk.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
public class AWSElasticBeanstalkClient extends AmazonWebServiceClient implements AWSElasticBeanstalk {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWSElasticBeanstalk exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
    
    
    /** AWS signer for authenticating requests. */
    private QueryStringSigner signer;


    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSElasticBeanstalk
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }
    
    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElasticBeanstalk using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSElasticBeanstalk
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() { 
        exceptionUnmarshallers.add(new TooManyEnvironmentsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new S3SubscriptionRequiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyApplicationVersionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyApplicationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceBundleDeletionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyConfigurationTemplatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyBucketsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("elasticbeanstalk.us-east-1.amazonaws.com");

        signer = new QueryStringSigner();
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/elasticbeanstalk/request.handlers"));
    }
    
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CheckDNSAvailabilityRequest> request = new CheckDNSAvailabilityRequestMarshaller().marshall(checkDNSAvailabilityRequest);
        return invoke(request, new CheckDNSAvailabilityResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeConfigurationOptionsRequest> request = new DescribeConfigurationOptionsRequestMarshaller().marshall(describeConfigurationOptionsRequest);
        return invoke(request, new DescribeConfigurationOptionsResultStaxUnmarshaller());
    }
    
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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteConfigurationTemplate(DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteConfigurationTemplateRequest> request = new DeleteConfigurationTemplateRequestMarshaller().marshall(deleteConfigurationTemplateRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateEnvironmentRequest> request = new CreateEnvironmentRequestMarshaller().marshall(createEnvironmentRequest);
        return invoke(request, new CreateEnvironmentResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateStorageLocationRequest> request = new CreateStorageLocationRequestMarshaller().marshall(createStorageLocationRequest);
        return invoke(request, new CreateStorageLocationResultStaxUnmarshaller());
    }
    
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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void requestEnvironmentInfo(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RequestEnvironmentInfoRequest> request = new RequestEnvironmentInfoRequestMarshaller().marshall(requestEnvironmentInfoRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateApplicationVersionRequest> request = new CreateApplicationVersionRequestMarshaller().marshall(createApplicationVersionRequest);
        return invoke(request, new CreateApplicationVersionResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteApplicationVersionRequest> request = new DeleteApplicationVersionRequestMarshaller().marshall(deleteApplicationVersionRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeApplicationVersionsRequest> request = new DescribeApplicationVersionsRequestMarshaller().marshall(describeApplicationVersionsRequest);
        return invoke(request, new DescribeApplicationVersionsResultStaxUnmarshaller());
    }
    
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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApplication(DeleteApplicationRequest deleteApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteApplicationRequest> request = new DeleteApplicationRequestMarshaller().marshall(deleteApplicationRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateApplicationVersionRequest> request = new UpdateApplicationVersionRequestMarshaller().marshall(updateApplicationVersionRequest);
        return invoke(request, new UpdateApplicationVersionResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateApplicationRequest> request = new CreateApplicationRequestMarshaller().marshall(createApplicationRequest);
        return invoke(request, new CreateApplicationResultStaxUnmarshaller());
    }
    
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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<SwapEnvironmentCNAMEsRequest> request = new SwapEnvironmentCNAMEsRequestMarshaller().marshall(swapEnvironmentCNAMEsRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateConfigurationTemplateRequest> request = new UpdateConfigurationTemplateRequestMarshaller().marshall(updateConfigurationTemplateRequest);
        return invoke(request, new UpdateConfigurationTemplateResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<RetrieveEnvironmentInfoRequest> request = new RetrieveEnvironmentInfoRequestMarshaller().marshall(retrieveEnvironmentInfoRequest);
        return invoke(request, new RetrieveEnvironmentInfoResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ListAvailableSolutionStacksRequest> request = new ListAvailableSolutionStacksRequestMarshaller().marshall(listAvailableSolutionStacksRequest);
        return invoke(request, new ListAvailableSolutionStacksResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateApplicationRequest> request = new UpdateApplicationRequestMarshaller().marshall(updateApplicationRequest);
        return invoke(request, new UpdateApplicationResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeEnvironmentsRequest> request = new DescribeEnvironmentsRequestMarshaller().marshall(describeEnvironmentsRequest);
        return invoke(request, new DescribeEnvironmentsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeEnvironmentResourcesRequest> request = new DescribeEnvironmentResourcesRequestMarshaller().marshall(describeEnvironmentResourcesRequest);
        return invoke(request, new DescribeEnvironmentResourcesResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<TerminateEnvironmentRequest> request = new TerminateEnvironmentRequestMarshaller().marshall(terminateEnvironmentRequest);
        return invoke(request, new TerminateEnvironmentResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<ValidateConfigurationSettingsRequest> request = new ValidateConfigurationSettingsRequestMarshaller().marshall(validateConfigurationSettingsRequest);
        return invoke(request, new ValidateConfigurationSettingsResultStaxUnmarshaller());
    }
    
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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void restartAppServer(RestartAppServerRequest restartAppServerRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RestartAppServerRequest> request = new RestartAppServerRequestMarshaller().marshall(restartAppServerRequest);
        invoke(request, null);
    }
    
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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteEnvironmentConfiguration(DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteEnvironmentConfigurationRequest> request = new DeleteEnvironmentConfigurationRequestMarshaller().marshall(deleteEnvironmentConfigurationRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateEnvironmentRequest> request = new UpdateEnvironmentRequestMarshaller().marshall(updateEnvironmentRequest);
        return invoke(request, new UpdateEnvironmentResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<CreateConfigurationTemplateRequest> request = new CreateConfigurationTemplateRequestMarshaller().marshall(createConfigurationTemplateRequest);
        return invoke(request, new CreateConfigurationTemplateResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeConfigurationSettingsRequest> request = new DescribeConfigurationSettingsRequestMarshaller().marshall(describeConfigurationSettingsRequest);
        return invoke(request, new DescribeConfigurationSettingsResultStaxUnmarshaller());
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeApplicationsRequest> request = new DescribeApplicationsRequestMarshaller().marshall(describeApplicationsRequest);
        return invoke(request, new DescribeApplicationsResultStaxUnmarshaller());
    }
    
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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSElasticBeanstalk indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rebuildEnvironment(RebuildEnvironmentRequest rebuildEnvironmentRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<RebuildEnvironmentRequest> request = new RebuildEnvironmentRequestMarshaller().marshall(rebuildEnvironmentRequest);
        invoke(request, null);
    }
    
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
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeEventsRequest> request = new DescribeEventsRequestMarshaller().marshall(describeEventsRequest);
        return invoke(request, new DescribeEventsResultStaxUnmarshaller());
    }
    
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
    public CreateStorageLocationResult createStorageLocation() throws AmazonServiceException, AmazonClientException {
        return createStorageLocation(new CreateStorageLocationRequest());
    }
    
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
    public DescribeApplicationVersionsResult describeApplicationVersions() throws AmazonServiceException, AmazonClientException {
        return describeApplicationVersions(new DescribeApplicationVersionsRequest());
    }
    
    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
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
    public void swapEnvironmentCNAMEs() throws AmazonServiceException, AmazonClientException {
        swapEnvironmentCNAMEs(new SwapEnvironmentCNAMEsRequest());
    }
    
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
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks() throws AmazonServiceException, AmazonClientException {
        return listAvailableSolutionStacks(new ListAvailableSolutionStacksRequest());
    }
    
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
    public DescribeEnvironmentsResult describeEnvironments() throws AmazonServiceException, AmazonClientException {
        return describeEnvironments(new DescribeEnvironmentsRequest());
    }
    
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
    public DescribeApplicationsResult describeApplications() throws AmazonServiceException, AmazonClientException {
        return describeApplications(new DescribeApplicationsRequest());
    }
    
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
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException {
        return describeEvents(new DescribeEventsRequest());
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials(); 
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext();
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        
        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        