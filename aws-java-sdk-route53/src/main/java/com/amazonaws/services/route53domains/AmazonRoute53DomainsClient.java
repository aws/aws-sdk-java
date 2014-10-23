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
package com.amazonaws.services.route53domains;

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

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.services.route53domains.model.transform.*;

/**
 * Client for accessing AmazonRoute53Domains.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * 
 */
public class AmazonRoute53DomainsClient extends AmazonWebServiceClient implements AmazonRoute53Domains {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRoute53Domains.class);

    /**
     * List of exception unmarshallers for all AmazonRoute53Domains exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains.  A credentials provider chain will be used
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
    public AmazonRoute53DomainsClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains.  A credentials provider chain will be used
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
     *                       client connects to AmazonRoute53Domains
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRoute53DomainsClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonRoute53DomainsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonRoute53Domains
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRoute53DomainsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials
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
     *                       client connects to AmazonRoute53Domains
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials
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
     *                       client connects to AmazonRoute53Domains
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new DuplicateRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TLDRulesViolationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DomainLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedTLDExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("route53domains.us-east-1.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/route53domains/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/route53domains/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * This operation updates the contact information for a particular
     * domain. Information for at least one contact (registrant,
     * administrator, or technical) must be supplied for update.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that
     * you can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant will be
     * notified by email.
     * </p>
     *
     * @param updateDomainContactRequest Container for the necessary
     *           parameters to execute the UpdateDomainContact service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the UpdateDomainContact service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDomainContactResult updateDomainContact(UpdateDomainContactRequest updateDomainContactRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDomainContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainContactRequest> request = null;
        Response<UpdateDomainContactResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainContactRequestMarshaller().marshall(updateDomainContactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainContactResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateDomainContactResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainContactResult> responseHandler =
                new JsonResponseHandler<UpdateDomainContactResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation checks the availability of one domain name. You can
     * access this API without authenticating. Note that if the availability
     * status of a domain is pending, you must submit another request to
     * determine the availability of the domain name.
     * </p>
     *
     * @param checkDomainAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDomainAvailability service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the CheckDomainAvailability service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws UnsupportedTLDException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CheckDomainAvailabilityResult checkDomainAvailability(CheckDomainAvailabilityRequest checkDomainAvailabilityRequest) {
        ExecutionContext executionContext = createExecutionContext(checkDomainAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDomainAvailabilityRequest> request = null;
        Response<CheckDomainAvailabilityResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckDomainAvailabilityRequestMarshaller().marshall(checkDomainAvailabilityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CheckDomainAvailabilityResult, JsonUnmarshallerContext> unmarshaller =
                new CheckDomainAvailabilityResultJsonUnmarshaller();
            JsonResponseHandler<CheckDomainAvailabilityResult> responseHandler =
                new JsonResponseHandler<CheckDomainAvailabilityResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the
     * specified domain before the domain registration expires. The cost of
     * renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD.
     * For a list of TLDs and their renewal policies, see "Renewal,
     * restoration, and deletion times"
     * iki.gandi.net/en/domains/renew#renewal_restoration_and_deletion_times)
     * on the website for our registrar partner, Gandi. Route 53 requires
     * that you renew before the end of the renewal period that is listed on
     * the Gandi website so we can complete processing before the deadline.
     * </p>
     *
     * @param enableDomainAutoRenewRequest Container for the necessary
     *           parameters to execute the EnableDomainAutoRenew service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the EnableDomainAutoRenew service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableDomainAutoRenewResult enableDomainAutoRenew(EnableDomainAutoRenewRequest enableDomainAutoRenewRequest) {
        ExecutionContext executionContext = createExecutionContext(enableDomainAutoRenewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDomainAutoRenewRequest> request = null;
        Response<EnableDomainAutoRenewResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDomainAutoRenewRequestMarshaller().marshall(enableDomainAutoRenewRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableDomainAutoRenewResult, JsonUnmarshallerContext> unmarshaller =
                new EnableDomainAutoRenewResultJsonUnmarshaller();
            JsonResponseHandler<EnableDomainAutoRenewResult> responseHandler =
                new JsonResponseHandler<EnableDomainAutoRenewResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not
     * yet complete.
     * </p>
     *
     * @param listOperationsRequest Container for the necessary parameters to
     *           execute the ListOperations service method on AmazonRoute53Domains.
     * 
     * @return The response from the ListOperations service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOperationsRequest> request = null;
        Response<ListOperationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOperationsRequestMarshaller().marshall(listOperationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOperationsResult, JsonUnmarshallerContext> unmarshaller =
                new ListOperationsResultJsonUnmarshaller();
            JsonResponseHandler<ListOperationsResult> responseHandler =
                new JsonResponseHandler<ListOperationsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon
     * Route 53 for the current AWS account.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains service method on AmazonRoute53Domains.
     * 
     * @return The response from the ListDomains service method, as returned
     *         by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestMarshaller().marshall(listDomainsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDomainsResult, JsonUnmarshallerContext> unmarshaller =
                new ListDomainsResultJsonUnmarshaller();
            JsonResponseHandler<ListDomainsResult> responseHandler =
                new JsonResponseHandler<ListDomainsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     *
     * @param getOperationDetailRequest Container for the necessary
     *           parameters to execute the GetOperationDetail service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the GetOperationDetail service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetOperationDetailResult getOperationDetail(GetOperationDetailRequest getOperationDetailRequest) {
        ExecutionContext executionContext = createExecutionContext(getOperationDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationDetailRequest> request = null;
        Response<GetOperationDetailResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationDetailRequestMarshaller().marshall(getOperationDetailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOperationDetailResult, JsonUnmarshallerContext> unmarshaller =
                new GetOperationDetailResultJsonUnmarshaller();
            JsonResponseHandler<GetOperationDetailResult> responseHandler =
                new JsonResponseHandler<GetOperationDetailResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically
     * the <code>clientTransferProhibited</code> status) to allow domain
     * transfers. We recommend you refrain from performing this action unless
     * you intend to transfer the domain to a different registrar. Successful
     * submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param disableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the DisableDomainTransferLock service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the DisableDomainTransferLock service
     *         method, as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableDomainTransferLockResult disableDomainTransferLock(DisableDomainTransferLockRequest disableDomainTransferLockRequest) {
        ExecutionContext executionContext = createExecutionContext(disableDomainTransferLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDomainTransferLockRequest> request = null;
        Response<DisableDomainTransferLockResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDomainTransferLockRequestMarshaller().marshall(disableDomainTransferLockRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableDomainTransferLockResult, JsonUnmarshallerContext> unmarshaller =
                new DisableDomainTransferLockResultJsonUnmarshaller();
            JsonResponseHandler<DisableDomainTransferLockResult> responseHandler =
                new JsonResponseHandler<DisableDomainTransferLockResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation replaces the current set of name servers for the
     * domain with the specified set of name servers. If you use Amazon Route
     * 53 as your DNS service, specify the four name servers in the
     * delegation set for the hosted zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param updateDomainNameserversRequest Container for the necessary
     *           parameters to execute the UpdateDomainNameservers service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the UpdateDomainNameservers service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDomainNameserversResult updateDomainNameservers(UpdateDomainNameserversRequest updateDomainNameserversRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDomainNameserversRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainNameserversRequest> request = null;
        Response<UpdateDomainNameserversResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainNameserversRequestMarshaller().marshall(updateDomainNameserversRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainNameserversResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateDomainNameserversResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainNameserversResult> responseHandler =
                new JsonResponseHandler<UpdateDomainNameserversResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to prevent domain
     * transfers. Successful submission returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param enableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the EnableDomainTransferLock service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the EnableDomainTransferLock service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableDomainTransferLockResult enableDomainTransferLock(EnableDomainTransferLockRequest enableDomainTransferLockRequest) {
        ExecutionContext executionContext = createExecutionContext(enableDomainTransferLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDomainTransferLockRequest> request = null;
        Response<EnableDomainTransferLockResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDomainTransferLockRequestMarshaller().marshall(enableDomainTransferLockRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableDomainTransferLockResult, JsonUnmarshallerContext> unmarshaller =
                new EnableDomainTransferLockResultJsonUnmarshaller();
            JsonResponseHandler<EnableDomainTransferLockResult> responseHandler =
                new JsonResponseHandler<EnableDomainTransferLockResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for
     * the specified domain.
     * </p>
     * <p>
     * <b>NOTE:</b>Caution! Amazon Route 53 doesn't have a manual renewal
     * process, so if you disable automatic renewal, registration for the
     * domain will not be renewed when the expiration date passes, and you
     * will lose control of the domain name.
     * </p>
     *
     * @param disableDomainAutoRenewRequest Container for the necessary
     *           parameters to execute the DisableDomainAutoRenew service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the DisableDomainAutoRenew service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableDomainAutoRenewResult disableDomainAutoRenew(DisableDomainAutoRenewRequest disableDomainAutoRenewRequest) {
        ExecutionContext executionContext = createExecutionContext(disableDomainAutoRenewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDomainAutoRenewRequest> request = null;
        Response<DisableDomainAutoRenewResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDomainAutoRenewRequestMarshaller().marshall(disableDomainAutoRenewRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableDomainAutoRenewResult, JsonUnmarshallerContext> unmarshaller =
                new DisableDomainAutoRenewResultJsonUnmarshaller();
            JsonResponseHandler<DisableDomainAutoRenewResult> responseHandler =
                new JsonResponseHandler<DisableDomainAutoRenewResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation registers a domain. Domains are registered by the AWS
     * registrar partner, Gandi. For some top-level domains (TLDs), this
     * operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * 
     * <ul>
     * <li>Creates a Amazon Route 53 hosted zone that has the same name as
     * the domain. Amazon Route 53 assigns four name servers to your hosted
     * zone and automatically updates your domain registration with the names
     * of these name servers.</li>
     * <li>Enables autorenew, so your domain registration will renew
     * automatically each year. We'll notify you in advance of the renewal
     * date so you can choose whether to renew the registration.</li>
     * <li>Optionally enables privacy protection, so WHOIS queries return
     * contact information for our registrar partner, Gandi, instead of the
     * information you entered for registrant, admin, and tech contacts.</li>
     * <li>If registration is successful, returns an operation ID that you
     * can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant is
     * notified by email.</li>
     * <li>Charges your AWS account an amount based on the top-level domain.
     * For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .</li>
     * 
     * </ul>
     *
     * @param registerDomainRequest Container for the necessary parameters to
     *           execute the RegisterDomain service method on AmazonRoute53Domains.
     * 
     * @return The response from the RegisterDomain service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws UnsupportedTLDException
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws DomainLimitExceededException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterDomainResult registerDomain(RegisterDomainRequest registerDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(registerDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDomainRequest> request = null;
        Response<RegisterDomainResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDomainRequestMarshaller().marshall(registerDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterDomainResult, JsonUnmarshallerContext> unmarshaller =
                new RegisterDomainResultJsonUnmarshaller();
            JsonResponseHandler<RegisterDomainResult> responseHandler =
                new JsonResponseHandler<RegisterDomainResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns detailed information about the domain. The
     * domain's contact information is also returned as part of the output.
     * </p>
     *
     * @param getDomainDetailRequest Container for the necessary parameters
     *           to execute the GetDomainDetail service method on AmazonRoute53Domains.
     * 
     * @return The response from the GetDomainDetail service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDomainDetailResult getDomainDetail(GetDomainDetailRequest getDomainDetailRequest) {
        ExecutionContext executionContext = createExecutionContext(getDomainDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainDetailRequest> request = null;
        Response<GetDomainDetailResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainDetailRequestMarshaller().marshall(getDomainDetailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainDetailResult, JsonUnmarshallerContext> unmarshaller =
                new GetDomainDetailResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainDetailResult> responseHandler =
                new JsonResponseHandler<GetDomainDetailResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a
     * domain to another registrar, you provide this value to the new
     * registrar.
     * </p>
     *
     * @param retrieveDomainAuthCodeRequest Container for the necessary
     *           parameters to execute the RetrieveDomainAuthCode service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the RetrieveDomainAuthCode service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RetrieveDomainAuthCodeResult retrieveDomainAuthCode(RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(retrieveDomainAuthCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveDomainAuthCodeRequest> request = null;
        Response<RetrieveDomainAuthCodeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveDomainAuthCodeRequestMarshaller().marshall(retrieveDomainAuthCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RetrieveDomainAuthCodeResult, JsonUnmarshallerContext> unmarshaller =
                new RetrieveDomainAuthCodeResultJsonUnmarshaller();
            JsonResponseHandler<RetrieveDomainAuthCodeResult> responseHandler =
                new JsonResponseHandler<RetrieveDomainAuthCodeResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon
     * Route 53. Domains are registered by the AWS registrar, Gandi upon
     * transfer.
     * </p>
     * <p>
     * To transfer a domain, you need to meet all the domain transfer
     * criteria, including the following:
     * </p>
     * 
     * <ul>
     * <li>You must supply nameservers to transfer a domain.</li>
     * <li>You must disable the domain transfer lock (if any) before
     * transferring the domain.</li>
     * <li>A minimum of 60 days must have elapsed since the domain's
     * registration or last transfer.</li>
     * 
     * </ul>
     * <p>
     * We recommend you use the Amazon Route 53 as the DNS service for your
     * domain. You can create a hosted zone in Amazon Route 53 for your
     * current domain before transferring your domain.
     * </p>
     * <p>
     * Note that upon transfer, the domain duration is extended for a year
     * if not otherwise specified. Autorenew is enabled by default.
     * </p>
     * <p>
     * If the transfer is successful, this method returns an operation ID
     * that you can use to track the progress and completion of the action.
     * If the request is not completed successfully, the domain registrant
     * will be notified by email.
     * </p>
     * <p>
     * Transferring domains charges your AWS account an amount based on the
     * top-level domain. For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .
     * </p>
     *
     * @param transferDomainRequest Container for the necessary parameters to
     *           execute the TransferDomain service method on AmazonRoute53Domains.
     * 
     * @return The response from the TransferDomain service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws UnsupportedTLDException
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws DomainLimitExceededException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TransferDomainResult transferDomain(TransferDomainRequest transferDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(transferDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferDomainRequest> request = null;
        Response<TransferDomainResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferDomainRequestMarshaller().marshall(transferDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TransferDomainResult, JsonUnmarshallerContext> unmarshaller =
                new TransferDomainResultJsonUnmarshaller();
            JsonResponseHandler<TransferDomainResult> responseHandler =
                new JsonResponseHandler<TransferDomainResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation updates the specified domain contact's privacy
     * setting. When the privacy option is enabled, personal information such
     * as postal or email address is hidden from the results of a public
     * WHOIS query. The privacy services are provided by the AWS registrar,
     * Gandi. For more information, see the
     * <a href="http://www.gandi.net/domain/whois/?currency=USD&lang=en"> Gandi privacy features </a>
     * .
     * </p>
     * <p>
     * This operation only affects the privacy of the specified contact type
     * (registrant, administrator, or tech). Successful acceptance returns an
     * operation ID that you can use with GetOperationDetail to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param updateDomainContactPrivacyRequest Container for the necessary
     *           parameters to execute the UpdateDomainContactPrivacy service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the UpdateDomainContactPrivacy service
     *         method, as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDomainContactPrivacyResult updateDomainContactPrivacy(UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDomainContactPrivacyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainContactPrivacyRequest> request = null;
        Response<UpdateDomainContactPrivacyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainContactPrivacyRequestMarshaller().marshall(updateDomainContactPrivacyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainContactPrivacyResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateDomainContactPrivacyResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainContactPrivacyResult> responseHandler =
                new JsonResponseHandler<UpdateDomainContactPrivacyResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not
     * yet complete.
     * </p>
     * 
     * @return The response from the ListOperations service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListOperationsResult listOperations() throws AmazonServiceException, AmazonClientException {
        return listOperations(new ListOperationsRequest());
    }
    
    /**
     * <p>
     * This operation returns all the domain names registered with Amazon
     * Route 53 for the current AWS account.
     * </p>
     * 
     * @return The response from the ListDomains service method, as returned
     *         by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainsResult listDomains() throws AmazonServiceException, AmazonClientException {
        return listDomains(new ListDomainsRequest());
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
        