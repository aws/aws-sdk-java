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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the AWS resources in use by this environment. This data is live.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/EnvironmentResourceDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentResourceDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutoScalingGroup> autoScalingGroups;
    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Instance> instances;
    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchConfiguration> launchConfigurations;
    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplate> launchTemplates;
    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancers;
    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Trigger> triggers;
    /**
     * <p>
     * The queues used by this environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Queue> queues;

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     * 
     * @return The <code>AutoScalingGroups</code> used by this environment.
     */

    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
            autoScalingGroups = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>();
        }
        return autoScalingGroups;
    }

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     * 
     * @param autoScalingGroups
     *        The <code>AutoScalingGroups</code> used by this environment.
     */

    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(autoScalingGroups);
    }

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingGroups(java.util.Collection)} or {@link #withAutoScalingGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param autoScalingGroups
     *        The <code>AutoScalingGroups</code> used by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        if (this.autoScalingGroups == null) {
            setAutoScalingGroups(new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(autoScalingGroups.length));
        }
        for (AutoScalingGroup ele : autoScalingGroups) {
            this.autoScalingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>AutoScalingGroups</code> used by this environment.
     * </p>
     * 
     * @param autoScalingGroups
     *        The <code>AutoScalingGroups</code> used by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     * 
     * @return The Amazon EC2 instances used by this environment.
     */

    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<Instance>();
        }
        return instances;
    }

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     * 
     * @param instances
     *        The Amazon EC2 instances used by this environment.
     */

    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<Instance>(instances);
    }

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        The Amazon EC2 instances used by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withInstances(Instance... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<Instance>(instances.length));
        }
        for (Instance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instances used by this environment.
     * </p>
     * 
     * @param instances
     *        The Amazon EC2 instances used by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     * 
     * @return The Auto Scaling launch configurations in use by this environment.
     */

    public java.util.List<LaunchConfiguration> getLaunchConfigurations() {
        if (launchConfigurations == null) {
            launchConfigurations = new com.amazonaws.internal.SdkInternalList<LaunchConfiguration>();
        }
        return launchConfigurations;
    }

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     * 
     * @param launchConfigurations
     *        The Auto Scaling launch configurations in use by this environment.
     */

    public void setLaunchConfigurations(java.util.Collection<LaunchConfiguration> launchConfigurations) {
        if (launchConfigurations == null) {
            this.launchConfigurations = null;
            return;
        }

        this.launchConfigurations = new com.amazonaws.internal.SdkInternalList<LaunchConfiguration>(launchConfigurations);
    }

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchConfigurations(java.util.Collection)} or {@link #withLaunchConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param launchConfigurations
     *        The Auto Scaling launch configurations in use by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withLaunchConfigurations(LaunchConfiguration... launchConfigurations) {
        if (this.launchConfigurations == null) {
            setLaunchConfigurations(new com.amazonaws.internal.SdkInternalList<LaunchConfiguration>(launchConfigurations.length));
        }
        for (LaunchConfiguration ele : launchConfigurations) {
            this.launchConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Auto Scaling launch configurations in use by this environment.
     * </p>
     * 
     * @param launchConfigurations
     *        The Auto Scaling launch configurations in use by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withLaunchConfigurations(java.util.Collection<LaunchConfiguration> launchConfigurations) {
        setLaunchConfigurations(launchConfigurations);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     * 
     * @return The Amazon EC2 launch templates in use by this environment.
     */

    public java.util.List<LaunchTemplate> getLaunchTemplates() {
        if (launchTemplates == null) {
            launchTemplates = new com.amazonaws.internal.SdkInternalList<LaunchTemplate>();
        }
        return launchTemplates;
    }

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     * 
     * @param launchTemplates
     *        The Amazon EC2 launch templates in use by this environment.
     */

    public void setLaunchTemplates(java.util.Collection<LaunchTemplate> launchTemplates) {
        if (launchTemplates == null) {
            this.launchTemplates = null;
            return;
        }

        this.launchTemplates = new com.amazonaws.internal.SdkInternalList<LaunchTemplate>(launchTemplates);
    }

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchTemplates(java.util.Collection)} or {@link #withLaunchTemplates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param launchTemplates
     *        The Amazon EC2 launch templates in use by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withLaunchTemplates(LaunchTemplate... launchTemplates) {
        if (this.launchTemplates == null) {
            setLaunchTemplates(new com.amazonaws.internal.SdkInternalList<LaunchTemplate>(launchTemplates.length));
        }
        for (LaunchTemplate ele : launchTemplates) {
            this.launchTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 launch templates in use by this environment.
     * </p>
     * 
     * @param launchTemplates
     *        The Amazon EC2 launch templates in use by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withLaunchTemplates(java.util.Collection<LaunchTemplate> launchTemplates) {
        setLaunchTemplates(launchTemplates);
        return this;
    }

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     * 
     * @return The LoadBalancers in use by this environment.
     */

    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
            loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>();
        }
        return loadBalancers;
    }

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     * 
     * @param loadBalancers
     *        The LoadBalancers in use by this environment.
     */

    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        The LoadBalancers in use by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withLoadBalancers(LoadBalancer... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers.length));
        }
        for (LoadBalancer ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The LoadBalancers in use by this environment.
     * </p>
     * 
     * @param loadBalancers
     *        The LoadBalancers in use by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     * 
     * @return The <code>AutoScaling</code> triggers in use by this environment.
     */

    public java.util.List<Trigger> getTriggers() {
        if (triggers == null) {
            triggers = new com.amazonaws.internal.SdkInternalList<Trigger>();
        }
        return triggers;
    }

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     * 
     * @param triggers
     *        The <code>AutoScaling</code> triggers in use by this environment.
     */

    public void setTriggers(java.util.Collection<Trigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new com.amazonaws.internal.SdkInternalList<Trigger>(triggers);
    }

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        The <code>AutoScaling</code> triggers in use by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withTriggers(Trigger... triggers) {
        if (this.triggers == null) {
            setTriggers(new com.amazonaws.internal.SdkInternalList<Trigger>(triggers.length));
        }
        for (Trigger ele : triggers) {
            this.triggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>AutoScaling</code> triggers in use by this environment.
     * </p>
     * 
     * @param triggers
     *        The <code>AutoScaling</code> triggers in use by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withTriggers(java.util.Collection<Trigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     * 
     * @return The queues used by this environment.
     */

    public java.util.List<Queue> getQueues() {
        if (queues == null) {
            queues = new com.amazonaws.internal.SdkInternalList<Queue>();
        }
        return queues;
    }

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     * 
     * @param queues
     *        The queues used by this environment.
     */

    public void setQueues(java.util.Collection<Queue> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new com.amazonaws.internal.SdkInternalList<Queue>(queues);
    }

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueues(java.util.Collection)} or {@link #withQueues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param queues
     *        The queues used by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withQueues(Queue... queues) {
        if (this.queues == null) {
            setQueues(new com.amazonaws.internal.SdkInternalList<Queue>(queues.length));
        }
        for (Queue ele : queues) {
            this.queues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The queues used by this environment.
     * </p>
     * 
     * @param queues
     *        The queues used by this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourceDescription withQueues(java.util.Collection<Queue> queues) {
        setQueues(queues);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: ").append(getAutoScalingGroups()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getLaunchConfigurations() != null)
            sb.append("LaunchConfigurations: ").append(getLaunchConfigurations()).append(",");
        if (getLaunchTemplates() != null)
            sb.append("LaunchTemplates: ").append(getLaunchTemplates()).append(",");
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers()).append(",");
        if (getTriggers() != null)
            sb.append("Triggers: ").append(getTriggers()).append(",");
        if (getQueues() != null)
            sb.append("Queues: ").append(getQueues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentResourceDescription == false)
            return false;
        EnvironmentResourceDescription other = (EnvironmentResourceDescription) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getLaunchConfigurations() == null ^ this.getLaunchConfigurations() == null)
            return false;
        if (other.getLaunchConfigurations() != null && other.getLaunchConfigurations().equals(this.getLaunchConfigurations()) == false)
            return false;
        if (other.getLaunchTemplates() == null ^ this.getLaunchTemplates() == null)
            return false;
        if (other.getLaunchTemplates() != null && other.getLaunchTemplates().equals(this.getLaunchTemplates()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurations() == null) ? 0 : getLaunchConfigurations().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplates() == null) ? 0 : getLaunchTemplates().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentResourceDescription clone() {
        try {
            return (EnvironmentResourceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
