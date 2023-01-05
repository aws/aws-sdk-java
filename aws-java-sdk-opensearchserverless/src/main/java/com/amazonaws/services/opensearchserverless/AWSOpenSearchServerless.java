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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.opensearchserverless.model.*;

/**
 * Interface for accessing OpenSearch Service Serverless.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opensearchserverless.AbstractAWSOpenSearchServerless} instead.
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
public interface AWSOpenSearchServerless {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "aoss";

    /**
     * <p>
     * Returns attributes for one or more collections, including the collection endpoint and the OpenSearch Dashboards
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param batchGetCollectionRequest
     * @return Result of the BatchGetCollection operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.BatchGetCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetCollection"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetCollectionResult batchGetCollection(BatchGetCollectionRequest batchGetCollectionRequest);

    /**
     * <p>
     * Returns attributes for one or more VPC endpoints associated with the current account. For more information, see
     * <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param batchGetVpcEndpointRequest
     * @return Result of the BatchGetVpcEndpoint operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.BatchGetVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetVpcEndpointResult batchGetVpcEndpoint(BatchGetVpcEndpointRequest batchGetVpcEndpointRequest);

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
     * @return Result of the CreateAccessPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAccessPolicyResult createAccessPolicy(CreateAccessPolicyRequest createAccessPolicyRequest);

    /**
     * <p>
     * Creates a new OpenSearch Serverless collection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param createCollectionRequest
     * @return Result of the CreateCollection operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateCollection"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCollectionResult createCollection(CreateCollectionRequest createCollectionRequest);

    /**
     * <p>
     * Specifies a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param createSecurityConfigRequest
     * @return Result of the CreateSecurityConfig operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSecurityConfigResult createSecurityConfig(CreateSecurityConfigRequest createSecurityConfigRequest);

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
     * @return Result of the CreateSecurityPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSecurityPolicyResult createSecurityPolicy(CreateSecurityPolicyRequest createSecurityPolicyRequest);

    /**
     * <p>
     * Creates an OpenSearch Serverless-managed interface VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param createVpcEndpointRequest
     * @return Result of the CreateVpcEndpoint operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.CreateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest createVpcEndpointRequest);

    /**
     * <p>
     * Deletes an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @return Result of the DeleteAccessPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAccessPolicyResult deleteAccessPolicy(DeleteAccessPolicyRequest deleteAccessPolicyRequest);

    /**
     * <p>
     * Deletes an OpenSearch Serverless collection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html">Creating and
     * managing Amazon OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return Result of the DeleteCollection operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteCollection"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCollectionResult deleteCollection(DeleteCollectionRequest deleteCollectionRequest);

    /**
     * <p>
     * Deletes a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param deleteSecurityConfigRequest
     * @return Result of the DeleteSecurityConfig operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSecurityConfigResult deleteSecurityConfig(DeleteSecurityConfigRequest deleteSecurityConfigRequest);

    /**
     * <p>
     * Deletes an OpenSearch Serverless security policy.
     * </p>
     * 
     * @param deleteSecurityPolicyRequest
     * @return Result of the DeleteSecurityPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSecurityPolicyResult deleteSecurityPolicy(DeleteSecurityPolicyRequest deleteSecurityPolicyRequest);

    /**
     * <p>
     * Deletes an OpenSearch Serverless-managed interface endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param deleteVpcEndpointRequest
     * @return Result of the DeleteVpcEndpoint operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.DeleteVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/DeleteVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVpcEndpointResult deleteVpcEndpoint(DeleteVpcEndpointRequest deleteVpcEndpointRequest);

    /**
     * <p>
     * Returns an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getAccessPolicyRequest
     * @return Result of the GetAccessPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.GetAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetAccessPolicyResult getAccessPolicy(GetAccessPolicyRequest getAccessPolicyRequest);

    /**
     * <p>
     * Returns account-level settings related to OpenSearch Serverless.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Returns statistical information about your OpenSearch Serverless access policies, security configurations, and
     * security policies.
     * </p>
     * 
     * @param getPoliciesStatsRequest
     * @return Result of the GetPoliciesStats operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @sample AWSOpenSearchServerless.GetPoliciesStats
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetPoliciesStats"
     *      target="_top">AWS API Documentation</a>
     */
    GetPoliciesStatsResult getPoliciesStats(GetPoliciesStatsRequest getPoliciesStatsRequest);

    /**
     * <p>
     * Returns information about an OpenSearch Serverless security configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param getSecurityConfigRequest
     * @return Result of the GetSecurityConfig operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.GetSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetSecurityConfigResult getSecurityConfig(GetSecurityConfigRequest getSecurityConfigRequest);

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
     * @return Result of the GetSecurityPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.GetSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/GetSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetSecurityPolicyResult getSecurityPolicy(GetSecurityPolicyRequest getSecurityPolicyRequest);

    /**
     * <p>
     * Returns information about a list of OpenSearch Serverless access policies.
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return Result of the ListAccessPolicies operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListAccessPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccessPoliciesResult listAccessPolicies(ListAccessPoliciesRequest listAccessPoliciesRequest);

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
     * @return Result of the ListCollections operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListCollections"
     *      target="_top">AWS API Documentation</a>
     */
    ListCollectionsResult listCollections(ListCollectionsRequest listCollectionsRequest);

    /**
     * <p>
     * Returns information about configured OpenSearch Serverless security configurations. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param listSecurityConfigsRequest
     * @return Result of the ListSecurityConfigs operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListSecurityConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListSecurityConfigsResult listSecurityConfigs(ListSecurityConfigsRequest listSecurityConfigsRequest);

    /**
     * <p>
     * Returns information about configured OpenSearch Serverless security policies.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @return Result of the ListSecurityPolicies operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListSecurityPoliciesResult listSecurityPolicies(ListSecurityPoliciesRequest listSecurityPoliciesRequest);

    /**
     * <p>
     * Returns the tags for an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns the OpenSearch Serverless-managed interface VPC endpoints associated with the current account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param listVpcEndpointsRequest
     * @return Result of the ListVpcEndpoints operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.ListVpcEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListVpcEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    ListVpcEndpointsResult listVpcEndpoints(ListVpcEndpointsRequest listVpcEndpointsRequest);

    /**
     * <p>
     * Associates tags with an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag or set of tags from an OpenSearch Serverless resource. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/tag-collection.html">Tagging Amazon
     * OpenSearch Serverless collections</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an OpenSearch Serverless access policy. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html">Data
     * access control for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @return Result of the UpdateAccessPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccessPolicyResult updateAccessPolicy(UpdateAccessPolicyRequest updateAccessPolicyRequest);

    /**
     * <p>
     * Update the OpenSearch Serverless settings for the current Amazon Web Services account. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-scaling"
     * >Autoscaling</a>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Updates an OpenSearch Serverless collection.
     * </p>
     * 
     * @param updateCollectionRequest
     * @return Result of the UpdateCollection operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateCollection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCollectionResult updateCollection(UpdateCollectionRequest updateCollectionRequest);

    /**
     * <p>
     * Updates a security configuration for OpenSearch Serverless. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html">SAML
     * authentication for Amazon OpenSearch Serverless</a>.
     * </p>
     * 
     * @param updateSecurityConfigRequest
     * @return Result of the UpdateSecurityConfig operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateSecurityConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSecurityConfigResult updateSecurityConfig(UpdateSecurityConfigRequest updateSecurityConfigRequest);

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
     * @return Result of the UpdateSecurityPolicy operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ResourceNotFoundException
     *         Thrown when accessing or deleting a resource that does not exist.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSecurityPolicyResult updateSecurityPolicy(UpdateSecurityPolicyRequest updateSecurityPolicyRequest);

    /**
     * <p>
     * Updates an OpenSearch Serverless-managed interface endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html">Access Amazon
     * OpenSearch Serverless using an interface endpoint</a>.
     * </p>
     * 
     * @param updateVpcEndpointRequest
     * @return Result of the UpdateVpcEndpoint operation returned by the service.
     * @throws InternalServerException
     *         Thrown when an error internal to the service occurs while processing a request.
     * @throws ConflictException
     *         When creating a collection, thrown when a collection with the same name already exists or is being
     *         created. When deleting a collection, thrown when the collection is not in the ACTIVE or FAILED state.
     * @throws ValidationException
     *         Thrown when the HTTP request contains invalid input or is missing required input.
     * @sample AWSOpenSearchServerless.UpdateVpcEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateVpcEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVpcEndpointResult updateVpcEndpoint(UpdateVpcEndpointRequest updateVpcEndpointRequest);

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
