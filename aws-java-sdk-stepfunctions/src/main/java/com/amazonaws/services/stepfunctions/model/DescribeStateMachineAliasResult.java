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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachineAlias" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStateMachineAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias.
     * </p>
     */
    private String stateMachineAliasArn;
    /**
     * <p>
     * The name of the state machine alias.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The routing configuration of the alias.
     * </p>
     */
    private java.util.List<RoutingConfigurationListItem> routingConfiguration;
    /**
     * <p>
     * The date the state machine alias was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the state machine alias was last updated.
     * </p>
     * <p>
     * For a newly created state machine, this is the same as the creation date.
     * </p>
     */
    private java.util.Date updateDate;

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

    public DescribeStateMachineAliasResult withStateMachineAliasArn(String stateMachineAliasArn) {
        setStateMachineAliasArn(stateMachineAliasArn);
        return this;
    }

    /**
     * <p>
     * The name of the state machine alias.
     * </p>
     * 
     * @param name
     *        The name of the state machine alias.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state machine alias.
     * </p>
     * 
     * @return The name of the state machine alias.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state machine alias.
     * </p>
     * 
     * @param name
     *        The name of the state machine alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineAliasResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @return A description of the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineAliasResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The routing configuration of the alias.
     * </p>
     * 
     * @return The routing configuration of the alias.
     */

    public java.util.List<RoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * <p>
     * The routing configuration of the alias.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of the alias.
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
     * The routing configuration of the alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineAliasResult withRoutingConfiguration(RoutingConfigurationListItem... routingConfiguration) {
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
     * The routing configuration of the alias.
     * </p>
     * 
     * @param routingConfiguration
     *        The routing configuration of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineAliasResult withRoutingConfiguration(java.util.Collection<RoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * <p>
     * The date the state machine alias was created.
     * </p>
     * 
     * @param creationDate
     *        The date the state machine alias was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the state machine alias was created.
     * </p>
     * 
     * @return The date the state machine alias was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the state machine alias was created.
     * </p>
     * 
     * @param creationDate
     *        The date the state machine alias was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineAliasResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the state machine alias was last updated.
     * </p>
     * <p>
     * For a newly created state machine, this is the same as the creation date.
     * </p>
     * 
     * @param updateDate
     *        The date the state machine alias was last updated.</p>
     *        <p>
     *        For a newly created state machine, this is the same as the creation date.
     */

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The date the state machine alias was last updated.
     * </p>
     * <p>
     * For a newly created state machine, this is the same as the creation date.
     * </p>
     * 
     * @return The date the state machine alias was last updated.</p>
     *         <p>
     *         For a newly created state machine, this is the same as the creation date.
     */

    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * The date the state machine alias was last updated.
     * </p>
     * <p>
     * For a newly created state machine, this is the same as the creation date.
     * </p>
     * 
     * @param updateDate
     *        The date the state machine alias was last updated.</p>
     *        <p>
     *        For a newly created state machine, this is the same as the creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineAliasResult withUpdateDate(java.util.Date updateDate) {
        setUpdateDate(updateDate);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: ").append(getUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStateMachineAliasResult == false)
            return false;
        DescribeStateMachineAliasResult other = (DescribeStateMachineAliasResult) obj;
        if (other.getStateMachineAliasArn() == null ^ this.getStateMachineAliasArn() == null)
            return false;
        if (other.getStateMachineAliasArn() != null && other.getStateMachineAliasArn().equals(this.getStateMachineAliasArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineAliasArn() == null) ? 0 : getStateMachineAliasArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStateMachineAliasResult clone() {
        try {
            return (DescribeStateMachineAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
