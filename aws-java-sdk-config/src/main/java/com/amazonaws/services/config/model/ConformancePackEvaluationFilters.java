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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters a conformance pack by AWS Config rule names, compliance types, AWS resource types, and resource IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackEvaluationFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackEvaluationFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configRuleNames;
    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * Filters the results by the resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Filters the results by resource IDs.
     * </p>
     * <note>
     * <p>
     * This is valid only when you provide resource type. If there is no resource type, you will see an error.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     * 
     * @return Filters the results by AWS Config rule names.
     */

    public java.util.List<String> getConfigRuleNames() {
        if (configRuleNames == null) {
            configRuleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configRuleNames;
    }

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     * 
     * @param configRuleNames
     *        Filters the results by AWS Config rule names.
     */

    public void setConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
            return;
        }

        this.configRuleNames = new com.amazonaws.internal.SdkInternalList<String>(configRuleNames);
    }

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRuleNames(java.util.Collection)} or {@link #withConfigRuleNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configRuleNames
     *        Filters the results by AWS Config rule names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackEvaluationFilters withConfigRuleNames(String... configRuleNames) {
        if (this.configRuleNames == null) {
            setConfigRuleNames(new com.amazonaws.internal.SdkInternalList<String>(configRuleNames.length));
        }
        for (String ele : configRuleNames) {
            this.configRuleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     * 
     * @param configRuleNames
     *        Filters the results by AWS Config rule names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackEvaluationFilters withConfigRuleNames(java.util.Collection<String> configRuleNames) {
        setConfigRuleNames(configRuleNames);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @see ConformancePackComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return Filters the results by compliance.</p>
     *         <p>
     *         The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @see ConformancePackComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public ConformancePackEvaluationFilters withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public ConformancePackEvaluationFilters withComplianceType(ConformancePackComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * <p>
     * Filters the results by the resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     * 
     * @param resourceType
     *        Filters the results by the resource type (for example, <code>"AWS::EC2::Instance"</code>).
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Filters the results by the resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     * 
     * @return Filters the results by the resource type (for example, <code>"AWS::EC2::Instance"</code>).
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Filters the results by the resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     * 
     * @param resourceType
     *        Filters the results by the resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackEvaluationFilters withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Filters the results by resource IDs.
     * </p>
     * <note>
     * <p>
     * This is valid only when you provide resource type. If there is no resource type, you will see an error.
     * </p>
     * </note>
     * 
     * @return Filters the results by resource IDs.</p> <note>
     *         <p>
     *         This is valid only when you provide resource type. If there is no resource type, you will see an error.
     *         </p>
     */

    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
            resourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIds;
    }

    /**
     * <p>
     * Filters the results by resource IDs.
     * </p>
     * <note>
     * <p>
     * This is valid only when you provide resource type. If there is no resource type, you will see an error.
     * </p>
     * </note>
     * 
     * @param resourceIds
     *        Filters the results by resource IDs.</p> <note>
     *        <p>
     *        This is valid only when you provide resource type. If there is no resource type, you will see an error.
     *        </p>
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new com.amazonaws.internal.SdkInternalList<String>(resourceIds);
    }

    /**
     * <p>
     * Filters the results by resource IDs.
     * </p>
     * <note>
     * <p>
     * This is valid only when you provide resource type. If there is no resource type, you will see an error.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        Filters the results by resource IDs.</p> <note>
     *        <p>
     *        This is valid only when you provide resource type. If there is no resource type, you will see an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackEvaluationFilters withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new com.amazonaws.internal.SdkInternalList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by resource IDs.
     * </p>
     * <note>
     * <p>
     * This is valid only when you provide resource type. If there is no resource type, you will see an error.
     * </p>
     * </note>
     * 
     * @param resourceIds
     *        Filters the results by resource IDs.</p> <note>
     *        <p>
     *        This is valid only when you provide resource type. If there is no resource type, you will see an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackEvaluationFilters withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
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
        if (getConfigRuleNames() != null)
            sb.append("ConfigRuleNames: ").append(getConfigRuleNames()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConformancePackEvaluationFilters == false)
            return false;
        ConformancePackEvaluationFilters other = (ConformancePackEvaluationFilters) obj;
        if (other.getConfigRuleNames() == null ^ this.getConfigRuleNames() == null)
            return false;
        if (other.getConfigRuleNames() != null && other.getConfigRuleNames().equals(this.getConfigRuleNames()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleNames() == null) ? 0 : getConfigRuleNames().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackEvaluationFilters clone() {
        try {
            return (ConformancePackEvaluationFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackEvaluationFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
