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
 * CPU utilization and load average metrics for an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/SystemStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemStatus implements Serializable, Cloneable {

    /**
     * <p>
     * CPU utilization metrics for the instance.
     * </p>
     */
    private CPUUtilization cPUUtilization;
    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Double> loadAverage;

    /**
     * <p>
     * CPU utilization metrics for the instance.
     * </p>
     * 
     * @param cPUUtilization
     *        CPU utilization metrics for the instance.
     */

    public void setCPUUtilization(CPUUtilization cPUUtilization) {
        this.cPUUtilization = cPUUtilization;
    }

    /**
     * <p>
     * CPU utilization metrics for the instance.
     * </p>
     * 
     * @return CPU utilization metrics for the instance.
     */

    public CPUUtilization getCPUUtilization() {
        return this.cPUUtilization;
    }

    /**
     * <p>
     * CPU utilization metrics for the instance.
     * </p>
     * 
     * @param cPUUtilization
     *        CPU utilization metrics for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemStatus withCPUUtilization(CPUUtilization cPUUtilization) {
        setCPUUtilization(cPUUtilization);
        return this;
    }

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     * 
     * @return Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     *         >Operating System Metrics</a>.
     */

    public java.util.List<Double> getLoadAverage() {
        if (loadAverage == null) {
            loadAverage = new com.amazonaws.internal.SdkInternalList<Double>();
        }
        return loadAverage;
    }

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     * 
     * @param loadAverage
     *        Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     *        >Operating System Metrics</a>.
     */

    public void setLoadAverage(java.util.Collection<Double> loadAverage) {
        if (loadAverage == null) {
            this.loadAverage = null;
            return;
        }

        this.loadAverage = new com.amazonaws.internal.SdkInternalList<Double>(loadAverage);
    }

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadAverage(java.util.Collection)} or {@link #withLoadAverage(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param loadAverage
     *        Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     *        >Operating System Metrics</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemStatus withLoadAverage(Double... loadAverage) {
        if (this.loadAverage == null) {
            setLoadAverage(new com.amazonaws.internal.SdkInternalList<Double>(loadAverage.length));
        }
        for (Double ele : loadAverage) {
            this.loadAverage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     * >Operating System Metrics</a>.
     * </p>
     * 
     * @param loadAverage
     *        Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see <a href=
     *        "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-metrics.html#health-enhanced-metrics-os"
     *        >Operating System Metrics</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemStatus withLoadAverage(java.util.Collection<Double> loadAverage) {
        setLoadAverage(loadAverage);
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
        if (getCPUUtilization() != null)
            sb.append("CPUUtilization: ").append(getCPUUtilization()).append(",");
        if (getLoadAverage() != null)
            sb.append("LoadAverage: ").append(getLoadAverage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemStatus == false)
            return false;
        SystemStatus other = (SystemStatus) obj;
        if (other.getCPUUtilization() == null ^ this.getCPUUtilization() == null)
            return false;
        if (other.getCPUUtilization() != null && other.getCPUUtilization().equals(this.getCPUUtilization()) == false)
            return false;
        if (other.getLoadAverage() == null ^ this.getLoadAverage() == null)
            return false;
        if (other.getLoadAverage() != null && other.getLoadAverage().equals(this.getLoadAverage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCPUUtilization() == null) ? 0 : getCPUUtilization().hashCode());
        hashCode = prime * hashCode + ((getLoadAverage() == null) ? 0 : getLoadAverage().hashCode());
        return hashCode;
    }

    @Override
    public SystemStatus clone() {
        try {
            return (SystemStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
