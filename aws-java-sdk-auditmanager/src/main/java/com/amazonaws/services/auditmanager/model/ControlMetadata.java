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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata associated with the specified standard or custom control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ControlMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified control.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier for the specified control.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the specified control.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     */
    private String controlSources;
    /**
     * <p>
     * Specifies when the control was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies when the control was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified control.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified control.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified control.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified control.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified control.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlMetadata withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the specified control.
     * </p>
     * 
     * @param id
     *        The unique identifier for the specified control.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the specified control.
     * </p>
     * 
     * @return The unique identifier for the specified control.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the specified control.
     * </p>
     * 
     * @param id
     *        The unique identifier for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @param name
     *        The name of the specified control.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @return The name of the specified control.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @param name
     *        The name of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @param controlSources
     *        The data source that determines from where AWS Audit Manager collects evidence for the control.
     */

    public void setControlSources(String controlSources) {
        this.controlSources = controlSources;
    }

    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @return The data source that determines from where AWS Audit Manager collects evidence for the control.
     */

    public String getControlSources() {
        return this.controlSources;
    }

    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @param controlSources
     *        The data source that determines from where AWS Audit Manager collects evidence for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlMetadata withControlSources(String controlSources) {
        setControlSources(controlSources);
        return this;
    }

    /**
     * <p>
     * Specifies when the control was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the control was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Specifies when the control was created.
     * </p>
     * 
     * @return Specifies when the control was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Specifies when the control was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the control was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlMetadata withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies when the control was most recently updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the control was most recently updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the control was most recently updated.
     * </p>
     * 
     * @return Specifies when the control was most recently updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the control was most recently updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the control was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlMetadata withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getControlSources() != null)
            sb.append("ControlSources: ").append(getControlSources()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlMetadata == false)
            return false;
        ControlMetadata other = (ControlMetadata) obj;
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
        if (other.getControlSources() == null ^ this.getControlSources() == null)
            return false;
        if (other.getControlSources() != null && other.getControlSources().equals(this.getControlSources()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
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
        hashCode = prime * hashCode + ((getControlSources() == null) ? 0 : getControlSources().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ControlMetadata clone() {
        try {
            return (ControlMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ControlMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
