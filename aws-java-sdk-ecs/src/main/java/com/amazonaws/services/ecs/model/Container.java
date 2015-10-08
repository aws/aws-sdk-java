/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * A Docker container that is part of a task.
 * </p>
 */
public class Container implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the container.
     */
    private String containerArn;

    /**
     * The Amazon Resource Name (ARN) of the task.
     */
    private String taskArn;

    /**
     * The name of the container.
     */
    private String name;

    /**
     * The last known status of the container.
     */
    private String lastStatus;

    /**
     * The exit code returned from the container.
     */
    private Integer exitCode;

    /**
     * A short (255 max characters) human-readable string to provide
     * additional detail about a running or stopped container.
     */
    private String reason;

    /**
     * The network bindings associated with the container.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NetworkBinding> networkBindings;

    /**
     * The Amazon Resource Name (ARN) of the container.
     *
     * @return The Amazon Resource Name (ARN) of the container.
     */
    public String getContainerArn() {
        return containerArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the container.
     *
     * @param containerArn The Amazon Resource Name (ARN) of the container.
     */
    public void setContainerArn(String containerArn) {
        this.containerArn = containerArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerArn The Amazon Resource Name (ARN) of the container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Container withContainerArn(String containerArn) {
        this.containerArn = containerArn;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the task.
     *
     * @return The Amazon Resource Name (ARN) of the task.
     */
    public String getTaskArn() {
        return taskArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the task.
     *
     * @param taskArn The Amazon Resource Name (ARN) of the task.
     */
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskArn The Amazon Resource Name (ARN) of the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Container withTaskArn(String taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * The name of the container.
     *
     * @return The name of the container.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the container.
     *
     * @param name The name of the container.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Container withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The last known status of the container.
     *
     * @return The last known status of the container.
     */
    public String getLastStatus() {
        return lastStatus;
    }
    
    /**
     * The last known status of the container.
     *
     * @param lastStatus The last known status of the container.
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }
    
    /**
     * The last known status of the container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStatus The last known status of the container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Container withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * The exit code returned from the container.
     *
     * @return The exit code returned from the container.
     */
    public Integer getExitCode() {
        return exitCode;
    }
    
    /**
     * The exit code returned from the container.
     *
     * @param exitCode The exit code returned from the container.
     */
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }
    
    /**
     * The exit code returned from the container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exitCode The exit code returned from the container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Container withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * A short (255 max characters) human-readable string to provide
     * additional detail about a running or stopped container.
     *
     * @return A short (255 max characters) human-readable string to provide
     *         additional detail about a running or stopped container.
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * A short (255 max characters) human-readable string to provide
     * additional detail about a running or stopped container.
     *
     * @param reason A short (255 max characters) human-readable string to provide
     *         additional detail about a running or stopped container.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /**
     * A short (255 max characters) human-readable string to provide
     * additional detail about a running or stopped container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reason A short (255 max characters) human-readable string to provide
     *         additional detail about a running or stopped container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Container withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * The network bindings associated with the container.
     *
     * @return The network bindings associated with the container.
     */
    public java.util.List<NetworkBinding> getNetworkBindings() {
        if (networkBindings == null) {
              networkBindings = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkBinding>();
              networkBindings.setAutoConstruct(true);
        }
        return networkBindings;
    }
    
    /**
     * The network bindings associated with the container.
     *
     * @param networkBindings The network bindings associated with the container.
     */
    public void setNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        if (networkBindings == null) {
            this.networkBindings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NetworkBinding> networkBindingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkBinding>(networkBindings.size());
        networkBindingsCopy.addAll(networkBindings);
        this.networkBindings = networkBindingsCopy;
    }
    
    /**
     * The network bindings associated with the container.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNetworkBindings(java.util.Collection)} or {@link
     * #withNetworkBindings(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkBindings The network bindings associated with the container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Container withNetworkBindings(NetworkBinding... networkBindings) {
        if (getNetworkBindings() == null) setNetworkBindings(new java.util.ArrayList<NetworkBinding>(networkBindings.length));
        for (NetworkBinding value : networkBindings) {
            getNetworkBindings().add(value);
        }
        return this;
    }
    
    /**
     * The network bindings associated with the container.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkBindings The network bindings associated with the container.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Container withNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        if (networkBindings == null) {
            this.networkBindings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NetworkBinding> networkBindingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkBinding>(networkBindings.size());
            networkBindingsCopy.addAll(networkBindings);
            this.networkBindings = networkBindingsCopy;
        }

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
        if (getContainerArn() != null) sb.append("ContainerArn: " + getContainerArn() + ",");
        if (getTaskArn() != null) sb.append("TaskArn: " + getTaskArn() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getLastStatus() != null) sb.append("LastStatus: " + getLastStatus() + ",");
        if (getExitCode() != null) sb.append("ExitCode: " + getExitCode() + ",");
        if (getReason() != null) sb.append("Reason: " + getReason() + ",");
        if (getNetworkBindings() != null) sb.append("NetworkBindings: " + getNetworkBindings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContainerArn() == null) ? 0 : getContainerArn().hashCode()); 
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode()); 
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode()); 
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkBindings() == null) ? 0 : getNetworkBindings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Container == false) return false;
        Container other = (Container)obj;
        
        if (other.getContainerArn() == null ^ this.getContainerArn() == null) return false;
        if (other.getContainerArn() != null && other.getContainerArn().equals(this.getContainerArn()) == false) return false; 
        if (other.getTaskArn() == null ^ this.getTaskArn() == null) return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getLastStatus() == null ^ this.getLastStatus() == null) return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false) return false; 
        if (other.getExitCode() == null ^ this.getExitCode() == null) return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false) return false; 
        if (other.getReason() == null ^ this.getReason() == null) return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false) return false; 
        if (other.getNetworkBindings() == null ^ this.getNetworkBindings() == null) return false;
        if (other.getNetworkBindings() != null && other.getNetworkBindings().equals(this.getNetworkBindings()) == false) return false; 
        return true;
    }
    
    @Override
    public Container clone() {
        try {
            return (Container) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    