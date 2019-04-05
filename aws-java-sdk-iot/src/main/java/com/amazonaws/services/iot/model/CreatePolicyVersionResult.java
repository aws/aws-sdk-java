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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output of the CreatePolicyVersion operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The policy ARN.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The policy version ID.
     * </p>
     */
    private String policyVersionId;
    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The policy ARN.
     * </p>
     * 
     * @param policyArn
     *        The policy ARN.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The policy ARN.
     * </p>
     * 
     * @return The policy ARN.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The policy ARN.
     * </p>
     * 
     * @param policyArn
     *        The policy ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionResult withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document that describes the policy.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     * 
     * @return The JSON document that describes the policy.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document that describes the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionResult withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @param policyVersionId
     *        The policy version ID.
     */

    public void setPolicyVersionId(String policyVersionId) {
        this.policyVersionId = policyVersionId;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @return The policy version ID.
     */

    public String getPolicyVersionId() {
        return this.policyVersionId;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @param policyVersionId
     *        The policy version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionResult withPolicyVersionId(String policyVersionId) {
        setPolicyVersionId(policyVersionId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * 
     * @param isDefaultVersion
     *        Specifies whether the policy version is the default.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * 
     * @return Specifies whether the policy version is the default.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * 
     * @param isDefaultVersion
     *        Specifies whether the policy version is the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionResult withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * 
     * @return Specifies whether the policy version is the default.
     */

    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getPolicyVersionId() != null)
            sb.append("PolicyVersionId: ").append(getPolicyVersionId()).append(",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: ").append(getIsDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyVersionResult == false)
            return false;
        CreatePolicyVersionResult other = (CreatePolicyVersionResult) obj;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getPolicyVersionId() == null ^ this.getPolicyVersionId() == null)
            return false;
        if (other.getPolicyVersionId() != null && other.getPolicyVersionId().equals(this.getPolicyVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyVersionResult clone() {
        try {
            return (CreatePolicyVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
