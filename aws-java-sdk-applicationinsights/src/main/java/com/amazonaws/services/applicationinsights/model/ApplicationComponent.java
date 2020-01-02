/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a standalone resource or similarly grouped resources that the application is made up of.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ApplicationComponent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationComponent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application
     * ELB, and SQS Queue.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The stack tier of the application component.
     * </p>
     */
    private String tier;
    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     */
    private Boolean monitor;

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponent withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application
     * ELB, and SQS Queue.
     * </p>
     * 
     * @param resourceType
     *        The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB,
     *        Application ELB, and SQS Queue.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application
     * ELB, and SQS Queue.
     * </p>
     * 
     * @return The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB,
     *         Application ELB, and SQS Queue.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application
     * ELB, and SQS Queue.
     * </p>
     * 
     * @param resourceType
     *        The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB,
     *        Application ELB, and SQS Queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponent withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The stack tier of the application component.
     * </p>
     * 
     * @param tier
     *        The stack tier of the application component.
     * @see Tier
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The stack tier of the application component.
     * </p>
     * 
     * @return The stack tier of the application component.
     * @see Tier
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The stack tier of the application component.
     * </p>
     * 
     * @param tier
     *        The stack tier of the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public ApplicationComponent withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The stack tier of the application component.
     * </p>
     * 
     * @param tier
     *        The stack tier of the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public ApplicationComponent withTier(Tier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     * 
     * @param monitor
     *        Indicates whether the application component is monitored.
     */

    public void setMonitor(Boolean monitor) {
        this.monitor = monitor;
    }

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     * 
     * @return Indicates whether the application component is monitored.
     */

    public Boolean getMonitor() {
        return this.monitor;
    }

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     * 
     * @param monitor
     *        Indicates whether the application component is monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponent withMonitor(Boolean monitor) {
        setMonitor(monitor);
        return this;
    }

    /**
     * <p>
     * Indicates whether the application component is monitored.
     * </p>
     * 
     * @return Indicates whether the application component is monitored.
     */

    public Boolean isMonitor() {
        return this.monitor;
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getMonitor() != null)
            sb.append("Monitor: ").append(getMonitor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationComponent == false)
            return false;
        ApplicationComponent other = (ApplicationComponent) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getMonitor() == null ^ this.getMonitor() == null)
            return false;
        if (other.getMonitor() != null && other.getMonitor().equals(this.getMonitor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getMonitor() == null) ? 0 : getMonitor().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationComponent clone() {
        try {
            return (ApplicationComponent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.ApplicationComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
