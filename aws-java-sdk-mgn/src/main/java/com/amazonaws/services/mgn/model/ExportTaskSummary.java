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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Export task summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ExportTaskSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTaskSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Export task summary applications count.
     * </p>
     */
    private Long applicationsCount;
    /**
     * <p>
     * Export task summary servers count.
     * </p>
     */
    private Long serversCount;
    /**
     * <p>
     * Export task summary waves count.
     * </p>
     */
    private Long wavesCount;

    /**
     * <p>
     * Export task summary applications count.
     * </p>
     * 
     * @param applicationsCount
     *        Export task summary applications count.
     */

    public void setApplicationsCount(Long applicationsCount) {
        this.applicationsCount = applicationsCount;
    }

    /**
     * <p>
     * Export task summary applications count.
     * </p>
     * 
     * @return Export task summary applications count.
     */

    public Long getApplicationsCount() {
        return this.applicationsCount;
    }

    /**
     * <p>
     * Export task summary applications count.
     * </p>
     * 
     * @param applicationsCount
     *        Export task summary applications count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTaskSummary withApplicationsCount(Long applicationsCount) {
        setApplicationsCount(applicationsCount);
        return this;
    }

    /**
     * <p>
     * Export task summary servers count.
     * </p>
     * 
     * @param serversCount
     *        Export task summary servers count.
     */

    public void setServersCount(Long serversCount) {
        this.serversCount = serversCount;
    }

    /**
     * <p>
     * Export task summary servers count.
     * </p>
     * 
     * @return Export task summary servers count.
     */

    public Long getServersCount() {
        return this.serversCount;
    }

    /**
     * <p>
     * Export task summary servers count.
     * </p>
     * 
     * @param serversCount
     *        Export task summary servers count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTaskSummary withServersCount(Long serversCount) {
        setServersCount(serversCount);
        return this;
    }

    /**
     * <p>
     * Export task summary waves count.
     * </p>
     * 
     * @param wavesCount
     *        Export task summary waves count.
     */

    public void setWavesCount(Long wavesCount) {
        this.wavesCount = wavesCount;
    }

    /**
     * <p>
     * Export task summary waves count.
     * </p>
     * 
     * @return Export task summary waves count.
     */

    public Long getWavesCount() {
        return this.wavesCount;
    }

    /**
     * <p>
     * Export task summary waves count.
     * </p>
     * 
     * @param wavesCount
     *        Export task summary waves count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTaskSummary withWavesCount(Long wavesCount) {
        setWavesCount(wavesCount);
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
        if (getApplicationsCount() != null)
            sb.append("ApplicationsCount: ").append(getApplicationsCount()).append(",");
        if (getServersCount() != null)
            sb.append("ServersCount: ").append(getServersCount()).append(",");
        if (getWavesCount() != null)
            sb.append("WavesCount: ").append(getWavesCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTaskSummary == false)
            return false;
        ExportTaskSummary other = (ExportTaskSummary) obj;
        if (other.getApplicationsCount() == null ^ this.getApplicationsCount() == null)
            return false;
        if (other.getApplicationsCount() != null && other.getApplicationsCount().equals(this.getApplicationsCount()) == false)
            return false;
        if (other.getServersCount() == null ^ this.getServersCount() == null)
            return false;
        if (other.getServersCount() != null && other.getServersCount().equals(this.getServersCount()) == false)
            return false;
        if (other.getWavesCount() == null ^ this.getWavesCount() == null)
            return false;
        if (other.getWavesCount() != null && other.getWavesCount().equals(this.getWavesCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationsCount() == null) ? 0 : getApplicationsCount().hashCode());
        hashCode = prime * hashCode + ((getServersCount() == null) ? 0 : getServersCount().hashCode());
        hashCode = prime * hashCode + ((getWavesCount() == null) ? 0 : getWavesCount().hashCode());
        return hashCode;
    }

    @Override
    public ExportTaskSummary clone() {
        try {
            return (ExportTaskSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ExportTaskSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
