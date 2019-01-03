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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the CreatePolicyVersion operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The policy name.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version
     * becomes the operative version (that is, the version that is in effect for the certificates to which the policy is
     * attached).
     * </p>
     */
    private Boolean setAsDefault;

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @param policyName
     *        The policy name.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @return The policy name.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @param policyName
     *        The policy name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding
     *        whitespace.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
     * </p>
     * 
     * @return The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding
     *         whitespace.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding
     *        whitespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version
     * becomes the operative version (that is, the version that is in effect for the certificates to which the policy is
     * attached).
     * </p>
     * 
     * @param setAsDefault
     *        Specifies whether the policy version is set as the default. When this parameter is true, the new policy
     *        version becomes the operative version (that is, the version that is in effect for the certificates to
     *        which the policy is attached).
     */

    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version
     * becomes the operative version (that is, the version that is in effect for the certificates to which the policy is
     * attached).
     * </p>
     * 
     * @return Specifies whether the policy version is set as the default. When this parameter is true, the new policy
     *         version becomes the operative version (that is, the version that is in effect for the certificates to
     *         which the policy is attached).
     */

    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version
     * becomes the operative version (that is, the version that is in effect for the certificates to which the policy is
     * attached).
     * </p>
     * 
     * @param setAsDefault
     *        Specifies whether the policy version is set as the default. When this parameter is true, the new policy
     *        version becomes the operative version (that is, the version that is in effect for the certificates to
     *        which the policy is attached).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionRequest withSetAsDefault(Boolean setAsDefault) {
        setSetAsDefault(setAsDefault);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version
     * becomes the operative version (that is, the version that is in effect for the certificates to which the policy is
     * attached).
     * </p>
     * 
     * @return Specifies whether the policy version is set as the default. When this parameter is true, the new policy
     *         version becomes the operative version (that is, the version that is in effect for the certificates to
     *         which the policy is attached).
     */

    public Boolean isSetAsDefault() {
        return this.setAsDefault;
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getSetAsDefault() != null)
            sb.append("SetAsDefault: ").append(getSetAsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyVersionRequest == false)
            return false;
        CreatePolicyVersionRequest other = (CreatePolicyVersionRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getSetAsDefault() == null ^ this.getSetAsDefault() == null)
            return false;
        if (other.getSetAsDefault() != null && other.getSetAsDefault().equals(this.getSetAsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getSetAsDefault() == null) ? 0 : getSetAsDefault().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyVersionRequest clone() {
        return (CreatePolicyVersionRequest) super.clone();
    }

}
