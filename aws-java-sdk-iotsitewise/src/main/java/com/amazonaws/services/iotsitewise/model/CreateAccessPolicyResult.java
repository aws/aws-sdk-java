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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAccessPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     */
    private String accessPolicyId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the access
     * policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     */
    private String accessPolicyArn;

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @param accessPolicyId
     *        The ID of the access policy.
     */

    public void setAccessPolicyId(String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @return The ID of the access policy.
     */

    public String getAccessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @param accessPolicyId
     *        The ID of the access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPolicyResult withAccessPolicyId(String accessPolicyId) {
        setAccessPolicyId(accessPolicyId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the access
     * policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * 
     * @param accessPolicyArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        access policy, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     */

    public void setAccessPolicyArn(String accessPolicyArn) {
        this.accessPolicyArn = accessPolicyArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the access
     * policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         access policy, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     */

    public String getAccessPolicyArn() {
        return this.accessPolicyArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the access
     * policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * 
     * @param accessPolicyArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        access policy, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPolicyResult withAccessPolicyArn(String accessPolicyArn) {
        setAccessPolicyArn(accessPolicyArn);
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
        if (getAccessPolicyId() != null)
            sb.append("AccessPolicyId: ").append(getAccessPolicyId()).append(",");
        if (getAccessPolicyArn() != null)
            sb.append("AccessPolicyArn: ").append(getAccessPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessPolicyResult == false)
            return false;
        CreateAccessPolicyResult other = (CreateAccessPolicyResult) obj;
        if (other.getAccessPolicyId() == null ^ this.getAccessPolicyId() == null)
            return false;
        if (other.getAccessPolicyId() != null && other.getAccessPolicyId().equals(this.getAccessPolicyId()) == false)
            return false;
        if (other.getAccessPolicyArn() == null ^ this.getAccessPolicyArn() == null)
            return false;
        if (other.getAccessPolicyArn() != null && other.getAccessPolicyArn().equals(this.getAccessPolicyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPolicyId() == null) ? 0 : getAccessPolicyId().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyArn() == null) ? 0 : getAccessPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessPolicyResult clone() {
        try {
            return (CreateAccessPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
