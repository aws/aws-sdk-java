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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/UpdateStateMachineAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStateMachineAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias.
     * </p>
     */
    private String stateMachineAliasArn;
    /**
     * <p>
     * A description of the state machine alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The routing configuration of the state machine alias.
     * </p>
     * <p>
     * An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the alias
     * starts executions for.
     * </p>
     */
    private java.util.List<RoutingConfigurationListItem> routingConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias.
     * </p>
     * 
     * @param stateMachineAliasArn
     *        The Amazon Resource Name (ARN) of the state machine alias.
     */

    public void setStateMachineAliasArn(String stateMachineAliasArn) {
        this.stateMachineAliasArn = stateMachineAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine alias.
     */

    public String getStateMachineAliasArn() {
        return this.stateMachineAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias.
     * </p>
     * 
     * @param stateMachineAliasArn
     *        The Amazon Resource Name (ARN) of the state machine alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineAliasRequest withStateMachineAliasArn(String stateMachineAliasArn) {
        setStateMachineAliasArn(stateMachineAliasArn);
        return this;
    }

    /**
     * <p>
     * A description of the state machine alias.
     * </p>
     * 
     * @param description
     *        A description of the state machine alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the state machine alias.
     * </p>
     * 
     * @return A description of the state machine alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the state machine alias.
     * </p>
     * 
     * @param description
     *        A description of the state machine alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineAliasRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The routing configuration of the state machine alias.
     * </p>
     * <p>
     * An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the alias
     * starts executions for.
     * </p>
     * 
     * @return The routing configuration of the state machine alias.</p>
     *         <p>
     *         An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the
     *         alias starts executions for.
     */

    public java.util.List<RoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * <p>
     * The routing configuration of the state machine alias.
     * </p>
     * <p>
     * An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the alias
     * starts executions for.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of the state machine alias.</p>
     *        <p>
     *        An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the
     *        alias starts executions for.
     */

    public void setRoutingConfiguration(java.util.Collection<RoutingConfigurationListItem> routingConfiguration) {
        if (routingConfiguration == null) {
            this.routingConfiguration = null;
            return;
        }

        this.routingConfiguration = new java.util.ArrayList<RoutingConfigurationListItem>(routingConfiguration);
    }

    /**
     * <p>
     * The routing configuration of the state machine alias.
     * </p>
     * <p>
     * An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the alias
     * starts executions for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of the state machine alias.</p>
     *        <p>
     *        An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the
     *        alias starts executions for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineAliasRequest withRoutingConfiguration(RoutingConfigurationListItem... routingConfiguration) {
        if (this.routingConfiguration == null) {
            setRoutingConfiguration(new java.util.ArrayList<RoutingConfigurationListItem>(routingConfiguration.length));
        }
        for (RoutingConfigurationListItem ele : routingConfiguration) {
            this.routingConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routing configuration of the state machine alias.
     * </p>
     * <p>
     * An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the alias
     * starts executions for.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of the state machine alias.</p>
     *        <p>
     *        An array of <code>RoutingConfig</code> objects that specifies up to two state machine versions that the
     *        alias starts executions for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStateMachineAliasRequest withRoutingConfiguration(java.util.Collection<RoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
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
        if (getStateMachineAliasArn() != null)
            sb.append("StateMachineAliasArn: ").append(getStateMachineAliasArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStateMachineAliasRequest == false)
            return false;
        UpdateStateMachineAliasRequest other = (UpdateStateMachineAliasRequest) obj;
        if (other.getStateMachineAliasArn() == null ^ this.getStateMachineAliasArn() == null)
            return false;
        if (other.getStateMachineAliasArn() != null && other.getStateMachineAliasArn().equals(this.getStateMachineAliasArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineAliasArn() == null) ? 0 : getStateMachineAliasArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStateMachineAliasRequest clone() {
        return (UpdateStateMachineAliasRequest) super.clone();
    }

}
