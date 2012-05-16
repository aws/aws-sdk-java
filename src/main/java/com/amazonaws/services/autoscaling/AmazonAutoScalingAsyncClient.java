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
package com.amazonaws.services.autoscaling;
            
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

import com.amazonaws.services.autoscaling.model.*;


/**
 * Client for accessing AmazonAutoScaling.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 * Auto Scaling <p>
 * This is the <i>Auto Scaling API Reference</i> . This guide provides detailed information about Auto Scaling actions, data types, parameters, and
 * errors. For detailed information about Auto Scaling features and their associated API calls, go to the <a
 * href="http://docs.amazonwebservices.com/AutoScaling/latest/DeveloperGuide/"> Auto Scaling Developer Guide </a> .
 * </p>
 * <p>
 * Auto Scaling is a web service designed to automatically launch or terminate Amazon Elastic Compute Cloud (Amazon EC2) instances based on user-defined
 * policies, schedules, and health checks. This service is used in conjunction with Amazon CloudWatch and Elastic Load Balancing services.
 * </p>
 * <p>
 * This reference is based on the current WSDL, which is available at:
 * </p>
 * <p>
 * <a href="http://autoscaling.amazonaws.com/doc/2011-01-01/AutoScaling.wsdl"> http://autoscaling.amazonaws.com/doc/2011-01-01/AutoScaling.wsdl </a>
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For information about this product's regions and endpoints, go to <a href="http://docs.amazonwebservices.com/general/latest/gr/index.html?rande.html">
 * Regions and Endpoints </a> in the Amazon Web Services General Reference.
 * </p> 
 */       
