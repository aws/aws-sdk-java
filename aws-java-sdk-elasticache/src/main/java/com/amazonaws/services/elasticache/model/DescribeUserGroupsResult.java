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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeUserGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of user groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UserGroup> userGroups;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Returns a list of user groups.
     * </p>
     * 
     * @return Returns a list of user groups.
     */

    public java.util.List<UserGroup> getUserGroups() {
        if (userGroups == null) {
            userGroups = new com.amazonaws.internal.SdkInternalList<UserGroup>();
        }
        return userGroups;
    }

    /**
     * <p>
     * Returns a list of user groups.
     * </p>
     * 
     * @param userGroups
     *        Returns a list of user groups.
     */

    public void setUserGroups(java.util.Collection<UserGroup> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
            return;
        }

        this.userGroups = new com.amazonaws.internal.SdkInternalList<UserGroup>(userGroups);
    }

    /**
     * <p>
     * Returns a list of user groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroups(java.util.Collection)} or {@link #withUserGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userGroups
     *        Returns a list of user groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserGroupsResult withUserGroups(UserGroup... userGroups) {
        if (this.userGroups == null) {
            setUserGroups(new com.amazonaws.internal.SdkInternalList<UserGroup>(userGroups.length));
        }
        for (UserGroup ele : userGroups) {
            this.userGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of user groups.
     * </p>
     * 
     * @param userGroups
     *        Returns a list of user groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserGroupsResult withUserGroups(java.util.Collection<UserGroup> userGroups) {
        setUserGroups(userGroups);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords. &gt;
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by MaxRecords. &gt;
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords. &gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserGroupsResult withMarker(String marker) {
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
        if (getUserGroups() != null)
            sb.append("UserGroups: ").append(getUserGroups()).append(",");
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

        if (obj instanceof DescribeUserGroupsResult == false)
            return false;
        DescribeUserGroupsResult other = (DescribeUserGroupsResult) obj;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null && other.getUserGroups().equals(this.getUserGroups()) == false)
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

        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserGroupsResult clone() {
        try {
            return (DescribeUserGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
