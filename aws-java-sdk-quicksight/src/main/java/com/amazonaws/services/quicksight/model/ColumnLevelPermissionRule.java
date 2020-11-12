/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A rule defined to grant access on one or more restricted columns. Each dataset can have multiple rules. To create a
 * restricted column, you add it to one or more rules. Each rule must contain at least one column and at least one user
 * or group. To be able to see a restricted column, a user or group needs to be added to a rule for that column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnLevelPermissionRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnLevelPermissionRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * An array of column names.
     * </p>
     */
    private java.util.List<String> columnNames;

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     * </p>
     * 
     * @return An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     * </p>
     * 
     * @param principals
     *        An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnLevelPermissionRule withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     * </p>
     * 
     * @param principals
     *        An array of Amazon Resource Names (ARNs) for QuickSight users or groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnLevelPermissionRule withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * An array of column names.
     * </p>
     * 
     * @return An array of column names.
     */

    public java.util.List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * <p>
     * An array of column names.
     * </p>
     * 
     * @param columnNames
     *        An array of column names.
     */

    public void setColumnNames(java.util.Collection<String> columnNames) {
        if (columnNames == null) {
            this.columnNames = null;
            return;
        }

        this.columnNames = new java.util.ArrayList<String>(columnNames);
    }

    /**
     * <p>
     * An array of column names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnNames(java.util.Collection)} or {@link #withColumnNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnNames
     *        An array of column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnLevelPermissionRule withColumnNames(String... columnNames) {
        if (this.columnNames == null) {
            setColumnNames(new java.util.ArrayList<String>(columnNames.length));
        }
        for (String ele : columnNames) {
            this.columnNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of column names.
     * </p>
     * 
     * @param columnNames
     *        An array of column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnLevelPermissionRule withColumnNames(java.util.Collection<String> columnNames) {
        setColumnNames(columnNames);
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
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getColumnNames() != null)
            sb.append("ColumnNames: ").append(getColumnNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnLevelPermissionRule == false)
            return false;
        ColumnLevelPermissionRule other = (ColumnLevelPermissionRule) obj;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getColumnNames() == null ^ this.getColumnNames() == null)
            return false;
        if (other.getColumnNames() != null && other.getColumnNames().equals(this.getColumnNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getColumnNames() == null) ? 0 : getColumnNames().hashCode());
        return hashCode;
    }

    @Override
    public ColumnLevelPermissionRule clone() {
        try {
            return (ColumnLevelPermissionRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnLevelPermissionRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
