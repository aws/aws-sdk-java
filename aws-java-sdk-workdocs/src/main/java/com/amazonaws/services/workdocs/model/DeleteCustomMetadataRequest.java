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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteCustomMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the resource, either a document or folder.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The ID of the version, if the custom metadata is being deleted from a document version.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * List of properties to remove.
     * </p>
     */
    private java.util.List<String> keys;
    /**
     * <p>
     * Flag to indicate removal of all custom metadata properties from the specified resource.
     * </p>
     */
    private Boolean deleteAll;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *         accessing the API using AWS credentials.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomMetadataRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the resource, either a document or folder.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource, either a document or folder.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource, either a document or folder.
     * </p>
     * 
     * @return The ID of the resource, either a document or folder.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource, either a document or folder.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource, either a document or folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomMetadataRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The ID of the version, if the custom metadata is being deleted from a document version.
     * </p>
     * 
     * @param versionId
     *        The ID of the version, if the custom metadata is being deleted from a document version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of the version, if the custom metadata is being deleted from a document version.
     * </p>
     * 
     * @return The ID of the version, if the custom metadata is being deleted from a document version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of the version, if the custom metadata is being deleted from a document version.
     * </p>
     * 
     * @param versionId
     *        The ID of the version, if the custom metadata is being deleted from a document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomMetadataRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * List of properties to remove.
     * </p>
     * 
     * @return List of properties to remove.
     */

    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * List of properties to remove.
     * </p>
     * 
     * @param keys
     *        List of properties to remove.
     */

    public void setKeys(java.util.Collection<String> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<String>(keys);
    }

    /**
     * <p>
     * List of properties to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        List of properties to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomMetadataRequest withKeys(String... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<String>(keys.length));
        }
        for (String ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of properties to remove.
     * </p>
     * 
     * @param keys
     *        List of properties to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomMetadataRequest withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * Flag to indicate removal of all custom metadata properties from the specified resource.
     * </p>
     * 
     * @param deleteAll
     *        Flag to indicate removal of all custom metadata properties from the specified resource.
     */

    public void setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
    }

    /**
     * <p>
     * Flag to indicate removal of all custom metadata properties from the specified resource.
     * </p>
     * 
     * @return Flag to indicate removal of all custom metadata properties from the specified resource.
     */

    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

    /**
     * <p>
     * Flag to indicate removal of all custom metadata properties from the specified resource.
     * </p>
     * 
     * @param deleteAll
     *        Flag to indicate removal of all custom metadata properties from the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomMetadataRequest withDeleteAll(Boolean deleteAll) {
        setDeleteAll(deleteAll);
        return this;
    }

    /**
     * <p>
     * Flag to indicate removal of all custom metadata properties from the specified resource.
     * </p>
     * 
     * @return Flag to indicate removal of all custom metadata properties from the specified resource.
     */

    public Boolean isDeleteAll() {
        return this.deleteAll;
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
        if (getDeleteAll() != null)
            sb.append("DeleteAll: ").append(getDeleteAll());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomMetadataRequest == false)
            return false;
        DeleteCustomMetadataRequest other = (DeleteCustomMetadataRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getDeleteAll() == null ^ this.getDeleteAll() == null)
            return false;
        if (other.getDeleteAll() != null && other.getDeleteAll().equals(this.getDeleteAll()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getDeleteAll() == null) ? 0 : getDeleteAll().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomMetadataRequest clone() {
        return (DeleteCustomMetadataRequest) super.clone();
    }

}
