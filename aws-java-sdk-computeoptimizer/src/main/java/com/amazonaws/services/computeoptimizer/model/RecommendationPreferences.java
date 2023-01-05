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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the recommendation preferences to return in the response of a <a>GetAutoScalingGroupRecommendations</a>,
 * <a>GetEC2InstanceRecommendations</a>, and <a>GetEC2RecommendationProjectedMetrics</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group recommendations.
     * </p>
     * <p>
     * For example, when you specify <code>AWS_ARM64</code> with:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute Optimizer
     * returns recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization metrics
     * for Graviton2 instance type recommendations only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     * Optimizer exports recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> cpuVendorArchitectures;

    /**
     * <p>
     * Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group recommendations.
     * </p>
     * <p>
     * For example, when you specify <code>AWS_ARM64</code> with:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute Optimizer
     * returns recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization metrics
     * for Graviton2 instance type recommendations only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     * Optimizer exports recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group
     *         recommendations.</p>
     *         <p>
     *         For example, when you specify <code>AWS_ARM64</code> with:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute
     *         Optimizer returns recommendations that consist of Graviton2 instance types only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization
     *         metrics for Graviton2 instance type recommendations only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request,
     *         Compute Optimizer exports recommendations that consist of Graviton2 instance types only.
     *         </p>
     *         </li>
     * @see CpuVendorArchitecture
     */

    public java.util.List<String> getCpuVendorArchitectures() {
        return cpuVendorArchitectures;
    }

    /**
     * <p>
     * Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group recommendations.
     * </p>
     * <p>
     * For example, when you specify <code>AWS_ARM64</code> with:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute Optimizer
     * returns recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization metrics
     * for Graviton2 instance type recommendations only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     * Optimizer exports recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpuVendorArchitectures
     *        Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group
     *        recommendations.</p>
     *        <p>
     *        For example, when you specify <code>AWS_ARM64</code> with:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute
     *        Optimizer returns recommendations that consist of Graviton2 instance types only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization
     *        metrics for Graviton2 instance type recommendations only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     *        Optimizer exports recommendations that consist of Graviton2 instance types only.
     *        </p>
     *        </li>
     * @see CpuVendorArchitecture
     */

    public void setCpuVendorArchitectures(java.util.Collection<String> cpuVendorArchitectures) {
        if (cpuVendorArchitectures == null) {
            this.cpuVendorArchitectures = null;
            return;
        }

        this.cpuVendorArchitectures = new java.util.ArrayList<String>(cpuVendorArchitectures);
    }

    /**
     * <p>
     * Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group recommendations.
     * </p>
     * <p>
     * For example, when you specify <code>AWS_ARM64</code> with:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute Optimizer
     * returns recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization metrics
     * for Graviton2 instance type recommendations only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     * Optimizer exports recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCpuVendorArchitectures(java.util.Collection)} or
     * {@link #withCpuVendorArchitectures(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cpuVendorArchitectures
     *        Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group
     *        recommendations.</p>
     *        <p>
     *        For example, when you specify <code>AWS_ARM64</code> with:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute
     *        Optimizer returns recommendations that consist of Graviton2 instance types only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization
     *        metrics for Graviton2 instance type recommendations only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     *        Optimizer exports recommendations that consist of Graviton2 instance types only.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuVendorArchitecture
     */

    public RecommendationPreferences withCpuVendorArchitectures(String... cpuVendorArchitectures) {
        if (this.cpuVendorArchitectures == null) {
            setCpuVendorArchitectures(new java.util.ArrayList<String>(cpuVendorArchitectures.length));
        }
        for (String ele : cpuVendorArchitectures) {
            this.cpuVendorArchitectures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group recommendations.
     * </p>
     * <p>
     * For example, when you specify <code>AWS_ARM64</code> with:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute Optimizer
     * returns recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization metrics
     * for Graviton2 instance type recommendations only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     * Optimizer exports recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpuVendorArchitectures
     *        Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group
     *        recommendations.</p>
     *        <p>
     *        For example, when you specify <code>AWS_ARM64</code> with:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute
     *        Optimizer returns recommendations that consist of Graviton2 instance types only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization
     *        metrics for Graviton2 instance type recommendations only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     *        Optimizer exports recommendations that consist of Graviton2 instance types only.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuVendorArchitecture
     */

    public RecommendationPreferences withCpuVendorArchitectures(java.util.Collection<String> cpuVendorArchitectures) {
        setCpuVendorArchitectures(cpuVendorArchitectures);
        return this;
    }

    /**
     * <p>
     * Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group recommendations.
     * </p>
     * <p>
     * For example, when you specify <code>AWS_ARM64</code> with:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute Optimizer
     * returns recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization metrics
     * for Graviton2 instance type recommendations only.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     * Optimizer exports recommendations that consist of Graviton2 instance types only.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cpuVendorArchitectures
     *        Specifies the CPU vendor and architecture for Amazon EC2 instance and Auto Scaling group
     *        recommendations.</p>
     *        <p>
     *        For example, when you specify <code>AWS_ARM64</code> with:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A <a>GetEC2InstanceRecommendations</a> or <a>GetAutoScalingGroupRecommendations</a> request, Compute
     *        Optimizer returns recommendations that consist of Graviton2 instance types only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A <a>GetEC2RecommendationProjectedMetrics</a> request, Compute Optimizer returns projected utilization
     *        metrics for Graviton2 instance type recommendations only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A <a>ExportEC2InstanceRecommendations</a> or <a>ExportAutoScalingGroupRecommendations</a> request, Compute
     *        Optimizer exports recommendations that consist of Graviton2 instance types only.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuVendorArchitecture
     */

    public RecommendationPreferences withCpuVendorArchitectures(CpuVendorArchitecture... cpuVendorArchitectures) {
        java.util.ArrayList<String> cpuVendorArchitecturesCopy = new java.util.ArrayList<String>(cpuVendorArchitectures.length);
        for (CpuVendorArchitecture value : cpuVendorArchitectures) {
            cpuVendorArchitecturesCopy.add(value.toString());
        }
        if (getCpuVendorArchitectures() == null) {
            setCpuVendorArchitectures(cpuVendorArchitecturesCopy);
        } else {
            getCpuVendorArchitectures().addAll(cpuVendorArchitecturesCopy);
        }
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
        if (getCpuVendorArchitectures() != null)
            sb.append("CpuVendorArchitectures: ").append(getCpuVendorArchitectures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationPreferences == false)
            return false;
        RecommendationPreferences other = (RecommendationPreferences) obj;
        if (other.getCpuVendorArchitectures() == null ^ this.getCpuVendorArchitectures() == null)
            return false;
        if (other.getCpuVendorArchitectures() != null && other.getCpuVendorArchitectures().equals(this.getCpuVendorArchitectures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuVendorArchitectures() == null) ? 0 : getCpuVendorArchitectures().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationPreferences clone() {
        try {
            return (RecommendationPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RecommendationPreferencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
