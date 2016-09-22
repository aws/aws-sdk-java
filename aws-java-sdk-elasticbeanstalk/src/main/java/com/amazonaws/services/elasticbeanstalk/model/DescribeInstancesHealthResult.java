/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * See the example below for a sample response.
 * </p>
 */
public class DescribeInstancesHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the response body with information about the health of the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SingleInstanceHealth> instanceHealthList;
    /**
     * <p>
     * The date and time the information was last refreshed.
     * </p>
     */
    private java.util.Date refreshedAt;
    /**
     * <p>
     * The next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the response body with information about the health of the instance.
     * </p>
     * 
     * @return Contains the response body with information about the health of the instance.
     */

    public java.util.List<SingleInstanceHealth> getInstanceHealthList() {
        if (instanceHealthList == null) {
            instanceHealthList = new com.amazonaws.internal.SdkInternalList<SingleInstanceHealth>();
        }
        return instanceHealthList;
    }

    /**
     * <p>
     * Contains the response body with information about the health of the instance.
     * </p>
     * 
     * @param instanceHealthList
     *        Contains the response body with information about the health of the instance.
     */

    public void setInstanceHealthList(java.util.Collection<SingleInstanceHealth> instanceHealthList) {
        if (instanceHealthList == null) {
            this.instanceHealthList = null;
            return;
        }

        this.instanceHealthList = new com.amazonaws.internal.SdkInternalList<SingleInstanceHealth>(instanceHealthList);
    }

    /**
     * <p>
     * Contains the response body with information about the health of the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceHealthList(java.util.Collection)} or {@link #withInstanceHealthList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceHealthList
     *        Contains the response body with information about the health of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthResult withInstanceHealthList(SingleInstanceHealth... instanceHealthList) {
        if (this.instanceHealthList == null) {
            setInstanceHealthList(new com.amazonaws.internal.SdkInternalList<SingleInstanceHealth>(instanceHealthList.length));
        }
        for (SingleInstanceHealth ele : instanceHealthList) {
            this.instanceHealthList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the response body with information about the health of the instance.
     * </p>
     * 
     * @param instanceHealthList
     *        Contains the response body with information about the health of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthResult withInstanceHealthList(java.util.Collection<SingleInstanceHealth> instanceHealthList) {
        setInstanceHealthList(instanceHealthList);
        return this;
    }

    /**
     * <p>
     * The date and time the information was last refreshed.
     * </p>
     * 
     * @param refreshedAt
     *        The date and time the information was last refreshed.
     */

    public void setRefreshedAt(java.util.Date refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * <p>
     * The date and time the information was last refreshed.
     * </p>
     * 
     * @return The date and time the information was last refreshed.
     */

    public java.util.Date getRefreshedAt() {
        return this.refreshedAt;
    }

    /**
     * <p>
     * The date and time the information was last refreshed.
     * </p>
     * 
     * @param refreshedAt
     *        The date and time the information was last refreshed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthResult withRefreshedAt(java.util.Date refreshedAt) {
        setRefreshedAt(refreshedAt);
        return this;
    }

    /**
     * <p>
     * The next token.
     * </p>
     * 
     * @param nextToken
     *        The next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token.
     * </p>
     * 
     * @return The next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token.
     * </p>
     * 
     * @param nextToken
     *        The next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceHealthList() != null)
            sb.append("InstanceHealthList: " + getInstanceHealthList() + ",");
        if (getRefreshedAt() != null)
            sb.append("RefreshedAt: " + getRefreshedAt() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancesHealthResult == false)
            return false;
        DescribeInstancesHealthResult other = (DescribeInstancesHealthResult) obj;
        if (other.getInstanceHealthList() == null ^ this.getInstanceHealthList() == null)
            return false;
        if (other.getInstanceHealthList() != null && other.getInstanceHealthList().equals(this.getInstanceHealthList()) == false)
            return false;
        if (other.getRefreshedAt() == null ^ this.getRefreshedAt() == null)
            return false;
        if (other.getRefreshedAt() != null && other.getRefreshedAt().equals(this.getRefreshedAt()) == false)
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

        hashCode = prime * hashCode + ((getInstanceHealthList() == null) ? 0 : getInstanceHealthList().hashCode());
        hashCode = prime * hashCode + ((getRefreshedAt() == null) ? 0 : getRefreshedAt().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancesHealthResult clone() {
        try {
            return (DescribeInstancesHealthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
