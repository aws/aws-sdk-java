/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the parameters for a streaming session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Session" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Session implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for a streaming session.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the user for whom the session was created.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The name of the stack for which the streaming session was created.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The name of the fleet for which the streaming session was created.
     * </p>
     */
    private String fleetName;
    /**
     * <p>
     * The current state of the streaming session.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The unique ID for a streaming session.
     * </p>
     * 
     * @param id
     *        The unique ID for a streaming session.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for a streaming session.
     * </p>
     * 
     * @return The unique ID for a streaming session.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for a streaming session.
     * </p>
     * 
     * @param id
     *        The unique ID for a streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the user for whom the session was created.
     * </p>
     * 
     * @param userId
     *        The identifier of the user for whom the session was created.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user for whom the session was created.
     * </p>
     * 
     * @return The identifier of the user for whom the session was created.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user for whom the session was created.
     * </p>
     * 
     * @param userId
     *        The identifier of the user for whom the session was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The name of the stack for which the streaming session was created.
     * </p>
     * 
     * @param stackName
     *        The name of the stack for which the streaming session was created.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack for which the streaming session was created.
     * </p>
     * 
     * @return The name of the stack for which the streaming session was created.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack for which the streaming session was created.
     * </p>
     * 
     * @param stackName
     *        The name of the stack for which the streaming session was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The name of the fleet for which the streaming session was created.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet for which the streaming session was created.
     */

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * The name of the fleet for which the streaming session was created.
     * </p>
     * 
     * @return The name of the fleet for which the streaming session was created.
     */

    public String getFleetName() {
        return this.fleetName;
    }

    /**
     * <p>
     * The name of the fleet for which the streaming session was created.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet for which the streaming session was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withFleetName(String fleetName) {
        setFleetName(fleetName);
        return this;
    }

    /**
     * <p>
     * The current state of the streaming session.
     * </p>
     * 
     * @param state
     *        The current state of the streaming session.
     * @see SessionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the streaming session.
     * </p>
     * 
     * @return The current state of the streaming session.
     * @see SessionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the streaming session.
     * </p>
     * 
     * @param state
     *        The current state of the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionState
     */

    public Session withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the streaming session.
     * </p>
     * 
     * @param state
     *        The current state of the streaming session.
     * @see SessionState
     */

    public void setState(SessionState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the streaming session.
     * </p>
     * 
     * @param state
     *        The current state of the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionState
     */

    public Session withState(SessionState state) {
        setState(state);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getFleetName() != null)
            sb.append("FleetName: ").append(getFleetName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Session == false)
            return false;
        Session other = (Session) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null && other.getFleetName().equals(this.getFleetName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Session clone() {
        try {
            return (Session) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.SessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
