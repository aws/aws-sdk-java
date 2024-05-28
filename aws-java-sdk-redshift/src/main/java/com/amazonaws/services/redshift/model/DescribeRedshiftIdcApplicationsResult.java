/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeRedshiftIdcApplications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRedshiftIdcApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of Amazon Redshift IAM Identity Center applications.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RedshiftIdcApplication> redshiftIdcApplications;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of Amazon Redshift IAM Identity Center applications.
     * </p>
     * 
     * @return The list of Amazon Redshift IAM Identity Center applications.
     */

    public java.util.List<RedshiftIdcApplication> getRedshiftIdcApplications() {
        if (redshiftIdcApplications == null) {
            redshiftIdcApplications = new com.amazonaws.internal.SdkInternalList<RedshiftIdcApplication>();
        }
        return redshiftIdcApplications;
    }

    /**
     * <p>
     * The list of Amazon Redshift IAM Identity Center applications.
     * </p>
     * 
     * @param redshiftIdcApplications
     *        The list of Amazon Redshift IAM Identity Center applications.
     */

    public void setRedshiftIdcApplications(java.util.Collection<RedshiftIdcApplication> redshiftIdcApplications) {
        if (redshiftIdcApplications == null) {
            this.redshiftIdcApplications = null;
            return;
        }

        this.redshiftIdcApplications = new com.amazonaws.internal.SdkInternalList<RedshiftIdcApplication>(redshiftIdcApplications);
    }

    /**
     * <p>
     * The list of Amazon Redshift IAM Identity Center applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRedshiftIdcApplications(java.util.Collection)} or
     * {@link #withRedshiftIdcApplications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param redshiftIdcApplications
     *        The list of Amazon Redshift IAM Identity Center applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRedshiftIdcApplicationsResult withRedshiftIdcApplications(RedshiftIdcApplication... redshiftIdcApplications) {
        if (this.redshiftIdcApplications == null) {
            setRedshiftIdcApplications(new com.amazonaws.internal.SdkInternalList<RedshiftIdcApplication>(redshiftIdcApplications.length));
        }
        for (RedshiftIdcApplication ele : redshiftIdcApplications) {
            this.redshiftIdcApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon Redshift IAM Identity Center applications.
     * </p>
     * 
     * @param redshiftIdcApplications
     *        The list of Amazon Redshift IAM Identity Center applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRedshiftIdcApplicationsResult withRedshiftIdcApplications(java.util.Collection<RedshiftIdcApplication> redshiftIdcApplications) {
        setRedshiftIdcApplications(redshiftIdcApplications);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *        records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *         records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *        records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRedshiftIdcApplicationsResult withMarker(String marker) {
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
        if (getRedshiftIdcApplications() != null)
            sb.append("RedshiftIdcApplications: ").append(getRedshiftIdcApplications()).append(",");
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

        if (obj instanceof DescribeRedshiftIdcApplicationsResult == false)
            return false;
        DescribeRedshiftIdcApplicationsResult other = (DescribeRedshiftIdcApplicationsResult) obj;
        if (other.getRedshiftIdcApplications() == null ^ this.getRedshiftIdcApplications() == null)
            return false;
        if (other.getRedshiftIdcApplications() != null && other.getRedshiftIdcApplications().equals(this.getRedshiftIdcApplications()) == false)
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

        hashCode = prime * hashCode + ((getRedshiftIdcApplications() == null) ? 0 : getRedshiftIdcApplications().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRedshiftIdcApplicationsResult clone() {
        try {
            return (DescribeRedshiftIdcApplicationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
