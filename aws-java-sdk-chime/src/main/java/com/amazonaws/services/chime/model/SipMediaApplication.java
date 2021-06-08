/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the SIP media application, including name and endpoints. An AWS account can have multiple SIP media
 * applications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SipMediaApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SipMediaApplication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     */
    private String sipMediaApplicationId;
    /**
     * <p>
     * The AWS Region in which the SIP media application is created.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The name of the SIP media application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is permitted.
     * </p>
     */
    private java.util.List<SipMediaApplicationEndpoint> endpoints;
    /**
     * <p>
     * The SIP media application creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The SIP media application updated timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @param sipMediaApplicationId
     *        The SIP media application ID.
     */

    public void setSipMediaApplicationId(String sipMediaApplicationId) {
        this.sipMediaApplicationId = sipMediaApplicationId;
    }

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @return The SIP media application ID.
     */

    public String getSipMediaApplicationId() {
        return this.sipMediaApplicationId;
    }

    /**
     * <p>
     * The SIP media application ID.
     * </p>
     * 
     * @param sipMediaApplicationId
     *        The SIP media application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplication withSipMediaApplicationId(String sipMediaApplicationId) {
        setSipMediaApplicationId(sipMediaApplicationId);
        return this;
    }

    /**
     * <p>
     * The AWS Region in which the SIP media application is created.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region in which the SIP media application is created.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region in which the SIP media application is created.
     * </p>
     * 
     * @return The AWS Region in which the SIP media application is created.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The AWS Region in which the SIP media application is created.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region in which the SIP media application is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplication withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The name of the SIP media application.
     * </p>
     * 
     * @param name
     *        The name of the SIP media application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SIP media application.
     * </p>
     * 
     * @return The name of the SIP media application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SIP media application.
     * </p>
     * 
     * @param name
     *        The name of the SIP media application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplication withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is permitted.
     * </p>
     * 
     * @return List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is
     *         permitted.
     */

    public java.util.List<SipMediaApplicationEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is permitted.
     * </p>
     * 
     * @param endpoints
     *        List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is
     *        permitted.
     */

    public void setEndpoints(java.util.Collection<SipMediaApplicationEndpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<SipMediaApplicationEndpoint>(endpoints);
    }

    /**
     * <p>
     * List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is permitted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is
     *        permitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplication withEndpoints(SipMediaApplicationEndpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<SipMediaApplicationEndpoint>(endpoints.length));
        }
        for (SipMediaApplicationEndpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is permitted.
     * </p>
     * 
     * @param endpoints
     *        List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is
     *        permitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplication withEndpoints(java.util.Collection<SipMediaApplicationEndpoint> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * <p>
     * The SIP media application creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The SIP media application creation timestamp, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The SIP media application creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The SIP media application creation timestamp, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The SIP media application creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The SIP media application creation timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplication withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The SIP media application updated timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The SIP media application updated timestamp, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The SIP media application updated timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The SIP media application updated timestamp, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The SIP media application updated timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The SIP media application updated timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplication withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getSipMediaApplicationId() != null)
            sb.append("SipMediaApplicationId: ").append(getSipMediaApplicationId()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SipMediaApplication == false)
            return false;
        SipMediaApplication other = (SipMediaApplication) obj;
        if (other.getSipMediaApplicationId() == null ^ this.getSipMediaApplicationId() == null)
            return false;
        if (other.getSipMediaApplicationId() != null && other.getSipMediaApplicationId().equals(this.getSipMediaApplicationId()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipMediaApplicationId() == null) ? 0 : getSipMediaApplicationId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public SipMediaApplication clone() {
        try {
            return (SipMediaApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.SipMediaApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
