/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprintConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentBlueprintConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The timestamp of when this blueprint was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the Amazon DataZone domain where this blueprint exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The Amazon Web Services regions in which this blueprint is enabled.
     * </p>
     */
    private java.util.List<String> enabledRegions;
    /**
     * <p>
     * The ID of the blueprint.
     * </p>
     */
    private String environmentBlueprintId;
    /**
     * <p>
     * The ARN of the manage access role with which this blueprint is created.
     * </p>
     */
    private String manageAccessRoleArn;
    /**
     * <p>
     * The ARN of the provisioning role with which this blueprint is created.
     * </p>
     */
    private String provisioningRoleArn;
    /**
     * <p>
     * The regional parameters of the blueprint.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> regionalParameters;
    /**
     * <p>
     * The timestamp of when this blueprint was upated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when this blueprint was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when this blueprint was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when this blueprint was created.
     * </p>
     * 
     * @return The timestamp of when this blueprint was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when this blueprint was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when this blueprint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where this blueprint exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain where this blueprint exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where this blueprint exists.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain where this blueprint exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where this blueprint exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain where this blueprint exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services regions in which this blueprint is enabled.
     * </p>
     * 
     * @return The Amazon Web Services regions in which this blueprint is enabled.
     */

    public java.util.List<String> getEnabledRegions() {
        return enabledRegions;
    }

    /**
     * <p>
     * The Amazon Web Services regions in which this blueprint is enabled.
     * </p>
     * 
     * @param enabledRegions
     *        The Amazon Web Services regions in which this blueprint is enabled.
     */

    public void setEnabledRegions(java.util.Collection<String> enabledRegions) {
        if (enabledRegions == null) {
            this.enabledRegions = null;
            return;
        }

        this.enabledRegions = new java.util.ArrayList<String>(enabledRegions);
    }

    /**
     * <p>
     * The Amazon Web Services regions in which this blueprint is enabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledRegions(java.util.Collection)} or {@link #withEnabledRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param enabledRegions
     *        The Amazon Web Services regions in which this blueprint is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withEnabledRegions(String... enabledRegions) {
        if (this.enabledRegions == null) {
            setEnabledRegions(new java.util.ArrayList<String>(enabledRegions.length));
        }
        for (String ele : enabledRegions) {
            this.enabledRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services regions in which this blueprint is enabled.
     * </p>
     * 
     * @param enabledRegions
     *        The Amazon Web Services regions in which this blueprint is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withEnabledRegions(java.util.Collection<String> enabledRegions) {
        setEnabledRegions(enabledRegions);
        return this;
    }

    /**
     * <p>
     * The ID of the blueprint.
     * </p>
     * 
     * @param environmentBlueprintId
     *        The ID of the blueprint.
     */

    public void setEnvironmentBlueprintId(String environmentBlueprintId) {
        this.environmentBlueprintId = environmentBlueprintId;
    }

    /**
     * <p>
     * The ID of the blueprint.
     * </p>
     * 
     * @return The ID of the blueprint.
     */

    public String getEnvironmentBlueprintId() {
        return this.environmentBlueprintId;
    }

    /**
     * <p>
     * The ID of the blueprint.
     * </p>
     * 
     * @param environmentBlueprintId
     *        The ID of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withEnvironmentBlueprintId(String environmentBlueprintId) {
        setEnvironmentBlueprintId(environmentBlueprintId);
        return this;
    }

    /**
     * <p>
     * The ARN of the manage access role with which this blueprint is created.
     * </p>
     * 
     * @param manageAccessRoleArn
     *        The ARN of the manage access role with which this blueprint is created.
     */

    public void setManageAccessRoleArn(String manageAccessRoleArn) {
        this.manageAccessRoleArn = manageAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the manage access role with which this blueprint is created.
     * </p>
     * 
     * @return The ARN of the manage access role with which this blueprint is created.
     */

    public String getManageAccessRoleArn() {
        return this.manageAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the manage access role with which this blueprint is created.
     * </p>
     * 
     * @param manageAccessRoleArn
     *        The ARN of the manage access role with which this blueprint is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withManageAccessRoleArn(String manageAccessRoleArn) {
        setManageAccessRoleArn(manageAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the provisioning role with which this blueprint is created.
     * </p>
     * 
     * @param provisioningRoleArn
     *        The ARN of the provisioning role with which this blueprint is created.
     */

    public void setProvisioningRoleArn(String provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
    }

    /**
     * <p>
     * The ARN of the provisioning role with which this blueprint is created.
     * </p>
     * 
     * @return The ARN of the provisioning role with which this blueprint is created.
     */

    public String getProvisioningRoleArn() {
        return this.provisioningRoleArn;
    }

    /**
     * <p>
     * The ARN of the provisioning role with which this blueprint is created.
     * </p>
     * 
     * @param provisioningRoleArn
     *        The ARN of the provisioning role with which this blueprint is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withProvisioningRoleArn(String provisioningRoleArn) {
        setProvisioningRoleArn(provisioningRoleArn);
        return this;
    }

    /**
     * <p>
     * The regional parameters of the blueprint.
     * </p>
     * 
     * @return The regional parameters of the blueprint.
     */

    public java.util.Map<String, java.util.Map<String, String>> getRegionalParameters() {
        return regionalParameters;
    }

    /**
     * <p>
     * The regional parameters of the blueprint.
     * </p>
     * 
     * @param regionalParameters
     *        The regional parameters of the blueprint.
     */

    public void setRegionalParameters(java.util.Map<String, java.util.Map<String, String>> regionalParameters) {
        this.regionalParameters = regionalParameters;
    }

    /**
     * <p>
     * The regional parameters of the blueprint.
     * </p>
     * 
     * @param regionalParameters
     *        The regional parameters of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withRegionalParameters(java.util.Map<String, java.util.Map<String, String>> regionalParameters) {
        setRegionalParameters(regionalParameters);
        return this;
    }

    /**
     * Add a single RegionalParameters entry
     *
     * @see GetEnvironmentBlueprintConfigurationResult#withRegionalParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult addRegionalParametersEntry(String key, java.util.Map<String, String> value) {
        if (null == this.regionalParameters) {
            this.regionalParameters = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.regionalParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.regionalParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RegionalParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult clearRegionalParametersEntries() {
        this.regionalParameters = null;
        return this;
    }

    /**
     * <p>
     * The timestamp of when this blueprint was upated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when this blueprint was upated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when this blueprint was upated.
     * </p>
     * 
     * @return The timestamp of when this blueprint was upated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when this blueprint was upated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when this blueprint was upated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintConfigurationResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEnabledRegions() != null)
            sb.append("EnabledRegions: ").append(getEnabledRegions()).append(",");
        if (getEnvironmentBlueprintId() != null)
            sb.append("EnvironmentBlueprintId: ").append(getEnvironmentBlueprintId()).append(",");
        if (getManageAccessRoleArn() != null)
            sb.append("ManageAccessRoleArn: ").append(getManageAccessRoleArn()).append(",");
        if (getProvisioningRoleArn() != null)
            sb.append("ProvisioningRoleArn: ").append(getProvisioningRoleArn()).append(",");
        if (getRegionalParameters() != null)
            sb.append("RegionalParameters: ").append(getRegionalParameters()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnvironmentBlueprintConfigurationResult == false)
            return false;
        GetEnvironmentBlueprintConfigurationResult other = (GetEnvironmentBlueprintConfigurationResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEnabledRegions() == null ^ this.getEnabledRegions() == null)
            return false;
        if (other.getEnabledRegions() != null && other.getEnabledRegions().equals(this.getEnabledRegions()) == false)
            return false;
        if (other.getEnvironmentBlueprintId() == null ^ this.getEnvironmentBlueprintId() == null)
            return false;
        if (other.getEnvironmentBlueprintId() != null && other.getEnvironmentBlueprintId().equals(this.getEnvironmentBlueprintId()) == false)
            return false;
        if (other.getManageAccessRoleArn() == null ^ this.getManageAccessRoleArn() == null)
            return false;
        if (other.getManageAccessRoleArn() != null && other.getManageAccessRoleArn().equals(this.getManageAccessRoleArn()) == false)
            return false;
        if (other.getProvisioningRoleArn() == null ^ this.getProvisioningRoleArn() == null)
            return false;
        if (other.getProvisioningRoleArn() != null && other.getProvisioningRoleArn().equals(this.getProvisioningRoleArn()) == false)
            return false;
        if (other.getRegionalParameters() == null ^ this.getRegionalParameters() == null)
            return false;
        if (other.getRegionalParameters() != null && other.getRegionalParameters().equals(this.getRegionalParameters()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEnabledRegions() == null) ? 0 : getEnabledRegions().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentBlueprintId() == null) ? 0 : getEnvironmentBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getManageAccessRoleArn() == null) ? 0 : getManageAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProvisioningRoleArn() == null) ? 0 : getProvisioningRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRegionalParameters() == null) ? 0 : getRegionalParameters().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentBlueprintConfigurationResult clone() {
        try {
            return (GetEnvironmentBlueprintConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
