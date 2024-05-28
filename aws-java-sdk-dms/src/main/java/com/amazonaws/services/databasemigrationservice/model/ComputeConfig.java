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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration parameters for provisioning an DMS Serverless replication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ComputeConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Availability Zone where the DMS Serverless replication using this configuration will run. The default value
     * is a random, system-chosen Availability Zone in the configuration's Amazon Web Services Region, for example,
     * <code>"us-west-2"</code>. You can't set this parameter if the <code>MultiAZ</code> parameter is set to
     * <code>true</code>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * A list of custom DNS name servers supported for the DMS Serverless replication to access your source or target
     * database. This list overrides the default name servers supported by the DMS Serverless replication. You can
     * specify a comma-separated list of internet addresses for up to four DNS name servers. For example:
     * <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * </p>
     */
    private String dnsNameServers;
    /**
     * <p>
     * An Key Management Service (KMS) key Amazon Resource Name (ARN) that is used to encrypt the data during DMS
     * Serverless replication.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key.
     * </p>
     * <p>
     * KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has
     * a different default encryption key for each Amazon Web Services Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies the maximum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication can be
     * provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values
     * includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you can specify for DMS
     * Serverless is 384. The <code>MaxCapacityUnits</code> parameter is the only DCU parameter you are required to
     * specify.
     * </p>
     */
    private Integer maxCapacityUnits;
    /**
     * <p>
     * Specifies the minimum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication can be
     * provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values
     * includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that you can specify for DMS
     * Serverless is 1. You don't have to specify a value for the <code>MinCapacityUnits</code> parameter. If you don't
     * set this value, DMS scans the current activity of available source tables to identify an optimum setting for this
     * parameter. If there is no current source activity or DMS can't otherwise identify a more appropriate value, it
     * sets this parameter to the minimum DCU value allowed, 1.
     * </p>
     */
    private Integer minCapacityUnits;
    /**
     * <p>
     * Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur for the DMS Serverless replication, in Universal
     * Coordinated Time (UTC). The format is <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time per Amazon Web Services Region.
     * This maintenance occurs on a random day of the week. Valid values for days of the week include <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thu</code>, <code>Fri</code>, <code>Sat</code>, and <code>Sun</code>.
     * </p>
     * <p>
     * Constraints include a minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies a subnet group identifier to associate with the DMS Serverless replication.
     * </p>
     */
    private String replicationSubnetGroupId;
    /**
     * <p>
     * Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The VPC
     * security group must work with the VPC containing the replication.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The Availability Zone where the DMS Serverless replication using this configuration will run. The default value
     * is a random, system-chosen Availability Zone in the configuration's Amazon Web Services Region, for example,
     * <code>"us-west-2"</code>. You can't set this parameter if the <code>MultiAZ</code> parameter is set to
     * <code>true</code>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the DMS Serverless replication using this configuration will run. The default
     *        value is a random, system-chosen Availability Zone in the configuration's Amazon Web Services Region, for
     *        example, <code>"us-west-2"</code>. You can't set this parameter if the <code>MultiAZ</code> parameter is
     *        set to <code>true</code>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the DMS Serverless replication using this configuration will run. The default value
     * is a random, system-chosen Availability Zone in the configuration's Amazon Web Services Region, for example,
     * <code>"us-west-2"</code>. You can't set this parameter if the <code>MultiAZ</code> parameter is set to
     * <code>true</code>.
     * </p>
     * 
     * @return The Availability Zone where the DMS Serverless replication using this configuration will run. The default
     *         value is a random, system-chosen Availability Zone in the configuration's Amazon Web Services Region, for
     *         example, <code>"us-west-2"</code>. You can't set this parameter if the <code>MultiAZ</code> parameter is
     *         set to <code>true</code>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the DMS Serverless replication using this configuration will run. The default value
     * is a random, system-chosen Availability Zone in the configuration's Amazon Web Services Region, for example,
     * <code>"us-west-2"</code>. You can't set this parameter if the <code>MultiAZ</code> parameter is set to
     * <code>true</code>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the DMS Serverless replication using this configuration will run. The default
     *        value is a random, system-chosen Availability Zone in the configuration's Amazon Web Services Region, for
     *        example, <code>"us-west-2"</code>. You can't set this parameter if the <code>MultiAZ</code> parameter is
     *        set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * A list of custom DNS name servers supported for the DMS Serverless replication to access your source or target
     * database. This list overrides the default name servers supported by the DMS Serverless replication. You can
     * specify a comma-separated list of internet addresses for up to four DNS name servers. For example:
     * <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * </p>
     * 
     * @param dnsNameServers
     *        A list of custom DNS name servers supported for the DMS Serverless replication to access your source or
     *        target database. This list overrides the default name servers supported by the DMS Serverless replication.
     *        You can specify a comma-separated list of internet addresses for up to four DNS name servers. For example:
     *        <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     */

    public void setDnsNameServers(String dnsNameServers) {
        this.dnsNameServers = dnsNameServers;
    }

    /**
     * <p>
     * A list of custom DNS name servers supported for the DMS Serverless replication to access your source or target
     * database. This list overrides the default name servers supported by the DMS Serverless replication. You can
     * specify a comma-separated list of internet addresses for up to four DNS name servers. For example:
     * <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * </p>
     * 
     * @return A list of custom DNS name servers supported for the DMS Serverless replication to access your source or
     *         target database. This list overrides the default name servers supported by the DMS Serverless
     *         replication. You can specify a comma-separated list of internet addresses for up to four DNS name
     *         servers. For example: <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     */

    public String getDnsNameServers() {
        return this.dnsNameServers;
    }

    /**
     * <p>
     * A list of custom DNS name servers supported for the DMS Serverless replication to access your source or target
     * database. This list overrides the default name servers supported by the DMS Serverless replication. You can
     * specify a comma-separated list of internet addresses for up to four DNS name servers. For example:
     * <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * </p>
     * 
     * @param dnsNameServers
     *        A list of custom DNS name servers supported for the DMS Serverless replication to access your source or
     *        target database. This list overrides the default name servers supported by the DMS Serverless replication.
     *        You can specify a comma-separated list of internet addresses for up to four DNS name servers. For example:
     *        <code>"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withDnsNameServers(String dnsNameServers) {
        setDnsNameServers(dnsNameServers);
        return this;
    }

    /**
     * <p>
     * An Key Management Service (KMS) key Amazon Resource Name (ARN) that is used to encrypt the data during DMS
     * Serverless replication.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key.
     * </p>
     * <p>
     * KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has
     * a different default encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @param kmsKeyId
     *        An Key Management Service (KMS) key Amazon Resource Name (ARN) that is used to encrypt the data during DMS
     *        Serverless replication.</p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption
     *        key.
     *        </p>
     *        <p>
     *        KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default encryption key for each Amazon Web Services Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An Key Management Service (KMS) key Amazon Resource Name (ARN) that is used to encrypt the data during DMS
     * Serverless replication.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key.
     * </p>
     * <p>
     * KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has
     * a different default encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @return An Key Management Service (KMS) key Amazon Resource Name (ARN) that is used to encrypt the data during
     *         DMS Serverless replication.</p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption
     *         key.
     *         </p>
     *         <p>
     *         KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services
     *         account has a different default encryption key for each Amazon Web Services Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * An Key Management Service (KMS) key Amazon Resource Name (ARN) that is used to encrypt the data during DMS
     * Serverless replication.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key.
     * </p>
     * <p>
     * KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has
     * a different default encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @param kmsKeyId
     *        An Key Management Service (KMS) key Amazon Resource Name (ARN) that is used to encrypt the data during DMS
     *        Serverless replication.</p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption
     *        key.
     *        </p>
     *        <p>
     *        KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default encryption key for each Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication can be
     * provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values
     * includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you can specify for DMS
     * Serverless is 384. The <code>MaxCapacityUnits</code> parameter is the only DCU parameter you are required to
     * specify.
     * </p>
     * 
     * @param maxCapacityUnits
     *        Specifies the maximum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication
     *        can be provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid
     *        DCU values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you can
     *        specify for DMS Serverless is 384. The <code>MaxCapacityUnits</code> parameter is the only DCU parameter
     *        you are required to specify.
     */

    public void setMaxCapacityUnits(Integer maxCapacityUnits) {
        this.maxCapacityUnits = maxCapacityUnits;
    }

    /**
     * <p>
     * Specifies the maximum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication can be
     * provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values
     * includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you can specify for DMS
     * Serverless is 384. The <code>MaxCapacityUnits</code> parameter is the only DCU parameter you are required to
     * specify.
     * </p>
     * 
     * @return Specifies the maximum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication
     *         can be provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of
     *         valid DCU values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you
     *         can specify for DMS Serverless is 384. The <code>MaxCapacityUnits</code> parameter is the only DCU
     *         parameter you are required to specify.
     */

    public Integer getMaxCapacityUnits() {
        return this.maxCapacityUnits;
    }

    /**
     * <p>
     * Specifies the maximum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication can be
     * provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values
     * includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you can specify for DMS
     * Serverless is 384. The <code>MaxCapacityUnits</code> parameter is the only DCU parameter you are required to
     * specify.
     * </p>
     * 
     * @param maxCapacityUnits
     *        Specifies the maximum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication
     *        can be provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid
     *        DCU values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you can
     *        specify for DMS Serverless is 384. The <code>MaxCapacityUnits</code> parameter is the only DCU parameter
     *        you are required to specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withMaxCapacityUnits(Integer maxCapacityUnits) {
        setMaxCapacityUnits(maxCapacityUnits);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication can be
     * provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values
     * includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that you can specify for DMS
     * Serverless is 1. You don't have to specify a value for the <code>MinCapacityUnits</code> parameter. If you don't
     * set this value, DMS scans the current activity of available source tables to identify an optimum setting for this
     * parameter. If there is no current source activity or DMS can't otherwise identify a more appropriate value, it
     * sets this parameter to the minimum DCU value allowed, 1.
     * </p>
     * 
     * @param minCapacityUnits
     *        Specifies the minimum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication
     *        can be provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid
     *        DCU values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that you can
     *        specify for DMS Serverless is 1. You don't have to specify a value for the <code>MinCapacityUnits</code>
     *        parameter. If you don't set this value, DMS scans the current activity of available source tables to
     *        identify an optimum setting for this parameter. If there is no current source activity or DMS can't
     *        otherwise identify a more appropriate value, it sets this parameter to the minimum DCU value allowed, 1.
     */

    public void setMinCapacityUnits(Integer minCapacityUnits) {
        this.minCapacityUnits = minCapacityUnits;
    }

    /**
     * <p>
     * Specifies the minimum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication can be
     * provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values
     * includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that you can specify for DMS
     * Serverless is 1. You don't have to specify a value for the <code>MinCapacityUnits</code> parameter. If you don't
     * set this value, DMS scans the current activity of available source tables to identify an optimum setting for this
     * parameter. If there is no current source activity or DMS can't otherwise identify a more appropriate value, it
     * sets this parameter to the minimum DCU value allowed, 1.
     * </p>
     * 
     * @return Specifies the minimum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication
     *         can be provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of
     *         valid DCU values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that
     *         you can specify for DMS Serverless is 1. You don't have to specify a value for the
     *         <code>MinCapacityUnits</code> parameter. If you don't set this value, DMS scans the current activity of
     *         available source tables to identify an optimum setting for this parameter. If there is no current source
     *         activity or DMS can't otherwise identify a more appropriate value, it sets this parameter to the minimum
     *         DCU value allowed, 1.
     */

    public Integer getMinCapacityUnits() {
        return this.minCapacityUnits;
    }

    /**
     * <p>
     * Specifies the minimum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication can be
     * provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values
     * includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that you can specify for DMS
     * Serverless is 1. You don't have to specify a value for the <code>MinCapacityUnits</code> parameter. If you don't
     * set this value, DMS scans the current activity of available source tables to identify an optimum setting for this
     * parameter. If there is no current source activity or DMS can't otherwise identify a more appropriate value, it
     * sets this parameter to the minimum DCU value allowed, 1.
     * </p>
     * 
     * @param minCapacityUnits
     *        Specifies the minimum value of the DMS capacity units (DCUs) for which a given DMS Serverless replication
     *        can be provisioned. A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid
     *        DCU values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that you can
     *        specify for DMS Serverless is 1. You don't have to specify a value for the <code>MinCapacityUnits</code>
     *        parameter. If you don't set this value, DMS scans the current activity of available source tables to
     *        identify an optimum setting for this parameter. If there is no current source activity or DMS can't
     *        otherwise identify a more appropriate value, it sets this parameter to the minimum DCU value allowed, 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withMinCapacityUnits(Integer minCapacityUnits) {
        setMinCapacityUnits(minCapacityUnits);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     *        <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     *         <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>
     *         .
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     *        <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies whether the DMS Serverless replication is a Multi-AZ deployment. You can't set the
     *         <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>
     *         .
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur for the DMS Serverless replication, in Universal
     * Coordinated Time (UTC). The format is <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time per Amazon Web Services Region.
     * This maintenance occurs on a random day of the week. Valid values for days of the week include <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thu</code>, <code>Fri</code>, <code>Sat</code>, and <code>Sun</code>.
     * </p>
     * <p>
     * Constraints include a minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur for the DMS Serverless replication, in
     *        Universal Coordinated Time (UTC). The format is <code>ddd:hh24:mi-ddd:hh24:mi</code>.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time per Amazon Web Services
     *        Region. This maintenance occurs on a random day of the week. Valid values for days of the week include
     *        <code>Mon</code>, <code>Tue</code>, <code>Wed</code>, <code>Thu</code>, <code>Fri</code>, <code>Sat</code>
     *        , and <code>Sun</code>.
     *        </p>
     *        <p>
     *        Constraints include a minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur for the DMS Serverless replication, in Universal
     * Coordinated Time (UTC). The format is <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time per Amazon Web Services Region.
     * This maintenance occurs on a random day of the week. Valid values for days of the week include <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thu</code>, <code>Fri</code>, <code>Sat</code>, and <code>Sun</code>.
     * </p>
     * <p>
     * Constraints include a minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur for the DMS Serverless replication, in
     *         Universal Coordinated Time (UTC). The format is <code>ddd:hh24:mi-ddd:hh24:mi</code>.</p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time per Amazon Web Services
     *         Region. This maintenance occurs on a random day of the week. Valid values for days of the week include
     *         <code>Mon</code>, <code>Tue</code>, <code>Wed</code>, <code>Thu</code>, <code>Fri</code>,
     *         <code>Sat</code>, and <code>Sun</code>.
     *         </p>
     *         <p>
     *         Constraints include a minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur for the DMS Serverless replication, in Universal
     * Coordinated Time (UTC). The format is <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time per Amazon Web Services Region.
     * This maintenance occurs on a random day of the week. Valid values for days of the week include <code>Mon</code>,
     * <code>Tue</code>, <code>Wed</code>, <code>Thu</code>, <code>Fri</code>, <code>Sat</code>, and <code>Sun</code>.
     * </p>
     * <p>
     * Constraints include a minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur for the DMS Serverless replication, in
     *        Universal Coordinated Time (UTC). The format is <code>ddd:hh24:mi-ddd:hh24:mi</code>.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time per Amazon Web Services
     *        Region. This maintenance occurs on a random day of the week. Valid values for days of the week include
     *        <code>Mon</code>, <code>Tue</code>, <code>Wed</code>, <code>Thu</code>, <code>Fri</code>, <code>Sat</code>
     *        , and <code>Sun</code>.
     *        </p>
     *        <p>
     *        Constraints include a minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies a subnet group identifier to associate with the DMS Serverless replication.
     * </p>
     * 
     * @param replicationSubnetGroupId
     *        Specifies a subnet group identifier to associate with the DMS Serverless replication.
     */

    public void setReplicationSubnetGroupId(String replicationSubnetGroupId) {
        this.replicationSubnetGroupId = replicationSubnetGroupId;
    }

    /**
     * <p>
     * Specifies a subnet group identifier to associate with the DMS Serverless replication.
     * </p>
     * 
     * @return Specifies a subnet group identifier to associate with the DMS Serverless replication.
     */

    public String getReplicationSubnetGroupId() {
        return this.replicationSubnetGroupId;
    }

    /**
     * <p>
     * Specifies a subnet group identifier to associate with the DMS Serverless replication.
     * </p>
     * 
     * @param replicationSubnetGroupId
     *        Specifies a subnet group identifier to associate with the DMS Serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withReplicationSubnetGroupId(String replicationSubnetGroupId) {
        setReplicationSubnetGroupId(replicationSubnetGroupId);
        return this;
    }

    /**
     * <p>
     * Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The VPC
     * security group must work with the VPC containing the replication.
     * </p>
     * 
     * @return Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The
     *         VPC security group must work with the VPC containing the replication.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The VPC
     * security group must work with the VPC containing the replication.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The
     *        VPC security group must work with the VPC containing the replication.
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
     * Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The VPC
     * security group must work with the VPC containing the replication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The
     *        VPC security group must work with the VPC containing the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The VPC
     * security group must work with the VPC containing the replication.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Specifies the virtual private cloud (VPC) security group to use with the DMS Serverless replication. The
     *        VPC security group must work with the VPC containing the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfig withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getDnsNameServers() != null)
            sb.append("DnsNameServers: ").append(getDnsNameServers()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getMaxCapacityUnits() != null)
            sb.append("MaxCapacityUnits: ").append(getMaxCapacityUnits()).append(",");
        if (getMinCapacityUnits() != null)
            sb.append("MinCapacityUnits: ").append(getMinCapacityUnits()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getReplicationSubnetGroupId() != null)
            sb.append("ReplicationSubnetGroupId: ").append(getReplicationSubnetGroupId()).append(",");
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

        if (obj instanceof ComputeConfig == false)
            return false;
        ComputeConfig other = (ComputeConfig) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDnsNameServers() == null ^ this.getDnsNameServers() == null)
            return false;
        if (other.getDnsNameServers() != null && other.getDnsNameServers().equals(this.getDnsNameServers()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getMaxCapacityUnits() == null ^ this.getMaxCapacityUnits() == null)
            return false;
        if (other.getMaxCapacityUnits() != null && other.getMaxCapacityUnits().equals(this.getMaxCapacityUnits()) == false)
            return false;
        if (other.getMinCapacityUnits() == null ^ this.getMinCapacityUnits() == null)
            return false;
        if (other.getMinCapacityUnits() != null && other.getMinCapacityUnits().equals(this.getMinCapacityUnits()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getReplicationSubnetGroupId() == null ^ this.getReplicationSubnetGroupId() == null)
            return false;
        if (other.getReplicationSubnetGroupId() != null && other.getReplicationSubnetGroupId().equals(this.getReplicationSubnetGroupId()) == false)
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

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDnsNameServers() == null) ? 0 : getDnsNameServers().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacityUnits() == null) ? 0 : getMaxCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getMinCapacityUnits() == null) ? 0 : getMinCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getReplicationSubnetGroupId() == null) ? 0 : getReplicationSubnetGroupId().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public ComputeConfig clone() {
        try {
            return (ComputeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ComputeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
