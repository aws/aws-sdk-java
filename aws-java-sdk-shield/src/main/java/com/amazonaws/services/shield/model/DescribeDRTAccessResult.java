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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeDRTAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDRTAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     */
    private java.util.List<String> logBucketList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDRTAccessResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     * 
     * @return The list of Amazon S3 buckets accessed by the DRT.
     */

    public java.util.List<String> getLogBucketList() {
        return logBucketList;
    }

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     * 
     * @param logBucketList
     *        The list of Amazon S3 buckets accessed by the DRT.
     */

    public void setLogBucketList(java.util.Collection<String> logBucketList) {
        if (logBucketList == null) {
            this.logBucketList = null;
            return;
        }

        this.logBucketList = new java.util.ArrayList<String>(logBucketList);
    }

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogBucketList(java.util.Collection)} or {@link #withLogBucketList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logBucketList
     *        The list of Amazon S3 buckets accessed by the DRT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDRTAccessResult withLogBucketList(String... logBucketList) {
        if (this.logBucketList == null) {
            setLogBucketList(new java.util.ArrayList<String>(logBucketList.length));
        }
        for (String ele : logBucketList) {
            this.logBucketList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     * 
     * @param logBucketList
     *        The list of Amazon S3 buckets accessed by the DRT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDRTAccessResult withLogBucketList(java.util.Collection<String> logBucketList) {
        setLogBucketList(logBucketList);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLogBucketList() != null)
            sb.append("LogBucketList: ").append(getLogBucketList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDRTAccessResult == false)
            return false;
        DescribeDRTAccessResult other = (DescribeDRTAccessResult) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLogBucketList() == null ^ this.getLogBucketList() == null)
            return false;
        if (other.getLogBucketList() != null && other.getLogBucketList().equals(this.getLogBucketList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLogBucketList() == null) ? 0 : getLogBucketList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDRTAccessResult clone() {
        try {
            return (DescribeDRTAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
