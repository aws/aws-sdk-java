/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the AWS resources in use by this environment. This data is
 * live.
 * </p>
 */
public class EnvironmentResourceDescription {

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
    private java.util.List<AutoScalingGroup> autoScalingGroups;

    /**
     * The Amazon EC2 instances used by this environment.
     */
    private java.util.List<Instance> instances;

    /**
     * The Auto Scaling launch configurations in use by this environment.
     */
    private java.util.List<LaunchConfiguration> launchConfigurations;

    /**
     * The LoadBalancers in use by this environment.
     */
    private java.util.List<LoadBalancer> loadBalancers;

    /**
     * The <code>AutoScaling</code> triggers in use by this environment.
     */
    private java.util.List<Trigger> triggers;

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
            autoScalingGroups = new java.util.ArrayList<AutoScalingGroup>();
        }
        return autoScalingGroups;
    }
    
    /**
     * The <code>AutoScalingGroups</code> used by this environment.
     *
     * @param autoScalingGroups The <code>AutoScalingGroups</code> used by this environment.
     */
    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        java.util.List<AutoScalingGroup> autoScalingGroupsCopy = new java.util.ArrayList<AutoScalingGroup>();
        if (autoScalingGroups != null) {
            autoScalingGroupsCopy.addAll(autoScalingGroups);
        }
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
        java.util.List<AutoScalingGroup> autoScalingGroupsCopy = new java.util.ArrayList<AutoScalingGroup>();
        if (autoScalingGroups != null) {
            autoScalingGroupsCopy.addAll(autoScalingGroups);
        }
        this.autoScalingGroups = autoScalingGroupsCopy;

        return this;
    }
    
    /**
     * The Amazon EC2 instances used by this environment.
     *
     * @return The Amazon EC2 instances used by this environment.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new java.util.ArrayList<Instance>();
        }
        return instances;
    }
    
    /**
     * The Amazon EC2 instances used by this environment.
     *
     * @param instances The Amazon EC2 instances used by this environment.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
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
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;

        return this;
    }
    
    /**
     * The Auto Scaling launch configurations in use by this environment.
     *
     * @return The Auto Scaling launch configurations in use by this environment.
     */
    public java.util.List<LaunchConfiguration> getLaunchConfigurations() {
        if (launchConfigurations == null) {
            launchConfigurations = new java.util.ArrayList<LaunchConfiguration>();
        }
        return launchConfigurations;
    }
    
    /**
     * The Auto Scaling launch configurations in use by this environment.
     *
     * @param launchConfigurations The Auto Scaling launch configurations in use by this environment.
     */
    public void setLaunchConfigurations(java.util.Collection<LaunchConfiguration> launchConfigurations) {
        java.util.List<LaunchConfiguration> launchConfigurationsCopy = new java.util.ArrayList<LaunchConfiguration>();
        if (launchConfigurations != null) {
            launchConfigurationsCopy.addAll(launchConfigurations);
        }
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
        java.util.List<LaunchConfiguration> launchConfigurationsCopy = new java.util.ArrayList<LaunchConfiguration>();
        if (launchConfigurations != null) {
            launchConfigurationsCopy.addAll(launchConfigurations);
        }
        this.launchConfigurations = launchConfigurationsCopy;

        return this;
    }
    
    /**
     * The LoadBalancers in use by this environment.
     *
     * @return The LoadBalancers in use by this environment.
     */
    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
            loadBalancers = new java.util.ArrayList<LoadBalancer>();
        }
        return loadBalancers;
    }
    
    /**
     * The LoadBalancers in use by this environment.
     *
     * @param loadBalancers The LoadBalancers in use by this environment.
     */
    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        java.util.List<LoadBalancer> loadBalancersCopy = new java.util.ArrayList<LoadBalancer>();
        if (loadBalancers != null) {
            loadBalancersCopy.addAll(loadBalancers);
        }
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
        java.util.List<LoadBalancer> loadBalancersCopy = new java.util.ArrayList<LoadBalancer>();
        if (loadBalancers != null) {
            loadBalancersCopy.addAll(loadBalancers);
        }
        this.loadBalancers = loadBalancersCopy;

        return this;
    }
    
    /**
     * The <code>AutoScaling</code> triggers in use by this environment.
     *
     * @return The <code>AutoScaling</code> triggers in use by this environment.
     */
    public java.util.List<Trigger> getTriggers() {
        if (triggers == null) {
            triggers = new java.util.ArrayList<Trigger>();
        }
        return triggers;
    }
    
    /**
     * The <code>AutoScaling</code> triggers in use by this environment.
     *
     * @param triggers The <code>AutoScaling</code> triggers in use by this environment.
     */
    public void setTriggers(java.util.Collection<Trigger> triggers) {
        java.util.List<Trigger> triggersCopy = new java.util.ArrayList<Trigger>();
        if (triggers != null) {
            triggersCopy.addAll(triggers);
        }
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
        java.util.List<Trigger> triggersCopy = new java.util.ArrayList<Trigger>();
        if (triggers != null) {
            triggersCopy.addAll(triggers);
        }
        this.triggers = triggersCopy;

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
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("AutoScalingGroups: " + autoScalingGroups + ", ");
        sb.append("Instances: " + instances + ", ");
        sb.append("LaunchConfigurations: " + launchConfigurations + ", ");
        sb.append("LoadBalancers: " + loadBalancers + ", ");
        sb.append("Triggers: " + triggers + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    