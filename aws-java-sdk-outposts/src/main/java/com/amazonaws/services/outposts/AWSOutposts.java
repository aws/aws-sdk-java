/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.outposts;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.outposts.model.*;

/**
 * Interface for accessing Outposts.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.outposts.AbstractAWSOutposts} instead.
 * </p>
 * <p>
 * <p>
 * AWS Outposts is a fully-managed service that extends AWS infrastructure, APIs, and tools to customer premises. By
 * providing local access to AWS-managed infrastructure, AWS Outposts enables customers to build and run applications on
 * premises using the same programming interfaces as in AWS Regions, while using local compute and storage resources for
 * lower latency and local data processing needs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOutposts {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "outposts";

    /**
     * <p>
     * Creates an Outpost.
     * </p>
     * 
     * @param createOutpostRequest
     * @return Result of the CreateOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ServiceQuotaExceededException
     *         You have exceeded a service quota.
     * @sample AWSOutposts.CreateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    CreateOutpostResult createOutpost(CreateOutpostRequest createOutpostRequest);

    /**
     * <p>
     * Deletes the Outpost.
     * </p>
     * 
     * @param deleteOutpostRequest
     * @return Result of the DeleteOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.DeleteOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteOutpostResult deleteOutpost(DeleteOutpostRequest deleteOutpostRequest);

    /**
     * <p>
     * Deletes the site.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return Result of the DeleteSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSiteResult deleteSite(DeleteSiteRequest deleteSiteRequest);

    /**
     * <p>
     * Gets information about the specified Outpost.
     * </p>
     * 
     * @param getOutpostRequest
     * @return Result of the GetOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    GetOutpostResult getOutpost(GetOutpostRequest getOutpostRequest);

    /**
     * <p>
     * Lists the instance types for the specified Outpost.
     * </p>
     * 
     * @param getOutpostInstanceTypesRequest
     * @return Result of the GetOutpostInstanceTypes operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetOutpostInstanceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpostInstanceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    GetOutpostInstanceTypesResult getOutpostInstanceTypes(GetOutpostInstanceTypesRequest getOutpostInstanceTypesRequest);

    /**
     * <p>
     * List the Outposts for your AWS account.
     * </p>
     * 
     * @param listOutpostsRequest
     * @return Result of the ListOutposts operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListOutposts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOutposts" target="_top">AWS API
     *      Documentation</a>
     */
    ListOutpostsResult listOutposts(ListOutpostsRequest listOutpostsRequest);

    /**
     * <p>
     * Lists the sites for the specified AWS account.
     * </p>
     * 
     * @param listSitesRequest
     * @return Result of the ListSites operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    ListSitesResult listSites(ListSitesRequest listSitesRequest);

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
