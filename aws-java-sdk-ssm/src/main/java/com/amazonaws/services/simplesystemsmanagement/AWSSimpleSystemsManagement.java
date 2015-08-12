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
 * Interface for accessing Amazon SSM.
 * <p>
 * <p>
 * Amazon EC2 Simple Systems Manager (SSM) enables you to configure and manage
 * your EC2 instances. You can create a configuration document and then
 * associate it with one or more running instances.
 * </p>
 * <p>
 * You can use a configuration document to automate the following tasks for your
 * Windows instances:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Join an AWS Directory
 * </p>
 * </li>
 * <li>
 * <p>
 * Install, repair, or uninstall software using an MSI package
 * </p>
 * </li>
 * <li>
 * <p>
 * Run PowerShell scripts
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure CloudWatch Logs to monitor applications and systems
 * </p>
 * </li>
 * </ul>
 * <p>
 * Note that configuration documents are not supported on Linux instances.
 * </p>
 */
public interface AWSSimpleSystemsManagement {

    /**
     * Overrides the default endpoint for this client
     * ("https://ssm.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ssm.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://ssm.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "ssm.us-east-1.amazonaws.com") or a full URL,
     *        including the protocol (ex: "https://ssm.us-east-1.amazonaws.com")
     *        of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSSimpleSystemsManagement#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
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
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Associates the specified configuration document with the specified
     * instance.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration document
     * and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that already
     * has an associated configuration document, we replace the current
     * configuration document with the new configuration document.
     * </p>
     * 
     * @param createAssociationRequest
     *        null
     * @return Result of the CreateAssociation operation returned by the
     *         service.
     * @throws AssociationAlreadyExistsException
     *         The specified association already exists.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     */
    CreateAssociationResult createAssociation(
            CreateAssociationRequest createAssociationRequest);

    /**
     * <p>
     * Associates the specified configuration documents with the specified
     * instances.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration document
     * and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that already
     * has an associated configuration document, we replace the current
     * configuration document with the new configuration document.
     * </p>
     * 
     * @param createAssociationBatchRequest
     *        null
     * @return Result of the CreateAssociationBatch operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     */
    CreateAssociationBatchResult createAssociationBatch(
            CreateAssociationBatchRequest createAssociationBatchRequest);

    /**
     * <p>
     * Creates a configuration document.
     * </p>
     * <p>
     * After you create a configuration document, you can use
     * <a>CreateAssociation</a> to associate it with one or more running
     * instances.
     * </p>
     * 
     * @param createDocumentRequest
     *        null
     * @return Result of the CreateDocument operation returned by the service.
     * @throws DocumentAlreadyExistsException
     *         The specified configuration document already exists.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a configuration document is 64 KB.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentContentException
     *         The content for the configuration document is not valid.
     * @throws DocumentLimitExceededException
     *         You can have at most 100 active configuration documents.
     */
    CreateDocumentResult createDocument(
            CreateDocumentRequest createDocumentRequest);

    /**
     * <p>
     * Disassociates the specified configuration document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a configuration document from an instance, it does
     * not change the configuration of the instance. To change the configuration
     * state of an instance after you disassociate a configuration document, you
     * must create a new configuration document with the desired configuration
     * and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     *        null
     * @return Result of the DeleteAssociation operation returned by the
     *         service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one
     *         update at a time.
     */
    DeleteAssociationResult deleteAssociation(
            DeleteAssociationRequest deleteAssociationRequest);

    /**
     * <p>
     * Deletes the specified configuration document.
     * </p>
     * <p>
     * You must use <a>DeleteAssociation</a> to disassociate all instances that
     * are associated with the configuration document before you can delete it.
     * </p>
     * 
     * @param deleteDocumentRequest
     *        null
     * @return Result of the DeleteDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws AssociatedInstancesException
     *         You must disassociate a configuration document from all instances
     *         before you can delete it.
     */
    DeleteDocumentResult deleteDocument(
            DeleteDocumentRequest deleteDocumentRequest);

    /**
     * <p>
     * Describes the associations for the specified configuration document or
     * instance.
     * </p>
     * 
     * @param describeAssociationRequest
     *        null
     * @return Result of the DescribeAssociation operation returned by the
     *         service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     */
    DescribeAssociationResult describeAssociation(
            DescribeAssociationRequest describeAssociationRequest);

    /**
     * <p>
     * Describes the specified configuration document.
     * </p>
     * 
     * @param describeDocumentRequest
     *        null
     * @return Result of the DescribeDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     */
    DescribeDocumentResult describeDocument(
            DescribeDocumentRequest describeDocumentRequest);

    /**
     * <p>
     * Gets the contents of the specified configuration document.
     * </p>
     * 
     * @param getDocumentRequest
     *        null
     * @return Result of the GetDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     */
    GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest);

    /**
     * <p>
     * Lists the associations for the specified configuration document or
     * instance.
     * </p>
     * 
     * @param listAssociationsRequest
     *        null
     * @return Result of the ListAssociations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     */
    ListAssociationsResult listAssociations(
            ListAssociationsRequest listAssociationsRequest);

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     * 
     * @param listDocumentsRequest
     *        null
     * @return Result of the ListDocuments operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     */
    ListDocumentsResult listDocuments(ListDocumentsRequest listDocumentsRequest);

    /**
     * Simplified method form for invoking the ListDocuments operation.
     *
     * @see #listDocuments(ListDocumentsRequest)
     */
    ListDocumentsResult listDocuments();

    /**
     * <p>
     * Updates the status of the configuration document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     *        null
     * @return Result of the UpdateAssociationStatus operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         You must specify the ID of a running instance.
     * @throws InvalidDocumentException
     *         The configuration document is not valid.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws StatusUnchangedException
     *         The updated status is the same as the current status.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one
     *         update at a time.
     */
    UpdateAssociationStatusResult updateAssociationStatus(
            UpdateAssociationStatusRequest updateAssociationStatusRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
