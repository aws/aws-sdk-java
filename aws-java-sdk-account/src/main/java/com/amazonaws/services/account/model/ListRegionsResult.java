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
package com.amazonaws.services.account.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/ListRegions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRegionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there is more data to be returned, this will be populated. It should be passed into the
     * <code>next-token</code> request parameter of <code>list-regions</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions that
     * match the filter criteria set in the <code>filter</code> parameter.
     * </p>
     */
    private java.util.List<Region> regions;

    /**
     * <p>
     * If there is more data to be returned, this will be populated. It should be passed into the
     * <code>next-token</code> request parameter of <code>list-regions</code>.
     * </p>
     * 
     * @param nextToken
     *        If there is more data to be returned, this will be populated. It should be passed into the
     *        <code>next-token</code> request parameter of <code>list-regions</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there is more data to be returned, this will be populated. It should be passed into the
     * <code>next-token</code> request parameter of <code>list-regions</code>.
     * </p>
     * 
     * @return If there is more data to be returned, this will be populated. It should be passed into the
     *         <code>next-token</code> request parameter of <code>list-regions</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there is more data to be returned, this will be populated. It should be passed into the
     * <code>next-token</code> request parameter of <code>list-regions</code>.
     * </p>
     * 
     * @param nextToken
     *        If there is more data to be returned, this will be populated. It should be passed into the
     *        <code>next-token</code> request parameter of <code>list-regions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions that
     * match the filter criteria set in the <code>filter</code> parameter.
     * </p>
     * 
     * @return This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions
     *         that match the filter criteria set in the <code>filter</code> parameter.
     */

    public java.util.List<Region> getRegions() {
        return regions;
    }

    /**
     * <p>
     * This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions that
     * match the filter criteria set in the <code>filter</code> parameter.
     * </p>
     * 
     * @param regions
     *        This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions
     *        that match the filter criteria set in the <code>filter</code> parameter.
     */

    public void setRegions(java.util.Collection<Region> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<Region>(regions);
    }

    /**
     * <p>
     * This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions that
     * match the filter criteria set in the <code>filter</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions
     *        that match the filter criteria set in the <code>filter</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionsResult withRegions(Region... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<Region>(regions.length));
        }
        for (Region ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions that
     * match the filter criteria set in the <code>filter</code> parameter.
     * </p>
     * 
     * @param regions
     *        This is a list of Regions for a given account, or if the filtered parameter was used, a list of Regions
     *        that match the filter criteria set in the <code>filter</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionsResult withRegions(java.util.Collection<Region> regions) {
        setRegions(regions);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegionsResult == false)
            return false;
        ListRegionsResult other = (ListRegionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public ListRegionsResult clone() {
        try {
            return (ListRegionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
