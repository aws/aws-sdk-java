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
 * Health details for an AWS Elastic Beanstalk environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The environment's name.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     * status</a> of the environment. For example, <code>Ok</code>.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     * <code>Terminating</code>, or <code>Terminated</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health color</a>
     * of the environment.
     * </p>
     */
    private String color;
    /**
     * <p>
     * Descriptions of the data that contributed to the environment's current health status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> causes;
    /**
     * <p>
     * Application request metrics for the environment.
     * </p>
     */
    private ApplicationMetrics applicationMetrics;
    /**
     * <p>
     * Summary health information for the instances in the environment.
     * </p>
     */
    private InstanceHealthSummary instancesHealth;
    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     */
    private java.util.Date refreshedAt;

    /**
     * <p>
     * The environment's name.
     * </p>
     * 
     * @param environmentName
     *        The environment's name.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The environment's name.
     * </p>
     * 
     * @return The environment's name.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The environment's name.
     * </p>
     * 
     * @param environmentName
     *        The environment's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     * status</a> of the environment. For example, <code>Ok</code>.
     * </p>
     * 
     * @param healthStatus
     *        The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     *        status</a> of the environment. For example, <code>Ok</code>.
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     * status</a> of the environment. For example, <code>Ok</code>.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     *         status</a> of the environment. For example, <code>Ok</code>.
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     * status</a> of the environment. For example, <code>Ok</code>.
     * </p>
     * 
     * @param healthStatus
     *        The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     *        status</a> of the environment. For example, <code>Ok</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     * <code>Terminating</code>, or <code>Terminated</code>.
     * </p>
     * 
     * @param status
     *        The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     *        <code>Terminating</code>, or <code>Terminated</code>.
     * @see EnvironmentHealth
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     * <code>Terminating</code>, or <code>Terminated</code>.
     * </p>
     * 
     * @return The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     *         <code>Terminating</code>, or <code>Terminated</code>.
     * @see EnvironmentHealth
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     * <code>Terminating</code>, or <code>Terminated</code>.
     * </p>
     * 
     * @param status
     *        The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     *        <code>Terminating</code>, or <code>Terminated</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentHealth
     */

    public DescribeEnvironmentHealthResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     * <code>Terminating</code>, or <code>Terminated</code>.
     * </p>
     * 
     * @param status
     *        The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     *        <code>Terminating</code>, or <code>Terminated</code>.
     * @see EnvironmentHealth
     */

    public void setStatus(EnvironmentHealth status) {
        withStatus(status);
    }

    /**
     * <p>
     * The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     * <code>Terminating</code>, or <code>Terminated</code>.
     * </p>
     * 
     * @param status
     *        The environment's operational status. <code>Ready</code>, <code>Launching</code>, <code>Updating</code>,
     *        <code>Terminating</code>, or <code>Terminated</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentHealth
     */

    public DescribeEnvironmentHealthResult withStatus(EnvironmentHealth status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health color</a>
     * of the environment.
     * </p>
     * 
     * @param color
     *        The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     *        color</a> of the environment.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health color</a>
     * of the environment.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     *         color</a> of the environment.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health color</a>
     * of the environment.
     * </p>
     * 
     * @param color
     *        The <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">health
     *        color</a> of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withColor(String color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * Descriptions of the data that contributed to the environment's current health status.
     * </p>
     * 
     * @return Descriptions of the data that contributed to the environment's current health status.
     */

    public java.util.List<String> getCauses() {
        if (causes == null) {
            causes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return causes;
    }

    /**
     * <p>
     * Descriptions of the data that contributed to the environment's current health status.
     * </p>
     * 
     * @param causes
     *        Descriptions of the data that contributed to the environment's current health status.
     */

    public void setCauses(java.util.Collection<String> causes) {
        if (causes == null) {
            this.causes = null;
            return;
        }

        this.causes = new com.amazonaws.internal.SdkInternalList<String>(causes);
    }

    /**
     * <p>
     * Descriptions of the data that contributed to the environment's current health status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCauses(java.util.Collection)} or {@link #withCauses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param causes
     *        Descriptions of the data that contributed to the environment's current health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withCauses(String... causes) {
        if (this.causes == null) {
            setCauses(new com.amazonaws.internal.SdkInternalList<String>(causes.length));
        }
        for (String ele : causes) {
            this.causes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Descriptions of the data that contributed to the environment's current health status.
     * </p>
     * 
     * @param causes
     *        Descriptions of the data that contributed to the environment's current health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withCauses(java.util.Collection<String> causes) {
        setCauses(causes);
        return this;
    }

    /**
     * <p>
     * Application request metrics for the environment.
     * </p>
     * 
     * @param applicationMetrics
     *        Application request metrics for the environment.
     */

    public void setApplicationMetrics(ApplicationMetrics applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
    }

    /**
     * <p>
     * Application request metrics for the environment.
     * </p>
     * 
     * @return Application request metrics for the environment.
     */

    public ApplicationMetrics getApplicationMetrics() {
        return this.applicationMetrics;
    }

    /**
     * <p>
     * Application request metrics for the environment.
     * </p>
     * 
     * @param applicationMetrics
     *        Application request metrics for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withApplicationMetrics(ApplicationMetrics applicationMetrics) {
        setApplicationMetrics(applicationMetrics);
        return this;
    }

    /**
     * <p>
     * Summary health information for the instances in the environment.
     * </p>
     * 
     * @param instancesHealth
     *        Summary health information for the instances in the environment.
     */

    public void setInstancesHealth(InstanceHealthSummary instancesHealth) {
        this.instancesHealth = instancesHealth;
    }

    /**
     * <p>
     * Summary health information for the instances in the environment.
     * </p>
     * 
     * @return Summary health information for the instances in the environment.
     */

    public InstanceHealthSummary getInstancesHealth() {
        return this.instancesHealth;
    }

    /**
     * <p>
     * Summary health information for the instances in the environment.
     * </p>
     * 
     * @param instancesHealth
     *        Summary health information for the instances in the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withInstancesHealth(InstanceHealthSummary instancesHealth) {
        setInstancesHealth(instancesHealth);
        return this;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     * 
     * @param refreshedAt
     *        The date and time that the health information was retrieved.
     */

    public void setRefreshedAt(java.util.Date refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     * 
     * @return The date and time that the health information was retrieved.
     */

    public java.util.Date getRefreshedAt() {
        return this.refreshedAt;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     * 
     * @param refreshedAt
     *        The date and time that the health information was retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withRefreshedAt(java.util.Date refreshedAt) {
        setRefreshedAt(refreshedAt);
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
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getCauses() != null)
            sb.append("Causes: ").append(getCauses()).append(",");
        if (getApplicationMetrics() != null)
            sb.append("ApplicationMetrics: ").append(getApplicationMetrics()).append(",");
        if (getInstancesHealth() != null)
            sb.append("InstancesHealth: ").append(getInstancesHealth()).append(",");
        if (getRefreshedAt() != null)
            sb.append("RefreshedAt: ").append(getRefreshedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentHealthResult == false)
            return false;
        DescribeEnvironmentHealthResult other = (DescribeEnvironmentHealthResult) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getCauses() == null ^ this.getCauses() == null)
            return false;
        if (other.getCauses() != null && other.getCauses().equals(this.getCauses()) == false)
            return false;
        if (other.getApplicationMetrics() == null ^ this.getApplicationMetrics() == null)
            return false;
        if (other.getApplicationMetrics() != null && other.getApplicationMetrics().equals(this.getApplicationMetrics()) == false)
            return false;
        if (other.getInstancesHealth() == null ^ this.getInstancesHealth() == null)
            return false;
        if (other.getInstancesHealth() != null && other.getInstancesHealth().equals(this.getInstancesHealth()) == false)
            return false;
        if (other.getRefreshedAt() == null ^ this.getRefreshedAt() == null)
            return false;
        if (other.getRefreshedAt() != null && other.getRefreshedAt().equals(this.getRefreshedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getCauses() == null) ? 0 : getCauses().hashCode());
        hashCode = prime * hashCode + ((getApplicationMetrics() == null) ? 0 : getApplicationMetrics().hashCode());
        hashCode = prime * hashCode + ((getInstancesHealth() == null) ? 0 : getInstancesHealth().hashCode());
        hashCode = prime * hashCode + ((getRefreshedAt() == null) ? 0 : getRefreshedAt().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentHealthResult clone() {
        try {
            return (DescribeEnvironmentHealthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
