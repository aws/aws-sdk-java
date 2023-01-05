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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The group’s display name value. The length limit is 1,024 characters. This value can consist of letters, accented
     * characters, symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in this
     * attribute. This value is specified at the time that the group is created and stored as an attribute of the group
     * object in the identity store.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     */
    private java.util.List<ExternalId> externalIds;
    /**
     * <p>
     * A string containing a description of the group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     */
    private String identityStoreId;

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @param groupId
     *        The identifier for a group in the identity store.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @return The identifier for a group in the identity store.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier for a group in the identity store.
     * </p>
     * 
     * @param groupId
     *        The identifier for a group in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The group’s display name value. The length limit is 1,024 characters. This value can consist of letters, accented
     * characters, symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in this
     * attribute. This value is specified at the time that the group is created and stored as an attribute of the group
     * object in the identity store.
     * </p>
     * 
     * @param displayName
     *        The group’s display name value. The length limit is 1,024 characters. This value can consist of letters,
     *        accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking
     *        space in this attribute. This value is specified at the time that the group is created and stored as an
     *        attribute of the group object in the identity store.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The group’s display name value. The length limit is 1,024 characters. This value can consist of letters, accented
     * characters, symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in this
     * attribute. This value is specified at the time that the group is created and stored as an attribute of the group
     * object in the identity store.
     * </p>
     * 
     * @return The group’s display name value. The length limit is 1,024 characters. This value can consist of letters,
     *         accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space, and
     *         nonbreaking space in this attribute. This value is specified at the time that the group is created and
     *         stored as an attribute of the group object in the identity store.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The group’s display name value. The length limit is 1,024 characters. This value can consist of letters, accented
     * characters, symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in this
     * attribute. This value is specified at the time that the group is created and stored as an attribute of the group
     * object in the identity store.
     * </p>
     * 
     * @param displayName
     *        The group’s display name value. The length limit is 1,024 characters. This value can consist of letters,
     *        accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking
     *        space in this attribute. This value is specified at the time that the group is created and stored as an
     *        attribute of the group object in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     * 
     * @return A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an
     *         external identity provider.
     */

    public java.util.List<ExternalId> getExternalIds() {
        return externalIds;
    }

    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     * 
     * @param externalIds
     *        A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an
     *        external identity provider.
     */

    public void setExternalIds(java.util.Collection<ExternalId> externalIds) {
        if (externalIds == null) {
            this.externalIds = null;
            return;
        }

        this.externalIds = new java.util.ArrayList<ExternalId>(externalIds);
    }

    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalIds(java.util.Collection)} or {@link #withExternalIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param externalIds
     *        A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an
     *        external identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withExternalIds(ExternalId... externalIds) {
        if (this.externalIds == null) {
            setExternalIds(new java.util.ArrayList<ExternalId>(externalIds.length));
        }
        for (ExternalId ele : externalIds) {
            this.externalIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an external
     * identity provider.
     * </p>
     * 
     * @param externalIds
     *        A list of <code>ExternalId</code> objects that contains the identifiers issued to this resource by an
     *        external identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withExternalIds(java.util.Collection<ExternalId> externalIds) {
        setExternalIds(externalIds);
        return this;
    }

    /**
     * <p>
     * A string containing a description of the group.
     * </p>
     * 
     * @param description
     *        A string containing a description of the group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string containing a description of the group.
     * </p>
     * 
     * @return A string containing a description of the group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A string containing a description of the group.
     * </p>
     * 
     * @param description
     *        A string containing a description of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @return The globally unique identifier for the identity store.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The globally unique identifier for the identity store.
     * </p>
     * 
     * @param identityStoreId
     *        The globally unique identifier for the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getExternalIds() != null)
            sb.append("ExternalIds: ").append(getExternalIds()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGroupResult == false)
            return false;
        DescribeGroupResult other = (DescribeGroupResult) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getExternalIds() == null ^ this.getExternalIds() == null)
            return false;
        if (other.getExternalIds() != null && other.getExternalIds().equals(this.getExternalIds()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getExternalIds() == null) ? 0 : getExternalIds().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGroupResult clone() {
        try {
            return (DescribeGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
