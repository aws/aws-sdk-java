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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a successful rule update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RuleUpdateSuccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleUpdateSuccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action for the rule.
     * </p>
     */
    private RuleAction action;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the listener.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Indicates whether this is the default rule.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The rule match.
     * </p>
     */
    private RuleMatch match;
    /**
     * <p>
     * The name of the listener.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The rule priority.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The action for the rule.
     * </p>
     * 
     * @param action
     *        The action for the rule.
     */

    public void setAction(RuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action for the rule.
     * </p>
     * 
     * @return The action for the rule.
     */

    public RuleAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action for the rule.
     * </p>
     * 
     * @param action
     *        The action for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdateSuccess withAction(RuleAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the listener.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdateSuccess withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the listener.
     * </p>
     * 
     * @param id
     *        The ID of the listener.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the listener.
     * </p>
     * 
     * @return The ID of the listener.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the listener.
     * </p>
     * 
     * @param id
     *        The ID of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdateSuccess withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default rule.
     * </p>
     * 
     * @param isDefault
     *        Indicates whether this is the default rule.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Indicates whether this is the default rule.
     * </p>
     * 
     * @return Indicates whether this is the default rule.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Indicates whether this is the default rule.
     * </p>
     * 
     * @param isDefault
     *        Indicates whether this is the default rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdateSuccess withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default rule.
     * </p>
     * 
     * @return Indicates whether this is the default rule.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @param match
     *        The rule match.
     */

    public void setMatch(RuleMatch match) {
        this.match = match;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @return The rule match.
     */

    public RuleMatch getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @param match
     *        The rule match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdateSuccess withMatch(RuleMatch match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * The name of the listener.
     * </p>
     * 
     * @param name
     *        The name of the listener.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the listener.
     * </p>
     * 
     * @return The name of the listener.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the listener.
     * </p>
     * 
     * @param name
     *        The name of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdateSuccess withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The rule priority.
     * </p>
     * 
     * @param priority
     *        The rule priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The rule priority.
     * </p>
     * 
     * @return The rule priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The rule priority.
     * </p>
     * 
     * @param priority
     *        The rule priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdateSuccess withPriority(Integer priority) {
        setPriority(priority);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleUpdateSuccess == false)
            return false;
        RuleUpdateSuccess other = (RuleUpdateSuccess) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public RuleUpdateSuccess clone() {
        try {
            return (RuleUpdateSuccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.RuleUpdateSuccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
