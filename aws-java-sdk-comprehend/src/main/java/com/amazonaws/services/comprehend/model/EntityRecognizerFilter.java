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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information for filtering a list of entity recognizers. You can only specify one filtering parameter in a
 * request. For more information, see the operation./&gt;
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs
     * submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     */
    private java.util.Date submitTimeBefore;
    /**
     * <p>
     * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs
     * submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     */
    private java.util.Date submitTimeAfter;

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * 
     * @param status
     *        The status of an entity recognizer.
     * @see ModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * 
     * @return The status of an entity recognizer.
     * @see ModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * 
     * @param status
     *        The status of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public EntityRecognizerFilter withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * 
     * @param status
     *        The status of an entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public EntityRecognizerFilter withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs
     * submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @param submitTimeBefore
     *        Filters the list of entities based on the time that the list was submitted for processing. Returns only
     *        jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     */

    public void setSubmitTimeBefore(java.util.Date submitTimeBefore) {
        this.submitTimeBefore = submitTimeBefore;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs
     * submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @return Filters the list of entities based on the time that the list was submitted for processing. Returns only
     *         jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     */

    public java.util.Date getSubmitTimeBefore() {
        return this.submitTimeBefore;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs
     * submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * 
     * @param submitTimeBefore
     *        Filters the list of entities based on the time that the list was submitted for processing. Returns only
     *        jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerFilter withSubmitTimeBefore(java.util.Date submitTimeBefore) {
        setSubmitTimeBefore(submitTimeBefore);
        return this;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs
     * submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @param submitTimeAfter
     *        Filters the list of entities based on the time that the list was submitted for processing. Returns only
     *        jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     */

    public void setSubmitTimeAfter(java.util.Date submitTimeAfter) {
        this.submitTimeAfter = submitTimeAfter;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs
     * submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @return Filters the list of entities based on the time that the list was submitted for processing. Returns only
     *         jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     */

    public java.util.Date getSubmitTimeAfter() {
        return this.submitTimeAfter;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs
     * submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * 
     * @param submitTimeAfter
     *        Filters the list of entities based on the time that the list was submitted for processing. Returns only
     *        jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerFilter withSubmitTimeAfter(java.util.Date submitTimeAfter) {
        setSubmitTimeAfter(submitTimeAfter);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubmitTimeBefore() != null)
            sb.append("SubmitTimeBefore: ").append(getSubmitTimeBefore()).append(",");
        if (getSubmitTimeAfter() != null)
            sb.append("SubmitTimeAfter: ").append(getSubmitTimeAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerFilter == false)
            return false;
        EntityRecognizerFilter other = (EntityRecognizerFilter) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubmitTimeBefore() == null ^ this.getSubmitTimeBefore() == null)
            return false;
        if (other.getSubmitTimeBefore() != null && other.getSubmitTimeBefore().equals(this.getSubmitTimeBefore()) == false)
            return false;
        if (other.getSubmitTimeAfter() == null ^ this.getSubmitTimeAfter() == null)
            return false;
        if (other.getSubmitTimeAfter() != null && other.getSubmitTimeAfter().equals(this.getSubmitTimeAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubmitTimeBefore() == null) ? 0 : getSubmitTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getSubmitTimeAfter() == null) ? 0 : getSubmitTimeAfter().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerFilter clone() {
        try {
            return (EntityRecognizerFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
