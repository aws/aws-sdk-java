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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing the details for a registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RegistryListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistryListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the registry.
     * </p>
     */
    private String registryName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     */
    private String registryArn;
    /**
     * <p>
     * A description of the registry.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the registry.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The data the registry was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * The date the registry was updated.
     * </p>
     */
    private String updatedTime;

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @param registryName
     *        The name of the registry.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @return The name of the registry.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * The name of the registry.
     * </p>
     * 
     * @param registryName
     *        The name of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryListItem withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the registry.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the registry.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registry.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryListItem withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
        return this;
    }

    /**
     * <p>
     * A description of the registry.
     * </p>
     * 
     * @param description
     *        A description of the registry.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the registry.
     * </p>
     * 
     * @return A description of the registry.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the registry.
     * </p>
     * 
     * @param description
     *        A description of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryListItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the registry.
     * </p>
     * 
     * @param status
     *        The status of the registry.
     * @see RegistryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the registry.
     * </p>
     * 
     * @return The status of the registry.
     * @see RegistryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the registry.
     * </p>
     * 
     * @param status
     *        The status of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryStatus
     */

    public RegistryListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the registry.
     * </p>
     * 
     * @param status
     *        The status of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryStatus
     */

    public RegistryListItem withStatus(RegistryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The data the registry was created.
     * </p>
     * 
     * @param createdTime
     *        The data the registry was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The data the registry was created.
     * </p>
     * 
     * @return The data the registry was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The data the registry was created.
     * </p>
     * 
     * @param createdTime
     *        The data the registry was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryListItem withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date the registry was updated.
     * </p>
     * 
     * @param updatedTime
     *        The date the registry was updated.
     */

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The date the registry was updated.
     * </p>
     * 
     * @return The date the registry was updated.
     */

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The date the registry was updated.
     * </p>
     * 
     * @param updatedTime
     *        The date the registry was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistryListItem withUpdatedTime(String updatedTime) {
        setUpdatedTime(updatedTime);
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
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistryListItem == false)
            return false;
        RegistryListItem other = (RegistryListItem) obj;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public RegistryListItem clone() {
        try {
            return (RegistryListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RegistryListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
