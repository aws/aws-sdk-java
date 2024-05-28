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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A specification about how data from the configured table can be used in a query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the associated collaboration.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The type of analysis rule.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name for the analysis rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time the analysis rule was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the analysis rule was last updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * A policy that describes the associated data usage limitations.
     * </p>
     */
    private AnalysisRulePolicy policy;

    /**
     * <p>
     * The unique ID for the associated collaboration.
     * </p>
     * 
     * @param collaborationId
     *        The unique ID for the associated collaboration.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The unique ID for the associated collaboration.
     * </p>
     * 
     * @return The unique ID for the associated collaboration.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The unique ID for the associated collaboration.
     * </p>
     * 
     * @param collaborationId
     *        The unique ID for the associated collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRule withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The type of analysis rule.
     * </p>
     * 
     * @param type
     *        The type of analysis rule.
     * @see AnalysisRuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of analysis rule.
     * </p>
     * 
     * @return The type of analysis rule.
     * @see AnalysisRuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of analysis rule.
     * </p>
     * 
     * @param type
     *        The type of analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public AnalysisRule withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of analysis rule.
     * </p>
     * 
     * @param type
     *        The type of analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public AnalysisRule withType(AnalysisRuleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name for the analysis rule.
     * </p>
     * 
     * @param name
     *        The name for the analysis rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the analysis rule.
     * </p>
     * 
     * @return The name for the analysis rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the analysis rule.
     * </p>
     * 
     * @param name
     *        The name for the analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time the analysis rule was created.
     * </p>
     * 
     * @param createTime
     *        The time the analysis rule was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the analysis rule was created.
     * </p>
     * 
     * @return The time the analysis rule was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the analysis rule was created.
     * </p>
     * 
     * @param createTime
     *        The time the analysis rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRule withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the analysis rule was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the analysis rule was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the analysis rule was last updated.
     * </p>
     * 
     * @return The time the analysis rule was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the analysis rule was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the analysis rule was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRule withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * A policy that describes the associated data usage limitations.
     * </p>
     * 
     * @param policy
     *        A policy that describes the associated data usage limitations.
     */

    public void setPolicy(AnalysisRulePolicy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A policy that describes the associated data usage limitations.
     * </p>
     * 
     * @return A policy that describes the associated data usage limitations.
     */

    public AnalysisRulePolicy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A policy that describes the associated data usage limitations.
     * </p>
     * 
     * @param policy
     *        A policy that describes the associated data usage limitations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRule withPolicy(AnalysisRulePolicy policy) {
        setPolicy(policy);
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
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisRule == false)
            return false;
        AnalysisRule other = (AnalysisRule) obj;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisRule clone() {
        try {
            return (AnalysisRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
