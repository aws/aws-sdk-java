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
 * History of the last 10 Upgrades and Upgrade Eligibility Checks.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeHistory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     */
    private String upgradeName;
    /**
     * <p>
     * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * The overall status of the update. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     */
    private String upgradeStatus;
    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as pard of a
     * specific Upgrade or Upgrade Eligibility Check.
     * </p>
     */
    private java.util.List<UpgradeStepItem> stepsList;

    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     * 
     * @param upgradeName
     *        A string that describes the update briefly
     */

    public void setUpgradeName(String upgradeName) {
        this.upgradeName = upgradeName;
    }

    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     * 
     * @return A string that describes the update briefly
     */

    public String getUpgradeName() {
        return this.upgradeName;
    }

    /**
     * <p>
     * A string that describes the update briefly
     * </p>
     * 
     * @param upgradeName
     *        A string that describes the update briefly
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeHistory withUpgradeName(String upgradeName) {
        setUpgradeName(upgradeName);
        return this;
    }

    /**
     * <p>
     * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
     * </p>
     * 
     * @param startTimestamp
     *        UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
     * </p>
     * 
     * @return UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
     * </p>
     * 
     * @param startTimestamp
     *        UTC Timestamp at which the Upgrade API call was made in "yyyy-MM-ddTHH:mm:ssZ" format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeHistory withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStatus
     *        The overall status of the update. The status can take one of the following values:
     *        <ul>
     *        <li>In Progress</li>
     *        <li>Succeeded</li>
     *        <li>Succeeded with Issues</li>
     *        <li>Failed</li>
     *        </ul>
     * @see UpgradeStatus
     */

    public void setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * 
     * @return The overall status of the update. The status can take one of the following values:
     *         <ul>
     *         <li>In Progress</li>
     *         <li>Succeeded</li>
     *         <li>Succeeded with Issues</li>
     *         <li>Failed</li>
     *         </ul>
     * @see UpgradeStatus
     */

    public String getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStatus
     *        The overall status of the update. The status can take one of the following values:
     *        <ul>
     *        <li>In Progress</li>
     *        <li>Succeeded</li>
     *        <li>Succeeded with Issues</li>
     *        <li>Failed</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStatus
     */

    public UpgradeHistory withUpgradeStatus(String upgradeStatus) {
        setUpgradeStatus(upgradeStatus);
        return this;
    }

    /**
     * <p>
     * The overall status of the update. The status can take one of the following values:
     * <ul>
     * <li>In Progress</li>
     * <li>Succeeded</li>
     * <li>Succeeded with Issues</li>
     * <li>Failed</li>
     * </ul>
     * </p>
     * 
     * @param upgradeStatus
     *        The overall status of the update. The status can take one of the following values:
     *        <ul>
     *        <li>In Progress</li>
     *        <li>Succeeded</li>
     *        <li>Succeeded with Issues</li>
     *        <li>Failed</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpgradeStatus
     */

    public UpgradeHistory withUpgradeStatus(UpgradeStatus upgradeStatus) {
        this.upgradeStatus = upgradeStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as pard of a
     * specific Upgrade or Upgrade Eligibility Check.
     * </p>
     * 
     * @return A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as
     *         pard of a specific Upgrade or Upgrade Eligibility Check.
     */

    public java.util.List<UpgradeStepItem> getStepsList() {
        return stepsList;
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as pard of a
     * specific Upgrade or Upgrade Eligibility Check.
     * </p>
     * 
     * @param stepsList
     *        A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as
     *        pard of a specific Upgrade or Upgrade Eligibility Check.
     */

    public void setStepsList(java.util.Collection<UpgradeStepItem> stepsList) {
        if (stepsList == null) {
            this.stepsList = null;
            return;
        }

        this.stepsList = new java.util.ArrayList<UpgradeStepItem>(stepsList);
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as pard of a
     * specific Upgrade or Upgrade Eligibility Check.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepsList(java.util.Collection)} or {@link #withStepsList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stepsList
     *        A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as
     *        pard of a specific Upgrade or Upgrade Eligibility Check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeHistory withStepsList(UpgradeStepItem... stepsList) {
        if (this.stepsList == null) {
            setStepsList(new java.util.ArrayList<UpgradeStepItem>(stepsList.length));
        }
        for (UpgradeStepItem ele : stepsList) {
            this.stepsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as pard of a
     * specific Upgrade or Upgrade Eligibility Check.
     * </p>
     * 
     * @param stepsList
     *        A list of <code> <a>UpgradeStepItem</a> </code> s representing information about each step performed as
     *        pard of a specific Upgrade or Upgrade Eligibility Check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeHistory withStepsList(java.util.Collection<UpgradeStepItem> stepsList) {
        setStepsList(stepsList);
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
        if (getUpgradeName() != null)
            sb.append("UpgradeName: ").append(getUpgradeName()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getUpgradeStatus() != null)
            sb.append("UpgradeStatus: ").append(getUpgradeStatus()).append(",");
        if (getStepsList() != null)
            sb.append("StepsList: ").append(getStepsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeHistory == false)
            return false;
        UpgradeHistory other = (UpgradeHistory) obj;
        if (other.getUpgradeName() == null ^ this.getUpgradeName() == null)
            return false;
        if (other.getUpgradeName() != null && other.getUpgradeName().equals(this.getUpgradeName()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getUpgradeStatus() == null ^ this.getUpgradeStatus() == null)
            return false;
        if (other.getUpgradeStatus() != null && other.getUpgradeStatus().equals(this.getUpgradeStatus()) == false)
            return false;
        if (other.getStepsList() == null ^ this.getStepsList() == null)
            return false;
        if (other.getStepsList() != null && other.getStepsList().equals(this.getStepsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpgradeName() == null) ? 0 : getUpgradeName().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpgradeStatus() == null) ? 0 : getUpgradeStatus().hashCode());
        hashCode = prime * hashCode + ((getStepsList() == null) ? 0 : getStepsList().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeHistory clone() {
        try {
            return (UpgradeHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.UpgradeHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
