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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BatchDisassociateResourcesFromCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateResourcesFromCustomLineItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated from a
     * percentage custom line item successfully.
     * </p>
     */
    private java.util.List<DisassociateResourceResponseElement> successfullyDisassociatedResources;
    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation from a
     * percentage custom line item.
     * </p>
     */
    private java.util.List<DisassociateResourceResponseElement> failedDisassociatedResources;

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated from a
     * percentage custom line item successfully.
     * </p>
     * 
     * @return A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated
     *         from a percentage custom line item successfully.
     */

    public java.util.List<DisassociateResourceResponseElement> getSuccessfullyDisassociatedResources() {
        return successfullyDisassociatedResources;
    }

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated from a
     * percentage custom line item successfully.
     * </p>
     * 
     * @param successfullyDisassociatedResources
     *        A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated
     *        from a percentage custom line item successfully.
     */

    public void setSuccessfullyDisassociatedResources(java.util.Collection<DisassociateResourceResponseElement> successfullyDisassociatedResources) {
        if (successfullyDisassociatedResources == null) {
            this.successfullyDisassociatedResources = null;
            return;
        }

        this.successfullyDisassociatedResources = new java.util.ArrayList<DisassociateResourceResponseElement>(successfullyDisassociatedResources);
    }

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated from a
     * percentage custom line item successfully.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfullyDisassociatedResources(java.util.Collection)} or
     * {@link #withSuccessfullyDisassociatedResources(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param successfullyDisassociatedResources
     *        A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated
     *        from a percentage custom line item successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourcesFromCustomLineItemResult withSuccessfullyDisassociatedResources(
            DisassociateResourceResponseElement... successfullyDisassociatedResources) {
        if (this.successfullyDisassociatedResources == null) {
            setSuccessfullyDisassociatedResources(new java.util.ArrayList<DisassociateResourceResponseElement>(successfullyDisassociatedResources.length));
        }
        for (DisassociateResourceResponseElement ele : successfullyDisassociatedResources) {
            this.successfullyDisassociatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated from a
     * percentage custom line item successfully.
     * </p>
     * 
     * @param successfullyDisassociatedResources
     *        A list of <code>DisassociateResourceResponseElement</code> for each resource that's been disassociated
     *        from a percentage custom line item successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourcesFromCustomLineItemResult withSuccessfullyDisassociatedResources(
            java.util.Collection<DisassociateResourceResponseElement> successfullyDisassociatedResources) {
        setSuccessfullyDisassociatedResources(successfullyDisassociatedResources);
        return this;
    }

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation from a
     * percentage custom line item.
     * </p>
     * 
     * @return A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation
     *         from a percentage custom line item.
     */

    public java.util.List<DisassociateResourceResponseElement> getFailedDisassociatedResources() {
        return failedDisassociatedResources;
    }

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation from a
     * percentage custom line item.
     * </p>
     * 
     * @param failedDisassociatedResources
     *        A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation
     *        from a percentage custom line item.
     */

    public void setFailedDisassociatedResources(java.util.Collection<DisassociateResourceResponseElement> failedDisassociatedResources) {
        if (failedDisassociatedResources == null) {
            this.failedDisassociatedResources = null;
            return;
        }

        this.failedDisassociatedResources = new java.util.ArrayList<DisassociateResourceResponseElement>(failedDisassociatedResources);
    }

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation from a
     * percentage custom line item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedDisassociatedResources(java.util.Collection)} or
     * {@link #withFailedDisassociatedResources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedDisassociatedResources
     *        A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation
     *        from a percentage custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourcesFromCustomLineItemResult withFailedDisassociatedResources(
            DisassociateResourceResponseElement... failedDisassociatedResources) {
        if (this.failedDisassociatedResources == null) {
            setFailedDisassociatedResources(new java.util.ArrayList<DisassociateResourceResponseElement>(failedDisassociatedResources.length));
        }
        for (DisassociateResourceResponseElement ele : failedDisassociatedResources) {
            this.failedDisassociatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation from a
     * percentage custom line item.
     * </p>
     * 
     * @param failedDisassociatedResources
     *        A list of <code>DisassociateResourceResponseElement</code> for each resource that failed disassociation
     *        from a percentage custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourcesFromCustomLineItemResult withFailedDisassociatedResources(
            java.util.Collection<DisassociateResourceResponseElement> failedDisassociatedResources) {
        setFailedDisassociatedResources(failedDisassociatedResources);
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
        if (getSuccessfullyDisassociatedResources() != null)
            sb.append("SuccessfullyDisassociatedResources: ").append(getSuccessfullyDisassociatedResources()).append(",");
        if (getFailedDisassociatedResources() != null)
            sb.append("FailedDisassociatedResources: ").append(getFailedDisassociatedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateResourcesFromCustomLineItemResult == false)
            return false;
        BatchDisassociateResourcesFromCustomLineItemResult other = (BatchDisassociateResourcesFromCustomLineItemResult) obj;
        if (other.getSuccessfullyDisassociatedResources() == null ^ this.getSuccessfullyDisassociatedResources() == null)
            return false;
        if (other.getSuccessfullyDisassociatedResources() != null
                && other.getSuccessfullyDisassociatedResources().equals(this.getSuccessfullyDisassociatedResources()) == false)
            return false;
        if (other.getFailedDisassociatedResources() == null ^ this.getFailedDisassociatedResources() == null)
            return false;
        if (other.getFailedDisassociatedResources() != null && other.getFailedDisassociatedResources().equals(this.getFailedDisassociatedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfullyDisassociatedResources() == null) ? 0 : getSuccessfullyDisassociatedResources().hashCode());
        hashCode = prime * hashCode + ((getFailedDisassociatedResources() == null) ? 0 : getFailedDisassociatedResources().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateResourcesFromCustomLineItemResult clone() {
        try {
            return (BatchDisassociateResourcesFromCustomLineItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
