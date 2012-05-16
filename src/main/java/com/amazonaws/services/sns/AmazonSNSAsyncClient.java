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
package com.amazonaws.services.sns;
            
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

import com.amazonaws.services.sns.model.*;


/**
 * Client for accessing AmazonSNS.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 * Amazon Simple Notification Service <p>
 * This is the <i>Amazon Simple Notification Service (Amazon SNS) API Reference</i> . This guide provides detailed information about Amazon SNS actions,
 * data types, parameters, and errors. For detailed information about Amazon SNS features and their associated API calls, go to the <a
 * href="http://docs.amazonwebservices.com/sns/latest/gsg/"> Amazon SNS Getting Started Guide </a> .
 * </p>
 * <p>
 * Amazon Simple Notification Service is a web service that enables you to build distributed web-enabled applications. Applications can use Amazon SNS to
 * easily push real-time notification messages to interested subscribers over multiple delivery protocols. For more information about this product go to
 * <a href="http://aws.amazon.com/sns/"> http://aws.amazon.com/sns </a> .
 * </p>
 * <p>
 * Use the following links to get started using the <i>Amazon Simple Notification Service API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.amazonwebservices.com/sns/latest/api/API_Operations.html"> Actions </a> : An alphabetical list of all Amazon SNS
 * actions.</li>
 * <li> <a href="http://docs.amazonwebservices.com/sns/latest/api/API_Types.html"> Data Types </a> : An alphabetical list of all Amazon SNS data
 * types.</li>
 * <li> <a href="http://docs.amazonwebservices.com/sns/latest/api/CommonParameters.html"> Common Parameters </a> : Parameters that all Query actions can
 * use.</li>
 * <li> <a href="http://docs.amazonwebservices.com/sns/latest/api/CommonErrors.html"> Common Errors </a> : Client and server errors that all actions can
 * return.</li>
 * <li> <a href="http://docs.amazonwebservices.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a> : Itemized regions and endpoints
 * for all AWS products.</li>
 * <li> <a href="http://sns.us-east-1.amazonaws.com/doc/2010-03-31/SimpleNotificationService.wsdl"> WSDL Location </a> :
 * http://sns.us-east-1.amazonaws.com/doc/2010-03-31/SimpleNotificationService.wsdl</li>
 * 
 * </ul> 
 */       
