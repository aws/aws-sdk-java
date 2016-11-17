/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribePortfolioResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed portfolio information.
     * </p>
     */
    private PortfolioDetail portfolioDetail;
    /**
     * <p>
     * Tags associated with the portfolio.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Detailed portfolio information.
     * </p>
     * 
     * @param portfolioDetail
     *        Detailed portfolio information.
     */

    public void setPortfolioDetail(PortfolioDetail portfolioDetail) {
        this.portfolioDetail = portfolioDetail;
    }

    /**
     * <p>
     * Detailed portfolio information.
     * </p>
     * 
     * @return Detailed portfolio information.
     */

    public PortfolioDetail getPortfolioDetail() {
        return this.portfolioDetail;
    }

    /**
     * <p>
     * Detailed portfolio information.
     * </p>
     * 
     * @param portfolioDetail
     *        Detailed portfolio information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioResult withPortfolioDetail(PortfolioDetail portfolioDetail) {
        setPortfolioDetail(portfolioDetail);
        return this;
    }

    /**
     * <p>
     * Tags associated with the portfolio.
     * </p>
     * 
     * @return Tags associated with the portfolio.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the portfolio.
     * </p>
     * 
     * @param tags
     *        Tags associated with the portfolio.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags associated with the portfolio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags associated with the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags associated with the portfolio.
     * </p>
     * 
     * @param tags
     *        Tags associated with the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPortfolioDetail() != null)
            sb.append("PortfolioDetail: " + getPortfolioDetail() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortfolioResult == false)
            return false;
        DescribePortfolioResult other = (DescribePortfolioResult) obj;
        if (other.getPortfolioDetail() == null ^ this.getPortfolioDetail() == null)
            return false;
        if (other.getPortfolioDetail() != null && other.getPortfolioDetail().equals(this.getPortfolioDetail()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortfolioDetail() == null) ? 0 : getPortfolioDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribePortfolioResult clone() {
        try {
            return (DescribePortfolioResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
