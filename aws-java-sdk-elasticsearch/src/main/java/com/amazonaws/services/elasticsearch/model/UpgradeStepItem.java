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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single step of the Upgrade or Upgrade Eligibility Check workflow.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeStepItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     */
    private String upgradeStep;
    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     */
    private String upgradeStepStatus;
    /**
     * <p>
     * A list of strings containing detailed information about the errors encountered in a particular step.
     * </p>
     */
    private java.util.List<String> issues;
    /**
     * <p>
     * The Floating point value representing progress percentage of a particular step.
     * </p>
     */
    private Double progressPercent;

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStep
     *        Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     *        <ul>
     *        <li>PreUpgradeCheck</li>
     *        <li>Snapshot</li>
     *        <li>Upgrade</li>
     *        </ul>
     * @see UpgradeStep
     */

    public void setUpgradeStep(String upgradeStep) {
        this.upgradeStep = upgradeStep;
    }

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * 
     * @return Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     *         <ul>
     *         <li>PreUpgradeCheck</li>
     *         <li>Snapshot</li>
     *         <li>Upgrade</li>
     *         </ul>
     * @see UpgradeStep
     */

    public String getUpgradeStep() {
        return this.upgradeStep;
    }

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStep
     *        Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     *        <ul>
     *        <li>PreUpgradeCheck</li>
     *        <li>Snapshot</li>
     *        <li>Upgrade</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStep
     */

    public UpgradeStepItem withUpgradeStep(String upgradeStep) {
        setUpgradeStep(upgradeStep);
        return this;
    }

    /**
     * <p>
     * Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     * <ul>
     * <li>PreUpgradeCheck</li>
     * <li>Snapshot</li>
     * <li>Upgrade</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStep
     *        Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:
     *        <ul>
     *        <li>PreUpgradeCheck</li>
     *        <li>Snapshot</li>
     *        <li>Upgrade</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStep
     */

    public UpgradeStepItem withUpgradeStep(UpgradeStep upgradeStep) {
        this.upgradeStep = upgradeStep.toString();
        return this;
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStepStatus
     *        The status of a particular step during an upgrade. The status can take one of the following values:
     *        <ul>
     *        <li>In Progress</li>
     *        <li>Succeeded</li>
     *        <li>Succeeded with Issues</li>
     *        <li>Failed</li>
     *        </ul>
     * @see UpgradeStatus
     */

    public void setUpgradeStepStatus(String upgradeStepStatus) {
        this.upgradeStepStatus = upgradeStepStatus;
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * 
     * @return The status of a particular step during an upgrade. The status can take one of the following values:
     *         <ul>
     *         <li>In Progress</li>
     *         <li>Succeeded</li>
     *         <li>Succeeded with Issues</li>
     *         <li>Failed</li>
     *         </ul>
     * @see UpgradeStatus
     */

    public String getUpgradeStepStatus() {
        return this.upgradeStepStatus;
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStepStatus
     *        The status of a particular step during an upgrade. The status can take one of the following values:
     *        <ul>
     *        <li>In Progress</li>
     *        <li>Succeeded</li>
     *        <li>Succeeded with Issues</li>
     *        <li>Failed</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStatus
     */

    public UpgradeStepItem withUpgradeStepStatus(String upgradeStepStatus) {
        setUpgradeStepStatus(upgradeStepStatus);
        return this;
    }

    /**
     * <p>
     * The status of a particular step during an upgrade. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStepStatus
     *        The status of a particular step during an upgrade. The status can take one of the following values:
     *        <ul>
     *        <li>In Progress</li>
     *        <li>Succeeded</li>
     *        <li>Succeeded with Issues</li>
     *        <li>Failed</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStatus
     */

    public UpgradeStepItem withUpgradeStepStatus(UpgradeStatus upgradeStepStatus) {
        this.upgradeStepStatus = upgradeStepStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of strings containing detailed information about the errors encountered in a particular step.
     * </p>
     * 
     * @return A list of strings containing detailed information about the errors encountered in a particular step.
     */

    public java.util.List<String> getIssues() {
        return issues;
    }

    /**
     * <p>
     * A list of strings containing detailed information about the errors encountered in a particular step.
     * </p>
     * 
     * @param issues
     *        A list of strings containing detailed information about the errors encountered in a particular step.
     */

    public void setIssues(java.util.Collection<String> issues) {
        if (issues == null) {
            this.issues = null;
            return;
        }

        this.issues = new java.util.ArrayList<String>(issues);
    }

    /**
     * <p>
     * A list of strings containing detailed information about the errors encountered in a particular step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssues(java.util.Collection)} or {@link #withIssues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param issues
     *        A list of strings containing detailed information about the errors encountered in a particular step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeStepItem withIssues(String... issues) {
        if (this.issues == null) {
            setIssues(new java.util.ArrayList<String>(issues.length));
        }
        for (String ele : issues) {
            this.issues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings containing detailed information about the errors encountered in a particular step.
     * </p>
     * 
     * @param issues
     *        A list of strings containing detailed information about the errors encountered in a particular step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeStepItem withIssues(java.util.Collection<String> issues) {
        setIssues(issues);
        return this;
    }

    /**
     * <p>
     * The Floating point value representing progress percentage of a particular step.
     * </p>
     * 
     * @param progressPercent
     *        The Floating point value representing progress percentage of a particular step.
     */

    public void setProgressPercent(Double progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * The Floating point value representing progress percentage of a particular step.
     * </p>
     * 
     * @return The Floating point value representing progress percentage of a particular step.
     */

    public Double getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * <p>
     * The Floating point value representing progress percentage of a particular step.
     * </p>
     * 
     * @param progressPercent
     *        The Floating point value representing progress percentage of a particular step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeStepItem withProgressPercent(Double progressPercent) {
        setProgressPercent(progressPercent);
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
        if (getUpgradeStep() != null)
            sb.append("UpgradeStep: ").append(getUpgradeStep()).append(",");
        if (getUpgradeStepStatus() != null)
            sb.append("UpgradeStepStatus: ").append(getUpgradeStepStatus()).append(",");
        if (getIssues() != null)
            sb.append("Issues: ").append(getIssues()).append(",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: ").append(getProgressPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeStepItem == false)
            return false;
        UpgradeStepItem other = (UpgradeStepItem) obj;
        if (other.getUpgradeStep() == null ^ this.getUpgradeStep() == null)
            return false;
        if (other.getUpgradeStep() != null && other.getUpgradeStep().equals(this.getUpgradeStep()) == false)
            return false;
        if (other.getUpgradeStepStatus() == null ^ this.getUpgradeStepStatus() == null)
            return false;
        if (other.getUpgradeStepStatus() != null && other.getUpgradeStepStatus().equals(this.getUpgradeStepStatus()) == false)
            return false;
        if (other.getIssues() == null ^ this.getIssues() == null)
            return false;
        if (other.getIssues() != null && other.getIssues().equals(this.getIssues()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpgradeStep() == null) ? 0 : getUpgradeStep().hashCode());
        hashCode = prime * hashCode + ((getUpgradeStepStatus() == null) ? 0 : getUpgradeStepStatus().hashCode());
        hashCode = prime * hashCode + ((getIssues() == null) ? 0 : getIssues().hashCode());
        hashCode = prime * hashCode + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeStepItem clone() {
        try {
            return (UpgradeStepItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.UpgradeStepItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
