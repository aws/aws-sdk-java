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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeletePartnership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePartnershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique, system-generated identifier for a partnership.
     * </p>
     */
    private String partnershipId;

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

    public DeletePartnershipRequest withPartnershipId(String partnershipId) {
        setPartnershipId(partnershipId);
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
            sb.append("PartnershipId: ").append(getPartnershipId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePartnershipRequest == false)
            return false;
        DeletePartnershipRequest other = (DeletePartnershipRequest) obj;
        if (other.getPartnershipId() == null ^ this.getPartnershipId() == null)
            return false;
        if (other.getPartnershipId() != null && other.getPartnershipId().equals(this.getPartnershipId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartnershipId() == null) ? 0 : getPartnershipId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePartnershipRequest clone() {
        return (DeletePartnershipRequest) super.clone();
    }

}
