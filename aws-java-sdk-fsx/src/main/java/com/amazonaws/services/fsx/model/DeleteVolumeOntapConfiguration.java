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
 * Use to specify skipping a final backup, adding tags to a final backup, or bypassing the retention period of an FSx
 * for ONTAP SnapLock Enterprise volume when deleting an FSx for ONTAP volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteVolumeOntapConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVolumeOntapConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set to true if you want to skip taking a final backup of the volume you are deleting.
     * </p>
     */
    private Boolean skipFinalBackup;

    private java.util.List<Tag> finalBackupTags;
    /**
     * <p>
     * Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise
     * volume with unexpired write once, read many (WORM) files. The IAM permission
     * <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes with
     * unexpired WORM files. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     * volume</a>.
     * </p>
     */
    private Boolean bypassSnaplockEnterpriseRetention;

    /**
     * <p>
     * Set to true if you want to skip taking a final backup of the volume you are deleting.
     * </p>
     * 
     * @param skipFinalBackup
     *        Set to true if you want to skip taking a final backup of the volume you are deleting.
     */

    public void setSkipFinalBackup(Boolean skipFinalBackup) {
        this.skipFinalBackup = skipFinalBackup;
    }

    /**
     * <p>
     * Set to true if you want to skip taking a final backup of the volume you are deleting.
     * </p>
     * 
     * @return Set to true if you want to skip taking a final backup of the volume you are deleting.
     */

    public Boolean getSkipFinalBackup() {
        return this.skipFinalBackup;
    }

    /**
     * <p>
     * Set to true if you want to skip taking a final backup of the volume you are deleting.
     * </p>
     * 
     * @param skipFinalBackup
     *        Set to true if you want to skip taking a final backup of the volume you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeOntapConfiguration withSkipFinalBackup(Boolean skipFinalBackup) {
        setSkipFinalBackup(skipFinalBackup);
        return this;
    }

    /**
     * <p>
     * Set to true if you want to skip taking a final backup of the volume you are deleting.
     * </p>
     * 
     * @return Set to true if you want to skip taking a final backup of the volume you are deleting.
     */

    public Boolean isSkipFinalBackup() {
        return this.skipFinalBackup;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getFinalBackupTags() {
        return finalBackupTags;
    }

    /**
     * @param finalBackupTags
     */

    public void setFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        if (finalBackupTags == null) {
            this.finalBackupTags = null;
            return;
        }

        this.finalBackupTags = new java.util.ArrayList<Tag>(finalBackupTags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFinalBackupTags(java.util.Collection)} or {@link #withFinalBackupTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param finalBackupTags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeOntapConfiguration withFinalBackupTags(Tag... finalBackupTags) {
        if (this.finalBackupTags == null) {
            setFinalBackupTags(new java.util.ArrayList<Tag>(finalBackupTags.length));
        }
        for (Tag ele : finalBackupTags) {
            this.finalBackupTags.add(ele);
        }
        return this;
    }

    /**
     * @param finalBackupTags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeOntapConfiguration withFinalBackupTags(java.util.Collection<Tag> finalBackupTags) {
        setFinalBackupTags(finalBackupTags);
        return this;
    }

    /**
     * <p>
     * Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise
     * volume with unexpired write once, read many (WORM) files. The IAM permission
     * <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes with
     * unexpired WORM files. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     * volume</a>.
     * </p>
     * 
     * @param bypassSnaplockEnterpriseRetention
     *        Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock
     *        Enterprise volume with unexpired write once, read many (WORM) files. The IAM permission
     *        <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes
     *        with unexpired WORM files. The default value is <code>false</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     *        volume</a>.
     */

    public void setBypassSnaplockEnterpriseRetention(Boolean bypassSnaplockEnterpriseRetention) {
        this.bypassSnaplockEnterpriseRetention = bypassSnaplockEnterpriseRetention;
    }

    /**
     * <p>
     * Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise
     * volume with unexpired write once, read many (WORM) files. The IAM permission
     * <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes with
     * unexpired WORM files. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     * volume</a>.
     * </p>
     * 
     * @return Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock
     *         Enterprise volume with unexpired write once, read many (WORM) files. The IAM permission
     *         <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes
     *         with unexpired WORM files. The default value is <code>false</code>. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     *         volume</a>.
     */

    public Boolean getBypassSnaplockEnterpriseRetention() {
        return this.bypassSnaplockEnterpriseRetention;
    }

    /**
     * <p>
     * Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise
     * volume with unexpired write once, read many (WORM) files. The IAM permission
     * <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes with
     * unexpired WORM files. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     * volume</a>.
     * </p>
     * 
     * @param bypassSnaplockEnterpriseRetention
     *        Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock
     *        Enterprise volume with unexpired write once, read many (WORM) files. The IAM permission
     *        <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes
     *        with unexpired WORM files. The default value is <code>false</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     *        volume</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeOntapConfiguration withBypassSnaplockEnterpriseRetention(Boolean bypassSnaplockEnterpriseRetention) {
        setBypassSnaplockEnterpriseRetention(bypassSnaplockEnterpriseRetention);
        return this;
    }

    /**
     * <p>
     * Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise
     * volume with unexpired write once, read many (WORM) files. The IAM permission
     * <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes with
     * unexpired WORM files. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     * volume</a>.
     * </p>
     * 
     * @return Setting this to <code>true</code> allows a SnapLock administrator to delete an FSx for ONTAP SnapLock
     *         Enterprise volume with unexpired write once, read many (WORM) files. The IAM permission
     *         <code>fsx:BypassSnaplockEnterpriseRetention</code> is also required to delete SnapLock Enterprise volumes
     *         with unexpired WORM files. The default value is <code>false</code>. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-delete-volume.html"> Deleting a SnapLock
     *         volume</a>.
     */

    public Boolean isBypassSnaplockEnterpriseRetention() {
        return this.bypassSnaplockEnterpriseRetention;
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
        if (getSkipFinalBackup() != null)
            sb.append("SkipFinalBackup: ").append(getSkipFinalBackup()).append(",");
        if (getFinalBackupTags() != null)
            sb.append("FinalBackupTags: ").append(getFinalBackupTags()).append(",");
        if (getBypassSnaplockEnterpriseRetention() != null)
            sb.append("BypassSnaplockEnterpriseRetention: ").append(getBypassSnaplockEnterpriseRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVolumeOntapConfiguration == false)
            return false;
        DeleteVolumeOntapConfiguration other = (DeleteVolumeOntapConfiguration) obj;
        if (other.getSkipFinalBackup() == null ^ this.getSkipFinalBackup() == null)
            return false;
        if (other.getSkipFinalBackup() != null && other.getSkipFinalBackup().equals(this.getSkipFinalBackup()) == false)
            return false;
        if (other.getFinalBackupTags() == null ^ this.getFinalBackupTags() == null)
            return false;
        if (other.getFinalBackupTags() != null && other.getFinalBackupTags().equals(this.getFinalBackupTags()) == false)
            return false;
        if (other.getBypassSnaplockEnterpriseRetention() == null ^ this.getBypassSnaplockEnterpriseRetention() == null)
            return false;
        if (other.getBypassSnaplockEnterpriseRetention() != null
                && other.getBypassSnaplockEnterpriseRetention().equals(this.getBypassSnaplockEnterpriseRetention()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkipFinalBackup() == null) ? 0 : getSkipFinalBackup().hashCode());
        hashCode = prime * hashCode + ((getFinalBackupTags() == null) ? 0 : getFinalBackupTags().hashCode());
        hashCode = prime * hashCode + ((getBypassSnaplockEnterpriseRetention() == null) ? 0 : getBypassSnaplockEnterpriseRetention().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVolumeOntapConfiguration clone() {
        try {
            return (DeleteVolumeOntapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DeleteVolumeOntapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
