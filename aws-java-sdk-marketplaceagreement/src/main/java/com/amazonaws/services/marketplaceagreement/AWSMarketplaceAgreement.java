/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceagreement;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.marketplaceagreement.model.*;

/**
 * Interface for accessing Agreement Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplaceagreement.AbstractAWSMarketplaceAgreement} instead.
 * </p>
 * <p>
 * <p>
 * AWS Marketplace is a curated digital catalog that customers can use to find, buy, deploy, and manage third-party
 * software, data, and services to build solutions and run their businesses. The AWS Marketplace Agreement Service
 * provides an API interface that helps AWS Marketplace sellers manage their product-related agreements, including
 * listing, searching, and filtering agreements.
 * </p>
 * <p>
 * To manage agreements in AWS Marketplace, you must ensure that your AWS Identity and Access Management (IAM) policies
 * and roles are set up. The user must have the required policies/permissions that allow them to carry out the actions
 * in AWS:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DescribeAgreement</code> – Grants permission to users to obtain detailed meta data about any of their
 * agreements.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetAgreementTerms</code> – Grants permission to users to obtain details about the terms of an agreement.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SearchAgreements</code> – Grants permission to users to search through all their agreements.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMarketplaceAgreement {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "agreement-marketplace";

    /**
     * <p>
     * Provides details about an agreement, such as the proposer, acceptor, start date, and end date.
     * </p>
     * 
     * @param describeAgreementRequest
     * @return Result of the DescribeAgreement operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSMarketplaceAgreement.DescribeAgreement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/DescribeAgreement"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAgreementResult describeAgreement(DescribeAgreementRequest describeAgreementRequest);

    /**
     * <p>
     * Obtains details about the terms in an agreement that you participated in as proposer or acceptor.
     * </p>
     * <p>
     * The details include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TermType</code> – The type of term, such as <code>LegalTerm</code>, <code>RenewalTerm</code>, or
     * <code>ConfigurableUpfrontPricingTerm</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TermID</code> – The ID of the particular term, which is common between offer and agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TermPayload</code> – The key information contained in the term, such as the EULA for <code>LegalTerm</code>
     * or pricing and dimensions for various pricing terms, such as <code>ConfigurableUpfrontPricingTerm</code> or
     * <code>UsageBasedPricingTerm</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>Configuration</code> – The buyer/acceptor's selection at the time of agreement creation, such as the number
     * of units purchased for a dimension or setting the <code>EnableAutoRenew</code> flag.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAgreementTermsRequest
     * @return Result of the GetAgreementTerms operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSMarketplaceAgreement.GetAgreementTerms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/GetAgreementTerms"
     *      target="_top">AWS API Documentation</a>
     */
    GetAgreementTermsResult getAgreementTerms(GetAgreementTermsRequest getAgreementTermsRequest);

    /**
     * <p>
     * Searches across all agreements that a proposer or an acceptor has in AWS Marketplace. The search returns a list
     * of agreements with basic agreement information.
     * </p>
     * <p>
     * The following filter combinations are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>ResourceIdentifier</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>OfferId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>ResourceIdentifier</code> +
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>OfferId</code> +
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>ResourceType</code> +
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>ResourceType</code> + <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>OfferId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>OfferId</code> + <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>ResourceIdentifier</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>ResourceIdentifier</code> + <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> as <code>Proposer</code> + <code>AgreementType</code> + <code>AcceptorAccountId</code> +
     * <code>ResourceType</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param searchAgreementsRequest
     * @return Result of the SearchAgreements operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AWSMarketplaceAgreement.SearchAgreements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/SearchAgreements"
     *      target="_top">AWS API Documentation</a>
     */
    SearchAgreementsResult searchAgreements(SearchAgreementsRequest searchAgreementsRequest);

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
