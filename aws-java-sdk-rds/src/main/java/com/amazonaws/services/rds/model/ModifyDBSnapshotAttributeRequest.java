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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyDBSnapshotAttribute(ModifyDBSnapshotAttributeRequest) ModifyDBSnapshotAttribute operation}.
 * <p>
 * Adds an attribute and values to, or removes an attribute and values
 * from a manual DB snapshot.
 * </p>
 * <p>
 * To share a manual DB snapshot with other AWS accounts, specify
 * <code>restore</code> as the <code>AttributeName</code> and use the
 * <code>ValuesToAdd</code> parameter to add a list of the AWS account
 * ids that are authorized to restore the manual DB snapshot. Uses the
 * value <code>all</code> to make the manual DB snapshot public and can
 * by copied or restored by all AWS accounts. Do not add the
 * <code>all</code> value for any manual DB snapshots that contain
 * private information that you do not want to be available to all AWS
 * accounts.
 * </p>
 * <p>
 * To view which AWS accounts have access to copy or restore a manual DB
 * snapshot, or whether a manual DB snapshot public or private, use the
 * DescribeDBSnapshotAttributes API.
 * </p>
 * <p>
 * If the manual DB snapshot is encrypted, it cannot be shared.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyDBSnapshotAttribute(ModifyDBSnapshotAttributeRequest)
 */
