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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time series data points form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/TimeSeriesDataPointFormOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesDataPointFormOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of the time series data points form.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The name of the time series data points form.
     * </p>
     */
    private String formName;
    /**
     * <p>
     * The ID of the time series data points form.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The timestamp of the time series data points form.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The ID of the type of the time series data points form.
     * </p>
     */
    private String typeIdentifier;
    /**
     * <p>
     * The revision type of the time series data points form.
     * </p>
     */
    private String typeRevision;

    /**
     * <p>
     * The content of the time series data points form.
     * </p>
     * 
     * @param content
     *        The content of the time series data points form.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the time series data points form.
     * </p>
     * 
     * @return The content of the time series data points form.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the time series data points form.
     * </p>
     * 
     * @param content
     *        The content of the time series data points form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesDataPointFormOutput withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The name of the time series data points form.
     * </p>
     * 
     * @param formName
     *        The name of the time series data points form.
     */

    public void setFormName(String formName) {
        this.formName = formName;
    }

    /**
     * <p>
     * The name of the time series data points form.
     * </p>
     * 
     * @return The name of the time series data points form.
     */

    public String getFormName() {
        return this.formName;
    }

    /**
     * <p>
     * The name of the time series data points form.
     * </p>
     * 
     * @param formName
     *        The name of the time series data points form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesDataPointFormOutput withFormName(String formName) {
        setFormName(formName);
        return this;
    }

    /**
     * <p>
     * The ID of the time series data points form.
     * </p>
     * 
     * @param id
     *        The ID of the time series data points form.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the time series data points form.
     * </p>
     * 
     * @return The ID of the time series data points form.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the time series data points form.
     * </p>
     * 
     * @param id
     *        The ID of the time series data points form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesDataPointFormOutput withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The timestamp of the time series data points form.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the time series data points form.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the time series data points form.
     * </p>
     * 
     * @return The timestamp of the time series data points form.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the time series data points form.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the time series data points form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesDataPointFormOutput withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The ID of the type of the time series data points form.
     * </p>
     * 
     * @param typeIdentifier
     *        The ID of the type of the time series data points form.
     */

    public void setTypeIdentifier(String typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
    }

    /**
     * <p>
     * The ID of the type of the time series data points form.
     * </p>
     * 
     * @return The ID of the type of the time series data points form.
     */

    public String getTypeIdentifier() {
        return this.typeIdentifier;
    }

    /**
     * <p>
     * The ID of the type of the time series data points form.
     * </p>
     * 
     * @param typeIdentifier
     *        The ID of the type of the time series data points form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesDataPointFormOutput withTypeIdentifier(String typeIdentifier) {
        setTypeIdentifier(typeIdentifier);
        return this;
    }

    /**
     * <p>
     * The revision type of the time series data points form.
     * </p>
     * 
     * @param typeRevision
     *        The revision type of the time series data points form.
     */

    public void setTypeRevision(String typeRevision) {
        this.typeRevision = typeRevision;
    }

    /**
     * <p>
     * The revision type of the time series data points form.
     * </p>
     * 
     * @return The revision type of the time series data points form.
     */

    public String getTypeRevision() {
        return this.typeRevision;
    }

    /**
     * <p>
     * The revision type of the time series data points form.
     * </p>
     * 
     * @param typeRevision
     *        The revision type of the time series data points form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesDataPointFormOutput withTypeRevision(String typeRevision) {
        setTypeRevision(typeRevision);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getFormName() != null)
            sb.append("FormName: ").append(getFormName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getTypeIdentifier() != null)
            sb.append("TypeIdentifier: ").append(getTypeIdentifier()).append(",");
        if (getTypeRevision() != null)
            sb.append("TypeRevision: ").append(getTypeRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSeriesDataPointFormOutput == false)
            return false;
        TimeSeriesDataPointFormOutput other = (TimeSeriesDataPointFormOutput) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getFormName() == null ^ this.getFormName() == null)
            return false;
        if (other.getFormName() != null && other.getFormName().equals(this.getFormName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getTypeIdentifier() == null ^ this.getTypeIdentifier() == null)
            return false;
        if (other.getTypeIdentifier() != null && other.getTypeIdentifier().equals(this.getTypeIdentifier()) == false)
            return false;
        if (other.getTypeRevision() == null ^ this.getTypeRevision() == null)
            return false;
        if (other.getTypeRevision() != null && other.getTypeRevision().equals(this.getTypeRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getFormName() == null) ? 0 : getFormName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTypeIdentifier() == null) ? 0 : getTypeIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTypeRevision() == null) ? 0 : getTypeRevision().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesDataPointFormOutput clone() {
        try {
            return (TimeSeriesDataPointFormOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.TimeSeriesDataPointFormOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
