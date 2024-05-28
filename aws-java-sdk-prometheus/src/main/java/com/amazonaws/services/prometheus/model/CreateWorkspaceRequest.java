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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>CreateWorkspace</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An alias that you assign to this workspace to help you identify it. It does not need to be unique.
     * </p>
     * <p>
     * Blank spaces at the beginning or end of the alias that you specify will be trimmed from the value used.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * (optional) The ARN for a customer managed KMS key to use for encrypting data within your workspace. For more
     * information about using your own key in your workspace, see <a href=
     * "https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html"
     * >Encryption at rest</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The list of tag keys and values to associate with the workspace.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * An alias that you assign to this workspace to help you identify it. It does not need to be unique.
     * </p>
     * <p>
     * Blank spaces at the beginning or end of the alias that you specify will be trimmed from the value used.
     * </p>
     * 
     * @param alias
     *        An alias that you assign to this workspace to help you identify it. It does not need to be unique.</p>
     *        <p>
     *        Blank spaces at the beginning or end of the alias that you specify will be trimmed from the value used.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * An alias that you assign to this workspace to help you identify it. It does not need to be unique.
     * </p>
     * <p>
     * Blank spaces at the beginning or end of the alias that you specify will be trimmed from the value used.
     * </p>
     * 
     * @return An alias that you assign to this workspace to help you identify it. It does not need to be unique.</p>
     *         <p>
     *         Blank spaces at the beginning or end of the alias that you specify will be trimmed from the value used.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * An alias that you assign to this workspace to help you identify it. It does not need to be unique.
     * </p>
     * <p>
     * Blank spaces at the beginning or end of the alias that you specify will be trimmed from the value used.
     * </p>
     * 
     * @param alias
     *        An alias that you assign to this workspace to help you identify it. It does not need to be unique.</p>
     *        <p>
     *        Blank spaces at the beginning or end of the alias that you specify will be trimmed from the value used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @return A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * (optional) The ARN for a customer managed KMS key to use for encrypting data within your workspace. For more
     * information about using your own key in your workspace, see <a href=
     * "https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html"
     * >Encryption at rest</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * 
     * @param kmsKeyArn
     *        (optional) The ARN for a customer managed KMS key to use for encrypting data within your workspace. For
     *        more information about using your own key in your workspace, see <a href=
     *        "https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html"
     *        >Encryption at rest</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * (optional) The ARN for a customer managed KMS key to use for encrypting data within your workspace. For more
     * information about using your own key in your workspace, see <a href=
     * "https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html"
     * >Encryption at rest</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * 
     * @return (optional) The ARN for a customer managed KMS key to use for encrypting data within your workspace. For
     *         more information about using your own key in your workspace, see <a href=
     *         "https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html"
     *         >Encryption at rest</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * (optional) The ARN for a customer managed KMS key to use for encrypting data within your workspace. For more
     * information about using your own key in your workspace, see <a href=
     * "https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html"
     * >Encryption at rest</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * 
     * @param kmsKeyArn
     *        (optional) The ARN for a customer managed KMS key to use for encrypting data within your workspace. For
     *        more information about using your own key in your workspace, see <a href=
     *        "https://docs.aws.amazon.com/prometheus/latest/userguide/encryption-at-rest-Amazon-Service-Prometheus.html"
     *        >Encryption at rest</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values to associate with the workspace.
     * </p>
     * 
     * @return The list of tag keys and values to associate with the workspace.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values to associate with the workspace.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values to associate with the workspace.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values to associate with the workspace.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values to associate with the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorkspaceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkspaceRequest == false)
            return false;
        CreateWorkspaceRequest other = (CreateWorkspaceRequest) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceRequest clone() {
        return (CreateWorkspaceRequest) super.clone();
    }

}