public class ModifyDBSnapshotAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier for the DB snapshot to modify the attributes for.
     */
    private String dBSnapshotIdentifier;

    /**
     * The name of the DB snapshot attribute to modify. <p>To manage
     * authorization for other AWS accounts to copy or restore a manual DB
     * snapshot, this value is <code>restore</code>.
     */
    private String attributeName;

    /**
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     * or restore a manual snapshot, this is one or more AWS account
     * identifiers, or <code>all</code> to make the manual DB snapshot
     * restorable by any AWS account. Do not add the <code>all</code> value
     * for any manual DB snapshots that contain private information that you
     * do not want to be available to all AWS accounts.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesToAdd;

    /**
     * A list of DB snapshot attributes to remove from the attribute
     * specified by <code>AttributeName</code>. <p>To remove authorization
     * for other AWS Accounts to copy or restore a manual snapshot, this is
     * one or more AWS account identifiers, or <code>all</code> to remove
     * authorization for any AWS account to copy or restore the DB snapshot.
     * If you specify <code>all</code>, AWS accounts that have their account
     * identifier explicitly added to the <code>restore</code> attribute can
     * still copy or restore the manual DB snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesToRemove;

    /**
     * The identifier for the DB snapshot to modify the attributes for.
     *
     * @return The identifier for the DB snapshot to modify the attributes for.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB snapshot to modify the attributes for.
     *
     * @param dBSnapshotIdentifier The identifier for the DB snapshot to modify the attributes for.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB snapshot to modify the attributes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier The identifier for the DB snapshot to modify the attributes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBSnapshotAttributeRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * The name of the DB snapshot attribute to modify. <p>To manage
     * authorization for other AWS accounts to copy or restore a manual DB
     * snapshot, this value is <code>restore</code>.
     *
     * @return The name of the DB snapshot attribute to modify. <p>To manage
     *         authorization for other AWS accounts to copy or restore a manual DB
     *         snapshot, this value is <code>restore</code>.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * The name of the DB snapshot attribute to modify. <p>To manage
     * authorization for other AWS accounts to copy or restore a manual DB
     * snapshot, this value is <code>restore</code>.
     *
     * @param attributeName The name of the DB snapshot attribute to modify. <p>To manage
     *         authorization for other AWS accounts to copy or restore a manual DB
     *         snapshot, this value is <code>restore</code>.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * The name of the DB snapshot attribute to modify. <p>To manage
     * authorization for other AWS accounts to copy or restore a manual DB
     * snapshot, this value is <code>restore</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeName The name of the DB snapshot attribute to modify. <p>To manage
     *         authorization for other AWS accounts to copy or restore a manual DB
     *         snapshot, this value is <code>restore</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBSnapshotAttributeRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     * or restore a manual snapshot, this is one or more AWS account
     * identifiers, or <code>all</code> to make the manual DB snapshot
     * restorable by any AWS account. Do not add the <code>all</code> value
     * for any manual DB snapshots that contain private information that you
     * do not want to be available to all AWS accounts.
     *
     * @return A list of DB snapshot attributes to add to the attribute specified by
     *         <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     *         or restore a manual snapshot, this is one or more AWS account
     *         identifiers, or <code>all</code> to make the manual DB snapshot
     *         restorable by any AWS account. Do not add the <code>all</code> value
     *         for any manual DB snapshots that contain private information that you
     *         do not want to be available to all AWS accounts.
     */
    public java.util.List<String> getValuesToAdd() {
        if (valuesToAdd == null) {
              valuesToAdd = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              valuesToAdd.setAutoConstruct(true);
        }
        return valuesToAdd;
    }
    
    /**
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     * or restore a manual snapshot, this is one or more AWS account
     * identifiers, or <code>all</code> to make the manual DB snapshot
     * restorable by any AWS account. Do not add the <code>all</code> value
     * for any manual DB snapshots that contain private information that you
     * do not want to be available to all AWS accounts.
     *
     * @param valuesToAdd A list of DB snapshot attributes to add to the attribute specified by
     *         <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     *         or restore a manual snapshot, this is one or more AWS account
     *         identifiers, or <code>all</code> to make the manual DB snapshot
     *         restorable by any AWS account. Do not add the <code>all</code> value
     *         for any manual DB snapshots that contain private information that you
     *         do not want to be available to all AWS accounts.
     */
    public void setValuesToAdd(java.util.Collection<String> valuesToAdd) {
        if (valuesToAdd == null) {
            this.valuesToAdd = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesToAddCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(valuesToAdd.size());
        valuesToAddCopy.addAll(valuesToAdd);
        this.valuesToAdd = valuesToAddCopy;
    }
    
    /**
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     * or restore a manual snapshot, this is one or more AWS account
     * identifiers, or <code>all</code> to make the manual DB snapshot
     * restorable by any AWS account. Do not add the <code>all</code> value
     * for any manual DB snapshots that contain private information that you
     * do not want to be available to all AWS accounts.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setValuesToAdd(java.util.Collection)} or {@link
     * #withValuesToAdd(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param valuesToAdd A list of DB snapshot attributes to add to the attribute specified by
     *         <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     *         or restore a manual snapshot, this is one or more AWS account
     *         identifiers, or <code>all</code> to make the manual DB snapshot
     *         restorable by any AWS account. Do not add the <code>all</code> value
     *         for any manual DB snapshots that contain private information that you
     *         do not want to be available to all AWS accounts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBSnapshotAttributeRequest withValuesToAdd(String... valuesToAdd) {
        if (getValuesToAdd() == null) setValuesToAdd(new java.util.ArrayList<String>(valuesToAdd.length));
        for (String value : valuesToAdd) {
            getValuesToAdd().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     * or restore a manual snapshot, this is one or more AWS account
     * identifiers, or <code>all</code> to make the manual DB snapshot
     * restorable by any AWS account. Do not add the <code>all</code> value
     * for any manual DB snapshots that contain private information that you
     * do not want to be available to all AWS accounts.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param valuesToAdd A list of DB snapshot attributes to add to the attribute specified by
     *         <code>AttributeName</code>. <p>To authorize other AWS Accounts to copy
     *         or restore a manual snapshot, this is one or more AWS account
     *         identifiers, or <code>all</code> to make the manual DB snapshot
     *         restorable by any AWS account. Do not add the <code>all</code> value
     *         for any manual DB snapshots that contain private information that you
     *         do not want to be available to all AWS accounts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBSnapshotAttributeRequest withValuesToAdd(java.util.Collection<String> valuesToAdd) {
        if (valuesToAdd == null) {
            this.valuesToAdd = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesToAddCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(valuesToAdd.size());
            valuesToAddCopy.addAll(valuesToAdd);
            this.valuesToAdd = valuesToAddCopy;
        }

        return this;
    }

    /**
     * A list of DB snapshot attributes to remove from the attribute
     * specified by <code>AttributeName</code>. <p>To remove authorization
     * for other AWS Accounts to copy or restore a manual snapshot, this is
     * one or more AWS account identifiers, or <code>all</code> to remove
     * authorization for any AWS account to copy or restore the DB snapshot.
     * If you specify <code>all</code>, AWS accounts that have their account
     * identifier explicitly added to the <code>restore</code> attribute can
     * still copy or restore the manual DB snapshot.
     *
     * @return A list of DB snapshot attributes to remove from the attribute
     *         specified by <code>AttributeName</code>. <p>To remove authorization
     *         for other AWS Accounts to copy or restore a manual snapshot, this is
     *         one or more AWS account identifiers, or <code>all</code> to remove
     *         authorization for any AWS account to copy or restore the DB snapshot.
     *         If you specify <code>all</code>, AWS accounts that have their account
     *         identifier explicitly added to the <code>restore</code> attribute can
     *         still copy or restore the manual DB snapshot.
     */
    public java.util.List<String> getValuesToRemove() {
        if (valuesToRemove == null) {
              valuesToRemove = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              valuesToRemove.setAutoConstruct(true);
        }
        return valuesToRemove;
    }
    
    /**
     * A list of DB snapshot attributes to remove from the attribute
     * specified by <code>AttributeName</code>. <p>To remove authorization
     * for other AWS Accounts to copy or restore a manual snapshot, this is
     * one or more AWS account identifiers, or <code>all</code> to remove
     * authorization for any AWS account to copy or restore the DB snapshot.
     * If you specify <code>all</code>, AWS accounts that have their account
     * identifier explicitly added to the <code>restore</code> attribute can
     * still copy or restore the manual DB snapshot.
     *
     * @param valuesToRemove A list of DB snapshot attributes to remove from the attribute
     *         specified by <code>AttributeName</code>. <p>To remove authorization
     *         for other AWS Accounts to copy or restore a manual snapshot, this is
     *         one or more AWS account identifiers, or <code>all</code> to remove
     *         authorization for any AWS account to copy or restore the DB snapshot.
     *         If you specify <code>all</code>, AWS accounts that have their account
     *         identifier explicitly added to the <code>restore</code> attribute can
     *         still copy or restore the manual DB snapshot.
     */
    public void setValuesToRemove(java.util.Collection<String> valuesToRemove) {
        if (valuesToRemove == null) {
            this.valuesToRemove = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(valuesToRemove.size());
        valuesToRemoveCopy.addAll(valuesToRemove);
        this.valuesToRemove = valuesToRemoveCopy;
    }
    
    /**
     * A list of DB snapshot attributes to remove from the attribute
     * specified by <code>AttributeName</code>. <p>To remove authorization
     * for other AWS Accounts to copy or restore a manual snapshot, this is
     * one or more AWS account identifiers, or <code>all</code> to remove
     * authorization for any AWS account to copy or restore the DB snapshot.
     * If you specify <code>all</code>, AWS accounts that have their account
     * identifier explicitly added to the <code>restore</code> attribute can
     * still copy or restore the manual DB snapshot.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setValuesToRemove(java.util.Collection)} or {@link
     * #withValuesToRemove(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param valuesToRemove A list of DB snapshot attributes to remove from the attribute
     *         specified by <code>AttributeName</code>. <p>To remove authorization
     *         for other AWS Accounts to copy or restore a manual snapshot, this is
     *         one or more AWS account identifiers, or <code>all</code> to remove
     *         authorization for any AWS account to copy or restore the DB snapshot.
     *         If you specify <code>all</code>, AWS accounts that have their account
     *         identifier explicitly added to the <code>restore</code> attribute can
     *         still copy or restore the manual DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBSnapshotAttributeRequest withValuesToRemove(String... valuesToRemove) {
        if (getValuesToRemove() == null) setValuesToRemove(new java.util.ArrayList<String>(valuesToRemove.length));
        for (String value : valuesToRemove) {
            getValuesToRemove().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB snapshot attributes to remove from the attribute
     * specified by <code>AttributeName</code>. <p>To remove authorization
     * for other AWS Accounts to copy or restore a manual snapshot, this is
     * one or more AWS account identifiers, or <code>all</code> to remove
     * authorization for any AWS account to copy or restore the DB snapshot.
     * If you specify <code>all</code>, AWS accounts that have their account
     * identifier explicitly added to the <code>restore</code> attribute can
     * still copy or restore the manual DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param valuesToRemove A list of DB snapshot attributes to remove from the attribute
     *         specified by <code>AttributeName</code>. <p>To remove authorization
     *         for other AWS Accounts to copy or restore a manual snapshot, this is
     *         one or more AWS account identifiers, or <code>all</code> to remove
     *         authorization for any AWS account to copy or restore the DB snapshot.
     *         If you specify <code>all</code>, AWS accounts that have their account
     *         identifier explicitly added to the <code>restore</code> attribute can
     *         still copy or restore the manual DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBSnapshotAttributeRequest withValuesToRemove(java.util.Collection<String> valuesToRemove) {
        if (valuesToRemove == null) {
            this.valuesToRemove = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(valuesToRemove.size());
            valuesToRemoveCopy.addAll(valuesToRemove);
            this.valuesToRemove = valuesToRemoveCopy;
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
        if (getAttributeName() != null) sb.append("AttributeName: " + getAttributeName() + ",");
        if (getValuesToAdd() != null) sb.append("ValuesToAdd: " + getValuesToAdd() + ",");
        if (getValuesToRemove() != null) sb.append("ValuesToRemove: " + getValuesToRemove() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyDBSnapshotAttributeRequest == false) return false;
        ModifyDBSnapshotAttributeRequest other = (ModifyDBSnapshotAttributeRequest)obj;
        
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null) return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false) return false; 
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getValuesToAdd() == null ^ this.getValuesToAdd() == null) return false;
        if (other.getValuesToAdd() != null && other.getValuesToAdd().equals(this.getValuesToAdd()) == false) return false; 
        if (other.getValuesToRemove() == null ^ this.getValuesToRemove() == null) return false;
        if (other.getValuesToRemove() != null && other.getValuesToRemove().equals(this.getValuesToRemove()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyDBSnapshotAttributeRequest clone() {
        
            return (ModifyDBSnapshotAttributeRequest) super.clone();
    }

}
    