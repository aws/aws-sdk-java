/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.route53domains.model.*;

/**
 * Interface for accessing AmazonRoute53Domains asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * 
 */
public interface AmazonRoute53DomainsAsync extends AmazonRoute53Domains {
    /**
     * <p>
     * This operation updates the contact information for a particular
     * domain. Information for at least one contact (registrant,
     * administrator, or technical) must be supplied for update.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that
     * you can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant will be
     * notified by email.
     * </p>
     *
     * @param updateDomainContactRequest Container for the necessary
     *           parameters to execute the UpdateDomainContact operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainContact service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainContactResult> updateDomainContactAsync(UpdateDomainContactRequest updateDomainContactRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the contact information for a particular
     * domain. Information for at least one contact (registrant,
     * administrator, or technical) must be supplied for update.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that
     * you can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant will be
     * notified by email.
     * </p>
     *
     * @param updateDomainContactRequest Container for the necessary
     *           parameters to execute the UpdateDomainContact operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainContact service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainContactResult> updateDomainContactAsync(UpdateDomainContactRequest updateDomainContactRequest,
            AsyncHandler<UpdateDomainContactRequest, UpdateDomainContactResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation checks the availability of one domain name. You can
     * access this API without authenticating. Note that if the availability
     * status of a domain is pending, you must submit another request to
     * determine the availability of the domain name.
     * </p>
     *
     * @param checkDomainAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDomainAvailability operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         CheckDomainAvailability service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(CheckDomainAvailabilityRequest checkDomainAvailabilityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation checks the availability of one domain name. You can
     * access this API without authenticating. Note that if the availability
     * status of a domain is pending, you must submit another request to
     * determine the availability of the domain name.
     * </p>
     *
     * @param checkDomainAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDomainAvailability operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CheckDomainAvailability service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(CheckDomainAvailabilityRequest checkDomainAvailabilityRequest,
            AsyncHandler<CheckDomainAvailabilityRequest, CheckDomainAvailabilityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not
     * yet complete.
     * </p>
     *
     * @param listOperationsRequest Container for the necessary parameters to
     *           execute the ListOperations operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         ListOperations service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest listOperationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not
     * yet complete.
     * </p>
     *
     * @param listOperationsRequest Container for the necessary parameters to
     *           execute the ListOperations operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListOperations service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest listOperationsRequest,
            AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon
     * Route 53 for the current AWS account.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon
     * Route 53 for the current AWS account.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     *
     * @param getOperationDetailRequest Container for the necessary
     *           parameters to execute the GetOperationDetail operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         GetOperationDetail service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOperationDetailResult> getOperationDetailAsync(GetOperationDetailRequest getOperationDetailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     *
     * @param getOperationDetailRequest Container for the necessary
     *           parameters to execute the GetOperationDetail operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetOperationDetail service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOperationDetailResult> getOperationDetailAsync(GetOperationDetailRequest getOperationDetailRequest,
            AsyncHandler<GetOperationDetailRequest, GetOperationDetailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically
     * the <code>clientTransferProhibited</code> status) to allow domain
     * transfers. We recommend you refrain from performing this action unless
     * you intend to transfer the domain to a different registrar. Successful
     * submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param disableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the DisableDomainTransferLock operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         DisableDomainTransferLock service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(DisableDomainTransferLockRequest disableDomainTransferLockRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically
     * the <code>clientTransferProhibited</code> status) to allow domain
     * transfers. We recommend you refrain from performing this action unless
     * you intend to transfer the domain to a different registrar. Successful
     * submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param disableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the DisableDomainTransferLock operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableDomainTransferLock service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(DisableDomainTransferLockRequest disableDomainTransferLockRequest,
            AsyncHandler<DisableDomainTransferLockRequest, DisableDomainTransferLockResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation replaces the current set of name servers for the
     * domain with the specified set of name servers. If you use Amazon Route
     * 53 as your DNS service, specify the four name servers in the
     * delegation set for the hosted zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param updateDomainNameserversRequest Container for the necessary
     *           parameters to execute the UpdateDomainNameservers operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainNameservers service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(UpdateDomainNameserversRequest updateDomainNameserversRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation replaces the current set of name servers for the
     * domain with the specified set of name servers. If you use Amazon Route
     * 53 as your DNS service, specify the four name servers in the
     * delegation set for the hosted zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param updateDomainNameserversRequest Container for the necessary
     *           parameters to execute the UpdateDomainNameservers operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainNameservers service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(UpdateDomainNameserversRequest updateDomainNameserversRequest,
            AsyncHandler<UpdateDomainNameserversRequest, UpdateDomainNameserversResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to prevent domain
     * transfers. Successful submission returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param enableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the EnableDomainTransferLock operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         EnableDomainTransferLock service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(EnableDomainTransferLockRequest enableDomainTransferLockRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to prevent domain
     * transfers. Successful submission returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param enableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the EnableDomainTransferLock operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableDomainTransferLock service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(EnableDomainTransferLockRequest enableDomainTransferLockRequest,
            AsyncHandler<EnableDomainTransferLockRequest, EnableDomainTransferLockResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation registers a domain. Domains are registered by the AWS
     * registrar partner, Gandi. For some top-level domains (TLDs), this
     * operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * 
     * <ul>
     * <li>Creates a Amazon Route 53 hosted zone that has the same name as
     * the domain. Amazon Route 53 assigns four name servers to your hosted
     * zone and automatically updates your domain registration with the names
     * of these name servers.</li>
     * <li>Enables autorenew, so your domain registration will renew
     * automatically each year. We'll notify you in advance of the renewal
     * date so you can choose whether to renew the registration.</li>
     * <li>Optionally enables privacy protection, so WHOIS queries return
     * contact information for our registrar partner, Gandi, instead of the
     * information you entered for registrant, admin, and tech contacts.</li>
     * <li>If registration is successful, returns an operation ID that you
     * can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant is
     * notified by email.</li>
     * <li>Charges your AWS account an amount based on the top-level domain.
     * For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .</li>
     * 
     * </ul>
     *
     * @param registerDomainRequest Container for the necessary parameters to
     *           execute the RegisterDomain operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterDomain service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterDomainResult> registerDomainAsync(RegisterDomainRequest registerDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation registers a domain. Domains are registered by the AWS
     * registrar partner, Gandi. For some top-level domains (TLDs), this
     * operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * 
     * <ul>
     * <li>Creates a Amazon Route 53 hosted zone that has the same name as
     * the domain. Amazon Route 53 assigns four name servers to your hosted
     * zone and automatically updates your domain registration with the names
     * of these name servers.</li>
     * <li>Enables autorenew, so your domain registration will renew
     * automatically each year. We'll notify you in advance of the renewal
     * date so you can choose whether to renew the registration.</li>
     * <li>Optionally enables privacy protection, so WHOIS queries return
     * contact information for our registrar partner, Gandi, instead of the
     * information you entered for registrant, admin, and tech contacts.</li>
     * <li>If registration is successful, returns an operation ID that you
     * can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant is
     * notified by email.</li>
     * <li>Charges your AWS account an amount based on the top-level domain.
     * For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .</li>
     * 
     * </ul>
     *
     * @param registerDomainRequest Container for the necessary parameters to
     *           execute the RegisterDomain operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterDomain service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterDomainResult> registerDomainAsync(RegisterDomainRequest registerDomainRequest,
            AsyncHandler<RegisterDomainRequest, RegisterDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns detailed information about the domain. The
     * domain's contact information is also returned as part of the output.
     * </p>
     *
     * @param getDomainDetailRequest Container for the necessary parameters
     *           to execute the GetDomainDetail operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         GetDomainDetail service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDomainDetailResult> getDomainDetailAsync(GetDomainDetailRequest getDomainDetailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns detailed information about the domain. The
     * domain's contact information is also returned as part of the output.
     * </p>
     *
     * @param getDomainDetailRequest Container for the necessary parameters
     *           to execute the GetDomainDetail operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDomainDetail service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDomainDetailResult> getDomainDetailAsync(GetDomainDetailRequest getDomainDetailRequest,
            AsyncHandler<GetDomainDetailRequest, GetDomainDetailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a
     * domain to another registrar, you provide this value to the new
     * registrar.
     * </p>
     *
     * @param retrieveDomainAuthCodeRequest Container for the necessary
     *           parameters to execute the RetrieveDomainAuthCode operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveDomainAuthCode service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a
     * domain to another registrar, you provide this value to the new
     * registrar.
     * </p>
     *
     * @param retrieveDomainAuthCodeRequest Container for the necessary
     *           parameters to execute the RetrieveDomainAuthCode operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveDomainAuthCode service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest,
            AsyncHandler<RetrieveDomainAuthCodeRequest, RetrieveDomainAuthCodeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon
     * Route 53. Domains are registered by the AWS registrar, Gandi upon
     * transfer.
     * </p>
     * <p>
     * To transfer a domain, you need to meet all the domain transfer
     * criteria, including the following:
     * </p>
     * 
     * <ul>
     * <li>You must supply nameservers to transfer a domain.</li>
     * <li>You must disable the domain transfer lock (if any) before
     * transferring the domain.</li>
     * <li>A minimum of 60 days must have elapsed since the domain's
     * registration or last transfer.</li>
     * 
     * </ul>
     * <p>
     * We recommend you use the Amazon Route 53 as the DNS service for your
     * domain. You can create a hosted zone in Amazon Route 53 for your
     * current domain before transferring your domain.
     * </p>
     * <p>
     * Note that upon transfer, the domain duration is extended for a year
     * if not otherwise specified. Autorenew is enabled by default.
     * </p>
     * <p>
     * If the transfer is successful, this method returns an operation ID
     * that you can use to track the progress and completion of the action.
     * If the request is not completed successfully, the domain registrant
     * will be notified by email.
     * </p>
     * <p>
     * Transferring domains charges your AWS account an amount based on the
     * top-level domain. For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .
     * </p>
     *
     * @param transferDomainRequest Container for the necessary parameters to
     *           execute the TransferDomain operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         TransferDomain service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TransferDomainResult> transferDomainAsync(TransferDomainRequest transferDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon
     * Route 53. Domains are registered by the AWS registrar, Gandi upon
     * transfer.
     * </p>
     * <p>
     * To transfer a domain, you need to meet all the domain transfer
     * criteria, including the following:
     * </p>
     * 
     * <ul>
     * <li>You must supply nameservers to transfer a domain.</li>
     * <li>You must disable the domain transfer lock (if any) before
     * transferring the domain.</li>
     * <li>A minimum of 60 days must have elapsed since the domain's
     * registration or last transfer.</li>
     * 
     * </ul>
     * <p>
     * We recommend you use the Amazon Route 53 as the DNS service for your
     * domain. You can create a hosted zone in Amazon Route 53 for your
     * current domain before transferring your domain.
     * </p>
     * <p>
     * Note that upon transfer, the domain duration is extended for a year
     * if not otherwise specified. Autorenew is enabled by default.
     * </p>
     * <p>
     * If the transfer is successful, this method returns an operation ID
     * that you can use to track the progress and completion of the action.
     * If the request is not completed successfully, the domain registrant
     * will be notified by email.
     * </p>
     * <p>
     * Transferring domains charges your AWS account an amount based on the
     * top-level domain. For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .
     * </p>
     *
     * @param transferDomainRequest Container for the necessary parameters to
     *           execute the TransferDomain operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TransferDomain service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TransferDomainResult> transferDomainAsync(TransferDomainRequest transferDomainRequest,
            AsyncHandler<TransferDomainRequest, TransferDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the specified domain contact's privacy
     * setting. When the privacy option is enabled, personal information such
     * as postal or email address is hidden from the results of a public
     * WHOIS query. The privacy services are provided by the AWS registrar,
     * Gandi. For more information, see the
     * <a href="http://www.gandi.net/domain/whois/?currency=USD&lang=en"> Gandi privacy features </a>
     * .
     * </p>
     * <p>
     * This operation only affects the privacy of the specified contact type
     * (registrant, administrator, or tech). Successful acceptance returns an
     * operation ID that you can use with GetOperationDetail to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param updateDomainContactPrivacyRequest Container for the necessary
     *           parameters to execute the UpdateDomainContactPrivacy operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainContactPrivacy service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the specified domain contact's privacy
     * setting. When the privacy option is enabled, personal information such
     * as postal or email address is hidden from the results of a public
     * WHOIS query. The privacy services are provided by the AWS registrar,
     * Gandi. For more information, see the
     * <a href="http://www.gandi.net/domain/whois/?currency=USD&lang=en"> Gandi privacy features </a>
     * .
     * </p>
     * <p>
     * This operation only affects the privacy of the specified contact type
     * (registrant, administrator, or tech). Successful acceptance returns an
     * operation ID that you can use with GetOperationDetail to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param updateDomainContactPrivacyRequest Container for the necessary
     *           parameters to execute the UpdateDomainContactPrivacy operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainContactPrivacy service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest,
            AsyncHandler<UpdateDomainContactPrivacyRequest, UpdateDomainContactPrivacyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        