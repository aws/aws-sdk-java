/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the AWS Firewall Manager policy to be created.
     * </p>
     */
    private Policy policy;
    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p>
     * The details of the AWS Firewall Manager policy to be created.
     * </p>
     * 
     * @param policy
     *        The details of the AWS Firewall Manager policy to be created.
     */

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The details of the AWS Firewall Manager policy to be created.
     * </p>
     * 
     * @return The details of the AWS Firewall Manager policy to be created.
     */

    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The details of the AWS Firewall Manager policy to be created.
     * </p>
     * 
     * @param policy
     *        The details of the AWS Firewall Manager policy to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPolicyRequest withPolicy(Policy policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     * 
     * @return The tags to add to the AWS resource.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     * 
     * @param tagList
     *        The tags to add to the AWS resource.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        The tags to add to the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPolicyRequest withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     * 
     * @param tagList
     *        The tags to add to the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPolicyRequest withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPolicyRequest == false)
            return false;
        PutPolicyRequest other = (PutPolicyRequest) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public PutPolicyRequest clone() {
        return (PutPolicyRequest) super.clone();
    }

}
