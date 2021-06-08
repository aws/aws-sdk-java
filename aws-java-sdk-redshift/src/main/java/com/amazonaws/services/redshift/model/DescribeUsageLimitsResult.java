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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeUsageLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUsageLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UsageLimit> usageLimits;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     * 
     * @return Contains the output from the <a>DescribeUsageLimits</a> action.
     */

    public java.util.List<UsageLimit> getUsageLimits() {
        if (usageLimits == null) {
            usageLimits = new com.amazonaws.internal.SdkInternalList<UsageLimit>();
        }
        return usageLimits;
    }

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     * 
     * @param usageLimits
     *        Contains the output from the <a>DescribeUsageLimits</a> action.
     */

    public void setUsageLimits(java.util.Collection<UsageLimit> usageLimits) {
        if (usageLimits == null) {
            this.usageLimits = null;
            return;
        }

        this.usageLimits = new com.amazonaws.internal.SdkInternalList<UsageLimit>(usageLimits);
    }

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsageLimits(java.util.Collection)} or {@link #withUsageLimits(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param usageLimits
     *        Contains the output from the <a>DescribeUsageLimits</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsageLimitsResult withUsageLimits(UsageLimit... usageLimits) {
        if (this.usageLimits == null) {
            setUsageLimits(new com.amazonaws.internal.SdkInternalList<UsageLimit>(usageLimits.length));
        }
        for (UsageLimit ele : usageLimits) {
            this.usageLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the output from the <a>DescribeUsageLimits</a> action.
     * </p>
     * 
     * @param usageLimits
     *        Contains the output from the <a>DescribeUsageLimits</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsageLimitsResult withUsageLimits(java.util.Collection<UsageLimit> usageLimits) {
        setUsageLimits(usageLimits);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *         field is empty, all response records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsageLimitsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getUsageLimits() != null)
            sb.append("UsageLimits: ").append(getUsageLimits()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUsageLimitsResult == false)
            return false;
        DescribeUsageLimitsResult other = (DescribeUsageLimitsResult) obj;
        if (other.getUsageLimits() == null ^ this.getUsageLimits() == null)
            return false;
        if (other.getUsageLimits() != null && other.getUsageLimits().equals(this.getUsageLimits()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageLimits() == null) ? 0 : getUsageLimits().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUsageLimitsResult clone() {
        try {
            return (DescribeUsageLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
