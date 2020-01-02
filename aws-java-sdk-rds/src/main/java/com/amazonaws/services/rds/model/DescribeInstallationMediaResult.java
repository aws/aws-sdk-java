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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeInstallationMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstallationMediaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeInstallationMedia</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstallationMedia> installationMedia;

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeInstallationMedia</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <a>DescribeInstallationMedia</a> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeInstallationMedia</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <a>DescribeInstallationMedia</a> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <a>DescribeInstallationMedia</a> request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <a>DescribeInstallationMedia</a> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstallationMediaResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     * 
     * @return The list of <a>InstallationMedia</a> objects for the AWS account.
     */

    public java.util.List<InstallationMedia> getInstallationMedia() {
        if (installationMedia == null) {
            installationMedia = new com.amazonaws.internal.SdkInternalList<InstallationMedia>();
        }
        return installationMedia;
    }

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     * 
     * @param installationMedia
     *        The list of <a>InstallationMedia</a> objects for the AWS account.
     */

    public void setInstallationMedia(java.util.Collection<InstallationMedia> installationMedia) {
        if (installationMedia == null) {
            this.installationMedia = null;
            return;
        }

        this.installationMedia = new com.amazonaws.internal.SdkInternalList<InstallationMedia>(installationMedia);
    }

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstallationMedia(java.util.Collection)} or {@link #withInstallationMedia(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param installationMedia
     *        The list of <a>InstallationMedia</a> objects for the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstallationMediaResult withInstallationMedia(InstallationMedia... installationMedia) {
        if (this.installationMedia == null) {
            setInstallationMedia(new com.amazonaws.internal.SdkInternalList<InstallationMedia>(installationMedia.length));
        }
        for (InstallationMedia ele : installationMedia) {
            this.installationMedia.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     * 
     * @param installationMedia
     *        The list of <a>InstallationMedia</a> objects for the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstallationMediaResult withInstallationMedia(java.util.Collection<InstallationMedia> installationMedia) {
        setInstallationMedia(installationMedia);
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
        if (getInstallationMedia() != null)
            sb.append("InstallationMedia: ").append(getInstallationMedia());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstallationMediaResult == false)
            return false;
        DescribeInstallationMediaResult other = (DescribeInstallationMediaResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getInstallationMedia() == null ^ this.getInstallationMedia() == null)
            return false;
        if (other.getInstallationMedia() != null && other.getInstallationMedia().equals(this.getInstallationMedia()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getInstallationMedia() == null) ? 0 : getInstallationMedia().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstallationMediaResult clone() {
        try {
            return (DescribeInstallationMediaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
