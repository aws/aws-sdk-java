/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about settings for canary deployment in the stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiGatewayCanarySettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayCanarySettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of traffic that is diverted to a canary deployment.
     * </p>
     */
    private Double percentTraffic;
    /**
     * <p>
     * The deployment identifier for the canary deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * Stage variables that are overridden in the canary release deployment. The variables include new stage variables
     * that are introduced in the canary.
     * </p>
     * <p>
     * Each variable is represented as a string-to-string map between the stage variable name and the variable value.
     * </p>
     */
    private java.util.Map<String, String> stageVariableOverrides;
    /**
     * <p>
     * Indicates whether the canary deployment uses the stage cache.
     * </p>
     */
    private Boolean useStageCache;

    /**
     * <p>
     * The percentage of traffic that is diverted to a canary deployment.
     * </p>
     * 
     * @param percentTraffic
     *        The percentage of traffic that is diverted to a canary deployment.
     */

    public void setPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
    }

    /**
     * <p>
     * The percentage of traffic that is diverted to a canary deployment.
     * </p>
     * 
     * @return The percentage of traffic that is diverted to a canary deployment.
     */

    public Double getPercentTraffic() {
        return this.percentTraffic;
    }

    /**
     * <p>
     * The percentage of traffic that is diverted to a canary deployment.
     * </p>
     * 
     * @param percentTraffic
     *        The percentage of traffic that is diverted to a canary deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayCanarySettings withPercentTraffic(Double percentTraffic) {
        setPercentTraffic(percentTraffic);
        return this;
    }

    /**
     * <p>
     * The deployment identifier for the canary deployment.
     * </p>
     * 
     * @param deploymentId
     *        The deployment identifier for the canary deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The deployment identifier for the canary deployment.
     * </p>
     * 
     * @return The deployment identifier for the canary deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The deployment identifier for the canary deployment.
     * </p>
     * 
     * @param deploymentId
     *        The deployment identifier for the canary deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayCanarySettings withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * Stage variables that are overridden in the canary release deployment. The variables include new stage variables
     * that are introduced in the canary.
     * </p>
     * <p>
     * Each variable is represented as a string-to-string map between the stage variable name and the variable value.
     * </p>
     * 
     * @return Stage variables that are overridden in the canary release deployment. The variables include new stage
     *         variables that are introduced in the canary.</p>
     *         <p>
     *         Each variable is represented as a string-to-string map between the stage variable name and the variable
     *         value.
     */

    public java.util.Map<String, String> getStageVariableOverrides() {
        return stageVariableOverrides;
    }

    /**
     * <p>
     * Stage variables that are overridden in the canary release deployment. The variables include new stage variables
     * that are introduced in the canary.
     * </p>
     * <p>
     * Each variable is represented as a string-to-string map between the stage variable name and the variable value.
     * </p>
     * 
     * @param stageVariableOverrides
     *        Stage variables that are overridden in the canary release deployment. The variables include new stage
     *        variables that are introduced in the canary.</p>
     *        <p>
     *        Each variable is represented as a string-to-string map between the stage variable name and the variable
     *        value.
     */

    public void setStageVariableOverrides(java.util.Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
    }

    /**
     * <p>
     * Stage variables that are overridden in the canary release deployment. The variables include new stage variables
     * that are introduced in the canary.
     * </p>
     * <p>
     * Each variable is represented as a string-to-string map between the stage variable name and the variable value.
     * </p>
     * 
     * @param stageVariableOverrides
     *        Stage variables that are overridden in the canary release deployment. The variables include new stage
     *        variables that are introduced in the canary.</p>
     *        <p>
     *        Each variable is represented as a string-to-string map between the stage variable name and the variable
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayCanarySettings withStageVariableOverrides(java.util.Map<String, String> stageVariableOverrides) {
        setStageVariableOverrides(stageVariableOverrides);
        return this;
    }

    /**
     * Add a single StageVariableOverrides entry
     *
     * @see AwsApiGatewayCanarySettings#withStageVariableOverrides
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayCanarySettings addStageVariableOverridesEntry(String key, String value) {
        if (null == this.stageVariableOverrides) {
            this.stageVariableOverrides = new java.util.HashMap<String, String>();
        }
        if (this.stageVariableOverrides.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.stageVariableOverrides.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StageVariableOverrides.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayCanarySettings clearStageVariableOverridesEntries() {
        this.stageVariableOverrides = null;
        return this;
    }

    /**
     * <p>
     * Indicates whether the canary deployment uses the stage cache.
     * </p>
     * 
     * @param useStageCache
     *        Indicates whether the canary deployment uses the stage cache.
     */

    public void setUseStageCache(Boolean useStageCache) {
        this.useStageCache = useStageCache;
    }

    /**
     * <p>
     * Indicates whether the canary deployment uses the stage cache.
     * </p>
     * 
     * @return Indicates whether the canary deployment uses the stage cache.
     */

    public Boolean getUseStageCache() {
        return this.useStageCache;
    }

    /**
     * <p>
     * Indicates whether the canary deployment uses the stage cache.
     * </p>
     * 
     * @param useStageCache
     *        Indicates whether the canary deployment uses the stage cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayCanarySettings withUseStageCache(Boolean useStageCache) {
        setUseStageCache(useStageCache);
        return this;
    }

    /**
     * <p>
     * Indicates whether the canary deployment uses the stage cache.
     * </p>
     * 
     * @return Indicates whether the canary deployment uses the stage cache.
     */

    public Boolean isUseStageCache() {
        return this.useStageCache;
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
        if (getPercentTraffic() != null)
            sb.append("PercentTraffic: ").append(getPercentTraffic()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getStageVariableOverrides() != null)
            sb.append("StageVariableOverrides: ").append(getStageVariableOverrides()).append(",");
        if (getUseStageCache() != null)
            sb.append("UseStageCache: ").append(getUseStageCache());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiGatewayCanarySettings == false)
            return false;
        AwsApiGatewayCanarySettings other = (AwsApiGatewayCanarySettings) obj;
        if (other.getPercentTraffic() == null ^ this.getPercentTraffic() == null)
            return false;
        if (other.getPercentTraffic() != null && other.getPercentTraffic().equals(this.getPercentTraffic()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getStageVariableOverrides() == null ^ this.getStageVariableOverrides() == null)
            return false;
        if (other.getStageVariableOverrides() != null && other.getStageVariableOverrides().equals(this.getStageVariableOverrides()) == false)
            return false;
        if (other.getUseStageCache() == null ^ this.getUseStageCache() == null)
            return false;
        if (other.getUseStageCache() != null && other.getUseStageCache().equals(this.getUseStageCache()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentTraffic() == null) ? 0 : getPercentTraffic().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getStageVariableOverrides() == null) ? 0 : getStageVariableOverrides().hashCode());
        hashCode = prime * hashCode + ((getUseStageCache() == null) ? 0 : getUseStageCache().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiGatewayCanarySettings clone() {
        try {
            return (AwsApiGatewayCanarySettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiGatewayCanarySettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
