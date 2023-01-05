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
package com.amazonaws.services.recyclebin;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.recyclebin.model.*;

/**
 * Interface for accessing Amazon Recycle Bin.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.recyclebin.AbstractAmazonRecycleBin} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Recycle Bin API Reference</i>. This documentation provides descriptions and syntax for each of the
 * actions and data types in Recycle Bin.
 * </p>
 * <p>
 * Recycle Bin is a resource recovery feature that enables you to restore accidentally deleted snapshots and EBS-backed
 * AMIs. When using Recycle Bin, if your resources are deleted, they are retained in the Recycle Bin for a time period
 * that you specify.
 * </p>
 * <p>
 * You can restore a resource from the Recycle Bin at any time before its retention period expires. After you restore a
 * resource from the Recycle Bin, the resource is removed from the Recycle Bin, and you can then use it in the same way
 * you use any other resource of that type in your account. If the retention period expires and the resource is not
 * restored, the resource is permanently deleted from the Recycle Bin and is no longer available for recovery. For more
 * information about Recycle Bin, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-recycle-bin.html"> Recycle Bin</a> in the
 * <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRecycleBin {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "rbin";

    /**
     * <p>
     * Creates a Recycle Bin retention rule. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-create-rule"
     * > Create Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota for the number of tags per resource to be exceeded.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @sample AmazonRecycleBin.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRuleResult createRule(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Deletes a Recycle Bin retention rule. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-delete-rule"
     * > Delete Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws ConflictException
     *         The specified retention rule lock request can't be completed.
     * @sample AmazonRecycleBin.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Gets information about a Recycle Bin retention rule.
     * </p>
     * 
     * @param getRuleRequest
     * @return Result of the GetRule operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonRecycleBin.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    GetRuleResult getRule(GetRuleRequest getRuleRequest);

    /**
     * <p>
     * Lists the Recycle Bin retention rules in the Region.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @sample AmazonRecycleBin.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists the tags assigned to a retention rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonRecycleBin.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Locks a retention rule. A locked retention rule can't be modified or deleted.
     * </p>
     * 
     * @param lockRuleRequest
     * @return Result of the LockRule operation returned by the service.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws ConflictException
     *         The specified retention rule lock request can't be completed.
     * @sample AmazonRecycleBin.LockRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/LockRule" target="_top">AWS API
     *      Documentation</a>
     */
    LockRuleResult lockRule(LockRuleRequest lockRuleRequest);

    /**
     * <p>
     * Assigns tags to the specified retention rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota for the number of tags per resource to be exceeded.
     * @sample AmazonRecycleBin.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Unlocks a retention rule. After a retention rule is unlocked, it can be modified or deleted only after the unlock
     * delay period expires.
     * </p>
     * 
     * @param unlockRuleRequest
     * @return Result of the UnlockRule operation returned by the service.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws ConflictException
     *         The specified retention rule lock request can't be completed.
     * @sample AmazonRecycleBin.UnlockRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UnlockRule" target="_top">AWS API
     *      Documentation</a>
     */
    UnlockRuleResult unlockRule(UnlockRuleRequest unlockRuleRequest);

    /**
     * <p>
     * Unassigns a tag from a retention rule.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonRecycleBin.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing Recycle Bin retention rule. You can update a retention rule's description, resource tags, and
     * retention period at any time after creation. You can't update a retention rule's resource type after creation.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-update-rule"
     * > Update Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return Result of the UpdateRule operation returned by the service.
     * @throws ValidationException
     *         One or more of the parameters in the request is not valid.
     * @throws InternalServerException
     *         The service could not respond to the request due to an internal problem.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConflictException
     *         The specified retention rule lock request can't be completed.
     * @sample AmazonRecycleBin.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRuleResult updateRule(UpdateRuleRequest updateRuleRequest);

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
