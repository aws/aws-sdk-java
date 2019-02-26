/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     * <code>false</code>. The default value is <code>true</code>.
     * </p>
     */
    private Boolean associatePublicIpAddress;
    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     */
    private Boolean disableAutomatedBackup;
    /**
     * <p>
     * The configuration management engine to use. Valid values include <code>Chef</code> and <code>Puppet</code>.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine model of the server. Valid values in this release include <code>Monolithic</code> for Puppet and
     * <code>Single</code> for Chef.
     * </p>
     */
    private String engineModel;
    /**
     * <p>
     * The major release version of the engine that you want to use. For a Chef server, the valid value for
     * EngineVersion is currently <code>12</code>. For a Puppet server, the valid value is <code>2017</code>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Optional engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a Chef createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required to
     * access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate GUI. The
     * password length is a minimum of eight characters, and a maximum of 32. The password can contain letters, numbers,
     * and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower case letter, one upper
     * case letter, one number, and one special character. When no CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated
     * and returned in the response.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a Puppet createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     * characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     * ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add PUPPET_R10K_PRIVATE_KEY to
     * specify an SSH URL and a PEM-encoded private SSH key.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<EngineAttribute> engineAttributes;
    /**
     * <p>
     * The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM deletes
     * the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * </p>
     */
    private Integer backupRetentionCount;
    /**
     * <p>
     * The name of the server. The server name must be unique within your AWS account, within each region. Server names
     * must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 40 characters.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically
     * creates the instance profile for you, if you are using API commands instead, run the service-role-creation.yaml
     * AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template
     * creates a CloudFormation stack that includes the instance profile you need.
     * </p>
     */
    private String instanceProfileArn;
    /**
     * <p>
     * The Amazon EC2 instance type to use. For example, <code>m4.large</code>. Recommended instance types include
     * <code>t2.medium</code> and greater, <code>m4.*</code>, or <code>c4.xlarge</code> and greater.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify this
     * parameter to connect to your instances by using SSH.
     * </p>
     */
    private String keyPair;
    /**
     * <p>
     * The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the instance.
     * Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified time is in
     * coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday, or Friday.
     * See <code>TimeWindowDefinition</code> for more information.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your server
     * if automated backups are enabled. Valid values must be specified in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HH:MM</code> for daily backups
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDD:HH:MM</code> for weekly backups
     * </p>
     * </li>
     * </ul>
     * <p>
     * The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.
     * </p>
     * <p>
     * <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports 22 and
     * 443, open to 0.0.0.0/0 (everyone).
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the AWS
     * OpsWorks management console typically creates the service role for you, if you are using the AWS CLI or API
     * commands, run the service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template
     * creates a CloudFormation stack that includes the service role and instance profile that you need.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by BackupId.
     * </p>
     */
    private String backupId;

    /**
     * <p>
     * Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     * <code>false</code>. The default value is <code>true</code>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     *        <code>false</code>. The default value is <code>true</code>.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     * <code>false</code>. The default value is <code>true</code>.
     * </p>
     * 
     * @return Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     *         <code>false</code>. The default value is <code>true</code>.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     * <code>false</code>. The default value is <code>true</code>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     *        <code>false</code>. The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     * <code>false</code>. The default value is <code>true</code>.
     * </p>
     * 
     * @return Associate a public IP address with a server that you are launching. Valid values are <code>true</code> or
     *         <code>false</code>. The default value is <code>true</code>.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     * 
     * @param disableAutomatedBackup
     *        Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default
     *        value is <code>true</code>.
     */

    public void setDisableAutomatedBackup(Boolean disableAutomatedBackup) {
        this.disableAutomatedBackup = disableAutomatedBackup;
    }

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     * 
     * @return Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The
     *         default value is <code>true</code>.
     */

    public Boolean getDisableAutomatedBackup() {
        return this.disableAutomatedBackup;
    }

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     * 
     * @param disableAutomatedBackup
     *        Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default
     *        value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withDisableAutomatedBackup(Boolean disableAutomatedBackup) {
        setDisableAutomatedBackup(disableAutomatedBackup);
        return this;
    }

    /**
     * <p>
     * Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The default value
     * is <code>true</code>.
     * </p>
     * 
     * @return Enable or disable scheduled backups. Valid values are <code>true</code> or <code>false</code>. The
     *         default value is <code>true</code>.
     */

    public Boolean isDisableAutomatedBackup() {
        return this.disableAutomatedBackup;
    }

    /**
     * <p>
     * The configuration management engine to use. Valid values include <code>Chef</code> and <code>Puppet</code>.
     * </p>
     * 
     * @param engine
     *        The configuration management engine to use. Valid values include <code>Chef</code> and <code>Puppet</code>
     *        .
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The configuration management engine to use. Valid values include <code>Chef</code> and <code>Puppet</code>.
     * </p>
     * 
     * @return The configuration management engine to use. Valid values include <code>Chef</code> and
     *         <code>Puppet</code>.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The configuration management engine to use. Valid values include <code>Chef</code> and <code>Puppet</code>.
     * </p>
     * 
     * @param engine
     *        The configuration management engine to use. Valid values include <code>Chef</code> and <code>Puppet</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine model of the server. Valid values in this release include <code>Monolithic</code> for Puppet and
     * <code>Single</code> for Chef.
     * </p>
     * 
     * @param engineModel
     *        The engine model of the server. Valid values in this release include <code>Monolithic</code> for Puppet
     *        and <code>Single</code> for Chef.
     */

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    /**
     * <p>
     * The engine model of the server. Valid values in this release include <code>Monolithic</code> for Puppet and
     * <code>Single</code> for Chef.
     * </p>
     * 
     * @return The engine model of the server. Valid values in this release include <code>Monolithic</code> for Puppet
     *         and <code>Single</code> for Chef.
     */

    public String getEngineModel() {
        return this.engineModel;
    }

    /**
     * <p>
     * The engine model of the server. Valid values in this release include <code>Monolithic</code> for Puppet and
     * <code>Single</code> for Chef.
     * </p>
     * 
     * @param engineModel
     *        The engine model of the server. Valid values in this release include <code>Monolithic</code> for Puppet
     *        and <code>Single</code> for Chef.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngineModel(String engineModel) {
        setEngineModel(engineModel);
        return this;
    }

    /**
     * <p>
     * The major release version of the engine that you want to use. For a Chef server, the valid value for
     * EngineVersion is currently <code>12</code>. For a Puppet server, the valid value is <code>2017</code>.
     * </p>
     * 
     * @param engineVersion
     *        The major release version of the engine that you want to use. For a Chef server, the valid value for
     *        EngineVersion is currently <code>12</code>. For a Puppet server, the valid value is <code>2017</code>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The major release version of the engine that you want to use. For a Chef server, the valid value for
     * EngineVersion is currently <code>12</code>. For a Puppet server, the valid value is <code>2017</code>.
     * </p>
     * 
     * @return The major release version of the engine that you want to use. For a Chef server, the valid value for
     *         EngineVersion is currently <code>12</code>. For a Puppet server, the valid value is <code>2017</code>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The major release version of the engine that you want to use. For a Chef server, the valid value for
     * EngineVersion is currently <code>12</code>. For a Puppet server, the valid value is <code>2017</code>.
     * </p>
     * 
     * @param engineVersion
     *        The major release version of the engine that you want to use. For a Chef server, the valid value for
     *        EngineVersion is currently <code>12</code>. For a Puppet server, the valid value is <code>2017</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Optional engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a Chef createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required to
     * access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate GUI. The
     * password length is a minimum of eight characters, and a maximum of 32. The password can contain letters, numbers,
     * and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower case letter, one upper
     * case letter, one number, and one special character. When no CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated
     * and returned in the response.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a Puppet createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     * characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     * ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add PUPPET_R10K_PRIVATE_KEY to
     * specify an SSH URL and a PEM-encoded private SSH key.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Optional engine attributes on a specified server. </p>
     *         <p class="title">
     *         <b>Attributes accepted in a Chef createServer request:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required
     *         to access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the
     *         response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate
     *         GUI. The password length is a minimum of eight characters, and a maximum of 32. The password can contain
     *         letters, numbers, and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower
     *         case letter, one upper case letter, one number, and one special character. When no
     *         CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated and returned in the response.
     *         </p>
     *         </li>
     *         </ul>
     *         <p class="title">
     *         <b>Attributes accepted in a Puppet createServer request:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     *         characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     *         ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add
     *         PUPPET_R10K_PRIVATE_KEY to specify an SSH URL and a PEM-encoded private SSH key.
     *         </p>
     *         </li>
     */

    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>
     * Optional engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a Chef createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required to
     * access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate GUI. The
     * password length is a minimum of eight characters, and a maximum of 32. The password can contain letters, numbers,
     * and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower case letter, one upper
     * case letter, one number, and one special character. When no CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated
     * and returned in the response.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a Puppet createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     * characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     * ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add PUPPET_R10K_PRIVATE_KEY to
     * specify an SSH URL and a PEM-encoded private SSH key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineAttributes
     *        Optional engine attributes on a specified server. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a Chef createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required
     *        to access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate
     *        GUI. The password length is a minimum of eight characters, and a maximum of 32. The password can contain
     *        letters, numbers, and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower
     *        case letter, one upper case letter, one number, and one special character. When no
     *        CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated and returned in the response.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attributes accepted in a Puppet createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     *        characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     *        ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add
     *        PUPPET_R10K_PRIVATE_KEY to specify an SSH URL and a PEM-encoded private SSH key.
     *        </p>
     *        </li>
     */

    public void setEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        if (engineAttributes == null) {
            this.engineAttributes = null;
            return;
        }

        this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes);
    }

    /**
     * <p>
     * Optional engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a Chef createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required to
     * access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate GUI. The
     * password length is a minimum of eight characters, and a maximum of 32. The password can contain letters, numbers,
     * and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower case letter, one upper
     * case letter, one number, and one special character. When no CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated
     * and returned in the response.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a Puppet createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     * characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     * ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add PUPPET_R10K_PRIVATE_KEY to
     * specify an SSH URL and a PEM-encoded private SSH key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngineAttributes(java.util.Collection)} or {@link #withEngineAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param engineAttributes
     *        Optional engine attributes on a specified server. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a Chef createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required
     *        to access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate
     *        GUI. The password length is a minimum of eight characters, and a maximum of 32. The password can contain
     *        letters, numbers, and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower
     *        case letter, one upper case letter, one number, and one special character. When no
     *        CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated and returned in the response.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attributes accepted in a Puppet createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     *        characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     *        ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add
     *        PUPPET_R10K_PRIVATE_KEY to specify an SSH URL and a PEM-encoded private SSH key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngineAttributes(EngineAttribute... engineAttributes) {
        if (this.engineAttributes == null) {
            setEngineAttributes(new java.util.ArrayList<EngineAttribute>(engineAttributes.length));
        }
        for (EngineAttribute ele : engineAttributes) {
            this.engineAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional engine attributes on a specified server.
     * </p>
     * <p class="title">
     * <b>Attributes accepted in a Chef createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required to
     * access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate GUI. The
     * password length is a minimum of eight characters, and a maximum of 32. The password can contain letters, numbers,
     * and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower case letter, one upper
     * case letter, one number, and one special character. When no CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated
     * and returned in the response.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attributes accepted in a Puppet createServer request:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     * characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     * ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add PUPPET_R10K_PRIVATE_KEY to
     * specify an SSH URL and a PEM-encoded private SSH key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineAttributes
     *        Optional engine attributes on a specified server. </p>
     *        <p class="title">
     *        <b>Attributes accepted in a Chef createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHEF_PIVOTAL_KEY</code>: A base64-encoded RSA public key. The corresponding private key is required
     *        to access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHEF_DELIVERY_ADMIN_PASSWORD</code>: The password for the administrative user in the Chef Automate
     *        GUI. The password length is a minimum of eight characters, and a maximum of 32. The password can contain
     *        letters, numbers, and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower
     *        case letter, one upper case letter, one number, and one special character. When no
     *        CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated and returned in the response.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attributes accepted in a Puppet createServer request:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PUPPET_ADMIN_PASSWORD</code>: To work with the Puppet Enterprise console, a password must use ASCII
     *        characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUPPET_R10K_REMOTE</code>: The r10k remote is the URL of your control repository (for example,
     *        ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUPPET_R10K_PRIVATE_KEY</code>: If you are using a private Git repository, add
     *        PUPPET_R10K_PRIVATE_KEY to specify an SSH URL and a PEM-encoded private SSH key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
        return this;
    }

    /**
     * <p>
     * The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM deletes
     * the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * </p>
     * 
     * @param backupRetentionCount
     *        The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM
     *        deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     */

    public void setBackupRetentionCount(Integer backupRetentionCount) {
        this.backupRetentionCount = backupRetentionCount;
    }

    /**
     * <p>
     * The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM deletes
     * the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * </p>
     * 
     * @return The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM
     *         deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     */

    public Integer getBackupRetentionCount() {
        return this.backupRetentionCount;
    }

    /**
     * <p>
     * The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM deletes
     * the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * </p>
     * 
     * @param backupRetentionCount
     *        The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM
     *        deletes the oldest backups if this number is exceeded. The default value is <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withBackupRetentionCount(Integer backupRetentionCount) {
        setBackupRetentionCount(backupRetentionCount);
        return this;
    }

    /**
     * <p>
     * The name of the server. The server name must be unique within your AWS account, within each region. Server names
     * must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 40 characters.
     * </p>
     * 
     * @param serverName
     *        The name of the server. The server name must be unique within your AWS account, within each region. Server
     *        names must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 40
     *        characters.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server. The server name must be unique within your AWS account, within each region. Server names
     * must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 40 characters.
     * </p>
     * 
     * @return The name of the server. The server name must be unique within your AWS account, within each region.
     *         Server names must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum
     *         of 40 characters.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server. The server name must be unique within your AWS account, within each region. Server names
     * must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 40 characters.
     * </p>
     * 
     * @param serverName
     *        The name of the server. The server name must be unique within your AWS account, within each region. Server
     *        names must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 40
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically
     * creates the instance profile for you, if you are using API commands instead, run the service-role-creation.yaml
     * AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template
     * creates a CloudFormation stack that includes the instance profile you need.
     * </p>
     * 
     * @param instanceProfileArn
     *        The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console
     *        typically creates the instance profile for you, if you are using API commands instead, run the
     *        service-role-creation.yaml AWS CloudFormation template, located at
     *        https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This
     *        template creates a CloudFormation stack that includes the instance profile you need.
     */

    public void setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
    }

    /**
     * <p>
     * The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically
     * creates the instance profile for you, if you are using API commands instead, run the service-role-creation.yaml
     * AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template
     * creates a CloudFormation stack that includes the instance profile you need.
     * </p>
     * 
     * @return The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console
     *         typically creates the instance profile for you, if you are using API commands instead, run the
     *         service-role-creation.yaml AWS CloudFormation template, located at
     *         https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This
     *         template creates a CloudFormation stack that includes the instance profile you need.
     */

    public String getInstanceProfileArn() {
        return this.instanceProfileArn;
    }

    /**
     * <p>
     * The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically
     * creates the instance profile for you, if you are using API commands instead, run the service-role-creation.yaml
     * AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template
     * creates a CloudFormation stack that includes the instance profile you need.
     * </p>
     * 
     * @param instanceProfileArn
     *        The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console
     *        typically creates the instance profile for you, if you are using API commands instead, run the
     *        service-role-creation.yaml AWS CloudFormation template, located at
     *        https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This
     *        template creates a CloudFormation stack that includes the instance profile you need.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withInstanceProfileArn(String instanceProfileArn) {
        setInstanceProfileArn(instanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type to use. For example, <code>m4.large</code>. Recommended instance types include
     * <code>t2.medium</code> and greater, <code>m4.*</code>, or <code>c4.xlarge</code> and greater.
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type to use. For example, <code>m4.large</code>. Recommended instance types
     *        include <code>t2.medium</code> and greater, <code>m4.*</code>, or <code>c4.xlarge</code> and greater.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type to use. For example, <code>m4.large</code>. Recommended instance types include
     * <code>t2.medium</code> and greater, <code>m4.*</code>, or <code>c4.xlarge</code> and greater.
     * </p>
     * 
     * @return The Amazon EC2 instance type to use. For example, <code>m4.large</code>. Recommended instance types
     *         include <code>t2.medium</code> and greater, <code>m4.*</code>, or <code>c4.xlarge</code> and greater.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type to use. For example, <code>m4.large</code>. Recommended instance types include
     * <code>t2.medium</code> and greater, <code>m4.*</code>, or <code>c4.xlarge</code> and greater.
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type to use. For example, <code>m4.large</code>. Recommended instance types
     *        include <code>t2.medium</code> and greater, <code>m4.*</code>, or <code>c4.xlarge</code> and greater.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify this
     * parameter to connect to your instances by using SSH.
     * </p>
     * 
     * @param keyPair
     *        The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify
     *        this parameter to connect to your instances by using SSH.
     */

    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify this
     * parameter to connect to your instances by using SSH.
     * </p>
     * 
     * @return The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify
     *         this parameter to connect to your instances by using SSH.
     */

    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify this
     * parameter to connect to your instances by using SSH.
     * </p>
     * 
     * @param keyPair
     *        The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify
     *        this parameter to connect to your instances by using SSH.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withKeyPair(String keyPair) {
        setKeyPair(keyPair);
        return this;
    }

    /**
     * <p>
     * The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the instance.
     * Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified time is in
     * coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday, or Friday.
     * See <code>TimeWindowDefinition</code> for more information.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the
     *        instance. Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified
     *        time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday,
     *        Wednesday, or Friday. See <code>TimeWindowDefinition</code> for more information. </p>
     *        <p>
     *        <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *        a.m.)
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the instance.
     * Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified time is in
     * coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday, or Friday.
     * See <code>TimeWindowDefinition</code> for more information.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @return The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the
     *         instance. Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified
     *         time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday,
     *         Wednesday, or Friday. See <code>TimeWindowDefinition</code> for more information. </p>
     *         <p>
     *         <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *         a.m.)
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the instance.
     * Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified time is in
     * coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday, or Friday.
     * See <code>TimeWindowDefinition</code> for more information.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the
     *        instance. Valid values must be specified in the following format: <code>DDD:HH:MM</code>. The specified
     *        time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday,
     *        Wednesday, or Friday. See <code>TimeWindowDefinition</code> for more information. </p>
     *        <p>
     *        <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *        a.m.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your server
     * if automated backups are enabled. Valid values must be specified in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HH:MM</code> for daily backups
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDD:HH:MM</code> for weekly backups
     * </p>
     * </li>
     * </ul>
     * <p>
     * The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.
     * </p>
     * <p>
     * <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @param preferredBackupWindow
     *        The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your
     *        server if automated backups are enabled. Valid values must be specified in one of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HH:MM</code> for daily backups
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDD:HH:MM</code> for weekly backups
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The specified time is in coordinated universal time (UTC). The default value is a random, daily start
     *        time.
     *        </p>
     *        <p>
     *        <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     *        </p>
     *        <p>
     *        <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *        a.m.)
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your server
     * if automated backups are enabled. Valid values must be specified in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HH:MM</code> for daily backups
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDD:HH:MM</code> for weekly backups
     * </p>
     * </li>
     * </ul>
     * <p>
     * The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.
     * </p>
     * <p>
     * <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @return The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your
     *         server if automated backups are enabled. Valid values must be specified in one of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HH:MM</code> for daily backups
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DDD:HH:MM</code> for weekly backups
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The specified time is in coordinated universal time (UTC). The default value is a random, daily start
     *         time.
     *         </p>
     *         <p>
     *         <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     *         </p>
     *         <p>
     *         <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *         a.m.)
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your server
     * if automated backups are enabled. Valid values must be specified in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HH:MM</code> for daily backups
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDD:HH:MM</code> for weekly backups
     * </p>
     * </li>
     * </ul>
     * <p>
     * The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.
     * </p>
     * <p>
     * <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     * </p>
     * <p>
     * <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
     * </p>
     * 
     * @param preferredBackupWindow
     *        The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your
     *        server if automated backups are enabled. Valid values must be specified in one of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HH:MM</code> for daily backups
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDD:HH:MM</code> for weekly backups
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The specified time is in coordinated universal time (UTC). The default value is a random, daily start
     *        time.
     *        </p>
     *        <p>
     *        <b>Example:</b> <code>08:00</code>, which represents a daily start time of 08:00 UTC.
     *        </p>
     *        <p>
     *        <b>Example:</b> <code>Mon:08:00</code>, which represents a start time of every Monday at 08:00 UTC. (8:00
     *        a.m.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports 22 and
     * 443, open to 0.0.0.0/0 (everyone).
     * </p>
     * 
     * @return A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the
     *         specified security groups must be within the VPC that is specified by <code>SubnetIds</code>. </p>
     *         <p>
     *         If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports
     *         22 and 443, open to 0.0.0.0/0 (everyone).
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports 22 and
     * 443, open to 0.0.0.0/0 (everyone).
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the
     *        specified security groups must be within the VPC that is specified by <code>SubnetIds</code>. </p>
     *        <p>
     *        If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports
     *        22 and 443, open to 0.0.0.0/0 (everyone).
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
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports 22 and
     * 443, open to 0.0.0.0/0 (everyone).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the
     *        specified security groups must be within the VPC that is specified by <code>SubnetIds</code>. </p>
     *        <p>
     *        If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports
     *        22 and 443, open to 0.0.0.0/0 (everyone).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified
     * security groups must be within the VPC that is specified by <code>SubnetIds</code>.
     * </p>
     * <p>
     * If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports 22 and
     * 443, open to 0.0.0.0/0 (everyone).
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the
     *        specified security groups must be within the VPC that is specified by <code>SubnetIds</code>. </p>
     *        <p>
     *        If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports
     *        22 and 443, open to 0.0.0.0/0 (everyone).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the AWS
     * OpsWorks management console typically creates the service role for you, if you are using the AWS CLI or API
     * commands, run the service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template
     * creates a CloudFormation stack that includes the service role and instance profile that you need.
     * </p>
     * 
     * @param serviceRoleArn
     *        The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the AWS
     *        OpsWorks management console typically creates the service role for you, if you are using the AWS CLI or
     *        API commands, run the service-role-creation.yaml AWS CloudFormation template, located at
     *        https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This
     *        template creates a CloudFormation stack that includes the service role and instance profile that you need.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the AWS
     * OpsWorks management console typically creates the service role for you, if you are using the AWS CLI or API
     * commands, run the service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template
     * creates a CloudFormation stack that includes the service role and instance profile that you need.
     * </p>
     * 
     * @return The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the
     *         AWS OpsWorks management console typically creates the service role for you, if you are using the AWS CLI
     *         or API commands, run the service-role-creation.yaml AWS CloudFormation template, located at
     *         https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This
     *         template creates a CloudFormation stack that includes the service role and instance profile that you
     *         need.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the AWS
     * OpsWorks management console typically creates the service role for you, if you are using the AWS CLI or API
     * commands, run the service-role-creation.yaml AWS CloudFormation template, located at
     * https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template
     * creates a CloudFormation stack that includes the service role and instance profile that you need.
     * </p>
     * 
     * @param serviceRoleArn
     *        The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the AWS
     *        OpsWorks management console typically creates the service role for you, if you are using the AWS CLI or
     *        API commands, run the service-role-creation.yaml AWS CloudFormation template, located at
     *        https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This
     *        template creates a CloudFormation stack that includes the service role and instance profile that you need.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     * 
     * @return The IDs of subnets in which to launch the server EC2 instance. </p>
     *         <p>
     *         Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must
     *         have "Auto Assign Public IP" enabled.
     *         </p>
     *         <p>
     *         EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are
     *         created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     *         "Auto Assign Public IP" enabled.
     *         </p>
     *         <p>
     *         For more information about supported Amazon EC2 platforms, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *         Platforms</a>.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of subnets in which to launch the server EC2 instance. </p>
     *        <p>
     *        Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are
     *        created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        For more information about supported Amazon EC2 platforms, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *        Platforms</a>.
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
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of subnets in which to launch the server EC2 instance. </p>
     *        <p>
     *        Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are
     *        created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        For more information about supported Amazon EC2 platforms, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *        Platforms</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSubnetIds(String... subnetIds) {
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
     * The IDs of subnets in which to launch the server EC2 instance.
     * </p>
     * <p>
     * Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a
     * default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     * "Auto Assign Public IP" enabled.
     * </p>
     * <p>
     * For more information about supported Amazon EC2 platforms, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of subnets in which to launch the server EC2 instance. </p>
     *        <p>
     *        Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are
     *        created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have
     *        "Auto Assign Public IP" enabled.
     *        </p>
     *        <p>
     *        For more information about supported Amazon EC2 platforms, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *        Platforms</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by BackupId.
     * </p>
     * 
     * @param backupId
     *        If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by BackupId.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by BackupId.
     * </p>
     * 
     * @return If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by
     *         BackupId.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by BackupId.
     * </p>
     * 
     * @param backupId
     *        If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by BackupId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerRequest withBackupId(String backupId) {
        setBackupId(backupId);
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
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: ").append(getAssociatePublicIpAddress()).append(",");
        if (getDisableAutomatedBackup() != null)
            sb.append("DisableAutomatedBackup: ").append(getDisableAutomatedBackup()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineModel() != null)
            sb.append("EngineModel: ").append(getEngineModel()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEngineAttributes() != null)
            sb.append("EngineAttributes: ").append(getEngineAttributes()).append(",");
        if (getBackupRetentionCount() != null)
            sb.append("BackupRetentionCount: ").append(getBackupRetentionCount()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getInstanceProfileArn() != null)
            sb.append("InstanceProfileArn: ").append(getInstanceProfileArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKeyPair() != null)
            sb.append("KeyPair: ").append(getKeyPair()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServerRequest == false)
            return false;
        CreateServerRequest other = (CreateServerRequest) obj;
        if (other.getAssociatePublicIpAddress() == null ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        if (other.getDisableAutomatedBackup() == null ^ this.getDisableAutomatedBackup() == null)
            return false;
        if (other.getDisableAutomatedBackup() != null && other.getDisableAutomatedBackup().equals(this.getDisableAutomatedBackup()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineModel() == null ^ this.getEngineModel() == null)
            return false;
        if (other.getEngineModel() != null && other.getEngineModel().equals(this.getEngineModel()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineAttributes() == null ^ this.getEngineAttributes() == null)
            return false;
        if (other.getEngineAttributes() != null && other.getEngineAttributes().equals(this.getEngineAttributes()) == false)
            return false;
        if (other.getBackupRetentionCount() == null ^ this.getBackupRetentionCount() == null)
            return false;
        if (other.getBackupRetentionCount() != null && other.getBackupRetentionCount().equals(this.getBackupRetentionCount()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getInstanceProfileArn() == null ^ this.getInstanceProfileArn() == null)
            return false;
        if (other.getInstanceProfileArn() != null && other.getInstanceProfileArn().equals(this.getInstanceProfileArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getDisableAutomatedBackup() == null) ? 0 : getDisableAutomatedBackup().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineModel() == null) ? 0 : getEngineModel().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineAttributes() == null) ? 0 : getEngineAttributes().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionCount() == null) ? 0 : getBackupRetentionCount().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileArn() == null) ? 0 : getInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        return hashCode;
    }

    @Override
    public CreateServerRequest clone() {
        return (CreateServerRequest) super.clone();
    }

}
