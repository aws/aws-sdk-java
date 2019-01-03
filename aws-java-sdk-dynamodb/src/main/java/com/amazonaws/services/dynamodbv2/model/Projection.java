/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary
 * key attributes and index key attributes, which are automatically projected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Projection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Projection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The set of attributes that are projected into the index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     */
    private String projectionType;
    /**
     * <p>
     * Represents the non-key attribute names which will be projected into the index.
     * </p>
     * <p>
     * For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local
     * secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts
     * as two distinct attributes when determining the total.
     * </p>
     */
    private java.util.List<String> nonKeyAttributes;

    /**
     * <p>
     * The set of attributes that are projected into the index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * 
     * @param projectionType
     *        The set of attributes that are projected into the index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <code>NonKeyAttributes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     * @see ProjectionType
     */

    public void setProjectionType(String projectionType) {
        this.projectionType = projectionType;
    }

    /**
     * <p>
     * The set of attributes that are projected into the index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The set of attributes that are projected into the index:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *         projected attributes are in <code>NonKeyAttributes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code> - All of the table attributes are projected into the index.
     *         </p>
     *         </li>
     * @see ProjectionType
     */

    public String getProjectionType() {
        return this.projectionType;
    }

    /**
     * <p>
     * The set of attributes that are projected into the index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * 
     * @param projectionType
     *        The set of attributes that are projected into the index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <code>NonKeyAttributes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectionType
     */

    public Projection withProjectionType(String projectionType) {
        setProjectionType(projectionType);
        return this;
    }

    /**
     * <p>
     * The set of attributes that are projected into the index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * 
     * @param projectionType
     *        The set of attributes that are projected into the index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <code>NonKeyAttributes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     * @see ProjectionType
     */

    public void setProjectionType(ProjectionType projectionType) {
        withProjectionType(projectionType);
    }

    /**
     * <p>
     * The set of attributes that are projected into the index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <code>NonKeyAttributes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * 
     * @param projectionType
     *        The set of attributes that are projected into the index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <code>NonKeyAttributes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectionType
     */

    public Projection withProjectionType(ProjectionType projectionType) {
        this.projectionType = projectionType.toString();
        return this;
    }

    /**
     * <p>
     * Represents the non-key attribute names which will be projected into the index.
     * </p>
     * <p>
     * For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local
     * secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts
     * as two distinct attributes when determining the total.
     * </p>
     * 
     * @return Represents the non-key attribute names which will be projected into the index.</p>
     *         <p>
     *         For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the
     *         local secondary indexes, must not exceed 20. If you project the same attribute into two different
     *         indexes, this counts as two distinct attributes when determining the total.
     */

    public java.util.List<String> getNonKeyAttributes() {
        return nonKeyAttributes;
    }

    /**
     * <p>
     * Represents the non-key attribute names which will be projected into the index.
     * </p>
     * <p>
     * For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local
     * secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts
     * as two distinct attributes when determining the total.
     * </p>
     * 
     * @param nonKeyAttributes
     *        Represents the non-key attribute names which will be projected into the index.</p>
     *        <p>
     *        For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the
     *        local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     */

    public void setNonKeyAttributes(java.util.Collection<String> nonKeyAttributes) {
        if (nonKeyAttributes == null) {
            this.nonKeyAttributes = null;
            return;
        }

        this.nonKeyAttributes = new java.util.ArrayList<String>(nonKeyAttributes);
    }

    /**
     * <p>
     * Represents the non-key attribute names which will be projected into the index.
     * </p>
     * <p>
     * For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local
     * secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts
     * as two distinct attributes when determining the total.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNonKeyAttributes(java.util.Collection)} or {@link #withNonKeyAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nonKeyAttributes
     *        Represents the non-key attribute names which will be projected into the index.</p>
     *        <p>
     *        For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the
     *        local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Projection withNonKeyAttributes(String... nonKeyAttributes) {
        if (this.nonKeyAttributes == null) {
            setNonKeyAttributes(new java.util.ArrayList<String>(nonKeyAttributes.length));
        }
        for (String ele : nonKeyAttributes) {
            this.nonKeyAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the non-key attribute names which will be projected into the index.
     * </p>
     * <p>
     * For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local
     * secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts
     * as two distinct attributes when determining the total.
     * </p>
     * 
     * @param nonKeyAttributes
     *        Represents the non-key attribute names which will be projected into the index.</p>
     *        <p>
     *        For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the
     *        local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Projection withNonKeyAttributes(java.util.Collection<String> nonKeyAttributes) {
        setNonKeyAttributes(nonKeyAttributes);
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
        if (getProjectionType() != null)
            sb.append("ProjectionType: ").append(getProjectionType()).append(",");
        if (getNonKeyAttributes() != null)
            sb.append("NonKeyAttributes: ").append(getNonKeyAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Projection == false)
            return false;
        Projection other = (Projection) obj;
        if (other.getProjectionType() == null ^ this.getProjectionType() == null)
            return false;
        if (other.getProjectionType() != null && other.getProjectionType().equals(this.getProjectionType()) == false)
            return false;
        if (other.getNonKeyAttributes() == null ^ this.getNonKeyAttributes() == null)
            return false;
        if (other.getNonKeyAttributes() != null && other.getNonKeyAttributes().equals(this.getNonKeyAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectionType() == null) ? 0 : getProjectionType().hashCode());
        hashCode = prime * hashCode + ((getNonKeyAttributes() == null) ? 0 : getNonKeyAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Projection clone() {
        try {
            return (Projection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ProjectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
