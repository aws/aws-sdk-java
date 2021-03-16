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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Connection information for a new game session that is created in response to a <a>StartMatchmaking</a> request. Once
 * a match is made, the FlexMatch engine creates a new game session for it. This information, including the game session
 * endpoint and player sessions for each player in the original matchmaking request, is added to the
 * <a>MatchmakingTicket</a>, which can be retrieved by calling <a>DescribeMatchmaking</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameSessionConnectionInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionConnectionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the game session. Use the game session ID.
     * </p>
     */
    private String gameSessionArn;
    /**
     * <p>
     * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * A collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     */
    private java.util.List<MatchedPlayerSession> matchedPlayerSessions;

    /**
     * <p>
     * A unique identifier for the game session. Use the game session ID.
     * </p>
     * 
     * @param gameSessionArn
     *        A unique identifier for the game session. Use the game session ID.
     */

    public void setGameSessionArn(String gameSessionArn) {
        this.gameSessionArn = gameSessionArn;
    }

    /**
     * <p>
     * A unique identifier for the game session. Use the game session ID.
     * </p>
     * 
     * @return A unique identifier for the game session. Use the game session ID.
     */

    public String getGameSessionArn() {
        return this.gameSessionArn;
    }

    /**
     * <p>
     * A unique identifier for the game session. Use the game session ID.
     * </p>
     * 
     * @param gameSessionArn
     *        A unique identifier for the game session. Use the game session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withGameSessionArn(String gameSessionArn) {
        setGameSessionArn(gameSessionArn);
        return this;
    }

    /**
     * <p>
     * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address
     *        and port number.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @return The IP address of the game session. To connect to a GameLift game server, an app needs both the IP
     *         address and port number.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address
     *        and port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @param dnsName
     *        The DNS identifier assigned to the instance that is running the game session. Values have the following
     *        format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *        >Amazon EC2 Instance IP Addressing</a>.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *        the IP address.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @return The DNS identifier assigned to the instance that is running the game session. Values have the following
     *         format:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *         >Amazon EC2 Instance IP Addressing</a>.)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *         the IP address.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS identifier assigned to the instance that is running the game session. Values have the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     * >Amazon EC2 Instance IP Addressing</a>.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP
     * address.
     * </p>
     * 
     * @param dnsName
     *        The DNS identifier assigned to the instance that is running the game session. Values have the following
     *        format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TLS-enabled fleets: <code>&lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Non-TLS-enabled fleets: <code>ec2-&lt;unique identifier&gt;.compute.amazonaws.com</code>. (See <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html#concepts-public-addresses"
     *        >Amazon EC2 Instance IP Addressing</a>.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not
     *        the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param port
     *        The port number for the game session. To connect to a GameLift game server, an app needs both the IP
     *        address and port number.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @return The port number for the game session. To connect to a GameLift game server, an app needs both the IP
     *         address and port number.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param port
     *        The port number for the game session. To connect to a GameLift game server, an app needs both the IP
     *        address and port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionConnectionInfo withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * A collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     * 
     * @return A collection of player session IDs, one for each player ID that was included in the original matchmaking
     *         request.
     */

    public java.util.List<MatchedPlayerSession> getMatchedPlayerSessions() {
        return matchedPlayerSessions;
    }

    /**
     * <p>
     * A collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     * 
     * @param matchedPlayerSessions
     *        A collection of player session IDs, one for each player ID that was included in the original matchmaking
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
     * A collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchedPlayerSessions(java.util.Collection)} or
     * {@link #withMatchedPlayerSessions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param matchedPlayerSessions
     *        A collection of player session IDs, one for each player ID that was included in the original matchmaking
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
     * A collection of player session IDs, one for each player ID that was included in the original matchmaking request.
     * </p>
     * 
     * @param matchedPlayerSessions
     *        A collection of player session IDs, one for each player ID that was included in the original matchmaking
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
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
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
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
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
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
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
