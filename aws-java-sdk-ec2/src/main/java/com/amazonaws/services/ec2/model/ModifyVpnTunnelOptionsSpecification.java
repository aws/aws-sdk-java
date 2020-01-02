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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The AWS Site-to-Site VPN tunnel options to modify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVpnTunnelOptionsSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpnTunnelOptionsSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     * connections that use the same virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks are
     * reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     */
    private String tunnelInsideCidr;
    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer
     * gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     * </p>
     */
    private String preSharedKey;
    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 28,800.
     * </p>
     * <p>
     * Default: <code>28800</code>
     * </p>
     */
    private Integer phase1LifetimeSeconds;
    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 3,600. The value must be less than the value for
     * <code>Phase1LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>3600</code>
     * </p>
     */
    private Integer phase2LifetimeSeconds;
    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection
     * performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for
     * <code>RekeyFuzzPercentage</code>.
     * </p>
     * <p>
     * Constraints: A value between 60 and half of <code>Phase2LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>540</code>
     * </p>
     */
    private Integer rekeyMarginTimeSeconds;
    /**
     * <p>
     * The percentage of the rekey window (determined by <code>RekeyMarginTimeSeconds</code>) during which the rekey
     * time is randomly selected.
     * </p>
     * <p>
     * Constraints: A value between 0 and 100.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     */
    private Integer rekeyFuzzPercentage;
    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * <p>
     * Constraints: A value between 64 and 2048.
     * </p>
     * <p>
     * Default: <code>1024</code>
     * </p>
     */
    private Integer replayWindowSize;
    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Constraints: A value between 0 and 30.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     */
    private Integer dPDTimeoutSeconds;
    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsRequestListValue> phase1EncryptionAlgorithms;
    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsRequestListValue> phase2EncryptionAlgorithms;
    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsRequestListValue> phase1IntegrityAlgorithms;
    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsRequestListValue> phase2IntegrityAlgorithms;
    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     * <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersRequestListValue> phase1DHGroupNumbers;
    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     * <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersRequestListValue> phase2DHGroupNumbers;
    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IKEVersionsRequestListValue> iKEVersions;

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     * connections that use the same virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks are
     * reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tunnelInsideCidr
     *        The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     *        connections that use the same virtual private gateway. </p>
     *        <p>
     *        Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks
     *        are reserved and cannot be used:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>169.254.0.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.1.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.2.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.3.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.4.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.5.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.169.252/30</code>
     *        </p>
     *        </li>
     */

    public void setTunnelInsideCidr(String tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     * connections that use the same virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks are
     * reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     *         connections that use the same virtual private gateway. </p>
     *         <p>
     *         Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks
     *         are reserved and cannot be used:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>169.254.0.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.1.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.2.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.3.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.4.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.5.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.169.252/30</code>
     *         </p>
     *         </li>
     */

    public String getTunnelInsideCidr() {
        return this.tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     * connections that use the same virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks are
     * reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tunnelInsideCidr
     *        The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     *        connections that use the same virtual private gateway. </p>
     *        <p>
     *        Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks
     *        are reserved and cannot be used:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>169.254.0.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.1.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.2.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.3.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.4.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.5.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.169.252/30</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withTunnelInsideCidr(String tunnelInsideCidr) {
        setTunnelInsideCidr(tunnelInsideCidr);
        return this;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer
     * gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     * </p>
     * 
     * @param preSharedKey
     *        The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the
     *        customer gateway.</p>
     *        <p>
     *        Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be
     *        between 8 and 64 characters in length and cannot start with zero (0).
     */

    public void setPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer
     * gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     * </p>
     * 
     * @return The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the
     *         customer gateway.</p>
     *         <p>
     *         Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be
     *         between 8 and 64 characters in length and cannot start with zero (0).
     */

    public String getPreSharedKey() {
        return this.preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer
     * gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     * </p>
     * 
     * @param preSharedKey
     *        The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the
     *        customer gateway.</p>
     *        <p>
     *        Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be
     *        between 8 and 64 characters in length and cannot start with zero (0).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPreSharedKey(String preSharedKey) {
        setPreSharedKey(preSharedKey);
        return this;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 28,800.
     * </p>
     * <p>
     * Default: <code>28800</code>
     * </p>
     * 
     * @param phase1LifetimeSeconds
     *        The lifetime for phase 1 of the IKE negotiation, in seconds.</p>
     *        <p>
     *        Constraints: A value between 900 and 28,800.
     *        </p>
     *        <p>
     *        Default: <code>28800</code>
     */

    public void setPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
        this.phase1LifetimeSeconds = phase1LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 28,800.
     * </p>
     * <p>
     * Default: <code>28800</code>
     * </p>
     * 
     * @return The lifetime for phase 1 of the IKE negotiation, in seconds.</p>
     *         <p>
     *         Constraints: A value between 900 and 28,800.
     *         </p>
     *         <p>
     *         Default: <code>28800</code>
     */

    public Integer getPhase1LifetimeSeconds() {
        return this.phase1LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 28,800.
     * </p>
     * <p>
     * Default: <code>28800</code>
     * </p>
     * 
     * @param phase1LifetimeSeconds
     *        The lifetime for phase 1 of the IKE negotiation, in seconds.</p>
     *        <p>
     *        Constraints: A value between 900 and 28,800.
     *        </p>
     *        <p>
     *        Default: <code>28800</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
        setPhase1LifetimeSeconds(phase1LifetimeSeconds);
        return this;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 3,600. The value must be less than the value for
     * <code>Phase1LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>3600</code>
     * </p>
     * 
     * @param phase2LifetimeSeconds
     *        The lifetime for phase 2 of the IKE negotiation, in seconds.</p>
     *        <p>
     *        Constraints: A value between 900 and 3,600. The value must be less than the value for
     *        <code>Phase1LifetimeSeconds</code>.
     *        </p>
     *        <p>
     *        Default: <code>3600</code>
     */

    public void setPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
        this.phase2LifetimeSeconds = phase2LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 3,600. The value must be less than the value for
     * <code>Phase1LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>3600</code>
     * </p>
     * 
     * @return The lifetime for phase 2 of the IKE negotiation, in seconds.</p>
     *         <p>
     *         Constraints: A value between 900 and 3,600. The value must be less than the value for
     *         <code>Phase1LifetimeSeconds</code>.
     *         </p>
     *         <p>
     *         Default: <code>3600</code>
     */

    public Integer getPhase2LifetimeSeconds() {
        return this.phase2LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * <p>
     * Constraints: A value between 900 and 3,600. The value must be less than the value for
     * <code>Phase1LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>3600</code>
     * </p>
     * 
     * @param phase2LifetimeSeconds
     *        The lifetime for phase 2 of the IKE negotiation, in seconds.</p>
     *        <p>
     *        Constraints: A value between 900 and 3,600. The value must be less than the value for
     *        <code>Phase1LifetimeSeconds</code>.
     *        </p>
     *        <p>
     *        Default: <code>3600</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
        setPhase2LifetimeSeconds(phase2LifetimeSeconds);
        return this;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection
     * performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for
     * <code>RekeyFuzzPercentage</code>.
     * </p>
     * <p>
     * Constraints: A value between 60 and half of <code>Phase2LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>540</code>
     * </p>
     * 
     * @param rekeyMarginTimeSeconds
     *        The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN
     *        connection performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for
     *        <code>RekeyFuzzPercentage</code>.</p>
     *        <p>
     *        Constraints: A value between 60 and half of <code>Phase2LifetimeSeconds</code>.
     *        </p>
     *        <p>
     *        Default: <code>540</code>
     */

    public void setRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
        this.rekeyMarginTimeSeconds = rekeyMarginTimeSeconds;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection
     * performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for
     * <code>RekeyFuzzPercentage</code>.
     * </p>
     * <p>
     * Constraints: A value between 60 and half of <code>Phase2LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>540</code>
     * </p>
     * 
     * @return The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN
     *         connection performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for
     *         <code>RekeyFuzzPercentage</code>.</p>
     *         <p>
     *         Constraints: A value between 60 and half of <code>Phase2LifetimeSeconds</code>.
     *         </p>
     *         <p>
     *         Default: <code>540</code>
     */

    public Integer getRekeyMarginTimeSeconds() {
        return this.rekeyMarginTimeSeconds;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection
     * performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for
     * <code>RekeyFuzzPercentage</code>.
     * </p>
     * <p>
     * Constraints: A value between 60 and half of <code>Phase2LifetimeSeconds</code>.
     * </p>
     * <p>
     * Default: <code>540</code>
     * </p>
     * 
     * @param rekeyMarginTimeSeconds
     *        The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN
     *        connection performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for
     *        <code>RekeyFuzzPercentage</code>.</p>
     *        <p>
     *        Constraints: A value between 60 and half of <code>Phase2LifetimeSeconds</code>.
     *        </p>
     *        <p>
     *        Default: <code>540</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
        setRekeyMarginTimeSeconds(rekeyMarginTimeSeconds);
        return this;
    }

    /**
     * <p>
     * The percentage of the rekey window (determined by <code>RekeyMarginTimeSeconds</code>) during which the rekey
     * time is randomly selected.
     * </p>
     * <p>
     * Constraints: A value between 0 and 100.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @param rekeyFuzzPercentage
     *        The percentage of the rekey window (determined by <code>RekeyMarginTimeSeconds</code>) during which the
     *        rekey time is randomly selected.</p>
     *        <p>
     *        Constraints: A value between 0 and 100.
     *        </p>
     *        <p>
     *        Default: <code>100</code>
     */

    public void setRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
        this.rekeyFuzzPercentage = rekeyFuzzPercentage;
    }

    /**
     * <p>
     * The percentage of the rekey window (determined by <code>RekeyMarginTimeSeconds</code>) during which the rekey
     * time is randomly selected.
     * </p>
     * <p>
     * Constraints: A value between 0 and 100.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @return The percentage of the rekey window (determined by <code>RekeyMarginTimeSeconds</code>) during which the
     *         rekey time is randomly selected.</p>
     *         <p>
     *         Constraints: A value between 0 and 100.
     *         </p>
     *         <p>
     *         Default: <code>100</code>
     */

    public Integer getRekeyFuzzPercentage() {
        return this.rekeyFuzzPercentage;
    }

    /**
     * <p>
     * The percentage of the rekey window (determined by <code>RekeyMarginTimeSeconds</code>) during which the rekey
     * time is randomly selected.
     * </p>
     * <p>
     * Constraints: A value between 0 and 100.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @param rekeyFuzzPercentage
     *        The percentage of the rekey window (determined by <code>RekeyMarginTimeSeconds</code>) during which the
     *        rekey time is randomly selected.</p>
     *        <p>
     *        Constraints: A value between 0 and 100.
     *        </p>
     *        <p>
     *        Default: <code>100</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
        setRekeyFuzzPercentage(rekeyFuzzPercentage);
        return this;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * <p>
     * Constraints: A value between 64 and 2048.
     * </p>
     * <p>
     * Default: <code>1024</code>
     * </p>
     * 
     * @param replayWindowSize
     *        The number of packets in an IKE replay window.</p>
     *        <p>
     *        Constraints: A value between 64 and 2048.
     *        </p>
     *        <p>
     *        Default: <code>1024</code>
     */

    public void setReplayWindowSize(Integer replayWindowSize) {
        this.replayWindowSize = replayWindowSize;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * <p>
     * Constraints: A value between 64 and 2048.
     * </p>
     * <p>
     * Default: <code>1024</code>
     * </p>
     * 
     * @return The number of packets in an IKE replay window.</p>
     *         <p>
     *         Constraints: A value between 64 and 2048.
     *         </p>
     *         <p>
     *         Default: <code>1024</code>
     */

    public Integer getReplayWindowSize() {
        return this.replayWindowSize;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * <p>
     * Constraints: A value between 64 and 2048.
     * </p>
     * <p>
     * Default: <code>1024</code>
     * </p>
     * 
     * @param replayWindowSize
     *        The number of packets in an IKE replay window.</p>
     *        <p>
     *        Constraints: A value between 64 and 2048.
     *        </p>
     *        <p>
     *        Default: <code>1024</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withReplayWindowSize(Integer replayWindowSize) {
        setReplayWindowSize(replayWindowSize);
        return this;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Constraints: A value between 0 and 30.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     * 
     * @param dPDTimeoutSeconds
     *        The number of seconds after which a DPD timeout occurs.</p>
     *        <p>
     *        Constraints: A value between 0 and 30.
     *        </p>
     *        <p>
     *        Default: <code>30</code>
     */

    public void setDPDTimeoutSeconds(Integer dPDTimeoutSeconds) {
        this.dPDTimeoutSeconds = dPDTimeoutSeconds;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Constraints: A value between 0 and 30.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     * 
     * @return The number of seconds after which a DPD timeout occurs.</p>
     *         <p>
     *         Constraints: A value between 0 and 30.
     *         </p>
     *         <p>
     *         Default: <code>30</code>
     */

    public Integer getDPDTimeoutSeconds() {
        return this.dPDTimeoutSeconds;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * <p>
     * Constraints: A value between 0 and 30.
     * </p>
     * <p>
     * Default: <code>30</code>
     * </p>
     * 
     * @param dPDTimeoutSeconds
     *        The number of seconds after which a DPD timeout occurs.</p>
     *        <p>
     *        Constraints: A value between 0 and 30.
     *        </p>
     *        <p>
     *        Default: <code>30</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withDPDTimeoutSeconds(Integer dPDTimeoutSeconds) {
        setDPDTimeoutSeconds(dPDTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * 
     * @return One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.</p>
     *         <p>
     *         Valid values: <code>AES128</code> | <code>AES256</code>
     */

    public java.util.List<Phase1EncryptionAlgorithmsRequestListValue> getPhase1EncryptionAlgorithms() {
        if (phase1EncryptionAlgorithms == null) {
            phase1EncryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsRequestListValue>();
        }
        return phase1EncryptionAlgorithms;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * 
     * @param phase1EncryptionAlgorithms
     *        One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>AES128</code> | <code>AES256</code>
     */

    public void setPhase1EncryptionAlgorithms(java.util.Collection<Phase1EncryptionAlgorithmsRequestListValue> phase1EncryptionAlgorithms) {
        if (phase1EncryptionAlgorithms == null) {
            this.phase1EncryptionAlgorithms = null;
            return;
        }

        this.phase1EncryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsRequestListValue>(phase1EncryptionAlgorithms);
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase1EncryptionAlgorithms(java.util.Collection)} or
     * {@link #withPhase1EncryptionAlgorithms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phase1EncryptionAlgorithms
     *        One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>AES128</code> | <code>AES256</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase1EncryptionAlgorithms(Phase1EncryptionAlgorithmsRequestListValue... phase1EncryptionAlgorithms) {
        if (this.phase1EncryptionAlgorithms == null) {
            setPhase1EncryptionAlgorithms(new com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsRequestListValue>(
                    phase1EncryptionAlgorithms.length));
        }
        for (Phase1EncryptionAlgorithmsRequestListValue ele : phase1EncryptionAlgorithms) {
            this.phase1EncryptionAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * 
     * @param phase1EncryptionAlgorithms
     *        One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>AES128</code> | <code>AES256</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase1EncryptionAlgorithms(
            java.util.Collection<Phase1EncryptionAlgorithmsRequestListValue> phase1EncryptionAlgorithms) {
        setPhase1EncryptionAlgorithms(phase1EncryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * 
     * @return One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.</p>
     *         <p>
     *         Valid values: <code>AES128</code> | <code>AES256</code>
     */

    public java.util.List<Phase2EncryptionAlgorithmsRequestListValue> getPhase2EncryptionAlgorithms() {
        if (phase2EncryptionAlgorithms == null) {
            phase2EncryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsRequestListValue>();
        }
        return phase2EncryptionAlgorithms;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * 
     * @param phase2EncryptionAlgorithms
     *        One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>AES128</code> | <code>AES256</code>
     */

    public void setPhase2EncryptionAlgorithms(java.util.Collection<Phase2EncryptionAlgorithmsRequestListValue> phase2EncryptionAlgorithms) {
        if (phase2EncryptionAlgorithms == null) {
            this.phase2EncryptionAlgorithms = null;
            return;
        }

        this.phase2EncryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsRequestListValue>(phase2EncryptionAlgorithms);
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase2EncryptionAlgorithms(java.util.Collection)} or
     * {@link #withPhase2EncryptionAlgorithms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phase2EncryptionAlgorithms
     *        One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>AES128</code> | <code>AES256</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase2EncryptionAlgorithms(Phase2EncryptionAlgorithmsRequestListValue... phase2EncryptionAlgorithms) {
        if (this.phase2EncryptionAlgorithms == null) {
            setPhase2EncryptionAlgorithms(new com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsRequestListValue>(
                    phase2EncryptionAlgorithms.length));
        }
        for (Phase2EncryptionAlgorithmsRequestListValue ele : phase2EncryptionAlgorithms) {
            this.phase2EncryptionAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>AES128</code> | <code>AES256</code>
     * </p>
     * 
     * @param phase2EncryptionAlgorithms
     *        One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>AES128</code> | <code>AES256</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase2EncryptionAlgorithms(
            java.util.Collection<Phase2EncryptionAlgorithmsRequestListValue> phase2EncryptionAlgorithms) {
        setPhase2EncryptionAlgorithms(phase2EncryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * 
     * @return One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.</p>
     *         <p>
     *         Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     */

    public java.util.List<Phase1IntegrityAlgorithmsRequestListValue> getPhase1IntegrityAlgorithms() {
        if (phase1IntegrityAlgorithms == null) {
            phase1IntegrityAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsRequestListValue>();
        }
        return phase1IntegrityAlgorithms;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * 
     * @param phase1IntegrityAlgorithms
     *        One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     */

    public void setPhase1IntegrityAlgorithms(java.util.Collection<Phase1IntegrityAlgorithmsRequestListValue> phase1IntegrityAlgorithms) {
        if (phase1IntegrityAlgorithms == null) {
            this.phase1IntegrityAlgorithms = null;
            return;
        }

        this.phase1IntegrityAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsRequestListValue>(phase1IntegrityAlgorithms);
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase1IntegrityAlgorithms(java.util.Collection)} or
     * {@link #withPhase1IntegrityAlgorithms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phase1IntegrityAlgorithms
     *        One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase1IntegrityAlgorithms(Phase1IntegrityAlgorithmsRequestListValue... phase1IntegrityAlgorithms) {
        if (this.phase1IntegrityAlgorithms == null) {
            setPhase1IntegrityAlgorithms(new com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsRequestListValue>(phase1IntegrityAlgorithms.length));
        }
        for (Phase1IntegrityAlgorithmsRequestListValue ele : phase1IntegrityAlgorithms) {
            this.phase1IntegrityAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * 
     * @param phase1IntegrityAlgorithms
     *        One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase1IntegrityAlgorithms(
            java.util.Collection<Phase1IntegrityAlgorithmsRequestListValue> phase1IntegrityAlgorithms) {
        setPhase1IntegrityAlgorithms(phase1IntegrityAlgorithms);
        return this;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * 
     * @return One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.</p>
     *         <p>
     *         Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     */

    public java.util.List<Phase2IntegrityAlgorithmsRequestListValue> getPhase2IntegrityAlgorithms() {
        if (phase2IntegrityAlgorithms == null) {
            phase2IntegrityAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsRequestListValue>();
        }
        return phase2IntegrityAlgorithms;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * 
     * @param phase2IntegrityAlgorithms
     *        One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     */

    public void setPhase2IntegrityAlgorithms(java.util.Collection<Phase2IntegrityAlgorithmsRequestListValue> phase2IntegrityAlgorithms) {
        if (phase2IntegrityAlgorithms == null) {
            this.phase2IntegrityAlgorithms = null;
            return;
        }

        this.phase2IntegrityAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsRequestListValue>(phase2IntegrityAlgorithms);
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase2IntegrityAlgorithms(java.util.Collection)} or
     * {@link #withPhase2IntegrityAlgorithms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phase2IntegrityAlgorithms
     *        One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase2IntegrityAlgorithms(Phase2IntegrityAlgorithmsRequestListValue... phase2IntegrityAlgorithms) {
        if (this.phase2IntegrityAlgorithms == null) {
            setPhase2IntegrityAlgorithms(new com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsRequestListValue>(phase2IntegrityAlgorithms.length));
        }
        for (Phase2IntegrityAlgorithmsRequestListValue ele : phase2IntegrityAlgorithms) {
            this.phase2IntegrityAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * </p>
     * 
     * @param phase2IntegrityAlgorithms
     *        One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations.</p>
     *        <p>
     *        Valid values: <code>SHA1</code> | <code>SHA2-256</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase2IntegrityAlgorithms(
            java.util.Collection<Phase2IntegrityAlgorithmsRequestListValue> phase2IntegrityAlgorithms) {
        setPhase2IntegrityAlgorithms(phase2IntegrityAlgorithms);
        return this;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     * <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * 
     * @return One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE
     *         negotiations.</p>
     *         <p>
     *         Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     *         <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     */

    public java.util.List<Phase1DHGroupNumbersRequestListValue> getPhase1DHGroupNumbers() {
        if (phase1DHGroupNumbers == null) {
            phase1DHGroupNumbers = new com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersRequestListValue>();
        }
        return phase1DHGroupNumbers;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     * <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * 
     * @param phase1DHGroupNumbers
     *        One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE
     *        negotiations.</p>
     *        <p>
     *        Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     *        <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     */

    public void setPhase1DHGroupNumbers(java.util.Collection<Phase1DHGroupNumbersRequestListValue> phase1DHGroupNumbers) {
        if (phase1DHGroupNumbers == null) {
            this.phase1DHGroupNumbers = null;
            return;
        }

        this.phase1DHGroupNumbers = new com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersRequestListValue>(phase1DHGroupNumbers);
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     * <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase1DHGroupNumbers(java.util.Collection)} or {@link #withPhase1DHGroupNumbers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param phase1DHGroupNumbers
     *        One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE
     *        negotiations.</p>
     *        <p>
     *        Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     *        <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase1DHGroupNumbers(Phase1DHGroupNumbersRequestListValue... phase1DHGroupNumbers) {
        if (this.phase1DHGroupNumbers == null) {
            setPhase1DHGroupNumbers(new com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersRequestListValue>(phase1DHGroupNumbers.length));
        }
        for (Phase1DHGroupNumbersRequestListValue ele : phase1DHGroupNumbers) {
            this.phase1DHGroupNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     * <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * 
     * @param phase1DHGroupNumbers
     *        One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE
     *        negotiations.</p>
     *        <p>
     *        Valid values: <code>2</code> | <code>14</code> | <code>15</code> | <code>16</code> | <code>17</code> |
     *        <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase1DHGroupNumbers(java.util.Collection<Phase1DHGroupNumbersRequestListValue> phase1DHGroupNumbers) {
        setPhase1DHGroupNumbers(phase1DHGroupNumbers);
        return this;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     * <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * 
     * @return One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE
     *         negotiations.</p>
     *         <p>
     *         Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     *         <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     */

    public java.util.List<Phase2DHGroupNumbersRequestListValue> getPhase2DHGroupNumbers() {
        if (phase2DHGroupNumbers == null) {
            phase2DHGroupNumbers = new com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersRequestListValue>();
        }
        return phase2DHGroupNumbers;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     * <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * 
     * @param phase2DHGroupNumbers
     *        One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE
     *        negotiations.</p>
     *        <p>
     *        Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     *        <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     */

    public void setPhase2DHGroupNumbers(java.util.Collection<Phase2DHGroupNumbersRequestListValue> phase2DHGroupNumbers) {
        if (phase2DHGroupNumbers == null) {
            this.phase2DHGroupNumbers = null;
            return;
        }

        this.phase2DHGroupNumbers = new com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersRequestListValue>(phase2DHGroupNumbers);
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     * <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase2DHGroupNumbers(java.util.Collection)} or {@link #withPhase2DHGroupNumbers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param phase2DHGroupNumbers
     *        One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE
     *        negotiations.</p>
     *        <p>
     *        Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     *        <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase2DHGroupNumbers(Phase2DHGroupNumbersRequestListValue... phase2DHGroupNumbers) {
        if (this.phase2DHGroupNumbers == null) {
            setPhase2DHGroupNumbers(new com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersRequestListValue>(phase2DHGroupNumbers.length));
        }
        for (Phase2DHGroupNumbersRequestListValue ele : phase2DHGroupNumbers) {
            this.phase2DHGroupNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     * <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * </p>
     * 
     * @param phase2DHGroupNumbers
     *        One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE
     *        negotiations.</p>
     *        <p>
     *        Valid values: <code>2</code> | <code>5</code> | <code>14</code> | <code>15</code> | <code>16</code> |
     *        <code>17</code> | <code>18</code> | <code>22</code> | <code>23</code> | <code>24</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withPhase2DHGroupNumbers(java.util.Collection<Phase2DHGroupNumbersRequestListValue> phase2DHGroupNumbers) {
        setPhase2DHGroupNumbers(phase2DHGroupNumbers);
        return this;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     * 
     * @return The IKE versions that are permitted for the VPN tunnel.</p>
     *         <p>
     *         Valid values: <code>ikev1</code> | <code>ikev2</code>
     */

    public java.util.List<IKEVersionsRequestListValue> getIKEVersions() {
        if (iKEVersions == null) {
            iKEVersions = new com.amazonaws.internal.SdkInternalList<IKEVersionsRequestListValue>();
        }
        return iKEVersions;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     * 
     * @param iKEVersions
     *        The IKE versions that are permitted for the VPN tunnel.</p>
     *        <p>
     *        Valid values: <code>ikev1</code> | <code>ikev2</code>
     */

    public void setIKEVersions(java.util.Collection<IKEVersionsRequestListValue> iKEVersions) {
        if (iKEVersions == null) {
            this.iKEVersions = null;
            return;
        }

        this.iKEVersions = new com.amazonaws.internal.SdkInternalList<IKEVersionsRequestListValue>(iKEVersions);
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIKEVersions(java.util.Collection)} or {@link #withIKEVersions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param iKEVersions
     *        The IKE versions that are permitted for the VPN tunnel.</p>
     *        <p>
     *        Valid values: <code>ikev1</code> | <code>ikev2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withIKEVersions(IKEVersionsRequestListValue... iKEVersions) {
        if (this.iKEVersions == null) {
            setIKEVersions(new com.amazonaws.internal.SdkInternalList<IKEVersionsRequestListValue>(iKEVersions.length));
        }
        for (IKEVersionsRequestListValue ele : iKEVersions) {
            this.iKEVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * Valid values: <code>ikev1</code> | <code>ikev2</code>
     * </p>
     * 
     * @param iKEVersions
     *        The IKE versions that are permitted for the VPN tunnel.</p>
     *        <p>
     *        Valid values: <code>ikev1</code> | <code>ikev2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelOptionsSpecification withIKEVersions(java.util.Collection<IKEVersionsRequestListValue> iKEVersions) {
        setIKEVersions(iKEVersions);
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
        if (getTunnelInsideCidr() != null)
            sb.append("TunnelInsideCidr: ").append(getTunnelInsideCidr()).append(",");
        if (getPreSharedKey() != null)
            sb.append("PreSharedKey: ").append(getPreSharedKey()).append(",");
        if (getPhase1LifetimeSeconds() != null)
            sb.append("Phase1LifetimeSeconds: ").append(getPhase1LifetimeSeconds()).append(",");
        if (getPhase2LifetimeSeconds() != null)
            sb.append("Phase2LifetimeSeconds: ").append(getPhase2LifetimeSeconds()).append(",");
        if (getRekeyMarginTimeSeconds() != null)
            sb.append("RekeyMarginTimeSeconds: ").append(getRekeyMarginTimeSeconds()).append(",");
        if (getRekeyFuzzPercentage() != null)
            sb.append("RekeyFuzzPercentage: ").append(getRekeyFuzzPercentage()).append(",");
        if (getReplayWindowSize() != null)
            sb.append("ReplayWindowSize: ").append(getReplayWindowSize()).append(",");
        if (getDPDTimeoutSeconds() != null)
            sb.append("DPDTimeoutSeconds: ").append(getDPDTimeoutSeconds()).append(",");
        if (getPhase1EncryptionAlgorithms() != null)
            sb.append("Phase1EncryptionAlgorithms: ").append(getPhase1EncryptionAlgorithms()).append(",");
        if (getPhase2EncryptionAlgorithms() != null)
            sb.append("Phase2EncryptionAlgorithms: ").append(getPhase2EncryptionAlgorithms()).append(",");
        if (getPhase1IntegrityAlgorithms() != null)
            sb.append("Phase1IntegrityAlgorithms: ").append(getPhase1IntegrityAlgorithms()).append(",");
        if (getPhase2IntegrityAlgorithms() != null)
            sb.append("Phase2IntegrityAlgorithms: ").append(getPhase2IntegrityAlgorithms()).append(",");
        if (getPhase1DHGroupNumbers() != null)
            sb.append("Phase1DHGroupNumbers: ").append(getPhase1DHGroupNumbers()).append(",");
        if (getPhase2DHGroupNumbers() != null)
            sb.append("Phase2DHGroupNumbers: ").append(getPhase2DHGroupNumbers()).append(",");
        if (getIKEVersions() != null)
            sb.append("IKEVersions: ").append(getIKEVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpnTunnelOptionsSpecification == false)
            return false;
        ModifyVpnTunnelOptionsSpecification other = (ModifyVpnTunnelOptionsSpecification) obj;
        if (other.getTunnelInsideCidr() == null ^ this.getTunnelInsideCidr() == null)
            return false;
        if (other.getTunnelInsideCidr() != null && other.getTunnelInsideCidr().equals(this.getTunnelInsideCidr()) == false)
            return false;
        if (other.getPreSharedKey() == null ^ this.getPreSharedKey() == null)
            return false;
        if (other.getPreSharedKey() != null && other.getPreSharedKey().equals(this.getPreSharedKey()) == false)
            return false;
        if (other.getPhase1LifetimeSeconds() == null ^ this.getPhase1LifetimeSeconds() == null)
            return false;
        if (other.getPhase1LifetimeSeconds() != null && other.getPhase1LifetimeSeconds().equals(this.getPhase1LifetimeSeconds()) == false)
            return false;
        if (other.getPhase2LifetimeSeconds() == null ^ this.getPhase2LifetimeSeconds() == null)
            return false;
        if (other.getPhase2LifetimeSeconds() != null && other.getPhase2LifetimeSeconds().equals(this.getPhase2LifetimeSeconds()) == false)
            return false;
        if (other.getRekeyMarginTimeSeconds() == null ^ this.getRekeyMarginTimeSeconds() == null)
            return false;
        if (other.getRekeyMarginTimeSeconds() != null && other.getRekeyMarginTimeSeconds().equals(this.getRekeyMarginTimeSeconds()) == false)
            return false;
        if (other.getRekeyFuzzPercentage() == null ^ this.getRekeyFuzzPercentage() == null)
            return false;
        if (other.getRekeyFuzzPercentage() != null && other.getRekeyFuzzPercentage().equals(this.getRekeyFuzzPercentage()) == false)
            return false;
        if (other.getReplayWindowSize() == null ^ this.getReplayWindowSize() == null)
            return false;
        if (other.getReplayWindowSize() != null && other.getReplayWindowSize().equals(this.getReplayWindowSize()) == false)
            return false;
        if (other.getDPDTimeoutSeconds() == null ^ this.getDPDTimeoutSeconds() == null)
            return false;
        if (other.getDPDTimeoutSeconds() != null && other.getDPDTimeoutSeconds().equals(this.getDPDTimeoutSeconds()) == false)
            return false;
        if (other.getPhase1EncryptionAlgorithms() == null ^ this.getPhase1EncryptionAlgorithms() == null)
            return false;
        if (other.getPhase1EncryptionAlgorithms() != null && other.getPhase1EncryptionAlgorithms().equals(this.getPhase1EncryptionAlgorithms()) == false)
            return false;
        if (other.getPhase2EncryptionAlgorithms() == null ^ this.getPhase2EncryptionAlgorithms() == null)
            return false;
        if (other.getPhase2EncryptionAlgorithms() != null && other.getPhase2EncryptionAlgorithms().equals(this.getPhase2EncryptionAlgorithms()) == false)
            return false;
        if (other.getPhase1IntegrityAlgorithms() == null ^ this.getPhase1IntegrityAlgorithms() == null)
            return false;
        if (other.getPhase1IntegrityAlgorithms() != null && other.getPhase1IntegrityAlgorithms().equals(this.getPhase1IntegrityAlgorithms()) == false)
            return false;
        if (other.getPhase2IntegrityAlgorithms() == null ^ this.getPhase2IntegrityAlgorithms() == null)
            return false;
        if (other.getPhase2IntegrityAlgorithms() != null && other.getPhase2IntegrityAlgorithms().equals(this.getPhase2IntegrityAlgorithms()) == false)
            return false;
        if (other.getPhase1DHGroupNumbers() == null ^ this.getPhase1DHGroupNumbers() == null)
            return false;
        if (other.getPhase1DHGroupNumbers() != null && other.getPhase1DHGroupNumbers().equals(this.getPhase1DHGroupNumbers()) == false)
            return false;
        if (other.getPhase2DHGroupNumbers() == null ^ this.getPhase2DHGroupNumbers() == null)
            return false;
        if (other.getPhase2DHGroupNumbers() != null && other.getPhase2DHGroupNumbers().equals(this.getPhase2DHGroupNumbers()) == false)
            return false;
        if (other.getIKEVersions() == null ^ this.getIKEVersions() == null)
            return false;
        if (other.getIKEVersions() != null && other.getIKEVersions().equals(this.getIKEVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnelInsideCidr() == null) ? 0 : getTunnelInsideCidr().hashCode());
        hashCode = prime * hashCode + ((getPreSharedKey() == null) ? 0 : getPreSharedKey().hashCode());
        hashCode = prime * hashCode + ((getPhase1LifetimeSeconds() == null) ? 0 : getPhase1LifetimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getPhase2LifetimeSeconds() == null) ? 0 : getPhase2LifetimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getRekeyMarginTimeSeconds() == null) ? 0 : getRekeyMarginTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getRekeyFuzzPercentage() == null) ? 0 : getRekeyFuzzPercentage().hashCode());
        hashCode = prime * hashCode + ((getReplayWindowSize() == null) ? 0 : getReplayWindowSize().hashCode());
        hashCode = prime * hashCode + ((getDPDTimeoutSeconds() == null) ? 0 : getDPDTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getPhase1EncryptionAlgorithms() == null) ? 0 : getPhase1EncryptionAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getPhase2EncryptionAlgorithms() == null) ? 0 : getPhase2EncryptionAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getPhase1IntegrityAlgorithms() == null) ? 0 : getPhase1IntegrityAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getPhase2IntegrityAlgorithms() == null) ? 0 : getPhase2IntegrityAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getPhase1DHGroupNumbers() == null) ? 0 : getPhase1DHGroupNumbers().hashCode());
        hashCode = prime * hashCode + ((getPhase2DHGroupNumbers() == null) ? 0 : getPhase2DHGroupNumbers().hashCode());
        hashCode = prime * hashCode + ((getIKEVersions() == null) ? 0 : getIKEVersions().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpnTunnelOptionsSpecification clone() {
        try {
            return (ModifyVpnTunnelOptionsSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
