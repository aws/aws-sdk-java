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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVerifiedAccessEndpointPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     */
    private Boolean policyEnabled;
    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     * 
     * @param policyEnabled
     *        The status of the Verified Access policy.
     */

    public void setPolicyEnabled(Boolean policyEnabled) {
        this.policyEnabled = policyEnabled;
    }

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     * 
     * @return The status of the Verified Access policy.
     */

    public Boolean getPolicyEnabled() {
        return this.policyEnabled;
    }

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     * 
     * @param policyEnabled
     *        The status of the Verified Access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVerifiedAccessEndpointPolicyResult withPolicyEnabled(Boolean policyEnabled) {
        setPolicyEnabled(policyEnabled);
        return this;
    }

    /**
     * <p>
     * The status of the Verified Access policy.
     * </p>
     * 
     * @return The status of the Verified Access policy.
     */

    public Boolean isPolicyEnabled() {
        return this.policyEnabled;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @param policyDocument
     *        The Amazon Web Services Verified Access policy document.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @return The Amazon Web Services Verified Access policy document.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access policy document.
     * </p>
     * 
     * @param policyDocument
     *        The Amazon Web Services Verified Access policy document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVerifiedAccessEndpointPolicyResult withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
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
        if (getPolicyEnabled() != null)
            sb.append("PolicyEnabled: ").append(getPolicyEnabled()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVerifiedAccessEndpointPolicyResult == false)
            return false;
        GetVerifiedAccessEndpointPolicyResult other = (GetVerifiedAccessEndpointPolicyResult) obj;
        if (other.getPolicyEnabled() == null ^ this.getPolicyEnabled() == null)
            return false;
        if (other.getPolicyEnabled() != null && other.getPolicyEnabled().equals(this.getPolicyEnabled()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyEnabled() == null) ? 0 : getPolicyEnabled().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public GetVerifiedAccessEndpointPolicyResult clone() {
        try {
            return (GetVerifiedAccessEndpointPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
