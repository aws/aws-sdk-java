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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the results of a successful call to the <a>DescribeDBClusterSnapshotAttributes</a> API action.
 * </p>
 * <p>
 * Manual DB cluster snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB cluster
 * snapshot. For more information, see the <a>ModifyDBClusterSnapshotAttribute</a> API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DBClusterSnapshotAttributesResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterSnapshotAttributesResult implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the manual DB cluster snapshot that the attributes apply to.
     * </p>
     */
    private String dBClusterSnapshotIdentifier;
    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     */
    private java.util.List<DBClusterSnapshotAttribute> dBClusterSnapshotAttributes;

    /**
     * <p>
     * The identifier of the manual DB cluster snapshot that the attributes apply to.
     * </p>
     * 
     * @param dBClusterSnapshotIdentifier
     *        The identifier of the manual DB cluster snapshot that the attributes apply to.
     */

    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the manual DB cluster snapshot that the attributes apply to.
     * </p>
     * 
     * @return The identifier of the manual DB cluster snapshot that the attributes apply to.
     */

    public String getDBClusterSnapshotIdentifier() {
        return this.dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the manual DB cluster snapshot that the attributes apply to.
     * </p>
     * 
     * @param dBClusterSnapshotIdentifier
     *        The identifier of the manual DB cluster snapshot that the attributes apply to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshotAttributesResult withDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        setDBClusterSnapshotIdentifier(dBClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     * 
     * @return The list of attributes and values for the manual DB cluster snapshot.
     */

    public java.util.List<DBClusterSnapshotAttribute> getDBClusterSnapshotAttributes() {
        return dBClusterSnapshotAttributes;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     * 
     * @param dBClusterSnapshotAttributes
     *        The list of attributes and values for the manual DB cluster snapshot.
     */

    public void setDBClusterSnapshotAttributes(java.util.Collection<DBClusterSnapshotAttribute> dBClusterSnapshotAttributes) {
        if (dBClusterSnapshotAttributes == null) {
            this.dBClusterSnapshotAttributes = null;
            return;
        }

        this.dBClusterSnapshotAttributes = new java.util.ArrayList<DBClusterSnapshotAttribute>(dBClusterSnapshotAttributes);
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterSnapshotAttributes(java.util.Collection)} or
     * {@link #withDBClusterSnapshotAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBClusterSnapshotAttributes
     *        The list of attributes and values for the manual DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshotAttributesResult withDBClusterSnapshotAttributes(DBClusterSnapshotAttribute... dBClusterSnapshotAttributes) {
        if (this.dBClusterSnapshotAttributes == null) {
            setDBClusterSnapshotAttributes(new java.util.ArrayList<DBClusterSnapshotAttribute>(dBClusterSnapshotAttributes.length));
        }
        for (DBClusterSnapshotAttribute ele : dBClusterSnapshotAttributes) {
            this.dBClusterSnapshotAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     * 
     * @param dBClusterSnapshotAttributes
     *        The list of attributes and values for the manual DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshotAttributesResult withDBClusterSnapshotAttributes(java.util.Collection<DBClusterSnapshotAttribute> dBClusterSnapshotAttributes) {
        setDBClusterSnapshotAttributes(dBClusterSnapshotAttributes);
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
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: ").append(getDBClusterSnapshotIdentifier()).append(",");
        if (getDBClusterSnapshotAttributes() != null)
            sb.append("DBClusterSnapshotAttributes: ").append(getDBClusterSnapshotAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterSnapshotAttributesResult == false)
            return false;
        DBClusterSnapshotAttributesResult other = (DBClusterSnapshotAttributesResult) obj;
        if (other.getDBClusterSnapshotIdentifier() == null ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null && other.getDBClusterSnapshotIdentifier().equals(this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getDBClusterSnapshotAttributes() == null ^ this.getDBClusterSnapshotAttributes() == null)
            return false;
        if (other.getDBClusterSnapshotAttributes() != null && other.getDBClusterSnapshotAttributes().equals(this.getDBClusterSnapshotAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterSnapshotIdentifier() == null) ? 0 : getDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterSnapshotAttributes() == null) ? 0 : getDBClusterSnapshotAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterSnapshotAttributesResult clone() {
        try {
            return (DBClusterSnapshotAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
