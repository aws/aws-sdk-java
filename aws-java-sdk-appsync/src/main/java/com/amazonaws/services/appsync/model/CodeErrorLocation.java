/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the location of the error in a code sample.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CodeErrorLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeErrorLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The line number in the code. Defaults to <code>0</code> if unknown.
     * </p>
     */
    private Integer line;
    /**
     * <p>
     * The column number in the code. Defaults to <code>0</code> if unknown.
     * </p>
     */
    private Integer column;
    /**
     * <p>
     * The span/length of the error. Defaults to <code>-1</code> if unknown.
     * </p>
     */
    private Integer span;

    /**
     * <p>
     * The line number in the code. Defaults to <code>0</code> if unknown.
     * </p>
     * 
     * @param line
     *        The line number in the code. Defaults to <code>0</code> if unknown.
     */

    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * <p>
     * The line number in the code. Defaults to <code>0</code> if unknown.
     * </p>
     * 
     * @return The line number in the code. Defaults to <code>0</code> if unknown.
     */

    public Integer getLine() {
        return this.line;
    }

    /**
     * <p>
     * The line number in the code. Defaults to <code>0</code> if unknown.
     * </p>
     * 
     * @param line
     *        The line number in the code. Defaults to <code>0</code> if unknown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeErrorLocation withLine(Integer line) {
        setLine(line);
        return this;
    }

    /**
     * <p>
     * The column number in the code. Defaults to <code>0</code> if unknown.
     * </p>
     * 
     * @param column
     *        The column number in the code. Defaults to <code>0</code> if unknown.
     */

    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * <p>
     * The column number in the code. Defaults to <code>0</code> if unknown.
     * </p>
     * 
     * @return The column number in the code. Defaults to <code>0</code> if unknown.
     */

    public Integer getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column number in the code. Defaults to <code>0</code> if unknown.
     * </p>
     * 
     * @param column
     *        The column number in the code. Defaults to <code>0</code> if unknown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeErrorLocation withColumn(Integer column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The span/length of the error. Defaults to <code>-1</code> if unknown.
     * </p>
     * 
     * @param span
     *        The span/length of the error. Defaults to <code>-1</code> if unknown.
     */

    public void setSpan(Integer span) {
        this.span = span;
    }

    /**
     * <p>
     * The span/length of the error. Defaults to <code>-1</code> if unknown.
     * </p>
     * 
     * @return The span/length of the error. Defaults to <code>-1</code> if unknown.
     */

    public Integer getSpan() {
        return this.span;
    }

    /**
     * <p>
     * The span/length of the error. Defaults to <code>-1</code> if unknown.
     * </p>
     * 
     * @param span
     *        The span/length of the error. Defaults to <code>-1</code> if unknown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeErrorLocation withSpan(Integer span) {
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
        if (getLine() != null)
            sb.append("Line: ").append(getLine()).append(",");
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
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

        if (obj instanceof CodeErrorLocation == false)
            return false;
        CodeErrorLocation other = (CodeErrorLocation) obj;
        if (other.getLine() == null ^ this.getLine() == null)
            return false;
        if (other.getLine() != null && other.getLine().equals(this.getLine()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
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

        hashCode = prime * hashCode + ((getLine() == null) ? 0 : getLine().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getSpan() == null) ? 0 : getSpan().hashCode());
        return hashCode;
    }

    @Override
    public CodeErrorLocation clone() {
        try {
            return (CodeErrorLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.CodeErrorLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
