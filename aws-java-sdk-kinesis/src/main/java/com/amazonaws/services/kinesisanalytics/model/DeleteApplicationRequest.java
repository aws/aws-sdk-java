/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DeleteApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the Amazon Kinesis Analytics application to delete.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * You can use the <code>DescribeApplication</code> operation to get this value.
     * </p>
     */
    private java.util.Date createTimestamp;

    /**
     * <p>
     * Name of the Amazon Kinesis Analytics application to delete.
     * </p>
     * 
     * @param applicationName
     *        Name of the Amazon Kinesis Analytics application to delete.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of the Amazon Kinesis Analytics application to delete.
     * </p>
     * 
     * @return Name of the Amazon Kinesis Analytics application to delete.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of the Amazon Kinesis Analytics application to delete.
     * </p>
     * 
     * @param applicationName
     *        Name of the Amazon Kinesis Analytics application to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * You can use the <code>DescribeApplication</code> operation to get this value.
     * </p>
     * 
     * @param createTimestamp
     *        You can use the <code>DescribeApplication</code> operation to get this value.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * You can use the <code>DescribeApplication</code> operation to get this value.
     * </p>
     * 
     * @return You can use the <code>DescribeApplication</code> operation to get this value.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * You can use the <code>DescribeApplication</code> operation to get this value.
     * </p>
     * 
     * @param createTimestamp
     *        You can use the <code>DescribeApplication</code> operation to get this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationRequest withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: " + getCreateTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationRequest == false)
            return false;
        DeleteApplicationRequest other = (DeleteApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationRequest clone() {
        return (DeleteApplicationRequest) super.clone();
    }
}
