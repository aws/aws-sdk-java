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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response to a request to list the distributions that are associated with a specified AWS WAF web ACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListDistributionsByWebACLId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDistributionsByWebACLIdResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>DistributionList</code> type.
     * </p>
     */
    private DistributionList distributionList;

    /**
     * <p>
     * The <code>DistributionList</code> type.
     * </p>
     * 
     * @param distributionList
     *        The <code>DistributionList</code> type.
     */

    public void setDistributionList(DistributionList distributionList) {
        this.distributionList = distributionList;
    }

    /**
     * <p>
     * The <code>DistributionList</code> type.
     * </p>
     * 
     * @return The <code>DistributionList</code> type.
     */

    public DistributionList getDistributionList() {
        return this.distributionList;
    }

    /**
     * <p>
     * The <code>DistributionList</code> type.
     * </p>
     * 
     * @param distributionList
     *        The <code>DistributionList</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDistributionsByWebACLIdResult withDistributionList(DistributionList distributionList) {
        setDistributionList(distributionList);
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
        if (getDistributionList() != null)
            sb.append("DistributionList: ").append(getDistributionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDistributionsByWebACLIdResult == false)
            return false;
        ListDistributionsByWebACLIdResult other = (ListDistributionsByWebACLIdResult) obj;
        if (other.getDistributionList() == null ^ this.getDistributionList() == null)
            return false;
        if (other.getDistributionList() != null && other.getDistributionList().equals(this.getDistributionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionList() == null) ? 0 : getDistributionList().hashCode());
        return hashCode;
    }

    @Override
    public ListDistributionsByWebACLIdResult clone() {
        try {
            return (ListDistributionsByWebACLIdResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
