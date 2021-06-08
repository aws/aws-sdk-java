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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration properties for logging events associated with a peer node owned by a member in a Managed Blockchain
 * network.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NodeFabricLogPublishingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeFabricLogPublishingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode logs
     * contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple instances of
     * chaincode. When enabled, a log stream is created for all chaincodes, with an individual log stream for each
     * chaincode.
     * </p>
     */
    private LogConfigurations chaincodeLogs;
    /**
     * <p>
     * Configuration properties for a peer node log. Peer node logs contain messages generated when your client submits
     * transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists the chaincode
     * instances on a peer node.
     * </p>
     */
    private LogConfigurations peerLogs;

    /**
     * <p>
     * Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode logs
     * contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple instances of
     * chaincode. When enabled, a log stream is created for all chaincodes, with an individual log stream for each
     * chaincode.
     * </p>
     * 
     * @param chaincodeLogs
     *        Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode
     *        logs contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple
     *        instances of chaincode. When enabled, a log stream is created for all chaincodes, with an individual log
     *        stream for each chaincode.
     */

    public void setChaincodeLogs(LogConfigurations chaincodeLogs) {
        this.chaincodeLogs = chaincodeLogs;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode logs
     * contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple instances of
     * chaincode. When enabled, a log stream is created for all chaincodes, with an individual log stream for each
     * chaincode.
     * </p>
     * 
     * @return Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode
     *         logs contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple
     *         instances of chaincode. When enabled, a log stream is created for all chaincodes, with an individual log
     *         stream for each chaincode.
     */

    public LogConfigurations getChaincodeLogs() {
        return this.chaincodeLogs;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode logs
     * contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple instances of
     * chaincode. When enabled, a log stream is created for all chaincodes, with an individual log stream for each
     * chaincode.
     * </p>
     * 
     * @param chaincodeLogs
     *        Configuration properties for logging events associated with chaincode execution on a peer node. Chaincode
     *        logs contain the results of instantiating, invoking, and querying the chaincode. A peer can run multiple
     *        instances of chaincode. When enabled, a log stream is created for all chaincodes, with an individual log
     *        stream for each chaincode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeFabricLogPublishingConfiguration withChaincodeLogs(LogConfigurations chaincodeLogs) {
        setChaincodeLogs(chaincodeLogs);
        return this;
    }

    /**
     * <p>
     * Configuration properties for a peer node log. Peer node logs contain messages generated when your client submits
     * transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists the chaincode
     * instances on a peer node.
     * </p>
     * 
     * @param peerLogs
     *        Configuration properties for a peer node log. Peer node logs contain messages generated when your client
     *        submits transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists
     *        the chaincode instances on a peer node.
     */

    public void setPeerLogs(LogConfigurations peerLogs) {
        this.peerLogs = peerLogs;
    }

    /**
     * <p>
     * Configuration properties for a peer node log. Peer node logs contain messages generated when your client submits
     * transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists the chaincode
     * instances on a peer node.
     * </p>
     * 
     * @return Configuration properties for a peer node log. Peer node logs contain messages generated when your client
     *         submits transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists
     *         the chaincode instances on a peer node.
     */

    public LogConfigurations getPeerLogs() {
        return this.peerLogs;
    }

    /**
     * <p>
     * Configuration properties for a peer node log. Peer node logs contain messages generated when your client submits
     * transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists the chaincode
     * instances on a peer node.
     * </p>
     * 
     * @param peerLogs
     *        Configuration properties for a peer node log. Peer node logs contain messages generated when your client
     *        submits transaction proposals to peer nodes, requests to join channels, enrolls an admin peer, and lists
     *        the chaincode instances on a peer node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeFabricLogPublishingConfiguration withPeerLogs(LogConfigurations peerLogs) {
        setPeerLogs(peerLogs);
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
        if (getChaincodeLogs() != null)
            sb.append("ChaincodeLogs: ").append(getChaincodeLogs()).append(",");
        if (getPeerLogs() != null)
            sb.append("PeerLogs: ").append(getPeerLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeFabricLogPublishingConfiguration == false)
            return false;
        NodeFabricLogPublishingConfiguration other = (NodeFabricLogPublishingConfiguration) obj;
        if (other.getChaincodeLogs() == null ^ this.getChaincodeLogs() == null)
            return false;
        if (other.getChaincodeLogs() != null && other.getChaincodeLogs().equals(this.getChaincodeLogs()) == false)
            return false;
        if (other.getPeerLogs() == null ^ this.getPeerLogs() == null)
            return false;
        if (other.getPeerLogs() != null && other.getPeerLogs().equals(this.getPeerLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChaincodeLogs() == null) ? 0 : getChaincodeLogs().hashCode());
        hashCode = prime * hashCode + ((getPeerLogs() == null) ? 0 : getPeerLogs().hashCode());
        return hashCode;
    }

    @Override
    public NodeFabricLogPublishingConfiguration clone() {
        try {
            return (NodeFabricLogPublishingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeFabricLogPublishingConfigurationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
