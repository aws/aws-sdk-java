/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdatePortfolioShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePortfolioShareResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that tracks the status of the <code>UpdatePortfolioShare</code> operation for external account to
     * account or organizational type sharing.
     * </p>
     */
    private String portfolioShareToken;
    /**
     * <p>
     * The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     * <code>DescribePortfolioShareStatus</code> API.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The token that tracks the status of the <code>UpdatePortfolioShare</code> operation for external account to
     * account or organizational type sharing.
     * </p>
     * 
     * @param portfolioShareToken
     *        The token that tracks the status of the <code>UpdatePortfolioShare</code> operation for external account
     *        to account or organizational type sharing.
     */

    public void setPortfolioShareToken(String portfolioShareToken) {
        this.portfolioShareToken = portfolioShareToken;
    }

    /**
     * <p>
     * The token that tracks the status of the <code>UpdatePortfolioShare</code> operation for external account to
     * account or organizational type sharing.
     * </p>
     * 
     * @return The token that tracks the status of the <code>UpdatePortfolioShare</code> operation for external account
     *         to account or organizational type sharing.
     */

    public String getPortfolioShareToken() {
        return this.portfolioShareToken;
    }

    /**
     * <p>
     * The token that tracks the status of the <code>UpdatePortfolioShare</code> operation for external account to
     * account or organizational type sharing.
     * </p>
     * 
     * @param portfolioShareToken
     *        The token that tracks the status of the <code>UpdatePortfolioShare</code> operation for external account
     *        to account or organizational type sharing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioShareResult withPortfolioShareToken(String portfolioShareToken) {
        setPortfolioShareToken(portfolioShareToken);
        return this;
    }

    /**
     * <p>
     * The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     * <code>DescribePortfolioShareStatus</code> API.
     * </p>
     * 
     * @param status
     *        The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     *        <code>DescribePortfolioShareStatus</code> API.
     * @see ShareStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     * <code>DescribePortfolioShareStatus</code> API.
     * </p>
     * 
     * @return The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     *         <code>DescribePortfolioShareStatus</code> API.
     * @see ShareStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     * <code>DescribePortfolioShareStatus</code> API.
     * </p>
     * 
     * @param status
     *        The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     *        <code>DescribePortfolioShareStatus</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public UpdatePortfolioShareResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     * <code>DescribePortfolioShareStatus</code> API.
     * </p>
     * 
     * @param status
     *        The status of <code>UpdatePortfolioShare</code> operation. You can also obtain the operation status using
     *        <code>DescribePortfolioShareStatus</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public UpdatePortfolioShareResult withStatus(ShareStatus status) {
        this.status = status.toString();
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
        if (getPortfolioShareToken() != null)
            sb.append("PortfolioShareToken: ").append(getPortfolioShareToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePortfolioShareResult == false)
            return false;
        UpdatePortfolioShareResult other = (UpdatePortfolioShareResult) obj;
        if (other.getPortfolioShareToken() == null ^ this.getPortfolioShareToken() == null)
            return false;
        if (other.getPortfolioShareToken() != null && other.getPortfolioShareToken().equals(this.getPortfolioShareToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortfolioShareToken() == null) ? 0 : getPortfolioShareToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePortfolioShareResult clone() {
        try {
            return (UpdatePortfolioShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
