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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/PutEnvironmentBlueprintConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEnvironmentBlueprintConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * Specifies the enabled Amazon Web Services Regions.
     * </p>
     */
    private java.util.List<String> enabledRegions;
    /**
     * <p>
     * The identifier of the environment blueprint.
     * </p>
     */
    private String environmentBlueprintIdentifier;
    /**
     * <p>
     * The ARN of the manage access role.
     * </p>
     */
    private String manageAccessRoleArn;
    /**
     * <p>
     * The ARN of the provisioning role.
     * </p>
     */
    private String provisioningRoleArn;
    /**
     * <p>
     * The regional parameters in the environment blueprint.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> regionalParameters;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEnvironmentBlueprintConfigurationRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the enabled Amazon Web Services Regions.
     * </p>
     * 
     * @return Specifies the enabled Amazon Web Services Regions.
     */

    public java.util.List<String> getEnabledRegions() {
        return enabledRegions;
    }

    /**
     * <p>
     * Specifies the enabled Amazon Web Services Regions.
     * </p>
     * 
     * @param enabledRegions
     *        Specifies the enabled Amazon Web Services Regions.
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
     * Specifies the enabled Amazon Web Services Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledRegions(java.util.Collection)} or {@link #withEnabledRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param enabledRegions
     *        Specifies the enabled Amazon Web Services Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEnvironmentBlueprintConfigurationRequest withEnabledRegions(String... enabledRegions) {
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
     * Specifies the enabled Amazon Web Services Regions.
     * </p>
     * 
     * @param enabledRegions
     *        Specifies the enabled Amazon Web Services Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEnvironmentBlueprintConfigurationRequest withEnabledRegions(java.util.Collection<String> enabledRegions) {
        setEnabledRegions(enabledRegions);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment blueprint.
     * </p>
     * 
     * @param environmentBlueprintIdentifier
     *        The identifier of the environment blueprint.
     */

    public void setEnvironmentBlueprintIdentifier(String environmentBlueprintIdentifier) {
        this.environmentBlueprintIdentifier = environmentBlueprintIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment blueprint.
     * </p>
     * 
     * @return The identifier of the environment blueprint.
     */

    public String getEnvironmentBlueprintIdentifier() {
        return this.environmentBlueprintIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment blueprint.
     * </p>
     * 
     * @param environmentBlueprintIdentifier
     *        The identifier of the environment blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEnvironmentBlueprintConfigurationRequest withEnvironmentBlueprintIdentifier(String environmentBlueprintIdentifier) {
        setEnvironmentBlueprintIdentifier(environmentBlueprintIdentifier);
        return this;
    }

    /**
     * <p>
     * The ARN of the manage access role.
     * </p>
     * 
     * @param manageAccessRoleArn
     *        The ARN of the manage access role.
     */

    public void setManageAccessRoleArn(String manageAccessRoleArn) {
        this.manageAccessRoleArn = manageAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the manage access role.
     * </p>
     * 
     * @return The ARN of the manage access role.
     */

    public String getManageAccessRoleArn() {
        return this.manageAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the manage access role.
     * </p>
     * 
     * @param manageAccessRoleArn
     *        The ARN of the manage access role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEnvironmentBlueprintConfigurationRequest withManageAccessRoleArn(String manageAccessRoleArn) {
        setManageAccessRoleArn(manageAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the provisioning role.
     * </p>
     * 
     * @param provisioningRoleArn
     *        The ARN of the provisioning role.
     */

    public void setProvisioningRoleArn(String provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
    }

    /**
     * <p>
     * The ARN of the provisioning role.
     * </p>
     * 
     * @return The ARN of the provisioning role.
     */

    public String getProvisioningRoleArn() {
        return this.provisioningRoleArn;
    }

    /**
     * <p>
     * The ARN of the provisioning role.
     * </p>
     * 
     * @param provisioningRoleArn
     *        The ARN of the provisioning role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEnvironmentBlueprintConfigurationRequest withProvisioningRoleArn(String provisioningRoleArn) {
        setProvisioningRoleArn(provisioningRoleArn);
        return this;
    }

    /**
     * <p>
     * The regional parameters in the environment blueprint.
     * </p>
     * 
     * @return The regional parameters in the environment blueprint.
     */

    public java.util.Map<String, java.util.Map<String, String>> getRegionalParameters() {
        return regionalParameters;
    }

    /**
     * <p>
     * The regional parameters in the environment blueprint.
     * </p>
     * 
     * @param regionalParameters
     *        The regional parameters in the environment blueprint.
     */

    public void setRegionalParameters(java.util.Map<String, java.util.Map<String, String>> regionalParameters) {
        this.regionalParameters = regionalParameters;
    }

    /**
     * <p>
     * The regional parameters in the environment blueprint.
     * </p>
     * 
     * @param regionalParameters
     *        The regional parameters in the environment blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEnvironmentBlueprintConfigurationRequest withRegionalParameters(java.util.Map<String, java.util.Map<String, String>> regionalParameters) {
        setRegionalParameters(regionalParameters);
        return this;
    }

    /**
     * Add a single RegionalParameters entry
     *
     * @see PutEnvironmentBlueprintConfigurationRequest#withRegionalParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutEnvironmentBlueprintConfigurationRequest addRegionalParametersEntry(String key, java.util.Map<String, String> value) {
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

    public PutEnvironmentBlueprintConfigurationRequest clearRegionalParametersEntries() {
        this.regionalParameters = null;
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnabledRegions() != null)
            sb.append("EnabledRegions: ").append(getEnabledRegions()).append(",");
        if (getEnvironmentBlueprintIdentifier() != null)
            sb.append("EnvironmentBlueprintIdentifier: ").append(getEnvironmentBlueprintIdentifier()).append(",");
        if (getManageAccessRoleArn() != null)
            sb.append("ManageAccessRoleArn: ").append(getManageAccessRoleArn()).append(",");
        if (getProvisioningRoleArn() != null)
            sb.append("ProvisioningRoleArn: ").append(getProvisioningRoleArn()).append(",");
        if (getRegionalParameters() != null)
            sb.append("RegionalParameters: ").append(getRegionalParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEnvironmentBlueprintConfigurationRequest == false)
            return false;
        PutEnvironmentBlueprintConfigurationRequest other = (PutEnvironmentBlueprintConfigurationRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnabledRegions() == null ^ this.getEnabledRegions() == null)
            return false;
        if (other.getEnabledRegions() != null && other.getEnabledRegions().equals(this.getEnabledRegions()) == false)
            return false;
        if (other.getEnvironmentBlueprintIdentifier() == null ^ this.getEnvironmentBlueprintIdentifier() == null)
            return false;
        if (other.getEnvironmentBlueprintIdentifier() != null
                && other.getEnvironmentBlueprintIdentifier().equals(this.getEnvironmentBlueprintIdentifier()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnabledRegions() == null) ? 0 : getEnabledRegions().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentBlueprintIdentifier() == null) ? 0 : getEnvironmentBlueprintIdentifier().hashCode());
        hashCode = prime * hashCode + ((getManageAccessRoleArn() == null) ? 0 : getManageAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProvisioningRoleArn() == null) ? 0 : getProvisioningRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRegionalParameters() == null) ? 0 : getRegionalParameters().hashCode());
        return hashCode;
    }

    @Override
    public PutEnvironmentBlueprintConfigurationRequest clone() {
        return (PutEnvironmentBlueprintConfigurationRequest) super.clone();
    }

}
