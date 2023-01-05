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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the PagerDuty configuration for a response plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/PagerDutyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PagerDutyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the PagerDuty configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Details about the PagerDuty service associated with the configuration.
     * </p>
     */
    private PagerDutyIncidentConfiguration pagerDutyIncidentConfiguration;
    /**
     * <p>
     * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access
     * REST API Key or User Token REST API Key, and other user credentials.
     * </p>
     */
    private String secretId;

    /**
     * <p>
     * The name of the PagerDuty configuration.
     * </p>
     * 
     * @param name
     *        The name of the PagerDuty configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the PagerDuty configuration.
     * </p>
     * 
     * @return The name of the PagerDuty configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the PagerDuty configuration.
     * </p>
     * 
     * @param name
     *        The name of the PagerDuty configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PagerDutyConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Details about the PagerDuty service associated with the configuration.
     * </p>
     * 
     * @param pagerDutyIncidentConfiguration
     *        Details about the PagerDuty service associated with the configuration.
     */

    public void setPagerDutyIncidentConfiguration(PagerDutyIncidentConfiguration pagerDutyIncidentConfiguration) {
        this.pagerDutyIncidentConfiguration = pagerDutyIncidentConfiguration;
    }

    /**
     * <p>
     * Details about the PagerDuty service associated with the configuration.
     * </p>
     * 
     * @return Details about the PagerDuty service associated with the configuration.
     */

    public PagerDutyIncidentConfiguration getPagerDutyIncidentConfiguration() {
        return this.pagerDutyIncidentConfiguration;
    }

    /**
     * <p>
     * Details about the PagerDuty service associated with the configuration.
     * </p>
     * 
     * @param pagerDutyIncidentConfiguration
     *        Details about the PagerDuty service associated with the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PagerDutyConfiguration withPagerDutyIncidentConfiguration(PagerDutyIncidentConfiguration pagerDutyIncidentConfiguration) {
        setPagerDutyIncidentConfiguration(pagerDutyIncidentConfiguration);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access
     * REST API Key or User Token REST API Key, and other user credentials.
     * </p>
     * 
     * @param secretId
     *        The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General
     *        Access REST API Key or User Token REST API Key, and other user credentials.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access
     * REST API Key or User Token REST API Key, and other user credentials.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General
     *         Access REST API Key or User Token REST API Key, and other user credentials.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access
     * REST API Key or User Token REST API Key, and other user credentials.
     * </p>
     * 
     * @param secretId
     *        The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General
     *        Access REST API Key or User Token REST API Key, and other user credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PagerDutyConfiguration withSecretId(String secretId) {
        setSecretId(secretId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPagerDutyIncidentConfiguration() != null)
            sb.append("PagerDutyIncidentConfiguration: ").append(getPagerDutyIncidentConfiguration()).append(",");
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PagerDutyConfiguration == false)
            return false;
        PagerDutyConfiguration other = (PagerDutyConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPagerDutyIncidentConfiguration() == null ^ this.getPagerDutyIncidentConfiguration() == null)
            return false;
        if (other.getPagerDutyIncidentConfiguration() != null
                && other.getPagerDutyIncidentConfiguration().equals(this.getPagerDutyIncidentConfiguration()) == false)
            return false;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPagerDutyIncidentConfiguration() == null) ? 0 : getPagerDutyIncidentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        return hashCode;
    }

    @Override
    public PagerDutyConfiguration clone() {
        try {
            return (PagerDutyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.PagerDutyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
