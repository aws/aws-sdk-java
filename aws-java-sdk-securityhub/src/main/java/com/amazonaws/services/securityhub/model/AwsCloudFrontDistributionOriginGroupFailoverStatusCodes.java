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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status codes that cause an origin group to fail over.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionOriginGroupFailoverStatusCodes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionOriginGroupFailoverStatusCodes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of status code values that can cause a failover to the next origin.
     * </p>
     */
    private java.util.List<Integer> items;
    /**
     * <p>
     * The number of status codes that can cause a failover.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * The list of status code values that can cause a failover to the next origin.
     * </p>
     * 
     * @return The list of status code values that can cause a failover to the next origin.
     */

    public java.util.List<Integer> getItems() {
        return items;
    }

    /**
     * <p>
     * The list of status code values that can cause a failover to the next origin.
     * </p>
     * 
     * @param items
     *        The list of status code values that can cause a failover to the next origin.
     */

    public void setItems(java.util.Collection<Integer> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<Integer>(items);
    }

    /**
     * <p>
     * The list of status code values that can cause a failover to the next origin.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The list of status code values that can cause a failover to the next origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginGroupFailoverStatusCodes withItems(Integer... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<Integer>(items.length));
        }
        for (Integer ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of status code values that can cause a failover to the next origin.
     * </p>
     * 
     * @param items
     *        The list of status code values that can cause a failover to the next origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginGroupFailoverStatusCodes withItems(java.util.Collection<Integer> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The number of status codes that can cause a failover.
     * </p>
     * 
     * @param quantity
     *        The number of status codes that can cause a failover.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of status codes that can cause a failover.
     * </p>
     * 
     * @return The number of status codes that can cause a failover.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of status codes that can cause a failover.
     * </p>
     * 
     * @param quantity
     *        The number of status codes that can cause a failover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginGroupFailoverStatusCodes withQuantity(Integer quantity) {
        setQuantity(quantity);
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
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionOriginGroupFailoverStatusCodes == false)
            return false;
        AwsCloudFrontDistributionOriginGroupFailoverStatusCodes other = (AwsCloudFrontDistributionOriginGroupFailoverStatusCodes) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionOriginGroupFailoverStatusCodes clone() {
        try {
            return (AwsCloudFrontDistributionOriginGroupFailoverStatusCodes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionOriginGroupFailoverStatusCodesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
