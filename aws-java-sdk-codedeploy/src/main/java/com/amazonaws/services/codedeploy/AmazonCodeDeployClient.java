/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.services.codedeploy.model.transform.*;

/**
 * Client for accessing AmazonCodeDeploy.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS CodeDeploy <b>Overview</b> <p>
 * This is the AWS CodeDeploy API Reference. This guide provides
 * descriptions of the AWS CodeDeploy APIs. For additional information,
 * see the
 * <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide"> AWS CodeDeploy User Guide </a>
 * .
 * </p>
 * <b>Using the APIs</b> <p>
 * You can use the AWS CodeDeploy APIs to work with the following items:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>Applications</i> , which are unique identifiers that AWS
 * CodeDeploy uses to ensure that the correct combinations of revisions,
 * deployment configurations, and deployment groups are being referenced
 * during deployments.
 * </p>
 * <p>
 * You can work with applications by calling CreateApplication,
 * DeleteApplication, GetApplication, ListApplications,
 * BatchGetApplications, and UpdateApplication to create, delete, and get
 * information about applications, and to change information about an
 * application, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment configurations</i> , which are sets of deployment rules
 * and deployment success and failure conditions that AWS CodeDeploy uses
 * during deployments.
 * </p>
 * <p>
 * You can work with deployment configurations by calling
 * CreateDeploymentConfig, DeleteDeploymentConfig, GetDeploymentConfig,
 * and ListDeploymentConfigs to create, delete, and get information about
 * deployment configurations, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment groups</i> , which represent groups of Amazon EC2
 * instances to which application revisions can be deployed.
 * </p>
 * <p>
 * You can work with deployment groups by calling CreateDeploymentGroup,
 * DeleteDeploymentGroup, GetDeploymentGroup, ListDeploymentGroups, and
 * UpdateDeploymentGroup to create, delete, and get information about
 * single and multiple deployment groups, and to change information about
 * a deployment group, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment instances</i> (also known simply as <i>instances</i> ),
 * which represent Amazon EC2 instances to which application revisions
 * are deployed. Deployment instances are identified by their Amazon EC2
 * tags or Auto Scaling group names. Deployment instances belong to
 * deployment groups.
 * </p>
 * <p>
 * You can work with deployment instances by calling
 * GetDeploymentInstance and ListDeploymentInstances to get information
 * about single and multiple deployment instances, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployments</i> , which represent the process of deploying
 * revisions to deployment groups.
 * </p>
 * <p>
 * You can work with deployments by calling CreateDeployment,
 * GetDeployment, ListDeployments, BatchGetDeployments, and
 * StopDeployment to create and get information about deployments, and to
 * stop a deployment, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Application revisions</i> (also known simply as <i>revisions</i>
 * ), which are archive files that are stored in Amazon S3 buckets or
 * GitHub repositories. These revisions contain source content (such as
 * source code, web pages, executable files, any deployment scripts, and
 * similar) along with an Application Specification file (AppSpec file).
 * (The AppSpec file is unique to AWS CodeDeploy; it defines a series of
 * deployment actions that you want AWS CodeDeploy to execute.) An
 * application revision is uniquely identified by its Amazon S3 object
 * key and its ETag, version, or both. Application revisions are deployed
 * to deployment groups.
 * </p>
 * <p>
 * You can work with application revisions by calling
 * GetApplicationRevision, ListApplicationRevisions, and
 * RegisterApplicationRevision to get information about application
 * revisions and to inform AWS CodeDeploy about an application revision,
 * respectively.
 * </p>
 * </li>
 * 
 * </ul>
 */
