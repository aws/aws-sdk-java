/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The input for the CreatePolicy operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The policy name.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The JSON document that describes the policy. <b>policyDocument</b> must have a minimum length of 1, with a
     * maximum length of 2048, excluding whitespace.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

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

    public CreatePolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The JSON document that describes the policy. <b>policyDocument</b> must have a minimum length of 1, with a
     * maximum length of 2048, excluding whitespace.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document that describes the policy. <b>policyDocument</b> must have a minimum length of 1, with a
     *        maximum length of 2048, excluding whitespace.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy. <b>policyDocument</b> must have a minimum length of 1, with a
     * maximum length of 2048, excluding whitespace.
     * </p>
     * 
     * @return The JSON document that describes the policy. <b>policyDocument</b> must have a minimum length of 1, with
     *         a maximum length of 2048, excluding whitespace.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy. <b>policyDocument</b> must have a minimum length of 1, with a
     * maximum length of 2048, excluding whitespace.
     * </p>
     * 
     * @param policyDocument
     *        The JSON document that describes the policy. <b>policyDocument</b> must have a minimum length of 1, with a
     *        maximum length of 2048, excluding whitespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @return Metadata which can be used to manage the policy.</p> <note>
     *         <p>
     *         For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *         </p>
     *         <p>
     *         For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *         </p>
     *         <p>
     *         For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @param tags
     *        Metadata which can be used to manage the policy.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
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
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the policy.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withTags(Tag... tags) {
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
     * Metadata which can be used to manage the policy.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @param tags
     *        Metadata which can be used to manage the policy.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
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

        if (obj instanceof CreatePolicyRequest == false)
            return false;
        CreatePolicyRequest other = (CreatePolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
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

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyRequest clone() {
        return (CreatePolicyRequest) super.clone();
    }

}
