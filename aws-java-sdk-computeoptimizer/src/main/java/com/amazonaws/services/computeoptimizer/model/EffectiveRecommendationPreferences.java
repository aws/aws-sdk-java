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
 * Describes the effective recommendation preferences for a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/EffectiveRecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectiveRecommendationPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.
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
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private String enhancedInfrastructureMetrics;
    /**
     * <p>
     * Describes the activation status of the inferred workload types preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh. A
     * status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     */
    private String inferredWorkloadTypes;
    /**
     * <p>
     * An object that describes the external metrics recommendation preference.
     * </p>
     * <p>
     * If the preference is applied in the latest recommendation refresh, an object with a valid <code>source</code>
     * value appears in the response. If the preference isn't applied to the recommendations already, then this object
     * doesn't appear in the response.
     * </p>
     */
    private ExternalMetricsPreference externalMetricsPreference;

    /**
     * <p>
     * Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.
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
     * @return Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.</p>
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
     * Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.
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
     *        Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.</p>
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
     * Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.
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
     *        Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.</p>
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

    public EffectiveRecommendationPreferences withCpuVendorArchitectures(String... cpuVendorArchitectures) {
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
     * Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.
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
     *        Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.</p>
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

    public EffectiveRecommendationPreferences withCpuVendorArchitectures(java.util.Collection<String> cpuVendorArchitectures) {
        setCpuVendorArchitectures(cpuVendorArchitectures);
        return this;
    }

    /**
     * <p>
     * Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.
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
     *        Describes the CPU vendor and architecture for an instance or Auto Scaling group recommendations.</p>
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

    public EffectiveRecommendationPreferences withCpuVendorArchitectures(CpuVendorArchitecture... cpuVendorArchitectures) {
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
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        Describes the activation status of the enhanced infrastructure metrics preference.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @see EnhancedInfrastructureMetrics
     */

    public void setEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics;
    }

    /**
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return Describes the activation status of the enhanced infrastructure metrics preference.</p>
     *         <p>
     *         A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *         refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *         >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @see EnhancedInfrastructureMetrics
     */

    public String getEnhancedInfrastructureMetrics() {
        return this.enhancedInfrastructureMetrics;
    }

    /**
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        Describes the activation status of the enhanced infrastructure metrics preference.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public EffectiveRecommendationPreferences withEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        setEnhancedInfrastructureMetrics(enhancedInfrastructureMetrics);
        return this;
    }

    /**
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        Describes the activation status of the enhanced infrastructure metrics preference.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public EffectiveRecommendationPreferences withEnhancedInfrastructureMetrics(EnhancedInfrastructureMetrics enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics.toString();
        return this;
    }

    /**
     * <p>
     * Describes the activation status of the inferred workload types preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh. A
     * status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        Describes the activation status of the inferred workload types preference.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh. A status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * @see InferredWorkloadTypesPreference
     */

    public void setInferredWorkloadTypes(String inferredWorkloadTypes) {
        this.inferredWorkloadTypes = inferredWorkloadTypes;
    }

    /**
     * <p>
     * Describes the activation status of the inferred workload types preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh. A
     * status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * 
     * @return Describes the activation status of the inferred workload types preference.</p>
     *         <p>
     *         A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *         refresh. A status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * @see InferredWorkloadTypesPreference
     */

    public String getInferredWorkloadTypes() {
        return this.inferredWorkloadTypes;
    }

    /**
     * <p>
     * Describes the activation status of the inferred workload types preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh. A
     * status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        Describes the activation status of the inferred workload types preference.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh. A status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadTypesPreference
     */

    public EffectiveRecommendationPreferences withInferredWorkloadTypes(String inferredWorkloadTypes) {
        setInferredWorkloadTypes(inferredWorkloadTypes);
        return this;
    }

    /**
     * <p>
     * Describes the activation status of the inferred workload types preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh. A
     * status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        Describes the activation status of the inferred workload types preference.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh. A status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadTypesPreference
     */

    public EffectiveRecommendationPreferences withInferredWorkloadTypes(InferredWorkloadTypesPreference inferredWorkloadTypes) {
        this.inferredWorkloadTypes = inferredWorkloadTypes.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the external metrics recommendation preference.
     * </p>
     * <p>
     * If the preference is applied in the latest recommendation refresh, an object with a valid <code>source</code>
     * value appears in the response. If the preference isn't applied to the recommendations already, then this object
     * doesn't appear in the response.
     * </p>
     * 
     * @param externalMetricsPreference
     *        An object that describes the external metrics recommendation preference. </p>
     *        <p>
     *        If the preference is applied in the latest recommendation refresh, an object with a valid
     *        <code>source</code> value appears in the response. If the preference isn't applied to the recommendations
     *        already, then this object doesn't appear in the response.
     */

    public void setExternalMetricsPreference(ExternalMetricsPreference externalMetricsPreference) {
        this.externalMetricsPreference = externalMetricsPreference;
    }

    /**
     * <p>
     * An object that describes the external metrics recommendation preference.
     * </p>
     * <p>
     * If the preference is applied in the latest recommendation refresh, an object with a valid <code>source</code>
     * value appears in the response. If the preference isn't applied to the recommendations already, then this object
     * doesn't appear in the response.
     * </p>
     * 
     * @return An object that describes the external metrics recommendation preference. </p>
     *         <p>
     *         If the preference is applied in the latest recommendation refresh, an object with a valid
     *         <code>source</code> value appears in the response. If the preference isn't applied to the recommendations
     *         already, then this object doesn't appear in the response.
     */

    public ExternalMetricsPreference getExternalMetricsPreference() {
        return this.externalMetricsPreference;
    }

    /**
     * <p>
     * An object that describes the external metrics recommendation preference.
     * </p>
     * <p>
     * If the preference is applied in the latest recommendation refresh, an object with a valid <code>source</code>
     * value appears in the response. If the preference isn't applied to the recommendations already, then this object
     * doesn't appear in the response.
     * </p>
     * 
     * @param externalMetricsPreference
     *        An object that describes the external metrics recommendation preference. </p>
     *        <p>
     *        If the preference is applied in the latest recommendation refresh, an object with a valid
     *        <code>source</code> value appears in the response. If the preference isn't applied to the recommendations
     *        already, then this object doesn't appear in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveRecommendationPreferences withExternalMetricsPreference(ExternalMetricsPreference externalMetricsPreference) {
        setExternalMetricsPreference(externalMetricsPreference);
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
            sb.append("CpuVendorArchitectures: ").append(getCpuVendorArchitectures()).append(",");
        if (getEnhancedInfrastructureMetrics() != null)
            sb.append("EnhancedInfrastructureMetrics: ").append(getEnhancedInfrastructureMetrics()).append(",");
        if (getInferredWorkloadTypes() != null)
            sb.append("InferredWorkloadTypes: ").append(getInferredWorkloadTypes()).append(",");
        if (getExternalMetricsPreference() != null)
            sb.append("ExternalMetricsPreference: ").append(getExternalMetricsPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectiveRecommendationPreferences == false)
            return false;
        EffectiveRecommendationPreferences other = (EffectiveRecommendationPreferences) obj;
        if (other.getCpuVendorArchitectures() == null ^ this.getCpuVendorArchitectures() == null)
            return false;
        if (other.getCpuVendorArchitectures() != null && other.getCpuVendorArchitectures().equals(this.getCpuVendorArchitectures()) == false)
            return false;
        if (other.getEnhancedInfrastructureMetrics() == null ^ this.getEnhancedInfrastructureMetrics() == null)
            return false;
        if (other.getEnhancedInfrastructureMetrics() != null
                && other.getEnhancedInfrastructureMetrics().equals(this.getEnhancedInfrastructureMetrics()) == false)
            return false;
        if (other.getInferredWorkloadTypes() == null ^ this.getInferredWorkloadTypes() == null)
            return false;
        if (other.getInferredWorkloadTypes() != null && other.getInferredWorkloadTypes().equals(this.getInferredWorkloadTypes()) == false)
            return false;
        if (other.getExternalMetricsPreference() == null ^ this.getExternalMetricsPreference() == null)
            return false;
        if (other.getExternalMetricsPreference() != null && other.getExternalMetricsPreference().equals(this.getExternalMetricsPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuVendorArchitectures() == null) ? 0 : getCpuVendorArchitectures().hashCode());
        hashCode = prime * hashCode + ((getEnhancedInfrastructureMetrics() == null) ? 0 : getEnhancedInfrastructureMetrics().hashCode());
        hashCode = prime * hashCode + ((getInferredWorkloadTypes() == null) ? 0 : getInferredWorkloadTypes().hashCode());
        hashCode = prime * hashCode + ((getExternalMetricsPreference() == null) ? 0 : getExternalMetricsPreference().hashCode());
        return hashCode;
    }

    @Override
    public EffectiveRecommendationPreferences clone() {
        try {
            return (EffectiveRecommendationPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.EffectiveRecommendationPreferencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
