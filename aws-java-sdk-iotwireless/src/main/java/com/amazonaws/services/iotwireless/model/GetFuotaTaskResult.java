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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetFuotaTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFuotaTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String arn;

    private String id;

    private String status;

    private String name;

    private String description;

    private LoRaWANFuotaTaskGetInfo loRaWAN;

    private String firmwareUpdateImage;

    private String firmwareUpdateRole;

    private java.util.Date createdAt;

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

    public GetFuotaTaskResult withArn(String arn) {
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

    public GetFuotaTaskResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param status
     * @see FuotaTaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see FuotaTaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FuotaTaskStatus
     */

    public GetFuotaTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FuotaTaskStatus
     */

    public GetFuotaTaskResult withStatus(FuotaTaskStatus status) {
        this.status = status.toString();
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

    public GetFuotaTaskResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFuotaTaskResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param loRaWAN
     */

    public void setLoRaWAN(LoRaWANFuotaTaskGetInfo loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * @return
     */

    public LoRaWANFuotaTaskGetInfo getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * @param loRaWAN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFuotaTaskResult withLoRaWAN(LoRaWANFuotaTaskGetInfo loRaWAN) {
        setLoRaWAN(loRaWAN);
        return this;
    }

    /**
     * @param firmwareUpdateImage
     */

    public void setFirmwareUpdateImage(String firmwareUpdateImage) {
        this.firmwareUpdateImage = firmwareUpdateImage;
    }

    /**
     * @return
     */

    public String getFirmwareUpdateImage() {
        return this.firmwareUpdateImage;
    }

    /**
     * @param firmwareUpdateImage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFuotaTaskResult withFirmwareUpdateImage(String firmwareUpdateImage) {
        setFirmwareUpdateImage(firmwareUpdateImage);
        return this;
    }

    /**
     * @param firmwareUpdateRole
     */

    public void setFirmwareUpdateRole(String firmwareUpdateRole) {
        this.firmwareUpdateRole = firmwareUpdateRole;
    }

    /**
     * @return
     */

    public String getFirmwareUpdateRole() {
        return this.firmwareUpdateRole;
    }

    /**
     * @param firmwareUpdateRole
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFuotaTaskResult withFirmwareUpdateRole(String firmwareUpdateRole) {
        setFirmwareUpdateRole(firmwareUpdateRole);
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

    public GetFuotaTaskResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN()).append(",");
        if (getFirmwareUpdateImage() != null)
            sb.append("FirmwareUpdateImage: ").append(getFirmwareUpdateImage()).append(",");
        if (getFirmwareUpdateRole() != null)
            sb.append("FirmwareUpdateRole: ").append(getFirmwareUpdateRole()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFuotaTaskResult == false)
            return false;
        GetFuotaTaskResult other = (GetFuotaTaskResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        if (other.getFirmwareUpdateImage() == null ^ this.getFirmwareUpdateImage() == null)
            return false;
        if (other.getFirmwareUpdateImage() != null && other.getFirmwareUpdateImage().equals(this.getFirmwareUpdateImage()) == false)
            return false;
        if (other.getFirmwareUpdateRole() == null ^ this.getFirmwareUpdateRole() == null)
            return false;
        if (other.getFirmwareUpdateRole() != null && other.getFirmwareUpdateRole().equals(this.getFirmwareUpdateRole()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getFirmwareUpdateImage() == null) ? 0 : getFirmwareUpdateImage().hashCode());
        hashCode = prime * hashCode + ((getFirmwareUpdateRole() == null) ? 0 : getFirmwareUpdateRole().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetFuotaTaskResult clone() {
        try {
            return (GetFuotaTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
