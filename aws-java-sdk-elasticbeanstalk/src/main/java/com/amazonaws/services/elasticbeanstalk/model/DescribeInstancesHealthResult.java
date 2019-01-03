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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Detailed health information about the Amazon EC2 instances in an AWS Elastic Beanstalk environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeInstancesHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancesHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There is a difference in the members that are
     * supported under the <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SingleInstanceHealth> instanceHealthList;
    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     */
    private java.util.Date refreshedAt;
    /**
     * <p>
     * Pagination token for the next page of results, if available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There is a difference in the members that are
     * supported under the <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     * 
     * @return Detailed health information about each instance.</p>
     *         <p>
     *         The output differs slightly between Linux and Windows environments. There is a difference in the members
     *         that are supported under the <code>&lt;CPUUtilization&gt;</code> type.
     */

    public java.util.List<SingleInstanceHealth> getInstanceHealthList() {
        if (instanceHealthList == null) {
            instanceHealthList = new com.amazonaws.internal.SdkInternalList<SingleInstanceHealth>();
        }
        return instanceHealthList;
    }

    /**
     * <p>
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There is a difference in the members that are
     * supported under the <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     * 
     * @param instanceHealthList
     *        Detailed health information about each instance.</p>
     *        <p>
     *        The output differs slightly between Linux and Windows environments. There is a difference in the members
     *        that are supported under the <code>&lt;CPUUtilization&gt;</code> type.
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
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There is a difference in the members that are
     * supported under the <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceHealthList(java.util.Collection)} or {@link #withInstanceHealthList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceHealthList
     *        Detailed health information about each instance.</p>
     *        <p>
     *        The output differs slightly between Linux and Windows environments. There is a difference in the members
     *        that are supported under the <code>&lt;CPUUtilization&gt;</code> type.
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
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There is a difference in the members that are
     * supported under the <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     * 
     * @param instanceHealthList
     *        Detailed health information about each instance.</p>
     *        <p>
     *        The output differs slightly between Linux and Windows environments. There is a difference in the members
     *        that are supported under the <code>&lt;CPUUtilization&gt;</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthResult withInstanceHealthList(java.util.Collection<SingleInstanceHealth> instanceHealthList) {
        setInstanceHealthList(instanceHealthList);
        return this;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     * 
     * @param refreshedAt
     *        The date and time that the health information was retrieved.
     */

    public void setRefreshedAt(java.util.Date refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     * 
     * @return The date and time that the health information was retrieved.
     */

    public java.util.Date getRefreshedAt() {
        return this.refreshedAt;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     * 
     * @param refreshedAt
     *        The date and time that the health information was retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthResult withRefreshedAt(java.util.Date refreshedAt) {
        setRefreshedAt(refreshedAt);
        return this;
    }

    /**
     * <p>
     * Pagination token for the next page of results, if available.
     * </p>
     * 
     * @param nextToken
     *        Pagination token for the next page of results, if available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token for the next page of results, if available.
     * </p>
     * 
     * @return Pagination token for the next page of results, if available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token for the next page of results, if available.
     * </p>
     * 
     * @param nextToken
     *        Pagination token for the next page of results, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthResult withNextToken(String nextToken) {
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
        if (getInstanceHealthList() != null)
            sb.append("InstanceHealthList: ").append(getInstanceHealthList()).append(",");
        if (getRefreshedAt() != null)
            sb.append("RefreshedAt: ").append(getRefreshedAt()).append(",");
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
