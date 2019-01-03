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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the results of a successful call to the <a>DescribeDBSnapshotAttributes</a> API action.
 * </p>
 * <p>
 * Manual DB snapshot attributes are used to authorize other AWS accounts to copy or restore a manual DB snapshot. For
 * more information, see the <a>ModifyDBSnapshotAttribute</a> API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBSnapshotAttributesResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBSnapshotAttributesResult implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the manual DB snapshot that the attributes apply to.
     * </p>
     */
    private String dBSnapshotIdentifier;
    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBSnapshotAttribute> dBSnapshotAttributes;

    /**
     * <p>
     * The identifier of the manual DB snapshot that the attributes apply to.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier of the manual DB snapshot that the attributes apply to.
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the manual DB snapshot that the attributes apply to.
     * </p>
     * 
     * @return The identifier of the manual DB snapshot that the attributes apply to.
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the manual DB snapshot that the attributes apply to.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier of the manual DB snapshot that the attributes apply to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotAttributesResult withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     * 
     * @return The list of attributes and values for the manual DB snapshot.
     */

    public java.util.List<DBSnapshotAttribute> getDBSnapshotAttributes() {
        if (dBSnapshotAttributes == null) {
            dBSnapshotAttributes = new com.amazonaws.internal.SdkInternalList<DBSnapshotAttribute>();
        }
        return dBSnapshotAttributes;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     * 
     * @param dBSnapshotAttributes
     *        The list of attributes and values for the manual DB snapshot.
     */

    public void setDBSnapshotAttributes(java.util.Collection<DBSnapshotAttribute> dBSnapshotAttributes) {
        if (dBSnapshotAttributes == null) {
            this.dBSnapshotAttributes = null;
            return;
        }

        this.dBSnapshotAttributes = new com.amazonaws.internal.SdkInternalList<DBSnapshotAttribute>(dBSnapshotAttributes);
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSnapshotAttributes(java.util.Collection)} or {@link #withDBSnapshotAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dBSnapshotAttributes
     *        The list of attributes and values for the manual DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotAttributesResult withDBSnapshotAttributes(DBSnapshotAttribute... dBSnapshotAttributes) {
        if (this.dBSnapshotAttributes == null) {
            setDBSnapshotAttributes(new com.amazonaws.internal.SdkInternalList<DBSnapshotAttribute>(dBSnapshotAttributes.length));
        }
        for (DBSnapshotAttribute ele : dBSnapshotAttributes) {
            this.dBSnapshotAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     * 
     * @param dBSnapshotAttributes
     *        The list of attributes and values for the manual DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotAttributesResult withDBSnapshotAttributes(java.util.Collection<DBSnapshotAttribute> dBSnapshotAttributes) {
        setDBSnapshotAttributes(dBSnapshotAttributes);
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: ").append(getDBSnapshotIdentifier()).append(",");
        if (getDBSnapshotAttributes() != null)
            sb.append("DBSnapshotAttributes: ").append(getDBSnapshotAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSnapshotAttributesResult == false)
            return false;
        DBSnapshotAttributesResult other = (DBSnapshotAttributesResult) obj;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getDBSnapshotAttributes() == null ^ this.getDBSnapshotAttributes() == null)
            return false;
        if (other.getDBSnapshotAttributes() != null && other.getDBSnapshotAttributes().equals(this.getDBSnapshotAttributes()) == false)
            return false;
        return true;
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
    public DBSnapshotAttributesResult clone() {
        try {
            return (DBSnapshotAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
