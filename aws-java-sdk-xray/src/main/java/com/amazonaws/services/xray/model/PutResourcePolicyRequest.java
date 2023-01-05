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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The resource policy document, which can be up to 5kb in size.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * Specifies a specific policy revision, to ensure an atomic create operation. By default the resource policy is
     * created if it does not exist, or updated with an incremented revision id. The revision id is unique to each
     * policy in the account.
     * </p>
     * <p>
     * If the policy revision id does not match the latest revision id, the operation will fail with an
     * <code>InvalidPolicyRevisionIdException</code> exception. You can also provide a <code>PolicyRevisionId</code> of
     * 0. In this case, the operation will fail with an <code>InvalidPolicyRevisionIdException</code> exception if a
     * resource policy with the same name already exists.
     * </p>
     */
    private String policyRevisionId;
    /**
     * <p>
     * A flag to indicate whether to bypass the resource policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutResourcePolicy</code> request.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutCheck;

    /**
     * <p>
     * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * </p>
     * 
     * @param policyName
     *        The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * </p>
     * 
     * @return The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * </p>
     * 
     * @param policyName
     *        The name of the resource policy. Must be unique within a specific Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The resource policy document, which can be up to 5kb in size.
     * </p>
     * 
     * @param policyDocument
     *        The resource policy document, which can be up to 5kb in size.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The resource policy document, which can be up to 5kb in size.
     * </p>
     * 
     * @return The resource policy document, which can be up to 5kb in size.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The resource policy document, which can be up to 5kb in size.
     * </p>
     * 
     * @param policyDocument
     *        The resource policy document, which can be up to 5kb in size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * Specifies a specific policy revision, to ensure an atomic create operation. By default the resource policy is
     * created if it does not exist, or updated with an incremented revision id. The revision id is unique to each
     * policy in the account.
     * </p>
     * <p>
     * If the policy revision id does not match the latest revision id, the operation will fail with an
     * <code>InvalidPolicyRevisionIdException</code> exception. You can also provide a <code>PolicyRevisionId</code> of
     * 0. In this case, the operation will fail with an <code>InvalidPolicyRevisionIdException</code> exception if a
     * resource policy with the same name already exists.
     * </p>
     * 
     * @param policyRevisionId
     *        Specifies a specific policy revision, to ensure an atomic create operation. By default the resource policy
     *        is created if it does not exist, or updated with an incremented revision id. The revision id is unique to
     *        each policy in the account.</p>
     *        <p>
     *        If the policy revision id does not match the latest revision id, the operation will fail with an
     *        <code>InvalidPolicyRevisionIdException</code> exception. You can also provide a
     *        <code>PolicyRevisionId</code> of 0. In this case, the operation will fail with an
     *        <code>InvalidPolicyRevisionIdException</code> exception if a resource policy with the same name already
     *        exists.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * Specifies a specific policy revision, to ensure an atomic create operation. By default the resource policy is
     * created if it does not exist, or updated with an incremented revision id. The revision id is unique to each
     * policy in the account.
     * </p>
     * <p>
     * If the policy revision id does not match the latest revision id, the operation will fail with an
     * <code>InvalidPolicyRevisionIdException</code> exception. You can also provide a <code>PolicyRevisionId</code> of
     * 0. In this case, the operation will fail with an <code>InvalidPolicyRevisionIdException</code> exception if a
     * resource policy with the same name already exists.
     * </p>
     * 
     * @return Specifies a specific policy revision, to ensure an atomic create operation. By default the resource
     *         policy is created if it does not exist, or updated with an incremented revision id. The revision id is
     *         unique to each policy in the account.</p>
     *         <p>
     *         If the policy revision id does not match the latest revision id, the operation will fail with an
     *         <code>InvalidPolicyRevisionIdException</code> exception. You can also provide a
     *         <code>PolicyRevisionId</code> of 0. In this case, the operation will fail with an
     *         <code>InvalidPolicyRevisionIdException</code> exception if a resource policy with the same name already
     *         exists.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * Specifies a specific policy revision, to ensure an atomic create operation. By default the resource policy is
     * created if it does not exist, or updated with an incremented revision id. The revision id is unique to each
     * policy in the account.
     * </p>
     * <p>
     * If the policy revision id does not match the latest revision id, the operation will fail with an
     * <code>InvalidPolicyRevisionIdException</code> exception. You can also provide a <code>PolicyRevisionId</code> of
     * 0. In this case, the operation will fail with an <code>InvalidPolicyRevisionIdException</code> exception if a
     * resource policy with the same name already exists.
     * </p>
     * 
     * @param policyRevisionId
     *        Specifies a specific policy revision, to ensure an atomic create operation. By default the resource policy
     *        is created if it does not exist, or updated with an incremented revision id. The revision id is unique to
     *        each policy in the account.</p>
     *        <p>
     *        If the policy revision id does not match the latest revision id, the operation will fail with an
     *        <code>InvalidPolicyRevisionIdException</code> exception. You can also provide a
     *        <code>PolicyRevisionId</code> of 0. In this case, the operation will fail with an
     *        <code>InvalidPolicyRevisionIdException</code> exception if a resource policy with the same name already
     *        exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyRevisionId(String policyRevisionId) {
        setPolicyRevisionId(policyRevisionId);
        return this;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the resource policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutResourcePolicy</code> request.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @param bypassPolicyLockoutCheck
     *        A flag to indicate whether to bypass the resource policy lockout safety check.</p> <important>
     *        <p>
     *        Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value
     *        to true indiscriminately.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *        that is making the request from making a subsequent <code>PutResourcePolicy</code> request.
     *        </p>
     *        <p>
     *        The default value is false.
     */

    public void setBypassPolicyLockoutCheck(Boolean bypassPolicyLockoutCheck) {
        this.bypassPolicyLockoutCheck = bypassPolicyLockoutCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the resource policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutResourcePolicy</code> request.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @return A flag to indicate whether to bypass the resource policy lockout safety check.</p> <important>
     *         <p>
     *         Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value
     *         to true indiscriminately.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *         that is making the request from making a subsequent <code>PutResourcePolicy</code> request.
     *         </p>
     *         <p>
     *         The default value is false.
     */

    public Boolean getBypassPolicyLockoutCheck() {
        return this.bypassPolicyLockoutCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the resource policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutResourcePolicy</code> request.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @param bypassPolicyLockoutCheck
     *        A flag to indicate whether to bypass the resource policy lockout safety check.</p> <important>
     *        <p>
     *        Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value
     *        to true indiscriminately.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *        that is making the request from making a subsequent <code>PutResourcePolicy</code> request.
     *        </p>
     *        <p>
     *        The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withBypassPolicyLockoutCheck(Boolean bypassPolicyLockoutCheck) {
        setBypassPolicyLockoutCheck(bypassPolicyLockoutCheck);
        return this;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the resource policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <code>PutResourcePolicy</code> request.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @return A flag to indicate whether to bypass the resource policy lockout safety check.</p> <important>
     *         <p>
     *         Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value
     *         to true indiscriminately.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *         that is making the request from making a subsequent <code>PutResourcePolicy</code> request.
     *         </p>
     *         <p>
     *         The default value is false.
     */

    public Boolean isBypassPolicyLockoutCheck() {
        return this.bypassPolicyLockoutCheck;
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
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: ").append(getPolicyRevisionId()).append(",");
        if (getBypassPolicyLockoutCheck() != null)
            sb.append("BypassPolicyLockoutCheck: ").append(getBypassPolicyLockoutCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        if (other.getBypassPolicyLockoutCheck() == null ^ this.getBypassPolicyLockoutCheck() == null)
            return false;
        if (other.getBypassPolicyLockoutCheck() != null && other.getBypassPolicyLockoutCheck().equals(this.getBypassPolicyLockoutCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        hashCode = prime * hashCode + ((getBypassPolicyLockoutCheck() == null) ? 0 : getBypassPolicyLockoutCheck().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
