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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A development endpoint where a developer can remotely debug extract, transform, and load (ETL) scripts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DevEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the <code>DevEndpoint</code>.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used in this <code>DevEndpoint</code>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of security group identifiers used in this <code>DevEndpoint</code>.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnet ID for this <code>DevEndpoint</code>.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The YARN endpoint address used by this <code>DevEndpoint</code>.
     * </p>
     */
    private String yarnEndpointAddress;
    /**
     * <p>
     * A private IP address to access the <code>DevEndpoint</code> within a VPC if the <code>DevEndpoint</code> is
     * created within one. The <code>PrivateAddress</code> field is present only when you create the
     * <code>DevEndpoint</code> within your VPC.
     * </p>
     */
    private String privateAddress;
    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     */
    private Integer zeppelinRemoteSparkInterpreterPort;
    /**
     * <p>
     * The public IP address used by this <code>DevEndpoint</code>. The <code>PublicAddress</code> field is present only
     * when you create a non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * </p>
     */
    private String publicAddress;
    /**
     * <p>
     * The current status of this <code>DevEndpoint</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     */
    private String workerType;
    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     */
    private String glueVersion;
    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this <code>DevEndpoint</code>.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C extensions, such
     * as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not currently supported.
     * </p>
     * </note>
     */
    private String extraPythonLibsS3Path;
    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a <code>DevEndpoint</code>.
     * </p>
     * </note>
     */
    private String extraJarsS3Path;
    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The status of the last update.
     * </p>
     */
    private String lastUpdateStatus;
    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided for
     * backward compatibility because the recommended attribute to use is public keys.
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     */
    private java.util.List<String> publicKeys;
    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     */
    private java.util.Map<String, String> arguments;

    /**
     * <p>
     * The name of the <code>DevEndpoint</code>.
     * </p>
     * 
     * @param endpointName
     *        The name of the <code>DevEndpoint</code>.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The name of the <code>DevEndpoint</code>.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the <code>DevEndpoint</code>.
     * </p>
     * 
     * @param endpointName
     *        The name of the <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used in this <code>DevEndpoint</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used in this <code>DevEndpoint</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used in this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of security group identifiers used in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return A list of security group identifiers used in this <code>DevEndpoint</code>.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group identifiers used in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group identifiers used in this <code>DevEndpoint</code>.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of security group identifiers used in this <code>DevEndpoint</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group identifiers used in this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security group identifiers used in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group identifiers used in this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID for this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for this <code>DevEndpoint</code>.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID for this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The subnet ID for this <code>DevEndpoint</code>.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID for this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The YARN endpoint address used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param yarnEndpointAddress
     *        The YARN endpoint address used by this <code>DevEndpoint</code>.
     */

    public void setYarnEndpointAddress(String yarnEndpointAddress) {
        this.yarnEndpointAddress = yarnEndpointAddress;
    }

    /**
     * <p>
     * The YARN endpoint address used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The YARN endpoint address used by this <code>DevEndpoint</code>.
     */

    public String getYarnEndpointAddress() {
        return this.yarnEndpointAddress;
    }

    /**
     * <p>
     * The YARN endpoint address used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param yarnEndpointAddress
     *        The YARN endpoint address used by this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withYarnEndpointAddress(String yarnEndpointAddress) {
        setYarnEndpointAddress(yarnEndpointAddress);
        return this;
    }

    /**
     * <p>
     * A private IP address to access the <code>DevEndpoint</code> within a VPC if the <code>DevEndpoint</code> is
     * created within one. The <code>PrivateAddress</code> field is present only when you create the
     * <code>DevEndpoint</code> within your VPC.
     * </p>
     * 
     * @param privateAddress
     *        A private IP address to access the <code>DevEndpoint</code> within a VPC if the <code>DevEndpoint</code>
     *        is created within one. The <code>PrivateAddress</code> field is present only when you create the
     *        <code>DevEndpoint</code> within your VPC.
     */

    public void setPrivateAddress(String privateAddress) {
        this.privateAddress = privateAddress;
    }

    /**
     * <p>
     * A private IP address to access the <code>DevEndpoint</code> within a VPC if the <code>DevEndpoint</code> is
     * created within one. The <code>PrivateAddress</code> field is present only when you create the
     * <code>DevEndpoint</code> within your VPC.
     * </p>
     * 
     * @return A private IP address to access the <code>DevEndpoint</code> within a VPC if the <code>DevEndpoint</code>
     *         is created within one. The <code>PrivateAddress</code> field is present only when you create the
     *         <code>DevEndpoint</code> within your VPC.
     */

    public String getPrivateAddress() {
        return this.privateAddress;
    }

    /**
     * <p>
     * A private IP address to access the <code>DevEndpoint</code> within a VPC if the <code>DevEndpoint</code> is
     * created within one. The <code>PrivateAddress</code> field is present only when you create the
     * <code>DevEndpoint</code> within your VPC.
     * </p>
     * 
     * @param privateAddress
     *        A private IP address to access the <code>DevEndpoint</code> within a VPC if the <code>DevEndpoint</code>
     *        is created within one. The <code>PrivateAddress</code> field is present only when you create the
     *        <code>DevEndpoint</code> within your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withPrivateAddress(String privateAddress) {
        setPrivateAddress(privateAddress);
        return this;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     * 
     * @param zeppelinRemoteSparkInterpreterPort
     *        The Apache Zeppelin port for the remote Apache Spark interpreter.
     */

    public void setZeppelinRemoteSparkInterpreterPort(Integer zeppelinRemoteSparkInterpreterPort) {
        this.zeppelinRemoteSparkInterpreterPort = zeppelinRemoteSparkInterpreterPort;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     * 
     * @return The Apache Zeppelin port for the remote Apache Spark interpreter.
     */

    public Integer getZeppelinRemoteSparkInterpreterPort() {
        return this.zeppelinRemoteSparkInterpreterPort;
    }

    /**
     * <p>
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * </p>
     * 
     * @param zeppelinRemoteSparkInterpreterPort
     *        The Apache Zeppelin port for the remote Apache Spark interpreter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withZeppelinRemoteSparkInterpreterPort(Integer zeppelinRemoteSparkInterpreterPort) {
        setZeppelinRemoteSparkInterpreterPort(zeppelinRemoteSparkInterpreterPort);
        return this;
    }

    /**
     * <p>
     * The public IP address used by this <code>DevEndpoint</code>. The <code>PublicAddress</code> field is present only
     * when you create a non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * </p>
     * 
     * @param publicAddress
     *        The public IP address used by this <code>DevEndpoint</code>. The <code>PublicAddress</code> field is
     *        present only when you create a non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     */

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    /**
     * <p>
     * The public IP address used by this <code>DevEndpoint</code>. The <code>PublicAddress</code> field is present only
     * when you create a non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The public IP address used by this <code>DevEndpoint</code>. The <code>PublicAddress</code> field is
     *         present only when you create a non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     */

    public String getPublicAddress() {
        return this.publicAddress;
    }

    /**
     * <p>
     * The public IP address used by this <code>DevEndpoint</code>. The <code>PublicAddress</code> field is present only
     * when you create a non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * </p>
     * 
     * @param publicAddress
     *        The public IP address used by this <code>DevEndpoint</code>. The <code>PublicAddress</code> field is
     *        present only when you create a non-virtual private cloud (VPC) <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withPublicAddress(String publicAddress) {
        setPublicAddress(publicAddress);
        return this;
    }

    /**
     * <p>
     * The current status of this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param status
     *        The current status of this <code>DevEndpoint</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The current status of this <code>DevEndpoint</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param status
     *        The current status of this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard,
     *        G.1X, or G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     *        configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a
     *        64 GB disk.
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     * 
     * @return The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard,
     *         G.1X, or G.2X.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *         and 2 executors per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *         and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *         and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     *         configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a
     *         64 GB disk.
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard,
     *        G.1X, or G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     *        configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a
     *        64 GB disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public DevEndpoint withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X,
     * or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     * configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB
     * disk.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard,
     *        G.1X, or G.2X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Known issue: when a development endpoint is created with the <code>G.2X</code> <code>WorkerType</code>
     *        configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a
     *        64 GB disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public DevEndpoint withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @param glueVersion
     *        Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     *        indicates the version supported for running your ETL scripts on development endpoints. </p>
     *        <p>
     *        For more information about the available AWS Glue versions and corresponding Spark and Python versions,
     *        see <a href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer
     *        guide.
     *        </p>
     *        <p>
     *        Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     *        </p>
     *        <p>
     *        You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *        parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *        are provided, the version defaults to Python 2.
     */

    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @return Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python
     *         version indicates the version supported for running your ETL scripts on development endpoints. </p>
     *         <p>
     *         For more information about the available AWS Glue versions and corresponding Spark and Python versions,
     *         see <a href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer
     *         guide.
     *         </p>
     *         <p>
     *         Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     *         </p>
     *         <p>
     *         You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *         parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *         are provided, the version defaults to Python 2.
     */

    public String getGlueVersion() {
        return this.glueVersion;
    }

    /**
     * <p>
     * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     * indicates the version supported for running your ETL scripts on development endpoints.
     * </p>
     * <p>
     * For more information about the available AWS Glue versions and corresponding Spark and Python versions, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer guide.
     * </p>
     * <p>
     * Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     * </p>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @param glueVersion
     *        Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version
     *        indicates the version supported for running your ETL scripts on development endpoints. </p>
     *        <p>
     *        For more information about the available AWS Glue versions and corresponding Spark and Python versions,
     *        see <a href="https://docs.aws.amazon.com/glue/latest/dg/add-job.html">Glue version</a> in the developer
     *        guide.
     *        </p>
     *        <p>
     *        Development endpoints that are created without specifying a Glue version default to Glue 0.9.
     *        </p>
     *        <p>
     *        You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *        parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *        are provided, the version defaults to Python 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withGlueVersion(String glueVersion) {
        setGlueVersion(glueVersion);
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated to the development
     *        endpoint.</p>
     *        <p>
     *        The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @return The number of workers of a defined <code>workerType</code> that are allocated to the development
     *         endpoint.</p>
     *         <p>
     *         The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are allocated to the development endpoint.
     * </p>
     * <p>
     * The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>workerType</code> that are allocated to the development
     *        endpoint.</p>
     *        <p>
     *        The maximum number of workers you can define are 299 for <code>G.1X</code>, and 149 for <code>G.2X</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) allocated to this <code>DevEndpoint</code>.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The number of AWS Glue Data Processing Units (DPUs) allocated to this <code>DevEndpoint</code>.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) allocated to this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) allocated to this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     * 
     * @param availabilityZone
     *        The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     * 
     * @return The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * </p>
     * 
     * @param availabilityZone
     *        The AWS Availability Zone where this <code>DevEndpoint</code> is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC) used by this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C extensions, such
     * as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not currently supported.
     * </p>
     * </note>
     * 
     * @param extraPythonLibsS3Path
     *        The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     *        <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.</p> <note>
     *        <p>
     *        You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C
     *        extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not currently supported.
     *        </p>
     */

    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C extensions, such
     * as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not currently supported.
     * </p>
     * </note>
     * 
     * @return The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     *         <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.</p> <note>
     *         <p>
     *         You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C
     *         extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *         not currently supported.
     *         </p>
     */

    public String getExtraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path;
    }

    /**
     * <p>
     * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.
     * </p>
     * <note>
     * <p>
     * You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C extensions, such
     * as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not currently supported.
     * </p>
     * </note>
     * 
     * @param extraPythonLibsS3Path
     *        The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your
     *        <code>DevEndpoint</code>. Multiple values must be complete paths separated by a comma.</p> <note>
     *        <p>
     *        You can only use pure Python libraries with a <code>DevEndpoint</code>. Libraries that rely on C
     *        extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not currently supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        setExtraPythonLibsS3Path(extraPythonLibsS3Path);
        return this;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a <code>DevEndpoint</code>.
     * </p>
     * </note>
     * 
     * @param extraJarsS3Path
     *        The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     *        <code>DevEndpoint</code>.</p> <note>
     *        <p>
     *        You can only use pure Java/Scala libraries with a <code>DevEndpoint</code>.
     *        </p>
     */

    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a <code>DevEndpoint</code>.
     * </p>
     * </note>
     * 
     * @return The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     *         <code>DevEndpoint</code>.</p> <note>
     *         <p>
     *         You can only use pure Java/Scala libraries with a <code>DevEndpoint</code>.
     *         </p>
     */

    public String getExtraJarsS3Path() {
        return this.extraJarsS3Path;
    }

    /**
     * <p>
     * The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     * <code>DevEndpoint</code>.
     * </p>
     * <note>
     * <p>
     * You can only use pure Java/Scala libraries with a <code>DevEndpoint</code>.
     * </p>
     * </note>
     * 
     * @param extraJarsS3Path
     *        The path to one or more Java <code>.jar</code> files in an S3 bucket that should be loaded in your
     *        <code>DevEndpoint</code>.</p> <note>
     *        <p>
     *        You can only use pure Java/Scala libraries with a <code>DevEndpoint</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withExtraJarsS3Path(String extraJarsS3Path) {
        setExtraJarsS3Path(extraJarsS3Path);
        return this;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason for a current failure in this <code>DevEndpoint</code>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The reason for a current failure in this <code>DevEndpoint</code>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for a current failure in this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param failureReason
     *        The reason for a current failure in this <code>DevEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last update.
     */

    public void setLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     * 
     * @return The status of the last update.
     */

    public String getLastUpdateStatus() {
        return this.lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withLastUpdateStatus(String lastUpdateStatus) {
        setLastUpdateStatus(lastUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The point in time at which this DevEndpoint was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     * 
     * @return The point in time at which this DevEndpoint was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The point in time at which this DevEndpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The point in time at which this <code>DevEndpoint</code> was last modified.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was last modified.
     * </p>
     * 
     * @return The point in time at which this <code>DevEndpoint</code> was last modified.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The point in time at which this <code>DevEndpoint</code> was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The point in time at which this <code>DevEndpoint</code> was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided for
     * backward compatibility because the recommended attribute to use is public keys.
     * </p>
     * 
     * @param publicKey
     *        The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided
     *        for backward compatibility because the recommended attribute to use is public keys.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided for
     * backward compatibility because the recommended attribute to use is public keys.
     * </p>
     * 
     * @return The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided
     *         for backward compatibility because the recommended attribute to use is public keys.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided for
     * backward compatibility because the recommended attribute to use is public keys.
     * </p>
     * 
     * @param publicKey
     *        The public key to be used by this <code>DevEndpoint</code> for authentication. This attribute is provided
     *        for backward compatibility because the recommended attribute to use is public keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @return A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this
     *         attribute is preferred over a single public key because the public keys allow you to have a different
     *         private key per client.</p> <note>
     *         <p>
     *         If you previously created an endpoint with a public key, you must remove that key to be able to set a
     *         list of public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in
     *         the <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *         attribute.
     *         </p>
     */

    public java.util.List<String> getPublicKeys() {
        return publicKeys;
    }

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this attribute
     *        is preferred over a single public key because the public keys allow you to have a different private key
     *        per client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     */

    public void setPublicKeys(java.util.Collection<String> publicKeys) {
        if (publicKeys == null) {
            this.publicKeys = null;
            return;
        }

        this.publicKeys = new java.util.ArrayList<String>(publicKeys);
    }

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicKeys(java.util.Collection)} or {@link #withPublicKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this attribute
     *        is preferred over a single public key because the public keys allow you to have a different private key
     *        per client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withPublicKeys(String... publicKeys) {
        if (this.publicKeys == null) {
            setPublicKeys(new java.util.ArrayList<String>(publicKeys.length));
        }
        for (String ele : publicKeys) {
            this.publicKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this attribute is
     * preferred over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the <code>DevEndpoints</code> for authentication. Using this attribute
     *        is preferred over a single public key because the public keys allow you to have a different private key
     *        per client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys. Call the <code>UpdateDevEndpoint</code> API operation with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withPublicKeys(java.util.Collection<String> publicKeys) {
        setPublicKeys(publicKeys);
        return this;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>
     *        .
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @return The name of the <code>SecurityConfiguration</code> structure to be used with this
     *         <code>DevEndpoint</code>.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the <code>SecurityConfiguration</code> structure to be used with this <code>DevEndpoint</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @return A map of arguments used to configure the <code>DevEndpoint</code>.</p>
     *         <p>
     *         Valid arguments are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"--enable-glue-datacatalog": ""</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"GLUE_PYTHON_VERSION": "3"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"GLUE_PYTHON_VERSION": "2"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *         parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *         are provided, the version defaults to Python 2.
     */

    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @param arguments
     *        A map of arguments used to configure the <code>DevEndpoint</code>.</p>
     *        <p>
     *        Valid arguments are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"--enable-glue-datacatalog": ""</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"GLUE_PYTHON_VERSION": "3"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"GLUE_PYTHON_VERSION": "2"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *        parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *        are provided, the version defaults to Python 2.
     */

    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * A map of arguments used to configure the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     * parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments are
     * provided, the version defaults to Python 2.
     * </p>
     * 
     * @param arguments
     *        A map of arguments used to configure the <code>DevEndpoint</code>.</p>
     *        <p>
     *        Valid arguments are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"--enable-glue-datacatalog": ""</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"GLUE_PYTHON_VERSION": "3"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"GLUE_PYTHON_VERSION": "2"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify a version of Python support for development endpoints by using the <code>Arguments</code>
     *        parameter in the <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If no arguments
     *        are provided, the version defaults to Python 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    /**
     * Add a single Arguments entry
     *
     * @see DevEndpoint#withArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint clearArgumentsEntries() {
        this.arguments = null;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getYarnEndpointAddress() != null)
            sb.append("YarnEndpointAddress: ").append(getYarnEndpointAddress()).append(",");
        if (getPrivateAddress() != null)
            sb.append("PrivateAddress: ").append(getPrivateAddress()).append(",");
        if (getZeppelinRemoteSparkInterpreterPort() != null)
            sb.append("ZeppelinRemoteSparkInterpreterPort: ").append(getZeppelinRemoteSparkInterpreterPort()).append(",");
        if (getPublicAddress() != null)
            sb.append("PublicAddress: ").append(getPublicAddress()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: ").append(getGlueVersion()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: ").append(getExtraPythonLibsS3Path()).append(",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: ").append(getExtraJarsS3Path()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getLastUpdateStatus() != null)
            sb.append("LastUpdateStatus: ").append(getLastUpdateStatus()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getPublicKeys() != null)
            sb.append("PublicKeys: ").append(getPublicKeys()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getArguments() != null)
            sb.append("Arguments: ").append(getArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevEndpoint == false)
            return false;
        DevEndpoint other = (DevEndpoint) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getYarnEndpointAddress() == null ^ this.getYarnEndpointAddress() == null)
            return false;
        if (other.getYarnEndpointAddress() != null && other.getYarnEndpointAddress().equals(this.getYarnEndpointAddress()) == false)
            return false;
        if (other.getPrivateAddress() == null ^ this.getPrivateAddress() == null)
            return false;
        if (other.getPrivateAddress() != null && other.getPrivateAddress().equals(this.getPrivateAddress()) == false)
            return false;
        if (other.getZeppelinRemoteSparkInterpreterPort() == null ^ this.getZeppelinRemoteSparkInterpreterPort() == null)
            return false;
        if (other.getZeppelinRemoteSparkInterpreterPort() != null
                && other.getZeppelinRemoteSparkInterpreterPort().equals(this.getZeppelinRemoteSparkInterpreterPort()) == false)
            return false;
        if (other.getPublicAddress() == null ^ this.getPublicAddress() == null)
            return false;
        if (other.getPublicAddress() != null && other.getPublicAddress().equals(this.getPublicAddress()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getLastUpdateStatus() == null ^ this.getLastUpdateStatus() == null)
            return false;
        if (other.getLastUpdateStatus() != null && other.getLastUpdateStatus().equals(this.getLastUpdateStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getPublicKeys() == null ^ this.getPublicKeys() == null)
            return false;
        if (other.getPublicKeys() != null && other.getPublicKeys().equals(this.getPublicKeys()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null && other.getArguments().equals(this.getArguments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getYarnEndpointAddress() == null) ? 0 : getYarnEndpointAddress().hashCode());
        hashCode = prime * hashCode + ((getPrivateAddress() == null) ? 0 : getPrivateAddress().hashCode());
        hashCode = prime * hashCode + ((getZeppelinRemoteSparkInterpreterPort() == null) ? 0 : getZeppelinRemoteSparkInterpreterPort().hashCode());
        hashCode = prime * hashCode + ((getPublicAddress() == null) ? 0 : getPublicAddress().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateStatus() == null) ? 0 : getLastUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getPublicKeys() == null) ? 0 : getPublicKeys().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        return hashCode;
    }

    @Override
    public DevEndpoint clone() {
        try {
            return (DevEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DevEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
