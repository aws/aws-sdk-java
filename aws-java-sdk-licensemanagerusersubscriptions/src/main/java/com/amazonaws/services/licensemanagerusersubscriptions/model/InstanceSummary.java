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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an EC2 instance providing user-based subscriptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/InstanceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The date of the last status check.
     * </p>
     */
    private String lastStatusCheckDate;
    /**
     * <p>
     * A list of provided user-based subscription products.
     * </p>
     */
    private java.util.List<String> products;
    /**
     * <p>
     * The status of an EC2 instance resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for an EC2 instance.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance, which provides user-based subscriptions.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @return The ID of the EC2 instance, which provides user-based subscriptions.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance, which provides user-based subscriptions.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance, which provides user-based subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The date of the last status check.
     * </p>
     * 
     * @param lastStatusCheckDate
     *        The date of the last status check.
     */

    public void setLastStatusCheckDate(String lastStatusCheckDate) {
        this.lastStatusCheckDate = lastStatusCheckDate;
    }

    /**
     * <p>
     * The date of the last status check.
     * </p>
     * 
     * @return The date of the last status check.
     */

    public String getLastStatusCheckDate() {
        return this.lastStatusCheckDate;
    }

    /**
     * <p>
     * The date of the last status check.
     * </p>
     * 
     * @param lastStatusCheckDate
     *        The date of the last status check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withLastStatusCheckDate(String lastStatusCheckDate) {
        setLastStatusCheckDate(lastStatusCheckDate);
        return this;
    }

    /**
     * <p>
     * A list of provided user-based subscription products.
     * </p>
     * 
     * @return A list of provided user-based subscription products.
     */

    public java.util.List<String> getProducts() {
        return products;
    }

    /**
     * <p>
     * A list of provided user-based subscription products.
     * </p>
     * 
     * @param products
     *        A list of provided user-based subscription products.
     */

    public void setProducts(java.util.Collection<String> products) {
        if (products == null) {
            this.products = null;
            return;
        }

        this.products = new java.util.ArrayList<String>(products);
    }

    /**
     * <p>
     * A list of provided user-based subscription products.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProducts(java.util.Collection)} or {@link #withProducts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param products
     *        A list of provided user-based subscription products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withProducts(String... products) {
        if (this.products == null) {
            setProducts(new java.util.ArrayList<String>(products.length));
        }
        for (String ele : products) {
            this.products.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of provided user-based subscription products.
     * </p>
     * 
     * @param products
     *        A list of provided user-based subscription products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withProducts(java.util.Collection<String> products) {
        setProducts(products);
        return this;
    }

    /**
     * <p>
     * The status of an EC2 instance resource.
     * </p>
     * 
     * @param status
     *        The status of an EC2 instance resource.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an EC2 instance resource.
     * </p>
     * 
     * @return The status of an EC2 instance resource.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an EC2 instance resource.
     * </p>
     * 
     * @param status
     *        The status of an EC2 instance resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status message for an EC2 instance.
     * </p>
     * 
     * @param statusMessage
     *        The status message for an EC2 instance.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for an EC2 instance.
     * </p>
     * 
     * @return The status message for an EC2 instance.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for an EC2 instance.
     * </p>
     * 
     * @param statusMessage
     *        The status message for an EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getLastStatusCheckDate() != null)
            sb.append("LastStatusCheckDate: ").append(getLastStatusCheckDate()).append(",");
        if (getProducts() != null)
            sb.append("Products: ").append(getProducts()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSummary == false)
            return false;
        InstanceSummary other = (InstanceSummary) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getLastStatusCheckDate() == null ^ this.getLastStatusCheckDate() == null)
            return false;
        if (other.getLastStatusCheckDate() != null && other.getLastStatusCheckDate().equals(this.getLastStatusCheckDate()) == false)
            return false;
        if (other.getProducts() == null ^ this.getProducts() == null)
            return false;
        if (other.getProducts() != null && other.getProducts().equals(this.getProducts()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getLastStatusCheckDate() == null) ? 0 : getLastStatusCheckDate().hashCode());
        hashCode = prime * hashCode + ((getProducts() == null) ? 0 : getProducts().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public InstanceSummary clone() {
        try {
            return (InstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerusersubscriptions.model.transform.InstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
