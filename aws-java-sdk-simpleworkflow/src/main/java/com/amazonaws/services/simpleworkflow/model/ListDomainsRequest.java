/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#listDomains(ListDomainsRequest) ListDomains operation}.
 * <p>
 * Returns the list of domains registered in the account. The results may
 * be split into multiple pages. To retrieve subsequent pages, make the
 * call again using the nextPageToken returned by the initial call.
 * </p>
 * <p>
 * <b>NOTE:</b> This operation is eventually consistent. The results are
 * best effort and may not exactly reflect recent updates and changes.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this action's access to Amazon SWF
 * resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit
 * the action to only specified domains. The element must be set to
 * <code>arn:aws:swf::AccountID:domain/*</code> , where <i>AccountID</i>
 * is the account ID, with no dashes.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to
 * call this action.</li>
 * <li>You cannot use an IAM policy to constrain this action's
 * parameters.</li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the
 * action, or the parameter values fall outside the specified
 * constraints, the action fails. The associated event attribute's
 * <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For
 * details and example IAM policies, see
 * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#listDomains(ListDomainsRequest)
 */
public class ListDomainsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged. <p>The configured
     * <code>maximumPageSize</code> determines how many results can be
     * returned in a single call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * Specifies the registration status of the domains to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     */
    private String registrationStatus;

    /**
     * The maximum number of results that will be returned per call.
     * <code>nextPageToken</code> can be used to obtain futher pages of
     * results. The default is 1000, which is the maximum allowed page size.
     * You can, however, specify a page size <i>smaller</i> than the maximum.
     * <p>This is an upper limit only; the actual number of results returned
     * per call may be fewer than the specified maximum.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer maximumPageSize;

    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default, the results are returned in ascending alphabetical order
     * by <code>name</code> of the domains.
     */
    private Boolean reverseOrder;

    /**
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged. <p>The configured
     * <code>maximumPageSize</code> determines how many results can be
     * returned in a single call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return If a <code>NextPageToken</code> was returned by a previous call, there
     *         are more results available. To retrieve the next page of results, make
     *         the call again using the returned token in <code>nextPageToken</code>.
     *         Keep all other arguments unchanged. <p>The configured
     *         <code>maximumPageSize</code> determines how many results can be
     *         returned in a single call.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged. <p>The configured
     * <code>maximumPageSize</code> determines how many results can be
     * returned in a single call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If a <code>NextPageToken</code> was returned by a previous call, there
     *         are more results available. To retrieve the next page of results, make
     *         the call again using the returned token in <code>nextPageToken</code>.
     *         Keep all other arguments unchanged. <p>The configured
     *         <code>maximumPageSize</code> determines how many results can be
     *         returned in a single call.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged. <p>The configured
     * <code>maximumPageSize</code> determines how many results can be
     * returned in a single call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If a <code>NextPageToken</code> was returned by a previous call, there
     *         are more results available. To retrieve the next page of results, make
     *         the call again using the returned token in <code>nextPageToken</code>.
     *         Keep all other arguments unchanged. <p>The configured
     *         <code>maximumPageSize</code> determines how many results can be
     *         returned in a single call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDomainsRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * Specifies the registration status of the domains to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @return Specifies the registration status of the domains to list.
     *
     * @see RegistrationStatus
     */
    public String getRegistrationStatus() {
        return registrationStatus;
    }
    
    /**
     * Specifies the registration status of the domains to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param registrationStatus Specifies the registration status of the domains to list.
     *
     * @see RegistrationStatus
     */
    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
    
    /**
     * Specifies the registration status of the domains to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param registrationStatus Specifies the registration status of the domains to list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RegistrationStatus
     */
    public ListDomainsRequest withRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * Specifies the registration status of the domains to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param registrationStatus Specifies the registration status of the domains to list.
     *
     * @see RegistrationStatus
     */
    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
    }
    
    /**
     * Specifies the registration status of the domains to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param registrationStatus Specifies the registration status of the domains to list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RegistrationStatus
     */
    public ListDomainsRequest withRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
        return this;
    }

    /**
     * The maximum number of results that will be returned per call.
     * <code>nextPageToken</code> can be used to obtain futher pages of
     * results. The default is 1000, which is the maximum allowed page size.
     * You can, however, specify a page size <i>smaller</i> than the maximum.
     * <p>This is an upper limit only; the actual number of results returned
     * per call may be fewer than the specified maximum.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return The maximum number of results that will be returned per call.
     *         <code>nextPageToken</code> can be used to obtain futher pages of
     *         results. The default is 1000, which is the maximum allowed page size.
     *         You can, however, specify a page size <i>smaller</i> than the maximum.
     *         <p>This is an upper limit only; the actual number of results returned
     *         per call may be fewer than the specified maximum.
     */
    public Integer getMaximumPageSize() {
        return maximumPageSize;
    }
    
    /**
     * The maximum number of results that will be returned per call.
     * <code>nextPageToken</code> can be used to obtain futher pages of
     * results. The default is 1000, which is the maximum allowed page size.
     * You can, however, specify a page size <i>smaller</i> than the maximum.
     * <p>This is an upper limit only; the actual number of results returned
     * per call may be fewer than the specified maximum.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize The maximum number of results that will be returned per call.
     *         <code>nextPageToken</code> can be used to obtain futher pages of
     *         results. The default is 1000, which is the maximum allowed page size.
     *         You can, however, specify a page size <i>smaller</i> than the maximum.
     *         <p>This is an upper limit only; the actual number of results returned
     *         per call may be fewer than the specified maximum.
     */
    public void setMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
    }
    
    /**
     * The maximum number of results that will be returned per call.
     * <code>nextPageToken</code> can be used to obtain futher pages of
     * results. The default is 1000, which is the maximum allowed page size.
     * You can, however, specify a page size <i>smaller</i> than the maximum.
     * <p>This is an upper limit only; the actual number of results returned
     * per call may be fewer than the specified maximum.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize The maximum number of results that will be returned per call.
     *         <code>nextPageToken</code> can be used to obtain futher pages of
     *         results. The default is 1000, which is the maximum allowed page size.
     *         You can, however, specify a page size <i>smaller</i> than the maximum.
     *         <p>This is an upper limit only; the actual number of results returned
     *         per call may be fewer than the specified maximum.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDomainsRequest withMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }

    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default, the results are returned in ascending alphabetical order
     * by <code>name</code> of the domains.
     *
     * @return When set to <code>true</code>, returns the results in reverse order.
     *         By default, the results are returned in ascending alphabetical order
     *         by <code>name</code> of the domains.
     */
    public Boolean isReverseOrder() {
        return reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default, the results are returned in ascending alphabetical order
     * by <code>name</code> of the domains.
     *
     * @param reverseOrder When set to <code>true</code>, returns the results in reverse order.
     *         By default, the results are returned in ascending alphabetical order
     *         by <code>name</code> of the domains.
     */
    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default, the results are returned in ascending alphabetical order
     * by <code>name</code> of the domains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reverseOrder When set to <code>true</code>, returns the results in reverse order.
     *         By default, the results are returned in ascending alphabetical order
     *         by <code>name</code> of the domains.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDomainsRequest withReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
        return this;
    }

    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default, the results are returned in ascending alphabetical order
     * by <code>name</code> of the domains.
     *
     * @return When set to <code>true</code>, returns the results in reverse order.
     *         By default, the results are returned in ascending alphabetical order
     *         by <code>name</code> of the domains.
     */
    public Boolean getReverseOrder() {
        return reverseOrder;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() + ",");
        if (getRegistrationStatus() != null) sb.append("RegistrationStatus: " + getRegistrationStatus() + ",");
        if (getMaximumPageSize() != null) sb.append("MaximumPageSize: " + getMaximumPageSize() + ",");
        if (isReverseOrder() != null) sb.append("ReverseOrder: " + isReverseOrder() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        hashCode = prime * hashCode + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode()); 
        hashCode = prime * hashCode + ((getMaximumPageSize() == null) ? 0 : getMaximumPageSize().hashCode()); 
        hashCode = prime * hashCode + ((isReverseOrder() == null) ? 0 : isReverseOrder().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDomainsRequest == false) return false;
        ListDomainsRequest other = (ListDomainsRequest)obj;
        
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        if (other.getRegistrationStatus() == null ^ this.getRegistrationStatus() == null) return false;
        if (other.getRegistrationStatus() != null && other.getRegistrationStatus().equals(this.getRegistrationStatus()) == false) return false; 
        if (other.getMaximumPageSize() == null ^ this.getMaximumPageSize() == null) return false;
        if (other.getMaximumPageSize() != null && other.getMaximumPageSize().equals(this.getMaximumPageSize()) == false) return false; 
        if (other.isReverseOrder() == null ^ this.isReverseOrder() == null) return false;
        if (other.isReverseOrder() != null && other.isReverseOrder().equals(this.isReverseOrder()) == false) return false; 
        return true;
    }
    
    @Override
    public ListDomainsRequest clone() {
        
            return (ListDomainsRequest) super.clone();
    }

}
    