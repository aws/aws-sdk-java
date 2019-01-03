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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/UpdateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the Amazon Kinesis Analytics application to update.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The current application version ID. You can use the <a>DescribeApplication</a> operation to get this value.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * Describes application updates.
     * </p>
     */
    private ApplicationUpdate applicationUpdate;

    /**
     * <p>
     * Name of the Amazon Kinesis Analytics application to update.
     * </p>
     * 
     * @param applicationName
     *        Name of the Amazon Kinesis Analytics application to update.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of the Amazon Kinesis Analytics application to update.
     * </p>
     * 
     * @return Name of the Amazon Kinesis Analytics application to update.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of the Amazon Kinesis Analytics application to update.
     * </p>
     * 
     * @param applicationName
     *        Name of the Amazon Kinesis Analytics application to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The current application version ID. You can use the <a>DescribeApplication</a> operation to get this value.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The current application version ID. You can use the <a>DescribeApplication</a> operation to get this
     *        value.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * The current application version ID. You can use the <a>DescribeApplication</a> operation to get this value.
     * </p>
     * 
     * @return The current application version ID. You can use the <a>DescribeApplication</a> operation to get this
     *         value.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * The current application version ID. You can use the <a>DescribeApplication</a> operation to get this value.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The current application version ID. You can use the <a>DescribeApplication</a> operation to get this
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * Describes application updates.
     * </p>
     * 
     * @param applicationUpdate
     *        Describes application updates.
     */

    public void setApplicationUpdate(ApplicationUpdate applicationUpdate) {
        this.applicationUpdate = applicationUpdate;
    }

    /**
     * <p>
     * Describes application updates.
     * </p>
     * 
     * @return Describes application updates.
     */

    public ApplicationUpdate getApplicationUpdate() {
        return this.applicationUpdate;
    }

    /**
     * <p>
     * Describes application updates.
     * </p>
     * 
     * @param applicationUpdate
     *        Describes application updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationUpdate(ApplicationUpdate applicationUpdate) {
        setApplicationUpdate(applicationUpdate);
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
        if (getApplicationUpdate() != null)
            sb.append("ApplicationUpdate: ").append(getApplicationUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getApplicationUpdate() == null ^ this.getApplicationUpdate() == null)
            return false;
        if (other.getApplicationUpdate() != null && other.getApplicationUpdate().equals(this.getApplicationUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getApplicationUpdate() == null) ? 0 : getApplicationUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
