/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/BatchPutPropertyValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutPropertyValuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace that contains the properties to set.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * An object that maps strings to the property value entries to set. Each string in the mapping must be unique to
     * this object.
     * </p>
     */
    private java.util.List<PropertyValueEntry> entries;

    /**
     * <p>
     * The ID of the workspace that contains the properties to set.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the properties to set.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the properties to set.
     * </p>
     * 
     * @return The ID of the workspace that contains the properties to set.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the properties to set.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the properties to set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutPropertyValuesRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * An object that maps strings to the property value entries to set. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @return An object that maps strings to the property value entries to set. Each string in the mapping must be
     *         unique to this object.
     */

    public java.util.List<PropertyValueEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * An object that maps strings to the property value entries to set. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @param entries
     *        An object that maps strings to the property value entries to set. Each string in the mapping must be
     *        unique to this object.
     */

    public void setEntries(java.util.Collection<PropertyValueEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<PropertyValueEntry>(entries);
    }

    /**
     * <p>
     * An object that maps strings to the property value entries to set. Each string in the mapping must be unique to
     * this object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        An object that maps strings to the property value entries to set. Each string in the mapping must be
     *        unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutPropertyValuesRequest withEntries(PropertyValueEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<PropertyValueEntry>(entries.length));
        }
        for (PropertyValueEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that maps strings to the property value entries to set. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @param entries
     *        An object that maps strings to the property value entries to set. Each string in the mapping must be
     *        unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutPropertyValuesRequest withEntries(java.util.Collection<PropertyValueEntry> entries) {
        setEntries(entries);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutPropertyValuesRequest == false)
            return false;
        BatchPutPropertyValuesRequest other = (BatchPutPropertyValuesRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutPropertyValuesRequest clone() {
        return (BatchPutPropertyValuesRequest) super.clone();
    }

}