public class AmazonCodeDeployClient extends AmazonWebServiceClient implements AmazonCodeDeploy {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCodeDeploy.class);

    /**
     * List of exception unmarshallers for all AmazonCodeDeploy exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeDeploy.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCodeDeployClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeDeploy.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCodeDeploy
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCodeDeployClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCodeDeployClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCodeDeploy
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCodeDeployClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials
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
     *                       client connects to AmazonCodeDeploy
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeDeploy using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCodeDeploy
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InvalidKeyPrefixFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RevisionDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApplicationAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSortOrderExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentGroupDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApplicationLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidApplicationNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentGroupLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSortByExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentGroupNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMinimumHealthyHostValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRoleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidBucketNameFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentNotStartedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentGroupNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeployedStateFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApplicationDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApplicationNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTimeRangeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DescriptionTooLongExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRevisionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAutoScalingGroupExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BucketNameFilterRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidEC2TagExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RoleRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentAlreadyCompletedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentConfigNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentGroupAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RevisionRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInstanceStatusExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentStatusExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("codedeploy.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/codedeploy/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/codedeploy/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     *
     * @param getDeploymentGroupRequest Container for the necessary
     *           parameters to execute the GetDeploymentGroup service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the GetDeploymentGroup service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentGroupDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidApplicationNameException
     * @throws DeploymentGroupNameRequiredException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDeploymentGroupResult getDeploymentGroup(GetDeploymentGroupRequest getDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentGroupRequest> request = null;
        Response<GetDeploymentGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentGroupRequestMarshaller().marshall(getDeploymentGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentGroupResult, JsonUnmarshallerContext> unmarshaller =
                new GetDeploymentGroupResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentGroupResult> responseHandler =
                new JsonResponseHandler<GetDeploymentGroupResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     *
     * @param updateApplicationRequest Container for the necessary parameters
     *           to execute the UpdateApplication service method on AmazonCodeDeploy.
     * 
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateApplication(UpdateApplicationRequest updateApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestMarshaller().marshall(updateApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Creates a new deployment configuration.
     * </p>
     *
     * @param createDeploymentConfigRequest Container for the necessary
     *           parameters to execute the CreateDeploymentConfig service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the CreateDeploymentConfig service method,
     *         as returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentConfigLimitExceededException
     * @throws InvalidMinimumHealthyHostValueException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigAlreadyExistsException
     * @throws DeploymentConfigNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentConfigResult createDeploymentConfig(CreateDeploymentConfigRequest createDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentConfigRequest> request = null;
        Response<CreateDeploymentConfigResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentConfigRequestMarshaller().marshall(createDeploymentConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDeploymentConfigResult, JsonUnmarshallerContext> unmarshaller =
                new CreateDeploymentConfigResultJsonUnmarshaller();
            JsonResponseHandler<CreateDeploymentConfigResult> responseHandler =
                new JsonResponseHandler<CreateDeploymentConfigResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the Amazon EC2 instances for a deployment within the AWS user
     * account.
     * </p>
     *
     * @param listDeploymentInstancesRequest Container for the necessary
     *           parameters to execute the ListDeploymentInstances service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the ListDeploymentInstances service method,
     *         as returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws InvalidInstanceStatusException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentInstancesResult listDeploymentInstances(ListDeploymentInstancesRequest listDeploymentInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentInstancesRequest> request = null;
        Response<ListDeploymentInstancesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentInstancesRequestMarshaller().marshall(listDeploymentInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentInstancesResult, JsonUnmarshallerContext> unmarshaller =
                new ListDeploymentInstancesResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentInstancesResult> responseHandler =
                new JsonResponseHandler<ListDeploymentInstancesResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the applications registered within the AWS user account.
     * </p>
     *
     * @param listApplicationsRequest Container for the necessary parameters
     *           to execute the ListApplications service method on AmazonCodeDeploy.
     * 
     * @return The response from the ListApplications service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestMarshaller().marshall(listApplicationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListApplicationsResult, JsonUnmarshallerContext> unmarshaller =
                new ListApplicationsResultJsonUnmarshaller();
            JsonResponseHandler<ListApplicationsResult> responseHandler =
                new JsonResponseHandler<ListApplicationsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified
     * application.
     * </p>
     *
     * @param registerApplicationRevisionRequest Container for the necessary
     *           parameters to execute the RegisterApplicationRevision service method
     *           on AmazonCodeDeploy.
     * 
     * 
     * @throws InvalidRevisionException
     * @throws RevisionRequiredException
     * @throws InvalidApplicationNameException
     * @throws DescriptionTooLongException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerApplicationRevision(RegisterApplicationRevisionRequest registerApplicationRevisionRequest) {
        ExecutionContext executionContext = createExecutionContext(registerApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterApplicationRevisionRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterApplicationRevisionRequestMarshaller().marshall(registerApplicationRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     *
     * @param getDeploymentConfigRequest Container for the necessary
     *           parameters to execute the GetDeploymentConfig service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the GetDeploymentConfig service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDeploymentConfigResult getDeploymentConfig(GetDeploymentConfigRequest getDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentConfigRequest> request = null;
        Response<GetDeploymentConfigResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentConfigRequestMarshaller().marshall(getDeploymentConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentConfigResult, JsonUnmarshallerContext> unmarshaller =
                new GetDeploymentConfigResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentConfigResult> responseHandler =
                new JsonResponseHandler<GetDeploymentConfigResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the deployment groups for an application registered within the
     * AWS user account.
     * </p>
     *
     * @param listDeploymentGroupsRequest Container for the necessary
     *           parameters to execute the ListDeploymentGroups service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the ListDeploymentGroups service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws InvalidNextTokenException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentGroupsResult listDeploymentGroups(ListDeploymentGroupsRequest listDeploymentGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentGroupsRequest> request = null;
        Response<ListDeploymentGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentGroupsRequestMarshaller().marshall(listDeploymentGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentGroupsResult, JsonUnmarshallerContext> unmarshaller =
                new ListDeploymentGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentGroupsResult> responseHandler =
                new JsonResponseHandler<ListDeploymentGroupsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     *
     * @param batchGetApplicationsRequest Container for the necessary
     *           parameters to execute the BatchGetApplications service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the BatchGetApplications service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetApplicationsResult batchGetApplications(BatchGetApplicationsRequest batchGetApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetApplicationsRequest> request = null;
        Response<BatchGetApplicationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetApplicationsRequestMarshaller().marshall(batchGetApplicationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetApplicationsResult, JsonUnmarshallerContext> unmarshaller =
                new BatchGetApplicationsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetApplicationsResult> responseHandler =
                new JsonResponseHandler<BatchGetApplicationsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     *
     * @param deleteDeploymentGroupRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentGroup service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the DeleteDeploymentGroup service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidRoleException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidApplicationNameException
     * @throws DeploymentGroupNameRequiredException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDeploymentGroupResult deleteDeploymentGroup(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentGroupRequest> request = null;
        Response<DeleteDeploymentGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentGroupRequestMarshaller().marshall(deleteDeploymentGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDeploymentGroupResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteDeploymentGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDeploymentGroupResult> responseHandler =
                new JsonResponseHandler<DeleteDeploymentGroupResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     *
     * @param listApplicationRevisionsRequest Container for the necessary
     *           parameters to execute the ListApplicationRevisions service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the ListApplicationRevisions service method,
     *         as returned by AmazonCodeDeploy.
     * 
     * @throws InvalidSortByException
     * @throws InvalidApplicationNameException
     * @throws InvalidKeyPrefixFilterException
     * @throws InvalidNextTokenException
     * @throws BucketNameFilterRequiredException
     * @throws InvalidSortOrderException
     * @throws InvalidDeployedStateFilterException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidBucketNameFilterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListApplicationRevisionsResult listApplicationRevisions(ListApplicationRevisionsRequest listApplicationRevisionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listApplicationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationRevisionsRequest> request = null;
        Response<ListApplicationRevisionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationRevisionsRequestMarshaller().marshall(listApplicationRevisionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListApplicationRevisionsResult, JsonUnmarshallerContext> unmarshaller =
                new ListApplicationRevisionsResultJsonUnmarshaller();
            JsonResponseHandler<ListApplicationRevisionsResult> responseHandler =
                new JsonResponseHandler<ListApplicationRevisionsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about an existing deployment group.
     * </p>
     *
     * @param updateDeploymentGroupRequest Container for the necessary
     *           parameters to execute the UpdateDeploymentGroup service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the UpdateDeploymentGroup service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidRoleException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidApplicationNameException
     * @throws InvalidAutoScalingGroupException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentGroupAlreadyExistsException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidEC2TagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDeploymentGroupResult updateDeploymentGroup(UpdateDeploymentGroupRequest updateDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeploymentGroupRequest> request = null;
        Response<UpdateDeploymentGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeploymentGroupRequestMarshaller().marshall(updateDeploymentGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDeploymentGroupResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateDeploymentGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDeploymentGroupResult> responseHandler =
                new JsonResponseHandler<UpdateDeploymentGroupResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the deployments under a deployment group for an application
     * registered within the AWS user account.
     * </p>
     *
     * @param listDeploymentsRequest Container for the necessary parameters
     *           to execute the ListDeployments service method on AmazonCodeDeploy.
     * 
     * @return The response from the ListDeployments service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentGroupDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidApplicationNameException
     * @throws InvalidTimeRangeException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidNextTokenException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidDeploymentStatusException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentsRequest> request = null;
        Response<ListDeploymentsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentsRequestMarshaller().marshall(listDeploymentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentsResult, JsonUnmarshallerContext> unmarshaller =
                new ListDeploymentsResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentsResult> responseHandler =
                new JsonResponseHandler<ListDeploymentsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about an application.
     * </p>
     *
     * @param getApplicationRequest Container for the necessary parameters to
     *           execute the GetApplication service method on AmazonCodeDeploy.
     * 
     * @return The response from the GetApplication service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestMarshaller().marshall(getApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApplicationResult, JsonUnmarshallerContext> unmarshaller =
                new GetApplicationResultJsonUnmarshaller();
            JsonResponseHandler<GetApplicationResult> responseHandler =
                new JsonResponseHandler<GetApplicationResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new application.
     * </p>
     *
     * @param createApplicationRequest Container for the necessary parameters
     *           to execute the CreateApplication service method on AmazonCodeDeploy.
     * 
     * @return The response from the CreateApplication service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationLimitExceededException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestMarshaller().marshall(createApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateApplicationResult, JsonUnmarshallerContext> unmarshaller =
                new CreateApplicationResultJsonUnmarshaller();
            JsonResponseHandler<CreateApplicationResult> responseHandler =
                new JsonResponseHandler<CreateApplicationResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     *
     * @param stopDeploymentRequest Container for the necessary parameters to
     *           execute the StopDeployment service method on AmazonCodeDeploy.
     * 
     * @return The response from the StopDeployment service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws DeploymentAlreadyCompletedException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(stopDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDeploymentRequest> request = null;
        Response<StopDeploymentResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDeploymentRequestMarshaller().marshall(stopDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopDeploymentResult, JsonUnmarshallerContext> unmarshaller =
                new StopDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<StopDeploymentResult> responseHandler =
                new JsonResponseHandler<StopDeploymentResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new deployment group for application revisions to be
     * deployed to.
     * </p>
     *
     * @param createDeploymentGroupRequest Container for the necessary
     *           parameters to execute the CreateDeploymentGroup service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the CreateDeploymentGroup service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws RoleRequiredException
     * @throws InvalidRoleException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidApplicationNameException
     * @throws InvalidAutoScalingGroupException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentGroupAlreadyExistsException
     * @throws DeploymentGroupLimitExceededException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidEC2TagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentGroupResult createDeploymentGroup(CreateDeploymentGroupRequest createDeploymentGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentGroupRequest> request = null;
        Response<CreateDeploymentGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentGroupRequestMarshaller().marshall(createDeploymentGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDeploymentGroupResult, JsonUnmarshallerContext> unmarshaller =
                new CreateDeploymentGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateDeploymentGroupResult> responseHandler =
                new JsonResponseHandler<CreateDeploymentGroupResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an application.
     * </p>
     *
     * @param deleteApplicationRequest Container for the necessary parameters
     *           to execute the DeleteApplication service method on AmazonCodeDeploy.
     * 
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApplication(DeleteApplicationRequest deleteApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestMarshaller().marshall(deleteApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     *
     * @param batchGetDeploymentsRequest Container for the necessary
     *           parameters to execute the BatchGetDeployments service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the BatchGetDeployments service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetDeploymentsResult batchGetDeployments(BatchGetDeploymentsRequest batchGetDeploymentsRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentsRequest> request = null;
        Response<BatchGetDeploymentsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentsRequestMarshaller().marshall(batchGetDeploymentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetDeploymentsResult, JsonUnmarshallerContext> unmarshaller =
                new BatchGetDeploymentsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetDeploymentsResult> responseHandler =
                new JsonResponseHandler<BatchGetDeploymentsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>A deployment configuration cannot be deleted if it is
     * currently in use. Also, predefined configurations cannot be deleted.
     * </p>
     *
     * @param deleteDeploymentConfigRequest Container for the necessary
     *           parameters to execute the DeleteDeploymentConfig service method on
     *           AmazonCodeDeploy.
     * 
     * 
     * @throws InvalidOperationException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigInUseException
     * @throws DeploymentConfigNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDeploymentConfig(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentConfigRequest> request = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentConfigRequestMarshaller().marshall(deleteDeploymentConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            
            endClientExecution(awsRequestMetrics, request, null, LOGGING_AWS_REQUEST_METRIC);
        }
    }
    
    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     *
     * @param getDeploymentRequest Container for the necessary parameters to
     *           execute the GetDeployment service method on AmazonCodeDeploy.
     * 
     * @return The response from the GetDeployment service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestMarshaller().marshall(getDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentResult, JsonUnmarshallerContext> unmarshaller =
                new GetDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentResult> responseHandler =
                new JsonResponseHandler<GetDeploymentResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deploys an application revision to the specified deployment group.
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment service method on AmazonCodeDeploy.
     * 
     * @return The response from the CreateDeployment service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidRevisionException
     * @throws DeploymentGroupDoesNotExistException
     * @throws RevisionRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidApplicationNameException
     * @throws DeploymentGroupNameRequiredException
     * @throws DescriptionTooLongException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentLimitExceededException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestMarshaller().marshall(createDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDeploymentResult, JsonUnmarshallerContext> unmarshaller =
                new CreateDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<CreateDeploymentResult> responseHandler =
                new JsonResponseHandler<CreateDeploymentResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about an Amazon EC2 instance as part of a
     * deployment.
     * </p>
     *
     * @param getDeploymentInstanceRequest Container for the necessary
     *           parameters to execute the GetDeploymentInstance service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the GetDeploymentInstance service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws InstanceIdRequiredException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws InstanceDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDeploymentInstanceResult getDeploymentInstance(GetDeploymentInstanceRequest getDeploymentInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(getDeploymentInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentInstanceRequest> request = null;
        Response<GetDeploymentInstanceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentInstanceRequestMarshaller().marshall(getDeploymentInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentInstanceResult, JsonUnmarshallerContext> unmarshaller =
                new GetDeploymentInstanceResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentInstanceResult> responseHandler =
                new JsonResponseHandler<GetDeploymentInstanceResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the deployment configurations within the AWS user account.
     * </p>
     *
     * @param listDeploymentConfigsRequest Container for the necessary
     *           parameters to execute the ListDeploymentConfigs service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the ListDeploymentConfigs service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentConfigsResult listDeploymentConfigs(ListDeploymentConfigsRequest listDeploymentConfigsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeploymentConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentConfigsRequest> request = null;
        Response<ListDeploymentConfigsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentConfigsRequestMarshaller().marshall(listDeploymentConfigsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentConfigsResult, JsonUnmarshallerContext> unmarshaller =
                new ListDeploymentConfigsResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentConfigsResult> responseHandler =
                new JsonResponseHandler<ListDeploymentConfigsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     *
     * @param getApplicationRevisionRequest Container for the necessary
     *           parameters to execute the GetApplicationRevision service method on
     *           AmazonCodeDeploy.
     * 
     * @return The response from the GetApplicationRevision service method,
     *         as returned by AmazonCodeDeploy.
     * 
     * @throws InvalidRevisionException
     * @throws RevisionRequiredException
     * @throws InvalidApplicationNameException
     * @throws RevisionDoesNotExistException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetApplicationRevisionResult getApplicationRevision(GetApplicationRevisionRequest getApplicationRevisionRequest) {
        ExecutionContext executionContext = createExecutionContext(getApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRevisionRequest> request = null;
        Response<GetApplicationRevisionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRevisionRequestMarshaller().marshall(getApplicationRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApplicationRevisionResult, JsonUnmarshallerContext> unmarshaller =
                new GetApplicationRevisionResultJsonUnmarshaller();
            JsonResponseHandler<GetApplicationRevisionResult> responseHandler =
                new JsonResponseHandler<GetApplicationRevisionResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes an existing application's name.
     * </p>
     * 
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateApplication() throws AmazonServiceException, AmazonClientException {
        updateApplication(new UpdateApplicationRequest());
    }
    
    /**
     * <p>
     * Lists the applications registered within the AWS user account.
     * </p>
     * 
     * @return The response from the ListApplications service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListApplicationsResult listApplications() throws AmazonServiceException, AmazonClientException {
        return listApplications(new ListApplicationsRequest());
    }
    
    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     * 
     * @return The response from the BatchGetApplications service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetApplicationsResult batchGetApplications() throws AmazonServiceException, AmazonClientException {
        return batchGetApplications(new BatchGetApplicationsRequest());
    }
    
    /**
     * <p>
     * Lists the deployments under a deployment group for an application
     * registered within the AWS user account.
     * </p>
     * 
     * @return The response from the ListDeployments service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws DeploymentGroupDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidApplicationNameException
     * @throws InvalidTimeRangeException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidNextTokenException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidDeploymentStatusException
     * @throws ApplicationNameRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentsResult listDeployments() throws AmazonServiceException, AmazonClientException {
        return listDeployments(new ListDeploymentsRequest());
    }
    
    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     * 
     * @return The response from the BatchGetDeployments service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetDeploymentsResult batchGetDeployments() throws AmazonServiceException, AmazonClientException {
        return batchGetDeployments(new BatchGetDeploymentsRequest());
    }
    
    /**
     * <p>
     * Lists the deployment configurations within the AWS user account.
     * </p>
     * 
     * @return The response from the ListDeploymentConfigs service method, as
     *         returned by AmazonCodeDeploy.
     * 
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCodeDeploy indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDeploymentConfigsResult listDeploymentConfigs() throws AmazonServiceException, AmazonClientException {
        return listDeploymentConfigs(new ListDeploymentConfigsRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
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

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        