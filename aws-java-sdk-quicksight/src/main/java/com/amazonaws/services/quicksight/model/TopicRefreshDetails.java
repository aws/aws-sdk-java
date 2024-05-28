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
 * The details about the refresh of a topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicRefreshDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRefreshDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic refresh.
     * </p>
     */
    private String refreshArn;
    /**
     * <p>
     * The ID of the refresh, which occurs as a result of topic creation or topic update.
     * </p>
     */
    private String refreshId;
    /**
     * <p>
     * The status of the refresh job that indicates whether the job is still running, completed successfully, or failed.
     * </p>
     */
    private String refreshStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic refresh.
     * </p>
     * 
     * @param refreshArn
     *        The Amazon Resource Name (ARN) of the topic refresh.
     */

    public void setRefreshArn(String refreshArn) {
        this.refreshArn = refreshArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic refresh.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the topic refresh.
     */

    public String getRefreshArn() {
        return this.refreshArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic refresh.
     * </p>
     * 
     * @param refreshArn
     *        The Amazon Resource Name (ARN) of the topic refresh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshDetails withRefreshArn(String refreshArn) {
        setRefreshArn(refreshArn);
        return this;
    }

    /**
     * <p>
     * The ID of the refresh, which occurs as a result of topic creation or topic update.
     * </p>
     * 
     * @param refreshId
     *        The ID of the refresh, which occurs as a result of topic creation or topic update.
     */

    public void setRefreshId(String refreshId) {
        this.refreshId = refreshId;
    }

    /**
     * <p>
     * The ID of the refresh, which occurs as a result of topic creation or topic update.
     * </p>
     * 
     * @return The ID of the refresh, which occurs as a result of topic creation or topic update.
     */

    public String getRefreshId() {
        return this.refreshId;
    }

    /**
     * <p>
     * The ID of the refresh, which occurs as a result of topic creation or topic update.
     * </p>
     * 
     * @param refreshId
     *        The ID of the refresh, which occurs as a result of topic creation or topic update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshDetails withRefreshId(String refreshId) {
        setRefreshId(refreshId);
        return this;
    }

    /**
     * <p>
     * The status of the refresh job that indicates whether the job is still running, completed successfully, or failed.
     * </p>
     * 
     * @param refreshStatus
     *        The status of the refresh job that indicates whether the job is still running, completed successfully, or
     *        failed.
     * @see TopicRefreshStatus
     */

    public void setRefreshStatus(String refreshStatus) {
        this.refreshStatus = refreshStatus;
    }

    /**
     * <p>
     * The status of the refresh job that indicates whether the job is still running, completed successfully, or failed.
     * </p>
     * 
     * @return The status of the refresh job that indicates whether the job is still running, completed successfully, or
     *         failed.
     * @see TopicRefreshStatus
     */

    public String getRefreshStatus() {
        return this.refreshStatus;
    }

    /**
     * <p>
     * The status of the refresh job that indicates whether the job is still running, completed successfully, or failed.
     * </p>
     * 
     * @param refreshStatus
     *        The status of the refresh job that indicates whether the job is still running, completed successfully, or
     *        failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicRefreshStatus
     */

    public TopicRefreshDetails withRefreshStatus(String refreshStatus) {
        setRefreshStatus(refreshStatus);
        return this;
    }

    /**
     * <p>
     * The status of the refresh job that indicates whether the job is still running, completed successfully, or failed.
     * </p>
     * 
     * @param refreshStatus
     *        The status of the refresh job that indicates whether the job is still running, completed successfully, or
     *        failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicRefreshStatus
     */

    public TopicRefreshDetails withRefreshStatus(TopicRefreshStatus refreshStatus) {
        this.refreshStatus = refreshStatus.toString();
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
        if (getRefreshArn() != null)
            sb.append("RefreshArn: ").append(getRefreshArn()).append(",");
        if (getRefreshId() != null)
            sb.append("RefreshId: ").append(getRefreshId()).append(",");
        if (getRefreshStatus() != null)
            sb.append("RefreshStatus: ").append(getRefreshStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRefreshDetails == false)
            return false;
        TopicRefreshDetails other = (TopicRefreshDetails) obj;
        if (other.getRefreshArn() == null ^ this.getRefreshArn() == null)
            return false;
        if (other.getRefreshArn() != null && other.getRefreshArn().equals(this.getRefreshArn()) == false)
            return false;
        if (other.getRefreshId() == null ^ this.getRefreshId() == null)
            return false;
        if (other.getRefreshId() != null && other.getRefreshId().equals(this.getRefreshId()) == false)
            return false;
        if (other.getRefreshStatus() == null ^ this.getRefreshStatus() == null)
            return false;
        if (other.getRefreshStatus() != null && other.getRefreshStatus().equals(this.getRefreshStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRefreshArn() == null) ? 0 : getRefreshArn().hashCode());
        hashCode = prime * hashCode + ((getRefreshId() == null) ? 0 : getRefreshId().hashCode());
        hashCode = prime * hashCode + ((getRefreshStatus() == null) ? 0 : getRefreshStatus().hashCode());
        return hashCode;
    }

    @Override
    public TopicRefreshDetails clone() {
        try {
            return (TopicRefreshDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicRefreshDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
