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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteDataRepositoryAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDataRepositoryAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the data repository association that you want to delete.
     * </p>
     */
    private String associationId;

    private String clientRequestToken;
    /**
     * <p>
     * Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     * association.
     * </p>
     */
    private Boolean deleteDataInFileSystem;

    /**
     * <p>
     * The ID of the data repository association that you want to delete.
     * </p>
     * 
     * @param associationId
     *        The ID of the data repository association that you want to delete.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the data repository association that you want to delete.
     * </p>
     * 
     * @return The ID of the data repository association that you want to delete.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the data repository association that you want to delete.
     * </p>
     * 
     * @param associationId
     *        The ID of the data repository association that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataRepositoryAssociationRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataRepositoryAssociationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     * association.
     * </p>
     * 
     * @param deleteDataInFileSystem
     *        Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     *        association.
     */

    public void setDeleteDataInFileSystem(Boolean deleteDataInFileSystem) {
        this.deleteDataInFileSystem = deleteDataInFileSystem;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     * association.
     * </p>
     * 
     * @return Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     *         association.
     */

    public Boolean getDeleteDataInFileSystem() {
        return this.deleteDataInFileSystem;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     * association.
     * </p>
     * 
     * @param deleteDataInFileSystem
     *        Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     *        association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataRepositoryAssociationRequest withDeleteDataInFileSystem(Boolean deleteDataInFileSystem) {
        setDeleteDataInFileSystem(deleteDataInFileSystem);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     * association.
     * </p>
     * 
     * @return Set to <code>true</code> to delete the data in the file system that corresponds to the data repository
     *         association.
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof DeleteDataRepositoryAssociationRequest == false)
            return false;
        DeleteDataRepositoryAssociationRequest other = (DeleteDataRepositoryAssociationRequest) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getDeleteDataInFileSystem() == null) ? 0 : getDeleteDataInFileSystem().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDataRepositoryAssociationRequest clone() {
        return (DeleteDataRepositoryAssociationRequest) super.clone();
    }

}
