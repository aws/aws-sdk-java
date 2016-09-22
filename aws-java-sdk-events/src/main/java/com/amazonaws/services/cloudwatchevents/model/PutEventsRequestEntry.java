/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the event to be used in PutEvents.
 * </p>
 */
public class PutEventsRequestEntry implements Serializable, Cloneable {

    /**
     * <p>
     * Timestamp of event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no timestamp is
     * provided, the timestamp of the <a>PutEvents</a> call will be used.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The source of the event.
     * </p>
     */
    private String source;
    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     * including zero, may be present.
     * </p>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * Free-form string used to decide what fields to expect in the event detail.
     * </p>
     */
    private String detailType;
    /**
     * <p>
     * In the JSON sense, an object containing fields, which may also contain nested sub-objects. No constraints are
     * imposed on its contents.
     * </p>
     */
    private String detail;

    /**
     * <p>
     * Timestamp of event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no timestamp is
     * provided, the timestamp of the <a>PutEvents</a> call will be used.
     * </p>
     * 
     * @param time
     *        Timestamp of event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no timestamp
     *        is provided, the timestamp of the <a>PutEvents</a> call will be used.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * Timestamp of event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no timestamp is
     * provided, the timestamp of the <a>PutEvents</a> call will be used.
     * </p>
     * 
     * @return Timestamp of event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no timestamp
     *         is provided, the timestamp of the <a>PutEvents</a> call will be used.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * Timestamp of event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no timestamp is
     * provided, the timestamp of the <a>PutEvents</a> call will be used.
     * </p>
     * 
     * @param time
     *        Timestamp of event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no timestamp
     *        is provided, the timestamp of the <a>PutEvents</a> call will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsRequestEntry withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @param source
     *        The source of the event.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @return The source of the event.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the event.
     * </p>
     * 
     * @param source
     *        The source of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsRequestEntry withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     * including zero, may be present.
     * </p>
     * 
     * @return AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     *         including zero, may be present.
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     * including zero, may be present.
     * </p>
     * 
     * @param resources
     *        AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     *        including zero, may be present.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     * including zero, may be present.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     *        including zero, may be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsRequestEntry withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     * including zero, may be present.
     * </p>
     * 
     * @param resources
     *        AWS resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number,
     *        including zero, may be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsRequestEntry withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * Free-form string used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @param detailType
     *        Free-form string used to decide what fields to expect in the event detail.
     */

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /**
     * <p>
     * Free-form string used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @return Free-form string used to decide what fields to expect in the event detail.
     */

    public String getDetailType() {
        return this.detailType;
    }

    /**
     * <p>
     * Free-form string used to decide what fields to expect in the event detail.
     * </p>
     * 
     * @param detailType
     *        Free-form string used to decide what fields to expect in the event detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsRequestEntry withDetailType(String detailType) {
        setDetailType(detailType);
        return this;
    }

    /**
     * <p>
     * In the JSON sense, an object containing fields, which may also contain nested sub-objects. No constraints are
     * imposed on its contents.
     * </p>
     * 
     * @param detail
     *        In the JSON sense, an object containing fields, which may also contain nested sub-objects. No constraints
     *        are imposed on its contents.
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * In the JSON sense, an object containing fields, which may also contain nested sub-objects. No constraints are
     * imposed on its contents.
     * </p>
     * 
     * @return In the JSON sense, an object containing fields, which may also contain nested sub-objects. No constraints
     *         are imposed on its contents.
     */

    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * In the JSON sense, an object containing fields, which may also contain nested sub-objects. No constraints are
     * imposed on its contents.
     * </p>
     * 
     * @param detail
     *        In the JSON sense, an object containing fields, which may also contain nested sub-objects. No constraints
     *        are imposed on its contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsRequestEntry withDetail(String detail) {
        setDetail(detail);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTime() != null)
            sb.append("Time: " + getTime() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getDetailType() != null)
            sb.append("DetailType: " + getDetailType() + ",");
        if (getDetail() != null)
            sb.append("Detail: " + getDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventsRequestEntry == false)
            return false;
        PutEventsRequestEntry other = (PutEventsRequestEntry) obj;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getDetailType() == null ^ this.getDetailType() == null)
            return false;
        if (other.getDetailType() != null && other.getDetailType().equals(this.getDetailType()) == false)
            return false;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getDetailType() == null) ? 0 : getDetailType().hashCode());
        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return hashCode;
    }

    @Override
    public PutEventsRequestEntry clone() {
        try {
            return (PutEventsRequestEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
