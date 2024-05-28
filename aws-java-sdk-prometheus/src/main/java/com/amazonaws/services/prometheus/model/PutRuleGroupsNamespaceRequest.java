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
 * Represents the input of a <code>PutRuleGroupsNamespace</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutRuleGroupsNamespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRuleGroupsNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The new rules file to use in the namespace. A base64-encoded version of the YAML rule groups file.
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
     * The name of the rule groups namespace that you are updating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the workspace where you are updating the rule groups namespace.
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

    public PutRuleGroupsNamespaceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The new rules file to use in the namespace. A base64-encoded version of the YAML rule groups file.
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
     *        The new rules file to use in the namespace. A base64-encoded version of the YAML rule groups file.</p>
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
     * The new rules file to use in the namespace. A base64-encoded version of the YAML rule groups file.
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
     * @return The new rules file to use in the namespace. A base64-encoded version of the YAML rule groups file.</p>
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
     * The new rules file to use in the namespace. A base64-encoded version of the YAML rule groups file.
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
     *        The new rules file to use in the namespace. A base64-encoded version of the YAML rule groups file.</p>
     *        <p>
     *        For details about the rule groups namespace structure, see <a
     *        href="https://docs.aws.amazon.com/prometheus/latest/APIReference/yaml-RuleGroupsNamespaceData.html"
     *        >RuleGroupsNamespaceData</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleGroupsNamespaceRequest withData(java.nio.ByteBuffer data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The name of the rule groups namespace that you are updating.
     * </p>
     * 
     * @param name
     *        The name of the rule groups namespace that you are updating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule groups namespace that you are updating.
     * </p>
     * 
     * @return The name of the rule groups namespace that you are updating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule groups namespace that you are updating.
     * </p>
     * 
     * @param name
     *        The name of the rule groups namespace that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleGroupsNamespaceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace where you are updating the rule groups namespace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace where you are updating the rule groups namespace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace where you are updating the rule groups namespace.
     * </p>
     * 
     * @return The ID of the workspace where you are updating the rule groups namespace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace where you are updating the rule groups namespace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace where you are updating the rule groups namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuleGroupsNamespaceRequest withWorkspaceId(String workspaceId) {
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

        if (obj instanceof PutRuleGroupsNamespaceRequest == false)
            return false;
        PutRuleGroupsNamespaceRequest other = (PutRuleGroupsNamespaceRequest) obj;
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
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public PutRuleGroupsNamespaceRequest clone() {
        return (PutRuleGroupsNamespaceRequest) super.clone();
    }

}
