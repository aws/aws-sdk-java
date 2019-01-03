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
public class DeleteLaunchTemplateVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the launch template versions that were successfully deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeleteLaunchTemplateVersionsResponseSuccessItem> successfullyDeletedLaunchTemplateVersions;
    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeleteLaunchTemplateVersionsResponseErrorItem> unsuccessfullyDeletedLaunchTemplateVersions;

    /**
     * <p>
     * Information about the launch template versions that were successfully deleted.
     * </p>
     * 
     * @return Information about the launch template versions that were successfully deleted.
     */

    public java.util.List<DeleteLaunchTemplateVersionsResponseSuccessItem> getSuccessfullyDeletedLaunchTemplateVersions() {
        if (successfullyDeletedLaunchTemplateVersions == null) {
            successfullyDeletedLaunchTemplateVersions = new com.amazonaws.internal.SdkInternalList<DeleteLaunchTemplateVersionsResponseSuccessItem>();
        }
        return successfullyDeletedLaunchTemplateVersions;
    }

    /**
     * <p>
     * Information about the launch template versions that were successfully deleted.
     * </p>
     * 
     * @param successfullyDeletedLaunchTemplateVersions
     *        Information about the launch template versions that were successfully deleted.
     */

    public void setSuccessfullyDeletedLaunchTemplateVersions(
            java.util.Collection<DeleteLaunchTemplateVersionsResponseSuccessItem> successfullyDeletedLaunchTemplateVersions) {
        if (successfullyDeletedLaunchTemplateVersions == null) {
            this.successfullyDeletedLaunchTemplateVersions = null;
            return;
        }

        this.successfullyDeletedLaunchTemplateVersions = new com.amazonaws.internal.SdkInternalList<DeleteLaunchTemplateVersionsResponseSuccessItem>(
                successfullyDeletedLaunchTemplateVersions);
    }

    /**
     * <p>
     * Information about the launch template versions that were successfully deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfullyDeletedLaunchTemplateVersions(java.util.Collection)} or
     * {@link #withSuccessfullyDeletedLaunchTemplateVersions(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param successfullyDeletedLaunchTemplateVersions
     *        Information about the launch template versions that were successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsResult withSuccessfullyDeletedLaunchTemplateVersions(
            DeleteLaunchTemplateVersionsResponseSuccessItem... successfullyDeletedLaunchTemplateVersions) {
        if (this.successfullyDeletedLaunchTemplateVersions == null) {
            setSuccessfullyDeletedLaunchTemplateVersions(new com.amazonaws.internal.SdkInternalList<DeleteLaunchTemplateVersionsResponseSuccessItem>(
                    successfullyDeletedLaunchTemplateVersions.length));
        }
        for (DeleteLaunchTemplateVersionsResponseSuccessItem ele : successfullyDeletedLaunchTemplateVersions) {
            this.successfullyDeletedLaunchTemplateVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the launch template versions that were successfully deleted.
     * </p>
     * 
     * @param successfullyDeletedLaunchTemplateVersions
     *        Information about the launch template versions that were successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsResult withSuccessfullyDeletedLaunchTemplateVersions(
            java.util.Collection<DeleteLaunchTemplateVersionsResponseSuccessItem> successfullyDeletedLaunchTemplateVersions) {
        setSuccessfullyDeletedLaunchTemplateVersions(successfullyDeletedLaunchTemplateVersions);
        return this;
    }

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     * 
     * @return Information about the launch template versions that could not be deleted.
     */

    public java.util.List<DeleteLaunchTemplateVersionsResponseErrorItem> getUnsuccessfullyDeletedLaunchTemplateVersions() {
        if (unsuccessfullyDeletedLaunchTemplateVersions == null) {
            unsuccessfullyDeletedLaunchTemplateVersions = new com.amazonaws.internal.SdkInternalList<DeleteLaunchTemplateVersionsResponseErrorItem>();
        }
        return unsuccessfullyDeletedLaunchTemplateVersions;
    }

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     * 
     * @param unsuccessfullyDeletedLaunchTemplateVersions
     *        Information about the launch template versions that could not be deleted.
     */

    public void setUnsuccessfullyDeletedLaunchTemplateVersions(
            java.util.Collection<DeleteLaunchTemplateVersionsResponseErrorItem> unsuccessfullyDeletedLaunchTemplateVersions) {
        if (unsuccessfullyDeletedLaunchTemplateVersions == null) {
            this.unsuccessfullyDeletedLaunchTemplateVersions = null;
            return;
        }

        this.unsuccessfullyDeletedLaunchTemplateVersions = new com.amazonaws.internal.SdkInternalList<DeleteLaunchTemplateVersionsResponseErrorItem>(
                unsuccessfullyDeletedLaunchTemplateVersions);
    }

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessfullyDeletedLaunchTemplateVersions(java.util.Collection)} or
     * {@link #withUnsuccessfullyDeletedLaunchTemplateVersions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param unsuccessfullyDeletedLaunchTemplateVersions
     *        Information about the launch template versions that could not be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsResult withUnsuccessfullyDeletedLaunchTemplateVersions(
            DeleteLaunchTemplateVersionsResponseErrorItem... unsuccessfullyDeletedLaunchTemplateVersions) {
        if (this.unsuccessfullyDeletedLaunchTemplateVersions == null) {
            setUnsuccessfullyDeletedLaunchTemplateVersions(new com.amazonaws.internal.SdkInternalList<DeleteLaunchTemplateVersionsResponseErrorItem>(
                    unsuccessfullyDeletedLaunchTemplateVersions.length));
        }
        for (DeleteLaunchTemplateVersionsResponseErrorItem ele : unsuccessfullyDeletedLaunchTemplateVersions) {
            this.unsuccessfullyDeletedLaunchTemplateVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the launch template versions that could not be deleted.
     * </p>
     * 
     * @param unsuccessfullyDeletedLaunchTemplateVersions
     *        Information about the launch template versions that could not be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsResult withUnsuccessfullyDeletedLaunchTemplateVersions(
            java.util.Collection<DeleteLaunchTemplateVersionsResponseErrorItem> unsuccessfullyDeletedLaunchTemplateVersions) {
        setUnsuccessfullyDeletedLaunchTemplateVersions(unsuccessfullyDeletedLaunchTemplateVersions);
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
        if (getSuccessfullyDeletedLaunchTemplateVersions() != null)
            sb.append("SuccessfullyDeletedLaunchTemplateVersions: ").append(getSuccessfullyDeletedLaunchTemplateVersions()).append(",");
        if (getUnsuccessfullyDeletedLaunchTemplateVersions() != null)
            sb.append("UnsuccessfullyDeletedLaunchTemplateVersions: ").append(getUnsuccessfullyDeletedLaunchTemplateVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLaunchTemplateVersionsResult == false)
            return false;
        DeleteLaunchTemplateVersionsResult other = (DeleteLaunchTemplateVersionsResult) obj;
        if (other.getSuccessfullyDeletedLaunchTemplateVersions() == null ^ this.getSuccessfullyDeletedLaunchTemplateVersions() == null)
            return false;
        if (other.getSuccessfullyDeletedLaunchTemplateVersions() != null
                && other.getSuccessfullyDeletedLaunchTemplateVersions().equals(this.getSuccessfullyDeletedLaunchTemplateVersions()) == false)
            return false;
        if (other.getUnsuccessfullyDeletedLaunchTemplateVersions() == null ^ this.getUnsuccessfullyDeletedLaunchTemplateVersions() == null)
            return false;
        if (other.getUnsuccessfullyDeletedLaunchTemplateVersions() != null
                && other.getUnsuccessfullyDeletedLaunchTemplateVersions().equals(this.getUnsuccessfullyDeletedLaunchTemplateVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSuccessfullyDeletedLaunchTemplateVersions() == null) ? 0 : getSuccessfullyDeletedLaunchTemplateVersions().hashCode());
        hashCode = prime * hashCode
                + ((getUnsuccessfullyDeletedLaunchTemplateVersions() == null) ? 0 : getUnsuccessfullyDeletedLaunchTemplateVersions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLaunchTemplateVersionsResult clone() {
        try {
            return (DeleteLaunchTemplateVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
