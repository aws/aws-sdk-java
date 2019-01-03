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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summarizes the number of layers, instances, and apps in a stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StackSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The stack name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The stack's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The number of layers.
     * </p>
     */
    private Integer layersCount;
    /**
     * <p>
     * The number of apps.
     * </p>
     */
    private Integer appsCount;
    /**
     * <p>
     * An <code>InstancesCount</code> object with the number of instances in each status.
     * </p>
     */
    private InstancesCount instancesCount;

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @param name
     *        The stack name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @return The stack name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The stack name.
     * </p>
     * 
     * @param name
     *        The stack name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The stack's ARN.
     * </p>
     * 
     * @param arn
     *        The stack's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The stack's ARN.
     * </p>
     * 
     * @return The stack's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The stack's ARN.
     * </p>
     * 
     * @param arn
     *        The stack's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The number of layers.
     * </p>
     * 
     * @param layersCount
     *        The number of layers.
     */

    public void setLayersCount(Integer layersCount) {
        this.layersCount = layersCount;
    }

    /**
     * <p>
     * The number of layers.
     * </p>
     * 
     * @return The number of layers.
     */

    public Integer getLayersCount() {
        return this.layersCount;
    }

    /**
     * <p>
     * The number of layers.
     * </p>
     * 
     * @param layersCount
     *        The number of layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withLayersCount(Integer layersCount) {
        setLayersCount(layersCount);
        return this;
    }

    /**
     * <p>
     * The number of apps.
     * </p>
     * 
     * @param appsCount
     *        The number of apps.
     */

    public void setAppsCount(Integer appsCount) {
        this.appsCount = appsCount;
    }

    /**
     * <p>
     * The number of apps.
     * </p>
     * 
     * @return The number of apps.
     */

    public Integer getAppsCount() {
        return this.appsCount;
    }

    /**
     * <p>
     * The number of apps.
     * </p>
     * 
     * @param appsCount
     *        The number of apps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withAppsCount(Integer appsCount) {
        setAppsCount(appsCount);
        return this;
    }

    /**
     * <p>
     * An <code>InstancesCount</code> object with the number of instances in each status.
     * </p>
     * 
     * @param instancesCount
     *        An <code>InstancesCount</code> object with the number of instances in each status.
     */

    public void setInstancesCount(InstancesCount instancesCount) {
        this.instancesCount = instancesCount;
    }

    /**
     * <p>
     * An <code>InstancesCount</code> object with the number of instances in each status.
     * </p>
     * 
     * @return An <code>InstancesCount</code> object with the number of instances in each status.
     */

    public InstancesCount getInstancesCount() {
        return this.instancesCount;
    }

    /**
     * <p>
     * An <code>InstancesCount</code> object with the number of instances in each status.
     * </p>
     * 
     * @param instancesCount
     *        An <code>InstancesCount</code> object with the number of instances in each status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withInstancesCount(InstancesCount instancesCount) {
        setInstancesCount(instancesCount);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getLayersCount() != null)
            sb.append("LayersCount: ").append(getLayersCount()).append(",");
        if (getAppsCount() != null)
            sb.append("AppsCount: ").append(getAppsCount()).append(",");
        if (getInstancesCount() != null)
            sb.append("InstancesCount: ").append(getInstancesCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSummary == false)
            return false;
        StackSummary other = (StackSummary) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLayersCount() == null ^ this.getLayersCount() == null)
            return false;
        if (other.getLayersCount() != null && other.getLayersCount().equals(this.getLayersCount()) == false)
            return false;
        if (other.getAppsCount() == null ^ this.getAppsCount() == null)
            return false;
        if (other.getAppsCount() != null && other.getAppsCount().equals(this.getAppsCount()) == false)
            return false;
        if (other.getInstancesCount() == null ^ this.getInstancesCount() == null)
            return false;
        if (other.getInstancesCount() != null && other.getInstancesCount().equals(this.getInstancesCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getLayersCount() == null) ? 0 : getLayersCount().hashCode());
        hashCode = prime * hashCode + ((getAppsCount() == null) ? 0 : getAppsCount().hashCode());
        hashCode = prime * hashCode + ((getInstancesCount() == null) ? 0 : getInstancesCount().hashCode());
        return hashCode;
    }

    @Override
    public StackSummary clone() {
        try {
            return (StackSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.StackSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
