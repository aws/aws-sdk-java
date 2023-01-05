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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceTypesFromInstanceRequirementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The instance types with the specified instance attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceTypeInfoFromInstanceRequirements> instanceTypes;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The instance types with the specified instance attributes.
     * </p>
     * 
     * @return The instance types with the specified instance attributes.
     */

    public java.util.List<InstanceTypeInfoFromInstanceRequirements> getInstanceTypes() {
        if (instanceTypes == null) {
            instanceTypes = new com.amazonaws.internal.SdkInternalList<InstanceTypeInfoFromInstanceRequirements>();
        }
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types with the specified instance attributes.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types with the specified instance attributes.
     */

    public void setInstanceTypes(java.util.Collection<InstanceTypeInfoFromInstanceRequirements> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new com.amazonaws.internal.SdkInternalList<InstanceTypeInfoFromInstanceRequirements>(instanceTypes);
    }

    /**
     * <p>
     * The instance types with the specified instance attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types with the specified instance attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTypesFromInstanceRequirementsResult withInstanceTypes(InstanceTypeInfoFromInstanceRequirements... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new com.amazonaws.internal.SdkInternalList<InstanceTypeInfoFromInstanceRequirements>(instanceTypes.length));
        }
        for (InstanceTypeInfoFromInstanceRequirements ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types with the specified instance attributes.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types with the specified instance attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTypesFromInstanceRequirementsResult withInstanceTypes(java.util.Collection<InstanceTypeInfoFromInstanceRequirements> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTypesFromInstanceRequirementsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceTypesFromInstanceRequirementsResult == false)
            return false;
        GetInstanceTypesFromInstanceRequirementsResult other = (GetInstanceTypesFromInstanceRequirementsResult) obj;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceTypesFromInstanceRequirementsResult clone() {
        try {
            return (GetInstanceTypesFromInstanceRequirementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
