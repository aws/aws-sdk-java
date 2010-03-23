/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.autoscaling.model.*;


/**
 * Client for accessing AmazonAutoScaling.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 * <p>
 * Amazon Auto Scaling is an easy-to-use web service designed to
 * automatically launch or terminate EC2 instances based on user defined
 * triggers. Users can set up Auto Scaling groups and associate triggers
 * with these groups to automatically scale computing resources based on
 * parameters such as bandwidth usage or CPU utilization. Auto Scaling
 * groups can work across multiple Availability Zones - distinct physical
 * locations for the hosted EC2 instances - so that if an Availability
 * Zone becomes unhealthy or unavailable, Auto Scaling will automatically
 * re-distribute applications to a healthy Availability Zone.
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
     * <p>
     * Deletes the specified LaunchConfiguration.
     * </p>
     * <p>
     * The specified LaunchConfiguration must not be currently attached to
     * any Auto Scaling group. Once this call completes, the launch
     * configuration is no longer available for use.
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
     * Returns a full description of the specified AutoScalingGroup's
     * triggers.
     * </p>
     *
     * @param describeTriggersRequest Container for the necessary parameters
     *           to execute the DescribeTriggers operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTriggers service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTriggersResult> describeTriggersAsync(final DescribeTriggersRequest describeTriggersRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTriggersResult>() {
            public DescribeTriggersResult call() throws Exception {
                return describeTriggers(describeTriggersRequest);
		    }
		});
    }
    
    /**
     * <p>
     * Updates the configuration for the specified AutoScalingGroup.
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
     * Creates a new Auto Scaling group with the specified name. Once the
     * creation request is completed, the AutoScalingGroup is ready to be
     * used in other calls.
     * </p>
     * <p>
     * <b>NOTE:</b> The client must not have already used up their entire
     * quota of AutoScaling groups in order for this call to be successful.
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
     * Deletes the specified trigger.
     * </p>
     * <p>
     * If a trigger is currently in progress, the trigger continues to run
     * until its activities complete.
     * </p>
     *
     * @param deleteTriggerRequest Container for the necessary parameters to
     *           execute the DeleteTrigger operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrigger service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTriggerAsync(final DeleteTriggerRequest deleteTriggerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTrigger(deleteTriggerRequest);
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
    
    /**
     * <p>
     * Sets the parameters that govern how and when to scale an AutoScaling
     * group.
     * </p>
     *
     * @param createOrUpdateScalingTriggerRequest Container for the necessary
     *           parameters to execute the CreateOrUpdateScalingTrigger operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateOrUpdateScalingTrigger service method, as returned by
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
    public Future<Void> createOrUpdateScalingTriggerAsync(final CreateOrUpdateScalingTriggerRequest createOrUpdateScalingTriggerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createOrUpdateScalingTrigger(createOrUpdateScalingTriggerRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a full description of the AutoScalingGroup instances
     * specified in the given list. This includes all Amazon EC2 instances
     * that are members of the Auto Scaling group. If a list of names is not
     * provided, then the full details of all AutoScalingGroups is returned.
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
     * Creates a new launch configuration. Once created, the new launch
     * configuration is available for immediate use.
     * </p>
     * <p>
     * <b>NOTE:</b> The launch configuration name used must be unique, within
     * the scope of the client's AWS account, and the maximum limit of launch
     * configurations must not yet have been met, or else the call will fail.
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
     * Returns a full description of the launch configurations given the
     * specified names.
     * </p>
     * <p>
     * If no names are specified, then the full details of all launch
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
     * Returns the scaling activities for the specified Auto Scaling group.
     * </p>
     * <p>
     * If the specified <i>ActivityIds</i> list is empty, all the activities
     * from the past six weeks are returned. Activities will be sorted by
     * completion time. Activities that have no completion time are
     * considered as using the most recent possible time.
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
     * Adjusts the desired size of the AutoScalingGroup by initiating
     * scaling activities. When reducing the size of the group, it is not
     * possible to define which EC2 instances will be terminated. This
     * applies to any auto-scaling decisions that might result in the
     * termination of instances.
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
     * Deletes all configuration for the specified AutoScalingGroup and
     * deletes the group.
     * </p>
     * <p>
     * In order to successfully call this API, no triggers can be currently
     * in progress. Once this call successfully executes, no further triggers
     * will begin, and the specified AutoScalingGroup will not be available
     * for use in other API calls.
     * </p>
     * <p>
     * <b>NOTE:</b> The client cannot delete an AutoScalingGroup if it
     * contains instances or if there are scaling activities in progress.
     * Before attempting to delete an AutoScalingGroup, call the
     * UpdateAutoScalingGroup operation to set the minimum and maximum size
     * of the AutoScalingGroup to zero. This will remove all instances and
     * avoid problems with a previously set trigger preventing the deletion
     * of the AutoScalingGroup.
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
    
}
        