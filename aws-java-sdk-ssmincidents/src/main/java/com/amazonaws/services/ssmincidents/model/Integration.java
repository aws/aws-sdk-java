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
 * Information about third-party services integrated into a response plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/Integration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Integration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the PagerDuty service where the response plan creates an incident.
     * </p>
     */
    private PagerDutyConfiguration pagerDutyConfiguration;

    /**
     * <p>
     * Information about the PagerDuty service where the response plan creates an incident.
     * </p>
     * 
     * @param pagerDutyConfiguration
     *        Information about the PagerDuty service where the response plan creates an incident.
     */

    public void setPagerDutyConfiguration(PagerDutyConfiguration pagerDutyConfiguration) {
        this.pagerDutyConfiguration = pagerDutyConfiguration;
    }

    /**
     * <p>
     * Information about the PagerDuty service where the response plan creates an incident.
     * </p>
     * 
     * @return Information about the PagerDuty service where the response plan creates an incident.
     */

    public PagerDutyConfiguration getPagerDutyConfiguration() {
        return this.pagerDutyConfiguration;
    }

    /**
     * <p>
     * Information about the PagerDuty service where the response plan creates an incident.
     * </p>
     * 
     * @param pagerDutyConfiguration
     *        Information about the PagerDuty service where the response plan creates an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Integration withPagerDutyConfiguration(PagerDutyConfiguration pagerDutyConfiguration) {
        setPagerDutyConfiguration(pagerDutyConfiguration);
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
        if (getPagerDutyConfiguration() != null)
            sb.append("PagerDutyConfiguration: ").append(getPagerDutyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Integration == false)
            return false;
        Integration other = (Integration) obj;
        if (other.getPagerDutyConfiguration() == null ^ this.getPagerDutyConfiguration() == null)
            return false;
        if (other.getPagerDutyConfiguration() != null && other.getPagerDutyConfiguration().equals(this.getPagerDutyConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPagerDutyConfiguration() == null) ? 0 : getPagerDutyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Integration clone() {
        try {
            return (Integration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.IntegrationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
