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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata associated with a standard or custom framework.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentFrameworkMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentFrameworkMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identified for the specified framework.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The framework type, such as standard or custom.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the specified framework.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the specified framework.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The logo associated with the framework.
     * </p>
     */
    private String logo;
    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The number of controls associated with the specified framework.
     * </p>
     */
    private Integer controlsCount;
    /**
     * <p>
     * The number of control sets associated with the specified framework.
     * </p>
     */
    private Integer controlSetsCount;
    /**
     * <p>
     * Specifies when the framework was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies when the framework was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The unique identified for the specified framework.
     * </p>
     * 
     * @param id
     *        The unique identified for the specified framework.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identified for the specified framework.
     * </p>
     * 
     * @return The unique identified for the specified framework.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identified for the specified framework.
     * </p>
     * 
     * @param id
     *        The unique identified for the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The framework type, such as standard or custom.
     * </p>
     * 
     * @param type
     *        The framework type, such as standard or custom.
     * @see FrameworkType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The framework type, such as standard or custom.
     * </p>
     * 
     * @return The framework type, such as standard or custom.
     * @see FrameworkType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The framework type, such as standard or custom.
     * </p>
     * 
     * @param type
     *        The framework type, such as standard or custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FrameworkType
     */

    public AssessmentFrameworkMetadata withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The framework type, such as standard or custom.
     * </p>
     * 
     * @param type
     *        The framework type, such as standard or custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FrameworkType
     */

    public AssessmentFrameworkMetadata withType(FrameworkType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the specified framework.
     * </p>
     * 
     * @param name
     *        The name of the specified framework.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified framework.
     * </p>
     * 
     * @return The name of the specified framework.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified framework.
     * </p>
     * 
     * @param name
     *        The name of the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the specified framework.
     * </p>
     * 
     * @param description
     *        The description of the specified framework.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the specified framework.
     * </p>
     * 
     * @return The description of the specified framework.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the specified framework.
     * </p>
     * 
     * @param description
     *        The description of the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The logo associated with the framework.
     * </p>
     * 
     * @param logo
     *        The logo associated with the framework.
     */

    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * <p>
     * The logo associated with the framework.
     * </p>
     * 
     * @return The logo associated with the framework.
     */

    public String getLogo() {
        return this.logo;
    }

    /**
     * <p>
     * The logo associated with the framework.
     * </p>
     * 
     * @param logo
     *        The logo associated with the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withLogo(String logo) {
        setLogo(logo);
        return this;
    }

    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @param complianceType
     *        The compliance type that the new custom framework supports, such as CIS or HIPAA.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @return The compliance type that the new custom framework supports, such as CIS or HIPAA.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @param complianceType
     *        The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The number of controls associated with the specified framework.
     * </p>
     * 
     * @param controlsCount
     *        The number of controls associated with the specified framework.
     */

    public void setControlsCount(Integer controlsCount) {
        this.controlsCount = controlsCount;
    }

    /**
     * <p>
     * The number of controls associated with the specified framework.
     * </p>
     * 
     * @return The number of controls associated with the specified framework.
     */

    public Integer getControlsCount() {
        return this.controlsCount;
    }

    /**
     * <p>
     * The number of controls associated with the specified framework.
     * </p>
     * 
     * @param controlsCount
     *        The number of controls associated with the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withControlsCount(Integer controlsCount) {
        setControlsCount(controlsCount);
        return this;
    }

    /**
     * <p>
     * The number of control sets associated with the specified framework.
     * </p>
     * 
     * @param controlSetsCount
     *        The number of control sets associated with the specified framework.
     */

    public void setControlSetsCount(Integer controlSetsCount) {
        this.controlSetsCount = controlSetsCount;
    }

    /**
     * <p>
     * The number of control sets associated with the specified framework.
     * </p>
     * 
     * @return The number of control sets associated with the specified framework.
     */

    public Integer getControlSetsCount() {
        return this.controlSetsCount;
    }

    /**
     * <p>
     * The number of control sets associated with the specified framework.
     * </p>
     * 
     * @param controlSetsCount
     *        The number of control sets associated with the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withControlSetsCount(Integer controlSetsCount) {
        setControlSetsCount(controlSetsCount);
        return this;
    }

    /**
     * <p>
     * Specifies when the framework was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the framework was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Specifies when the framework was created.
     * </p>
     * 
     * @return Specifies when the framework was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Specifies when the framework was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the framework was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies when the framework was most recently updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the framework was most recently updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the framework was most recently updated.
     * </p>
     * 
     * @return Specifies when the framework was most recently updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the framework was most recently updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the framework was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkMetadata withLastUpdatedAt(java.util.Date lastUpdatedAt) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLogo() != null)
            sb.append("Logo: ").append(getLogo()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getControlsCount() != null)
            sb.append("ControlsCount: ").append(getControlsCount()).append(",");
        if (getControlSetsCount() != null)
            sb.append("ControlSetsCount: ").append(getControlSetsCount()).append(",");
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

        if (obj instanceof AssessmentFrameworkMetadata == false)
            return false;
        AssessmentFrameworkMetadata other = (AssessmentFrameworkMetadata) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLogo() == null ^ this.getLogo() == null)
            return false;
        if (other.getLogo() != null && other.getLogo().equals(this.getLogo()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getControlsCount() == null ^ this.getControlsCount() == null)
            return false;
        if (other.getControlsCount() != null && other.getControlsCount().equals(this.getControlsCount()) == false)
            return false;
        if (other.getControlSetsCount() == null ^ this.getControlSetsCount() == null)
            return false;
        if (other.getControlSetsCount() != null && other.getControlSetsCount().equals(this.getControlSetsCount()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLogo() == null) ? 0 : getLogo().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getControlsCount() == null) ? 0 : getControlsCount().hashCode());
        hashCode = prime * hashCode + ((getControlSetsCount() == null) ? 0 : getControlSetsCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentFrameworkMetadata clone() {
        try {
            return (AssessmentFrameworkMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentFrameworkMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
