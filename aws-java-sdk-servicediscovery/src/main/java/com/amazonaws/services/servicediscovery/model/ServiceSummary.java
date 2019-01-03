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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information about a specified service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ServiceSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that AWS Cloud Map assigned to the service when you created it.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description that you specify when you create the service.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The number of instances that are currently associated with the service. Instances that were previously associated
     * with the service but that have been deleted are not included in the count.
     * </p>
     */
    private Integer instanceCount;

    private DnsConfig dnsConfig;

    private HealthCheckConfig healthCheckConfig;

    private HealthCheckCustomConfig healthCheckCustomConfig;
    /**
     * <p>
     * The date and time that the service was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The ID that AWS Cloud Map assigned to the service when you created it.
     * </p>
     * 
     * @param id
     *        The ID that AWS Cloud Map assigned to the service when you created it.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that AWS Cloud Map assigned to the service when you created it.
     * </p>
     * 
     * @return The ID that AWS Cloud Map assigned to the service when you created it.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that AWS Cloud Map assigned to the service when you created it.
     * </p>
     * 
     * @param id
     *        The ID that AWS Cloud Map assigned to the service when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @return The name of the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description that you specify when you create the service.
     * </p>
     * 
     * @param description
     *        The description that you specify when you create the service.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that you specify when you create the service.
     * </p>
     * 
     * @return The description that you specify when you create the service.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description that you specify when you create the service.
     * </p>
     * 
     * @param description
     *        The description that you specify when you create the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The number of instances that are currently associated with the service. Instances that were previously associated
     * with the service but that have been deleted are not included in the count.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances that are currently associated with the service. Instances that were previously
     *        associated with the service but that have been deleted are not included in the count.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances that are currently associated with the service. Instances that were previously associated
     * with the service but that have been deleted are not included in the count.
     * </p>
     * 
     * @return The number of instances that are currently associated with the service. Instances that were previously
     *         associated with the service but that have been deleted are not included in the count.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances that are currently associated with the service. Instances that were previously associated
     * with the service but that have been deleted are not included in the count.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances that are currently associated with the service. Instances that were previously
     *        associated with the service but that have been deleted are not included in the count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * @param dnsConfig
     */

    public void setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * @return
     */

    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * @param dnsConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withDnsConfig(DnsConfig dnsConfig) {
        setDnsConfig(dnsConfig);
        return this;
    }

    /**
     * @param healthCheckConfig
     */

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * @return
     */

    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @param healthCheckConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        setHealthCheckConfig(healthCheckConfig);
        return this;
    }

    /**
     * @param healthCheckCustomConfig
     */

    public void setHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
    }

    /**
     * @return
     */

    public HealthCheckCustomConfig getHealthCheckCustomConfig() {
        return this.healthCheckCustomConfig;
    }

    /**
     * @param healthCheckCustomConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        setHealthCheckCustomConfig(healthCheckCustomConfig);
        return this;
    }

    /**
     * <p>
     * The date and time that the service was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the service was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the service was created.
     * </p>
     * 
     * @return The date and time that the service was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the service was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the service was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSummary withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getDnsConfig() != null)
            sb.append("DnsConfig: ").append(getDnsConfig()).append(",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: ").append(getHealthCheckConfig()).append(",");
        if (getHealthCheckCustomConfig() != null)
            sb.append("HealthCheckCustomConfig: ").append(getHealthCheckCustomConfig()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSummary == false)
            return false;
        ServiceSummary other = (ServiceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getDnsConfig() == null ^ this.getDnsConfig() == null)
            return false;
        if (other.getDnsConfig() != null && other.getDnsConfig().equals(this.getDnsConfig()) == false)
            return false;
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false)
            return false;
        if (other.getHealthCheckCustomConfig() == null ^ this.getHealthCheckCustomConfig() == null)
            return false;
        if (other.getHealthCheckCustomConfig() != null && other.getHealthCheckCustomConfig().equals(this.getHealthCheckCustomConfig()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getDnsConfig() == null) ? 0 : getDnsConfig().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckCustomConfig() == null) ? 0 : getHealthCheckCustomConfig().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public ServiceSummary clone() {
        try {
            return (ServiceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.ServiceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
