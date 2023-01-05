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
import com.amazonaws.services.ec2.model.transform.CreateLocalGatewayRouteTableRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocalGatewayRouteTableRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateLocalGatewayRouteTableRequest> {

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;
    /**
     * <p>
     * The mode of the local gateway route table.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The tags assigned to the local gateway route table.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     */

    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @return The ID of the local gateway.
     */

    public String getLocalGatewayId() {
        return this.localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableRequest withLocalGatewayId(String localGatewayId) {
        setLocalGatewayId(localGatewayId);
        return this;
    }

    /**
     * <p>
     * The mode of the local gateway route table.
     * </p>
     * 
     * @param mode
     *        The mode of the local gateway route table.
     * @see LocalGatewayRouteTableMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode of the local gateway route table.
     * </p>
     * 
     * @return The mode of the local gateway route table.
     * @see LocalGatewayRouteTableMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The mode of the local gateway route table.
     * </p>
     * 
     * @param mode
     *        The mode of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalGatewayRouteTableMode
     */

    public CreateLocalGatewayRouteTableRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The mode of the local gateway route table.
     * </p>
     * 
     * @param mode
     *        The mode of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalGatewayRouteTableMode
     */

    public CreateLocalGatewayRouteTableRequest withMode(LocalGatewayRouteTableMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The tags assigned to the local gateway route table.
     * </p>
     * 
     * @return The tags assigned to the local gateway route table.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags assigned to the local gateway route table.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags assigned to the local gateway route table.
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
     * The tags assigned to the local gateway route table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags assigned to the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags assigned to the local gateway route table.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags assigned to the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteTableRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateLocalGatewayRouteTableRequest> getDryRunRequest() {
        Request<CreateLocalGatewayRouteTableRequest> request = new CreateLocalGatewayRouteTableRequestMarshaller().marshall(this);
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
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: ").append(getLocalGatewayId()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
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

        if (obj instanceof CreateLocalGatewayRouteTableRequest == false)
            return false;
        CreateLocalGatewayRouteTableRequest other = (CreateLocalGatewayRouteTableRequest) obj;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
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

        hashCode = prime * hashCode + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocalGatewayRouteTableRequest clone() {
        return (CreateLocalGatewayRouteTableRequest) super.clone();
    }
}
