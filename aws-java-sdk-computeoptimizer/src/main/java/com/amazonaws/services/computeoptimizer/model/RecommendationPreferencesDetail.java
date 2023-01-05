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
