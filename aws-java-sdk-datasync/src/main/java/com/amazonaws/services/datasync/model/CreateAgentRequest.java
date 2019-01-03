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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * CreateAgentRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Your agent activation key. You can get the activation key either by sending an HTTP GET request with redirects
     * that enable you to get the agent IP address (port 80). Alternatively, you can get it from the AWS DataSync
     * console.
     * </p>
     * <p>
     * The redirect URL returned in the response provides you the activation key for your agent in the query string
     * parameter <code>activationKey</code>. It might also include other activation-related parameters; however, these
     * are merely defaults. The arguments you pass to this API call determine the actual configuration of your agent.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     * >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     * </p>
     */
    private String activationKey;
    /**
     * <p>
     * The name you configured for your agent. This value is a text reference that is used to identify the agent in the
     * console.
     * </p>
     */
    private String agentName;
    /**
     * <p>
     * The key-value pair that represents the tag you want to associate with the agent. The value can be an empty
     * string. This value helps you manage, filter, and search for your agents.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @.
     * </p>
     * </note>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * Your agent activation key. You can get the activation key either by sending an HTTP GET request with redirects
     * that enable you to get the agent IP address (port 80). Alternatively, you can get it from the AWS DataSync
     * console.
     * </p>
     * <p>
     * The redirect URL returned in the response provides you the activation key for your agent in the query string
     * parameter <code>activationKey</code>. It might also include other activation-related parameters; however, these
     * are merely defaults. The arguments you pass to this API call determine the actual configuration of your agent.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     * >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     * </p>
     * 
     * @param activationKey
     *        Your agent activation key. You can get the activation key either by sending an HTTP GET request with
     *        redirects that enable you to get the agent IP address (port 80). Alternatively, you can get it from the
     *        AWS DataSync console. </p>
     *        <p>
     *        The redirect URL returned in the response provides you the activation key for your agent in the query
     *        string parameter <code>activationKey</code>. It might also include other activation-related parameters;
     *        however, these are merely defaults. The arguments you pass to this API call determine the actual
     *        configuration of your agent. For more information, see <a href=
     *        "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     *        >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     */

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * <p>
     * Your agent activation key. You can get the activation key either by sending an HTTP GET request with redirects
     * that enable you to get the agent IP address (port 80). Alternatively, you can get it from the AWS DataSync
     * console.
     * </p>
     * <p>
     * The redirect URL returned in the response provides you the activation key for your agent in the query string
     * parameter <code>activationKey</code>. It might also include other activation-related parameters; however, these
     * are merely defaults. The arguments you pass to this API call determine the actual configuration of your agent.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     * >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     * </p>
     * 
     * @return Your agent activation key. You can get the activation key either by sending an HTTP GET request with
     *         redirects that enable you to get the agent IP address (port 80). Alternatively, you can get it from the
     *         AWS DataSync console. </p>
     *         <p>
     *         The redirect URL returned in the response provides you the activation key for your agent in the query
     *         string parameter <code>activationKey</code>. It might also include other activation-related parameters;
     *         however, these are merely defaults. The arguments you pass to this API call determine the actual
     *         configuration of your agent. For more information, see <a href=
     *         "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     *         >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     */

    public String getActivationKey() {
        return this.activationKey;
    }

    /**
     * <p>
     * Your agent activation key. You can get the activation key either by sending an HTTP GET request with redirects
     * that enable you to get the agent IP address (port 80). Alternatively, you can get it from the AWS DataSync
     * console.
     * </p>
     * <p>
     * The redirect URL returned in the response provides you the activation key for your agent in the query string
     * parameter <code>activationKey</code>. It might also include other activation-related parameters; however, these
     * are merely defaults. The arguments you pass to this API call determine the actual configuration of your agent.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     * >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     * </p>
     * 
     * @param activationKey
     *        Your agent activation key. You can get the activation key either by sending an HTTP GET request with
     *        redirects that enable you to get the agent IP address (port 80). Alternatively, you can get it from the
     *        AWS DataSync console. </p>
     *        <p>
     *        The redirect URL returned in the response provides you the activation key for your agent in the query
     *        string parameter <code>activationKey</code>. It might also include other activation-related parameters;
     *        however, these are merely defaults. The arguments you pass to this API call determine the actual
     *        configuration of your agent. For more information, see <a href=
     *        "https://docs.aws.amazon.com/sync-service/latest/userguide/working-with-sync-agents.html#activating-sync-agent"
     *        >Activating a Sync Agent</a> in the <i>AWS DataSync User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withActivationKey(String activationKey) {
        setActivationKey(activationKey);
        return this;
    }

    /**
     * <p>
     * The name you configured for your agent. This value is a text reference that is used to identify the agent in the
     * console.
     * </p>
     * 
     * @param agentName
     *        The name you configured for your agent. This value is a text reference that is used to identify the agent
     *        in the console.
     */

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * <p>
     * The name you configured for your agent. This value is a text reference that is used to identify the agent in the
     * console.
     * </p>
     * 
     * @return The name you configured for your agent. This value is a text reference that is used to identify the agent
     *         in the console.
     */

    public String getAgentName() {
        return this.agentName;
    }

    /**
     * <p>
     * The name you configured for your agent. This value is a text reference that is used to identify the agent in the
     * console.
     * </p>
     * 
     * @param agentName
     *        The name you configured for your agent. This value is a text reference that is used to identify the agent
     *        in the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withAgentName(String agentName) {
        setAgentName(agentName);
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag you want to associate with the agent. The value can be an empty
     * string. This value helps you manage, filter, and search for your agents.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @.
     * </p>
     * </note>
     * 
     * @return The key-value pair that represents the tag you want to associate with the agent. The value can be an
     *         empty string. This value helps you manage, filter, and search for your agents.</p> <note>
     *         <p>
     *         Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and
     *         the following special characters: + - = . _ : / @.
     *         </p>
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pair that represents the tag you want to associate with the agent. The value can be an empty
     * string. This value helps you manage, filter, and search for your agents.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @.
     * </p>
     * </note>
     * 
     * @param tags
     *        The key-value pair that represents the tag you want to associate with the agent. The value can be an empty
     *        string. This value helps you manage, filter, and search for your agents.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @.
     *        </p>
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * The key-value pair that represents the tag you want to associate with the agent. The value can be an empty
     * string. This value helps you manage, filter, and search for your agents.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag you want to associate with the agent. The value can be an empty
     *        string. This value helps you manage, filter, and search for your agents.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag you want to associate with the agent. The value can be an empty
     * string. This value helps you manage, filter, and search for your agents.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     * following special characters: + - = . _ : / @.
     * </p>
     * </note>
     * 
     * @param tags
     *        The key-value pair that represents the tag you want to associate with the agent. The value can be an empty
     *        string. This value helps you manage, filter, and search for your agents.</p> <note>
     *        <p>
     *        Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the
     *        following special characters: + - = . _ : / @.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentRequest withTags(java.util.Collection<TagListEntry> tags) {
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
        if (getActivationKey() != null)
            sb.append("ActivationKey: ").append(getActivationKey()).append(",");
        if (getAgentName() != null)
            sb.append("AgentName: ").append(getAgentName()).append(",");
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

        if (obj instanceof CreateAgentRequest == false)
            return false;
        CreateAgentRequest other = (CreateAgentRequest) obj;
        if (other.getActivationKey() == null ^ this.getActivationKey() == null)
            return false;
        if (other.getActivationKey() != null && other.getActivationKey().equals(this.getActivationKey()) == false)
            return false;
        if (other.getAgentName() == null ^ this.getAgentName() == null)
            return false;
        if (other.getAgentName() != null && other.getAgentName().equals(this.getAgentName()) == false)
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

        hashCode = prime * hashCode + ((getActivationKey() == null) ? 0 : getActivationKey().hashCode());
        hashCode = prime * hashCode + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAgentRequest clone() {
        return (CreateAgentRequest) super.clone();
    }

}
