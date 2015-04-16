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

/**
 * <p>
 * Contains the results of the DescribeWorkspaceBundles operation.
 * </p>
 */
public class DescribeWorkspaceBundlesResult implements Serializable, Cloneable {

    /**
     * An array of structures that contain information about the bundles.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceBundle> bundles;

    /**
     * If not null, more results are available. Pass this value for the
     * <code>NextToken</code> parameter in a subsequent call to this
     * operation to retrieve the next set of items. This token is valid for
     * one day and must be used within that timeframe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     */
    private String nextToken;

    /**
     * An array of structures that contain information about the bundles.
     *
     * @return An array of structures that contain information about the bundles.
     */
    public java.util.List<WorkspaceBundle> getBundles() {
        if (bundles == null) {
              bundles = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceBundle>();
              bundles.setAutoConstruct(true);
        }
        return bundles;
    }
    
    /**
     * An array of structures that contain information about the bundles.
     *
     * @param bundles An array of structures that contain information about the bundles.
     */
    public void setBundles(java.util.Collection<WorkspaceBundle> bundles) {
        if (bundles == null) {
            this.bundles = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceBundle> bundlesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceBundle>(bundles.size());
        bundlesCopy.addAll(bundles);
        this.bundles = bundlesCopy;
    }
    
    /**
     * An array of structures that contain information about the bundles.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBundles(java.util.Collection)} or {@link
     * #withBundles(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundles An array of structures that contain information about the bundles.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceBundlesResult withBundles(WorkspaceBundle... bundles) {
        if (getBundles() == null) setBundles(new java.util.ArrayList<WorkspaceBundle>(bundles.length));
        for (WorkspaceBundle value : bundles) {
            getBundles().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that contain information about the bundles.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundles An array of structures that contain information about the bundles.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceBundlesResult withBundles(java.util.Collection<WorkspaceBundle> bundles) {
        if (bundles == null) {
            this.bundles = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceBundle> bundlesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceBundle>(bundles.size());
            bundlesCopy.addAll(bundles);
            this.bundles = bundlesCopy;
        }

        return this;
    }

    /**
     * If not null, more results are available. Pass this value for the
     * <code>NextToken</code> parameter in a subsequent call to this
     * operation to retrieve the next set of items. This token is valid for
     * one day and must be used within that timeframe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @return If not null, more results are available. Pass this value for the
     *         <code>NextToken</code> parameter in a subsequent call to this
     *         operation to retrieve the next set of items. This token is valid for
     *         one day and must be used within that timeframe.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this value for the
     * <code>NextToken</code> parameter in a subsequent call to this
     * operation to retrieve the next set of items. This token is valid for
     * one day and must be used within that timeframe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param nextToken If not null, more results are available. Pass this value for the
     *         <code>NextToken</code> parameter in a subsequent call to this
     *         operation to retrieve the next set of items. This token is valid for
     *         one day and must be used within that timeframe.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this value for the
     * <code>NextToken</code> parameter in a subsequent call to this
     * operation to retrieve the next set of items. This token is valid for
     * one day and must be used within that timeframe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param nextToken If not null, more results are available. Pass this value for the
     *         <code>NextToken</code> parameter in a subsequent call to this
     *         operation to retrieve the next set of items. This token is valid for
     *         one day and must be used within that timeframe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceBundlesResult withNextToken(String nextToken) {
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
        if (getBundles() != null) sb.append("Bundles: " + getBundles() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBundles() == null) ? 0 : getBundles().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeWorkspaceBundlesResult == false) return false;
        DescribeWorkspaceBundlesResult other = (DescribeWorkspaceBundlesResult)obj;
        
        if (other.getBundles() == null ^ this.getBundles() == null) return false;
        if (other.getBundles() != null && other.getBundles().equals(this.getBundles()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeWorkspaceBundlesResult clone() {
        try {
            return (DescribeWorkspaceBundlesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    