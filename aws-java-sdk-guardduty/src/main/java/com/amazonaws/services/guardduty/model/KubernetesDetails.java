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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about Kubernetes resources such as a Kubernetes user or workload resource involved in a Kubernetes finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/KubernetesDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the Kubernetes user involved in a Kubernetes finding.
     * </p>
     */
    private KubernetesUserDetails kubernetesUserDetails;
    /**
     * <p>
     * Details about the Kubernetes workload involved in a Kubernetes finding.
     * </p>
     */
    private KubernetesWorkloadDetails kubernetesWorkloadDetails;

    /**
     * <p>
     * Details about the Kubernetes user involved in a Kubernetes finding.
     * </p>
     * 
     * @param kubernetesUserDetails
     *        Details about the Kubernetes user involved in a Kubernetes finding.
     */

    public void setKubernetesUserDetails(KubernetesUserDetails kubernetesUserDetails) {
        this.kubernetesUserDetails = kubernetesUserDetails;
    }

    /**
     * <p>
     * Details about the Kubernetes user involved in a Kubernetes finding.
     * </p>
     * 
     * @return Details about the Kubernetes user involved in a Kubernetes finding.
     */

    public KubernetesUserDetails getKubernetesUserDetails() {
        return this.kubernetesUserDetails;
    }

    /**
     * <p>
     * Details about the Kubernetes user involved in a Kubernetes finding.
     * </p>
     * 
     * @param kubernetesUserDetails
     *        Details about the Kubernetes user involved in a Kubernetes finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesDetails withKubernetesUserDetails(KubernetesUserDetails kubernetesUserDetails) {
        setKubernetesUserDetails(kubernetesUserDetails);
        return this;
    }

    /**
     * <p>
     * Details about the Kubernetes workload involved in a Kubernetes finding.
     * </p>
     * 
     * @param kubernetesWorkloadDetails
     *        Details about the Kubernetes workload involved in a Kubernetes finding.
     */

    public void setKubernetesWorkloadDetails(KubernetesWorkloadDetails kubernetesWorkloadDetails) {
        this.kubernetesWorkloadDetails = kubernetesWorkloadDetails;
    }

    /**
     * <p>
     * Details about the Kubernetes workload involved in a Kubernetes finding.
     * </p>
     * 
     * @return Details about the Kubernetes workload involved in a Kubernetes finding.
     */

    public KubernetesWorkloadDetails getKubernetesWorkloadDetails() {
        return this.kubernetesWorkloadDetails;
    }

    /**
     * <p>
     * Details about the Kubernetes workload involved in a Kubernetes finding.
     * </p>
     * 
     * @param kubernetesWorkloadDetails
     *        Details about the Kubernetes workload involved in a Kubernetes finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesDetails withKubernetesWorkloadDetails(KubernetesWorkloadDetails kubernetesWorkloadDetails) {
        setKubernetesWorkloadDetails(kubernetesWorkloadDetails);
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
        if (getKubernetesUserDetails() != null)
            sb.append("KubernetesUserDetails: ").append(getKubernetesUserDetails()).append(",");
        if (getKubernetesWorkloadDetails() != null)
            sb.append("KubernetesWorkloadDetails: ").append(getKubernetesWorkloadDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KubernetesDetails == false)
            return false;
        KubernetesDetails other = (KubernetesDetails) obj;
        if (other.getKubernetesUserDetails() == null ^ this.getKubernetesUserDetails() == null)
            return false;
        if (other.getKubernetesUserDetails() != null && other.getKubernetesUserDetails().equals(this.getKubernetesUserDetails()) == false)
            return false;
        if (other.getKubernetesWorkloadDetails() == null ^ this.getKubernetesWorkloadDetails() == null)
            return false;
        if (other.getKubernetesWorkloadDetails() != null && other.getKubernetesWorkloadDetails().equals(this.getKubernetesWorkloadDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKubernetesUserDetails() == null) ? 0 : getKubernetesUserDetails().hashCode());
        hashCode = prime * hashCode + ((getKubernetesWorkloadDetails() == null) ? 0 : getKubernetesWorkloadDetails().hashCode());
        return hashCode;
    }

    @Override
    public KubernetesDetails clone() {
        try {
            return (KubernetesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.KubernetesDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
