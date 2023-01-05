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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is a structure that defines the configuration of how your application integrates with AppConfig to run
 * client-side evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ProjectAppConfigResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectAppConfigResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AppConfig application to use for client-side evaluation.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the AppConfig profile to use for client-side evaluation.
     * </p>
     */
    private String configurationProfileId;
    /**
     * <p>
     * The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that is within
     * the application that you specify for <code>applicationId</code>.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * The ID of the AppConfig application to use for client-side evaluation.
     * </p>
     * 
     * @param applicationId
     *        The ID of the AppConfig application to use for client-side evaluation.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the AppConfig application to use for client-side evaluation.
     * </p>
     * 
     * @return The ID of the AppConfig application to use for client-side evaluation.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the AppConfig application to use for client-side evaluation.
     * </p>
     * 
     * @param applicationId
     *        The ID of the AppConfig application to use for client-side evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectAppConfigResource withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the AppConfig profile to use for client-side evaluation.
     * </p>
     * 
     * @param configurationProfileId
     *        The ID of the AppConfig profile to use for client-side evaluation.
     */

    public void setConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    /**
     * <p>
     * The ID of the AppConfig profile to use for client-side evaluation.
     * </p>
     * 
     * @return The ID of the AppConfig profile to use for client-side evaluation.
     */

    public String getConfigurationProfileId() {
        return this.configurationProfileId;
    }

    /**
     * <p>
     * The ID of the AppConfig profile to use for client-side evaluation.
     * </p>
     * 
     * @param configurationProfileId
     *        The ID of the AppConfig profile to use for client-side evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectAppConfigResource withConfigurationProfileId(String configurationProfileId) {
        setConfigurationProfileId(configurationProfileId);
        return this;
    }

    /**
     * <p>
     * The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that is within
     * the application that you specify for <code>applicationId</code>.
     * </p>
     * 
     * @param environmentId
     *        The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that is
     *        within the application that you specify for <code>applicationId</code>.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that is within
     * the application that you specify for <code>applicationId</code>.
     * </p>
     * 
     * @return The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that
     *         is within the application that you specify for <code>applicationId</code>.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that is within
     * the application that you specify for <code>applicationId</code>.
     * </p>
     * 
     * @param environmentId
     *        The ID of the AppConfig environment to use for client-side evaluation. This must be an environment that is
     *        within the application that you specify for <code>applicationId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectAppConfigResource withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectAppConfigResource == false)
            return false;
        ProjectAppConfigResource other = (ProjectAppConfigResource) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getConfigurationProfileId() == null ^ this.getConfigurationProfileId() == null)
            return false;
        if (other.getConfigurationProfileId() != null && other.getConfigurationProfileId().equals(this.getConfigurationProfileId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProfileId() == null) ? 0 : getConfigurationProfileId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        return hashCode;
    }

    @Override
    public ProjectAppConfigResource clone() {
        try {
            return (ProjectAppConfigResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ProjectAppConfigResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
