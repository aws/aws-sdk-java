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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListPlatformVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlatformVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed information about the platforms.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlatformSummary> platformSummaryList;
    /**
     * <p>
     * The starting index into the remaining list of platforms. if this value is not <code>null</code>, you can use it
     * in a subsequent <code>ListPlatformVersion</code> call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Detailed information about the platforms.
     * </p>
     * 
     * @return Detailed information about the platforms.
     */

    public java.util.List<PlatformSummary> getPlatformSummaryList() {
        if (platformSummaryList == null) {
            platformSummaryList = new com.amazonaws.internal.SdkInternalList<PlatformSummary>();
        }
        return platformSummaryList;
    }

    /**
     * <p>
     * Detailed information about the platforms.
     * </p>
     * 
     * @param platformSummaryList
     *        Detailed information about the platforms.
     */

    public void setPlatformSummaryList(java.util.Collection<PlatformSummary> platformSummaryList) {
        if (platformSummaryList == null) {
            this.platformSummaryList = null;
            return;
        }

        this.platformSummaryList = new com.amazonaws.internal.SdkInternalList<PlatformSummary>(platformSummaryList);
    }

    /**
     * <p>
     * Detailed information about the platforms.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformSummaryList(java.util.Collection)} or {@link #withPlatformSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param platformSummaryList
     *        Detailed information about the platforms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformVersionsResult withPlatformSummaryList(PlatformSummary... platformSummaryList) {
        if (this.platformSummaryList == null) {
            setPlatformSummaryList(new com.amazonaws.internal.SdkInternalList<PlatformSummary>(platformSummaryList.length));
        }
        for (PlatformSummary ele : platformSummaryList) {
            this.platformSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Detailed information about the platforms.
     * </p>
     * 
     * @param platformSummaryList
     *        Detailed information about the platforms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformVersionsResult withPlatformSummaryList(java.util.Collection<PlatformSummary> platformSummaryList) {
        setPlatformSummaryList(platformSummaryList);
        return this;
    }

    /**
     * <p>
     * The starting index into the remaining list of platforms. if this value is not <code>null</code>, you can use it
     * in a subsequent <code>ListPlatformVersion</code> call.
     * </p>
     * 
     * @param nextToken
     *        The starting index into the remaining list of platforms. if this value is not <code>null</code>, you can
     *        use it in a subsequent <code>ListPlatformVersion</code> call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The starting index into the remaining list of platforms. if this value is not <code>null</code>, you can use it
     * in a subsequent <code>ListPlatformVersion</code> call.
     * </p>
     * 
     * @return The starting index into the remaining list of platforms. if this value is not <code>null</code>, you can
     *         use it in a subsequent <code>ListPlatformVersion</code> call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The starting index into the remaining list of platforms. if this value is not <code>null</code>, you can use it
     * in a subsequent <code>ListPlatformVersion</code> call.
     * </p>
     * 
     * @param nextToken
     *        The starting index into the remaining list of platforms. if this value is not <code>null</code>, you can
     *        use it in a subsequent <code>ListPlatformVersion</code> call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformVersionsResult withNextToken(String nextToken) {
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
        if (getPlatformSummaryList() != null)
            sb.append("PlatformSummaryList: ").append(getPlatformSummaryList()).append(",");
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

        if (obj instanceof ListPlatformVersionsResult == false)
            return false;
        ListPlatformVersionsResult other = (ListPlatformVersionsResult) obj;
        if (other.getPlatformSummaryList() == null ^ this.getPlatformSummaryList() == null)
            return false;
        if (other.getPlatformSummaryList() != null && other.getPlatformSummaryList().equals(this.getPlatformSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getPlatformSummaryList() == null) ? 0 : getPlatformSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPlatformVersionsResult clone() {
        try {
            return (ListPlatformVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
