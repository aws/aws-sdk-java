/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes how many instances a stack has for each status.
 * </p>
 */
public class InstancesCount implements Serializable {

    /**
     * The number of instances in the Assigning state.
     */
    private Integer assigning;

    /**
     * The number of instances with <code>booting</code> status.
     */
    private Integer booting;

    /**
     * The number of instances with <code>connection_lost</code> status.
     */
    private Integer connectionLost;

    /**
     * The number of instances in the Deregistering state.
     */
    private Integer deregistering;

    /**
     * The number of instances with <code>online</code> status.
     */
    private Integer online;

    /**
     * The number of instances with <code>pending</code> status.
     */
    private Integer pending;

    /**
     * The number of instances with <code>rebooting</code> status.
     */
    private Integer rebooting;

    /**
     * The number of instances in the Registered state.
     */
    private Integer registered;

    /**
     * The number of instances in the Registering state.
     */
    private Integer registering;

    /**
     * The number of instances with <code>requested</code> status.
     */
    private Integer requested;

    /**
     * The number of instances with <code>running_setup</code> status.
     */
    private Integer runningSetup;

    /**
     * The number of instances with <code>setup_failed</code> status.
     */
    private Integer setupFailed;

    /**
     * The number of instances with <code>shutting_down</code> status.
     */
    private Integer shuttingDown;

    /**
     * The number of instances with <code>start_failed</code> status.
     */
    private Integer startFailed;

    /**
     * The number of instances with <code>stopped</code> status.
     */
    private Integer stopped;

    /**
     * The number of instances with <code>stopping</code> status.
     */
    private Integer stopping;

    /**
     * The number of instances with <code>terminated</code> status.
     */
    private Integer terminated;

    /**
     * The number of instances with <code>terminating</code> status.
     */
    private Integer terminating;

    /**
     * The number of instances in the Unassigning state.
     */
    private Integer unassigning;

    /**
     * The number of instances in the Assigning state.
     *
     * @return The number of instances in the Assigning state.
     */
    public Integer getAssigning() {
        return assigning;
    }
    
    /**
     * The number of instances in the Assigning state.
     *
     * @param assigning The number of instances in the Assigning state.
     */
    public void setAssigning(Integer assigning) {
        this.assigning = assigning;
    }
    
    /**
     * The number of instances in the Assigning state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param assigning The number of instances in the Assigning state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withAssigning(Integer assigning) {
        this.assigning = assigning;
        return this;
    }

    /**
     * The number of instances with <code>booting</code> status.
     *
     * @return The number of instances with <code>booting</code> status.
     */
    public Integer getBooting() {
        return booting;
    }
    
    /**
     * The number of instances with <code>booting</code> status.
     *
     * @param booting The number of instances with <code>booting</code> status.
     */
    public void setBooting(Integer booting) {
        this.booting = booting;
    }
    
    /**
     * The number of instances with <code>booting</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param booting The number of instances with <code>booting</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withBooting(Integer booting) {
        this.booting = booting;
        return this;
    }

    /**
     * The number of instances with <code>connection_lost</code> status.
     *
     * @return The number of instances with <code>connection_lost</code> status.
     */
    public Integer getConnectionLost() {
        return connectionLost;
    }
    
    /**
     * The number of instances with <code>connection_lost</code> status.
     *
     * @param connectionLost The number of instances with <code>connection_lost</code> status.
     */
    public void setConnectionLost(Integer connectionLost) {
        this.connectionLost = connectionLost;
    }
    
    /**
     * The number of instances with <code>connection_lost</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionLost The number of instances with <code>connection_lost</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withConnectionLost(Integer connectionLost) {
        this.connectionLost = connectionLost;
        return this;
    }

    /**
     * The number of instances in the Deregistering state.
     *
     * @return The number of instances in the Deregistering state.
     */
    public Integer getDeregistering() {
        return deregistering;
    }
    
    /**
     * The number of instances in the Deregistering state.
     *
     * @param deregistering The number of instances in the Deregistering state.
     */
    public void setDeregistering(Integer deregistering) {
        this.deregistering = deregistering;
    }
    
    /**
     * The number of instances in the Deregistering state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deregistering The number of instances in the Deregistering state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withDeregistering(Integer deregistering) {
        this.deregistering = deregistering;
        return this;
    }

    /**
     * The number of instances with <code>online</code> status.
     *
     * @return The number of instances with <code>online</code> status.
     */
    public Integer getOnline() {
        return online;
    }
    
    /**
     * The number of instances with <code>online</code> status.
     *
     * @param online The number of instances with <code>online</code> status.
     */
    public void setOnline(Integer online) {
        this.online = online;
    }
    
