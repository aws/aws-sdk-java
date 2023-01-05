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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationHdfs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationHdfsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS
     * cluster. If the subdirectory isn't specified, it will default to <code>/</code>.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and
     * renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     * </p>
     */
    private java.util.List<HdfsNameNode> nameNodes;
    /**
     * <p>
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The
     * default block size is 128 mebibytes (MiB).
     * </p>
     */
    private Integer blockSize;
    /**
     * <p>
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated
     * to three DataNodes.
     * </p>
     */
    private Integer replicationFactor;
    /**
     * <p>
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * </p>
     */
    private String kmsKeyProviderUri;
    /**
     * <p>
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     * protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If
     * <code>QopConfiguration</code> isn't specified, <code>RpcProtection</code> and <code>DataTransferProtection</code>
     * default to <code>PRIVACY</code>. If you set <code>RpcProtection</code> or <code>DataTransferProtection</code>,
     * the other parameter assumes the same value.
     * </p>
     */
    private QopConfiguration qopConfiguration;
    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The user name used to identify the client on the host operating system.
     * </p>
     * <note>
     * <p>
     * If <code>SIMPLE</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     */
    private String simpleUser;
    /**
     * <p>
     * The Kerberos principal with access to the files and folders on the HDFS cluster.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     */
    private String kerberosPrincipal;
    /**
     * <p>
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted
     * keys. You can load the keytab from a file by providing the file's address. If you're using the CLI, it performs
     * base64 encoding for you. Otherwise, provide the base64-encoded text.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     */
    private java.nio.ByteBuffer kerberosKeytab;
    /**
     * <p>
     * The <code>krb5.conf</code> file that contains the Kerberos configuration information. You can load the
     * <code>krb5.conf</code> file by providing the file's address. If you're using the CLI, it performs the base64
     * encoding for you. Otherwise, provide the base64-encoded text.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     */
    private java.nio.ByteBuffer kerberosKrb5Conf;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS
     * cluster. If the subdirectory isn't specified, it will default to <code>/</code>.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS
     *        cluster. If the subdirectory isn't specified, it will default to <code>/</code>.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS
     * cluster. If the subdirectory isn't specified, it will default to <code>/</code>.
     * </p>
     * 
     * @return A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS
     *         cluster. If the subdirectory isn't specified, it will default to <code>/</code>.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS
     * cluster. If the subdirectory isn't specified, it will default to <code>/</code>.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS
     *        cluster. If the subdirectory isn't specified, it will default to <code>/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and
     * renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     * </p>
     * 
     * @return The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing,
     *         and renaming files and directories. The NameNode contains the information to map blocks of data to the
     *         DataNodes. You can use only one NameNode.
     */

    public java.util.List<HdfsNameNode> getNameNodes() {
        return nameNodes;
    }

    /**
     * <p>
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and
     * renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     * </p>
     * 
     * @param nameNodes
     *        The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing,
     *        and renaming files and directories. The NameNode contains the information to map blocks of data to the
     *        DataNodes. You can use only one NameNode.
     */

    public void setNameNodes(java.util.Collection<HdfsNameNode> nameNodes) {
        if (nameNodes == null) {
            this.nameNodes = null;
            return;
        }

        this.nameNodes = new java.util.ArrayList<HdfsNameNode>(nameNodes);
    }

    /**
     * <p>
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and
     * renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameNodes(java.util.Collection)} or {@link #withNameNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameNodes
     *        The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing,
     *        and renaming files and directories. The NameNode contains the information to map blocks of data to the
     *        DataNodes. You can use only one NameNode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withNameNodes(HdfsNameNode... nameNodes) {
        if (this.nameNodes == null) {
            setNameNodes(new java.util.ArrayList<HdfsNameNode>(nameNodes.length));
        }
        for (HdfsNameNode ele : nameNodes) {
            this.nameNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and
     * renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You
     * can use only one NameNode.
     * </p>
     * 
     * @param nameNodes
     *        The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing,
     *        and renaming files and directories. The NameNode contains the information to map blocks of data to the
     *        DataNodes. You can use only one NameNode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withNameNodes(java.util.Collection<HdfsNameNode> nameNodes) {
        setNameNodes(nameNodes);
        return this;
    }

    /**
     * <p>
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The
     * default block size is 128 mebibytes (MiB).
     * </p>
     * 
     * @param blockSize
     *        The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes.
     *        The default block size is 128 mebibytes (MiB).
     */

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    /**
     * <p>
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The
     * default block size is 128 mebibytes (MiB).
     * </p>
     * 
     * @return The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes.
     *         The default block size is 128 mebibytes (MiB).
     */

    public Integer getBlockSize() {
        return this.blockSize;
    }

    /**
     * <p>
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The
     * default block size is 128 mebibytes (MiB).
     * </p>
     * 
     * @param blockSize
     *        The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes.
     *        The default block size is 128 mebibytes (MiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withBlockSize(Integer blockSize) {
        setBlockSize(blockSize);
        return this;
    }

    /**
     * <p>
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated
     * to three DataNodes.
     * </p>
     * 
     * @param replicationFactor
     *        The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is
     *        replicated to three DataNodes.
     */

    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    /**
     * <p>
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated
     * to three DataNodes.
     * </p>
     * 
     * @return The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is
     *         replicated to three DataNodes.
     */

    public Integer getReplicationFactor() {
        return this.replicationFactor;
    }

    /**
     * <p>
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated
     * to three DataNodes.
     * </p>
     * 
     * @param replicationFactor
     *        The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is
     *        replicated to three DataNodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withReplicationFactor(Integer replicationFactor) {
        setReplicationFactor(replicationFactor);
        return this;
    }

    /**
     * <p>
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * </p>
     * 
     * @param kmsKeyProviderUri
     *        The URI of the HDFS cluster's Key Management Server (KMS).
     */

    public void setKmsKeyProviderUri(String kmsKeyProviderUri) {
        this.kmsKeyProviderUri = kmsKeyProviderUri;
    }

    /**
     * <p>
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * </p>
     * 
     * @return The URI of the HDFS cluster's Key Management Server (KMS).
     */

    public String getKmsKeyProviderUri() {
        return this.kmsKeyProviderUri;
    }

    /**
     * <p>
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * </p>
     * 
     * @param kmsKeyProviderUri
     *        The URI of the HDFS cluster's Key Management Server (KMS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withKmsKeyProviderUri(String kmsKeyProviderUri) {
        setKmsKeyProviderUri(kmsKeyProviderUri);
        return this;
    }

    /**
     * <p>
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     * protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If
     * <code>QopConfiguration</code> isn't specified, <code>RpcProtection</code> and <code>DataTransferProtection</code>
     * default to <code>PRIVACY</code>. If you set <code>RpcProtection</code> or <code>DataTransferProtection</code>,
     * the other parameter assumes the same value.
     * </p>
     * 
     * @param qopConfiguration
     *        The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     *        protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If
     *        <code>QopConfiguration</code> isn't specified, <code>RpcProtection</code> and
     *        <code>DataTransferProtection</code> default to <code>PRIVACY</code>. If you set <code>RpcProtection</code>
     *        or <code>DataTransferProtection</code>, the other parameter assumes the same value.
     */

    public void setQopConfiguration(QopConfiguration qopConfiguration) {
        this.qopConfiguration = qopConfiguration;
    }

    /**
     * <p>
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     * protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If
     * <code>QopConfiguration</code> isn't specified, <code>RpcProtection</code> and <code>DataTransferProtection</code>
     * default to <code>PRIVACY</code>. If you set <code>RpcProtection</code> or <code>DataTransferProtection</code>,
     * the other parameter assumes the same value.
     * </p>
     * 
     * @return The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     *         protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If
     *         <code>QopConfiguration</code> isn't specified, <code>RpcProtection</code> and
     *         <code>DataTransferProtection</code> default to <code>PRIVACY</code>. If you set
     *         <code>RpcProtection</code> or <code>DataTransferProtection</code>, the other parameter assumes the same
     *         value.
     */

    public QopConfiguration getQopConfiguration() {
        return this.qopConfiguration;
    }

    /**
     * <p>
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     * protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If
     * <code>QopConfiguration</code> isn't specified, <code>RpcProtection</code> and <code>DataTransferProtection</code>
     * default to <code>PRIVACY</code>. If you set <code>RpcProtection</code> or <code>DataTransferProtection</code>,
     * the other parameter assumes the same value.
     * </p>
     * 
     * @param qopConfiguration
     *        The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     *        protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If
     *        <code>QopConfiguration</code> isn't specified, <code>RpcProtection</code> and
     *        <code>DataTransferProtection</code> default to <code>PRIVACY</code>. If you set <code>RpcProtection</code>
     *        or <code>DataTransferProtection</code>, the other parameter assumes the same value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withQopConfiguration(QopConfiguration qopConfiguration) {
        setQopConfiguration(qopConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication used to determine the identity of the user.
     * @see HdfsAuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     * 
     * @return The type of authentication used to determine the identity of the user.
     * @see HdfsAuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication used to determine the identity of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HdfsAuthenticationType
     */

    public CreateLocationHdfsRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication used to determine the identity of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HdfsAuthenticationType
     */

    public CreateLocationHdfsRequest withAuthenticationType(HdfsAuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The user name used to identify the client on the host operating system.
     * </p>
     * <note>
     * <p>
     * If <code>SIMPLE</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * 
     * @param simpleUser
     *        The user name used to identify the client on the host operating system. </p> <note>
     *        <p>
     *        If <code>SIMPLE</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *        </p>
     */

    public void setSimpleUser(String simpleUser) {
        this.simpleUser = simpleUser;
    }

    /**
     * <p>
     * The user name used to identify the client on the host operating system.
     * </p>
     * <note>
     * <p>
     * If <code>SIMPLE</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * 
     * @return The user name used to identify the client on the host operating system. </p> <note>
     *         <p>
     *         If <code>SIMPLE</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *         </p>
     */

    public String getSimpleUser() {
        return this.simpleUser;
    }

    /**
     * <p>
     * The user name used to identify the client on the host operating system.
     * </p>
     * <note>
     * <p>
     * If <code>SIMPLE</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * 
     * @param simpleUser
     *        The user name used to identify the client on the host operating system. </p> <note>
     *        <p>
     *        If <code>SIMPLE</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withSimpleUser(String simpleUser) {
        setSimpleUser(simpleUser);
        return this;
    }

    /**
     * <p>
     * The Kerberos principal with access to the files and folders on the HDFS cluster.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * 
     * @param kerberosPrincipal
     *        The Kerberos principal with access to the files and folders on the HDFS cluster. </p> <note>
     *        <p>
     *        If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *        </p>
     */

    public void setKerberosPrincipal(String kerberosPrincipal) {
        this.kerberosPrincipal = kerberosPrincipal;
    }

    /**
     * <p>
     * The Kerberos principal with access to the files and folders on the HDFS cluster.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * 
     * @return The Kerberos principal with access to the files and folders on the HDFS cluster. </p> <note>
     *         <p>
     *         If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *         </p>
     */

    public String getKerberosPrincipal() {
        return this.kerberosPrincipal;
    }

    /**
     * <p>
     * The Kerberos principal with access to the files and folders on the HDFS cluster.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * 
     * @param kerberosPrincipal
     *        The Kerberos principal with access to the files and folders on the HDFS cluster. </p> <note>
     *        <p>
     *        If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withKerberosPrincipal(String kerberosPrincipal) {
        setKerberosPrincipal(kerberosPrincipal);
        return this;
    }

    /**
     * <p>
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted
     * keys. You can load the keytab from a file by providing the file's address. If you're using the CLI, it performs
     * base64 encoding for you. Otherwise, provide the base64-encoded text.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param kerberosKeytab
     *        The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the
     *        encrypted keys. You can load the keytab from a file by providing the file's address. If you're using the
     *        CLI, it performs base64 encoding for you. Otherwise, provide the base64-encoded text. </p> <note>
     *        <p>
     *        If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *        </p>
     */

    public void setKerberosKeytab(java.nio.ByteBuffer kerberosKeytab) {
        this.kerberosKeytab = kerberosKeytab;
    }

    /**
     * <p>
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted
     * keys. You can load the keytab from a file by providing the file's address. If you're using the CLI, it performs
     * base64 encoding for you. Otherwise, provide the base64-encoded text.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the
     *         encrypted keys. You can load the keytab from a file by providing the file's address. If you're using the
     *         CLI, it performs base64 encoding for you. Otherwise, provide the base64-encoded text. </p> <note>
     *         <p>
     *         If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *         </p>
     */

    public java.nio.ByteBuffer getKerberosKeytab() {
        return this.kerberosKeytab;
    }

    /**
     * <p>
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted
     * keys. You can load the keytab from a file by providing the file's address. If you're using the CLI, it performs
     * base64 encoding for you. Otherwise, provide the base64-encoded text.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param kerberosKeytab
     *        The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the
     *        encrypted keys. You can load the keytab from a file by providing the file's address. If you're using the
     *        CLI, it performs base64 encoding for you. Otherwise, provide the base64-encoded text. </p> <note>
     *        <p>
     *        If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withKerberosKeytab(java.nio.ByteBuffer kerberosKeytab) {
        setKerberosKeytab(kerberosKeytab);
        return this;
    }

    /**
     * <p>
     * The <code>krb5.conf</code> file that contains the Kerberos configuration information. You can load the
     * <code>krb5.conf</code> file by providing the file's address. If you're using the CLI, it performs the base64
     * encoding for you. Otherwise, provide the base64-encoded text.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param kerberosKrb5Conf
     *        The <code>krb5.conf</code> file that contains the Kerberos configuration information. You can load the
     *        <code>krb5.conf</code> file by providing the file's address. If you're using the CLI, it performs the
     *        base64 encoding for you. Otherwise, provide the base64-encoded text. </p> <note>
     *        <p>
     *        If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *        </p>
     */

    public void setKerberosKrb5Conf(java.nio.ByteBuffer kerberosKrb5Conf) {
        this.kerberosKrb5Conf = kerberosKrb5Conf;
    }

    /**
     * <p>
     * The <code>krb5.conf</code> file that contains the Kerberos configuration information. You can load the
     * <code>krb5.conf</code> file by providing the file's address. If you're using the CLI, it performs the base64
     * encoding for you. Otherwise, provide the base64-encoded text.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The <code>krb5.conf</code> file that contains the Kerberos configuration information. You can load the
     *         <code>krb5.conf</code> file by providing the file's address. If you're using the CLI, it performs the
     *         base64 encoding for you. Otherwise, provide the base64-encoded text. </p> <note>
     *         <p>
     *         If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *         </p>
     */

    public java.nio.ByteBuffer getKerberosKrb5Conf() {
        return this.kerberosKrb5Conf;
    }

    /**
     * <p>
     * The <code>krb5.conf</code> file that contains the Kerberos configuration information. You can load the
     * <code>krb5.conf</code> file by providing the file's address. If you're using the CLI, it performs the base64
     * encoding for you. Otherwise, provide the base64-encoded text.
     * </p>
     * <note>
     * <p>
     * If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     * </p>
     * </note>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param kerberosKrb5Conf
     *        The <code>krb5.conf</code> file that contains the Kerberos configuration information. You can load the
     *        <code>krb5.conf</code> file by providing the file's address. If you're using the CLI, it performs the
     *        base64 encoding for you. Otherwise, provide the base64-encoded text. </p> <note>
     *        <p>
     *        If <code>KERBEROS</code> is specified for <code>AuthenticationType</code>, this parameter is required.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withKerberosKrb5Conf(java.nio.ByteBuffer kerberosKrb5Conf) {
        setKerberosKrb5Conf(kerberosKrb5Conf);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     */

    public void setAgentArns(java.util.Collection<String> agentArns) {
        if (agentArns == null) {
            this.agentArns = null;
            return;
        }

        this.agentArns = new java.util.ArrayList<String>(agentArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withAgentArns(String... agentArns) {
        if (this.agentArns == null) {
            setAgentArns(new java.util.ArrayList<String>(agentArns.length));
        }
        for (String ele : agentArns) {
            this.agentArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Names (ARNs) of the agents that are used to connect to the HDFS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @return The key-value pair that represents the tag that you want to add to the location. The value can be an
     *         empty string. We recommend using tags to name your resources.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationHdfsRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getNameNodes() != null)
            sb.append("NameNodes: ").append(getNameNodes()).append(",");
        if (getBlockSize() != null)
            sb.append("BlockSize: ").append(getBlockSize()).append(",");
        if (getReplicationFactor() != null)
            sb.append("ReplicationFactor: ").append(getReplicationFactor()).append(",");
        if (getKmsKeyProviderUri() != null)
            sb.append("KmsKeyProviderUri: ").append(getKmsKeyProviderUri()).append(",");
        if (getQopConfiguration() != null)
            sb.append("QopConfiguration: ").append(getQopConfiguration()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getSimpleUser() != null)
            sb.append("SimpleUser: ").append(getSimpleUser()).append(",");
        if (getKerberosPrincipal() != null)
            sb.append("KerberosPrincipal: ").append(getKerberosPrincipal()).append(",");
        if (getKerberosKeytab() != null)
            sb.append("KerberosKeytab: ").append(getKerberosKeytab()).append(",");
        if (getKerberosKrb5Conf() != null)
            sb.append("KerberosKrb5Conf: ").append(getKerberosKrb5Conf()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocationHdfsRequest == false)
            return false;
        CreateLocationHdfsRequest other = (CreateLocationHdfsRequest) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getNameNodes() == null ^ this.getNameNodes() == null)
            return false;
        if (other.getNameNodes() != null && other.getNameNodes().equals(this.getNameNodes()) == false)
            return false;
        if (other.getBlockSize() == null ^ this.getBlockSize() == null)
            return false;
        if (other.getBlockSize() != null && other.getBlockSize().equals(this.getBlockSize()) == false)
            return false;
        if (other.getReplicationFactor() == null ^ this.getReplicationFactor() == null)
            return false;
        if (other.getReplicationFactor() != null && other.getReplicationFactor().equals(this.getReplicationFactor()) == false)
            return false;
        if (other.getKmsKeyProviderUri() == null ^ this.getKmsKeyProviderUri() == null)
            return false;
        if (other.getKmsKeyProviderUri() != null && other.getKmsKeyProviderUri().equals(this.getKmsKeyProviderUri()) == false)
            return false;
        if (other.getQopConfiguration() == null ^ this.getQopConfiguration() == null)
            return false;
        if (other.getQopConfiguration() != null && other.getQopConfiguration().equals(this.getQopConfiguration()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getSimpleUser() == null ^ this.getSimpleUser() == null)
            return false;
        if (other.getSimpleUser() != null && other.getSimpleUser().equals(this.getSimpleUser()) == false)
            return false;
        if (other.getKerberosPrincipal() == null ^ this.getKerberosPrincipal() == null)
            return false;
        if (other.getKerberosPrincipal() != null && other.getKerberosPrincipal().equals(this.getKerberosPrincipal()) == false)
            return false;
        if (other.getKerberosKeytab() == null ^ this.getKerberosKeytab() == null)
            return false;
        if (other.getKerberosKeytab() != null && other.getKerberosKeytab().equals(this.getKerberosKeytab()) == false)
            return false;
        if (other.getKerberosKrb5Conf() == null ^ this.getKerberosKrb5Conf() == null)
            return false;
        if (other.getKerberosKrb5Conf() != null && other.getKerberosKrb5Conf().equals(this.getKerberosKrb5Conf()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getNameNodes() == null) ? 0 : getNameNodes().hashCode());
        hashCode = prime * hashCode + ((getBlockSize() == null) ? 0 : getBlockSize().hashCode());
        hashCode = prime * hashCode + ((getReplicationFactor() == null) ? 0 : getReplicationFactor().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyProviderUri() == null) ? 0 : getKmsKeyProviderUri().hashCode());
        hashCode = prime * hashCode + ((getQopConfiguration() == null) ? 0 : getQopConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getSimpleUser() == null) ? 0 : getSimpleUser().hashCode());
        hashCode = prime * hashCode + ((getKerberosPrincipal() == null) ? 0 : getKerberosPrincipal().hashCode());
        hashCode = prime * hashCode + ((getKerberosKeytab() == null) ? 0 : getKerberosKeytab().hashCode());
        hashCode = prime * hashCode + ((getKerberosKrb5Conf() == null) ? 0 : getKerberosKrb5Conf().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationHdfsRequest clone() {
        return (CreateLocationHdfsRequest) super.clone();
    }

}
