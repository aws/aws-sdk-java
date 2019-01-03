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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to enable or disable tracking of reputation metrics for a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetReputationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationSetReputationOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that you want to enable or disable reputation metric tracking for.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     */
    private Boolean reputationMetricsEnabled;

    /**
     * <p>
     * The name of the configuration set that you want to enable or disable reputation metric tracking for.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to enable or disable reputation metric tracking for.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to enable or disable reputation metric tracking for.
     * </p>
     * 
     * @return The name of the configuration set that you want to enable or disable reputation metric tracking for.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to enable or disable reputation metric tracking for.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to enable or disable reputation metric tracking for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetReputationOptionsRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     * 
     * @param reputationMetricsEnabled
     *        If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If
     *        <code>false</code>, tracking of reputation metrics is disabled for the configuration set.
     */

    public void setReputationMetricsEnabled(Boolean reputationMetricsEnabled) {
        this.reputationMetricsEnabled = reputationMetricsEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     * 
     * @return If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If
     *         <code>false</code>, tracking of reputation metrics is disabled for the configuration set.
     */

    public Boolean getReputationMetricsEnabled() {
        return this.reputationMetricsEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     * 
     * @param reputationMetricsEnabled
     *        If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If
     *        <code>false</code>, tracking of reputation metrics is disabled for the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetReputationOptionsRequest withReputationMetricsEnabled(Boolean reputationMetricsEnabled) {
        setReputationMetricsEnabled(reputationMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If <code>false</code>,
     * tracking of reputation metrics is disabled for the configuration set.
     * </p>
     * 
     * @return If <code>true</code>, tracking of reputation metrics is enabled for the configuration set. If
     *         <code>false</code>, tracking of reputation metrics is disabled for the configuration set.
     */

    public Boolean isReputationMetricsEnabled() {
        return this.reputationMetricsEnabled;
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
        if (getReputationMetricsEnabled() != null)
            sb.append("ReputationMetricsEnabled: ").append(getReputationMetricsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationSetReputationOptionsRequest == false)
            return false;
        PutConfigurationSetReputationOptionsRequest other = (PutConfigurationSetReputationOptionsRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getReputationMetricsEnabled() == null ^ this.getReputationMetricsEnabled() == null)
            return false;
        if (other.getReputationMetricsEnabled() != null && other.getReputationMetricsEnabled().equals(this.getReputationMetricsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getReputationMetricsEnabled() == null) ? 0 : getReputationMetricsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationSetReputationOptionsRequest clone() {
        return (PutConfigurationSetReputationOptionsRequest) super.clone();
    }

}
