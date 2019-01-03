/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration settings of a canary deployment.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanarySettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percent (0-100) of traffic diverted to a canary deployment.
     * </p>
     */
    private Double percentTraffic;
    /**
     * <p>
     * The ID of the canary deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the
     * canary. These stage variables are represented as a string-to-string map between stage variable names and their
     * values.
     * </p>
     */
    private java.util.Map<String, String> stageVariableOverrides;
    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     * </p>
     */
    private Boolean useStageCache;

    /**
     * <p>
     * The percent (0-100) of traffic diverted to a canary deployment.
     * </p>
     * 
     * @param percentTraffic
     *        The percent (0-100) of traffic diverted to a canary deployment.
     */

    public void setPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
    }

    /**
     * <p>
     * The percent (0-100) of traffic diverted to a canary deployment.
     * </p>
     * 
     * @return The percent (0-100) of traffic diverted to a canary deployment.
     */

    public Double getPercentTraffic() {
        return this.percentTraffic;
    }

    /**
     * <p>
     * The percent (0-100) of traffic diverted to a canary deployment.
     * </p>
     * 
     * @param percentTraffic
     *        The percent (0-100) of traffic diverted to a canary deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanarySettings withPercentTraffic(Double percentTraffic) {
        setPercentTraffic(percentTraffic);
        return this;
    }

    /**
     * <p>
     * The ID of the canary deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the canary deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the canary deployment.
     * </p>
     * 
     * @return The ID of the canary deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The ID of the canary deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the canary deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanarySettings withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the
     * canary. These stage variables are represented as a string-to-string map between stage variable names and their
     * values.
     * </p>
     * 
     * @return Stage variables overridden for a canary release deployment, including new stage variables introduced in
     *         the canary. These stage variables are represented as a string-to-string map between stage variable names
     *         and their values.
     */

    public java.util.Map<String, String> getStageVariableOverrides() {
        return stageVariableOverrides;
    }

    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the
     * canary. These stage variables are represented as a string-to-string map between stage variable names and their
     * values.
     * </p>
     * 
     * @param stageVariableOverrides
     *        Stage variables overridden for a canary release deployment, including new stage variables introduced in
     *        the canary. These stage variables are represented as a string-to-string map between stage variable names
     *        and their values.
     */

    public void setStageVariableOverrides(java.util.Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
    }

    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new stage variables introduced in the
     * canary. These stage variables are represented as a string-to-string map between stage variable names and their
     * values.
     * </p>
     * 
     * @param stageVariableOverrides
     *        Stage variables overridden for a canary release deployment, including new stage variables introduced in
     *        the canary. These stage variables are represented as a string-to-string map between stage variable names
     *        and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanarySettings withStageVariableOverrides(java.util.Map<String, String> stageVariableOverrides) {
        setStageVariableOverrides(stageVariableOverrides);
        return this;
    }

    public CanarySettings addStageVariableOverridesEntry(String key, String value) {
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

    public CanarySettings clearStageVariableOverridesEntries() {
        this.stageVariableOverrides = null;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     * </p>
     * 
     * @param useStageCache
     *        A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     */

    public void setUseStageCache(Boolean useStageCache) {
        this.useStageCache = useStageCache;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     * </p>
     * 
     * @return A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     */

    public Boolean getUseStageCache() {
        return this.useStageCache;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     * </p>
     * 
     * @param useStageCache
     *        A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanarySettings withUseStageCache(Boolean useStageCache) {
        setUseStageCache(useStageCache);
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     * </p>
     * 
     * @return A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
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

        if (obj instanceof CanarySettings == false)
            return false;
        CanarySettings other = (CanarySettings) obj;
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
    public CanarySettings clone() {
        try {
            return (CanarySettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.CanarySettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
