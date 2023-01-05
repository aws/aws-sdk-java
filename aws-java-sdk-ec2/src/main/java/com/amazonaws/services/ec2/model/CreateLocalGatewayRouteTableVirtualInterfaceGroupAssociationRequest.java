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
import com.amazonaws.services.ec2.model.transform.CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest> {

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;
    /**
     * <p>
     * The ID of the local gateway route table virtual interface group association.
     * </p>
     */
    private String localGatewayVirtualInterfaceGroupId;
    /**
     * <p>
     * The tags assigned to the local gateway route table virtual interface group association.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     */

    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @return The ID of the local gateway route table.
     */

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table virtual interface group association.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the local gateway route table virtual interface group association.
     */

    public void setLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the local gateway route table virtual interface group association.
     * </p>
     * 
     * @return The ID of the local gateway route table virtual interface group association.
     */

    public String getLocalGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the local gateway route table virtual interface group association.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the local gateway route table virtual interface group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest withLocalGatewayVirtualInterfaceGroupId(
            String localGatewayVirtualInterfaceGroupId) {
        setLocalGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the local gateway route table virtual interface group association.
     * </p>
     * 
     * @return The tags assigned to the local gateway route table virtual interface group association.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags assigned to the local gateway route table virtual interface group association.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags assigned to the local gateway route table virtual interface group association.
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
     * The tags assigned to the local gateway route table virtual interface group association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags assigned to the local gateway route table virtual interface group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags assigned to the local gateway route table virtual interface group association.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags assigned to the local gateway route table virtual interface group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest> getDryRunRequest() {
        Request<CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest> request = new CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequestMarshaller()
                .marshall(this);
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
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId()).append(",");
        if (getLocalGatewayVirtualInterfaceGroupId() != null)
            sb.append("LocalGatewayVirtualInterfaceGroupId: ").append(getLocalGatewayVirtualInterfaceGroupId()).append(",");
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

        if (obj instanceof CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest == false)
            return false;
        CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest other = (CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest) obj;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() == null ^ this.getLocalGatewayVirtualInterfaceGroupId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() != null
                && other.getLocalGatewayVirtualInterfaceGroupId().equals(this.getLocalGatewayVirtualInterfaceGroupId()) == false)
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

        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayVirtualInterfaceGroupId() == null) ? 0 : getLocalGatewayVirtualInterfaceGroupId().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest clone() {
        return (CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationRequest) super.clone();
    }
}
