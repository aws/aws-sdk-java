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
 * The filter used to retrieve specific <code>BillingGroupCostReportElements</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroupCostReportsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBillingGroupCostReportsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     * </p>
     */
    private java.util.List<String> billingGroupArns;

    /**
     * <p>
     * The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     * </p>
     * 
     * @return The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     */

    public java.util.List<String> getBillingGroupArns() {
        return billingGroupArns;
    }

    /**
     * <p>
     * The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     * </p>
     * 
     * @param billingGroupArns
     *        The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     */

    public void setBillingGroupArns(java.util.Collection<String> billingGroupArns) {
        if (billingGroupArns == null) {
            this.billingGroupArns = null;
            return;
        }

        this.billingGroupArns = new java.util.ArrayList<String>(billingGroupArns);
    }

    /**
     * <p>
     * The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBillingGroupArns(java.util.Collection)} or {@link #withBillingGroupArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param billingGroupArns
     *        The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupCostReportsFilter withBillingGroupArns(String... billingGroupArns) {
        if (this.billingGroupArns == null) {
            setBillingGroupArns(new java.util.ArrayList<String>(billingGroupArns.length));
        }
        for (String ele : billingGroupArns) {
            this.billingGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     * </p>
     * 
     * @param billingGroupArns
     *        The list of Amazon Resource Names (ARNs) used to filter billing groups to retrieve reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupCostReportsFilter withBillingGroupArns(java.util.Collection<String> billingGroupArns) {
        setBillingGroupArns(billingGroupArns);
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
        if (getBillingGroupArns() != null)
            sb.append("BillingGroupArns: ").append(getBillingGroupArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBillingGroupCostReportsFilter == false)
            return false;
        ListBillingGroupCostReportsFilter other = (ListBillingGroupCostReportsFilter) obj;
        if (other.getBillingGroupArns() == null ^ this.getBillingGroupArns() == null)
            return false;
        if (other.getBillingGroupArns() != null && other.getBillingGroupArns().equals(this.getBillingGroupArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingGroupArns() == null) ? 0 : getBillingGroupArns().hashCode());
        return hashCode;
    }

    @Override
    public ListBillingGroupCostReportsFilter clone() {
        try {
            return (ListBillingGroupCostReportsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ListBillingGroupCostReportsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
