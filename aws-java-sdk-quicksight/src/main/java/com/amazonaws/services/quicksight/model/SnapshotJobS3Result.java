/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 result from the snapshot job. The result includes the <code>DestinationConfiguration</code> and the
 * Amazon S3 Uri. If an error occured during the job, the result returns information on the error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotJobS3Result" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotJobS3Result implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of Amazon S3 bucket configurations that are provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     */
    private SnapshotS3DestinationConfiguration s3DestinationConfiguration;
    /**
     * <p>
     * The Amazon S3 Uri.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     * </p>
     */
    private java.util.List<SnapshotJobResultErrorInfo> errorInfo;

    /**
     * <p>
     * A list of Amazon S3 bucket configurations that are provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param s3DestinationConfiguration
     *        A list of Amazon S3 bucket configurations that are provided when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     */

    public void setS3DestinationConfiguration(SnapshotS3DestinationConfiguration s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
    }

    /**
     * <p>
     * A list of Amazon S3 bucket configurations that are provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @return A list of Amazon S3 bucket configurations that are provided when you make a
     *         <code>StartDashboardSnapshotJob</code> API call.
     */

    public SnapshotS3DestinationConfiguration getS3DestinationConfiguration() {
        return this.s3DestinationConfiguration;
    }

    /**
     * <p>
     * A list of Amazon S3 bucket configurations that are provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param s3DestinationConfiguration
     *        A list of Amazon S3 bucket configurations that are provided when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobS3Result withS3DestinationConfiguration(SnapshotS3DestinationConfiguration s3DestinationConfiguration) {
        setS3DestinationConfiguration(s3DestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 Uri.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 Uri.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 Uri.
     * </p>
     * 
     * @return The Amazon S3 Uri.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 Uri.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 Uri.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobS3Result withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     * </p>
     * 
     * @return An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     */

    public java.util.List<SnapshotJobResultErrorInfo> getErrorInfo() {
        return errorInfo;
    }

    /**
     * <p>
     * An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     * </p>
     * 
     * @param errorInfo
     *        An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     */

    public void setErrorInfo(java.util.Collection<SnapshotJobResultErrorInfo> errorInfo) {
        if (errorInfo == null) {
            this.errorInfo = null;
            return;
        }

        this.errorInfo = new java.util.ArrayList<SnapshotJobResultErrorInfo>(errorInfo);
    }

    /**
     * <p>
     * An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorInfo(java.util.Collection)} or {@link #withErrorInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorInfo
     *        An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobS3Result withErrorInfo(SnapshotJobResultErrorInfo... errorInfo) {
        if (this.errorInfo == null) {
            setErrorInfo(new java.util.ArrayList<SnapshotJobResultErrorInfo>(errorInfo.length));
        }
        for (SnapshotJobResultErrorInfo ele : errorInfo) {
            this.errorInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     * </p>
     * 
     * @param errorInfo
     *        An array of error records that describe any failures that occur while the dashboard snapshot job runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobS3Result withErrorInfo(java.util.Collection<SnapshotJobResultErrorInfo> errorInfo) {
        setErrorInfo(errorInfo);
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
        if (getS3DestinationConfiguration() != null)
            sb.append("S3DestinationConfiguration: ").append(getS3DestinationConfiguration()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append("***Sensitive Data Redacted***").append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotJobS3Result == false)
            return false;
        SnapshotJobS3Result other = (SnapshotJobS3Result) obj;
        if (other.getS3DestinationConfiguration() == null ^ this.getS3DestinationConfiguration() == null)
            return false;
        if (other.getS3DestinationConfiguration() != null && other.getS3DestinationConfiguration().equals(this.getS3DestinationConfiguration()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DestinationConfiguration() == null) ? 0 : getS3DestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotJobS3Result clone() {
        try {
            return (SnapshotJobS3Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotJobS3ResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
