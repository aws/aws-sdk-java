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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.workspaces.AmazonWorkspaces#describeWorkspaceBundles(DescribeWorkspaceBundlesRequest) DescribeWorkspaceBundles operation}.
 * <p>
 * Obtains information about the WorkSpace bundles that are available to
 * your account in the specified region.
 * </p>
 * <p>
 * You can filter the results with either the <code>BundleIds</code>
 * parameter, or the <code>Owner</code> parameter, but not both.
 * </p>
 * <p>
 * This operation supports pagination with the use of the
 * <code>NextToken</code> request and response parameters. If more
 * results are available, the <code>NextToken</code> response member
 * contains a token that you pass in the next call to this operation to
 * retrieve the next set of items.
 * </p>
 *
 * @see com.amazonaws.services.workspaces.AmazonWorkspaces#describeWorkspaceBundles(DescribeWorkspaceBundlesRequest)
 */
public class DescribeWorkspaceBundlesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An array of strings that contains the identifiers of the bundles to
     * retrieve. This parameter cannot be combined with any other filter
     * parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> bundleIds;

    /**
     * The owner of the bundles to retrieve. This parameter cannot be
     * combined with any other filter parameter. <p>This contains one of the
     * following values: <ul> <li>null - Retrieves the bundles that belong to
     * the account making the call.</li> <li><code>AMAZON</code> - Retrieves
     * the bundles that are provided by AWS.</li> </ul>
     */
    private String owner;

    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     */
    private String nextToken;

    /**
     * An array of strings that contains the identifiers of the bundles to
     * retrieve. This parameter cannot be combined with any other filter
     * parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return An array of strings that contains the identifiers of the bundles to
     *         retrieve. This parameter cannot be combined with any other filter
     *         parameter.
     */
    public java.util.List<String> getBundleIds() {
        if (bundleIds == null) {
              bundleIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              bundleIds.setAutoConstruct(true);
        }
        return bundleIds;
    }
    
    /**
     * An array of strings that contains the identifiers of the bundles to
     * retrieve. This parameter cannot be combined with any other filter
     * parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param bundleIds An array of strings that contains the identifiers of the bundles to
     *         retrieve. This parameter cannot be combined with any other filter
     *         parameter.
     */
    public void setBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> bundleIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(bundleIds.size());
        bundleIdsCopy.addAll(bundleIds);
        this.bundleIds = bundleIdsCopy;
    }
    
    /**
     * An array of strings that contains the identifiers of the bundles to
     * retrieve. This parameter cannot be combined with any other filter
     * parameter.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBundleIds(java.util.Collection)} or {@link
     * #withBundleIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param bundleIds An array of strings that contains the identifiers of the bundles to
     *         retrieve. This parameter cannot be combined with any other filter
     *         parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceBundlesRequest withBundleIds(String... bundleIds) {
        if (getBundleIds() == null) setBundleIds(new java.util.ArrayList<String>(bundleIds.length));
        for (String value : bundleIds) {
            getBundleIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings that contains the identifiers of the bundles to
     * retrieve. This parameter cannot be combined with any other filter
     * parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param bundleIds An array of strings that contains the identifiers of the bundles to
     *         retrieve. This parameter cannot be combined with any other filter
     *         parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceBundlesRequest withBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> bundleIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(bundleIds.size());
            bundleIdsCopy.addAll(bundleIds);
            this.bundleIds = bundleIdsCopy;
        }

        return this;
    }

    /**
     * The owner of the bundles to retrieve. This parameter cannot be
     * combined with any other filter parameter. <p>This contains one of the
     * following values: <ul> <li>null - Retrieves the bundles that belong to
     * the account making the call.</li> <li><code>AMAZON</code> - Retrieves
     * the bundles that are provided by AWS.</li> </ul>
     *
     * @return The owner of the bundles to retrieve. This parameter cannot be
     *         combined with any other filter parameter. <p>This contains one of the
     *         following values: <ul> <li>null - Retrieves the bundles that belong to
     *         the account making the call.</li> <li><code>AMAZON</code> - Retrieves
     *         the bundles that are provided by AWS.</li> </ul>
     */
    public String getOwner() {
        return owner;
    }
    
    /**
     * The owner of the bundles to retrieve. This parameter cannot be
     * combined with any other filter parameter. <p>This contains one of the
     * following values: <ul> <li>null - Retrieves the bundles that belong to
     * the account making the call.</li> <li><code>AMAZON</code> - Retrieves
     * the bundles that are provided by AWS.</li> </ul>
     *
     * @param owner The owner of the bundles to retrieve. This parameter cannot be
     *         combined with any other filter parameter. <p>This contains one of the
     *         following values: <ul> <li>null - Retrieves the bundles that belong to
     *         the account making the call.</li> <li><code>AMAZON</code> - Retrieves
     *         the bundles that are provided by AWS.</li> </ul>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    /**
     * The owner of the bundles to retrieve. This parameter cannot be
     * combined with any other filter parameter. <p>This contains one of the
     * following values: <ul> <li>null - Retrieves the bundles that belong to
     * the account making the call.</li> <li><code>AMAZON</code> - Retrieves
     * the bundles that are provided by AWS.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owner The owner of the bundles to retrieve. This parameter cannot be
     *         combined with any other filter parameter. <p>This contains one of the
     *         following values: <ul> <li>null - Retrieves the bundles that belong to
     *         the account making the call.</li> <li><code>AMAZON</code> - Retrieves
     *         the bundles that are provided by AWS.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceBundlesRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @return The <code>NextToken</code> value from a previous call to this
     *         operation. Pass null if this is the first call.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param nextToken The <code>NextToken</code> value from a previous call to this
     *         operation. Pass null if this is the first call.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param nextToken The <code>NextToken</code> value from a previous call to this
     *         operation. Pass null if this is the first call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceBundlesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
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
        if (getBundleIds() != null) sb.append("BundleIds: " + getBundleIds() + ",");
        if (getOwner() != null) sb.append("Owner: " + getOwner() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBundleIds() == null) ? 0 : getBundleIds().hashCode()); 
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeWorkspaceBundlesRequest == false) return false;
        DescribeWorkspaceBundlesRequest other = (DescribeWorkspaceBundlesRequest)obj;
        
        if (other.getBundleIds() == null ^ this.getBundleIds() == null) return false;
        if (other.getBundleIds() != null && other.getBundleIds().equals(this.getBundleIds()) == false) return false; 
        if (other.getOwner() == null ^ this.getOwner() == null) return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeWorkspaceBundlesRequest clone() {
        
            return (DescribeWorkspaceBundlesRequest) super.clone();
    }

}
    