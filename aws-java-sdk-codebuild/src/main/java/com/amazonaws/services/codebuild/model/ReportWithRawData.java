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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the unmodified data for the report. For more information, see .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ReportWithRawData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportWithRawData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the report.
     * </p>
     */
    private String reportArn;
    /**
     * <p>
     * The value of the requested data field from the report.
     * </p>
     */
    private String data;

    /**
     * <p>
     * The ARN of the report.
     * </p>
     * 
     * @param reportArn
     *        The ARN of the report.
     */

    public void setReportArn(String reportArn) {
        this.reportArn = reportArn;
    }

    /**
     * <p>
     * The ARN of the report.
     * </p>
     * 
     * @return The ARN of the report.
     */

    public String getReportArn() {
        return this.reportArn;
    }

    /**
     * <p>
     * The ARN of the report.
     * </p>
     * 
     * @param reportArn
     *        The ARN of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportWithRawData withReportArn(String reportArn) {
        setReportArn(reportArn);
        return this;
    }

    /**
     * <p>
     * The value of the requested data field from the report.
     * </p>
     * 
     * @param data
     *        The value of the requested data field from the report.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The value of the requested data field from the report.
     * </p>
     * 
     * @return The value of the requested data field from the report.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * The value of the requested data field from the report.
     * </p>
     * 
     * @param data
     *        The value of the requested data field from the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportWithRawData withData(String data) {
        setData(data);
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
        if (getReportArn() != null)
            sb.append("ReportArn: ").append(getReportArn()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportWithRawData == false)
            return false;
        ReportWithRawData other = (ReportWithRawData) obj;
        if (other.getReportArn() == null ^ this.getReportArn() == null)
            return false;
        if (other.getReportArn() != null && other.getReportArn().equals(this.getReportArn()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportArn() == null) ? 0 : getReportArn().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public ReportWithRawData clone() {
        try {
            return (ReportWithRawData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ReportWithRawDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
