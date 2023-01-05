/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata for notebook, including the notebook name, ID, workgroup, and time created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/NotebookMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotebookMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The notebook ID.
     * </p>
     */
    private String notebookId;
    /**
     * <p>
     * The name of the notebook.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the Spark enabled workgroup to which the notebook belongs.
     * </p>
     */
    private String workGroup;
    /**
     * <p>
     * The time when the notebook was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The time when the notebook was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The notebook ID.
     * </p>
     * 
     * @param notebookId
     *        The notebook ID.
     */

    public void setNotebookId(String notebookId) {
        this.notebookId = notebookId;
    }

    /**
     * <p>
     * The notebook ID.
     * </p>
     * 
     * @return The notebook ID.
     */

    public String getNotebookId() {
        return this.notebookId;
    }

    /**
     * <p>
     * The notebook ID.
     * </p>
     * 
     * @param notebookId
     *        The notebook ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookMetadata withNotebookId(String notebookId) {
        setNotebookId(notebookId);
        return this;
    }

    /**
     * <p>
     * The name of the notebook.
     * </p>
     * 
     * @param name
     *        The name of the notebook.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the notebook.
     * </p>
     * 
     * @return The name of the notebook.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the notebook.
     * </p>
     * 
     * @param name
     *        The name of the notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the Spark enabled workgroup to which the notebook belongs.
     * </p>
     * 
     * @param workGroup
     *        The name of the Spark enabled workgroup to which the notebook belongs.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the Spark enabled workgroup to which the notebook belongs.
     * </p>
     * 
     * @return The name of the Spark enabled workgroup to which the notebook belongs.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the Spark enabled workgroup to which the notebook belongs.
     * </p>
     * 
     * @param workGroup
     *        The name of the Spark enabled workgroup to which the notebook belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookMetadata withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
        return this;
    }

    /**
     * <p>
     * The time when the notebook was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the notebook was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the notebook was created.
     * </p>
     * 
     * @return The time when the notebook was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the notebook was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the notebook was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookMetadata withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     * 
     * @param type
     *        The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * @see NotebookType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     * 
     * @return The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * @see NotebookType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     * 
     * @param type
     *        The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookType
     */

    public NotebookMetadata withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * </p>
     * 
     * @param type
     *        The type of notebook. Currently, the only valid type is <code>IPYNB</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookType
     */

    public NotebookMetadata withType(NotebookType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time when the notebook was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the notebook was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the notebook was last modified.
     * </p>
     * 
     * @return The time when the notebook was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time when the notebook was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the notebook was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookMetadata withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getNotebookId() != null)
            sb.append("NotebookId: ").append(getNotebookId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotebookMetadata == false)
            return false;
        NotebookMetadata other = (NotebookMetadata) obj;
        if (other.getNotebookId() == null ^ this.getNotebookId() == null)
            return false;
        if (other.getNotebookId() != null && other.getNotebookId().equals(this.getNotebookId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookId() == null) ? 0 : getNotebookId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public NotebookMetadata clone() {
        try {
            return (NotebookMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.NotebookMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
