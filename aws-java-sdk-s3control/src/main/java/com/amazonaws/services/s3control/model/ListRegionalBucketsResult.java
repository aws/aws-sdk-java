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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListRegionalBuckets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRegionalBucketsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /** <p/> */
    private java.util.List<RegionalBucket> regionalBucketList;
    /**
     * <p>
     * <code>NextToken</code> is sent when <code>isTruncated</code> is true, which means there are more buckets that can
     * be listed. The next list requests to Amazon S3 can be continued with this <code>NextToken</code>.
     * <code>NextToken</code> is obfuscated and is not a real key.
     * </p>
     */
    private String nextToken;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<RegionalBucket> getRegionalBucketList() {
        return regionalBucketList;
    }

    /**
     * <p/>
     * 
     * @param regionalBucketList
     */

    public void setRegionalBucketList(java.util.Collection<RegionalBucket> regionalBucketList) {
        if (regionalBucketList == null) {
            this.regionalBucketList = null;
            return;
        }

        this.regionalBucketList = new java.util.ArrayList<RegionalBucket>(regionalBucketList);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionalBucketList(java.util.Collection)} or {@link #withRegionalBucketList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param regionalBucketList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionalBucketsResult withRegionalBucketList(RegionalBucket... regionalBucketList) {
        if (this.regionalBucketList == null) {
            setRegionalBucketList(new java.util.ArrayList<RegionalBucket>(regionalBucketList.length));
        }
        for (RegionalBucket ele : regionalBucketList) {
            this.regionalBucketList.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param regionalBucketList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionalBucketsResult withRegionalBucketList(java.util.Collection<RegionalBucket> regionalBucketList) {
        setRegionalBucketList(regionalBucketList);
        return this;
    }

    /**
     * <p>
     * <code>NextToken</code> is sent when <code>isTruncated</code> is true, which means there are more buckets that can
     * be listed. The next list requests to Amazon S3 can be continued with this <code>NextToken</code>.
     * <code>NextToken</code> is obfuscated and is not a real key.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is sent when <code>isTruncated</code> is true, which means there are more buckets
     *        that can be listed. The next list requests to Amazon S3 can be continued with this <code>NextToken</code>.
     *        <code>NextToken</code> is obfuscated and is not a real key.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is sent when <code>isTruncated</code> is true, which means there are more buckets that can
     * be listed. The next list requests to Amazon S3 can be continued with this <code>NextToken</code>.
     * <code>NextToken</code> is obfuscated and is not a real key.
     * </p>
     * 
     * @return <code>NextToken</code> is sent when <code>isTruncated</code> is true, which means there are more buckets
     *         that can be listed. The next list requests to Amazon S3 can be continued with this <code>NextToken</code>
     *         . <code>NextToken</code> is obfuscated and is not a real key.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is sent when <code>isTruncated</code> is true, which means there are more buckets that can
     * be listed. The next list requests to Amazon S3 can be continued with this <code>NextToken</code>.
     * <code>NextToken</code> is obfuscated and is not a real key.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is sent when <code>isTruncated</code> is true, which means there are more buckets
     *        that can be listed. The next list requests to Amazon S3 can be continued with this <code>NextToken</code>.
     *        <code>NextToken</code> is obfuscated and is not a real key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionalBucketsResult withNextToken(String nextToken) {
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
        if (getRegionalBucketList() != null)
            sb.append("RegionalBucketList: ").append(getRegionalBucketList()).append(",");
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

        if (obj instanceof ListRegionalBucketsResult == false)
            return false;
        ListRegionalBucketsResult other = (ListRegionalBucketsResult) obj;
        if (other.getRegionalBucketList() == null ^ this.getRegionalBucketList() == null)
            return false;
        if (other.getRegionalBucketList() != null && other.getRegionalBucketList().equals(this.getRegionalBucketList()) == false)
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

        hashCode = prime * hashCode + ((getRegionalBucketList() == null) ? 0 : getRegionalBucketList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRegionalBucketsResult clone() {
        try {
            return (ListRegionalBucketsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
