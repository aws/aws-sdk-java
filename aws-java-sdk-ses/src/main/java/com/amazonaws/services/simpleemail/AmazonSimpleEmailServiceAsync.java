/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing AmazonSimpleEmailService asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon Simple Email Service <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon
 * SES). This documentation is intended to be used in conjunction with
 * the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>For a list of Amazon SES endpoints to use in service
 * requests, see Regions and Amazon SES in the Amazon SES Developer
 * Guide.
 * </p>
 */
public interface AmazonSimpleEmailServiceAsync extends AmazonSimpleEmailService {
    /**
     * <p>
     * Deletes the specified identity (email address or domain) from the
     * list of verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteIdentityRequest Container for the necessary parameters to
     *           execute the DeleteIdentity operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest deleteIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified identity (email address or domain) from the
     * list of verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteIdentityRequest Container for the necessary parameters to
     *           execute the DeleteIdentity operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest deleteIdentityRequest,
            AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listVerifiedEmailAddressesRequest Container for the necessary
     *           parameters to execute the ListVerifiedEmailAddresses operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         ListVerifiedEmailAddresses service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listVerifiedEmailAddressesRequest Container for the necessary
     *           parameters to execute the ListVerifiedEmailAddresses operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListVerifiedEmailAddresses service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest,
            AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getSendStatisticsRequest Container for the necessary parameters
     *           to execute the GetSendStatistics operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendStatistics service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSendStatisticsResult> getSendStatisticsAsync(GetSendStatisticsRequest getSendStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getSendStatisticsRequest Container for the necessary parameters
     *           to execute the GetSendStatistics operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendStatistics service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSendStatisticsResult> getSendStatisticsAsync(GetSendStatisticsRequest getSendStatisticsRequest,
            AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyEmailIdentityRequest Container for the necessary
     *           parameters to execute the VerifyEmailIdentity operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyEmailIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(VerifyEmailIdentityRequest verifyEmailIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyEmailIdentityRequest Container for the necessary
     *           parameters to execute the VerifyEmailIdentity operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyEmailIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(VerifyEmailIdentityRequest verifyEmailIdentityRequest,
            AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see
     * the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param getIdentityNotificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityNotificationAttributes
     *           operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityNotificationAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see
     * the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param getIdentityNotificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityNotificationAttributes
     *           operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityNotificationAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest,
            AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be
     * able to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param verifyDomainDkimRequest Container for the necessary parameters
     *           to execute the VerifyDomainDkim operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyDomainDkim service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyDomainDkimResult> verifyDomainDkimAsync(VerifyDomainDkimRequest verifyDomainDkimRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be
     * able to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param verifyDomainDkimRequest Container for the necessary parameters
     *           to execute the VerifyDomainDkim operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyDomainDkim service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyDomainDkimResult> verifyDomainDkimAsync(VerifyDomainDkimRequest verifyDomainDkimRequest,
            AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For
     * domain name identities, this action also returns the DKIM tokens that
     * are required for Easy DKIM signing, and whether Amazon SES has
     * successfully verified that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the
     * following information for each:
     * </p>
     * 
     * <ul>
     * <li>Whether Easy DKIM signing is enabled or disabled.</li>
     * <li>A set of DKIM tokens that represent the identity. If the identity
     * is an email address, the tokens represent the domain of that
     * address.</li>
     * <li>Whether Amazon SES has successfully verified the DKIM tokens
     * published in the domain's DNS. This information is only returned for
     * domain name identities, not for email addresses.</li>
     * 
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get
     * DKIM attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param getIdentityDkimAttributesRequest Container for the necessary
     *           parameters to execute the GetIdentityDkimAttributes operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityDkimAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For
     * domain name identities, this action also returns the DKIM tokens that
     * are required for Easy DKIM signing, and whether Amazon SES has
     * successfully verified that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the
     * following information for each:
     * </p>
     * 
     * <ul>
     * <li>Whether Easy DKIM signing is enabled or disabled.</li>
     * <li>A set of DKIM tokens that represent the identity. If the identity
     * is an email address, the tokens represent the domain of that
     * address.</li>
     * <li>Whether Amazon SES has successfully verified the DKIM tokens
     * published in the domain's DNS. This information is only returned for
     * domain name identities, not for email addresses.</li>
     * 
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get
     * DKIM attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param getIdentityDkimAttributesRequest Container for the necessary
     *           parameters to execute the GetIdentityDkimAttributes operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityDkimAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest,
            AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to
     * the given identity (email address or domain). This API returns only a
     * list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code> .
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listIdentityPoliciesRequest Container for the necessary
     *           parameters to execute the ListIdentityPolicies operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPolicies service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(ListIdentityPoliciesRequest listIdentityPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to
     * the given identity (email address or domain). This API returns only a
     * list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code> .
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listIdentityPoliciesRequest Container for the necessary
     *           parameters to execute the ListIdentityPolicies operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPolicies service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(ListIdentityPoliciesRequest listIdentityPoliciesRequest,
            AsyncHandler<ListIdentityPoliciesRequest, ListIdentityPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The VerifyEmailAddress action is deprecated as of
     * the May 15, 2012 release of Domain Verification. The
     * VerifyEmailIdentity action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyEmailAddressRequest Container for the necessary
     *           parameters to execute the VerifyEmailAddress operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyEmailAddress service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> verifyEmailAddressAsync(VerifyEmailAddressRequest verifyEmailAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The VerifyEmailAddress action is deprecated as of
     * the May 15, 2012 release of Domain Verification. The
     * VerifyEmailIdentity action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyEmailAddressRequest Container for the necessary
     *           parameters to execute the VerifyEmailAddress operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyEmailAddress service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> verifyEmailAddressAsync(VerifyEmailAddressRequest verifyEmailAddressRequest,
            AsyncHandler<VerifyEmailAddressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends an email message, with header and content specified by the
     * client. The <code>SendRawEmail</code> action is useful for sending
     * multipart MIME emails. The raw text of the message must comply with
     * Internet email standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendRawEmail</code> :
     * </p>
     * 
     * <ul>
     * <li>You can only send email from verified email addresses and
     * domains; otherwise, you will get an "Email address not verified"
     * error. If your account is still in the Amazon SES sandbox, you must
     * also verify every recipient email address except for the recipients
     * provided by the Amazon SES mailbox simulator. For more information, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes
     * any attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per
     * message. The combined number of To:, CC: and BCC: email addresses
     * cannot exceed 50. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or
     * fewer, and then call Amazon SES repeatedly to send the message to each
     * group.</li>
     * <li>The To:, CC:, and BCC: headers in the raw message can contain a
     * group list. Note that each recipient in a group list counts towards
     * the 50-recipient limit.</li>
     * <li>For every message that you send, the total number of recipients
     * (To:, CC: and BCC:) is counted against your sending quota - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>If you are using sending authorization to send on behalf of
     * another user, <code>SendRawEmail</code> enables you to specify the
     * cross-account identity for the email's "Source," "From," and
     * "Return-Path" parameters in one of two ways: you can pass optional
     * parameters <code>SourceArn</code> , <code>FromArn</code> , and/or
     * <code>ReturnPathArn</code> to the API, or you can include the
     * following X-headers in the header of your raw email:
     * <ul>
     * <li> <code>X-SES-SOURCE-ARN</code> </li>
     * <li> <code>X-SES-FROM-ARN</code> </li>
     * <li> <code>X-SES-RETURN-PATH-ARN</code> </li>
     * 
     * </ul>
     * <p>
     * <b>IMPORTANT:</b>Do not include these X-headers in the DKIM
     * signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * For the most common sending authorization use case, we recommend that
     * you specify the <code>SourceIdentityArn</code> and do not specify
     * either the <code>FromIdentityArn</code> or
     * <code>ReturnPathIdentityArn</code> . (The same note applies to the
     * corresponding X-headers.) If you only specify the
     * <code>SourceIdentityArn</code> , Amazon SES will simply set the "From"
     * address and the "Return Path" address to the identity specified in
     * <code>SourceIdentityArn</code> . For more information about sending
     * authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .</li>
     * 
     * </ul>
     *
     * @param sendRawEmailRequest Container for the necessary parameters to
     *           execute the SendRawEmail operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest sendRawEmailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends an email message, with header and content specified by the
     * client. The <code>SendRawEmail</code> action is useful for sending
     * multipart MIME emails. The raw text of the message must comply with
     * Internet email standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendRawEmail</code> :
     * </p>
     * 
     * <ul>
     * <li>You can only send email from verified email addresses and
     * domains; otherwise, you will get an "Email address not verified"
     * error. If your account is still in the Amazon SES sandbox, you must
     * also verify every recipient email address except for the recipients
     * provided by the Amazon SES mailbox simulator. For more information, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes
     * any attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per
     * message. The combined number of To:, CC: and BCC: email addresses
     * cannot exceed 50. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or
     * fewer, and then call Amazon SES repeatedly to send the message to each
     * group.</li>
     * <li>The To:, CC:, and BCC: headers in the raw message can contain a
     * group list. Note that each recipient in a group list counts towards
     * the 50-recipient limit.</li>
     * <li>For every message that you send, the total number of recipients
     * (To:, CC: and BCC:) is counted against your sending quota - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>If you are using sending authorization to send on behalf of
     * another user, <code>SendRawEmail</code> enables you to specify the
     * cross-account identity for the email's "Source," "From," and
     * "Return-Path" parameters in one of two ways: you can pass optional
     * parameters <code>SourceArn</code> , <code>FromArn</code> , and/or
     * <code>ReturnPathArn</code> to the API, or you can include the
     * following X-headers in the header of your raw email:
     * <ul>
     * <li> <code>X-SES-SOURCE-ARN</code> </li>
     * <li> <code>X-SES-FROM-ARN</code> </li>
     * <li> <code>X-SES-RETURN-PATH-ARN</code> </li>
     * 
     * </ul>
     * <p>
     * <b>IMPORTANT:</b>Do not include these X-headers in the DKIM
     * signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * For the most common sending authorization use case, we recommend that
     * you specify the <code>SourceIdentityArn</code> and do not specify
     * either the <code>FromIdentityArn</code> or
     * <code>ReturnPathIdentityArn</code> . (The same note applies to the
     * corresponding X-headers.) If you only specify the
     * <code>SourceIdentityArn</code> , Amazon SES will simply set the "From"
     * address and the "Return Path" address to the identity specified in
     * <code>SourceIdentityArn</code> . For more information about sending
     * authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .</li>
     * 
     * </ul>
     *
     * @param sendRawEmailRequest Container for the necessary parameters to
     *           execute the SendRawEmail operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest sendRawEmailRequest,
            AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest,
            AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns
     * the verification status and (for domain identities) the verification
     * token for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     *
     * @param getIdentityVerificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityVerificationAttributes
     *           operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityVerificationAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns
     * the verification status and (for domain identities) the verification
     * token for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     *
     * @param getIdentityVerificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityVerificationAttributes
     *           operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityVerificationAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest,
            AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified
     * identity (email address or domain).
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param putIdentityPolicyRequest Container for the necessary parameters
     *           to execute the PutIdentityPolicy operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         PutIdentityPolicy service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutIdentityPolicyResult> putIdentityPolicyAsync(PutIdentityPolicyRequest putIdentityPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified
     * identity (email address or domain).
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param putIdentityPolicyRequest Container for the necessary parameters
     *           to execute the PutIdentityPolicy operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutIdentityPolicy service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutIdentityPolicyResult> putIdentityPolicyAsync(PutIdentityPolicyRequest putIdentityPolicyRequest,
            AsyncHandler<PutIdentityPolicyRequest, PutIdentityPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (email address or domain). The policies are returned as a map
     * of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getIdentityPoliciesRequest Container for the necessary
     *           parameters to execute the GetIdentityPolicies operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityPolicies service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(GetIdentityPoliciesRequest getIdentityPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (email address or domain). The policies are returned as a map
     * of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getIdentityPoliciesRequest Container for the necessary
     *           parameters to execute the GetIdentityPolicies operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityPolicies service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(GetIdentityPoliciesRequest getIdentityPoliciesRequest,
            AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * 
     * <ul>
     * <li>If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code> ), then Amazon SES will DKIM-sign all email
     * sent by addresses under that domain name (e.g.,
     * <code>user@example.com</code> ).</li>
     * <li>If Easy DKIM signing is enabled for an email address, then Amazon
     * SES will DKIM-sign all email sent by that email address.</li>
     * 
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code> ), you can
     * only enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code> ) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityDkimEnabledRequest Container for the necessary
     *           parameters to execute the SetIdentityDkimEnabled operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityDkimEnabled service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * 
     * <ul>
     * <li>If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code> ), then Amazon SES will DKIM-sign all email
     * sent by addresses under that domain name (e.g.,
     * <code>user@example.com</code> ).</li>
     * <li>If Easy DKIM signing is enabled for an email address, then Amazon
     * SES will DKIM-sign all email sent by that email address.</li>
     * 
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code> ), you can
     * only enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code> ) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityDkimEnabledRequest Container for the necessary
     *           parameters to execute the SetIdentityDkimEnabled operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityDkimEnabled service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest,
            AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getSendQuotaRequest Container for the necessary parameters to
     *           execute the GetSendQuota operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest getSendQuotaRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getSendQuotaRequest Container for the necessary parameters to
     *           execute the GetSendQuota operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest getSendQuotaRequest,
            AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given
     * identity (email address or domain). This API returns successfully even
     * if a policy with the specified name does not exist.
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteIdentityPolicyRequest Container for the necessary
     *           parameters to execute the DeleteIdentityPolicy operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPolicy service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(DeleteIdentityPolicyRequest deleteIdentityPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given
     * identity (email address or domain). This API returns successfully even
     * if a policy with the specified name does not exist.
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteIdentityPolicyRequest Container for the necessary
     *           parameters to execute the DeleteIdentityPolicy operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPolicy service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(DeleteIdentityPolicyRequest deleteIdentityPolicyRequest,
            AsyncHandler<DeleteIdentityPolicyRequest, DeleteIdentityPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (email address or domain), enables or disables
     * whether Amazon SES forwards bounce and complaint notifications as
     * email. Feedback forwarding can only be disabled when Amazon Simple
     * Notification Service (Amazon SNS) topics are specified for both
     * bounces and complaints.
     * </p>
     * <p>
     * <b>NOTE:</b>Feedback forwarding does not apply to delivery
     * notifications. Delivery notifications are only available through
     * Amazon SNS.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see
     * the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityFeedbackForwardingEnabledRequest Container for the
     *           necessary parameters to execute the
     *           SetIdentityFeedbackForwardingEnabled operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityFeedbackForwardingEnabled service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (email address or domain), enables or disables
     * whether Amazon SES forwards bounce and complaint notifications as
     * email. Feedback forwarding can only be disabled when Amazon Simple
     * Notification Service (Amazon SNS) topics are specified for both
     * bounces and complaints.
     * </p>
     * <p>
     * <b>NOTE:</b>Feedback forwarding does not apply to delivery
     * notifications. Delivery notifications are only available through
     * Amazon SNS.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see
     * the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityFeedbackForwardingEnabledRequest Container for the
     *           necessary parameters to execute the
     *           SetIdentityFeedbackForwardingEnabled operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityFeedbackForwardingEnabled service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest,
            AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyDomainIdentityRequest Container for the necessary
     *           parameters to execute the VerifyDomainIdentity operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyDomainIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(VerifyDomainIdentityRequest verifyDomainIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyDomainIdentityRequest Container for the necessary
     *           parameters to execute the VerifyDomainIdentity operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyDomainIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(VerifyDomainIdentityRequest verifyDomainIdentityRequest,
            AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendEmail</code> :
     * </p>
     * 
     * <ul>
     * <li>You can only send email from verified email addresses and
     * domains; otherwise, you will get an "Email address not verified"
     * error. If your account is still in the Amazon SES sandbox, you must
     * also verify every recipient email address except for the recipients
     * provided by the Amazon SES mailbox simulator. For more information, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes
     * any attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per
     * message. The combined number of To:, CC: and BCC: email addresses
     * cannot exceed 50. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or
     * fewer, and then call Amazon SES repeatedly to send the message to each
     * group.</li>
     * <li>For every message that you send, the total number of recipients
     * (To:, CC: and BCC:) is counted against your sending quota - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
     * .</li>
     * 
     * </ul>
     *
     * @param sendEmailRequest Container for the necessary parameters to
     *           execute the SendEmail operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SendEmail service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendEmail</code> :
     * </p>
     * 
     * <ul>
     * <li>You can only send email from verified email addresses and
     * domains; otherwise, you will get an "Email address not verified"
     * error. If your account is still in the Amazon SES sandbox, you must
     * also verify every recipient email address except for the recipients
     * provided by the Amazon SES mailbox simulator. For more information, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes
     * any attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per
     * message. The combined number of To:, CC: and BCC: email addresses
     * cannot exceed 50. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or
     * fewer, and then call Amazon SES repeatedly to send the message to each
     * group.</li>
     * <li>For every message that you send, the total number of recipients
     * (To:, CC: and BCC:) is counted against your sending quota - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
     * .</li>
     * 
     * </ul>
     *
     * @param sendEmailRequest Container for the necessary parameters to
     *           execute the SendEmail operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SendEmail service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendEmailResult> sendEmailAsync(SendEmailRequest sendEmailRequest,
            AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified email address from the list of verified
     * addresses.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DeleteVerifiedEmailAddress action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteVerifiedEmailAddressRequest Container for the necessary
     *           parameters to execute the DeleteVerifiedEmailAddress operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVerifiedEmailAddress service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVerifiedEmailAddressAsync(DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified email address from the list of verified
     * addresses.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DeleteVerifiedEmailAddress action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteVerifiedEmailAddressRequest Container for the necessary
     *           parameters to execute the DeleteVerifiedEmailAddress operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVerifiedEmailAddress service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVerifiedEmailAddressAsync(DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest,
            AsyncHandler<DeleteVerifiedEmailAddressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (email address or domain), sets the Amazon Simple
     * Notification Service (Amazon SNS) topic to which Amazon SES will
     * publish bounce, complaint, and/or delivery notifications for emails
     * sent with that identity as the <code>Source</code> .
     * </p>
     * <p>
     * <b>NOTE:</b>Unless feedback forwarding is enabled, you must specify
     * Amazon SNS topics for bounce and complaint notifications. For more
     * information, see SetIdentityFeedbackForwardingEnabled.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityNotificationTopicRequest Container for the necessary
     *           parameters to execute the SetIdentityNotificationTopic operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityNotificationTopic service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (email address or domain), sets the Amazon Simple
     * Notification Service (Amazon SNS) topic to which Amazon SES will
     * publish bounce, complaint, and/or delivery notifications for emails
     * sent with that identity as the <code>Source</code> .
     * </p>
     * <p>
     * <b>NOTE:</b>Unless feedback forwarding is enabled, you must specify
     * Amazon SNS topics for bounce and complaint notifications. For more
     * information, see SetIdentityFeedbackForwardingEnabled.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityNotificationTopicRequest Container for the necessary
     *           parameters to execute the SetIdentityNotificationTopic operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityNotificationTopic service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest,
            AsyncHandler<SetIdentityNotificationTopicRequest, SetIdentityNotificationTopicResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        