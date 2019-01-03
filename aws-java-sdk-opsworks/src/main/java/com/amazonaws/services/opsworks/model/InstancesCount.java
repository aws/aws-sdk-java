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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes how many instances a stack has for each status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/InstancesCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancesCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of instances in the Assigning state.
     * </p>
     */
    private Integer assigning;
    /**
     * <p>
     * The number of instances with <code>booting</code> status.
     * </p>
     */
    private Integer booting;
    /**
     * <p>
     * The number of instances with <code>connection_lost</code> status.
     * </p>
     */
    private Integer connectionLost;
    /**
     * <p>
     * The number of instances in the Deregistering state.
     * </p>
     */
    private Integer deregistering;
    /**
     * <p>
     * The number of instances with <code>online</code> status.
     * </p>
     */
    private Integer online;
    /**
     * <p>
     * The number of instances with <code>pending</code> status.
     * </p>
     */
    private Integer pending;
    /**
     * <p>
     * The number of instances with <code>rebooting</code> status.
     * </p>
     */
    private Integer rebooting;
    /**
     * <p>
     * The number of instances in the Registered state.
     * </p>
     */
    private Integer registered;
    /**
     * <p>
     * The number of instances in the Registering state.
     * </p>
     */
    private Integer registering;
    /**
     * <p>
     * The number of instances with <code>requested</code> status.
     * </p>
     */
    private Integer requested;
    /**
     * <p>
     * The number of instances with <code>running_setup</code> status.
     * </p>
     */
    private Integer runningSetup;
    /**
     * <p>
     * The number of instances with <code>setup_failed</code> status.
     * </p>
     */
    private Integer setupFailed;
    /**
     * <p>
     * The number of instances with <code>shutting_down</code> status.
     * </p>
     */
    private Integer shuttingDown;
    /**
     * <p>
     * The number of instances with <code>start_failed</code> status.
     * </p>
     */
    private Integer startFailed;
    /**
     * <p>
     * The number of instances with <code>stop_failed</code> status.
     * </p>
     */
    private Integer stopFailed;
    /**
     * <p>
     * The number of instances with <code>stopped</code> status.
     * </p>
     */
    private Integer stopped;
    /**
     * <p>
     * The number of instances with <code>stopping</code> status.
     * </p>
     */
    private Integer stopping;
    /**
     * <p>
     * The number of instances with <code>terminated</code> status.
     * </p>
     */
    private Integer terminated;
    /**
     * <p>
     * The number of instances with <code>terminating</code> status.
     * </p>
     */
    private Integer terminating;
    /**
     * <p>
     * The number of instances in the Unassigning state.
     * </p>
     */
    private Integer unassigning;

    /**
     * <p>
     * The number of instances in the Assigning state.
     * </p>
     * 
     * @param assigning
     *        The number of instances in the Assigning state.
     */

    public void setAssigning(Integer assigning) {
        this.assigning = assigning;
    }

    /**
     * <p>
     * The number of instances in the Assigning state.
     * </p>
     * 
     * @return The number of instances in the Assigning state.
     */

    public Integer getAssigning() {
        return this.assigning;
    }

    /**
     * <p>
     * The number of instances in the Assigning state.
     * </p>
     * 
     * @param assigning
     *        The number of instances in the Assigning state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withAssigning(Integer assigning) {
        setAssigning(assigning);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>booting</code> status.
     * </p>
     * 
     * @param booting
     *        The number of instances with <code>booting</code> status.
     */

    public void setBooting(Integer booting) {
        this.booting = booting;
    }

    /**
     * <p>
     * The number of instances with <code>booting</code> status.
     * </p>
     * 
     * @return The number of instances with <code>booting</code> status.
     */

    public Integer getBooting() {
        return this.booting;
    }

    /**
     * <p>
     * The number of instances with <code>booting</code> status.
     * </p>
     * 
     * @param booting
     *        The number of instances with <code>booting</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withBooting(Integer booting) {
        setBooting(booting);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>connection_lost</code> status.
     * </p>
     * 
     * @param connectionLost
     *        The number of instances with <code>connection_lost</code> status.
     */

    public void setConnectionLost(Integer connectionLost) {
        this.connectionLost = connectionLost;
    }

    /**
     * <p>
     * The number of instances with <code>connection_lost</code> status.
     * </p>
     * 
     * @return The number of instances with <code>connection_lost</code> status.
     */

    public Integer getConnectionLost() {
        return this.connectionLost;
    }

    /**
     * <p>
     * The number of instances with <code>connection_lost</code> status.
     * </p>
     * 
     * @param connectionLost
     *        The number of instances with <code>connection_lost</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withConnectionLost(Integer connectionLost) {
        setConnectionLost(connectionLost);
        return this;
    }

    /**
     * <p>
     * The number of instances in the Deregistering state.
     * </p>
     * 
     * @param deregistering
     *        The number of instances in the Deregistering state.
     */

    public void setDeregistering(Integer deregistering) {
        this.deregistering = deregistering;
    }

    /**
     * <p>
     * The number of instances in the Deregistering state.
     * </p>
     * 
     * @return The number of instances in the Deregistering state.
     */

    public Integer getDeregistering() {
        return this.deregistering;
    }

    /**
     * <p>
     * The number of instances in the Deregistering state.
     * </p>
     * 
     * @param deregistering
     *        The number of instances in the Deregistering state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withDeregistering(Integer deregistering) {
        setDeregistering(deregistering);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>online</code> status.
     * </p>
     * 
     * @param online
     *        The number of instances with <code>online</code> status.
     */

    public void setOnline(Integer online) {
        this.online = online;
    }

    /**
     * <p>
     * The number of instances with <code>online</code> status.
     * </p>
     * 
     * @return The number of instances with <code>online</code> status.
     */

    public Integer getOnline() {
        return this.online;
    }

    /**
     * <p>
     * The number of instances with <code>online</code> status.
     * </p>
     * 
     * @param online
     *        The number of instances with <code>online</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withOnline(Integer online) {
        setOnline(online);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>pending</code> status.
     * </p>
     * 
     * @param pending
     *        The number of instances with <code>pending</code> status.
     */

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    /**
     * <p>
     * The number of instances with <code>pending</code> status.
     * </p>
     * 
     * @return The number of instances with <code>pending</code> status.
     */

    public Integer getPending() {
        return this.pending;
    }

    /**
     * <p>
     * The number of instances with <code>pending</code> status.
     * </p>
     * 
     * @param pending
     *        The number of instances with <code>pending</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withPending(Integer pending) {
        setPending(pending);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>rebooting</code> status.
     * </p>
     * 
     * @param rebooting
     *        The number of instances with <code>rebooting</code> status.
     */

    public void setRebooting(Integer rebooting) {
        this.rebooting = rebooting;
    }

    /**
     * <p>
     * The number of instances with <code>rebooting</code> status.
     * </p>
     * 
     * @return The number of instances with <code>rebooting</code> status.
     */

    public Integer getRebooting() {
        return this.rebooting;
    }

    /**
     * <p>
     * The number of instances with <code>rebooting</code> status.
     * </p>
     * 
     * @param rebooting
     *        The number of instances with <code>rebooting</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withRebooting(Integer rebooting) {
        setRebooting(rebooting);
        return this;
    }

    /**
     * <p>
     * The number of instances in the Registered state.
     * </p>
     * 
     * @param registered
     *        The number of instances in the Registered state.
     */

    public void setRegistered(Integer registered) {
        this.registered = registered;
    }

    /**
     * <p>
     * The number of instances in the Registered state.
     * </p>
     * 
     * @return The number of instances in the Registered state.
     */

    public Integer getRegistered() {
        return this.registered;
    }

    /**
     * <p>
     * The number of instances in the Registered state.
     * </p>
     * 
     * @param registered
     *        The number of instances in the Registered state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withRegistered(Integer registered) {
        setRegistered(registered);
        return this;
    }

    /**
     * <p>
     * The number of instances in the Registering state.
     * </p>
     * 
     * @param registering
     *        The number of instances in the Registering state.
     */

    public void setRegistering(Integer registering) {
        this.registering = registering;
    }

    /**
     * <p>
     * The number of instances in the Registering state.
     * </p>
     * 
     * @return The number of instances in the Registering state.
     */

    public Integer getRegistering() {
        return this.registering;
    }

    /**
     * <p>
     * The number of instances in the Registering state.
     * </p>
     * 
     * @param registering
     *        The number of instances in the Registering state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withRegistering(Integer registering) {
        setRegistering(registering);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>requested</code> status.
     * </p>
     * 
     * @param requested
     *        The number of instances with <code>requested</code> status.
     */

    public void setRequested(Integer requested) {
        this.requested = requested;
    }

    /**
     * <p>
     * The number of instances with <code>requested</code> status.
     * </p>
     * 
     * @return The number of instances with <code>requested</code> status.
     */

    public Integer getRequested() {
        return this.requested;
    }

    /**
     * <p>
     * The number of instances with <code>requested</code> status.
     * </p>
     * 
     * @param requested
     *        The number of instances with <code>requested</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withRequested(Integer requested) {
        setRequested(requested);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>running_setup</code> status.
     * </p>
     * 
     * @param runningSetup
     *        The number of instances with <code>running_setup</code> status.
     */

    public void setRunningSetup(Integer runningSetup) {
        this.runningSetup = runningSetup;
    }

    /**
     * <p>
     * The number of instances with <code>running_setup</code> status.
     * </p>
     * 
     * @return The number of instances with <code>running_setup</code> status.
     */

    public Integer getRunningSetup() {
        return this.runningSetup;
    }

    /**
     * <p>
     * The number of instances with <code>running_setup</code> status.
     * </p>
     * 
     * @param runningSetup
     *        The number of instances with <code>running_setup</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withRunningSetup(Integer runningSetup) {
        setRunningSetup(runningSetup);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>setup_failed</code> status.
     * </p>
     * 
     * @param setupFailed
     *        The number of instances with <code>setup_failed</code> status.
     */

    public void setSetupFailed(Integer setupFailed) {
        this.setupFailed = setupFailed;
    }

    /**
     * <p>
     * The number of instances with <code>setup_failed</code> status.
     * </p>
     * 
     * @return The number of instances with <code>setup_failed</code> status.
     */

    public Integer getSetupFailed() {
        return this.setupFailed;
    }

    /**
     * <p>
     * The number of instances with <code>setup_failed</code> status.
     * </p>
     * 
     * @param setupFailed
     *        The number of instances with <code>setup_failed</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withSetupFailed(Integer setupFailed) {
        setSetupFailed(setupFailed);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>shutting_down</code> status.
     * </p>
     * 
     * @param shuttingDown
     *        The number of instances with <code>shutting_down</code> status.
     */

    public void setShuttingDown(Integer shuttingDown) {
        this.shuttingDown = shuttingDown;
    }

    /**
     * <p>
     * The number of instances with <code>shutting_down</code> status.
     * </p>
     * 
     * @return The number of instances with <code>shutting_down</code> status.
     */

    public Integer getShuttingDown() {
        return this.shuttingDown;
    }

    /**
     * <p>
     * The number of instances with <code>shutting_down</code> status.
     * </p>
     * 
     * @param shuttingDown
     *        The number of instances with <code>shutting_down</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withShuttingDown(Integer shuttingDown) {
        setShuttingDown(shuttingDown);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>start_failed</code> status.
     * </p>
     * 
     * @param startFailed
     *        The number of instances with <code>start_failed</code> status.
     */

    public void setStartFailed(Integer startFailed) {
        this.startFailed = startFailed;
    }

    /**
     * <p>
     * The number of instances with <code>start_failed</code> status.
     * </p>
     * 
     * @return The number of instances with <code>start_failed</code> status.
     */

    public Integer getStartFailed() {
        return this.startFailed;
    }

    /**
     * <p>
     * The number of instances with <code>start_failed</code> status.
     * </p>
     * 
     * @param startFailed
     *        The number of instances with <code>start_failed</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withStartFailed(Integer startFailed) {
        setStartFailed(startFailed);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>stop_failed</code> status.
     * </p>
     * 
     * @param stopFailed
     *        The number of instances with <code>stop_failed</code> status.
     */

    public void setStopFailed(Integer stopFailed) {
        this.stopFailed = stopFailed;
    }

    /**
     * <p>
     * The number of instances with <code>stop_failed</code> status.
     * </p>
     * 
     * @return The number of instances with <code>stop_failed</code> status.
     */

    public Integer getStopFailed() {
        return this.stopFailed;
    }

    /**
     * <p>
     * The number of instances with <code>stop_failed</code> status.
     * </p>
     * 
     * @param stopFailed
     *        The number of instances with <code>stop_failed</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withStopFailed(Integer stopFailed) {
        setStopFailed(stopFailed);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>stopped</code> status.
     * </p>
     * 
     * @param stopped
     *        The number of instances with <code>stopped</code> status.
     */

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    /**
     * <p>
     * The number of instances with <code>stopped</code> status.
     * </p>
     * 
     * @return The number of instances with <code>stopped</code> status.
     */

    public Integer getStopped() {
        return this.stopped;
    }

    /**
     * <p>
     * The number of instances with <code>stopped</code> status.
     * </p>
     * 
     * @param stopped
     *        The number of instances with <code>stopped</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withStopped(Integer stopped) {
        setStopped(stopped);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>stopping</code> status.
     * </p>
     * 
     * @param stopping
     *        The number of instances with <code>stopping</code> status.
     */

    public void setStopping(Integer stopping) {
        this.stopping = stopping;
    }

    /**
     * <p>
     * The number of instances with <code>stopping</code> status.
     * </p>
     * 
     * @return The number of instances with <code>stopping</code> status.
     */

    public Integer getStopping() {
        return this.stopping;
    }

    /**
     * <p>
     * The number of instances with <code>stopping</code> status.
     * </p>
     * 
     * @param stopping
     *        The number of instances with <code>stopping</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withStopping(Integer stopping) {
        setStopping(stopping);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>terminated</code> status.
     * </p>
     * 
     * @param terminated
     *        The number of instances with <code>terminated</code> status.
     */

    public void setTerminated(Integer terminated) {
        this.terminated = terminated;
    }

    /**
     * <p>
     * The number of instances with <code>terminated</code> status.
     * </p>
     * 
     * @return The number of instances with <code>terminated</code> status.
     */

    public Integer getTerminated() {
        return this.terminated;
    }

    /**
     * <p>
     * The number of instances with <code>terminated</code> status.
     * </p>
     * 
     * @param terminated
     *        The number of instances with <code>terminated</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withTerminated(Integer terminated) {
        setTerminated(terminated);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>terminating</code> status.
     * </p>
     * 
     * @param terminating
     *        The number of instances with <code>terminating</code> status.
     */

    public void setTerminating(Integer terminating) {
        this.terminating = terminating;
    }

    /**
     * <p>
     * The number of instances with <code>terminating</code> status.
     * </p>
     * 
     * @return The number of instances with <code>terminating</code> status.
     */

    public Integer getTerminating() {
        return this.terminating;
    }

    /**
     * <p>
     * The number of instances with <code>terminating</code> status.
     * </p>
     * 
     * @param terminating
     *        The number of instances with <code>terminating</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withTerminating(Integer terminating) {
        setTerminating(terminating);
        return this;
    }

    /**
     * <p>
     * The number of instances in the Unassigning state.
     * </p>
     * 
     * @param unassigning
     *        The number of instances in the Unassigning state.
     */

    public void setUnassigning(Integer unassigning) {
        this.unassigning = unassigning;
    }

    /**
     * <p>
     * The number of instances in the Unassigning state.
     * </p>
     * 
     * @return The number of instances in the Unassigning state.
     */

    public Integer getUnassigning() {
        return this.unassigning;
    }

    /**
     * <p>
     * The number of instances in the Unassigning state.
     * </p>
     * 
     * @param unassigning
     *        The number of instances in the Unassigning state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancesCount withUnassigning(Integer unassigning) {
        setUnassigning(unassigning);
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
        if (getAssigning() != null)
            sb.append("Assigning: ").append(getAssigning()).append(",");
        if (getBooting() != null)
            sb.append("Booting: ").append(getBooting()).append(",");
        if (getConnectionLost() != null)
            sb.append("ConnectionLost: ").append(getConnectionLost()).append(",");
        if (getDeregistering() != null)
            sb.append("Deregistering: ").append(getDeregistering()).append(",");
        if (getOnline() != null)
            sb.append("Online: ").append(getOnline()).append(",");
        if (getPending() != null)
            sb.append("Pending: ").append(getPending()).append(",");
        if (getRebooting() != null)
            sb.append("Rebooting: ").append(getRebooting()).append(",");
        if (getRegistered() != null)
            sb.append("Registered: ").append(getRegistered()).append(",");
        if (getRegistering() != null)
            sb.append("Registering: ").append(getRegistering()).append(",");
        if (getRequested() != null)
            sb.append("Requested: ").append(getRequested()).append(",");
        if (getRunningSetup() != null)
            sb.append("RunningSetup: ").append(getRunningSetup()).append(",");
        if (getSetupFailed() != null)
            sb.append("SetupFailed: ").append(getSetupFailed()).append(",");
        if (getShuttingDown() != null)
            sb.append("ShuttingDown: ").append(getShuttingDown()).append(",");
        if (getStartFailed() != null)
            sb.append("StartFailed: ").append(getStartFailed()).append(",");
        if (getStopFailed() != null)
            sb.append("StopFailed: ").append(getStopFailed()).append(",");
        if (getStopped() != null)
            sb.append("Stopped: ").append(getStopped()).append(",");
        if (getStopping() != null)
            sb.append("Stopping: ").append(getStopping()).append(",");
        if (getTerminated() != null)
            sb.append("Terminated: ").append(getTerminated()).append(",");
        if (getTerminating() != null)
            sb.append("Terminating: ").append(getTerminating()).append(",");
        if (getUnassigning() != null)
            sb.append("Unassigning: ").append(getUnassigning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancesCount == false)
            return false;
        InstancesCount other = (InstancesCount) obj;
        if (other.getAssigning() == null ^ this.getAssigning() == null)
            return false;
        if (other.getAssigning() != null && other.getAssigning().equals(this.getAssigning()) == false)
            return false;
        if (other.getBooting() == null ^ this.getBooting() == null)
            return false;
        if (other.getBooting() != null && other.getBooting().equals(this.getBooting()) == false)
            return false;
        if (other.getConnectionLost() == null ^ this.getConnectionLost() == null)
            return false;
        if (other.getConnectionLost() != null && other.getConnectionLost().equals(this.getConnectionLost()) == false)
            return false;
        if (other.getDeregistering() == null ^ this.getDeregistering() == null)
            return false;
        if (other.getDeregistering() != null && other.getDeregistering().equals(this.getDeregistering()) == false)
            return false;
        if (other.getOnline() == null ^ this.getOnline() == null)
            return false;
        if (other.getOnline() != null && other.getOnline().equals(this.getOnline()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getRebooting() == null ^ this.getRebooting() == null)
            return false;
        if (other.getRebooting() != null && other.getRebooting().equals(this.getRebooting()) == false)
            return false;
        if (other.getRegistered() == null ^ this.getRegistered() == null)
            return false;
        if (other.getRegistered() != null && other.getRegistered().equals(this.getRegistered()) == false)
            return false;
        if (other.getRegistering() == null ^ this.getRegistering() == null)
            return false;
        if (other.getRegistering() != null && other.getRegistering().equals(this.getRegistering()) == false)
            return false;
        if (other.getRequested() == null ^ this.getRequested() == null)
            return false;
        if (other.getRequested() != null && other.getRequested().equals(this.getRequested()) == false)
            return false;
        if (other.getRunningSetup() == null ^ this.getRunningSetup() == null)
            return false;
        if (other.getRunningSetup() != null && other.getRunningSetup().equals(this.getRunningSetup()) == false)
            return false;
        if (other.getSetupFailed() == null ^ this.getSetupFailed() == null)
            return false;
        if (other.getSetupFailed() != null && other.getSetupFailed().equals(this.getSetupFailed()) == false)
            return false;
        if (other.getShuttingDown() == null ^ this.getShuttingDown() == null)
            return false;
        if (other.getShuttingDown() != null && other.getShuttingDown().equals(this.getShuttingDown()) == false)
            return false;
        if (other.getStartFailed() == null ^ this.getStartFailed() == null)
            return false;
        if (other.getStartFailed() != null && other.getStartFailed().equals(this.getStartFailed()) == false)
            return false;
        if (other.getStopFailed() == null ^ this.getStopFailed() == null)
            return false;
        if (other.getStopFailed() != null && other.getStopFailed().equals(this.getStopFailed()) == false)
            return false;
        if (other.getStopped() == null ^ this.getStopped() == null)
            return false;
        if (other.getStopped() != null && other.getStopped().equals(this.getStopped()) == false)
            return false;
        if (other.getStopping() == null ^ this.getStopping() == null)
            return false;
        if (other.getStopping() != null && other.getStopping().equals(this.getStopping()) == false)
            return false;
        if (other.getTerminated() == null ^ this.getTerminated() == null)
            return false;
        if (other.getTerminated() != null && other.getTerminated().equals(this.getTerminated()) == false)
            return false;
        if (other.getTerminating() == null ^ this.getTerminating() == null)
            return false;
        if (other.getTerminating() != null && other.getTerminating().equals(this.getTerminating()) == false)
            return false;
        if (other.getUnassigning() == null ^ this.getUnassigning() == null)
            return false;
        if (other.getUnassigning() != null && other.getUnassigning().equals(this.getUnassigning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssigning() == null) ? 0 : getAssigning().hashCode());
        hashCode = prime * hashCode + ((getBooting() == null) ? 0 : getBooting().hashCode());
        hashCode = prime * hashCode + ((getConnectionLost() == null) ? 0 : getConnectionLost().hashCode());
        hashCode = prime * hashCode + ((getDeregistering() == null) ? 0 : getDeregistering().hashCode());
        hashCode = prime * hashCode + ((getOnline() == null) ? 0 : getOnline().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getRebooting() == null) ? 0 : getRebooting().hashCode());
        hashCode = prime * hashCode + ((getRegistered() == null) ? 0 : getRegistered().hashCode());
        hashCode = prime * hashCode + ((getRegistering() == null) ? 0 : getRegistering().hashCode());
        hashCode = prime * hashCode + ((getRequested() == null) ? 0 : getRequested().hashCode());
        hashCode = prime * hashCode + ((getRunningSetup() == null) ? 0 : getRunningSetup().hashCode());
        hashCode = prime * hashCode + ((getSetupFailed() == null) ? 0 : getSetupFailed().hashCode());
        hashCode = prime * hashCode + ((getShuttingDown() == null) ? 0 : getShuttingDown().hashCode());
        hashCode = prime * hashCode + ((getStartFailed() == null) ? 0 : getStartFailed().hashCode());
        hashCode = prime * hashCode + ((getStopFailed() == null) ? 0 : getStopFailed().hashCode());
        hashCode = prime * hashCode + ((getStopped() == null) ? 0 : getStopped().hashCode());
        hashCode = prime * hashCode + ((getStopping() == null) ? 0 : getStopping().hashCode());
        hashCode = prime * hashCode + ((getTerminated() == null) ? 0 : getTerminated().hashCode());
        hashCode = prime * hashCode + ((getTerminating() == null) ? 0 : getTerminating().hashCode());
        hashCode = prime * hashCode + ((getUnassigning() == null) ? 0 : getUnassigning().hashCode());
        return hashCode;
    }

    @Override
    public InstancesCount clone() {
        try {
            return (InstancesCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.InstancesCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
