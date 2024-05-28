/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurusecurity;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codegurusecurity.model.*;

/**
 * Interface for accessing Amazon CodeGuru Security.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codegurusecurity.AbstractAmazonCodeGuruSecurity} instead.
 * </p>
 * <p>
 * <note>
 * <p>
 * Amazon CodeGuru Security is in preview release and is subject to change.
 * </p>
 * </note>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Security API operations. CodeGuru Security is a service
 * that uses program analysis and machine learning to detect security policy violations and vulnerabilities, and
 * recommends ways to address these security risks.
 * </p>
 * <p>
 * By proactively detecting and providing recommendations for addressing security risks, CodeGuru Security improves the
 * overall security of your application code. For more information about CodeGuru Security, see the <a
 * href="https://docs.aws.amazon.com/codeguru/latest/security-ug/what-is-codeguru-security.html">Amazon CodeGuru
 * Security User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCodeGuruSecurity {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codeguru-security";

    /**
     * <p>
     * Returns a list of all requested findings.
     * </p>
     * 
     * @param batchGetFindingsRequest
     * @return Result of the BatchGetFindings operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.BatchGetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/BatchGetFindings"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetFindingsResult batchGetFindings(BatchGetFindingsRequest batchGetFindingsRequest);

    /**
     * <p>
     * Use to create a scan using code uploaded to an S3 bucket.
     * </p>
     * 
     * @param createScanRequest
     * @return Result of the CreateScan operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.CreateScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateScan" target="_top">AWS
     *      API Documentation</a>
     */
    CreateScanResult createScan(CreateScanRequest createScanRequest);

    /**
     * <p>
     * Generates a pre-signed URL and request headers used to upload a code resource.
     * </p>
     * <p>
     * You can upload your code resource to the URL and add the request headers using any HTTP client.
     * </p>
     * 
     * @param createUploadUrlRequest
     * @return Result of the CreateUploadUrl operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.CreateUploadUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateUploadUrl"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUploadUrlResult createUploadUrl(CreateUploadUrlRequest createUploadUrlRequest);

    /**
     * <p>
     * Use to get account level configuration.
     * </p>
     * 
     * @param getAccountConfigurationRequest
     * @return Result of the GetAccountConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.GetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetAccountConfigurationResult getAccountConfiguration(GetAccountConfigurationRequest getAccountConfigurationRequest);

    /**
     * <p>
     * Returns a list of all findings generated by a particular scan.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetFindings" target="_top">AWS
     *      API Documentation</a>
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Returns top level metrics about an account from a specified date, including number of open findings, the
     * categories with most findings, the scans with most open findings, and scans with most open critical findings.
     * </p>
     * 
     * @param getMetricsSummaryRequest
     * @return Result of the GetMetricsSummary operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.GetMetricsSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetMetricsSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetMetricsSummaryResult getMetricsSummary(GetMetricsSummaryRequest getMetricsSummaryRequest);

    /**
     * <p>
     * Returns details about a scan, including whether or not a scan has completed.
     * </p>
     * 
     * @param getScanRequest
     * @return Result of the GetScan operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.GetScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetScan" target="_top">AWS API
     *      Documentation</a>
     */
    GetScanResult getScan(GetScanRequest getScanRequest);

    /**
     * <p>
     * Returns metrics about all findings in an account within a specified time range.
     * </p>
     * 
     * @param listFindingsMetricsRequest
     * @return Result of the ListFindingsMetrics operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.ListFindingsMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListFindingsMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    ListFindingsMetricsResult listFindingsMetrics(ListFindingsMetricsRequest listFindingsMetricsRequest);

    /**
     * <p>
     * Returns a list of all the standard scans in an account. Does not return express scans.
     * </p>
     * 
     * @param listScansRequest
     * @return Result of the ListScans operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.ListScans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListScans" target="_top">AWS
     *      API Documentation</a>
     */
    ListScansResult listScans(ListScansRequest listScansRequest);

    /**
     * <p>
     * Returns a list of all tags associated with a scan.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Use to add one or more tags to an existing scan.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Use to remove one or more tags from an existing scan.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Use to update account-level configuration with an encryption key.
     * </p>
     * 
     * @param updateAccountConfigurationRequest
     * @return Result of the UpdateAccountConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.UpdateAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/UpdateAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccountConfigurationResult updateAccountConfiguration(UpdateAccountConfigurationRequest updateAccountConfigurationRequest);

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
