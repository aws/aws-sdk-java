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
 * The response from a call to <a>DescribeDBLogFiles</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBLogFiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBLogFilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The DB log files returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DescribeDBLogFilesDetails> describeDBLogFiles;
    /**
     * <p>
     * A pagination token that can be used in a subsequent DescribeDBLogFiles request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The DB log files returned.
     * </p>
     * 
     * @return The DB log files returned.
     */

    public java.util.List<DescribeDBLogFilesDetails> getDescribeDBLogFiles() {
        if (describeDBLogFiles == null) {
            describeDBLogFiles = new com.amazonaws.internal.SdkInternalList<DescribeDBLogFilesDetails>();
        }
        return describeDBLogFiles;
    }

    /**
     * <p>
     * The DB log files returned.
     * </p>
     * 
     * @param describeDBLogFiles
     *        The DB log files returned.
     */

    public void setDescribeDBLogFiles(java.util.Collection<DescribeDBLogFilesDetails> describeDBLogFiles) {
        if (describeDBLogFiles == null) {
            this.describeDBLogFiles = null;
            return;
        }

        this.describeDBLogFiles = new com.amazonaws.internal.SdkInternalList<DescribeDBLogFilesDetails>(describeDBLogFiles);
    }

    /**
     * <p>
     * The DB log files returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDescribeDBLogFiles(java.util.Collection)} or {@link #withDescribeDBLogFiles(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param describeDBLogFiles
     *        The DB log files returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesResult withDescribeDBLogFiles(DescribeDBLogFilesDetails... describeDBLogFiles) {
        if (this.describeDBLogFiles == null) {
            setDescribeDBLogFiles(new com.amazonaws.internal.SdkInternalList<DescribeDBLogFilesDetails>(describeDBLogFiles.length));
        }
        for (DescribeDBLogFilesDetails ele : describeDBLogFiles) {
            this.describeDBLogFiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The DB log files returned.
     * </p>
     * 
     * @param describeDBLogFiles
     *        The DB log files returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesResult withDescribeDBLogFiles(java.util.Collection<DescribeDBLogFilesDetails> describeDBLogFiles) {
        setDescribeDBLogFiles(describeDBLogFiles);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent DescribeDBLogFiles request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a subsequent DescribeDBLogFiles request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent DescribeDBLogFiles request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent DescribeDBLogFiles request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent DescribeDBLogFiles request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a subsequent DescribeDBLogFiles request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesResult withMarker(String marker) {
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
        if (getDescribeDBLogFiles() != null)
            sb.append("DescribeDBLogFiles: ").append(getDescribeDBLogFiles()).append(",");
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

        if (obj instanceof DescribeDBLogFilesResult == false)
            return false;
        DescribeDBLogFilesResult other = (DescribeDBLogFilesResult) obj;
        if (other.getDescribeDBLogFiles() == null ^ this.getDescribeDBLogFiles() == null)
            return false;
        if (other.getDescribeDBLogFiles() != null && other.getDescribeDBLogFiles().equals(this.getDescribeDBLogFiles()) == false)
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

        hashCode = prime * hashCode + ((getDescribeDBLogFiles() == null) ? 0 : getDescribeDBLogFiles().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBLogFilesResult clone() {
        try {
            return (DescribeDBLogFilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
