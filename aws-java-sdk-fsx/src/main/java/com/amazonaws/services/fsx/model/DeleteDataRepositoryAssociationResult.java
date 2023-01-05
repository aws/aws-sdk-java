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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteDataRepositoryAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDataRepositoryAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the data repository association being deleted.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * Describes the lifecycle state of the data repository association being deleted.
     * </p>
     */
    private String lifecycle;
    /**
     * <p>
     * Indicates whether data in the file system that corresponds to the data repository association is being deleted.
     * Default is <code>false</code>.
     * </p>
     */
    private Boolean deleteDataInFileSystem;

    /**
     * <p>
     * The ID of the data repository association being deleted.
     * </p>
     * 
     * @param associationId
     *        The ID of the data repository association being deleted.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the data repository association being deleted.
     * </p>
     * 
     * @return The ID of the data repository association being deleted.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the data repository association being deleted.
     * </p>
     * 
     * @param associationId
     *        The ID of the data repository association being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataRepositoryAssociationResult withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * Describes the lifecycle state of the data repository association being deleted.
     * </p>
     * 
     * @param lifecycle
     *        Describes the lifecycle state of the data repository association being deleted.
     * @see DataRepositoryLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Describes the lifecycle state of the data repository association being deleted.
     * </p>
     * 
     * @return Describes the lifecycle state of the data repository association being deleted.
     * @see DataRepositoryLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Describes the lifecycle state of the data repository association being deleted.
     * </p>
     * 
     * @param lifecycle
     *        Describes the lifecycle state of the data repository association being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryLifecycle
     */

    public DeleteDataRepositoryAssociationResult withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Describes the lifecycle state of the data repository association being deleted.
     * </p>
     * 
     * @param lifecycle
     *        Describes the lifecycle state of the data repository association being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryLifecycle
     */

    public DeleteDataRepositoryAssociationResult withLifecycle(DataRepositoryLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether data in the file system that corresponds to the data repository association is being deleted.
     * Default is <code>false</code>.
     * </p>
     * 
     * @param deleteDataInFileSystem
     *        Indicates whether data in the file system that corresponds to the data repository association is being
     *        deleted. Default is <code>false</code>.
     */

    public void setDeleteDataInFileSystem(Boolean deleteDataInFileSystem) {
        this.deleteDataInFileSystem = deleteDataInFileSystem;
    }

    /**
     * <p>
     * Indicates whether data in the file system that corresponds to the data repository association is being deleted.
     * Default is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether data in the file system that corresponds to the data repository association is being
     *         deleted. Default is <code>false</code>.
     */

    public Boolean getDeleteDataInFileSystem() {
        return this.deleteDataInFileSystem;
    }

    /**
     * <p>
     * Indicates whether data in the file system that corresponds to the data repository association is being deleted.
     * Default is <code>false</code>.
     * </p>
     * 
     * @param deleteDataInFileSystem
     *        Indicates whether data in the file system that corresponds to the data repository association is being
     *        deleted. Default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataRepositoryAssociationResult withDeleteDataInFileSystem(Boolean deleteDataInFileSystem) {
        setDeleteDataInFileSystem(deleteDataInFileSystem);
        return this;
    }

    /**
     * <p>
     * Indicates whether data in the file system that corresponds to the data repository association is being deleted.
     * Default is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether data in the file system that corresponds to the data repository association is being
     *         deleted. Default is <code>false</code>.
     */

    public Boolean isDeleteDataInFileSystem() {
        return this.deleteDataInFileSystem;
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getDeleteDataInFileSystem() != null)
            sb.append("DeleteDataInFileSystem: ").append(getDeleteDataInFileSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDataRepositoryAssociationResult == false)
            return false;
        DeleteDataRepositoryAssociationResult other = (DeleteDataRepositoryAssociationResult) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getDeleteDataInFileSystem() == null ^ this.getDeleteDataInFileSystem() == null)
            return false;
        if (other.getDeleteDataInFileSystem() != null && other.getDeleteDataInFileSystem().equals(this.getDeleteDataInFileSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getDeleteDataInFileSystem() == null) ? 0 : getDeleteDataInFileSystem().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDataRepositoryAssociationResult clone() {
        try {
            return (DeleteDataRepositoryAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
