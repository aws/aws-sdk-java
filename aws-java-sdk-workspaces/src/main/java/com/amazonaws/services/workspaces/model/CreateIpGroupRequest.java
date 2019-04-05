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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateIpGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The description of the group.
     * </p>
     */
    private String groupDesc;
    /**
     * <p>
     * The rules to add to the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpRuleItem> userRules;
    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param groupName
     *        The name of the group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param groupName
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The description of the group.
     * </p>
     * 
     * @param groupDesc
     *        The description of the group.
     */

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    /**
     * <p>
     * The description of the group.
     * </p>
     * 
     * @return The description of the group.
     */

    public String getGroupDesc() {
        return this.groupDesc;
    }

    /**
     * <p>
     * The description of the group.
     * </p>
     * 
     * @param groupDesc
     *        The description of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpGroupRequest withGroupDesc(String groupDesc) {
        setGroupDesc(groupDesc);
        return this;
    }

    /**
     * <p>
     * The rules to add to the group.
     * </p>
     * 
     * @return The rules to add to the group.
     */

    public java.util.List<IpRuleItem> getUserRules() {
        if (userRules == null) {
            userRules = new com.amazonaws.internal.SdkInternalList<IpRuleItem>();
        }
        return userRules;
    }

    /**
     * <p>
     * The rules to add to the group.
     * </p>
     * 
     * @param userRules
     *        The rules to add to the group.
     */

    public void setUserRules(java.util.Collection<IpRuleItem> userRules) {
        if (userRules == null) {
            this.userRules = null;
            return;
        }

        this.userRules = new com.amazonaws.internal.SdkInternalList<IpRuleItem>(userRules);
    }

    /**
     * <p>
     * The rules to add to the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserRules(java.util.Collection)} or {@link #withUserRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userRules
     *        The rules to add to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpGroupRequest withUserRules(IpRuleItem... userRules) {
        if (this.userRules == null) {
            setUserRules(new com.amazonaws.internal.SdkInternalList<IpRuleItem>(userRules.length));
        }
        for (IpRuleItem ele : userRules) {
            this.userRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules to add to the group.
     * </p>
     * 
     * @param userRules
     *        The rules to add to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpGroupRequest withUserRules(java.util.Collection<IpRuleItem> userRules) {
        setUserRules(userRules);
        return this;
    }

    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     * 
     * @return The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     * 
     * @param tags
     *        The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * </p>
     * 
     * @param tags
     *        The tags. Each WorkSpaces resource can have a maximum of 50 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroupDesc() != null)
            sb.append("GroupDesc: ").append(getGroupDesc()).append(",");
        if (getUserRules() != null)
            sb.append("UserRules: ").append(getUserRules()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIpGroupRequest == false)
            return false;
        CreateIpGroupRequest other = (CreateIpGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupDesc() == null ^ this.getGroupDesc() == null)
            return false;
        if (other.getGroupDesc() != null && other.getGroupDesc().equals(this.getGroupDesc()) == false)
            return false;
        if (other.getUserRules() == null ^ this.getUserRules() == null)
            return false;
        if (other.getUserRules() != null && other.getUserRules().equals(this.getUserRules()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupDesc() == null) ? 0 : getGroupDesc().hashCode());
        hashCode = prime * hashCode + ((getUserRules() == null) ? 0 : getUserRules().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateIpGroupRequest clone() {
        return (CreateIpGroupRequest) super.clone();
    }

}
