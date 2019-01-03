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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationCloudWatchLoggingOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationCloudWatchLoggingOptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The application's ARN.
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the
     * <code>ApplicationVersionId</code> each time you change the CloudWatch logging options.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     * </p>
     */
    private java.util.List<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions;

    /**
     * <p>
     * The application's ARN.
     * </p>
     * 
     * @param applicationARN
     *        The application's ARN.
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The application's ARN.
     * </p>
     * 
     * @return The application's ARN.
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The application's ARN.
     * </p>
     * 
     * @param applicationARN
     *        The application's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationCloudWatchLoggingOptionResult withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the
     * <code>ApplicationVersionId</code> each time you change the CloudWatch logging options.
     * </p>
     * 
     * @param applicationVersionId
     *        The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the
     *        <code>ApplicationVersionId</code> each time you change the CloudWatch logging options.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the
     * <code>ApplicationVersionId</code> each time you change the CloudWatch logging options.
     * </p>
     * 
     * @return The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the
     *         <code>ApplicationVersionId</code> each time you change the CloudWatch logging options.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the
     * <code>ApplicationVersionId</code> each time you change the CloudWatch logging options.
     * </p>
     * 
     * @param applicationVersionId
     *        The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the
     *        <code>ApplicationVersionId</code> each time you change the CloudWatch logging options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationCloudWatchLoggingOptionResult withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     * </p>
     * 
     * @return The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     */

    public java.util.List<CloudWatchLoggingOptionDescription> getCloudWatchLoggingOptionDescriptions() {
        return cloudWatchLoggingOptionDescriptions;
    }

    /**
     * <p>
     * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     */

    public void setCloudWatchLoggingOptionDescriptions(java.util.Collection<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions) {
        if (cloudWatchLoggingOptionDescriptions == null) {
            this.cloudWatchLoggingOptionDescriptions = null;
            return;
        }

        this.cloudWatchLoggingOptionDescriptions = new java.util.ArrayList<CloudWatchLoggingOptionDescription>(cloudWatchLoggingOptionDescriptions);
    }

    /**
     * <p>
     * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchLoggingOptionDescriptions(java.util.Collection)} or
     * {@link #withCloudWatchLoggingOptionDescriptions(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationCloudWatchLoggingOptionResult withCloudWatchLoggingOptionDescriptions(
            CloudWatchLoggingOptionDescription... cloudWatchLoggingOptionDescriptions) {
        if (this.cloudWatchLoggingOptionDescriptions == null) {
            setCloudWatchLoggingOptionDescriptions(new java.util.ArrayList<CloudWatchLoggingOptionDescription>(cloudWatchLoggingOptionDescriptions.length));
        }
        for (CloudWatchLoggingOptionDescription ele : cloudWatchLoggingOptionDescriptions) {
            this.cloudWatchLoggingOptionDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationCloudWatchLoggingOptionResult withCloudWatchLoggingOptionDescriptions(
            java.util.Collection<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions) {
        setCloudWatchLoggingOptionDescriptions(cloudWatchLoggingOptionDescriptions);
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
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
        if (getCloudWatchLoggingOptionDescriptions() != null)
            sb.append("CloudWatchLoggingOptionDescriptions: ").append(getCloudWatchLoggingOptionDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationCloudWatchLoggingOptionResult == false)
            return false;
        AddApplicationCloudWatchLoggingOptionResult other = (AddApplicationCloudWatchLoggingOptionResult) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getCloudWatchLoggingOptionDescriptions() == null ^ this.getCloudWatchLoggingOptionDescriptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptionDescriptions() != null
                && other.getCloudWatchLoggingOptionDescriptions().equals(this.getCloudWatchLoggingOptionDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptionDescriptions() == null) ? 0 : getCloudWatchLoggingOptionDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationCloudWatchLoggingOptionResult clone() {
        try {
            return (AddApplicationCloudWatchLoggingOptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
