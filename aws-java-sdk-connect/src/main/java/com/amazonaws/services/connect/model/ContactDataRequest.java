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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Request object with information to create a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ContactDataRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactDataRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Endpoint associated with the Amazon Connect instance from which outbound contact will be initiated for the
     * campaign.
     * </p>
     */
    private Endpoint systemEndpoint;
    /**
     * <p>
     * Endpoint of the customer for which contact will be initiated.
     * </p>
     */
    private Endpoint customerEndpoint;
    /**
     * <p>
     * Identifier to uniquely identify individual requests in the batch.
     * </p>
     */
    private String requestIdentifier;
    /**
     * <p>
     * The identifier of the queue associated with the Amazon Connect instance in which contacts that are created will
     * be queued.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * List of attributes to be stored in a contact.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * Structure to store information associated with a campaign.
     * </p>
     */
    private Campaign campaign;

    /**
     * <p>
     * Endpoint associated with the Amazon Connect instance from which outbound contact will be initiated for the
     * campaign.
     * </p>
     * 
     * @param systemEndpoint
     *        Endpoint associated with the Amazon Connect instance from which outbound contact will be initiated for the
     *        campaign.
     */

    public void setSystemEndpoint(Endpoint systemEndpoint) {
        this.systemEndpoint = systemEndpoint;
    }

    /**
     * <p>
     * Endpoint associated with the Amazon Connect instance from which outbound contact will be initiated for the
     * campaign.
     * </p>
     * 
     * @return Endpoint associated with the Amazon Connect instance from which outbound contact will be initiated for
     *         the campaign.
     */

    public Endpoint getSystemEndpoint() {
        return this.systemEndpoint;
    }

    /**
     * <p>
     * Endpoint associated with the Amazon Connect instance from which outbound contact will be initiated for the
     * campaign.
     * </p>
     * 
     * @param systemEndpoint
     *        Endpoint associated with the Amazon Connect instance from which outbound contact will be initiated for the
     *        campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDataRequest withSystemEndpoint(Endpoint systemEndpoint) {
        setSystemEndpoint(systemEndpoint);
        return this;
    }

    /**
     * <p>
     * Endpoint of the customer for which contact will be initiated.
     * </p>
     * 
     * @param customerEndpoint
     *        Endpoint of the customer for which contact will be initiated.
     */

    public void setCustomerEndpoint(Endpoint customerEndpoint) {
        this.customerEndpoint = customerEndpoint;
    }

    /**
     * <p>
     * Endpoint of the customer for which contact will be initiated.
     * </p>
     * 
     * @return Endpoint of the customer for which contact will be initiated.
     */

    public Endpoint getCustomerEndpoint() {
        return this.customerEndpoint;
    }

    /**
     * <p>
     * Endpoint of the customer for which contact will be initiated.
     * </p>
     * 
     * @param customerEndpoint
     *        Endpoint of the customer for which contact will be initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDataRequest withCustomerEndpoint(Endpoint customerEndpoint) {
        setCustomerEndpoint(customerEndpoint);
        return this;
    }

    /**
     * <p>
     * Identifier to uniquely identify individual requests in the batch.
     * </p>
     * 
     * @param requestIdentifier
     *        Identifier to uniquely identify individual requests in the batch.
     */

    public void setRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    /**
     * <p>
     * Identifier to uniquely identify individual requests in the batch.
     * </p>
     * 
     * @return Identifier to uniquely identify individual requests in the batch.
     */

    public String getRequestIdentifier() {
        return this.requestIdentifier;
    }

    /**
     * <p>
     * Identifier to uniquely identify individual requests in the batch.
     * </p>
     * 
     * @param requestIdentifier
     *        Identifier to uniquely identify individual requests in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDataRequest withRequestIdentifier(String requestIdentifier) {
        setRequestIdentifier(requestIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the queue associated with the Amazon Connect instance in which contacts that are created will
     * be queued.
     * </p>
     * 
     * @param queueId
     *        The identifier of the queue associated with the Amazon Connect instance in which contacts that are created
     *        will be queued.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier of the queue associated with the Amazon Connect instance in which contacts that are created will
     * be queued.
     * </p>
     * 
     * @return The identifier of the queue associated with the Amazon Connect instance in which contacts that are
     *         created will be queued.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The identifier of the queue associated with the Amazon Connect instance in which contacts that are created will
     * be queued.
     * </p>
     * 
     * @param queueId
     *        The identifier of the queue associated with the Amazon Connect instance in which contacts that are created
     *        will be queued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDataRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * List of attributes to be stored in a contact.
     * </p>
     * 
     * @return List of attributes to be stored in a contact.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * List of attributes to be stored in a contact.
     * </p>
     * 
     * @param attributes
     *        List of attributes to be stored in a contact.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * List of attributes to be stored in a contact.
     * </p>
     * 
     * @param attributes
     *        List of attributes to be stored in a contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDataRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see ContactDataRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContactDataRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDataRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Structure to store information associated with a campaign.
     * </p>
     * 
     * @param campaign
     *        Structure to store information associated with a campaign.
     */

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    /**
     * <p>
     * Structure to store information associated with a campaign.
     * </p>
     * 
     * @return Structure to store information associated with a campaign.
     */

    public Campaign getCampaign() {
        return this.campaign;
    }

    /**
     * <p>
     * Structure to store information associated with a campaign.
     * </p>
     * 
     * @param campaign
     *        Structure to store information associated with a campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDataRequest withCampaign(Campaign campaign) {
        setCampaign(campaign);
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
        if (getSystemEndpoint() != null)
            sb.append("SystemEndpoint: ").append(getSystemEndpoint()).append(",");
        if (getCustomerEndpoint() != null)
            sb.append("CustomerEndpoint: ").append(getCustomerEndpoint()).append(",");
        if (getRequestIdentifier() != null)
            sb.append("RequestIdentifier: ").append(getRequestIdentifier()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCampaign() != null)
            sb.append("Campaign: ").append(getCampaign());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactDataRequest == false)
            return false;
        ContactDataRequest other = (ContactDataRequest) obj;
        if (other.getSystemEndpoint() == null ^ this.getSystemEndpoint() == null)
            return false;
        if (other.getSystemEndpoint() != null && other.getSystemEndpoint().equals(this.getSystemEndpoint()) == false)
            return false;
        if (other.getCustomerEndpoint() == null ^ this.getCustomerEndpoint() == null)
            return false;
        if (other.getCustomerEndpoint() != null && other.getCustomerEndpoint().equals(this.getCustomerEndpoint()) == false)
            return false;
        if (other.getRequestIdentifier() == null ^ this.getRequestIdentifier() == null)
            return false;
        if (other.getRequestIdentifier() != null && other.getRequestIdentifier().equals(this.getRequestIdentifier()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCampaign() == null ^ this.getCampaign() == null)
            return false;
        if (other.getCampaign() != null && other.getCampaign().equals(this.getCampaign()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSystemEndpoint() == null) ? 0 : getSystemEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCustomerEndpoint() == null) ? 0 : getCustomerEndpoint().hashCode());
        hashCode = prime * hashCode + ((getRequestIdentifier() == null) ? 0 : getRequestIdentifier().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCampaign() == null) ? 0 : getCampaign().hashCode());
        return hashCode;
    }

    @Override
    public ContactDataRequest clone() {
        try {
            return (ContactDataRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ContactDataRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
