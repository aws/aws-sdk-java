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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AuthorizeIpRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeIpRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The rules to add to the group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpRuleItem> userRules;

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * 
     * @return The identifier of the group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeIpRulesRequest withGroupId(String groupId) {
        setGroupId(groupId);
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

    public AuthorizeIpRulesRequest withUserRules(IpRuleItem... userRules) {
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

    public AuthorizeIpRulesRequest withUserRules(java.util.Collection<IpRuleItem> userRules) {
        setUserRules(userRules);
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
        if (getUserRules() != null)
            sb.append("UserRules: ").append(getUserRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeIpRulesRequest == false)
            return false;
        AuthorizeIpRulesRequest other = (AuthorizeIpRulesRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getUserRules() == null ^ this.getUserRules() == null)
            return false;
        if (other.getUserRules() != null && other.getUserRules().equals(this.getUserRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getUserRules() == null) ? 0 : getUserRules().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeIpRulesRequest clone() {
        return (AuthorizeIpRulesRequest) super.clone();
    }

}
