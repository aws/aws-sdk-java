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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the application version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationVersionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code> each time
     * you update the application.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * The status of the application.
     * </p>
     */
    private String applicationStatus;

    /**
     * <p>
     * The ID of the application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code> each time
     * you update the application.
     * </p>
     * 
     * @param applicationVersionId
     *        The ID of the application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code>
     *        each time you update the application.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * The ID of the application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code> each time
     * you update the application.
     * </p>
     * 
     * @return The ID of the application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code>
     *         each time you update the application.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * The ID of the application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code> each time
     * you update the application.
     * </p>
     * 
     * @param applicationVersionId
     *        The ID of the application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code>
     *        each time you update the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionSummary withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        The status of the application.
     * @see ApplicationStatus
     */

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @return The status of the application.
     * @see ApplicationStatus
     */

    public String getApplicationStatus() {
        return this.applicationStatus;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public ApplicationVersionSummary withApplicationStatus(String applicationStatus) {
        setApplicationStatus(applicationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public ApplicationVersionSummary withApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus.toString();
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
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
        if (getApplicationStatus() != null)
            sb.append("ApplicationStatus: ").append(getApplicationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationVersionSummary == false)
            return false;
        ApplicationVersionSummary other = (ApplicationVersionSummary) obj;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getApplicationStatus() == null ^ this.getApplicationStatus() == null)
            return false;
        if (other.getApplicationStatus() != null && other.getApplicationStatus().equals(this.getApplicationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getApplicationStatus() == null) ? 0 : getApplicationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationVersionSummary clone() {
        try {
            return (ApplicationVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