public class AmazonAutoScalingAsyncClient extends AmazonAutoScalingClient
        implements AmazonAutoScalingAsync { 

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    
    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AmazonAutoScaling using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be 
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */                                      
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     * 
     * <p> 
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials 
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }
     
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials,
     * executor service, and client configuration options.
     * 
     * <p> 
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentials 
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AmazonAutoScaling using the specified AWS account credentials provider.
     * Default client settings will be used, and a default cached thread pool will be 
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */                                      
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }
    
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     * 
     * <p> 
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonAutoScaling using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     * 
     * <p> 
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     * 
     * @param awsCredentialsProvider 
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonAutoScalingAsyncClient(AWSCredentialsProvider awsCredentialsProvider, 
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }


    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *   
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }
    
    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * Returns a full description of each Auto Scaling group in the given
     * list. This includes all Amazon EC2 instances that are members of the
     * group. If a list of names is not provided, the service returns the
     * full details of all Auto Scaling groups.
     * </p>
     * <p>
     * This action supports pagination by returning a token if there are
     * more pages to retrieve. To get the next page, call this action again
     * with the returned token as the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeAutoScalingGroupsRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingGroups operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingGroups service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(final DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingGroupsResult>() {
            public DescribeAutoScalingGroupsResult call() throws Exception {
                return describeAutoScalingGroups(describeAutoScalingGroupsRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Enables monitoring of group metrics for the Auto Scaling group
     * specified in <code>AutoScalingGroupName</code> .
     * You can specify the list of enabled metrics with the
     * <code>Metrics</code> parameter.
     * </p>
     * <p>
     * Auto scaling metrics collection can be turned on only if the
     * <code>InstanceMonitoring</code> flag, in the Auto Scaling group's
     * launch configuration, is set to <code>True</code> .
     * 
     * </p>
     *
     * @param enableMetricsCollectionRequest Container for the necessary
     *           parameters to execute the EnableMetricsCollection operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         EnableMetricsCollection service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableMetricsCollectionAsync(final EnableMetricsCollectionRequest enableMetricsCollectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                enableMetricsCollection(enableMetricsCollectionRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Resumes Auto Scaling processes for an Auto Scaling group. For more
     * information, see SuspendProcesses and ProcessType.
     * </p>
     *
     * @param resumeProcessesRequest Container for the necessary parameters
     *           to execute the ResumeProcesses operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         ResumeProcesses service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resumeProcessesAsync(final ResumeProcessesRequest resumeProcessesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                resumeProcesses(resumeProcessesRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the specified LaunchConfiguration.
     * </p>
     * <p>
     * The specified launch configuration must not be attached to an Auto
     * Scaling group. When this call completes, the launch configuration is
     * no longer available for use.
     * </p>
     *
     * @param deleteLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the DeleteLaunchConfiguration operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLaunchConfiguration service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLaunchConfigurationAsync(final DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteLaunchConfiguration(deleteLaunchConfigurationRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns descriptions of what each policy does. This action supports
     * pagination. If the response includes a token, there are more records
     * available. To get the additional records, repeat the request with the
     * response token as the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describePoliciesRequest Container for the necessary parameters
     *           to execute the DescribePolicies operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePolicies service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePoliciesResult> describePoliciesAsync(final DescribePoliciesRequest describePoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePoliciesResult>() {
            public DescribePoliciesResult call() throws Exception {
                return describePolicies(describePoliciesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Returns scaling process types for use in the ResumeProcesses and
     * SuspendProcesses actions.
     * </p>
     *
     * @param describeScalingProcessTypesRequest Container for the necessary
     *           parameters to execute the DescribeScalingProcessTypes operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingProcessTypes service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(final DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingProcessTypesResult>() {
            public DescribeScalingProcessTypesResult call() throws Exception {
                return describeScalingProcessTypes(describeScalingProcessTypesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new Auto Scaling group with the specified name and other
     * attributes. When the creation request is completed, the Auto Scaling
     * group is ready to be used in other calls.
     * </p>
     * <p>
     * <b>NOTE:</b> The Auto Scaling group name must be unique within the
     * scope of your AWS account, and under the quota of Auto Scaling groups
     * allowed for your account.
     * </p>
     *
     * @param createAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the CreateAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createAutoScalingGroupAsync(final CreateAutoScalingGroupRequest createAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createAutoScalingGroup(createAutoScalingGroupRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the scaling activities for the specified Auto Scaling group.
     * </p>
     * <p>
     * If the specified <code>ActivityIds</code> list is empty, all the
     * activities from the past six weeks are returned. Activities are sorted
     * by completion time. Activities still in progress appear first on the
     * list.
     * </p>
     * <p>
     * This action supports pagination. If the response includes a token,
     * there are more records available. To get the additional records,
     * repeat the request with the response token as the
     * <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeScalingActivitiesRequest Container for the necessary
     *           parameters to execute the DescribeScalingActivities operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingActivities service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(final DescribeScalingActivitiesRequest describeScalingActivitiesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScalingActivitiesResult>() {
            public DescribeScalingActivitiesResult call() throws Exception {
                return describeScalingActivities(describeScalingActivitiesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of notification actions associated with Auto Scaling
     * groups for specified events.
     * </p>
     *
     * @param describeNotificationConfigurationsRequest Container for the
     *           necessary parameters to execute the DescribeNotificationConfigurations
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNotificationConfigurations service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(final DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeNotificationConfigurationsResult>() {
            public DescribeNotificationConfigurationsResult call() throws Exception {
                return describeNotificationConfigurations(describeNotificationConfigurationsRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Lists the Auto Scaling group tags.
     * </p>
     * <p>
     * You can use filters to limit results when describing tags. For
     * example, you can query for tags of a particular Auto Scaling group.
     * You can specify multiple values for a filter. A tag must match at
     * least one of the specified values for it to be included in the
     * results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes
     * information for a particular tag only if it matches all your filters.
     * If there's no match, no special message is returned.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTagsResult>() {
            public DescribeTagsResult call() throws Exception {
                return describeTags(describeTagsRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Runs the policy you create for your Auto Scaling group in
     * PutScalingPolicy.
     * </p>
     *
     * @param executePolicyRequest Container for the necessary parameters to
     *           execute the ExecutePolicy operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         ExecutePolicy service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> executePolicyAsync(final ExecutePolicyRequest executePolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                executePolicy(executePolicyRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Removes the specified tags or a set of tags from a set of resources.
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTags service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTagsAsync(final DeleteTagsRequest deleteTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTags(deleteTagsRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an
     * existing policy, use the existing policy name and set the parameter(s)
     * you want to change. Any existing parameter not changed in an update to
     * an existing policy is not changed in this update request.
     * </p>
     *
     * @param putScalingPolicyRequest Container for the necessary parameters
     *           to execute the PutScalingPolicy operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         PutScalingPolicy service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutScalingPolicyResult> putScalingPolicyAsync(final PutScalingPolicyRequest putScalingPolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutScalingPolicyResult>() {
            public PutScalingPolicyResult call() throws Exception {
                return putScalingPolicy(putScalingPolicyRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified
     * events take place. Subscribers to this topic can have messages for
     * events delivered to an endpoint such as a web server or email address.
     * </p>
     * <p>
     * A new <code>PutNotificationConfiguration</code> overwrites an
     * existing configuration.
     * </p>
     *
     * @param putNotificationConfigurationRequest Container for the necessary
     *           parameters to execute the PutNotificationConfiguration operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         PutNotificationConfiguration service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putNotificationConfigurationAsync(final PutNotificationConfigurationRequest putNotificationConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putNotificationConfiguration(putNotificationConfigurationRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a policy created by PutScalingPolicy.
     * </p>
     *
     * @param deletePolicyRequest Container for the necessary parameters to
     *           execute the DeletePolicy operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePolicy service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePolicyAsync(final DeletePolicyRequest deletePolicyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deletePolicy(deletePolicyRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes notifications created by PutNotificationConfiguration.
     * </p>
     *
     * @param deleteNotificationConfigurationRequest Container for the
     *           necessary parameters to execute the DeleteNotificationConfiguration
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNotificationConfiguration service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNotificationConfigurationAsync(final DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteNotificationConfiguration(deleteNotificationConfigurationRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes a scheduled action previously created using the
     * PutScheduledUpdateGroupAction.
     * </p>
     *
     * @param deleteScheduledActionRequest Container for the necessary
     *           parameters to execute the DeleteScheduledAction operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteScheduledAction service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteScheduledActionAsync(final DeleteScheduledActionRequest deleteScheduledActionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteScheduledAction(deleteScheduledActionRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Sets the health status of an instance.
     * </p>
     *
     * @param setInstanceHealthRequest Container for the necessary parameters
     *           to execute the SetInstanceHealth operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         SetInstanceHealth service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setInstanceHealthAsync(final SetInstanceHealthRequest setInstanceHealthRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setInstanceHealth(setInstanceHealthRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of all notification types that are supported by Auto
     * Scaling.
     * </p>
     *
     * @param describeAutoScalingNotificationTypesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeAutoScalingNotificationTypes operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingNotificationTypes service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(final DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingNotificationTypesResult>() {
            public DescribeAutoScalingNotificationTypesResult call() throws Exception {
                return describeAutoScalingNotificationTypes(describeAutoScalingNotificationTypesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Creates new tags or updates existing tags for an Auto Scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> A tag's definition is composed of a resource ID, resource
     * type, key and value, and the propagate flag. Value and the propagate
     * flag are optional parameters. See the Request Parameters for more
     * information.
     * </p>
     *
     * @param createOrUpdateTagsRequest Container for the necessary
     *           parameters to execute the CreateOrUpdateTags operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateOrUpdateTags service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createOrUpdateTagsAsync(final CreateOrUpdateTagsRequest createOrUpdateTagsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createOrUpdateTags(createOrUpdateTagsRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Suspends Auto Scaling processes for an Auto Scaling group. To suspend
     * specific process types, specify them by name with the
     * <code>ScalingProcesses.member.N</code> parameter. To suspend all
     * process types, omit the <code>ScalingProcesses.member.N</code>
     * parameter.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Suspending either of the two primary process types,
     * Launch or Terminate, can prevent other process types from functioning
     * properly. For more information about processes and their dependencies,
     * see ProcessType.
     * </p>
     * <p>
     * To resume processes that have been suspended, use ResumeProcesses.
     * </p>
     *
     * @param suspendProcessesRequest Container for the necessary parameters
     *           to execute the SuspendProcesses operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         SuspendProcesses service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> suspendProcessesAsync(final SuspendProcessesRequest suspendProcessesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                suspendProcesses(suspendProcessesRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a description of each Auto Scaling instance in the
     * <code>InstanceIds</code> list. If a list is not provided, the service
     * returns the full details of all instances up to a maximum of 50. By
     * default, the service returns a list of 20 items.
     * </p>
     * <p>
     * This action supports pagination by returning a token if there are
     * more pages to retrieve. To get the next page, call this action again
     * with the returned token as the <code>NextToken</code> parameter.
     * </p>
     *
     * @param describeAutoScalingInstancesRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingInstances operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingInstances service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(final DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutoScalingInstancesResult>() {
            public DescribeAutoScalingInstancesResult call() throws Exception {
                return describeAutoScalingInstances(describeAutoScalingInstancesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new launch configuration. The launch configuration name
     * must be unique within the scope of the client's AWS account. The
     * maximum limit of launch configurations, which by default is 100, must
     * not yet have been met; otherwise, the call will fail. When created,
     * the new launch configuration is available for immediate use.
     * </p>
     * <p>
     * You can create a launch configuration with Amazon EC2 security groups
     * or with Amazon VPC security groups. However, you can't use Amazon EC2
     * security groups together with Amazon VPC security groups, or vice
     * versa.
     * </p>
     * <p>
     * <b>NOTE:</b> At this time, Auto Scaling launch configurations don't
     * support compressed (e.g. zipped) user data files.
     * </p>
     *
     * @param createLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the CreateLaunchConfiguration operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLaunchConfiguration service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLaunchConfigurationAsync(final CreateLaunchConfigurationRequest createLaunchConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createLaunchConfiguration(createLaunchConfigurationRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the specified Auto Scaling group if the group has no
     * instances and no scaling activities in progress.
     * </p>
     * <p>
     * <b>NOTE:</b> To remove all instances before calling
     * DeleteAutoScalingGroup, you can call UpdateAutoScalingGroup to set the
     * minimum and maximum size of the AutoScalingGroup to zero.
     * </p>
     *
     * @param deleteAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the DeleteAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAutoScalingGroupAsync(final DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAutoScalingGroup(deleteAutoScalingGroupRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Disables monitoring of group metrics for the Auto Scaling group
     * specified in <code>AutoScalingGroupName</code> .
     * You can specify the list of affected metrics with the
     * <code>Metrics</code> parameter.
     * </p>
     *
     * @param disableMetricsCollectionRequest Container for the necessary
     *           parameters to execute the DisableMetricsCollection operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DisableMetricsCollection service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableMetricsCollectionAsync(final DisableMetricsCollectionRequest disableMetricsCollectionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                disableMetricsCollection(disableMetricsCollectionRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Updates the configuration for the specified AutoScalingGroup.
     * </p>
     * <p>
     * <b>NOTE:</b> To update an Auto Scaling group with a launch
     * configuration that has the InstanceMonitoring flag set to False, you
     * must first ensure that collection of group metrics is disabled.
     * Otherwise, calls to UpdateAutoScalingGroup will fail. If you have
     * previously enabled group metrics collection, you can disable
     * collection of all group metrics by calling DisableMetricsCollection.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any
     * launch configuration settings take effect on any triggers after this
     * call returns. Triggers that are currently in progress aren't affected.
     * </p>
     * <p>
     * <b>NOTE:</b> If the new values are specified for the MinSize or
     * MaxSize parameters, then there will be an implicit call to
     * SetDesiredCapacity to set the group to the new MaxSize. All optional
     * parameters are left unchanged if not passed in the request.
     * </p>
     *
     * @param updateAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the UpdateAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAutoScalingGroupAsync(final UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateAutoScalingGroup(updateAutoScalingGroupRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a full description of the launch configurations, or the
     * specified launch configurations, if they exist.
     * </p>
     * <p>
     * If no name is specified, then the full details of all launch
     * configurations are returned.
     * </p>
     *
     * @param describeLaunchConfigurationsRequest Container for the necessary
     *           parameters to execute the DescribeLaunchConfigurations operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLaunchConfigurations service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(final DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLaunchConfigurationsResult>() {
            public DescribeLaunchConfigurationsResult call() throws Exception {
                return describeLaunchConfigurations(describeLaunchConfigurationsRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Returns policy adjustment types for use in the PutScalingPolicy
     * action.
     * </p>
     *
     * @param describeAdjustmentTypesRequest Container for the necessary
     *           parameters to execute the DescribeAdjustmentTypes operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAdjustmentTypes service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(final DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAdjustmentTypesResult>() {
            public DescribeAdjustmentTypesResult call() throws Exception {
                return describeAdjustmentTypes(describeAdjustmentTypesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Lists all the actions scheduled for your Auto Scaling group that
     * haven't been executed. To see a list of actions already executed, see
     * the activity record returned in DescribeScalingActivities.
     * </p>
     *
     * @param describeScheduledActionsRequest Container for the necessary
     *           parameters to execute the DescribeScheduledActions operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScheduledActions service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(final DescribeScheduledActionsRequest describeScheduledActionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeScheduledActionsResult>() {
            public DescribeScheduledActionsResult call() throws Exception {
                return describeScheduledActions(describeScheduledActionsRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Creates a scheduled scaling action for an Auto Scaling group. If you
     * leave a parameter unspecified, the corresponding value remains
     * unchanged in the affected Auto Scaling group.
     * </p>
     *
     * @param putScheduledUpdateGroupActionRequest Container for the
     *           necessary parameters to execute the PutScheduledUpdateGroupAction
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         PutScheduledUpdateGroupAction service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putScheduledUpdateGroupActionAsync(final PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putScheduledUpdateGroupAction(putScheduledUpdateGroupActionRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list of metrics and a corresponding list of granularities
     * for each metric.
     * </p>
     *
     * @param describeMetricCollectionTypesRequest Container for the
     *           necessary parameters to execute the DescribeMetricCollectionTypes
     *           operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMetricCollectionTypes service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(final DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMetricCollectionTypesResult>() {
            public DescribeMetricCollectionTypesResult call() throws Exception {
                return describeMetricCollectionTypes(describeMetricCollectionTypesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Adjusts the desired size of the AutoScalingGroup by initiating
     * scaling activities. When reducing the size of the group, it is not
     * possible to define which Amazon EC2 instances will be terminated. This
     * applies to any Auto Scaling decisions that might result in terminating
     * instances.
     * </p>
     * <p>
     * There are two common use cases for <code>SetDesiredCapacity</code> :
     * one for users of the Auto Scaling triggering system, and
     * another for developers who write their own triggering systems. Both
     * use cases relate to the concept of cooldown.
     * </p>
     * <p>
     * In the first case, if you use the Auto Scaling triggering system,
     * <code>SetDesiredCapacity</code> changes the size of your Auto Scaling
     * group without regard to the cooldown period. This could be useful, for
     * example, if Auto Scaling did something unexpected for some reason. If
     * your cooldown period is 10 minutes, Auto Scaling would normally reject
     * requests to change the size of the group for that entire 10-minute
     * period. The <code>SetDesiredCapacity</code> command allows you to
     * circumvent this restriction and change the size of the group before
     * the end of the cooldown period.
     * </p>
     * <p>
     * In the second case, if you write your own triggering system, you can
     * use <code>SetDesiredCapacity</code> to control the size of your Auto
     * Scaling group. If you want the same cooldown functionality that Auto
     * Scaling offers, you can configure <code>SetDesiredCapacity</code> to
     * honor cooldown by setting the <code>HonorCooldown</code> parameter to
     * <code>true</code> .
     * 
     * </p>
     *
     * @param setDesiredCapacityRequest Container for the necessary
     *           parameters to execute the SetDesiredCapacity operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         SetDesiredCapacity service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setDesiredCapacityAsync(final SetDesiredCapacityRequest setDesiredCapacityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setDesiredCapacity(setDesiredCapacityRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Terminates the specified instance. Optionally, the desired group size
     * can be adjusted.
     * </p>
     * <p>
     * <b>NOTE:</b> This call simply registers a termination request. The
     * termination of the instance cannot happen immediately.
     * </p>
     *
     * @param terminateInstanceInAutoScalingGroupRequest Container for the
     *           necessary parameters to execute the
     *           TerminateInstanceInAutoScalingGroup operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateInstanceInAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(final TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateInstanceInAutoScalingGroupResult>() {
            public TerminateInstanceInAutoScalingGroupResult call() throws Exception {
                return terminateInstanceInAutoScalingGroup(terminateInstanceInAutoScalingGroupRequest);
		    }
		});
    }
    
}
        