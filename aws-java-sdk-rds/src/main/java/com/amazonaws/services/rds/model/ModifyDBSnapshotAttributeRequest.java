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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshotAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBSnapshotAttributeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the DB snapshot to modify the attributes for.
     * </p>
     */
    private String dBSnapshotIdentifier;
    /**
     * <p>
     * The name of the DB snapshot attribute to modify.
     * </p>
     * <p>
     * To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to
     * <code>restore</code>.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS
     * account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> valuesToAdd;
    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to include one
     * or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS account to copy or
     * restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual DB snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> valuesToRemove;

    /**
     * <p>
     * The identifier for the DB snapshot to modify the attributes for.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier for the DB snapshot to modify the attributes for.
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot to modify the attributes for.
     * </p>
     * 
     * @return The identifier for the DB snapshot to modify the attributes for.
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot to modify the attributes for.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier for the DB snapshot to modify the attributes for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotAttributeRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the DB snapshot attribute to modify.
     * </p>
     * <p>
     * To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to
     * <code>restore</code>.
     * </p>
     * 
     * @param attributeName
     *        The name of the DB snapshot attribute to modify.</p>
     *        <p>
     *        To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to
     *        <code>restore</code>.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the DB snapshot attribute to modify.
     * </p>
     * <p>
     * To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to
     * <code>restore</code>.
     * </p>
     * 
     * @return The name of the DB snapshot attribute to modify.</p>
     *         <p>
     *         To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to
     *         <code>restore</code>.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the DB snapshot attribute to modify.
     * </p>
     * <p>
     * To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to
     * <code>restore</code>.
     * </p>
     * 
     * @param attributeName
     *        The name of the DB snapshot attribute to modify.</p>
     *        <p>
     *        To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to
     *        <code>restore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotAttributeRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS
     * account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts.
     * </p>
     * 
     * @return A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.</p>
     *         <p>
     *         To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or
     *         more AWS account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account.
     *         Do not add the <code>all</code> value for any manual DB snapshots that contain private information that
     *         you don't want available to all AWS accounts.
     */

    public java.util.List<String> getValuesToAdd() {
        if (valuesToAdd == null) {
            valuesToAdd = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return valuesToAdd;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS
     * account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts.
     * </p>
     * 
     * @param valuesToAdd
     *        A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.</p>
     *        <p>
     *        To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more
     *        AWS account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account. Do not
     *        add the <code>all</code> value for any manual DB snapshots that contain private information that you don't
     *        want available to all AWS accounts.
     */

    public void setValuesToAdd(java.util.Collection<String> valuesToAdd) {
        if (valuesToAdd == null) {
            this.valuesToAdd = null;
            return;
        }

        this.valuesToAdd = new com.amazonaws.internal.SdkInternalList<String>(valuesToAdd);
    }

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS
     * account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValuesToAdd(java.util.Collection)} or {@link #withValuesToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param valuesToAdd
     *        A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.</p>
     *        <p>
     *        To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more
     *        AWS account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account. Do not
     *        add the <code>all</code> value for any manual DB snapshots that contain private information that you don't
     *        want available to all AWS accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotAttributeRequest withValuesToAdd(String... valuesToAdd) {
        if (this.valuesToAdd == null) {
            setValuesToAdd(new com.amazonaws.internal.SdkInternalList<String>(valuesToAdd.length));
        }
        for (String ele : valuesToAdd) {
            this.valuesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS
     * account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts.
     * </p>
     * 
     * @param valuesToAdd
     *        A list of DB snapshot attributes to add to the attribute specified by <code>AttributeName</code>.</p>
     *        <p>
     *        To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more
     *        AWS account IDs, or <code>all</code> to make the manual DB snapshot restorable by any AWS account. Do not
     *        add the <code>all</code> value for any manual DB snapshots that contain private information that you don't
     *        want available to all AWS accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotAttributeRequest withValuesToAdd(java.util.Collection<String> valuesToAdd) {
        setValuesToAdd(valuesToAdd);
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to include one
     * or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS account to copy or
     * restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual DB snapshot.
     * </p>
     * 
     * @return A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>
     *         .</p>
     *         <p>
     *         To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to
     *         include one or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS
     *         account to copy or restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account
     *         ID is explicitly added to the <code>restore</code> attribute can still copy or restore the manual DB
     *         snapshot.
     */

    public java.util.List<String> getValuesToRemove() {
        if (valuesToRemove == null) {
            valuesToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return valuesToRemove;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to include one
     * or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS account to copy or
     * restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual DB snapshot.
     * </p>
     * 
     * @param valuesToRemove
     *        A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>.</p>
     *        <p>
     *        To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to
     *        include one or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS
     *        account to copy or restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account
     *        ID is explicitly added to the <code>restore</code> attribute can still copy or restore the manual DB
     *        snapshot.
     */

    public void setValuesToRemove(java.util.Collection<String> valuesToRemove) {
        if (valuesToRemove == null) {
            this.valuesToRemove = null;
            return;
        }

        this.valuesToRemove = new com.amazonaws.internal.SdkInternalList<String>(valuesToRemove);
    }

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to include one
     * or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS account to copy or
     * restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual DB snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValuesToRemove(java.util.Collection)} or {@link #withValuesToRemove(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param valuesToRemove
     *        A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>.</p>
     *        <p>
     *        To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to
     *        include one or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS
     *        account to copy or restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account
     *        ID is explicitly added to the <code>restore</code> attribute can still copy or restore the manual DB
     *        snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotAttributeRequest withValuesToRemove(String... valuesToRemove) {
        if (this.valuesToRemove == null) {
            setValuesToRemove(new com.amazonaws.internal.SdkInternalList<String>(valuesToRemove.length));
        }
        for (String ele : valuesToRemove) {
            this.valuesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to include one
     * or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS account to copy or
     * restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual DB snapshot.
     * </p>
     * 
     * @param valuesToRemove
     *        A list of DB snapshot attributes to remove from the attribute specified by <code>AttributeName</code>.</p>
     *        <p>
     *        To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to
     *        include one or more AWS account identifiers, or <code>all</code> to remove authorization for any AWS
     *        account to copy or restore the DB snapshot. If you specify <code>all</code>, an AWS account whose account
     *        ID is explicitly added to the <code>restore</code> attribute can still copy or restore the manual DB
     *        snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotAttributeRequest withValuesToRemove(java.util.Collection<String> valuesToRemove) {
        setValuesToRemove(valuesToRemove);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getValuesToAdd() != null)
            sb.append("ValuesToAdd: ").append(getValuesToAdd()).append(",");
        if (getValuesToRemove() != null)
            sb.append("ValuesToRemove: ").append(getValuesToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBSnapshotAttributeRequest == false)
            return false;
        ModifyDBSnapshotAttributeRequest other = (ModifyDBSnapshotAttributeRequest) obj;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getValuesToAdd() == null ^ this.getValuesToAdd() == null)
            return false;
        if (other.getValuesToAdd() != null && other.getValuesToAdd().equals(this.getValuesToAdd()) == false)
            return false;
        if (other.getValuesToRemove() == null ^ this.getValuesToRemove() == null)
            return false;
        if (other.getValuesToRemove() != null && other.getValuesToRemove().equals(this.getValuesToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getValuesToAdd() == null) ? 0 : getValuesToAdd().hashCode());
        hashCode = prime * hashCode + ((getValuesToRemove() == null) ? 0 : getValuesToRemove().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBSnapshotAttributeRequest clone() {
        return (ModifyDBSnapshotAttributeRequest) super.clone();
    }

}
