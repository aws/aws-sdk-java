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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateCampaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCampaignRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the campaign to update.
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
     * A list of vehicle attributes to associate with a signal.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     */
    private java.util.List<String> dataExtraDimensions;
    /**
     * <p>
     * Specifies how to update a campaign. The action can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPEND</code> - To suspend collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESUME</code> - To resume collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - To update a campaign.
     * </p>
     * </li>
     * </ul>
     */
    private String action;

    /**
     * <p>
     * The name of the campaign to update.
     * </p>
     * 
     * @param name
     *        The name of the campaign to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the campaign to update.
     * </p>
     * 
     * @return The name of the campaign to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the campaign to update.
     * </p>
     * 
     * @param name
     *        The name of the campaign to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withName(String name) {
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

    public UpdateCampaignRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of vehicle attributes to associate with a signal.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     * 
     * @return A list of vehicle attributes to associate with a signal. </p>
     *         <p>
     *         Default: An empty array
     */

    public java.util.List<String> getDataExtraDimensions() {
        return dataExtraDimensions;
    }

    /**
     * <p>
     * A list of vehicle attributes to associate with a signal.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     * 
     * @param dataExtraDimensions
     *        A list of vehicle attributes to associate with a signal. </p>
     *        <p>
     *        Default: An empty array
     */

    public void setDataExtraDimensions(java.util.Collection<String> dataExtraDimensions) {
        if (dataExtraDimensions == null) {
            this.dataExtraDimensions = null;
            return;
        }

        this.dataExtraDimensions = new java.util.ArrayList<String>(dataExtraDimensions);
    }

    /**
     * <p>
     * A list of vehicle attributes to associate with a signal.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataExtraDimensions(java.util.Collection)} or {@link #withDataExtraDimensions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dataExtraDimensions
     *        A list of vehicle attributes to associate with a signal. </p>
     *        <p>
     *        Default: An empty array
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withDataExtraDimensions(String... dataExtraDimensions) {
        if (this.dataExtraDimensions == null) {
            setDataExtraDimensions(new java.util.ArrayList<String>(dataExtraDimensions.length));
        }
        for (String ele : dataExtraDimensions) {
            this.dataExtraDimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of vehicle attributes to associate with a signal.
     * </p>
     * <p>
     * Default: An empty array
     * </p>
     * 
     * @param dataExtraDimensions
     *        A list of vehicle attributes to associate with a signal. </p>
     *        <p>
     *        Default: An empty array
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withDataExtraDimensions(java.util.Collection<String> dataExtraDimensions) {
        setDataExtraDimensions(dataExtraDimensions);
        return this;
    }

    /**
     * <p>
     * Specifies how to update a campaign. The action can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPEND</code> - To suspend collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESUME</code> - To resume collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - To update a campaign.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies how to update a campaign. The action can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPEND</code> - To suspend collecting signal data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESUME</code> - To resume collecting signal data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE</code> - To update a campaign.
     *        </p>
     *        </li>
     * @see UpdateCampaignAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies how to update a campaign. The action can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPEND</code> - To suspend collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESUME</code> - To resume collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - To update a campaign.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies how to update a campaign. The action can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUSPEND</code> - To suspend collecting signal data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESUME</code> - To resume collecting signal data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE</code> - To update a campaign.
     *         </p>
     *         </li>
     * @see UpdateCampaignAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies how to update a campaign. The action can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPEND</code> - To suspend collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESUME</code> - To resume collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - To update a campaign.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies how to update a campaign. The action can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPEND</code> - To suspend collecting signal data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESUME</code> - To resume collecting signal data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE</code> - To update a campaign.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateCampaignAction
     */

    public UpdateCampaignRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies how to update a campaign. The action can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPEND</code> - To suspend collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESUME</code> - To resume collecting signal data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE</code> - To update a campaign.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies how to update a campaign. The action can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVE</code> - To approve delivering a data collection scheme to vehicles.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPEND</code> - To suspend collecting signal data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESUME</code> - To resume collecting signal data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE</code> - To update a campaign.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateCampaignAction
     */

    public UpdateCampaignRequest withAction(UpdateCampaignAction action) {
        this.action = action.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDataExtraDimensions() != null)
            sb.append("DataExtraDimensions: ").append(getDataExtraDimensions()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCampaignRequest == false)
            return false;
        UpdateCampaignRequest other = (UpdateCampaignRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDataExtraDimensions() == null ^ this.getDataExtraDimensions() == null)
            return false;
        if (other.getDataExtraDimensions() != null && other.getDataExtraDimensions().equals(this.getDataExtraDimensions()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDataExtraDimensions() == null) ? 0 : getDataExtraDimensions().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCampaignRequest clone() {
        return (UpdateCampaignRequest) super.clone();
    }

}
