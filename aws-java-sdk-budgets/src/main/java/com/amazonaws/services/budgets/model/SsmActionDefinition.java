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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS Systems Manager (SSM) action definition details.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SsmActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action subType.
     * </p>
     */
    private String actionSubType;
    /**
     * <p>
     * The Region to run the SSM document.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The EC2 and RDS instance IDs.
     * </p>
     */
    private java.util.List<String> instanceIds;

    /**
     * <p>
     * The action subType.
     * </p>
     * 
     * @param actionSubType
     *        The action subType.
     * @see ActionSubType
     */

    public void setActionSubType(String actionSubType) {
        this.actionSubType = actionSubType;
    }

    /**
     * <p>
     * The action subType.
     * </p>
     * 
     * @return The action subType.
     * @see ActionSubType
     */

    public String getActionSubType() {
        return this.actionSubType;
    }

    /**
     * <p>
     * The action subType.
     * </p>
     * 
     * @param actionSubType
     *        The action subType.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionSubType
     */

    public SsmActionDefinition withActionSubType(String actionSubType) {
        setActionSubType(actionSubType);
        return this;
    }

    /**
     * <p>
     * The action subType.
     * </p>
     * 
     * @param actionSubType
     *        The action subType.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionSubType
     */

    public SsmActionDefinition withActionSubType(ActionSubType actionSubType) {
        this.actionSubType = actionSubType.toString();
        return this;
    }

    /**
     * <p>
     * The Region to run the SSM document.
     * </p>
     * 
     * @param region
     *        The Region to run the SSM document.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region to run the SSM document.
     * </p>
     * 
     * @return The Region to run the SSM document.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region to run the SSM document.
     * </p>
     * 
     * @param region
     *        The Region to run the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmActionDefinition withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The EC2 and RDS instance IDs.
     * </p>
     * 
     * @return The EC2 and RDS instance IDs.
     */

    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * The EC2 and RDS instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        The EC2 and RDS instance IDs.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<String>(instanceIds);
    }

    /**
     * <p>
     * The EC2 and RDS instance IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The EC2 and RDS instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmActionDefinition withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 and RDS instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        The EC2 and RDS instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmActionDefinition withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
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
        if (getActionSubType() != null)
            sb.append("ActionSubType: ").append(getActionSubType()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SsmActionDefinition == false)
            return false;
        SsmActionDefinition other = (SsmActionDefinition) obj;
        if (other.getActionSubType() == null ^ this.getActionSubType() == null)
            return false;
        if (other.getActionSubType() != null && other.getActionSubType().equals(this.getActionSubType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionSubType() == null) ? 0 : getActionSubType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        return hashCode;
    }

    @Override
    public SsmActionDefinition clone() {
        try {
            return (SsmActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.SsmActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
