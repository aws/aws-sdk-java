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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateCustomMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The ID of the version, if the custom metadata is being added to a document version.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * Custom metadata in the form of name-value pairs.
     * </p>
     */
    private java.util.Map<String, String> customMetadata;

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

    public CreateCustomMetadataRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetadataRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The ID of the version, if the custom metadata is being added to a document version.
     * </p>
     * 
     * @param versionId
     *        The ID of the version, if the custom metadata is being added to a document version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of the version, if the custom metadata is being added to a document version.
     * </p>
     * 
     * @return The ID of the version, if the custom metadata is being added to a document version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of the version, if the custom metadata is being added to a document version.
     * </p>
     * 
     * @param versionId
     *        The ID of the version, if the custom metadata is being added to a document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetadataRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * Custom metadata in the form of name-value pairs.
     * </p>
     * 
     * @return Custom metadata in the form of name-value pairs.
     */

    public java.util.Map<String, String> getCustomMetadata() {
        return customMetadata;
    }

    /**
     * <p>
     * Custom metadata in the form of name-value pairs.
     * </p>
     * 
     * @param customMetadata
     *        Custom metadata in the form of name-value pairs.
     */

    public void setCustomMetadata(java.util.Map<String, String> customMetadata) {
        this.customMetadata = customMetadata;
    }

    /**
     * <p>
     * Custom metadata in the form of name-value pairs.
     * </p>
     * 
     * @param customMetadata
     *        Custom metadata in the form of name-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetadataRequest withCustomMetadata(java.util.Map<String, String> customMetadata) {
        setCustomMetadata(customMetadata);
        return this;
    }

    public CreateCustomMetadataRequest addCustomMetadataEntry(String key, String value) {
        if (null == this.customMetadata) {
            this.customMetadata = new java.util.HashMap<String, String>();
        }
        if (this.customMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetadataRequest clearCustomMetadataEntries() {
        this.customMetadata = null;
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getCustomMetadata() != null)
            sb.append("CustomMetadata: ").append(getCustomMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomMetadataRequest == false)
            return false;
        CreateCustomMetadataRequest other = (CreateCustomMetadataRequest) obj;
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
        if (other.getCustomMetadata() == null ^ this.getCustomMetadata() == null)
            return false;
        if (other.getCustomMetadata() != null && other.getCustomMetadata().equals(this.getCustomMetadata()) == false)
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
        hashCode = prime * hashCode + ((getCustomMetadata() == null) ? 0 : getCustomMetadata().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomMetadataRequest clone() {
        return (CreateCustomMetadataRequest) super.clone();
    }

}
