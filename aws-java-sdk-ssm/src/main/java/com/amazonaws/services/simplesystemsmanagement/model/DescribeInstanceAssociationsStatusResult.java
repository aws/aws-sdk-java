/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceAssociationsStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceAssociationsStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Status information about the association.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceAssociationStatusInfo> instanceAssociationStatusInfos;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Status information about the association.
     * </p>
     * 
     * @return Status information about the association.
     */

    public java.util.List<InstanceAssociationStatusInfo> getInstanceAssociationStatusInfos() {
        if (instanceAssociationStatusInfos == null) {
            instanceAssociationStatusInfos = new com.amazonaws.internal.SdkInternalList<InstanceAssociationStatusInfo>();
        }
        return instanceAssociationStatusInfos;
    }

    /**
     * <p>
     * Status information about the association.
     * </p>
     * 
     * @param instanceAssociationStatusInfos
     *        Status information about the association.
     */

    public void setInstanceAssociationStatusInfos(java.util.Collection<InstanceAssociationStatusInfo> instanceAssociationStatusInfos) {
        if (instanceAssociationStatusInfos == null) {
            this.instanceAssociationStatusInfos = null;
            return;
        }

        this.instanceAssociationStatusInfos = new com.amazonaws.internal.SdkInternalList<InstanceAssociationStatusInfo>(instanceAssociationStatusInfos);
    }

    /**
     * <p>
     * Status information about the association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceAssociationStatusInfos(java.util.Collection)} or
     * {@link #withInstanceAssociationStatusInfos(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceAssociationStatusInfos
     *        Status information about the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceAssociationsStatusResult withInstanceAssociationStatusInfos(InstanceAssociationStatusInfo... instanceAssociationStatusInfos) {
        if (this.instanceAssociationStatusInfos == null) {
            setInstanceAssociationStatusInfos(new com.amazonaws.internal.SdkInternalList<InstanceAssociationStatusInfo>(instanceAssociationStatusInfos.length));
        }
        for (InstanceAssociationStatusInfo ele : instanceAssociationStatusInfos) {
            this.instanceAssociationStatusInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Status information about the association.
     * </p>
     * 
     * @param instanceAssociationStatusInfos
     *        Status information about the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceAssociationsStatusResult withInstanceAssociationStatusInfos(
            java.util.Collection<InstanceAssociationStatusInfo> instanceAssociationStatusInfos) {
        setInstanceAssociationStatusInfos(instanceAssociationStatusInfos);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceAssociationsStatusResult withNextToken(String nextToken) {
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
        if (getInstanceAssociationStatusInfos() != null)
            sb.append("InstanceAssociationStatusInfos: ").append(getInstanceAssociationStatusInfos()).append(",");
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

        if (obj instanceof DescribeInstanceAssociationsStatusResult == false)
            return false;
        DescribeInstanceAssociationsStatusResult other = (DescribeInstanceAssociationsStatusResult) obj;
        if (other.getInstanceAssociationStatusInfos() == null ^ this.getInstanceAssociationStatusInfos() == null)
            return false;
        if (other.getInstanceAssociationStatusInfos() != null
                && other.getInstanceAssociationStatusInfos().equals(this.getInstanceAssociationStatusInfos()) == false)
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

        hashCode = prime * hashCode + ((getInstanceAssociationStatusInfos() == null) ? 0 : getInstanceAssociationStatusInfos().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceAssociationsStatusResult clone() {
        try {
            return (DescribeInstanceAssociationsStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
