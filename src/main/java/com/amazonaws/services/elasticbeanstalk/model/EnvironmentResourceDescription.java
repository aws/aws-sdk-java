/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the AWS resources in use by this environment. This data is live.
 * </p>
 */
public class EnvironmentResourceDescription implements Serializable {

    /**
     * The name of the environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * The <code>AutoScalingGroups</code> used by this environment.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup> autoScalingGroups;

    /**
     * The Amazon EC2 instances used by this environment.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instances;

    /**
     * The Auto Scaling launch configurations in use by this environment.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LaunchConfiguration> launchConfigurations;

    /**
     * The LoadBalancers in use by this environment.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer> loadBalancers;

    /**
     * The <code>AutoScaling</code> triggers in use by this environment.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Trigger> triggers;

    /**
     * Default constructor for a new EnvironmentResourceDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public EnvironmentResourceDescription() {}
    
    /**
     * The name of the environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * The <code>AutoScalingGroups</code> used by this environment.
     *
     * @return The <code>AutoScalingGroups</code> used by this environment.
     */
    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
              autoScalingGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup>();
              autoScalingGroups.setAutoConstruct(true);
        }
        return autoScalingGroups;
    }
    
    /**
     * The <code>AutoScalingGroups</code> used by this environment.
     *
     * @param autoScalingGroups The <code>AutoScalingGroups</code> used by this environment.
     */
    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup> autoScalingGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup>(autoScalingGroups.size());
        autoScalingGroupsCopy.addAll(autoScalingGroups);
        this.autoScalingGroups = autoScalingGroupsCopy;
    }
    
    /**
     * The <code>AutoScalingGroups</code> used by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups The <code>AutoScalingGroups</code> used by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        if (getAutoScalingGroups() == null) setAutoScalingGroups(new java.util.ArrayList<AutoScalingGroup>(autoScalingGroups.length));
        for (AutoScalingGroup value : autoScalingGroups) {
            getAutoScalingGroups().add(value);
        }
        return this;
    }
    
    /**
     * The <code>AutoScalingGroups</code> used by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups The <code>AutoScalingGroups</code> used by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup> autoScalingGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AutoScalingGroup>(autoScalingGroups.size());
            autoScalingGroupsCopy.addAll(autoScalingGroups);
            this.autoScalingGroups = autoScalingGroupsCopy;
        }

        return this;
    }

    /**
     * The Amazon EC2 instances used by this environment.
     *
     * @return The Amazon EC2 instances used by this environment.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * The Amazon EC2 instances used by this environment.
     *
     * @param instances The Amazon EC2 instances used by this environment.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * The Amazon EC2 instances used by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The Amazon EC2 instances used by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withInstances(Instance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<Instance>(instances.length));
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * The Amazon EC2 instances used by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The Amazon EC2 instances used by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
        }

        return this;
    }

    /**
     * The Auto Scaling launch configurations in use by this environment.
     *
     * @return The Auto Scaling launch configurations in use by this environment.
     */
    public java.util.List<LaunchConfiguration> getLaunchConfigurations() {
        if (launchConfigurations == null) {
              launchConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchConfiguration>();
              launchConfigurations.setAutoConstruct(true);
        }
        return launchConfigurations;
    }
    
    /**
     * The Auto Scaling launch configurations in use by this environment.
     *
     * @param launchConfigurations The Auto Scaling launch configurations in use by this environment.
     */
    public void setLaunchConfigurations(java.util.Collection<LaunchConfiguration> launchConfigurations) {
        if (launchConfigurations == null) {
            this.launchConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LaunchConfiguration> launchConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchConfiguration>(launchConfigurations.size());
        launchConfigurationsCopy.addAll(launchConfigurations);
        this.launchConfigurations = launchConfigurationsCopy;
    }
    
    /**
     * The Auto Scaling launch configurations in use by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurations The Auto Scaling launch configurations in use by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withLaunchConfigurations(LaunchConfiguration... launchConfigurations) {
        if (getLaunchConfigurations() == null) setLaunchConfigurations(new java.util.ArrayList<LaunchConfiguration>(launchConfigurations.length));
        for (LaunchConfiguration value : launchConfigurations) {
            getLaunchConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * The Auto Scaling launch configurations in use by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurations The Auto Scaling launch configurations in use by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withLaunchConfigurations(java.util.Collection<LaunchConfiguration> launchConfigurations) {
        if (launchConfigurations == null) {
            this.launchConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LaunchConfiguration> launchConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchConfiguration>(launchConfigurations.size());
            launchConfigurationsCopy.addAll(launchConfigurations);
            this.launchConfigurations = launchConfigurationsCopy;
        }

        return this;
    }

    /**
     * The LoadBalancers in use by this environment.
     *
     * @return The LoadBalancers in use by this environment.
     */
    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
              loadBalancers = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer>();
              loadBalancers.setAutoConstruct(true);
        }
        return loadBalancers;
    }
    
    /**
     * The LoadBalancers in use by this environment.
     *
     * @param loadBalancers The LoadBalancers in use by this environment.
     */
    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer> loadBalancersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer>(loadBalancers.size());
        loadBalancersCopy.addAll(loadBalancers);
        this.loadBalancers = loadBalancersCopy;
    }
    
    /**
     * The LoadBalancers in use by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancers The LoadBalancers in use by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withLoadBalancers(LoadBalancer... loadBalancers) {
        if (getLoadBalancers() == null) setLoadBalancers(new java.util.ArrayList<LoadBalancer>(loadBalancers.length));
        for (LoadBalancer value : loadBalancers) {
            getLoadBalancers().add(value);
        }
        return this;
    }
    
    /**
     * The LoadBalancers in use by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancers The LoadBalancers in use by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer> loadBalancersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer>(loadBalancers.size());
            loadBalancersCopy.addAll(loadBalancers);
            this.loadBalancers = loadBalancersCopy;
        }

        return this;
    }

    /**
     * The <code>AutoScaling</code> triggers in use by this environment.
     *
     * @return The <code>AutoScaling</code> triggers in use by this environment.
     */
    public java.util.List<Trigger> getTriggers() {
        if (triggers == null) {
              triggers = new com.amazonaws.internal.ListWithAutoConstructFlag<Trigger>();
              triggers.setAutoConstruct(true);
        }
        return triggers;
    }
    
    /**
     * The <code>AutoScaling</code> triggers in use by this environment.
     *
     * @param triggers The <code>AutoScaling</code> triggers in use by this environment.
     */
    public void setTriggers(java.util.Collection<Trigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Trigger> triggersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Trigger>(triggers.size());
        triggersCopy.addAll(triggers);
        this.triggers = triggersCopy;
    }
    
    /**
     * The <code>AutoScaling</code> triggers in use by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param triggers The <code>AutoScaling</code> triggers in use by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withTriggers(Trigger... triggers) {
        if (getTriggers() == null) setTriggers(new java.util.ArrayList<Trigger>(triggers.length));
        for (Trigger value : triggers) {
            getTriggers().add(value);
        }
        return this;
    }
    
    /**
     * The <code>AutoScaling</code> triggers in use by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param triggers The <code>AutoScaling</code> triggers in use by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnvironmentResourceDescription withTriggers(java.util.Collection<Trigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Trigger> triggersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Trigger>(triggers.size());
            triggersCopy.addAll(triggers);
            this.triggers = triggersCopy;
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
        if (getEnvironmentName() != null) sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getAutoScalingGroups() != null) sb.append("AutoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getInstances() != null) sb.append("Instances: " + getInstances() + ",");
        if (getLaunchConfigurations() != null) sb.append("LaunchConfigurations: " + getLaunchConfigurations() + ",");
        if (getLoadBalancers() != null) sb.append("LoadBalancers: " + getLoadBalancers() + ",");
        if (getTriggers() != null) sb.append("Triggers: " + getTriggers() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode()); 
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchConfigurations() == null) ? 0 : getLaunchConfigurations().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode()); 
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnvironmentResourceDescription == false) return false;
        EnvironmentResourceDescription other = (EnvironmentResourceDescription)obj;
        
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null) return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false) return false; 
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null) return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        if (other.getLaunchConfigurations() == null ^ this.getLaunchConfigurations() == null) return false;
        if (other.getLaunchConfigurations() != null && other.getLaunchConfigurations().equals(this.getLaunchConfigurations()) == false) return false; 
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null) return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false) return false; 
        if (other.getTriggers() == null ^ this.getTriggers() == null) return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false) return false; 
        return true;
    }
    
}
    