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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details of the table class.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TableClassSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableClassSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The table class of the specified table. Valid values are <code>STANDARD</code> and
     * <code>STANDARD_INFREQUENT_ACCESS</code>.
     * </p>
     */
    private String tableClass;
    /**
     * <p>
     * The date and time at which the table class was last updated.
     * </p>
     */
    private java.util.Date lastUpdateDateTime;

    /**
     * <p>
     * The table class of the specified table. Valid values are <code>STANDARD</code> and
     * <code>STANDARD_INFREQUENT_ACCESS</code>.
     * </p>
     * 
     * @param tableClass
     *        The table class of the specified table. Valid values are <code>STANDARD</code> and
     *        <code>STANDARD_INFREQUENT_ACCESS</code>.
     * @see TableClass
     */

    public void setTableClass(String tableClass) {
        this.tableClass = tableClass;
    }

    /**
     * <p>
     * The table class of the specified table. Valid values are <code>STANDARD</code> and
     * <code>STANDARD_INFREQUENT_ACCESS</code>.
     * </p>
     * 
     * @return The table class of the specified table. Valid values are <code>STANDARD</code> and
     *         <code>STANDARD_INFREQUENT_ACCESS</code>.
     * @see TableClass
     */

    public String getTableClass() {
        return this.tableClass;
    }

    /**
     * <p>
     * The table class of the specified table. Valid values are <code>STANDARD</code> and
     * <code>STANDARD_INFREQUENT_ACCESS</code>.
     * </p>
     * 
     * @param tableClass
     *        The table class of the specified table. Valid values are <code>STANDARD</code> and
     *        <code>STANDARD_INFREQUENT_ACCESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableClass
     */

    public TableClassSummary withTableClass(String tableClass) {
        setTableClass(tableClass);
        return this;
    }

    /**
     * <p>
     * The table class of the specified table. Valid values are <code>STANDARD</code> and
     * <code>STANDARD_INFREQUENT_ACCESS</code>.
     * </p>
     * 
     * @param tableClass
     *        The table class of the specified table. Valid values are <code>STANDARD</code> and
     *        <code>STANDARD_INFREQUENT_ACCESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableClass
     */

    public TableClassSummary withTableClass(TableClass tableClass) {
        this.tableClass = tableClass.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the table class was last updated.
     * </p>
     * 
     * @param lastUpdateDateTime
     *        The date and time at which the table class was last updated.
     */

    public void setLastUpdateDateTime(java.util.Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    /**
     * <p>
     * The date and time at which the table class was last updated.
     * </p>
     * 
     * @return The date and time at which the table class was last updated.
     */

    public java.util.Date getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    /**
     * <p>
     * The date and time at which the table class was last updated.
     * </p>
     * 
     * @param lastUpdateDateTime
     *        The date and time at which the table class was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableClassSummary withLastUpdateDateTime(java.util.Date lastUpdateDateTime) {
        setLastUpdateDateTime(lastUpdateDateTime);
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
        if (getTableClass() != null)
            sb.append("TableClass: ").append(getTableClass()).append(",");
        if (getLastUpdateDateTime() != null)
            sb.append("LastUpdateDateTime: ").append(getLastUpdateDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableClassSummary == false)
            return false;
        TableClassSummary other = (TableClassSummary) obj;
        if (other.getTableClass() == null ^ this.getTableClass() == null)
            return false;
        if (other.getTableClass() != null && other.getTableClass().equals(this.getTableClass()) == false)
            return false;
        if (other.getLastUpdateDateTime() == null ^ this.getLastUpdateDateTime() == null)
            return false;
        if (other.getLastUpdateDateTime() != null && other.getLastUpdateDateTime().equals(this.getLastUpdateDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableClass() == null) ? 0 : getTableClass().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDateTime() == null) ? 0 : getLastUpdateDateTime().hashCode());
        return hashCode;
    }

    @Override
    public TableClassSummary clone() {
        try {
            return (TableClassSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.TableClassSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
