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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ListBulkDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBulkDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of bulk deployments. */
    private java.util.List<BulkDeployment> bulkDeployments;
    /** The token for the next set of results, or ''null'' if there are no additional results. */
    private String nextToken;

    /**
     * A list of bulk deployments.
     * 
     * @return A list of bulk deployments.
     */

    public java.util.List<BulkDeployment> getBulkDeployments() {
        return bulkDeployments;
    }

    /**
     * A list of bulk deployments.
     * 
     * @param bulkDeployments
     *        A list of bulk deployments.
     */

    public void setBulkDeployments(java.util.Collection<BulkDeployment> bulkDeployments) {
        if (bulkDeployments == null) {
            this.bulkDeployments = null;
            return;
        }

        this.bulkDeployments = new java.util.ArrayList<BulkDeployment>(bulkDeployments);
    }

    /**
     * A list of bulk deployments.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBulkDeployments(java.util.Collection)} or {@link #withBulkDeployments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param bulkDeployments
     *        A list of bulk deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBulkDeploymentsResult withBulkDeployments(BulkDeployment... bulkDeployments) {
        if (this.bulkDeployments == null) {
            setBulkDeployments(new java.util.ArrayList<BulkDeployment>(bulkDeployments.length));
        }
        for (BulkDeployment ele : bulkDeployments) {
            this.bulkDeployments.add(ele);
        }
        return this;
    }

    /**
     * A list of bulk deployments.
     * 
     * @param bulkDeployments
     *        A list of bulk deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBulkDeploymentsResult withBulkDeployments(java.util.Collection<BulkDeployment> bulkDeployments) {
        setBulkDeployments(bulkDeployments);
        return this;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @return The token for the next set of results, or ''null'' if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBulkDeploymentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBulkDeployments() != null)
            sb.append("BulkDeployments: ").append(getBulkDeployments()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBulkDeploymentsResult == false)
            return false;
        ListBulkDeploymentsResult other = (ListBulkDeploymentsResult) obj;
        if (other.getBulkDeployments() == null ^ this.getBulkDeployments() == null)
            return false;
        if (other.getBulkDeployments() != null && other.getBulkDeployments().equals(this.getBulkDeployments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBulkDeployments() == null) ? 0 : getBulkDeployments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBulkDeploymentsResult clone() {
        try {
            return (ListBulkDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
