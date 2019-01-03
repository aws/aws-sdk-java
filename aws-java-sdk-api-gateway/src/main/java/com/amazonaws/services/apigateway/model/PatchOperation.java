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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A single patch operation to apply to the specified resource. Please refer to
 * http://tools.ietf.org/html/rfc6902#section-4 for an explanation of how each operation is used.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     * <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for a
     * given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     * unsupported operation on a resource will return an error message.
     * </p>
     */
    private String op;
    /**
     * <p>
     * The <code>op</code> operation's target, as identified by a <a
     * href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08">JSON Pointer</a> value that references a
     * location within the targeted resource. For example, if the target resource has an updateable property of
     * <code>{"name":"value"}</code>, the path for this property is <code>/name</code>. If the <code>name</code>
     * property value is a JSON object (e.g., <code>{"name": {"child/name": "child-value"}}</code>), the path for the
     * <code>child/name</code> property will be <code>/name/child~1name</code>. Any slash ("/") character appearing in
     * path names must be escaped with "~1", as shown in the example above. Each <code>op</code> operation can have only
     * one <code>path</code> associated with it.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The new target value of the update operation. It is applicable for the <code>add</code> or <code>replace</code>
     * operation. When using AWS CLI to update a property of a JSON value, enclose the JSON object with a pair of single
     * quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The <code>copy</code> update operation's source as identified by a <code>JSON-Pointer</code> value referencing
     * the location within the targeted resource to copy the value from. For example, to promote a canary deployment,
     * you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH request on a <a>Stage</a>
     * resource with <code>"op":"copy"</code>, <code>"from":"/canarySettings/deploymentId"</code> and
     * <code>"path":"/deploymentId"</code>.
     * </p>
     */
    private String from;

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     * <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for a
     * given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     * unsupported operation on a resource will return an error message.
     * </p>
     * 
     * @param op
     *        An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     *        <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for
     *        a given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     *        unsupported operation on a resource will return an error message.
     * @see Op
     */

    public void setOp(String op) {
        this.op = op;
    }

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     * <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for a
     * given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     * unsupported operation on a resource will return an error message.
     * </p>
     * 
     * @return An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     *         <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported
     *         for a given resource. Support of the operations depends on specific operational contexts. Attempts to
     *         apply an unsupported operation on a resource will return an error message.
     * @see Op
     */

    public String getOp() {
        return this.op;
    }

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     * <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for a
     * given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     * unsupported operation on a resource will return an error message.
     * </p>
     * 
     * @param op
     *        An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     *        <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for
     *        a given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     *        unsupported operation on a resource will return an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Op
     */

    public PatchOperation withOp(String op) {
        setOp(op);
        return this;
    }

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     * <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for a
     * given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     * unsupported operation on a resource will return an error message.
     * </p>
     * 
     * @param op
     *        An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     *        <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for
     *        a given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     *        unsupported operation on a resource will return an error message.
     * @see Op
     */

    public void setOp(Op op) {
        withOp(op);
    }

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     * <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for a
     * given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     * unsupported operation on a resource will return an error message.
     * </p>
     * 
     * @param op
     *        An update operation to be performed with this PATCH request. The valid value can be <code>add</code>,
     *        <code>remove</code>, <code>replace</code> or <code>copy</code>. Not all valid operations are supported for
     *        a given resource. Support of the operations depends on specific operational contexts. Attempts to apply an
     *        unsupported operation on a resource will return an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Op
     */

    public PatchOperation withOp(Op op) {
        this.op = op.toString();
        return this;
    }

    /**
     * <p>
     * The <code>op</code> operation's target, as identified by a <a
     * href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08">JSON Pointer</a> value that references a
     * location within the targeted resource. For example, if the target resource has an updateable property of
     * <code>{"name":"value"}</code>, the path for this property is <code>/name</code>. If the <code>name</code>
     * property value is a JSON object (e.g., <code>{"name": {"child/name": "child-value"}}</code>), the path for the
     * <code>child/name</code> property will be <code>/name/child~1name</code>. Any slash ("/") character appearing in
     * path names must be escaped with "~1", as shown in the example above. Each <code>op</code> operation can have only
     * one <code>path</code> associated with it.
     * </p>
     * 
     * @param path
     *        The <code>op</code> operation's target, as identified by a <a
     *        href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08">JSON Pointer</a> value that
     *        references a location within the targeted resource. For example, if the target resource has an updateable
     *        property of <code>{"name":"value"}</code>, the path for this property is <code>/name</code>. If the
     *        <code>name</code> property value is a JSON object (e.g.,
     *        <code>{"name": {"child/name": "child-value"}}</code>), the path for the <code>child/name</code> property
     *        will be <code>/name/child~1name</code>. Any slash ("/") character appearing in path names must be escaped
     *        with "~1", as shown in the example above. Each <code>op</code> operation can have only one
     *        <code>path</code> associated with it.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The <code>op</code> operation's target, as identified by a <a
     * href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08">JSON Pointer</a> value that references a
     * location within the targeted resource. For example, if the target resource has an updateable property of
     * <code>{"name":"value"}</code>, the path for this property is <code>/name</code>. If the <code>name</code>
     * property value is a JSON object (e.g., <code>{"name": {"child/name": "child-value"}}</code>), the path for the
     * <code>child/name</code> property will be <code>/name/child~1name</code>. Any slash ("/") character appearing in
     * path names must be escaped with "~1", as shown in the example above. Each <code>op</code> operation can have only
     * one <code>path</code> associated with it.
     * </p>
     * 
     * @return The <code>op</code> operation's target, as identified by a <a
     *         href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08">JSON Pointer</a> value that
     *         references a location within the targeted resource. For example, if the target resource has an updateable
     *         property of <code>{"name":"value"}</code>, the path for this property is <code>/name</code>. If the
     *         <code>name</code> property value is a JSON object (e.g.,
     *         <code>{"name": {"child/name": "child-value"}}</code>), the path for the <code>child/name</code> property
     *         will be <code>/name/child~1name</code>. Any slash ("/") character appearing in path names must be escaped
     *         with "~1", as shown in the example above. Each <code>op</code> operation can have only one
     *         <code>path</code> associated with it.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The <code>op</code> operation's target, as identified by a <a
     * href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08">JSON Pointer</a> value that references a
     * location within the targeted resource. For example, if the target resource has an updateable property of
     * <code>{"name":"value"}</code>, the path for this property is <code>/name</code>. If the <code>name</code>
     * property value is a JSON object (e.g., <code>{"name": {"child/name": "child-value"}}</code>), the path for the
     * <code>child/name</code> property will be <code>/name/child~1name</code>. Any slash ("/") character appearing in
     * path names must be escaped with "~1", as shown in the example above. Each <code>op</code> operation can have only
     * one <code>path</code> associated with it.
     * </p>
     * 
     * @param path
     *        The <code>op</code> operation's target, as identified by a <a
     *        href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08">JSON Pointer</a> value that
     *        references a location within the targeted resource. For example, if the target resource has an updateable
     *        property of <code>{"name":"value"}</code>, the path for this property is <code>/name</code>. If the
     *        <code>name</code> property value is a JSON object (e.g.,
     *        <code>{"name": {"child/name": "child-value"}}</code>), the path for the <code>child/name</code> property
     *        will be <code>/name/child~1name</code>. Any slash ("/") character appearing in path names must be escaped
     *        with "~1", as shown in the example above. Each <code>op</code> operation can have only one
     *        <code>path</code> associated with it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchOperation withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The new target value of the update operation. It is applicable for the <code>add</code> or <code>replace</code>
     * operation. When using AWS CLI to update a property of a JSON value, enclose the JSON object with a pair of single
     * quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>.
     * </p>
     * 
     * @param value
     *        The new target value of the update operation. It is applicable for the <code>add</code> or
     *        <code>replace</code> operation. When using AWS CLI to update a property of a JSON value, enclose the JSON
     *        object with a pair of single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The new target value of the update operation. It is applicable for the <code>add</code> or <code>replace</code>
     * operation. When using AWS CLI to update a property of a JSON value, enclose the JSON object with a pair of single
     * quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>.
     * </p>
     * 
     * @return The new target value of the update operation. It is applicable for the <code>add</code> or
     *         <code>replace</code> operation. When using AWS CLI to update a property of a JSON value, enclose the JSON
     *         object with a pair of single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *         JSON for Parameters</a>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The new target value of the update operation. It is applicable for the <code>add</code> or <code>replace</code>
     * operation. When using AWS CLI to update a property of a JSON value, enclose the JSON object with a pair of single
     * quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a>.
     * </p>
     * 
     * @param value
     *        The new target value of the update operation. It is applicable for the <code>add</code> or
     *        <code>replace</code> operation. When using AWS CLI to update a property of a JSON value, enclose the JSON
     *        object with a pair of single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchOperation withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The <code>copy</code> update operation's source as identified by a <code>JSON-Pointer</code> value referencing
     * the location within the targeted resource to copy the value from. For example, to promote a canary deployment,
     * you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH request on a <a>Stage</a>
     * resource with <code>"op":"copy"</code>, <code>"from":"/canarySettings/deploymentId"</code> and
     * <code>"path":"/deploymentId"</code>.
     * </p>
     * 
     * @param from
     *        The <code>copy</code> update operation's source as identified by a <code>JSON-Pointer</code> value
     *        referencing the location within the targeted resource to copy the value from. For example, to promote a
     *        canary deployment, you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH
     *        request on a <a>Stage</a> resource with <code>"op":"copy"</code>,
     *        <code>"from":"/canarySettings/deploymentId"</code> and <code>"path":"/deploymentId"</code>.
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The <code>copy</code> update operation's source as identified by a <code>JSON-Pointer</code> value referencing
     * the location within the targeted resource to copy the value from. For example, to promote a canary deployment,
     * you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH request on a <a>Stage</a>
     * resource with <code>"op":"copy"</code>, <code>"from":"/canarySettings/deploymentId"</code> and
     * <code>"path":"/deploymentId"</code>.
     * </p>
     * 
     * @return The <code>copy</code> update operation's source as identified by a <code>JSON-Pointer</code> value
     *         referencing the location within the targeted resource to copy the value from. For example, to promote a
     *         canary deployment, you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH
     *         request on a <a>Stage</a> resource with <code>"op":"copy"</code>,
     *         <code>"from":"/canarySettings/deploymentId"</code> and <code>"path":"/deploymentId"</code>.
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The <code>copy</code> update operation's source as identified by a <code>JSON-Pointer</code> value referencing
     * the location within the targeted resource to copy the value from. For example, to promote a canary deployment,
     * you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH request on a <a>Stage</a>
     * resource with <code>"op":"copy"</code>, <code>"from":"/canarySettings/deploymentId"</code> and
     * <code>"path":"/deploymentId"</code>.
     * </p>
     * 
     * @param from
     *        The <code>copy</code> update operation's source as identified by a <code>JSON-Pointer</code> value
     *        referencing the location within the targeted resource to copy the value from. For example, to promote a
     *        canary deployment, you copy the canary deployment ID to the affiliated deployment ID by calling a PATCH
     *        request on a <a>Stage</a> resource with <code>"op":"copy"</code>,
     *        <code>"from":"/canarySettings/deploymentId"</code> and <code>"path":"/deploymentId"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchOperation withFrom(String from) {
        setFrom(from);
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
        if (getOp() != null)
            sb.append("Op: ").append(getOp()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getFrom() != null)
            sb.append("From: ").append(getFrom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchOperation == false)
            return false;
        PatchOperation other = (PatchOperation) obj;
        if (other.getOp() == null ^ this.getOp() == null)
            return false;
        if (other.getOp() != null && other.getOp().equals(this.getOp()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOp() == null) ? 0 : getOp().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        return hashCode;
    }

    @Override
    public PatchOperation clone() {
        try {
            return (PatchOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.PatchOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
