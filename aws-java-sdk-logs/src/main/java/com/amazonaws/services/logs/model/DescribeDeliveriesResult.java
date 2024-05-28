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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDeliveries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeliveriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery in the account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Delivery> deliveries;

    private String nextToken;

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery in the account.
     * </p>
     * 
     * @return An array of structures. Each structure contains information about one delivery in the account.
     */

    public java.util.List<Delivery> getDeliveries() {
        if (deliveries == null) {
            deliveries = new com.amazonaws.internal.SdkInternalList<Delivery>();
        }
        return deliveries;
    }

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery in the account.
     * </p>
     * 
     * @param deliveries
     *        An array of structures. Each structure contains information about one delivery in the account.
     */

    public void setDeliveries(java.util.Collection<Delivery> deliveries) {
        if (deliveries == null) {
            this.deliveries = null;
            return;
        }

        this.deliveries = new com.amazonaws.internal.SdkInternalList<Delivery>(deliveries);
    }

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeliveries(java.util.Collection)} or {@link #withDeliveries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deliveries
     *        An array of structures. Each structure contains information about one delivery in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveriesResult withDeliveries(Delivery... deliveries) {
        if (this.deliveries == null) {
            setDeliveries(new com.amazonaws.internal.SdkInternalList<Delivery>(deliveries.length));
        }
        for (Delivery ele : deliveries) {
            this.deliveries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery in the account.
     * </p>
     * 
     * @param deliveries
     *        An array of structures. Each structure contains information about one delivery in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveriesResult withDeliveries(java.util.Collection<Delivery> deliveries) {
        setDeliveries(deliveries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveriesResult withNextToken(String nextToken) {
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
        if (getDeliveries() != null)
            sb.append("Deliveries: ").append(getDeliveries()).append(",");
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

        if (obj instanceof DescribeDeliveriesResult == false)
            return false;
        DescribeDeliveriesResult other = (DescribeDeliveriesResult) obj;
        if (other.getDeliveries() == null ^ this.getDeliveries() == null)
            return false;
        if (other.getDeliveries() != null && other.getDeliveries().equals(this.getDeliveries()) == false)
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

        hashCode = prime * hashCode + ((getDeliveries() == null) ? 0 : getDeliveries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeliveriesResult clone() {
        try {
            return (DescribeDeliveriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
