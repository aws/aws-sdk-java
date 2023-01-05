/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the properties of a recommender update. For a complete listing, call the <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeRecommender.html">DescribeRecommender</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/RecommenderUpdateSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommenderUpdateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration details of the recommender update.
     * </p>
     */
    private RecommenderConfig recommenderConfig;
    /**
     * <p>
     * The date and time (in Unix format) that the recommender update was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) that the recommender update was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The status of the recommender update.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If a recommender update fails, the reason behind the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The configuration details of the recommender update.
     * </p>
     * 
     * @param recommenderConfig
     *        The configuration details of the recommender update.
     */

    public void setRecommenderConfig(RecommenderConfig recommenderConfig) {
        this.recommenderConfig = recommenderConfig;
    }

    /**
     * <p>
     * The configuration details of the recommender update.
     * </p>
     * 
     * @return The configuration details of the recommender update.
     */

    public RecommenderConfig getRecommenderConfig() {
        return this.recommenderConfig;
    }

    /**
     * <p>
     * The configuration details of the recommender update.
     * </p>
     * 
     * @param recommenderConfig
     *        The configuration details of the recommender update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderUpdateSummary withRecommenderConfig(RecommenderConfig recommenderConfig) {
        setRecommenderConfig(recommenderConfig);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender update was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the recommender update was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender update was created.
     * </p>
     * 
     * @return The date and time (in Unix format) that the recommender update was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender update was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the recommender update was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderUpdateSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the recommender update was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the recommender update was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the recommender update was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) that the recommender update was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the recommender update was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the recommender update was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderUpdateSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The status of the recommender update.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the recommender update.</p>
     *        <p>
     *        A recommender can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the recommender update.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the recommender update.</p>
     *         <p>
     *         A recommender can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE PENDING &gt; DELETE IN_PROGRESS
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the recommender update.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the recommender update.</p>
     *        <p>
     *        A recommender can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderUpdateSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If a recommender update fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a recommender update fails, the reason behind the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a recommender update fails, the reason behind the failure.
     * </p>
     * 
     * @return If a recommender update fails, the reason behind the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a recommender update fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a recommender update fails, the reason behind the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderUpdateSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getRecommenderConfig() != null)
            sb.append("RecommenderConfig: ").append(getRecommenderConfig()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommenderUpdateSummary == false)
            return false;
        RecommenderUpdateSummary other = (RecommenderUpdateSummary) obj;
        if (other.getRecommenderConfig() == null ^ this.getRecommenderConfig() == null)
            return false;
        if (other.getRecommenderConfig() != null && other.getRecommenderConfig().equals(this.getRecommenderConfig()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommenderConfig() == null) ? 0 : getRecommenderConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public RecommenderUpdateSummary clone() {
        try {
            return (RecommenderUpdateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.RecommenderUpdateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
