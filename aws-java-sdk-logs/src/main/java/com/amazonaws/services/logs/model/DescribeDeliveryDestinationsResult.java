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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDeliveryDestinations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeliveryDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery destination in the account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeliveryDestination> deliveryDestinations;

    private String nextToken;

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery destination in the account.
     * </p>
     * 
     * @return An array of structures. Each structure contains information about one delivery destination in the
     *         account.
     */

    public java.util.List<DeliveryDestination> getDeliveryDestinations() {
        if (deliveryDestinations == null) {
            deliveryDestinations = new com.amazonaws.internal.SdkInternalList<DeliveryDestination>();
        }
        return deliveryDestinations;
    }

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery destination in the account.
     * </p>
     * 
     * @param deliveryDestinations
     *        An array of structures. Each structure contains information about one delivery destination in the account.
     */

    public void setDeliveryDestinations(java.util.Collection<DeliveryDestination> deliveryDestinations) {
        if (deliveryDestinations == null) {
            this.deliveryDestinations = null;
            return;
        }

        this.deliveryDestinations = new com.amazonaws.internal.SdkInternalList<DeliveryDestination>(deliveryDestinations);
    }

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery destination in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeliveryDestinations(java.util.Collection)} or {@link #withDeliveryDestinations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param deliveryDestinations
     *        An array of structures. Each structure contains information about one delivery destination in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryDestinationsResult withDeliveryDestinations(DeliveryDestination... deliveryDestinations) {
        if (this.deliveryDestinations == null) {
            setDeliveryDestinations(new com.amazonaws.internal.SdkInternalList<DeliveryDestination>(deliveryDestinations.length));
        }
        for (DeliveryDestination ele : deliveryDestinations) {
            this.deliveryDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures. Each structure contains information about one delivery destination in the account.
     * </p>
     * 
     * @param deliveryDestinations
     *        An array of structures. Each structure contains information about one delivery destination in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryDestinationsResult withDeliveryDestinations(java.util.Collection<DeliveryDestination> deliveryDestinations) {
        setDeliveryDestinations(deliveryDestinations);
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

    public DescribeDeliveryDestinationsResult withNextToken(String nextToken) {
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
        if (getDeliveryDestinations() != null)
            sb.append("DeliveryDestinations: ").append(getDeliveryDestinations()).append(",");
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

        if (obj instanceof DescribeDeliveryDestinationsResult == false)
            return false;
        DescribeDeliveryDestinationsResult other = (DescribeDeliveryDestinationsResult) obj;
        if (other.getDeliveryDestinations() == null ^ this.getDeliveryDestinations() == null)
            return false;
        if (other.getDeliveryDestinations() != null && other.getDeliveryDestinations().equals(this.getDeliveryDestinations()) == false)
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

        hashCode = prime * hashCode + ((getDeliveryDestinations() == null) ? 0 : getDeliveryDestinations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeliveryDestinationsResult clone() {
        try {
            return (DescribeDeliveryDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
