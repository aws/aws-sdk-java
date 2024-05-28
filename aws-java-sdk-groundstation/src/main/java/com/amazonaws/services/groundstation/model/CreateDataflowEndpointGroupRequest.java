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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateDataflowEndpointGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataflowEndpointGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Endpoint details of each endpoint in the dataflow endpoint group.
     * </p>
     */
    private java.util.List<EndpointDetails> endpointDetails;
    /**
     * <p>
     * Tags of a dataflow endpoint group.
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

    public CreateDataflowEndpointGroupRequest withContactPostPassDurationSeconds(Integer contactPostPassDurationSeconds) {
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

    public CreateDataflowEndpointGroupRequest withContactPrePassDurationSeconds(Integer contactPrePassDurationSeconds) {
        setContactPrePassDurationSeconds(contactPrePassDurationSeconds);
        return this;
    }

    /**
     * <p>
     * Endpoint details of each endpoint in the dataflow endpoint group.
     * </p>
     * 
     * @return Endpoint details of each endpoint in the dataflow endpoint group.
     */

    public java.util.List<EndpointDetails> getEndpointDetails() {
        return endpointDetails;
    }

    /**
     * <p>
     * Endpoint details of each endpoint in the dataflow endpoint group.
     * </p>
     * 
     * @param endpointDetails
     *        Endpoint details of each endpoint in the dataflow endpoint group.
     */

    public void setEndpointDetails(java.util.Collection<EndpointDetails> endpointDetails) {
        if (endpointDetails == null) {
            this.endpointDetails = null;
            return;
        }

        this.endpointDetails = new java.util.ArrayList<EndpointDetails>(endpointDetails);
    }

    /**
     * <p>
     * Endpoint details of each endpoint in the dataflow endpoint group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointDetails(java.util.Collection)} or {@link #withEndpointDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param endpointDetails
     *        Endpoint details of each endpoint in the dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataflowEndpointGroupRequest withEndpointDetails(EndpointDetails... endpointDetails) {
        if (this.endpointDetails == null) {
            setEndpointDetails(new java.util.ArrayList<EndpointDetails>(endpointDetails.length));
        }
        for (EndpointDetails ele : endpointDetails) {
            this.endpointDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Endpoint details of each endpoint in the dataflow endpoint group.
     * </p>
     * 
     * @param endpointDetails
     *        Endpoint details of each endpoint in the dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataflowEndpointGroupRequest withEndpointDetails(java.util.Collection<EndpointDetails> endpointDetails) {
        setEndpointDetails(endpointDetails);
        return this;
    }

    /**
     * <p>
     * Tags of a dataflow endpoint group.
     * </p>
     * 
     * @return Tags of a dataflow endpoint group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags of a dataflow endpoint group.
     * </p>
     * 
     * @param tags
     *        Tags of a dataflow endpoint group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags of a dataflow endpoint group.
     * </p>
     * 
     * @param tags
     *        Tags of a dataflow endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataflowEndpointGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDataflowEndpointGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataflowEndpointGroupRequest addTagsEntry(String key, String value) {
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

    public CreateDataflowEndpointGroupRequest clearTagsEntries() {
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
        if (getEndpointDetails() != null)
            sb.append("EndpointDetails: ").append(getEndpointDetails()).append(",");
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

        if (obj instanceof CreateDataflowEndpointGroupRequest == false)
            return false;
        CreateDataflowEndpointGroupRequest other = (CreateDataflowEndpointGroupRequest) obj;
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
        if (other.getEndpointDetails() == null ^ this.getEndpointDetails() == null)
            return false;
        if (other.getEndpointDetails() != null && other.getEndpointDetails().equals(this.getEndpointDetails()) == false)
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
        hashCode = prime * hashCode + ((getEndpointDetails() == null) ? 0 : getEndpointDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataflowEndpointGroupRequest clone() {
        return (CreateDataflowEndpointGroupRequest) super.clone();
    }

}
