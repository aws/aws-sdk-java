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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartCopyJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCopyJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to copy a resource.
     * </p>
     */
    private String copyJobId;
    /**
     * <p>
     * The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The value of
     * CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26,
     * 2018 12:11:30.087 AM. &gt;
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to copy a resource.
     * </p>
     * 
     * @param copyJobId
     *        Uniquely identifies a request to AWS Backup to copy a resource.
     */

    public void setCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to copy a resource.
     * </p>
     * 
     * @return Uniquely identifies a request to AWS Backup to copy a resource.
     */

    public String getCopyJobId() {
        return this.copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to copy a resource.
     * </p>
     * 
     * @param copyJobId
     *        Uniquely identifies a request to AWS Backup to copy a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCopyJobResult withCopyJobId(String copyJobId) {
        setCopyJobId(copyJobId);
        return this;
    }

    /**
     * <p>
     * The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The value of
     * CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26,
     * 2018 12:11:30.087 AM. &gt;
     * </p>
     * 
     * @param creationDate
     *        The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The
     *        value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM. &gt;
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The value of
     * CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26,
     * 2018 12:11:30.087 AM. &gt;
     * </p>
     * 
     * @return The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The
     *         value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents
     *         Friday, January 26, 2018 12:11:30.087 AM. &gt;
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The value of
     * CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26,
     * 2018 12:11:30.087 AM. &gt;
     * </p>
     * 
     * @param creationDate
     *        The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The
     *        value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM. &gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCopyJobResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getCopyJobId() != null)
            sb.append("CopyJobId: ").append(getCopyJobId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCopyJobResult == false)
            return false;
        StartCopyJobResult other = (StartCopyJobResult) obj;
        if (other.getCopyJobId() == null ^ this.getCopyJobId() == null)
            return false;
        if (other.getCopyJobId() != null && other.getCopyJobId().equals(this.getCopyJobId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyJobId() == null) ? 0 : getCopyJobId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public StartCopyJobResult clone() {
        try {
            return (StartCopyJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
