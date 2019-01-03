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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to modify the reputation metric publishing settings for a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/UpdateConfigurationSetReputationMetricsEnabled"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationSetReputationMetricsEnabledRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to update.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     * 
     * @return The name of the configuration set that you want to update.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to update.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetReputationMetricsEnabledRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * 
     * @param enabled
     *        Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as
     *        bounce and complaint rates, to Amazon CloudWatch.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * 
     * @return Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as
     *         bounce and complaint rates, to Amazon CloudWatch.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * 
     * @param enabled
     *        Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as
     *        bounce and complaint rates, to Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationSetReputationMetricsEnabledRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * 
     * @return Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as
     *         bounce and complaint rates, to Amazon CloudWatch.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationSetReputationMetricsEnabledRequest == false)
            return false;
        UpdateConfigurationSetReputationMetricsEnabledRequest other = (UpdateConfigurationSetReputationMetricsEnabledRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfigurationSetReputationMetricsEnabledRequest clone() {
        return (UpdateConfigurationSetReputationMetricsEnabledRequest) super.clone();
    }

}
