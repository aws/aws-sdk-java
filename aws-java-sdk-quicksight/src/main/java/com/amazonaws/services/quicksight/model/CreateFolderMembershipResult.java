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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateFolderMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFolderMembershipResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the folder membership. If succeeded, the status is <code>SC_OK (200)</code>.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * Information about the member in the folder.
     * </p>
     */
    private FolderMember folderMember;
    /**
     * <p>
     * The request ID.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The status of the folder membership. If succeeded, the status is <code>SC_OK (200)</code>.
     * </p>
     * 
     * @param status
     *        The status of the folder membership. If succeeded, the status is <code>SC_OK (200)</code>.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the folder membership. If succeeded, the status is <code>SC_OK (200)</code>.
     * </p>
     * 
     * @return The status of the folder membership. If succeeded, the status is <code>SC_OK (200)</code>.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the folder membership. If succeeded, the status is <code>SC_OK (200)</code>.
     * </p>
     * 
     * @param status
     *        The status of the folder membership. If succeeded, the status is <code>SC_OK (200)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderMembershipResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Information about the member in the folder.
     * </p>
     * 
     * @param folderMember
     *        Information about the member in the folder.
     */

    public void setFolderMember(FolderMember folderMember) {
        this.folderMember = folderMember;
    }

    /**
     * <p>
     * Information about the member in the folder.
     * </p>
     * 
     * @return Information about the member in the folder.
     */

    public FolderMember getFolderMember() {
        return this.folderMember;
    }

    /**
     * <p>
     * Information about the member in the folder.
     * </p>
     * 
     * @param folderMember
     *        Information about the member in the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderMembershipResult withFolderMember(FolderMember folderMember) {
        setFolderMember(folderMember);
        return this;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @param requestId
     *        The request ID.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @return The request ID.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @param requestId
     *        The request ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderMembershipResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFolderMember() != null)
            sb.append("FolderMember: ").append(getFolderMember()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFolderMembershipResult == false)
            return false;
        CreateFolderMembershipResult other = (CreateFolderMembershipResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFolderMember() == null ^ this.getFolderMember() == null)
            return false;
        if (other.getFolderMember() != null && other.getFolderMember().equals(this.getFolderMember()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFolderMember() == null) ? 0 : getFolderMember().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public CreateFolderMembershipResult clone() {
        try {
            return (CreateFolderMembershipResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
