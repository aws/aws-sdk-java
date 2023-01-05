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
 * The sort configuration for a field in a field well.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FieldSort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldSort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort configuration target field.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The sort direction. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Ascending
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Descending
     * </p>
     * </li>
     * </ul>
     */
    private String direction;

    /**
     * <p>
     * The sort configuration target field.
     * </p>
     * 
     * @param fieldId
     *        The sort configuration target field.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The sort configuration target field.
     * </p>
     * 
     * @return The sort configuration target field.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The sort configuration target field.
     * </p>
     * 
     * @param fieldId
     *        The sort configuration target field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSort withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The sort direction. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Ascending
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Descending
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        The sort direction. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASC</code>: Ascending
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESC</code>: Descending
     *        </p>
     *        </li>
     * @see SortDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The sort direction. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Ascending
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Descending
     * </p>
     * </li>
     * </ul>
     * 
     * @return The sort direction. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASC</code>: Ascending
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESC</code>: Descending
     *         </p>
     *         </li>
     * @see SortDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * The sort direction. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Ascending
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Descending
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        The sort direction. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASC</code>: Ascending
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESC</code>: Descending
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public FieldSort withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * The sort direction. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Ascending
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Descending
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        The sort direction. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASC</code>: Ascending
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESC</code>: Descending
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public FieldSort withDirection(SortDirection direction) {
        this.direction = direction.toString();
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
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldSort == false)
            return false;
        FieldSort other = (FieldSort) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        return hashCode;
    }

    @Override
    public FieldSort clone() {
        try {
            return (FieldSort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FieldSortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
