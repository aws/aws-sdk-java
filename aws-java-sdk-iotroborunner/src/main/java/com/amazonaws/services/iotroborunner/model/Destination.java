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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Area within a facility where work can be performed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable, StructuredPojo {

    private String arn;

    private String id;

    private String name;

    private String site;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;

    private String state;

    private String additionalFixedProperties;

    /**
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param site
     */

    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return
     */

    public String getSite() {
        return this.site;
    }

    /**
     * @param site
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withSite(String site) {
        setSite(site);
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * @param state
     * @see DestinationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see DestinationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationState
     */

    public Destination withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationState
     */

    public Destination withState(DestinationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * @param additionalFixedProperties
     */

    public void setAdditionalFixedProperties(String additionalFixedProperties) {
        this.additionalFixedProperties = additionalFixedProperties;
    }

    /**
     * @return
     */

    public String getAdditionalFixedProperties() {
        return this.additionalFixedProperties;
    }

    /**
     * @param additionalFixedProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withAdditionalFixedProperties(String additionalFixedProperties) {
        setAdditionalFixedProperties(additionalFixedProperties);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSite() != null)
            sb.append("Site: ").append(getSite()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getAdditionalFixedProperties() != null)
            sb.append("AdditionalFixedProperties: ").append(getAdditionalFixedProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSite() == null ^ this.getSite() == null)
            return false;
        if (other.getSite() != null && other.getSite().equals(this.getSite()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAdditionalFixedProperties() == null ^ this.getAdditionalFixedProperties() == null)
            return false;
        if (other.getAdditionalFixedProperties() != null && other.getAdditionalFixedProperties().equals(this.getAdditionalFixedProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSite() == null) ? 0 : getSite().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAdditionalFixedProperties() == null) ? 0 : getAdditionalFixedProperties().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotroborunner.model.transform.DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
