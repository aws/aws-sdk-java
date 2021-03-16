/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A location in a policy that is represented as a path through the JSON representation and a corresponding span.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A path in a policy, represented as a sequence of path elements.
     * </p>
     */
    private java.util.List<PathElement> path;
    /**
     * <p>
     * A span in a policy.
     * </p>
     */
    private Span span;

    /**
     * <p>
     * A path in a policy, represented as a sequence of path elements.
     * </p>
     * 
     * @return A path in a policy, represented as a sequence of path elements.
     */

    public java.util.List<PathElement> getPath() {
        return path;
    }

    /**
     * <p>
     * A path in a policy, represented as a sequence of path elements.
     * </p>
     * 
     * @param path
     *        A path in a policy, represented as a sequence of path elements.
     */

    public void setPath(java.util.Collection<PathElement> path) {
        if (path == null) {
            this.path = null;
            return;
        }

        this.path = new java.util.ArrayList<PathElement>(path);
    }

    /**
     * <p>
     * A path in a policy, represented as a sequence of path elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPath(java.util.Collection)} or {@link #withPath(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param path
     *        A path in a policy, represented as a sequence of path elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withPath(PathElement... path) {
        if (this.path == null) {
            setPath(new java.util.ArrayList<PathElement>(path.length));
        }
        for (PathElement ele : path) {
            this.path.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A path in a policy, represented as a sequence of path elements.
     * </p>
     * 
     * @param path
     *        A path in a policy, represented as a sequence of path elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withPath(java.util.Collection<PathElement> path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * A span in a policy.
     * </p>
     * 
     * @param span
     *        A span in a policy.
     */

    public void setSpan(Span span) {
        this.span = span;
    }

    /**
     * <p>
     * A span in a policy.
     * </p>
     * 
     * @return A span in a policy.
     */

    public Span getSpan() {
        return this.span;
    }

    /**
     * <p>
     * A span in a policy.
     * </p>
     * 
     * @param span
     *        A span in a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withSpan(Span span) {
        setSpan(span);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getSpan() != null)
            sb.append("Span: ").append(getSpan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getSpan() == null ^ this.getSpan() == null)
            return false;
        if (other.getSpan() != null && other.getSpan().equals(this.getSpan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getSpan() == null) ? 0 : getSpan().hashCode());
        return hashCode;
    }

    @Override
    public Location clone() {
        try {
            return (Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
