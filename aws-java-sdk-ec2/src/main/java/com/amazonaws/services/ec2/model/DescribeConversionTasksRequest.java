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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeConversionTasksRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeConversionTasks.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConversionTasksRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeConversionTasksRequest> {

    /**
     * <p>
     * One or more conversion task IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> conversionTaskIds;

    /**
     * <p>
     * One or more conversion task IDs.
     * </p>
     * 
     * @return One or more conversion task IDs.
     */

    public java.util.List<String> getConversionTaskIds() {
        if (conversionTaskIds == null) {
            conversionTaskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return conversionTaskIds;
    }

    /**
     * <p>
     * One or more conversion task IDs.
     * </p>
     * 
     * @param conversionTaskIds
     *        One or more conversion task IDs.
     */

    public void setConversionTaskIds(java.util.Collection<String> conversionTaskIds) {
        if (conversionTaskIds == null) {
            this.conversionTaskIds = null;
            return;
        }

        this.conversionTaskIds = new com.amazonaws.internal.SdkInternalList<String>(conversionTaskIds);
    }

    /**
     * <p>
     * One or more conversion task IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConversionTaskIds(java.util.Collection)} or {@link #withConversionTaskIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param conversionTaskIds
     *        One or more conversion task IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConversionTasksRequest withConversionTaskIds(String... conversionTaskIds) {
        if (this.conversionTaskIds == null) {
            setConversionTaskIds(new com.amazonaws.internal.SdkInternalList<String>(conversionTaskIds.length));
        }
        for (String ele : conversionTaskIds) {
            this.conversionTaskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more conversion task IDs.
     * </p>
     * 
     * @param conversionTaskIds
     *        One or more conversion task IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConversionTasksRequest withConversionTaskIds(java.util.Collection<String> conversionTaskIds) {
        setConversionTaskIds(conversionTaskIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeConversionTasksRequest> getDryRunRequest() {
        Request<DescribeConversionTasksRequest> request = new DescribeConversionTasksRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getConversionTaskIds() != null)
            sb.append("ConversionTaskIds: ").append(getConversionTaskIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConversionTasksRequest == false)
            return false;
        DescribeConversionTasksRequest other = (DescribeConversionTasksRequest) obj;
        if (other.getConversionTaskIds() == null ^ this.getConversionTaskIds() == null)
            return false;
        if (other.getConversionTaskIds() != null && other.getConversionTaskIds().equals(this.getConversionTaskIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversionTaskIds() == null) ? 0 : getConversionTaskIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConversionTasksRequest clone() {
        return (DescribeConversionTasksRequest) super.clone();
    }
}
