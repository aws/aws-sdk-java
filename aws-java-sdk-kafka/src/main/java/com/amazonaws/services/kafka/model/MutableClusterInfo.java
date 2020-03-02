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
 * Information about cluster attributes that can be updated via update APIs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/MutableClusterInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MutableClusterInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p>
     */
    private java.util.List<BrokerEBSVolumeInfo> brokerEBSVolumeInfo;
    /**
     * <p>
     * Information about the changes in the configuration of the brokers.
     * </p>
     */
    private ConfigurationInfo configurationInfo;
    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     */
    private Integer numberOfBrokerNodes;
    /**
     * <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     * </p>
     */
    private String enhancedMonitoring;
    /**
     * <p>
     * The settings for open monitoring.
     * </p>
     */
    private OpenMonitoring openMonitoring;

    private LoggingInfo loggingInfo;

    /**
     * <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p>
     * 
     * @return <p>
     *         Specifies the size of the EBS volume and the ID of the associated broker.
     *         </p>
     */

    public java.util.List<BrokerEBSVolumeInfo> getBrokerEBSVolumeInfo() {
        return brokerEBSVolumeInfo;
    }

    /**
     * <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p>
     * 
     * @param brokerEBSVolumeInfo
     *        <p>
     *        Specifies the size of the EBS volume and the ID of the associated broker.
     *        </p>
     */

    public void setBrokerEBSVolumeInfo(java.util.Collection<BrokerEBSVolumeInfo> brokerEBSVolumeInfo) {
        if (brokerEBSVolumeInfo == null) {
            this.brokerEBSVolumeInfo = null;
            return;
        }

        this.brokerEBSVolumeInfo = new java.util.ArrayList<BrokerEBSVolumeInfo>(brokerEBSVolumeInfo);
    }

    /**
     * <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBrokerEBSVolumeInfo(java.util.Collection)} or {@link #withBrokerEBSVolumeInfo(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param brokerEBSVolumeInfo
     *        <p>
     *        Specifies the size of the EBS volume and the ID of the associated broker.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutableClusterInfo withBrokerEBSVolumeInfo(BrokerEBSVolumeInfo... brokerEBSVolumeInfo) {
        if (this.brokerEBSVolumeInfo == null) {
            setBrokerEBSVolumeInfo(new java.util.ArrayList<BrokerEBSVolumeInfo>(brokerEBSVolumeInfo.length));
        }
        for (BrokerEBSVolumeInfo ele : brokerEBSVolumeInfo) {
            this.brokerEBSVolumeInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p>
     * 
     * @param brokerEBSVolumeInfo
     *        <p>
     *        Specifies the size of the EBS volume and the ID of the associated broker.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutableClusterInfo withBrokerEBSVolumeInfo(java.util.Collection<BrokerEBSVolumeInfo> brokerEBSVolumeInfo) {
        setBrokerEBSVolumeInfo(brokerEBSVolumeInfo);
        return this;
    }

    /**
     * <p>
     * Information about the changes in the configuration of the brokers.
     * </p>
     * 
     * @param configurationInfo
     *        <p>
     *        Information about the changes in the configuration of the brokers.
     *        </p>
     */

    public void setConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
    }

    /**
     * <p>
     * Information about the changes in the configuration of the brokers.
     * </p>
     * 
     * @return <p>
     *         Information about the changes in the configuration of the brokers.
     *         </p>
     */

    public ConfigurationInfo getConfigurationInfo() {
        return this.configurationInfo;
    }

    /**
     * <p>
     * Information about the changes in the configuration of the brokers.
     * </p>
     * 
     * @param configurationInfo
     *        <p>
     *        Information about the changes in the configuration of the brokers.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutableClusterInfo withConfigurationInfo(ConfigurationInfo configurationInfo) {
        setConfigurationInfo(configurationInfo);
        return this;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        <p>
     *        The number of broker nodes in the cluster.
     *        </p>
     */

    public void setNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @return <p>
     *         The number of broker nodes in the cluster.
     *         </p>
     */

    public Integer getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        <p>
     *        The number of broker nodes in the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutableClusterInfo withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        setNumberOfBrokerNodes(numberOfBrokerNodes);
        return this;
    }

    /**
     * <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     *        </p>
     * @see EnhancedMonitoring
     */

    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     * </p>
     * 
     * @return <p>
     *         Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     *         </p>
     * @see EnhancedMonitoring
     */

    public String getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public MutableClusterInfo withEnhancedMonitoring(String enhancedMonitoring) {
        setEnhancedMonitoring(enhancedMonitoring);
        return this;
    }

    /**
     * <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     * </p>
     * 
     * @param enhancedMonitoring
     *        <p>
     *        Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedMonitoring
     */

    public MutableClusterInfo withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
        return this;
    }

    /**
     * <p>
     * The settings for open monitoring.
     * </p>
     * 
     * @param openMonitoring
     *        <p>
     *        The settings for open monitoring.
     *        </p>
     */

    public void setOpenMonitoring(OpenMonitoring openMonitoring) {
        this.openMonitoring = openMonitoring;
    }

    /**
     * <p>
     * The settings for open monitoring.
     * </p>
     * 
     * @return <p>
     *         The settings for open monitoring.
     *         </p>
     */

    public OpenMonitoring getOpenMonitoring() {
        return this.openMonitoring;
    }

    /**
     * <p>
     * The settings for open monitoring.
     * </p>
     * 
     * @param openMonitoring
     *        <p>
     *        The settings for open monitoring.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutableClusterInfo withOpenMonitoring(OpenMonitoring openMonitoring) {
        setOpenMonitoring(openMonitoring);
        return this;
    }

    /**
     * @param loggingInfo
     */

    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * @return
     */

    public LoggingInfo getLoggingInfo() {
        return this.loggingInfo;
    }

    /**
     * @param loggingInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutableClusterInfo withLoggingInfo(LoggingInfo loggingInfo) {
        setLoggingInfo(loggingInfo);
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
        if (getBrokerEBSVolumeInfo() != null)
            sb.append("BrokerEBSVolumeInfo: ").append(getBrokerEBSVolumeInfo()).append(",");
        if (getConfigurationInfo() != null)
            sb.append("ConfigurationInfo: ").append(getConfigurationInfo()).append(",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: ").append(getNumberOfBrokerNodes()).append(",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: ").append(getEnhancedMonitoring()).append(",");
        if (getOpenMonitoring() != null)
            sb.append("OpenMonitoring: ").append(getOpenMonitoring()).append(",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: ").append(getLoggingInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MutableClusterInfo == false)
            return false;
        MutableClusterInfo other = (MutableClusterInfo) obj;
        if (other.getBrokerEBSVolumeInfo() == null ^ this.getBrokerEBSVolumeInfo() == null)
            return false;
        if (other.getBrokerEBSVolumeInfo() != null && other.getBrokerEBSVolumeInfo().equals(this.getBrokerEBSVolumeInfo()) == false)
            return false;
        if (other.getConfigurationInfo() == null ^ this.getConfigurationInfo() == null)
            return false;
        if (other.getConfigurationInfo() != null && other.getConfigurationInfo().equals(this.getConfigurationInfo()) == false)
            return false;
        if (other.getNumberOfBrokerNodes() == null ^ this.getNumberOfBrokerNodes() == null)
            return false;
        if (other.getNumberOfBrokerNodes() != null && other.getNumberOfBrokerNodes().equals(this.getNumberOfBrokerNodes()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        if (other.getOpenMonitoring() == null ^ this.getOpenMonitoring() == null)
            return false;
        if (other.getOpenMonitoring() != null && other.getOpenMonitoring().equals(this.getOpenMonitoring()) == false)
            return false;
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerEBSVolumeInfo() == null) ? 0 : getBrokerEBSVolumeInfo().hashCode());
        hashCode = prime * hashCode + ((getConfigurationInfo() == null) ? 0 : getConfigurationInfo().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode + ((getOpenMonitoring() == null) ? 0 : getOpenMonitoring().hashCode());
        hashCode = prime * hashCode + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        return hashCode;
    }

    @Override
    public MutableClusterInfo clone() {
        try {
            return (MutableClusterInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.MutableClusterInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
