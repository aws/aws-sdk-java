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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Connection information for the new game session that is created with matchmaking. (with <a>StartMatchmaking</a>).
 * Once a match is set, the FlexMatch engine places the match and creates a new game session for it. This information,
 * including the game session endpoint and player sessions for each player in the original matchmaking request, is added
 * to the <a>MatchmakingTicket</a>, which can be retrieved by calling <a>DescribeMatchmaking</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameSessionConnectionInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionConnectionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session and uniquely identifies it.
     * </p>
     */
    private String gameSessionArn;
    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address
     * and port number.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     */
    private java.util.List<MatchedPlayerSession> matchedPlayerSessions;

    /**
     * <p>
     * Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session and uniquely identifies it.
     * </p>
     * 
     * @param gameSessionArn
     *        Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        game session and uniquely identifies it.
     */

    public void setGameSessionArn(String gameSessionArn) {
        this.gameSessionArn = gameSessionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session and uniquely identifies it.
     * </p>
     * 
     * @return Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         game session and uniquely identifies it.
     */

    public String getGameSessionArn() {
        return this.gameSessionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that
     * is assigned to a game session and uniquely identifies it.
     * </p>
     * 
     * @param gameSessionArn
     *        Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        game session and uniquely identifies it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withGameSessionArn(String gameSessionArn) {
        setGameSessionArn(gameSessionArn);
        return this;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @return IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *         address and port number.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address
     * and port number.
     * </p>
     * 
     * @param port
     *        Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address
     * and port number.
     * </p>
     * 
     * @return Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *         address and port number.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address
     * and port number.
     * </p>
     * 
     * @param port
     *        Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     * 
     * @return Collection of player session IDs, one for each player ID that was included in the original matchmaking
     *         request.
     */

    public java.util.List<MatchedPlayerSession> getMatchedPlayerSessions() {
        return matchedPlayerSessions;
    }

    /**
     * <p>
     * Collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     * 
     * @param matchedPlayerSessions
     *        Collection of player session IDs, one for each player ID that was included in the original matchmaking
     *        request.
     */

    public void setMatchedPlayerSessions(java.util.Collection<MatchedPlayerSession> matchedPlayerSessions) {
        if (matchedPlayerSessions == null) {
            this.matchedPlayerSessions = null;
            return;
        }

        this.matchedPlayerSessions = new java.util.ArrayList<MatchedPlayerSession>(matchedPlayerSessions);
    }

    /**
     * <p>
     * Collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchedPlayerSessions(java.util.Collection)} or
     * {@link #withMatchedPlayerSessions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param matchedPlayerSessions
     *        Collection of player session IDs, one for each player ID that was included in the original matchmaking
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withMatchedPlayerSessions(MatchedPlayerSession... matchedPlayerSessions) {
        if (this.matchedPlayerSessions == null) {
            setMatchedPlayerSessions(new java.util.ArrayList<MatchedPlayerSession>(matchedPlayerSessions.length));
        }
        for (MatchedPlayerSession ele : matchedPlayerSessions) {
            this.matchedPlayerSessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     * 
     * @param matchedPlayerSessions
     *        Collection of player session IDs, one for each player ID that was included in the original matchmaking
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withMatchedPlayerSessions(java.util.Collection<MatchedPlayerSession> matchedPlayerSessions) {
        setMatchedPlayerSessions(matchedPlayerSessions);
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
        if (getGameSessionArn() != null)
            sb.append("GameSessionArn: ").append(getGameSessionArn()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMatchedPlayerSessions() != null)
            sb.append("MatchedPlayerSessions: ").append(getMatchedPlayerSessions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameSessionConnectionInfo == false)
            return false;
        GameSessionConnectionInfo other = (GameSessionConnectionInfo) obj;
        if (other.getGameSessionArn() == null ^ this.getGameSessionArn() == null)
            return false;
        if (other.getGameSessionArn() != null && other.getGameSessionArn().equals(this.getGameSessionArn()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMatchedPlayerSessions() == null ^ this.getMatchedPlayerSessions() == null)
            return false;
        if (other.getMatchedPlayerSessions() != null && other.getMatchedPlayerSessions().equals(this.getMatchedPlayerSessions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameSessionArn() == null) ? 0 : getGameSessionArn().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMatchedPlayerSessions() == null) ? 0 : getMatchedPlayerSessions().hashCode());
        return hashCode;
    }

    @Override
    public GameSessionConnectionInfo clone() {
        try {
            return (GameSessionConnectionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameSessionConnectionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
