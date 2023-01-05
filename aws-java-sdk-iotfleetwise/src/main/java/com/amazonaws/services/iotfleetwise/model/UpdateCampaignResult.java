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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateCampaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCampaignResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the updated campaign.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of a campaign. The status can be one of:
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
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the campaign.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the campaign.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the updated campaign.
     * </p>
     * 
     * @param name
     *        The name of the updated campaign.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the updated campaign.
     * </p>
     * 
     * @return The name of the updated campaign.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the updated campaign.
     * </p>
     * 
     * @param name
     *        The name of the updated campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of a campaign. The status can be one of:
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
     *        The state of a campaign. The status can be one of:</p>
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
     * The state of a campaign. The status can be one of:
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
     * @return The state of a campaign. The status can be one of:</p>
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
     * The state of a campaign. The status can be one of:
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
     *        The state of a campaign. The status can be one of:</p>
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

    public UpdateCampaignResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of a campaign. The status can be one of:
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
     *        The state of a campaign. The status can be one of:</p>
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

    public UpdateCampaignResult withStatus(CampaignStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCampaignResult == false)
            return false;
        UpdateCampaignResult other = (UpdateCampaignResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCampaignResult clone() {
        try {
            return (UpdateCampaignResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
