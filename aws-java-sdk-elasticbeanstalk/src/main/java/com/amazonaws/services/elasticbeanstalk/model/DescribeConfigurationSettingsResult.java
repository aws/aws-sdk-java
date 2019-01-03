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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The results from a request to change the configuration settings of an environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeConfigurationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationSettingsDescription> configurationSettings;

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     * 
     * @return A list of <a>ConfigurationSettingsDescription</a>.
     */

    public java.util.List<ConfigurationSettingsDescription> getConfigurationSettings() {
        if (configurationSettings == null) {
            configurationSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationSettingsDescription>();
        }
        return configurationSettings;
    }

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     * 
     * @param configurationSettings
     *        A list of <a>ConfigurationSettingsDescription</a>.
     */

    public void setConfigurationSettings(java.util.Collection<ConfigurationSettingsDescription> configurationSettings) {
        if (configurationSettings == null) {
            this.configurationSettings = null;
            return;
        }

        this.configurationSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationSettingsDescription>(configurationSettings);
    }

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationSettings(java.util.Collection)} or
     * {@link #withConfigurationSettings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationSettings
     *        A list of <a>ConfigurationSettingsDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSettingsResult withConfigurationSettings(ConfigurationSettingsDescription... configurationSettings) {
        if (this.configurationSettings == null) {
            setConfigurationSettings(new com.amazonaws.internal.SdkInternalList<ConfigurationSettingsDescription>(configurationSettings.length));
        }
        for (ConfigurationSettingsDescription ele : configurationSettings) {
            this.configurationSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ConfigurationSettingsDescription</a>.
     * </p>
     * 
     * @param configurationSettings
     *        A list of <a>ConfigurationSettingsDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationSettingsResult withConfigurationSettings(java.util.Collection<ConfigurationSettingsDescription> configurationSettings) {
        setConfigurationSettings(configurationSettings);
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
        if (getConfigurationSettings() != null)
            sb.append("ConfigurationSettings: ").append(getConfigurationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationSettingsResult == false)
            return false;
        DescribeConfigurationSettingsResult other = (DescribeConfigurationSettingsResult) obj;
        if (other.getConfigurationSettings() == null ^ this.getConfigurationSettings() == null)
            return false;
        if (other.getConfigurationSettings() != null && other.getConfigurationSettings().equals(this.getConfigurationSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSettings() == null) ? 0 : getConfigurationSettings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationSettingsResult clone() {
        try {
            return (DescribeConfigurationSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
