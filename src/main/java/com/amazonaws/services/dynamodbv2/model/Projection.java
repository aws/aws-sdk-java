/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;


/**
 * <p>
 * Represents attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key
 * attributes, which are automatically projected.
 * </p>
 */
public class Projection implements Serializable {

    /**
     * Represents the set of attributes that are projected into the index:
     * <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     * are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     * Only the specified table attributes are projected into the index. The
     * list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     * <li> <p><code>ALL</code> - All of the table attributes are projected
     * into the index. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     */
    private String projectionType;

    /**
     * Represents the non-key attribute names which will be projected into
     * the index. <p>The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> nonKeyAttributes;

    /**
     * Represents the set of attributes that are projected into the index:
     * <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     * are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     * Only the specified table attributes are projected into the index. The
     * list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     * <li> <p><code>ALL</code> - All of the table attributes are projected
     * into the index. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @return Represents the set of attributes that are projected into the index:
     *         <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     *         are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     *         Only the specified table attributes are projected into the index. The
     *         list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     *         <li> <p><code>ALL</code> - All of the table attributes are projected
     *         into the index. </li> </ul>
     *
     * @see ProjectionType
     */
    public String getProjectionType() {
        return projectionType;
    }
    
    /**
     * Represents the set of attributes that are projected into the index:
     * <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     * are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     * Only the specified table attributes are projected into the index. The
     * list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     * <li> <p><code>ALL</code> - All of the table attributes are projected
     * into the index. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @param projectionType Represents the set of attributes that are projected into the index:
     *         <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     *         are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     *         Only the specified table attributes are projected into the index. The
     *         list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     *         <li> <p><code>ALL</code> - All of the table attributes are projected
     *         into the index. </li> </ul>
     *
     * @see ProjectionType
     */
    public void setProjectionType(String projectionType) {
        this.projectionType = projectionType;
    }
    
    /**
     * Represents the set of attributes that are projected into the index:
     * <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     * are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     * Only the specified table attributes are projected into the index. The
     * list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     * <li> <p><code>ALL</code> - All of the table attributes are projected
     * into the index. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @param projectionType Represents the set of attributes that are projected into the index:
     *         <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     *         are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     *         Only the specified table attributes are projected into the index. The
     *         list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     *         <li> <p><code>ALL</code> - All of the table attributes are projected
     *         into the index. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ProjectionType
     */
    public Projection withProjectionType(String projectionType) {
        this.projectionType = projectionType;
        return this;
    }

    /**
     * Represents the set of attributes that are projected into the index:
     * <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     * are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     * Only the specified table attributes are projected into the index. The
     * list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     * <li> <p><code>ALL</code> - All of the table attributes are projected
     * into the index. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @param projectionType Represents the set of attributes that are projected into the index:
     *         <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     *         are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     *         Only the specified table attributes are projected into the index. The
     *         list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     *         <li> <p><code>ALL</code> - All of the table attributes are projected
     *         into the index. </li> </ul>
     *
     * @see ProjectionType
     */
    public void setProjectionType(ProjectionType projectionType) {
        this.projectionType = projectionType.toString();
    }
    
    /**
     * Represents the set of attributes that are projected into the index:
     * <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     * are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     * Only the specified table attributes are projected into the index. The
     * list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     * <li> <p><code>ALL</code> - All of the table attributes are projected
     * into the index. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @param projectionType Represents the set of attributes that are projected into the index:
     *         <ul> <li> <p><code>KEYS_ONLY</code> - Only the index and primary keys
     *         are projected into the index. </li> <li> <p><code>INCLUDE</code> -
     *         Only the specified table attributes are projected into the index. The
     *         list of projected attributes are in <i>NonKeyAttributes</i>. </li>
     *         <li> <p><code>ALL</code> - All of the table attributes are projected
     *         into the index. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ProjectionType
     */
    public Projection withProjectionType(ProjectionType projectionType) {
        this.projectionType = projectionType.toString();
        return this;
    }

    /**
     * Represents the non-key attribute names which will be projected into
     * the index. <p>The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @return Represents the non-key attribute names which will be projected into
     *         the index. <p>The total count of attributes specified in
     *         <i>NonKeyAttributes</i>, summed across all of the local secondary
     *         indexes, must not exceed 20. If you project the same attribute into
     *         two different indexes, this counts as two distinct attributes when
     *         determining the total.
     */
    public java.util.List<String> getNonKeyAttributes() {
        return nonKeyAttributes;
    }
    
    /**
     * Represents the non-key attribute names which will be projected into
     * the index. <p>The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
     *         the index. <p>The total count of attributes specified in
     *         <i>NonKeyAttributes</i>, summed across all of the local secondary
     *         indexes, must not exceed 20. If you project the same attribute into
     *         two different indexes, this counts as two distinct attributes when
     *         determining the total.
     */
    public void setNonKeyAttributes(java.util.Collection<String> nonKeyAttributes) {
        if (nonKeyAttributes == null) {
            this.nonKeyAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> nonKeyAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(nonKeyAttributes.size());
        nonKeyAttributesCopy.addAll(nonKeyAttributes);
        this.nonKeyAttributes = nonKeyAttributesCopy;
    }
    
    /**
     * Represents the non-key attribute names which will be projected into
     * the index. <p>The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
     *         the index. <p>The total count of attributes specified in
     *         <i>NonKeyAttributes</i>, summed across all of the local secondary
     *         indexes, must not exceed 20. If you project the same attribute into
     *         two different indexes, this counts as two distinct attributes when
     *         determining the total.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Projection withNonKeyAttributes(String... nonKeyAttributes) {
        if (getNonKeyAttributes() == null) setNonKeyAttributes(new java.util.ArrayList<String>(nonKeyAttributes.length));
        for (String value : nonKeyAttributes) {
            getNonKeyAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Represents the non-key attribute names which will be projected into
     * the index. <p>The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
     *         the index. <p>The total count of attributes specified in
     *         <i>NonKeyAttributes</i>, summed across all of the local secondary
     *         indexes, must not exceed 20. If you project the same attribute into
     *         two different indexes, this counts as two distinct attributes when
     *         determining the total.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Projection withNonKeyAttributes(java.util.Collection<String> nonKeyAttributes) {
        if (nonKeyAttributes == null) {
            this.nonKeyAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> nonKeyAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(nonKeyAttributes.size());
            nonKeyAttributesCopy.addAll(nonKeyAttributes);
            this.nonKeyAttributes = nonKeyAttributesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectionType() != null) sb.append("ProjectionType: " + getProjectionType() + ",");
        if (getNonKeyAttributes() != null) sb.append("NonKeyAttributes: " + getNonKeyAttributes() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Projection == false) return false;
        Projection other = (Projection)obj;
        
        if (other.getProjectionType() == null ^ this.getProjectionType() == null) return false;
        if (other.getProjectionType() != null && other.getProjectionType().equals(this.getProjectionType()) == false) return false; 
        if (other.getNonKeyAttributes() == null ^ this.getNonKeyAttributes() == null) return false;
        if (other.getNonKeyAttributes() != null && other.getNonKeyAttributes().equals(this.getNonKeyAttributes()) == false) return false; 
        return true;
    }
    
}
    