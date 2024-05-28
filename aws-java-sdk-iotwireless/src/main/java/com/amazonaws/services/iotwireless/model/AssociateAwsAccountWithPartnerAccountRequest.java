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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateAwsAccountWithPartnerAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAwsAccountWithPartnerAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     */
    private SidewalkAccountInfo sidewalk;
    /**
     * <p>
     * Each resource must have a unique client request token. The client token is used to implement idempotency. It
     * ensures that the request completes no more than one time. If you retry a request with the same token and the same
     * parameters, the request will complete successfully. However, if you try to create a new resource using the same
     * token but different parameters, an HTTP 409 conflict occurs. If you omit this value, AWS SDKs will automatically
     * generate a unique client request. For more information about idempotency, see <a
     * href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency in Amazon
     * EC2 API requests</a>.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.
     */

    public void setSidewalk(SidewalkAccountInfo sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @return The Sidewalk account credentials.
     */

    public SidewalkAccountInfo getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAwsAccountWithPartnerAccountRequest withSidewalk(SidewalkAccountInfo sidewalk) {
        setSidewalk(sidewalk);
        return this;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. The client token is used to implement idempotency. It
     * ensures that the request completes no more than one time. If you retry a request with the same token and the same
     * parameters, the request will complete successfully. However, if you try to create a new resource using the same
     * token but different parameters, an HTTP 409 conflict occurs. If you omit this value, AWS SDKs will automatically
     * generate a unique client request. For more information about idempotency, see <a
     * href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency in Amazon
     * EC2 API requests</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        Each resource must have a unique client request token. The client token is used to implement idempotency.
     *        It ensures that the request completes no more than one time. If you retry a request with the same token
     *        and the same parameters, the request will complete successfully. However, if you try to create a new
     *        resource using the same token but different parameters, an HTTP 409 conflict occurs. If you omit this
     *        value, AWS SDKs will automatically generate a unique client request. For more information about
     *        idempotency, see <a
     *        href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency in
     *        Amazon EC2 API requests</a>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. The client token is used to implement idempotency. It
     * ensures that the request completes no more than one time. If you retry a request with the same token and the same
     * parameters, the request will complete successfully. However, if you try to create a new resource using the same
     * token but different parameters, an HTTP 409 conflict occurs. If you omit this value, AWS SDKs will automatically
     * generate a unique client request. For more information about idempotency, see <a
     * href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency in Amazon
     * EC2 API requests</a>.
     * </p>
     * 
     * @return Each resource must have a unique client request token. The client token is used to implement idempotency.
     *         It ensures that the request completes no more than one time. If you retry a request with the same token
     *         and the same parameters, the request will complete successfully. However, if you try to create a new
     *         resource using the same token but different parameters, an HTTP 409 conflict occurs. If you omit this
     *         value, AWS SDKs will automatically generate a unique client request. For more information about
     *         idempotency, see <a
     *         href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency in
     *         Amazon EC2 API requests</a>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. The client token is used to implement idempotency. It
     * ensures that the request completes no more than one time. If you retry a request with the same token and the same
     * parameters, the request will complete successfully. However, if you try to create a new resource using the same
     * token but different parameters, an HTTP 409 conflict occurs. If you omit this value, AWS SDKs will automatically
     * generate a unique client request. For more information about idempotency, see <a
     * href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency in Amazon
     * EC2 API requests</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        Each resource must have a unique client request token. The client token is used to implement idempotency.
     *        It ensures that the request completes no more than one time. If you retry a request with the same token
     *        and the same parameters, the request will complete successfully. However, if you try to create a new
     *        resource using the same token but different parameters, an HTTP 409 conflict occurs. If you omit this
     *        value, AWS SDKs will automatically generate a unique client request. For more information about
     *        idempotency, see <a
     *        href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency in
     *        Amazon EC2 API requests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAwsAccountWithPartnerAccountRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @return The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAwsAccountWithPartnerAccountRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAwsAccountWithPartnerAccountRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAwsAccountWithPartnerAccountRequest == false)
            return false;
        AssociateAwsAccountWithPartnerAccountRequest other = (AssociateAwsAccountWithPartnerAccountRequest) obj;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAwsAccountWithPartnerAccountRequest clone() {
        return (AssociateAwsAccountWithPartnerAccountRequest) super.clone();
    }

}
