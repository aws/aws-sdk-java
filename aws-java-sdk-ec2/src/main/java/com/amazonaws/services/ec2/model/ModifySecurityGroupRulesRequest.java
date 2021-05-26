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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifySecurityGroupRulesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySecurityGroupRulesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifySecurityGroupRulesRequest> {

    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * Information about the security group properties to update.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupRuleUpdate> securityGroupRules;

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @return The ID of the security group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySecurityGroupRulesRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * Information about the security group properties to update.
     * </p>
     * 
     * @return Information about the security group properties to update.
     */

    public java.util.List<SecurityGroupRuleUpdate> getSecurityGroupRules() {
        if (securityGroupRules == null) {
            securityGroupRules = new com.amazonaws.internal.SdkInternalList<SecurityGroupRuleUpdate>();
        }
        return securityGroupRules;
    }

    /**
     * <p>
     * Information about the security group properties to update.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about the security group properties to update.
     */

    public void setSecurityGroupRules(java.util.Collection<SecurityGroupRuleUpdate> securityGroupRules) {
        if (securityGroupRules == null) {
            this.securityGroupRules = null;
            return;
        }

        this.securityGroupRules = new com.amazonaws.internal.SdkInternalList<SecurityGroupRuleUpdate>(securityGroupRules);
    }

    /**
     * <p>
     * Information about the security group properties to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupRules(java.util.Collection)} or {@link #withSecurityGroupRules(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about the security group properties to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySecurityGroupRulesRequest withSecurityGroupRules(SecurityGroupRuleUpdate... securityGroupRules) {
        if (this.securityGroupRules == null) {
            setSecurityGroupRules(new com.amazonaws.internal.SdkInternalList<SecurityGroupRuleUpdate>(securityGroupRules.length));
        }
        for (SecurityGroupRuleUpdate ele : securityGroupRules) {
            this.securityGroupRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the security group properties to update.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about the security group properties to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySecurityGroupRulesRequest withSecurityGroupRules(java.util.Collection<SecurityGroupRuleUpdate> securityGroupRules) {
        setSecurityGroupRules(securityGroupRules);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifySecurityGroupRulesRequest> getDryRunRequest() {
        Request<ModifySecurityGroupRulesRequest> request = new ModifySecurityGroupRulesRequestMarshaller().marshall(this);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getSecurityGroupRules() != null)
            sb.append("SecurityGroupRules: ").append(getSecurityGroupRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySecurityGroupRulesRequest == false)
            return false;
        ModifySecurityGroupRulesRequest other = (ModifySecurityGroupRulesRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getSecurityGroupRules() == null ^ this.getSecurityGroupRules() == null)
            return false;
        if (other.getSecurityGroupRules() != null && other.getSecurityGroupRules().equals(this.getSecurityGroupRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupRules() == null) ? 0 : getSecurityGroupRules().hashCode());
        return hashCode;
    }

    @Override
    public ModifySecurityGroupRulesRequest clone() {
        return (ModifySecurityGroupRulesRequest) super.clone();
    }
}
