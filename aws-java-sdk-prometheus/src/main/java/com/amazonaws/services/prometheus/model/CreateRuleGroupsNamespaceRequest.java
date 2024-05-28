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
 * Represents the input of a <code>CreateRuleGroupsNamespace</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateRuleGroupsNamespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleGroupsNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The rules file to use in the new namespace.
     * </p>
     * <p>
     * Contains the base64-encoded version of the YAML rules file.
     * </p>
     * <p>
     * For details about the rule groups namespace structure, see <a
     * href="https://docs.aws.amazon.com/prometheus/latest/APIReference/yaml-RuleGroupsNamespaceData.html"
     * >RuleGroupsNamespaceData</a>.
     * </p>
     */
    private java.nio.ByteBuffer data;
    /**
     * <p>
     * The name for the new rule groups namespace.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of tag keys and values to associate with the rule groups namespace.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ID of the workspace to add the rule groups namespace.
     * </p>
     */
    private String workspaceId;

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

    public CreateRuleGroupsNamespaceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The rules file to use in the new namespace.
     * </p>
     * <p>
     * Contains the base64-encoded version of the YAML rules file.
     * </p>
     * <p>
     * For details about the rule groups namespace structure, see <a
     * href="https://docs.aws.amazon.com/prometheus/latest/APIReference/yaml-RuleGroupsNamespaceData.html"
     * >RuleGroupsNamespaceData</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param data
     *        The rules file to use in the new namespace.</p>
     *        <p>
     *        Contains the base64-encoded version of the YAML rules file.
     *        </p>
     *        <p>
     *        For details about the rule groups namespace structure, see <a
     *        href="https://docs.aws.amazon.com/prometheus/latest/APIReference/yaml-RuleGroupsNamespaceData.html"
     *        >RuleGroupsNamespaceData</a>.
     */

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The rules file to use in the new namespace.
     * </p>
     * <p>
     * Contains the base64-encoded version of the YAML rules file.
     * </p>
     * <p>
     * For details about the rule groups namespace structure, see <a
     * href="https://docs.aws.amazon.com/prometheus/latest/APIReference/yaml-RuleGroupsNamespaceData.html"
     * >RuleGroupsNamespaceData</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The rules file to use in the new namespace.</p>
     *         <p>
     *         Contains the base64-encoded version of the YAML rules file.
     *         </p>
     *         <p>
     *         For details about the rule groups namespace structure, see <a
     *         href="https://docs.aws.amazon.com/prometheus/latest/APIReference/yaml-RuleGroupsNamespaceData.html"
     *         >RuleGroupsNamespaceData</a>.
     */

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    /**
     * <p>
     * The rules file to use in the new namespace.
     * </p>
     * <p>
     * Contains the base64-encoded version of the YAML rules file.
     * </p>
     * <p>
     * For details about the rule groups namespace structure, see <a
     * href="https://docs.aws.amazon.com/prometheus/latest/APIReference/yaml-RuleGroupsNamespaceData.html"
     * >RuleGroupsNamespaceData</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param data
     *        The rules file to use in the new namespace.</p>
     *        <p>
     *        Contains the base64-encoded version of the YAML rules file.
     *        </p>
     *        <p>
     *        For details about the rule groups namespace structure, see <a
     *        href="https://docs.aws.amazon.com/prometheus/latest/APIReference/yaml-RuleGroupsNamespaceData.html"
     *        >RuleGroupsNamespaceData</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupsNamespaceRequest withData(java.nio.ByteBuffer data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The name for the new rule groups namespace.
     * </p>
     * 
     * @param name
     *        The name for the new rule groups namespace.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new rule groups namespace.
     * </p>
     * 
     * @return The name for the new rule groups namespace.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new rule groups namespace.
     * </p>
     * 
     * @param name
     *        The name for the new rule groups namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupsNamespaceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values to associate with the rule groups namespace.
     * </p>
     * 
     * @return The list of tag keys and values to associate with the rule groups namespace.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values to associate with the rule groups namespace.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values to associate with the rule groups namespace.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values to associate with the rule groups namespace.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values to associate with the rule groups namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupsNamespaceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRuleGroupsNamespaceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupsNamespaceRequest addTagsEntry(String key, String value) {
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

    public CreateRuleGroupsNamespaceRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to add the rule groups namespace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to add the rule groups namespace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to add the rule groups namespace.
     * </p>
     * 
     * @return The ID of the workspace to add the rule groups namespace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to add the rule groups namespace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to add the rule groups namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleGroupsNamespaceRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleGroupsNamespaceRequest == false)
            return false;
        CreateRuleGroupsNamespaceRequest other = (CreateRuleGroupsNamespaceRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleGroupsNamespaceRequest clone() {
        return (CreateRuleGroupsNamespaceRequest) super.clone();
    }

}