public class AmazonSNSAsyncClient extends AmazonSNSClient
        implements AmazonSNSAsync { 

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    
    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AmazonSNS using the specified AWS account credentials.
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
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
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
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }
     
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials,
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
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on 
     * AmazonSNS using the specified AWS account credentials provider.
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
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }
    
    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials provider
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
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
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
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, 
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
     * The ConfirmSubscription action verifies an endpoint owner's intent to
     * receive messages by validating the token sent to the endpoint by an
     * earlier Subscribe action. If the token is valid, the action creates a
     * new subscription and returns its Amazon Resource Name (ARN). This call
     * requires an AWS signature only when the AuthenticateOnUnsubscribe flag
     * is set to "true".
     * </p>
     *
     * @param confirmSubscriptionRequest Container for the necessary
     *           parameters to execute the ConfirmSubscription operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmSubscription service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(final ConfirmSubscriptionRequest confirmSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmSubscriptionResult>() {
            public ConfirmSubscriptionResult call() throws Exception {
                return confirmSubscription(confirmSubscriptionRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The GetTopicAttribtues action returns all of the properties of a topic
     * customers have created. Topic properties returned might differ based
     * on the authorization of the user.
     * </p>
     *
     * @param getTopicAttributesRequest Container for the necessary
     *           parameters to execute the GetTopicAttributes operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         GetTopicAttributes service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTopicAttributesResult> getTopicAttributesAsync(final GetTopicAttributesRequest getTopicAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTopicAttributesResult>() {
            public GetTopicAttributesResult call() throws Exception {
                return getTopicAttributes(getTopicAttributesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The Subscribe action prepares to subscribe an endpoint by sending the
     * endpoint a confirmation message. To actually create a subscription,
     * the endpoint owner must call the ConfirmSubscription action with the
     * token from the confirmation message. Confirmation tokens are valid for
     * three days.
     * </p>
     *
     * @param subscribeRequest Container for the necessary parameters to
     *           execute the Subscribe operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         Subscribe service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubscribeResult> subscribeAsync(final SubscribeRequest subscribeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SubscribeResult>() {
            public SubscribeResult call() throws Exception {
                return subscribe(subscribeRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The SetTopicAttributes action allows a topic owner to set an attribute
     * of the topic to a new value.
     * </p>
     *
     * @param setTopicAttributesRequest Container for the necessary
     *           parameters to execute the SetTopicAttributes operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         SetTopicAttributes service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTopicAttributesAsync(final SetTopicAttributesRequest setTopicAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setTopicAttributes(setTopicAttributesRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * The DeleteTopic action deletes a topic and all its subscriptions.
     * Deleting a topic might prevent some messages previously sent to the
     * topic from being delivered to subscribers. This action is idempotent,
     * so deleting a topic that does not exist will not result in an error.
     * </p>
     *
     * @param deleteTopicRequest Container for the necessary parameters to
     *           execute the DeleteTopic operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTopic service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTopicAsync(final DeleteTopicRequest deleteTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTopic(deleteTopicRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * The RemovePermission action removes a statement from a topic's access
     * control policy.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(final RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                removePermission(removePermissionRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * The ListSubscriptions action returns a list of the requester's
     * subscriptions. Each call returns a limited list of subscriptions, up
     * to 100. If there are more subscriptions, a NextToken is also returned.
     * Use the NextToken parameter in a new ListSubscriptions call to get
     * further results.
     * </p>
     *
     * @param listSubscriptionsRequest Container for the necessary parameters
     *           to execute the ListSubscriptions operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ListSubscriptions service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsResult> listSubscriptionsAsync(final ListSubscriptionsRequest listSubscriptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsResult>() {
            public ListSubscriptionsResult call() throws Exception {
                return listSubscriptions(listSubscriptionsRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The SetSubscriptionAttributes action allows a subscription owner to
     * set an attribute of the topic to a new value.
     * </p>
     *
     * @param setSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the SetSubscriptionAttributes operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         SetSubscriptionAttributes service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setSubscriptionAttributesAsync(final SetSubscriptionAttributesRequest setSubscriptionAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setSubscriptionAttributes(setSubscriptionAttributesRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * The AddPermission action adds a statement to a topic's access control
     * policy, granting access for the specified AWS accounts to the
     * specified actions.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addPermissionAsync(final AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                addPermission(addPermissionRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * The CreateTopic action creates a topic to which notifications can be
     * published. Users can create at most 25 topics. This action is
     * idempotent, so if the requester already owns a topic with the
     * specified name, that topic's ARN will be returned without creating a
     * new topic.
     * </p>
     *
     * @param createTopicRequest Container for the necessary parameters to
     *           execute the CreateTopic operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTopic service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTopicResult> createTopicAsync(final CreateTopicRequest createTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTopicResult>() {
            public CreateTopicResult call() throws Exception {
                return createTopic(createTopicRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The GetSubscriptionAttribtues action returns all of the properties of
     * a subscription.
     * </p>
     *
     * @param getSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the GetSubscriptionAttributes operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         GetSubscriptionAttributes service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(final GetSubscriptionAttributesRequest getSubscriptionAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSubscriptionAttributesResult>() {
            public GetSubscriptionAttributesResult call() throws Exception {
                return getSubscriptionAttributes(getSubscriptionAttributesRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The ListTopics action returns a list of the requester's topics. Each
     * call returns a limited list of topics, up to 100. If there are more
     * topics, a NextToken is also returned. Use the NextToken parameter in a
     * new ListTopics call to get further results.
     * </p>
     *
     * @param listTopicsRequest Container for the necessary parameters to
     *           execute the ListTopics operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ListTopics service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTopicsResult> listTopicsAsync(final ListTopicsRequest listTopicsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTopicsResult>() {
            public ListTopicsResult call() throws Exception {
                return listTopics(listTopicsRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The Unsubscribe action deletes a subscription. If the subscription
     * requires authentication for deletion, only the owner of the
     * subscription or the its topic's owner can unsubscribe, and an AWS
     * signature is required. If the Unsubscribe call does not require
     * authentication and the requester is not the subscription owner, a
     * final cancellation message is delivered to the endpoint, so that the
     * endpoint owner can easily resubscribe to the topic if the Unsubscribe
     * request was unintended.
     * </p>
     *
     * @param unsubscribeRequest Container for the necessary parameters to
     *           execute the Unsubscribe operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         Unsubscribe service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unsubscribeAsync(final UnsubscribeRequest unsubscribeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                unsubscribe(unsubscribeRequest);
                return null;
		    }
		});
    }
    
    /**
     * <p>
     * The ListSubscriptionsByTopic action returns a list of the
     * subscriptions to a specific topic. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a NextToken
     * is also returned. Use the NextToken parameter in a new
     * ListSubscriptionsByTopic call to get further results.
     * </p>
     *
     * @param listSubscriptionsByTopicRequest Container for the necessary
     *           parameters to execute the ListSubscriptionsByTopic operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ListSubscriptionsByTopic service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(final ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsByTopicResult>() {
            public ListSubscriptionsByTopicResult call() throws Exception {
                return listSubscriptionsByTopic(listSubscriptionsByTopicRequest);
		    }
		});
    }
    
    /**
     * <p>
     * The Publish action sends a message to all of a topic's subscribed
     * endpoints. When a messageId is returned, the message has been saved
     * and Amazon SNS will attempt to deliver it to the topic's subscribers
     * shortly. The format of the outgoing message to each subscribed
     * endpoint depends on the notification protocol selected.
     * </p>
     *
     * @param publishRequest Container for the necessary parameters to
     *           execute the Publish operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the Publish
     *         service method, as returned by AmazonSNS.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PublishResult> publishAsync(final PublishRequest publishRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PublishResult>() {
            public PublishResult call() throws Exception {
                return publish(publishRequest);
		    }
		});
    }
    
}
        