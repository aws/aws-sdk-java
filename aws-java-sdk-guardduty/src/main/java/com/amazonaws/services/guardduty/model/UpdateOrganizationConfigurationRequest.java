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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOrganizationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector to update the delegated administrator for.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the organization.
     * </p>
     */
    private Boolean autoEnable;
    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     */
    private OrganizationDataSourceConfigurations dataSources;

    /**
     * <p>
     * The ID of the detector to update the delegated administrator for.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector to update the delegated administrator for.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector to update the delegated administrator for.
     * </p>
     * 
     * @return The ID of the detector to update the delegated administrator for.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector to update the delegated administrator for.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector to update the delegated administrator for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationConfigurationRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the organization.
     * </p>
     * 
     * @param autoEnable
     *        Indicates whether to automatically enable member accounts in the organization.
     */

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the organization.
     * </p>
     * 
     * @return Indicates whether to automatically enable member accounts in the organization.
     */

    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the organization.
     * </p>
     * 
     * @param autoEnable
     *        Indicates whether to automatically enable member accounts in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationConfigurationRequest withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the organization.
     * </p>
     * 
     * @return Indicates whether to automatically enable member accounts in the organization.
     */

    public Boolean isAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources will be updated.
     */

    public void setDataSources(OrganizationDataSourceConfigurations dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * 
     * @return Describes which data sources will be updated.
     */

    public OrganizationDataSourceConfigurations getDataSources() {
        return this.dataSources;
    }

    /**
     * <p>
     * Describes which data sources will be updated.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources will be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationConfigurationRequest withDataSources(OrganizationDataSourceConfigurations dataSources) {
        setDataSources(dataSources);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOrganizationConfigurationRequest == false)
            return false;
        UpdateOrganizationConfigurationRequest other = (UpdateOrganizationConfigurationRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOrganizationConfigurationRequest clone() {
        return (UpdateOrganizationConfigurationRequest) super.clone();
    }

}
