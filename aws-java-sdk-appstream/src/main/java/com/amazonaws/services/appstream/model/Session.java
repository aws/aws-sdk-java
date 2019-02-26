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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a streaming session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Session" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Session implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the streaming session.
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
     * The name of the stack for the streaming session.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The name of the fleet for the streaming session.
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
     * Specifies whether a user is connected to the streaming session.
     * </p>
     */
    private String connectionState;
    /**
     * <p>
     * The time when a streaming instance is dedicated for the user.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time when the streaming session is set to expire. This time is based on the
     * <code>MaxUserDurationinSeconds</code> value, which determines the maximum length of time that a streaming session
     * can run. A streaming session might end earlier than the time specified in <code>SessionMaxExpirationTime</code>,
     * when the <code>DisconnectTimeOutInSeconds</code> elapses or the user chooses to end his or her session. If the
     * <code>DisconnectTimeOutInSeconds</code> elapses, or the user chooses to end his or her session, the streaming
     * instance is terminated and the streaming session ends.
     * </p>
     */
    private java.util.Date maxExpirationTime;
    /**
     * <p>
     * The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     * federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     * authenticate users using a streaming URL.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The network details for the streaming session.
     * </p>
     */
    private NetworkAccessConfiguration networkAccessConfiguration;

    /**
     * <p>
     * The identifier of the streaming session.
     * </p>
     * 
     * @param id
     *        The identifier of the streaming session.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the streaming session.
     * </p>
     * 
     * @return The identifier of the streaming session.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the streaming session.
     * </p>
     * 
     * @param id
     *        The identifier of the streaming session.
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
     * The name of the stack for the streaming session.
     * </p>
     * 
     * @param stackName
     *        The name of the stack for the streaming session.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack for the streaming session.
     * </p>
     * 
     * @return The name of the stack for the streaming session.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack for the streaming session.
     * </p>
     * 
     * @param stackName
     *        The name of the stack for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The name of the fleet for the streaming session.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet for the streaming session.
     */

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * The name of the fleet for the streaming session.
     * </p>
     * 
     * @return The name of the fleet for the streaming session.
     */

    public String getFleetName() {
        return this.fleetName;
    }

    /**
     * <p>
     * The name of the fleet for the streaming session.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet for the streaming session.
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
        withState(state);
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
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether a user is connected to the streaming session.
     * </p>
     * 
     * @param connectionState
     *        Specifies whether a user is connected to the streaming session.
     * @see SessionConnectionState
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * <p>
     * Specifies whether a user is connected to the streaming session.
     * </p>
     * 
     * @return Specifies whether a user is connected to the streaming session.
     * @see SessionConnectionState
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * <p>
     * Specifies whether a user is connected to the streaming session.
     * </p>
     * 
     * @param connectionState
     *        Specifies whether a user is connected to the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionConnectionState
     */

    public Session withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * <p>
     * Specifies whether a user is connected to the streaming session.
     * </p>
     * 
     * @param connectionState
     *        Specifies whether a user is connected to the streaming session.
     * @see SessionConnectionState
     */

    public void setConnectionState(SessionConnectionState connectionState) {
        withConnectionState(connectionState);
    }

    /**
     * <p>
     * Specifies whether a user is connected to the streaming session.
     * </p>
     * 
     * @param connectionState
     *        Specifies whether a user is connected to the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionConnectionState
     */

    public Session withConnectionState(SessionConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * <p>
     * The time when a streaming instance is dedicated for the user.
     * </p>
     * 
     * @param startTime
     *        The time when a streaming instance is dedicated for the user.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when a streaming instance is dedicated for the user.
     * </p>
     * 
     * @return The time when a streaming instance is dedicated for the user.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when a streaming instance is dedicated for the user.
     * </p>
     * 
     * @param startTime
     *        The time when a streaming instance is dedicated for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time when the streaming session is set to expire. This time is based on the
     * <code>MaxUserDurationinSeconds</code> value, which determines the maximum length of time that a streaming session
     * can run. A streaming session might end earlier than the time specified in <code>SessionMaxExpirationTime</code>,
     * when the <code>DisconnectTimeOutInSeconds</code> elapses or the user chooses to end his or her session. If the
     * <code>DisconnectTimeOutInSeconds</code> elapses, or the user chooses to end his or her session, the streaming
     * instance is terminated and the streaming session ends.
     * </p>
     * 
     * @param maxExpirationTime
     *        The time when the streaming session is set to expire. This time is based on the
     *        <code>MaxUserDurationinSeconds</code> value, which determines the maximum length of time that a streaming
     *        session can run. A streaming session might end earlier than the time specified in
     *        <code>SessionMaxExpirationTime</code>, when the <code>DisconnectTimeOutInSeconds</code> elapses or the
     *        user chooses to end his or her session. If the <code>DisconnectTimeOutInSeconds</code> elapses, or the
     *        user chooses to end his or her session, the streaming instance is terminated and the streaming session
     *        ends.
     */

    public void setMaxExpirationTime(java.util.Date maxExpirationTime) {
        this.maxExpirationTime = maxExpirationTime;
    }

    /**
     * <p>
     * The time when the streaming session is set to expire. This time is based on the
     * <code>MaxUserDurationinSeconds</code> value, which determines the maximum length of time that a streaming session
     * can run. A streaming session might end earlier than the time specified in <code>SessionMaxExpirationTime</code>,
     * when the <code>DisconnectTimeOutInSeconds</code> elapses or the user chooses to end his or her session. If the
     * <code>DisconnectTimeOutInSeconds</code> elapses, or the user chooses to end his or her session, the streaming
     * instance is terminated and the streaming session ends.
     * </p>
     * 
     * @return The time when the streaming session is set to expire. This time is based on the
     *         <code>MaxUserDurationinSeconds</code> value, which determines the maximum length of time that a streaming
     *         session can run. A streaming session might end earlier than the time specified in
     *         <code>SessionMaxExpirationTime</code>, when the <code>DisconnectTimeOutInSeconds</code> elapses or the
     *         user chooses to end his or her session. If the <code>DisconnectTimeOutInSeconds</code> elapses, or the
     *         user chooses to end his or her session, the streaming instance is terminated and the streaming session
     *         ends.
     */

    public java.util.Date getMaxExpirationTime() {
        return this.maxExpirationTime;
    }

    /**
     * <p>
     * The time when the streaming session is set to expire. This time is based on the
     * <code>MaxUserDurationinSeconds</code> value, which determines the maximum length of time that a streaming session
     * can run. A streaming session might end earlier than the time specified in <code>SessionMaxExpirationTime</code>,
     * when the <code>DisconnectTimeOutInSeconds</code> elapses or the user chooses to end his or her session. If the
     * <code>DisconnectTimeOutInSeconds</code> elapses, or the user chooses to end his or her session, the streaming
     * instance is terminated and the streaming session ends.
     * </p>
     * 
     * @param maxExpirationTime
     *        The time when the streaming session is set to expire. This time is based on the
     *        <code>MaxUserDurationinSeconds</code> value, which determines the maximum length of time that a streaming
     *        session can run. A streaming session might end earlier than the time specified in
     *        <code>SessionMaxExpirationTime</code>, when the <code>DisconnectTimeOutInSeconds</code> elapses or the
     *        user chooses to end his or her session. If the <code>DisconnectTimeOutInSeconds</code> elapses, or the
     *        user chooses to end his or her session, the streaming instance is terminated and the streaming session
     *        ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withMaxExpirationTime(java.util.Date maxExpirationTime) {
        setMaxExpirationTime(maxExpirationTime);
        return this;
    }

    /**
     * <p>
     * The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     * federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     *        federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     *        authenticate users using a streaming URL.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     * federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @return The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     *         federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     *         authenticate users using a streaming URL.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     * federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     *        federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     *        authenticate users using a streaming URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public Session withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     * federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     *        federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     *        authenticate users using a streaming URL.
     * @see AuthenticationType
     */

    public void setAuthenticationType(AuthenticationType authenticationType) {
        withAuthenticationType(authenticationType);
    }

    /**
     * <p>
     * The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     * federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication method. The user is authenticated using a streaming URL (<code>API</code>), SAML 2.0
     *        federation (<code>SAML</code>), or the AppStream 2.0 user pool (<code>USERPOOL</code>). The default is to
     *        authenticate users using a streaming URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public Session withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The network details for the streaming session.
     * </p>
     * 
     * @param networkAccessConfiguration
     *        The network details for the streaming session.
     */

    public void setNetworkAccessConfiguration(NetworkAccessConfiguration networkAccessConfiguration) {
        this.networkAccessConfiguration = networkAccessConfiguration;
    }

    /**
     * <p>
     * The network details for the streaming session.
     * </p>
     * 
     * @return The network details for the streaming session.
     */

    public NetworkAccessConfiguration getNetworkAccessConfiguration() {
        return this.networkAccessConfiguration;
    }

    /**
     * <p>
     * The network details for the streaming session.
     * </p>
     * 
     * @param networkAccessConfiguration
     *        The network details for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withNetworkAccessConfiguration(NetworkAccessConfiguration networkAccessConfiguration) {
        setNetworkAccessConfiguration(networkAccessConfiguration);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getFleetName() != null)
            sb.append("FleetName: ").append(getFleetName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getConnectionState() != null)
            sb.append("ConnectionState: ").append(getConnectionState()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getMaxExpirationTime() != null)
            sb.append("MaxExpirationTime: ").append(getMaxExpirationTime()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getNetworkAccessConfiguration() != null)
            sb.append("NetworkAccessConfiguration: ").append(getNetworkAccessConfiguration());
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
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getMaxExpirationTime() == null ^ this.getMaxExpirationTime() == null)
            return false;
        if (other.getMaxExpirationTime() != null && other.getMaxExpirationTime().equals(this.getMaxExpirationTime()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getNetworkAccessConfiguration() == null ^ this.getNetworkAccessConfiguration() == null)
            return false;
        if (other.getNetworkAccessConfiguration() != null && other.getNetworkAccessConfiguration().equals(this.getNetworkAccessConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getMaxExpirationTime() == null) ? 0 : getMaxExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getNetworkAccessConfiguration() == null) ? 0 : getNetworkAccessConfiguration().hashCode());
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
