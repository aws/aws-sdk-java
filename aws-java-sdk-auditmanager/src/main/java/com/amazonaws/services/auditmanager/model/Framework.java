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
 * The file used to structure and automate AWS Audit Manager assessments for a given compliance standard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Framework" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Framework implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified framework.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier for the specified framework.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the specified framework.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The framework type, such as custom or standard.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The compliance type that the new custom framework supports, such as CIS or HIPAA.
     * </p>
     */
    private String complianceType;
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
     * The sources from which AWS Audit Manager collects evidence for the control.
     * </p>
     */
    private String controlSources;
    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     */
    private java.util.List<ControlSet> controlSets;
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
     * The IAM user or role that created the framework.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The IAM user or role that most recently updated the framework.
     * </p>
     */
    private String lastUpdatedBy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified framework.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified framework.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified framework.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified framework.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified framework.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the specified framework.
     * </p>
     * 
     * @param id
     *        The unique identifier for the specified framework.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the specified framework.
     * </p>
     * 
     * @return The unique identifier for the specified framework.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the specified framework.
     * </p>
     * 
     * @param id
     *        The unique identifier for the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withId(String id) {
        setId(id);
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

    public Framework withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The framework type, such as custom or standard.
     * </p>
     * 
     * @param type
     *        The framework type, such as custom or standard.
     * @see FrameworkType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The framework type, such as custom or standard.
     * </p>
     * 
     * @return The framework type, such as custom or standard.
     * @see FrameworkType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The framework type, such as custom or standard.
     * </p>
     * 
     * @param type
     *        The framework type, such as custom or standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FrameworkType
     */

    public Framework withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The framework type, such as custom or standard.
     * </p>
     * 
     * @param type
     *        The framework type, such as custom or standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FrameworkType
     */

    public Framework withType(FrameworkType type) {
        this.type = type.toString();
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

    public Framework withComplianceType(String complianceType) {
        setComplianceType(complianceType);
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

    public Framework withDescription(String description) {
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

    public Framework withLogo(String logo) {
        setLogo(logo);
        return this;
    }

    /**
     * <p>
     * The sources from which AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @param controlSources
     *        The sources from which AWS Audit Manager collects evidence for the control.
     */

    public void setControlSources(String controlSources) {
        this.controlSources = controlSources;
    }

    /**
     * <p>
     * The sources from which AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @return The sources from which AWS Audit Manager collects evidence for the control.
     */

    public String getControlSources() {
        return this.controlSources;
    }

    /**
     * <p>
     * The sources from which AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @param controlSources
     *        The sources from which AWS Audit Manager collects evidence for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withControlSources(String controlSources) {
        setControlSources(controlSources);
        return this;
    }

    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     * 
     * @return The control sets associated with the framework.
     */

    public java.util.List<ControlSet> getControlSets() {
        return controlSets;
    }

    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     * 
     * @param controlSets
     *        The control sets associated with the framework.
     */

    public void setControlSets(java.util.Collection<ControlSet> controlSets) {
        if (controlSets == null) {
            this.controlSets = null;
            return;
        }

        this.controlSets = new java.util.ArrayList<ControlSet>(controlSets);
    }

    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlSets(java.util.Collection)} or {@link #withControlSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param controlSets
     *        The control sets associated with the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withControlSets(ControlSet... controlSets) {
        if (this.controlSets == null) {
            setControlSets(new java.util.ArrayList<ControlSet>(controlSets.length));
        }
        for (ControlSet ele : controlSets) {
            this.controlSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The control sets associated with the framework.
     * </p>
     * 
     * @param controlSets
     *        The control sets associated with the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withControlSets(java.util.Collection<ControlSet> controlSets) {
        setControlSets(controlSets);
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

    public Framework withCreatedAt(java.util.Date createdAt) {
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

    public Framework withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The IAM user or role that created the framework.
     * </p>
     * 
     * @param createdBy
     *        The IAM user or role that created the framework.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The IAM user or role that created the framework.
     * </p>
     * 
     * @return The IAM user or role that created the framework.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The IAM user or role that created the framework.
     * </p>
     * 
     * @param createdBy
     *        The IAM user or role that created the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The IAM user or role that most recently updated the framework.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The IAM user or role that most recently updated the framework.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The IAM user or role that most recently updated the framework.
     * </p>
     * 
     * @return The IAM user or role that most recently updated the framework.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * The IAM user or role that most recently updated the framework.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The IAM user or role that most recently updated the framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Framework withLastUpdatedBy(String lastUpdatedBy) {
        setLastUpdatedBy(lastUpdatedBy);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLogo() != null)
            sb.append("Logo: ").append(getLogo()).append(",");
        if (getControlSources() != null)
            sb.append("ControlSources: ").append(getControlSources()).append(",");
        if (getControlSets() != null)
            sb.append("ControlSets: ").append(getControlSets()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Framework == false)
            return false;
        Framework other = (Framework) obj;
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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLogo() == null ^ this.getLogo() == null)
            return false;
        if (other.getLogo() != null && other.getLogo().equals(this.getLogo()) == false)
            return false;
        if (other.getControlSources() == null ^ this.getControlSources() == null)
            return false;
        if (other.getControlSources() != null && other.getControlSources().equals(this.getControlSources()) == false)
            return false;
        if (other.getControlSets() == null ^ this.getControlSets() == null)
            return false;
        if (other.getControlSets() != null && other.getControlSets().equals(this.getControlSets()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLogo() == null) ? 0 : getLogo().hashCode());
        hashCode = prime * hashCode + ((getControlSources() == null) ? 0 : getControlSources().hashCode());
        hashCode = prime * hashCode + ((getControlSets() == null) ? 0 : getControlSets().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public Framework clone() {
        try {
            return (Framework) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.FrameworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
