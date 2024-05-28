/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Launch actions status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/LaunchActionsStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchActionsStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of post launch action status.
     * </p>
     */
    private java.util.List<LaunchActionRun> runs;
    /**
     * <p>
     * Time where the AWS Systems Manager was detected as running on the launched instance.
     * </p>
     */
    private String ssmAgentDiscoveryDatetime;

    /**
     * <p>
     * List of post launch action status.
     * </p>
     * 
     * @return List of post launch action status.
     */

    public java.util.List<LaunchActionRun> getRuns() {
        return runs;
    }

    /**
     * <p>
     * List of post launch action status.
     * </p>
     * 
     * @param runs
     *        List of post launch action status.
     */

    public void setRuns(java.util.Collection<LaunchActionRun> runs) {
        if (runs == null) {
            this.runs = null;
            return;
        }

        this.runs = new java.util.ArrayList<LaunchActionRun>(runs);
    }

    /**
     * <p>
     * List of post launch action status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuns(java.util.Collection)} or {@link #withRuns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param runs
     *        List of post launch action status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionsStatus withRuns(LaunchActionRun... runs) {
        if (this.runs == null) {
            setRuns(new java.util.ArrayList<LaunchActionRun>(runs.length));
        }
        for (LaunchActionRun ele : runs) {
            this.runs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of post launch action status.
     * </p>
     * 
     * @param runs
     *        List of post launch action status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionsStatus withRuns(java.util.Collection<LaunchActionRun> runs) {
        setRuns(runs);
        return this;
    }

    /**
     * <p>
     * Time where the AWS Systems Manager was detected as running on the launched instance.
     * </p>
     * 
     * @param ssmAgentDiscoveryDatetime
     *        Time where the AWS Systems Manager was detected as running on the launched instance.
     */

    public void setSsmAgentDiscoveryDatetime(String ssmAgentDiscoveryDatetime) {
        this.ssmAgentDiscoveryDatetime = ssmAgentDiscoveryDatetime;
    }

    /**
     * <p>
     * Time where the AWS Systems Manager was detected as running on the launched instance.
     * </p>
     * 
     * @return Time where the AWS Systems Manager was detected as running on the launched instance.
     */

    public String getSsmAgentDiscoveryDatetime() {
        return this.ssmAgentDiscoveryDatetime;
    }

    /**
     * <p>
     * Time where the AWS Systems Manager was detected as running on the launched instance.
     * </p>
     * 
     * @param ssmAgentDiscoveryDatetime
     *        Time where the AWS Systems Manager was detected as running on the launched instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchActionsStatus withSsmAgentDiscoveryDatetime(String ssmAgentDiscoveryDatetime) {
        setSsmAgentDiscoveryDatetime(ssmAgentDiscoveryDatetime);
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
        if (getRuns() != null)
            sb.append("Runs: ").append(getRuns()).append(",");
        if (getSsmAgentDiscoveryDatetime() != null)
            sb.append("SsmAgentDiscoveryDatetime: ").append(getSsmAgentDiscoveryDatetime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchActionsStatus == false)
            return false;
        LaunchActionsStatus other = (LaunchActionsStatus) obj;
        if (other.getRuns() == null ^ this.getRuns() == null)
            return false;
        if (other.getRuns() != null && other.getRuns().equals(this.getRuns()) == false)
            return false;
        if (other.getSsmAgentDiscoveryDatetime() == null ^ this.getSsmAgentDiscoveryDatetime() == null)
            return false;
        if (other.getSsmAgentDiscoveryDatetime() != null && other.getSsmAgentDiscoveryDatetime().equals(this.getSsmAgentDiscoveryDatetime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuns() == null) ? 0 : getRuns().hashCode());
        hashCode = prime * hashCode + ((getSsmAgentDiscoveryDatetime() == null) ? 0 : getSsmAgentDiscoveryDatetime().hashCode());
        return hashCode;
    }

    @Override
    public LaunchActionsStatus clone() {
        try {
            return (LaunchActionsStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.LaunchActionsStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
