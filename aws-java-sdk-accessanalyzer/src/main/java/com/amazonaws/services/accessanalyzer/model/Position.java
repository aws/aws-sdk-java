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
 * A position in a policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/Position" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Position implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column of the position, starting from 0.
     * </p>
     */
    private Integer column;
    /**
     * <p>
     * The line of the position, starting from 1.
     * </p>
     */
    private Integer line;
    /**
     * <p>
     * The offset within the policy that corresponds to the position, starting from 0.
     * </p>
     */
    private Integer offset;

    /**
     * <p>
     * The column of the position, starting from 0.
     * </p>
     * 
     * @param column
     *        The column of the position, starting from 0.
     */

    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * <p>
     * The column of the position, starting from 0.
     * </p>
     * 
     * @return The column of the position, starting from 0.
     */

    public Integer getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column of the position, starting from 0.
     * </p>
     * 
     * @param column
     *        The column of the position, starting from 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Position withColumn(Integer column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The line of the position, starting from 1.
     * </p>
     * 
     * @param line
     *        The line of the position, starting from 1.
     */

    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * <p>
     * The line of the position, starting from 1.
     * </p>
     * 
     * @return The line of the position, starting from 1.
     */

    public Integer getLine() {
        return this.line;
    }

    /**
     * <p>
     * The line of the position, starting from 1.
     * </p>
     * 
     * @param line
     *        The line of the position, starting from 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Position withLine(Integer line) {
        setLine(line);
        return this;
    }

    /**
     * <p>
     * The offset within the policy that corresponds to the position, starting from 0.
     * </p>
     * 
     * @param offset
     *        The offset within the policy that corresponds to the position, starting from 0.
     */

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * The offset within the policy that corresponds to the position, starting from 0.
     * </p>
     * 
     * @return The offset within the policy that corresponds to the position, starting from 0.
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * The offset within the policy that corresponds to the position, starting from 0.
     * </p>
     * 
     * @param offset
     *        The offset within the policy that corresponds to the position, starting from 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Position withOffset(Integer offset) {
        setOffset(offset);
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
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getLine() != null)
            sb.append("Line: ").append(getLine()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Position == false)
            return false;
        Position other = (Position) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getLine() == null ^ this.getLine() == null)
            return false;
        if (other.getLine() != null && other.getLine().equals(this.getLine()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getLine() == null) ? 0 : getLine().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        return hashCode;
    }

    @Override
    public Position clone() {
        try {
            return (Position) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.PositionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
