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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Payload for an RDF graph summary response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/RDFGraphSummaryValueMap"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDFGraphSummaryValueMap implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of this graph summary response.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The timestamp, in ISO 8601 format, of the time at which Neptune last computed statistics.
     * </p>
     */
    private java.util.Date lastStatisticsComputationTime;
    /**
     * <p>
     * The graph summary of an RDF graph. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-graph-summary.html#neptune-graph-summary-rdf-response"
     * >Graph summary response for an RDF graph</a>.
     * </p>
     */
    private RDFGraphSummary graphSummary;

    /**
     * <p>
     * The version of this graph summary response.
     * </p>
     * 
     * @param version
     *        The version of this graph summary response.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of this graph summary response.
     * </p>
     * 
     * @return The version of this graph summary response.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of this graph summary response.
     * </p>
     * 
     * @param version
     *        The version of this graph summary response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummaryValueMap withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The timestamp, in ISO 8601 format, of the time at which Neptune last computed statistics.
     * </p>
     * 
     * @param lastStatisticsComputationTime
     *        The timestamp, in ISO 8601 format, of the time at which Neptune last computed statistics.
     */

    public void setLastStatisticsComputationTime(java.util.Date lastStatisticsComputationTime) {
        this.lastStatisticsComputationTime = lastStatisticsComputationTime;
    }

    /**
     * <p>
     * The timestamp, in ISO 8601 format, of the time at which Neptune last computed statistics.
     * </p>
     * 
     * @return The timestamp, in ISO 8601 format, of the time at which Neptune last computed statistics.
     */

    public java.util.Date getLastStatisticsComputationTime() {
        return this.lastStatisticsComputationTime;
    }

    /**
     * <p>
     * The timestamp, in ISO 8601 format, of the time at which Neptune last computed statistics.
     * </p>
     * 
     * @param lastStatisticsComputationTime
     *        The timestamp, in ISO 8601 format, of the time at which Neptune last computed statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummaryValueMap withLastStatisticsComputationTime(java.util.Date lastStatisticsComputationTime) {
        setLastStatisticsComputationTime(lastStatisticsComputationTime);
        return this;
    }

    /**
     * <p>
     * The graph summary of an RDF graph. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-graph-summary.html#neptune-graph-summary-rdf-response"
     * >Graph summary response for an RDF graph</a>.
     * </p>
     * 
     * @param graphSummary
     *        The graph summary of an RDF graph. See <a href=
     *        "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-graph-summary.html#neptune-graph-summary-rdf-response"
     *        >Graph summary response for an RDF graph</a>.
     */

    public void setGraphSummary(RDFGraphSummary graphSummary) {
        this.graphSummary = graphSummary;
    }

    /**
     * <p>
     * The graph summary of an RDF graph. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-graph-summary.html#neptune-graph-summary-rdf-response"
     * >Graph summary response for an RDF graph</a>.
     * </p>
     * 
     * @return The graph summary of an RDF graph. See <a href=
     *         "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-graph-summary.html#neptune-graph-summary-rdf-response"
     *         >Graph summary response for an RDF graph</a>.
     */

    public RDFGraphSummary getGraphSummary() {
        return this.graphSummary;
    }

    /**
     * <p>
     * The graph summary of an RDF graph. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-graph-summary.html#neptune-graph-summary-rdf-response"
     * >Graph summary response for an RDF graph</a>.
     * </p>
     * 
     * @param graphSummary
     *        The graph summary of an RDF graph. See <a href=
     *        "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-graph-summary.html#neptune-graph-summary-rdf-response"
     *        >Graph summary response for an RDF graph</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDFGraphSummaryValueMap withGraphSummary(RDFGraphSummary graphSummary) {
        setGraphSummary(graphSummary);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getLastStatisticsComputationTime() != null)
            sb.append("LastStatisticsComputationTime: ").append(getLastStatisticsComputationTime()).append(",");
        if (getGraphSummary() != null)
            sb.append("GraphSummary: ").append(getGraphSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDFGraphSummaryValueMap == false)
            return false;
        RDFGraphSummaryValueMap other = (RDFGraphSummaryValueMap) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getLastStatisticsComputationTime() == null ^ this.getLastStatisticsComputationTime() == null)
            return false;
        if (other.getLastStatisticsComputationTime() != null
                && other.getLastStatisticsComputationTime().equals(this.getLastStatisticsComputationTime()) == false)
            return false;
        if (other.getGraphSummary() == null ^ this.getGraphSummary() == null)
            return false;
        if (other.getGraphSummary() != null && other.getGraphSummary().equals(this.getGraphSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getLastStatisticsComputationTime() == null) ? 0 : getLastStatisticsComputationTime().hashCode());
        hashCode = prime * hashCode + ((getGraphSummary() == null) ? 0 : getGraphSummary().hashCode());
        return hashCode;
    }

    @Override
    public RDFGraphSummaryValueMap clone() {
        try {
            return (RDFGraphSummaryValueMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.RDFGraphSummaryValueMapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
