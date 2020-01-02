/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Prometheus settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/PrometheusInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrometheusInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether you want to enable or disable the JMX Exporter.
     * </p>
     */
    private JmxExporterInfo jmxExporter;
    /**
     * <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     */
    private NodeExporterInfo nodeExporter;

    /**
     * <p>
     * Indicates whether you want to enable or disable the JMX Exporter.
     * </p>
     * 
     * @param jmxExporter
     *        <p>
     *        Indicates whether you want to enable or disable the JMX Exporter.
     *        </p>
     */

    public void setJmxExporter(JmxExporterInfo jmxExporter) {
        this.jmxExporter = jmxExporter;
    }

    /**
     * <p>
     * Indicates whether you want to enable or disable the JMX Exporter.
     * </p>
     * 
     * @return <p>
     *         Indicates whether you want to enable or disable the JMX Exporter.
     *         </p>
     */

    public JmxExporterInfo getJmxExporter() {
        return this.jmxExporter;
    }

    /**
     * <p>
     * Indicates whether you want to enable or disable the JMX Exporter.
     * </p>
     * 
     * @param jmxExporter
     *        <p>
     *        Indicates whether you want to enable or disable the JMX Exporter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrometheusInfo withJmxExporter(JmxExporterInfo jmxExporter) {
        setJmxExporter(jmxExporter);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     * 
     * @param nodeExporter
     *        <p>
     *        Indicates whether you want to enable or disable the Node Exporter.
     *        </p>
     */

    public void setNodeExporter(NodeExporterInfo nodeExporter) {
        this.nodeExporter = nodeExporter;
    }

    /**
     * <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     * 
     * @return <p>
     *         Indicates whether you want to enable or disable the Node Exporter.
     *         </p>
     */

    public NodeExporterInfo getNodeExporter() {
        return this.nodeExporter;
    }

    /**
     * <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     * 
     * @param nodeExporter
     *        <p>
     *        Indicates whether you want to enable or disable the Node Exporter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrometheusInfo withNodeExporter(NodeExporterInfo nodeExporter) {
        setNodeExporter(nodeExporter);
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
        if (getJmxExporter() != null)
            sb.append("JmxExporter: ").append(getJmxExporter()).append(",");
        if (getNodeExporter() != null)
            sb.append("NodeExporter: ").append(getNodeExporter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrometheusInfo == false)
            return false;
        PrometheusInfo other = (PrometheusInfo) obj;
        if (other.getJmxExporter() == null ^ this.getJmxExporter() == null)
            return false;
        if (other.getJmxExporter() != null && other.getJmxExporter().equals(this.getJmxExporter()) == false)
            return false;
        if (other.getNodeExporter() == null ^ this.getNodeExporter() == null)
            return false;
        if (other.getNodeExporter() != null && other.getNodeExporter().equals(this.getNodeExporter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJmxExporter() == null) ? 0 : getJmxExporter().hashCode());
        hashCode = prime * hashCode + ((getNodeExporter() == null) ? 0 : getNodeExporter().hashCode());
        return hashCode;
    }

    @Override
    public PrometheusInfo clone() {
        try {
            return (PrometheusInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.PrometheusInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
