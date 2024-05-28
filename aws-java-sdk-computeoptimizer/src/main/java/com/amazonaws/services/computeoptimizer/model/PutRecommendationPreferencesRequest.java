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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/PutRecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecommendationPreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     */
    private String resourceType;
    /**
     * <p>
     * An object that describes the scope of the recommendation preference to create.
     * </p>
     * <p>
     * You can create recommendation preferences at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You
     * can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope
     * name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This
     * will configure the preference for all instances that are part of the specified Auto Scaling group. You also
     * cannot create recommendation preferences at the resource level for instances that are part of an Auto Scaling
     * group. You can create recommendation preferences at the resource level only for standalone instances.
     * </p>
     * </note>
     */
    private Scope scope;
    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to deactivate
     * the preference.
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
     * The status of the inferred workload types recommendation preference to create or update.
     * </p>
     * <note>
     * <p>
     * The inferred workload type feature is active by default. To deactivate it, create a recommendation preference.
     * </p>
     * </note>
     * <p>
     * Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to activate
     * it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred workload
     * types</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private String inferredWorkloadTypes;
    /**
     * <p>
     * The provider of the external metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify a valid provider in the <code>source</code> field to activate the preference. To delete this preference,
     * see the <a>DeleteRecommendationPreferences</a> action.
     * </p>
     * <p>
     * This preference can only be set for the <code>Ec2Instance</code> resource type.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">External metrics
     * ingestion</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private ExternalMetricsPreference externalMetricsPreference;
    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     */
    private String lookBackPeriod;
    /**
     * <p>
     * The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     * utilization headroom. When this preference isn't specified, we use the following default values.
     * </p>
     * <p>
     * CPU utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P99_5</code> for threshold
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Memory utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The threshold setting isn’t available for memory utilization.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.List<UtilizationPreference> utilizationPreferences;
    /**
     * <p>
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * You can specify this preference as a combination of include and exclude lists. You must specify either an
     * <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set of resource type values,
     * an error occurs.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     */
    private java.util.List<PreferredResource> preferredResources;
    /**
     * <p>
     * The status of the savings estimation mode preference to create or update.
     * </p>
     * <p>
     * Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     * <code>BeforeDiscounts</code> to deactivate the preference.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings estimation
     * mode</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private String savingsEstimationMode;

    /**
     * <p>
     * The target resource type of the recommendation preference to create.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     *        </p>
     *        <note>
     *        <p>
     *        The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     *        </p>
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
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     * 
     * @return The target resource type of the recommendation preference to create.</p>
     *         <p>
     *         The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *         Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *         Auto Scaling group.
     *         </p>
     *         <note>
     *         <p>
     *         The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     *         </p>
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
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     *        </p>
     *        <note>
     *        <p>
     *        The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public PutRecommendationPreferencesRequest withResourceType(String resourceType) {
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
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference to create.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     *        </p>
     *        <note>
     *        <p>
     *        The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public PutRecommendationPreferencesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to create.
     * </p>
     * <p>
     * You can create recommendation preferences at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You
     * can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope
     * name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This
     * will configure the preference for all instances that are part of the specified Auto Scaling group. You also
     * cannot create recommendation preferences at the resource level for instances that are part of an Auto Scaling
     * group. You can create recommendation preferences at the resource level only for standalone instances.
     * </p>
     * </note>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference to create.</p>
     *        <p>
     *        You can create recommendation preferences at the organization level (for management accounts of an
     *        organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        You cannot create recommendation preferences for Auto Scaling groups at the organization and account
     *        levels. You can create recommendation preferences for Auto Scaling groups only at the resource level by
     *        specifying a scope name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon
     *        Resource Name (ARN). This will configure the preference for all instances that are part of the specified
     *        Auto Scaling group. You also cannot create recommendation preferences at the resource level for instances
     *        that are part of an Auto Scaling group. You can create recommendation preferences at the resource level
     *        only for standalone instances.
     *        </p>
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to create.
     * </p>
     * <p>
     * You can create recommendation preferences at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You
     * can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope
     * name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This
     * will configure the preference for all instances that are part of the specified Auto Scaling group. You also
     * cannot create recommendation preferences at the resource level for instances that are part of an Auto Scaling
     * group. You can create recommendation preferences at the resource level only for standalone instances.
     * </p>
     * </note>
     * 
     * @return An object that describes the scope of the recommendation preference to create.</p>
     *         <p>
     *         You can create recommendation preferences at the organization level (for management accounts of an
     *         organization only), account level, and resource level. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *         >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot create recommendation preferences for Auto Scaling groups at the organization and account
     *         levels. You can create recommendation preferences for Auto Scaling groups only at the resource level by
     *         specifying a scope name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon
     *         Resource Name (ARN). This will configure the preference for all instances that are part of the specified
     *         Auto Scaling group. You also cannot create recommendation preferences at the resource level for instances
     *         that are part of an Auto Scaling group. You can create recommendation preferences at the resource level
     *         only for standalone instances.
     *         </p>
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to create.
     * </p>
     * <p>
     * You can create recommendation preferences at the organization level (for management accounts of an organization
     * only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You cannot create recommendation preferences for Auto Scaling groups at the organization and account levels. You
     * can create recommendation preferences for Auto Scaling groups only at the resource level by specifying a scope
     * name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon Resource Name (ARN). This
     * will configure the preference for all instances that are part of the specified Auto Scaling group. You also
     * cannot create recommendation preferences at the resource level for instances that are part of an Auto Scaling
     * group. You can create recommendation preferences at the resource level only for standalone instances.
     * </p>
     * </note>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference to create.</p>
     *        <p>
     *        You can create recommendation preferences at the organization level (for management accounts of an
     *        organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        You cannot create recommendation preferences for Auto Scaling groups at the organization and account
     *        levels. You can create recommendation preferences for Auto Scaling groups only at the resource level by
     *        specifying a scope name of <code>ResourceArn</code> and a scope value of the Auto Scaling group Amazon
     *        Resource Name (ARN). This will configure the preference for all instances that are part of the specified
     *        Auto Scaling group. You also cannot create recommendation preferences at the resource level for instances
     *        that are part of an Auto Scaling group. You can create recommendation preferences at the resource level
     *        only for standalone instances.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationPreferencesRequest withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to deactivate
     * the preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference to create or update.</p>
     *        <p>
     *        Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to
     *        deactivate the preference.
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
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to deactivate
     * the preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return The status of the enhanced infrastructure metrics recommendation preference to create or update.</p>
     *         <p>
     *         Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to
     *         deactivate the preference.
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
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to deactivate
     * the preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference to create or update.</p>
     *        <p>
     *        Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to
     *        deactivate the preference.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public PutRecommendationPreferencesRequest withEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        setEnhancedInfrastructureMetrics(enhancedInfrastructureMetrics);
        return this;
    }

    /**
     * <p>
     * The status of the enhanced infrastructure metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to deactivate
     * the preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        The status of the enhanced infrastructure metrics recommendation preference to create or update.</p>
     *        <p>
     *        Specify the <code>Active</code> status to activate the preference, or specify <code>Inactive</code> to
     *        deactivate the preference.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public PutRecommendationPreferencesRequest withEnhancedInfrastructureMetrics(EnhancedInfrastructureMetrics enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics.toString();
        return this;
    }

    /**
     * <p>
     * The status of the inferred workload types recommendation preference to create or update.
     * </p>
     * <note>
     * <p>
     * The inferred workload type feature is active by default. To deactivate it, create a recommendation preference.
     * </p>
     * </note>
     * <p>
     * Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to activate
     * it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred workload
     * types</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        The status of the inferred workload types recommendation preference to create or update.</p> <note>
     *        <p>
     *        The inferred workload type feature is active by default. To deactivate it, create a recommendation
     *        preference.
     *        </p>
     *        </note>
     *        <p>
     *        Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to
     *        activate it.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred
     *        workload types</a> in the <i>Compute Optimizer User Guide</i>.
     * @see InferredWorkloadTypesPreference
     */

    public void setInferredWorkloadTypes(String inferredWorkloadTypes) {
        this.inferredWorkloadTypes = inferredWorkloadTypes;
    }

    /**
     * <p>
     * The status of the inferred workload types recommendation preference to create or update.
     * </p>
     * <note>
     * <p>
     * The inferred workload type feature is active by default. To deactivate it, create a recommendation preference.
     * </p>
     * </note>
     * <p>
     * Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to activate
     * it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred workload
     * types</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return The status of the inferred workload types recommendation preference to create or update.</p> <note>
     *         <p>
     *         The inferred workload type feature is active by default. To deactivate it, create a recommendation
     *         preference.
     *         </p>
     *         </note>
     *         <p>
     *         Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to
     *         activate it.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred
     *         workload types</a> in the <i>Compute Optimizer User Guide</i>.
     * @see InferredWorkloadTypesPreference
     */

    public String getInferredWorkloadTypes() {
        return this.inferredWorkloadTypes;
    }

    /**
     * <p>
     * The status of the inferred workload types recommendation preference to create or update.
     * </p>
     * <note>
     * <p>
     * The inferred workload type feature is active by default. To deactivate it, create a recommendation preference.
     * </p>
     * </note>
     * <p>
     * Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to activate
     * it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred workload
     * types</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        The status of the inferred workload types recommendation preference to create or update.</p> <note>
     *        <p>
     *        The inferred workload type feature is active by default. To deactivate it, create a recommendation
     *        preference.
     *        </p>
     *        </note>
     *        <p>
     *        Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to
     *        activate it.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred
     *        workload types</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadTypesPreference
     */

    public PutRecommendationPreferencesRequest withInferredWorkloadTypes(String inferredWorkloadTypes) {
        setInferredWorkloadTypes(inferredWorkloadTypes);
        return this;
    }

    /**
     * <p>
     * The status of the inferred workload types recommendation preference to create or update.
     * </p>
     * <note>
     * <p>
     * The inferred workload type feature is active by default. To deactivate it, create a recommendation preference.
     * </p>
     * </note>
     * <p>
     * Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to activate
     * it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred workload
     * types</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param inferredWorkloadTypes
     *        The status of the inferred workload types recommendation preference to create or update.</p> <note>
     *        <p>
     *        The inferred workload type feature is active by default. To deactivate it, create a recommendation
     *        preference.
     *        </p>
     *        </note>
     *        <p>
     *        Specify the <code>Inactive</code> status to deactivate the feature, or specify <code>Active</code> to
     *        activate it.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/inferred-workload-types.html">Inferred
     *        workload types</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferredWorkloadTypesPreference
     */

    public PutRecommendationPreferencesRequest withInferredWorkloadTypes(InferredWorkloadTypesPreference inferredWorkloadTypes) {
        this.inferredWorkloadTypes = inferredWorkloadTypes.toString();
        return this;
    }

    /**
     * <p>
     * The provider of the external metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify a valid provider in the <code>source</code> field to activate the preference. To delete this preference,
     * see the <a>DeleteRecommendationPreferences</a> action.
     * </p>
     * <p>
     * This preference can only be set for the <code>Ec2Instance</code> resource type.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">External metrics
     * ingestion</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param externalMetricsPreference
     *        The provider of the external metrics recommendation preference to create or update.</p>
     *        <p>
     *        Specify a valid provider in the <code>source</code> field to activate the preference. To delete this
     *        preference, see the <a>DeleteRecommendationPreferences</a> action.
     *        </p>
     *        <p>
     *        This preference can only be set for the <code>Ec2Instance</code> resource type.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">External
     *        metrics ingestion</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public void setExternalMetricsPreference(ExternalMetricsPreference externalMetricsPreference) {
        this.externalMetricsPreference = externalMetricsPreference;
    }

    /**
     * <p>
     * The provider of the external metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify a valid provider in the <code>source</code> field to activate the preference. To delete this preference,
     * see the <a>DeleteRecommendationPreferences</a> action.
     * </p>
     * <p>
     * This preference can only be set for the <code>Ec2Instance</code> resource type.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">External metrics
     * ingestion</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return The provider of the external metrics recommendation preference to create or update.</p>
     *         <p>
     *         Specify a valid provider in the <code>source</code> field to activate the preference. To delete this
     *         preference, see the <a>DeleteRecommendationPreferences</a> action.
     *         </p>
     *         <p>
     *         This preference can only be set for the <code>Ec2Instance</code> resource type.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">External
     *         metrics ingestion</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public ExternalMetricsPreference getExternalMetricsPreference() {
        return this.externalMetricsPreference;
    }

    /**
     * <p>
     * The provider of the external metrics recommendation preference to create or update.
     * </p>
     * <p>
     * Specify a valid provider in the <code>source</code> field to activate the preference. To delete this preference,
     * see the <a>DeleteRecommendationPreferences</a> action.
     * </p>
     * <p>
     * This preference can only be set for the <code>Ec2Instance</code> resource type.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">External metrics
     * ingestion</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param externalMetricsPreference
     *        The provider of the external metrics recommendation preference to create or update.</p>
     *        <p>
     *        Specify a valid provider in the <code>source</code> field to activate the preference. To delete this
     *        preference, see the <a>DeleteRecommendationPreferences</a> action.
     *        </p>
     *        <p>
     *        This preference can only be set for the <code>Ec2Instance</code> resource type.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/external-metrics-ingestion.html">External
     *        metrics ingestion</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationPreferencesRequest withExternalMetricsPreference(ExternalMetricsPreference externalMetricsPreference) {
        setExternalMetricsPreference(externalMetricsPreference);
        return this;
    }

    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     * 
     * @param lookBackPeriod
     *        The preference to control the number of days the utilization metrics of the Amazon Web Services resource
     *        are analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>. </p>
     *        <note>
     *        <p>
     *        You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     *        </p>
     * @see LookBackPeriodPreference
     */

    public void setLookBackPeriod(String lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod;
    }

    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     * 
     * @return The preference to control the number of days the utilization metrics of the Amazon Web Services resource
     *         are analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>. </p>
     *         <note>
     *         <p>
     *         You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     *         </p>
     * @see LookBackPeriodPreference
     */

    public String getLookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     * 
     * @param lookBackPeriod
     *        The preference to control the number of days the utilization metrics of the Amazon Web Services resource
     *        are analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>. </p>
     *        <note>
     *        <p>
     *        You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public PutRecommendationPreferencesRequest withLookBackPeriod(String lookBackPeriod) {
        setLookBackPeriod(lookBackPeriod);
        return this;
    }

    /**
     * <p>
     * The preference to control the number of days the utilization metrics of the Amazon Web Services resource are
     * analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     * 
     * @param lookBackPeriod
     *        The preference to control the number of days the utilization metrics of the Amazon Web Services resource
     *        are analyzed. When this preference isn't specified, we use the default value <code>DAYS_14</code>. </p>
     *        <note>
     *        <p>
     *        You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public PutRecommendationPreferencesRequest withLookBackPeriod(LookBackPeriodPreference lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod.toString();
        return this;
    }

    /**
     * <p>
     * The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     * utilization headroom. When this preference isn't specified, we use the following default values.
     * </p>
     * <p>
     * CPU utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P99_5</code> for threshold
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Memory utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The threshold setting isn’t available for memory utilization.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     *         utilization headroom. When this preference isn't specified, we use the following default values. </p>
     *         <p>
     *         CPU utilization:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>P99_5</code> for threshold
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PERCENT_20</code> for headroom
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Memory utilization:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PERCENT_20</code> for headroom
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <ul>
     *         <li>
     *         <p>
     *         You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The threshold setting isn’t available for memory utilization.
     *         </p>
     *         </li>
     *         </ul>
     */

    public java.util.List<UtilizationPreference> getUtilizationPreferences() {
        return utilizationPreferences;
    }

    /**
     * <p>
     * The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     * utilization headroom. When this preference isn't specified, we use the following default values.
     * </p>
     * <p>
     * CPU utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P99_5</code> for threshold
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Memory utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The threshold setting isn’t available for memory utilization.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param utilizationPreferences
     *        The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     *        utilization headroom. When this preference isn't specified, we use the following default values. </p>
     *        <p>
     *        CPU utilization:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>P99_5</code> for threshold
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT_20</code> for headroom
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Memory utilization:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PERCENT_20</code> for headroom
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The threshold setting isn’t available for memory utilization.
     *        </p>
     *        </li>
     *        </ul>
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
     * utilization headroom. When this preference isn't specified, we use the following default values.
     * </p>
     * <p>
     * CPU utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P99_5</code> for threshold
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Memory utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The threshold setting isn’t available for memory utilization.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationPreferences(java.util.Collection)} or
     * {@link #withUtilizationPreferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param utilizationPreferences
     *        The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     *        utilization headroom. When this preference isn't specified, we use the following default values. </p>
     *        <p>
     *        CPU utilization:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>P99_5</code> for threshold
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT_20</code> for headroom
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Memory utilization:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PERCENT_20</code> for headroom
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The threshold setting isn’t available for memory utilization.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationPreferencesRequest withUtilizationPreferences(UtilizationPreference... utilizationPreferences) {
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
     * utilization headroom. When this preference isn't specified, we use the following default values.
     * </p>
     * <p>
     * CPU utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P99_5</code> for threshold
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Memory utilization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PERCENT_20</code> for headroom
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The threshold setting isn’t available for memory utilization.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param utilizationPreferences
     *        The preference to control the resource’s CPU utilization threshold, CPU utilization headroom, and memory
     *        utilization headroom. When this preference isn't specified, we use the following default values. </p>
     *        <p>
     *        CPU utilization:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>P99_5</code> for threshold
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT_20</code> for headroom
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Memory utilization:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PERCENT_20</code> for headroom
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <ul>
     *        <li>
     *        <p>
     *        You can only set CPU and memory utilization preferences for the Amazon EC2 instance resource type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The threshold setting isn’t available for memory utilization.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationPreferencesRequest withUtilizationPreferences(java.util.Collection<UtilizationPreference> utilizationPreferences) {
        setUtilizationPreferences(utilizationPreferences);
        return this;
    }

    /**
     * <p>
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * You can specify this preference as a combination of include and exclude lists. You must specify either an
     * <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set of resource type values,
     * an error occurs.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     * 
     * @return The preference to control which resource type values are considered when generating rightsizing
     *         recommendations. You can specify this preference as a combination of include and exclude lists. You must
     *         specify either an <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set
     *         of resource type values, an error occurs. </p> <note>
     *         <p>
     *         You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     *         </p>
     */

    public java.util.List<PreferredResource> getPreferredResources() {
        return preferredResources;
    }

    /**
     * <p>
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * You can specify this preference as a combination of include and exclude lists. You must specify either an
     * <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set of resource type values,
     * an error occurs.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     * 
     * @param preferredResources
     *        The preference to control which resource type values are considered when generating rightsizing
     *        recommendations. You can specify this preference as a combination of include and exclude lists. You must
     *        specify either an <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set
     *        of resource type values, an error occurs. </p> <note>
     *        <p>
     *        You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     *        </p>
     */

    public void setPreferredResources(java.util.Collection<PreferredResource> preferredResources) {
        if (preferredResources == null) {
            this.preferredResources = null;
            return;
        }

        this.preferredResources = new java.util.ArrayList<PreferredResource>(preferredResources);
    }

    /**
     * <p>
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * You can specify this preference as a combination of include and exclude lists. You must specify either an
     * <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set of resource type values,
     * an error occurs.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreferredResources(java.util.Collection)} or {@link #withPreferredResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param preferredResources
     *        The preference to control which resource type values are considered when generating rightsizing
     *        recommendations. You can specify this preference as a combination of include and exclude lists. You must
     *        specify either an <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set
     *        of resource type values, an error occurs. </p> <note>
     *        <p>
     *        You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationPreferencesRequest withPreferredResources(PreferredResource... preferredResources) {
        if (this.preferredResources == null) {
            setPreferredResources(new java.util.ArrayList<PreferredResource>(preferredResources.length));
        }
        for (PreferredResource ele : preferredResources) {
            this.preferredResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The preference to control which resource type values are considered when generating rightsizing recommendations.
     * You can specify this preference as a combination of include and exclude lists. You must specify either an
     * <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set of resource type values,
     * an error occurs.
     * </p>
     * <note>
     * <p>
     * You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     * </p>
     * </note>
     * 
     * @param preferredResources
     *        The preference to control which resource type values are considered when generating rightsizing
     *        recommendations. You can specify this preference as a combination of include and exclude lists. You must
     *        specify either an <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set
     *        of resource type values, an error occurs. </p> <note>
     *        <p>
     *        You can only set this preference for the Amazon EC2 instance and Auto Scaling group resource types.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecommendationPreferencesRequest withPreferredResources(java.util.Collection<PreferredResource> preferredResources) {
        setPreferredResources(preferredResources);
        return this;
    }

    /**
     * <p>
     * The status of the savings estimation mode preference to create or update.
     * </p>
     * <p>
     * Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     * <code>BeforeDiscounts</code> to deactivate the preference.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings estimation
     * mode</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param savingsEstimationMode
     *        The status of the savings estimation mode preference to create or update. </p>
     *        <p>
     *        Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     *        <code>BeforeDiscounts</code> to deactivate the preference.
     *        </p>
     *        <p>
     *        Only the account manager or delegated administrator of your organization can activate this preference.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings
     *        estimation mode</a> in the <i>Compute Optimizer User Guide</i>.
     * @see SavingsEstimationMode
     */

    public void setSavingsEstimationMode(String savingsEstimationMode) {
        this.savingsEstimationMode = savingsEstimationMode;
    }

    /**
     * <p>
     * The status of the savings estimation mode preference to create or update.
     * </p>
     * <p>
     * Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     * <code>BeforeDiscounts</code> to deactivate the preference.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings estimation
     * mode</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return The status of the savings estimation mode preference to create or update. </p>
     *         <p>
     *         Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     *         <code>BeforeDiscounts</code> to deactivate the preference.
     *         </p>
     *         <p>
     *         Only the account manager or delegated administrator of your organization can activate this preference.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings
     *         estimation mode</a> in the <i>Compute Optimizer User Guide</i>.
     * @see SavingsEstimationMode
     */

    public String getSavingsEstimationMode() {
        return this.savingsEstimationMode;
    }

    /**
     * <p>
     * The status of the savings estimation mode preference to create or update.
     * </p>
     * <p>
     * Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     * <code>BeforeDiscounts</code> to deactivate the preference.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings estimation
     * mode</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param savingsEstimationMode
     *        The status of the savings estimation mode preference to create or update. </p>
     *        <p>
     *        Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     *        <code>BeforeDiscounts</code> to deactivate the preference.
     *        </p>
     *        <p>
     *        Only the account manager or delegated administrator of your organization can activate this preference.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings
     *        estimation mode</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsEstimationMode
     */

    public PutRecommendationPreferencesRequest withSavingsEstimationMode(String savingsEstimationMode) {
        setSavingsEstimationMode(savingsEstimationMode);
        return this;
    }

    /**
     * <p>
     * The status of the savings estimation mode preference to create or update.
     * </p>
     * <p>
     * Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     * <code>BeforeDiscounts</code> to deactivate the preference.
     * </p>
     * <p>
     * Only the account manager or delegated administrator of your organization can activate this preference.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings estimation
     * mode</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param savingsEstimationMode
     *        The status of the savings estimation mode preference to create or update. </p>
     *        <p>
     *        Specify the <code>AfterDiscounts</code> status to activate the preference, or specify
     *        <code>BeforeDiscounts</code> to deactivate the preference.
     *        </p>
     *        <p>
     *        Only the account manager or delegated administrator of your organization can activate this preference.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/savings-estimation-mode.html"> Savings
     *        estimation mode</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsEstimationMode
     */

    public PutRecommendationPreferencesRequest withSavingsEstimationMode(SavingsEstimationMode savingsEstimationMode) {
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
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

        if (obj instanceof PutRecommendationPreferencesRequest == false)
            return false;
        PutRecommendationPreferencesRequest other = (PutRecommendationPreferencesRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
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

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
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
    public PutRecommendationPreferencesRequest clone() {
        return (PutRecommendationPreferencesRequest) super.clone();
    }

}
