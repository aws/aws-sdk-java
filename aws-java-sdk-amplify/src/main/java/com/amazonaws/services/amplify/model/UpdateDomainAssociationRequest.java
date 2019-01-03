/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for update Domain Association request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     */
    private Boolean enableAutoSubDomain;
    /**
     * <p>
     * Setting structure for the Subdomain.
     * </p>
     */
    private java.util.List<SubDomainSetting> subDomainSettings;

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @return Unique Id for an Amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainAssociationRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @param domainName
     *        Name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @return Name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @param domainName
     *        Name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainAssociationRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     * 
     * @param enableAutoSubDomain
     *        Enables automated creation of Subdomains for branches.
     */

    public void setEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        this.enableAutoSubDomain = enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     * 
     * @return Enables automated creation of Subdomains for branches.
     */

    public Boolean getEnableAutoSubDomain() {
        return this.enableAutoSubDomain;
    }

    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     * 
     * @param enableAutoSubDomain
     *        Enables automated creation of Subdomains for branches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainAssociationRequest withEnableAutoSubDomain(Boolean enableAutoSubDomain) {
        setEnableAutoSubDomain(enableAutoSubDomain);
        return this;
    }

    /**
     * <p>
     * Enables automated creation of Subdomains for branches.
     * </p>
     * 
     * @return Enables automated creation of Subdomains for branches.
     */

    public Boolean isEnableAutoSubDomain() {
        return this.enableAutoSubDomain;
    }

    /**
     * <p>
     * Setting structure for the Subdomain.
     * </p>
     * 
     * @return Setting structure for the Subdomain.
     */

    public java.util.List<SubDomainSetting> getSubDomainSettings() {
        return subDomainSettings;
    }

    /**
     * <p>
     * Setting structure for the Subdomain.
     * </p>
     * 
     * @param subDomainSettings
     *        Setting structure for the Subdomain.
     */

    public void setSubDomainSettings(java.util.Collection<SubDomainSetting> subDomainSettings) {
        if (subDomainSettings == null) {
            this.subDomainSettings = null;
            return;
        }

        this.subDomainSettings = new java.util.ArrayList<SubDomainSetting>(subDomainSettings);
    }

    /**
     * <p>
     * Setting structure for the Subdomain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubDomainSettings(java.util.Collection)} or {@link #withSubDomainSettings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param subDomainSettings
     *        Setting structure for the Subdomain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainAssociationRequest withSubDomainSettings(SubDomainSetting... subDomainSettings) {
        if (this.subDomainSettings == null) {
            setSubDomainSettings(new java.util.ArrayList<SubDomainSetting>(subDomainSettings.length));
        }
        for (SubDomainSetting ele : subDomainSettings) {
            this.subDomainSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Setting structure for the Subdomain.
     * </p>
     * 
     * @param subDomainSettings
     *        Setting structure for the Subdomain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainAssociationRequest withSubDomainSettings(java.util.Collection<SubDomainSetting> subDomainSettings) {
        setSubDomainSettings(subDomainSettings);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEnableAutoSubDomain() != null)
            sb.append("EnableAutoSubDomain: ").append(getEnableAutoSubDomain()).append(",");
        if (getSubDomainSettings() != null)
            sb.append("SubDomainSettings: ").append(getSubDomainSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainAssociationRequest == false)
            return false;
        UpdateDomainAssociationRequest other = (UpdateDomainAssociationRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEnableAutoSubDomain() == null ^ this.getEnableAutoSubDomain() == null)
            return false;
        if (other.getEnableAutoSubDomain() != null && other.getEnableAutoSubDomain().equals(this.getEnableAutoSubDomain()) == false)
            return false;
        if (other.getSubDomainSettings() == null ^ this.getSubDomainSettings() == null)
            return false;
        if (other.getSubDomainSettings() != null && other.getSubDomainSettings().equals(this.getSubDomainSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoSubDomain() == null) ? 0 : getEnableAutoSubDomain().hashCode());
        hashCode = prime * hashCode + ((getSubDomainSettings() == null) ? 0 : getSubDomainSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainAssociationRequest clone() {
        return (UpdateDomainAssociationRequest) super.clone();
    }

}
