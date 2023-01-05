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
public class DeleteProjectPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy you want to delete is attached to.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The name of the policy that you want to delete.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The ID of the project policy revision that you want to delete.
     * </p>
     */
    private String policyRevisionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy you want to delete is attached to.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project that the project policy you want to delete is attached to.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy you want to delete is attached to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project that the project policy you want to delete is attached to.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project that the project policy you want to delete is attached to.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project that the project policy you want to delete is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectPolicyRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The name of the policy that you want to delete.
     * </p>
     * 
     * @param policyName
     *        The name of the policy that you want to delete.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy that you want to delete.
     * </p>
     * 
     * @return The name of the policy that you want to delete.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy that you want to delete.
     * </p>
     * 
     * @param policyName
     *        The name of the policy that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The ID of the project policy revision that you want to delete.
     * </p>
     * 
     * @param policyRevisionId
     *        The ID of the project policy revision that you want to delete.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * The ID of the project policy revision that you want to delete.
     * </p>
     * 
     * @return The ID of the project policy revision that you want to delete.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * The ID of the project policy revision that you want to delete.
     * </p>
     * 
     * @param policyRevisionId
     *        The ID of the project policy revision that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectPolicyRequest withPolicyRevisionId(String policyRevisionId) {
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
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

        if (obj instanceof DeleteProjectPolicyRequest == false)
            return false;
        DeleteProjectPolicyRequest other = (DeleteProjectPolicyRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProjectPolicyRequest clone() {
        return (DeleteProjectPolicyRequest) super.clone();
    }

}
