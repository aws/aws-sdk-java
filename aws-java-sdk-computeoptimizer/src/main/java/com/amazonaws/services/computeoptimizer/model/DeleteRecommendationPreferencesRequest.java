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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DeleteRecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRecommendationPreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The target resource type of the recommendation preference to delete.
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
     * An object that describes the scope of the recommendation preference to delete.
     * </p>
     * <p>
     * You can delete recommendation preferences that are created at the organization level (for management accounts of
     * an organization only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private Scope scope;
    /**
     * <p>
     * The name of the recommendation preference to delete.
     * </p>
     */
    private java.util.List<String> recommendationPreferenceNames;

    /**
     * <p>
     * The target resource type of the recommendation preference to delete.
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
     *        The target resource type of the recommendation preference to delete.</p>
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
     * The target resource type of the recommendation preference to delete.
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
     * @return The target resource type of the recommendation preference to delete.</p>
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
     * The target resource type of the recommendation preference to delete.
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
     *        The target resource type of the recommendation preference to delete.</p>
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

    public DeleteRecommendationPreferencesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference to delete.
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
     *        The target resource type of the recommendation preference to delete.</p>
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

    public DeleteRecommendationPreferencesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to delete.
     * </p>
     * <p>
     * You can delete recommendation preferences that are created at the organization level (for management accounts of
     * an organization only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference to delete.</p>
     *        <p>
     *        You can delete recommendation preferences that are created at the organization level (for management
     *        accounts of an organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to delete.
     * </p>
     * <p>
     * You can delete recommendation preferences that are created at the organization level (for management accounts of
     * an organization only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return An object that describes the scope of the recommendation preference to delete.</p>
     *         <p>
     *         You can delete recommendation preferences that are created at the organization level (for management
     *         accounts of an organization only), account level, and resource level. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *         >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to delete.
     * </p>
     * <p>
     * You can delete recommendation preferences that are created at the organization level (for management accounts of
     * an organization only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference to delete.</p>
     *        <p>
     *        You can delete recommendation preferences that are created at the organization level (for management
     *        accounts of an organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecommendationPreferencesRequest withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The name of the recommendation preference to delete.
     * </p>
     * 
     * @return The name of the recommendation preference to delete.
     * @see RecommendationPreferenceName
     */

    public java.util.List<String> getRecommendationPreferenceNames() {
        return recommendationPreferenceNames;
    }

    /**
     * <p>
     * The name of the recommendation preference to delete.
     * </p>
     * 
     * @param recommendationPreferenceNames
     *        The name of the recommendation preference to delete.
     * @see RecommendationPreferenceName
     */

    public void setRecommendationPreferenceNames(java.util.Collection<String> recommendationPreferenceNames) {
        if (recommendationPreferenceNames == null) {
            this.recommendationPreferenceNames = null;
            return;
        }

        this.recommendationPreferenceNames = new java.util.ArrayList<String>(recommendationPreferenceNames);
    }

    /**
     * <p>
     * The name of the recommendation preference to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationPreferenceNames(java.util.Collection)} or
     * {@link #withRecommendationPreferenceNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationPreferenceNames
     *        The name of the recommendation preference to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPreferenceName
     */

    public DeleteRecommendationPreferencesRequest withRecommendationPreferenceNames(String... recommendationPreferenceNames) {
        if (this.recommendationPreferenceNames == null) {
            setRecommendationPreferenceNames(new java.util.ArrayList<String>(recommendationPreferenceNames.length));
        }
        for (String ele : recommendationPreferenceNames) {
            this.recommendationPreferenceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the recommendation preference to delete.
     * </p>
     * 
     * @param recommendationPreferenceNames
     *        The name of the recommendation preference to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPreferenceName
     */

    public DeleteRecommendationPreferencesRequest withRecommendationPreferenceNames(java.util.Collection<String> recommendationPreferenceNames) {
        setRecommendationPreferenceNames(recommendationPreferenceNames);
        return this;
    }

    /**
     * <p>
     * The name of the recommendation preference to delete.
     * </p>
     * 
     * @param recommendationPreferenceNames
     *        The name of the recommendation preference to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPreferenceName
     */

    public DeleteRecommendationPreferencesRequest withRecommendationPreferenceNames(RecommendationPreferenceName... recommendationPreferenceNames) {
        java.util.ArrayList<String> recommendationPreferenceNamesCopy = new java.util.ArrayList<String>(recommendationPreferenceNames.length);
        for (RecommendationPreferenceName value : recommendationPreferenceNames) {
            recommendationPreferenceNamesCopy.add(value.toString());
        }
        if (getRecommendationPreferenceNames() == null) {
            setRecommendationPreferenceNames(recommendationPreferenceNamesCopy);
        } else {
            getRecommendationPreferenceNames().addAll(recommendationPreferenceNamesCopy);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getRecommendationPreferenceNames() != null)
            sb.append("RecommendationPreferenceNames: ").append(getRecommendationPreferenceNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRecommendationPreferencesRequest == false)
            return false;
        DeleteRecommendationPreferencesRequest other = (DeleteRecommendationPreferencesRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getRecommendationPreferenceNames() == null ^ this.getRecommendationPreferenceNames() == null)
            return false;
        if (other.getRecommendationPreferenceNames() != null
                && other.getRecommendationPreferenceNames().equals(this.getRecommendationPreferenceNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getRecommendationPreferenceNames() == null) ? 0 : getRecommendationPreferenceNames().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRecommendationPreferencesRequest clone() {
        return (DeleteRecommendationPreferencesRequest) super.clone();
    }

}
