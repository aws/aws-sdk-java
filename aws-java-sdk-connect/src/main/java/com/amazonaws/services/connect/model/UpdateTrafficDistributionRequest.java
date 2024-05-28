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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTrafficDistribution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrafficDistributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The distribution of traffic between the instance and its replica(s).
     * </p>
     */
    private TelephonyConfig telephonyConfig;
    /**
     * <p>
     * The distribution that determines which Amazon Web Services Regions should be used to sign in agents in to both
     * the instance and its replica(s).
     * </p>
     */
    private SignInConfig signInConfig;
    /**
     * <p>
     * The distribution of agents between the instance and its replica(s).
     * </p>
     */
    private AgentConfig agentConfig;

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @param id
     *        The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called
     *        in the Region where the traffic distribution group was created. The ARN must be provided if the call is
     *        from the replicated Region.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @return The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being
     *         called in the Region where the traffic distribution group was created. The ARN must be provided if the
     *         call is from the replicated Region.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @param id
     *        The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called
     *        in the Region where the traffic distribution group was created. The ARN must be provided if the call is
     *        from the replicated Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficDistributionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replica(s).
     * </p>
     * 
     * @param telephonyConfig
     *        The distribution of traffic between the instance and its replica(s).
     */

    public void setTelephonyConfig(TelephonyConfig telephonyConfig) {
        this.telephonyConfig = telephonyConfig;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replica(s).
     * </p>
     * 
     * @return The distribution of traffic between the instance and its replica(s).
     */

    public TelephonyConfig getTelephonyConfig() {
        return this.telephonyConfig;
    }

    /**
     * <p>
     * The distribution of traffic between the instance and its replica(s).
     * </p>
     * 
     * @param telephonyConfig
     *        The distribution of traffic between the instance and its replica(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficDistributionRequest withTelephonyConfig(TelephonyConfig telephonyConfig) {
        setTelephonyConfig(telephonyConfig);
        return this;
    }

    /**
     * <p>
     * The distribution that determines which Amazon Web Services Regions should be used to sign in agents in to both
     * the instance and its replica(s).
     * </p>
     * 
     * @param signInConfig
     *        The distribution that determines which Amazon Web Services Regions should be used to sign in agents in to
     *        both the instance and its replica(s).
     */

    public void setSignInConfig(SignInConfig signInConfig) {
        this.signInConfig = signInConfig;
    }

    /**
     * <p>
     * The distribution that determines which Amazon Web Services Regions should be used to sign in agents in to both
     * the instance and its replica(s).
     * </p>
     * 
     * @return The distribution that determines which Amazon Web Services Regions should be used to sign in agents in to
     *         both the instance and its replica(s).
     */

    public SignInConfig getSignInConfig() {
        return this.signInConfig;
    }

    /**
     * <p>
     * The distribution that determines which Amazon Web Services Regions should be used to sign in agents in to both
     * the instance and its replica(s).
     * </p>
     * 
     * @param signInConfig
     *        The distribution that determines which Amazon Web Services Regions should be used to sign in agents in to
     *        both the instance and its replica(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficDistributionRequest withSignInConfig(SignInConfig signInConfig) {
        setSignInConfig(signInConfig);
        return this;
    }

    /**
     * <p>
     * The distribution of agents between the instance and its replica(s).
     * </p>
     * 
     * @param agentConfig
     *        The distribution of agents between the instance and its replica(s).
     */

    public void setAgentConfig(AgentConfig agentConfig) {
        this.agentConfig = agentConfig;
    }

    /**
     * <p>
     * The distribution of agents between the instance and its replica(s).
     * </p>
     * 
     * @return The distribution of agents between the instance and its replica(s).
     */

    public AgentConfig getAgentConfig() {
        return this.agentConfig;
    }

    /**
     * <p>
     * The distribution of agents between the instance and its replica(s).
     * </p>
     * 
     * @param agentConfig
     *        The distribution of agents between the instance and its replica(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficDistributionRequest withAgentConfig(AgentConfig agentConfig) {
        setAgentConfig(agentConfig);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTelephonyConfig() != null)
            sb.append("TelephonyConfig: ").append(getTelephonyConfig()).append(",");
        if (getSignInConfig() != null)
            sb.append("SignInConfig: ").append(getSignInConfig()).append(",");
        if (getAgentConfig() != null)
            sb.append("AgentConfig: ").append(getAgentConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrafficDistributionRequest == false)
            return false;
        UpdateTrafficDistributionRequest other = (UpdateTrafficDistributionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTelephonyConfig() == null ^ this.getTelephonyConfig() == null)
            return false;
        if (other.getTelephonyConfig() != null && other.getTelephonyConfig().equals(this.getTelephonyConfig()) == false)
            return false;
        if (other.getSignInConfig() == null ^ this.getSignInConfig() == null)
            return false;
        if (other.getSignInConfig() != null && other.getSignInConfig().equals(this.getSignInConfig()) == false)
            return false;
        if (other.getAgentConfig() == null ^ this.getAgentConfig() == null)
            return false;
        if (other.getAgentConfig() != null && other.getAgentConfig().equals(this.getAgentConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTelephonyConfig() == null) ? 0 : getTelephonyConfig().hashCode());
        hashCode = prime * hashCode + ((getSignInConfig() == null) ? 0 : getSignInConfig().hashCode());
        hashCode = prime * hashCode + ((getAgentConfig() == null) ? 0 : getAgentConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrafficDistributionRequest clone() {
        return (UpdateTrafficDistributionRequest) super.clone();
    }

}
