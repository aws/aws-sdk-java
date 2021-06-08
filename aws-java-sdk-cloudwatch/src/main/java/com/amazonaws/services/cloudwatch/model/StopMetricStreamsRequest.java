/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/StopMetricStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopMetricStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The array of the names of metric streams to stop streaming.
     * </p>
     * <p>
     * This is an "all or nothing" operation. If you do not have permission to access all of the metric streams that you
     * list here, then none of the streams that you list in the operation will stop streaming.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> names;

    /**
     * <p>
     * The array of the names of metric streams to stop streaming.
     * </p>
     * <p>
     * This is an "all or nothing" operation. If you do not have permission to access all of the metric streams that you
     * list here, then none of the streams that you list in the operation will stop streaming.
     * </p>
     * 
     * @return The array of the names of metric streams to stop streaming.</p>
     *         <p>
     *         This is an "all or nothing" operation. If you do not have permission to access all of the metric streams
     *         that you list here, then none of the streams that you list in the operation will stop streaming.
     */

    public java.util.List<String> getNames() {
        if (names == null) {
            names = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return names;
    }

    /**
     * <p>
     * The array of the names of metric streams to stop streaming.
     * </p>
     * <p>
     * This is an "all or nothing" operation. If you do not have permission to access all of the metric streams that you
     * list here, then none of the streams that you list in the operation will stop streaming.
     * </p>
     * 
     * @param names
     *        The array of the names of metric streams to stop streaming.</p>
     *        <p>
     *        This is an "all or nothing" operation. If you do not have permission to access all of the metric streams
     *        that you list here, then none of the streams that you list in the operation will stop streaming.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new com.amazonaws.internal.SdkInternalList<String>(names);
    }

    /**
     * <p>
     * The array of the names of metric streams to stop streaming.
     * </p>
     * <p>
     * This is an "all or nothing" operation. If you do not have permission to access all of the metric streams that you
     * list here, then none of the streams that you list in the operation will stop streaming.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        The array of the names of metric streams to stop streaming.</p>
     *        <p>
     *        This is an "all or nothing" operation. If you do not have permission to access all of the metric streams
     *        that you list here, then none of the streams that you list in the operation will stop streaming.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopMetricStreamsRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new com.amazonaws.internal.SdkInternalList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of the names of metric streams to stop streaming.
     * </p>
     * <p>
     * This is an "all or nothing" operation. If you do not have permission to access all of the metric streams that you
     * list here, then none of the streams that you list in the operation will stop streaming.
     * </p>
     * 
     * @param names
     *        The array of the names of metric streams to stop streaming.</p>
     *        <p>
     *        This is an "all or nothing" operation. If you do not have permission to access all of the metric streams
     *        that you list here, then none of the streams that you list in the operation will stop streaming.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopMetricStreamsRequest withNames(java.util.Collection<String> names) {
        setNames(names);
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
        if (getNames() != null)
            sb.append("Names: ").append(getNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopMetricStreamsRequest == false)
            return false;
        StopMetricStreamsRequest other = (StopMetricStreamsRequest) obj;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        return hashCode;
    }

    @Override
    public StopMetricStreamsRequest clone() {
        return (StopMetricStreamsRequest) super.clone();
    }

}
