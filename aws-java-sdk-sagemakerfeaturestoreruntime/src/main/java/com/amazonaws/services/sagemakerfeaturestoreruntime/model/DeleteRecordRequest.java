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
package com.amazonaws.services.sagemakerfeaturestoreruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/DeleteRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRecordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the feature group to delete the record from.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The value for the <code>RecordIdentifier</code> that uniquely identifies the record, in string format.
     * </p>
     */
    private String recordIdentifierValueAsString;
    /**
     * <p>
     * Timestamp indicating when the deletion event occurred. <code>EventTime</code> can be used to query data at a
     * certain point in time.
     * </p>
     */
    private String eventTime;

    /**
     * <p>
     * The name of the feature group to delete the record from.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group to delete the record from.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group to delete the record from.
     * </p>
     * 
     * @return The name of the feature group to delete the record from.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group to delete the record from.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group to delete the record from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecordRequest withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The value for the <code>RecordIdentifier</code> that uniquely identifies the record, in string format.
     * </p>
     * 
     * @param recordIdentifierValueAsString
     *        The value for the <code>RecordIdentifier</code> that uniquely identifies the record, in string format.
     */

    public void setRecordIdentifierValueAsString(String recordIdentifierValueAsString) {
        this.recordIdentifierValueAsString = recordIdentifierValueAsString;
    }

    /**
     * <p>
     * The value for the <code>RecordIdentifier</code> that uniquely identifies the record, in string format.
     * </p>
     * 
     * @return The value for the <code>RecordIdentifier</code> that uniquely identifies the record, in string format.
     */

    public String getRecordIdentifierValueAsString() {
        return this.recordIdentifierValueAsString;
    }

    /**
     * <p>
     * The value for the <code>RecordIdentifier</code> that uniquely identifies the record, in string format.
     * </p>
     * 
     * @param recordIdentifierValueAsString
     *        The value for the <code>RecordIdentifier</code> that uniquely identifies the record, in string format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecordRequest withRecordIdentifierValueAsString(String recordIdentifierValueAsString) {
        setRecordIdentifierValueAsString(recordIdentifierValueAsString);
        return this;
    }

    /**
     * <p>
     * Timestamp indicating when the deletion event occurred. <code>EventTime</code> can be used to query data at a
     * certain point in time.
     * </p>
     * 
     * @param eventTime
     *        Timestamp indicating when the deletion event occurred. <code>EventTime</code> can be used to query data at
     *        a certain point in time.
     */

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * Timestamp indicating when the deletion event occurred. <code>EventTime</code> can be used to query data at a
     * certain point in time.
     * </p>
     * 
     * @return Timestamp indicating when the deletion event occurred. <code>EventTime</code> can be used to query data
     *         at a certain point in time.
     */

    public String getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * Timestamp indicating when the deletion event occurred. <code>EventTime</code> can be used to query data at a
     * certain point in time.
     * </p>
     * 
     * @param eventTime
     *        Timestamp indicating when the deletion event occurred. <code>EventTime</code> can be used to query data at
     *        a certain point in time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecordRequest withEventTime(String eventTime) {
        setEventTime(eventTime);
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getRecordIdentifierValueAsString() != null)
            sb.append("RecordIdentifierValueAsString: ").append(getRecordIdentifierValueAsString()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRecordRequest == false)
            return false;
        DeleteRecordRequest other = (DeleteRecordRequest) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getRecordIdentifierValueAsString() == null ^ this.getRecordIdentifierValueAsString() == null)
            return false;
        if (other.getRecordIdentifierValueAsString() != null
                && other.getRecordIdentifierValueAsString().equals(this.getRecordIdentifierValueAsString()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getRecordIdentifierValueAsString() == null) ? 0 : getRecordIdentifierValueAsString().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRecordRequest clone() {
        return (DeleteRecordRequest) super.clone();
    }

}
