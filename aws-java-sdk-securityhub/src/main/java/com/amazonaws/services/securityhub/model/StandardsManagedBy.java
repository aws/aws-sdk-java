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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the management of a security standard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StandardsManagedBy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsManagedBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for the company that manages a specific security standard. For existing standards, the value is
     * equal to <code>Amazon Web Services</code>.
     * </p>
     */
    private String company;
    /**
     * <p>
     * An identifier for the product that manages a specific security standard. For existing standards, the value is
     * equal to the Amazon Web Services service that manages the standard.
     * </p>
     */
    private String product;

    /**
     * <p>
     * An identifier for the company that manages a specific security standard. For existing standards, the value is
     * equal to <code>Amazon Web Services</code>.
     * </p>
     * 
     * @param company
     *        An identifier for the company that manages a specific security standard. For existing standards, the value
     *        is equal to <code>Amazon Web Services</code>.
     */

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * <p>
     * An identifier for the company that manages a specific security standard. For existing standards, the value is
     * equal to <code>Amazon Web Services</code>.
     * </p>
     * 
     * @return An identifier for the company that manages a specific security standard. For existing standards, the
     *         value is equal to <code>Amazon Web Services</code>.
     */

    public String getCompany() {
        return this.company;
    }

    /**
     * <p>
     * An identifier for the company that manages a specific security standard. For existing standards, the value is
     * equal to <code>Amazon Web Services</code>.
     * </p>
     * 
     * @param company
     *        An identifier for the company that manages a specific security standard. For existing standards, the value
     *        is equal to <code>Amazon Web Services</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsManagedBy withCompany(String company) {
        setCompany(company);
        return this;
    }

    /**
     * <p>
     * An identifier for the product that manages a specific security standard. For existing standards, the value is
     * equal to the Amazon Web Services service that manages the standard.
     * </p>
     * 
     * @param product
     *        An identifier for the product that manages a specific security standard. For existing standards, the value
     *        is equal to the Amazon Web Services service that manages the standard.
     */

    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * <p>
     * An identifier for the product that manages a specific security standard. For existing standards, the value is
     * equal to the Amazon Web Services service that manages the standard.
     * </p>
     * 
     * @return An identifier for the product that manages a specific security standard. For existing standards, the
     *         value is equal to the Amazon Web Services service that manages the standard.
     */

    public String getProduct() {
        return this.product;
    }

    /**
     * <p>
     * An identifier for the product that manages a specific security standard. For existing standards, the value is
     * equal to the Amazon Web Services service that manages the standard.
     * </p>
     * 
     * @param product
     *        An identifier for the product that manages a specific security standard. For existing standards, the value
     *        is equal to the Amazon Web Services service that manages the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsManagedBy withProduct(String product) {
        setProduct(product);
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
        if (getCompany() != null)
            sb.append("Company: ").append(getCompany()).append(",");
        if (getProduct() != null)
            sb.append("Product: ").append(getProduct());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsManagedBy == false)
            return false;
        StandardsManagedBy other = (StandardsManagedBy) obj;
        if (other.getCompany() == null ^ this.getCompany() == null)
            return false;
        if (other.getCompany() != null && other.getCompany().equals(this.getCompany()) == false)
            return false;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompany() == null) ? 0 : getCompany().hashCode());
        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        return hashCode;
    }

    @Override
    public StandardsManagedBy clone() {
        try {
            return (StandardsManagedBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardsManagedByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
