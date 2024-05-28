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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an alias of an agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentAlias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias of the agent.
     * </p>
     */
    private String agentAliasArn;
    /**
     * <p>
     * Contains details about the history of the alias.
     * </p>
     */
    private java.util.List<AgentAliasHistoryEvent> agentAliasHistoryEvents;
    /**
     * <p>
     * The unique identifier of the alias of the agent.
     * </p>
     */
    private String agentAliasId;
    /**
     * <p>
     * The name of the alias of the agent.
     * </p>
     */
    private String agentAliasName;
    /**
     * <p>
     * The status of the alias of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent alias is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent alias API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent alias is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent alias is being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String agentAliasStatus;
    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The time at which the alias of the agent was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the alias of the agent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information on the failure of Provisioned Throughput assigned to an agent alias.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * Contains details about the routing configuration of the alias.
     * </p>
     */
    private java.util.List<AgentAliasRoutingConfigurationListItem> routingConfiguration;
    /**
     * <p>
     * The time at which the alias was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias of the agent.
     * </p>
     * 
     * @param agentAliasArn
     *        The Amazon Resource Name (ARN) of the alias of the agent.
     */

    public void setAgentAliasArn(String agentAliasArn) {
        this.agentAliasArn = agentAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias of the agent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the alias of the agent.
     */

    public String getAgentAliasArn() {
        return this.agentAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias of the agent.
     * </p>
     * 
     * @param agentAliasArn
     *        The Amazon Resource Name (ARN) of the alias of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasArn(String agentAliasArn) {
        setAgentAliasArn(agentAliasArn);
        return this;
    }

    /**
     * <p>
     * Contains details about the history of the alias.
     * </p>
     * 
     * @return Contains details about the history of the alias.
     */

    public java.util.List<AgentAliasHistoryEvent> getAgentAliasHistoryEvents() {
        return agentAliasHistoryEvents;
    }

    /**
     * <p>
     * Contains details about the history of the alias.
     * </p>
     * 
     * @param agentAliasHistoryEvents
     *        Contains details about the history of the alias.
     */

    public void setAgentAliasHistoryEvents(java.util.Collection<AgentAliasHistoryEvent> agentAliasHistoryEvents) {
        if (agentAliasHistoryEvents == null) {
            this.agentAliasHistoryEvents = null;
            return;
        }

        this.agentAliasHistoryEvents = new java.util.ArrayList<AgentAliasHistoryEvent>(agentAliasHistoryEvents);
    }

    /**
     * <p>
     * Contains details about the history of the alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentAliasHistoryEvents(java.util.Collection)} or
     * {@link #withAgentAliasHistoryEvents(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param agentAliasHistoryEvents
     *        Contains details about the history of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasHistoryEvents(AgentAliasHistoryEvent... agentAliasHistoryEvents) {
        if (this.agentAliasHistoryEvents == null) {
            setAgentAliasHistoryEvents(new java.util.ArrayList<AgentAliasHistoryEvent>(agentAliasHistoryEvents.length));
        }
        for (AgentAliasHistoryEvent ele : agentAliasHistoryEvents) {
            this.agentAliasHistoryEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains details about the history of the alias.
     * </p>
     * 
     * @param agentAliasHistoryEvents
     *        Contains details about the history of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasHistoryEvents(java.util.Collection<AgentAliasHistoryEvent> agentAliasHistoryEvents) {
        setAgentAliasHistoryEvents(agentAliasHistoryEvents);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the alias of the agent.
     * </p>
     * 
     * @param agentAliasId
     *        The unique identifier of the alias of the agent.
     */

    public void setAgentAliasId(String agentAliasId) {
        this.agentAliasId = agentAliasId;
    }

    /**
     * <p>
     * The unique identifier of the alias of the agent.
     * </p>
     * 
     * @return The unique identifier of the alias of the agent.
     */

    public String getAgentAliasId() {
        return this.agentAliasId;
    }

    /**
     * <p>
     * The unique identifier of the alias of the agent.
     * </p>
     * 
     * @param agentAliasId
     *        The unique identifier of the alias of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasId(String agentAliasId) {
        setAgentAliasId(agentAliasId);
        return this;
    }

    /**
     * <p>
     * The name of the alias of the agent.
     * </p>
     * 
     * @param agentAliasName
     *        The name of the alias of the agent.
     */

    public void setAgentAliasName(String agentAliasName) {
        this.agentAliasName = agentAliasName;
    }

    /**
     * <p>
     * The name of the alias of the agent.
     * </p>
     * 
     * @return The name of the alias of the agent.
     */

    public String getAgentAliasName() {
        return this.agentAliasName;
    }

    /**
     * <p>
     * The name of the alias of the agent.
     * </p>
     * 
     * @param agentAliasName
     *        The name of the alias of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasName(String agentAliasName) {
        setAgentAliasName(agentAliasName);
        return this;
    }

    /**
     * <p>
     * The status of the alias of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent alias is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent alias API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent alias is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent alias is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param agentAliasStatus
     *        The status of the alias of the agent and whether it is ready for use. The following statuses are
     *        possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The agent alias is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The agent alias API operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The agent alias is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The agent alias is being deleted.
     *        </p>
     *        </li>
     * @see AgentAliasStatus
     */

    public void setAgentAliasStatus(String agentAliasStatus) {
        this.agentAliasStatus = agentAliasStatus;
    }

    /**
     * <p>
     * The status of the alias of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent alias is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent alias API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent alias is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent alias is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the alias of the agent and whether it is ready for use. The following statuses are
     *         possible:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATING – The agent alias is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED – The agent alias API operation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATING – The agent alias is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING – The agent alias is being deleted.
     *         </p>
     *         </li>
     * @see AgentAliasStatus
     */

    public String getAgentAliasStatus() {
        return this.agentAliasStatus;
    }

    /**
     * <p>
     * The status of the alias of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent alias is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent alias API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent alias is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent alias is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param agentAliasStatus
     *        The status of the alias of the agent and whether it is ready for use. The following statuses are
     *        possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The agent alias is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The agent alias API operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The agent alias is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The agent alias is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAliasStatus
     */

    public AgentAlias withAgentAliasStatus(String agentAliasStatus) {
        setAgentAliasStatus(agentAliasStatus);
        return this;
    }

    /**
     * <p>
     * The status of the alias of the agent and whether it is ready for use. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The agent alias is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The agent alias API operation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The agent alias is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The agent alias is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param agentAliasStatus
     *        The status of the alias of the agent and whether it is ready for use. The following statuses are
     *        possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The agent alias is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARED – The agent alias is finished being created or updated and is ready to be invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The agent alias API operation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The agent alias is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The agent alias is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAliasStatus
     */

    public AgentAlias withAgentAliasStatus(AgentAliasStatus agentAliasStatus) {
        this.agentAliasStatus = agentAliasStatus.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @return The unique identifier of the agent.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The time at which the alias of the agent was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the alias of the agent was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the alias of the agent was created.
     * </p>
     * 
     * @return The time at which the alias of the agent was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the alias of the agent was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the alias of the agent was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the alias of the agent.
     * </p>
     * 
     * @param description
     *        The description of the alias of the agent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the alias of the agent.
     * </p>
     * 
     * @return The description of the alias of the agent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the alias of the agent.
     * </p>
     * 
     * @param description
     *        The description of the alias of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information on the failure of Provisioned Throughput assigned to an agent alias.
     * </p>
     * 
     * @return Information on the failure of Provisioned Throughput assigned to an agent alias.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * Information on the failure of Provisioned Throughput assigned to an agent alias.
     * </p>
     * 
     * @param failureReasons
     *        Information on the failure of Provisioned Throughput assigned to an agent alias.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * Information on the failure of Provisioned Throughput assigned to an agent alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        Information on the failure of Provisioned Throughput assigned to an agent alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information on the failure of Provisioned Throughput assigned to an agent alias.
     * </p>
     * 
     * @param failureReasons
     *        Information on the failure of Provisioned Throughput assigned to an agent alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * Contains details about the routing configuration of the alias.
     * </p>
     * 
     * @return Contains details about the routing configuration of the alias.
     */

    public java.util.List<AgentAliasRoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * <p>
     * Contains details about the routing configuration of the alias.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the routing configuration of the alias.
     */

    public void setRoutingConfiguration(java.util.Collection<AgentAliasRoutingConfigurationListItem> routingConfiguration) {
        if (routingConfiguration == null) {
            this.routingConfiguration = null;
            return;
        }

        this.routingConfiguration = new java.util.ArrayList<AgentAliasRoutingConfigurationListItem>(routingConfiguration);
    }

    /**
     * <p>
     * Contains details about the routing configuration of the alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the routing configuration of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withRoutingConfiguration(AgentAliasRoutingConfigurationListItem... routingConfiguration) {
        if (this.routingConfiguration == null) {
            setRoutingConfiguration(new java.util.ArrayList<AgentAliasRoutingConfigurationListItem>(routingConfiguration.length));
        }
        for (AgentAliasRoutingConfigurationListItem ele : routingConfiguration) {
            this.routingConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains details about the routing configuration of the alias.
     * </p>
     * 
     * @param routingConfiguration
     *        Contains details about the routing configuration of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withRoutingConfiguration(java.util.Collection<AgentAliasRoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the alias was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the alias was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the alias was last updated.
     * </p>
     * 
     * @return The time at which the alias was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the alias was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the alias was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAgentAliasArn() != null)
            sb.append("AgentAliasArn: ").append(getAgentAliasArn()).append(",");
        if (getAgentAliasHistoryEvents() != null)
            sb.append("AgentAliasHistoryEvents: ").append(getAgentAliasHistoryEvents()).append(",");
        if (getAgentAliasId() != null)
            sb.append("AgentAliasId: ").append(getAgentAliasId()).append(",");
        if (getAgentAliasName() != null)
            sb.append("AgentAliasName: ").append(getAgentAliasName()).append(",");
        if (getAgentAliasStatus() != null)
            sb.append("AgentAliasStatus: ").append(getAgentAliasStatus()).append(",");
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentAlias == false)
            return false;
        AgentAlias other = (AgentAlias) obj;
        if (other.getAgentAliasArn() == null ^ this.getAgentAliasArn() == null)
            return false;
        if (other.getAgentAliasArn() != null && other.getAgentAliasArn().equals(this.getAgentAliasArn()) == false)
            return false;
        if (other.getAgentAliasHistoryEvents() == null ^ this.getAgentAliasHistoryEvents() == null)
            return false;
        if (other.getAgentAliasHistoryEvents() != null && other.getAgentAliasHistoryEvents().equals(this.getAgentAliasHistoryEvents()) == false)
            return false;
        if (other.getAgentAliasId() == null ^ this.getAgentAliasId() == null)
            return false;
        if (other.getAgentAliasId() != null && other.getAgentAliasId().equals(this.getAgentAliasId()) == false)
            return false;
        if (other.getAgentAliasName() == null ^ this.getAgentAliasName() == null)
            return false;
        if (other.getAgentAliasName() != null && other.getAgentAliasName().equals(this.getAgentAliasName()) == false)
            return false;
        if (other.getAgentAliasStatus() == null ^ this.getAgentAliasStatus() == null)
            return false;
        if (other.getAgentAliasStatus() != null && other.getAgentAliasStatus().equals(this.getAgentAliasStatus()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentAliasArn() == null) ? 0 : getAgentAliasArn().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasHistoryEvents() == null) ? 0 : getAgentAliasHistoryEvents().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasId() == null) ? 0 : getAgentAliasId().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasName() == null) ? 0 : getAgentAliasName().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasStatus() == null) ? 0 : getAgentAliasStatus().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AgentAlias clone() {
        try {
            return (AgentAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
