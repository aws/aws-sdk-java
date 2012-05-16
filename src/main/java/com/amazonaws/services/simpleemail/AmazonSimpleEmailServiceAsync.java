/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing AmazonSimpleEmailService asynchronously,
 * using Java Futures.
 * Amazon Simple Email Service <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon SES). This documentation is intended to be used in conjunction with the Amazon SES
 * Getting Started Guide and the Amazon SES Developer Guide.
 * </p>
 * <p>
 * For specific details on how to construct a service request, please consult the<a href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
 * Amazon SES Developer Guide </a> .
 * </p>
 * <p>
 * <b>NOTE:</b>The endpoint for Amazon SES is located at: https://email.us-east-1.amazonaws.com
 * </p> 
 */       
public interface AmazonSimpleEmailServiceAsync extends AmazonSimpleEmailService {
    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     *
     * @param getSendQuotaRequest Container for the necessary parameters to
     *           execute the GetSendQuota operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by AmazonSimpleEmailService.
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
     * Deletes the specified identity (email address or domain) from the list
     * of verified identities.
     * </p>
     *
     * @param deleteIdentityRequest Container for the necessary parameters to
     *           execute the DeleteIdentity operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by
     *         AmazonSimpleEmailService.
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
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
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
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
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
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
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
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you have not yet requested production access to
     * Amazon SES, then you will only be able to send email to and from
     * verified email addresses and domains. For more information, go to the
     * Amazon SES Developer Guide.
     * </p>
     * <p>
     * The total size of the message cannot exceed 10 MB.
     * </p>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message:
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.
     * </p>
     * <p>
     * For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your <i>sending quota</i> - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the "Managing Your Sending
     * Activity" section of the<a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param sendEmailRequest Container for the necessary parameters to
     *           execute the SendEmail operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SendEmail service method, as returned by AmazonSimpleEmailService.
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
     * Verifies a domain.
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
     * Deletes the specified email address from the list of verified
     * addresses.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DeleteVerifiedEmailAddress action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
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
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The VerifyEmailAddress action is deprecated as of the
     * May 15, 2012 release of Domain Verification. The VerifyEmailIdentity
     * action is now preferred.
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
     * Sends an email message, with header and content specified by the
     * client. The <code>SendRawEmail</code> action is useful for sending
     * multipart MIME emails. The raw text of the message must comply with
     * Internet email standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you have not yet requested production access to
     * Amazon SES, then you will only be able to send email to and from
     * verified email addresses and domains. For more information, go to the
     * Amazon SES Developer Guide.
     * </p>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.
     * </p>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message:
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.
     * </p>
     * <p>
     * For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your <i>sending quota</i> - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the "Managing Your Sending
     * Activity" section of the<a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param sendRawEmailRequest Container for the necessary parameters to
     *           execute the SendRawEmail operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by AmazonSimpleEmailService.
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
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by
     *         AmazonSimpleEmailService.
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
     * Given a list of identities (email addresses and/or domains), returns
     * the verification status and (for domain identities) the verification
     * token for each identity.
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

}
        