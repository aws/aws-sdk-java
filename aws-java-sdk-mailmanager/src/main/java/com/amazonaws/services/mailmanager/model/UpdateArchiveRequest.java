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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to update properties of an existing email archive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateArchiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the archive to update.
     * </p>
     */
    private String archiveId;
    /**
     * <p>
     * A new, unique name for the archive.
     * </p>
     */
    private String archiveName;
    /**
     * <p>
     * A new retention period for emails in the archive.
     * </p>
     */
    private ArchiveRetention retention;

    /**
     * <p>
     * The identifier of the archive to update.
     * </p>
     * 
     * @param archiveId
     *        The identifier of the archive to update.
     */

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * <p>
     * The identifier of the archive to update.
     * </p>
     * 
     * @return The identifier of the archive to update.
     */

    public String getArchiveId() {
        return this.archiveId;
    }

    /**
     * <p>
     * The identifier of the archive to update.
     * </p>
     * 
     * @param archiveId
     *        The identifier of the archive to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveRequest withArchiveId(String archiveId) {
        setArchiveId(archiveId);
        return this;
    }

    /**
     * <p>
     * A new, unique name for the archive.
     * </p>
     * 
     * @param archiveName
     *        A new, unique name for the archive.
     */

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    /**
     * <p>
     * A new, unique name for the archive.
     * </p>
     * 
     * @return A new, unique name for the archive.
     */

    public String getArchiveName() {
        return this.archiveName;
    }

    /**
     * <p>
     * A new, unique name for the archive.
     * </p>
     * 
     * @param archiveName
     *        A new, unique name for the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveRequest withArchiveName(String archiveName) {
        setArchiveName(archiveName);
        return this;
    }

    /**
     * <p>
     * A new retention period for emails in the archive.
     * </p>
     * 
     * @param retention
     *        A new retention period for emails in the archive.
     */

    public void setRetention(ArchiveRetention retention) {
        this.retention = retention;
    }

    /**
     * <p>
     * A new retention period for emails in the archive.
     * </p>
     * 
     * @return A new retention period for emails in the archive.
     */

    public ArchiveRetention getRetention() {
        return this.retention;
    }

    /**
     * <p>
     * A new retention period for emails in the archive.
     * </p>
     * 
     * @param retention
     *        A new retention period for emails in the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArchiveRequest withRetention(ArchiveRetention retention) {
        setRetention(retention);
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
        if (getArchiveId() != null)
            sb.append("ArchiveId: ").append(getArchiveId()).append(",");
        if (getArchiveName() != null)
            sb.append("ArchiveName: ").append(getArchiveName()).append(",");
        if (getRetention() != null)
            sb.append("Retention: ").append(getRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateArchiveRequest == false)
            return false;
        UpdateArchiveRequest other = (UpdateArchiveRequest) obj;
        if (other.getArchiveId() == null ^ this.getArchiveId() == null)
            return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false)
            return false;
        if (other.getArchiveName() == null ^ this.getArchiveName() == null)
            return false;
        if (other.getArchiveName() != null && other.getArchiveName().equals(this.getArchiveName()) == false)
            return false;
        if (other.getRetention() == null ^ this.getRetention() == null)
            return false;
        if (other.getRetention() != null && other.getRetention().equals(this.getRetention()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode());
        hashCode = prime * hashCode + ((getArchiveName() == null) ? 0 : getArchiveName().hashCode());
        hashCode = prime * hashCode + ((getRetention() == null) ? 0 : getRetention().hashCode());
        return hashCode;
    }

    @Override
    public UpdateArchiveRequest clone() {
        return (UpdateArchiveRequest) super.clone();
    }

}
