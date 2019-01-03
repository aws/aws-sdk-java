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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTableRestoreStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTableRestoreStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TableRestoreStatus> tableRestoreStatusDetails;
    /**
     * <p>
     * A pagination token that can be used in a subsequent <a>DescribeTableRestoreStatus</a> request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     * 
     * @return A list of status details for one or more table restore requests.
     */

    public java.util.List<TableRestoreStatus> getTableRestoreStatusDetails() {
        if (tableRestoreStatusDetails == null) {
            tableRestoreStatusDetails = new com.amazonaws.internal.SdkInternalList<TableRestoreStatus>();
        }
        return tableRestoreStatusDetails;
    }

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     * 
     * @param tableRestoreStatusDetails
     *        A list of status details for one or more table restore requests.
     */

    public void setTableRestoreStatusDetails(java.util.Collection<TableRestoreStatus> tableRestoreStatusDetails) {
        if (tableRestoreStatusDetails == null) {
            this.tableRestoreStatusDetails = null;
            return;
        }

        this.tableRestoreStatusDetails = new com.amazonaws.internal.SdkInternalList<TableRestoreStatus>(tableRestoreStatusDetails);
    }

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableRestoreStatusDetails(java.util.Collection)} or
     * {@link #withTableRestoreStatusDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param tableRestoreStatusDetails
     *        A list of status details for one or more table restore requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableRestoreStatusResult withTableRestoreStatusDetails(TableRestoreStatus... tableRestoreStatusDetails) {
        if (this.tableRestoreStatusDetails == null) {
            setTableRestoreStatusDetails(new com.amazonaws.internal.SdkInternalList<TableRestoreStatus>(tableRestoreStatusDetails.length));
        }
        for (TableRestoreStatus ele : tableRestoreStatusDetails) {
            this.tableRestoreStatusDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     * 
     * @param tableRestoreStatusDetails
     *        A list of status details for one or more table restore requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableRestoreStatusResult withTableRestoreStatusDetails(java.util.Collection<TableRestoreStatus> tableRestoreStatusDetails) {
        setTableRestoreStatusDetails(tableRestoreStatusDetails);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent <a>DescribeTableRestoreStatus</a> request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a subsequent <a>DescribeTableRestoreStatus</a> request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent <a>DescribeTableRestoreStatus</a> request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent <a>DescribeTableRestoreStatus</a> request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent <a>DescribeTableRestoreStatus</a> request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a subsequent <a>DescribeTableRestoreStatus</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTableRestoreStatusResult withMarker(String marker) {
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
        if (getTableRestoreStatusDetails() != null)
            sb.append("TableRestoreStatusDetails: ").append(getTableRestoreStatusDetails()).append(",");
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

        if (obj instanceof DescribeTableRestoreStatusResult == false)
            return false;
        DescribeTableRestoreStatusResult other = (DescribeTableRestoreStatusResult) obj;
        if (other.getTableRestoreStatusDetails() == null ^ this.getTableRestoreStatusDetails() == null)
            return false;
        if (other.getTableRestoreStatusDetails() != null && other.getTableRestoreStatusDetails().equals(this.getTableRestoreStatusDetails()) == false)
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

        hashCode = prime * hashCode + ((getTableRestoreStatusDetails() == null) ? 0 : getTableRestoreStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTableRestoreStatusResult clone() {
        try {
            return (DescribeTableRestoreStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
