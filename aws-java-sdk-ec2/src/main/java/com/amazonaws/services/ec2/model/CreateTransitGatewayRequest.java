/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateTransitGatewayRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTransitGatewayRequest> {

    /**
     * <p>
     * A description of the transit gateway.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The transit gateway options.
     * </p>
     */
    private TransitGatewayRequestOptions options;
    /**
     * <p>
     * The tags to apply to the transit gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * A description of the transit gateway.
     * </p>
     * 
     * @param description
     *        A description of the transit gateway.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the transit gateway.
     * </p>
     * 
     * @return A description of the transit gateway.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the transit gateway.
     * </p>
     * 
     * @param description
     *        A description of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The transit gateway options.
     * </p>
     * 
     * @param options
     *        The transit gateway options.
     */

    public void setOptions(TransitGatewayRequestOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The transit gateway options.
     * </p>
     * 
     * @return The transit gateway options.
     */

    public TransitGatewayRequestOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The transit gateway options.
     * </p>
     * 
     * @param options
     *        The transit gateway options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRequest withOptions(TransitGatewayRequestOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the transit gateway.
     * </p>
     * 
     * @return The tags to apply to the transit gateway.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the transit gateway.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the transit gateway.
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
     * The tags to apply to the transit gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the transit gateway.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransitGatewayRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTransitGatewayRequest> getDryRunRequest() {
        Request<CreateTransitGatewayRequest> request = new CreateTransitGatewayRequestMarshaller().marshall(this);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateTransitGatewayRequest == false)
            return false;
        CreateTransitGatewayRequest other = (CreateTransitGatewayRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayRequest clone() {
        return (CreateTransitGatewayRequest) super.clone();
    }
}
