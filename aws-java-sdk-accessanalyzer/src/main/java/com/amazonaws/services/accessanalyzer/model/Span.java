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
 * A span in a policy. The span consists of a start position (inclusive) and end position (exclusive).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/Span" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Span implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The end position of the span (exclusive).
     * </p>
     */
    private Position end;
    /**
     * <p>
     * The start position of the span (inclusive).
     * </p>
     */
    private Position start;

    /**
     * <p>
     * The end position of the span (exclusive).
     * </p>
     * 
     * @param end
     *        The end position of the span (exclusive).
     */

    public void setEnd(Position end) {
        this.end = end;
    }

    /**
     * <p>
     * The end position of the span (exclusive).
     * </p>
     * 
     * @return The end position of the span (exclusive).
     */

    public Position getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The end position of the span (exclusive).
     * </p>
     * 
     * @param end
     *        The end position of the span (exclusive).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Span withEnd(Position end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * The start position of the span (inclusive).
     * </p>
     * 
     * @param start
     *        The start position of the span (inclusive).
     */

    public void setStart(Position start) {
        this.start = start;
    }

    /**
     * <p>
     * The start position of the span (inclusive).
     * </p>
     * 
     * @return The start position of the span (inclusive).
     */

    public Position getStart() {
        return this.start;
    }

    /**
     * <p>
     * The start position of the span (inclusive).
     * </p>
     * 
     * @param start
     *        The start position of the span (inclusive).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Span withStart(Position start) {
        setStart(start);
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
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Span == false)
            return false;
        Span other = (Span) obj;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public Span clone() {
        try {
            return (Span) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.SpanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
