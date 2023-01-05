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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateServerConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServerConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the server.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The preferred strategy options for the application component. See the response from <a>GetServerStrategies</a>.
     * </p>
     */
    private StrategyOption strategyOption;

    /**
     * <p>
     * The ID of the server.
     * </p>
     * 
     * @param serverId
     *        The ID of the server.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The ID of the server.
     * </p>
     * 
     * @return The ID of the server.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The ID of the server.
     * </p>
     * 
     * @param serverId
     *        The ID of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerConfigRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The preferred strategy options for the application component. See the response from <a>GetServerStrategies</a>.
     * </p>
     * 
     * @param strategyOption
     *        The preferred strategy options for the application component. See the response from
     *        <a>GetServerStrategies</a>.
     */

    public void setStrategyOption(StrategyOption strategyOption) {
        this.strategyOption = strategyOption;
    }

    /**
     * <p>
     * The preferred strategy options for the application component. See the response from <a>GetServerStrategies</a>.
     * </p>
     * 
     * @return The preferred strategy options for the application component. See the response from
     *         <a>GetServerStrategies</a>.
     */

    public StrategyOption getStrategyOption() {
        return this.strategyOption;
    }

    /**
     * <p>
     * The preferred strategy options for the application component. See the response from <a>GetServerStrategies</a>.
     * </p>
     * 
     * @param strategyOption
     *        The preferred strategy options for the application component. See the response from
     *        <a>GetServerStrategies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerConfigRequest withStrategyOption(StrategyOption strategyOption) {
        setStrategyOption(strategyOption);
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getStrategyOption() != null)
            sb.append("StrategyOption: ").append(getStrategyOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServerConfigRequest == false)
            return false;
        UpdateServerConfigRequest other = (UpdateServerConfigRequest) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getStrategyOption() == null ^ this.getStrategyOption() == null)
            return false;
        if (other.getStrategyOption() != null && other.getStrategyOption().equals(this.getStrategyOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getStrategyOption() == null) ? 0 : getStrategyOption().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServerConfigRequest clone() {
        return (UpdateServerConfigRequest) super.clone();
    }

}
