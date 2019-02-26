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
 * The input configuration for a canary deployment.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentCanarySettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage (0.0-100.0) of traffic routed to the canary deployment.
     * </p>
     */
    private Double percentTraffic;
    /**
     * <p>
     * A stage variable overrides used for the canary release deployment. They can override existing stage variables or
     * add new stage variables for the canary release deployment. These stage variables are represented as a
     * string-to-string map between stage variable names and their values.
     * </p>
     */
    private java.util.Map<String, String> stageVariableOverrides;
    /**
     * <p>
     * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     * </p>
     */
    private Boolean useStageCache;

    /**
     * <p>
     * The percentage (0.0-100.0) of traffic routed to the canary deployment.
     * </p>
     * 
     * @param percentTraffic
     *        The percentage (0.0-100.0) of traffic routed to the canary deployment.
     */

    public void setPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
    }

    /**
     * <p>
     * The percentage (0.0-100.0) of traffic routed to the canary deployment.
     * </p>
     * 
     * @return The percentage (0.0-100.0) of traffic routed to the canary deployment.
     */

    public Double getPercentTraffic() {
        return this.percentTraffic;
    }

    /**
     * <p>
     * The percentage (0.0-100.0) of traffic routed to the canary deployment.
     * </p>
     * 
     * @param percentTraffic
     *        The percentage (0.0-100.0) of traffic routed to the canary deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentCanarySettings withPercentTraffic(Double percentTraffic) {
        setPercentTraffic(percentTraffic);
        return this;
    }

    /**
     * <p>
     * A stage variable overrides used for the canary release deployment. They can override existing stage variables or
     * add new stage variables for the canary release deployment. These stage variables are represented as a
     * string-to-string map between stage variable names and their values.
     * </p>
     * 
     * @return A stage variable overrides used for the canary release deployment. They can override existing stage
     *         variables or add new stage variables for the canary release deployment. These stage variables are
     *         represented as a string-to-string map between stage variable names and their values.
     */

    public java.util.Map<String, String> getStageVariableOverrides() {
        return stageVariableOverrides;
    }

    /**
     * <p>
     * A stage variable overrides used for the canary release deployment. They can override existing stage variables or
     * add new stage variables for the canary release deployment. These stage variables are represented as a
     * string-to-string map between stage variable names and their values.
     * </p>
     * 
     * @param stageVariableOverrides
     *        A stage variable overrides used for the canary release deployment. They can override existing stage
     *        variables or add new stage variables for the canary release deployment. These stage variables are
     *        represented as a string-to-string map between stage variable names and their values.
     */

    public void setStageVariableOverrides(java.util.Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
    }

    /**
     * <p>
     * A stage variable overrides used for the canary release deployment. They can override existing stage variables or
     * add new stage variables for the canary release deployment. These stage variables are represented as a
     * string-to-string map between stage variable names and their values.
     * </p>
     * 
     * @param stageVariableOverrides
     *        A stage variable overrides used for the canary release deployment. They can override existing stage
     *        variables or add new stage variables for the canary release deployment. These stage variables are
     *        represented as a string-to-string map between stage variable names and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentCanarySettings withStageVariableOverrides(java.util.Map<String, String> stageVariableOverrides) {
        setStageVariableOverrides(stageVariableOverrides);
        return this;
    }

    public DeploymentCanarySettings addStageVariableOverridesEntry(String key, String value) {
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

    public DeploymentCanarySettings clearStageVariableOverridesEntries() {
        this.stageVariableOverrides = null;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     * </p>
     * 
     * @param useStageCache
     *        A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     */

    public void setUseStageCache(Boolean useStageCache) {
        this.useStageCache = useStageCache;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     * </p>
     * 
     * @return A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     */

    public Boolean getUseStageCache() {
        return this.useStageCache;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     * </p>
     * 
     * @param useStageCache
     *        A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentCanarySettings withUseStageCache(Boolean useStageCache) {
        setUseStageCache(useStageCache);
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     * </p>
     * 
     * @return A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
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

        if (obj instanceof DeploymentCanarySettings == false)
            return false;
        DeploymentCanarySettings other = (DeploymentCanarySettings) obj;
        if (other.getPercentTraffic() == null ^ this.getPercentTraffic() == null)
            return false;
        if (other.getPercentTraffic() != null && other.getPercentTraffic().equals(this.getPercentTraffic()) == false)
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
        hashCode = prime * hashCode + ((getStageVariableOverrides() == null) ? 0 : getStageVariableOverrides().hashCode());
        hashCode = prime * hashCode + ((getUseStageCache() == null) ? 0 : getUseStageCache().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentCanarySettings clone() {
        try {
            return (DeploymentCanarySettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.DeploymentCanarySettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
