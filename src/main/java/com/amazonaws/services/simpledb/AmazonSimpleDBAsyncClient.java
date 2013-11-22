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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.simpledb.model.*;


/**
 * Asynchronous client for accessing AmazonSimpleDB.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
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
public class AmazonSimpleDBAsyncClient extends AmazonSimpleDBClient
        implements AmazonSimpleDBAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AmazonSimpleDBAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
    public AmazonSimpleDBAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials.
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
    public AmazonSimpleDBAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials
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
    public AmazonSimpleDBAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials,
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
    public AmazonSimpleDBAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials provider.
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
    public AmazonSimpleDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials provider
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
    public AmazonSimpleDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials
     * provider and client configuration options.
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
     */
    public AmazonSimpleDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleDB using the specified AWS account credentials
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
    public AmazonSimpleDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     *           the Select operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the Select
     *         service method, as returned by AmazonSimpleDB.
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
    public Future<SelectResult> selectAsync(final SelectRequest selectRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SelectResult>() {
            public SelectResult call() throws Exception {
                return select(selectRequest);
		    }
		});
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
     *           the Select operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Select
     *         service method, as returned by AmazonSimpleDB.
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
    public Future<SelectResult> selectAsync(
            final SelectRequest selectRequest,
            final AsyncHandler<SelectRequest, SelectResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SelectResult>() {
            public SelectResult call() throws Exception {
            	SelectResult result;
                try {
            		result = select(selectRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(selectRequest, result);
               	return result;
		    }
		});
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
     *           execute the PutAttributes operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         PutAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<Void> putAttributesAsync(final PutAttributesRequest putAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                putAttributes(putAttributesRequest);
                return null;
		    }
		});
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
     *           execute the PutAttributes operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<Void> putAttributesAsync(
            final PutAttributesRequest putAttributesRequest,
            final AsyncHandler<PutAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		putAttributes(putAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(putAttributesRequest, null);
               	return null;
		    }
		});
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
     *           parameters to execute the BatchDeleteAttributes operation on
     *           AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         BatchDeleteAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<Void> batchDeleteAttributesAsync(final BatchDeleteAttributesRequest batchDeleteAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                batchDeleteAttributes(batchDeleteAttributesRequest);
                return null;
		    }
		});
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
     *           parameters to execute the BatchDeleteAttributes operation on
     *           AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchDeleteAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<Void> batchDeleteAttributesAsync(
            final BatchDeleteAttributesRequest batchDeleteAttributesRequest,
            final AsyncHandler<BatchDeleteAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		batchDeleteAttributes(batchDeleteAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(batchDeleteAttributesRequest, null);
               	return null;
		    }
		});
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
     *           execute the DeleteDomain operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonSimpleDB.
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
    public Future<Void> deleteDomainAsync(final DeleteDomainRequest deleteDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteDomain(deleteDomainRequest);
                return null;
		    }
		});
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
     *           execute the DeleteDomain operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonSimpleDB.
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
    public Future<Void> deleteDomainAsync(
            final DeleteDomainRequest deleteDomainRequest,
            final AsyncHandler<DeleteDomainRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteDomain(deleteDomainRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteDomainRequest, null);
               	return null;
		    }
		});
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
     *           execute the CreateDomain operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonSimpleDB.
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
    public Future<Void> createDomainAsync(final CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createDomain(createDomainRequest);
                return null;
		    }
		});
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
     *           execute the CreateDomain operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonSimpleDB.
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
    public Future<Void> createDomainAsync(
            final CreateDomainRequest createDomainRequest,
            final AsyncHandler<CreateDomainRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		createDomain(createDomainRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDomainRequest, null);
               	return null;
		    }
		});
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
     *           to execute the DeleteAttributes operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<Void> deleteAttributesAsync(final DeleteAttributesRequest deleteAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteAttributes(deleteAttributesRequest);
                return null;
		    }
		});
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
     *           to execute the DeleteAttributes operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<Void> deleteAttributesAsync(
            final DeleteAttributesRequest deleteAttributesRequest,
            final AsyncHandler<DeleteAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteAttributes(deleteAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteAttributesRequest, null);
               	return null;
		    }
		});
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
     *           execute the ListDomains operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonSimpleDB.
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
    public Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest listDomainsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDomainsResult>() {
            public ListDomainsResult call() throws Exception {
                return listDomains(listDomainsRequest);
		    }
		});
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
     *           execute the ListDomains operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonSimpleDB.
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
    public Future<ListDomainsResult> listDomainsAsync(
            final ListDomainsRequest listDomainsRequest,
            final AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDomainsResult>() {
            public ListDomainsResult call() throws Exception {
            	ListDomainsResult result;
                try {
            		result = listDomains(listDomainsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listDomainsRequest, result);
               	return result;
		    }
		});
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
     *           execute the GetAttributes operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         GetAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<GetAttributesResult> getAttributesAsync(final GetAttributesRequest getAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAttributesResult>() {
            public GetAttributesResult call() throws Exception {
                return getAttributes(getAttributesRequest);
		    }
		});
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
     *           execute the GetAttributes operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<GetAttributesResult> getAttributesAsync(
            final GetAttributesRequest getAttributesRequest,
            final AsyncHandler<GetAttributesRequest, GetAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAttributesResult>() {
            public GetAttributesResult call() throws Exception {
            	GetAttributesResult result;
                try {
            		result = getAttributes(getAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getAttributesRequest, result);
               	return result;
		    }
		});
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
     *           parameters to execute the BatchPutAttributes operation on
     *           AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         BatchPutAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<Void> batchPutAttributesAsync(final BatchPutAttributesRequest batchPutAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                batchPutAttributes(batchPutAttributesRequest);
                return null;
		    }
		});
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
     *           parameters to execute the BatchPutAttributes operation on
     *           AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchPutAttributes service method, as returned by AmazonSimpleDB.
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
    public Future<Void> batchPutAttributesAsync(
            final BatchPutAttributesRequest batchPutAttributesRequest,
            final AsyncHandler<BatchPutAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		batchPutAttributes(batchPutAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(batchPutAttributesRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Returns information about the domain, including when the domain was
     * created, the number of items and attributes in the domain, and the
     * size of the attribute names and values.
     * </p>
     *
     * @param domainMetadataRequest Container for the necessary parameters to
     *           execute the DomainMetadata operation on AmazonSimpleDB.
     * 
     * @return A Java Future object containing the response from the
     *         DomainMetadata service method, as returned by AmazonSimpleDB.
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
    public Future<DomainMetadataResult> domainMetadataAsync(final DomainMetadataRequest domainMetadataRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DomainMetadataResult>() {
            public DomainMetadataResult call() throws Exception {
                return domainMetadata(domainMetadataRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns information about the domain, including when the domain was
     * created, the number of items and attributes in the domain, and the
     * size of the attribute names and values.
     * </p>
     *
     * @param domainMetadataRequest Container for the necessary parameters to
     *           execute the DomainMetadata operation on AmazonSimpleDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DomainMetadata service method, as returned by AmazonSimpleDB.
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
    public Future<DomainMetadataResult> domainMetadataAsync(
            final DomainMetadataRequest domainMetadataRequest,
            final AsyncHandler<DomainMetadataRequest, DomainMetadataResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DomainMetadataResult>() {
            public DomainMetadataResult call() throws Exception {
            	DomainMetadataResult result;
                try {
            		result = domainMetadata(domainMetadataRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(domainMetadataRequest, result);
               	return result;
		    }
		});
    }
    
}
        