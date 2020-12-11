/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateTransitGatewayConnectRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayConnectRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTransitGatewayConnectRequest> {

    /**
     * <p>
     * The ID of the transit gateway attachment. You can specify a VPC attachment or a AWS Direct Connect attachment.
     * </p>
     */
    private String transportTransitGatewayAttachmentId;
    /**
     * <p>
     * The Connect attachment options.
     * </p>
     */
    private CreateTransitGatewayConnectRequestOptions options;
    /**
     * <p>
     * The tags to apply to the Connect attachment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the transit gateway attachment. You can specify a VPC attachment or a AWS Direct Connect attachment.
     * </p>
     * 
     * @param transportTransitGatewayAttachmentId
     *        The ID of the transit gateway attachment. You can specify a VPC attachment or a AWS Direct Connect
     *        attachment.
     */

    public void setTransportTransitGatewayAttachmentId(String transportTransitGatewayAttachmentId) {
        this.transportTransitGatewayAttachmentId = transportTransitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment. You can specify a VPC attachment or a AWS Direct Connect attachment.
     * </p>
     * 
     * @return The ID of the transit gateway attachment. You can specify a VPC attachment or a AWS Direct Connect
     *         attachment.
     */

    public String getTransportTransitGatewayAttachmentId() {
        return this.transportTransitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment. You can specify a VPC attachment or a AWS Direct Connect attachment.
     * </p>
     * 
     * @param transportTransitGatewayAttachmentId
     *        The ID of the transit gateway attachment. You can specify a VPC attachment or a AWS Direct Connect
     *        attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectRequest withTransportTransitGatewayAttachmentId(String transportTransitGatewayAttachmentId) {
        setTransportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The Connect attachment options.
     * </p>
     * 
     * @param options
     *        The Connect attachment options.
     */

    public void setOptions(CreateTransitGatewayConnectRequestOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The Connect attachment options.
     * </p>
     * 
     * @return The Connect attachment options.
     */

    public CreateTransitGatewayConnectRequestOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The Connect attachment options.
     * </p>
     * 
     * @param options
     *        The Connect attachment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectRequest withOptions(CreateTransitGatewayConnectRequestOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Connect attachment.
     * </p>
     * 
     * @return The tags to apply to the Connect attachment.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Connect attachment.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Connect attachment.
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
     * The tags to apply to the Connect attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Connect attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the Connect attachment.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Connect attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayConnectRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTransitGatewayConnectRequest> getDryRunRequest() {
        Request<CreateTransitGatewayConnectRequest> request = new CreateTransitGatewayConnectRequestMarshaller().marshall(this);
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
        if (getTransportTransitGatewayAttachmentId() != null)
            sb.append("TransportTransitGatewayAttachmentId: ").append(getTransportTransitGatewayAttachmentId()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
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

        if (obj instanceof CreateTransitGatewayConnectRequest == false)
            return false;
        CreateTransitGatewayConnectRequest other = (CreateTransitGatewayConnectRequest) obj;
        if (other.getTransportTransitGatewayAttachmentId() == null ^ this.getTransportTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransportTransitGatewayAttachmentId() != null
                && other.getTransportTransitGatewayAttachmentId().equals(this.getTransportTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
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

        hashCode = prime * hashCode + ((getTransportTransitGatewayAttachmentId() == null) ? 0 : getTransportTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayConnectRequest clone() {
        return (CreateTransitGatewayConnectRequest) super.clone();
    }
}
