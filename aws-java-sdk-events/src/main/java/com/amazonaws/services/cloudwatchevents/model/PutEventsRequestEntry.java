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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an event to be submitted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutEventsRequestEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventsRequestEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no time
     * stamp is provided, the time stamp of the <a>PutEvents</a> call is used.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The source of the event. This field is required.
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
     * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
     * </p>
     */
    private String detail;

    /**
     * <p>
     * The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no time
     * stamp is provided, the time stamp of the <a>PutEvents</a> call is used.
     * </p>
     * 
     * @param time
     *        The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no
     *        time stamp is provided, the time stamp of the <a>PutEvents</a> call is used.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no time
     * stamp is provided, the time stamp of the <a>PutEvents</a> call is used.
     * </p>
     * 
     * @return The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no
     *         time stamp is provided, the time stamp of the <a>PutEvents</a> call is used.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no time
     * stamp is provided, the time stamp of the <a>PutEvents</a> call is used.
     * </p>
     * 
     * @param time
     *        The time stamp of the event, per <a href="https://www.rfc-editor.org/rfc/rfc3339.txt">RFC3339</a>. If no
     *        time stamp is provided, the time stamp of the <a>PutEvents</a> call is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsRequestEntry withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The source of the event. This field is required.
     * </p>
     * 
     * @param source
     *        The source of the event. This field is required.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the event. This field is required.
     * </p>
     * 
     * @return The source of the event. This field is required.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the event. This field is required.
     * </p>
     * 
     * @param source
     *        The source of the event. This field is required.
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
     * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
     * </p>
     * 
     * @param detail
     *        A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested
     *        subobjects.
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
     * </p>
     * 
     * @return A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested
     *         subobjects.
     */

    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested subobjects.
     * </p>
     * 
     * @param detail
     *        A valid JSON string. There is no other schema imposed. The JSON string may contain fields and nested
     *        subobjects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsRequestEntry withDetail(String detail) {
        setDetail(detail);
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
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getDetailType() != null)
            sb.append("DetailType: ").append(getDetailType()).append(",");
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.PutEventsRequestEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
