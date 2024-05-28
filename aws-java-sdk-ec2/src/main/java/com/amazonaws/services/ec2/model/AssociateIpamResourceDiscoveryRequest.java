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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AssociateIpamResourceDiscoveryRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateIpamResourceDiscoveryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssociateIpamResourceDiscoveryRequest> {

    /**
     * <p>
     * An IPAM ID.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * A resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;
    /**
     * <p>
     * Tag specifications.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        An IPAM ID.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @return An IPAM ID.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * An IPAM ID.
     * </p>
     * 
     * @param ipamId
     *        An IPAM ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIpamResourceDiscoveryRequest withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        A resource discovery ID.
     */

    public void setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @return A resource discovery ID.
     */

    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        A resource discovery ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIpamResourceDiscoveryRequest withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * <p>
     * Tag specifications.
     * </p>
     * 
     * @return Tag specifications.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * Tag specifications.
     * </p>
     * 
     * @param tagSpecifications
     *        Tag specifications.
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
     * Tag specifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        Tag specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIpamResourceDiscoveryRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * Tag specifications.
     * </p>
     * 
     * @param tagSpecifications
     *        Tag specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIpamResourceDiscoveryRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @return A client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * 
     * @param clientToken
     *        A client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIpamResourceDiscoveryRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateIpamResourceDiscoveryRequest> getDryRunRequest() {
        Request<AssociateIpamResourceDiscoveryRequest> request = new AssociateIpamResourceDiscoveryRequestMarshaller().marshall(this);
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
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
        if (getIpamResourceDiscoveryId() != null)
            sb.append("IpamResourceDiscoveryId: ").append(getIpamResourceDiscoveryId()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateIpamResourceDiscoveryRequest == false)
            return false;
        AssociateIpamResourceDiscoveryRequest other = (AssociateIpamResourceDiscoveryRequest) obj;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getIpamResourceDiscoveryId() == null) ? 0 : getIpamResourceDiscoveryId().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateIpamResourceDiscoveryRequest clone() {
        return (AssociateIpamResourceDiscoveryRequest) super.clone();
    }
}
