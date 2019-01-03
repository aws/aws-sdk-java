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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClusterParametersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a cluster parameter group for which to return details.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The parameter types to return. Specify <code>user</code> to show parameters that are different form the default.
     * Similarly, specify <code>engine-default</code> to show parameters that are the same as the default parameter
     * group.
     * </p>
     * <p>
     * Default: All parameter types returned.
     * </p>
     * <p>
     * Valid Values: <code>user</code> | <code>engine-default</code>
     * </p>
     */
    private String source;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeClusterParameters</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The name of a cluster parameter group for which to return details.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of a cluster parameter group for which to return details.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of a cluster parameter group for which to return details.
     * </p>
     * 
     * @return The name of a cluster parameter group for which to return details.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of a cluster parameter group for which to return details.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of a cluster parameter group for which to return details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterParametersRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The parameter types to return. Specify <code>user</code> to show parameters that are different form the default.
     * Similarly, specify <code>engine-default</code> to show parameters that are the same as the default parameter
     * group.
     * </p>
     * <p>
     * Default: All parameter types returned.
     * </p>
     * <p>
     * Valid Values: <code>user</code> | <code>engine-default</code>
     * </p>
     * 
     * @param source
     *        The parameter types to return. Specify <code>user</code> to show parameters that are different form the
     *        default. Similarly, specify <code>engine-default</code> to show parameters that are the same as the
     *        default parameter group. </p>
     *        <p>
     *        Default: All parameter types returned.
     *        </p>
     *        <p>
     *        Valid Values: <code>user</code> | <code>engine-default</code>
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The parameter types to return. Specify <code>user</code> to show parameters that are different form the default.
     * Similarly, specify <code>engine-default</code> to show parameters that are the same as the default parameter
     * group.
     * </p>
     * <p>
     * Default: All parameter types returned.
     * </p>
     * <p>
     * Valid Values: <code>user</code> | <code>engine-default</code>
     * </p>
     * 
     * @return The parameter types to return. Specify <code>user</code> to show parameters that are different form the
     *         default. Similarly, specify <code>engine-default</code> to show parameters that are the same as the
     *         default parameter group. </p>
     *         <p>
     *         Default: All parameter types returned.
     *         </p>
     *         <p>
     *         Valid Values: <code>user</code> | <code>engine-default</code>
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The parameter types to return. Specify <code>user</code> to show parameters that are different form the default.
     * Similarly, specify <code>engine-default</code> to show parameters that are the same as the default parameter
     * group.
     * </p>
     * <p>
     * Default: All parameter types returned.
     * </p>
     * <p>
     * Valid Values: <code>user</code> | <code>engine-default</code>
     * </p>
     * 
     * @param source
     *        The parameter types to return. Specify <code>user</code> to show parameters that are different form the
     *        default. Similarly, specify <code>engine-default</code> to show parameters that are the same as the
     *        default parameter group. </p>
     *        <p>
     *        Default: All parameter types returned.
     *        </p>
     *        <p>
     *        Valid Values: <code>user</code> | <code>engine-default</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterParametersRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
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
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         marker value. </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
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
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterParametersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeClusterParameters</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeClusterParameters</a> request exceed the value specified in
     *        <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *        retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeClusterParameters</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <a>DescribeClusterParameters</a> request exceed the value specified in
     *         <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *         retrieve the next set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeClusterParameters</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a
     * value in the <code>Marker</code> field of the response. You can retrieve the next set of response records by
     * providing the returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeClusterParameters</a> request exceed the value specified in
     *        <code>MaxRecords</code>, AWS returns a value in the <code>Marker</code> field of the response. You can
     *        retrieve the next set of response records by providing the returned marker value in the
     *        <code>Marker</code> parameter and retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterParametersRequest withMarker(String marker) {
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
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

        if (obj instanceof DescribeClusterParametersRequest == false)
            return false;
        DescribeClusterParametersRequest other = (DescribeClusterParametersRequest) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
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

        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterParametersRequest clone() {
        return (DescribeClusterParametersRequest) super.clone();
    }

}
