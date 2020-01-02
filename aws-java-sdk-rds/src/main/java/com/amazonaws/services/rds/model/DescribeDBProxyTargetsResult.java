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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBProxyTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBProxyTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding targets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBProxyTarget> targets;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding targets.
     * </p>
     * 
     * @return An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding
     *         targets.
     */

    public java.util.List<DBProxyTarget> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<DBProxyTarget>();
        }
        return targets;
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding targets.
     * </p>
     * 
     * @param targets
     *        An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding
     *        targets.
     */

    public void setTargets(java.util.Collection<DBProxyTarget> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<DBProxyTarget>(targets);
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding
     *        targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxyTargetsResult withTargets(DBProxyTarget... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<DBProxyTarget>(targets.length));
        }
        for (DBProxyTarget ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding targets.
     * </p>
     * 
     * @param targets
     *        An arbitrary number of <code>DBProxyTarget</code> objects, containing details of the corresponding
     *        targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBProxyTargetsResult withTargets(java.util.Collection<DBProxyTarget> targets) {
        setTargets(targets);
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

    public DescribeDBProxyTargetsResult withMarker(String marker) {
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
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
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

        if (obj instanceof DescribeDBProxyTargetsResult == false)
            return false;
        DescribeDBProxyTargetsResult other = (DescribeDBProxyTargetsResult) obj;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
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

        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBProxyTargetsResult clone() {
        try {
            return (DescribeDBProxyTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
