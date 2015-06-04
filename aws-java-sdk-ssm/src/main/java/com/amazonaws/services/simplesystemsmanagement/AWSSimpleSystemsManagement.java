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
package com.amazonaws.services.simplesystemsmanagement;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Interface for accessing AWSSimpleSystemsManagement.
 * <p>
 * Amazon EC2 Simple Systems Manager (SSM) enables you to configure and
 * manage your EC2 instances. You can create a configuration document and
 * then associate it with one or more running instances.
 * </p>
 * <p>
 * You can use a configuration document to automate the following tasks
 * for your Windows instances:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Join an AWS Directory
 * </p>
 * </li>
 * <li> <p>
 * Install, repair, or uninstall software using an MSI package
 * </p>
 * </li>
 * <li> <p>
 * Run PowerShell scripts
 * </p>
 * </li>
 * <li> <p>
 * Configure CloudWatch Logs to monitor applications and systems
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Note that configuration documents are not supported on Linux
 * instances.
 * </p>
 */
public interface AWSSimpleSystemsManagement {

    /**
     * Overrides the default endpoint for this client ("https://ssm.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ssm.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://ssm.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "ssm.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://ssm.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSSimpleSystemsManagement#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Deletes the specified configuration document.
     * </p>
     * <p>
     * You must use DeleteAssociation to disassociate all instances that are
     * associated with the configuration document before you can delete it.
     * </p>
     *
     * @param deleteDocumentRequest Container for the necessary parameters to
     *           execute the DeleteDocument service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the DeleteDocument service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws AssociatedInstancesException
     * @throws InvalidDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDocumentResult deleteDocument(DeleteDocumentRequest deleteDocumentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the associations for the specified configuration document
     * or instance.
     * </p>
     *
     * @param describeAssociationRequest Container for the necessary
     *           parameters to execute the DescribeAssociation service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the DescribeAssociation service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAssociationResult describeAssociation(DescribeAssociationRequest describeAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified configuration document with the specified
     * instance.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration
     * document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that
     * already has an associated configuration document, we replace the
     * current configuration document with the new configuration document.
     * </p>
     *
     * @param createAssociationRequest Container for the necessary parameters
     *           to execute the CreateAssociation service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the CreateAssociation service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws AssociationLimitExceededException
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAssociationResult createAssociation(CreateAssociationRequest createAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified configuration documents with the specified
     * instances.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration
     * document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that
     * already has an associated configuration document, we replace the
     * current configuration document with the new configuration document.
     * </p>
     *
     * @param createAssociationBatchRequest Container for the necessary
     *           parameters to execute the CreateAssociationBatch service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the CreateAssociationBatch service method,
     *         as returned by AWSSimpleSystemsManagement.
     * 
     * @throws DuplicateInstanceIdException
     * @throws InternalServerErrorException
     * @throws AssociationLimitExceededException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAssociationBatchResult createAssociationBatch(CreateAssociationBatchRequest createAssociationBatchRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified configuration document.
     * </p>
     *
     * @param describeDocumentRequest Container for the necessary parameters
     *           to execute the DescribeDocument service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the DescribeDocument service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDocumentResult describeDocument(DescribeDocumentRequest describeDocumentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the status of the configuration document associated with the
     * specified instance.
     * </p>
     *
     * @param updateAssociationStatusRequest Container for the necessary
     *           parameters to execute the UpdateAssociationStatus service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the UpdateAssociationStatus service method,
     *         as returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws StatusUnchangedException
     * @throws TooManyUpdatesException
     * @throws AssociationDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateAssociationStatusResult updateAssociationStatus(UpdateAssociationStatusRequest updateAssociationStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the associations for the specified configuration document or
     * instance.
     * </p>
     *
     * @param listAssociationsRequest Container for the necessary parameters
     *           to execute the ListAssociations service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the ListAssociations service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAssociationsResult listAssociations(ListAssociationsRequest listAssociationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     *
     * @param listDocumentsRequest Container for the necessary parameters to
     *           execute the ListDocuments service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the ListDocuments service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDocumentsResult listDocuments(ListDocumentsRequest listDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates the specified configuration document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a configuration document from an instance, it
     * does not change the configuration of the instance. To change the
     * configuration state of an instance after you disassociate a
     * configuration document, you must create a new configuration document
     * with the desired configuration and associate it with the instance.
     * </p>
     *
     * @param deleteAssociationRequest Container for the necessary parameters
     *           to execute the DeleteAssociation service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the DeleteAssociation service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws TooManyUpdatesException
     * @throws AssociationDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteAssociationResult deleteAssociation(DeleteAssociationRequest deleteAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a configuration document.
     * </p>
     * <p>
     * After you create a configuration document, you can use
     * CreateAssociation to associate it with one or more running instances.
     * </p>
     *
     * @param createDocumentRequest Container for the necessary parameters to
     *           execute the CreateDocument service method on
     *           AWSSimpleSystemsManagement.
     * 
     * @return The response from the CreateDocument service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws DocumentAlreadyExistsException
     * @throws MaxDocumentSizeExceededException
     * @throws InvalidDocumentContentException
     * @throws DocumentLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDocumentResult createDocument(CreateDocumentRequest createDocumentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the contents of the specified configuration document.
     * </p>
     *
     * @param getDocumentRequest Container for the necessary parameters to
     *           execute the GetDocument service method on AWSSimpleSystemsManagement.
     * 
     * @return The response from the GetDocument service method, as returned
     *         by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     * 
     * @return The response from the ListDocuments service method, as
     *         returned by AWSSimpleSystemsManagement.
     * 
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDocumentsResult listDocuments() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        