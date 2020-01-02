/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DisableFastSnapshotRestoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were successfully disabled.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreSuccessItem> successful;
    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could not be disabled.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreErrorItem> unsuccessful;

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were successfully disabled.
     * </p>
     * 
     * @return Information about the snapshots for which fast snapshot restores were successfully disabled.
     */

    public java.util.List<DisableFastSnapshotRestoreSuccessItem> getSuccessful() {
        if (successful == null) {
            successful = new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreSuccessItem>();
        }
        return successful;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were successfully disabled.
     * </p>
     * 
     * @param successful
     *        Information about the snapshots for which fast snapshot restores were successfully disabled.
     */

    public void setSuccessful(java.util.Collection<DisableFastSnapshotRestoreSuccessItem> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreSuccessItem>(successful);
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were successfully disabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        Information about the snapshots for which fast snapshot restores were successfully disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoresResult withSuccessful(DisableFastSnapshotRestoreSuccessItem... successful) {
        if (this.successful == null) {
            setSuccessful(new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreSuccessItem>(successful.length));
        }
        for (DisableFastSnapshotRestoreSuccessItem ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores were successfully disabled.
     * </p>
     * 
     * @param successful
     *        Information about the snapshots for which fast snapshot restores were successfully disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoresResult withSuccessful(java.util.Collection<DisableFastSnapshotRestoreSuccessItem> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could not be disabled.
     * </p>
     * 
     * @return Information about the snapshots for which fast snapshot restores could not be disabled.
     */

    public java.util.List<DisableFastSnapshotRestoreErrorItem> getUnsuccessful() {
        if (unsuccessful == null) {
            unsuccessful = new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreErrorItem>();
        }
        return unsuccessful;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could not be disabled.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the snapshots for which fast snapshot restores could not be disabled.
     */

    public void setUnsuccessful(java.util.Collection<DisableFastSnapshotRestoreErrorItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreErrorItem>(unsuccessful);
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could not be disabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessful(java.util.Collection)} or {@link #withUnsuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the snapshots for which fast snapshot restores could not be disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoresResult withUnsuccessful(DisableFastSnapshotRestoreErrorItem... unsuccessful) {
        if (this.unsuccessful == null) {
            setUnsuccessful(new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreErrorItem>(unsuccessful.length));
        }
        for (DisableFastSnapshotRestoreErrorItem ele : unsuccessful) {
            this.unsuccessful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots for which fast snapshot restores could not be disabled.
     * </p>
     * 
     * @param unsuccessful
     *        Information about the snapshots for which fast snapshot restores could not be disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoresResult withUnsuccessful(java.util.Collection<DisableFastSnapshotRestoreErrorItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getSuccessful() != null)
            sb.append("Successful: ").append(getSuccessful()).append(",");
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: ").append(getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableFastSnapshotRestoresResult == false)
            return false;
        DisableFastSnapshotRestoresResult other = (DisableFastSnapshotRestoresResult) obj;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public DisableFastSnapshotRestoresResult clone() {
        try {
            return (DisableFastSnapshotRestoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
