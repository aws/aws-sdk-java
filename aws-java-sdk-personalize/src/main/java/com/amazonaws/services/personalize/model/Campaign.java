/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a deployed solution version, otherwise known as a campaign. For more information on campaigns, see
 * <a>CreateCampaign</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/Campaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Campaign implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the campaign.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     */
    private String campaignArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific version of the solution.
     * </p>
     */
    private String solutionVersionArn;
    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second.
     * </p>
     */
    private Integer minProvisionedTPS;
    /**
     * <p>
     * The status of the campaign.
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If a campaign fails, the reason behind the failure.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The date and time (in Unix format) that the campaign was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix format) that the campaign was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    private CampaignUpdateSummary latestCampaignUpdate;

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @param name
     *        The name of the campaign.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @return The name of the campaign.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the campaign.
     * </p>
     * 
     * @param name
     *        The name of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign.
     */

    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the campaign.
     */

    public String getCampaignArn() {
        return this.campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withCampaignArn(String campaignArn) {
        setCampaignArn(campaignArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific version of the solution.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of a specific version of the solution.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific version of the solution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a specific version of the solution.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific version of the solution.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of a specific version of the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
        return this;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second.
     * </p>
     * 
     * @param minProvisionedTPS
     *        Specifies the requested minimum provisioned transactions (recommendations) per second.
     */

    public void setMinProvisionedTPS(Integer minProvisionedTPS) {
        this.minProvisionedTPS = minProvisionedTPS;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second.
     * </p>
     * 
     * @return Specifies the requested minimum provisioned transactions (recommendations) per second.
     */

    public Integer getMinProvisionedTPS() {
        return this.minProvisionedTPS;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second.
     * </p>
     * 
     * @param minProvisionedTPS
     *        Specifies the requested minimum provisioned transactions (recommendations) per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withMinProvisionedTPS(Integer minProvisionedTPS) {
        setMinProvisionedTPS(minProvisionedTPS);
        return this;
    }

    /**
     * <p>
     * The status of the campaign.
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the campaign.</p>
     *        <p>
     *        A campaign can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the campaign.
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the campaign.</p>
     *         <p>
     *         A campaign can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE PENDING &gt; DELETE IN_PROGRESS
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the campaign.
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the campaign.</p>
     *        <p>
     *        A campaign can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If a campaign fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a campaign fails, the reason behind the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a campaign fails, the reason behind the failure.
     * </p>
     * 
     * @return If a campaign fails, the reason behind the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a campaign fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a campaign fails, the reason behind the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the campaign was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the campaign was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the campaign was created.
     * </p>
     * 
     * @return The date and time (in Unix format) that the campaign was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the campaign was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the campaign was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the campaign was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix format) that the campaign was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the campaign was last updated.
     * </p>
     * 
     * @return The date and time (in Unix format) that the campaign was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the campaign was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix format) that the campaign was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * @param latestCampaignUpdate
     */

    public void setLatestCampaignUpdate(CampaignUpdateSummary latestCampaignUpdate) {
        this.latestCampaignUpdate = latestCampaignUpdate;
    }

    /**
     * @return
     */

    public CampaignUpdateSummary getLatestCampaignUpdate() {
        return this.latestCampaignUpdate;
    }

    /**
     * @param latestCampaignUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Campaign withLatestCampaignUpdate(CampaignUpdateSummary latestCampaignUpdate) {
        setLatestCampaignUpdate(latestCampaignUpdate);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCampaignArn() != null)
            sb.append("CampaignArn: ").append(getCampaignArn()).append(",");
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn()).append(",");
        if (getMinProvisionedTPS() != null)
            sb.append("MinProvisionedTPS: ").append(getMinProvisionedTPS()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getLatestCampaignUpdate() != null)
            sb.append("LatestCampaignUpdate: ").append(getLatestCampaignUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Campaign == false)
            return false;
        Campaign other = (Campaign) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null)
            return false;
        if (other.getCampaignArn() != null && other.getCampaignArn().equals(this.getCampaignArn()) == false)
            return false;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getMinProvisionedTPS() == null ^ this.getMinProvisionedTPS() == null)
            return false;
        if (other.getMinProvisionedTPS() != null && other.getMinProvisionedTPS().equals(this.getMinProvisionedTPS()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getLatestCampaignUpdate() == null ^ this.getLatestCampaignUpdate() == null)
            return false;
        if (other.getLatestCampaignUpdate() != null && other.getLatestCampaignUpdate().equals(this.getLatestCampaignUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCampaignArn() == null) ? 0 : getCampaignArn().hashCode());
        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getMinProvisionedTPS() == null) ? 0 : getMinProvisionedTPS().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getLatestCampaignUpdate() == null) ? 0 : getLatestCampaignUpdate().hashCode());
        return hashCode;
    }

    @Override
    public Campaign clone() {
        try {
            return (Campaign) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.CampaignMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
