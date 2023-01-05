/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the response returned by the <code>GetUpgradeStatus</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUpgradeStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * One of three steps that an upgrade or upgrade eligibility check goes through.
     * </p>
     */
    private String upgradeStep;
    /**
     * <p>
     * The status of the current step that an upgrade is on.
     * </p>
     */
    private String stepStatus;
    /**
     * <p>
     * A string that describes the update.
     * </p>
     */
    private String upgradeName;

    /**
     * <p>
     * One of three steps that an upgrade or upgrade eligibility check goes through.
     * </p>
     * 
     * @param upgradeStep
     *        One of three steps that an upgrade or upgrade eligibility check goes through.
     * @see UpgradeStep
     */

    public void setUpgradeStep(String upgradeStep) {
        this.upgradeStep = upgradeStep;
    }

    /**
     * <p>
     * One of three steps that an upgrade or upgrade eligibility check goes through.
     * </p>
     * 
     * @return One of three steps that an upgrade or upgrade eligibility check goes through.
     * @see UpgradeStep
     */

    public String getUpgradeStep() {
        return this.upgradeStep;
    }

    /**
     * <p>
     * One of three steps that an upgrade or upgrade eligibility check goes through.
     * </p>
     * 
     * @param upgradeStep
     *        One of three steps that an upgrade or upgrade eligibility check goes through.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStep
     */

    public GetUpgradeStatusResult withUpgradeStep(String upgradeStep) {
        setUpgradeStep(upgradeStep);
        return this;
    }

    /**
     * <p>
     * One of three steps that an upgrade or upgrade eligibility check goes through.
     * </p>
     * 
     * @param upgradeStep
     *        One of three steps that an upgrade or upgrade eligibility check goes through.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStep
     */

    public GetUpgradeStatusResult withUpgradeStep(UpgradeStep upgradeStep) {
        this.upgradeStep = upgradeStep.toString();
        return this;
    }

    /**
     * <p>
     * The status of the current step that an upgrade is on.
     * </p>
     * 
     * @param stepStatus
     *        The status of the current step that an upgrade is on.
     * @see UpgradeStatus
     */

    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * <p>
     * The status of the current step that an upgrade is on.
     * </p>
     * 
     * @return The status of the current step that an upgrade is on.
     * @see UpgradeStatus
     */

    public String getStepStatus() {
        return this.stepStatus;
    }

    /**
     * <p>
     * The status of the current step that an upgrade is on.
     * </p>
     * 
     * @param stepStatus
     *        The status of the current step that an upgrade is on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStatus
     */

    public GetUpgradeStatusResult withStepStatus(String stepStatus) {
        setStepStatus(stepStatus);
        return this;
    }

    /**
     * <p>
     * The status of the current step that an upgrade is on.
     * </p>
     * 
     * @param stepStatus
     *        The status of the current step that an upgrade is on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStatus
     */

    public GetUpgradeStatusResult withStepStatus(UpgradeStatus stepStatus) {
        this.stepStatus = stepStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string that describes the update.
     * </p>
     * 
     * @param upgradeName
     *        A string that describes the update.
     */

    public void setUpgradeName(String upgradeName) {
        this.upgradeName = upgradeName;
    }

    /**
     * <p>
     * A string that describes the update.
     * </p>
     * 
     * @return A string that describes the update.
     */

    public String getUpgradeName() {
        return this.upgradeName;
    }

    /**
     * <p>
     * A string that describes the update.
     * </p>
     * 
     * @param upgradeName
     *        A string that describes the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUpgradeStatusResult withUpgradeName(String upgradeName) {
        setUpgradeName(upgradeName);
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
        if (getStepStatus() != null)
            sb.append("StepStatus: ").append(getStepStatus()).append(",");
        if (getUpgradeName() != null)
            sb.append("UpgradeName: ").append(getUpgradeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUpgradeStatusResult == false)
            return false;
        GetUpgradeStatusResult other = (GetUpgradeStatusResult) obj;
        if (other.getUpgradeStep() == null ^ this.getUpgradeStep() == null)
            return false;
        if (other.getUpgradeStep() != null && other.getUpgradeStep().equals(this.getUpgradeStep()) == false)
            return false;
        if (other.getStepStatus() == null ^ this.getStepStatus() == null)
            return false;
        if (other.getStepStatus() != null && other.getStepStatus().equals(this.getStepStatus()) == false)
            return false;
        if (other.getUpgradeName() == null ^ this.getUpgradeName() == null)
            return false;
        if (other.getUpgradeName() != null && other.getUpgradeName().equals(this.getUpgradeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpgradeStep() == null) ? 0 : getUpgradeStep().hashCode());
        hashCode = prime * hashCode + ((getStepStatus() == null) ? 0 : getStepStatus().hashCode());
        hashCode = prime * hashCode + ((getUpgradeName() == null) ? 0 : getUpgradeName().hashCode());
        return hashCode;
    }

    @Override
    public GetUpgradeStatusResult clone() {
        try {
            return (GetUpgradeStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
