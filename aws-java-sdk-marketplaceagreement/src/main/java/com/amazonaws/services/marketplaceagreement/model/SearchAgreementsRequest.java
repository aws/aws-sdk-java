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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/SearchAgreements"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAgreementsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog in which the agreement was created.
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * The filter name and value pair used to return a specific list of results.
     * </p>
     * <p>
     * The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceIdentifier</code> – The unique identifier of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     * <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the caller.
     * For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For agreements where the
     * caller is the acceptor, use the <code>Acceptor</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the agreement
     * token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     * <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>, <code>REPLACED</code>,
     * and <code>TERMINATED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     * <code>VendorInsightsAgreement</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum number of agreements to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to specify where to start pagination.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An object that contains the <code>SortBy</code> and <code>SortOrder</code> attributes.
     * </p>
     */
    private Sort sort;

    /**
     * <p>
     * The catalog in which the agreement was created.
     * </p>
     * 
     * @param catalog
     *        The catalog in which the agreement was created.
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The catalog in which the agreement was created.
     * </p>
     * 
     * @return The catalog in which the agreement was created.
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The catalog in which the agreement was created.
     * </p>
     * 
     * @param catalog
     *        The catalog in which the agreement was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsRequest withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * The filter name and value pair used to return a specific list of results.
     * </p>
     * <p>
     * The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceIdentifier</code> – The unique identifier of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     * <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the caller.
     * For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For agreements where the
     * caller is the acceptor, use the <code>Acceptor</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the agreement
     * token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     * <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>, <code>REPLACED</code>,
     * and <code>TERMINATED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     * <code>VendorInsightsAgreement</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filter name and value pair used to return a specific list of results.</p>
     *         <p>
     *         The following filters are supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ResourceIdentifier</code> – The unique identifier of the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     *         <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the
     *         caller. For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For
     *         agreements where the caller is the acceptor, use the <code>Acceptor</code> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the
     *         agreement token.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     *         <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>,
     *         <code>REPLACED</code>, and <code>TERMINATED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code>
     *         of an agreement.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code>
     *         of an agreement.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     *         <code>VendorInsightsAgreement</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filter name and value pair used to return a specific list of results.
     * </p>
     * <p>
     * The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceIdentifier</code> – The unique identifier of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     * <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the caller.
     * For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For agreements where the
     * caller is the acceptor, use the <code>Acceptor</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the agreement
     * token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     * <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>, <code>REPLACED</code>,
     * and <code>TERMINATED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     * <code>VendorInsightsAgreement</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filter name and value pair used to return a specific list of results.</p>
     *        <p>
     *        The following filters are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceIdentifier</code> – The unique identifier of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     *        <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the
     *        caller. For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For
     *        agreements where the caller is the acceptor, use the <code>Acceptor</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the
     *        agreement token.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     *        <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>,
     *        <code>REPLACED</code>, and <code>TERMINATED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code>
     *        of an agreement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code> of
     *        an agreement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     *        <code>VendorInsightsAgreement</code>.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filter name and value pair used to return a specific list of results.
     * </p>
     * <p>
     * The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceIdentifier</code> – The unique identifier of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     * <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the caller.
     * For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For agreements where the
     * caller is the acceptor, use the <code>Acceptor</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the agreement
     * token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     * <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>, <code>REPLACED</code>,
     * and <code>TERMINATED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     * <code>VendorInsightsAgreement</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filter name and value pair used to return a specific list of results.</p>
     *        <p>
     *        The following filters are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceIdentifier</code> – The unique identifier of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     *        <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the
     *        caller. For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For
     *        agreements where the caller is the acceptor, use the <code>Acceptor</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the
     *        agreement token.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     *        <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>,
     *        <code>REPLACED</code>, and <code>TERMINATED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code>
     *        of an agreement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code> of
     *        an agreement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     *        <code>VendorInsightsAgreement</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter name and value pair used to return a specific list of results.
     * </p>
     * <p>
     * The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceIdentifier</code> – The unique identifier of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     * <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the caller.
     * For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For agreements where the
     * caller is the acceptor, use the <code>Acceptor</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the agreement
     * token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     * <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>, <code>REPLACED</code>,
     * and <code>TERMINATED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code> of an
     * agreement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     * <code>VendorInsightsAgreement</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filter name and value pair used to return a specific list of results.</p>
     *        <p>
     *        The following filters are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceIdentifier</code> – The unique identifier of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> – Type of the resource, which is the product (<code>AmiProduct</code>,
     *        <code>ContainerProduct</code>, or <code>SaaSProduct</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PartyType</code> – The party type (either <code>Acceptor</code> or <code>Proposer</code>) of the
     *        caller. For agreements where the caller is the proposer, use the <code>Proposer</code> filter. For
     *        agreements where the caller is the acceptor, use the <code>Acceptor</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AcceptorAccountId</code> – The AWS account ID of the party accepting the agreement terms.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OfferId</code> – The unique identifier of the offer in which the terms are registered in the
     *        agreement token.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code> – The current status of the agreement. Values include <code>ACTIVE</code>,
     *        <code>ARCHIVED</code>, <code>CANCELLED</code>, <code>EXPIRED</code>, <code>RENEWED</code>,
     *        <code>REPLACED</code>, and <code>TERMINATED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BeforeEndTime</code> – A date used to filter agreements with a date before the <code>endTime</code>
     *        of an agreement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AfterEndTime</code> – A date used to filter agreements with a date after the <code>endTime</code> of
     *        an agreement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AgreementType</code> – The type of agreement. Values include <code>PurchaseAgreement</code> or
     *        <code>VendorInsightsAgreement</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of agreements to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of agreements to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of agreements to return in the response.
     * </p>
     * 
     * @return The maximum number of agreements to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of agreements to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of agreements to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start pagination.
     * </p>
     * 
     * @return A token to specify where to start pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An object that contains the <code>SortBy</code> and <code>SortOrder</code> attributes.
     * </p>
     * 
     * @param sort
     *        An object that contains the <code>SortBy</code> and <code>SortOrder</code> attributes.
     */

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * An object that contains the <code>SortBy</code> and <code>SortOrder</code> attributes.
     * </p>
     * 
     * @return An object that contains the <code>SortBy</code> and <code>SortOrder</code> attributes.
     */

    public Sort getSort() {
        return this.sort;
    }

    /**
     * <p>
     * An object that contains the <code>SortBy</code> and <code>SortOrder</code> attributes.
     * </p>
     * 
     * @param sort
     *        An object that contains the <code>SortBy</code> and <code>SortOrder</code> attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsRequest withSort(Sort sort) {
        setSort(sort);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAgreementsRequest == false)
            return false;
        SearchAgreementsRequest other = (SearchAgreementsRequest) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public SearchAgreementsRequest clone() {
        return (SearchAgreementsRequest) super.clone();
    }

}
