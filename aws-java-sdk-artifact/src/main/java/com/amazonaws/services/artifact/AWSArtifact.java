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
package com.amazonaws.services.artifact;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.artifact.model.*;

/**
 * Interface for accessing AWS Artifact.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.artifact.AbstractAWSArtifact} instead.
 * </p>
 * <p>
 * <p>
 * This reference provides descriptions of the low-level AWS Artifact Service API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSArtifact {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "artifact";

    /**
     * <p>
     * Get the account settings for Artifact.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Request to create/modify content would result in a conflict.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Get the content for a single report.
     * </p>
     * 
     * @param getReportRequest
     * @return Result of the GetReport operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Request to create/modify content would result in a conflict.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.GetReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReport" target="_top">AWS API
     *      Documentation</a>
     */
    GetReportResult getReport(GetReportRequest getReportRequest);

    /**
     * <p>
     * Get the metadata for a single report.
     * </p>
     * 
     * @param getReportMetadataRequest
     * @return Result of the GetReportMetadata operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.GetReportMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReportMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    GetReportMetadataResult getReportMetadata(GetReportMetadataRequest getReportMetadataRequest);

    /**
     * <p>
     * Get the Term content associated with a single report.
     * </p>
     * 
     * @param getTermForReportRequest
     * @return Result of the GetTermForReport operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Request to create/modify content would result in a conflict.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.GetTermForReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetTermForReport" target="_top">AWS API
     *      Documentation</a>
     */
    GetTermForReportResult getTermForReport(GetTermForReportRequest getTermForReportRequest);

    /**
     * <p>
     * List available reports.
     * </p>
     * 
     * @param listReportsRequest
     * @return Result of the ListReports operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.ListReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/ListReports" target="_top">AWS API
     *      Documentation</a>
     */
    ListReportsResult listReports(ListReportsRequest listReportsRequest);

    /**
     * <p>
     * Put the account settings for Artifact.
     * </p>
     * 
     * @param putAccountSettingsRequest
     * @return Result of the PutAccountSettings operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ConflictException
     *         Request to create/modify content would result in a conflict.
     * @throws InternalServerException
     *         An unknown server exception has occurred.
     * @throws ValidationException
     *         Request fails to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AWSArtifact.PutAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/PutAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    PutAccountSettingsResult putAccountSettings(PutAccountSettingsRequest putAccountSettingsRequest);

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
