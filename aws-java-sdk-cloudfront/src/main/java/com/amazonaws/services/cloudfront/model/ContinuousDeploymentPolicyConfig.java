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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration for a continuous deployment policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ContinuousDeploymentPolicyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinuousDeploymentPolicyConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The CloudFront domain name of the staging distribution. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     */
    private StagingDistributionDnsNames stagingDistributionDnsNames;
    /**
     * <p>
     * A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this value is
     * <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>, this policy is
     * not enabled and has no effect.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Contains the parameters for routing production traffic from your primary to staging distributions.
     * </p>
     */
    private TrafficConfig trafficConfig;

    /**
     * <p>
     * The CloudFront domain name of the staging distribution. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @param stagingDistributionDnsNames
     *        The CloudFront domain name of the staging distribution. For example:
     *        <code>d111111abcdef8.cloudfront.net</code>.
     */

    public void setStagingDistributionDnsNames(StagingDistributionDnsNames stagingDistributionDnsNames) {
        this.stagingDistributionDnsNames = stagingDistributionDnsNames;
    }

    /**
     * <p>
     * The CloudFront domain name of the staging distribution. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @return The CloudFront domain name of the staging distribution. For example:
     *         <code>d111111abcdef8.cloudfront.net</code>.
     */

    public StagingDistributionDnsNames getStagingDistributionDnsNames() {
        return this.stagingDistributionDnsNames;
    }

    /**
     * <p>
     * The CloudFront domain name of the staging distribution. For example: <code>d111111abcdef8.cloudfront.net</code>.
     * </p>
     * 
     * @param stagingDistributionDnsNames
     *        The CloudFront domain name of the staging distribution. For example:
     *        <code>d111111abcdef8.cloudfront.net</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicyConfig withStagingDistributionDnsNames(StagingDistributionDnsNames stagingDistributionDnsNames) {
        setStagingDistributionDnsNames(stagingDistributionDnsNames);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this value is
     * <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>, this policy is
     * not enabled and has no effect.
     * </p>
     * 
     * @param enabled
     *        A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this value
     *        is <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>, this
     *        policy is not enabled and has no effect.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this value is
     * <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>, this policy is
     * not enabled and has no effect.
     * </p>
     * 
     * @return A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this
     *         value is <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>,
     *         this policy is not enabled and has no effect.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this value is
     * <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>, this policy is
     * not enabled and has no effect.
     * </p>
     * 
     * @param enabled
     *        A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this value
     *        is <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>, this
     *        policy is not enabled and has no effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicyConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this value is
     * <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>, this policy is
     * not enabled and has no effect.
     * </p>
     * 
     * @return A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this
     *         value is <code>true</code>, this policy is enabled and in effect. When this value is <code>false</code>,
     *         this policy is not enabled and has no effect.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Contains the parameters for routing production traffic from your primary to staging distributions.
     * </p>
     * 
     * @param trafficConfig
     *        Contains the parameters for routing production traffic from your primary to staging distributions.
     */

    public void setTrafficConfig(TrafficConfig trafficConfig) {
        this.trafficConfig = trafficConfig;
    }

    /**
     * <p>
     * Contains the parameters for routing production traffic from your primary to staging distributions.
     * </p>
     * 
     * @return Contains the parameters for routing production traffic from your primary to staging distributions.
     */

    public TrafficConfig getTrafficConfig() {
        return this.trafficConfig;
    }

    /**
     * <p>
     * Contains the parameters for routing production traffic from your primary to staging distributions.
     * </p>
     * 
     * @param trafficConfig
     *        Contains the parameters for routing production traffic from your primary to staging distributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentPolicyConfig withTrafficConfig(TrafficConfig trafficConfig) {
        setTrafficConfig(trafficConfig);
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
        if (getStagingDistributionDnsNames() != null)
            sb.append("StagingDistributionDnsNames: ").append(getStagingDistributionDnsNames()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getTrafficConfig() != null)
            sb.append("TrafficConfig: ").append(getTrafficConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousDeploymentPolicyConfig == false)
            return false;
        ContinuousDeploymentPolicyConfig other = (ContinuousDeploymentPolicyConfig) obj;
        if (other.getStagingDistributionDnsNames() == null ^ this.getStagingDistributionDnsNames() == null)
            return false;
        if (other.getStagingDistributionDnsNames() != null && other.getStagingDistributionDnsNames().equals(this.getStagingDistributionDnsNames()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getTrafficConfig() == null ^ this.getTrafficConfig() == null)
            return false;
        if (other.getTrafficConfig() != null && other.getTrafficConfig().equals(this.getTrafficConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStagingDistributionDnsNames() == null) ? 0 : getStagingDistributionDnsNames().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getTrafficConfig() == null) ? 0 : getTrafficConfig().hashCode());
        return hashCode;
    }

    @Override
    public ContinuousDeploymentPolicyConfig clone() {
        try {
            return (ContinuousDeploymentPolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
