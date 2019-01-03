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
public class DeleteFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeleteFleetSuccessItem> successfulFleetDeletions;
    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeleteFleetErrorItem> unsuccessfulFleetDeletions;

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     * 
     * @return Information about the EC2 Fleets that are successfully deleted.
     */

    public java.util.List<DeleteFleetSuccessItem> getSuccessfulFleetDeletions() {
        if (successfulFleetDeletions == null) {
            successfulFleetDeletions = new com.amazonaws.internal.SdkInternalList<DeleteFleetSuccessItem>();
        }
        return successfulFleetDeletions;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     * 
     * @param successfulFleetDeletions
     *        Information about the EC2 Fleets that are successfully deleted.
     */

    public void setSuccessfulFleetDeletions(java.util.Collection<DeleteFleetSuccessItem> successfulFleetDeletions) {
        if (successfulFleetDeletions == null) {
            this.successfulFleetDeletions = null;
            return;
        }

        this.successfulFleetDeletions = new com.amazonaws.internal.SdkInternalList<DeleteFleetSuccessItem>(successfulFleetDeletions);
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulFleetDeletions(java.util.Collection)} or
     * {@link #withSuccessfulFleetDeletions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param successfulFleetDeletions
     *        Information about the EC2 Fleets that are successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetsResult withSuccessfulFleetDeletions(DeleteFleetSuccessItem... successfulFleetDeletions) {
        if (this.successfulFleetDeletions == null) {
            setSuccessfulFleetDeletions(new com.amazonaws.internal.SdkInternalList<DeleteFleetSuccessItem>(successfulFleetDeletions.length));
        }
        for (DeleteFleetSuccessItem ele : successfulFleetDeletions) {
            this.successfulFleetDeletions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     * 
     * @param successfulFleetDeletions
     *        Information about the EC2 Fleets that are successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetsResult withSuccessfulFleetDeletions(java.util.Collection<DeleteFleetSuccessItem> successfulFleetDeletions) {
        setSuccessfulFleetDeletions(successfulFleetDeletions);
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     * 
     * @return Information about the EC2 Fleets that are not successfully deleted.
     */

    public java.util.List<DeleteFleetErrorItem> getUnsuccessfulFleetDeletions() {
        if (unsuccessfulFleetDeletions == null) {
            unsuccessfulFleetDeletions = new com.amazonaws.internal.SdkInternalList<DeleteFleetErrorItem>();
        }
        return unsuccessfulFleetDeletions;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     * 
     * @param unsuccessfulFleetDeletions
     *        Information about the EC2 Fleets that are not successfully deleted.
     */

    public void setUnsuccessfulFleetDeletions(java.util.Collection<DeleteFleetErrorItem> unsuccessfulFleetDeletions) {
        if (unsuccessfulFleetDeletions == null) {
            this.unsuccessfulFleetDeletions = null;
            return;
        }

        this.unsuccessfulFleetDeletions = new com.amazonaws.internal.SdkInternalList<DeleteFleetErrorItem>(unsuccessfulFleetDeletions);
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessfulFleetDeletions(java.util.Collection)} or
     * {@link #withUnsuccessfulFleetDeletions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unsuccessfulFleetDeletions
     *        Information about the EC2 Fleets that are not successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetsResult withUnsuccessfulFleetDeletions(DeleteFleetErrorItem... unsuccessfulFleetDeletions) {
        if (this.unsuccessfulFleetDeletions == null) {
            setUnsuccessfulFleetDeletions(new com.amazonaws.internal.SdkInternalList<DeleteFleetErrorItem>(unsuccessfulFleetDeletions.length));
        }
        for (DeleteFleetErrorItem ele : unsuccessfulFleetDeletions) {
            this.unsuccessfulFleetDeletions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     * 
     * @param unsuccessfulFleetDeletions
     *        Information about the EC2 Fleets that are not successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetsResult withUnsuccessfulFleetDeletions(java.util.Collection<DeleteFleetErrorItem> unsuccessfulFleetDeletions) {
        setUnsuccessfulFleetDeletions(unsuccessfulFleetDeletions);
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
        if (getSuccessfulFleetDeletions() != null)
            sb.append("SuccessfulFleetDeletions: ").append(getSuccessfulFleetDeletions()).append(",");
        if (getUnsuccessfulFleetDeletions() != null)
            sb.append("UnsuccessfulFleetDeletions: ").append(getUnsuccessfulFleetDeletions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetsResult == false)
            return false;
        DeleteFleetsResult other = (DeleteFleetsResult) obj;
        if (other.getSuccessfulFleetDeletions() == null ^ this.getSuccessfulFleetDeletions() == null)
            return false;
        if (other.getSuccessfulFleetDeletions() != null && other.getSuccessfulFleetDeletions().equals(this.getSuccessfulFleetDeletions()) == false)
            return false;
        if (other.getUnsuccessfulFleetDeletions() == null ^ this.getUnsuccessfulFleetDeletions() == null)
            return false;
        if (other.getUnsuccessfulFleetDeletions() != null && other.getUnsuccessfulFleetDeletions().equals(this.getUnsuccessfulFleetDeletions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulFleetDeletions() == null) ? 0 : getSuccessfulFleetDeletions().hashCode());
        hashCode = prime * hashCode + ((getUnsuccessfulFleetDeletions() == null) ? 0 : getUnsuccessfulFleetDeletions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFleetsResult clone() {
        try {
            return (DeleteFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
