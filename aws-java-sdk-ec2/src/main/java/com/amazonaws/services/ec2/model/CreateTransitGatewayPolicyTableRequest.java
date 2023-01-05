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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateTransitGatewayPolicyTableRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayPolicyTableRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTransitGatewayPolicyTableRequest> {

    /**
     * <p>
     * The ID of the transit gateway used for the policy table.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The tags specification for the transit gateway policy table created during the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the transit gateway used for the policy table.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway used for the policy table.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway used for the policy table.
     * </p>
     * 
     * @return The ID of the transit gateway used for the policy table.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway used for the policy table.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway used for the policy table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPolicyTableRequest withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The tags specification for the transit gateway policy table created during the request.
     * </p>
     * 
     * @return The tags specification for the transit gateway policy table created during the request.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags specification for the transit gateway policy table created during the request.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags specification for the transit gateway policy table created during the request.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags specification for the transit gateway policy table created during the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags specification for the transit gateway policy table created during the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPolicyTableRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags specification for the transit gateway policy table created during the request.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags specification for the transit gateway policy table created during the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayPolicyTableRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTransitGatewayPolicyTableRequest> getDryRunRequest() {
        Request<CreateTransitGatewayPolicyTableRequest> request = new CreateTransitGatewayPolicyTableRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayPolicyTableRequest == false)
            return false;
        CreateTransitGatewayPolicyTableRequest other = (CreateTransitGatewayPolicyTableRequest) obj;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayPolicyTableRequest clone() {
        return (CreateTransitGatewayPolicyTableRequest) super.clone();
    }
}
