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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon resource name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time the resource was associated with the application.
     * </p>
     */
    private java.util.Date associationTime;
    /**
     * <p>
     * The service integration information about the resource.
     * </p>
     */
    private ResourceIntegrations integrations;

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon resource name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time the resource was associated with the application.
     * </p>
     * 
     * @param associationTime
     *        The time the resource was associated with the application.
     */

    public void setAssociationTime(java.util.Date associationTime) {
        this.associationTime = associationTime;
    }

    /**
     * <p>
     * The time the resource was associated with the application.
     * </p>
     * 
     * @return The time the resource was associated with the application.
     */

    public java.util.Date getAssociationTime() {
        return this.associationTime;
    }

    /**
     * <p>
     * The time the resource was associated with the application.
     * </p>
     * 
     * @param associationTime
     *        The time the resource was associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withAssociationTime(java.util.Date associationTime) {
        setAssociationTime(associationTime);
        return this;
    }

    /**
     * <p>
     * The service integration information about the resource.
     * </p>
     * 
     * @param integrations
     *        The service integration information about the resource.
     */

    public void setIntegrations(ResourceIntegrations integrations) {
        this.integrations = integrations;
    }

    /**
     * <p>
     * The service integration information about the resource.
     * </p>
     * 
     * @return The service integration information about the resource.
     */

    public ResourceIntegrations getIntegrations() {
        return this.integrations;
    }

    /**
     * <p>
     * The service integration information about the resource.
     * </p>
     * 
     * @param integrations
     *        The service integration information about the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withIntegrations(ResourceIntegrations integrations) {
        setIntegrations(integrations);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAssociationTime() != null)
            sb.append("AssociationTime: ").append(getAssociationTime()).append(",");
        if (getIntegrations() != null)
            sb.append("Integrations: ").append(getIntegrations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAssociationTime() == null ^ this.getAssociationTime() == null)
            return false;
        if (other.getAssociationTime() != null && other.getAssociationTime().equals(this.getAssociationTime()) == false)
            return false;
        if (other.getIntegrations() == null ^ this.getIntegrations() == null)
            return false;
        if (other.getIntegrations() != null && other.getIntegrations().equals(this.getIntegrations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAssociationTime() == null) ? 0 : getAssociationTime().hashCode());
        hashCode = prime * hashCode + ((getIntegrations() == null) ? 0 : getIntegrations().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
