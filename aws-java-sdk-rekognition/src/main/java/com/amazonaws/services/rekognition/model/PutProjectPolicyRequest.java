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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutProjectPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy is attached to.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * A name for the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The revision ID for the Project Policy. Each time you modify a policy, Amazon Rekognition Custom Labels generates
     * and assigns a new <code>PolicyRevisionId</code> and then deletes the previous version of the policy.
     * </p>
     */
    private String policyRevisionId;
    /**
     * <p>
     * A resource policy to add to the model. The policy is a JSON structure that contains one or more statements that
     * define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON
     * policy document, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON
     * policy reference</a>.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy is attached to.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project that the project policy is attached to.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy is attached to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project that the project policy is attached to.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy is attached to.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project that the project policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectPolicyRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * A name for the policy.
     * </p>
     * 
     * @param policyName
     *        A name for the policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * A name for the policy.
     * </p>
     * 
     * @return A name for the policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * A name for the policy.
     * </p>
     * 
     * @param policyName
     *        A name for the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The revision ID for the Project Policy. Each time you modify a policy, Amazon Rekognition Custom Labels generates
     * and assigns a new <code>PolicyRevisionId</code> and then deletes the previous version of the policy.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID for the Project Policy. Each time you modify a policy, Amazon Rekognition Custom Labels
     *        generates and assigns a new <code>PolicyRevisionId</code> and then deletes the previous version of the
     *        policy.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * The revision ID for the Project Policy. Each time you modify a policy, Amazon Rekognition Custom Labels generates
     * and assigns a new <code>PolicyRevisionId</code> and then deletes the previous version of the policy.
     * </p>
     * 
     * @return The revision ID for the Project Policy. Each time you modify a policy, Amazon Rekognition Custom Labels
     *         generates and assigns a new <code>PolicyRevisionId</code> and then deletes the previous version of the
     *         policy.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * The revision ID for the Project Policy. Each time you modify a policy, Amazon Rekognition Custom Labels generates
     * and assigns a new <code>PolicyRevisionId</code> and then deletes the previous version of the policy.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID for the Project Policy. Each time you modify a policy, Amazon Rekognition Custom Labels
     *        generates and assigns a new <code>PolicyRevisionId</code> and then deletes the previous version of the
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectPolicyRequest withPolicyRevisionId(String policyRevisionId) {
        setPolicyRevisionId(policyRevisionId);
        return this;
    }

    /**
     * <p>
     * A resource policy to add to the model. The policy is a JSON structure that contains one or more statements that
     * define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON
     * policy document, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON
     * policy reference</a>.
     * </p>
     * 
     * @param policyDocument
     *        A resource policy to add to the model. The policy is a JSON structure that contains one or more statements
     *        that define the policy. The policy must follow the IAM syntax. For more information about the contents of
     *        a JSON policy document, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON policy
     *        reference</a>.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * A resource policy to add to the model. The policy is a JSON structure that contains one or more statements that
     * define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON
     * policy document, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON
     * policy reference</a>.
     * </p>
     * 
     * @return A resource policy to add to the model. The policy is a JSON structure that contains one or more
     *         statements that define the policy. The policy must follow the IAM syntax. For more information about the
     *         contents of a JSON policy document, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON policy
     *         reference</a>.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * A resource policy to add to the model. The policy is a JSON structure that contains one or more statements that
     * define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON
     * policy document, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON
     * policy reference</a>.
     * </p>
     * 
     * @param policyDocument
     *        A resource policy to add to the model. The policy is a JSON structure that contains one or more statements
     *        that define the policy. The policy must follow the IAM syntax. For more information about the contents of
     *        a JSON policy document, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON policy
     *        reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectPolicyRequest withPolicyDocument(String policyDocument) {
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: ").append(getPolicyRevisionId()).append(",");
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

        if (obj instanceof PutProjectPolicyRequest == false)
            return false;
        PutProjectPolicyRequest other = (PutProjectPolicyRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
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

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public PutProjectPolicyRequest clone() {
        return (PutProjectPolicyRequest) super.clone();
    }

}
