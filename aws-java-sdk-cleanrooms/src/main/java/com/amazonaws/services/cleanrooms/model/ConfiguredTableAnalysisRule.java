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
 * A configured table analysis rule, which limits how data for this table can be used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredTableAnalysisRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTableAnalysisRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the configured table.
     * </p>
     */
    private String configuredTableId;
    /**
     * <p>
     * The unique ARN for the configured table.
     * </p>
     */
    private String configuredTableArn;
    /**
     * <p>
     * The policy that controls SQL query rules.
     * </p>
     */
    private ConfiguredTableAnalysisRulePolicy policy;
    /**
     * <p>
     * The type of configured table analysis rule.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The time the configured table analysis rule was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the configured table analysis rule was last updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The unique ID for the configured table.
     * </p>
     * 
     * @param configuredTableId
     *        The unique ID for the configured table.
     */

    public void setConfiguredTableId(String configuredTableId) {
        this.configuredTableId = configuredTableId;
    }

    /**
     * <p>
     * The unique ID for the configured table.
     * </p>
     * 
     * @return The unique ID for the configured table.
     */

    public String getConfiguredTableId() {
        return this.configuredTableId;
    }

    /**
     * <p>
     * The unique ID for the configured table.
     * </p>
     * 
     * @param configuredTableId
     *        The unique ID for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAnalysisRule withConfiguredTableId(String configuredTableId) {
        setConfiguredTableId(configuredTableId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the configured table.
     * </p>
     * 
     * @param configuredTableArn
     *        The unique ARN for the configured table.
     */

    public void setConfiguredTableArn(String configuredTableArn) {
        this.configuredTableArn = configuredTableArn;
    }

    /**
     * <p>
     * The unique ARN for the configured table.
     * </p>
     * 
     * @return The unique ARN for the configured table.
     */

    public String getConfiguredTableArn() {
        return this.configuredTableArn;
    }

    /**
     * <p>
     * The unique ARN for the configured table.
     * </p>
     * 
     * @param configuredTableArn
     *        The unique ARN for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAnalysisRule withConfiguredTableArn(String configuredTableArn) {
        setConfiguredTableArn(configuredTableArn);
        return this;
    }

    /**
     * <p>
     * The policy that controls SQL query rules.
     * </p>
     * 
     * @param policy
     *        The policy that controls SQL query rules.
     */

    public void setPolicy(ConfiguredTableAnalysisRulePolicy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy that controls SQL query rules.
     * </p>
     * 
     * @return The policy that controls SQL query rules.
     */

    public ConfiguredTableAnalysisRulePolicy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy that controls SQL query rules.
     * </p>
     * 
     * @param policy
     *        The policy that controls SQL query rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAnalysisRule withPolicy(ConfiguredTableAnalysisRulePolicy policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The type of configured table analysis rule.
     * </p>
     * 
     * @param type
     *        The type of configured table analysis rule.
     * @see ConfiguredTableAnalysisRuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of configured table analysis rule.
     * </p>
     * 
     * @return The type of configured table analysis rule.
     * @see ConfiguredTableAnalysisRuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of configured table analysis rule.
     * </p>
     * 
     * @param type
     *        The type of configured table analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public ConfiguredTableAnalysisRule withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of configured table analysis rule.
     * </p>
     * 
     * @param type
     *        The type of configured table analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public ConfiguredTableAnalysisRule withType(ConfiguredTableAnalysisRuleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time the configured table analysis rule was created.
     * </p>
     * 
     * @param createTime
     *        The time the configured table analysis rule was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the configured table analysis rule was created.
     * </p>
     * 
     * @return The time the configured table analysis rule was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the configured table analysis rule was created.
     * </p>
     * 
     * @param createTime
     *        The time the configured table analysis rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAnalysisRule withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the configured table analysis rule was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the configured table analysis rule was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the configured table analysis rule was last updated.
     * </p>
     * 
     * @return The time the configured table analysis rule was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the configured table analysis rule was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the configured table analysis rule was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAnalysisRule withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getConfiguredTableId() != null)
            sb.append("ConfiguredTableId: ").append(getConfiguredTableId()).append(",");
        if (getConfiguredTableArn() != null)
            sb.append("ConfiguredTableArn: ").append(getConfiguredTableArn()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredTableAnalysisRule == false)
            return false;
        ConfiguredTableAnalysisRule other = (ConfiguredTableAnalysisRule) obj;
        if (other.getConfiguredTableId() == null ^ this.getConfiguredTableId() == null)
            return false;
        if (other.getConfiguredTableId() != null && other.getConfiguredTableId().equals(this.getConfiguredTableId()) == false)
            return false;
        if (other.getConfiguredTableArn() == null ^ this.getConfiguredTableArn() == null)
            return false;
        if (other.getConfiguredTableArn() != null && other.getConfiguredTableArn().equals(this.getConfiguredTableArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredTableId() == null) ? 0 : getConfiguredTableId().hashCode());
        hashCode = prime * hashCode + ((getConfiguredTableArn() == null) ? 0 : getConfiguredTableArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredTableAnalysisRule clone() {
        try {
            return (ConfiguredTableAnalysisRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredTableAnalysisRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
