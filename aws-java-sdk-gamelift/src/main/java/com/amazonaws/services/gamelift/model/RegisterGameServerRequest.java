/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterGameServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterGameServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier for the game server group where the game server is running. You can use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * A custom string that uniquely identifies the new game server. Game server IDs are developer-defined and must be
     * unique across all game server groups in your AWS account.
     * </p>
     */
    private String gameServerId;
    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Information needed to make inbound client connections to the game server. This might include IP address and port,
     * DNS name, etc.
     * </p>
     */
    private String connectionInfo;
    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on a game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     */
    private String gameServerData;
    /**
     * <p>
     * A game server tag that can be used to request sorted lists of game servers using <a>ListGameServers</a>. Custom
     * sort keys are developer-defined based on how you want to organize the retrieved game server information.
     * </p>
     */
    private String customSortKey;
    /**
     * <p>
     * A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs. Tagging
     * AWS resources are useful for resource management, access management, and cost allocation. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the
     * <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>,
     * and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See
     * the AWS General Reference for actual tagging limits.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An identifier for the game server group where the game server is running. You can use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        An identifier for the game server group where the game server is running. You can use either the
     *        <a>GameServerGroup</a> name or ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * An identifier for the game server group where the game server is running. You can use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @return An identifier for the game server group where the game server is running. You can use either the
     *         <a>GameServerGroup</a> name or ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * An identifier for the game server group where the game server is running. You can use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        An identifier for the game server group where the game server is running. You can use either the
     *        <a>GameServerGroup</a> name or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the new game server. Game server IDs are developer-defined and must be
     * unique across all game server groups in your AWS account.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the new game server. Game server IDs are developer-defined and
     *        must be unique across all game server groups in your AWS account.
     */

    public void setGameServerId(String gameServerId) {
        this.gameServerId = gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the new game server. Game server IDs are developer-defined and must be
     * unique across all game server groups in your AWS account.
     * </p>
     * 
     * @return A custom string that uniquely identifies the new game server. Game server IDs are developer-defined and
     *         must be unique across all game server groups in your AWS account.
     */

    public String getGameServerId() {
        return this.gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the new game server. Game server IDs are developer-defined and must be
     * unique across all game server groups in your AWS account.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the new game server. Game server IDs are developer-defined and
     *        must be unique across all game server groups in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withGameServerId(String gameServerId) {
        setGameServerId(gameServerId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier for the instance where the game server is running. This ID is available in the
     *        instance metadata.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata.
     * </p>
     * 
     * @return The unique identifier for the instance where the game server is running. This ID is available in the
     *         instance metadata.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier for the instance where the game server is running. This ID is available in the
     *        instance metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Information needed to make inbound client connections to the game server. This might include IP address and port,
     * DNS name, etc.
     * </p>
     * 
     * @param connectionInfo
     *        Information needed to make inbound client connections to the game server. This might include IP address
     *        and port, DNS name, etc.
     */

    public void setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    /**
     * <p>
     * Information needed to make inbound client connections to the game server. This might include IP address and port,
     * DNS name, etc.
     * </p>
     * 
     * @return Information needed to make inbound client connections to the game server. This might include IP address
     *         and port, DNS name, etc.
     */

    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * <p>
     * Information needed to make inbound client connections to the game server. This might include IP address and port,
     * DNS name, etc.
     * </p>
     * 
     * @param connectionInfo
     *        Information needed to make inbound client connections to the game server. This might include IP address
     *        and port, DNS name, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withConnectionInfo(String connectionInfo) {
        setConnectionInfo(connectionInfo);
        return this;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on a game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     * 
     * @param gameServerData
     *        A set of custom game server properties, formatted as a single string value. This data is passed to a game
     *        client or service when it requests information on a game servers using <a>ListGameServers</a> or
     *        <a>ClaimGameServer</a>.
     */

    public void setGameServerData(String gameServerData) {
        this.gameServerData = gameServerData;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on a game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     * 
     * @return A set of custom game server properties, formatted as a single string value. This data is passed to a game
     *         client or service when it requests information on a game servers using <a>ListGameServers</a> or
     *         <a>ClaimGameServer</a>.
     */

    public String getGameServerData() {
        return this.gameServerData;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on a game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     * 
     * @param gameServerData
     *        A set of custom game server properties, formatted as a single string value. This data is passed to a game
     *        client or service when it requests information on a game servers using <a>ListGameServers</a> or
     *        <a>ClaimGameServer</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withGameServerData(String gameServerData) {
        setGameServerData(gameServerData);
        return this;
    }

    /**
     * <p>
     * A game server tag that can be used to request sorted lists of game servers using <a>ListGameServers</a>. Custom
     * sort keys are developer-defined based on how you want to organize the retrieved game server information.
     * </p>
     * 
     * @param customSortKey
     *        A game server tag that can be used to request sorted lists of game servers using <a>ListGameServers</a>.
     *        Custom sort keys are developer-defined based on how you want to organize the retrieved game server
     *        information.
     */

    public void setCustomSortKey(String customSortKey) {
        this.customSortKey = customSortKey;
    }

    /**
     * <p>
     * A game server tag that can be used to request sorted lists of game servers using <a>ListGameServers</a>. Custom
     * sort keys are developer-defined based on how you want to organize the retrieved game server information.
     * </p>
     * 
     * @return A game server tag that can be used to request sorted lists of game servers using <a>ListGameServers</a>.
     *         Custom sort keys are developer-defined based on how you want to organize the retrieved game server
     *         information.
     */

    public String getCustomSortKey() {
        return this.customSortKey;
    }

    /**
     * <p>
     * A game server tag that can be used to request sorted lists of game servers using <a>ListGameServers</a>. Custom
     * sort keys are developer-defined based on how you want to organize the retrieved game server information.
     * </p>
     * 
     * @param customSortKey
     *        A game server tag that can be used to request sorted lists of game servers using <a>ListGameServers</a>.
     *        Custom sort keys are developer-defined based on how you want to organize the retrieved game server
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withCustomSortKey(String customSortKey) {
        setCustomSortKey(customSortKey);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs. Tagging
     * AWS resources are useful for resource management, access management, and cost allocation. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the
     * <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>,
     * and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See
     * the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @return A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs.
     *         Tagging AWS resources are useful for resource management, access management, and cost allocation. For
     *         more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging
     *         AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *         <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *         The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs. Tagging
     * AWS resources are useful for resource management, access management, and cost allocation. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the
     * <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>,
     * and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See
     * the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs.
     *        Tagging AWS resources are useful for resource management, access management, and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs. Tagging
     * AWS resources are useful for resource management, access management, and cost allocation. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the
     * <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>,
     * and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See
     * the AWS General Reference for actual tagging limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs.
     *        Tagging AWS resources are useful for resource management, access management, and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs. Tagging
     * AWS resources are useful for resource management, access management, and cost allocation. For more information,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the
     * <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>,
     * and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See
     * the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game server resource. Tags are developer-defined key-value pairs.
     *        Tagging AWS resources are useful for resource management, access management, and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getGameServerGroupName() != null)
            sb.append("GameServerGroupName: ").append(getGameServerGroupName()).append(",");
        if (getGameServerId() != null)
            sb.append("GameServerId: ").append(getGameServerId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getConnectionInfo() != null)
            sb.append("ConnectionInfo: ").append(getConnectionInfo()).append(",");
        if (getGameServerData() != null)
            sb.append("GameServerData: ").append(getGameServerData()).append(",");
        if (getCustomSortKey() != null)
            sb.append("CustomSortKey: ").append(getCustomSortKey()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterGameServerRequest == false)
            return false;
        RegisterGameServerRequest other = (RegisterGameServerRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getGameServerId() == null ^ this.getGameServerId() == null)
            return false;
        if (other.getGameServerId() != null && other.getGameServerId().equals(this.getGameServerId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getConnectionInfo() == null ^ this.getConnectionInfo() == null)
            return false;
        if (other.getConnectionInfo() != null && other.getConnectionInfo().equals(this.getConnectionInfo()) == false)
            return false;
        if (other.getGameServerData() == null ^ this.getGameServerData() == null)
            return false;
        if (other.getGameServerData() != null && other.getGameServerData().equals(this.getGameServerData()) == false)
            return false;
        if (other.getCustomSortKey() == null ^ this.getCustomSortKey() == null)
            return false;
        if (other.getCustomSortKey() != null && other.getCustomSortKey().equals(this.getCustomSortKey()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getGameServerId() == null) ? 0 : getGameServerId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getConnectionInfo() == null) ? 0 : getConnectionInfo().hashCode());
        hashCode = prime * hashCode + ((getGameServerData() == null) ? 0 : getGameServerData().hashCode());
        hashCode = prime * hashCode + ((getCustomSortKey() == null) ? 0 : getCustomSortKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RegisterGameServerRequest clone() {
        return (RegisterGameServerRequest) super.clone();
    }

}
