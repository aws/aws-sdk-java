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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of a successful invocation of the <a>DescribeSourceRegions</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeSourceRegions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSourceRegionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get a Read
     * Replica or a DB snapshot from.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SourceRegion> sourceRegions;

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

    public DescribeSourceRegionsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get a Read
     * Replica or a DB snapshot from.
     * </p>
     * 
     * @return A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get
     *         a Read Replica or a DB snapshot from.
     */

    public java.util.List<SourceRegion> getSourceRegions() {
        if (sourceRegions == null) {
            sourceRegions = new com.amazonaws.internal.SdkInternalList<SourceRegion>();
        }
        return sourceRegions;
    }

    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get a Read
     * Replica or a DB snapshot from.
     * </p>
     * 
     * @param sourceRegions
     *        A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get
     *        a Read Replica or a DB snapshot from.
     */

    public void setSourceRegions(java.util.Collection<SourceRegion> sourceRegions) {
        if (sourceRegions == null) {
            this.sourceRegions = null;
            return;
        }

        this.sourceRegions = new com.amazonaws.internal.SdkInternalList<SourceRegion>(sourceRegions);
    }

    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get a Read
     * Replica or a DB snapshot from.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceRegions(java.util.Collection)} or {@link #withSourceRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceRegions
     *        A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get
     *        a Read Replica or a DB snapshot from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceRegionsResult withSourceRegions(SourceRegion... sourceRegions) {
        if (this.sourceRegions == null) {
            setSourceRegions(new com.amazonaws.internal.SdkInternalList<SourceRegion>(sourceRegions.length));
        }
        for (SourceRegion ele : sourceRegions) {
            this.sourceRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get a Read
     * Replica or a DB snapshot from.
     * </p>
     * 
     * @param sourceRegions
     *        A list of SourceRegion instances that contains each source AWS Region that the current AWS Region can get
     *        a Read Replica or a DB snapshot from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceRegionsResult withSourceRegions(java.util.Collection<SourceRegion> sourceRegions) {
        setSourceRegions(sourceRegions);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getSourceRegions() != null)
            sb.append("SourceRegions: ").append(getSourceRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSourceRegionsResult == false)
            return false;
        DescribeSourceRegionsResult other = (DescribeSourceRegionsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getSourceRegions() == null ^ this.getSourceRegions() == null)
            return false;
        if (other.getSourceRegions() != null && other.getSourceRegions().equals(this.getSourceRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getSourceRegions() == null) ? 0 : getSourceRegions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSourceRegionsResult clone() {
        try {
            return (DescribeSourceRegionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
