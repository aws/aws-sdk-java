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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Discovery configuration associated to the workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/WorkloadDiscoveryConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadDiscoveryConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Discovery integration status in respect to Trusted Advisor for the workload.
     * </p>
     */
    private String trustedAdvisorIntegrationStatus;

    /**
     * <p>
     * Discovery integration status in respect to Trusted Advisor for the workload.
     * </p>
     * 
     * @param trustedAdvisorIntegrationStatus
     *        Discovery integration status in respect to Trusted Advisor for the workload.
     * @see TrustedAdvisorIntegrationStatus
     */

    public void setTrustedAdvisorIntegrationStatus(String trustedAdvisorIntegrationStatus) {
        this.trustedAdvisorIntegrationStatus = trustedAdvisorIntegrationStatus;
    }

    /**
     * <p>
     * Discovery integration status in respect to Trusted Advisor for the workload.
     * </p>
     * 
     * @return Discovery integration status in respect to Trusted Advisor for the workload.
     * @see TrustedAdvisorIntegrationStatus
     */

    public String getTrustedAdvisorIntegrationStatus() {
        return this.trustedAdvisorIntegrationStatus;
    }

    /**
     * <p>
     * Discovery integration status in respect to Trusted Advisor for the workload.
     * </p>
     * 
     * @param trustedAdvisorIntegrationStatus
     *        Discovery integration status in respect to Trusted Advisor for the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustedAdvisorIntegrationStatus
     */

    public WorkloadDiscoveryConfig withTrustedAdvisorIntegrationStatus(String trustedAdvisorIntegrationStatus) {
        setTrustedAdvisorIntegrationStatus(trustedAdvisorIntegrationStatus);
        return this;
    }

    /**
     * <p>
     * Discovery integration status in respect to Trusted Advisor for the workload.
     * </p>
     * 
     * @param trustedAdvisorIntegrationStatus
     *        Discovery integration status in respect to Trusted Advisor for the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustedAdvisorIntegrationStatus
     */

    public WorkloadDiscoveryConfig withTrustedAdvisorIntegrationStatus(TrustedAdvisorIntegrationStatus trustedAdvisorIntegrationStatus) {
        this.trustedAdvisorIntegrationStatus = trustedAdvisorIntegrationStatus.toString();
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
        if (getTrustedAdvisorIntegrationStatus() != null)
            sb.append("TrustedAdvisorIntegrationStatus: ").append(getTrustedAdvisorIntegrationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkloadDiscoveryConfig == false)
            return false;
        WorkloadDiscoveryConfig other = (WorkloadDiscoveryConfig) obj;
        if (other.getTrustedAdvisorIntegrationStatus() == null ^ this.getTrustedAdvisorIntegrationStatus() == null)
            return false;
        if (other.getTrustedAdvisorIntegrationStatus() != null
                && other.getTrustedAdvisorIntegrationStatus().equals(this.getTrustedAdvisorIntegrationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustedAdvisorIntegrationStatus() == null) ? 0 : getTrustedAdvisorIntegrationStatus().hashCode());
        return hashCode;
    }

    @Override
    public WorkloadDiscoveryConfig clone() {
        try {
            return (WorkloadDiscoveryConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.WorkloadDiscoveryConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
