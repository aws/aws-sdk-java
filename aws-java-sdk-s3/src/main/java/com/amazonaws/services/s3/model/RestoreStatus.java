/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * Specifies the restoration status of an object. Objects in certain storage classes must be restored before they can be
 * retrieved. For more information about these storage classes and how to work with archived objects, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/archived-objects.html"> Working with archived objects</a>
 * in the <i>Amazon S3 User Guide</i>.
 * </p>
 */
public class RestoreStatus implements Serializable {

    /**
     * Specifies whether the object is currently being restored or not
     */
    private Boolean isRestoreInProgress;

    /**
     * Indicates when the restored copy will expire. This value is only populated if the object has already been
     * restored.
     */
    private Date restoreExpiryDate;

    /**
     * <p>
     * Specifies whether the object is currently being restored. <code>TRUE</code> indicates that the object is
     * currently being restored. <code>FALSE</code> indicates that the restoration process has either not started or is
     * already complete.
     * </p>
     *
     * @return Specifies whether the object is currently being restored. <code>TRUE</code> indicates that the object is
     *         currently being restored. <code>FALSE</code> indicates that the restoration process has either not
     *         started or is already complete.
     */
    public Boolean isRestoreInProgress() {
        return isRestoreInProgress;
    }

    /**
     * Sets the restore status of an object which specifies whether the object is currently being restored.
     *
     * @param isRestoreInProgress
     * @return {@link RestoreStatus}
     */
    public RestoreStatus withIsRestoreInProgress(Boolean isRestoreInProgress) {
        this.isRestoreInProgress = isRestoreInProgress;
        return this;
    }

    /**
     * Sets the restore status of an object which specifies whether the object is currently being restored.
     *
     * @param isRestoreInProgress
     */
    public void setIsRestoreInProgress(Boolean isRestoreInProgress) {
        withIsRestoreInProgress(isRestoreInProgress);
    }


    /**
     * <p>
     * Indicates when the restored copy will expire. This value is only populated if the object has already been
     * restored.
     * </p>
     *
     * @return Indicates when the restored copy will expire. This value is only populated if the object has already been
     *         restored.
     */
    public Date getRestoreExpiryDate() {
        return restoreExpiryDate;
    }

    /**
     * Sets the restore expiry date of an object. This value is only populated if the object has already been
     * restored.
     *
     * @param restoreExpiryDate
     * @return {@link RestoreStatus}
     */
    public RestoreStatus withRestoreExpiryDate(Date restoreExpiryDate) {
        this.restoreExpiryDate = restoreExpiryDate;
        return this;
    }

    /**
     * Sets the restore expiry date of an object. This value is only populated if the object has already been
     * restored.
     *
     * @param restoreExpiryDate
     */
    public void setRestoreExpiryDate(Date restoreExpiryDate) {
        withRestoreExpiryDate(restoreExpiryDate);
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestoreExpiryDate() != null) {
            sb.append("RestoreExpiryDate: ").append(getRestoreExpiryDate()).append(", ");
        }
        if (isRestoreInProgress() != null) {
            sb.append("RestoreInProgress: ").append(isRestoreInProgress()).append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof RestoreStatus == false) {
            return false;
        }
        RestoreStatus other = (RestoreStatus) obj;
        if (other.getRestoreExpiryDate() == null ^ this.getRestoreExpiryDate() == null) {
            return false;
        }
        if (other.isRestoreInProgress() == null ^ this.isRestoreInProgress() == null) {
            return false;
        }
        if (other.getRestoreExpiryDate() != null &&
                other.getRestoreExpiryDate().equals(this.getRestoreExpiryDate()) == false) {
            return false;
        }
        if (other.isRestoreInProgress() != null &&
                other.isRestoreInProgress().equals(this.isRestoreInProgress()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreExpiryDate() == null) ? 0 : getRestoreExpiryDate().hashCode());
        hashCode = prime * hashCode + ((isRestoreInProgress() == null) ? 0 : isRestoreInProgress().hashCode());
        return hashCode;
    }

    @Override
    public RestoreStatus clone() {
        try {
            return (RestoreStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
