/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeVcenterClients" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVcenterClientsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of items returned by DescribeVcenterClients.
     * </p>
     */
    private java.util.List<VcenterClient> items;
    /**
     * <p>
     * Next pagination token returned from DescribeVcenterClients.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of items returned by DescribeVcenterClients.
     * </p>
     * 
     * @return List of items returned by DescribeVcenterClients.
     */

    public java.util.List<VcenterClient> getItems() {
        return items;
    }

    /**
     * <p>
     * List of items returned by DescribeVcenterClients.
     * </p>
     * 
     * @param items
     *        List of items returned by DescribeVcenterClients.
     */

    public void setItems(java.util.Collection<VcenterClient> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<VcenterClient>(items);
    }

    /**
     * <p>
     * List of items returned by DescribeVcenterClients.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        List of items returned by DescribeVcenterClients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVcenterClientsResult withItems(VcenterClient... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<VcenterClient>(items.length));
        }
        for (VcenterClient ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of items returned by DescribeVcenterClients.
     * </p>
     * 
     * @param items
     *        List of items returned by DescribeVcenterClients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVcenterClientsResult withItems(java.util.Collection<VcenterClient> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * Next pagination token returned from DescribeVcenterClients.
     * </p>
     * 
     * @param nextToken
     *        Next pagination token returned from DescribeVcenterClients.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next pagination token returned from DescribeVcenterClients.
     * </p>
     * 
     * @return Next pagination token returned from DescribeVcenterClients.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next pagination token returned from DescribeVcenterClients.
     * </p>
     * 
     * @param nextToken
     *        Next pagination token returned from DescribeVcenterClients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVcenterClientsResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof DescribeVcenterClientsResult == false)
            return false;
        DescribeVcenterClientsResult other = (DescribeVcenterClientsResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVcenterClientsResult clone() {
        try {
            return (DescribeVcenterClientsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
