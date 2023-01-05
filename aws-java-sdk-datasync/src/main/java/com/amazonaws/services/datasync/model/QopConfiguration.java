/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer privacy
 * settings configured on the Hadoop Distributed File System (HDFS) cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/QopConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QopConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop cluster.
     * </p>
     */
    private String rpcProtection;
    /**
     * <p>
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop cluster.
     * </p>
     */
    private String dataTransferProtection;

    /**
     * <p>
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop cluster.
     * </p>
     * 
     * @param rpcProtection
     *        The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     *        <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop cluster.
     * @see HdfsRpcProtection
     */

    public void setRpcProtection(String rpcProtection) {
        this.rpcProtection = rpcProtection;
    }

    /**
     * <p>
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop cluster.
     * </p>
     * 
     * @return The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     *         <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop
     *         cluster.
     * @see HdfsRpcProtection
     */

    public String getRpcProtection() {
        return this.rpcProtection;
    }

    /**
     * <p>
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop cluster.
     * </p>
     * 
     * @param rpcProtection
     *        The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     *        <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HdfsRpcProtection
     */

    public QopConfiguration withRpcProtection(String rpcProtection) {
        setRpcProtection(rpcProtection);
        return this;
    }

    /**
     * <p>
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop cluster.
     * </p>
     * 
     * @param rpcProtection
     *        The RPC protection setting configured on the HDFS cluster. This setting corresponds to your
     *        <code>hadoop.rpc.protection</code> setting in your <code>core-site.xml</code> file on your Hadoop cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HdfsRpcProtection
     */

    public QopConfiguration withRpcProtection(HdfsRpcProtection rpcProtection) {
        this.rpcProtection = rpcProtection.toString();
        return this;
    }

    /**
     * <p>
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop cluster.
     * </p>
     * 
     * @param dataTransferProtection
     *        The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     *        <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop
     *        cluster.
     * @see HdfsDataTransferProtection
     */

    public void setDataTransferProtection(String dataTransferProtection) {
        this.dataTransferProtection = dataTransferProtection;
    }

    /**
     * <p>
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop cluster.
     * </p>
     * 
     * @return The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     *         <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop
     *         cluster.
     * @see HdfsDataTransferProtection
     */

    public String getDataTransferProtection() {
        return this.dataTransferProtection;
    }

    /**
     * <p>
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop cluster.
     * </p>
     * 
     * @param dataTransferProtection
     *        The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     *        <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HdfsDataTransferProtection
     */

    public QopConfiguration withDataTransferProtection(String dataTransferProtection) {
        setDataTransferProtection(dataTransferProtection);
        return this;
    }

    /**
     * <p>
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     * <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop cluster.
     * </p>
     * 
     * @param dataTransferProtection
     *        The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your
     *        <code>dfs.data.transfer.protection</code> setting in the <code>hdfs-site.xml</code> file on your Hadoop
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HdfsDataTransferProtection
     */

    public QopConfiguration withDataTransferProtection(HdfsDataTransferProtection dataTransferProtection) {
        this.dataTransferProtection = dataTransferProtection.toString();
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
        if (getRpcProtection() != null)
            sb.append("RpcProtection: ").append(getRpcProtection()).append(",");
        if (getDataTransferProtection() != null)
            sb.append("DataTransferProtection: ").append(getDataTransferProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QopConfiguration == false)
            return false;
        QopConfiguration other = (QopConfiguration) obj;
        if (other.getRpcProtection() == null ^ this.getRpcProtection() == null)
            return false;
        if (other.getRpcProtection() != null && other.getRpcProtection().equals(this.getRpcProtection()) == false)
            return false;
        if (other.getDataTransferProtection() == null ^ this.getDataTransferProtection() == null)
            return false;
        if (other.getDataTransferProtection() != null && other.getDataTransferProtection().equals(this.getDataTransferProtection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRpcProtection() == null) ? 0 : getRpcProtection().hashCode());
        hashCode = prime * hashCode + ((getDataTransferProtection() == null) ? 0 : getDataTransferProtection().hashCode());
        return hashCode;
    }

    @Override
    public QopConfiguration clone() {
        try {
            return (QopConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.QopConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
