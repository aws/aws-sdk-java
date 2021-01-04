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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeReturnShippingLabel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReturnShippingLabelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status information of the task on a Snow device that is being returned to AWS.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The expiration date of the current return shipping label.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * The status information of the task on a Snow device that is being returned to AWS.
     * </p>
     * 
     * @param status
     *        The status information of the task on a Snow device that is being returned to AWS.
     * @see ShippingLabelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status information of the task on a Snow device that is being returned to AWS.
     * </p>
     * 
     * @return The status information of the task on a Snow device that is being returned to AWS.
     * @see ShippingLabelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status information of the task on a Snow device that is being returned to AWS.
     * </p>
     * 
     * @param status
     *        The status information of the task on a Snow device that is being returned to AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingLabelStatus
     */

    public DescribeReturnShippingLabelResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status information of the task on a Snow device that is being returned to AWS.
     * </p>
     * 
     * @param status
     *        The status information of the task on a Snow device that is being returned to AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingLabelStatus
     */

    public DescribeReturnShippingLabelResult withStatus(ShippingLabelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The expiration date of the current return shipping label.
     * </p>
     * 
     * @param expirationDate
     *        The expiration date of the current return shipping label.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The expiration date of the current return shipping label.
     * </p>
     * 
     * @return The expiration date of the current return shipping label.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The expiration date of the current return shipping label.
     * </p>
     * 
     * @param expirationDate
     *        The expiration date of the current return shipping label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReturnShippingLabelResult withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReturnShippingLabelResult == false)
            return false;
        DescribeReturnShippingLabelResult other = (DescribeReturnShippingLabelResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReturnShippingLabelResult clone() {
        try {
            return (DescribeReturnShippingLabelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
