/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeDataSharesForConsumer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataSharesForConsumerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Shows the results of datashares available for consumers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DataShare> dataShares;
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeDataSharesForConsumer</a> request exceed the value specified in <code>MaxRecords</code>, Amazon Web
     * Services returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     * response records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Shows the results of datashares available for consumers.
     * </p>
     * 
     * @return Shows the results of datashares available for consumers.
     */

    public java.util.List<DataShare> getDataShares() {
        if (dataShares == null) {
            dataShares = new com.amazonaws.internal.SdkInternalList<DataShare>();
        }
        return dataShares;
    }

    /**
     * <p>
     * Shows the results of datashares available for consumers.
     * </p>
     * 
     * @param dataShares
     *        Shows the results of datashares available for consumers.
     */

    public void setDataShares(java.util.Collection<DataShare> dataShares) {
        if (dataShares == null) {
            this.dataShares = null;
            return;
        }

        this.dataShares = new com.amazonaws.internal.SdkInternalList<DataShare>(dataShares);
    }

    /**
     * <p>
     * Shows the results of datashares available for consumers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataShares(java.util.Collection)} or {@link #withDataShares(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataShares
     *        Shows the results of datashares available for consumers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSharesForConsumerResult withDataShares(DataShare... dataShares) {
        if (this.dataShares == null) {
            setDataShares(new com.amazonaws.internal.SdkInternalList<DataShare>(dataShares.length));
        }
        for (DataShare ele : dataShares) {
            this.dataShares.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Shows the results of datashares available for consumers.
     * </p>
     * 
     * @param dataShares
     *        Shows the results of datashares available for consumers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSharesForConsumerResult withDataShares(java.util.Collection<DataShare> dataShares) {
        setDataShares(dataShares);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeDataSharesForConsumer</a> request exceed the value specified in <code>MaxRecords</code>, Amazon Web
     * Services returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     * response records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeDataSharesForConsumer</a> request exceed the value specified in
     *        <code>MaxRecords</code>, Amazon Web Services returns a value in the <code>Marker</code> field of the
     *        response. You can retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeDataSharesForConsumer</a> request exceed the value specified in <code>MaxRecords</code>, Amazon Web
     * Services returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     * response records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <a>DescribeDataSharesForConsumer</a> request exceed the value specified in
     *         <code>MaxRecords</code>, Amazon Web Services returns a value in the <code>Marker</code> field of the
     *         response. You can retrieve the next set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeDataSharesForConsumer</a> request exceed the value specified in <code>MaxRecords</code>, Amazon Web
     * Services returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     * response records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeDataSharesForConsumer</a> request exceed the value specified in
     *        <code>MaxRecords</code>, Amazon Web Services returns a value in the <code>Marker</code> field of the
     *        response. You can retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSharesForConsumerResult withMarker(String marker) {
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
        if (getDataShares() != null)
            sb.append("DataShares: ").append(getDataShares()).append(",");
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

        if (obj instanceof DescribeDataSharesForConsumerResult == false)
            return false;
        DescribeDataSharesForConsumerResult other = (DescribeDataSharesForConsumerResult) obj;
        if (other.getDataShares() == null ^ this.getDataShares() == null)
            return false;
        if (other.getDataShares() != null && other.getDataShares().equals(this.getDataShares()) == false)
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

        hashCode = prime * hashCode + ((getDataShares() == null) ? 0 : getDataShares().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataSharesForConsumerResult clone() {
        try {
            return (DescribeDataSharesForConsumerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
