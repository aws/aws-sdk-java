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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmClientCertificates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHsmClientCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

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
     * A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to store and
     * retrieve database encryption keys in an HSM.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HsmClientCertificate> hsmClientCertificates;

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

    public DescribeHsmClientCertificatesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to store and
     * retrieve database encryption keys in an HSM.
     * </p>
     * 
     * @return A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to
     *         store and retrieve database encryption keys in an HSM.
     */

    public java.util.List<HsmClientCertificate> getHsmClientCertificates() {
        if (hsmClientCertificates == null) {
            hsmClientCertificates = new com.amazonaws.internal.SdkInternalList<HsmClientCertificate>();
        }
        return hsmClientCertificates;
    }

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to store and
     * retrieve database encryption keys in an HSM.
     * </p>
     * 
     * @param hsmClientCertificates
     *        A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to
     *        store and retrieve database encryption keys in an HSM.
     */

    public void setHsmClientCertificates(java.util.Collection<HsmClientCertificate> hsmClientCertificates) {
        if (hsmClientCertificates == null) {
            this.hsmClientCertificates = null;
            return;
        }

        this.hsmClientCertificates = new com.amazonaws.internal.SdkInternalList<HsmClientCertificate>(hsmClientCertificates);
    }

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to store and
     * retrieve database encryption keys in an HSM.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHsmClientCertificates(java.util.Collection)} or
     * {@link #withHsmClientCertificates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hsmClientCertificates
     *        A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to
     *        store and retrieve database encryption keys in an HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmClientCertificatesResult withHsmClientCertificates(HsmClientCertificate... hsmClientCertificates) {
        if (this.hsmClientCertificates == null) {
            setHsmClientCertificates(new com.amazonaws.internal.SdkInternalList<HsmClientCertificate>(hsmClientCertificates.length));
        }
        for (HsmClientCertificate ele : hsmClientCertificates) {
            this.hsmClientCertificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to store and
     * retrieve database encryption keys in an HSM.
     * </p>
     * 
     * @param hsmClientCertificates
     *        A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to
     *        store and retrieve database encryption keys in an HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmClientCertificatesResult withHsmClientCertificates(java.util.Collection<HsmClientCertificate> hsmClientCertificates) {
        setHsmClientCertificates(hsmClientCertificates);
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
        if (getHsmClientCertificates() != null)
            sb.append("HsmClientCertificates: ").append(getHsmClientCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHsmClientCertificatesResult == false)
            return false;
        DescribeHsmClientCertificatesResult other = (DescribeHsmClientCertificatesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getHsmClientCertificates() == null ^ this.getHsmClientCertificates() == null)
            return false;
        if (other.getHsmClientCertificates() != null && other.getHsmClientCertificates().equals(this.getHsmClientCertificates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getHsmClientCertificates() == null) ? 0 : getHsmClientCertificates().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHsmClientCertificatesResult clone() {
        try {
            return (DescribeHsmClientCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
