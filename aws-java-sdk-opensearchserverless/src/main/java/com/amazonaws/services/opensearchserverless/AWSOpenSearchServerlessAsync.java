/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless;

import javax.annotation.Generated;

import com.amazonaws.services.opensearchserverless.model.*;

/**
 * Interface for accessing OpenSearch Service Serverless asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opensearchserverless.AbstractAWSOpenSearchServerlessAsync} instead.
 * </p>
 * <p>
 * <p>
 * Use the Amazon OpenSearch Serverless API to create, configure, and manage OpenSearch Serverless collections and
 * security policies.
 * </p>
 * <p>
 * OpenSearch Serverless is an on-demand, pre-provisioned serverless configuration for Amazon OpenSearch Service.
 * OpenSearch Serverless removes the operational complexities of provisioning, configuring, and tuning your OpenSearch
 * clusters. It enables you to easily search and analyze petabytes of data without having to worry about the underlying
 * infrastructure and data management.
 * </p>
 * <p>
 * To learn more about OpenSearch Serverless, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html">What is Amazon
 * OpenSearch Serverless?</a>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOpenSearchServerlessAsync extends AWSOpenSearchServerless {

    /**
     * <p>
     * Returns attributes for one or more collections, including the collection endpoint and the OpenSearch Dashboards
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param batchGetCollectionRequest
     * @return A Java Future containing the result of the BatchGetCollection operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.BatchGetCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCollectionResult> batchGetCollectionAsync(BatchGetCollectionRequest batchGetCollectionRequest);

    /**
     * <p>
     * Returns attributes for one or more collections, including the collection endpoint and the OpenSearch Dashboards
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param batchGetCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetCollection operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.BatchGetCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCollectionResult> batchGetCollectionAsync(BatchGetCollectionRequest batchGetCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetCollectionRequest, BatchGetCollectionResult> asyncHandler);

    /**
     * <p>
     * Returns attributes for one or more VPC endpoints associated with the current account. For more information, see
     * <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param batchGetVpcEndpointRequest
     * @return A Java Future containing the result of the BatchGetVpcEndpoint operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.BatchGetVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetVpcEndpointResult> batchGetVpcEndpointAsync(BatchGetVpcEndpointRequest batchGetVpcEndpointRequest);

    /**
     * <p>
     * Returns attributes for one or more VPC endpoints associated with the current account. For more information, see
     * <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param batchGetVpcEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetVpcEndpoint operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.BatchGetVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetVpcEndpointResult> batchGetVpcEndpointAsync(BatchGetVpcEndpointRequest batchGetVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetVpcEndpointRequest, BatchGetVpcEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates a data access policy for OpenSearch Serverless. Access policies limit access to collections and the
     * resources within them, and allow a user to access that data irrespective of the access mechanism or network
     * source. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @return A Java Future containing the result of the CreateAccessPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.CreateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPolicyResult> createAccessPolicyAsync(CreateAccessPolicyRequest createAccessPolicyRequest);

    /**
     * <p>
     * Creates a data access policy for OpenSearch Serverless. Access policies limit access to collections and the
     * resources within them, and allow a user to access that data irrespective of the access mechanism or network
     * source. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.CreateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPolicyResult> createAccessPolicyAsync(CreateAccessPolicyRequest createAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessPolicyRequest, CreateAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a new OpenSearch Serverless collection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param createCollectionRequest
     * @return A Java Future containing the result of the CreateCollection operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.CreateCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest createCollectionRequest);

    /**
     * <p>
     * Creates a new OpenSearch Serverless collection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param createCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCollection operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.CreateCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest createCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCollectionRequest, CreateCollectionResult> asyncHandler);

    /**
     * <p>
     * Specifies a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createSecurityConfigRequest
     * @return A Java Future containing the result of the CreateSecurityConfig operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.CreateSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityConfigResult> createSecurityConfigAsync(CreateSecurityConfigRequest createSecurityConfigRequest);

    /**
     * <p>
     * Specifies a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createSecurityConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecurityConfig operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.CreateSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityConfigResult> createSecurityConfigAsync(CreateSecurityConfigRequest createSecurityConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityConfigRequest, CreateSecurityConfigResult> asyncHandler);

    /**
     * <p>
     * Creates a security policy to be used by one or more OpenSearch Serverless collections. Security policies provide
     * access to a collection and its OpenSearch Dashboards endpoint from public networks or specific VPC endpoints.
     * They also allow you to secure a collection with a KMS encryption key. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createSecurityPolicyRequest
     * @return A Java Future containing the result of the CreateSecurityPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.CreateSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityPolicyResult> createSecurityPolicyAsync(CreateSecurityPolicyRequest createSecurityPolicyRequest);

    /**
     * <p>
     * Creates a security policy to be used by one or more OpenSearch Serverless collections. Security policies provide
     * access to a collection and its OpenSearch Dashboards endpoint from public networks or specific VPC endpoints.
     * They also allow you to secure a collection with a KMS encryption key. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createSecurityPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecurityPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.CreateSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSecurityPolicyResult> createSecurityPolicyAsync(CreateSecurityPolicyRequest createSecurityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityPolicyRequest, CreateSecurityPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates an OpenSearch Serverless-managed interface VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param createVpcEndpointRequest
     * @return A Java Future containing the result of the CreateVpcEndpoint operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.CreateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest createVpcEndpointRequest);

    /**
     * <p>
     * Creates an OpenSearch Serverless-managed interface VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param createVpcEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcEndpoint operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.CreateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest createVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointRequest, CreateVpcEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @return A Java Future containing the result of the DeleteAccessPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.DeleteAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPolicyResult> deleteAccessPolicyAsync(DeleteAccessPolicyRequest deleteAccessPolicyRequest);

    /**
     * <p>
     * Deletes an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.DeleteAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPolicyResult> deleteAccessPolicyAsync(DeleteAccessPolicyRequest deleteAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPolicyRequest, DeleteAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes an OpenSearch Serverless collection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return A Java Future containing the result of the DeleteCollection operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.DeleteCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest deleteCollectionRequest);

    /**
     * <p>
     * Deletes an OpenSearch Serverless collection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCollection operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.DeleteCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest deleteCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCollectionRequest, DeleteCollectionResult> asyncHandler);

    /**
     * <p>
     * Deletes a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param deleteSecurityConfigRequest
     * @return A Java Future containing the result of the DeleteSecurityConfig operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.DeleteSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityConfigResult> deleteSecurityConfigAsync(DeleteSecurityConfigRequest deleteSecurityConfigRequest);

    /**
     * <p>
     * Deletes a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param deleteSecurityConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecurityConfig operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.DeleteSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityConfigResult> deleteSecurityConfigAsync(DeleteSecurityConfigRequest deleteSecurityConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityConfigRequest, DeleteSecurityConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes an OpenSearch Serverless security policy.
     * </p>
     * 
     * @param deleteSecurityPolicyRequest
     * @return A Java Future containing the result of the DeleteSecurityPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.DeleteSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityPolicyResult> deleteSecurityPolicyAsync(DeleteSecurityPolicyRequest deleteSecurityPolicyRequest);

    /**
     * <p>
     * Deletes an OpenSearch Serverless security policy.
     * </p>
     * 
     * @param deleteSecurityPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecurityPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.DeleteSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityPolicyResult> deleteSecurityPolicyAsync(DeleteSecurityPolicyRequest deleteSecurityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes an OpenSearch Serverless-managed interface endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param deleteVpcEndpointRequest
     * @return A Java Future containing the result of the DeleteVpcEndpoint operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.DeleteVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcEndpointResult> deleteVpcEndpointAsync(DeleteVpcEndpointRequest deleteVpcEndpointRequest);

    /**
     * <p>
     * Deletes an OpenSearch Serverless-managed interface endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param deleteVpcEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcEndpoint operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.DeleteVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcEndpointResult> deleteVpcEndpointAsync(DeleteVpcEndpointRequest deleteVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointRequest, DeleteVpcEndpointResult> asyncHandler);

    /**
     * <p>
     * Returns an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getAccessPolicyRequest
     * @return A Java Future containing the result of the GetAccessPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.GetAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPolicyResult> getAccessPolicyAsync(GetAccessPolicyRequest getAccessPolicyRequest);

    /**
     * <p>
     * Returns an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.GetAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPolicyResult> getAccessPolicyAsync(GetAccessPolicyRequest getAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPolicyRequest, GetAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns account-level settings related to OpenSearch Serverless.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Returns account-level settings related to OpenSearch Serverless.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Returns statistical information about your OpenSearch Serverless access policies, security configurations, and
     * security policies.
     * </p>
     * 
     * @param getPoliciesStatsRequest
     * @return A Java Future containing the result of the GetPoliciesStats operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.GetPoliciesStats
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetPoliciesStats"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPoliciesStatsResult> getPoliciesStatsAsync(GetPoliciesStatsRequest getPoliciesStatsRequest);

    /**
     * <p>
     * Returns statistical information about your OpenSearch Serverless access policies, security configurations, and
     * security policies.
     * </p>
     * 
     * @param getPoliciesStatsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPoliciesStats operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.GetPoliciesStats
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetPoliciesStats"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPoliciesStatsResult> getPoliciesStatsAsync(GetPoliciesStatsRequest getPoliciesStatsRequest,
            com.amazonaws.handlers.AsyncHandler<GetPoliciesStatsRequest, GetPoliciesStatsResult> asyncHandler);

    /**
     * <p>
     * Returns information about an OpenSearch Serverless security configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getSecurityConfigRequest
     * @return A Java Future containing the result of the GetSecurityConfig operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.GetSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityConfigResult> getSecurityConfigAsync(GetSecurityConfigRequest getSecurityConfigRequest);

    /**
     * <p>
     * Returns information about an OpenSearch Serverless security configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getSecurityConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSecurityConfig operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.GetSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityConfigResult> getSecurityConfigAsync(GetSecurityConfigRequest getSecurityConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetSecurityConfigRequest, GetSecurityConfigResult> asyncHandler);

    /**
     * <p>
     * Returns information about a configured OpenSearch Serverless security policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getSecurityPolicyRequest
     * @return A Java Future containing the result of the GetSecurityPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.GetSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityPolicyResult> getSecurityPolicyAsync(GetSecurityPolicyRequest getSecurityPolicyRequest);

    /**
     * <p>
     * Returns information about a configured OpenSearch Serverless security policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getSecurityPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSecurityPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.GetSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityPolicyResult> getSecurityPolicyAsync(GetSecurityPolicyRequest getSecurityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetSecurityPolicyRequest, GetSecurityPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns information about a list of OpenSearch Serverless access policies.
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return A Java Future containing the result of the ListAccessPolicies operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListAccessPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(ListAccessPoliciesRequest listAccessPoliciesRequest);

    /**
     * <p>
     * Returns information about a list of OpenSearch Serverless access policies.
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessPolicies operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListAccessPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(ListAccessPoliciesRequest listAccessPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessPoliciesRequest, ListAccessPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists all OpenSearch Serverless collections. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * <note>
     * <p>
     * Make sure to include an empty request body {} if you don't include any collection filters in the request.
     * </p>
     * </note>
     * 
     * @param listCollectionsRequest
     * @return A Java Future containing the result of the ListCollections operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.ListCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListCollections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest listCollectionsRequest);

    /**
     * <p>
     * Lists all OpenSearch Serverless collections. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * <note>
     * <p>
     * Make sure to include an empty request body {} if you don't include any collection filters in the request.
     * </p>
     * </note>
     * 
     * @param listCollectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollections operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.ListCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListCollections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest listCollectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollectionsRequest, ListCollectionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about configured OpenSearch Serverless security configurations. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param listSecurityConfigsRequest
     * @return A Java Future containing the result of the ListSecurityConfigs operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.ListSecurityConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityConfigsResult> listSecurityConfigsAsync(ListSecurityConfigsRequest listSecurityConfigsRequest);

    /**
     * <p>
     * Returns information about configured OpenSearch Serverless security configurations. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param listSecurityConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityConfigs operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.ListSecurityConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityConfigsResult> listSecurityConfigsAsync(ListSecurityConfigsRequest listSecurityConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityConfigsRequest, ListSecurityConfigsResult> asyncHandler);

    /**
     * <p>
     * Returns information about configured OpenSearch Serverless security policies.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @return A Java Future containing the result of the ListSecurityPolicies operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityPoliciesResult> listSecurityPoliciesAsync(ListSecurityPoliciesRequest listSecurityPoliciesRequest);

    /**
     * <p>
     * Returns information about configured OpenSearch Serverless security policies.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityPolicies operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityPoliciesResult> listSecurityPoliciesAsync(ListSecurityPoliciesRequest listSecurityPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityPoliciesRequest, ListSecurityPoliciesResult> asyncHandler);

    /**
     * <p>
     * Returns the tags for an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns the tags for an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns the OpenSearch Serverless-managed interface VPC endpoints associated with the current account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param listVpcEndpointsRequest
     * @return A Java Future containing the result of the ListVpcEndpoints operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.ListVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListVpcEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVpcEndpointsResult> listVpcEndpointsAsync(ListVpcEndpointsRequest listVpcEndpointsRequest);

    /**
     * <p>
     * Returns the OpenSearch Serverless-managed interface VPC endpoints associated with the current account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param listVpcEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVpcEndpoints operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.ListVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListVpcEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVpcEndpointsResult> listVpcEndpointsAsync(ListVpcEndpointsRequest listVpcEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVpcEndpointsRequest, ListVpcEndpointsResult> asyncHandler);

    /**
     * <p>
     * Associates tags with an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates tags with an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag or set of tags from an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag or set of tags from an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @return A Java Future containing the result of the UpdateAccessPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.UpdateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessPolicyResult> updateAccessPolicyAsync(UpdateAccessPolicyRequest updateAccessPolicyRequest);

    /**
     * <p>
     * Updates an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccessPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.UpdateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessPolicyResult> updateAccessPolicyAsync(UpdateAccessPolicyRequest updateAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessPolicyRequest, UpdateAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Update the OpenSearch Serverless settings for the current Amazon Web Services account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-scaling"
     * >Autoscaling</a>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Update the OpenSearch Serverless settings for the current Amazon Web Services account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-scaling"
     * >Autoscaling</a>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates an OpenSearch Serverless collection.
     * </p>
     * 
     * @param updateCollectionRequest
     * @return A Java Future containing the result of the UpdateCollection operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.UpdateCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCollectionResult> updateCollectionAsync(UpdateCollectionRequest updateCollectionRequest);

    /**
     * <p>
     * Updates an OpenSearch Serverless collection.
     * </p>
     * 
     * @param updateCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCollection operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.UpdateCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCollectionResult> updateCollectionAsync(UpdateCollectionRequest updateCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCollectionRequest, UpdateCollectionResult> asyncHandler);

    /**
     * <p>
     * Updates a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateSecurityConfigRequest
     * @return A Java Future containing the result of the UpdateSecurityConfig operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.UpdateSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityConfigResult> updateSecurityConfigAsync(UpdateSecurityConfigRequest updateSecurityConfigRequest);

    /**
     * <p>
     * Updates a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateSecurityConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityConfig operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.UpdateSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityConfigResult> updateSecurityConfigAsync(UpdateSecurityConfigRequest updateSecurityConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityConfigRequest, UpdateSecurityConfigResult> asyncHandler);

    /**
     * <p>
     * Updates an OpenSearch Serverless security policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateSecurityPolicyRequest
     * @return A Java Future containing the result of the UpdateSecurityPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.UpdateSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityPolicyResult> updateSecurityPolicyAsync(UpdateSecurityPolicyRequest updateSecurityPolicyRequest);

    /**
     * <p>
     * Updates an OpenSearch Serverless security policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html">Network
     * access for Amazon OpenSearch Serverless</a> and <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html">Encryption
     * at rest for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateSecurityPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityPolicy operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.UpdateSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityPolicyResult> updateSecurityPolicyAsync(UpdateSecurityPolicyRequest updateSecurityPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResult> asyncHandler);

    /**
     * <p>
     * Updates an OpenSearch Serverless-managed interface endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param updateVpcEndpointRequest
     * @return A Java Future containing the result of the UpdateVpcEndpoint operation returned by the service.
     * @sample AWSOpenSearchServerlessAsync.UpdateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVpcEndpointResult> updateVpcEndpointAsync(UpdateVpcEndpointRequest updateVpcEndpointRequest);

    /**
     * <p>
     * Updates an OpenSearch Serverless-managed interface endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param updateVpcEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVpcEndpoint operation returned by the service.
     * @sample AWSOpenSearchServerlessAsyncHandler.UpdateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVpcEndpointResult> updateVpcEndpointAsync(UpdateVpcEndpointRequest updateVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVpcEndpointRequest, UpdateVpcEndpointResult> asyncHandler);

}
