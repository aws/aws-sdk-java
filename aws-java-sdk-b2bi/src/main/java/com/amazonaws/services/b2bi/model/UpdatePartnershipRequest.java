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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdatePartnership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePartnershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique, system-generated identifier for a partnership.
     * </p>
     */
    private String partnershipId;
    /**
     * <p>
     * The name of the partnership, used to identify it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * List of the capabilities associated with this partnership.
     * </p>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * Specifies the unique, system-generated identifier for a partnership.
     * </p>
     * 
     * @param partnershipId
     *        Specifies the unique, system-generated identifier for a partnership.
     */

    public void setPartnershipId(String partnershipId) {
        this.partnershipId = partnershipId;
    }

    /**
     * <p>
     * Specifies the unique, system-generated identifier for a partnership.
     * </p>
     * 
     * @return Specifies the unique, system-generated identifier for a partnership.
     */

    public String getPartnershipId() {
        return this.partnershipId;
    }

    /**
     * <p>
     * Specifies the unique, system-generated identifier for a partnership.
     * </p>
     * 
     * @param partnershipId
     *        Specifies the unique, system-generated identifier for a partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipRequest withPartnershipId(String partnershipId) {
        setPartnershipId(partnershipId);
        return this;
    }

    /**
     * <p>
     * The name of the partnership, used to identify it.
     * </p>
     * 
     * @param name
     *        The name of the partnership, used to identify it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the partnership, used to identify it.
     * </p>
     * 
     * @return The name of the partnership, used to identify it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the partnership, used to identify it.
     * </p>
     * 
     * @param name
     *        The name of the partnership, used to identify it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * List of the capabilities associated with this partnership.
     * </p>
     * 
     * @return List of the capabilities associated with this partnership.
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * List of the capabilities associated with this partnership.
     * </p>
     * 
     * @param capabilities
     *        List of the capabilities associated with this partnership.
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * List of the capabilities associated with this partnership.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        List of the capabilities associated with this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the capabilities associated with this partnership.
     * </p>
     * 
     * @param capabilities
     *        List of the capabilities associated with this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
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
        if (getPartnershipId() != null)
            sb.append("PartnershipId: ").append(getPartnershipId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePartnershipRequest == false)
            return false;
        UpdatePartnershipRequest other = (UpdatePartnershipRequest) obj;
        if (other.getPartnershipId() == null ^ this.getPartnershipId() == null)
            return false;
        if (other.getPartnershipId() != null && other.getPartnershipId().equals(this.getPartnershipId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartnershipId() == null) ? 0 : getPartnershipId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePartnershipRequest clone() {
        return (UpdatePartnershipRequest) super.clone();
    }

}
