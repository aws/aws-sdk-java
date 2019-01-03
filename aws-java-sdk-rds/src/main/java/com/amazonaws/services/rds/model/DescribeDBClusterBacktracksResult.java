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
 * Contains the result of a successful invocation of the <a>DescribeDBClusterBacktracks</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterBacktracks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterBacktracksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token that can be used in a subsequent <a>DescribeDBClusterBacktracks</a> request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBClusterBacktrack> dBClusterBacktracks;

    /**
     * <p>
     * A pagination token that can be used in a subsequent <a>DescribeDBClusterBacktracks</a> request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a subsequent <a>DescribeDBClusterBacktracks</a> request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent <a>DescribeDBClusterBacktracks</a> request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent <a>DescribeDBClusterBacktracks</a> request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent <a>DescribeDBClusterBacktracks</a> request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a subsequent <a>DescribeDBClusterBacktracks</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterBacktracksResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     * 
     * @return Contains a list of backtracks for the user.
     */

    public java.util.List<DBClusterBacktrack> getDBClusterBacktracks() {
        if (dBClusterBacktracks == null) {
            dBClusterBacktracks = new com.amazonaws.internal.SdkInternalList<DBClusterBacktrack>();
        }
        return dBClusterBacktracks;
    }

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     * 
     * @param dBClusterBacktracks
     *        Contains a list of backtracks for the user.
     */

    public void setDBClusterBacktracks(java.util.Collection<DBClusterBacktrack> dBClusterBacktracks) {
        if (dBClusterBacktracks == null) {
            this.dBClusterBacktracks = null;
            return;
        }

        this.dBClusterBacktracks = new com.amazonaws.internal.SdkInternalList<DBClusterBacktrack>(dBClusterBacktracks);
    }

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterBacktracks(java.util.Collection)} or {@link #withDBClusterBacktracks(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dBClusterBacktracks
     *        Contains a list of backtracks for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterBacktracksResult withDBClusterBacktracks(DBClusterBacktrack... dBClusterBacktracks) {
        if (this.dBClusterBacktracks == null) {
            setDBClusterBacktracks(new com.amazonaws.internal.SdkInternalList<DBClusterBacktrack>(dBClusterBacktracks.length));
        }
        for (DBClusterBacktrack ele : dBClusterBacktracks) {
            this.dBClusterBacktracks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of backtracks for the user.
     * </p>
     * 
     * @param dBClusterBacktracks
     *        Contains a list of backtracks for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterBacktracksResult withDBClusterBacktracks(java.util.Collection<DBClusterBacktrack> dBClusterBacktracks) {
        setDBClusterBacktracks(dBClusterBacktracks);
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
        if (getDBClusterBacktracks() != null)
            sb.append("DBClusterBacktracks: ").append(getDBClusterBacktracks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterBacktracksResult == false)
            return false;
        DescribeDBClusterBacktracksResult other = (DescribeDBClusterBacktracksResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusterBacktracks() == null ^ this.getDBClusterBacktracks() == null)
            return false;
        if (other.getDBClusterBacktracks() != null && other.getDBClusterBacktracks().equals(this.getDBClusterBacktracks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBClusterBacktracks() == null) ? 0 : getDBClusterBacktracks().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterBacktracksResult clone() {
        try {
            return (DescribeDBClusterBacktracksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
