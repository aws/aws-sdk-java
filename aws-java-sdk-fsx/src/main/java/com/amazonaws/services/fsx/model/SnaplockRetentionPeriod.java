/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration to set the retention period of an FSx for ONTAP SnapLock volume. The retention period includes
 * default, maximum, and minimum settings. For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-retention.html">Working with the retention period in
 * SnapLock</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/SnaplockRetentionPeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnaplockRetentionPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The retention period assigned to a write once, read many (WORM) file by default if an explicit retention period
     * is not set for an FSx for ONTAP SnapLock volume. The default retention period must be greater than or equal to
     * the minimum retention period and less than or equal to the maximum retention period.
     * </p>
     */
    private RetentionPeriod defaultRetention;
    /**
     * <p>
     * The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * </p>
     */
    private RetentionPeriod minimumRetention;
    /**
     * <p>
     * The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * </p>
     */
    private RetentionPeriod maximumRetention;

    /**
     * <p>
     * The retention period assigned to a write once, read many (WORM) file by default if an explicit retention period
     * is not set for an FSx for ONTAP SnapLock volume. The default retention period must be greater than or equal to
     * the minimum retention period and less than or equal to the maximum retention period.
     * </p>
     * 
     * @param defaultRetention
     *        The retention period assigned to a write once, read many (WORM) file by default if an explicit retention
     *        period is not set for an FSx for ONTAP SnapLock volume. The default retention period must be greater than
     *        or equal to the minimum retention period and less than or equal to the maximum retention period.
     */

    public void setDefaultRetention(RetentionPeriod defaultRetention) {
        this.defaultRetention = defaultRetention;
    }

    /**
     * <p>
     * The retention period assigned to a write once, read many (WORM) file by default if an explicit retention period
     * is not set for an FSx for ONTAP SnapLock volume. The default retention period must be greater than or equal to
     * the minimum retention period and less than or equal to the maximum retention period.
     * </p>
     * 
     * @return The retention period assigned to a write once, read many (WORM) file by default if an explicit retention
     *         period is not set for an FSx for ONTAP SnapLock volume. The default retention period must be greater than
     *         or equal to the minimum retention period and less than or equal to the maximum retention period.
     */

    public RetentionPeriod getDefaultRetention() {
        return this.defaultRetention;
    }

    /**
     * <p>
     * The retention period assigned to a write once, read many (WORM) file by default if an explicit retention period
     * is not set for an FSx for ONTAP SnapLock volume. The default retention period must be greater than or equal to
     * the minimum retention period and less than or equal to the maximum retention period.
     * </p>
     * 
     * @param defaultRetention
     *        The retention period assigned to a write once, read many (WORM) file by default if an explicit retention
     *        period is not set for an FSx for ONTAP SnapLock volume. The default retention period must be greater than
     *        or equal to the minimum retention period and less than or equal to the maximum retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnaplockRetentionPeriod withDefaultRetention(RetentionPeriod defaultRetention) {
        setDefaultRetention(defaultRetention);
        return this;
    }

    /**
     * <p>
     * The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @param minimumRetention
     *        The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     */

    public void setMinimumRetention(RetentionPeriod minimumRetention) {
        this.minimumRetention = minimumRetention;
    }

    /**
     * <p>
     * The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @return The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     */

    public RetentionPeriod getMinimumRetention() {
        return this.minimumRetention;
    }

    /**
     * <p>
     * The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @param minimumRetention
     *        The shortest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnaplockRetentionPeriod withMinimumRetention(RetentionPeriod minimumRetention) {
        setMinimumRetention(minimumRetention);
        return this;
    }

    /**
     * <p>
     * The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @param maximumRetention
     *        The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     */

    public void setMaximumRetention(RetentionPeriod maximumRetention) {
        this.maximumRetention = maximumRetention;
    }

    /**
     * <p>
     * The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @return The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     */

    public RetentionPeriod getMaximumRetention() {
        return this.maximumRetention;
    }

    /**
     * <p>
     * The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @param maximumRetention
     *        The longest retention period that can be assigned to a WORM file on an FSx for ONTAP SnapLock volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnaplockRetentionPeriod withMaximumRetention(RetentionPeriod maximumRetention) {
        setMaximumRetention(maximumRetention);
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
        if (getDefaultRetention() != null)
            sb.append("DefaultRetention: ").append(getDefaultRetention()).append(",");
        if (getMinimumRetention() != null)
            sb.append("MinimumRetention: ").append(getMinimumRetention()).append(",");
        if (getMaximumRetention() != null)
            sb.append("MaximumRetention: ").append(getMaximumRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnaplockRetentionPeriod == false)
            return false;
        SnaplockRetentionPeriod other = (SnaplockRetentionPeriod) obj;
        if (other.getDefaultRetention() == null ^ this.getDefaultRetention() == null)
            return false;
        if (other.getDefaultRetention() != null && other.getDefaultRetention().equals(this.getDefaultRetention()) == false)
            return false;
        if (other.getMinimumRetention() == null ^ this.getMinimumRetention() == null)
            return false;
        if (other.getMinimumRetention() != null && other.getMinimumRetention().equals(this.getMinimumRetention()) == false)
            return false;
        if (other.getMaximumRetention() == null ^ this.getMaximumRetention() == null)
            return false;
        if (other.getMaximumRetention() != null && other.getMaximumRetention().equals(this.getMaximumRetention()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultRetention() == null) ? 0 : getDefaultRetention().hashCode());
        hashCode = prime * hashCode + ((getMinimumRetention() == null) ? 0 : getMinimumRetention().hashCode());
        hashCode = prime * hashCode + ((getMaximumRetention() == null) ? 0 : getMaximumRetention().hashCode());
        return hashCode;
    }

    @Override
    public SnaplockRetentionPeriod clone() {
        try {
            return (SnaplockRetentionPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.SnaplockRetentionPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
