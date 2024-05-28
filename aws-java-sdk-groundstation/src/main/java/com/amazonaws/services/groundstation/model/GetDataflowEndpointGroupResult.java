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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetDataflowEndpointGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataflowEndpointGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint Group will be in a
     * <code>POSTPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the
     * Dataflow Endpoint Group enters and exits the <code>POSTPASS</code> state.
     * </p>
     */
    private Integer contactPostPassDurationSeconds;
    /**
     * <p>
     * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint Group will be in a
     * <code>PREPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the
     * Dataflow Endpoint Group enters and exits the <code>PREPASS</code> state.
     * </p>
     */
    private Integer contactPrePassDurationSeconds;
    /**
     * <p>
     * ARN of a dataflow endpoint group.
     * </p>
     */
    private String dataflowEndpointGroupArn;
    /**
     * <p>
     * UUID of a dataflow endpoint group.
     * </p>
     */
    private String dataflowEndpointGroupId;
    /**
     * <p>
     * Details of a dataflow endpoint.
     * </p>
     */
    private java.util.List<EndpointDetails> endpointsDetails;
    /**
     * <p>
     * Tags assigned to a dataflow endpoint group.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint Group will be in a
     * <code>POSTPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the
     * Dataflow Endpoint Group enters and exits the <code>POSTPASS</code> state.
     * </p>
     * 
     * @param contactPostPassDurationSeconds
     *        Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint Group will be
     *        in a <code>POSTPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be
     *        emitted when the Dataflow Endpoint Group enters and exits the <code>POSTPASS</code> state.
     */

    public void setContactPostPassDurationSeconds(Integer contactPostPassDurationSeconds) {
        this.contactPostPassDurationSeconds = contactPostPassDurationSeconds;
    }

    /**
     * <p>
     * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint Group will be in a
     * <code>POSTPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the
     * Dataflow Endpoint Group enters and exits the <code>POSTPASS</code> state.
     * </p>
     * 
     * @return Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint Group will be
     *         in a <code>POSTPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be
     *         emitted when the Dataflow Endpoint Group enters and exits the <code>POSTPASS</code> state.
     */

    public Integer getContactPostPassDurationSeconds() {
        return this.contactPostPassDurationSeconds;
    }

    /**
     * <p>
     * Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint Group will be in a
     * <code>POSTPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the
     * Dataflow Endpoint Group enters and exits the <code>POSTPASS</code> state.
     * </p>
     * 
     * @param contactPostPassDurationSeconds
     *        Amount of time, in seconds, after a contact ends that the Ground Station Dataflow Endpoint Group will be
     *        in a <code>POSTPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be
     *        emitted when the Dataflow Endpoint Group enters and exits the <code>POSTPASS</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult withContactPostPassDurationSeconds(Integer contactPostPassDurationSeconds) {
        setContactPostPassDurationSeconds(contactPostPassDurationSeconds);
        return this;
    }

    /**
     * <p>
     * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint Group will be in a
     * <code>PREPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the
     * Dataflow Endpoint Group enters and exits the <code>PREPASS</code> state.
     * </p>
     * 
     * @param contactPrePassDurationSeconds
     *        Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint Group will
     *        be in a <code>PREPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be
     *        emitted when the Dataflow Endpoint Group enters and exits the <code>PREPASS</code> state.
     */

    public void setContactPrePassDurationSeconds(Integer contactPrePassDurationSeconds) {
        this.contactPrePassDurationSeconds = contactPrePassDurationSeconds;
    }

    /**
     * <p>
     * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint Group will be in a
     * <code>PREPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the
     * Dataflow Endpoint Group enters and exits the <code>PREPASS</code> state.
     * </p>
     * 
     * @return Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint Group will
     *         be in a <code>PREPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be
     *         emitted when the Dataflow Endpoint Group enters and exits the <code>PREPASS</code> state.
     */

    public Integer getContactPrePassDurationSeconds() {
        return this.contactPrePassDurationSeconds;
    }

    /**
     * <p>
     * Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint Group will be in a
     * <code>PREPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be emitted when the
     * Dataflow Endpoint Group enters and exits the <code>PREPASS</code> state.
     * </p>
     * 
     * @param contactPrePassDurationSeconds
     *        Amount of time, in seconds, before a contact starts that the Ground Station Dataflow Endpoint Group will
     *        be in a <code>PREPASS</code> state. A Ground Station Dataflow Endpoint Group State Change event will be
     *        emitted when the Dataflow Endpoint Group enters and exits the <code>PREPASS</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult withContactPrePassDurationSeconds(Integer contactPrePassDurationSeconds) {
        setContactPrePassDurationSeconds(contactPrePassDurationSeconds);
        return this;
    }

    /**
     * <p>
     * ARN of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupArn
     *        ARN of a dataflow endpoint group.
     */

    public void setDataflowEndpointGroupArn(String dataflowEndpointGroupArn) {
        this.dataflowEndpointGroupArn = dataflowEndpointGroupArn;
    }

    /**
     * <p>
     * ARN of a dataflow endpoint group.
     * </p>
     * 
     * @return ARN of a dataflow endpoint group.
     */

    public String getDataflowEndpointGroupArn() {
        return this.dataflowEndpointGroupArn;
    }

    /**
     * <p>
     * ARN of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupArn
     *        ARN of a dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult withDataflowEndpointGroupArn(String dataflowEndpointGroupArn) {
        setDataflowEndpointGroupArn(dataflowEndpointGroupArn);
        return this;
    }

    /**
     * <p>
     * UUID of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupId
     *        UUID of a dataflow endpoint group.
     */

    public void setDataflowEndpointGroupId(String dataflowEndpointGroupId) {
        this.dataflowEndpointGroupId = dataflowEndpointGroupId;
    }

    /**
     * <p>
     * UUID of a dataflow endpoint group.
     * </p>
     * 
     * @return UUID of a dataflow endpoint group.
     */

    public String getDataflowEndpointGroupId() {
        return this.dataflowEndpointGroupId;
    }

    /**
     * <p>
     * UUID of a dataflow endpoint group.
     * </p>
     * 
     * @param dataflowEndpointGroupId
     *        UUID of a dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult withDataflowEndpointGroupId(String dataflowEndpointGroupId) {
        setDataflowEndpointGroupId(dataflowEndpointGroupId);
        return this;
    }

    /**
     * <p>
     * Details of a dataflow endpoint.
     * </p>
     * 
     * @return Details of a dataflow endpoint.
     */

    public java.util.List<EndpointDetails> getEndpointsDetails() {
        return endpointsDetails;
    }

    /**
     * <p>
     * Details of a dataflow endpoint.
     * </p>
     * 
     * @param endpointsDetails
     *        Details of a dataflow endpoint.
     */

    public void setEndpointsDetails(java.util.Collection<EndpointDetails> endpointsDetails) {
        if (endpointsDetails == null) {
            this.endpointsDetails = null;
            return;
        }

        this.endpointsDetails = new java.util.ArrayList<EndpointDetails>(endpointsDetails);
    }

    /**
     * <p>
     * Details of a dataflow endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointsDetails(java.util.Collection)} or {@link #withEndpointsDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param endpointsDetails
     *        Details of a dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult withEndpointsDetails(EndpointDetails... endpointsDetails) {
        if (this.endpointsDetails == null) {
            setEndpointsDetails(new java.util.ArrayList<EndpointDetails>(endpointsDetails.length));
        }
        for (EndpointDetails ele : endpointsDetails) {
            this.endpointsDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of a dataflow endpoint.
     * </p>
     * 
     * @param endpointsDetails
     *        Details of a dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult withEndpointsDetails(java.util.Collection<EndpointDetails> endpointsDetails) {
        setEndpointsDetails(endpointsDetails);
        return this;
    }

    /**
     * <p>
     * Tags assigned to a dataflow endpoint group.
     * </p>
     * 
     * @return Tags assigned to a dataflow endpoint group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to a dataflow endpoint group.
     * </p>
     * 
     * @param tags
     *        Tags assigned to a dataflow endpoint group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to a dataflow endpoint group.
     * </p>
     * 
     * @param tags
     *        Tags assigned to a dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetDataflowEndpointGroupResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowEndpointGroupResult clearTagsEntries() {
        this.tags = null;
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
        if (getContactPostPassDurationSeconds() != null)
            sb.append("ContactPostPassDurationSeconds: ").append(getContactPostPassDurationSeconds()).append(",");
        if (getContactPrePassDurationSeconds() != null)
            sb.append("ContactPrePassDurationSeconds: ").append(getContactPrePassDurationSeconds()).append(",");
        if (getDataflowEndpointGroupArn() != null)
            sb.append("DataflowEndpointGroupArn: ").append(getDataflowEndpointGroupArn()).append(",");
        if (getDataflowEndpointGroupId() != null)
            sb.append("DataflowEndpointGroupId: ").append(getDataflowEndpointGroupId()).append(",");
        if (getEndpointsDetails() != null)
            sb.append("EndpointsDetails: ").append(getEndpointsDetails()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataflowEndpointGroupResult == false)
            return false;
        GetDataflowEndpointGroupResult other = (GetDataflowEndpointGroupResult) obj;
        if (other.getContactPostPassDurationSeconds() == null ^ this.getContactPostPassDurationSeconds() == null)
            return false;
        if (other.getContactPostPassDurationSeconds() != null
                && other.getContactPostPassDurationSeconds().equals(this.getContactPostPassDurationSeconds()) == false)
            return false;
        if (other.getContactPrePassDurationSeconds() == null ^ this.getContactPrePassDurationSeconds() == null)
            return false;
        if (other.getContactPrePassDurationSeconds() != null
                && other.getContactPrePassDurationSeconds().equals(this.getContactPrePassDurationSeconds()) == false)
            return false;
        if (other.getDataflowEndpointGroupArn() == null ^ this.getDataflowEndpointGroupArn() == null)
            return false;
        if (other.getDataflowEndpointGroupArn() != null && other.getDataflowEndpointGroupArn().equals(this.getDataflowEndpointGroupArn()) == false)
            return false;
        if (other.getDataflowEndpointGroupId() == null ^ this.getDataflowEndpointGroupId() == null)
            return false;
        if (other.getDataflowEndpointGroupId() != null && other.getDataflowEndpointGroupId().equals(this.getDataflowEndpointGroupId()) == false)
            return false;
        if (other.getEndpointsDetails() == null ^ this.getEndpointsDetails() == null)
            return false;
        if (other.getEndpointsDetails() != null && other.getEndpointsDetails().equals(this.getEndpointsDetails()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactPostPassDurationSeconds() == null) ? 0 : getContactPostPassDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getContactPrePassDurationSeconds() == null) ? 0 : getContactPrePassDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getDataflowEndpointGroupArn() == null) ? 0 : getDataflowEndpointGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDataflowEndpointGroupId() == null) ? 0 : getDataflowEndpointGroupId().hashCode());
        hashCode = prime * hashCode + ((getEndpointsDetails() == null) ? 0 : getEndpointsDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetDataflowEndpointGroupResult clone() {
        try {
            return (GetDataflowEndpointGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
