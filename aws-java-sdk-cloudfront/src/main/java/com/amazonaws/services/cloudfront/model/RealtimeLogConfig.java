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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A real-time log configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/RealtimeLogConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealtimeLogConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this real-time log configuration.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The unique name of this real-time log configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer
     * requests that are represented in the real-time log data. The sampling rate is an integer between 1 and 100,
     * inclusive.
     * </p>
     */
    private Long samplingRate;
    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data for this
     * real-time log configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EndPoint> endPoints;
    /**
     * <p>
     * A list of fields that are included in each real-time log record. In an API response, the fields are provided in
     * the same order in which they are sent to the Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about fields, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     * >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> fields;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this real-time log configuration.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of this real-time log configuration.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this real-time log configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this real-time log configuration.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this real-time log configuration.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of this real-time log configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfig withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The unique name of this real-time log configuration.
     * </p>
     * 
     * @param name
     *        The unique name of this real-time log configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of this real-time log configuration.
     * </p>
     * 
     * @return The unique name of this real-time log configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of this real-time log configuration.
     * </p>
     * 
     * @param name
     *        The unique name of this real-time log configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer
     * requests that are represented in the real-time log data. The sampling rate is an integer between 1 and 100,
     * inclusive.
     * </p>
     * 
     * @param samplingRate
     *        The sampling rate for this real-time log configuration. The sampling rate determines the percentage of
     *        viewer requests that are represented in the real-time log data. The sampling rate is an integer between 1
     *        and 100, inclusive.
     */

    public void setSamplingRate(Long samplingRate) {
        this.samplingRate = samplingRate;
    }

    /**
     * <p>
     * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer
     * requests that are represented in the real-time log data. The sampling rate is an integer between 1 and 100,
     * inclusive.
     * </p>
     * 
     * @return The sampling rate for this real-time log configuration. The sampling rate determines the percentage of
     *         viewer requests that are represented in the real-time log data. The sampling rate is an integer between 1
     *         and 100, inclusive.
     */

    public Long getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * <p>
     * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer
     * requests that are represented in the real-time log data. The sampling rate is an integer between 1 and 100,
     * inclusive.
     * </p>
     * 
     * @param samplingRate
     *        The sampling rate for this real-time log configuration. The sampling rate determines the percentage of
     *        viewer requests that are represented in the real-time log data. The sampling rate is an integer between 1
     *        and 100, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfig withSamplingRate(Long samplingRate) {
        setSamplingRate(samplingRate);
        return this;
    }

    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data for this
     * real-time log configuration.
     * </p>
     * 
     * @return Contains information about the Amazon Kinesis data stream where you are sending real-time log data for
     *         this real-time log configuration.
     */

    public java.util.List<EndPoint> getEndPoints() {
        if (endPoints == null) {
            endPoints = new com.amazonaws.internal.SdkInternalList<EndPoint>();
        }
        return endPoints;
    }

    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data for this
     * real-time log configuration.
     * </p>
     * 
     * @param endPoints
     *        Contains information about the Amazon Kinesis data stream where you are sending real-time log data for
     *        this real-time log configuration.
     */

    public void setEndPoints(java.util.Collection<EndPoint> endPoints) {
        if (endPoints == null) {
            this.endPoints = null;
            return;
        }

        this.endPoints = new com.amazonaws.internal.SdkInternalList<EndPoint>(endPoints);
    }

    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data for this
     * real-time log configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndPoints(java.util.Collection)} or {@link #withEndPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endPoints
     *        Contains information about the Amazon Kinesis data stream where you are sending real-time log data for
     *        this real-time log configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfig withEndPoints(EndPoint... endPoints) {
        if (this.endPoints == null) {
            setEndPoints(new com.amazonaws.internal.SdkInternalList<EndPoint>(endPoints.length));
        }
        for (EndPoint ele : endPoints) {
            this.endPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data for this
     * real-time log configuration.
     * </p>
     * 
     * @param endPoints
     *        Contains information about the Amazon Kinesis data stream where you are sending real-time log data for
     *        this real-time log configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfig withEndPoints(java.util.Collection<EndPoint> endPoints) {
        setEndPoints(endPoints);
        return this;
    }

    /**
     * <p>
     * A list of fields that are included in each real-time log record. In an API response, the fields are provided in
     * the same order in which they are sent to the Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about fields, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     * >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return A list of fields that are included in each real-time log record. In an API response, the fields are
     *         provided in the same order in which they are sent to the Amazon Kinesis data stream.</p>
     *         <p>
     *         For more information about fields, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     *         >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public java.util.List<String> getFields() {
        if (fields == null) {
            fields = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return fields;
    }

    /**
     * <p>
     * A list of fields that are included in each real-time log record. In an API response, the fields are provided in
     * the same order in which they are sent to the Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about fields, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     * >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param fields
     *        A list of fields that are included in each real-time log record. In an API response, the fields are
     *        provided in the same order in which they are sent to the Amazon Kinesis data stream.</p>
     *        <p>
     *        For more information about fields, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     *        >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setFields(java.util.Collection<String> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new com.amazonaws.internal.SdkInternalList<String>(fields);
    }

    /**
     * <p>
     * A list of fields that are included in each real-time log record. In an API response, the fields are provided in
     * the same order in which they are sent to the Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about fields, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     * >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        A list of fields that are included in each real-time log record. In an API response, the fields are
     *        provided in the same order in which they are sent to the Amazon Kinesis data stream.</p>
     *        <p>
     *        For more information about fields, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     *        >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfig withFields(String... fields) {
        if (this.fields == null) {
            setFields(new com.amazonaws.internal.SdkInternalList<String>(fields.length));
        }
        for (String ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of fields that are included in each real-time log record. In an API response, the fields are provided in
     * the same order in which they are sent to the Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about fields, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     * >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param fields
     *        A list of fields that are included in each real-time log record. In an API response, the fields are
     *        provided in the same order in which they are sent to the Amazon Kinesis data stream.</p>
     *        <p>
     *        For more information about fields, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields"
     *        >Real-time log configuration fields</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeLogConfig withFields(java.util.Collection<String> fields) {
        setFields(fields);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSamplingRate() != null)
            sb.append("SamplingRate: ").append(getSamplingRate()).append(",");
        if (getEndPoints() != null)
            sb.append("EndPoints: ").append(getEndPoints()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealtimeLogConfig == false)
            return false;
        RealtimeLogConfig other = (RealtimeLogConfig) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSamplingRate() == null ^ this.getSamplingRate() == null)
            return false;
        if (other.getSamplingRate() != null && other.getSamplingRate().equals(this.getSamplingRate()) == false)
            return false;
        if (other.getEndPoints() == null ^ this.getEndPoints() == null)
            return false;
        if (other.getEndPoints() != null && other.getEndPoints().equals(this.getEndPoints()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSamplingRate() == null) ? 0 : getSamplingRate().hashCode());
        hashCode = prime * hashCode + ((getEndPoints() == null) ? 0 : getEndPoints().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public RealtimeLogConfig clone() {
        try {
            return (RealtimeLogConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
