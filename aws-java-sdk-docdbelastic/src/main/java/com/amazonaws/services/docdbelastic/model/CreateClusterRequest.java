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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon DocumentDB elastic clusters administrator.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be from 1 to 63 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word.
     * </p>
     * </li>
     * </ul>
     */
    private String adminUserName;
    /**
     * <p>
     * The password for the Amazon DocumentDB elastic clusters administrator. The password can contain any printable
     * ASCII characters.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 8 to 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain a forward slash (/), double quote ("), or the "at" symbol (@).
     * </p>
     * </li>
     * </ul>
     */
    private String adminUserPassword;
    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The number of days for which automatic snapshots are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The client token for the elastic cluster.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the new elastic cluster. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Example</i>: <code>my-cluster</code>
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The KMS key identifier to use to encrypt the new elastic cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that KMS creates for
     * your account. Your account has a different default encryption key for each Amazon Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>backupRetentionPeriod</code>.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * <i>Constraints</i>: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16, 32,
     * 64.
     * </p>
     */
    private Integer shardCapacity;
    /**
     * <p>
     * The number of shards assigned to the elastic cluster. Maximum is 32.
     * </p>
     */
    private Integer shardCount;
    /**
     * <p>
     * The number of replica instances applying to all shards in the elastic cluster. A <code>shardInstanceCount</code>
     * value of 1 means there is one writer instance, and any additional instances are replicas that can be used for
     * reads and to improve availability.
     * </p>
     */
    private Integer shardInstanceCount;
    /**
     * <p>
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The tags to be assigned to the new elastic cluster.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The name of the Amazon DocumentDB elastic clusters administrator.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be from 1 to 63 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word.
     * </p>
     * </li>
     * </ul>
     * 
     * @param adminUserName
     *        The name of the Amazon DocumentDB elastic clusters administrator.</p>
     *        <p>
     *        <i>Constraints</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be from 1 to 63 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word.
     *        </p>
     *        </li>
     */

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    /**
     * <p>
     * The name of the Amazon DocumentDB elastic clusters administrator.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be from 1 to 63 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the Amazon DocumentDB elastic clusters administrator.</p>
     *         <p>
     *         <i>Constraints</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be from 1 to 63 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word.
     *         </p>
     *         </li>
     */

    public String getAdminUserName() {
        return this.adminUserName;
    }

    /**
     * <p>
     * The name of the Amazon DocumentDB elastic clusters administrator.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be from 1 to 63 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word.
     * </p>
     * </li>
     * </ul>
     * 
     * @param adminUserName
     *        The name of the Amazon DocumentDB elastic clusters administrator.</p>
     *        <p>
     *        <i>Constraints</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be from 1 to 63 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAdminUserName(String adminUserName) {
        setAdminUserName(adminUserName);
        return this;
    }

    /**
     * <p>
     * The password for the Amazon DocumentDB elastic clusters administrator. The password can contain any printable
     * ASCII characters.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 8 to 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain a forward slash (/), double quote ("), or the "at" symbol (@).
     * </p>
     * </li>
     * </ul>
     * 
     * @param adminUserPassword
     *        The password for the Amazon DocumentDB elastic clusters administrator. The password can contain any
     *        printable ASCII characters.</p>
     *        <p>
     *        <i>Constraints</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 8 to 100 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot contain a forward slash (/), double quote ("), or the "at" symbol (@).
     *        </p>
     *        </li>
     */

    public void setAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
    }

    /**
     * <p>
     * The password for the Amazon DocumentDB elastic clusters administrator. The password can contain any printable
     * ASCII characters.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 8 to 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain a forward slash (/), double quote ("), or the "at" symbol (@).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The password for the Amazon DocumentDB elastic clusters administrator. The password can contain any
     *         printable ASCII characters.</p>
     *         <p>
     *         <i>Constraints</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 8 to 100 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot contain a forward slash (/), double quote ("), or the "at" symbol (@).
     *         </p>
     *         </li>
     */

    public String getAdminUserPassword() {
        return this.adminUserPassword;
    }

    /**
     * <p>
     * The password for the Amazon DocumentDB elastic clusters administrator. The password can contain any printable
     * ASCII characters.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 8 to 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain a forward slash (/), double quote ("), or the "at" symbol (@).
     * </p>
     * </li>
     * </ul>
     * 
     * @param adminUserPassword
     *        The password for the Amazon DocumentDB elastic clusters administrator. The password can contain any
     *        printable ASCII characters.</p>
     *        <p>
     *        <i>Constraints</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 8 to 100 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot contain a forward slash (/), double quote ("), or the "at" symbol (@).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAdminUserPassword(String adminUserPassword) {
        setAdminUserPassword(adminUserPassword);
        return this;
    }

    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     * 
     * @param authType
     *        The authentication type used to determine where to fetch the password used for accessing the elastic
     *        cluster. Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * @see Auth
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     * 
     * @return The authentication type used to determine where to fetch the password used for accessing the elastic
     *         cluster. Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * @see Auth
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     * 
     * @param authType
     *        The authentication type used to determine where to fetch the password used for accessing the elastic
     *        cluster. Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Auth
     */

    public CreateClusterRequest withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     * 
     * @param authType
     *        The authentication type used to determine where to fetch the password used for accessing the elastic
     *        cluster. Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Auth
     */

    public CreateClusterRequest withAuthType(Auth authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The number of days for which automatic snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automatic snapshots are retained.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automatic snapshots are retained.
     * </p>
     * 
     * @return The number of days for which automatic snapshots are retained.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automatic snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automatic snapshots are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The client token for the elastic cluster.
     * </p>
     * 
     * @param clientToken
     *        The client token for the elastic cluster.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token for the elastic cluster.
     * </p>
     * 
     * @return The client token for the elastic cluster.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token for the elastic cluster.
     * </p>
     * 
     * @param clientToken
     *        The client token for the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the new elastic cluster. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Example</i>: <code>my-cluster</code>
     * </p>
     * 
     * @param clusterName
     *        The name of the new elastic cluster. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        <i>Constraints</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i>Example</i>: <code>my-cluster</code>
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the new elastic cluster. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Example</i>: <code>my-cluster</code>
     * </p>
     * 
     * @return The name of the new elastic cluster. This parameter is stored as a lowercase string.</p>
     *         <p>
     *         <i>Constraints</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <i>Example</i>: <code>my-cluster</code>
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the new elastic cluster. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <i>Constraints</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>Example</i>: <code>my-cluster</code>
     * </p>
     * 
     * @param clusterName
     *        The name of the new elastic cluster. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        <i>Constraints</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <i>Example</i>: <code>my-cluster</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the new elastic cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that KMS creates for
     * your account. Your account has a different default encryption key for each Amazon Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier to use to encrypt the new elastic cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *        instead of the ARN as the KMS encryption key.
     *        </p>
     *        <p>
     *        If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that KMS creates
     *        for your account. Your account has a different default encryption key for each Amazon Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the new elastic cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that KMS creates for
     * your account. Your account has a different default encryption key for each Amazon Region.
     * </p>
     * 
     * @return The KMS key identifier to use to encrypt the new elastic cluster.</p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating
     *         a cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *         instead of the ARN as the KMS encryption key.
     *         </p>
     *         <p>
     *         If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that KMS creates
     *         for your account. Your account has a different default encryption key for each Amazon Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the new elastic cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that KMS creates for
     * your account. Your account has a different default encryption key for each Amazon Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier to use to encrypt the new elastic cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *        instead of the ARN as the KMS encryption key.
     *        </p>
     *        <p>
     *        If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that KMS creates
     *        for your account. Your account has a different default encryption key for each Amazon Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>backupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>backupRetentionPeriod</code>.
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>backupRetentionPeriod</code>.
     * </p>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled, as
     *         determined by the <code>backupRetentionPeriod</code>.
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>backupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>backupRetentionPeriod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * <i>Constraints</i>: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week.
     *        </p>
     *        <p>
     *        <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        <i>Constraints</i>: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * <i>Constraints</i>: Minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *         Services Region, occurring on a random day of the week.
     *         </p>
     *         <p>
     *         <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         </p>
     *         <p>
     *         <i>Constraints</i>: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * <i>Constraints</i>: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week.
     *        </p>
     *        <p>
     *        <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        <i>Constraints</i>: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16, 32,
     * 64.
     * </p>
     * 
     * @param shardCapacity
     *        The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16,
     *        32, 64.
     */

    public void setShardCapacity(Integer shardCapacity) {
        this.shardCapacity = shardCapacity;
    }

    /**
     * <p>
     * The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16, 32,
     * 64.
     * </p>
     * 
     * @return The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8,
     *         16, 32, 64.
     */

    public Integer getShardCapacity() {
        return this.shardCapacity;
    }

    /**
     * <p>
     * The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16, 32,
     * 64.
     * </p>
     * 
     * @param shardCapacity
     *        The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16,
     *        32, 64.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withShardCapacity(Integer shardCapacity) {
        setShardCapacity(shardCapacity);
        return this;
    }

    /**
     * <p>
     * The number of shards assigned to the elastic cluster. Maximum is 32.
     * </p>
     * 
     * @param shardCount
     *        The number of shards assigned to the elastic cluster. Maximum is 32.
     */

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    /**
     * <p>
     * The number of shards assigned to the elastic cluster. Maximum is 32.
     * </p>
     * 
     * @return The number of shards assigned to the elastic cluster. Maximum is 32.
     */

    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * <p>
     * The number of shards assigned to the elastic cluster. Maximum is 32.
     * </p>
     * 
     * @param shardCount
     *        The number of shards assigned to the elastic cluster. Maximum is 32.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withShardCount(Integer shardCount) {
        setShardCount(shardCount);
        return this;
    }

    /**
     * <p>
     * The number of replica instances applying to all shards in the elastic cluster. A <code>shardInstanceCount</code>
     * value of 1 means there is one writer instance, and any additional instances are replicas that can be used for
     * reads and to improve availability.
     * </p>
     * 
     * @param shardInstanceCount
     *        The number of replica instances applying to all shards in the elastic cluster. A
     *        <code>shardInstanceCount</code> value of 1 means there is one writer instance, and any additional
     *        instances are replicas that can be used for reads and to improve availability.
     */

    public void setShardInstanceCount(Integer shardInstanceCount) {
        this.shardInstanceCount = shardInstanceCount;
    }

    /**
     * <p>
     * The number of replica instances applying to all shards in the elastic cluster. A <code>shardInstanceCount</code>
     * value of 1 means there is one writer instance, and any additional instances are replicas that can be used for
     * reads and to improve availability.
     * </p>
     * 
     * @return The number of replica instances applying to all shards in the elastic cluster. A
     *         <code>shardInstanceCount</code> value of 1 means there is one writer instance, and any additional
     *         instances are replicas that can be used for reads and to improve availability.
     */

    public Integer getShardInstanceCount() {
        return this.shardInstanceCount;
    }

    /**
     * <p>
     * The number of replica instances applying to all shards in the elastic cluster. A <code>shardInstanceCount</code>
     * value of 1 means there is one writer instance, and any additional instances are replicas that can be used for
     * reads and to improve availability.
     * </p>
     * 
     * @param shardInstanceCount
     *        The number of replica instances applying to all shards in the elastic cluster. A
     *        <code>shardInstanceCount</code> value of 1 means there is one writer instance, and any additional
     *        instances are replicas that can be used for reads and to improve availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withShardInstanceCount(Integer shardInstanceCount) {
        setShardInstanceCount(shardInstanceCount);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     * </p>
     * 
     * @return The Amazon EC2 subnet IDs for the new elastic cluster.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the new elastic cluster.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the new elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the new elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the new elastic cluster.
     * </p>
     * 
     * @return The tags to be assigned to the new elastic cluster.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the new elastic cluster.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the new elastic cluster.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be assigned to the new elastic cluster.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the new elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateClusterRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with the new elastic cluster.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the new elastic cluster.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the new elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the new elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
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
        if (getAdminUserName() != null)
            sb.append("AdminUserName: ").append(getAdminUserName()).append(",");
        if (getAdminUserPassword() != null)
            sb.append("AdminUserPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getShardCapacity() != null)
            sb.append("ShardCapacity: ").append(getShardCapacity()).append(",");
        if (getShardCount() != null)
            sb.append("ShardCount: ").append(getShardCount()).append(",");
        if (getShardInstanceCount() != null)
            sb.append("ShardInstanceCount: ").append(getShardInstanceCount()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
        if (other.getAdminUserName() == null ^ this.getAdminUserName() == null)
            return false;
        if (other.getAdminUserName() != null && other.getAdminUserName().equals(this.getAdminUserName()) == false)
            return false;
        if (other.getAdminUserPassword() == null ^ this.getAdminUserPassword() == null)
            return false;
        if (other.getAdminUserPassword() != null && other.getAdminUserPassword().equals(this.getAdminUserPassword()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getShardCapacity() == null ^ this.getShardCapacity() == null)
            return false;
        if (other.getShardCapacity() != null && other.getShardCapacity().equals(this.getShardCapacity()) == false)
            return false;
        if (other.getShardCount() == null ^ this.getShardCount() == null)
            return false;
        if (other.getShardCount() != null && other.getShardCount().equals(this.getShardCount()) == false)
            return false;
        if (other.getShardInstanceCount() == null ^ this.getShardInstanceCount() == null)
            return false;
        if (other.getShardInstanceCount() != null && other.getShardInstanceCount().equals(this.getShardInstanceCount()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminUserName() == null) ? 0 : getAdminUserName().hashCode());
        hashCode = prime * hashCode + ((getAdminUserPassword() == null) ? 0 : getAdminUserPassword().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getShardCapacity() == null) ? 0 : getShardCapacity().hashCode());
        hashCode = prime * hashCode + ((getShardCount() == null) ? 0 : getShardCount().hashCode());
        hashCode = prime * hashCode + ((getShardInstanceCount() == null) ? 0 : getShardInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}
