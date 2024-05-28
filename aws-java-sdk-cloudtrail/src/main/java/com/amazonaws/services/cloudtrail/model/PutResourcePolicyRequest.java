/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. The following is
     * the format of a resource ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A JSON-formatted string for an Amazon Web Services resource-based policy.
     * </p>
     * <p>
     * The following are requirements for the resource policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contains only one action: cloudtrail-data:PutAuditEvents
     * </p>
     * </li>
     * <li>
     * <p>
     * Contains at least one statement. The policy can have a maximum of 20 statements.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement contains at least one principal. A statement can have a maximum of 50 principals.
     * </p>
     * </li>
     * </ul>
     */
    private String resourcePolicy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. The following is
     * the format of a resource ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. The
     *        following is the format of a resource ARN:
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. The following is
     * the format of a resource ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. The
     *         following is the format of a resource ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. The following is
     * the format of a resource ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. The
     *        following is the format of a resource ARN:
     *        <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted string for an Amazon Web Services resource-based policy.
     * </p>
     * <p>
     * The following are requirements for the resource policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contains only one action: cloudtrail-data:PutAuditEvents
     * </p>
     * </li>
     * <li>
     * <p>
     * Contains at least one statement. The policy can have a maximum of 20 statements.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement contains at least one principal. A statement can have a maximum of 50 principals.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string for an Amazon Web Services resource-based policy. </p>
     *        <p>
     *        The following are requirements for the resource policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contains only one action: cloudtrail-data:PutAuditEvents
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contains at least one statement. The policy can have a maximum of 20 statements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement contains at least one principal. A statement can have a maximum of 50 principals.
     *        </p>
     *        </li>
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string for an Amazon Web Services resource-based policy.
     * </p>
     * <p>
     * The following are requirements for the resource policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contains only one action: cloudtrail-data:PutAuditEvents
     * </p>
     * </li>
     * <li>
     * <p>
     * Contains at least one statement. The policy can have a maximum of 20 statements.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement contains at least one principal. A statement can have a maximum of 50 principals.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A JSON-formatted string for an Amazon Web Services resource-based policy. </p>
     *         <p>
     *         The following are requirements for the resource policy:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contains only one action: cloudtrail-data:PutAuditEvents
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contains at least one statement. The policy can have a maximum of 20 statements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement contains at least one principal. A statement can have a maximum of 50 principals.
     *         </p>
     *         </li>
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string for an Amazon Web Services resource-based policy.
     * </p>
     * <p>
     * The following are requirements for the resource policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contains only one action: cloudtrail-data:PutAuditEvents
     * </p>
     * </li>
     * <li>
     * <p>
     * Contains at least one statement. The policy can have a maximum of 20 statements.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement contains at least one principal. A statement can have a maximum of 50 principals.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string for an Amazon Web Services resource-based policy. </p>
     *        <p>
     *        The following are requirements for the resource policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contains only one action: cloudtrail-data:PutAuditEvents
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contains at least one statement. The policy can have a maximum of 20 statements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement contains at least one principal. A statement can have a maximum of 50 principals.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
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
            sb.append("ResourcePolicy: ").append(getResourcePolicy());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
