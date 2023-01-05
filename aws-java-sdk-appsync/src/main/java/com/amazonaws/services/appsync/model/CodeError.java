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
 * Describes an AppSync error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CodeError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of code error.
     * </p>
     * <p>
     * Examples include, but aren't limited to: <code>LINT_ERROR</code>, <code>PARSER_ERROR</code>.
     * </p>
     */
    private String errorType;
    /**
     * <p>
     * A user presentable error.
     * </p>
     * <p>
     * Examples include, but aren't limited to: <code>Parsing error: Unterminated string literal</code>.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The line, column, and span location of the error in the code.
     * </p>
     */
    private CodeErrorLocation location;

    /**
     * <p>
     * The type of code error.
     * </p>
     * <p>
     * Examples include, but aren't limited to: <code>LINT_ERROR</code>, <code>PARSER_ERROR</code>.
     * </p>
     * 
     * @param errorType
     *        The type of code error. </p>
     *        <p>
     *        Examples include, but aren't limited to: <code>LINT_ERROR</code>, <code>PARSER_ERROR</code>.
     */

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * The type of code error.
     * </p>
     * <p>
     * Examples include, but aren't limited to: <code>LINT_ERROR</code>, <code>PARSER_ERROR</code>.
     * </p>
     * 
     * @return The type of code error. </p>
     *         <p>
     *         Examples include, but aren't limited to: <code>LINT_ERROR</code>, <code>PARSER_ERROR</code>.
     */

    public String getErrorType() {
        return this.errorType;
    }

    /**
     * <p>
     * The type of code error.
     * </p>
     * <p>
     * Examples include, but aren't limited to: <code>LINT_ERROR</code>, <code>PARSER_ERROR</code>.
     * </p>
     * 
     * @param errorType
     *        The type of code error. </p>
     *        <p>
     *        Examples include, but aren't limited to: <code>LINT_ERROR</code>, <code>PARSER_ERROR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeError withErrorType(String errorType) {
        setErrorType(errorType);
        return this;
    }

    /**
     * <p>
     * A user presentable error.
     * </p>
     * <p>
     * Examples include, but aren't limited to: <code>Parsing error: Unterminated string literal</code>.
     * </p>
     * 
     * @param value
     *        A user presentable error.</p>
     *        <p>
     *        Examples include, but aren't limited to: <code>Parsing error: Unterminated string literal</code>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A user presentable error.
     * </p>
     * <p>
     * Examples include, but aren't limited to: <code>Parsing error: Unterminated string literal</code>.
     * </p>
     * 
     * @return A user presentable error.</p>
     *         <p>
     *         Examples include, but aren't limited to: <code>Parsing error: Unterminated string literal</code>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A user presentable error.
     * </p>
     * <p>
     * Examples include, but aren't limited to: <code>Parsing error: Unterminated string literal</code>.
     * </p>
     * 
     * @param value
     *        A user presentable error.</p>
     *        <p>
     *        Examples include, but aren't limited to: <code>Parsing error: Unterminated string literal</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeError withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The line, column, and span location of the error in the code.
     * </p>
     * 
     * @param location
     *        The line, column, and span location of the error in the code.
     */

    public void setLocation(CodeErrorLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The line, column, and span location of the error in the code.
     * </p>
     * 
     * @return The line, column, and span location of the error in the code.
     */

    public CodeErrorLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The line, column, and span location of the error in the code.
     * </p>
     * 
     * @param location
     *        The line, column, and span location of the error in the code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeError withLocation(CodeErrorLocation location) {
        setLocation(location);
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
        if (getErrorType() != null)
            sb.append("ErrorType: ").append(getErrorType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeError == false)
            return false;
        CodeError other = (CodeError) obj;
        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public CodeError clone() {
        try {
            return (CodeError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.CodeErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
