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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes Network File System (NFS) file share default values. Files and folders stored as Amazon S3 objects in S3
 * buckets don't, by default, have Unix file permissions assigned to them. Upon discovery in an S3 bucket by Storage
 * Gateway, the S3 objects that represent files and folders are assigned these default Unix permissions. This operation
 * is only supported for file gateways.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/NFSFileShareDefaults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NFSFileShareDefaults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the file
     * share. The default value is 0666.
     * </p>
     */
    private String fileMode;
    /**
     * <p>
     * The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for all
     * directories inside the file share. The default value is 0777.
     * </p>
     */
    private String directoryMode;
    /**
     * <p>
     * The default group ID for the file share (unless the files have another group ID specified). The default value is
     * nfsnobody.
     * </p>
     */
    private Long groupId;
    /**
     * <p>
     * The default owner ID for files in the file share (unless the files have another owner ID specified). The default
     * value is nfsnobody.
     * </p>
     */
    private Long ownerId;

    /**
     * <p>
     * The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the file
     * share. The default value is 0666.
     * </p>
     * 
     * @param fileMode
     *        The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the
     *        file share. The default value is 0666.
     */

    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the file
     * share. The default value is 0666.
     * </p>
     * 
     * @return The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the
     *         file share. The default value is 0666.
     */

    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * <p>
     * The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the file
     * share. The default value is 0666.
     * </p>
     * 
     * @param fileMode
     *        The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the
     *        file share. The default value is 0666.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareDefaults withFileMode(String fileMode) {
        setFileMode(fileMode);
        return this;
    }

    /**
     * <p>
     * The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for all
     * directories inside the file share. The default value is 0777.
     * </p>
     * 
     * @param directoryMode
     *        The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for all
     *        directories inside the file share. The default value is 0777.
     */

    public void setDirectoryMode(String directoryMode) {
        this.directoryMode = directoryMode;
    }

    /**
     * <p>
     * The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for all
     * directories inside the file share. The default value is 0777.
     * </p>
     * 
     * @return The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for
     *         all directories inside the file share. The default value is 0777.
     */

    public String getDirectoryMode() {
        return this.directoryMode;
    }

    /**
     * <p>
     * The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for all
     * directories inside the file share. The default value is 0777.
     * </p>
     * 
     * @param directoryMode
     *        The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for all
     *        directories inside the file share. The default value is 0777.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareDefaults withDirectoryMode(String directoryMode) {
        setDirectoryMode(directoryMode);
        return this;
    }

    /**
     * <p>
     * The default group ID for the file share (unless the files have another group ID specified). The default value is
     * nfsnobody.
     * </p>
     * 
     * @param groupId
     *        The default group ID for the file share (unless the files have another group ID specified). The default
     *        value is nfsnobody.
     */

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The default group ID for the file share (unless the files have another group ID specified). The default value is
     * nfsnobody.
     * </p>
     * 
     * @return The default group ID for the file share (unless the files have another group ID specified). The default
     *         value is nfsnobody.
     */

    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The default group ID for the file share (unless the files have another group ID specified). The default value is
     * nfsnobody.
     * </p>
     * 
     * @param groupId
     *        The default group ID for the file share (unless the files have another group ID specified). The default
     *        value is nfsnobody.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareDefaults withGroupId(Long groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The default owner ID for files in the file share (unless the files have another owner ID specified). The default
     * value is nfsnobody.
     * </p>
     * 
     * @param ownerId
     *        The default owner ID for files in the file share (unless the files have another owner ID specified). The
     *        default value is nfsnobody.
     */

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The default owner ID for files in the file share (unless the files have another owner ID specified). The default
     * value is nfsnobody.
     * </p>
     * 
     * @return The default owner ID for files in the file share (unless the files have another owner ID specified). The
     *         default value is nfsnobody.
     */

    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The default owner ID for files in the file share (unless the files have another owner ID specified). The default
     * value is nfsnobody.
     * </p>
     * 
     * @param ownerId
     *        The default owner ID for files in the file share (unless the files have another owner ID specified). The
     *        default value is nfsnobody.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareDefaults withOwnerId(Long ownerId) {
        setOwnerId(ownerId);
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
        if (getFileMode() != null)
            sb.append("FileMode: ").append(getFileMode()).append(",");
        if (getDirectoryMode() != null)
            sb.append("DirectoryMode: ").append(getDirectoryMode()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NFSFileShareDefaults == false)
            return false;
        NFSFileShareDefaults other = (NFSFileShareDefaults) obj;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        if (other.getDirectoryMode() == null ^ this.getDirectoryMode() == null)
            return false;
        if (other.getDirectoryMode() != null && other.getDirectoryMode().equals(this.getDirectoryMode()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        hashCode = prime * hashCode + ((getDirectoryMode() == null) ? 0 : getDirectoryMode().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public NFSFileShareDefaults clone() {
        try {
            return (NFSFileShareDefaults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.NFSFileShareDefaultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
