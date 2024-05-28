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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateStateMachineAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStateMachineAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description for the state machine alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the state machine alias.
     * </p>
     * <p>
     * To avoid conflict with version ARNs, don't use an integer in the name of the alias.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The routing configuration of a state machine alias. The routing configuration shifts execution traffic between
     * two state machine versions. <code>routingConfiguration</code> contains an array of <code>RoutingConfig</code>
     * objects that specify up to two state machine versions. Step Functions then randomly choses which version to run
     * an execution with based on the weight assigned to each <code>RoutingConfig</code>.
     * </p>
     */
    private java.util.List<RoutingConfigurationListItem> routingConfiguration;

    /**
     * <p>
     * A description for the state machine alias.
     * </p>
     * 
     * @param description
     *        A description for the state machine alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the state machine alias.
     * </p>
     * 
     * @return A description for the state machine alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the state machine alias.
     * </p>
     * 
     * @param description
     *        A description for the state machine alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineAliasRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the state machine alias.
     * </p>
     * <p>
     * To avoid conflict with version ARNs, don't use an integer in the name of the alias.
     * </p>
     * 
     * @param name
     *        The name of the state machine alias.</p>
     *        <p>
     *        To avoid conflict with version ARNs, don't use an integer in the name of the alias.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state machine alias.
     * </p>
     * <p>
     * To avoid conflict with version ARNs, don't use an integer in the name of the alias.
     * </p>
     * 
     * @return The name of the state machine alias.</p>
     *         <p>
     *         To avoid conflict with version ARNs, don't use an integer in the name of the alias.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state machine alias.
     * </p>
     * <p>
     * To avoid conflict with version ARNs, don't use an integer in the name of the alias.
     * </p>
     * 
     * @param name
     *        The name of the state machine alias.</p>
     *        <p>
     *        To avoid conflict with version ARNs, don't use an integer in the name of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The routing configuration of a state machine alias. The routing configuration shifts execution traffic between
     * two state machine versions. <code>routingConfiguration</code> contains an array of <code>RoutingConfig</code>
     * objects that specify up to two state machine versions. Step Functions then randomly choses which version to run
     * an execution with based on the weight assigned to each <code>RoutingConfig</code>.
     * </p>
     * 
     * @return The routing configuration of a state machine alias. The routing configuration shifts execution traffic
     *         between two state machine versions. <code>routingConfiguration</code> contains an array of
     *         <code>RoutingConfig</code> objects that specify up to two state machine versions. Step Functions then
     *         randomly choses which version to run an execution with based on the weight assigned to each
     *         <code>RoutingConfig</code>.
     */

    public java.util.List<RoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * <p>
     * The routing configuration of a state machine alias. The routing configuration shifts execution traffic between
     * two state machine versions. <code>routingConfiguration</code> contains an array of <code>RoutingConfig</code>
     * objects that specify up to two state machine versions. Step Functions then randomly choses which version to run
     * an execution with based on the weight assigned to each <code>RoutingConfig</code>.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of a state machine alias. The routing configuration shifts execution traffic
     *        between two state machine versions. <code>routingConfiguration</code> contains an array of
     *        <code>RoutingConfig</code> objects that specify up to two state machine versions. Step Functions then
     *        randomly choses which version to run an execution with based on the weight assigned to each
     *        <code>RoutingConfig</code>.
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
     * The routing configuration of a state machine alias. The routing configuration shifts execution traffic between
     * two state machine versions. <code>routingConfiguration</code> contains an array of <code>RoutingConfig</code>
     * objects that specify up to two state machine versions. Step Functions then randomly choses which version to run
     * an execution with based on the weight assigned to each <code>RoutingConfig</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of a state machine alias. The routing configuration shifts execution traffic
     *        between two state machine versions. <code>routingConfiguration</code> contains an array of
     *        <code>RoutingConfig</code> objects that specify up to two state machine versions. Step Functions then
     *        randomly choses which version to run an execution with based on the weight assigned to each
     *        <code>RoutingConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineAliasRequest withRoutingConfiguration(RoutingConfigurationListItem... routingConfiguration) {
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
     * The routing configuration of a state machine alias. The routing configuration shifts execution traffic between
     * two state machine versions. <code>routingConfiguration</code> contains an array of <code>RoutingConfig</code>
     * objects that specify up to two state machine versions. Step Functions then randomly choses which version to run
     * an execution with based on the weight assigned to each <code>RoutingConfig</code>.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of a state machine alias. The routing configuration shifts execution traffic
     *        between two state machine versions. <code>routingConfiguration</code> contains an array of
     *        <code>RoutingConfig</code> objects that specify up to two state machine versions. Step Functions then
     *        randomly choses which version to run an execution with based on the weight assigned to each
     *        <code>RoutingConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineAliasRequest withRoutingConfiguration(java.util.Collection<RoutingConfigurationListItem> routingConfiguration) {
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateStateMachineAliasRequest == false)
            return false;
        CreateStateMachineAliasRequest other = (CreateStateMachineAliasRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateStateMachineAliasRequest clone() {
        return (CreateStateMachineAliasRequest) super.clone();
    }

}
