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
import com.amazonaws.services.ec2.model.transform.CreatePublicIpv4PoolRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePublicIpv4PoolRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreatePublicIpv4PoolRequest> {

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @return The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *         tag value as the filter value. For example, to find all resources that have a tag with the key
     *         <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *         and <code>TeamA</code> for the filter value.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
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
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicIpv4PoolRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value
     * as the filter value. For example, to find all resources that have a tag with the key <code>Owner</code> and the
     * value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the
     * filter value.
     * </p>
     * 
     * @param tagSpecifications
     *        The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the
     *        tag value as the filter value. For example, to find all resources that have a tag with the key
     *        <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     *        and <code>TeamA</code> for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublicIpv4PoolRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreatePublicIpv4PoolRequest> getDryRunRequest() {
        Request<CreatePublicIpv4PoolRequest> request = new CreatePublicIpv4PoolRequestMarshaller().marshall(this);
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

        if (obj instanceof CreatePublicIpv4PoolRequest == false)
            return false;
        CreatePublicIpv4PoolRequest other = (CreatePublicIpv4PoolRequest) obj;
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

        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreatePublicIpv4PoolRequest clone() {
        return (CreatePublicIpv4PoolRequest) super.clone();
    }
}
