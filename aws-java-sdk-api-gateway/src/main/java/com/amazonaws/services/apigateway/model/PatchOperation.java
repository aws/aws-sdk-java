/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * A single patch operation to apply to the specified resource. Please refer to
 * http://tools.ietf.org/html/rfc6902#section-4 for an explanation of how each
 * operation is used.
 */
public class PatchOperation implements Serializable, Cloneable {

    /**
     * <p>
     * A patch operation whose value indicates the operation to perform. Its
     * value MUST be one of "add", "remove", "replace", "move", "copy", or
     * "test"; other values are errors.
     * </p>
     */
    private String op;
    /**
     * <p>
     * Operation objects MUST have exactly one "path" member. That member's
     * value is a string containing a `JSON-Pointer` value that references a
     * location within the target document (the "target location") where the
     * operation is performed.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The actual value content.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The "move" and "copy" operation object MUST contain a "from" member,
     * which is a string containing a <code>JSON Pointer</code> value that
     * references the location in the target document to move the value from.
     * </p>
     */
    private String from;

    /**
     * <p>
     * A patch operation whose value indicates the operation to perform. Its
     * value MUST be one of "add", "remove", "replace", "move", "copy", or
     * "test"; other values are errors.
     * </p>
     * 
     * @param op
     *        A patch operation whose value indicates the operation to perform.
     *        Its value MUST be one of "add", "remove", "replace", "move",
     *        "copy", or "test"; other values are errors.
     * @see Op
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * <p>
     * A patch operation whose value indicates the operation to perform. Its
     * value MUST be one of "add", "remove", "replace", "move", "copy", or
     * "test"; other values are errors.
     * </p>
     * 
     * @return A patch operation whose value indicates the operation to perform.
     *         Its value MUST be one of "add", "remove", "replace", "move",
     *         "copy", or "test"; other values are errors.
     * @see Op
     */
    public String getOp() {
        return this.op;
    }

    /**
     * <p>
     * A patch operation whose value indicates the operation to perform. Its
     * value MUST be one of "add", "remove", "replace", "move", "copy", or
     * "test"; other values are errors.
     * </p>
     * 
     * @param op
     *        A patch operation whose value indicates the operation to perform.
     *        Its value MUST be one of "add", "remove", "replace", "move",
     *        "copy", or "test"; other values are errors.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Op
     */
    public PatchOperation withOp(String op) {
        setOp(op);
        return this;
    }

    /**
     * <p>
     * A patch operation whose value indicates the operation to perform. Its
     * value MUST be one of "add", "remove", "replace", "move", "copy", or
     * "test"; other values are errors.
     * </p>
     * 
     * @param op
     *        A patch operation whose value indicates the operation to perform.
     *        Its value MUST be one of "add", "remove", "replace", "move",
     *        "copy", or "test"; other values are errors.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Op
     */
    public void setOp(Op op) {
        this.op = op.toString();
    }

    /**
     * <p>
     * A patch operation whose value indicates the operation to perform. Its
     * value MUST be one of "add", "remove", "replace", "move", "copy", or
     * "test"; other values are errors.
     * </p>
     * 
     * @param op
     *        A patch operation whose value indicates the operation to perform.
     *        Its value MUST be one of "add", "remove", "replace", "move",
     *        "copy", or "test"; other values are errors.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Op
     */
    public PatchOperation withOp(Op op) {
        setOp(op);
        return this;
    }

    /**
     * <p>
     * Operation objects MUST have exactly one "path" member. That member's
     * value is a string containing a `JSON-Pointer` value that references a
     * location within the target document (the "target location") where the
     * operation is performed.
     * </p>
     * 
     * @param path
     *        Operation objects MUST have exactly one "path" member. That
     *        member's value is a string containing a `JSON-Pointer` value that
     *        references a location within the target document (the
     *        "target location") where the operation is performed.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Operation objects MUST have exactly one "path" member. That member's
     * value is a string containing a `JSON-Pointer` value that references a
     * location within the target document (the "target location") where the
     * operation is performed.
     * </p>
     * 
     * @return Operation objects MUST have exactly one "path" member. That
     *         member's value is a string containing a `JSON-Pointer` value that
     *         references a location within the target document (the
     *         "target location") where the operation is performed.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Operation objects MUST have exactly one "path" member. That member's
     * value is a string containing a `JSON-Pointer` value that references a
     * location within the target document (the "target location") where the
     * operation is performed.
     * </p>
     * 
     * @param path
     *        Operation objects MUST have exactly one "path" member. That
     *        member's value is a string containing a `JSON-Pointer` value that
     *        references a location within the target document (the
     *        "target location") where the operation is performed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PatchOperation withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The actual value content.
     * </p>
     * 
     * @param value
     *        The actual value content.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The actual value content.
     * </p>
     * 
     * @return The actual value content.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The actual value content.
     * </p>
     * 
     * @param value
     *        The actual value content.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PatchOperation withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The "move" and "copy" operation object MUST contain a "from" member,
     * which is a string containing a <code>JSON Pointer</code> value that
     * references the location in the target document to move the value from.
     * </p>
     * 
     * @param from
     *        The "move" and "copy" operation object MUST contain a "from"
     *        member, which is a string containing a <code>JSON Pointer</code>
     *        value that references the location in the target document to move
     *        the value from.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The "move" and "copy" operation object MUST contain a "from" member,
     * which is a string containing a <code>JSON Pointer</code> value that
     * references the location in the target document to move the value from.
     * </p>
     * 
     * @return The "move" and "copy" operation object MUST contain a "from"
     *         member, which is a string containing a <code>JSON Pointer</code>
     *         value that references the location in the target document to move
     *         the value from.
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The "move" and "copy" operation object MUST contain a "from" member,
     * which is a string containing a <code>JSON Pointer</code> value that
     * references the location in the target document to move the value from.
     * </p>
     * 
     * @param from
     *        The "move" and "copy" operation object MUST contain a "from"
     *        member, which is a string containing a <code>JSON Pointer</code>
     *        value that references the location in the target document to move
     *        the value from.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PatchOperation withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Op: " + getOp() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getFrom() != null)
            sb.append("From: " + getFrom());
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
        if (other.getOp() != null
                && other.getOp().equals(this.getOp()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null
                && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null
                && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null
                && other.getFrom().equals(this.getFrom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOp() == null) ? 0 : getOp().hashCode());
        hashCode = prime * hashCode
                + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getFrom() == null) ? 0 : getFrom().hashCode());
        return hashCode;
    }

    @Override
    public PatchOperation clone() {
        try {
            return (PatchOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}