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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the name and values of a manual DB cluster snapshot attribute.
 * </p>
 * <p>
 * Manual DB cluster snapshot attributes are used to authorize other AWS accounts to restore a manual DB cluster
 * snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DBClusterSnapshotAttribute" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterSnapshotAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy or
     * restore the manual DB cluster snapshot.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The values for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of
     * <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for any AWS account
     * to copy or restore.
     * </p>
     */
    private java.util.List<String> attributeValues;

    /**
     * <p>
     * The name of the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy or
     * restore the manual DB cluster snapshot.
     * </p>
     * 
     * @param attributeName
     *        The name of the manual DB cluster snapshot attribute.</p>
     *        <p>
     *        The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy
     *        or restore the manual DB cluster snapshot.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy or
     * restore the manual DB cluster snapshot.
     * </p>
     * 
     * @return The name of the manual DB cluster snapshot attribute.</p>
     *         <p>
     *         The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy
     *         or restore the manual DB cluster snapshot.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy or
     * restore the manual DB cluster snapshot.
     * </p>
     * 
     * @param attributeName
     *        The name of the manual DB cluster snapshot attribute.</p>
     *        <p>
     *        The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy
     *        or restore the manual DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshotAttribute withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The values for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of
     * <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for any AWS account
     * to copy or restore.
     * </p>
     * 
     * @return The values for the manual DB cluster snapshot attribute.</p>
     *         <p>
     *         If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list
     *         of IDs of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a
     *         value of <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for
     *         any AWS account to copy or restore.
     */

    public java.util.List<String> getAttributeValues() {
        return attributeValues;
    }

    /**
     * <p>
     * The values for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of
     * <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for any AWS account
     * to copy or restore.
     * </p>
     * 
     * @param attributeValues
     *        The values for the manual DB cluster snapshot attribute.</p>
     *        <p>
     *        If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list
     *        of IDs of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a
     *        value of <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for
     *        any AWS account to copy or restore.
     */

    public void setAttributeValues(java.util.Collection<String> attributeValues) {
        if (attributeValues == null) {
            this.attributeValues = null;
            return;
        }

        this.attributeValues = new java.util.ArrayList<String>(attributeValues);
    }

    /**
     * <p>
     * The values for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of
     * <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for any AWS account
     * to copy or restore.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeValues(java.util.Collection)} or {@link #withAttributeValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeValues
     *        The values for the manual DB cluster snapshot attribute.</p>
     *        <p>
     *        If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list
     *        of IDs of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a
     *        value of <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for
     *        any AWS account to copy or restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshotAttribute withAttributeValues(String... attributeValues) {
        if (this.attributeValues == null) {
            setAttributeValues(new java.util.ArrayList<String>(attributeValues.length));
        }
        for (String ele : attributeValues) {
            this.attributeValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of
     * <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for any AWS account
     * to copy or restore.
     * </p>
     * 
     * @param attributeValues
     *        The values for the manual DB cluster snapshot attribute.</p>
     *        <p>
     *        If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list
     *        of IDs of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a
     *        value of <code>all</code> is in the list, then the manual DB cluster snapshot is public and available for
     *        any AWS account to copy or restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshotAttribute withAttributeValues(java.util.Collection<String> attributeValues) {
        setAttributeValues(attributeValues);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValues() != null)
            sb.append("AttributeValues: ").append(getAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterSnapshotAttribute == false)
            return false;
        DBClusterSnapshotAttribute other = (DBClusterSnapshotAttribute) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValues() == null ^ this.getAttributeValues() == null)
            return false;
        if (other.getAttributeValues() != null && other.getAttributeValues().equals(this.getAttributeValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValues() == null) ? 0 : getAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterSnapshotAttribute clone() {
        try {
            return (DBClusterSnapshotAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
