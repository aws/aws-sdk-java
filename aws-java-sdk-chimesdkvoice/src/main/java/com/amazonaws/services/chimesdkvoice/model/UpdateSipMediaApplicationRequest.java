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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSipMediaApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String sipMediaApplicationId;

    private String name;

    private java.util.List<SipMediaApplicationEndpoint> endpoints;

    /**
     * @param sipMediaApplicationId
     */

    public void setSipMediaApplicationId(String sipMediaApplicationId) {
        this.sipMediaApplicationId = sipMediaApplicationId;
    }

    /**
     * @return
     */

    public String getSipMediaApplicationId() {
        return this.sipMediaApplicationId;
    }

    /**
     * @param sipMediaApplicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationRequest withSipMediaApplicationId(String sipMediaApplicationId) {
        setSipMediaApplicationId(sipMediaApplicationId);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<SipMediaApplicationEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * @param endpoints
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationRequest withEndpoints(SipMediaApplicationEndpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<SipMediaApplicationEndpoint>(endpoints.length));
        }
        for (SipMediaApplicationEndpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * @param endpoints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSipMediaApplicationRequest withEndpoints(java.util.Collection<SipMediaApplicationEndpoint> endpoints) {
        setEndpoints(endpoints);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSipMediaApplicationRequest == false)
            return false;
        UpdateSipMediaApplicationRequest other = (UpdateSipMediaApplicationRequest) obj;
        if (other.getSipMediaApplicationId() == null ^ this.getSipMediaApplicationId() == null)
            return false;
        if (other.getSipMediaApplicationId() != null && other.getSipMediaApplicationId().equals(this.getSipMediaApplicationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipMediaApplicationId() == null) ? 0 : getSipMediaApplicationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSipMediaApplicationRequest clone() {
        return (UpdateSipMediaApplicationRequest) super.clone();
    }

}
