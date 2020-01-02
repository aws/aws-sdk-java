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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UploadEntityDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadEntityDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>DefinitionDocument</code> that defines the updated entities.
     * </p>
     */
    private DefinitionDocument document;
    /**
     * <p>
     * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to
     * <code>true</code>, the upload will create a new namespace version.
     * </p>
     */
    private Boolean syncWithPublicNamespace;
    /**
     * <p>
     * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     * <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace version.
     * </p>
     */
    private Boolean deprecateExistingEntities;

    /**
     * <p>
     * The <code>DefinitionDocument</code> that defines the updated entities.
     * </p>
     * 
     * @param document
     *        The <code>DefinitionDocument</code> that defines the updated entities.
     */

    public void setDocument(DefinitionDocument document) {
        this.document = document;
    }

    /**
     * <p>
     * The <code>DefinitionDocument</code> that defines the updated entities.
     * </p>
     * 
     * @return The <code>DefinitionDocument</code> that defines the updated entities.
     */

    public DefinitionDocument getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The <code>DefinitionDocument</code> that defines the updated entities.
     * </p>
     * 
     * @param document
     *        The <code>DefinitionDocument</code> that defines the updated entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadEntityDefinitionsRequest withDocument(DefinitionDocument document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to
     * <code>true</code>, the upload will create a new namespace version.
     * </p>
     * 
     * @param syncWithPublicNamespace
     *        A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to
     *        <code>true</code>, the upload will create a new namespace version.
     */

    public void setSyncWithPublicNamespace(Boolean syncWithPublicNamespace) {
        this.syncWithPublicNamespace = syncWithPublicNamespace;
    }

    /**
     * <p>
     * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to
     * <code>true</code>, the upload will create a new namespace version.
     * </p>
     * 
     * @return A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set
     *         to <code>true</code>, the upload will create a new namespace version.
     */

    public Boolean getSyncWithPublicNamespace() {
        return this.syncWithPublicNamespace;
    }

    /**
     * <p>
     * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to
     * <code>true</code>, the upload will create a new namespace version.
     * </p>
     * 
     * @param syncWithPublicNamespace
     *        A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to
     *        <code>true</code>, the upload will create a new namespace version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadEntityDefinitionsRequest withSyncWithPublicNamespace(Boolean syncWithPublicNamespace) {
        setSyncWithPublicNamespace(syncWithPublicNamespace);
        return this;
    }

    /**
     * <p>
     * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to
     * <code>true</code>, the upload will create a new namespace version.
     * </p>
     * 
     * @return A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set
     *         to <code>true</code>, the upload will create a new namespace version.
     */

    public Boolean isSyncWithPublicNamespace() {
        return this.syncWithPublicNamespace;
    }

    /**
     * <p>
     * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     * <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace version.
     * </p>
     * 
     * @param deprecateExistingEntities
     *        A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     *        <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace
     *        version.
     */

    public void setDeprecateExistingEntities(Boolean deprecateExistingEntities) {
        this.deprecateExistingEntities = deprecateExistingEntities;
    }

    /**
     * <p>
     * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     * <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace version.
     * </p>
     * 
     * @return A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     *         <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace
     *         version.
     */

    public Boolean getDeprecateExistingEntities() {
        return this.deprecateExistingEntities;
    }

    /**
     * <p>
     * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     * <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace version.
     * </p>
     * 
     * @param deprecateExistingEntities
     *        A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     *        <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadEntityDefinitionsRequest withDeprecateExistingEntities(Boolean deprecateExistingEntities) {
        setDeprecateExistingEntities(deprecateExistingEntities);
        return this;
    }

    /**
     * <p>
     * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     * <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace version.
     * </p>
     * 
     * @return A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new
     *         <code>DefinitionDocument</code>. If set to <code>true</code>, the upload will create a new namespace
     *         version.
     */

    public Boolean isDeprecateExistingEntities() {
        return this.deprecateExistingEntities;
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getSyncWithPublicNamespace() != null)
            sb.append("SyncWithPublicNamespace: ").append(getSyncWithPublicNamespace()).append(",");
        if (getDeprecateExistingEntities() != null)
            sb.append("DeprecateExistingEntities: ").append(getDeprecateExistingEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadEntityDefinitionsRequest == false)
            return false;
        UploadEntityDefinitionsRequest other = (UploadEntityDefinitionsRequest) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getSyncWithPublicNamespace() == null ^ this.getSyncWithPublicNamespace() == null)
            return false;
        if (other.getSyncWithPublicNamespace() != null && other.getSyncWithPublicNamespace().equals(this.getSyncWithPublicNamespace()) == false)
            return false;
        if (other.getDeprecateExistingEntities() == null ^ this.getDeprecateExistingEntities() == null)
            return false;
        if (other.getDeprecateExistingEntities() != null && other.getDeprecateExistingEntities().equals(this.getDeprecateExistingEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getSyncWithPublicNamespace() == null) ? 0 : getSyncWithPublicNamespace().hashCode());
        hashCode = prime * hashCode + ((getDeprecateExistingEntities() == null) ? 0 : getDeprecateExistingEntities().hashCode());
        return hashCode;
    }

    @Override
    public UploadEntityDefinitionsRequest clone() {
        return (UploadEntityDefinitionsRequest) super.clone();
    }

}
