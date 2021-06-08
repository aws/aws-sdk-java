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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationCloudWatchLoggingOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationCloudWatchLoggingOptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Kinesis Data Analytics application name.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The version ID of the Kinesis Data Analytics application. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>.You can retrieve the application
     * version ID using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN).
     * </p>
     */
    private CloudWatchLoggingOption cloudWatchLoggingOption;
    /**
     * <p>
     * A value you use to implement strong concurrency for application updates. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You get the application's current
     * <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     */
    private String conditionalToken;

    /**
     * <p>
     * The Kinesis Data Analytics application name.
     * </p>
     * 
     * @param applicationName
     *        The Kinesis Data Analytics application name.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The Kinesis Data Analytics application name.
     * </p>
     * 
     * @return The Kinesis Data Analytics application name.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The Kinesis Data Analytics application name.
     * </p>
     * 
     * @param applicationName
     *        The Kinesis Data Analytics application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationCloudWatchLoggingOptionRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The version ID of the Kinesis Data Analytics application. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>.You can retrieve the application
     * version ID using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version ID of the Kinesis Data Analytics application. You must provide the
     *        <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>.You can retrieve the
     *        application version ID using <a>DescribeApplication</a>. For better concurrency support, use the
     *        <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * The version ID of the Kinesis Data Analytics application. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>.You can retrieve the application
     * version ID using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @return The version ID of the Kinesis Data Analytics application. You must provide the
     *         <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>.You can retrieve the
     *         application version ID using <a>DescribeApplication</a>. For better concurrency support, use the
     *         <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * The version ID of the Kinesis Data Analytics application. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>.You can retrieve the application
     * version ID using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version ID of the Kinesis Data Analytics application. You must provide the
     *        <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>.You can retrieve the
     *        application version ID using <a>DescribeApplication</a>. For better concurrency support, use the
     *        <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationCloudWatchLoggingOptionRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN).
     * </p>
     * 
     * @param cloudWatchLoggingOption
     *        Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN).
     */

    public void setCloudWatchLoggingOption(CloudWatchLoggingOption cloudWatchLoggingOption) {
        this.cloudWatchLoggingOption = cloudWatchLoggingOption;
    }

    /**
     * <p>
     * Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN).
     * </p>
     * 
     * @return Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN).
     */

    public CloudWatchLoggingOption getCloudWatchLoggingOption() {
        return this.cloudWatchLoggingOption;
    }

    /**
     * <p>
     * Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN).
     * </p>
     * 
     * @param cloudWatchLoggingOption
     *        Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationCloudWatchLoggingOptionRequest withCloudWatchLoggingOption(CloudWatchLoggingOption cloudWatchLoggingOption) {
        setCloudWatchLoggingOption(cloudWatchLoggingOption);
        return this;
    }

    /**
     * <p>
     * A value you use to implement strong concurrency for application updates. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You get the application's current
     * <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @param conditionalToken
     *        A value you use to implement strong concurrency for application updates. You must provide the
     *        <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You get the application's
     *        current <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support,
     *        use the <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     */

    public void setConditionalToken(String conditionalToken) {
        this.conditionalToken = conditionalToken;
    }

    /**
     * <p>
     * A value you use to implement strong concurrency for application updates. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You get the application's current
     * <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @return A value you use to implement strong concurrency for application updates. You must provide the
     *         <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You get the application's
     *         current <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support,
     *         use the <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     */

    public String getConditionalToken() {
        return this.conditionalToken;
    }

    /**
     * <p>
     * A value you use to implement strong concurrency for application updates. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You get the application's current
     * <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @param conditionalToken
     *        A value you use to implement strong concurrency for application updates. You must provide the
     *        <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You get the application's
     *        current <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support,
     *        use the <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationCloudWatchLoggingOptionRequest withConditionalToken(String conditionalToken) {
        setConditionalToken(conditionalToken);
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
        if (getCloudWatchLoggingOption() != null)
            sb.append("CloudWatchLoggingOption: ").append(getCloudWatchLoggingOption()).append(",");
        if (getConditionalToken() != null)
            sb.append("ConditionalToken: ").append(getConditionalToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationCloudWatchLoggingOptionRequest == false)
            return false;
        AddApplicationCloudWatchLoggingOptionRequest other = (AddApplicationCloudWatchLoggingOptionRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getCloudWatchLoggingOption() == null ^ this.getCloudWatchLoggingOption() == null)
            return false;
        if (other.getCloudWatchLoggingOption() != null && other.getCloudWatchLoggingOption().equals(this.getCloudWatchLoggingOption()) == false)
            return false;
        if (other.getConditionalToken() == null ^ this.getConditionalToken() == null)
            return false;
        if (other.getConditionalToken() != null && other.getConditionalToken().equals(this.getConditionalToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOption() == null) ? 0 : getCloudWatchLoggingOption().hashCode());
        hashCode = prime * hashCode + ((getConditionalToken() == null) ? 0 : getConditionalToken().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationCloudWatchLoggingOptionRequest clone() {
        return (AddApplicationCloudWatchLoggingOptionRequest) super.clone();
    }

}
