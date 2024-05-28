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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the proposal received from the proposer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/ProposalSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProposalSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the offer in AWS Marketplace.
     * </p>
     */
    private String offerId;
    /**
     * <p>
     * The list of resources involved in the agreement.
     * </p>
     */
    private java.util.List<Resource> resources;

    /**
     * <p>
     * The unique identifier of the offer in AWS Marketplace.
     * </p>
     * 
     * @param offerId
     *        The unique identifier of the offer in AWS Marketplace.
     */

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    /**
     * <p>
     * The unique identifier of the offer in AWS Marketplace.
     * </p>
     * 
     * @return The unique identifier of the offer in AWS Marketplace.
     */

    public String getOfferId() {
        return this.offerId;
    }

    /**
     * <p>
     * The unique identifier of the offer in AWS Marketplace.
     * </p>
     * 
     * @param offerId
     *        The unique identifier of the offer in AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposalSummary withOfferId(String offerId) {
        setOfferId(offerId);
        return this;
    }

    /**
     * <p>
     * The list of resources involved in the agreement.
     * </p>
     * 
     * @return The list of resources involved in the agreement.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * The list of resources involved in the agreement.
     * </p>
     * 
     * @param resources
     *        The list of resources involved in the agreement.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * The list of resources involved in the agreement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The list of resources involved in the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposalSummary withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources involved in the agreement.
     * </p>
     * 
     * @param resources
     *        The list of resources involved in the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposalSummary withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
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
        if (getOfferId() != null)
            sb.append("OfferId: ").append(getOfferId()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProposalSummary == false)
            return false;
        ProposalSummary other = (ProposalSummary) obj;
        if (other.getOfferId() == null ^ this.getOfferId() == null)
            return false;
        if (other.getOfferId() != null && other.getOfferId().equals(this.getOfferId()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferId() == null) ? 0 : getOfferId().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public ProposalSummary clone() {
        try {
            return (ProposalSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.ProposalSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
