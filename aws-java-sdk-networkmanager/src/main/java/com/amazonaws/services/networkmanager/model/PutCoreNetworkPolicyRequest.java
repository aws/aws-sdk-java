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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutCoreNetworkPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutCoreNetworkPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The policy document.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * a core network policy description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of a core network policy.
     * </p>
     */
    private Integer latestVersionId;
    /**
     * <p>
     * The client token associated with the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCoreNetworkPolicyRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The policy document.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCoreNetworkPolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * a core network policy description.
     * </p>
     * 
     * @param description
     *        a core network policy description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * a core network policy description.
     * </p>
     * 
     * @return a core network policy description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * a core network policy description.
     * </p>
     * 
     * @param description
     *        a core network policy description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCoreNetworkPolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of a core network policy.
     * </p>
     * 
     * @param latestVersionId
     *        The ID of a core network policy.
     */

    public void setLatestVersionId(Integer latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    /**
     * <p>
     * The ID of a core network policy.
     * </p>
     * 
     * @return The ID of a core network policy.
     */

    public Integer getLatestVersionId() {
        return this.latestVersionId;
    }

    /**
     * <p>
     * The ID of a core network policy.
     * </p>
     * 
     * @param latestVersionId
     *        The ID of a core network policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCoreNetworkPolicyRequest withLatestVersionId(Integer latestVersionId) {
        setLatestVersionId(latestVersionId);
        return this;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @return The client token associated with the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCoreNetworkPolicyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLatestVersionId() != null)
            sb.append("LatestVersionId: ").append(getLatestVersionId()).append(",");
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

        if (obj instanceof PutCoreNetworkPolicyRequest == false)
            return false;
        PutCoreNetworkPolicyRequest other = (PutCoreNetworkPolicyRequest) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLatestVersionId() == null ^ this.getLatestVersionId() == null)
            return false;
        if (other.getLatestVersionId() != null && other.getLatestVersionId().equals(this.getLatestVersionId()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionId() == null) ? 0 : getLatestVersionId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public PutCoreNetworkPolicyRequest clone() {
        return (PutCoreNetworkPolicyRequest) super.clone();
    }

}
