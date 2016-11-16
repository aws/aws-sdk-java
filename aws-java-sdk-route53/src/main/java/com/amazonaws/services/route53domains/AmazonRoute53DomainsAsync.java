/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains;

import com.amazonaws.services.route53domains.model.*;

/**
 * Interface for accessing Amazon Route 53 Domains asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53domains.AbstractAmazonRoute53DomainsAsync} instead.
 * </p>
 */
public interface AmazonRoute53DomainsAsync extends AmazonRoute53Domains {

    /**
     * <p>
     * This operation checks the availability of one domain name. Note that if the availability status of a domain is
     * pending, you must submit another request to determine the availability of the domain name.
     * </p>
     * 
     * @param checkDomainAvailabilityRequest
     *        The CheckDomainAvailability request contains the following elements.
     * @return A Java Future containing the result of the CheckDomainAvailability operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.CheckDomainAvailability
     */
    java.util.concurrent.Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(CheckDomainAvailabilityRequest checkDomainAvailabilityRequest);

    /**
     * <p>
     * This operation checks the availability of one domain name. Note that if the availability status of a domain is
     * pending, you must submit another request to determine the availability of the domain name.
     * </p>
     * 
     * @param checkDomainAvailabilityRequest
     *        The CheckDomainAvailability request contains the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CheckDomainAvailability operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.CheckDomainAvailability
     */
    java.util.concurrent.Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(CheckDomainAvailabilityRequest checkDomainAvailabilityRequest,
            com.amazonaws.handlers.AsyncHandler<CheckDomainAvailabilityRequest, CheckDomainAvailabilityResult> asyncHandler);

    /**
     * <p>
     * This operation deletes the specified tags for a domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param deleteTagsForDomainRequest
     *        The DeleteTagsForDomainRequest includes the following elements.
     * @return A Java Future containing the result of the DeleteTagsForDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.DeleteTagsForDomain
     */
    java.util.concurrent.Future<DeleteTagsForDomainResult> deleteTagsForDomainAsync(DeleteTagsForDomainRequest deleteTagsForDomainRequest);

