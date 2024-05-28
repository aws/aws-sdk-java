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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEffectiveRecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEffectiveRecommendationPreferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable preferences
     * that you might have set at the resource, account, and organization level.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the
     * <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
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
     * The provider of the external metrics recommendation preference. Considers all applicable preferences that you
     * might have set at the account and organization level.
     * </p>
     * <p>
     * If the preference is applied in the latest recommendation refresh, an object with a valid <code>source</code>
     * value appears in the response. If the preference isn't applied to the recommendations already, then this object
     * doesn't appear in the response.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the <a>GetEC2InstanceRecommendations</a>
     * actions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private ExternalMetricsPreference externalMetricsPreference;
    /**
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     */
    private String lookBackPeriod;
    /**
     * <p>
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to generate
     * rightsizing recommendations. It considers all applicable preferences that you set at the resource, account, and
     * organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     */
    private java.util.List<UtilizationPreference> utilizationPreferences;
    /**
     * <p>
     * The resource type values that are considered as candidates when generating rightsizing recommendations. This
     * object resolves any wildcard expressions and returns the effective list of candidate resource type values. It
     * also considers all applicable preferences that you set at the resource, account, and organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     */
    private java.util.List<EffectivePreferredResource> preferredResources;

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable preferences
     * that you might have set at the resource, account, and organization level.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the
     * <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable
     *        preferences that you might have set at the resource, account, and organization level.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        To validate whether the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
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
     * The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable preferences
     * that you might have set at the resource, account, and organization level.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the
     * <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable
     *         preferences that you might have set at the resource, account, and organization level.</p>
     *         <p>
     *         A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *         refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *         </p>
     *         <p>
     *         To validate whether the preference is applied to your last generated set of recommendations, review the
     *         <code>effectiveRecommendationPreferences</code> value in the response of the
     *         <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
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
     * The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable preferences
     * that you might have set at the resource, account, and organization level.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the
     * <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable
     *        preferences that you might have set at the resource, account, and organization level.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        To validate whether the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public GetEffectiveRecommendationPreferencesResult withEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        setEnhancedInfrastructureMetrics(enhancedInfrastructureMetrics);
        return this;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable preferences
     * that you might have set at the resource, account, and organization level.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the
     * <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference. Considers all applicable
     *        preferences that you might have set at the resource, account, and organization level.</p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        To validate whether the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public GetEffectiveRecommendationPreferencesResult withEnhancedInfrastructureMetrics(EnhancedInfrastructureMetrics enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics.toString();
        return this;
    }

    /**
     * <p>
     * The provider of the external metrics recommendation preference. Considers all applicable preferences that you
     * might have set at the account and organization level.
     * </p>
     * <p>
     * If the preference is applied in the latest recommendation refresh, an object with a valid <code>source</code>
     * value appears in the response. If the preference isn't applied to the recommendations already, then this object
     * doesn't appear in the response.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the <a>GetEC2InstanceRecommendations</a>
     * actions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param externalMetricsPreference
     *        The provider of the external metrics recommendation preference. Considers all applicable preferences that
     *        you might have set at the account and organization level.</p>
     *        <p>
     *        If the preference is applied in the latest recommendation refresh, an object with a valid
     *        <code>source</code> value appears in the response. If the preference isn't applied to the recommendations
     *        already, then this object doesn't appear in the response.
     *        </p>
     *        <p>
     *        To validate whether the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        <a>GetEC2InstanceRecommendations</a> actions.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">Enhanced
     *        infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public void setExternalMetricsPreference(ExternalMetricsPreference externalMetricsPreference) {
        this.externalMetricsPreference = externalMetricsPreference;
    }

    /**
     * <p>
     * The provider of the external metrics recommendation preference. Considers all applicable preferences that you
     * might have set at the account and organization level.
     * </p>
     * <p>
     * If the preference is applied in the latest recommendation refresh, an object with a valid <code>source</code>
     * value appears in the response. If the preference isn't applied to the recommendations already, then this object
     * doesn't appear in the response.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the <a>GetEC2InstanceRecommendations</a>
     * actions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return The provider of the external metrics recommendation preference. Considers all applicable preferences that
     *         you might have set at the account and organization level.</p>
     *         <p>
     *         If the preference is applied in the latest recommendation refresh, an object with a valid
     *         <code>source</code> value appears in the response. If the preference isn't applied to the recommendations
     *         already, then this object doesn't appear in the response.
     *         </p>
     *         <p>
     *         To validate whether the preference is applied to your last generated set of recommendations, review the
     *         <code>effectiveRecommendationPreferences</code> value in the response of the
     *         <a>GetEC2InstanceRecommendations</a> actions.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">Enhanced
     *         infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public ExternalMetricsPreference getExternalMetricsPreference() {
        return this.externalMetricsPreference;
    }

    /**
     * <p>
     * The provider of the external metrics recommendation preference. Considers all applicable preferences that you
     * might have set at the account and organization level.
     * </p>
     * <p>
     * If the preference is applied in the latest recommendation refresh, an object with a valid <code>source</code>
     * value appears in the response. If the preference isn't applied to the recommendations already, then this object
     * doesn't appear in the response.
     * </p>
     * <p>
     * To validate whether the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the <a>GetEC2InstanceRecommendations</a>
     * actions.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param externalMetricsPreference
     *        The provider of the external metrics recommendation preference. Considers all applicable preferences that
     *        you might have set at the account and organization level.</p>
     *        <p>
     *        If the preference is applied in the latest recommendation refresh, an object with a valid
     *        <code>source</code> value appears in the response. If the preference isn't applied to the recommendations
     *        already, then this object doesn't appear in the response.
     *        </p>
     *        <p>
     *        To validate whether the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        <a>GetEC2InstanceRecommendations</a> actions.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">Enhanced
     *        infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectiveRecommendationPreferencesResult withExternalMetricsPreference(ExternalMetricsPreference externalMetricsPreference) {
        setExternalMetricsPreference(externalMetricsPreference);
        return this;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon Web Services resource are analyzed. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     * @see LookBackPeriodPreference
     */

    public void setLookBackPeriod(String lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @return The number of days the utilization metrics of the Amazon Web Services resource are analyzed. </p>
     *         <p>
     *         To validate that the preference is applied to your last generated set of recommendations, review the
     *         <code>effectiveRecommendationPreferences</code> value in the response of the
     *         GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     * @see LookBackPeriodPreference
     */

    public String getLookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon Web Services resource are analyzed. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public GetEffectiveRecommendationPreferencesResult withLookBackPeriod(String lookBackPeriod) {
        setLookBackPeriod(lookBackPeriod);
        return this;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon Web Services resource are analyzed.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon Web Services resource are analyzed. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public GetEffectiveRecommendationPreferencesResult withLookBackPeriod(LookBackPeriodPreference lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod.toString();
        return this;
    }

    /**
     * <p>
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to generate
     * rightsizing recommendations. It considers all applicable preferences that you set at the resource, account, and
     * organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @return The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to
     *         generate rightsizing recommendations. It considers all applicable preferences that you set at the
     *         resource, account, and organization level. </p>
     *         <p>
     *         To validate that the preference is applied to your last generated set of recommendations, review the
     *         <code>effectiveRecommendationPreferences</code> value in the response of the
     *         GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     */

    public java.util.List<UtilizationPreference> getUtilizationPreferences() {
        return utilizationPreferences;
    }

    /**
     * <p>
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to generate
     * rightsizing recommendations. It considers all applicable preferences that you set at the resource, account, and
     * organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @param utilizationPreferences
     *        The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to
     *        generate rightsizing recommendations. It considers all applicable preferences that you set at the
     *        resource, account, and organization level. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
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
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to generate
     * rightsizing recommendations. It considers all applicable preferences that you set at the resource, account, and
     * organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationPreferences(java.util.Collection)} or
     * {@link #withUtilizationPreferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param utilizationPreferences
     *        The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to
     *        generate rightsizing recommendations. It considers all applicable preferences that you set at the
     *        resource, account, and organization level. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectiveRecommendationPreferencesResult withUtilizationPreferences(UtilizationPreference... utilizationPreferences) {
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
     * The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to generate
     * rightsizing recommendations. It considers all applicable preferences that you set at the resource, account, and
     * organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @param utilizationPreferences
     *        The resource’s CPU and memory utilization preferences, such as threshold and headroom, that were used to
     *        generate rightsizing recommendations. It considers all applicable preferences that you set at the
     *        resource, account, and organization level. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectiveRecommendationPreferencesResult withUtilizationPreferences(java.util.Collection<UtilizationPreference> utilizationPreferences) {
        setUtilizationPreferences(utilizationPreferences);
        return this;
    }

    /**
     * <p>
     * The resource type values that are considered as candidates when generating rightsizing recommendations. This
     * object resolves any wildcard expressions and returns the effective list of candidate resource type values. It
     * also considers all applicable preferences that you set at the resource, account, and organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @return The resource type values that are considered as candidates when generating rightsizing recommendations.
     *         This object resolves any wildcard expressions and returns the effective list of candidate resource type
     *         values. It also considers all applicable preferences that you set at the resource, account, and
     *         organization level. </p>
     *         <p>
     *         To validate that the preference is applied to your last generated set of recommendations, review the
     *         <code>effectiveRecommendationPreferences</code> value in the response of the
     *         GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     */

    public java.util.List<EffectivePreferredResource> getPreferredResources() {
        return preferredResources;
    }

    /**
     * <p>
     * The resource type values that are considered as candidates when generating rightsizing recommendations. This
     * object resolves any wildcard expressions and returns the effective list of candidate resource type values. It
     * also considers all applicable preferences that you set at the resource, account, and organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @param preferredResources
     *        The resource type values that are considered as candidates when generating rightsizing recommendations.
     *        This object resolves any wildcard expressions and returns the effective list of candidate resource type
     *        values. It also considers all applicable preferences that you set at the resource, account, and
     *        organization level. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
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
     * The resource type values that are considered as candidates when generating rightsizing recommendations. This
     * object resolves any wildcard expressions and returns the effective list of candidate resource type values. It
     * also considers all applicable preferences that you set at the resource, account, and organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreferredResources(java.util.Collection)} or {@link #withPreferredResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param preferredResources
     *        The resource type values that are considered as candidates when generating rightsizing recommendations.
     *        This object resolves any wildcard expressions and returns the effective list of candidate resource type
     *        values. It also considers all applicable preferences that you set at the resource, account, and
     *        organization level. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectiveRecommendationPreferencesResult withPreferredResources(EffectivePreferredResource... preferredResources) {
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
     * The resource type values that are considered as candidates when generating rightsizing recommendations. This
     * object resolves any wildcard expressions and returns the effective list of candidate resource type values. It
     * also considers all applicable preferences that you set at the resource, account, and organization level.
     * </p>
     * <p>
     * To validate that the preference is applied to your last generated set of recommendations, review the
     * <code>effectiveRecommendationPreferences</code> value in the response of the GetAutoScalingGroupRecommendations
     * or GetEC2InstanceRecommendations actions.
     * </p>
     * 
     * @param preferredResources
     *        The resource type values that are considered as candidates when generating rightsizing recommendations.
     *        This object resolves any wildcard expressions and returns the effective list of candidate resource type
     *        values. It also considers all applicable preferences that you set at the resource, account, and
     *        organization level. </p>
     *        <p>
     *        To validate that the preference is applied to your last generated set of recommendations, review the
     *        <code>effectiveRecommendationPreferences</code> value in the response of the
     *        GetAutoScalingGroupRecommendations or GetEC2InstanceRecommendations actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectiveRecommendationPreferencesResult withPreferredResources(java.util.Collection<EffectivePreferredResource> preferredResources) {
        setPreferredResources(preferredResources);
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
        if (getEnhancedInfrastructureMetrics() != null)
            sb.append("EnhancedInfrastructureMetrics: ").append(getEnhancedInfrastructureMetrics()).append(",");
        if (getExternalMetricsPreference() != null)
            sb.append("ExternalMetricsPreference: ").append(getExternalMetricsPreference()).append(",");
        if (getLookBackPeriod() != null)
            sb.append("LookBackPeriod: ").append(getLookBackPeriod()).append(",");
        if (getUtilizationPreferences() != null)
            sb.append("UtilizationPreferences: ").append(getUtilizationPreferences()).append(",");
        if (getPreferredResources() != null)
            sb.append("PreferredResources: ").append(getPreferredResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEffectiveRecommendationPreferencesResult == false)
            return false;
        GetEffectiveRecommendationPreferencesResult other = (GetEffectiveRecommendationPreferencesResult) obj;
        if (other.getEnhancedInfrastructureMetrics() == null ^ this.getEnhancedInfrastructureMetrics() == null)
            return false;
        if (other.getEnhancedInfrastructureMetrics() != null
                && other.getEnhancedInfrastructureMetrics().equals(this.getEnhancedInfrastructureMetrics()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnhancedInfrastructureMetrics() == null) ? 0 : getEnhancedInfrastructureMetrics().hashCode());
        hashCode = prime * hashCode + ((getExternalMetricsPreference() == null) ? 0 : getExternalMetricsPreference().hashCode());
        hashCode = prime * hashCode + ((getLookBackPeriod() == null) ? 0 : getLookBackPeriod().hashCode());
        hashCode = prime * hashCode + ((getUtilizationPreferences() == null) ? 0 : getUtilizationPreferences().hashCode());
        hashCode = prime * hashCode + ((getPreferredResources() == null) ? 0 : getPreferredResources().hashCode());
        return hashCode;
    }

    @Override
    public GetEffectiveRecommendationPreferencesResult clone() {
        try {
            return (GetEffectiveRecommendationPreferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
