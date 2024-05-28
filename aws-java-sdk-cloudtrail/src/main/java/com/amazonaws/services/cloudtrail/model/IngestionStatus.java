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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A table showing information about the most recent successful and failed attempts to ingest events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/IngestionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time stamp of the most recent successful ingestion of events for the channel.
     * </p>
     */
    private java.util.Date latestIngestionSuccessTime;
    /**
     * <p>
     * The event ID of the most recent successful ingestion of events.
     * </p>
     */
    private String latestIngestionSuccessEventID;
    /**
     * <p>
     * The error code for the most recent failure to ingest events.
     * </p>
     */
    private String latestIngestionErrorCode;
    /**
     * <p>
     * The time stamp of the most recent attempt to ingest events on the channel.
     * </p>
     */
    private java.util.Date latestIngestionAttemptTime;
    /**
     * <p>
     * The event ID of the most recent attempt to ingest events.
     * </p>
     */
    private String latestIngestionAttemptEventID;

    /**
     * <p>
     * The time stamp of the most recent successful ingestion of events for the channel.
     * </p>
     * 
     * @param latestIngestionSuccessTime
     *        The time stamp of the most recent successful ingestion of events for the channel.
     */

    public void setLatestIngestionSuccessTime(java.util.Date latestIngestionSuccessTime) {
        this.latestIngestionSuccessTime = latestIngestionSuccessTime;
    }

    /**
     * <p>
     * The time stamp of the most recent successful ingestion of events for the channel.
     * </p>
     * 
     * @return The time stamp of the most recent successful ingestion of events for the channel.
     */

    public java.util.Date getLatestIngestionSuccessTime() {
        return this.latestIngestionSuccessTime;
    }

    /**
     * <p>
     * The time stamp of the most recent successful ingestion of events for the channel.
     * </p>
     * 
     * @param latestIngestionSuccessTime
     *        The time stamp of the most recent successful ingestion of events for the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionStatus withLatestIngestionSuccessTime(java.util.Date latestIngestionSuccessTime) {
        setLatestIngestionSuccessTime(latestIngestionSuccessTime);
        return this;
    }

    /**
     * <p>
     * The event ID of the most recent successful ingestion of events.
     * </p>
     * 
     * @param latestIngestionSuccessEventID
     *        The event ID of the most recent successful ingestion of events.
     */

    public void setLatestIngestionSuccessEventID(String latestIngestionSuccessEventID) {
        this.latestIngestionSuccessEventID = latestIngestionSuccessEventID;
    }

    /**
     * <p>
     * The event ID of the most recent successful ingestion of events.
     * </p>
     * 
     * @return The event ID of the most recent successful ingestion of events.
     */

    public String getLatestIngestionSuccessEventID() {
        return this.latestIngestionSuccessEventID;
    }

    /**
     * <p>
     * The event ID of the most recent successful ingestion of events.
     * </p>
     * 
     * @param latestIngestionSuccessEventID
     *        The event ID of the most recent successful ingestion of events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionStatus withLatestIngestionSuccessEventID(String latestIngestionSuccessEventID) {
        setLatestIngestionSuccessEventID(latestIngestionSuccessEventID);
        return this;
    }

    /**
     * <p>
     * The error code for the most recent failure to ingest events.
     * </p>
     * 
     * @param latestIngestionErrorCode
     *        The error code for the most recent failure to ingest events.
     */

    public void setLatestIngestionErrorCode(String latestIngestionErrorCode) {
        this.latestIngestionErrorCode = latestIngestionErrorCode;
    }

    /**
     * <p>
     * The error code for the most recent failure to ingest events.
     * </p>
     * 
     * @return The error code for the most recent failure to ingest events.
     */

    public String getLatestIngestionErrorCode() {
        return this.latestIngestionErrorCode;
    }

    /**
     * <p>
     * The error code for the most recent failure to ingest events.
     * </p>
     * 
     * @param latestIngestionErrorCode
     *        The error code for the most recent failure to ingest events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionStatus withLatestIngestionErrorCode(String latestIngestionErrorCode) {
        setLatestIngestionErrorCode(latestIngestionErrorCode);
        return this;
    }

    /**
     * <p>
     * The time stamp of the most recent attempt to ingest events on the channel.
     * </p>
     * 
     * @param latestIngestionAttemptTime
     *        The time stamp of the most recent attempt to ingest events on the channel.
     */

    public void setLatestIngestionAttemptTime(java.util.Date latestIngestionAttemptTime) {
        this.latestIngestionAttemptTime = latestIngestionAttemptTime;
    }

    /**
     * <p>
     * The time stamp of the most recent attempt to ingest events on the channel.
     * </p>
     * 
     * @return The time stamp of the most recent attempt to ingest events on the channel.
     */

    public java.util.Date getLatestIngestionAttemptTime() {
        return this.latestIngestionAttemptTime;
    }

    /**
     * <p>
     * The time stamp of the most recent attempt to ingest events on the channel.
     * </p>
     * 
     * @param latestIngestionAttemptTime
     *        The time stamp of the most recent attempt to ingest events on the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionStatus withLatestIngestionAttemptTime(java.util.Date latestIngestionAttemptTime) {
        setLatestIngestionAttemptTime(latestIngestionAttemptTime);
        return this;
    }

    /**
     * <p>
     * The event ID of the most recent attempt to ingest events.
     * </p>
     * 
     * @param latestIngestionAttemptEventID
     *        The event ID of the most recent attempt to ingest events.
     */

    public void setLatestIngestionAttemptEventID(String latestIngestionAttemptEventID) {
        this.latestIngestionAttemptEventID = latestIngestionAttemptEventID;
    }

    /**
     * <p>
     * The event ID of the most recent attempt to ingest events.
     * </p>
     * 
     * @return The event ID of the most recent attempt to ingest events.
     */

    public String getLatestIngestionAttemptEventID() {
        return this.latestIngestionAttemptEventID;
    }

    /**
     * <p>
     * The event ID of the most recent attempt to ingest events.
     * </p>
     * 
     * @param latestIngestionAttemptEventID
     *        The event ID of the most recent attempt to ingest events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionStatus withLatestIngestionAttemptEventID(String latestIngestionAttemptEventID) {
        setLatestIngestionAttemptEventID(latestIngestionAttemptEventID);
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
        if (getLatestIngestionSuccessTime() != null)
            sb.append("LatestIngestionSuccessTime: ").append(getLatestIngestionSuccessTime()).append(",");
        if (getLatestIngestionSuccessEventID() != null)
            sb.append("LatestIngestionSuccessEventID: ").append(getLatestIngestionSuccessEventID()).append(",");
        if (getLatestIngestionErrorCode() != null)
            sb.append("LatestIngestionErrorCode: ").append(getLatestIngestionErrorCode()).append(",");
        if (getLatestIngestionAttemptTime() != null)
            sb.append("LatestIngestionAttemptTime: ").append(getLatestIngestionAttemptTime()).append(",");
        if (getLatestIngestionAttemptEventID() != null)
            sb.append("LatestIngestionAttemptEventID: ").append(getLatestIngestionAttemptEventID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestionStatus == false)
            return false;
        IngestionStatus other = (IngestionStatus) obj;
        if (other.getLatestIngestionSuccessTime() == null ^ this.getLatestIngestionSuccessTime() == null)
            return false;
        if (other.getLatestIngestionSuccessTime() != null && other.getLatestIngestionSuccessTime().equals(this.getLatestIngestionSuccessTime()) == false)
            return false;
        if (other.getLatestIngestionSuccessEventID() == null ^ this.getLatestIngestionSuccessEventID() == null)
            return false;
        if (other.getLatestIngestionSuccessEventID() != null
                && other.getLatestIngestionSuccessEventID().equals(this.getLatestIngestionSuccessEventID()) == false)
            return false;
        if (other.getLatestIngestionErrorCode() == null ^ this.getLatestIngestionErrorCode() == null)
            return false;
        if (other.getLatestIngestionErrorCode() != null && other.getLatestIngestionErrorCode().equals(this.getLatestIngestionErrorCode()) == false)
            return false;
        if (other.getLatestIngestionAttemptTime() == null ^ this.getLatestIngestionAttemptTime() == null)
            return false;
        if (other.getLatestIngestionAttemptTime() != null && other.getLatestIngestionAttemptTime().equals(this.getLatestIngestionAttemptTime()) == false)
            return false;
        if (other.getLatestIngestionAttemptEventID() == null ^ this.getLatestIngestionAttemptEventID() == null)
            return false;
        if (other.getLatestIngestionAttemptEventID() != null
                && other.getLatestIngestionAttemptEventID().equals(this.getLatestIngestionAttemptEventID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLatestIngestionSuccessTime() == null) ? 0 : getLatestIngestionSuccessTime().hashCode());
        hashCode = prime * hashCode + ((getLatestIngestionSuccessEventID() == null) ? 0 : getLatestIngestionSuccessEventID().hashCode());
        hashCode = prime * hashCode + ((getLatestIngestionErrorCode() == null) ? 0 : getLatestIngestionErrorCode().hashCode());
        hashCode = prime * hashCode + ((getLatestIngestionAttemptTime() == null) ? 0 : getLatestIngestionAttemptTime().hashCode());
        hashCode = prime * hashCode + ((getLatestIngestionAttemptEventID() == null) ? 0 : getLatestIngestionAttemptEventID().hashCode());
        return hashCode;
    }

    @Override
    public IngestionStatus clone() {
        try {
            return (IngestionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.IngestionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
