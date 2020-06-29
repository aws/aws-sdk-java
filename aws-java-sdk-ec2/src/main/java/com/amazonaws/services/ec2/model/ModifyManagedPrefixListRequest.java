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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyManagedPrefixListRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyManagedPrefixListRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyManagedPrefixListRequest> {

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The current version of the prefix list.
     * </p>
     */
    private Long currentVersion;
    /**
     * <p>
     * A name for the prefix list.
     * </p>
     */
    private String prefixListName;
    /**
     * <p>
     * One or more entries to add to the prefix list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AddPrefixListEntry> addEntries;
    /**
     * <p>
     * One or more entries to remove from the prefix list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemovePrefixListEntry> removeEntries;

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @return The ID of the prefix list.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyManagedPrefixListRequest withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The current version of the prefix list.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the prefix list.
     */

    public void setCurrentVersion(Long currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the prefix list.
     * </p>
     * 
     * @return The current version of the prefix list.
     */

    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the prefix list.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyManagedPrefixListRequest withCurrentVersion(Long currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * A name for the prefix list.
     * </p>
     * 
     * @param prefixListName
     *        A name for the prefix list.
     */

    public void setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
    }

    /**
     * <p>
     * A name for the prefix list.
     * </p>
     * 
     * @return A name for the prefix list.
     */

    public String getPrefixListName() {
        return this.prefixListName;
    }

    /**
     * <p>
     * A name for the prefix list.
     * </p>
     * 
     * @param prefixListName
     *        A name for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyManagedPrefixListRequest withPrefixListName(String prefixListName) {
        setPrefixListName(prefixListName);
        return this;
    }

    /**
     * <p>
     * One or more entries to add to the prefix list.
     * </p>
     * 
     * @return One or more entries to add to the prefix list.
     */

    public java.util.List<AddPrefixListEntry> getAddEntries() {
        if (addEntries == null) {
            addEntries = new com.amazonaws.internal.SdkInternalList<AddPrefixListEntry>();
        }
        return addEntries;
    }

    /**
     * <p>
     * One or more entries to add to the prefix list.
     * </p>
     * 
     * @param addEntries
     *        One or more entries to add to the prefix list.
     */

    public void setAddEntries(java.util.Collection<AddPrefixListEntry> addEntries) {
        if (addEntries == null) {
            this.addEntries = null;
            return;
        }

        this.addEntries = new com.amazonaws.internal.SdkInternalList<AddPrefixListEntry>(addEntries);
    }

    /**
     * <p>
     * One or more entries to add to the prefix list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddEntries(java.util.Collection)} or {@link #withAddEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addEntries
     *        One or more entries to add to the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyManagedPrefixListRequest withAddEntries(AddPrefixListEntry... addEntries) {
        if (this.addEntries == null) {
            setAddEntries(new com.amazonaws.internal.SdkInternalList<AddPrefixListEntry>(addEntries.length));
        }
        for (AddPrefixListEntry ele : addEntries) {
            this.addEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more entries to add to the prefix list.
     * </p>
     * 
     * @param addEntries
     *        One or more entries to add to the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyManagedPrefixListRequest withAddEntries(java.util.Collection<AddPrefixListEntry> addEntries) {
        setAddEntries(addEntries);
        return this;
    }

    /**
     * <p>
     * One or more entries to remove from the prefix list.
     * </p>
     * 
     * @return One or more entries to remove from the prefix list.
     */

    public java.util.List<RemovePrefixListEntry> getRemoveEntries() {
        if (removeEntries == null) {
            removeEntries = new com.amazonaws.internal.SdkInternalList<RemovePrefixListEntry>();
        }
        return removeEntries;
    }

    /**
     * <p>
     * One or more entries to remove from the prefix list.
     * </p>
     * 
     * @param removeEntries
     *        One or more entries to remove from the prefix list.
     */

    public void setRemoveEntries(java.util.Collection<RemovePrefixListEntry> removeEntries) {
        if (removeEntries == null) {
            this.removeEntries = null;
            return;
        }

        this.removeEntries = new com.amazonaws.internal.SdkInternalList<RemovePrefixListEntry>(removeEntries);
    }

    /**
     * <p>
     * One or more entries to remove from the prefix list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveEntries(java.util.Collection)} or {@link #withRemoveEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param removeEntries
     *        One or more entries to remove from the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyManagedPrefixListRequest withRemoveEntries(RemovePrefixListEntry... removeEntries) {
        if (this.removeEntries == null) {
            setRemoveEntries(new com.amazonaws.internal.SdkInternalList<RemovePrefixListEntry>(removeEntries.length));
        }
        for (RemovePrefixListEntry ele : removeEntries) {
            this.removeEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more entries to remove from the prefix list.
     * </p>
     * 
     * @param removeEntries
     *        One or more entries to remove from the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyManagedPrefixListRequest withRemoveEntries(java.util.Collection<RemovePrefixListEntry> removeEntries) {
        setRemoveEntries(removeEntries);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyManagedPrefixListRequest> getDryRunRequest() {
        Request<ModifyManagedPrefixListRequest> request = new ModifyManagedPrefixListRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getPrefixListName() != null)
            sb.append("PrefixListName: ").append(getPrefixListName()).append(",");
        if (getAddEntries() != null)
            sb.append("AddEntries: ").append(getAddEntries()).append(",");
        if (getRemoveEntries() != null)
            sb.append("RemoveEntries: ").append(getRemoveEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyManagedPrefixListRequest == false)
            return false;
        ModifyManagedPrefixListRequest other = (ModifyManagedPrefixListRequest) obj;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getPrefixListName() == null ^ this.getPrefixListName() == null)
            return false;
        if (other.getPrefixListName() != null && other.getPrefixListName().equals(this.getPrefixListName()) == false)
            return false;
        if (other.getAddEntries() == null ^ this.getAddEntries() == null)
            return false;
        if (other.getAddEntries() != null && other.getAddEntries().equals(this.getAddEntries()) == false)
            return false;
        if (other.getRemoveEntries() == null ^ this.getRemoveEntries() == null)
            return false;
        if (other.getRemoveEntries() != null && other.getRemoveEntries().equals(this.getRemoveEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getPrefixListName() == null) ? 0 : getPrefixListName().hashCode());
        hashCode = prime * hashCode + ((getAddEntries() == null) ? 0 : getAddEntries().hashCode());
        hashCode = prime * hashCode + ((getRemoveEntries() == null) ? 0 : getRemoveEntries().hashCode());
        return hashCode;
    }

    @Override
    public ModifyManagedPrefixListRequest clone() {
        return (ModifyManagedPrefixListRequest) super.clone();
    }
}
