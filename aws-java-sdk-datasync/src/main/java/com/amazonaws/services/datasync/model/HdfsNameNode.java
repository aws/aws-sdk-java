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
 * The NameNode of the Hadoop Distributed File System (HDFS). The NameNode manages the file system's namespace. The
 * NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the
 * information to map blocks of data to the DataNodes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/HdfsNameNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HdfsNameNode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name
     * of the NameNode. An agent that's installed on-premises uses this hostname to communicate with the NameNode in the
     * network.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The port that the NameNode uses to listen to client requests.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name
     * of the NameNode. An agent that's installed on-premises uses this hostname to communicate with the NameNode in the
     * network.
     * </p>
     * 
     * @param hostname
     *        The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service
     *        (DNS) name of the NameNode. An agent that's installed on-premises uses this hostname to communicate with
     *        the NameNode in the network.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name
     * of the NameNode. An agent that's installed on-premises uses this hostname to communicate with the NameNode in the
     * network.
     * </p>
     * 
     * @return The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service
     *         (DNS) name of the NameNode. An agent that's installed on-premises uses this hostname to communicate with
     *         the NameNode in the network.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name
     * of the NameNode. An agent that's installed on-premises uses this hostname to communicate with the NameNode in the
     * network.
     * </p>
     * 
     * @param hostname
     *        The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service
     *        (DNS) name of the NameNode. An agent that's installed on-premises uses this hostname to communicate with
     *        the NameNode in the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HdfsNameNode withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The port that the NameNode uses to listen to client requests.
     * </p>
     * 
     * @param port
     *        The port that the NameNode uses to listen to client requests.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the NameNode uses to listen to client requests.
     * </p>
     * 
     * @return The port that the NameNode uses to listen to client requests.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that the NameNode uses to listen to client requests.
     * </p>
     * 
     * @param port
     *        The port that the NameNode uses to listen to client requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HdfsNameNode withPort(Integer port) {
        setPort(port);
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
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HdfsNameNode == false)
            return false;
        HdfsNameNode other = (HdfsNameNode) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public HdfsNameNode clone() {
        try {
            return (HdfsNameNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.HdfsNameNodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
