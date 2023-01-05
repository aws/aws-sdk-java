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
package com.amazonaws.services.synthetics;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.synthetics.model.*;

/**
 * Interface for accessing Synthetics.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.synthetics.AbstractAWSSynthetics} instead.
 * </p>
 * <p>
 * <fullname>Amazon CloudWatch Synthetics</fullname>
 * <p>
 * You can use Amazon CloudWatch Synthetics to continually monitor your services. You can create and manage
 * <i>canaries</i>, which are modular, lightweight scripts that monitor your endpoints and APIs from the outside-in. You
 * can set up your canaries to run 24 hours a day, once per minute. The canaries help you check the availability and
 * latency of your web services and troubleshoot anomalies by investigating load time data, screenshots of the UI, logs,
 * and metrics. The canaries seamlessly integrate with CloudWatch ServiceLens to help you trace the causes of impacted
 * nodes in your applications. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ServiceLens.html">Using ServiceLens to Monitor
 * the Health of Your Applications</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * <p>
 * Before you create and manage canaries, be aware of the security considerations. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
 * Considerations for Synthetics Canaries</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSynthetics {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "synthetics";

    /**
     * <p>
     * Associates a canary with a group. Using groups can help you with managing and automating your canaries, and you
     * can also view aggregated run results and statistics for all canaries in a group.
     * </p>
     * <p>
     * You must run this operation in the Region where the canary exists.
     * </p>
     * 
     * @param associateResourceRequest
     * @return Result of the AssociateResource operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws ServiceQuotaExceededException
     *         The request exceeded a service quota value.
     * @sample AWSSynthetics.AssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/AssociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateResourceResult associateResource(AssociateResourceRequest associateResourceRequest);

    /**
     * <p>
     * Creates a canary. Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help
     * you check the availability and latency of your web services and troubleshoot anomalies by investigating load time
     * data, screenshots of the UI, logs, and metrics. You can set up a canary to run continuously or just once.
     * </p>
     * <p>
     * Do not use <code>CreateCanary</code> to modify an existing canary. Use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_UpdateCanary.html">UpdateCanary</a>
     * instead.
     * </p>
     * <p>
     * To create canaries, you must have the <code>CloudWatchSyntheticsFullAccess</code> policy. If you are creating a
     * new IAM role for the canary, you also need the <code>iam:CreateRole</code>, <code>iam:CreatePolicy</code> and
     * <code>iam:AttachRolePolicy</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles"
     * >Necessary Roles and Permissions</a>.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names. The canary name makes up part of the
     * Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls over the internet. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
     * Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @param createCanaryRequest
     * @return Result of the CreateCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws RequestEntityTooLargeException
     *         One of the input resources is larger than is allowed.
     * @sample AWSSynthetics.CreateCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateCanary" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCanaryResult createCanary(CreateCanaryRequest createCanaryRequest);

    /**
     * <p>
     * Creates a group which you can use to associate canaries with each other, including cross-Region canaries. Using
     * groups can help you with managing and automating your canaries, and you can also view aggregated run results and
     * statistics for all canaries in a group.
     * </p>
     * <p>
     * Groups are global resources. When you create a group, it is replicated across Amazon Web Services Regions, and
     * you can view it and add canaries to it from any Region. Although the group ARN format reflects the Region name
     * where it was created, a group is not constrained to any Region. This means that you can put canaries from
     * multiple Regions into the same group, and then use that group to view and manage all of those canaries in a
     * single view.
     * </p>
     * <p>
     * Groups are supported in all Regions except the Regions that are disabled by default. For more information about
     * these Regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a Region</a>.
     * </p>
     * <p>
     * Each group can contain as many as 10 canaries. You can have as many as 20 groups in your account. Any single
     * canary can be a member of up to 10 groups.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws ServiceQuotaExceededException
     *         The request exceeded a service quota value.
     * @sample AWSSynthetics.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Permanently deletes the specified canary.
     * </p>
     * <p>
     * If you specify <code>DeleteLambda</code> to <code>true</code>, CloudWatch Synthetics also deletes the Lambda
     * functions and layers that are used by the canary.
     * </p>
     * <p>
     * Other resources used and created by the canary are not automatically deleted. After you delete a canary that you
     * do not intend to use again, you should also delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The CloudWatch alarms created for this canary. These alarms have a name of
     * <code>Synthetics-SharpDrop-Alarm-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon S3 objects and buckets, such as the canary's artifact location.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM roles created for the canary. If they were created in the console, these roles have the name
     * <code> role/service-role/CloudWatchSyntheticsRole-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudWatch Logs log groups created for the canary. These logs groups have the name
     * <code>/aws/lambda/cwsyn-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Before you delete a canary, you might want to use <code>GetCanary</code> to display the information about this
     * canary. Make note of the information returned by this operation so that you can delete these resources after you
     * delete the canary.
     * </p>
     * 
     * @param deleteCanaryRequest
     * @return Result of the DeleteCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.DeleteCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DeleteCanary" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCanaryResult deleteCanary(DeleteCanaryRequest deleteCanaryRequest);

    /**
     * <p>
     * Deletes a group. The group doesn't need to be empty to be deleted. If there are canaries in the group, they are
     * not deleted when you delete the group.
     * </p>
     * <p>
     * Groups are a global resource that appear in all Regions, but the request to delete a group must be made from its
     * home Region. You can find the home Region of a group within its ARN.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * This operation returns a list of the canaries in your account, along with full details about each canary.
     * </p>
     * <p>
     * This operation supports resource-level authorization using an IAM policy and the <code>Names</code> parameter. If
     * you specify the <code>Names</code> parameter, the operation is successful only if you have authorization to view
     * all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     * request fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param describeCanariesRequest
     * @return Result of the DescribeCanaries operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.DescribeCanaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanaries" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeCanariesResult describeCanaries(DescribeCanariesRequest describeCanariesRequest);

    /**
     * <p>
     * Use this operation to see information from the most recent run of each canary that you have created.
     * </p>
     * <p>
     * This operation supports resource-level authorization using an IAM policy and the <code>Names</code> parameter. If
     * you specify the <code>Names</code> parameter, the operation is successful only if you have authorization to view
     * all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     * request fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param describeCanariesLastRunRequest
     * @return Result of the DescribeCanariesLastRun operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.DescribeCanariesLastRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanariesLastRun"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCanariesLastRunResult describeCanariesLastRun(DescribeCanariesLastRunRequest describeCanariesLastRunRequest);

    /**
     * <p>
     * Returns a list of Synthetics canary runtime versions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param describeRuntimeVersionsRequest
     * @return Result of the DescribeRuntimeVersions operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.DescribeRuntimeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeRuntimeVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRuntimeVersionsResult describeRuntimeVersions(DescribeRuntimeVersionsRequest describeRuntimeVersionsRequest);

    /**
     * <p>
     * Removes a canary from a group. You must run this operation in the Region where the canary exists.
     * </p>
     * 
     * @param disassociateResourceRequest
     * @return Result of the DisassociateResource operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.DisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DisassociateResource"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateResourceResult disassociateResource(DisassociateResourceRequest disassociateResourceRequest);

    /**
     * <p>
     * Retrieves complete information about one canary. You must specify the name of the canary that you want. To get a
     * list of canaries and their names, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * 
     * @param getCanaryRequest
     * @return Result of the GetCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.GetCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanary" target="_top">AWS API
     *      Documentation</a>
     */
    GetCanaryResult getCanary(GetCanaryRequest getCanaryRequest);

    /**
     * <p>
     * Retrieves a list of runs for a specified canary.
     * </p>
     * 
     * @param getCanaryRunsRequest
     * @return Result of the GetCanaryRuns operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @sample AWSSynthetics.GetCanaryRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanaryRuns" target="_top">AWS API
     *      Documentation</a>
     */
    GetCanaryRunsResult getCanaryRuns(GetCanaryRunsRequest getCanaryRunsRequest);

    /**
     * <p>
     * Returns information about one group. Groups are a global resource, so you can use this operation from any Region.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Returns a list of the groups that the specified canary is associated with. The canary that you specify must be in
     * the current Region.
     * </p>
     * 
     * @param listAssociatedGroupsRequest
     * @return Result of the ListAssociatedGroups operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @sample AWSSynthetics.ListAssociatedGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListAssociatedGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociatedGroupsResult listAssociatedGroups(ListAssociatedGroupsRequest listAssociatedGroupsRequest);

    /**
     * <p>
     * This operation returns a list of the ARNs of the canaries that are associated with the specified group.
     * </p>
     * 
     * @param listGroupResourcesRequest
     * @return Result of the ListGroupResources operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroupResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListGroupResourcesResult listGroupResources(ListGroupResourcesRequest listGroupResourcesRequest);

    /**
     * <p>
     * Returns a list of all groups in the account, displaying their names, unique IDs, and ARNs. The groups from all
     * Regions are returned.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @sample AWSSynthetics.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Displays the tags associated with a canary or group.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The request was not valid.
     * @throws NotFoundException
     *         The specified resource was not found.
     * @throws TooManyRequestsException
     *         There were too many simultaneous requests. Try the operation again.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws InternalFailureException
     *         An internal failure occurred. Try the operation again.
     * @sample AWSSynthetics.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Use this operation to run a canary that has already been created. The frequency of the canary runs is determined
     * by the value of the canary's <code>Schedule</code>. To see a canary's schedule, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_GetCanary.html">GetCanary</a>.
     * </p>
     * 
     * @param startCanaryRequest
     * @return Result of the StartCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.StartCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/StartCanary" target="_top">AWS API
     *      Documentation</a>
     */
    StartCanaryResult startCanary(StartCanaryRequest startCanaryRequest);

    /**
     * <p>
     * Stops the canary to prevent all future runs. If the canary is currently running,the run that is in progress
     * completes on its own, publishes metrics, and uploads artifacts, but it is not recorded in Synthetics as a
     * completed run.
     * </p>
     * <p>
     * You can use <code>StartCanary</code> to start it running again with the canary’s current schedule at any point in
     * the future.
     * </p>
     * 
     * @param stopCanaryRequest
     * @return Result of the StopCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @sample AWSSynthetics.StopCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/StopCanary" target="_top">AWS API
     *      Documentation</a>
     */
    StopCanaryResult stopCanary(StopCanaryRequest stopCanaryRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified canary or group.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a canary or group.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The request was not valid.
     * @throws NotFoundException
     *         The specified resource was not found.
     * @throws TooManyRequestsException
     *         There were too many simultaneous requests. Try the operation again.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws InternalFailureException
     *         An internal failure occurred. Try the operation again.
     * @sample AWSSynthetics.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The request was not valid.
     * @throws NotFoundException
     *         The specified resource was not found.
     * @throws TooManyRequestsException
     *         There were too many simultaneous requests. Try the operation again.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws InternalFailureException
     *         An internal failure occurred. Try the operation again.
     * @sample AWSSynthetics.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the configuration of a canary that has already been created.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing canary. To change the tags of an existing canary,
     * use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateCanaryRequest
     * @return Result of the UpdateCanary operation returned by the service.
     * @throws InternalServerException
     *         An unknown internal error occurred.
     * @throws ValidationException
     *         A parameter could not be validated.
     * @throws ResourceNotFoundException
     *         One of the specified resources was not found.
     * @throws ConflictException
     *         A conflicting operation is already in progress.
     * @throws RequestEntityTooLargeException
     *         One of the input resources is larger than is allowed.
     * @sample AWSSynthetics.UpdateCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UpdateCanary" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCanaryResult updateCanary(UpdateCanaryRequest updateCanaryRequest);

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
