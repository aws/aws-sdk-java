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
     * If logging is supported for the resource type, indicates whether the component has configured logs to be
     * monitored.
     * </p>
     */
    private String componentRemarks;
    /**
     * <p>
     * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application
     * ELB, and SQS Queue.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The operating system of the component.
     * </p>
     */
    private String osType;
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
     * Workloads detected in the application component.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> detectedWorkload;

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
     * If logging is supported for the resource type, indicates whether the component has configured logs to be
     * monitored.
     * </p>
     * 
     * @param componentRemarks
     *        If logging is supported for the resource type, indicates whether the component has configured logs to be
     *        monitored.
     */

    public void setComponentRemarks(String componentRemarks) {
        this.componentRemarks = componentRemarks;
    }

    /**
     * <p>
     * If logging is supported for the resource type, indicates whether the component has configured logs to be
     * monitored.
     * </p>
     * 
     * @return If logging is supported for the resource type, indicates whether the component has configured logs to be
     *         monitored.
     */

    public String getComponentRemarks() {
        return this.componentRemarks;
    }

    /**
     * <p>
     * If logging is supported for the resource type, indicates whether the component has configured logs to be
     * monitored.
     * </p>
     * 
     * @param componentRemarks
     *        If logging is supported for the resource type, indicates whether the component has configured logs to be
     *        monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponent withComponentRemarks(String componentRemarks) {
        setComponentRemarks(componentRemarks);
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
     * The operating system of the component.
     * </p>
     * 
     * @param osType
     *        The operating system of the component.
     * @see OsType
     */

    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * <p>
     * The operating system of the component.
     * </p>
     * 
     * @return The operating system of the component.
     * @see OsType
     */

    public String getOsType() {
        return this.osType;
    }

    /**
     * <p>
     * The operating system of the component.
     * </p>
     * 
     * @param osType
     *        The operating system of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OsType
     */

    public ApplicationComponent withOsType(String osType) {
        setOsType(osType);
        return this;
    }

    /**
     * <p>
     * The operating system of the component.
     * </p>
     * 
     * @param osType
     *        The operating system of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OsType
     */

    public ApplicationComponent withOsType(OsType osType) {
        this.osType = osType.toString();
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
     * <p>
     * Workloads detected in the application component.
     * </p>
     * 
     * @return Workloads detected in the application component.
     */

    public java.util.Map<String, java.util.Map<String, String>> getDetectedWorkload() {
        return detectedWorkload;
    }

    /**
     * <p>
     * Workloads detected in the application component.
     * </p>
     * 
     * @param detectedWorkload
     *        Workloads detected in the application component.
     */

    public void setDetectedWorkload(java.util.Map<String, java.util.Map<String, String>> detectedWorkload) {
        this.detectedWorkload = detectedWorkload;
    }

    /**
     * <p>
     * Workloads detected in the application component.
     * </p>
     * 
     * @param detectedWorkload
     *        Workloads detected in the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponent withDetectedWorkload(java.util.Map<String, java.util.Map<String, String>> detectedWorkload) {
        setDetectedWorkload(detectedWorkload);
        return this;
    }

    /**
     * Add a single DetectedWorkload entry
     *
     * @see ApplicationComponent#withDetectedWorkload
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponent addDetectedWorkloadEntry(String key, java.util.Map<String, String> value) {
        if (null == this.detectedWorkload) {
            this.detectedWorkload = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.detectedWorkload.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.detectedWorkload.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DetectedWorkload.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponent clearDetectedWorkloadEntries() {
        this.detectedWorkload = null;
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentRemarks() != null)
            sb.append("ComponentRemarks: ").append(getComponentRemarks()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getOsType() != null)
            sb.append("OsType: ").append(getOsType()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getMonitor() != null)
            sb.append("Monitor: ").append(getMonitor()).append(",");
        if (getDetectedWorkload() != null)
            sb.append("DetectedWorkload: ").append(getDetectedWorkload());
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
        if (other.getComponentRemarks() == null ^ this.getComponentRemarks() == null)
            return false;
        if (other.getComponentRemarks() != null && other.getComponentRemarks().equals(this.getComponentRemarks()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getOsType() == null ^ this.getOsType() == null)
            return false;
        if (other.getOsType() != null && other.getOsType().equals(this.getOsType()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getMonitor() == null ^ this.getMonitor() == null)
            return false;
        if (other.getMonitor() != null && other.getMonitor().equals(this.getMonitor()) == false)
            return false;
        if (other.getDetectedWorkload() == null ^ this.getDetectedWorkload() == null)
            return false;
        if (other.getDetectedWorkload() != null && other.getDetectedWorkload().equals(this.getDetectedWorkload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentRemarks() == null) ? 0 : getComponentRemarks().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getOsType() == null) ? 0 : getOsType().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getMonitor() == null) ? 0 : getMonitor().hashCode());
        hashCode = prime * hashCode + ((getDetectedWorkload() == null) ? 0 : getDetectedWorkload().hashCode());
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
