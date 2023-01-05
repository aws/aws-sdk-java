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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnhancedInfrastructureMetrics() == null) ? 0 : getEnhancedInfrastructureMetrics().hashCode());
        hashCode = prime * hashCode + ((getExternalMetricsPreference() == null) ? 0 : getExternalMetricsPreference().hashCode());
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
