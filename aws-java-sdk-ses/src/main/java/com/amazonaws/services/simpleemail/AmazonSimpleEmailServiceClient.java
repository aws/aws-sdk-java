/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.services.simpleemail.model.transform.*;

/**
 * Client for accessing AmazonSimpleEmailService.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon Simple Email Service <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon
 * SES). This documentation is intended to be used in conjunction with
 * the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>For a list of Amazon SES endpoints to use in service
 * requests, see Regions and Amazon SES in the Amazon SES Developer
 * Guide.
 * </p>
 */
public class AmazonSimpleEmailServiceClient extends AmazonWebServiceClient implements AmazonSimpleEmailService {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonSimpleEmailService exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleEmailService.  A credentials provider chain will be used
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
    public AmazonSimpleEmailServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleEmailService.  A credentials provider chain will be used
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
     *                       client connects to AmazonSimpleEmailService
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSimpleEmailServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonSimpleEmailServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSimpleEmailService
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSimpleEmailServiceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonSimpleEmailServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials
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
     *                       client connects to AmazonSimpleEmailService
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSimpleEmailServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSimpleEmailService
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonSimpleEmailServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RuleSetDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MessageRejectedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RuleDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3ConfigurationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CannotDeleteExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLambdaFunctionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnsTopicExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("email.us-east-1.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/simpleemail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/simpleemail/request.handler2s"));
    }

    /**
     * <p>
     * Deletes the specified identity (email address or domain) from the
     * list of verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteIdentityRequest Container for the necessary parameters to
     *           execute the DeleteIdentity service method on AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteIdentity service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIdentityResult deleteIdentity(DeleteIdentityRequest deleteIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityRequest> request = null;
        Response<DeleteIdentityResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityRequestMarshaller().marshall(super.beforeMarshalling(deleteIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteIdentityResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param updateReceiptRuleRequest Container for the necessary parameters
     *           to execute the UpdateReceiptRule service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the UpdateReceiptRule service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws LimitExceededException
     * @throws InvalidS3ConfigurationException
     * @throws RuleSetDoesNotExistException
     * @throws InvalidLambdaFunctionException
     * @throws RuleDoesNotExistException
     * @throws InvalidSnsTopicException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateReceiptRuleResult updateReceiptRule(UpdateReceiptRuleRequest updateReceiptRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(updateReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReceiptRuleRequest> request = null;
        Response<UpdateReceiptRuleResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReceiptRuleRequestMarshaller().marshall(super.beforeMarshalling(updateReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UpdateReceiptRuleResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listVerifiedEmailAddressesRequest Container for the necessary
     *           parameters to execute the ListVerifiedEmailAddresses service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ListVerifiedEmailAddresses service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses(ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest) {
        ExecutionContext executionContext = createExecutionContext(listVerifiedEmailAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVerifiedEmailAddressesRequest> request = null;
        Response<ListVerifiedEmailAddressesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVerifiedEmailAddressesRequestMarshaller().marshall(super.beforeMarshalling(listVerifiedEmailAddressesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListVerifiedEmailAddressesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteReceiptRuleRequest Container for the necessary parameters
     *           to execute the DeleteReceiptRule service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteReceiptRule service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteReceiptRuleResult deleteReceiptRule(DeleteReceiptRuleRequest deleteReceiptRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptRuleRequest> request = null;
        Response<DeleteReceiptRuleResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptRuleRequestMarshaller().marshall(super.beforeMarshalling(deleteReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteReceiptRuleResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyEmailIdentityRequest Container for the necessary
     *           parameters to execute the VerifyEmailIdentity service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the VerifyEmailIdentity service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public VerifyEmailIdentityResult verifyEmailIdentity(VerifyEmailIdentityRequest verifyEmailIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyEmailIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyEmailIdentityRequest> request = null;
        Response<VerifyEmailIdentityResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyEmailIdentityRequestMarshaller().marshall(super.beforeMarshalling(verifyEmailIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new VerifyEmailIdentityResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see
     * the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param getIdentityNotificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityNotificationAttributes
     *           service method on AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityNotificationAttributes
     *         service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityNotificationAttributesResult getIdentityNotificationAttributes(GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityNotificationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityNotificationAttributesRequest> request = null;
        Response<GetIdentityNotificationAttributesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityNotificationAttributesRequestMarshaller().marshall(super.beforeMarshalling(getIdentityNotificationAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetIdentityNotificationAttributesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be
     * able to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param verifyDomainDkimRequest Container for the necessary parameters
     *           to execute the VerifyDomainDkim service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the VerifyDomainDkim service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public VerifyDomainDkimResult verifyDomainDkim(VerifyDomainDkimRequest verifyDomainDkimRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyDomainDkimRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyDomainDkimRequest> request = null;
        Response<VerifyDomainDkimResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyDomainDkimRequestMarshaller().marshall(super.beforeMarshalling(verifyDomainDkimRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new VerifyDomainDkimResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For
     * domain name identities, this action also returns the DKIM tokens that
     * are required for Easy DKIM signing, and whether Amazon SES has
     * successfully verified that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the
     * following information for each:
     * </p>
     * 
     * <ul>
     * <li>Whether Easy DKIM signing is enabled or disabled.</li>
     * <li>A set of DKIM tokens that represent the identity. If the identity
     * is an email address, the tokens represent the domain of that
     * address.</li>
     * <li>Whether Amazon SES has successfully verified the DKIM tokens
     * published in the domain's DNS. This information is only returned for
     * domain name identities, not for email addresses.</li>
     * 
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get
     * DKIM attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param getIdentityDkimAttributesRequest Container for the necessary
     *           parameters to execute the GetIdentityDkimAttributes service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityDkimAttributes service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityDkimAttributesResult getIdentityDkimAttributes(GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityDkimAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityDkimAttributesRequest> request = null;
        Response<GetIdentityDkimAttributesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityDkimAttributesRequestMarshaller().marshall(super.beforeMarshalling(getIdentityDkimAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetIdentityDkimAttributesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param describeReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the DescribeReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DescribeReceiptRuleSet service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReceiptRuleSetRequest> request = null;
        Response<DescribeReceiptRuleSetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(describeReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeReceiptRuleSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The VerifyEmailAddress action is deprecated as of
     * the May 15, 2012 release of Domain Verification. The
     * VerifyEmailIdentity action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyEmailAddressRequest Container for the necessary
     *           parameters to execute the VerifyEmailAddress service method on
     *           AmazonSimpleEmailService.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void verifyEmailAddress(VerifyEmailAddressRequest verifyEmailAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyEmailAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<VerifyEmailAddressRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyEmailAddressRequestMarshaller().marshall(super.beforeMarshalling(verifyEmailAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to
     * the given identity (email address or domain). This API returns only a
     * list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code> .
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listIdentityPoliciesRequest Container for the necessary
     *           parameters to execute the ListIdentityPolicies service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ListIdentityPolicies service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListIdentityPoliciesResult listIdentityPolicies(ListIdentityPoliciesRequest listIdentityPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listIdentityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentityPoliciesRequest> request = null;
        Response<ListIdentityPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentityPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listIdentityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListIdentityPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities service method on AmazonSimpleEmailService.
     * 
     * @return The response from the ListIdentities service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListIdentitiesResult listIdentities(ListIdentitiesRequest listIdentitiesRequest) {
        ExecutionContext executionContext = createExecutionContext(listIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentitiesRequest> request = null;
        Response<ListIdentitiesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentitiesRequestMarshaller().marshall(super.beforeMarshalling(listIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListIdentitiesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns
     * the verification status and (for domain identities) the verification
     * token for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     *
     * @param getIdentityVerificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityVerificationAttributes
     *           service method on AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityVerificationAttributes
     *         service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityVerificationAttributesResult getIdentityVerificationAttributes(GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityVerificationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityVerificationAttributesRequest> request = null;
        Response<GetIdentityVerificationAttributesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityVerificationAttributesRequestMarshaller().marshall(super.beforeMarshalling(getIdentityVerificationAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetIdentityVerificationAttributesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Given an identity (email address or domain), enables or disables
     * whether Amazon SES forwards bounce and complaint notifications as
     * email. Feedback forwarding can only be disabled when Amazon Simple
     * Notification Service (Amazon SNS) topics are specified for both
     * bounces and complaints.
     * </p>
     * <p>
     * <b>NOTE:</b>Feedback forwarding does not apply to delivery
     * notifications. Delivery notifications are only available through
     * Amazon SNS.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see
     * the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityFeedbackForwardingEnabledRequest Container for the
     *           necessary parameters to execute the
     *           SetIdentityFeedbackForwardingEnabled service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetIdentityFeedbackForwardingEnabled
     *         service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabled(SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityFeedbackForwardingEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityFeedbackForwardingEnabledRequest> request = null;
        Response<SetIdentityFeedbackForwardingEnabledResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityFeedbackForwardingEnabledRequestMarshaller().marshall(super.beforeMarshalling(setIdentityFeedbackForwardingEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SetIdentityFeedbackForwardingEnabledResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <p>
     * <b>NOTE:</b>All of the rules in the rule set must be represented in
     * this request. That is, this API will return an error if the reorder
     * request doesn???t explicitly position all of the rules.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param reorderReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the ReorderReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ReorderReceiptRuleSet service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReorderReceiptRuleSetResult reorderReceiptRuleSet(ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(reorderReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReorderReceiptRuleSetRequest> request = null;
        Response<ReorderReceiptRuleSetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReorderReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(reorderReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ReorderReceiptRuleSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteReceiptFilterRequest Container for the necessary
     *           parameters to execute the DeleteReceiptFilter service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteReceiptFilter service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteReceiptFilterResult deleteReceiptFilter(DeleteReceiptFilterRequest deleteReceiptFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReceiptFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptFilterRequest> request = null;
        Response<DeleteReceiptFilterResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptFilterRequestMarshaller().marshall(super.beforeMarshalling(deleteReceiptFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteReceiptFilterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param describeReceiptRuleRequest Container for the necessary
     *           parameters to execute the DescribeReceiptRule service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DescribeReceiptRule service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReceiptRuleResult describeReceiptRule(DescribeReceiptRuleRequest describeReceiptRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReceiptRuleRequest> request = null;
        Response<DescribeReceiptRuleResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReceiptRuleRequestMarshaller().marshall(super.beforeMarshalling(describeReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeReceiptRuleResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule
     * set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param setReceiptRulePositionRequest Container for the necessary
     *           parameters to execute the SetReceiptRulePosition service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetReceiptRulePosition service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetReceiptRulePositionResult setReceiptRulePosition(SetReceiptRulePositionRequest setReceiptRulePositionRequest) {
        ExecutionContext executionContext = createExecutionContext(setReceiptRulePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetReceiptRulePositionRequest> request = null;
        Response<SetReceiptRulePositionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetReceiptRulePositionRequestMarshaller().marshall(super.beforeMarshalling(setReceiptRulePositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SetReceiptRulePositionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the IP address filters associated with your account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listReceiptFiltersRequest Container for the necessary
     *           parameters to execute the ListReceiptFilters service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ListReceiptFilters service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReceiptFiltersResult listReceiptFilters(ListReceiptFiltersRequest listReceiptFiltersRequest) {
        ExecutionContext executionContext = createExecutionContext(listReceiptFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReceiptFiltersRequest> request = null;
        Response<ListReceiptFiltersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReceiptFiltersRequestMarshaller().marshall(super.beforeMarshalling(listReceiptFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListReceiptFiltersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param createReceiptFilterRequest Container for the necessary
     *           parameters to execute the CreateReceiptFilter service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the CreateReceiptFilter service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReceiptFilterResult createReceiptFilter(CreateReceiptFilterRequest createReceiptFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(createReceiptFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptFilterRequest> request = null;
        Response<CreateReceiptFilterResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptFilterRequestMarshaller().marshall(super.beforeMarshalling(createReceiptFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateReceiptFilterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getSendStatisticsRequest Container for the necessary parameters
     *           to execute the GetSendStatistics service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the GetSendStatistics service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSendStatisticsResult getSendStatistics(GetSendStatisticsRequest getSendStatisticsRequest) {
        ExecutionContext executionContext = createExecutionContext(getSendStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSendStatisticsRequest> request = null;
        Response<GetSendStatisticsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSendStatisticsRequestMarshaller().marshall(super.beforeMarshalling(getSendStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetSendStatisticsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <p>
     * <b>NOTE:</b>To disable your email-receiving through Amazon SES
     * completely, you can call this API with RuleSetName set to null.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param setActiveReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the SetActiveReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetActiveReceiptRuleSet service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetActiveReceiptRuleSetResult setActiveReceiptRuleSet(SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(setActiveReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetActiveReceiptRuleSetRequest> request = null;
        Response<SetActiveReceiptRuleSetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetActiveReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(setActiveReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SetActiveReceiptRuleSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that
     * is currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param describeActiveReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the DescribeActiveReceiptRuleSet service method
     *           on AmazonSimpleEmailService.
     * 
     * @return The response from the DescribeActiveReceiptRuleSet service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet(DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(describeActiveReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActiveReceiptRuleSetRequest> request = null;
        Response<DescribeActiveReceiptRuleSetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActiveReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(describeActiveReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeActiveReceiptRuleSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Sends an email message, with header and content specified by the
     * client. The <code>SendRawEmail</code> action is useful for sending
     * multipart MIME emails. The raw text of the message must comply with
     * Internet email standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendRawEmail</code> :
     * </p>
     * 
     * <ul>
     * <li>You can only send email from verified email addresses and
     * domains; otherwise, you will get an "Email address not verified"
     * error. If your account is still in the Amazon SES sandbox, you must
     * also verify every recipient email address except for the recipients
     * provided by the Amazon SES mailbox simulator. For more information, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes
     * any attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per
     * message. The combined number of To:, CC: and BCC: email addresses
     * cannot exceed 50. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or
     * fewer, and then call Amazon SES repeatedly to send the message to each
     * group.</li>
     * <li>The To:, CC:, and BCC: headers in the raw message can contain a
     * group list. Note that each recipient in a group list counts towards
     * the 50-recipient limit.</li>
     * <li>For every message that you send, the total number of recipients
     * (To:, CC: and BCC:) is counted against your sending quota - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>If you are using sending authorization to send on behalf of
     * another user, <code>SendRawEmail</code> enables you to specify the
     * cross-account identity for the email's "Source," "From," and
     * "Return-Path" parameters in one of two ways: you can pass optional
     * parameters <code>SourceArn</code> , <code>FromArn</code> , and/or
     * <code>ReturnPathArn</code> to the API, or you can include the
     * following X-headers in the header of your raw email:
     * <ul>
     * <li> <code>X-SES-SOURCE-ARN</code> </li>
     * <li> <code>X-SES-FROM-ARN</code> </li>
     * <li> <code>X-SES-RETURN-PATH-ARN</code> </li>
     * 
     * </ul>
     * <p>
     * <b>IMPORTANT:</b>Do not include these X-headers in the DKIM
     * signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * For the most common sending authorization use case, we recommend that
     * you specify the <code>SourceIdentityArn</code> and do not specify
     * either the <code>FromIdentityArn</code> or
     * <code>ReturnPathIdentityArn</code> . (The same note applies to the
     * corresponding X-headers.) If you only specify the
     * <code>SourceIdentityArn</code> , Amazon SES will simply set the "From"
     * address and the "Return Path" address to the identity specified in
     * <code>SourceIdentityArn</code> . For more information about sending
     * authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .</li>
     * 
     * </ul>
     *
     * @param sendRawEmailRequest Container for the necessary parameters to
     *           execute the SendRawEmail service method on AmazonSimpleEmailService.
     * 
     * @return The response from the SendRawEmail service method, as returned
     *         by AmazonSimpleEmailService.
     * 
     * @throws MessageRejectedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SendRawEmailResult sendRawEmail(SendRawEmailRequest sendRawEmailRequest) {
        ExecutionContext executionContext = createExecutionContext(sendRawEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendRawEmailRequest> request = null;
        Response<SendRawEmailResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendRawEmailRequestMarshaller().marshall(super.beforeMarshalling(sendRawEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SendRawEmailResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param createReceiptRuleRequest Container for the necessary parameters
     *           to execute the CreateReceiptRule service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the CreateReceiptRule service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws InvalidS3ConfigurationException
     * @throws RuleSetDoesNotExistException
     * @throws InvalidLambdaFunctionException
     * @throws RuleDoesNotExistException
     * @throws InvalidSnsTopicException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReceiptRuleResult createReceiptRule(CreateReceiptRuleRequest createReceiptRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(createReceiptRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptRuleRequest> request = null;
        Response<CreateReceiptRuleResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptRuleRequestMarshaller().marshall(super.beforeMarshalling(createReceiptRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateReceiptRuleResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules
     * it contains.
     * </p>
     * <p>
     * <b>NOTE:</b>The currently active rule set cannot be deleted.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the DeleteReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteReceiptRuleSet service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws CannotDeleteException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteReceiptRuleSetResult deleteReceiptRuleSet(DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReceiptRuleSetRequest> request = null;
        Response<DeleteReceiptRuleSetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(deleteReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteReceiptRuleSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified
     * identity (email address or domain).
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param putIdentityPolicyRequest Container for the necessary parameters
     *           to execute the PutIdentityPolicy service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the PutIdentityPolicy service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws InvalidPolicyException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutIdentityPolicyResult putIdentityPolicy(PutIdentityPolicyRequest putIdentityPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIdentityPolicyRequest> request = null;
        Response<PutIdentityPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIdentityPolicyRequestMarshaller().marshall(super.beforeMarshalling(putIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new PutIdentityPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (email address or domain). The policies are returned as a map
     * of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getIdentityPoliciesRequest Container for the necessary
     *           parameters to execute the GetIdentityPolicies service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityPolicies service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityPoliciesResult getIdentityPolicies(GetIdentityPoliciesRequest getIdentityPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(getIdentityPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentityPoliciesRequest> request = null;
        Response<GetIdentityPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentityPoliciesRequestMarshaller().marshall(super.beforeMarshalling(getIdentityPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetIdentityPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * 
     * <ul>
     * <li>If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code> ), then Amazon SES will DKIM-sign all email
     * sent by addresses under that domain name (e.g.,
     * <code>user@example.com</code> ).</li>
     * <li>If Easy DKIM signing is enabled for an email address, then Amazon
     * SES will DKIM-sign all email sent by that email address.</li>
     * 
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code> ), you can
     * only enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code> ) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityDkimEnabledRequest Container for the necessary
     *           parameters to execute the SetIdentityDkimEnabled service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetIdentityDkimEnabled service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityDkimEnabledResult setIdentityDkimEnabled(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityDkimEnabledRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityDkimEnabledRequest> request = null;
        Response<SetIdentityDkimEnabledResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityDkimEnabledRequestMarshaller().marshall(super.beforeMarshalling(setIdentityDkimEnabledRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SetIdentityDkimEnabledResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getSendQuotaRequest Container for the necessary parameters to
     *           execute the GetSendQuota service method on AmazonSimpleEmailService.
     * 
     * @return The response from the GetSendQuota service method, as returned
     *         by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSendQuotaResult getSendQuota(GetSendQuotaRequest getSendQuotaRequest) {
        ExecutionContext executionContext = createExecutionContext(getSendQuotaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSendQuotaRequest> request = null;
        Response<GetSendQuotaResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSendQuotaRequestMarshaller().marshall(super.beforeMarshalling(getSendQuotaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetSendQuotaResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified sending authorization policy for the given
     * identity (email address or domain). This API returns successfully even
     * if a policy with the specified name does not exist.
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteIdentityPolicyRequest Container for the necessary
     *           parameters to execute the DeleteIdentityPolicy service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteIdentityPolicy service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIdentityPolicyResult deleteIdentityPolicy(DeleteIdentityPolicyRequest deleteIdentityPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIdentityPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentityPolicyRequest> request = null;
        Response<DeleteIdentityPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentityPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteIdentityPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteIdentityPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If
     * there are additional receipt rule sets to be retrieved, you will
     * receive a <code>NextToken</code> that you can provide to the next call
     * to <code>ListReceiptRuleSets</code> to retrieve the additional
     * entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listReceiptRuleSetsRequest Container for the necessary
     *           parameters to execute the ListReceiptRuleSets service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ListReceiptRuleSets service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReceiptRuleSetsResult listReceiptRuleSets(ListReceiptRuleSetsRequest listReceiptRuleSetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listReceiptRuleSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReceiptRuleSetsRequest> request = null;
        Response<ListReceiptRuleSetsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReceiptRuleSetsRequestMarshaller().marshall(super.beforeMarshalling(listReceiptRuleSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListReceiptRuleSetsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendEmail</code> :
     * </p>
     * 
     * <ul>
     * <li>You can only send email from verified email addresses and
     * domains; otherwise, you will get an "Email address not verified"
     * error. If your account is still in the Amazon SES sandbox, you must
     * also verify every recipient email address except for the recipients
     * provided by the Amazon SES mailbox simulator. For more information, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes
     * any attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per
     * message. The combined number of To:, CC: and BCC: email addresses
     * cannot exceed 50. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or
     * fewer, and then call Amazon SES repeatedly to send the message to each
     * group.</li>
     * <li>For every message that you send, the total number of recipients
     * (To:, CC: and BCC:) is counted against your sending quota - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
     * .</li>
     * 
     * </ul>
     *
     * @param sendEmailRequest Container for the necessary parameters to
     *           execute the SendEmail service method on AmazonSimpleEmailService.
     * 
     * @return The response from the SendEmail service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     * @throws MessageRejectedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SendEmailResult sendEmail(SendEmailRequest sendEmailRequest) {
        ExecutionContext executionContext = createExecutionContext(sendEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendEmailRequest> request = null;
        Response<SendEmailResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendEmailRequestMarshaller().marshall(super.beforeMarshalling(sendEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SendEmailResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyDomainIdentityRequest Container for the necessary
     *           parameters to execute the VerifyDomainIdentity service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the VerifyDomainIdentity service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public VerifyDomainIdentityResult verifyDomainIdentity(VerifyDomainIdentityRequest verifyDomainIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyDomainIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyDomainIdentityRequest> request = null;
        Response<VerifyDomainIdentityResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyDomainIdentityRequestMarshaller().marshall(super.beforeMarshalling(verifyDomainIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new VerifyDomainIdentityResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Given an identity (email address or domain), sets the Amazon Simple
     * Notification Service (Amazon SNS) topic to which Amazon SES will
     * publish bounce, complaint, and/or delivery notifications for emails
     * sent with that identity as the <code>Source</code> .
     * </p>
     * <p>
     * <b>NOTE:</b>Unless feedback forwarding is enabled, you must specify
     * Amazon SNS topics for bounce and complaint notifications. For more
     * information, see SetIdentityFeedbackForwardingEnabled.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityNotificationTopicRequest Container for the necessary
     *           parameters to execute the SetIdentityNotificationTopic service method
     *           on AmazonSimpleEmailService.
     * 
     * @return The response from the SetIdentityNotificationTopic service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityNotificationTopicResult setIdentityNotificationTopic(SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(setIdentityNotificationTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetIdentityNotificationTopicRequest> request = null;
        Response<SetIdentityNotificationTopicResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetIdentityNotificationTopicRequestMarshaller().marshall(super.beforeMarshalling(setIdentityNotificationTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SetIdentityNotificationTopicResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified email address from the list of verified
     * addresses.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DeleteVerifiedEmailAddress action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteVerifiedEmailAddressRequest Container for the necessary
     *           parameters to execute the DeleteVerifiedEmailAddress service method on
     *           AmazonSimpleEmailService.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVerifiedEmailAddress(DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVerifiedEmailAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteVerifiedEmailAddressRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVerifiedEmailAddressRequestMarshaller().marshall(super.beforeMarshalling(deleteVerifiedEmailAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt
     * rules and configurations are copied to the new receipt rule set and
     * are completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param cloneReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the CloneReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the CloneReceiptRuleSet service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CloneReceiptRuleSetResult cloneReceiptRuleSet(CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(cloneReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloneReceiptRuleSetRequest> request = null;
        Response<CloneReceiptRuleSetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloneReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(cloneReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CloneReceiptRuleSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this API on an email up
     * to 24 hours after you receive it.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot use this API to send generic bounces for mail
     * that was not received by Amazon SES.
     * </p>
     * <p>
     * For information about receiving email through Amazon SES, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param sendBounceRequest Container for the necessary parameters to
     *           execute the SendBounce service method on AmazonSimpleEmailService.
     * 
     * @return The response from the SendBounce service method, as returned
     *         by AmazonSimpleEmailService.
     * 
     * @throws MessageRejectedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SendBounceResult sendBounce(SendBounceRequest sendBounceRequest) {
        ExecutionContext executionContext = createExecutionContext(sendBounceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendBounceRequest> request = null;
        Response<SendBounceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendBounceRequestMarshaller().marshall(super.beforeMarshalling(sendBounceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SendBounceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param createReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the CreateReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the CreateReceiptRuleSet service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReceiptRuleSetResult createReceiptRuleSet(CreateReceiptRuleSetRequest createReceiptRuleSetRequest) {
        ExecutionContext executionContext = createExecutionContext(createReceiptRuleSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReceiptRuleSetRequest> request = null;
        Response<CreateReceiptRuleSetResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReceiptRuleSetRequestMarshaller().marshall(super.beforeMarshalling(createReceiptRuleSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateReceiptRuleSetResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the ListVerifiedEmailAddresses service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses() throws AmazonServiceException, AmazonClientException {
        return listVerifiedEmailAddresses(new ListVerifiedEmailAddressesRequest());
    }
    
    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the ListIdentities service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListIdentitiesResult listIdentities() throws AmazonServiceException, AmazonClientException {
        return listIdentities(new ListIdentitiesRequest());
    }
    
    /**
     * <p>
     * Lists the IP address filters associated with your account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the ListReceiptFilters service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReceiptFiltersResult listReceiptFilters() throws AmazonServiceException, AmazonClientException {
        return listReceiptFilters(new ListReceiptFiltersRequest());
    }
    
    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the GetSendStatistics service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSendStatisticsResult getSendStatistics() throws AmazonServiceException, AmazonClientException {
        return getSendStatistics(new GetSendStatisticsRequest());
    }
    
    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <p>
     * <b>NOTE:</b>To disable your email-receiving through Amazon SES
     * completely, you can call this API with RuleSetName set to null.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the SetActiveReceiptRuleSet service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetActiveReceiptRuleSetResult setActiveReceiptRuleSet() throws AmazonServiceException, AmazonClientException {
        return setActiveReceiptRuleSet(new SetActiveReceiptRuleSetRequest());
    }
    
    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that
     * is currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the DescribeActiveReceiptRuleSet service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet() throws AmazonServiceException, AmazonClientException {
        return describeActiveReceiptRuleSet(new DescribeActiveReceiptRuleSetRequest());
    }
    
    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the GetSendQuota service method, as returned
     *         by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSendQuotaResult getSendQuota() throws AmazonServiceException, AmazonClientException {
        return getSendQuota(new GetSendQuotaRequest());
    }
    
    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If
     * there are additional receipt rule sets to be retrieved, you will
     * receive a <code>NextToken</code> that you can provide to the next call
     * to <code>ListReceiptRuleSets</code> to retrieve the additional
     * entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the ListReceiptRuleSets service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReceiptRuleSetsResult listReceiptRuleSets() throws AmazonServiceException, AmazonClientException {
        return listReceiptRuleSets(new ListReceiptRuleSetsRequest());
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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        