    /**
     * <p>
     * This operation deletes the specified tags for a domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param deleteTagsForDomainRequest
     *        The DeleteTagsForDomainRequest includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTagsForDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.DeleteTagsForDomain
     */
    java.util.concurrent.Future<DeleteTagsForDomainResult> deleteTagsForDomainAsync(DeleteTagsForDomainRequest deleteTagsForDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsForDomainRequest, DeleteTagsForDomainResult> asyncHandler);

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for the specified domain.
     * </p>
     * 
     * @param disableDomainAutoRenewRequest
     * @return A Java Future containing the result of the DisableDomainAutoRenew operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.DisableDomainAutoRenew
     */
    java.util.concurrent.Future<DisableDomainAutoRenewResult> disableDomainAutoRenewAsync(DisableDomainAutoRenewRequest disableDomainAutoRenewRequest);

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for the specified domain.
     * </p>
     * 
     * @param disableDomainAutoRenewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableDomainAutoRenew operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.DisableDomainAutoRenew
     */
    java.util.concurrent.Future<DisableDomainAutoRenewResult> disableDomainAutoRenewAsync(DisableDomainAutoRenewRequest disableDomainAutoRenewRequest,
            com.amazonaws.handlers.AsyncHandler<DisableDomainAutoRenewRequest, DisableDomainAutoRenewResult> asyncHandler);

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically the <code>clientTransferProhibited</code>
     * status) to allow domain transfers. We recommend you refrain from performing this action unless you intend to
     * transfer the domain to a different registrar. Successful submission returns an operation ID that you can use to
     * track the progress and completion of the action. If the request is not completed successfully, the domain
     * registrant will be notified by email.
     * </p>
     * 
     * @param disableDomainTransferLockRequest
     *        The DisableDomainTransferLock request includes the following element.
     * @return A Java Future containing the result of the DisableDomainTransferLock operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.DisableDomainTransferLock
     */
    java.util.concurrent.Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(
            DisableDomainTransferLockRequest disableDomainTransferLockRequest);

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically the <code>clientTransferProhibited</code>
     * status) to allow domain transfers. We recommend you refrain from performing this action unless you intend to
     * transfer the domain to a different registrar. Successful submission returns an operation ID that you can use to
     * track the progress and completion of the action. If the request is not completed successfully, the domain
     * registrant will be notified by email.
     * </p>
     * 
     * @param disableDomainTransferLockRequest
     *        The DisableDomainTransferLock request includes the following element.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableDomainTransferLock operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.DisableDomainTransferLock
     */
    java.util.concurrent.Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(
            DisableDomainTransferLockRequest disableDomainTransferLockRequest,
            com.amazonaws.handlers.AsyncHandler<DisableDomainTransferLockRequest, DisableDomainTransferLockResult> asyncHandler);

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the specified domain before the domain
     * registration expires. The cost of renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies,
     * see <a href="http://wiki.gandi.net/en/domains/renew#renewal_restoration_and_deletion_times">
     * "Renewal, restoration, and deletion times"</a> on the website for our registrar partner, Gandi. Route 53 requires
     * that you renew before the end of the renewal period that is listed on the Gandi website so we can complete
     * processing before the deadline.
     * </p>
     * 
     * @param enableDomainAutoRenewRequest
     * @return A Java Future containing the result of the EnableDomainAutoRenew operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.EnableDomainAutoRenew
     */
    java.util.concurrent.Future<EnableDomainAutoRenewResult> enableDomainAutoRenewAsync(EnableDomainAutoRenewRequest enableDomainAutoRenewRequest);

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the specified domain before the domain
     * registration expires. The cost of renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies,
     * see <a href="http://wiki.gandi.net/en/domains/renew#renewal_restoration_and_deletion_times">
     * "Renewal, restoration, and deletion times"</a> on the website for our registrar partner, Gandi. Route 53 requires
     * that you renew before the end of the renewal period that is listed on the Gandi website so we can complete
     * processing before the deadline.
     * </p>
     * 
     * @param enableDomainAutoRenewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableDomainAutoRenew operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.EnableDomainAutoRenew
     */
    java.util.concurrent.Future<EnableDomainAutoRenewResult> enableDomainAutoRenewAsync(EnableDomainAutoRenewRequest enableDomainAutoRenewRequest,
            com.amazonaws.handlers.AsyncHandler<EnableDomainAutoRenewRequest, EnableDomainAutoRenewResult> asyncHandler);

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the <code>clientTransferProhibited</code>
     * status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed successfully, the domain registrant will
     * be notified by email.
     * </p>
     * 
     * @param enableDomainTransferLockRequest
     *        The EnableDomainTransferLock request includes the following element.
     * @return A Java Future containing the result of the EnableDomainTransferLock operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.EnableDomainTransferLock
     */
    java.util.concurrent.Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(EnableDomainTransferLockRequest enableDomainTransferLockRequest);

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the <code>clientTransferProhibited</code>
     * status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed successfully, the domain registrant will
     * be notified by email.
     * </p>
     * 
     * @param enableDomainTransferLockRequest
     *        The EnableDomainTransferLock request includes the following element.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableDomainTransferLock operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.EnableDomainTransferLock
     */
    java.util.concurrent.Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(EnableDomainTransferLockRequest enableDomainTransferLockRequest,
            com.amazonaws.handlers.AsyncHandler<EnableDomainTransferLockRequest, EnableDomainTransferLockResult> asyncHandler);

    /**
     * <p>
     * For operations that require confirmation that the email address for the registrant contact is valid, such as
     * registering a new domain, this operation returns information about whether the registrant contact has responded.
     * </p>
     * <p>
     * If you want us to resend the email, use the <code>ResendContactReachabilityEmail</code> operation.
     * </p>
     * 
     * @param getContactReachabilityStatusRequest
     * @return A Java Future containing the result of the GetContactReachabilityStatus operation returned by the
     *         service.
     * @sample AmazonRoute53DomainsAsync.GetContactReachabilityStatus
     */
    java.util.concurrent.Future<GetContactReachabilityStatusResult> getContactReachabilityStatusAsync(
            GetContactReachabilityStatusRequest getContactReachabilityStatusRequest);

    /**
     * <p>
     * For operations that require confirmation that the email address for the registrant contact is valid, such as
     * registering a new domain, this operation returns information about whether the registrant contact has responded.
     * </p>
     * <p>
     * If you want us to resend the email, use the <code>ResendContactReachabilityEmail</code> operation.
     * </p>
     * 
     * @param getContactReachabilityStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContactReachabilityStatus operation returned by the
     *         service.
     * @sample AmazonRoute53DomainsAsyncHandler.GetContactReachabilityStatus
     */
    java.util.concurrent.Future<GetContactReachabilityStatusResult> getContactReachabilityStatusAsync(
            GetContactReachabilityStatusRequest getContactReachabilityStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetContactReachabilityStatusRequest, GetContactReachabilityStatusResult> asyncHandler);

    /**
     * <p>
     * This operation returns detailed information about the domain. The domain's contact information is also returned
     * as part of the output.
     * </p>
     * 
     * @param getDomainDetailRequest
     *        The GetDomainDetail request includes the following element.
     * @return A Java Future containing the result of the GetDomainDetail operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.GetDomainDetail
     */
    java.util.concurrent.Future<GetDomainDetailResult> getDomainDetailAsync(GetDomainDetailRequest getDomainDetailRequest);

    /**
     * <p>
     * This operation returns detailed information about the domain. The domain's contact information is also returned
     * as part of the output.
     * </p>
     * 
     * @param getDomainDetailRequest
     *        The GetDomainDetail request includes the following element.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainDetail operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.GetDomainDetail
     */
    java.util.concurrent.Future<GetDomainDetailResult> getDomainDetailAsync(GetDomainDetailRequest getDomainDetailRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainDetailRequest, GetDomainDetailResult> asyncHandler);

    /**
     * <p>
     * The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a
     * domain name or simply a word or phrase (without spaces).
     * </p>
     * <p>
     * Parameters:
     * <ul>
     * <li>DomainName (string): The basis for your domain suggestion search, a string with (or without) top-level domain
     * specified.</li>
     * <li>SuggestionCount (int): The number of domain suggestions to be returned, maximum 50, minimum 1.</li>
     * <li>OnlyAvailable (bool): If true, availability check will be performed on suggestion results, and only available
     * domains will be returned. If false, suggestions will be returned without checking whether the domain is actually
     * available, and caller will have to call checkDomainAvailability for each suggestion to determine availability for
     * registration.</li>
     * </ul>
     * </p>
     * 
     * @param getDomainSuggestionsRequest
     * @return A Java Future containing the result of the GetDomainSuggestions operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.GetDomainSuggestions
     */
    java.util.concurrent.Future<GetDomainSuggestionsResult> getDomainSuggestionsAsync(GetDomainSuggestionsRequest getDomainSuggestionsRequest);

    /**
     * <p>
     * The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a
     * domain name or simply a word or phrase (without spaces).
     * </p>
     * <p>
     * Parameters:
     * <ul>
     * <li>DomainName (string): The basis for your domain suggestion search, a string with (or without) top-level domain
     * specified.</li>
     * <li>SuggestionCount (int): The number of domain suggestions to be returned, maximum 50, minimum 1.</li>
     * <li>OnlyAvailable (bool): If true, availability check will be performed on suggestion results, and only available
     * domains will be returned. If false, suggestions will be returned without checking whether the domain is actually
     * available, and caller will have to call checkDomainAvailability for each suggestion to determine availability for
     * registration.</li>
     * </ul>
     * </p>
     * 
     * @param getDomainSuggestionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainSuggestions operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.GetDomainSuggestions
     */
    java.util.concurrent.Future<GetDomainSuggestionsResult> getDomainSuggestionsAsync(GetDomainSuggestionsRequest getDomainSuggestionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainSuggestionsRequest, GetDomainSuggestionsResult> asyncHandler);

    /**
     * <p>
     * This operation returns the current status of an operation that is not completed.
     * </p>
     * 
     * @param getOperationDetailRequest
     *        The GetOperationDetail request includes the following element.
     * @return A Java Future containing the result of the GetOperationDetail operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.GetOperationDetail
     */
    java.util.concurrent.Future<GetOperationDetailResult> getOperationDetailAsync(GetOperationDetailRequest getOperationDetailRequest);

    /**
     * <p>
     * This operation returns the current status of an operation that is not completed.
     * </p>
     * 
     * @param getOperationDetailRequest
     *        The GetOperationDetail request includes the following element.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperationDetail operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.GetOperationDetail
     */
    java.util.concurrent.Future<GetOperationDetailResult> getOperationDetailAsync(GetOperationDetailRequest getOperationDetailRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationDetailRequest, GetOperationDetailResult> asyncHandler);

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.
     * </p>
     * 
     * @param listDomainsRequest
     *        The ListDomains request includes the following elements.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.ListDomains
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.
     * </p>
     * 
     * @param listDomainsRequest
     *        The ListDomains request includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.ListDomains
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListDomains operation.
     *
     * @see #listDomainsAsync(ListDomainsRequest)
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync();

    /**
     * Simplified method form for invoking the ListDomains operation with an AsyncHandler.
     *
     * @see #listDomainsAsync(ListDomainsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not yet complete.
     * </p>
     * 
     * @param listOperationsRequest
     *        The ListOperations request includes the following elements.
     * @return A Java Future containing the result of the ListOperations operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.ListOperations
     */
    java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest listOperationsRequest);

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not yet complete.
     * </p>
     * 
     * @param listOperationsRequest
     *        The ListOperations request includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOperations operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.ListOperations
     */
    java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest listOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListOperations operation.
     *
     * @see #listOperationsAsync(ListOperationsRequest)
     */
    java.util.concurrent.Future<ListOperationsResult> listOperationsAsync();

    /**
     * Simplified method form for invoking the ListOperations operation with an AsyncHandler.
     *
     * @see #listOperationsAsync(ListOperationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler);

    /**
     * <p>
     * This operation returns all of the tags that are associated with the specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param listTagsForDomainRequest
     *        The ListTagsForDomainRequest includes the following elements.
     * @return A Java Future containing the result of the ListTagsForDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.ListTagsForDomain
     */
    java.util.concurrent.Future<ListTagsForDomainResult> listTagsForDomainAsync(ListTagsForDomainRequest listTagsForDomainRequest);

    /**
     * <p>
     * This operation returns all of the tags that are associated with the specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param listTagsForDomainRequest
     *        The ListTagsForDomainRequest includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.ListTagsForDomain
     */
    java.util.concurrent.Future<ListTagsForDomainResult> listTagsForDomainAsync(ListTagsForDomainRequest listTagsForDomainRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForDomainRequest, ListTagsForDomainResult> asyncHandler);

    /**
     * <p>
     * This operation registers a domain. Domains are registered by the AWS registrar partner, Gandi. For some top-level
     * domains (TLDs), this operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>Creates a Amazon Route 53 hosted zone that has the same name as the domain. Amazon Route 53 assigns four name
     * servers to your hosted zone and automatically updates your domain registration with the names of these name
     * servers.</li>
     * <li>Enables autorenew, so your domain registration will renew automatically each year. We'll notify you in
     * advance of the renewal date so you can choose whether to renew the registration.</li>
     * <li>Optionally enables privacy protection, so WHOIS queries return contact information for our registrar partner,
     * Gandi, instead of the information you entered for registrant, admin, and tech contacts.</li>
     * <li>If registration is successful, returns an operation ID that you can use to track the progress and completion
     * of the action. If the request is not completed successfully, the domain registrant is notified by email.</li>
     * <li>Charges your AWS account an amount based on the top-level domain. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.</li>
     * </ul>
     * 
     * @param registerDomainRequest
     *        The RegisterDomain request includes the following elements.
     * @return A Java Future containing the result of the RegisterDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.RegisterDomain
     */
    java.util.concurrent.Future<RegisterDomainResult> registerDomainAsync(RegisterDomainRequest registerDomainRequest);

    /**
     * <p>
     * This operation registers a domain. Domains are registered by the AWS registrar partner, Gandi. For some top-level
     * domains (TLDs), this operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>Creates a Amazon Route 53 hosted zone that has the same name as the domain. Amazon Route 53 assigns four name
     * servers to your hosted zone and automatically updates your domain registration with the names of these name
     * servers.</li>
     * <li>Enables autorenew, so your domain registration will renew automatically each year. We'll notify you in
     * advance of the renewal date so you can choose whether to renew the registration.</li>
     * <li>Optionally enables privacy protection, so WHOIS queries return contact information for our registrar partner,
     * Gandi, instead of the information you entered for registrant, admin, and tech contacts.</li>
     * <li>If registration is successful, returns an operation ID that you can use to track the progress and completion
     * of the action. If the request is not completed successfully, the domain registrant is notified by email.</li>
     * <li>Charges your AWS account an amount based on the top-level domain. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.</li>
     * </ul>
     * 
     * @param registerDomainRequest
     *        The RegisterDomain request includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.RegisterDomain
     */
    java.util.concurrent.Future<RegisterDomainResult> registerDomainAsync(RegisterDomainRequest registerDomainRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterDomainRequest, RegisterDomainResult> asyncHandler);

    /**
     * <p>
     * This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to
     * your AWS account.
     * </p>
     * <p>
     * We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete
     * domains before the expiration date if you haven't renewed far enough in advance. For more information about
     * renewing domain registration, see <a href="http://docs.aws.amazon.com/console/route53/domain-renew">Renewing
     * Registration for a Domain</a> in the Amazon Route 53 documentation.
     * </p>
     * 
     * @param renewDomainRequest
     *        A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current
     *        expiration year.
     * @return A Java Future containing the result of the RenewDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.RenewDomain
     */
    java.util.concurrent.Future<RenewDomainResult> renewDomainAsync(RenewDomainRequest renewDomainRequest);

    /**
     * <p>
     * This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to
     * your AWS account.
     * </p>
     * <p>
     * We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete
     * domains before the expiration date if you haven't renewed far enough in advance. For more information about
     * renewing domain registration, see <a href="http://docs.aws.amazon.com/console/route53/domain-renew">Renewing
     * Registration for a Domain</a> in the Amazon Route 53 documentation.
     * </p>
     * 
     * @param renewDomainRequest
     *        A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current
     *        expiration year.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RenewDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.RenewDomain
     */
    java.util.concurrent.Future<RenewDomainResult> renewDomainAsync(RenewDomainRequest renewDomainRequest,
            com.amazonaws.handlers.AsyncHandler<RenewDomainRequest, RenewDomainResult> asyncHandler);

    /**
     * <p>
     * For operations that require confirmation that the email address for the registrant contact is valid, such as
     * registering a new domain, this operation resends the confirmation email to the current email address for the
     * registrant contact.
     * </p>
     * 
     * @param resendContactReachabilityEmailRequest
     * @return A Java Future containing the result of the ResendContactReachabilityEmail operation returned by the
     *         service.
     * @sample AmazonRoute53DomainsAsync.ResendContactReachabilityEmail
     */
    java.util.concurrent.Future<ResendContactReachabilityEmailResult> resendContactReachabilityEmailAsync(
            ResendContactReachabilityEmailRequest resendContactReachabilityEmailRequest);

    /**
     * <p>
     * For operations that require confirmation that the email address for the registrant contact is valid, such as
     * registering a new domain, this operation resends the confirmation email to the current email address for the
     * registrant contact.
     * </p>
     * 
     * @param resendContactReachabilityEmailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResendContactReachabilityEmail operation returned by the
     *         service.
     * @sample AmazonRoute53DomainsAsyncHandler.ResendContactReachabilityEmail
     */
    java.util.concurrent.Future<ResendContactReachabilityEmailResult> resendContactReachabilityEmailAsync(
            ResendContactReachabilityEmailRequest resendContactReachabilityEmailRequest,
            com.amazonaws.handlers.AsyncHandler<ResendContactReachabilityEmailRequest, ResendContactReachabilityEmailResult> asyncHandler);

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this
     * value to the new registrar.
     * </p>
     * 
     * @param retrieveDomainAuthCodeRequest
     *        The RetrieveDomainAuthCode request includes the following element.
     * @return A Java Future containing the result of the RetrieveDomainAuthCode operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.RetrieveDomainAuthCode
     */
    java.util.concurrent.Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest);

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this
     * value to the new registrar.
     * </p>
     * 
     * @param retrieveDomainAuthCodeRequest
     *        The RetrieveDomainAuthCode request includes the following element.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetrieveDomainAuthCode operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.RetrieveDomainAuthCode
     */
    java.util.concurrent.Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest,
            com.amazonaws.handlers.AsyncHandler<RetrieveDomainAuthCodeRequest, RetrieveDomainAuthCodeResult> asyncHandler);

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon Route 53. When the transfer is complete, the
     * domain is registered with the AWS registrar partner, Gandi.
     * </p>
     * <p>
     * For transfer requirements, a detailed procedure, and information about viewing the status of a domain transfer,
     * see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-to-route-53.html">Transferring
     * Registration for a Domain to Amazon Route 53</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the domain, we highly recommend that you
     * consider transferring your DNS service to Amazon Route 53 or to another DNS service provider before you transfer
     * your registration. Some registrars provide free DNS service when you purchase a domain registration. When you
     * transfer the registration, the previous registrar will not renew your domain registration and could end your DNS
     * service at any time.
     * </p>
     * <note>Caution! If the registrar for your domain is also the DNS service provider for the domain and you don't
     * transfer DNS service to another provider, your website, email, and the web applications associated with the
     * domain might become unavailable.</note>
     * <p>
     * If the transfer is successful, this method returns an operation ID that you can use to track the progress and
     * completion of the action. If the transfer doesn't complete successfully, the domain registrant will be notified
     * by email.
     * </p>
     * 
     * @param transferDomainRequest
     *        The TransferDomain request includes the following elements.
     * @return A Java Future containing the result of the TransferDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.TransferDomain
     */
    java.util.concurrent.Future<TransferDomainResult> transferDomainAsync(TransferDomainRequest transferDomainRequest);

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon Route 53. When the transfer is complete, the
     * domain is registered with the AWS registrar partner, Gandi.
     * </p>
     * <p>
     * For transfer requirements, a detailed procedure, and information about viewing the status of a domain transfer,
     * see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-to-route-53.html">Transferring
     * Registration for a Domain to Amazon Route 53</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the domain, we highly recommend that you
     * consider transferring your DNS service to Amazon Route 53 or to another DNS service provider before you transfer
     * your registration. Some registrars provide free DNS service when you purchase a domain registration. When you
     * transfer the registration, the previous registrar will not renew your domain registration and could end your DNS
     * service at any time.
     * </p>
     * <note>Caution! If the registrar for your domain is also the DNS service provider for the domain and you don't
     * transfer DNS service to another provider, your website, email, and the web applications associated with the
     * domain might become unavailable.</note>
     * <p>
     * If the transfer is successful, this method returns an operation ID that you can use to track the progress and
     * completion of the action. If the transfer doesn't complete successfully, the domain registrant will be notified
     * by email.
     * </p>
     * 
     * @param transferDomainRequest
     *        The TransferDomain request includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TransferDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.TransferDomain
     */
    java.util.concurrent.Future<TransferDomainResult> transferDomainAsync(TransferDomainRequest transferDomainRequest,
            com.amazonaws.handlers.AsyncHandler<TransferDomainRequest, TransferDomainResult> asyncHandler);

    /**
     * <p>
     * This operation updates the contact information for a particular domain. Information for at least one contact
     * (registrant, administrator, or technical) must be supplied for update.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that you can use to track the progress and
     * completion of the action. If the request is not completed successfully, the domain registrant will be notified by
     * email.
     * </p>
     * 
     * @param updateDomainContactRequest
     *        The UpdateDomainContact request includes the following elements.
     * @return A Java Future containing the result of the UpdateDomainContact operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.UpdateDomainContact
     */
    java.util.concurrent.Future<UpdateDomainContactResult> updateDomainContactAsync(UpdateDomainContactRequest updateDomainContactRequest);

    /**
     * <p>
     * This operation updates the contact information for a particular domain. Information for at least one contact
     * (registrant, administrator, or technical) must be supplied for update.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that you can use to track the progress and
     * completion of the action. If the request is not completed successfully, the domain registrant will be notified by
     * email.
     * </p>
     * 
     * @param updateDomainContactRequest
     *        The UpdateDomainContact request includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainContact operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.UpdateDomainContact
     */
    java.util.concurrent.Future<UpdateDomainContactResult> updateDomainContactAsync(UpdateDomainContactRequest updateDomainContactRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainContactRequest, UpdateDomainContactResult> asyncHandler);

    /**
     * <p>
     * This operation updates the specified domain contact's privacy setting. When the privacy option is enabled,
     * personal information such as postal or email address is hidden from the results of a public WHOIS query. The
     * privacy services are provided by the AWS registrar, Gandi. For more information, see the <a
     * href="http://www.gandi.net/domain/whois/?currency=USD&amp;amp;lang=en">Gandi privacy features</a>.
     * </p>
     * <p>
     * This operation only affects the privacy of the specified contact type (registrant, administrator, or tech).
     * Successful acceptance returns an operation ID that you can use with GetOperationDetail to track the progress and
     * completion of the action. If the request is not completed successfully, the domain registrant will be notified by
     * email.
     * </p>
     * 
     * @param updateDomainContactPrivacyRequest
     *        The UpdateDomainContactPrivacy request includes the following elements.
     * @return A Java Future containing the result of the UpdateDomainContactPrivacy operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.UpdateDomainContactPrivacy
     */
    java.util.concurrent.Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(
            UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest);

    /**
     * <p>
     * This operation updates the specified domain contact's privacy setting. When the privacy option is enabled,
     * personal information such as postal or email address is hidden from the results of a public WHOIS query. The
     * privacy services are provided by the AWS registrar, Gandi. For more information, see the <a
     * href="http://www.gandi.net/domain/whois/?currency=USD&amp;amp;lang=en">Gandi privacy features</a>.
     * </p>
     * <p>
     * This operation only affects the privacy of the specified contact type (registrant, administrator, or tech).
     * Successful acceptance returns an operation ID that you can use with GetOperationDetail to track the progress and
     * completion of the action. If the request is not completed successfully, the domain registrant will be notified by
     * email.
     * </p>
     * 
     * @param updateDomainContactPrivacyRequest
     *        The UpdateDomainContactPrivacy request includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainContactPrivacy operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.UpdateDomainContactPrivacy
     */
    java.util.concurrent.Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(
            UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainContactPrivacyRequest, UpdateDomainContactPrivacyResult> asyncHandler);

    /**
     * <p>
     * This operation replaces the current set of name servers for the domain with the specified set of name servers. If
     * you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted
     * zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can use to track the progress and completion of
     * the action. If the request is not completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainNameserversRequest
     *        The UpdateDomainNameserver request includes the following elements.
     * @return A Java Future containing the result of the UpdateDomainNameservers operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.UpdateDomainNameservers
     */
    java.util.concurrent.Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(UpdateDomainNameserversRequest updateDomainNameserversRequest);

    /**
     * <p>
     * This operation replaces the current set of name servers for the domain with the specified set of name servers. If
     * you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted
     * zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can use to track the progress and completion of
     * the action. If the request is not completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainNameserversRequest
     *        The UpdateDomainNameserver request includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainNameservers operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.UpdateDomainNameservers
     */
    java.util.concurrent.Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(UpdateDomainNameserversRequest updateDomainNameserversRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainNameserversRequest, UpdateDomainNameserversResult> asyncHandler);

    /**
     * <p>
     * This operation adds or updates tags for a specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param updateTagsForDomainRequest
     *        The UpdateTagsForDomainRequest includes the following elements.
     * @return A Java Future containing the result of the UpdateTagsForDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.UpdateTagsForDomain
     */
    java.util.concurrent.Future<UpdateTagsForDomainResult> updateTagsForDomainAsync(UpdateTagsForDomainRequest updateTagsForDomainRequest);

    /**
     * <p>
     * This operation adds or updates tags for a specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param updateTagsForDomainRequest
     *        The UpdateTagsForDomainRequest includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTagsForDomain operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.UpdateTagsForDomain
     */
    java.util.concurrent.Future<UpdateTagsForDomainResult> updateTagsForDomainAsync(UpdateTagsForDomainRequest updateTagsForDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTagsForDomainRequest, UpdateTagsForDomainResult> asyncHandler);

    /**
     * <p>
     * This operation returns all the domain-related billing records for the current AWS account for a specified period
     * </p>
     * 
     * @param viewBillingRequest
     *        The ViewBilling request includes the following elements.
     * @return A Java Future containing the result of the ViewBilling operation returned by the service.
     * @sample AmazonRoute53DomainsAsync.ViewBilling
     */
    java.util.concurrent.Future<ViewBillingResult> viewBillingAsync(ViewBillingRequest viewBillingRequest);

    /**
     * <p>
     * This operation returns all the domain-related billing records for the current AWS account for a specified period
     * </p>
     * 
     * @param viewBillingRequest
     *        The ViewBilling request includes the following elements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ViewBilling operation returned by the service.
     * @sample AmazonRoute53DomainsAsyncHandler.ViewBilling
     */
    java.util.concurrent.Future<ViewBillingResult> viewBillingAsync(ViewBillingRequest viewBillingRequest,
            com.amazonaws.handlers.AsyncHandler<ViewBillingRequest, ViewBillingResult> asyncHandler);

}
