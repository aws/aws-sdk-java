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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests the public keys for a specified time range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListPublicKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPublicKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest files. If
     * not specified, the current time is used, and the current public key is returned.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest files. If
     * not specified, the current time is used.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest files. If
     * not specified, the current time is used, and the current public key is returned.
     * </p>
     * 
     * @param startTime
     *        Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest
     *        files. If not specified, the current time is used, and the current public key is returned.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest files. If
     * not specified, the current time is used, and the current public key is returned.
     * </p>
     * 
     * @return Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest
     *         files. If not specified, the current time is used, and the current public key is returned.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest files. If
     * not specified, the current time is used, and the current public key is returned.
     * </p>
     * 
     * @param startTime
     *        Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest
     *        files. If not specified, the current time is used, and the current public key is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPublicKeysRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest files. If
     * not specified, the current time is used.
     * </p>
     * 
     * @param endTime
     *        Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest
     *        files. If not specified, the current time is used.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest files. If
     * not specified, the current time is used.
     * </p>
     * 
     * @return Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest
     *         files. If not specified, the current time is used.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest files. If
     * not specified, the current time is used.
     * </p>
     * 
     * @param endTime
     *        Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest
     *        files. If not specified, the current time is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPublicKeysRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPublicKeysRequest withNextToken(String nextToken) {
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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

        if (obj instanceof ListPublicKeysRequest == false)
            return false;
        ListPublicKeysRequest other = (ListPublicKeysRequest) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPublicKeysRequest clone() {
        return (ListPublicKeysRequest) super.clone();
    }

}
