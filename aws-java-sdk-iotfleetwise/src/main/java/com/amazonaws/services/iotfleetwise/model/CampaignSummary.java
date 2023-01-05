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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a campaign.
 * </p>
 * <p>
 * You can use the API operation to return this information about multiple created campaigns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CampaignSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a campaign.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of a campaign.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the campaign.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the signal catalog associated with the campaign.
     * </p>
     */
    private String signalCatalogArn;
    /**
     * <p>
     * The ARN of a vehicle or fleet to which the campaign is deployed.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The state of a campaign. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the <code>WAITING_FOR_APPROVAL</code>
     * state. To allow Amazon Web Services IoT FleetWise to deploy the campaign to the target vehicle or fleet, use the
     * API operation to approve the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The campaign is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time the campaign was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the campaign was modified.
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a campaign.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of a campaign.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a campaign.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a campaign.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a campaign.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of a campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of a campaign.
     * </p>
     * 
     * @param name
     *        The name of a campaign.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a campaign.
     * </p>
     * 
     * @return The name of a campaign.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a campaign.
     * </p>
     * 
     * @param name
     *        The name of a campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the campaign.
     * </p>
     * 
     * @param description
     *        The description of the campaign.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the campaign.
     * </p>
     * 
     * @return The description of the campaign.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the campaign.
     * </p>
     * 
     * @param description
     *        The description of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the signal catalog associated with the campaign.
     * </p>
     * 
     * @param signalCatalogArn
     *        The ARN of the signal catalog associated with the campaign.
     */

    public void setSignalCatalogArn(String signalCatalogArn) {
        this.signalCatalogArn = signalCatalogArn;
    }

    /**
     * <p>
     * The ARN of the signal catalog associated with the campaign.
     * </p>
     * 
     * @return The ARN of the signal catalog associated with the campaign.
     */

    public String getSignalCatalogArn() {
        return this.signalCatalogArn;
    }

    /**
     * <p>
     * The ARN of the signal catalog associated with the campaign.
     * </p>
     * 
     * @param signalCatalogArn
     *        The ARN of the signal catalog associated with the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSummary withSignalCatalogArn(String signalCatalogArn) {
        setSignalCatalogArn(signalCatalogArn);
        return this;
    }

    /**
     * <p>
     * The ARN of a vehicle or fleet to which the campaign is deployed.
     * </p>
     * 
     * @param targetArn
     *        The ARN of a vehicle or fleet to which the campaign is deployed.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of a vehicle or fleet to which the campaign is deployed.
     * </p>
     * 
     * @return The ARN of a vehicle or fleet to which the campaign is deployed.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of a vehicle or fleet to which the campaign is deployed.
     * </p>
     * 
     * @param targetArn
     *        The ARN of a vehicle or fleet to which the campaign is deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSummary withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The state of a campaign. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the <code>WAITING_FOR_APPROVAL</code>
     * state. To allow Amazon Web Services IoT FleetWise to deploy the campaign to the target vehicle or fleet, use the
     * API operation to approve the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The campaign is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of a campaign. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the
     *        campaign.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the
     *        <code>WAITING_FOR_APPROVAL</code> state. To allow Amazon Web Services IoT FleetWise to deploy the campaign
     *        to the target vehicle or fleet, use the API operation to approve the campaign.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The campaign is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     *        </p>
     *        </li>
     * @see CampaignStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of a campaign. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the <code>WAITING_FOR_APPROVAL</code>
     * state. To allow Amazon Web Services IoT FleetWise to deploy the campaign to the target vehicle or fleet, use the
     * API operation to approve the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The campaign is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of a campaign. The status can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the
     *         campaign.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the
     *         <code>WAITING_FOR_APPROVAL</code> state. To allow Amazon Web Services IoT FleetWise to deploy the
     *         campaign to the target vehicle or fleet, use the API operation to approve the campaign.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> - The campaign is active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     *         </p>
     *         </li>
     * @see CampaignStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of a campaign. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the <code>WAITING_FOR_APPROVAL</code>
     * state. To allow Amazon Web Services IoT FleetWise to deploy the campaign to the target vehicle or fleet, use the
     * API operation to approve the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The campaign is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of a campaign. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the
     *        campaign.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the
     *        <code>WAITING_FOR_APPROVAL</code> state. To allow Amazon Web Services IoT FleetWise to deploy the campaign
     *        to the target vehicle or fleet, use the API operation to approve the campaign.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The campaign is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CampaignStatus
     */

    public CampaignSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of a campaign. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the <code>WAITING_FOR_APPROVAL</code>
     * state. To allow Amazon Web Services IoT FleetWise to deploy the campaign to the target vehicle or fleet, use the
     * API operation to approve the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The campaign is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of a campaign. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon Web Services IoT FleetWise is processing your request to create the
     *        campaign.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WAITING_FOR_APPROVAL</code> - After a campaign is created, it enters the
     *        <code>WAITING_FOR_APPROVAL</code> state. To allow Amazon Web Services IoT FleetWise to deploy the campaign
     *        to the target vehicle or fleet, use the API operation to approve the campaign.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The campaign is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code> - The campaign is suspended. To resume the campaign, use the API operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CampaignStatus
     */

    public CampaignSummary withStatus(CampaignStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the campaign was created.
     * </p>
     * 
     * @param creationTime
     *        The time the campaign was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the campaign was created.
     * </p>
     * 
     * @return The time the campaign was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the campaign was created.
     * </p>
     * 
     * @param creationTime
     *        The time the campaign was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the campaign was modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The last time the campaign was modified.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The last time the campaign was modified.
     * </p>
     * 
     * @return The last time the campaign was modified.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The last time the campaign was modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The last time the campaign was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSignalCatalogArn() != null)
            sb.append("SignalCatalogArn: ").append(getSignalCatalogArn()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignSummary == false)
            return false;
        CampaignSummary other = (CampaignSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSignalCatalogArn() == null ^ this.getSignalCatalogArn() == null)
            return false;
        if (other.getSignalCatalogArn() != null && other.getSignalCatalogArn().equals(this.getSignalCatalogArn()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSignalCatalogArn() == null) ? 0 : getSignalCatalogArn().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public CampaignSummary clone() {
        try {
            return (CampaignSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.CampaignSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
