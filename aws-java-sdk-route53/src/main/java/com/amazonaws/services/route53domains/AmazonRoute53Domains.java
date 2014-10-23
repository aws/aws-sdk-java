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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.route53domains.model.*;

/**
 * Interface for accessing AmazonRoute53Domains.
 * 
 */
public interface AmazonRoute53Domains {

    /**
     * Overrides the default endpoint for this client ("https://route53domains.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "route53domains.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://route53domains.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "route53domains.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://route53domains.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonRoute53Domains#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
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
     *           parameters to execute the UpdateDomainContact service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the UpdateDomainContact service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDomainContactResult updateDomainContact(UpdateDomainContactRequest updateDomainContactRequest) 
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
     *           parameters to execute the CheckDomainAvailability service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the CheckDomainAvailability service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws UnsupportedTLDException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CheckDomainAvailabilityResult checkDomainAvailability(CheckDomainAvailabilityRequest checkDomainAvailabilityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the
     * specified domain before the domain registration expires. The cost of
     * renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD.
     * For a list of TLDs and their renewal policies, see "Renewal,
     * restoration, and deletion times"
     * iki.gandi.net/en/domains/renew#renewal_restoration_and_deletion_times)
     * on the website for our registrar partner, Gandi. Route 53 requires
     * that you renew before the end of the renewal period that is listed on
     * the Gandi website so we can complete processing before the deadline.
     * </p>
     *
     * @param enableDomainAutoRenewRequest Container for the necessary
     *           parameters to execute the EnableDomainAutoRenew service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the EnableDomainAutoRenew service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableDomainAutoRenewResult enableDomainAutoRenew(EnableDomainAutoRenewRequest enableDomainAutoRenewRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not
     * yet complete.
     * </p>
     *
     * @param listOperationsRequest Container for the necessary parameters to
     *           execute the ListOperations service method on AmazonRoute53Domains.
     * 
     * @return The response from the ListOperations service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon
     * Route 53 for the current AWS account.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains service method on AmazonRoute53Domains.
     * 
     * @return The response from the ListDomains service method, as returned
     *         by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     *
     * @param getOperationDetailRequest Container for the necessary
     *           parameters to execute the GetOperationDetail service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the GetOperationDetail service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetOperationDetailResult getOperationDetail(GetOperationDetailRequest getOperationDetailRequest) 
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
     *           parameters to execute the DisableDomainTransferLock service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the DisableDomainTransferLock service
     *         method, as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableDomainTransferLockResult disableDomainTransferLock(DisableDomainTransferLockRequest disableDomainTransferLockRequest) 
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
     *           parameters to execute the UpdateDomainNameservers service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the UpdateDomainNameservers service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDomainNameserversResult updateDomainNameservers(UpdateDomainNameserversRequest updateDomainNameserversRequest) 
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
     *           parameters to execute the EnableDomainTransferLock service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the EnableDomainTransferLock service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableDomainTransferLockResult enableDomainTransferLock(EnableDomainTransferLockRequest enableDomainTransferLockRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for
     * the specified domain.
     * </p>
     * <p>
     * <b>NOTE:</b>Caution! Amazon Route 53 doesn't have a manual renewal
     * process, so if you disable automatic renewal, registration for the
     * domain will not be renewed when the expiration date passes, and you
     * will lose control of the domain name.
     * </p>
     *
     * @param disableDomainAutoRenewRequest Container for the necessary
     *           parameters to execute the DisableDomainAutoRenew service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the DisableDomainAutoRenew service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableDomainAutoRenewResult disableDomainAutoRenew(DisableDomainAutoRenewRequest disableDomainAutoRenewRequest) 
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
     *           execute the RegisterDomain service method on AmazonRoute53Domains.
     * 
     * @return The response from the RegisterDomain service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws UnsupportedTLDException
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws DomainLimitExceededException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterDomainResult registerDomain(RegisterDomainRequest registerDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns detailed information about the domain. The
     * domain's contact information is also returned as part of the output.
     * </p>
     *
     * @param getDomainDetailRequest Container for the necessary parameters
     *           to execute the GetDomainDetail service method on AmazonRoute53Domains.
     * 
     * @return The response from the GetDomainDetail service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDomainDetailResult getDomainDetail(GetDomainDetailRequest getDomainDetailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a
     * domain to another registrar, you provide this value to the new
     * registrar.
     * </p>
     *
     * @param retrieveDomainAuthCodeRequest Container for the necessary
     *           parameters to execute the RetrieveDomainAuthCode service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the RetrieveDomainAuthCode service method,
     *         as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RetrieveDomainAuthCodeResult retrieveDomainAuthCode(RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest) 
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
     *           execute the TransferDomain service method on AmazonRoute53Domains.
     * 
     * @return The response from the TransferDomain service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws UnsupportedTLDException
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws DomainLimitExceededException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TransferDomainResult transferDomain(TransferDomainRequest transferDomainRequest) 
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
     *           parameters to execute the UpdateDomainContactPrivacy service method on
     *           AmazonRoute53Domains.
     * 
     * @return The response from the UpdateDomainContactPrivacy service
     *         method, as returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDomainContactPrivacyResult updateDomainContactPrivacy(UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not
     * yet complete.
     * </p>
     * 
     * @return The response from the ListOperations service method, as
     *         returned by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListOperationsResult listOperations() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * This operation returns all the domain names registered with Amazon
     * Route 53 for the current AWS account.
     * </p>
     * 
     * @return The response from the ListDomains service method, as returned
     *         by AmazonRoute53Domains.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainsResult listDomains() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        