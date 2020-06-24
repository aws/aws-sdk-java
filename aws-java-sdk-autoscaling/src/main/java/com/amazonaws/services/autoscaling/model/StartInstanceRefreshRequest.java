/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/StartInstanceRefresh" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInstanceRefreshRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto Scaling group until all instances have
     * been updated. A rolling update can fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any instances that were already replaced are not
     * rolled back to their previous configuration.
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * Set of preferences associated with the instance refresh request.
     * </p>
     * <p>
     * If not provided, the default values are used. For <code>MinHealthyPercentage</code>, the default value is
     * <code>90</code>. For <code>InstanceWarmup</code>, the default is to use the value specified for the health check
     * grace period for the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     * >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     */
    private RefreshPreferences preferences;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInstanceRefreshRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto Scaling group until all instances have
     * been updated. A rolling update can fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any instances that were already replaced are not
     * rolled back to their previous configuration.
     * </p>
     * 
     * @param strategy
     *        The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.</p>
     *        <p>
     *        A rolling update is an update that is applied to all instances in an Auto Scaling group until all
     *        instances have been updated. A rolling update can fail due to failed health checks or if instances are on
     *        standby or are protected from scale in. If the rolling update process fails, any instances that were
     *        already replaced are not rolled back to their previous configuration.
     * @see RefreshStrategy
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto Scaling group until all instances have
     * been updated. A rolling update can fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any instances that were already replaced are not
     * rolled back to their previous configuration.
     * </p>
     * 
     * @return The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.</p>
     *         <p>
     *         A rolling update is an update that is applied to all instances in an Auto Scaling group until all
     *         instances have been updated. A rolling update can fail due to failed health checks or if instances are on
     *         standby or are protected from scale in. If the rolling update process fails, any instances that were
     *         already replaced are not rolled back to their previous configuration.
     * @see RefreshStrategy
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto Scaling group until all instances have
     * been updated. A rolling update can fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any instances that were already replaced are not
     * rolled back to their previous configuration.
     * </p>
     * 
     * @param strategy
     *        The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.</p>
     *        <p>
     *        A rolling update is an update that is applied to all instances in an Auto Scaling group until all
     *        instances have been updated. A rolling update can fail due to failed health checks or if instances are on
     *        standby or are protected from scale in. If the rolling update process fails, any instances that were
     *        already replaced are not rolled back to their previous configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RefreshStrategy
     */

    public StartInstanceRefreshRequest withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.
     * </p>
     * <p>
     * A rolling update is an update that is applied to all instances in an Auto Scaling group until all instances have
     * been updated. A rolling update can fail due to failed health checks or if instances are on standby or are
     * protected from scale in. If the rolling update process fails, any instances that were already replaced are not
     * rolled back to their previous configuration.
     * </p>
     * 
     * @param strategy
     *        The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.</p>
     *        <p>
     *        A rolling update is an update that is applied to all instances in an Auto Scaling group until all
     *        instances have been updated. A rolling update can fail due to failed health checks or if instances are on
     *        standby or are protected from scale in. If the rolling update process fails, any instances that were
     *        already replaced are not rolled back to their previous configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RefreshStrategy
     */

    public StartInstanceRefreshRequest withStrategy(RefreshStrategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request.
     * </p>
     * <p>
     * If not provided, the default values are used. For <code>MinHealthyPercentage</code>, the default value is
     * <code>90</code>. For <code>InstanceWarmup</code>, the default is to use the value specified for the health check
     * grace period for the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     * >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * 
     * @param preferences
     *        Set of preferences associated with the instance refresh request.</p>
     *        <p>
     *        If not provided, the default values are used. For <code>MinHealthyPercentage</code>, the default value is
     *        <code>90</code>. For <code>InstanceWarmup</code>, the default is to use the value specified for the health
     *        check grace period for the Auto Scaling group.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     *        >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     */

    public void setPreferences(RefreshPreferences preferences) {
        this.preferences = preferences;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request.
     * </p>
     * <p>
     * If not provided, the default values are used. For <code>MinHealthyPercentage</code>, the default value is
     * <code>90</code>. For <code>InstanceWarmup</code>, the default is to use the value specified for the health check
     * grace period for the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     * >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * 
     * @return Set of preferences associated with the instance refresh request.</p>
     *         <p>
     *         If not provided, the default values are used. For <code>MinHealthyPercentage</code>, the default value is
     *         <code>90</code>. For <code>InstanceWarmup</code>, the default is to use the value specified for the
     *         health check grace period for the Auto Scaling group.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     *         >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     */

    public RefreshPreferences getPreferences() {
        return this.preferences;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request.
     * </p>
     * <p>
     * If not provided, the default values are used. For <code>MinHealthyPercentage</code>, the default value is
     * <code>90</code>. For <code>InstanceWarmup</code>, the default is to use the value specified for the health check
     * grace period for the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     * >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * 
     * @param preferences
     *        Set of preferences associated with the instance refresh request.</p>
     *        <p>
     *        If not provided, the default values are used. For <code>MinHealthyPercentage</code>, the default value is
     *        <code>90</code>. For <code>InstanceWarmup</code>, the default is to use the value specified for the health
     *        check grace period for the Auto Scaling group.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_RefreshPreferences.html"
     *        >RefreshPreferences</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInstanceRefreshRequest withPreferences(RefreshPreferences preferences) {
        setPreferences(preferences);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy()).append(",");
        if (getPreferences() != null)
            sb.append("Preferences: ").append(getPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartInstanceRefreshRequest == false)
            return false;
        StartInstanceRefreshRequest other = (StartInstanceRefreshRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getPreferences() == null ^ this.getPreferences() == null)
            return false;
        if (other.getPreferences() != null && other.getPreferences().equals(this.getPreferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode + ((getPreferences() == null) ? 0 : getPreferences().hashCode());
        return hashCode;
    }

    @Override
    public StartInstanceRefreshRequest clone() {
        return (StartInstanceRefreshRequest) super.clone();
    }

}
