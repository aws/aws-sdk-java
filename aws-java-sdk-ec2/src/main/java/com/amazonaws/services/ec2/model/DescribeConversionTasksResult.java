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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output for DescribeConversionTasks.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConversionTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConversionTask> conversionTasks;

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     * 
     * @return Information about the conversion tasks.
     */

    public java.util.List<ConversionTask> getConversionTasks() {
        if (conversionTasks == null) {
            conversionTasks = new com.amazonaws.internal.SdkInternalList<ConversionTask>();
        }
        return conversionTasks;
    }

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     * 
     * @param conversionTasks
     *        Information about the conversion tasks.
     */

    public void setConversionTasks(java.util.Collection<ConversionTask> conversionTasks) {
        if (conversionTasks == null) {
            this.conversionTasks = null;
            return;
        }

        this.conversionTasks = new com.amazonaws.internal.SdkInternalList<ConversionTask>(conversionTasks);
    }

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConversionTasks(java.util.Collection)} or {@link #withConversionTasks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param conversionTasks
     *        Information about the conversion tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConversionTasksResult withConversionTasks(ConversionTask... conversionTasks) {
        if (this.conversionTasks == null) {
            setConversionTasks(new com.amazonaws.internal.SdkInternalList<ConversionTask>(conversionTasks.length));
        }
        for (ConversionTask ele : conversionTasks) {
            this.conversionTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the conversion tasks.
     * </p>
     * 
     * @param conversionTasks
     *        Information about the conversion tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConversionTasksResult withConversionTasks(java.util.Collection<ConversionTask> conversionTasks) {
        setConversionTasks(conversionTasks);
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
        if (getConversionTasks() != null)
            sb.append("ConversionTasks: ").append(getConversionTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConversionTasksResult == false)
            return false;
        DescribeConversionTasksResult other = (DescribeConversionTasksResult) obj;
        if (other.getConversionTasks() == null ^ this.getConversionTasks() == null)
            return false;
        if (other.getConversionTasks() != null && other.getConversionTasks().equals(this.getConversionTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversionTasks() == null) ? 0 : getConversionTasks().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConversionTasksResult clone() {
        try {
            return (DescribeConversionTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
