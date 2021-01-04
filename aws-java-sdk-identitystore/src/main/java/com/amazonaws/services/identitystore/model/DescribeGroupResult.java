/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Contains the group’s display name value. The length limit is 1024 characters. This value can consist of letters,
     * accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non breaking space
     * in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the group is
     * created and stored as an attribute of the group object in the identity store.
     * </p>
     */
    private String displayName;

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
     * Contains the group’s display name value. The length limit is 1024 characters. This value can consist of letters,
     * accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non breaking space
     * in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the group is
     * created and stored as an attribute of the group object in the identity store.
     * </p>
     * 
     * @param displayName
     *        Contains the group’s display name value. The length limit is 1024 characters. This value can consist of
     *        letters, accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non
     *        breaking space in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at
     *        the time the group is created and stored as an attribute of the group object in the identity store.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Contains the group’s display name value. The length limit is 1024 characters. This value can consist of letters,
     * accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non breaking space
     * in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the group is
     * created and stored as an attribute of the group object in the identity store.
     * </p>
     * 
     * @return Contains the group’s display name value. The length limit is 1024 characters. This value can consist of
     *         letters, accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and
     *         non breaking space in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified
     *         at the time the group is created and stored as an attribute of the group object in the identity store.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * Contains the group’s display name value. The length limit is 1024 characters. This value can consist of letters,
     * accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non breaking space
     * in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at the time the group is
     * created and stored as an attribute of the group object in the identity store.
     * </p>
     * 
     * @param displayName
     *        Contains the group’s display name value. The length limit is 1024 characters. This value can consist of
     *        letters, accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space and non
     *        breaking space in this attribute. The characters “&lt;&gt;;:%” are excluded. This value is specified at
     *        the time the group is created and stored as an attribute of the group object in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGroupResult withDisplayName(String displayName) {
        setDisplayName(displayName);
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
            sb.append("DisplayName: ").append(getDisplayName());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
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
