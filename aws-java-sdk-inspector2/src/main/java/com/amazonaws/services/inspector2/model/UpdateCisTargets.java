/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updates CIS targets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateCisTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCisTargets implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target account ids.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The target resource tags.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> targetResourceTags;

    /**
     * <p>
     * The target account ids.
     * </p>
     * 
     * @return The target account ids.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The target account ids.
     * </p>
     * 
     * @param accountIds
     *        The target account ids.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The target account ids.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The target account ids.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisTargets withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target account ids.
     * </p>
     * 
     * @param accountIds
     *        The target account ids.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisTargets withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The target resource tags.
     * </p>
     * 
     * @return The target resource tags.
     */

    public java.util.Map<String, java.util.List<String>> getTargetResourceTags() {
        return targetResourceTags;
    }

    /**
     * <p>
     * The target resource tags.
     * </p>
     * 
     * @param targetResourceTags
     *        The target resource tags.
     */

    public void setTargetResourceTags(java.util.Map<String, java.util.List<String>> targetResourceTags) {
        this.targetResourceTags = targetResourceTags;
    }

    /**
     * <p>
     * The target resource tags.
     * </p>
     * 
     * @param targetResourceTags
     *        The target resource tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisTargets withTargetResourceTags(java.util.Map<String, java.util.List<String>> targetResourceTags) {
        setTargetResourceTags(targetResourceTags);
        return this;
    }

    /**
     * Add a single TargetResourceTags entry
     *
     * @see UpdateCisTargets#withTargetResourceTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisTargets addTargetResourceTagsEntry(String key, java.util.List<String> value) {
        if (null == this.targetResourceTags) {
            this.targetResourceTags = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.targetResourceTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.targetResourceTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TargetResourceTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCisTargets clearTargetResourceTagsEntries() {
        this.targetResourceTags = null;
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getTargetResourceTags() != null)
            sb.append("TargetResourceTags: ").append(getTargetResourceTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCisTargets == false)
            return false;
        UpdateCisTargets other = (UpdateCisTargets) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getTargetResourceTags() == null ^ this.getTargetResourceTags() == null)
            return false;
        if (other.getTargetResourceTags() != null && other.getTargetResourceTags().equals(this.getTargetResourceTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceTags() == null) ? 0 : getTargetResourceTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCisTargets clone() {
        try {
            return (UpdateCisTargets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.UpdateCisTargetsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
