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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Response statistics for a service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ServiceStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of requests that completed with a 2xx Success status code.
     * </p>
     */
    private Long okCount;
    /**
     * <p>
     * Information about requests that failed with a 4xx Client Error status code.
     * </p>
     */
    private ErrorStatistics errorStatistics;
    /**
     * <p>
     * Information about requests that failed with a 5xx Server Error status code.
     * </p>
     */
    private FaultStatistics faultStatistics;
    /**
     * <p>
     * The total number of completed requests.
     * </p>
     */
    private Long totalCount;
    /**
     * <p>
     * The aggregate response time of completed requests.
     * </p>
     */
    private Double totalResponseTime;

    /**
     * <p>
     * The number of requests that completed with a 2xx Success status code.
     * </p>
     * 
     * @param okCount
     *        The number of requests that completed with a 2xx Success status code.
     */

    public void setOkCount(Long okCount) {
        this.okCount = okCount;
    }

    /**
     * <p>
     * The number of requests that completed with a 2xx Success status code.
     * </p>
     * 
     * @return The number of requests that completed with a 2xx Success status code.
     */

    public Long getOkCount() {
        return this.okCount;
    }

    /**
     * <p>
     * The number of requests that completed with a 2xx Success status code.
     * </p>
     * 
     * @param okCount
     *        The number of requests that completed with a 2xx Success status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceStatistics withOkCount(Long okCount) {
        setOkCount(okCount);
        return this;
    }

    /**
     * <p>
     * Information about requests that failed with a 4xx Client Error status code.
     * </p>
     * 
     * @param errorStatistics
     *        Information about requests that failed with a 4xx Client Error status code.
     */

    public void setErrorStatistics(ErrorStatistics errorStatistics) {
        this.errorStatistics = errorStatistics;
    }

    /**
     * <p>
     * Information about requests that failed with a 4xx Client Error status code.
     * </p>
     * 
     * @return Information about requests that failed with a 4xx Client Error status code.
     */

    public ErrorStatistics getErrorStatistics() {
        return this.errorStatistics;
    }

    /**
     * <p>
     * Information about requests that failed with a 4xx Client Error status code.
     * </p>
     * 
     * @param errorStatistics
     *        Information about requests that failed with a 4xx Client Error status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceStatistics withErrorStatistics(ErrorStatistics errorStatistics) {
        setErrorStatistics(errorStatistics);
        return this;
    }

    /**
     * <p>
     * Information about requests that failed with a 5xx Server Error status code.
     * </p>
     * 
     * @param faultStatistics
     *        Information about requests that failed with a 5xx Server Error status code.
     */

    public void setFaultStatistics(FaultStatistics faultStatistics) {
        this.faultStatistics = faultStatistics;
    }

    /**
     * <p>
     * Information about requests that failed with a 5xx Server Error status code.
     * </p>
     * 
     * @return Information about requests that failed with a 5xx Server Error status code.
     */

    public FaultStatistics getFaultStatistics() {
        return this.faultStatistics;
    }

    /**
     * <p>
     * Information about requests that failed with a 5xx Server Error status code.
     * </p>
     * 
     * @param faultStatistics
     *        Information about requests that failed with a 5xx Server Error status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceStatistics withFaultStatistics(FaultStatistics faultStatistics) {
        setFaultStatistics(faultStatistics);
        return this;
    }

    /**
     * <p>
     * The total number of completed requests.
     * </p>
     * 
     * @param totalCount
     *        The total number of completed requests.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of completed requests.
     * </p>
     * 
     * @return The total number of completed requests.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of completed requests.
     * </p>
     * 
     * @param totalCount
     *        The total number of completed requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceStatistics withTotalCount(Long totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * The aggregate response time of completed requests.
     * </p>
     * 
     * @param totalResponseTime
     *        The aggregate response time of completed requests.
     */

    public void setTotalResponseTime(Double totalResponseTime) {
        this.totalResponseTime = totalResponseTime;
    }

    /**
     * <p>
     * The aggregate response time of completed requests.
     * </p>
     * 
     * @return The aggregate response time of completed requests.
     */

    public Double getTotalResponseTime() {
        return this.totalResponseTime;
    }

    /**
     * <p>
     * The aggregate response time of completed requests.
     * </p>
     * 
     * @param totalResponseTime
     *        The aggregate response time of completed requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceStatistics withTotalResponseTime(Double totalResponseTime) {
        setTotalResponseTime(totalResponseTime);
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
        if (getOkCount() != null)
            sb.append("OkCount: ").append(getOkCount()).append(",");
        if (getErrorStatistics() != null)
            sb.append("ErrorStatistics: ").append(getErrorStatistics()).append(",");
        if (getFaultStatistics() != null)
            sb.append("FaultStatistics: ").append(getFaultStatistics()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getTotalResponseTime() != null)
            sb.append("TotalResponseTime: ").append(getTotalResponseTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceStatistics == false)
            return false;
        ServiceStatistics other = (ServiceStatistics) obj;
        if (other.getOkCount() == null ^ this.getOkCount() == null)
            return false;
        if (other.getOkCount() != null && other.getOkCount().equals(this.getOkCount()) == false)
            return false;
        if (other.getErrorStatistics() == null ^ this.getErrorStatistics() == null)
            return false;
        if (other.getErrorStatistics() != null && other.getErrorStatistics().equals(this.getErrorStatistics()) == false)
            return false;
        if (other.getFaultStatistics() == null ^ this.getFaultStatistics() == null)
            return false;
        if (other.getFaultStatistics() != null && other.getFaultStatistics().equals(this.getFaultStatistics()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getTotalResponseTime() == null ^ this.getTotalResponseTime() == null)
            return false;
        if (other.getTotalResponseTime() != null && other.getTotalResponseTime().equals(this.getTotalResponseTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOkCount() == null) ? 0 : getOkCount().hashCode());
        hashCode = prime * hashCode + ((getErrorStatistics() == null) ? 0 : getErrorStatistics().hashCode());
        hashCode = prime * hashCode + ((getFaultStatistics() == null) ? 0 : getFaultStatistics().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getTotalResponseTime() == null) ? 0 : getTotalResponseTime().hashCode());
        return hashCode;
    }

    @Override
    public ServiceStatistics clone() {
        try {
            return (ServiceStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ServiceStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
