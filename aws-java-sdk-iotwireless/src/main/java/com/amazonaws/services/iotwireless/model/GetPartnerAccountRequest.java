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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPartnerAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPartnerAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The partner account ID to disassociate from the AWS account.
     * </p>
     */
    private String partnerAccountId;
    /**
     * <p>
     * The partner type.
     * </p>
     */
    private String partnerType;

    /**
     * <p>
     * The partner account ID to disassociate from the AWS account.
     * </p>
     * 
     * @param partnerAccountId
     *        The partner account ID to disassociate from the AWS account.
     */

    public void setPartnerAccountId(String partnerAccountId) {
        this.partnerAccountId = partnerAccountId;
    }

    /**
     * <p>
     * The partner account ID to disassociate from the AWS account.
     * </p>
     * 
     * @return The partner account ID to disassociate from the AWS account.
     */

    public String getPartnerAccountId() {
        return this.partnerAccountId;
    }

    /**
     * <p>
     * The partner account ID to disassociate from the AWS account.
     * </p>
     * 
     * @param partnerAccountId
     *        The partner account ID to disassociate from the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartnerAccountRequest withPartnerAccountId(String partnerAccountId) {
        setPartnerAccountId(partnerAccountId);
        return this;
    }

    /**
     * <p>
     * The partner type.
     * </p>
     * 
     * @param partnerType
     *        The partner type.
     * @see PartnerType
     */

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    /**
     * <p>
     * The partner type.
     * </p>
     * 
     * @return The partner type.
     * @see PartnerType
     */

    public String getPartnerType() {
        return this.partnerType;
    }

    /**
     * <p>
     * The partner type.
     * </p>
     * 
     * @param partnerType
     *        The partner type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartnerType
     */

    public GetPartnerAccountRequest withPartnerType(String partnerType) {
        setPartnerType(partnerType);
        return this;
    }

    /**
     * <p>
     * The partner type.
     * </p>
     * 
     * @param partnerType
     *        The partner type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartnerType
     */

    public GetPartnerAccountRequest withPartnerType(PartnerType partnerType) {
        this.partnerType = partnerType.toString();
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
        if (getPartnerAccountId() != null)
            sb.append("PartnerAccountId: ").append(getPartnerAccountId()).append(",");
        if (getPartnerType() != null)
            sb.append("PartnerType: ").append(getPartnerType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPartnerAccountRequest == false)
            return false;
        GetPartnerAccountRequest other = (GetPartnerAccountRequest) obj;
        if (other.getPartnerAccountId() == null ^ this.getPartnerAccountId() == null)
            return false;
        if (other.getPartnerAccountId() != null && other.getPartnerAccountId().equals(this.getPartnerAccountId()) == false)
            return false;
        if (other.getPartnerType() == null ^ this.getPartnerType() == null)
            return false;
        if (other.getPartnerType() != null && other.getPartnerType().equals(this.getPartnerType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartnerAccountId() == null) ? 0 : getPartnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getPartnerType() == null) ? 0 : getPartnerType().hashCode());
        return hashCode;
    }

    @Override
    public GetPartnerAccountRequest clone() {
        return (GetPartnerAccountRequest) super.clone();
    }

}
