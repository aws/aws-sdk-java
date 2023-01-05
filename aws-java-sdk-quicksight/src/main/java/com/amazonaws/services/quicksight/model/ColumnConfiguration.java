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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The general configuration of a column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The format configuration of a column.
     * </p>
     */
    private FormatConfiguration formatConfiguration;
    /**
     * <p>
     * The role of the column.
     * </p>
     */
    private String role;

    /**
     * <p>
     * The column.
     * </p>
     * 
     * @param column
     *        The column.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column.
     * </p>
     * 
     * @return The column.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column.
     * </p>
     * 
     * @param column
     *        The column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The format configuration of a column.
     * </p>
     * 
     * @param formatConfiguration
     *        The format configuration of a column.
     */

    public void setFormatConfiguration(FormatConfiguration formatConfiguration) {
        this.formatConfiguration = formatConfiguration;
    }

    /**
     * <p>
     * The format configuration of a column.
     * </p>
     * 
     * @return The format configuration of a column.
     */

    public FormatConfiguration getFormatConfiguration() {
        return this.formatConfiguration;
    }

    /**
     * <p>
     * The format configuration of a column.
     * </p>
     * 
     * @param formatConfiguration
     *        The format configuration of a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnConfiguration withFormatConfiguration(FormatConfiguration formatConfiguration) {
        setFormatConfiguration(formatConfiguration);
        return this;
    }

    /**
     * <p>
     * The role of the column.
     * </p>
     * 
     * @param role
     *        The role of the column.
     * @see ColumnRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role of the column.
     * </p>
     * 
     * @return The role of the column.
     * @see ColumnRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role of the column.
     * </p>
     * 
     * @param role
     *        The role of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnRole
     */

    public ColumnConfiguration withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The role of the column.
     * </p>
     * 
     * @param role
     *        The role of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnRole
     */

    public ColumnConfiguration withRole(ColumnRole role) {
        this.role = role.toString();
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
        if (getFormatConfiguration() != null)
            sb.append("FormatConfiguration: ").append(getFormatConfiguration()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnConfiguration == false)
            return false;
        ColumnConfiguration other = (ColumnConfiguration) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getFormatConfiguration() == null ^ this.getFormatConfiguration() == null)
            return false;
        if (other.getFormatConfiguration() != null && other.getFormatConfiguration().equals(this.getFormatConfiguration()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getFormatConfiguration() == null) ? 0 : getFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public ColumnConfiguration clone() {
        try {
            return (ColumnConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
