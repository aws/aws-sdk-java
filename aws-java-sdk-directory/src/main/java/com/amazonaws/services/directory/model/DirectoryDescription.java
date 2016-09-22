/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an AWS Directory Service directory.
 * </p>
 */
public class DirectoryDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The directory identifier.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The fully-qualified name of the directory.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The short name of the directory.
     * </p>
     */
    private String shortName;
    /**
     * <p>
     * The directory size.
     * </p>
     */
    private String size;
    /**
     * <p>
     * The alias for the directory. If no alias has been created for the directory, the alias is the directory
     * identifier, such as <code>d-XXXXXXXXXX</code>.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>. If no alias has been
     * created for the directory, <code>&lt;alias&gt;</code> is the directory identifier, such as
     * <code>d-XXXXXXXXXX</code>.
     * </p>
     */
    private String accessUrl;
    /**
     * <p>
     * The textual description for the directory.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the
     * IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP
     * addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is
     * connected.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsIpAddrs;
    /**
     * <p>
     * The current stage of the directory.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * Specifies when the directory was created.
     * </p>
     */
    private java.util.Date launchTime;
    /**
     * <p>
     * The date and time that the stage was last updated.
     * </p>
     */
    private java.util.Date stageLastUpdatedDateTime;
    /**
     * <p>
     * The directory size.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A <a>DirectoryVpcSettingsDescription</a> object that contains additional information about a directory. This
     * member is only present if the directory is a Simple AD or Managed AD directory.
     * </p>
     */
    private DirectoryVpcSettingsDescription vpcSettings;
    /**
     * <p>
     * A <a>DirectoryConnectSettingsDescription</a> object that contains additional information about an AD Connector
     * directory. This member is only present if the directory is an AD Connector directory.
     * </p>
     */
    private DirectoryConnectSettingsDescription connectSettings;
    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server configured for this directory.
     * </p>
     */
    private RadiusSettings radiusSettings;
    /**
     * <p>
     * The status of the RADIUS MFA server connection.
     * </p>
     */
    private String radiusStatus;
    /**
     * <p>
     * Additional information about the directory stage.
     * </p>
     */
    private String stageReason;
    /**
     * <p>
     * Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     * <a>DisableSso</a>.
     * </p>
     */
    private Boolean ssoEnabled;

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @param directoryId
     *        The directory identifier.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @return The directory identifier.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @param directoryId
     *        The directory identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The fully-qualified name of the directory.
     * </p>
     * 
     * @param name
     *        The fully-qualified name of the directory.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The fully-qualified name of the directory.
     * </p>
     * 
     * @return The fully-qualified name of the directory.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The fully-qualified name of the directory.
     * </p>
     * 
     * @param name
     *        The fully-qualified name of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The short name of the directory.
     * </p>
     * 
     * @param shortName
     *        The short name of the directory.
     */

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * <p>
     * The short name of the directory.
     * </p>
     * 
     * @return The short name of the directory.
     */

    public String getShortName() {
        return this.shortName;
    }

    /**
     * <p>
     * The short name of the directory.
     * </p>
     * 
     * @param shortName
     *        The short name of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withShortName(String shortName) {
        setShortName(shortName);
        return this;
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @param size
     *        The directory size.
     * @see DirectorySize
     */

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @return The directory size.
     * @see DirectorySize
     */

    public String getSize() {
        return this.size;
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @param size
     *        The directory size.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectorySize
     */

    public DirectoryDescription withSize(String size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @param size
     *        The directory size.
     * @see DirectorySize
     */

    public void setSize(DirectorySize size) {
        this.size = size.toString();
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @param size
     *        The directory size.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectorySize
     */

    public DirectoryDescription withSize(DirectorySize size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The alias for the directory. If no alias has been created for the directory, the alias is the directory
     * identifier, such as <code>d-XXXXXXXXXX</code>.
     * </p>
     * 
     * @param alias
     *        The alias for the directory. If no alias has been created for the directory, the alias is the directory
     *        identifier, such as <code>d-XXXXXXXXXX</code>.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias for the directory. If no alias has been created for the directory, the alias is the directory
     * identifier, such as <code>d-XXXXXXXXXX</code>.
     * </p>
     * 
     * @return The alias for the directory. If no alias has been created for the directory, the alias is the directory
     *         identifier, such as <code>d-XXXXXXXXXX</code>.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias for the directory. If no alias has been created for the directory, the alias is the directory
     * identifier, such as <code>d-XXXXXXXXXX</code>.
     * </p>
     * 
     * @param alias
     *        The alias for the directory. If no alias has been created for the directory, the alias is the directory
     *        identifier, such as <code>d-XXXXXXXXXX</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>. If no alias has been
     * created for the directory, <code>&lt;alias&gt;</code> is the directory identifier, such as
     * <code>d-XXXXXXXXXX</code>.
     * </p>
     * 
     * @param accessUrl
     *        The access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>. If no alias has
     *        been created for the directory, <code>&lt;alias&gt;</code> is the directory identifier, such as
     *        <code>d-XXXXXXXXXX</code>.
     */

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    /**
     * <p>
     * The access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>. If no alias has been
     * created for the directory, <code>&lt;alias&gt;</code> is the directory identifier, such as
     * <code>d-XXXXXXXXXX</code>.
     * </p>
     * 
     * @return The access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>. If no alias has
     *         been created for the directory, <code>&lt;alias&gt;</code> is the directory identifier, such as
     *         <code>d-XXXXXXXXXX</code>.
     */

    public String getAccessUrl() {
        return this.accessUrl;
    }

    /**
     * <p>
     * The access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>. If no alias has been
     * created for the directory, <code>&lt;alias&gt;</code> is the directory identifier, such as
     * <code>d-XXXXXXXXXX</code>.
     * </p>
     * 
     * @param accessUrl
     *        The access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>. If no alias has
     *        been created for the directory, <code>&lt;alias&gt;</code> is the directory identifier, such as
     *        <code>d-XXXXXXXXXX</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withAccessUrl(String accessUrl) {
        setAccessUrl(accessUrl);
        return this;
    }

    /**
     * <p>
     * The textual description for the directory.
     * </p>
     * 
     * @param description
     *        The textual description for the directory.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The textual description for the directory.
     * </p>
     * 
     * @return The textual description for the directory.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The textual description for the directory.
     * </p>
     * 
     * @param description
     *        The textual description for the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the
     * IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP
     * addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is
     * connected.
     * </p>
     * 
     * @return The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these
     *         are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory,
     *         these are the IP addresses of the DNS servers or domain controllers in the on-premises directory to which
     *         the AD Connector is connected.
     */

    public java.util.List<String> getDnsIpAddrs() {
        if (dnsIpAddrs == null) {
            dnsIpAddrs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsIpAddrs;
    }

    /**
     * <p>
     * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the
     * IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP
     * addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is
     * connected.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these
     *        are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory,
     *        these are the IP addresses of the DNS servers or domain controllers in the on-premises directory to which
     *        the AD Connector is connected.
     */

    public void setDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        if (dnsIpAddrs == null) {
            this.dnsIpAddrs = null;
            return;
        }

        this.dnsIpAddrs = new com.amazonaws.internal.SdkInternalList<String>(dnsIpAddrs);
    }

    /**
     * <p>
     * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the
     * IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP
     * addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is
     * connected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIpAddrs(java.util.Collection)} or {@link #withDnsIpAddrs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these
     *        are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory,
     *        these are the IP addresses of the DNS servers or domain controllers in the on-premises directory to which
     *        the AD Connector is connected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withDnsIpAddrs(String... dnsIpAddrs) {
        if (this.dnsIpAddrs == null) {
            setDnsIpAddrs(new com.amazonaws.internal.SdkInternalList<String>(dnsIpAddrs.length));
        }
        for (String ele : dnsIpAddrs) {
            this.dnsIpAddrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the
     * IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP
     * addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is
     * connected.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these
     *        are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory,
     *        these are the IP addresses of the DNS servers or domain controllers in the on-premises directory to which
     *        the AD Connector is connected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        setDnsIpAddrs(dnsIpAddrs);
        return this;
    }

    /**
     * <p>
     * The current stage of the directory.
     * </p>
     * 
     * @param stage
     *        The current stage of the directory.
     * @see DirectoryStage
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The current stage of the directory.
     * </p>
     * 
     * @return The current stage of the directory.
     * @see DirectoryStage
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The current stage of the directory.
     * </p>
     * 
     * @param stage
     *        The current stage of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryStage
     */

    public DirectoryDescription withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * The current stage of the directory.
     * </p>
     * 
     * @param stage
     *        The current stage of the directory.
     * @see DirectoryStage
     */

    public void setStage(DirectoryStage stage) {
        this.stage = stage.toString();
    }

    /**
     * <p>
     * The current stage of the directory.
     * </p>
     * 
     * @param stage
     *        The current stage of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryStage
     */

    public DirectoryDescription withStage(DirectoryStage stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * Specifies when the directory was created.
     * </p>
     * 
     * @param launchTime
     *        Specifies when the directory was created.
     */

    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * Specifies when the directory was created.
     * </p>
     * 
     * @return Specifies when the directory was created.
     */

    public java.util.Date getLaunchTime() {
        return this.launchTime;
    }

    /**
     * <p>
     * Specifies when the directory was created.
     * </p>
     * 
     * @param launchTime
     *        Specifies when the directory was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withLaunchTime(java.util.Date launchTime) {
        setLaunchTime(launchTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the stage was last updated.
     * </p>
     * 
     * @param stageLastUpdatedDateTime
     *        The date and time that the stage was last updated.
     */

    public void setStageLastUpdatedDateTime(java.util.Date stageLastUpdatedDateTime) {
        this.stageLastUpdatedDateTime = stageLastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the stage was last updated.
     * </p>
     * 
     * @return The date and time that the stage was last updated.
     */

    public java.util.Date getStageLastUpdatedDateTime() {
        return this.stageLastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the stage was last updated.
     * </p>
     * 
     * @param stageLastUpdatedDateTime
     *        The date and time that the stage was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withStageLastUpdatedDateTime(java.util.Date stageLastUpdatedDateTime) {
        setStageLastUpdatedDateTime(stageLastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @param type
     *        The directory size.
     * @see DirectoryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @return The directory size.
     * @see DirectoryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @param type
     *        The directory size.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryType
     */

    public DirectoryDescription withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @param type
     *        The directory size.
     * @see DirectoryType
     */

    public void setType(DirectoryType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The directory size.
     * </p>
     * 
     * @param type
     *        The directory size.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryType
     */

    public DirectoryDescription withType(DirectoryType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A <a>DirectoryVpcSettingsDescription</a> object that contains additional information about a directory. This
     * member is only present if the directory is a Simple AD or Managed AD directory.
     * </p>
     * 
     * @param vpcSettings
     *        A <a>DirectoryVpcSettingsDescription</a> object that contains additional information about a directory.
     *        This member is only present if the directory is a Simple AD or Managed AD directory.
     */

    public void setVpcSettings(DirectoryVpcSettingsDescription vpcSettings) {
        this.vpcSettings = vpcSettings;
    }

    /**
     * <p>
     * A <a>DirectoryVpcSettingsDescription</a> object that contains additional information about a directory. This
     * member is only present if the directory is a Simple AD or Managed AD directory.
     * </p>
     * 
     * @return A <a>DirectoryVpcSettingsDescription</a> object that contains additional information about a directory.
     *         This member is only present if the directory is a Simple AD or Managed AD directory.
     */

    public DirectoryVpcSettingsDescription getVpcSettings() {
        return this.vpcSettings;
    }

    /**
     * <p>
     * A <a>DirectoryVpcSettingsDescription</a> object that contains additional information about a directory. This
     * member is only present if the directory is a Simple AD or Managed AD directory.
     * </p>
     * 
     * @param vpcSettings
     *        A <a>DirectoryVpcSettingsDescription</a> object that contains additional information about a directory.
     *        This member is only present if the directory is a Simple AD or Managed AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withVpcSettings(DirectoryVpcSettingsDescription vpcSettings) {
        setVpcSettings(vpcSettings);
        return this;
    }

    /**
     * <p>
     * A <a>DirectoryConnectSettingsDescription</a> object that contains additional information about an AD Connector
     * directory. This member is only present if the directory is an AD Connector directory.
     * </p>
     * 
     * @param connectSettings
     *        A <a>DirectoryConnectSettingsDescription</a> object that contains additional information about an AD
     *        Connector directory. This member is only present if the directory is an AD Connector directory.
     */

    public void setConnectSettings(DirectoryConnectSettingsDescription connectSettings) {
        this.connectSettings = connectSettings;
    }

    /**
     * <p>
     * A <a>DirectoryConnectSettingsDescription</a> object that contains additional information about an AD Connector
     * directory. This member is only present if the directory is an AD Connector directory.
     * </p>
     * 
     * @return A <a>DirectoryConnectSettingsDescription</a> object that contains additional information about an AD
     *         Connector directory. This member is only present if the directory is an AD Connector directory.
     */

    public DirectoryConnectSettingsDescription getConnectSettings() {
        return this.connectSettings;
    }

    /**
     * <p>
     * A <a>DirectoryConnectSettingsDescription</a> object that contains additional information about an AD Connector
     * directory. This member is only present if the directory is an AD Connector directory.
     * </p>
     * 
     * @param connectSettings
     *        A <a>DirectoryConnectSettingsDescription</a> object that contains additional information about an AD
     *        Connector directory. This member is only present if the directory is an AD Connector directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withConnectSettings(DirectoryConnectSettingsDescription connectSettings) {
        setConnectSettings(connectSettings);
        return this;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server configured for this directory.
     * </p>
     * 
     * @param radiusSettings
     *        A <a>RadiusSettings</a> object that contains information about the RADIUS server configured for this
     *        directory.
     */

    public void setRadiusSettings(RadiusSettings radiusSettings) {
        this.radiusSettings = radiusSettings;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server configured for this directory.
     * </p>
     * 
     * @return A <a>RadiusSettings</a> object that contains information about the RADIUS server configured for this
     *         directory.
     */

    public RadiusSettings getRadiusSettings() {
        return this.radiusSettings;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server configured for this directory.
     * </p>
     * 
     * @param radiusSettings
     *        A <a>RadiusSettings</a> object that contains information about the RADIUS server configured for this
     *        directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withRadiusSettings(RadiusSettings radiusSettings) {
        setRadiusSettings(radiusSettings);
        return this;
    }

    /**
     * <p>
     * The status of the RADIUS MFA server connection.
     * </p>
     * 
     * @param radiusStatus
     *        The status of the RADIUS MFA server connection.
     * @see RadiusStatus
     */

    public void setRadiusStatus(String radiusStatus) {
        this.radiusStatus = radiusStatus;
    }

    /**
     * <p>
     * The status of the RADIUS MFA server connection.
     * </p>
     * 
     * @return The status of the RADIUS MFA server connection.
     * @see RadiusStatus
     */

    public String getRadiusStatus() {
        return this.radiusStatus;
    }

    /**
     * <p>
     * The status of the RADIUS MFA server connection.
     * </p>
     * 
     * @param radiusStatus
     *        The status of the RADIUS MFA server connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadiusStatus
     */

    public DirectoryDescription withRadiusStatus(String radiusStatus) {
        setRadiusStatus(radiusStatus);
        return this;
    }

    /**
     * <p>
     * The status of the RADIUS MFA server connection.
     * </p>
     * 
     * @param radiusStatus
     *        The status of the RADIUS MFA server connection.
     * @see RadiusStatus
     */

    public void setRadiusStatus(RadiusStatus radiusStatus) {
        this.radiusStatus = radiusStatus.toString();
    }

    /**
     * <p>
     * The status of the RADIUS MFA server connection.
     * </p>
     * 
     * @param radiusStatus
     *        The status of the RADIUS MFA server connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadiusStatus
     */

    public DirectoryDescription withRadiusStatus(RadiusStatus radiusStatus) {
        setRadiusStatus(radiusStatus);
        return this;
    }

    /**
     * <p>
     * Additional information about the directory stage.
     * </p>
     * 
     * @param stageReason
     *        Additional information about the directory stage.
     */

    public void setStageReason(String stageReason) {
        this.stageReason = stageReason;
    }

    /**
     * <p>
     * Additional information about the directory stage.
     * </p>
     * 
     * @return Additional information about the directory stage.
     */

    public String getStageReason() {
        return this.stageReason;
    }

    /**
     * <p>
     * Additional information about the directory stage.
     * </p>
     * 
     * @param stageReason
     *        Additional information about the directory stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withStageReason(String stageReason) {
        setStageReason(stageReason);
        return this;
    }

    /**
     * <p>
     * Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     * <a>DisableSso</a>.
     * </p>
     * 
     * @param ssoEnabled
     *        Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     *        <a>DisableSso</a>.
     */

    public void setSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
    }

    /**
     * <p>
     * Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     * <a>DisableSso</a>.
     * </p>
     * 
     * @return Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     *         <a>DisableSso</a>.
     */

    public Boolean getSsoEnabled() {
        return this.ssoEnabled;
    }

    /**
     * <p>
     * Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     * <a>DisableSso</a>.
     * </p>
     * 
     * @param ssoEnabled
     *        Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     *        <a>DisableSso</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryDescription withSsoEnabled(Boolean ssoEnabled) {
        setSsoEnabled(ssoEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     * <a>DisableSso</a>.
     * </p>
     * 
     * @return Indicates if single-sign on is enabled for the directory. For more information, see <a>EnableSso</a> and
     *         <a>DisableSso</a>.
     */

    public Boolean isSsoEnabled() {
        return this.ssoEnabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getShortName() != null)
            sb.append("ShortName: " + getShortName() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getAlias() != null)
            sb.append("Alias: " + getAlias() + ",");
        if (getAccessUrl() != null)
            sb.append("AccessUrl: " + getAccessUrl() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDnsIpAddrs() != null)
            sb.append("DnsIpAddrs: " + getDnsIpAddrs() + ",");
        if (getStage() != null)
            sb.append("Stage: " + getStage() + ",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: " + getLaunchTime() + ",");
        if (getStageLastUpdatedDateTime() != null)
            sb.append("StageLastUpdatedDateTime: " + getStageLastUpdatedDateTime() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getVpcSettings() != null)
            sb.append("VpcSettings: " + getVpcSettings() + ",");
        if (getConnectSettings() != null)
            sb.append("ConnectSettings: " + getConnectSettings() + ",");
        if (getRadiusSettings() != null)
            sb.append("RadiusSettings: " + getRadiusSettings() + ",");
        if (getRadiusStatus() != null)
            sb.append("RadiusStatus: " + getRadiusStatus() + ",");
        if (getStageReason() != null)
            sb.append("StageReason: " + getStageReason() + ",");
        if (getSsoEnabled() != null)
            sb.append("SsoEnabled: " + getSsoEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryDescription == false)
            return false;
        DirectoryDescription other = (DirectoryDescription) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getShortName() == null ^ this.getShortName() == null)
            return false;
        if (other.getShortName() != null && other.getShortName().equals(this.getShortName()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getAccessUrl() == null ^ this.getAccessUrl() == null)
            return false;
        if (other.getAccessUrl() != null && other.getAccessUrl().equals(this.getAccessUrl()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDnsIpAddrs() == null ^ this.getDnsIpAddrs() == null)
            return false;
        if (other.getDnsIpAddrs() != null && other.getDnsIpAddrs().equals(this.getDnsIpAddrs()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false)
            return false;
        if (other.getStageLastUpdatedDateTime() == null ^ this.getStageLastUpdatedDateTime() == null)
            return false;
        if (other.getStageLastUpdatedDateTime() != null && other.getStageLastUpdatedDateTime().equals(this.getStageLastUpdatedDateTime()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpcSettings() == null ^ this.getVpcSettings() == null)
            return false;
        if (other.getVpcSettings() != null && other.getVpcSettings().equals(this.getVpcSettings()) == false)
            return false;
        if (other.getConnectSettings() == null ^ this.getConnectSettings() == null)
            return false;
        if (other.getConnectSettings() != null && other.getConnectSettings().equals(this.getConnectSettings()) == false)
            return false;
        if (other.getRadiusSettings() == null ^ this.getRadiusSettings() == null)
            return false;
        if (other.getRadiusSettings() != null && other.getRadiusSettings().equals(this.getRadiusSettings()) == false)
            return false;
        if (other.getRadiusStatus() == null ^ this.getRadiusStatus() == null)
            return false;
        if (other.getRadiusStatus() != null && other.getRadiusStatus().equals(this.getRadiusStatus()) == false)
            return false;
        if (other.getStageReason() == null ^ this.getStageReason() == null)
            return false;
        if (other.getStageReason() != null && other.getStageReason().equals(this.getStageReason()) == false)
            return false;
        if (other.getSsoEnabled() == null ^ this.getSsoEnabled() == null)
            return false;
        if (other.getSsoEnabled() != null && other.getSsoEnabled().equals(this.getSsoEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getShortName() == null) ? 0 : getShortName().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getAccessUrl() == null) ? 0 : getAccessUrl().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDnsIpAddrs() == null) ? 0 : getDnsIpAddrs().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getStageLastUpdatedDateTime() == null) ? 0 : getStageLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpcSettings() == null) ? 0 : getVpcSettings().hashCode());
        hashCode = prime * hashCode + ((getConnectSettings() == null) ? 0 : getConnectSettings().hashCode());
        hashCode = prime * hashCode + ((getRadiusSettings() == null) ? 0 : getRadiusSettings().hashCode());
        hashCode = prime * hashCode + ((getRadiusStatus() == null) ? 0 : getRadiusStatus().hashCode());
        hashCode = prime * hashCode + ((getStageReason() == null) ? 0 : getStageReason().hashCode());
        hashCode = prime * hashCode + ((getSsoEnabled() == null) ? 0 : getSsoEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DirectoryDescription clone() {
        try {
            return (DirectoryDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
