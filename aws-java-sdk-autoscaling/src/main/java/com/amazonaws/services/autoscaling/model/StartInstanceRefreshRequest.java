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
     * A rolling update helps you update your instances gradually. A rolling update can fail due to failed health checks
     * or if instances are on standby or are protected from scale in. If the rolling update process fails, any instances
     * that are replaced are not rolled back to their previous configuration.
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * The desired configuration. For example, the desired configuration can specify a new launch template or a new
     * version of the current launch template.
     * </p>
     * <p>
     * Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling group to
     * reflect the new desired configuration.
     * </p>
     * <note>
     * <p>
     * When you specify a new launch template or a new version of the current launch template for your desired
     * configuration, consider enabling the <code>SkipMatching</code> property in preferences. If it's enabled, Amazon
     * EC2 Auto Scaling skips replacing instances that already use the specified launch template and version. This can
     * help you reduce the number of replacements that are required to apply updates.
     * </p>
     * </note>
     */
    private DesiredConfiguration desiredConfiguration;
    /**
     * <p>
     * Set of preferences associated with the instance refresh request. If not provided, the default values are used.
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
     * A rolling update helps you update your instances gradually. A rolling update can fail due to failed health checks
     * or if instances are on standby or are protected from scale in. If the rolling update process fails, any instances
     * that are replaced are not rolled back to their previous configuration.
     * </p>
     * 
     * @param strategy
     *        The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.</p>
     *        <p>
     *        A rolling update helps you update your instances gradually. A rolling update can fail due to failed health
     *        checks or if instances are on standby or are protected from scale in. If the rolling update process fails,
     *        any instances that are replaced are not rolled back to their previous configuration.
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
     * A rolling update helps you update your instances gradually. A rolling update can fail due to failed health checks
     * or if instances are on standby or are protected from scale in. If the rolling update process fails, any instances
     * that are replaced are not rolled back to their previous configuration.
     * </p>
     * 
     * @return The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.</p>
     *         <p>
     *         A rolling update helps you update your instances gradually. A rolling update can fail due to failed
     *         health checks or if instances are on standby or are protected from scale in. If the rolling update
     *         process fails, any instances that are replaced are not rolled back to their previous configuration.
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
     * A rolling update helps you update your instances gradually. A rolling update can fail due to failed health checks
     * or if instances are on standby or are protected from scale in. If the rolling update process fails, any instances
     * that are replaced are not rolled back to their previous configuration.
     * </p>
     * 
     * @param strategy
     *        The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.</p>
     *        <p>
     *        A rolling update helps you update your instances gradually. A rolling update can fail due to failed health
     *        checks or if instances are on standby or are protected from scale in. If the rolling update process fails,
     *        any instances that are replaced are not rolled back to their previous configuration.
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
     * A rolling update helps you update your instances gradually. A rolling update can fail due to failed health checks
     * or if instances are on standby or are protected from scale in. If the rolling update process fails, any instances
     * that are replaced are not rolled back to their previous configuration.
     * </p>
     * 
     * @param strategy
     *        The strategy to use for the instance refresh. The only valid value is <code>Rolling</code>.</p>
     *        <p>
     *        A rolling update helps you update your instances gradually. A rolling update can fail due to failed health
     *        checks or if instances are on standby or are protected from scale in. If the rolling update process fails,
     *        any instances that are replaced are not rolled back to their previous configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RefreshStrategy
     */

    public StartInstanceRefreshRequest withStrategy(RefreshStrategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The desired configuration. For example, the desired configuration can specify a new launch template or a new
     * version of the current launch template.
     * </p>
     * <p>
     * Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling group to
     * reflect the new desired configuration.
     * </p>
     * <note>
     * <p>
     * When you specify a new launch template or a new version of the current launch template for your desired
     * configuration, consider enabling the <code>SkipMatching</code> property in preferences. If it's enabled, Amazon
     * EC2 Auto Scaling skips replacing instances that already use the specified launch template and version. This can
     * help you reduce the number of replacements that are required to apply updates.
     * </p>
     * </note>
     * 
     * @param desiredConfiguration
     *        The desired configuration. For example, the desired configuration can specify a new launch template or a
     *        new version of the current launch template.</p>
     *        <p>
     *        Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling group
     *        to reflect the new desired configuration.
     *        </p>
     *        <note>
     *        <p>
     *        When you specify a new launch template or a new version of the current launch template for your desired
     *        configuration, consider enabling the <code>SkipMatching</code> property in preferences. If it's enabled,
     *        Amazon EC2 Auto Scaling skips replacing instances that already use the specified launch template and
     *        version. This can help you reduce the number of replacements that are required to apply updates.
     *        </p>
     */

    public void setDesiredConfiguration(DesiredConfiguration desiredConfiguration) {
        this.desiredConfiguration = desiredConfiguration;
    }

    /**
     * <p>
     * The desired configuration. For example, the desired configuration can specify a new launch template or a new
     * version of the current launch template.
     * </p>
     * <p>
     * Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling group to
     * reflect the new desired configuration.
     * </p>
     * <note>
     * <p>
     * When you specify a new launch template or a new version of the current launch template for your desired
     * configuration, consider enabling the <code>SkipMatching</code> property in preferences. If it's enabled, Amazon
     * EC2 Auto Scaling skips replacing instances that already use the specified launch template and version. This can
     * help you reduce the number of replacements that are required to apply updates.
     * </p>
     * </note>
     * 
     * @return The desired configuration. For example, the desired configuration can specify a new launch template or a
     *         new version of the current launch template.</p>
     *         <p>
     *         Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling
     *         group to reflect the new desired configuration.
     *         </p>
     *         <note>
     *         <p>
     *         When you specify a new launch template or a new version of the current launch template for your desired
     *         configuration, consider enabling the <code>SkipMatching</code> property in preferences. If it's enabled,
     *         Amazon EC2 Auto Scaling skips replacing instances that already use the specified launch template and
     *         version. This can help you reduce the number of replacements that are required to apply updates.
     *         </p>
     */

    public DesiredConfiguration getDesiredConfiguration() {
        return this.desiredConfiguration;
    }

    /**
     * <p>
     * The desired configuration. For example, the desired configuration can specify a new launch template or a new
     * version of the current launch template.
     * </p>
     * <p>
     * Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling group to
     * reflect the new desired configuration.
     * </p>
     * <note>
     * <p>
     * When you specify a new launch template or a new version of the current launch template for your desired
     * configuration, consider enabling the <code>SkipMatching</code> property in preferences. If it's enabled, Amazon
     * EC2 Auto Scaling skips replacing instances that already use the specified launch template and version. This can
     * help you reduce the number of replacements that are required to apply updates.
     * </p>
     * </note>
     * 
     * @param desiredConfiguration
     *        The desired configuration. For example, the desired configuration can specify a new launch template or a
     *        new version of the current launch template.</p>
     *        <p>
     *        Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling group
     *        to reflect the new desired configuration.
     *        </p>
     *        <note>
     *        <p>
     *        When you specify a new launch template or a new version of the current launch template for your desired
     *        configuration, consider enabling the <code>SkipMatching</code> property in preferences. If it's enabled,
     *        Amazon EC2 Auto Scaling skips replacing instances that already use the specified launch template and
     *        version. This can help you reduce the number of replacements that are required to apply updates.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInstanceRefreshRequest withDesiredConfiguration(DesiredConfiguration desiredConfiguration) {
        setDesiredConfiguration(desiredConfiguration);
        return this;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request. If not provided, the default values are used.
     * </p>
     * 
     * @param preferences
     *        Set of preferences associated with the instance refresh request. If not provided, the default values are
     *        used.
     */

    public void setPreferences(RefreshPreferences preferences) {
        this.preferences = preferences;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request. If not provided, the default values are used.
     * </p>
     * 
     * @return Set of preferences associated with the instance refresh request. If not provided, the default values are
     *         used.
     */

    public RefreshPreferences getPreferences() {
        return this.preferences;
    }

    /**
     * <p>
     * Set of preferences associated with the instance refresh request. If not provided, the default values are used.
     * </p>
     * 
     * @param preferences
     *        Set of preferences associated with the instance refresh request. If not provided, the default values are
     *        used.
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
        if (getDesiredConfiguration() != null)
            sb.append("DesiredConfiguration: ").append(getDesiredConfiguration()).append(",");
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
        if (other.getDesiredConfiguration() == null ^ this.getDesiredConfiguration() == null)
            return false;
        if (other.getDesiredConfiguration() != null && other.getDesiredConfiguration().equals(this.getDesiredConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getDesiredConfiguration() == null) ? 0 : getDesiredConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPreferences() == null) ? 0 : getPreferences().hashCode());
        return hashCode;
    }

    @Override
    public StartInstanceRefreshRequest clone() {
        return (StartInstanceRefreshRequest) super.clone();
    }

}
