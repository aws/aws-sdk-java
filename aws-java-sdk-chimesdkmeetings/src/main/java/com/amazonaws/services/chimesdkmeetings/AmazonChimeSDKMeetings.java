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
package com.amazonaws.services.chimesdkmeetings;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.chimesdkmeetings.model.*;

/**
 * Interface for accessing Amazon Chime SDK Meetings.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkmeetings.AbstractAmazonChimeSDKMeetings} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK meetings APIs in this section allow software developers to create Amazon Chime SDK meetings, set
 * the AWS Regions for meetings, create and manage users, and send and receive meeting notifications. For more
 * information about the meeting APIs, see <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Meetings.html">Amazon
 * Chime SDK meetings</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKMeetings {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "meetings-chime";

    /**
     * <p>
     * Creates up to 100 attendees for an active Amazon Chime SDK meeting. For more information about the Amazon Chime
     * SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a>
     * in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @return Result of the BatchCreateAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.BatchCreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/BatchCreateAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    BatchCreateAttendeeResult batchCreateAttendee(BatchCreateAttendeeRequest batchCreateAttendeeRequest);

    /**
     * <p>
     * Updates <code>AttendeeCapabilities</code> except the capabilities listed in an <code>ExcludedAttendeeIds</code>
     * table.
     * </p>
     * <note>
     * <p>
     * You use the capabilities with a set of values that control what the capabilities can do, such as
     * <code>SendReceive</code> data. For more information about those values, see .
     * </p>
     * </note>
     * <p>
     * When using capabilities, be aware of these corner cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you
     * also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set
     * the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code.
     * However, you can set your <code>video</code> capability to receive and you set your <code>content</code>
     * capability to not receive.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     * <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will
     * flow from the attendee to the other meeting participants.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     * <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video
     * or content streams, remote attendess can receive those streams, but only after media renegotiation between the
     * client and the Amazon Chime back-end server.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchUpdateAttendeeCapabilitiesExceptRequest
     * @return Result of the BatchUpdateAttendeeCapabilitiesExcept operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request have been made simultaneously.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AmazonChimeSDKMeetings.BatchUpdateAttendeeCapabilitiesExcept
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/BatchUpdateAttendeeCapabilitiesExcept"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdateAttendeeCapabilitiesExceptResult batchUpdateAttendeeCapabilitiesExcept(
            BatchUpdateAttendeeCapabilitiesExceptRequest batchUpdateAttendeeCapabilitiesExceptRequest);

    /**
     * <p>
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @return Result of the CreateAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.CreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAttendeeResult createAttendee(CreateAttendeeRequest createAttendeeRequest);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more
     * information about specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingRequest
     * @return Result of the CreateMeeting operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @sample AmazonChimeSDKMeetings.CreateMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeeting"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMeetingResult createMeeting(CreateMeetingRequest createMeetingRequest);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region, with attendees. For more information about
     * specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingWithAttendeesRequest
     * @return Result of the CreateMeetingWithAttendees operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @sample AmazonChimeSDKMeetings.CreateMeetingWithAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeetingWithAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMeetingWithAttendeesResult createMeetingWithAttendees(CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest);

    /**
     * <p>
     * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their <code>JoinToken</code>.
     * Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the
     * Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon
     * Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @return Result of the DeleteAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.DeleteAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/DeleteAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAttendeeResult deleteAttendee(DeleteAttendeeRequest deleteAttendeeRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime SDK meeting. The operation deletes all attendees, disconnects all clients, and
     * prevents new clients from joining the meeting. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @return Result of the DeleteMeeting operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.DeleteMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/DeleteMeeting"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMeetingResult deleteMeeting(DeleteMeetingRequest deleteMeetingRequest);

    /**
     * <p>
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about
     * the Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getAttendeeRequest
     * @return Result of the GetAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.GetAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/GetAttendee" target="_top">AWS
     *      API Documentation</a>
     */
    GetAttendeeResult getAttendee(GetAttendeeRequest getAttendeeRequest);

    /**
     * <p>
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getMeetingRequest
     * @return Result of the GetMeeting operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.GetMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/GetMeeting" target="_top">AWS
     *      API Documentation</a>
     */
    GetMeetingResult getMeeting(GetMeetingRequest getMeetingRequest);

    /**
     * <p>
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param listAttendeesRequest
     * @return Result of the ListAttendees operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.ListAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/ListAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    ListAttendeesResult listAttendees(ListAttendeesRequest listAttendeesRequest);

    /**
     * <p>
     * Returns a list of the tags available for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that you want to tag couldn't be found.
     * @sample AmazonChimeSDKMeetings.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts transcription for the specified <code>meetingId</code>.
     * </p>
     * 
     * @param startMeetingTranscriptionRequest
     * @return Result of the StartMeetingTranscription operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMeetings.StartMeetingTranscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/StartMeetingTranscription"
     *      target="_top">AWS API Documentation</a>
     */
    StartMeetingTranscriptionResult startMeetingTranscription(StartMeetingTranscriptionRequest startMeetingTranscriptionRequest);

    /**
     * <p>
     * Stops transcription for the specified <code>meetingId</code>.
     * </p>
     * 
     * @param stopMeetingTranscriptionRequest
     * @return Result of the StopMeetingTranscription operation returned by the service.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMeetings.StopMeetingTranscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/StopMeetingTranscription"
     *      target="_top">AWS API Documentation</a>
     */
    StopMeetingTranscriptionResult stopMeetingTranscription(StopMeetingTranscriptionRequest stopMeetingTranscriptionRequest);

    /**
     * <p>
     * The resource that supports tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceNotFoundException
     *         The resource that you want to tag couldn't be found.
     * @throws TooManyTagsException
     *         Too many tags were added to the specified resource.
     * @sample AmazonChimeSDKMeetings.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that
     * key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were
     * already removed. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to
     * as well as permissions for removing tags. For more information, see the documentation for the service whose
     * resource you want to untag.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the calling AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * In addition to the <code>tag:UntagResources</code> permission required by this operation, you must also have the
     * remove tags permission defined by the service that created the resource. For example, to remove the tags from an
     * Amazon EC2 instance using the <code>UntagResources</code> operation, you must have both of the following
     * permissions:
     * </p>
     * <p>
     * <code>tag:UntagResource</code>
     * </p>
     * <p>
     * <code>ChimeSDKMeetings:DeleteTags</code>
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceNotFoundException
     *         The resource that you want to tag couldn't be found.
     * @sample AmazonChimeSDKMeetings.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * The capabilties that you want to update.
     * </p>
     * <note>
     * <p>
     * You use the capabilities with a set of values that control what the capabilities can do, such as
     * <code>SendReceive</code> data. For more information about those values, see .
     * </p>
     * </note>
     * <p>
     * When using capabilities, be aware of these corner cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you
     * also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set
     * the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code.
     * However, you can set your <code>video</code> capability to receive and you set your <code>content</code>
     * capability to not receive.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     * <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will
     * flow from the attendee to the other meeting participants.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     * <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video
     * or content streams, remote attendess can receive those streams, but only after media renegotiation between the
     * client and the Amazon Chime back-end server.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAttendeeCapabilitiesRequest
     * @return Result of the UpdateAttendeeCapabilities operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request have been made simultaneously.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AmazonChimeSDKMeetings.UpdateAttendeeCapabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/UpdateAttendeeCapabilities"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAttendeeCapabilitiesResult updateAttendeeCapabilities(UpdateAttendeeCapabilitiesRequest updateAttendeeCapabilitiesRequest);

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