    /**
     * The number of instances with <code>online</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param online The number of instances with <code>online</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withOnline(Integer online) {
        this.online = online;
        return this;
    }

    /**
     * The number of instances with <code>pending</code> status.
     *
     * @return The number of instances with <code>pending</code> status.
     */
    public Integer getPending() {
        return pending;
    }
    
    /**
     * The number of instances with <code>pending</code> status.
     *
     * @param pending The number of instances with <code>pending</code> status.
     */
    public void setPending(Integer pending) {
        this.pending = pending;
    }
    
    /**
     * The number of instances with <code>pending</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pending The number of instances with <code>pending</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withPending(Integer pending) {
        this.pending = pending;
        return this;
    }

    /**
     * The number of instances with <code>rebooting</code> status.
     *
     * @return The number of instances with <code>rebooting</code> status.
     */
    public Integer getRebooting() {
        return rebooting;
    }
    
    /**
     * The number of instances with <code>rebooting</code> status.
     *
     * @param rebooting The number of instances with <code>rebooting</code> status.
     */
    public void setRebooting(Integer rebooting) {
        this.rebooting = rebooting;
    }
    
    /**
     * The number of instances with <code>rebooting</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rebooting The number of instances with <code>rebooting</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withRebooting(Integer rebooting) {
        this.rebooting = rebooting;
        return this;
    }

    /**
     * The number of instances in the Registered state.
     *
     * @return The number of instances in the Registered state.
     */
    public Integer getRegistered() {
        return registered;
    }
    
    /**
     * The number of instances in the Registered state.
     *
     * @param registered The number of instances in the Registered state.
     */
    public void setRegistered(Integer registered) {
        this.registered = registered;
    }
    
    /**
     * The number of instances in the Registered state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registered The number of instances in the Registered state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withRegistered(Integer registered) {
        this.registered = registered;
        return this;
    }

    /**
     * The number of instances in the Registering state.
     *
     * @return The number of instances in the Registering state.
     */
    public Integer getRegistering() {
        return registering;
    }
    
    /**
     * The number of instances in the Registering state.
     *
     * @param registering The number of instances in the Registering state.
     */
    public void setRegistering(Integer registering) {
        this.registering = registering;
    }
    
    /**
     * The number of instances in the Registering state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registering The number of instances in the Registering state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withRegistering(Integer registering) {
        this.registering = registering;
        return this;
    }

    /**
     * The number of instances with <code>requested</code> status.
     *
     * @return The number of instances with <code>requested</code> status.
     */
    public Integer getRequested() {
        return requested;
    }
    
    /**
     * The number of instances with <code>requested</code> status.
     *
     * @param requested The number of instances with <code>requested</code> status.
     */
    public void setRequested(Integer requested) {
        this.requested = requested;
    }
    
    /**
     * The number of instances with <code>requested</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requested The number of instances with <code>requested</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withRequested(Integer requested) {
        this.requested = requested;
        return this;
    }

    /**
     * The number of instances with <code>running_setup</code> status.
     *
     * @return The number of instances with <code>running_setup</code> status.
     */
    public Integer getRunningSetup() {
        return runningSetup;
    }
    
    /**
     * The number of instances with <code>running_setup</code> status.
     *
     * @param runningSetup The number of instances with <code>running_setup</code> status.
     */
    public void setRunningSetup(Integer runningSetup) {
        this.runningSetup = runningSetup;
    }
    
    /**
     * The number of instances with <code>running_setup</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param runningSetup The number of instances with <code>running_setup</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withRunningSetup(Integer runningSetup) {
        this.runningSetup = runningSetup;
        return this;
    }

    /**
     * The number of instances with <code>setup_failed</code> status.
     *
     * @return The number of instances with <code>setup_failed</code> status.
     */
    public Integer getSetupFailed() {
        return setupFailed;
    }
    
    /**
     * The number of instances with <code>setup_failed</code> status.
     *
     * @param setupFailed The number of instances with <code>setup_failed</code> status.
     */
    public void setSetupFailed(Integer setupFailed) {
        this.setupFailed = setupFailed;
    }
    
    /**
     * The number of instances with <code>setup_failed</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param setupFailed The number of instances with <code>setup_failed</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withSetupFailed(Integer setupFailed) {
        this.setupFailed = setupFailed;
        return this;
    }

    /**
     * The number of instances with <code>shutting_down</code> status.
     *
     * @return The number of instances with <code>shutting_down</code> status.
     */
    public Integer getShuttingDown() {
        return shuttingDown;
    }
    
    /**
     * The number of instances with <code>shutting_down</code> status.
     *
     * @param shuttingDown The number of instances with <code>shutting_down</code> status.
     */
    public void setShuttingDown(Integer shuttingDown) {
        this.shuttingDown = shuttingDown;
    }
    
