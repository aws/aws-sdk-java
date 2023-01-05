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

import com.amazonaws.services.recyclebin.model.*;

/**
 * Interface for accessing Amazon Recycle Bin asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.recyclebin.AbstractAmazonRecycleBinAsync} instead.
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
public interface AmazonRecycleBinAsync extends AmazonRecycleBin {

    /**
     * <p>
     * Creates a Recycle Bin retention rule. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-create-rule"
     * > Create Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonRecycleBinAsync.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a Recycle Bin retention rule. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-create-rule"
     * > Create Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a Recycle Bin retention rule. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-delete-rule"
     * > Delete Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonRecycleBinAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes a Recycle Bin retention rule. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/recycle-bin-working-with-rules.html#recycle-bin-delete-rule"
     * > Delete Recycle Bin retention rules</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * Gets information about a Recycle Bin retention rule.
     * </p>
     * 
     * @param getRuleRequest
     * @return A Java Future containing the result of the GetRule operation returned by the service.
     * @sample AmazonRecycleBinAsync.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest getRuleRequest);

    /**
     * <p>
     * Gets information about a Recycle Bin retention rule.
     * </p>
     * 
     * @param getRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRule operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest getRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetRuleRequest, GetRuleResult> asyncHandler);

    /**
     * <p>
     * Lists the Recycle Bin retention rules in the Region.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonRecycleBinAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists the Recycle Bin retention rules in the Region.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags assigned to a retention rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRecycleBinAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags assigned to a retention rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Locks a retention rule. A locked retention rule can't be modified or deleted.
     * </p>
     * 
     * @param lockRuleRequest
     * @return A Java Future containing the result of the LockRule operation returned by the service.
     * @sample AmazonRecycleBinAsync.LockRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/LockRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LockRuleResult> lockRuleAsync(LockRuleRequest lockRuleRequest);

    /**
     * <p>
     * Locks a retention rule. A locked retention rule can't be modified or deleted.
     * </p>
     * 
     * @param lockRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LockRule operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.LockRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/LockRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LockRuleResult> lockRuleAsync(LockRuleRequest lockRuleRequest,
            com.amazonaws.handlers.AsyncHandler<LockRuleRequest, LockRuleResult> asyncHandler);

    /**
     * <p>
     * Assigns tags to the specified retention rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonRecycleBinAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns tags to the specified retention rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Unlocks a retention rule. After a retention rule is unlocked, it can be modified or deleted only after the unlock
     * delay period expires.
     * </p>
     * 
     * @param unlockRuleRequest
     * @return A Java Future containing the result of the UnlockRule operation returned by the service.
     * @sample AmazonRecycleBinAsync.UnlockRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UnlockRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnlockRuleResult> unlockRuleAsync(UnlockRuleRequest unlockRuleRequest);

    /**
     * <p>
     * Unlocks a retention rule. After a retention rule is unlocked, it can be modified or deleted only after the unlock
     * delay period expires.
     * </p>
     * 
     * @param unlockRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnlockRule operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.UnlockRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UnlockRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnlockRuleResult> unlockRuleAsync(UnlockRuleRequest unlockRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UnlockRuleRequest, UnlockRuleResult> asyncHandler);

    /**
     * <p>
     * Unassigns a tag from a retention rule.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonRecycleBinAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Unassigns a tag from a retention rule.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AmazonRecycleBinAsync.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AmazonRecycleBinAsyncHandler.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler);

}
