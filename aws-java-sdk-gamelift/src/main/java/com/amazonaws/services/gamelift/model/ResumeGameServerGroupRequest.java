/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResumeGameServerGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResumeGameServerGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * The activity to resume for this game server group.
     * </p>
     */
    private java.util.List<String> resumeActions;

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @return A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResumeGameServerGroupRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * The activity to resume for this game server group.
     * </p>
     * 
     * @return The activity to resume for this game server group.
     * @see GameServerGroupAction
     */

    public java.util.List<String> getResumeActions() {
        return resumeActions;
    }

    /**
     * <p>
     * The activity to resume for this game server group.
     * </p>
     * 
     * @param resumeActions
     *        The activity to resume for this game server group.
     * @see GameServerGroupAction
     */

    public void setResumeActions(java.util.Collection<String> resumeActions) {
        if (resumeActions == null) {
            this.resumeActions = null;
            return;
        }

        this.resumeActions = new java.util.ArrayList<String>(resumeActions);
    }

    /**
     * <p>
     * The activity to resume for this game server group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResumeActions(java.util.Collection)} or {@link #withResumeActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resumeActions
     *        The activity to resume for this game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public ResumeGameServerGroupRequest withResumeActions(String... resumeActions) {
        if (this.resumeActions == null) {
            setResumeActions(new java.util.ArrayList<String>(resumeActions.length));
        }
        for (String ele : resumeActions) {
            this.resumeActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The activity to resume for this game server group.
     * </p>
     * 
     * @param resumeActions
     *        The activity to resume for this game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public ResumeGameServerGroupRequest withResumeActions(java.util.Collection<String> resumeActions) {
        setResumeActions(resumeActions);
        return this;
    }

    /**
     * <p>
     * The activity to resume for this game server group.
     * </p>
     * 
     * @param resumeActions
     *        The activity to resume for this game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public ResumeGameServerGroupRequest withResumeActions(GameServerGroupAction... resumeActions) {
        java.util.ArrayList<String> resumeActionsCopy = new java.util.ArrayList<String>(resumeActions.length);
        for (GameServerGroupAction value : resumeActions) {
            resumeActionsCopy.add(value.toString());
        }
        if (getResumeActions() == null) {
            setResumeActions(resumeActionsCopy);
        } else {
            getResumeActions().addAll(resumeActionsCopy);
        }
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
        if (getResumeActions() != null)
            sb.append("ResumeActions: ").append(getResumeActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResumeGameServerGroupRequest == false)
            return false;
        ResumeGameServerGroupRequest other = (ResumeGameServerGroupRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getResumeActions() == null ^ this.getResumeActions() == null)
            return false;
        if (other.getResumeActions() != null && other.getResumeActions().equals(this.getResumeActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getResumeActions() == null) ? 0 : getResumeActions().hashCode());
        return hashCode;
    }

    @Override
    public ResumeGameServerGroupRequest clone() {
        return (ResumeGameServerGroupRequest) super.clone();
    }

}