    /**
     * The number of instances with <code>shutting_down</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shuttingDown The number of instances with <code>shutting_down</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withShuttingDown(Integer shuttingDown) {
        this.shuttingDown = shuttingDown;
        return this;
    }

    /**
     * The number of instances with <code>start_failed</code> status.
     *
     * @return The number of instances with <code>start_failed</code> status.
     */
    public Integer getStartFailed() {
        return startFailed;
    }
    
    /**
     * The number of instances with <code>start_failed</code> status.
     *
     * @param startFailed The number of instances with <code>start_failed</code> status.
     */
    public void setStartFailed(Integer startFailed) {
        this.startFailed = startFailed;
    }
    
    /**
     * The number of instances with <code>start_failed</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startFailed The number of instances with <code>start_failed</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withStartFailed(Integer startFailed) {
        this.startFailed = startFailed;
        return this;
    }

    /**
     * The number of instances with <code>stopped</code> status.
     *
     * @return The number of instances with <code>stopped</code> status.
     */
    public Integer getStopped() {
        return stopped;
    }
    
    /**
     * The number of instances with <code>stopped</code> status.
     *
     * @param stopped The number of instances with <code>stopped</code> status.
     */
    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }
    
    /**
     * The number of instances with <code>stopped</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stopped The number of instances with <code>stopped</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * The number of instances with <code>stopping</code> status.
     *
     * @return The number of instances with <code>stopping</code> status.
     */
    public Integer getStopping() {
        return stopping;
    }
    
    /**
     * The number of instances with <code>stopping</code> status.
     *
     * @param stopping The number of instances with <code>stopping</code> status.
     */
    public void setStopping(Integer stopping) {
        this.stopping = stopping;
    }
    
    /**
     * The number of instances with <code>stopping</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stopping The number of instances with <code>stopping</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withStopping(Integer stopping) {
        this.stopping = stopping;
        return this;
    }

    /**
     * The number of instances with <code>terminated</code> status.
     *
     * @return The number of instances with <code>terminated</code> status.
     */
    public Integer getTerminated() {
        return terminated;
    }
    
    /**
     * The number of instances with <code>terminated</code> status.
     *
     * @param terminated The number of instances with <code>terminated</code> status.
     */
    public void setTerminated(Integer terminated) {
        this.terminated = terminated;
    }
    
    /**
     * The number of instances with <code>terminated</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminated The number of instances with <code>terminated</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withTerminated(Integer terminated) {
        this.terminated = terminated;
        return this;
    }

    /**
     * The number of instances with <code>terminating</code> status.
     *
     * @return The number of instances with <code>terminating</code> status.
     */
    public Integer getTerminating() {
        return terminating;
    }
    
    /**
     * The number of instances with <code>terminating</code> status.
     *
     * @param terminating The number of instances with <code>terminating</code> status.
     */
    public void setTerminating(Integer terminating) {
        this.terminating = terminating;
    }
    
    /**
     * The number of instances with <code>terminating</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminating The number of instances with <code>terminating</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withTerminating(Integer terminating) {
        this.terminating = terminating;
        return this;
    }

    /**
     * The number of instances in the Unassigning state.
     *
     * @return The number of instances in the Unassigning state.
     */
    public Integer getUnassigning() {
        return unassigning;
    }
    
    /**
     * The number of instances in the Unassigning state.
     *
     * @param unassigning The number of instances in the Unassigning state.
     */
    public void setUnassigning(Integer unassigning) {
        this.unassigning = unassigning;
    }
    
    /**
     * The number of instances in the Unassigning state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unassigning The number of instances in the Unassigning state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstancesCount withUnassigning(Integer unassigning) {
        this.unassigning = unassigning;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssigning() != null) sb.append("Assigning: " + getAssigning() + ",");
        if (getBooting() != null) sb.append("Booting: " + getBooting() + ",");
        if (getConnectionLost() != null) sb.append("ConnectionLost: " + getConnectionLost() + ",");
        if (getDeregistering() != null) sb.append("Deregistering: " + getDeregistering() + ",");
        if (getOnline() != null) sb.append("Online: " + getOnline() + ",");
        if (getPending() != null) sb.append("Pending: " + getPending() + ",");
        if (getRebooting() != null) sb.append("Rebooting: " + getRebooting() + ",");
        if (getRegistered() != null) sb.append("Registered: " + getRegistered() + ",");
        if (getRegistering() != null) sb.append("Registering: " + getRegistering() + ",");
        if (getRequested() != null) sb.append("Requested: " + getRequested() + ",");
        if (getRunningSetup() != null) sb.append("RunningSetup: " + getRunningSetup() + ",");
        if (getSetupFailed() != null) sb.append("SetupFailed: " + getSetupFailed() + ",");
        if (getShuttingDown() != null) sb.append("ShuttingDown: " + getShuttingDown() + ",");
        if (getStartFailed() != null) sb.append("StartFailed: " + getStartFailed() + ",");
        if (getStopped() != null) sb.append("Stopped: " + getStopped() + ",");
        if (getStopping() != null) sb.append("Stopping: " + getStopping() + ",");
        if (getTerminated() != null) sb.append("Terminated: " + getTerminated() + ",");
        if (getTerminating() != null) sb.append("Terminating: " + getTerminating() + ",");
        if (getUnassigning() != null) sb.append("Unassigning: " + getUnassigning() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getStopped() == null) ? 0 : getStopped().hashCode()); 
        hashCode = prime * hashCode + ((getStopping() == null) ? 0 : getStopping().hashCode()); 
        hashCode = prime * hashCode + ((getTerminated() == null) ? 0 : getTerminated().hashCode()); 
        hashCode = prime * hashCode + ((getTerminating() == null) ? 0 : getTerminating().hashCode()); 
        hashCode = prime * hashCode + ((getUnassigning() == null) ? 0 : getUnassigning().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstancesCount == false) return false;
        InstancesCount other = (InstancesCount)obj;
        
        if (other.getAssigning() == null ^ this.getAssigning() == null) return false;
        if (other.getAssigning() != null && other.getAssigning().equals(this.getAssigning()) == false) return false; 
        if (other.getBooting() == null ^ this.getBooting() == null) return false;
        if (other.getBooting() != null && other.getBooting().equals(this.getBooting()) == false) return false; 
        if (other.getConnectionLost() == null ^ this.getConnectionLost() == null) return false;
        if (other.getConnectionLost() != null && other.getConnectionLost().equals(this.getConnectionLost()) == false) return false; 
        if (other.getDeregistering() == null ^ this.getDeregistering() == null) return false;
        if (other.getDeregistering() != null && other.getDeregistering().equals(this.getDeregistering()) == false) return false; 
        if (other.getOnline() == null ^ this.getOnline() == null) return false;
        if (other.getOnline() != null && other.getOnline().equals(this.getOnline()) == false) return false; 
        if (other.getPending() == null ^ this.getPending() == null) return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false) return false; 
        if (other.getRebooting() == null ^ this.getRebooting() == null) return false;
        if (other.getRebooting() != null && other.getRebooting().equals(this.getRebooting()) == false) return false; 
        if (other.getRegistered() == null ^ this.getRegistered() == null) return false;
        if (other.getRegistered() != null && other.getRegistered().equals(this.getRegistered()) == false) return false; 
        if (other.getRegistering() == null ^ this.getRegistering() == null) return false;
        if (other.getRegistering() != null && other.getRegistering().equals(this.getRegistering()) == false) return false; 
        if (other.getRequested() == null ^ this.getRequested() == null) return false;
        if (other.getRequested() != null && other.getRequested().equals(this.getRequested()) == false) return false; 
        if (other.getRunningSetup() == null ^ this.getRunningSetup() == null) return false;
        if (other.getRunningSetup() != null && other.getRunningSetup().equals(this.getRunningSetup()) == false) return false; 
        if (other.getSetupFailed() == null ^ this.getSetupFailed() == null) return false;
        if (other.getSetupFailed() != null && other.getSetupFailed().equals(this.getSetupFailed()) == false) return false; 
        if (other.getShuttingDown() == null ^ this.getShuttingDown() == null) return false;
        if (other.getShuttingDown() != null && other.getShuttingDown().equals(this.getShuttingDown()) == false) return false; 
        if (other.getStartFailed() == null ^ this.getStartFailed() == null) return false;
        if (other.getStartFailed() != null && other.getStartFailed().equals(this.getStartFailed()) == false) return false; 
        if (other.getStopped() == null ^ this.getStopped() == null) return false;
        if (other.getStopped() != null && other.getStopped().equals(this.getStopped()) == false) return false; 
        if (other.getStopping() == null ^ this.getStopping() == null) return false;
        if (other.getStopping() != null && other.getStopping().equals(this.getStopping()) == false) return false; 
        if (other.getTerminated() == null ^ this.getTerminated() == null) return false;
        if (other.getTerminated() != null && other.getTerminated().equals(this.getTerminated()) == false) return false; 
        if (other.getTerminating() == null ^ this.getTerminating() == null) return false;
        if (other.getTerminating() != null && other.getTerminating().equals(this.getTerminating()) == false) return false; 
        if (other.getUnassigning() == null ^ this.getUnassigning() == null) return false;
        if (other.getUnassigning() != null && other.getUnassigning().equals(this.getUnassigning()) == false) return false; 
        return true;
    }
    
}
    