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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics that describe how the incident has impacted a service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/RequestImpactStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestImpactStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of requests that have resulted in a fault,
     * </p>
     */
    private Long faultCount;
    /**
     * <p>
     * The number of successful requests.
     * </p>
     */
    private Long okCount;
    /**
     * <p>
     * The total number of requests to the service.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * The number of requests that have resulted in a fault,
     * </p>
     * 
     * @param faultCount
     *        The number of requests that have resulted in a fault,
     */

    public void setFaultCount(Long faultCount) {
        this.faultCount = faultCount;
    }

    /**
     * <p>
     * The number of requests that have resulted in a fault,
     * </p>
     * 
     * @return The number of requests that have resulted in a fault,
     */

    public Long getFaultCount() {
        return this.faultCount;
    }

    /**
     * <p>
     * The number of requests that have resulted in a fault,
     * </p>
     * 
     * @param faultCount
     *        The number of requests that have resulted in a fault,
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestImpactStatistics withFaultCount(Long faultCount) {
        setFaultCount(faultCount);
        return this;
    }

    /**
     * <p>
     * The number of successful requests.
     * </p>
     * 
     * @param okCount
     *        The number of successful requests.
     */

    public void setOkCount(Long okCount) {
        this.okCount = okCount;
    }

    /**
     * <p>
     * The number of successful requests.
     * </p>
     * 
     * @return The number of successful requests.
     */

    public Long getOkCount() {
        return this.okCount;
    }

    /**
     * <p>
     * The number of successful requests.
     * </p>
     * 
     * @param okCount
     *        The number of successful requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestImpactStatistics withOkCount(Long okCount) {
        setOkCount(okCount);
        return this;
    }

    /**
     * <p>
     * The total number of requests to the service.
     * </p>
     * 
     * @param totalCount
     *        The total number of requests to the service.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of requests to the service.
     * </p>
     * 
     * @return The total number of requests to the service.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of requests to the service.
     * </p>
     * 
     * @param totalCount
     *        The total number of requests to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestImpactStatistics withTotalCount(Long totalCount) {
        setTotalCount(totalCount);
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
        if (getFaultCount() != null)
            sb.append("FaultCount: ").append(getFaultCount()).append(",");
        if (getOkCount() != null)
            sb.append("OkCount: ").append(getOkCount()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestImpactStatistics == false)
            return false;
        RequestImpactStatistics other = (RequestImpactStatistics) obj;
        if (other.getFaultCount() == null ^ this.getFaultCount() == null)
            return false;
        if (other.getFaultCount() != null && other.getFaultCount().equals(this.getFaultCount()) == false)
            return false;
        if (other.getOkCount() == null ^ this.getOkCount() == null)
            return false;
        if (other.getOkCount() != null && other.getOkCount().equals(this.getOkCount()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaultCount() == null) ? 0 : getFaultCount().hashCode());
        hashCode = prime * hashCode + ((getOkCount() == null) ? 0 : getOkCount().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public RequestImpactStatistics clone() {
        try {
            return (RequestImpactStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.RequestImpactStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
