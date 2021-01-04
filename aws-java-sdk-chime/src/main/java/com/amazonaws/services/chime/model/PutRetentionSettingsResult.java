/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutRetentionSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRetentionSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The retention settings.
     * </p>
     */
    private RetentionSettings retentionSettings;
    /**
     * <p>
     * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
     * </p>
     */
    private java.util.Date initiateDeletionTimestamp;

    /**
     * <p>
     * The retention settings.
     * </p>
     * 
     * @param retentionSettings
     *        The retention settings.
     */

    public void setRetentionSettings(RetentionSettings retentionSettings) {
        this.retentionSettings = retentionSettings;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     * 
     * @return The retention settings.
     */

    public RetentionSettings getRetentionSettings() {
        return this.retentionSettings;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     * 
     * @param retentionSettings
     *        The retention settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRetentionSettingsResult withRetentionSettings(RetentionSettings retentionSettings) {
        setRetentionSettings(retentionSettings);
        return this;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
     * </p>
     * 
     * @param initiateDeletionTimestamp
     *        The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601
     *        format.
     */

    public void setInitiateDeletionTimestamp(java.util.Date initiateDeletionTimestamp) {
        this.initiateDeletionTimestamp = initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
     * </p>
     * 
     * @return The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601
     *         format.
     */

    public java.util.Date getInitiateDeletionTimestamp() {
        return this.initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
     * </p>
     * 
     * @param initiateDeletionTimestamp
     *        The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRetentionSettingsResult withInitiateDeletionTimestamp(java.util.Date initiateDeletionTimestamp) {
        setInitiateDeletionTimestamp(initiateDeletionTimestamp);
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
        if (getRetentionSettings() != null)
            sb.append("RetentionSettings: ").append(getRetentionSettings()).append(",");
        if (getInitiateDeletionTimestamp() != null)
            sb.append("InitiateDeletionTimestamp: ").append(getInitiateDeletionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRetentionSettingsResult == false)
            return false;
        PutRetentionSettingsResult other = (PutRetentionSettingsResult) obj;
        if (other.getRetentionSettings() == null ^ this.getRetentionSettings() == null)
            return false;
        if (other.getRetentionSettings() != null && other.getRetentionSettings().equals(this.getRetentionSettings()) == false)
            return false;
        if (other.getInitiateDeletionTimestamp() == null ^ this.getInitiateDeletionTimestamp() == null)
            return false;
        if (other.getInitiateDeletionTimestamp() != null && other.getInitiateDeletionTimestamp().equals(this.getInitiateDeletionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionSettings() == null) ? 0 : getRetentionSettings().hashCode());
        hashCode = prime * hashCode + ((getInitiateDeletionTimestamp() == null) ? 0 : getInitiateDeletionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public PutRetentionSettingsResult clone() {
        try {
            return (PutRetentionSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
