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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartFileTransfer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFileTransferRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * One or more source paths for the Amazon S3 storage. Each string represents a source file path for one outbound
     * file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.
     * </p>
     * <note>
     * <p>
     * Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     * </p>
     * </note>
     */
    private java.util.List<String> sendFilePaths;
    /**
     * <p>
     * One or more source paths for the partner's SFTP server. Each string represents a source file path for one inbound
     * file transfer.
     * </p>
     */
    private java.util.List<String> retrieveFilePaths;
    /**
     * <p>
     * For an inbound transfer, the <code>LocaDirectoryPath</code> specifies the destination for one or more files that
     * are transferred from the partner's SFTP server.
     * </p>
     */
    private String localDirectoryPath;
    /**
     * <p>
     * For an outbound transfer, the <code>RemoteDirectoryPath</code> specifies the destination for one or more files
     * that are transferred to the partner's SFTP server. If you don't specify a <code>RemoteDirectoryPath</code>, the
     * destination for transferred files is the SFTP user's home directory.
     * </p>
     */
    private String remoteDirectoryPath;

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @param connectorId
     *        The unique identifier for the connector.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @return The unique identifier for the connector.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @param connectorId
     *        The unique identifier for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFileTransferRequest withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * One or more source paths for the Amazon S3 storage. Each string represents a source file path for one outbound
     * file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.
     * </p>
     * <note>
     * <p>
     * Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     * </p>
     * </note>
     * 
     * @return One or more source paths for the Amazon S3 storage. Each string represents a source file path for one
     *         outbound file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.</p>
     *         <note>
     *         <p>
     *         Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     *         </p>
     */

    public java.util.List<String> getSendFilePaths() {
        return sendFilePaths;
    }

    /**
     * <p>
     * One or more source paths for the Amazon S3 storage. Each string represents a source file path for one outbound
     * file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.
     * </p>
     * <note>
     * <p>
     * Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     * </p>
     * </note>
     * 
     * @param sendFilePaths
     *        One or more source paths for the Amazon S3 storage. Each string represents a source file path for one
     *        outbound file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.</p>
     *        <note>
     *        <p>
     *        Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     *        </p>
     */

    public void setSendFilePaths(java.util.Collection<String> sendFilePaths) {
        if (sendFilePaths == null) {
            this.sendFilePaths = null;
            return;
        }

        this.sendFilePaths = new java.util.ArrayList<String>(sendFilePaths);
    }

    /**
     * <p>
     * One or more source paths for the Amazon S3 storage. Each string represents a source file path for one outbound
     * file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.
     * </p>
     * <note>
     * <p>
     * Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSendFilePaths(java.util.Collection)} or {@link #withSendFilePaths(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sendFilePaths
     *        One or more source paths for the Amazon S3 storage. Each string represents a source file path for one
     *        outbound file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.</p>
     *        <note>
     *        <p>
     *        Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFileTransferRequest withSendFilePaths(String... sendFilePaths) {
        if (this.sendFilePaths == null) {
            setSendFilePaths(new java.util.ArrayList<String>(sendFilePaths.length));
        }
        for (String ele : sendFilePaths) {
            this.sendFilePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more source paths for the Amazon S3 storage. Each string represents a source file path for one outbound
     * file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.
     * </p>
     * <note>
     * <p>
     * Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     * </p>
     * </note>
     * 
     * @param sendFilePaths
     *        One or more source paths for the Amazon S3 storage. Each string represents a source file path for one
     *        outbound file transfer. For example, <code> <i>DOC-EXAMPLE-BUCKET</i>/<i>myfile.txt</i> </code>.</p>
     *        <note>
     *        <p>
     *        Replace <code> <i>DOC-EXAMPLE-BUCKET</i> </code> with one of your actual buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFileTransferRequest withSendFilePaths(java.util.Collection<String> sendFilePaths) {
        setSendFilePaths(sendFilePaths);
        return this;
    }

    /**
     * <p>
     * One or more source paths for the partner's SFTP server. Each string represents a source file path for one inbound
     * file transfer.
     * </p>
     * 
     * @return One or more source paths for the partner's SFTP server. Each string represents a source file path for one
     *         inbound file transfer.
     */

    public java.util.List<String> getRetrieveFilePaths() {
        return retrieveFilePaths;
    }

    /**
     * <p>
     * One or more source paths for the partner's SFTP server. Each string represents a source file path for one inbound
     * file transfer.
     * </p>
     * 
     * @param retrieveFilePaths
     *        One or more source paths for the partner's SFTP server. Each string represents a source file path for one
     *        inbound file transfer.
     */

    public void setRetrieveFilePaths(java.util.Collection<String> retrieveFilePaths) {
        if (retrieveFilePaths == null) {
            this.retrieveFilePaths = null;
            return;
        }

        this.retrieveFilePaths = new java.util.ArrayList<String>(retrieveFilePaths);
    }

    /**
     * <p>
     * One or more source paths for the partner's SFTP server. Each string represents a source file path for one inbound
     * file transfer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetrieveFilePaths(java.util.Collection)} or {@link #withRetrieveFilePaths(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param retrieveFilePaths
     *        One or more source paths for the partner's SFTP server. Each string represents a source file path for one
     *        inbound file transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFileTransferRequest withRetrieveFilePaths(String... retrieveFilePaths) {
        if (this.retrieveFilePaths == null) {
            setRetrieveFilePaths(new java.util.ArrayList<String>(retrieveFilePaths.length));
        }
        for (String ele : retrieveFilePaths) {
            this.retrieveFilePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more source paths for the partner's SFTP server. Each string represents a source file path for one inbound
     * file transfer.
     * </p>
     * 
     * @param retrieveFilePaths
     *        One or more source paths for the partner's SFTP server. Each string represents a source file path for one
     *        inbound file transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFileTransferRequest withRetrieveFilePaths(java.util.Collection<String> retrieveFilePaths) {
        setRetrieveFilePaths(retrieveFilePaths);
        return this;
    }

    /**
     * <p>
     * For an inbound transfer, the <code>LocaDirectoryPath</code> specifies the destination for one or more files that
     * are transferred from the partner's SFTP server.
     * </p>
     * 
     * @param localDirectoryPath
     *        For an inbound transfer, the <code>LocaDirectoryPath</code> specifies the destination for one or more
     *        files that are transferred from the partner's SFTP server.
     */

    public void setLocalDirectoryPath(String localDirectoryPath) {
        this.localDirectoryPath = localDirectoryPath;
    }

    /**
     * <p>
     * For an inbound transfer, the <code>LocaDirectoryPath</code> specifies the destination for one or more files that
     * are transferred from the partner's SFTP server.
     * </p>
     * 
     * @return For an inbound transfer, the <code>LocaDirectoryPath</code> specifies the destination for one or more
     *         files that are transferred from the partner's SFTP server.
     */

    public String getLocalDirectoryPath() {
        return this.localDirectoryPath;
    }

    /**
     * <p>
     * For an inbound transfer, the <code>LocaDirectoryPath</code> specifies the destination for one or more files that
     * are transferred from the partner's SFTP server.
     * </p>
     * 
     * @param localDirectoryPath
     *        For an inbound transfer, the <code>LocaDirectoryPath</code> specifies the destination for one or more
     *        files that are transferred from the partner's SFTP server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFileTransferRequest withLocalDirectoryPath(String localDirectoryPath) {
        setLocalDirectoryPath(localDirectoryPath);
        return this;
    }

    /**
     * <p>
     * For an outbound transfer, the <code>RemoteDirectoryPath</code> specifies the destination for one or more files
     * that are transferred to the partner's SFTP server. If you don't specify a <code>RemoteDirectoryPath</code>, the
     * destination for transferred files is the SFTP user's home directory.
     * </p>
     * 
     * @param remoteDirectoryPath
     *        For an outbound transfer, the <code>RemoteDirectoryPath</code> specifies the destination for one or more
     *        files that are transferred to the partner's SFTP server. If you don't specify a
     *        <code>RemoteDirectoryPath</code>, the destination for transferred files is the SFTP user's home directory.
     */

    public void setRemoteDirectoryPath(String remoteDirectoryPath) {
        this.remoteDirectoryPath = remoteDirectoryPath;
    }

    /**
     * <p>
     * For an outbound transfer, the <code>RemoteDirectoryPath</code> specifies the destination for one or more files
     * that are transferred to the partner's SFTP server. If you don't specify a <code>RemoteDirectoryPath</code>, the
     * destination for transferred files is the SFTP user's home directory.
     * </p>
     * 
     * @return For an outbound transfer, the <code>RemoteDirectoryPath</code> specifies the destination for one or more
     *         files that are transferred to the partner's SFTP server. If you don't specify a
     *         <code>RemoteDirectoryPath</code>, the destination for transferred files is the SFTP user's home
     *         directory.
     */

    public String getRemoteDirectoryPath() {
        return this.remoteDirectoryPath;
    }

    /**
     * <p>
     * For an outbound transfer, the <code>RemoteDirectoryPath</code> specifies the destination for one or more files
     * that are transferred to the partner's SFTP server. If you don't specify a <code>RemoteDirectoryPath</code>, the
     * destination for transferred files is the SFTP user's home directory.
     * </p>
     * 
     * @param remoteDirectoryPath
     *        For an outbound transfer, the <code>RemoteDirectoryPath</code> specifies the destination for one or more
     *        files that are transferred to the partner's SFTP server. If you don't specify a
     *        <code>RemoteDirectoryPath</code>, the destination for transferred files is the SFTP user's home directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFileTransferRequest withRemoteDirectoryPath(String remoteDirectoryPath) {
        setRemoteDirectoryPath(remoteDirectoryPath);
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
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId()).append(",");
        if (getSendFilePaths() != null)
            sb.append("SendFilePaths: ").append(getSendFilePaths()).append(",");
        if (getRetrieveFilePaths() != null)
            sb.append("RetrieveFilePaths: ").append(getRetrieveFilePaths()).append(",");
        if (getLocalDirectoryPath() != null)
            sb.append("LocalDirectoryPath: ").append(getLocalDirectoryPath()).append(",");
        if (getRemoteDirectoryPath() != null)
            sb.append("RemoteDirectoryPath: ").append(getRemoteDirectoryPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFileTransferRequest == false)
            return false;
        StartFileTransferRequest other = (StartFileTransferRequest) obj;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        if (other.getSendFilePaths() == null ^ this.getSendFilePaths() == null)
            return false;
        if (other.getSendFilePaths() != null && other.getSendFilePaths().equals(this.getSendFilePaths()) == false)
            return false;
        if (other.getRetrieveFilePaths() == null ^ this.getRetrieveFilePaths() == null)
            return false;
        if (other.getRetrieveFilePaths() != null && other.getRetrieveFilePaths().equals(this.getRetrieveFilePaths()) == false)
            return false;
        if (other.getLocalDirectoryPath() == null ^ this.getLocalDirectoryPath() == null)
            return false;
        if (other.getLocalDirectoryPath() != null && other.getLocalDirectoryPath().equals(this.getLocalDirectoryPath()) == false)
            return false;
        if (other.getRemoteDirectoryPath() == null ^ this.getRemoteDirectoryPath() == null)
            return false;
        if (other.getRemoteDirectoryPath() != null && other.getRemoteDirectoryPath().equals(this.getRemoteDirectoryPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        hashCode = prime * hashCode + ((getSendFilePaths() == null) ? 0 : getSendFilePaths().hashCode());
        hashCode = prime * hashCode + ((getRetrieveFilePaths() == null) ? 0 : getRetrieveFilePaths().hashCode());
        hashCode = prime * hashCode + ((getLocalDirectoryPath() == null) ? 0 : getLocalDirectoryPath().hashCode());
        hashCode = prime * hashCode + ((getRemoteDirectoryPath() == null) ? 0 : getRemoteDirectoryPath().hashCode());
        return hashCode;
    }

    @Override
    public StartFileTransferRequest clone() {
        return (StartFileTransferRequest) super.clone();
    }

}
