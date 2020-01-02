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
 * The VPN tunnel options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TunnelOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TunnelOption implements Serializable, Cloneable {

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     */
    private String outsideIpAddress;
    /**
     * <p>
     * The range of inside IP addresses for the tunnel.
     * </p>
     */
    private String tunnelInsideCidr;
    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer
     * gateway.
     * </p>
     */
    private String preSharedKey;
    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     */
    private Integer phase1LifetimeSeconds;
    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     */
    private Integer phase2LifetimeSeconds;
    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection
     * performs an IKE rekey.
     * </p>
     */
    private Integer rekeyMarginTimeSeconds;
    /**
     * <p>
     * The percentage of the rekey window determined by <code>RekeyMarginTimeSeconds</code> during which the rekey time
     * is randomly selected.
     * </p>
     */
    private Integer rekeyFuzzPercentage;
    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     */
    private Integer replayWindowSize;
    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     */
    private Integer dpdTimeoutSeconds;
    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsListValue> phase1EncryptionAlgorithms;
    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsListValue> phase2EncryptionAlgorithms;
    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsListValue> phase1IntegrityAlgorithms;
    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsListValue> phase2IntegrityAlgorithms;
    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersListValue> phase1DHGroupNumbers;
    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersListValue> phase2DHGroupNumbers;
    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IKEVersionsListValue> ikeVersions;

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     * 
     * @param outsideIpAddress
     *        The external IP address of the VPN tunnel.
     */

    public void setOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     * 
     * @return The external IP address of the VPN tunnel.
     */

    public String getOutsideIpAddress() {
        return this.outsideIpAddress;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     * 
     * @param outsideIpAddress
     *        The external IP address of the VPN tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withOutsideIpAddress(String outsideIpAddress) {
        setOutsideIpAddress(outsideIpAddress);
        return this;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel.
     * </p>
     * 
     * @param tunnelInsideCidr
     *        The range of inside IP addresses for the tunnel.
     */

    public void setTunnelInsideCidr(String tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel.
     * </p>
     * 
     * @return The range of inside IP addresses for the tunnel.
     */

    public String getTunnelInsideCidr() {
        return this.tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel.
     * </p>
     * 
     * @param tunnelInsideCidr
     *        The range of inside IP addresses for the tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withTunnelInsideCidr(String tunnelInsideCidr) {
        setTunnelInsideCidr(tunnelInsideCidr);
        return this;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer
     * gateway.
     * </p>
     * 
     * @param preSharedKey
     *        The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the
     *        customer gateway.
     */

    public void setPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer
     * gateway.
     * </p>
     * 
     * @return The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the
     *         customer gateway.
     */

    public String getPreSharedKey() {
        return this.preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer
     * gateway.
     * </p>
     * 
     * @param preSharedKey
     *        The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the
     *        customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPreSharedKey(String preSharedKey) {
        setPreSharedKey(preSharedKey);
        return this;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * 
     * @param phase1LifetimeSeconds
     *        The lifetime for phase 1 of the IKE negotiation, in seconds.
     */

    public void setPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
        this.phase1LifetimeSeconds = phase1LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * 
     * @return The lifetime for phase 1 of the IKE negotiation, in seconds.
     */

    public Integer getPhase1LifetimeSeconds() {
        return this.phase1LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * </p>
     * 
     * @param phase1LifetimeSeconds
     *        The lifetime for phase 1 of the IKE negotiation, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
        setPhase1LifetimeSeconds(phase1LifetimeSeconds);
        return this;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * 
     * @param phase2LifetimeSeconds
     *        The lifetime for phase 2 of the IKE negotiation, in seconds.
     */

    public void setPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
        this.phase2LifetimeSeconds = phase2LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * 
     * @return The lifetime for phase 2 of the IKE negotiation, in seconds.
     */

    public Integer getPhase2LifetimeSeconds() {
        return this.phase2LifetimeSeconds;
    }

    /**
     * <p>
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * </p>
     * 
     * @param phase2LifetimeSeconds
     *        The lifetime for phase 2 of the IKE negotiation, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
        setPhase2LifetimeSeconds(phase2LifetimeSeconds);
        return this;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection
     * performs an IKE rekey.
     * </p>
     * 
     * @param rekeyMarginTimeSeconds
     *        The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN
     *        connection performs an IKE rekey.
     */

    public void setRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
        this.rekeyMarginTimeSeconds = rekeyMarginTimeSeconds;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection
     * performs an IKE rekey.
     * </p>
     * 
     * @return The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN
     *         connection performs an IKE rekey.
     */

    public Integer getRekeyMarginTimeSeconds() {
        return this.rekeyMarginTimeSeconds;
    }

    /**
     * <p>
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection
     * performs an IKE rekey.
     * </p>
     * 
     * @param rekeyMarginTimeSeconds
     *        The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN
     *        connection performs an IKE rekey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withRekeyMarginTimeSeconds(Integer rekeyMarginTimeSeconds) {
        setRekeyMarginTimeSeconds(rekeyMarginTimeSeconds);
        return this;
    }

    /**
     * <p>
     * The percentage of the rekey window determined by <code>RekeyMarginTimeSeconds</code> during which the rekey time
     * is randomly selected.
     * </p>
     * 
     * @param rekeyFuzzPercentage
     *        The percentage of the rekey window determined by <code>RekeyMarginTimeSeconds</code> during which the
     *        rekey time is randomly selected.
     */

    public void setRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
        this.rekeyFuzzPercentage = rekeyFuzzPercentage;
    }

    /**
     * <p>
     * The percentage of the rekey window determined by <code>RekeyMarginTimeSeconds</code> during which the rekey time
     * is randomly selected.
     * </p>
     * 
     * @return The percentage of the rekey window determined by <code>RekeyMarginTimeSeconds</code> during which the
     *         rekey time is randomly selected.
     */

    public Integer getRekeyFuzzPercentage() {
        return this.rekeyFuzzPercentage;
    }

    /**
     * <p>
     * The percentage of the rekey window determined by <code>RekeyMarginTimeSeconds</code> during which the rekey time
     * is randomly selected.
     * </p>
     * 
     * @param rekeyFuzzPercentage
     *        The percentage of the rekey window determined by <code>RekeyMarginTimeSeconds</code> during which the
     *        rekey time is randomly selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withRekeyFuzzPercentage(Integer rekeyFuzzPercentage) {
        setRekeyFuzzPercentage(rekeyFuzzPercentage);
        return this;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * 
     * @param replayWindowSize
     *        The number of packets in an IKE replay window.
     */

    public void setReplayWindowSize(Integer replayWindowSize) {
        this.replayWindowSize = replayWindowSize;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * 
     * @return The number of packets in an IKE replay window.
     */

    public Integer getReplayWindowSize() {
        return this.replayWindowSize;
    }

    /**
     * <p>
     * The number of packets in an IKE replay window.
     * </p>
     * 
     * @param replayWindowSize
     *        The number of packets in an IKE replay window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withReplayWindowSize(Integer replayWindowSize) {
        setReplayWindowSize(replayWindowSize);
        return this;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * 
     * @param dpdTimeoutSeconds
     *        The number of seconds after which a DPD timeout occurs.
     */

    public void setDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * 
     * @return The number of seconds after which a DPD timeout occurs.
     */

    public Integer getDpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds;
    }

    /**
     * <p>
     * The number of seconds after which a DPD timeout occurs.
     * </p>
     * 
     * @param dpdTimeoutSeconds
     *        The number of seconds after which a DPD timeout occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
        setDpdTimeoutSeconds(dpdTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @return The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     */

    public java.util.List<Phase1EncryptionAlgorithmsListValue> getPhase1EncryptionAlgorithms() {
        if (phase1EncryptionAlgorithms == null) {
            phase1EncryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsListValue>();
        }
        return phase1EncryptionAlgorithms;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @param phase1EncryptionAlgorithms
     *        The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     */

    public void setPhase1EncryptionAlgorithms(java.util.Collection<Phase1EncryptionAlgorithmsListValue> phase1EncryptionAlgorithms) {
        if (phase1EncryptionAlgorithms == null) {
            this.phase1EncryptionAlgorithms = null;
            return;
        }

        this.phase1EncryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsListValue>(phase1EncryptionAlgorithms);
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase1EncryptionAlgorithms(java.util.Collection)} or
     * {@link #withPhase1EncryptionAlgorithms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phase1EncryptionAlgorithms
     *        The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase1EncryptionAlgorithms(Phase1EncryptionAlgorithmsListValue... phase1EncryptionAlgorithms) {
        if (this.phase1EncryptionAlgorithms == null) {
            setPhase1EncryptionAlgorithms(new com.amazonaws.internal.SdkInternalList<Phase1EncryptionAlgorithmsListValue>(phase1EncryptionAlgorithms.length));
        }
        for (Phase1EncryptionAlgorithmsListValue ele : phase1EncryptionAlgorithms) {
            this.phase1EncryptionAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @param phase1EncryptionAlgorithms
     *        The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase1EncryptionAlgorithms(java.util.Collection<Phase1EncryptionAlgorithmsListValue> phase1EncryptionAlgorithms) {
        setPhase1EncryptionAlgorithms(phase1EncryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @return The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     */

    public java.util.List<Phase2EncryptionAlgorithmsListValue> getPhase2EncryptionAlgorithms() {
        if (phase2EncryptionAlgorithms == null) {
            phase2EncryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsListValue>();
        }
        return phase2EncryptionAlgorithms;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @param phase2EncryptionAlgorithms
     *        The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     */

    public void setPhase2EncryptionAlgorithms(java.util.Collection<Phase2EncryptionAlgorithmsListValue> phase2EncryptionAlgorithms) {
        if (phase2EncryptionAlgorithms == null) {
            this.phase2EncryptionAlgorithms = null;
            return;
        }

        this.phase2EncryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsListValue>(phase2EncryptionAlgorithms);
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase2EncryptionAlgorithms(java.util.Collection)} or
     * {@link #withPhase2EncryptionAlgorithms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phase2EncryptionAlgorithms
     *        The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase2EncryptionAlgorithms(Phase2EncryptionAlgorithmsListValue... phase2EncryptionAlgorithms) {
        if (this.phase2EncryptionAlgorithms == null) {
            setPhase2EncryptionAlgorithms(new com.amazonaws.internal.SdkInternalList<Phase2EncryptionAlgorithmsListValue>(phase2EncryptionAlgorithms.length));
        }
        for (Phase2EncryptionAlgorithmsListValue ele : phase2EncryptionAlgorithms) {
            this.phase2EncryptionAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @param phase2EncryptionAlgorithms
     *        The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase2EncryptionAlgorithms(java.util.Collection<Phase2EncryptionAlgorithmsListValue> phase2EncryptionAlgorithms) {
        setPhase2EncryptionAlgorithms(phase2EncryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @return The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     */

    public java.util.List<Phase1IntegrityAlgorithmsListValue> getPhase1IntegrityAlgorithms() {
        if (phase1IntegrityAlgorithms == null) {
            phase1IntegrityAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsListValue>();
        }
        return phase1IntegrityAlgorithms;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @param phase1IntegrityAlgorithms
     *        The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     */

    public void setPhase1IntegrityAlgorithms(java.util.Collection<Phase1IntegrityAlgorithmsListValue> phase1IntegrityAlgorithms) {
        if (phase1IntegrityAlgorithms == null) {
            this.phase1IntegrityAlgorithms = null;
            return;
        }

        this.phase1IntegrityAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsListValue>(phase1IntegrityAlgorithms);
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase1IntegrityAlgorithms(java.util.Collection)} or
     * {@link #withPhase1IntegrityAlgorithms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phase1IntegrityAlgorithms
     *        The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase1IntegrityAlgorithms(Phase1IntegrityAlgorithmsListValue... phase1IntegrityAlgorithms) {
        if (this.phase1IntegrityAlgorithms == null) {
            setPhase1IntegrityAlgorithms(new com.amazonaws.internal.SdkInternalList<Phase1IntegrityAlgorithmsListValue>(phase1IntegrityAlgorithms.length));
        }
        for (Phase1IntegrityAlgorithmsListValue ele : phase1IntegrityAlgorithms) {
            this.phase1IntegrityAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @param phase1IntegrityAlgorithms
     *        The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase1IntegrityAlgorithms(java.util.Collection<Phase1IntegrityAlgorithmsListValue> phase1IntegrityAlgorithms) {
        setPhase1IntegrityAlgorithms(phase1IntegrityAlgorithms);
        return this;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @return The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     */

    public java.util.List<Phase2IntegrityAlgorithmsListValue> getPhase2IntegrityAlgorithms() {
        if (phase2IntegrityAlgorithms == null) {
            phase2IntegrityAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsListValue>();
        }
        return phase2IntegrityAlgorithms;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @param phase2IntegrityAlgorithms
     *        The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     */

    public void setPhase2IntegrityAlgorithms(java.util.Collection<Phase2IntegrityAlgorithmsListValue> phase2IntegrityAlgorithms) {
        if (phase2IntegrityAlgorithms == null) {
            this.phase2IntegrityAlgorithms = null;
            return;
        }

        this.phase2IntegrityAlgorithms = new com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsListValue>(phase2IntegrityAlgorithms);
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase2IntegrityAlgorithms(java.util.Collection)} or
     * {@link #withPhase2IntegrityAlgorithms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phase2IntegrityAlgorithms
     *        The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase2IntegrityAlgorithms(Phase2IntegrityAlgorithmsListValue... phase2IntegrityAlgorithms) {
        if (this.phase2IntegrityAlgorithms == null) {
            setPhase2IntegrityAlgorithms(new com.amazonaws.internal.SdkInternalList<Phase2IntegrityAlgorithmsListValue>(phase2IntegrityAlgorithms.length));
        }
        for (Phase2IntegrityAlgorithmsListValue ele : phase2IntegrityAlgorithms) {
            this.phase2IntegrityAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @param phase2IntegrityAlgorithms
     *        The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase2IntegrityAlgorithms(java.util.Collection<Phase2IntegrityAlgorithmsListValue> phase2IntegrityAlgorithms) {
        setPhase2IntegrityAlgorithms(phase2IntegrityAlgorithms);
        return this;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @return The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     */

    public java.util.List<Phase1DHGroupNumbersListValue> getPhase1DHGroupNumbers() {
        if (phase1DHGroupNumbers == null) {
            phase1DHGroupNumbers = new com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersListValue>();
        }
        return phase1DHGroupNumbers;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @param phase1DHGroupNumbers
     *        The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     */

    public void setPhase1DHGroupNumbers(java.util.Collection<Phase1DHGroupNumbersListValue> phase1DHGroupNumbers) {
        if (phase1DHGroupNumbers == null) {
            this.phase1DHGroupNumbers = null;
            return;
        }

        this.phase1DHGroupNumbers = new com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersListValue>(phase1DHGroupNumbers);
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase1DHGroupNumbers(java.util.Collection)} or {@link #withPhase1DHGroupNumbers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param phase1DHGroupNumbers
     *        The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase1DHGroupNumbers(Phase1DHGroupNumbersListValue... phase1DHGroupNumbers) {
        if (this.phase1DHGroupNumbers == null) {
            setPhase1DHGroupNumbers(new com.amazonaws.internal.SdkInternalList<Phase1DHGroupNumbersListValue>(phase1DHGroupNumbers.length));
        }
        for (Phase1DHGroupNumbersListValue ele : phase1DHGroupNumbers) {
            this.phase1DHGroupNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     * </p>
     * 
     * @param phase1DHGroupNumbers
     *        The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase1DHGroupNumbers(java.util.Collection<Phase1DHGroupNumbersListValue> phase1DHGroupNumbers) {
        setPhase1DHGroupNumbers(phase1DHGroupNumbers);
        return this;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @return The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     */

    public java.util.List<Phase2DHGroupNumbersListValue> getPhase2DHGroupNumbers() {
        if (phase2DHGroupNumbers == null) {
            phase2DHGroupNumbers = new com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersListValue>();
        }
        return phase2DHGroupNumbers;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @param phase2DHGroupNumbers
     *        The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     */

    public void setPhase2DHGroupNumbers(java.util.Collection<Phase2DHGroupNumbersListValue> phase2DHGroupNumbers) {
        if (phase2DHGroupNumbers == null) {
            this.phase2DHGroupNumbers = null;
            return;
        }

        this.phase2DHGroupNumbers = new com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersListValue>(phase2DHGroupNumbers);
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhase2DHGroupNumbers(java.util.Collection)} or {@link #withPhase2DHGroupNumbers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param phase2DHGroupNumbers
     *        The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase2DHGroupNumbers(Phase2DHGroupNumbersListValue... phase2DHGroupNumbers) {
        if (this.phase2DHGroupNumbers == null) {
            setPhase2DHGroupNumbers(new com.amazonaws.internal.SdkInternalList<Phase2DHGroupNumbersListValue>(phase2DHGroupNumbers.length));
        }
        for (Phase2DHGroupNumbersListValue ele : phase2DHGroupNumbers) {
            this.phase2DHGroupNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     * </p>
     * 
     * @param phase2DHGroupNumbers
     *        The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withPhase2DHGroupNumbers(java.util.Collection<Phase2DHGroupNumbersListValue> phase2DHGroupNumbers) {
        setPhase2DHGroupNumbers(phase2DHGroupNumbers);
        return this;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * 
     * @return The IKE versions that are permitted for the VPN tunnel.
     */

    public java.util.List<IKEVersionsListValue> getIkeVersions() {
        if (ikeVersions == null) {
            ikeVersions = new com.amazonaws.internal.SdkInternalList<IKEVersionsListValue>();
        }
        return ikeVersions;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * 
     * @param ikeVersions
     *        The IKE versions that are permitted for the VPN tunnel.
     */

    public void setIkeVersions(java.util.Collection<IKEVersionsListValue> ikeVersions) {
        if (ikeVersions == null) {
            this.ikeVersions = null;
            return;
        }

        this.ikeVersions = new com.amazonaws.internal.SdkInternalList<IKEVersionsListValue>(ikeVersions);
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIkeVersions(java.util.Collection)} or {@link #withIkeVersions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ikeVersions
     *        The IKE versions that are permitted for the VPN tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withIkeVersions(IKEVersionsListValue... ikeVersions) {
        if (this.ikeVersions == null) {
            setIkeVersions(new com.amazonaws.internal.SdkInternalList<IKEVersionsListValue>(ikeVersions.length));
        }
        for (IKEVersionsListValue ele : ikeVersions) {
            this.ikeVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IKE versions that are permitted for the VPN tunnel.
     * </p>
     * 
     * @param ikeVersions
     *        The IKE versions that are permitted for the VPN tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TunnelOption withIkeVersions(java.util.Collection<IKEVersionsListValue> ikeVersions) {
        setIkeVersions(ikeVersions);
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
        if (getOutsideIpAddress() != null)
            sb.append("OutsideIpAddress: ").append(getOutsideIpAddress()).append(",");
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
        if (getDpdTimeoutSeconds() != null)
            sb.append("DpdTimeoutSeconds: ").append(getDpdTimeoutSeconds()).append(",");
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
        if (getIkeVersions() != null)
            sb.append("IkeVersions: ").append(getIkeVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TunnelOption == false)
            return false;
        TunnelOption other = (TunnelOption) obj;
        if (other.getOutsideIpAddress() == null ^ this.getOutsideIpAddress() == null)
            return false;
        if (other.getOutsideIpAddress() != null && other.getOutsideIpAddress().equals(this.getOutsideIpAddress()) == false)
            return false;
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
        if (other.getDpdTimeoutSeconds() == null ^ this.getDpdTimeoutSeconds() == null)
            return false;
        if (other.getDpdTimeoutSeconds() != null && other.getDpdTimeoutSeconds().equals(this.getDpdTimeoutSeconds()) == false)
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
        if (other.getIkeVersions() == null ^ this.getIkeVersions() == null)
            return false;
        if (other.getIkeVersions() != null && other.getIkeVersions().equals(this.getIkeVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutsideIpAddress() == null) ? 0 : getOutsideIpAddress().hashCode());
        hashCode = prime * hashCode + ((getTunnelInsideCidr() == null) ? 0 : getTunnelInsideCidr().hashCode());
        hashCode = prime * hashCode + ((getPreSharedKey() == null) ? 0 : getPreSharedKey().hashCode());
        hashCode = prime * hashCode + ((getPhase1LifetimeSeconds() == null) ? 0 : getPhase1LifetimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getPhase2LifetimeSeconds() == null) ? 0 : getPhase2LifetimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getRekeyMarginTimeSeconds() == null) ? 0 : getRekeyMarginTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getRekeyFuzzPercentage() == null) ? 0 : getRekeyFuzzPercentage().hashCode());
        hashCode = prime * hashCode + ((getReplayWindowSize() == null) ? 0 : getReplayWindowSize().hashCode());
        hashCode = prime * hashCode + ((getDpdTimeoutSeconds() == null) ? 0 : getDpdTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getPhase1EncryptionAlgorithms() == null) ? 0 : getPhase1EncryptionAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getPhase2EncryptionAlgorithms() == null) ? 0 : getPhase2EncryptionAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getPhase1IntegrityAlgorithms() == null) ? 0 : getPhase1IntegrityAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getPhase2IntegrityAlgorithms() == null) ? 0 : getPhase2IntegrityAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getPhase1DHGroupNumbers() == null) ? 0 : getPhase1DHGroupNumbers().hashCode());
        hashCode = prime * hashCode + ((getPhase2DHGroupNumbers() == null) ? 0 : getPhase2DHGroupNumbers().hashCode());
        hashCode = prime * hashCode + ((getIkeVersions() == null) ? 0 : getIkeVersions().hashCode());
        return hashCode;
    }

    @Override
    public TunnelOption clone() {
        try {
            return (TunnelOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
