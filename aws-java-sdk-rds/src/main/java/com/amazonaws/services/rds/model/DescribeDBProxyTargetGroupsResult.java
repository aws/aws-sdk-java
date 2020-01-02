/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyTargetGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBProxyTargetGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding target
     * groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBProxyTargetGroup> targetGroups;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding target
     * groups.
     * </p>
     * 
     * @return An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding
     *         target groups.
     */

    public java.util.List<DBProxyTargetGroup> getTargetGroups() {
        if (targetGroups == null) {
            targetGroups = new com.amazonaws.internal.SdkInternalList<DBProxyTargetGroup>();
        }
        return targetGroups;
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding target
     * groups.
     * </p>
     * 
     * @param targetGroups
     *        An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding
     *        target groups.
     */

    public void setTargetGroups(java.util.Collection<DBProxyTargetGroup> targetGroups) {
        if (targetGroups == null) {
            this.targetGroups = null;
            return;
        }

        this.targetGroups = new com.amazonaws.internal.SdkInternalList<DBProxyTargetGroup>(targetGroups);
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding target
     * groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroups(java.util.Collection)} or {@link #withTargetGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetGroups
     *        An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding
     *        target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxyTargetGroupsResult withTargetGroups(DBProxyTargetGroup... targetGroups) {
        if (this.targetGroups == null) {
            setTargetGroups(new com.amazonaws.internal.SdkInternalList<DBProxyTargetGroup>(targetGroups.length));
        }
        for (DBProxyTargetGroup ele : targetGroups) {
            this.targetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding target
     * groups.
     * </p>
     * 
     * @param targetGroups
     *        An arbitrary number of <code>DBProxyTargetGroup</code> objects, containing details of the corresponding
     *        target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxyTargetGroupsResult withTargetGroups(java.util.Collection<DBProxyTargetGroup> targetGroups) {
        setTargetGroups(targetGroups);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxyTargetGroupsResult withMarker(String marker) {
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
        if (getTargetGroups() != null)
            sb.append("TargetGroups: ").append(getTargetGroups()).append(",");
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

        if (obj instanceof DescribeDBProxyTargetGroupsResult == false)
            return false;
        DescribeDBProxyTargetGroupsResult other = (DescribeDBProxyTargetGroupsResult) obj;
        if (other.getTargetGroups() == null ^ this.getTargetGroups() == null)
            return false;
        if (other.getTargetGroups() != null && other.getTargetGroups().equals(this.getTargetGroups()) == false)
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

        hashCode = prime * hashCode + ((getTargetGroups() == null) ? 0 : getTargetGroups().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBProxyTargetGroupsResult clone() {
        try {
            return (DescribeDBProxyTargetGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
