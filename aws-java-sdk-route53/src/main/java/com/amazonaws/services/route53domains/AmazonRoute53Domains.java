/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53domains.model.*;

/**
 * Interface for accessing Amazon Route 53 Domains.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53domains.AbstractAmazonRoute53Domains} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Route 53 API actions let you register domain names and perform related operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRoute53Domains {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53domains";

    /**
     * Overrides the default endpoint for this client ("https://route53domains.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "route53domains.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://route53domains.us-east-1.amazonaws.com"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "route53domains.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://route53domains.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonRoute53Domains#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * This operation checks the availability of one domain name. Note that if the availability status of a domain is
     * pending, you must submit another request to determine the availability of the domain name.
     * </p>
     * 
     * @param checkDomainAvailabilityRequest
     *        The CheckDomainAvailability request contains the following elements.
     * @return Result of the CheckDomainAvailability operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.CheckDomainAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/CheckDomainAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    CheckDomainAvailabilityResult checkDomainAvailability(CheckDomainAvailabilityRequest checkDomainAvailabilityRequest);

    /**
     * <p>
     * Checks whether a domain name can be transferred to Amazon Route 53.
     * </p>
     * 
     * @param checkDomainTransferabilityRequest
     *        The CheckDomainTransferability request contains the following elements.
     * @return Result of the CheckDomainTransferability operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.CheckDomainTransferability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/CheckDomainTransferability"
     *      target="_top">AWS API Documentation</a>
     */
    CheckDomainTransferabilityResult checkDomainTransferability(CheckDomainTransferabilityRequest checkDomainTransferabilityRequest);

    /**
     * <p>
     * This operation deletes the specified tags for a domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param deleteTagsForDomainRequest
     *        The DeleteTagsForDomainRequest includes the following elements.
     * @return Result of the DeleteTagsForDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.DeleteTagsForDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DeleteTagsForDomain"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTagsForDomainResult deleteTagsForDomain(DeleteTagsForDomainRequest deleteTagsForDomainRequest);

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for the specified domain.
     * </p>
     * 
     * @param disableDomainAutoRenewRequest
     * @return Result of the DisableDomainAutoRenew operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.DisableDomainAutoRenew
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DisableDomainAutoRenew"
     *      target="_top">AWS API Documentation</a>
     */
    DisableDomainAutoRenewResult disableDomainAutoRenew(DisableDomainAutoRenewRequest disableDomainAutoRenewRequest);

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
     * @return Result of the DisableDomainTransferLock operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.DisableDomainTransferLock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DisableDomainTransferLock"
     *      target="_top">AWS API Documentation</a>
     */
    DisableDomainTransferLockResult disableDomainTransferLock(DisableDomainTransferLockRequest disableDomainTransferLockRequest);

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the specified domain before the domain
     * registration expires. The cost of renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies,
     * see <a href="http://wiki.gandi.net/en/domains/renew#renewal_restoration_and_deletion_times">
     * "Renewal, restoration, and deletion times"</a> on the website for our registrar associate, Gandi. Amazon Route 53
     * requires that you renew before the end of the renewal period that is listed on the Gandi website so we can
     * complete processing before the deadline.
     * </p>
     * 
     * @param enableDomainAutoRenewRequest
     * @return Result of the EnableDomainAutoRenew operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @sample AmazonRoute53Domains.EnableDomainAutoRenew
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/EnableDomainAutoRenew"
     *      target="_top">AWS API Documentation</a>
     */
    EnableDomainAutoRenewResult enableDomainAutoRenew(EnableDomainAutoRenewRequest enableDomainAutoRenewRequest);

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the <code>clientTransferProhibited</code>
     * status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed successfully, the domain registrant will
     * be notified by email.
     * </p>
     * 
     * @param enableDomainTransferLockRequest
     *        A request to set the transfer lock for the specified domain.
     * @return Result of the EnableDomainTransferLock operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.EnableDomainTransferLock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/EnableDomainTransferLock"
     *      target="_top">AWS API Documentation</a>
     */
    EnableDomainTransferLockResult enableDomainTransferLock(EnableDomainTransferLockRequest enableDomainTransferLockRequest);

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
     * @return Result of the GetContactReachabilityStatus operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.GetContactReachabilityStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetContactReachabilityStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest getContactReachabilityStatusRequest);

    /**
     * <p>
     * This operation returns detailed information about a specified domain that is associated with the current AWS
     * account. Contact information for the domain is also returned as part of the output.
     * </p>
     * 
     * @param getDomainDetailRequest
     *        The GetDomainDetail request includes the following element.
     * @return Result of the GetDomainDetail operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.GetDomainDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetDomainDetail" target="_top">AWS
     *      API Documentation</a>
     */
    GetDomainDetailResult getDomainDetail(GetDomainDetailRequest getDomainDetailRequest);

    /**
     * <p>
     * The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a
     * domain name or simply a word or phrase (without spaces).
     * </p>
     * 
     * @param getDomainSuggestionsRequest
     * @return Result of the GetDomainSuggestions operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.GetDomainSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetDomainSuggestions"
     *      target="_top">AWS API Documentation</a>
     */
    GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest getDomainSuggestionsRequest);

    /**
     * <p>
     * This operation returns the current status of an operation that is not completed.
     * </p>
     * 
     * @param getOperationDetailRequest
     *        The <a>GetOperationDetail</a> request includes the following element.
     * @return Result of the GetOperationDetail operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @sample AmazonRoute53Domains.GetOperationDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetOperationDetail"
     *      target="_top">AWS API Documentation</a>
     */
    GetOperationDetailResult getOperationDetail(GetOperationDetailRequest getOperationDetailRequest);

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.
     * </p>
     * 
     * @param listDomainsRequest
     *        The ListDomains request includes the following elements.
     * @return Result of the ListDomains operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @sample AmazonRoute53Domains.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * Simplified method form for invoking the ListDomains operation.
     *
     * @see #listDomains(ListDomainsRequest)
     */
    ListDomainsResult listDomains();

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not yet complete.
     * </p>
     * 
     * @param listOperationsRequest
     *        The ListOperations request includes the following elements.
     * @return Result of the ListOperations operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @sample AmazonRoute53Domains.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListOperations" target="_top">AWS
     *      API Documentation</a>
     */
    ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest);

    /**
     * Simplified method form for invoking the ListOperations operation.
     *
     * @see #listOperations(ListOperationsRequest)
     */
    ListOperationsResult listOperations();

    /**
     * <p>
     * This operation returns all of the tags that are associated with the specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param listTagsForDomainRequest
     *        The ListTagsForDomainRequest includes the following elements.
     * @return Result of the ListTagsForDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.ListTagsForDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ListTagsForDomain"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForDomainResult listTagsForDomain(ListTagsForDomainRequest listTagsForDomainRequest);

    /**
     * <p>
     * This operation registers a domain. Domains are registered either by Amazon Registrar (for .com, .net, and .org
     * domains) or by our registrar associate, Gandi (for all other domains). For some top-level domains (TLDs), this
     * operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a Amazon Route 53 hosted zone that has the same name as the domain. Amazon Route 53 assigns four name
     * servers to your hosted zone and automatically updates your domain registration with the names of these name
     * servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enables autorenew, so your domain registration will renew automatically each year. We'll notify you in advance of
     * the renewal date so you can choose whether to renew the registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optionally enables privacy protection, so WHOIS queries return contact information either for Amazon Registrar
     * (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you don't
     * enable privacy protection, WHOIS queries return the information that you entered for the registrant, admin, and
     * tech contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * If registration is successful, returns an operation ID that you can use to track the progress and completion of
     * the action. If the request is not completed successfully, the domain registrant is notified by email.
     * </p>
     * </li>
     * <li>
     * <p>
     * Charges your AWS account an amount based on the top-level domain. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerDomainRequest
     *        The RegisterDomain request includes the following elements.
     * @return Result of the RegisterDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws DomainLimitExceededException
     *         The number of domains has exceeded the allowed threshold for the account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @sample AmazonRoute53Domains.RegisterDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RegisterDomain" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterDomainResult registerDomain(RegisterDomainRequest registerDomainRequest);

    /**
     * <p>
     * This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to
     * your AWS account.
     * </p>
     * <p>
     * We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete
     * domains before the expiration date if you haven't renewed far enough in advance. For more information about
     * renewing domain registration, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-renew.html">Renewing Registration for a
     * Domain</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param renewDomainRequest
     *        A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current
     *        expiration year.
     * @return Result of the RenewDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @sample AmazonRoute53Domains.RenewDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RenewDomain" target="_top">AWS API
     *      Documentation</a>
     */
    RenewDomainResult renewDomain(RenewDomainRequest renewDomainRequest);

    /**
     * <p>
     * For operations that require confirmation that the email address for the registrant contact is valid, such as
     * registering a new domain, this operation resends the confirmation email to the current email address for the
     * registrant contact.
     * </p>
     * 
     * @param resendContactReachabilityEmailRequest
     * @return Result of the ResendContactReachabilityEmail operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.ResendContactReachabilityEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ResendContactReachabilityEmail"
     *      target="_top">AWS API Documentation</a>
     */
    ResendContactReachabilityEmailResult resendContactReachabilityEmail(ResendContactReachabilityEmailRequest resendContactReachabilityEmailRequest);

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this
     * value to the new registrar.
     * </p>
     * 
     * @param retrieveDomainAuthCodeRequest
     *        A request for the authorization code for the specified domain. To transfer a domain to another registrar,
     *        you provide this value to the new registrar.
     * @return Result of the RetrieveDomainAuthCode operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.RetrieveDomainAuthCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RetrieveDomainAuthCode"
     *      target="_top">AWS API Documentation</a>
     */
    RetrieveDomainAuthCodeResult retrieveDomainAuthCode(RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest);

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon Route 53. When the transfer is complete, the
     * domain is registered either with Amazon Registrar (for .com, .net, and .org domains) or with our registrar
     * associate, Gandi (for all other TLDs).
     * </p>
     * <p>
     * For transfer requirements, a detailed procedure, and information about viewing the status of a domain transfer,
     * see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-to-route-53.html">Transferring
     * Registration for a Domain to Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the domain, we highly recommend that you
     * consider transferring your DNS service to Amazon Route 53 or to another DNS service provider before you transfer
     * your registration. Some registrars provide free DNS service when you purchase a domain registration. When you
     * transfer the registration, the previous registrar will not renew your domain registration and could end your DNS
     * service at any time.
     * </p>
     * <important>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the domain and you don't transfer DNS
     * service to another provider, your website, email, and the web applications associated with the domain might
     * become unavailable.
     * </p>
     * </important>
     * <p>
     * If the transfer is successful, this method returns an operation ID that you can use to track the progress and
     * completion of the action. If the transfer doesn't complete successfully, the domain registrant will be notified
     * by email.
     * </p>
     * 
     * @param transferDomainRequest
     *        The TransferDomain request includes the following elements.
     * @return Result of the TransferDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws DomainLimitExceededException
     *         The number of domains has exceeded the allowed threshold for the account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @sample AmazonRoute53Domains.TransferDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/TransferDomain" target="_top">AWS
     *      API Documentation</a>
     */
    TransferDomainResult transferDomain(TransferDomainRequest transferDomainRequest);

    /**
     * <p>
     * This operation updates the contact information for a particular domain. You must specify information for at least
     * one contact: registrant, administrator, or technical.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that you can use to track the progress and
     * completion of the action. If the request is not completed successfully, the domain registrant will be notified by
     * email.
     * </p>
     * 
     * @param updateDomainContactRequest
     *        The UpdateDomainContact request includes the following elements.
     * @return Result of the UpdateDomainContact operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.UpdateDomainContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateDomainContact"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDomainContactResult updateDomainContact(UpdateDomainContactRequest updateDomainContactRequest);

    /**
     * <p>
     * This operation updates the specified domain contact's privacy setting. When privacy protection is enabled,
     * contact information such as email address is replaced either with contact information for Amazon Registrar (for
     * .com, .net, and .org domains) or with contact information for our registrar associate, Gandi.
     * </p>
     * <p>
     * This operation affects only the contact information for the specified contact type (registrant, administrator, or
     * tech). If the request succeeds, Amazon Route 53 returns an operation ID that you can use with
     * <a>GetOperationDetail</a> to track the progress and completion of the action. If the request doesn't complete
     * successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainContactPrivacyRequest
     *        The UpdateDomainContactPrivacy request includes the following elements.
     * @return Result of the UpdateDomainContactPrivacy operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.UpdateDomainContactPrivacy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateDomainContactPrivacy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDomainContactPrivacyResult updateDomainContactPrivacy(UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest);

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
     *        Replaces the current set of name servers for the domain with the specified set of name servers. If you use
     *        Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted
     *        zone for the domain.</p>
     *        <p>
     *        If successful, this operation returns an operation ID that you can use to track the progress and
     *        completion of the action. If the request is not completed successfully, the domain registrant will be
     *        notified by email.
     * @return Result of the UpdateDomainNameservers operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.UpdateDomainNameservers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateDomainNameservers"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDomainNameserversResult updateDomainNameservers(UpdateDomainNameserversRequest updateDomainNameserversRequest);

    /**
     * <p>
     * This operation adds or updates tags for a specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
     * operations.
     * </p>
     * 
     * @param updateTagsForDomainRequest
     *        The UpdateTagsForDomainRequest includes the following elements.
     * @return Result of the UpdateTagsForDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain (TLD).
     * @sample AmazonRoute53Domains.UpdateTagsForDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/UpdateTagsForDomain"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTagsForDomainResult updateTagsForDomain(UpdateTagsForDomainRequest updateTagsForDomainRequest);

    /**
     * <p>
     * Returns all the domain-related billing records for the current AWS account for a specified period
     * </p>
     * 
     * @param viewBillingRequest
     *        The ViewBilling request includes the following elements.
     * @return Result of the ViewBilling operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an
     *         operation that is already completed. For a domain name, it might not be a valid domain name or belong to
     *         the requester account.
     * @sample AmazonRoute53Domains.ViewBilling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ViewBilling" target="_top">AWS API
     *      Documentation</a>
     */
    ViewBillingResult viewBilling(ViewBillingRequest viewBillingRequest);

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
