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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolioShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePortfolioShareResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
     * </p>
     */
    private String portfolioShareToken;

    /**
     * <p>
     * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
     * </p>
     * 
     * @param portfolioShareToken
     *        The portfolio share unique identifier. This will only be returned if delete is made to an organization
     *        node.
     */

    public void setPortfolioShareToken(String portfolioShareToken) {
        this.portfolioShareToken = portfolioShareToken;
    }

    /**
     * <p>
     * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
     * </p>
     * 
     * @return The portfolio share unique identifier. This will only be returned if delete is made to an organization
     *         node.
     */

    public String getPortfolioShareToken() {
        return this.portfolioShareToken;
    }

    /**
     * <p>
     * The portfolio share unique identifier. This will only be returned if delete is made to an organization node.
     * </p>
     * 
     * @param portfolioShareToken
     *        The portfolio share unique identifier. This will only be returned if delete is made to an organization
     *        node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePortfolioShareResult withPortfolioShareToken(String portfolioShareToken) {
        setPortfolioShareToken(portfolioShareToken);
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
            sb.append("PortfolioShareToken: ").append(getPortfolioShareToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePortfolioShareResult == false)
            return false;
        DeletePortfolioShareResult other = (DeletePortfolioShareResult) obj;
        if (other.getPortfolioShareToken() == null ^ this.getPortfolioShareToken() == null)
            return false;
        if (other.getPortfolioShareToken() != null && other.getPortfolioShareToken().equals(this.getPortfolioShareToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortfolioShareToken() == null) ? 0 : getPortfolioShareToken().hashCode());
        return hashCode;
    }

    @Override
    public DeletePortfolioShareResult clone() {
        try {
            return (DeletePortfolioShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
