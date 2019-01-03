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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationCloudWatchLoggingOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationCloudWatchLoggingOptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application name.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The version ID of the application. You can retrieve the application version ID using <a>DescribeApplication</a>.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * The <code>CloudWatchLoggingOptionId</code> of the Amazon CloudWatch logging option to delete. You can get the
     * <code>CloudWatchLoggingOptionId</code> by using the <a>DescribeApplication</a> operation.
     * </p>
     */
    private String cloudWatchLoggingOptionId;

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param applicationName
     *        The application name.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @return The application name.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param applicationName
     *        The application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationCloudWatchLoggingOptionRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The version ID of the application. You can retrieve the application version ID using <a>DescribeApplication</a>.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version ID of the application. You can retrieve the application version ID using
     *        <a>DescribeApplication</a>.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * The version ID of the application. You can retrieve the application version ID using <a>DescribeApplication</a>.
     * </p>
     * 
     * @return The version ID of the application. You can retrieve the application version ID using
     *         <a>DescribeApplication</a>.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * The version ID of the application. You can retrieve the application version ID using <a>DescribeApplication</a>.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version ID of the application. You can retrieve the application version ID using
     *        <a>DescribeApplication</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationCloudWatchLoggingOptionRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * The <code>CloudWatchLoggingOptionId</code> of the Amazon CloudWatch logging option to delete. You can get the
     * <code>CloudWatchLoggingOptionId</code> by using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param cloudWatchLoggingOptionId
     *        The <code>CloudWatchLoggingOptionId</code> of the Amazon CloudWatch logging option to delete. You can get
     *        the <code>CloudWatchLoggingOptionId</code> by using the <a>DescribeApplication</a> operation.
     */

    public void setCloudWatchLoggingOptionId(String cloudWatchLoggingOptionId) {
        this.cloudWatchLoggingOptionId = cloudWatchLoggingOptionId;
    }

    /**
     * <p>
     * The <code>CloudWatchLoggingOptionId</code> of the Amazon CloudWatch logging option to delete. You can get the
     * <code>CloudWatchLoggingOptionId</code> by using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @return The <code>CloudWatchLoggingOptionId</code> of the Amazon CloudWatch logging option to delete. You can get
     *         the <code>CloudWatchLoggingOptionId</code> by using the <a>DescribeApplication</a> operation.
     */

    public String getCloudWatchLoggingOptionId() {
        return this.cloudWatchLoggingOptionId;
    }

    /**
     * <p>
     * The <code>CloudWatchLoggingOptionId</code> of the Amazon CloudWatch logging option to delete. You can get the
     * <code>CloudWatchLoggingOptionId</code> by using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param cloudWatchLoggingOptionId
     *        The <code>CloudWatchLoggingOptionId</code> of the Amazon CloudWatch logging option to delete. You can get
     *        the <code>CloudWatchLoggingOptionId</code> by using the <a>DescribeApplication</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationCloudWatchLoggingOptionRequest withCloudWatchLoggingOptionId(String cloudWatchLoggingOptionId) {
        setCloudWatchLoggingOptionId(cloudWatchLoggingOptionId);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getCurrentApplicationVersionId() != null)
            sb.append("CurrentApplicationVersionId: ").append(getCurrentApplicationVersionId()).append(",");
        if (getCloudWatchLoggingOptionId() != null)
            sb.append("CloudWatchLoggingOptionId: ").append(getCloudWatchLoggingOptionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationCloudWatchLoggingOptionRequest == false)
            return false;
        DeleteApplicationCloudWatchLoggingOptionRequest other = (DeleteApplicationCloudWatchLoggingOptionRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getCloudWatchLoggingOptionId() == null ^ this.getCloudWatchLoggingOptionId() == null)
            return false;
        if (other.getCloudWatchLoggingOptionId() != null && other.getCloudWatchLoggingOptionId().equals(this.getCloudWatchLoggingOptionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptionId() == null) ? 0 : getCloudWatchLoggingOptionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationCloudWatchLoggingOptionRequest clone() {
        return (DeleteApplicationCloudWatchLoggingOptionRequest) super.clone();
    }

}
