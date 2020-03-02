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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes resource being monitored by an alarm.
 * </p>
 * <p>
 * An alarm is a way to monitor your Amazon Lightsail resource metrics. For more information, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms">Alarms in Amazon
 * Lightsail</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/MonitoredResourceInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoredResourceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource being monitored.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the Lightsail resource being monitored.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only Lightsail resources that can currently be
     * monitored by alarms.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource being monitored.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource being monitored.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource being monitored.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource being monitored.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource being monitored.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoredResourceInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored.
     * </p>
     * 
     * @param name
     *        The name of the Lightsail resource being monitored.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored.
     * </p>
     * 
     * @return The name of the Lightsail resource being monitored.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored.
     * </p>
     * 
     * @param name
     *        The name of the Lightsail resource being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoredResourceInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only Lightsail resources that can currently be
     * monitored by alarms.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type of the resource being monitored.</p>
     *        <p>
     *        Instances, load balancers, and relational databases are the only Lightsail resources that can currently be
     *        monitored by alarms.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only Lightsail resources that can currently be
     * monitored by alarms.
     * </p>
     * 
     * @return The Lightsail resource type of the resource being monitored.</p>
     *         <p>
     *         Instances, load balancers, and relational databases are the only Lightsail resources that can currently
     *         be monitored by alarms.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only Lightsail resources that can currently be
     * monitored by alarms.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type of the resource being monitored.</p>
     *        <p>
     *        Instances, load balancers, and relational databases are the only Lightsail resources that can currently be
     *        monitored by alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public MonitoredResourceInfo withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type of the resource being monitored.
     * </p>
     * <p>
     * Instances, load balancers, and relational databases are the only Lightsail resources that can currently be
     * monitored by alarms.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type of the resource being monitored.</p>
     *        <p>
     *        Instances, load balancers, and relational databases are the only Lightsail resources that can currently be
     *        monitored by alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public MonitoredResourceInfo withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoredResourceInfo == false)
            return false;
        MonitoredResourceInfo other = (MonitoredResourceInfo) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public MonitoredResourceInfo clone() {
        try {
            return (MonitoredResourceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.MonitoredResourceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
