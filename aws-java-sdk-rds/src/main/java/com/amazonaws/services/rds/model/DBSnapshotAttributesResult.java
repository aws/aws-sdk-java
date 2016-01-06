/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results of a successful call to the
 * DescribeDBSnapshotAttributes API.
 * </p>
 * <p>
 * Manual DB snapshot attributes are used to authorize other AWS accounts
 * to copy or restore a manual DB snapshot. For more information, see the
 * ModifyDBSnapshotAttribute API.
 * </p>
 */
public class DBSnapshotAttributesResult implements Serializable, Cloneable {

    /**
     * The identifier of the manual DB snapshot that the attributes apply to.
     */
    private String dBSnapshotIdentifier;

    /**
     * The list of attributes and values for the manual DB snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshotAttribute> dBSnapshotAttributes;

    /**
     * The identifier of the manual DB snapshot that the attributes apply to.
     *
     * @return The identifier of the manual DB snapshot that the attributes apply to.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * The identifier of the manual DB snapshot that the attributes apply to.
     *
     * @param dBSnapshotIdentifier The identifier of the manual DB snapshot that the attributes apply to.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The identifier of the manual DB snapshot that the attributes apply to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier The identifier of the manual DB snapshot that the attributes apply to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBSnapshotAttributesResult withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * The list of attributes and values for the manual DB snapshot.
     *
     * @return The list of attributes and values for the manual DB snapshot.
     */
    public java.util.List<DBSnapshotAttribute> getDBSnapshotAttributes() {
        if (dBSnapshotAttributes == null) {
              dBSnapshotAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshotAttribute>();
              dBSnapshotAttributes.setAutoConstruct(true);
        }
        return dBSnapshotAttributes;
    }
    
    /**
     * The list of attributes and values for the manual DB snapshot.
     *
     * @param dBSnapshotAttributes The list of attributes and values for the manual DB snapshot.
     */
    public void setDBSnapshotAttributes(java.util.Collection<DBSnapshotAttribute> dBSnapshotAttributes) {
        if (dBSnapshotAttributes == null) {
            this.dBSnapshotAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshotAttribute> dBSnapshotAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshotAttribute>(dBSnapshotAttributes.size());
        dBSnapshotAttributesCopy.addAll(dBSnapshotAttributes);
        this.dBSnapshotAttributes = dBSnapshotAttributesCopy;
    }
    
    /**
     * The list of attributes and values for the manual DB snapshot.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDBSnapshotAttributes(java.util.Collection)} or
     * {@link #withDBSnapshotAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotAttributes The list of attributes and values for the manual DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBSnapshotAttributesResult withDBSnapshotAttributes(DBSnapshotAttribute... dBSnapshotAttributes) {
        if (getDBSnapshotAttributes() == null) setDBSnapshotAttributes(new java.util.ArrayList<DBSnapshotAttribute>(dBSnapshotAttributes.length));
        for (DBSnapshotAttribute value : dBSnapshotAttributes) {
            getDBSnapshotAttributes().add(value);
        }
        return this;
    }
    
    /**
     * The list of attributes and values for the manual DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotAttributes The list of attributes and values for the manual DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBSnapshotAttributesResult withDBSnapshotAttributes(java.util.Collection<DBSnapshotAttribute> dBSnapshotAttributes) {
        if (dBSnapshotAttributes == null) {
            this.dBSnapshotAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshotAttribute> dBSnapshotAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshotAttribute>(dBSnapshotAttributes.size());
            dBSnapshotAttributesCopy.addAll(dBSnapshotAttributes);
            this.dBSnapshotAttributes = dBSnapshotAttributesCopy;
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
        if (getDBSnapshotIdentifier() != null) sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getDBSnapshotAttributes() != null) sb.append("DBSnapshotAttributes: " + getDBSnapshotAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBSnapshotAttributes() == null) ? 0 : getDBSnapshotAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBSnapshotAttributesResult == false) return false;
        DBSnapshotAttributesResult other = (DBSnapshotAttributesResult)obj;
        
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null) return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false) return false; 
        if (other.getDBSnapshotAttributes() == null ^ this.getDBSnapshotAttributes() == null) return false;
        if (other.getDBSnapshotAttributes() != null && other.getDBSnapshotAttributes().equals(this.getDBSnapshotAttributes()) == false) return false; 
        return true;
    }
    
    @Override
    public DBSnapshotAttributesResult clone() {
        try {
            return (DBSnapshotAttributesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    