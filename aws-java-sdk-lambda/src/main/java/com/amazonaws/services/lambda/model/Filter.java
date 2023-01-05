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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure within a <code>FilterCriteria</code> object that defines an event filtering pattern.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A filter pattern. For more information on the syntax of a filter pattern, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax"> Filter rule
     * syntax</a>.
     * </p>
     */
    private String pattern;

    /**
     * <p>
     * A filter pattern. For more information on the syntax of a filter pattern, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax"> Filter rule
     * syntax</a>.
     * </p>
     * 
     * @param pattern
     *        A filter pattern. For more information on the syntax of a filter pattern, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax">
     *        Filter rule syntax</a>.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * A filter pattern. For more information on the syntax of a filter pattern, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax"> Filter rule
     * syntax</a>.
     * </p>
     * 
     * @return A filter pattern. For more information on the syntax of a filter pattern, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax">
     *         Filter rule syntax</a>.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * A filter pattern. For more information on the syntax of a filter pattern, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax"> Filter rule
     * syntax</a>.
     * </p>
     * 
     * @param pattern
     *        A filter pattern. For more information on the syntax of a filter pattern, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax">
     *        Filter rule syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withPattern(String pattern) {
        setPattern(pattern);
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
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
