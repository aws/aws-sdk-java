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
package com.amazonaws.services.importexport;

import org.w3c.dom.Node;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.security.SignatureException;

import javax.xml.stream.XMLEventReader;

import com.amazonaws.*;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.DefaultResponseHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpRequest;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.VoidUnmarshaller;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.importexport.model.*;
import com.amazonaws.services.importexport.model.transform.*;


/**
 * Client for accessing AmazonImportExport.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Import/Export Service <p>
 * AWS Import/Export accelerates transferring large amounts of data
 * between the AWS cloud and portable storage devices that you mail to
 * us. AWS Import/Export transfers data directly onto and off of your
 * storage devices using Amazon's high-speed internal network and
 * bypassing the Internet. For large data sets, AWS Import/Export is
 * often faster than Internet transfer and more cost effective than
 * upgrading your connectivity.
 * </p>
 */
public class AmazonImportExportClient extends AmazonWebServiceClient implements AmazonImportExport {

    /**
     * The AWS credentials (access key ID and secret key) to use when
     * authenticating with AWS services.
     */
    private AWSCredentials awsCredentials;

    /**
     * List of exception unmarshallers for all AmazonImportExport exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers;

    /**
     * Low level client for sending requests to AWS services.
     */
    protected final HttpClient client;

    /**
     * Optional request handlers for additional request processing.
     */
    private List<RequestHandler> requestHandlers = new ArrayList<RequestHandler>();


    /**
     * Constructs a new client to invoke service methods on
     * AmazonImportExport using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonImportExportClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImportExport using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonImportExport
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonImportExportClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentials = awsCredentials;

        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
        exceptionUnmarshallers.add(new BucketPermissionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidFileSystemExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingCustomsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ExpiredJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidManifestFieldExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingManifestFieldExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedManifestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAddressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MultipleRegionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnableToCancelJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CanceledJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidJobIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchBucketExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAccessKeyIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCustomsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("importexport.amazonaws.com");

        requestHandlers = new HandlerChainFactory().newRequestHandlerChain(
                "/com/amazonaws/services/importexport/request.handlers");
        client = new HttpClient(clientConfiguration);
    }

    
    /**
     * <p>
     * This operation initiates the process of scheduling an upload or
     * download of your data. You include in the request a manifest that
     * describes the data transfer specifics. The response to the request
     * includes a job ID, which you can use in other operations, a signature
     * that you use to identify your storage device, and the address where
     * you should ship your storage device.
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob service method on AmazonImportExport.
     * 
     * @return The response from the CreateJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws MalformedManifestException
     * @throws InvalidAddressException
     * @throws BucketPermissionException
     * @throws InvalidParameterException
     * @throws MultipleRegionsException
     * @throws MissingParameterException
     * @throws InvalidFileSystemException
     * @throws MissingCustomsException
     * @throws NoSuchBucketException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidManifestFieldException
     * @throws InvalidCustomsException
     * @throws MissingManifestFieldException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateJobResult createJob(CreateJobRequest createJobRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateJobRequest> request = new CreateJobRequestMarshaller().marshall(createJobRequest);
        return invoke(request, new CreateJobResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * This operation cancels a specified job. Only the job owner can cancel
     * it. The operation fails if the job has already started or is complete.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob service method on AmazonImportExport.
     * 
     * @return The response from the CancelJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws CanceledJobIdException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidJobIdException
     * @throws UnableToCancelJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CancelJobRequest> request = new CancelJobRequestMarshaller().marshall(cancelJobRequest);
        return invoke(request, new CancelJobResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * This operation returns information about a job, including where the
     * job is in the processing pipeline, the status of the results, and the
     * signature value associated with the job. You can only return
     * information about jobs you own.
     * </p>
     *
     * @param getStatusRequest Container for the necessary parameters to
     *           execute the GetStatus service method on AmazonImportExport.
     * 
     * @return The response from the GetStatus service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws CanceledJobIdException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetStatusResult getStatus(GetStatusRequest getStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetStatusRequest> request = new GetStatusRequestMarshaller().marshall(getStatusRequest);
        return invoke(request, new GetStatusResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * This operation returns the jobs associated with the requester. AWS
     * Import/Export lists the jobs in reverse chronological order based on
     * the date of creation. For example if Job Test1 was created 2009Dec30
     * and Test2 was created 2010Feb05, the ListJobs operation would return
     * Test2 followed by Test1.
     * </p>
     *
     * @param listJobsRequest Container for the necessary parameters to
     *           execute the ListJobs service method on AmazonImportExport.
     * 
     * @return The response from the ListJobs service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws InvalidParameterException
     * @throws InvalidAccessKeyIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsResult listJobs(ListJobsRequest listJobsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListJobsRequest> request = new ListJobsRequestMarshaller().marshall(listJobsRequest);
        return invoke(request, new ListJobsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * You use this operation to change the parameters specified in the
     * original manifest file by supplying a new manifest file. The manifest
     * file attached to this request replaces the original manifest file. You
     * can only use the operation after a CreateJob request but before the
     * data transfer starts and you can only use it on jobs you own.
     * </p>
     *
     * @param updateJobRequest Container for the necessary parameters to
     *           execute the UpdateJob service method on AmazonImportExport.
     * 
     * @return The response from the UpdateJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws MalformedManifestException
     * @throws BucketPermissionException
     * @throws InvalidAddressException
     * @throws InvalidParameterException
     * @throws MultipleRegionsException
     * @throws MissingParameterException
     * @throws InvalidFileSystemException
     * @throws CanceledJobIdException
     * @throws MissingCustomsException
     * @throws NoSuchBucketException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidCustomsException
     * @throws InvalidManifestFieldException
     * @throws MissingManifestFieldException
     * @throws InvalidJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateJobResult updateJob(UpdateJobRequest updateJobRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateJobRequest> request = new UpdateJobRequestMarshaller().marshall(updateJobRequest);
        return invoke(request, new UpdateJobResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * This operation returns the jobs associated with the requester. AWS
     * Import/Export lists the jobs in reverse chronological order based on
     * the date of creation. For example if Job Test1 was created 2009Dec30
     * and Test2 was created 2010Feb05, the ListJobs operation would return
     * Test2 followed by Test1.
     * </p>
     * 
     * @return The response from the ListJobs service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws InvalidParameterException
     * @throws InvalidAccessKeyIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsResult listJobs() throws AmazonServiceException, AmazonClientException {
        return listJobs(new ListJobsRequest());
    }
    

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        // Apply any additional service specific request handlers that need to be run
        if (requestHandlers != null) {
            for (RequestHandler requestHandler : requestHandlers) {
                request = requestHandler.handleRequest(request);
            }
        }

        QueryStringSigner<Y> signer = new QueryStringSigner<Y>(awsCredentials);
        try {
            signer.sign(request);
        } catch (SignatureException e) {
            throw new AmazonServiceException("Unable to sign request", e);
        }

        HttpRequest httpRequest = new HttpRequest(HttpMethodName.POST);
        for (Entry<String, String> parameter : request.getParameters().entrySet()) {
            httpRequest.addParameter(parameter.getKey(), parameter.getValue());
        }
        httpRequest.setServiceName(request.getServiceName());
        httpRequest.setEndpoint(request.getEndpoint());
        httpRequest.setResourcePath(request.getResourcePath());

        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return (X)client.execute(httpRequest, responseHandler, errorResponseHandler);
    }
}
        