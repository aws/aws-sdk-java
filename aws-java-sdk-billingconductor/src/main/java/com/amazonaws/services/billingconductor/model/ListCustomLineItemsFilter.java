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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter that specifies the custom line items and billing groups to retrieve FFLI information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItemsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomLineItemsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of custom line items to retrieve information.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * The billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     */
    private java.util.List<String> billingGroups;
    /**
     * <p>
     * A list of custom line item ARNs to retrieve information.
     * </p>
     */
    private java.util.List<String> arns;

    /**
     * <p>
     * A list of custom line items to retrieve information.
     * </p>
     * 
     * @return A list of custom line items to retrieve information.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A list of custom line items to retrieve information.
     * </p>
     * 
     * @param names
     *        A list of custom line items to retrieve information.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A list of custom line items to retrieve information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        A list of custom line items to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsFilter withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom line items to retrieve information.
     * </p>
     * 
     * @param names
     *        A list of custom line items to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsFilter withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * The billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @return The billing group Amazon Resource Names (ARNs) to retrieve information.
     */

    public java.util.List<String> getBillingGroups() {
        return billingGroups;
    }

    /**
     * <p>
     * The billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @param billingGroups
     *        The billing group Amazon Resource Names (ARNs) to retrieve information.
     */

    public void setBillingGroups(java.util.Collection<String> billingGroups) {
        if (billingGroups == null) {
            this.billingGroups = null;
            return;
        }

        this.billingGroups = new java.util.ArrayList<String>(billingGroups);
    }

    /**
     * <p>
     * The billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBillingGroups(java.util.Collection)} or {@link #withBillingGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param billingGroups
     *        The billing group Amazon Resource Names (ARNs) to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsFilter withBillingGroups(String... billingGroups) {
        if (this.billingGroups == null) {
            setBillingGroups(new java.util.ArrayList<String>(billingGroups.length));
        }
        for (String ele : billingGroups) {
            this.billingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The billing group Amazon Resource Names (ARNs) to retrieve information.
     * </p>
     * 
     * @param billingGroups
     *        The billing group Amazon Resource Names (ARNs) to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsFilter withBillingGroups(java.util.Collection<String> billingGroups) {
        setBillingGroups(billingGroups);
        return this;
    }

    /**
     * <p>
     * A list of custom line item ARNs to retrieve information.
     * </p>
     * 
     * @return A list of custom line item ARNs to retrieve information.
     */

    public java.util.List<String> getArns() {
        return arns;
    }

    /**
     * <p>
     * A list of custom line item ARNs to retrieve information.
     * </p>
     * 
     * @param arns
     *        A list of custom line item ARNs to retrieve information.
     */

    public void setArns(java.util.Collection<String> arns) {
        if (arns == null) {
            this.arns = null;
            return;
        }

        this.arns = new java.util.ArrayList<String>(arns);
    }

    /**
     * <p>
     * A list of custom line item ARNs to retrieve information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArns(java.util.Collection)} or {@link #withArns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param arns
     *        A list of custom line item ARNs to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsFilter withArns(String... arns) {
        if (this.arns == null) {
            setArns(new java.util.ArrayList<String>(arns.length));
        }
        for (String ele : arns) {
            this.arns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom line item ARNs to retrieve information.
     * </p>
     * 
     * @param arns
     *        A list of custom line item ARNs to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsFilter withArns(java.util.Collection<String> arns) {
        setArns(arns);
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
        if (getNames() != null)
            sb.append("Names: ").append("***Sensitive Data Redacted***").append(",");
        if (getBillingGroups() != null)
            sb.append("BillingGroups: ").append(getBillingGroups()).append(",");
        if (getArns() != null)
            sb.append("Arns: ").append(getArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomLineItemsFilter == false)
            return false;
        ListCustomLineItemsFilter other = (ListCustomLineItemsFilter) obj;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getBillingGroups() == null ^ this.getBillingGroups() == null)
            return false;
        if (other.getBillingGroups() != null && other.getBillingGroups().equals(this.getBillingGroups()) == false)
            return false;
        if (other.getArns() == null ^ this.getArns() == null)
            return false;
        if (other.getArns() != null && other.getArns().equals(this.getArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getBillingGroups() == null) ? 0 : getBillingGroups().hashCode());
        hashCode = prime * hashCode + ((getArns() == null) ? 0 : getArns().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomLineItemsFilter clone() {
        try {
            return (ListCustomLineItemsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ListCustomLineItemsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
