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
 * Describes a recommendation preference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RecommendationPreferencesDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationPreferencesDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that describes the scope of the recommendation preference.
     * </p>
     * <p>
     * Recommendation preferences can be created at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private Scope scope;
    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
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
     * The status of the inferred workload types recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
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
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. If the preference isn’t set, this object is null.
     * </p>
     */
    private String lookBackPeriod;
    /**
     * <p>
     * The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     * utilization headroom. If the preference isn’t set, this object is null.
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
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * This object resolves any wildcard expressions and returns the effective list of candidate resource type values.
     * If the preference isn’t set, this object is null.
     * </p>
     */
    private java.util.List<EffectivePreferredResource> preferredResources;
    /**
     * <p>
     * Describes the savings estimation mode used for calculating savings opportunity.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     */
    private String savingsEstimationMode;

    /**
     * <p>
     * An object that describes the scope of the recommendation preference.
     * </p>
     * <p>
     * Recommendation preferences can be created at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference.</p>
     *        <p>
     *        Recommendation preferences can be created at the organization level (for management accounts of an
     *        organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference.
     * </p>
     * <p>
     * Recommendation preferences can be created at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return An object that describes the scope of the recommendation preference.</p>
     *         <p>
     *         Recommendation preferences can be created at the organization level (for management accounts of an
     *         organization only), account level, and resource level. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *         >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference.
     * </p>
     * <p>
     * Recommendation preferences can be created at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference.</p>
     *        <p>
     *        Recommendation preferences can be created at the organization level (for management accounts of an
     *        organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationPreferencesDetail withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * 
     * @return The target resource type of the recommendation preference to create.</p>
     *         <p>
     *         The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *         Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *         Auto Scaling group.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecommendationPreferencesDetail withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecommendationPreferencesDetail withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference.</p>
     *        <p>
     *        When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference
     *        is applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference
     *        isn't yet applied to recommendations.
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
     * The status of the enhanced infrastructure metrics recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return The status of the enhanced infrastructure metrics recommendation preference.</p>
     *         <p>
     *         When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference
     *         is applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference
     *         isn't yet applied to recommendations.
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
     * The status of the enhanced infrastructure metrics recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference.</p>
     *        <p>
     *        When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference
     *        is applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference
     *        isn't yet applied to recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public RecommendationPreferencesDetail withEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        setEnhancedInfrastructureMetrics(enhancedInfrastructureMetrics);
        return this;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference.</p>
     *        <p>
     *        When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference
     *        is applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference
     *        isn't yet applied to recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public RecommendationPreferencesDetail withEnhancedInfrastructureMetrics(EnhancedInfrastructureMetrics enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics.toString();
        return this;
    }

    /**
     * <p>
     * The status of the inferred workload types recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        The status of the inferred workload types recommendation preference.</p>
     *        <p>
     *        When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference
     *        is applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference
     *        isn't yet applied to recommendations.
     * @see InferredWorkloadTypesPreference
     */

    public void setInferredWorkloadTypes(String inferredWorkloadTypes) {
        this.inferredWorkloadTypes = inferredWorkloadTypes;
    }

    /**
     * <p>
     * The status of the inferred workload types recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
     * </p>
     * 
     * @return The status of the inferred workload types recommendation preference.</p>
     *         <p>
     *         When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference
     *         is applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference
     *         isn't yet applied to recommendations.
     * @see InferredWorkloadTypesPreference
     */

    public String getInferredWorkloadTypes() {
        return this.inferredWorkloadTypes;
    }

    /**
     * <p>
     * The status of the inferred workload types recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        The status of the inferred workload types recommendation preference.</p>
     *        <p>
     *        When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference
     *        is applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference
     *        isn't yet applied to recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadTypesPreference
     */

    public RecommendationPreferencesDetail withInferredWorkloadTypes(String inferredWorkloadTypes) {
        setInferredWorkloadTypes(inferredWorkloadTypes);
        return this;
    }

    /**
     * <p>
     * The status of the inferred workload types recommendation preference.
     * </p>
     * <p>
     * When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference is
     * applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference isn't yet
     * applied to recommendations.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        The status of the inferred workload types recommendation preference.</p>
     *        <p>
     *        When the recommendations page is refreshed, a status of <code>Active</code> confirms that the preference
     *        is applied to the recommendations, and a status of <code>Inactive</code> confirms that the preference
     *        isn't yet applied to recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadTypesPreference
     */

    public RecommendationPreferencesDetail withInferredWorkloadTypes(InferredWorkloadTypesPreference inferredWorkloadTypes) {
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

    public RecommendationPreferencesDetail withExternalMetricsPreference(ExternalMetricsPreference externalMetricsPreference) {
        setExternalMetricsPreference(externalMetricsPreference);
        return this;
    }

    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. If the preference isn’t set, this object is null.
     * </p>
     * 
     * @param lookBackPeriod
     *        The preference to control the number of days the utilization metrics of the Amazon Web Services resource
     *        are analyzed. If the preference isn’t set, this object is null.
     * @see LookBackPeriodPreference
     */

    public void setLookBackPeriod(String lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod;
    }

    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. If the preference isn’t set, this object is null.
     * </p>
     * 
     * @return The preference to control the number of days the utilization metrics of the Amazon Web Services resource
     *         are analyzed. If the preference isn’t set, this object is null.
     * @see LookBackPeriodPreference
     */

    public String getLookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. If the preference isn’t set, this object is null.
     * </p>
     * 
     * @param lookBackPeriod
     *        The preference to control the number of days the utilization metrics of the Amazon Web Services resource
     *        are analyzed. If the preference isn’t set, this object is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public RecommendationPreferencesDetail withLookBackPeriod(String lookBackPeriod) {
        setLookBackPeriod(lookBackPeriod);
        return this;
    }

    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. If the preference isn’t set, this object is null.
     * </p>
     * 
     * @param lookBackPeriod
     *        The preference to control the number of days the utilization metrics of the Amazon Web Services resource
     *        are analyzed. If the preference isn’t set, this object is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public RecommendationPreferencesDetail withLookBackPeriod(LookBackPeriodPreference lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod.toString();
        return this;
    }

    /**
     * <p>
     * The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     * utilization headroom. If the preference isn’t set, this object is null.
     * </p>
     * <note>
     * <p>
     * This preference is only available for the Amazon EC2 instance resource type.
     * </p>
     * </note>
     * 
     * @return The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     *         utilization headroom. If the preference isn’t set, this object is null. </p> <note>
     *         <p>
     *         This preference is only available for the Amazon EC2 instance resource type.
     *         </p>
     */

    public java.util.List<UtilizationPreference> getUtilizationPreferences() {
        return utilizationPreferences;
    }

    /**
     * <p>
     * The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     * utilization headroom. If the preference isn’t set, this object is null.
     * </p>
     * <note>
     * <p>
     * This preference is only available for the Amazon EC2 instance resource type.
     * </p>
     * </note>
     * 
     * @param utilizationPreferences
     *        The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     *        utilization headroom. If the preference isn’t set, this object is null. </p> <note>
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
     * The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     * utilization headroom. If the preference isn’t set, this object is null.
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
     *        The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     *        utilization headroom. If the preference isn’t set, this object is null. </p> <note>
     *        <p>
     *        This preference is only available for the Amazon EC2 instance resource type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationPreferencesDetail withUtilizationPreferences(UtilizationPreference... utilizationPreferences) {
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
     * The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     * utilization headroom. If the preference isn’t set, this object is null.
     * </p>
     * <note>
     * <p>
     * This preference is only available for the Amazon EC2 instance resource type.
     * </p>
     * </note>
     * 
     * @param utilizationPreferences
     *        The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     *        utilization headroom. If the preference isn’t set, this object is null. </p> <note>
     *        <p>
     *        This preference is only available for the Amazon EC2 instance resource type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationPreferencesDetail withUtilizationPreferences(java.util.Collection<UtilizationPreference> utilizationPreferences) {
        setUtilizationPreferences(utilizationPreferences);
        return this;
    }

    /**
     * <p>
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * This object resolves any wildcard expressions and returns the effective list of candidate resource type values.
     * If the preference isn’t set, this object is null.
     * </p>
     * 
     * @return The preference to control which resource type values are considered when generating rightsizing
     *         recommendations. This object resolves any wildcard expressions and returns the effective list of
     *         candidate resource type values. If the preference isn’t set, this object is null.
     */

    public java.util.List<EffectivePreferredResource> getPreferredResources() {
        return preferredResources;
    }

    /**
     * <p>
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * This object resolves any wildcard expressions and returns the effective list of candidate resource type values.
     * If the preference isn’t set, this object is null.
     * </p>
     * 
     * @param preferredResources
     *        The preference to control which resource type values are considered when generating rightsizing
     *        recommendations. This object resolves any wildcard expressions and returns the effective list of candidate
     *        resource type values. If the preference isn’t set, this object is null.
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
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * This object resolves any wildcard expressions and returns the effective list of candidate resource type values.
     * If the preference isn’t set, this object is null.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreferredResources(java.util.Collection)} or {@link #withPreferredResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param preferredResources
     *        The preference to control which resource type values are considered when generating rightsizing
     *        recommendations. This object resolves any wildcard expressions and returns the effective list of candidate
     *        resource type values. If the preference isn’t set, this object is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationPreferencesDetail withPreferredResources(EffectivePreferredResource... preferredResources) {
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
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * This object resolves any wildcard expressions and returns the effective list of candidate resource type values.
     * If the preference isn’t set, this object is null.
     * </p>
     * 
     * @param preferredResources
     *        The preference to control which resource type values are considered when generating rightsizing
     *        recommendations. This object resolves any wildcard expressions and returns the effective list of candidate
     *        resource type values. If the preference isn’t set, this object is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationPreferencesDetail withPreferredResources(java.util.Collection<EffectivePreferredResource> preferredResources) {
        setPreferredResources(preferredResources);
        return this;
    }

    /**
     * <p>
     * Describes the savings estimation mode used for calculating savings opportunity.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Describes the savings estimation mode used for calculating savings opportunity. </p>
     *        <p>
     *        Only the account manager or delegated administrator of your organization can activate this preference.
     * @see SavingsEstimationMode
     */

    public void setSavingsEstimationMode(String savingsEstimationMode) {
        this.savingsEstimationMode = savingsEstimationMode;
    }

    /**
     * <p>
     * Describes the savings estimation mode used for calculating savings opportunity.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * 
     * @return Describes the savings estimation mode used for calculating savings opportunity. </p>
     *         <p>
     *         Only the account manager or delegated administrator of your organization can activate this preference.
     * @see SavingsEstimationMode
     */

    public String getSavingsEstimationMode() {
        return this.savingsEstimationMode;
    }

    /**
     * <p>
     * Describes the savings estimation mode used for calculating savings opportunity.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Describes the savings estimation mode used for calculating savings opportunity. </p>
     *        <p>
     *        Only the account manager or delegated administrator of your organization can activate this preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsEstimationMode
     */

    public RecommendationPreferencesDetail withSavingsEstimationMode(String savingsEstimationMode) {
        setSavingsEstimationMode(savingsEstimationMode);
        return this;
    }

    /**
     * <p>
     * Describes the savings estimation mode used for calculating savings opportunity.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Describes the savings estimation mode used for calculating savings opportunity. </p>
     *        <p>
     *        Only the account manager or delegated administrator of your organization can activate this preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsEstimationMode
     */

    public RecommendationPreferencesDetail withSavingsEstimationMode(SavingsEstimationMode savingsEstimationMode) {
        this.savingsEstimationMode = savingsEstimationMode.toString();
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
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
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

        if (obj instanceof RecommendationPreferencesDetail == false)
            return false;
        RecommendationPreferencesDetail other = (RecommendationPreferencesDetail) obj;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
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

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
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
    public RecommendationPreferencesDetail clone() {
        try {
            return (RecommendationPreferencesDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RecommendationPreferencesDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
