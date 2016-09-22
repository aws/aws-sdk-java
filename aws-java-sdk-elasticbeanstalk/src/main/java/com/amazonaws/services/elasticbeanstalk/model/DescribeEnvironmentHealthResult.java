/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * See the example below for a sample response.
 * </p>
 */
public class DescribeEnvironmentHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Elastic Beanstalk environment name.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Contains the response body with information about the health of the environment.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * Returns the health status value of the environment. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Returns the color indicator that tells you information about the health of the environment. For more information,
     * see <a href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     */
    private String color;
    /**
     * <p>
     * Returns potential causes for the reported status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> causes;

    private ApplicationMetrics applicationMetrics;

    private InstanceHealthSummary instancesHealth;
    /**
     * <p>
     * The date and time the information was last refreshed.
     * </p>
     */
    private java.util.Date refreshedAt;

    /**
     * <p>
     * The AWS Elastic Beanstalk environment name.
     * </p>
     * 
     * @param environmentName
     *        The AWS Elastic Beanstalk environment name.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The AWS Elastic Beanstalk environment name.
     * </p>
     * 
     * @return The AWS Elastic Beanstalk environment name.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The AWS Elastic Beanstalk environment name.
     * </p>
     * 
     * @param environmentName
     *        The AWS Elastic Beanstalk environment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Contains the response body with information about the health of the environment.
     * </p>
     * 
     * @param healthStatus
     *        Contains the response body with information about the health of the environment.
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * Contains the response body with information about the health of the environment.
     * </p>
     * 
     * @return Contains the response body with information about the health of the environment.
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * Contains the response body with information about the health of the environment.
     * </p>
     * 
     * @param healthStatus
     *        Contains the response body with information about the health of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * Returns the health status value of the environment. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     * 
     * @param status
     *        Returns the health status value of the environment. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     *        Statuses</a>.
     * @see EnvironmentHealth
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Returns the health status value of the environment. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     * 
     * @return Returns the health status value of the environment. For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors
     *         and Statuses</a>.
     * @see EnvironmentHealth
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Returns the health status value of the environment. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     * 
     * @param status
     *        Returns the health status value of the environment. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     *        Statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentHealth
     */

    public DescribeEnvironmentHealthResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Returns the health status value of the environment. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     * 
     * @param status
     *        Returns the health status value of the environment. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     *        Statuses</a>.
     * @see EnvironmentHealth
     */

    public void setStatus(EnvironmentHealth status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Returns the health status value of the environment. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     * 
     * @param status
     *        Returns the health status value of the environment. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     *        Statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentHealth
     */

    public DescribeEnvironmentHealthResult withStatus(EnvironmentHealth status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Returns the color indicator that tells you information about the health of the environment. For more information,
     * see <a href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     * 
     * @param color
     *        Returns the color indicator that tells you information about the health of the environment. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     *        Statuses</a>.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * Returns the color indicator that tells you information about the health of the environment. For more information,
     * see <a href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     * 
     * @return Returns the color indicator that tells you information about the health of the environment. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors
     *         and Statuses</a>.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * Returns the color indicator that tells you information about the health of the environment. For more information,
     * see <a href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     * Statuses</a>.
     * </p>
     * 
     * @param color
     *        Returns the color indicator that tells you information about the health of the environment. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
     *        Statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withColor(String color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * Returns potential causes for the reported status.
     * </p>
     * 
     * @return Returns potential causes for the reported status.
     */

    public java.util.List<String> getCauses() {
        if (causes == null) {
            causes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return causes;
    }

    /**
     * <p>
     * Returns potential causes for the reported status.
     * </p>
     * 
     * @param causes
     *        Returns potential causes for the reported status.
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
     * Returns potential causes for the reported status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCauses(java.util.Collection)} or {@link #withCauses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param causes
     *        Returns potential causes for the reported status.
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
     * Returns potential causes for the reported status.
     * </p>
     * 
     * @param causes
     *        Returns potential causes for the reported status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withCauses(java.util.Collection<String> causes) {
        setCauses(causes);
        return this;
    }

    /**
     * @param applicationMetrics
     */

    public void setApplicationMetrics(ApplicationMetrics applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
    }

    /**
     * @return
     */

    public ApplicationMetrics getApplicationMetrics() {
        return this.applicationMetrics;
    }

    /**
     * @param applicationMetrics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withApplicationMetrics(ApplicationMetrics applicationMetrics) {
        setApplicationMetrics(applicationMetrics);
        return this;
    }

    /**
     * @param instancesHealth
     */

    public void setInstancesHealth(InstanceHealthSummary instancesHealth) {
        this.instancesHealth = instancesHealth;
    }

    /**
     * @return
     */

    public InstanceHealthSummary getInstancesHealth() {
        return this.instancesHealth;
    }

    /**
     * @param instancesHealth
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withInstancesHealth(InstanceHealthSummary instancesHealth) {
        setInstancesHealth(instancesHealth);
        return this;
    }

    /**
     * <p>
     * The date and time the information was last refreshed.
     * </p>
     * 
     * @param refreshedAt
     *        The date and time the information was last refreshed.
     */

    public void setRefreshedAt(java.util.Date refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * <p>
     * The date and time the information was last refreshed.
     * </p>
     * 
     * @return The date and time the information was last refreshed.
     */

    public java.util.Date getRefreshedAt() {
        return this.refreshedAt;
    }

    /**
     * <p>
     * The date and time the information was last refreshed.
     * </p>
     * 
     * @param refreshedAt
     *        The date and time the information was last refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthResult withRefreshedAt(java.util.Date refreshedAt) {
        setRefreshedAt(refreshedAt);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getColor() != null)
            sb.append("Color: " + getColor() + ",");
        if (getCauses() != null)
            sb.append("Causes: " + getCauses() + ",");
        if (getApplicationMetrics() != null)
            sb.append("ApplicationMetrics: " + getApplicationMetrics() + ",");
        if (getInstancesHealth() != null)
            sb.append("InstancesHealth: " + getInstancesHealth() + ",");
        if (getRefreshedAt() != null)
            sb.append("RefreshedAt: " + getRefreshedAt());
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
