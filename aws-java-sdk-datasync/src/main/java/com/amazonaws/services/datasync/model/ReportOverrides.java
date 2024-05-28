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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The level of detail included in each aspect of your DataSync <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ReportOverrides" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportOverrides implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to transfer.
     * </p>
     */
    private ReportOverride transferred;
    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to verify at the
     * end of your transfer.
     * </p>
     */
    private ReportOverride verified;
    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to delete in
     * your destination location. This only applies if you <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your task</a> to
     * delete data in the destination that isn't in the source.
     * </p>
     */
    private ReportOverride deleted;
    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to skip during
     * your transfer.
     * </p>
     */
    private ReportOverride skipped;

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to transfer.
     * </p>
     * 
     * @param transferred
     *        Specifies the level of reporting for the files, objects, and directories that DataSync attempted to
     *        transfer.
     */

    public void setTransferred(ReportOverride transferred) {
        this.transferred = transferred;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to transfer.
     * </p>
     * 
     * @return Specifies the level of reporting for the files, objects, and directories that DataSync attempted to
     *         transfer.
     */

    public ReportOverride getTransferred() {
        return this.transferred;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to transfer.
     * </p>
     * 
     * @param transferred
     *        Specifies the level of reporting for the files, objects, and directories that DataSync attempted to
     *        transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportOverrides withTransferred(ReportOverride transferred) {
        setTransferred(transferred);
        return this;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to verify at the
     * end of your transfer.
     * </p>
     * 
     * @param verified
     *        Specifies the level of reporting for the files, objects, and directories that DataSync attempted to verify
     *        at the end of your transfer.
     */

    public void setVerified(ReportOverride verified) {
        this.verified = verified;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to verify at the
     * end of your transfer.
     * </p>
     * 
     * @return Specifies the level of reporting for the files, objects, and directories that DataSync attempted to
     *         verify at the end of your transfer.
     */

    public ReportOverride getVerified() {
        return this.verified;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to verify at the
     * end of your transfer.
     * </p>
     * 
     * @param verified
     *        Specifies the level of reporting for the files, objects, and directories that DataSync attempted to verify
     *        at the end of your transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportOverrides withVerified(ReportOverride verified) {
        setVerified(verified);
        return this;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to delete in
     * your destination location. This only applies if you <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your task</a> to
     * delete data in the destination that isn't in the source.
     * </p>
     * 
     * @param deleted
     *        Specifies the level of reporting for the files, objects, and directories that DataSync attempted to delete
     *        in your destination location. This only applies if you <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     *        task</a> to delete data in the destination that isn't in the source.
     */

    public void setDeleted(ReportOverride deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to delete in
     * your destination location. This only applies if you <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your task</a> to
     * delete data in the destination that isn't in the source.
     * </p>
     * 
     * @return Specifies the level of reporting for the files, objects, and directories that DataSync attempted to
     *         delete in your destination location. This only applies if you <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     *         task</a> to delete data in the destination that isn't in the source.
     */

    public ReportOverride getDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to delete in
     * your destination location. This only applies if you <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your task</a> to
     * delete data in the destination that isn't in the source.
     * </p>
     * 
     * @param deleted
     *        Specifies the level of reporting for the files, objects, and directories that DataSync attempted to delete
     *        in your destination location. This only applies if you <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/configure-metadata.html">configure your
     *        task</a> to delete data in the destination that isn't in the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportOverrides withDeleted(ReportOverride deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to skip during
     * your transfer.
     * </p>
     * 
     * @param skipped
     *        Specifies the level of reporting for the files, objects, and directories that DataSync attempted to skip
     *        during your transfer.
     */

    public void setSkipped(ReportOverride skipped) {
        this.skipped = skipped;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to skip during
     * your transfer.
     * </p>
     * 
     * @return Specifies the level of reporting for the files, objects, and directories that DataSync attempted to skip
     *         during your transfer.
     */

    public ReportOverride getSkipped() {
        return this.skipped;
    }

    /**
     * <p>
     * Specifies the level of reporting for the files, objects, and directories that DataSync attempted to skip during
     * your transfer.
     * </p>
     * 
     * @param skipped
     *        Specifies the level of reporting for the files, objects, and directories that DataSync attempted to skip
     *        during your transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportOverrides withSkipped(ReportOverride skipped) {
        setSkipped(skipped);
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
        if (getTransferred() != null)
            sb.append("Transferred: ").append(getTransferred()).append(",");
        if (getVerified() != null)
            sb.append("Verified: ").append(getVerified()).append(",");
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
        if (getSkipped() != null)
            sb.append("Skipped: ").append(getSkipped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportOverrides == false)
            return false;
        ReportOverrides other = (ReportOverrides) obj;
        if (other.getTransferred() == null ^ this.getTransferred() == null)
            return false;
        if (other.getTransferred() != null && other.getTransferred().equals(this.getTransferred()) == false)
            return false;
        if (other.getVerified() == null ^ this.getVerified() == null)
            return false;
        if (other.getVerified() != null && other.getVerified().equals(this.getVerified()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getSkipped() == null ^ this.getSkipped() == null)
            return false;
        if (other.getSkipped() != null && other.getSkipped().equals(this.getSkipped()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransferred() == null) ? 0 : getTransferred().hashCode());
        hashCode = prime * hashCode + ((getVerified() == null) ? 0 : getVerified().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getSkipped() == null) ? 0 : getSkipped().hashCode());
        return hashCode;
    }

    @Override
    public ReportOverrides clone() {
        try {
            return (ReportOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.ReportOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
