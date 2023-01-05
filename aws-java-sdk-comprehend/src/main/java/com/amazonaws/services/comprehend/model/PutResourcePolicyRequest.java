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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model to attach the policy to.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The JSON resource-based policy to attach to your custom model. Provide your JSON as a UTF-8 encoded string
     * without line breaks. To provide valid JSON for your policy, enclose the attribute names and values in double
     * quotes. If the JSON body is also enclosed in double quotes, then you must escape the double quotes that are
     * inside the policy:
     * </p>
     * <p>
     * <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     * </p>
     * <p>
     * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose the JSON
     * names and values:
     * </p>
     * <p>
     * <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * </p>
     */
    private String resourcePolicy;
    /**
     * <p>
     * The revision ID that Amazon Comprehend assigned to the policy that you are updating. If you are creating a new
     * policy that has no prior version, don't use this parameter. Amazon Comprehend creates the revision ID for you.
     * </p>
     */
    private String policyRevisionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model to attach the policy to.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the custom model to attach the policy to.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model to attach the policy to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom model to attach the policy to.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom model to attach the policy to.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the custom model to attach the policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The JSON resource-based policy to attach to your custom model. Provide your JSON as a UTF-8 encoded string
     * without line breaks. To provide valid JSON for your policy, enclose the attribute names and values in double
     * quotes. If the JSON body is also enclosed in double quotes, then you must escape the double quotes that are
     * inside the policy:
     * </p>
     * <p>
     * <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     * </p>
     * <p>
     * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose the JSON
     * names and values:
     * </p>
     * <p>
     * <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * </p>
     * 
     * @param resourcePolicy
     *        The JSON resource-based policy to attach to your custom model. Provide your JSON as a UTF-8 encoded string
     *        without line breaks. To provide valid JSON for your policy, enclose the attribute names and values in
     *        double quotes. If the JSON body is also enclosed in double quotes, then you must escape the double quotes
     *        that are inside the policy:</p>
     *        <p>
     *        <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     *        </p>
     *        <p>
     *        To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose the
     *        JSON names and values:
     *        </p>
     *        <p>
     *        <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * The JSON resource-based policy to attach to your custom model. Provide your JSON as a UTF-8 encoded string
     * without line breaks. To provide valid JSON for your policy, enclose the attribute names and values in double
     * quotes. If the JSON body is also enclosed in double quotes, then you must escape the double quotes that are
     * inside the policy:
     * </p>
     * <p>
     * <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     * </p>
     * <p>
     * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose the JSON
     * names and values:
     * </p>
     * <p>
     * <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * </p>
     * 
     * @return The JSON resource-based policy to attach to your custom model. Provide your JSON as a UTF-8 encoded
     *         string without line breaks. To provide valid JSON for your policy, enclose the attribute names and values
     *         in double quotes. If the JSON body is also enclosed in double quotes, then you must escape the double
     *         quotes that are inside the policy:</p>
     *         <p>
     *         <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     *         </p>
     *         <p>
     *         To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose
     *         the JSON names and values:
     *         </p>
     *         <p>
     *         <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * The JSON resource-based policy to attach to your custom model. Provide your JSON as a UTF-8 encoded string
     * without line breaks. To provide valid JSON for your policy, enclose the attribute names and values in double
     * quotes. If the JSON body is also enclosed in double quotes, then you must escape the double quotes that are
     * inside the policy:
     * </p>
     * <p>
     * <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     * </p>
     * <p>
     * To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose the JSON
     * names and values:
     * </p>
     * <p>
     * <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * </p>
     * 
     * @param resourcePolicy
     *        The JSON resource-based policy to attach to your custom model. Provide your JSON as a UTF-8 encoded string
     *        without line breaks. To provide valid JSON for your policy, enclose the attribute names and values in
     *        double quotes. If the JSON body is also enclosed in double quotes, then you must escape the double quotes
     *        that are inside the policy:</p>
     *        <p>
     *        <code>"{\"attribute\": \"value\", \"attribute\": [\"value\"]}"</code>
     *        </p>
     *        <p>
     *        To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose the
     *        JSON names and values:
     *        </p>
     *        <p>
     *        <code>'{"attribute": "value", "attribute": ["value"]}'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
        return this;
    }

    /**
     * <p>
     * The revision ID that Amazon Comprehend assigned to the policy that you are updating. If you are creating a new
     * policy that has no prior version, don't use this parameter. Amazon Comprehend creates the revision ID for you.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID that Amazon Comprehend assigned to the policy that you are updating. If you are creating a
     *        new policy that has no prior version, don't use this parameter. Amazon Comprehend creates the revision ID
     *        for you.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * The revision ID that Amazon Comprehend assigned to the policy that you are updating. If you are creating a new
     * policy that has no prior version, don't use this parameter. Amazon Comprehend creates the revision ID for you.
     * </p>
     * 
     * @return The revision ID that Amazon Comprehend assigned to the policy that you are updating. If you are creating
     *         a new policy that has no prior version, don't use this parameter. Amazon Comprehend creates the revision
     *         ID for you.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * The revision ID that Amazon Comprehend assigned to the policy that you are updating. If you are creating a new
     * policy that has no prior version, don't use this parameter. Amazon Comprehend creates the revision ID for you.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID that Amazon Comprehend assigned to the policy that you are updating. If you are creating a
     *        new policy that has no prior version, don't use this parameter. Amazon Comprehend creates the revision ID
     *        for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicyRevisionId(String policyRevisionId) {
        setPolicyRevisionId(policyRevisionId);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: ").append(getResourcePolicy()).append(",");
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: ").append(getPolicyRevisionId());
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
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
