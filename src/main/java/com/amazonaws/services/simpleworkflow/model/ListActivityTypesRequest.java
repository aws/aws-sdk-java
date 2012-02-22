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
package com.amazonaws.services.simpleworkflow.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#listActivityTypes(ListActivityTypesRequest) ListActivityTypes operation}.
 * <p>
 * Returns information about all activities registered in the specified
 * domain that match the specified name and registration status. The
 * result includes information like creation date, current status of the
 * activity, etc. The results may be split into multiple pages. To
 * retrieve subsequent pages, make the call again using the
 * <code>nextPageToken</code> returned by the initial call.
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#listActivityTypes(ListActivityTypesRequest)
 */
public class ListActivityTypesRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain in which the activity types have been
     * registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * If specified, only lists the activity types that have this name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * Specifies the registration status of the activity types to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     */
    private String registrationStatus;

    /**
     * If on a previous call to this method a <code>NextResultToken</code>
     * was returned, the results have more than one page. To get the next
     * page of results, repeat the call with the <code>nextPageToken</code>
     * and keep all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * The maximum number of results returned in each page. The default is
     * 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer maximumPageSize;

    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in ascending alphabetical order of
     * the <code>name</code> of the activity types.
     */
    private Boolean reverseOrder;

    /**
     * The name of the domain in which the activity types have been
     * registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain in which the activity types have been
     *         registered.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain in which the activity types have been
     * registered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which the activity types have been
     *         registered.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain in which the activity types have been
     * registered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which the activity types have been
     *         registered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListActivityTypesRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    
    /**
     * If specified, only lists the activity types that have this name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return If specified, only lists the activity types that have this name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * If specified, only lists the activity types that have this name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name If specified, only lists the activity types that have this name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * If specified, only lists the activity types that have this name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name If specified, only lists the activity types that have this name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListActivityTypesRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Specifies the registration status of the activity types to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @return Specifies the registration status of the activity types to list.
     *
     * @see RegistrationStatus
     */
    public String getRegistrationStatus() {
        return registrationStatus;
    }
    
    /**
     * Specifies the registration status of the activity types to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param registrationStatus Specifies the registration status of the activity types to list.
     *
     * @see RegistrationStatus
     */
    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
    
    /**
     * Specifies the registration status of the activity types to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param registrationStatus Specifies the registration status of the activity types to list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see RegistrationStatus
     */
    public ListActivityTypesRequest withRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }
    
    
    /**
     * Specifies the registration status of the activity types to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param registrationStatus Specifies the registration status of the activity types to list.
     *
     * @see RegistrationStatus
     */
    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
    }
    
    /**
     * Specifies the registration status of the activity types to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param registrationStatus Specifies the registration status of the activity types to list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see RegistrationStatus
     */
    public ListActivityTypesRequest withRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
        return this;
    }
    
    /**
     * If on a previous call to this method a <code>NextResultToken</code>
     * was returned, the results have more than one page. To get the next
     * page of results, repeat the call with the <code>nextPageToken</code>
     * and keep all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return If on a previous call to this method a <code>NextResultToken</code>
     *         was returned, the results have more than one page. To get the next
     *         page of results, repeat the call with the <code>nextPageToken</code>
     *         and keep all other arguments unchanged.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * If on a previous call to this method a <code>NextResultToken</code>
     * was returned, the results have more than one page. To get the next
     * page of results, repeat the call with the <code>nextPageToken</code>
     * and keep all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If on a previous call to this method a <code>NextResultToken</code>
     *         was returned, the results have more than one page. To get the next
     *         page of results, repeat the call with the <code>nextPageToken</code>
     *         and keep all other arguments unchanged.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * If on a previous call to this method a <code>NextResultToken</code>
     * was returned, the results have more than one page. To get the next
     * page of results, repeat the call with the <code>nextPageToken</code>
     * and keep all other arguments unchanged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If on a previous call to this method a <code>NextResultToken</code>
     *         was returned, the results have more than one page. To get the next
     *         page of results, repeat the call with the <code>nextPageToken</code>
     *         and keep all other arguments unchanged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListActivityTypesRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    
    /**
     * The maximum number of results returned in each page. The default is
     * 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return The maximum number of results returned in each page. The default is
     *         100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     */
    public Integer getMaximumPageSize() {
        return maximumPageSize;
    }
    
    /**
     * The maximum number of results returned in each page. The default is
     * 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize The maximum number of results returned in each page. The default is
     *         100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     */
    public void setMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
    }
    
    /**
     * The maximum number of results returned in each page. The default is
     * 100, but the caller can override this value to a page size
     * <i>smaller</i> than the default. You cannot specify a page size
     * greater than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param maximumPageSize The maximum number of results returned in each page. The default is
     *         100, but the caller can override this value to a page size
     *         <i>smaller</i> than the default. You cannot specify a page size
     *         greater than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListActivityTypesRequest withMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in ascending alphabetical order of
     * the <code>name</code> of the activity types.
     *
     * @return When set to <code>true</code>, returns the results in reverse order.
     *         By default the results are returned in ascending alphabetical order of
     *         the <code>name</code> of the activity types.
     */
    public Boolean isReverseOrder() {
        return reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in ascending alphabetical order of
     * the <code>name</code> of the activity types.
     *
     * @param reverseOrder When set to <code>true</code>, returns the results in reverse order.
     *         By default the results are returned in ascending alphabetical order of
     *         the <code>name</code> of the activity types.
     */
    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in ascending alphabetical order of
     * the <code>name</code> of the activity types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reverseOrder When set to <code>true</code>, returns the results in reverse order.
     *         By default the results are returned in ascending alphabetical order of
     *         the <code>name</code> of the activity types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListActivityTypesRequest withReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
        return this;
    }
    
    
    /**
     * When set to <code>true</code>, returns the results in reverse order.
     * By default the results are returned in ascending alphabetical order of
     * the <code>name</code> of the activity types.
     *
     * @return When set to <code>true</code>, returns the results in reverse order.
     *         By default the results are returned in ascending alphabetical order of
     *         the <code>name</code> of the activity types.
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
        if (domain != null) sb.append("Domain: " + domain + ", ");
        if (name != null) sb.append("Name: " + name + ", ");
        if (registrationStatus != null) sb.append("RegistrationStatus: " + registrationStatus + ", ");
        if (nextPageToken != null) sb.append("NextPageToken: " + nextPageToken + ", ");
        if (maximumPageSize != null) sb.append("MaximumPageSize: " + maximumPageSize + ", ");
        if (reverseOrder != null) sb.append("ReverseOrder: " + reverseOrder + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaximumPageSize() == null) ? 0 : getMaximumPageSize().hashCode()); 
        hashCode = prime * hashCode + ((isReverseOrder() == null) ? 0 : isReverseOrder().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListActivityTypesRequest == false) return false;
        ListActivityTypesRequest other = (ListActivityTypesRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getRegistrationStatus() == null ^ this.getRegistrationStatus() == null) return false;
        if (other.getRegistrationStatus() != null && other.getRegistrationStatus().equals(this.getRegistrationStatus()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        if (other.getMaximumPageSize() == null ^ this.getMaximumPageSize() == null) return false;
        if (other.getMaximumPageSize() != null && other.getMaximumPageSize().equals(this.getMaximumPageSize()) == false) return false; 
        if (other.isReverseOrder() == null ^ this.isReverseOrder() == null) return false;
        if (other.isReverseOrder() != null && other.isReverseOrder().equals(this.isReverseOrder()) == false) return false; 
        return true;
    }
    
}
    