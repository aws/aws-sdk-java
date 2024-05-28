/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     */
    private String lookBackPeriod;
    /**
     * <p>
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to generate
     * rightsizing recommendations.
     * </p>
     * <note>
     * <p>
     * This preference is only available for the Amazon EC2 instance resource type.
     * </p>
     * </note>
     */
    private java.util.List<UtilizationPreference> utilizationPreferences;
    /**
     * <p>
     * The resource type values that are considered as candidates when generating rightsizing recommendations.
     * </p>
     */
    private java.util.List<EffectivePreferredResource> preferredResources;
    /**
     * <p>
     * Describes the savings estimation mode applied for calculating savings opportunity for a resource.
     * </p>
     */
    private InstanceSavingsEstimationMode savingsEstimationMode;

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
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * @see LookBackPeriodPreference
     */

    public void setLookBackPeriod(String lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * 
     * @return The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * @see LookBackPeriodPreference
     */

    public String getLookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public EffectiveRecommendationPreferences withLookBackPeriod(String lookBackPeriod) {
        setLookBackPeriod(lookBackPeriod);
        return this;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public EffectiveRecommendationPreferences withLookBackPeriod(LookBackPeriodPreference lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod.toString();
        return this;
    }

    /**
     * <p>
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to generate
     * rightsizing recommendations.
     * </p>
     * <note>
     * <p>
     * This preference is only available for the Amazon EC2 instance resource type.
     * </p>
     * </note>
     * 
     * @return The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to
     *         generate rightsizing recommendations. </p> <note>
     *         <p>
     *         This preference is only available for the Amazon EC2 instance resource type.
     *         </p>
     */

    public java.util.List<UtilizationPreference> getUtilizationPreferences() {
        return utilizationPreferences;
    }

    /**
     * <p>
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to generate
     * rightsizing recommendations.
     * </p>
     * <note>
     * <p>
     * This preference is only available for the Amazon EC2 instance resource type.
     * </p>
     * </note>
     * 
     * @param utilizationPreferences
     *        The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to
     *        generate rightsizing recommendations. </p> <note>
     *        <p>
     *        This preference is only available for the Amazon EC2 instance resource type.
     *        </p>
     */

    public void setUtilizationPreferences(java.util.Collection<UtilizationPreference> utilizationPreferences) {
        if (utilizationPreferences == null) {
            this.utilizationPreferences = null;
            return;
        }

        this.utilizationPreferences = new java.util.ArrayList<UtilizationPreference>(utilizationPreferences);
    }

    /**
     * <p>
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to generate
     * rightsizing recommendations.
     * </p>
     * <note>
     * <p>
     * This preference is only available for the Amazon EC2 instance resource type.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationPreferences(java.util.Collection)} or
     * {@link #withUtilizationPreferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param utilizationPreferences
     *        The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to
     *        generate rightsizing recommendations. </p> <note>
     *        <p>
     *        This preference is only available for the Amazon EC2 instance resource type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveRecommendationPreferences withUtilizationPreferences(UtilizationPreference... utilizationPreferences) {
        if (this.utilizationPreferences == null) {
            setUtilizationPreferences(new java.util.ArrayList<UtilizationPreference>(utilizationPreferences.length));
        }
        for (UtilizationPreference ele : utilizationPreferences) {
            this.utilizationPreferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to generate
     * rightsizing recommendations.
     * </p>
     * <note>
     * <p>
     * This preference is only available for the Amazon EC2 instance resource type.
     * </p>
     * </note>
     * 
     * @param utilizationPreferences
     *        The resource’s CPU and memory utilization preferences, such as threshold and headroom, that are used to
     *        generate rightsizing recommendations. </p> <note>
     *        <p>
     *        This preference is only available for the Amazon EC2 instance resource type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveRecommendationPreferences withUtilizationPreferences(java.util.Collection<UtilizationPreference> utilizationPreferences) {
        setUtilizationPreferences(utilizationPreferences);
        return this;
    }

    /**
     * <p>
     * The resource type values that are considered as candidates when generating rightsizing recommendations.
     * </p>
     * 
     * @return The resource type values that are considered as candidates when generating rightsizing recommendations.
     */

    public java.util.List<EffectivePreferredResource> getPreferredResources() {
        return preferredResources;
    }

    /**
     * <p>
     * The resource type values that are considered as candidates when generating rightsizing recommendations.
     * </p>
     * 
     * @param preferredResources
     *        The resource type values that are considered as candidates when generating rightsizing recommendations.
     */

    public void setPreferredResources(java.util.Collection<EffectivePreferredResource> preferredResources) {
        if (preferredResources == null) {
            this.preferredResources = null;
            return;
        }

        this.preferredResources = new java.util.ArrayList<EffectivePreferredResource>(preferredResources);
    }

    /**
     * <p>
     * The resource type values that are considered as candidates when generating rightsizing recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreferredResources(java.util.Collection)} or {@link #withPreferredResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param preferredResources
     *        The resource type values that are considered as candidates when generating rightsizing recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveRecommendationPreferences withPreferredResources(EffectivePreferredResource... preferredResources) {
        if (this.preferredResources == null) {
            setPreferredResources(new java.util.ArrayList<EffectivePreferredResource>(preferredResources.length));
        }
        for (EffectivePreferredResource ele : preferredResources) {
            this.preferredResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource type values that are considered as candidates when generating rightsizing recommendations.
     * </p>
     * 
     * @param preferredResources
     *        The resource type values that are considered as candidates when generating rightsizing recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveRecommendationPreferences withPreferredResources(java.util.Collection<EffectivePreferredResource> preferredResources) {
        setPreferredResources(preferredResources);
        return this;
    }

    /**
     * <p>
     * Describes the savings estimation mode applied for calculating savings opportunity for a resource.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Describes the savings estimation mode applied for calculating savings opportunity for a resource.
     */

    public void setSavingsEstimationMode(InstanceSavingsEstimationMode savingsEstimationMode) {
        this.savingsEstimationMode = savingsEstimationMode;
    }

    /**
     * <p>
     * Describes the savings estimation mode applied for calculating savings opportunity for a resource.
     * </p>
     * 
     * @return Describes the savings estimation mode applied for calculating savings opportunity for a resource.
     */

    public InstanceSavingsEstimationMode getSavingsEstimationMode() {
        return this.savingsEstimationMode;
    }

    /**
     * <p>
     * Describes the savings estimation mode applied for calculating savings opportunity for a resource.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Describes the savings estimation mode applied for calculating savings opportunity for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveRecommendationPreferences withSavingsEstimationMode(InstanceSavingsEstimationMode savingsEstimationMode) {
        setSavingsEstimationMode(savingsEstimationMode);
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
            sb.append("ExternalMetricsPreference: ").append(getExternalMetricsPreference()).append(",");
        if (getLookBackPeriod() != null)
            sb.append("LookBackPeriod: ").append(getLookBackPeriod()).append(",");
        if (getUtilizationPreferences() != null)
            sb.append("UtilizationPreferences: ").append(getUtilizationPreferences()).append(",");
        if (getPreferredResources() != null)
            sb.append("PreferredResources: ").append(getPreferredResources()).append(",");
        if (getSavingsEstimationMode() != null)
            sb.append("SavingsEstimationMode: ").append(getSavingsEstimationMode());
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
        if (other.getLookBackPeriod() == null ^ this.getLookBackPeriod() == null)
            return false;
        if (other.getLookBackPeriod() != null && other.getLookBackPeriod().equals(this.getLookBackPeriod()) == false)
            return false;
        if (other.getUtilizationPreferences() == null ^ this.getUtilizationPreferences() == null)
            return false;
        if (other.getUtilizationPreferences() != null && other.getUtilizationPreferences().equals(this.getUtilizationPreferences()) == false)
            return false;
        if (other.getPreferredResources() == null ^ this.getPreferredResources() == null)
            return false;
        if (other.getPreferredResources() != null && other.getPreferredResources().equals(this.getPreferredResources()) == false)
            return false;
        if (other.getSavingsEstimationMode() == null ^ this.getSavingsEstimationMode() == null)
            return false;
        if (other.getSavingsEstimationMode() != null && other.getSavingsEstimationMode().equals(this.getSavingsEstimationMode()) == false)
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
        hashCode = prime * hashCode + ((getLookBackPeriod() == null) ? 0 : getLookBackPeriod().hashCode());
        hashCode = prime * hashCode + ((getUtilizationPreferences() == null) ? 0 : getUtilizationPreferences().hashCode());
        hashCode = prime * hashCode + ((getPreferredResources() == null) ? 0 : getPreferredResources().hashCode());
        hashCode = prime * hashCode + ((getSavingsEstimationMode() == null) ? 0 : getSavingsEstimationMode().hashCode());
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
