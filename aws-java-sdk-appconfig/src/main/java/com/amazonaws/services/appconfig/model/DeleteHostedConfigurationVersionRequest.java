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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteHostedConfigurationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteHostedConfigurationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The configuration profile ID.
     * </p>
     */
    private String configurationProfileId;
    /**
     * <p>
     * The versions number to delete.
     * </p>
     */
    private Integer versionNumber;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHostedConfigurationVersionRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @param configurationProfileId
     *        The configuration profile ID.
     */

    public void setConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @return The configuration profile ID.
     */

    public String getConfigurationProfileId() {
        return this.configurationProfileId;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @param configurationProfileId
     *        The configuration profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHostedConfigurationVersionRequest withConfigurationProfileId(String configurationProfileId) {
        setConfigurationProfileId(configurationProfileId);
        return this;
    }

    /**
     * <p>
     * The versions number to delete.
     * </p>
     * 
     * @param versionNumber
     *        The versions number to delete.
     */

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The versions number to delete.
     * </p>
     * 
     * @return The versions number to delete.
     */

    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The versions number to delete.
     * </p>
     * 
     * @param versionNumber
     *        The versions number to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHostedConfigurationVersionRequest withVersionNumber(Integer versionNumber) {
        setVersionNumber(versionNumber);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getConfigurationProfileId() != null)
            sb.append("ConfigurationProfileId: ").append(getConfigurationProfileId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHostedConfigurationVersionRequest == false)
            return false;
        DeleteHostedConfigurationVersionRequest other = (DeleteHostedConfigurationVersionRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getConfigurationProfileId() == null ^ this.getConfigurationProfileId() == null)
            return false;
        if (other.getConfigurationProfileId() != null && other.getConfigurationProfileId().equals(this.getConfigurationProfileId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProfileId() == null) ? 0 : getConfigurationProfileId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHostedConfigurationVersionRequest clone() {
        return (DeleteHostedConfigurationVersionRequest) super.clone();
    }

}
