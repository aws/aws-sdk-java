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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details that define an aggregation based on Amazon EC2 instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Ec2InstanceAggregation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2InstanceAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     * </p>
     */
    private java.util.List<StringFilter> amis;
    /**
     * <p>
     * The Amazon EC2 instance IDs to aggregate findings for.
     * </p>
     */
    private java.util.List<StringFilter> instanceIds;
    /**
     * <p>
     * The Amazon EC2 instance tags to aggregate findings for.
     * </p>
     */
    private java.util.List<MapFilter> instanceTags;
    /**
     * <p>
     * The operating system types to aggregate findings for. Valid values must be uppercase and underscore separated,
     * examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     * </p>
     */
    private java.util.List<StringFilter> operatingSystems;
    /**
     * <p>
     * The value to sort results by.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The order to sort results by.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     * </p>
     * 
     * @return The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     */

    public java.util.List<StringFilter> getAmis() {
        return amis;
    }

    /**
     * <p>
     * The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     * </p>
     * 
     * @param amis
     *        The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     */

    public void setAmis(java.util.Collection<StringFilter> amis) {
        if (amis == null) {
            this.amis = null;
            return;
        }

        this.amis = new java.util.ArrayList<StringFilter>(amis);
    }

    /**
     * <p>
     * The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAmis(java.util.Collection)} or {@link #withAmis(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param amis
     *        The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregation withAmis(StringFilter... amis) {
        if (this.amis == null) {
            setAmis(new java.util.ArrayList<StringFilter>(amis.length));
        }
        for (StringFilter ele : amis) {
            this.amis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     * </p>
     * 
     * @param amis
     *        The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregation withAmis(java.util.Collection<StringFilter> amis) {
        setAmis(amis);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance IDs to aggregate findings for.
     * </p>
     * 
     * @return The Amazon EC2 instance IDs to aggregate findings for.
     */

    public java.util.List<StringFilter> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * The Amazon EC2 instance IDs to aggregate findings for.
     * </p>
     * 
     * @param instanceIds
     *        The Amazon EC2 instance IDs to aggregate findings for.
     */

    public void setInstanceIds(java.util.Collection<StringFilter> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<StringFilter>(instanceIds);
    }

    /**
     * <p>
     * The Amazon EC2 instance IDs to aggregate findings for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The Amazon EC2 instance IDs to aggregate findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregation withInstanceIds(StringFilter... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new java.util.ArrayList<StringFilter>(instanceIds.length));
        }
        for (StringFilter ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance IDs to aggregate findings for.
     * </p>
     * 
     * @param instanceIds
     *        The Amazon EC2 instance IDs to aggregate findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregation withInstanceIds(java.util.Collection<StringFilter> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance tags to aggregate findings for.
     * </p>
     * 
     * @return The Amazon EC2 instance tags to aggregate findings for.
     */

    public java.util.List<MapFilter> getInstanceTags() {
        return instanceTags;
    }

    /**
     * <p>
     * The Amazon EC2 instance tags to aggregate findings for.
     * </p>
     * 
     * @param instanceTags
     *        The Amazon EC2 instance tags to aggregate findings for.
     */

    public void setInstanceTags(java.util.Collection<MapFilter> instanceTags) {
        if (instanceTags == null) {
            this.instanceTags = null;
            return;
        }

        this.instanceTags = new java.util.ArrayList<MapFilter>(instanceTags);
    }

    /**
     * <p>
     * The Amazon EC2 instance tags to aggregate findings for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTags(java.util.Collection)} or {@link #withInstanceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceTags
     *        The Amazon EC2 instance tags to aggregate findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregation withInstanceTags(MapFilter... instanceTags) {
        if (this.instanceTags == null) {
            setInstanceTags(new java.util.ArrayList<MapFilter>(instanceTags.length));
        }
        for (MapFilter ele : instanceTags) {
            this.instanceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance tags to aggregate findings for.
     * </p>
     * 
     * @param instanceTags
     *        The Amazon EC2 instance tags to aggregate findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregation withInstanceTags(java.util.Collection<MapFilter> instanceTags) {
        setInstanceTags(instanceTags);
        return this;
    }

    /**
     * <p>
     * The operating system types to aggregate findings for. Valid values must be uppercase and underscore separated,
     * examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     * </p>
     * 
     * @return The operating system types to aggregate findings for. Valid values must be uppercase and underscore
     *         separated, examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     */

    public java.util.List<StringFilter> getOperatingSystems() {
        return operatingSystems;
    }

    /**
     * <p>
     * The operating system types to aggregate findings for. Valid values must be uppercase and underscore separated,
     * examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     * </p>
     * 
     * @param operatingSystems
     *        The operating system types to aggregate findings for. Valid values must be uppercase and underscore
     *        separated, examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     */

    public void setOperatingSystems(java.util.Collection<StringFilter> operatingSystems) {
        if (operatingSystems == null) {
            this.operatingSystems = null;
            return;
        }

        this.operatingSystems = new java.util.ArrayList<StringFilter>(operatingSystems);
    }

    /**
     * <p>
     * The operating system types to aggregate findings for. Valid values must be uppercase and underscore separated,
     * examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingSystems(java.util.Collection)} or {@link #withOperatingSystems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operatingSystems
     *        The operating system types to aggregate findings for. Valid values must be uppercase and underscore
     *        separated, examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregation withOperatingSystems(StringFilter... operatingSystems) {
        if (this.operatingSystems == null) {
            setOperatingSystems(new java.util.ArrayList<StringFilter>(operatingSystems.length));
        }
        for (StringFilter ele : operatingSystems) {
            this.operatingSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operating system types to aggregate findings for. Valid values must be uppercase and underscore separated,
     * examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     * </p>
     * 
     * @param operatingSystems
     *        The operating system types to aggregate findings for. Valid values must be uppercase and underscore
     *        separated, examples are <code>ORACLE_LINUX_7</code> and <code>ALPINE_LINUX_3_8</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAggregation withOperatingSystems(java.util.Collection<StringFilter> operatingSystems) {
        setOperatingSystems(operatingSystems);
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @see Ec2InstanceSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @return The value to sort results by.
     * @see Ec2InstanceSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2InstanceSortBy
     */

    public Ec2InstanceAggregation withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2InstanceSortBy
     */

    public Ec2InstanceAggregation withSortBy(Ec2InstanceSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @return The order to sort results by.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public Ec2InstanceAggregation withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public Ec2InstanceAggregation withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getAmis() != null)
            sb.append("Amis: ").append(getAmis()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getInstanceTags() != null)
            sb.append("InstanceTags: ").append(getInstanceTags()).append(",");
        if (getOperatingSystems() != null)
            sb.append("OperatingSystems: ").append(getOperatingSystems()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2InstanceAggregation == false)
            return false;
        Ec2InstanceAggregation other = (Ec2InstanceAggregation) obj;
        if (other.getAmis() == null ^ this.getAmis() == null)
            return false;
        if (other.getAmis() != null && other.getAmis().equals(this.getAmis()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getInstanceTags() == null ^ this.getInstanceTags() == null)
            return false;
        if (other.getInstanceTags() != null && other.getInstanceTags().equals(this.getInstanceTags()) == false)
            return false;
        if (other.getOperatingSystems() == null ^ this.getOperatingSystems() == null)
            return false;
        if (other.getOperatingSystems() != null && other.getOperatingSystems().equals(this.getOperatingSystems()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmis() == null) ? 0 : getAmis().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getInstanceTags() == null) ? 0 : getInstanceTags().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystems() == null) ? 0 : getOperatingSystems().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public Ec2InstanceAggregation clone() {
        try {
            return (Ec2InstanceAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.Ec2InstanceAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
