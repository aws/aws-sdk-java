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

/**
 * <p>
 * Contains information about the errors that occurred when disabling fast snapshot restores.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DisableFastSnapshotRestoreErrorItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableFastSnapshotRestoreErrorItem implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The errors.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreStateErrorItem> fastSnapshotRestoreStateErrors;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoreErrorItem withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The errors.
     * </p>
     * 
     * @return The errors.
     */

    public java.util.List<DisableFastSnapshotRestoreStateErrorItem> getFastSnapshotRestoreStateErrors() {
        if (fastSnapshotRestoreStateErrors == null) {
            fastSnapshotRestoreStateErrors = new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreStateErrorItem>();
        }
        return fastSnapshotRestoreStateErrors;
    }

    /**
     * <p>
     * The errors.
     * </p>
     * 
     * @param fastSnapshotRestoreStateErrors
     *        The errors.
     */

    public void setFastSnapshotRestoreStateErrors(java.util.Collection<DisableFastSnapshotRestoreStateErrorItem> fastSnapshotRestoreStateErrors) {
        if (fastSnapshotRestoreStateErrors == null) {
            this.fastSnapshotRestoreStateErrors = null;
            return;
        }

        this.fastSnapshotRestoreStateErrors = new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreStateErrorItem>(
                fastSnapshotRestoreStateErrors);
    }

    /**
     * <p>
     * The errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFastSnapshotRestoreStateErrors(java.util.Collection)} or
     * {@link #withFastSnapshotRestoreStateErrors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param fastSnapshotRestoreStateErrors
     *        The errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoreErrorItem withFastSnapshotRestoreStateErrors(DisableFastSnapshotRestoreStateErrorItem... fastSnapshotRestoreStateErrors) {
        if (this.fastSnapshotRestoreStateErrors == null) {
            setFastSnapshotRestoreStateErrors(new com.amazonaws.internal.SdkInternalList<DisableFastSnapshotRestoreStateErrorItem>(
                    fastSnapshotRestoreStateErrors.length));
        }
        for (DisableFastSnapshotRestoreStateErrorItem ele : fastSnapshotRestoreStateErrors) {
            this.fastSnapshotRestoreStateErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The errors.
     * </p>
     * 
     * @param fastSnapshotRestoreStateErrors
     *        The errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableFastSnapshotRestoreErrorItem withFastSnapshotRestoreStateErrors(
            java.util.Collection<DisableFastSnapshotRestoreStateErrorItem> fastSnapshotRestoreStateErrors) {
        setFastSnapshotRestoreStateErrors(fastSnapshotRestoreStateErrors);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getFastSnapshotRestoreStateErrors() != null)
            sb.append("FastSnapshotRestoreStateErrors: ").append(getFastSnapshotRestoreStateErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableFastSnapshotRestoreErrorItem == false)
            return false;
        DisableFastSnapshotRestoreErrorItem other = (DisableFastSnapshotRestoreErrorItem) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getFastSnapshotRestoreStateErrors() == null ^ this.getFastSnapshotRestoreStateErrors() == null)
            return false;
        if (other.getFastSnapshotRestoreStateErrors() != null
                && other.getFastSnapshotRestoreStateErrors().equals(this.getFastSnapshotRestoreStateErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getFastSnapshotRestoreStateErrors() == null) ? 0 : getFastSnapshotRestoreStateErrors().hashCode());
        return hashCode;
    }

    @Override
    public DisableFastSnapshotRestoreErrorItem clone() {
        try {
            return (DisableFastSnapshotRestoreErrorItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
