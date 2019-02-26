/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.clouddirectory.model.*;

/**
 * Interface for accessing Amazon CloudDirectory.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.clouddirectory.AbstractAmazonCloudDirectory} instead.
 * </p>
 * <p>
 * <fullname>Amazon Cloud Directory</fullname>
 * <p>
 * Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of
 * cloud-scale web, mobile, and IoT applications. This guide describes the Cloud Directory operations that you can call
 * programmatically and includes detailed information on data types and errors. For information about Cloud Directory
 * features, see <a href="https://aws.amazon.com/directoryservice/">AWS Directory Service</a> and the <a
 * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/what_is_cloud_directory.html">Amazon Cloud
 * Directory Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudDirectory {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "clouddirectory";

    /**
     * Overrides the default endpoint for this client ("clouddirectory.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "clouddirectory.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "clouddirectory.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "clouddirectory.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "clouddirectory.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudDirectory#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Adds a new <a>Facet</a> to an object. An object can have more than one facet applied on it.
     * </p>
     * 
     * @param addFacetToObjectRequest
     * @return Result of the AddFacetToObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.AddFacetToObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AddFacetToObject"
     *      target="_top">AWS API Documentation</a>
     */
    AddFacetToObjectResult addFacetToObject(AddFacetToObjectRequest addFacetToObjectRequest);

    /**
     * <p>
     * Copies the input published schema, at the specified version, into the <a>Directory</a> with the same name and
     * version as that of the published schema.
     * </p>
     * 
     * @param applySchemaRequest
     * @return Result of the ApplySchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws SchemaAlreadyExistsException
     *         Indicates that a schema could not be created due to a naming conflict. Please select a different name and
     *         then try again.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @sample AmazonCloudDirectory.ApplySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ApplySchema" target="_top">AWS API
     *      Documentation</a>
     */
    ApplySchemaResult applySchema(ApplySchemaRequest applySchemaRequest);

    /**
     * <p>
     * Attaches an existing object to another object. An object can be accessed in two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Using the path
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>ObjectIdentifier</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param attachObjectRequest
     * @return Result of the AttachObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.AttachObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachObject" target="_top">AWS
     *      API Documentation</a>
     */
    AttachObjectResult attachObject(AttachObjectRequest attachObjectRequest);

    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return Result of the AttachPolicy operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotPolicyException
     *         Indicates that the requested operation can only operate on policy objects.
     * @sample AmazonCloudDirectory.AttachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    AttachPolicyResult attachPolicy(AttachPolicyRequest attachPolicyRequest);

    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     * 
     * @param attachToIndexRequest
     * @return Result of the AttachToIndex operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws IndexedAttributeMissingException
     *         An object has been attempted to be attached to an object that does not have the appropriate attribute
     *         value.
     * @throws NotIndexException
     *         Indicates that the requested operation can only operate on index objects.
     * @sample AmazonCloudDirectory.AttachToIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachToIndex" target="_top">AWS
     *      API Documentation</a>
     */
    AttachToIndexResult attachToIndex(AttachToIndexRequest attachToIndexRequest);

    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param attachTypedLinkRequest
     * @return Result of the AttachTypedLink operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.AttachTypedLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachTypedLink" target="_top">AWS
     *      API Documentation</a>
     */
    AttachTypedLinkResult attachTypedLink(AttachTypedLinkRequest attachTypedLinkRequest);

    /**
     * <p>
     * Performs all the read operations in a batch.
     * </p>
     * 
     * @param batchReadRequest
     * @return Result of the BatchRead operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @sample AmazonCloudDirectory.BatchRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchRead" target="_top">AWS API
     *      Documentation</a>
     */
    BatchReadResult batchRead(BatchReadRequest batchReadRequest);

    /**
     * <p>
     * Performs all the write operations in a batch. Either all the operations succeed or none.
     * </p>
     * 
     * @param batchWriteRequest
     * @return Result of the BatchWrite operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws BatchWriteException
     *         A <code>BatchWrite</code> exception has occurred.
     * @sample AmazonCloudDirectory.BatchWrite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchWrite" target="_top">AWS API
     *      Documentation</a>
     */
    BatchWriteResult batchWrite(BatchWriteRequest batchWriteRequest);

    /**
     * <p>
     * Creates a <a>Directory</a> by copying the published schema into the directory. A directory cannot be created
     * without a schema.
     * </p>
     * <p>
     * You can also quickly create a directory using a managed schema, called the <code>QuickStartSchema</code>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_managed.html">Managed Schema</a>
     * in the <i>Amazon Cloud Directory Developer Guide</i>.
     * </p>
     * 
     * @param createDirectoryRequest
     * @return Result of the CreateDirectory operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryAlreadyExistsException
     *         Indicates that a <a>Directory</a> could not be created due to a naming conflict. Choose a different name
     *         and try again.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.CreateDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDirectoryResult createDirectory(CreateDirectoryRequest createDirectoryRequest);

    /**
     * <p>
     * Creates a new <a>Facet</a> in a schema. Facet creation is allowed only in development or applied schemas.
     * </p>
     * 
     * @param createFacetRequest
     * @return Result of the CreateFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetAlreadyExistsException
     *         A facet with the same name already exists.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.CreateFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateFacet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFacetResult createFacet(CreateFacetRequest createFacetRequest);

    /**
     * <p>
     * Creates an index object. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.html">Indexing and
     * search</a> for more information.
     * </p>
     * 
     * @param createIndexRequest
     * @return Result of the CreateIndex operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws UnsupportedIndexTypeException
     *         Indicates that the requested index type is not supported.
     * @sample AmazonCloudDirectory.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIndexResult createIndex(CreateIndexRequest createIndexRequest);

    /**
     * <p>
     * Creates an object in a <a>Directory</a>. Additionally attaches the object to a parent, if a parent reference and
     * <code>LinkName</code> is specified. An object is simply a collection of <a>Facet</a> attributes. You can also use
     * this API call to create a policy object, if the facet from which you create the object is a policy facet.
     * </p>
     * 
     * @param createObjectRequest
     * @return Result of the CreateObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws UnsupportedIndexTypeException
     *         Indicates that the requested index type is not supported.
     * @sample AmazonCloudDirectory.CreateObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateObject" target="_top">AWS
     *      API Documentation</a>
     */
    CreateObjectResult createObject(CreateObjectRequest createObjectRequest);

    /**
     * <p>
     * Creates a new schema in a development state. A schema can exist in three phases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Development:</i> This is a mutable phase of the schema. All new schemas are in the development phase. Once the
     * schema is finalized, it can be published.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Published:</i> Published schemas are immutable and have a version associated with them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Applied:</i> Applied schemas are mutable in a way that allows you to add new schema facets. You can also add
     * new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSchemaRequest
     * @return Result of the CreateSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws SchemaAlreadyExistsException
     *         Indicates that a schema could not be created due to a naming conflict. Please select a different name and
     *         then try again.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @sample AmazonCloudDirectory.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateSchema" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSchemaResult createSchema(CreateSchemaRequest createSchemaRequest);

    /**
     * <p>
     * Creates a <a>TypedLinkFacet</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param createTypedLinkFacetRequest
     * @return Result of the CreateTypedLinkFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetAlreadyExistsException
     *         A facet with the same name already exists.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.CreateTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTypedLinkFacetResult createTypedLinkFacet(CreateTypedLinkFacetRequest createTypedLinkFacetRequest);

    /**
     * <p>
     * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise
     * extreme caution when deleting directories.
     * </p>
     * 
     * @param deleteDirectoryRequest
     * @return Result of the DeleteDirectory operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws DirectoryNotDisabledException
     *         An operation can only operate on a disabled directory.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryDeletedException
     *         A directory that has been deleted and to which access has been attempted. Note: The requested resource
     *         will eventually cease to exist.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @sample AmazonCloudDirectory.DeleteDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDirectoryResult deleteDirectory(DeleteDirectoryRequest deleteDirectoryRequest);

    /**
     * <p>
     * Deletes a given <a>Facet</a>. All attributes and <a>Rule</a>s that are associated with the facet will be deleted.
     * Only development schema facets are allowed deletion.
     * </p>
     * 
     * @param deleteFacetRequest
     * @return Result of the DeleteFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws FacetInUseException
     *         Occurs when deleting a facet that contains an attribute that is a target to an attribute reference in a
     *         different facet.
     * @sample AmazonCloudDirectory.DeleteFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteFacet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFacetResult deleteFacet(DeleteFacetRequest deleteFacetRequest);

    /**
     * <p>
     * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The
     * maximum number of attributes that can be deleted during an object deletion is 30. For more information, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     * Limits</a>.
     * </p>
     * 
     * @param deleteObjectRequest
     * @return Result of the DeleteObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ObjectNotDetachedException
     *         Indicates that the requested operation cannot be completed because the object has not been detached from
     *         the tree.
     * @sample AmazonCloudDirectory.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteObject" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteObjectResult deleteObject(DeleteObjectRequest deleteObjectRequest);

    /**
     * <p>
     * Deletes a given schema. Schemas in a development and published state can only be deleted.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return Result of the DeleteSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws StillContainsLinksException
     *         The object could not be deleted because links still exist. Remove the links and then try the operation
     *         again.
     * @sample AmazonCloudDirectory.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteSchema" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSchemaResult deleteSchema(DeleteSchemaRequest deleteSchemaRequest);

    /**
     * <p>
     * Deletes a <a>TypedLinkFacet</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param deleteTypedLinkFacetRequest
     * @return Result of the DeleteTypedLinkFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @sample AmazonCloudDirectory.DeleteTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DeleteTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTypedLinkFacetResult deleteTypedLinkFacet(DeleteTypedLinkFacetRequest deleteTypedLinkFacetRequest);

    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     * 
     * @param detachFromIndexRequest
     * @return Result of the DetachFromIndex operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ObjectAlreadyDetachedException
     *         Indicates that the object is not attached to the index.
     * @throws NotIndexException
     *         Indicates that the requested operation can only operate on index objects.
     * @sample AmazonCloudDirectory.DetachFromIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachFromIndex" target="_top">AWS
     *      API Documentation</a>
     */
    DetachFromIndexResult detachFromIndex(DetachFromIndexRequest detachFromIndexRequest);

    /**
     * <p>
     * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by
     * the link name.
     * </p>
     * 
     * @param detachObjectRequest
     * @return Result of the DetachObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotNodeException
     *         Occurs when any invalid operations are performed on an object that is not a node, such as calling
     *         <code>ListObjectChildren</code> for a leaf node object.
     * @sample AmazonCloudDirectory.DetachObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachObject" target="_top">AWS
     *      API Documentation</a>
     */
    DetachObjectResult detachObject(DetachObjectRequest detachObjectRequest);

    /**
     * <p>
     * Detaches a policy from an object.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return Result of the DetachPolicy operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotPolicyException
     *         Indicates that the requested operation can only operate on policy objects.
     * @sample AmazonCloudDirectory.DetachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DetachPolicyResult detachPolicy(DetachPolicyRequest detachPolicyRequest);

    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param detachTypedLinkRequest
     * @return Result of the DetachTypedLink operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.DetachTypedLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachTypedLink" target="_top">AWS
     *      API Documentation</a>
     */
    DetachTypedLinkResult detachTypedLink(DetachTypedLinkRequest detachTypedLinkRequest);

    /**
     * <p>
     * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can
     * be disabled. Disabled directories may be reenabled.
     * </p>
     * 
     * @param disableDirectoryRequest
     * @return Result of the DisableDirectory operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws DirectoryDeletedException
     *         A directory that has been deleted and to which access has been attempted. Note: The requested resource
     *         will eventually cease to exist.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @sample AmazonCloudDirectory.DisableDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DisableDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    DisableDirectoryResult disableDirectory(DisableDirectoryRequest disableDirectoryRequest);

    /**
     * <p>
     * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then
     * be read and written to.
     * </p>
     * 
     * @param enableDirectoryRequest
     * @return Result of the EnableDirectory operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws DirectoryDeletedException
     *         A directory that has been deleted and to which access has been attempted. Note: The requested resource
     *         will eventually cease to exist.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @sample AmazonCloudDirectory.EnableDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/EnableDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    EnableDirectoryResult enableDirectory(EnableDirectoryRequest enableDirectoryRequest);

    /**
     * <p>
     * Returns current applied schema version ARN, including the minor version in use.
     * </p>
     * 
     * @param getAppliedSchemaVersionRequest
     * @return Result of the GetAppliedSchemaVersion operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.GetAppliedSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetAppliedSchemaVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetAppliedSchemaVersionResult getAppliedSchemaVersion(GetAppliedSchemaVersionRequest getAppliedSchemaVersionRequest);

    /**
     * <p>
     * Retrieves metadata about a directory.
     * </p>
     * 
     * @param getDirectoryRequest
     * @return Result of the GetDirectory operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @sample AmazonCloudDirectory.GetDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    GetDirectoryResult getDirectory(GetDirectoryRequest getDirectoryRequest);

    /**
     * <p>
     * Gets details of the <a>Facet</a>, such as facet name, attributes, <a>Rule</a>s, or <code>ObjectType</code>. You
     * can call this on all kinds of schema facets -- published, development, or applied.
     * </p>
     * 
     * @param getFacetRequest
     * @return Result of the GetFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @sample AmazonCloudDirectory.GetFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetFacet" target="_top">AWS API
     *      Documentation</a>
     */
    GetFacetResult getFacet(GetFacetRequest getFacetRequest);

    /**
     * <p>
     * Retrieves attributes that are associated with a typed link.
     * </p>
     * 
     * @param getLinkAttributesRequest
     * @return Result of the GetLinkAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.GetLinkAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetLinkAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    GetLinkAttributesResult getLinkAttributes(GetLinkAttributesRequest getLinkAttributesRequest);

    /**
     * <p>
     * Retrieves attributes within a facet that are associated with an object.
     * </p>
     * 
     * @param getObjectAttributesRequest
     * @return Result of the GetObjectAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.GetObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    GetObjectAttributesResult getObjectAttributes(GetObjectAttributesRequest getObjectAttributesRequest);

    /**
     * <p>
     * Retrieves metadata about an object.
     * </p>
     * 
     * @param getObjectInformationRequest
     * @return Result of the GetObjectInformation operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.GetObjectInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetObjectInformation"
     *      target="_top">AWS API Documentation</a>
     */
    GetObjectInformationResult getObjectInformation(GetObjectInformationRequest getObjectInformationRequest);

    /**
     * <p>
     * Retrieves a JSON representation of the schema. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_jsonformat.html#schemas_json">JSON
     * Schema Format</a> for more information.
     * </p>
     * 
     * @param getSchemaAsJsonRequest
     * @return Result of the GetSchemaAsJson operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @sample AmazonCloudDirectory.GetSchemaAsJson
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetSchemaAsJson" target="_top">AWS
     *      API Documentation</a>
     */
    GetSchemaAsJsonResult getSchemaAsJson(GetSchemaAsJsonRequest getSchemaAsJsonRequest);

    /**
     * <p>
     * Returns the identity attribute order for a specific <a>TypedLinkFacet</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param getTypedLinkFacetInformationRequest
     * @return Result of the GetTypedLinkFacetInformation operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @sample AmazonCloudDirectory.GetTypedLinkFacetInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetTypedLinkFacetInformation"
     *      target="_top">AWS API Documentation</a>
     */
    GetTypedLinkFacetInformationResult getTypedLinkFacetInformation(GetTypedLinkFacetInformationRequest getTypedLinkFacetInformationRequest);

    /**
     * <p>
     * Lists schema major versions applied to a directory. If <code>SchemaArn</code> is provided, lists the minor
     * version.
     * </p>
     * 
     * @param listAppliedSchemaArnsRequest
     * @return Result of the ListAppliedSchemaArns operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListAppliedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListAppliedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppliedSchemaArnsResult listAppliedSchemaArns(ListAppliedSchemaArnsRequest listAppliedSchemaArnsRequest);

    /**
     * <p>
     * Lists indices attached to the specified object.
     * </p>
     * 
     * @param listAttachedIndicesRequest
     * @return Result of the ListAttachedIndices operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.ListAttachedIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListAttachedIndices"
     *      target="_top">AWS API Documentation</a>
     */
    ListAttachedIndicesResult listAttachedIndices(ListAttachedIndicesRequest listAttachedIndicesRequest);

    /**
     * <p>
     * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
     * </p>
     * 
     * @param listDevelopmentSchemaArnsRequest
     * @return Result of the ListDevelopmentSchemaArns operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListDevelopmentSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListDevelopmentSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    ListDevelopmentSchemaArnsResult listDevelopmentSchemaArns(ListDevelopmentSchemaArnsRequest listDevelopmentSchemaArnsRequest);

    /**
     * <p>
     * Lists directories created within an account.
     * </p>
     * 
     * @param listDirectoriesRequest
     * @return Result of the ListDirectories operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListDirectories" target="_top">AWS
     *      API Documentation</a>
     */
    ListDirectoriesResult listDirectories(ListDirectoriesRequest listDirectoriesRequest);

    /**
     * <p>
     * Retrieves attributes attached to the facet.
     * </p>
     * 
     * @param listFacetAttributesRequest
     * @return Result of the ListFacetAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListFacetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListFacetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    ListFacetAttributesResult listFacetAttributes(ListFacetAttributesRequest listFacetAttributesRequest);

    /**
     * <p>
     * Retrieves the names of facets that exist in a schema.
     * </p>
     * 
     * @param listFacetNamesRequest
     * @return Result of the ListFacetNames operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListFacetNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListFacetNames" target="_top">AWS
     *      API Documentation</a>
     */
    ListFacetNamesResult listFacetNames(ListFacetNamesRequest listFacetNamesRequest);

    /**
     * <p>
     * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listIncomingTypedLinksRequest
     * @return Result of the ListIncomingTypedLinks operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.ListIncomingTypedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListIncomingTypedLinks"
     *      target="_top">AWS API Documentation</a>
     */
    ListIncomingTypedLinksResult listIncomingTypedLinks(ListIncomingTypedLinksRequest listIncomingTypedLinksRequest);

    /**
     * <p>
     * Lists objects attached to the specified index.
     * </p>
     * 
     * @param listIndexRequest
     * @return Result of the ListIndex operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotIndexException
     *         Indicates that the requested operation can only operate on index objects.
     * @sample AmazonCloudDirectory.ListIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListIndex" target="_top">AWS API
     *      Documentation</a>
     */
    ListIndexResult listIndex(ListIndexRequest listIndexRequest);

    /**
     * <p>
     * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the
     * minor version revisions in that family are listed instead.
     * </p>
     * 
     * @param listManagedSchemaArnsRequest
     * @return Result of the ListManagedSchemaArns operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListManagedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListManagedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    ListManagedSchemaArnsResult listManagedSchemaArns(ListManagedSchemaArnsRequest listManagedSchemaArnsRequest);

    /**
     * <p>
     * Lists all attributes that are associated with an object.
     * </p>
     * 
     * @param listObjectAttributesRequest
     * @return Result of the ListObjectAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.ListObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    ListObjectAttributesResult listObjectAttributes(ListObjectAttributesRequest listObjectAttributesRequest);

    /**
     * <p>
     * Returns a paginated list of child objects that are associated with a given object.
     * </p>
     * 
     * @param listObjectChildrenRequest
     * @return Result of the ListObjectChildren operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws NotNodeException
     *         Occurs when any invalid operations are performed on an object that is not a node, such as calling
     *         <code>ListObjectChildren</code> for a leaf node object.
     * @sample AmazonCloudDirectory.ListObjectChildren
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectChildren"
     *      target="_top">AWS API Documentation</a>
     */
    ListObjectChildrenResult listObjectChildren(ListObjectChildrenRequest listObjectChildrenRequest);

    /**
     * <p>
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
     * objects. For more information about objects, see <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html"
     * >Directory Structure</a>.
     * </p>
     * <p>
     * Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory
     * up to the requested object. The API returns the number of paths based on user-defined <code>MaxResults</code>, in
     * case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among
     * multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored
     * from the target object.
     * </p>
     * 
     * @param listObjectParentPathsRequest
     * @return Result of the ListObjectParentPaths operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.ListObjectParentPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectParentPaths"
     *      target="_top">AWS API Documentation</a>
     */
    ListObjectParentPathsResult listObjectParentPaths(ListObjectParentPathsRequest listObjectParentPathsRequest);

    /**
     * <p>
     * Lists parent objects that are associated with a given object in pagination fashion.
     * </p>
     * 
     * @param listObjectParentsRequest
     * @return Result of the ListObjectParents operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws CannotListParentOfRootException
     *         Cannot list the parents of a <a>Directory</a> root.
     * @sample AmazonCloudDirectory.ListObjectParents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectParents"
     *      target="_top">AWS API Documentation</a>
     */
    ListObjectParentsResult listObjectParents(ListObjectParentsRequest listObjectParentsRequest);

    /**
     * <p>
     * Returns policies attached to an object in pagination fashion.
     * </p>
     * 
     * @param listObjectPoliciesRequest
     * @return Result of the ListObjectPolicies operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListObjectPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListObjectPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListObjectPoliciesResult listObjectPolicies(ListObjectPoliciesRequest listObjectPoliciesRequest);

    /**
     * <p>
     * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listOutgoingTypedLinksRequest
     * @return Result of the ListOutgoingTypedLinks operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.ListOutgoingTypedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListOutgoingTypedLinks"
     *      target="_top">AWS API Documentation</a>
     */
    ListOutgoingTypedLinksResult listOutgoingTypedLinks(ListOutgoingTypedLinksRequest listOutgoingTypedLinksRequest);

    /**
     * <p>
     * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * </p>
     * 
     * @param listPolicyAttachmentsRequest
     * @return Result of the ListPolicyAttachments operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws NotPolicyException
     *         Indicates that the requested operation can only operate on policy objects.
     * @sample AmazonCloudDirectory.ListPolicyAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListPolicyAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    ListPolicyAttachmentsResult listPolicyAttachments(ListPolicyAttachmentsRequest listPolicyAttachmentsRequest);

    /**
     * <p>
     * Lists the major version families of each published schema. If a major version ARN is provided as
     * <code>SchemaArn</code>, the minor version revisions in that family are listed instead.
     * </p>
     * 
     * @param listPublishedSchemaArnsRequest
     * @return Result of the ListPublishedSchemaArns operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListPublishedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListPublishedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    ListPublishedSchemaArnsResult listPublishedSchemaArns(ListPublishedSchemaArnsRequest listPublishedSchemaArnsRequest);

    /**
     * <p>
     * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per
     * directory. All 50 tags are returned for a given directory with this API call.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidTaggingRequestException
     *         Can occur for multiple reasons such as when you tag a resource that doesn’t exist or if you specify a
     *         higher number of tags for a resource than the allowed limit. Allowed limit is 50 tags per resource.
     * @sample AmazonCloudDirectory.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a paginated list of all attribute definitions for a particular <a>TypedLinkFacet</a>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listTypedLinkFacetAttributesRequest
     * @return Result of the ListTypedLinkFacetAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListTypedLinkFacetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListTypedLinkFacetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    ListTypedLinkFacetAttributesResult listTypedLinkFacetAttributes(ListTypedLinkFacetAttributesRequest listTypedLinkFacetAttributesRequest);

    /**
     * <p>
     * Returns a paginated list of <code>TypedLink</code> facet names for a particular schema. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param listTypedLinkFacetNamesRequest
     * @return Result of the ListTypedLinkFacetNames operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @sample AmazonCloudDirectory.ListTypedLinkFacetNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListTypedLinkFacetNames"
     *      target="_top">AWS API Documentation</a>
     */
    ListTypedLinkFacetNamesResult listTypedLinkFacetNames(ListTypedLinkFacetNamesRequest listTypedLinkFacetNamesRequest);

    /**
     * <p>
     * Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     * present, an empty list is returned. If policies are present, and if some objects don't have the policies
     * attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it returns
     * <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that don't lead to the
     * root from the target object are ignored. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * 
     * @param lookupPolicyRequest
     * @return Result of the LookupPolicy operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws InvalidNextTokenException
     *         Indicates that the <code>NextToken</code> value is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.LookupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/LookupPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    LookupPolicyResult lookupPolicy(LookupPolicyRequest lookupPolicyRequest);

    /**
     * <p>
     * Publishes a development schema with a major version and a recommended minor version.
     * </p>
     * 
     * @param publishSchemaRequest
     * @return Result of the PublishSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws SchemaAlreadyPublishedException
     *         Indicates that a schema is already published.
     * @sample AmazonCloudDirectory.PublishSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PublishSchema" target="_top">AWS
     *      API Documentation</a>
     */
    PublishSchemaResult publishSchema(PublishSchemaRequest publishSchemaRequest);

    /**
     * <p>
     * Allows a schema to be updated using JSON upload. Only available for development schemas. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_jsonformat.html#schemas_json">JSON
     * Schema Format</a> for more information.
     * </p>
     * 
     * @param putSchemaFromJsonRequest
     * @return Result of the PutSchemaFromJson operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws InvalidSchemaDocException
     *         Indicates that the provided <code>SchemaDoc</code> value is not valid.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @sample AmazonCloudDirectory.PutSchemaFromJson
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PutSchemaFromJson"
     *      target="_top">AWS API Documentation</a>
     */
    PutSchemaFromJsonResult putSchemaFromJson(PutSchemaFromJsonRequest putSchemaFromJsonRequest);

    /**
     * <p>
     * Removes the specified facet from the specified object.
     * </p>
     * 
     * @param removeFacetFromObjectRequest
     * @return Result of the RemoveFacetFromObject operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.RemoveFacetFromObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/RemoveFacetFromObject"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveFacetFromObjectResult removeFacetFromObject(RemoveFacetFromObjectRequest removeFacetFromObjectRequest);

    /**
     * <p>
     * An API operation for adding tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidTaggingRequestException
     *         Can occur for multiple reasons such as when you tag a resource that doesn’t exist or if you specify a
     *         higher number of tags for a resource than the allowed limit. Allowed limit is 50 tags per resource.
     * @sample AmazonCloudDirectory.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * An API operation for removing tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidTaggingRequestException
     *         Can occur for multiple reasons such as when you tag a resource that doesn’t exist or if you specify a
     *         higher number of tags for a resource than the allowed limit. Allowed limit is 50 tags per resource.
     * @sample AmazonCloudDirectory.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Adds new <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updates existing <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes existing <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateFacetRequest
     * @return Result of the UpdateFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws InvalidFacetUpdateException
     *         An attempt to modify a <a>Facet</a> resulted in an invalid schema exception.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @sample AmazonCloudDirectory.UpdateFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateFacet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFacetResult updateFacet(UpdateFacetRequest updateFacetRequest);

    /**
     * <p>
     * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s
     * identity, as defined by its <code>IdentityAttributeOrder</code>.
     * </p>
     * 
     * @param updateLinkAttributesRequest
     * @return Result of the UpdateLinkAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.UpdateLinkAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateLinkAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLinkAttributesResult updateLinkAttributes(UpdateLinkAttributesRequest updateLinkAttributesRequest);

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @param updateObjectAttributesRequest
     * @return Result of the UpdateObjectAttributes operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws DirectoryNotEnabledException
     *         Operations are only permitted on enabled directories.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws LinkNameAlreadyInUseException
     *         Indicates that a link could not be created due to a naming conflict. Choose a different name and then try
     *         again.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @sample AmazonCloudDirectory.UpdateObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateObjectAttributesResult updateObjectAttributes(UpdateObjectAttributesRequest updateObjectAttributesRequest);

    /**
     * <p>
     * Updates the schema name with a new name. Only development schema names can be updated.
     * </p>
     * 
     * @param updateSchemaRequest
     * @return Result of the UpdateSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonCloudDirectory.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateSchema" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSchemaResult updateSchema(UpdateSchemaRequest updateSchemaRequest);

    /**
     * <p>
     * Updates a <a>TypedLinkFacet</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param updateTypedLinkFacetRequest
     * @return Result of the UpdateTypedLinkFacet operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws FacetValidationException
     *         The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.
     * @throws InvalidFacetUpdateException
     *         An attempt to modify a <a>Facet</a> resulted in an invalid schema exception.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws FacetNotFoundException
     *         The specified <a>Facet</a> could not be found.
     * @throws InvalidRuleException
     *         Occurs when any of the rule parameter keys or values are invalid.
     * @sample AmazonCloudDirectory.UpdateTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTypedLinkFacetResult updateTypedLinkFacet(UpdateTypedLinkFacetRequest updateTypedLinkFacetRequest);

    /**
     * <p>
     * Upgrades a single directory in-place using the <code>PublishedSchemaArn</code> with schema updates found in
     * <code>MinorVersion</code>. Backwards-compatible minor version upgrades are instantaneously available for readers
     * on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given
     * directory per call. To upgrade multiple directories from one schema, you would need to call this API on each
     * directory.
     * </p>
     * 
     * @param upgradeAppliedSchemaRequest
     * @return Result of the UpgradeAppliedSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws IncompatibleSchemaException
     *         Indicates a failure occurred while performing a check for backward compatibility between the specified
     *         schema and the schema that is currently applied to the directory.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws SchemaAlreadyExistsException
     *         Indicates that a schema could not be created due to a naming conflict. Please select a different name and
     *         then try again.
     * @sample AmazonCloudDirectory.UpgradeAppliedSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpgradeAppliedSchema"
     *      target="_top">AWS API Documentation</a>
     */
    UpgradeAppliedSchemaResult upgradeAppliedSchema(UpgradeAppliedSchemaRequest upgradeAppliedSchemaRequest);

    /**
     * <p>
     * Upgrades a published schema under a new minor version revision using the current contents of
     * <code>DevelopmentSchemaArn</code>.
     * </p>
     * 
     * @param upgradePublishedSchemaRequest
     * @return Result of the UpgradePublishedSchema operation returned by the service.
     * @throws InternalServiceException
     *         Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in
     *         which case you can retry your request until it succeeds. Otherwise, go to the <a
     *         href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any
     *         operational issues with the service.
     * @throws InvalidArnException
     *         Indicates that the provided ARN value is not valid.
     * @throws RetryableConflictException
     *         Occurs when a conflict with a previous successful write is detected. For example, if a write operation
     *         occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this
     *         exception may result. This generally occurs when the previous write did not have time to propagate to the
     *         host serving the current request. A retry (with appropriate backoff logic) is the recommended response to
     *         this exception.
     * @throws ValidationException
     *         Indicates that your request is malformed in some manner. See the exception message.
     * @throws IncompatibleSchemaException
     *         Indicates a failure occurred while performing a check for backward compatibility between the specified
     *         schema and the schema that is currently applied to the directory.
     * @throws AccessDeniedException
     *         Access denied. Check your permissions.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidAttachmentException
     *         Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link
     *         type that is not applicable to the nodes or attempting to apply a schema to a directory a second time.
     * @throws LimitExceededException
     *         Indicates that limits are exceeded. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Limits</a> for more
     *         information.
     * @sample AmazonCloudDirectory.UpgradePublishedSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpgradePublishedSchema"
     *      target="_top">AWS API Documentation</a>
     */
    UpgradePublishedSchemaResult upgradePublishedSchema(UpgradePublishedSchemaRequest upgradePublishedSchemaRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
