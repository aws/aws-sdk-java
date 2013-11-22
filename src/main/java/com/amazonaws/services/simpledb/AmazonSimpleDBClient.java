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
package com.amazonaws.services.simpledb;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.services.simpledb.model.transform.*;


/**
 * Client for accessing AmazonSimpleDB.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon SimpleDB <p>
 * Amazon SimpleDB is a web service providing the core database functions of data indexing and querying in the cloud. By offloading the time and effort
 * associated with building and operating a web-scale database, SimpleDB provides developers the freedom to focus on application development.
 * </p>
 * <p>
 * A traditional, clustered relational database requires a sizable upfront capital outlay, is complex to design, and often requires extensive and
 * repetitive database administration. Amazon SimpleDB is dramatically simpler, requiring no schema, automatically indexing your data and providing a
 * simple API for storage and access. This approach eliminates the administrative burden of data modeling, index maintenance, and performance tuning.
 * Developers gain access to this functionality within Amazon's proven computing environment, are able to scale instantly, and pay only for what they
 * use.
 * </p>
 * <p>
 * Visit <a href="http://aws.amazon.com/simpledb/"> http://aws.amazon.com/simpledb/ </a> for more information.
 * </p>
 */
public class AmazonSimpleDBClient extends AmazonWebServiceClient implements AmazonSimpleDB {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonSimpleDB exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleDB.  A credentials provider chain will be used
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
    public AmazonSimpleDBClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleDB.  A credentials provider chain will be used
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
     *                       client connects to AmazonSimpleDB
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSimpleDBClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonSimpleDBClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSimpleDB
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSimpleDBClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonSimpleDBClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials
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
     *                       client connects to AmazonSimpleDB
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSimpleDBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberDomainBytesExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchDomainExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberDomainsExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberSubmittedItemsExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RequestTimeoutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidQueryExpressionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberSubmittedAttributesExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateItemNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberDomainAttributesExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNumberPredicatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyRequestedAttributesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberItemAttributesExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AttributeDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNumberValueTestsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("sdb.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/simpledb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/simpledb/request.handler2s"));
    }

    
    /**
     * <p>
     * The <code>Select</code> operation returns a set of attributes for
     * <code>ItemNames</code> that match the select expression.
     * <code>Select</code> is similar to the standard SQL SELECT statement.
     * </p>
     * <p>
     * The total size of the response cannot exceed 1 MB in total size.
     * Amazon SimpleDB automatically adjusts the number of items returned per
     * page to enforce this limit. For example, if the client asks to
     * retrieve 2500 items, but each individual item is 10 kB in size, the
     * system returns 100 items and an appropriate <code>NextToken</code> so
     * the client can access the next page of results.
     * </p>
     * <p>
     * For information on how to construct select expressions, see Using
     * Select to Create Amazon SimpleDB Queries in the Developer Guide.
     * </p>
     *
     * @param selectRequest Container for the necessary parameters to execute
     *           the Select service method on AmazonSimpleDB.
     * 
     * @return The response from the Select service method, as returned by
     *         AmazonSimpleDB.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidQueryExpressionException
     * @throws RequestTimeoutException
     * @throws InvalidNumberPredicatesException
     * @throws NoSuchDomainException
     * @throws InvalidNextTokenException
     * @throws TooManyRequestedAttributesException
     * @throws MissingParameterException
     * @throws InvalidNumberValueTestsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SelectResult select(SelectRequest selectRequest) {
        ExecutionContext executionContext = createExecutionContext(selectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SelectRequest> request = null;
        Response<SelectResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SelectRequestMarshaller().marshall(selectRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SelectResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The PutAttributes operation creates or replaces attributes in an
     * item. The client may specify new attributes using a combination of the
     * <code>Attribute.X.Name</code> and <code>Attribute.X.Value</code>
     * parameters. The client specifies the first attribute by the parameters
     * <code>Attribute.0.Name</code> and <code>Attribute.0.Value</code> ,
     * the second attribute by the parameters <code>Attribute.1.Name</code>
     * and <code>Attribute.1.Value</code> , and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified in an item by their name/value
     * combination. For example, a single item can have the attributes
     * <code>{ "first_name", "first_value" }</code> and <code>{ "first_name",
     * second_value" }</code> . However, it cannot have two attribute
     * instances where both the <code>Attribute.X.Name</code> and
     * <code>Attribute.X.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requestor can supply the <code>Replace</code>
     * parameter for each individual attribute. Setting this value to
     * <code>true</code> causes the new attribute value to replace the
     * existing attribute value(s). For example, if an item has the
     * attributes <code>{ 'a', '1' }</code> ,
     * 
     * <code>{ 'b', '2'}</code> and <code>{ 'b', '3'
     * }</code> and the requestor calls <code>PutAttributes</code> using the
     * attributes <code>{ 'b', '4' }</code> with the <code>Replace</code>
     * parameter set to true, the final attributes of the item are changed to
     * <code>{ 'a', '1' }</code> and <code>{ 'b', '4' }</code> , which
     * replaces the previous values of the 'b' attribute with the new value.
     * </p>
     * <p>
     * <b>NOTE:</b> Using PutAttributes to replace attribute values that do
     * not exist will not result in an error response.
     * </p>
     * <p>
     * You cannot specify an empty string as an attribute name.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of client data and uses
     * an eventual consistency update model, an immediate GetAttributes or
     * Select operation (read) immediately after a PutAttributes or
     * DeleteAttributes operation (write) might not return the updated data.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 total attribute name-value pairs per item</li>
     * <li>One billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param putAttributesRequest Container for the necessary parameters to
     *           execute the PutAttributes service method on AmazonSimpleDB.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws NumberDomainBytesExceededException
     * @throws NumberDomainAttributesExceededException
     * @throws NoSuchDomainException
     * @throws NumberItemAttributesExceededException
     * @throws AttributeDoesNotExistException
     * @throws MissingParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putAttributes(PutAttributesRequest putAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(putAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<PutAttributesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new PutAttributesRequestMarshaller().marshall(putAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Performs multiple DeleteAttributes operations in a single call, which
     * reduces round trips and latencies. This enables Amazon SimpleDB to
     * optimize requests, which generally yields better throughput.
     * </p>
     * <p>
     * <b>NOTE:</b> If you specify BatchDeleteAttributes without attributes
     * or values, all the attributes for the item are deleted.
     * BatchDeleteAttributes is an idempotent operation; running it multiple
     * times on the same item or attribute doesn't result in an error. The
     * BatchDeleteAttributes operation succeeds or fails in its entirety.
     * There are no partial deletes. You can execute multiple
     * BatchDeleteAttributes operations and other operations in parallel.
     * However, large numbers of concurrent BatchDeleteAttributes calls can
     * result in Service Unavailable (503) responses. This operation is
     * vulnerable to exceeding the maximum URL size when making a REST
     * request using the HTTP GET method. This operation does not support
     * conditions using Expected.X.Name, Expected.X.Value, or
     * Expected.X.Exists.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>1 MB request size</li>
     * <li>25 item limit per BatchDeleteAttributes operation</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param batchDeleteAttributesRequest Container for the necessary
     *           parameters to execute the BatchDeleteAttributes service method on
     *           AmazonSimpleDB.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void batchDeleteAttributes(BatchDeleteAttributesRequest batchDeleteAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(batchDeleteAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<BatchDeleteAttributesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new BatchDeleteAttributesRequestMarshaller().marshall(batchDeleteAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>DeleteDomain</code> operation deletes a domain. Any items
     * (and their attributes) in the domain are deleted as well. The
     * <code>DeleteDomain</code> operation might take 10 or more seconds to
     * complete.
     * </p>
     * <p>
     * <b>NOTE:</b> Running DeleteDomain on a domain that does not exist or
     * running the function multiple times using the same domain name will
     * not result in an error response.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain service method on AmazonSimpleDB.
     * 
     * 
     * @throws MissingParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDomain(DeleteDomainRequest deleteDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteDomainRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteDomainRequestMarshaller().marshall(deleteDomainRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>CreateDomain</code> operation creates a new domain. The
     * domain name should be unique among the domains associated with the
     * Access Key ID provided in the request. The <code>CreateDomain</code>
     * operation may take 10 or more seconds to complete.
     * </p>
     * <p>
     * <b>NOTE:</b> CreateDomain is an idempotent operation; running it
     * multiple times using the same domain name will not result in an error
     * response.
     * </p>
     * <p>
     * The client can create up to 100 domains per account.
     * </p>
     * <p>
     * If the client requires additional domains, go to <a
     * href="http://aws.amazon.com/contact-us/simpledb-limit-request/">
     * http://aws.amazon.com/contact-us/simpledb-limit-request/ </a> .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain service method on AmazonSimpleDB.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws NumberDomainsExceededException
     * @throws MissingParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createDomain(CreateDomainRequest createDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateDomainRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateDomainRequestMarshaller().marshall(createDomainRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes one or more attributes associated with an item. If all
     * attributes of the item are deleted, the item is deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If DeleteAttributes is called without being passed any
     * attributes or values specified, all the attributes for the item are
     * deleted.
     * </p>
     * <p>
     * <code>DeleteAttributes</code> is an idempotent operation; running it
     * multiple times on the same item or attribute does not result in an
     * error response.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of item data and uses
     * an eventual consistency update model, performing a GetAttributes or
     * Select operation (read) immediately after a
     * <code>DeleteAttributes</code> or PutAttributes operation (write) might
     * not return updated item data.
     * </p>
     *
     * @param deleteAttributesRequest Container for the necessary parameters
     *           to execute the DeleteAttributes service method on AmazonSimpleDB.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws NoSuchDomainException
     * @throws AttributeDoesNotExistException
     * @throws MissingParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAttributes(DeleteAttributesRequest deleteAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteAttributesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteAttributesRequestMarshaller().marshall(deleteAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>ListDomains</code> operation lists all domains associated
     * with the Access Key ID. It returns domain names up to the limit set by
     * MaxNumberOfDomains. A NextToken is returned if there are more than
     * <code>MaxNumberOfDomains</code> domains. Calling
     * <code>ListDomains</code> successive times with the
     * <code>NextToken</code> provided by the operation returns up to
     * <code>MaxNumberOfDomains</code> more domain names with each successive
     * operation call.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains service method on AmazonSimpleDB.
     * 
     * @return The response from the ListDomains service method, as returned
     *         by AmazonSimpleDB.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListDomainsRequestMarshaller().marshall(listDomainsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListDomainsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns all of the attributes associated with the specified item.
     * Optionally, the attributes returned can be limited to one or more
     * attributes by specifying an attribute name parameter.
     * </p>
     * <p>
     * If the item does not exist on the replica that was accessed for this
     * operation, an empty set is returned. The system does not return an
     * error as it cannot guarantee the item does not exist on other
     * replicas.
     * </p>
     * <p>
     * <b>NOTE:</b> If GetAttributes is called without being passed any
     * attribute names, all the attributes for the item are returned.
     * </p>
     *
     * @param getAttributesRequest Container for the necessary parameters to
     *           execute the GetAttributes service method on AmazonSimpleDB.
     * 
     * @return The response from the GetAttributes service method, as
     *         returned by AmazonSimpleDB.
     * 
     * @throws InvalidParameterValueException
     * @throws NoSuchDomainException
     * @throws MissingParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAttributesResult getAttributes(GetAttributesRequest getAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetAttributesRequest> request = null;
        Response<GetAttributesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetAttributesRequestMarshaller().marshall(getAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetAttributesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>BatchPutAttributes</code> operation creates or replaces
     * attributes within one or more items. By using this operation, the
     * client can perform multiple PutAttribute operation with a single call.
     * This helps yield savings in round trips and latencies, enabling
     * Amazon SimpleDB to optimize requests and generally produce better
     * throughput.
     * </p>
     * <p>
     * The client may specify the item name with the
     * <code>Item.X.ItemName</code> parameter. The client may specify new
     * attributes using a combination of the
     * <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> parameters. The client may
     * specify the first attribute for the first item using the parameters
     * <code>Item.0.Attribute.0.Name</code> and
     * <code>Item.0.Attribute.0.Value</code> ,
     * and for the second attribute for the first item by the parameters
     * <code>Item.0.Attribute.1.Name</code> and
     * <code>Item.0.Attribute.1.Value</code> ,
     * and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified within an item by their name/value
     * combination. For example, a single item can have the attributes
     * <code>{ "first_name", "first_value" }</code> and <code>{ "first_name",
     * "second_value" }</code> .
     * However, it cannot have two attribute instances where both the
     * <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requester can supply the <code>Replace</code>
     * parameter for each individual value. Setting this value to
     * <code>true</code> will cause the new attribute values to replace the
     * existing attribute values. For example, if an item <code>I</code> has
     * the attributes <code>{ 'a', '1' }, { 'b', '2'}</code> and <code>{ 'b',
     * '3' }</code> and the requester does a BatchPutAttributes of
     * <code>{'I', 'b', '4' }</code> with the Replace parameter set to true,
     * the final attributes of the item will be <code>{ 'a', '1' }</code> and
     * <code>{ 'b', '4' }</code> ,
     * replacing the previous values of the 'b' attribute with the new
     * value.
     * </p>
     * <p>
     * <b>NOTE:</b> You cannot specify an empty string as an item or as an
     * attribute name. The BatchPutAttributes operation succeeds or fails in
     * its entirety. There are no partial puts.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> This operation is vulnerable to exceeding the
     * maximum URL size when making a REST request using the HTTP GET method.
     * This operation does not support conditions using Expected.X.Name,
     * Expected.X.Value, or Expected.X.Exists.
     * </p>
     * <p>
     * You can execute multiple <code>BatchPutAttributes</code> operations
     * and other operations in parallel. However, large numbers of concurrent
     * <code>BatchPutAttributes</code> calls can result in Service
     * Unavailable (503) responses.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 attribute name-value pairs per item</li>
     * <li>1 MB request size</li>
     * <li>1 billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * <li>25 item limit per <code>BatchPutAttributes</code> operation</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param batchPutAttributesRequest Container for the necessary
     *           parameters to execute the BatchPutAttributes service method on
     *           AmazonSimpleDB.
     * 
     * 
     * @throws DuplicateItemNameException
     * @throws InvalidParameterValueException
     * @throws NumberDomainBytesExceededException
     * @throws NumberSubmittedItemsExceededException
     * @throws NumberSubmittedAttributesExceededException
     * @throws NumberDomainAttributesExceededException
     * @throws NoSuchDomainException
     * @throws NumberItemAttributesExceededException
     * @throws MissingParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void batchPutAttributes(BatchPutAttributesRequest batchPutAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(batchPutAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<BatchPutAttributesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new BatchPutAttributesRequestMarshaller().marshall(batchPutAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns information about the domain, including when the domain was
     * created, the number of items and attributes in the domain, and the
     * size of the attribute names and values.
     * </p>
     *
     * @param domainMetadataRequest Container for the necessary parameters to
     *           execute the DomainMetadata service method on AmazonSimpleDB.
     * 
     * @return The response from the DomainMetadata service method, as
     *         returned by AmazonSimpleDB.
     * 
     * @throws NoSuchDomainException
     * @throws MissingParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DomainMetadataResult domainMetadata(DomainMetadataRequest domainMetadataRequest) {
        ExecutionContext executionContext = createExecutionContext(domainMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DomainMetadataRequest> request = null;
        Response<DomainMetadataResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DomainMetadataRequestMarshaller().marshall(domainMetadataRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DomainMetadataResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>ListDomains</code> operation lists all domains associated
     * with the Access Key ID. It returns domain names up to the limit set by
     * MaxNumberOfDomains. A NextToken is returned if there are more than
     * <code>MaxNumberOfDomains</code> domains. Calling
     * <code>ListDomains</code> successive times with the
     * <code>NextToken</code> provided by the operation returns up to
     * <code>MaxNumberOfDomains</code> more domain names with each successive
     * operation call.
     * </p>
     * 
     * @return The response from the ListDomains service method, as returned
     *         by AmazonSimpleDB.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainsResult listDomains() throws AmazonServiceException, AmazonClientException {
        return listDomains(new ListDomainsRequest());
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "sdb";
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
    public SimpleDBResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        ResponseMetadata metadata = client.getResponseMetadataForRequest(request);
        if (metadata != null)
          return new SimpleDBResponseMetadata(metadata);
        else
          return null;
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        for (Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(getSigner());
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        