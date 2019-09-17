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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/CreateLedger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLedgerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger that you want to create. The name must be unique among all of your ledgers in the current
     * AWS Region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values
     * are case sensitive and can be null.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     */
    private String permissionsMode;
    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API
     * or the AWS Command Line Interface (AWS CLI). You can disable it by calling the <code>UpdateLedger</code>
     * operation to set the flag to <code>false</code>. The QLDB console disables deletion protection for you when you
     * use it to delete a ledger.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The name of the ledger that you want to create. The name must be unique among all of your ledgers in the current
     * AWS Region.
     * </p>
     * 
     * @param name
     *        The name of the ledger that you want to create. The name must be unique among all of your ledgers in the
     *        current AWS Region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger that you want to create. The name must be unique among all of your ledgers in the current
     * AWS Region.
     * </p>
     * 
     * @return The name of the ledger that you want to create. The name must be unique among all of your ledgers in the
     *         current AWS Region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ledger that you want to create. The name must be unique among all of your ledgers in the current
     * AWS Region.
     * </p>
     * 
     * @param name
     *        The name of the ledger that you want to create. The name must be unique among all of your ledgers in the
     *        current AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values
     * are case sensitive and can be null.
     * </p>
     * 
     * @return The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive.
     *         Tag values are case sensitive and can be null.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values
     * are case sensitive and can be null.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag
     *        values are case sensitive and can be null.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values
     * are case sensitive and can be null.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag
     *        values are case sensitive and can be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateLedgerRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * 
     * @param permissionsMode
     *        The permissions mode to assign to the ledger that you want to create.
     * @see PermissionsMode
     */

    public void setPermissionsMode(String permissionsMode) {
        this.permissionsMode = permissionsMode;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * 
     * @return The permissions mode to assign to the ledger that you want to create.
     * @see PermissionsMode
     */

    public String getPermissionsMode() {
        return this.permissionsMode;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * 
     * @param permissionsMode
     *        The permissions mode to assign to the ledger that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsMode
     */

    public CreateLedgerRequest withPermissionsMode(String permissionsMode) {
        setPermissionsMode(permissionsMode);
        return this;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * 
     * @param permissionsMode
     *        The permissions mode to assign to the ledger that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsMode
     */

    public CreateLedgerRequest withPermissionsMode(PermissionsMode permissionsMode) {
        this.permissionsMode = permissionsMode.toString();
        return this;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API
     * or the AWS Command Line Interface (AWS CLI). You can disable it by calling the <code>UpdateLedger</code>
     * operation to set the flag to <code>false</code>. The QLDB console disables deletion protection for you when you
     * use it to delete a ledger.
     * </p>
     * 
     * @param deletionProtection
     *        The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this
     *        feature is enabled (<code>true</code>) by default.</p>
     *        <p>
     *        If deletion protection is enabled, you must first disable it before you can delete the ledger using the
     *        QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the
     *        <code>UpdateLedger</code> operation to set the flag to <code>false</code>. The QLDB console disables
     *        deletion protection for you when you use it to delete a ledger.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API
     * or the AWS Command Line Interface (AWS CLI). You can disable it by calling the <code>UpdateLedger</code>
     * operation to set the flag to <code>false</code>. The QLDB console disables deletion protection for you when you
     * use it to delete a ledger.
     * </p>
     * 
     * @return The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this
     *         feature is enabled (<code>true</code>) by default.</p>
     *         <p>
     *         If deletion protection is enabled, you must first disable it before you can delete the ledger using the
     *         QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the
     *         <code>UpdateLedger</code> operation to set the flag to <code>false</code>. The QLDB console disables
     *         deletion protection for you when you use it to delete a ledger.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API
     * or the AWS Command Line Interface (AWS CLI). You can disable it by calling the <code>UpdateLedger</code>
     * operation to set the flag to <code>false</code>. The QLDB console disables deletion protection for you when you
     * use it to delete a ledger.
     * </p>
     * 
     * @param deletionProtection
     *        The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this
     *        feature is enabled (<code>true</code>) by default.</p>
     *        <p>
     *        If deletion protection is enabled, you must first disable it before you can delete the ledger using the
     *        QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the
     *        <code>UpdateLedger</code> operation to set the flag to <code>false</code>. The QLDB console disables
     *        deletion protection for you when you use it to delete a ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API
     * or the AWS Command Line Interface (AWS CLI). You can disable it by calling the <code>UpdateLedger</code>
     * operation to set the flag to <code>false</code>. The QLDB console disables deletion protection for you when you
     * use it to delete a ledger.
     * </p>
     * 
     * @return The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this
     *         feature is enabled (<code>true</code>) by default.</p>
     *         <p>
     *         If deletion protection is enabled, you must first disable it before you can delete the ledger using the
     *         QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the
     *         <code>UpdateLedger</code> operation to set the flag to <code>false</code>. The QLDB console disables
     *         deletion protection for you when you use it to delete a ledger.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPermissionsMode() != null)
            sb.append("PermissionsMode: ").append(getPermissionsMode()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLedgerRequest == false)
            return false;
        CreateLedgerRequest other = (CreateLedgerRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPermissionsMode() == null ^ this.getPermissionsMode() == null)
            return false;
        if (other.getPermissionsMode() != null && other.getPermissionsMode().equals(this.getPermissionsMode()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPermissionsMode() == null) ? 0 : getPermissionsMode().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        return hashCode;
    }

    @Override
    public CreateLedgerRequest clone() {
        return (CreateLedgerRequest) super.clone();
    }

}
