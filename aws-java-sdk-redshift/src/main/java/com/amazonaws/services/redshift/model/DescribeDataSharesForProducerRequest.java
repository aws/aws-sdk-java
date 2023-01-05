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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeDataSharesForProducer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataSharesForProducerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the producer that returns in the list of datashares.
     * </p>
     */
    private String producerArn;
    /**
     * <p>
     * An identifier giving the status of a datashare in the producer. If this field is specified, Amazon Redshift
     * returns the list of datashares that have the specified status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeDataSharesForProducer</a> request exceed the value specified in <code>MaxRecords</code>, Amazon Web
     * Services returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     * response records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the producer that returns in the list of datashares.
     * </p>
     * 
     * @param producerArn
     *        The Amazon Resource Name (ARN) of the producer that returns in the list of datashares.
     */

    public void setProducerArn(String producerArn) {
        this.producerArn = producerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the producer that returns in the list of datashares.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the producer that returns in the list of datashares.
     */

    public String getProducerArn() {
        return this.producerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the producer that returns in the list of datashares.
     * </p>
     * 
     * @param producerArn
     *        The Amazon Resource Name (ARN) of the producer that returns in the list of datashares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSharesForProducerRequest withProducerArn(String producerArn) {
        setProducerArn(producerArn);
        return this;
    }

    /**
     * <p>
     * An identifier giving the status of a datashare in the producer. If this field is specified, Amazon Redshift
     * returns the list of datashares that have the specified status.
     * </p>
     * 
     * @param status
     *        An identifier giving the status of a datashare in the producer. If this field is specified, Amazon
     *        Redshift returns the list of datashares that have the specified status.
     * @see DataShareStatusForProducer
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * An identifier giving the status of a datashare in the producer. If this field is specified, Amazon Redshift
     * returns the list of datashares that have the specified status.
     * </p>
     * 
     * @return An identifier giving the status of a datashare in the producer. If this field is specified, Amazon
     *         Redshift returns the list of datashares that have the specified status.
     * @see DataShareStatusForProducer
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * An identifier giving the status of a datashare in the producer. If this field is specified, Amazon Redshift
     * returns the list of datashares that have the specified status.
     * </p>
     * 
     * @param status
     *        An identifier giving the status of a datashare in the producer. If this field is specified, Amazon
     *        Redshift returns the list of datashares that have the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataShareStatusForProducer
     */

    public DescribeDataSharesForProducerRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An identifier giving the status of a datashare in the producer. If this field is specified, Amazon Redshift
     * returns the list of datashares that have the specified status.
     * </p>
     * 
     * @param status
     *        An identifier giving the status of a datashare in the producer. If this field is specified, Amazon
     *        Redshift returns the list of datashares that have the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataShareStatusForProducer
     */

    public DescribeDataSharesForProducerRequest withStatus(DataShareStatusForProducer status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         marker value.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSharesForProducerRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeDataSharesForProducer</a> request exceed the value specified in <code>MaxRecords</code>, Amazon Web
     * Services returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     * response records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeDataSharesForProducer</a> request exceed the value specified in
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
     * a <a>DescribeDataSharesForProducer</a> request exceed the value specified in <code>MaxRecords</code>, Amazon Web
     * Services returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     * response records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <a>DescribeDataSharesForProducer</a> request exceed the value specified in
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
     * a <a>DescribeDataSharesForProducer</a> request exceed the value specified in <code>MaxRecords</code>, Amazon Web
     * Services returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     * response records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     * request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeDataSharesForProducer</a> request exceed the value specified in
     *        <code>MaxRecords</code>, Amazon Web Services returns a value in the <code>Marker</code> field of the
     *        response. You can retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSharesForProducerRequest withMarker(String marker) {
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
        if (getProducerArn() != null)
            sb.append("ProducerArn: ").append(getProducerArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
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

        if (obj instanceof DescribeDataSharesForProducerRequest == false)
            return false;
        DescribeDataSharesForProducerRequest other = (DescribeDataSharesForProducerRequest) obj;
        if (other.getProducerArn() == null ^ this.getProducerArn() == null)
            return false;
        if (other.getProducerArn() != null && other.getProducerArn().equals(this.getProducerArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
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

        hashCode = prime * hashCode + ((getProducerArn() == null) ? 0 : getProducerArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataSharesForProducerRequest clone() {
        return (DescribeDataSharesForProducerRequest) super.clone();
    }

}
