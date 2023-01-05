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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetLineageGroupPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLineageGroupPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group.
     * </p>
     */
    private String lineageGroupArn;
    /**
     * <p>
     * The resource policy that gives access to the lineage group in another account.
     * </p>
     */
    private String resourcePolicy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @param lineageGroupArn
     *        The Amazon Resource Name (ARN) of the lineage group.
     */

    public void setLineageGroupArn(String lineageGroupArn) {
        this.lineageGroupArn = lineageGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lineage group.
     */

    public String getLineageGroupArn() {
        return this.lineageGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage group.
     * </p>
     * 
     * @param lineageGroupArn
     *        The Amazon Resource Name (ARN) of the lineage group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageGroupPolicyResult withLineageGroupArn(String lineageGroupArn) {
        setLineageGroupArn(lineageGroupArn);
        return this;
    }

    /**
     * <p>
     * The resource policy that gives access to the lineage group in another account.
     * </p>
     * 
     * @param resourcePolicy
     *        The resource policy that gives access to the lineage group in another account.
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * The resource policy that gives access to the lineage group in another account.
     * </p>
     * 
     * @return The resource policy that gives access to the lineage group in another account.
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * The resource policy that gives access to the lineage group in another account.
     * </p>
     * 
     * @param resourcePolicy
     *        The resource policy that gives access to the lineage group in another account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageGroupPolicyResult withResourcePolicy(String resourcePolicy) {
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
        if (getLineageGroupArn() != null)
            sb.append("LineageGroupArn: ").append(getLineageGroupArn()).append(",");
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

        if (obj instanceof GetLineageGroupPolicyResult == false)
            return false;
        GetLineageGroupPolicyResult other = (GetLineageGroupPolicyResult) obj;
        if (other.getLineageGroupArn() == null ^ this.getLineageGroupArn() == null)
            return false;
        if (other.getLineageGroupArn() != null && other.getLineageGroupArn().equals(this.getLineageGroupArn()) == false)
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

        hashCode = prime * hashCode + ((getLineageGroupArn() == null) ? 0 : getLineageGroupArn().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetLineageGroupPolicyResult clone() {
        try {
            return (GetLineageGroupPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
