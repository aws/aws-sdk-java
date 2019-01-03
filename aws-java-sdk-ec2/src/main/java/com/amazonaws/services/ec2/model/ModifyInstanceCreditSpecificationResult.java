/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceCreditSpecificationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was successfully modified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SuccessfulInstanceCreditSpecificationItem> successfulInstanceCreditSpecifications;
    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not modified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UnsuccessfulInstanceCreditSpecificationItem> unsuccessfulInstanceCreditSpecifications;

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was successfully modified.
     * </p>
     * 
     * @return Information about the instances whose credit option for CPU usage was successfully modified.
     */

    public java.util.List<SuccessfulInstanceCreditSpecificationItem> getSuccessfulInstanceCreditSpecifications() {
        if (successfulInstanceCreditSpecifications == null) {
            successfulInstanceCreditSpecifications = new com.amazonaws.internal.SdkInternalList<SuccessfulInstanceCreditSpecificationItem>();
        }
        return successfulInstanceCreditSpecifications;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was successfully modified.
     * </p>
     * 
     * @param successfulInstanceCreditSpecifications
     *        Information about the instances whose credit option for CPU usage was successfully modified.
     */

    public void setSuccessfulInstanceCreditSpecifications(java.util.Collection<SuccessfulInstanceCreditSpecificationItem> successfulInstanceCreditSpecifications) {
        if (successfulInstanceCreditSpecifications == null) {
            this.successfulInstanceCreditSpecifications = null;
            return;
        }

        this.successfulInstanceCreditSpecifications = new com.amazonaws.internal.SdkInternalList<SuccessfulInstanceCreditSpecificationItem>(
                successfulInstanceCreditSpecifications);
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was successfully modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulInstanceCreditSpecifications(java.util.Collection)} or
     * {@link #withSuccessfulInstanceCreditSpecifications(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param successfulInstanceCreditSpecifications
     *        Information about the instances whose credit option for CPU usage was successfully modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCreditSpecificationResult withSuccessfulInstanceCreditSpecifications(
            SuccessfulInstanceCreditSpecificationItem... successfulInstanceCreditSpecifications) {
        if (this.successfulInstanceCreditSpecifications == null) {
            setSuccessfulInstanceCreditSpecifications(new com.amazonaws.internal.SdkInternalList<SuccessfulInstanceCreditSpecificationItem>(
                    successfulInstanceCreditSpecifications.length));
        }
        for (SuccessfulInstanceCreditSpecificationItem ele : successfulInstanceCreditSpecifications) {
            this.successfulInstanceCreditSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was successfully modified.
     * </p>
     * 
     * @param successfulInstanceCreditSpecifications
     *        Information about the instances whose credit option for CPU usage was successfully modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCreditSpecificationResult withSuccessfulInstanceCreditSpecifications(
            java.util.Collection<SuccessfulInstanceCreditSpecificationItem> successfulInstanceCreditSpecifications) {
        setSuccessfulInstanceCreditSpecifications(successfulInstanceCreditSpecifications);
        return this;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not modified.
     * </p>
     * 
     * @return Information about the instances whose credit option for CPU usage was not modified.
     */

    public java.util.List<UnsuccessfulInstanceCreditSpecificationItem> getUnsuccessfulInstanceCreditSpecifications() {
        if (unsuccessfulInstanceCreditSpecifications == null) {
            unsuccessfulInstanceCreditSpecifications = new com.amazonaws.internal.SdkInternalList<UnsuccessfulInstanceCreditSpecificationItem>();
        }
        return unsuccessfulInstanceCreditSpecifications;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not modified.
     * </p>
     * 
     * @param unsuccessfulInstanceCreditSpecifications
     *        Information about the instances whose credit option for CPU usage was not modified.
     */

    public void setUnsuccessfulInstanceCreditSpecifications(
            java.util.Collection<UnsuccessfulInstanceCreditSpecificationItem> unsuccessfulInstanceCreditSpecifications) {
        if (unsuccessfulInstanceCreditSpecifications == null) {
            this.unsuccessfulInstanceCreditSpecifications = null;
            return;
        }

        this.unsuccessfulInstanceCreditSpecifications = new com.amazonaws.internal.SdkInternalList<UnsuccessfulInstanceCreditSpecificationItem>(
                unsuccessfulInstanceCreditSpecifications);
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessfulInstanceCreditSpecifications(java.util.Collection)} or
     * {@link #withUnsuccessfulInstanceCreditSpecifications(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param unsuccessfulInstanceCreditSpecifications
     *        Information about the instances whose credit option for CPU usage was not modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCreditSpecificationResult withUnsuccessfulInstanceCreditSpecifications(
            UnsuccessfulInstanceCreditSpecificationItem... unsuccessfulInstanceCreditSpecifications) {
        if (this.unsuccessfulInstanceCreditSpecifications == null) {
            setUnsuccessfulInstanceCreditSpecifications(new com.amazonaws.internal.SdkInternalList<UnsuccessfulInstanceCreditSpecificationItem>(
                    unsuccessfulInstanceCreditSpecifications.length));
        }
        for (UnsuccessfulInstanceCreditSpecificationItem ele : unsuccessfulInstanceCreditSpecifications) {
            this.unsuccessfulInstanceCreditSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not modified.
     * </p>
     * 
     * @param unsuccessfulInstanceCreditSpecifications
     *        Information about the instances whose credit option for CPU usage was not modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCreditSpecificationResult withUnsuccessfulInstanceCreditSpecifications(
            java.util.Collection<UnsuccessfulInstanceCreditSpecificationItem> unsuccessfulInstanceCreditSpecifications) {
        setUnsuccessfulInstanceCreditSpecifications(unsuccessfulInstanceCreditSpecifications);
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
        if (getSuccessfulInstanceCreditSpecifications() != null)
            sb.append("SuccessfulInstanceCreditSpecifications: ").append(getSuccessfulInstanceCreditSpecifications()).append(",");
        if (getUnsuccessfulInstanceCreditSpecifications() != null)
            sb.append("UnsuccessfulInstanceCreditSpecifications: ").append(getUnsuccessfulInstanceCreditSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceCreditSpecificationResult == false)
            return false;
        ModifyInstanceCreditSpecificationResult other = (ModifyInstanceCreditSpecificationResult) obj;
        if (other.getSuccessfulInstanceCreditSpecifications() == null ^ this.getSuccessfulInstanceCreditSpecifications() == null)
            return false;
        if (other.getSuccessfulInstanceCreditSpecifications() != null
                && other.getSuccessfulInstanceCreditSpecifications().equals(this.getSuccessfulInstanceCreditSpecifications()) == false)
            return false;
        if (other.getUnsuccessfulInstanceCreditSpecifications() == null ^ this.getUnsuccessfulInstanceCreditSpecifications() == null)
            return false;
        if (other.getUnsuccessfulInstanceCreditSpecifications() != null
                && other.getUnsuccessfulInstanceCreditSpecifications().equals(this.getUnsuccessfulInstanceCreditSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulInstanceCreditSpecifications() == null) ? 0 : getSuccessfulInstanceCreditSpecifications().hashCode());
        hashCode = prime * hashCode + ((getUnsuccessfulInstanceCreditSpecifications() == null) ? 0 : getUnsuccessfulInstanceCreditSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceCreditSpecificationResult clone() {
        try {
            return (ModifyInstanceCreditSpecificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
