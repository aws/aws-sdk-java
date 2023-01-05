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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains a list of continuous deployment policies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ContinuousDeploymentPolicyList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinuousDeploymentPolicyList implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the next page of continuous deployment policies. To get the next page of the list, use this value in
     * the <code>Marker</code> field of your request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The maximum number of continuous deployment policies that were specified in your request.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The total number of continuous deployment policies in your Amazon Web Services account, regardless of the
     * <code>MaxItems</code> value.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A list of continuous deployment policy items.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContinuousDeploymentPolicySummary> items;

    /**
     * <p>
     * Indicates the next page of continuous deployment policies. To get the next page of the list, use this value in
     * the <code>Marker</code> field of your request.
     * </p>
     * 
     * @param nextMarker
     *        Indicates the next page of continuous deployment policies. To get the next page of the list, use this
     *        value in the <code>Marker</code> field of your request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * Indicates the next page of continuous deployment policies. To get the next page of the list, use this value in
     * the <code>Marker</code> field of your request.
     * </p>
     * 
     * @return Indicates the next page of continuous deployment policies. To get the next page of the list, use this
     *         value in the <code>Marker</code> field of your request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * Indicates the next page of continuous deployment policies. To get the next page of the list, use this value in
     * the <code>Marker</code> field of your request.
     * </p>
     * 
     * @param nextMarker
     *        Indicates the next page of continuous deployment policies. To get the next page of the list, use this
     *        value in the <code>Marker</code> field of your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicyList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of continuous deployment policies that were specified in your request.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of continuous deployment policies that were specified in your request.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of continuous deployment policies that were specified in your request.
     * </p>
     * 
     * @return The maximum number of continuous deployment policies that were specified in your request.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of continuous deployment policies that were specified in your request.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of continuous deployment policies that were specified in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicyList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The total number of continuous deployment policies in your Amazon Web Services account, regardless of the
     * <code>MaxItems</code> value.
     * </p>
     * 
     * @param quantity
     *        The total number of continuous deployment policies in your Amazon Web Services account, regardless of the
     *        <code>MaxItems</code> value.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The total number of continuous deployment policies in your Amazon Web Services account, regardless of the
     * <code>MaxItems</code> value.
     * </p>
     * 
     * @return The total number of continuous deployment policies in your Amazon Web Services account, regardless of the
     *         <code>MaxItems</code> value.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The total number of continuous deployment policies in your Amazon Web Services account, regardless of the
     * <code>MaxItems</code> value.
     * </p>
     * 
     * @param quantity
     *        The total number of continuous deployment policies in your Amazon Web Services account, regardless of the
     *        <code>MaxItems</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicyList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A list of continuous deployment policy items.
     * </p>
     * 
     * @return A list of continuous deployment policy items.
     */

    public java.util.List<ContinuousDeploymentPolicySummary> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<ContinuousDeploymentPolicySummary>();
        }
        return items;
    }

    /**
     * <p>
     * A list of continuous deployment policy items.
     * </p>
     * 
     * @param items
     *        A list of continuous deployment policy items.
     */

    public void setItems(java.util.Collection<ContinuousDeploymentPolicySummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<ContinuousDeploymentPolicySummary>(items);
    }

    /**
     * <p>
     * A list of continuous deployment policy items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of continuous deployment policy items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicyList withItems(ContinuousDeploymentPolicySummary... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<ContinuousDeploymentPolicySummary>(items.length));
        }
        for (ContinuousDeploymentPolicySummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of continuous deployment policy items.
     * </p>
     * 
     * @param items
     *        A list of continuous deployment policy items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicyList withItems(java.util.Collection<ContinuousDeploymentPolicySummary> items) {
        setItems(items);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousDeploymentPolicyList == false)
            return false;
        ContinuousDeploymentPolicyList other = (ContinuousDeploymentPolicyList) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public ContinuousDeploymentPolicyList clone() {
        try {
            return (ContinuousDeploymentPolicyList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
