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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchAssociateResourcesToCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAssociateResourcesToCustomLineItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a percentage
     * custom line item successfully.
     * </p>
     */
    private java.util.List<AssociateResourceResponseElement> successfullyAssociatedResources;
    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a percentage
     * custom line item.
     * </p>
     */
    private java.util.List<AssociateResourceResponseElement> failedAssociatedResources;

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a percentage
     * custom line item successfully.
     * </p>
     * 
     * @return A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a
     *         percentage custom line item successfully.
     */

    public java.util.List<AssociateResourceResponseElement> getSuccessfullyAssociatedResources() {
        return successfullyAssociatedResources;
    }

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a percentage
     * custom line item successfully.
     * </p>
     * 
     * @param successfullyAssociatedResources
     *        A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a
     *        percentage custom line item successfully.
     */

    public void setSuccessfullyAssociatedResources(java.util.Collection<AssociateResourceResponseElement> successfullyAssociatedResources) {
        if (successfullyAssociatedResources == null) {
            this.successfullyAssociatedResources = null;
            return;
        }

        this.successfullyAssociatedResources = new java.util.ArrayList<AssociateResourceResponseElement>(successfullyAssociatedResources);
    }

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a percentage
     * custom line item successfully.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfullyAssociatedResources(java.util.Collection)} or
     * {@link #withSuccessfullyAssociatedResources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param successfullyAssociatedResources
     *        A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a
     *        percentage custom line item successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateResourcesToCustomLineItemResult withSuccessfullyAssociatedResources(
            AssociateResourceResponseElement... successfullyAssociatedResources) {
        if (this.successfullyAssociatedResources == null) {
            setSuccessfullyAssociatedResources(new java.util.ArrayList<AssociateResourceResponseElement>(successfullyAssociatedResources.length));
        }
        for (AssociateResourceResponseElement ele : successfullyAssociatedResources) {
            this.successfullyAssociatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a percentage
     * custom line item successfully.
     * </p>
     * 
     * @param successfullyAssociatedResources
     *        A list of <code>AssociateResourceResponseElement</code> for each resource that's been associated to a
     *        percentage custom line item successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateResourcesToCustomLineItemResult withSuccessfullyAssociatedResources(
            java.util.Collection<AssociateResourceResponseElement> successfullyAssociatedResources) {
        setSuccessfullyAssociatedResources(successfullyAssociatedResources);
        return this;
    }

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a percentage
     * custom line item.
     * </p>
     * 
     * @return A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a
     *         percentage custom line item.
     */

    public java.util.List<AssociateResourceResponseElement> getFailedAssociatedResources() {
        return failedAssociatedResources;
    }

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a percentage
     * custom line item.
     * </p>
     * 
     * @param failedAssociatedResources
     *        A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a
     *        percentage custom line item.
     */

    public void setFailedAssociatedResources(java.util.Collection<AssociateResourceResponseElement> failedAssociatedResources) {
        if (failedAssociatedResources == null) {
            this.failedAssociatedResources = null;
            return;
        }

        this.failedAssociatedResources = new java.util.ArrayList<AssociateResourceResponseElement>(failedAssociatedResources);
    }

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a percentage
     * custom line item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedAssociatedResources(java.util.Collection)} or
     * {@link #withFailedAssociatedResources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedAssociatedResources
     *        A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a
     *        percentage custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateResourcesToCustomLineItemResult withFailedAssociatedResources(AssociateResourceResponseElement... failedAssociatedResources) {
        if (this.failedAssociatedResources == null) {
            setFailedAssociatedResources(new java.util.ArrayList<AssociateResourceResponseElement>(failedAssociatedResources.length));
        }
        for (AssociateResourceResponseElement ele : failedAssociatedResources) {
            this.failedAssociatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a percentage
     * custom line item.
     * </p>
     * 
     * @param failedAssociatedResources
     *        A list of <code>AssociateResourceResponseElement</code> for each resource that failed association to a
     *        percentage custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateResourcesToCustomLineItemResult withFailedAssociatedResources(
            java.util.Collection<AssociateResourceResponseElement> failedAssociatedResources) {
        setFailedAssociatedResources(failedAssociatedResources);
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
        if (getSuccessfullyAssociatedResources() != null)
            sb.append("SuccessfullyAssociatedResources: ").append(getSuccessfullyAssociatedResources()).append(",");
        if (getFailedAssociatedResources() != null)
            sb.append("FailedAssociatedResources: ").append(getFailedAssociatedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateResourcesToCustomLineItemResult == false)
            return false;
        BatchAssociateResourcesToCustomLineItemResult other = (BatchAssociateResourcesToCustomLineItemResult) obj;
        if (other.getSuccessfullyAssociatedResources() == null ^ this.getSuccessfullyAssociatedResources() == null)
            return false;
        if (other.getSuccessfullyAssociatedResources() != null
                && other.getSuccessfullyAssociatedResources().equals(this.getSuccessfullyAssociatedResources()) == false)
            return false;
        if (other.getFailedAssociatedResources() == null ^ this.getFailedAssociatedResources() == null)
            return false;
        if (other.getFailedAssociatedResources() != null && other.getFailedAssociatedResources().equals(this.getFailedAssociatedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfullyAssociatedResources() == null) ? 0 : getSuccessfullyAssociatedResources().hashCode());
        hashCode = prime * hashCode + ((getFailedAssociatedResources() == null) ? 0 : getFailedAssociatedResources().hashCode());
        return hashCode;
    }

    @Override
    public BatchAssociateResourcesToCustomLineItemResult clone() {
        try {
            return (BatchAssociateResourcesToCustomLineItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
