/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * The fully-qualified name of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$<br/>
     */
    private String name;

    /**
     * The short name of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$<br/>
     */
    private String shortName;

    /**
     * The directory size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     */
    private String size;

    /**
     * The alias for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     */
    private String alias;

    /**
     * The access URL for the directory, such as
     * <code>http://<alias>.awsapps.com</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String accessUrl;

    /**
     * The textual description for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     */
    private String description;

    /**
     * The IP addresses of the DNS servers for the directory. For a Simple AD
     * directory, these are the IP addresses of the Simple AD directory
     * servers. For an AD Connector directory, these are the IP addresses of
     * the DNS servers or domain controllers in the on-premises directory
     * that the AD Connector is connected to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsIpAddrs;

    /**
     * The current stage of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed
     */
    private String stage;

    /**
     * Specifies when the directory was created.
     */
    private java.util.Date launchTime;

    /**
     * The date and time that the stage was last updated.
     */
    private java.util.Date stageLastUpdatedDateTime;

    /**
     * The directory size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SimpleAD, ADConnector
     */
    private String type;

    /**
     * A <a>DirectoryVpcSettingsDescription</a> object that contains
     * additional information about a Simple AD directory. This member is
     * only present if the directory is a Simple AD directory.
     */
    private DirectoryVpcSettingsDescription vpcSettings;

    /**
     * A <a>DirectoryConnectSettingsDescription</a> object that contains
     * additional information about an AD Connector directory. This member is
     * only present if the directory is an AD Connector directory.
     */
    private DirectoryConnectSettingsDescription connectSettings;

    /**
     * A <a>RadiusSettings</a> object that contains information about the
     * RADIUS server configured for this directory.
     */
    private RadiusSettings radiusSettings;

    /**
     * The status of the RADIUS MFA server connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     */
    private String radiusStatus;

    /**
     * Additional information about the directory stage.
     */
    private String stageReason;

    /**
     * Indicates if single-sign on is enabled for the directory. For more
     * information, see <a>EnableSso</a> and <a>DisableSso</a>.
     */
    private Boolean ssoEnabled;

    /**
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The directory identifier.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The directory identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The directory identifier.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The directory identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The directory identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * The fully-qualified name of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$<br/>
     *
     * @return The fully-qualified name of the directory.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The fully-qualified name of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$<br/>
     *
     * @param name The fully-qualified name of the directory.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The fully-qualified name of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$<br/>
     *
     * @param name The fully-qualified name of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The short name of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$<br/>
     *
     * @return The short name of the directory.
     */
    public String getShortName() {
        return shortName;
    }
    
    /**
     * The short name of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$<br/>
     *
     * @param shortName The short name of the directory.
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    
    /**
     * The short name of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$<br/>
     *
     * @param shortName The short name of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * The directory size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @return The directory size.
     *
     * @see DirectorySize
     */
    public String getSize() {
        return size;
    }
    
    /**
     * The directory size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @param size The directory size.
     *
     * @see DirectorySize
     */
    public void setSize(String size) {
        this.size = size;
    }
    
    /**
     * The directory size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @param size The directory size.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DirectorySize
     */
    public DirectoryDescription withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * The directory size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @param size The directory size.
     *
     * @see DirectorySize
     */
    public void setSize(DirectorySize size) {
        this.size = size.toString();
    }
    
    /**
     * The directory size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Small, Large
     *
     * @param size The directory size.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DirectorySize
     */
    public DirectoryDescription withSize(DirectorySize size) {
        this.size = size.toString();
        return this;
    }

    /**
     * The alias for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @return The alias for the directory.
     */
    public String getAlias() {
        return alias;
    }
    
    /**
     * The alias for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias The alias for the directory.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    /**
     * The alias for the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias The alias for the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * The access URL for the directory, such as
     * <code>http://<alias>.awsapps.com</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The access URL for the directory, such as
     *         <code>http://<alias>.awsapps.com</code>.
     */
    public String getAccessUrl() {
        return accessUrl;
    }
    
    /**
     * The access URL for the directory, such as
     * <code>http://<alias>.awsapps.com</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param accessUrl The access URL for the directory, such as
     *         <code>http://<alias>.awsapps.com</code>.
     */
    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }
    
    /**
     * The access URL for the directory, such as
     * <code>http://<alias>.awsapps.com</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param accessUrl The access URL for the directory, such as
     *         <code>http://<alias>.awsapps.com</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
        return this;
    }

    /**
     * The textual description for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @return The textual description for the directory.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The textual description for the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param description The textual description for the directory.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The textual description for the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param description The textual description for the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The IP addresses of the DNS servers for the directory. For a Simple AD
     * directory, these are the IP addresses of the Simple AD directory
     * servers. For an AD Connector directory, these are the IP addresses of
     * the DNS servers or domain controllers in the on-premises directory
     * that the AD Connector is connected to.
     *
     * @return The IP addresses of the DNS servers for the directory. For a Simple AD
     *         directory, these are the IP addresses of the Simple AD directory
     *         servers. For an AD Connector directory, these are the IP addresses of
     *         the DNS servers or domain controllers in the on-premises directory
     *         that the AD Connector is connected to.
     */
    public java.util.List<String> getDnsIpAddrs() {
        if (dnsIpAddrs == null) {
              dnsIpAddrs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dnsIpAddrs.setAutoConstruct(true);
        }
        return dnsIpAddrs;
    }
    
    /**
     * The IP addresses of the DNS servers for the directory. For a Simple AD
     * directory, these are the IP addresses of the Simple AD directory
     * servers. For an AD Connector directory, these are the IP addresses of
     * the DNS servers or domain controllers in the on-premises directory
     * that the AD Connector is connected to.
     *
     * @param dnsIpAddrs The IP addresses of the DNS servers for the directory. For a Simple AD
     *         directory, these are the IP addresses of the Simple AD directory
     *         servers. For an AD Connector directory, these are the IP addresses of
     *         the DNS servers or domain controllers in the on-premises directory
     *         that the AD Connector is connected to.
     */
    public void setDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        if (dnsIpAddrs == null) {
            this.dnsIpAddrs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsIpAddrsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dnsIpAddrs.size());
        dnsIpAddrsCopy.addAll(dnsIpAddrs);
        this.dnsIpAddrs = dnsIpAddrsCopy;
    }
    
    /**
     * The IP addresses of the DNS servers for the directory. For a Simple AD
     * directory, these are the IP addresses of the Simple AD directory
     * servers. For an AD Connector directory, these are the IP addresses of
     * the DNS servers or domain controllers in the on-premises directory
     * that the AD Connector is connected to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDnsIpAddrs(java.util.Collection)} or {@link
     * #withDnsIpAddrs(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsIpAddrs The IP addresses of the DNS servers for the directory. For a Simple AD
     *         directory, these are the IP addresses of the Simple AD directory
     *         servers. For an AD Connector directory, these are the IP addresses of
     *         the DNS servers or domain controllers in the on-premises directory
     *         that the AD Connector is connected to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withDnsIpAddrs(String... dnsIpAddrs) {
        if (getDnsIpAddrs() == null) setDnsIpAddrs(new java.util.ArrayList<String>(dnsIpAddrs.length));
        for (String value : dnsIpAddrs) {
            getDnsIpAddrs().add(value);
        }
        return this;
    }
    
    /**
     * The IP addresses of the DNS servers for the directory. For a Simple AD
     * directory, these are the IP addresses of the Simple AD directory
     * servers. For an AD Connector directory, these are the IP addresses of
     * the DNS servers or domain controllers in the on-premises directory
     * that the AD Connector is connected to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dnsIpAddrs The IP addresses of the DNS servers for the directory. For a Simple AD
     *         directory, these are the IP addresses of the Simple AD directory
     *         servers. For an AD Connector directory, these are the IP addresses of
     *         the DNS servers or domain controllers in the on-premises directory
     *         that the AD Connector is connected to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        if (dnsIpAddrs == null) {
            this.dnsIpAddrs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dnsIpAddrsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dnsIpAddrs.size());
            dnsIpAddrsCopy.addAll(dnsIpAddrs);
            this.dnsIpAddrs = dnsIpAddrsCopy;
        }

        return this;
    }

    /**
     * The current stage of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed
     *
     * @return The current stage of the directory.
     *
     * @see DirectoryStage
     */
    public String getStage() {
        return stage;
    }
    
    /**
     * The current stage of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed
     *
     * @param stage The current stage of the directory.
     *
     * @see DirectoryStage
     */
    public void setStage(String stage) {
        this.stage = stage;
    }
    
    /**
     * The current stage of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed
     *
     * @param stage The current stage of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DirectoryStage
     */
    public DirectoryDescription withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * The current stage of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed
     *
     * @param stage The current stage of the directory.
     *
     * @see DirectoryStage
     */
    public void setStage(DirectoryStage stage) {
        this.stage = stage.toString();
    }
    
    /**
     * The current stage of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed
     *
     * @param stage The current stage of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DirectoryStage
     */
    public DirectoryDescription withStage(DirectoryStage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * Specifies when the directory was created.
     *
     * @return Specifies when the directory was created.
     */
    public java.util.Date getLaunchTime() {
        return launchTime;
    }
    
    /**
     * Specifies when the directory was created.
     *
     * @param launchTime Specifies when the directory was created.
     */
    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }
    
    /**
     * Specifies when the directory was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchTime Specifies when the directory was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * The date and time that the stage was last updated.
     *
     * @return The date and time that the stage was last updated.
     */
    public java.util.Date getStageLastUpdatedDateTime() {
        return stageLastUpdatedDateTime;
    }
    
    /**
     * The date and time that the stage was last updated.
     *
     * @param stageLastUpdatedDateTime The date and time that the stage was last updated.
     */
    public void setStageLastUpdatedDateTime(java.util.Date stageLastUpdatedDateTime) {
        this.stageLastUpdatedDateTime = stageLastUpdatedDateTime;
    }
    
    /**
     * The date and time that the stage was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stageLastUpdatedDateTime The date and time that the stage was last updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withStageLastUpdatedDateTime(java.util.Date stageLastUpdatedDateTime) {
        this.stageLastUpdatedDateTime = stageLastUpdatedDateTime;
        return this;
    }

    /**
     * The directory size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SimpleAD, ADConnector
     *
     * @return The directory size.
     *
     * @see DirectoryType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The directory size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SimpleAD, ADConnector
     *
     * @param type The directory size.
     *
     * @see DirectoryType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The directory size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SimpleAD, ADConnector
     *
     * @param type The directory size.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DirectoryType
     */
    public DirectoryDescription withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The directory size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SimpleAD, ADConnector
     *
     * @param type The directory size.
     *
     * @see DirectoryType
     */
    public void setType(DirectoryType type) {
        this.type = type.toString();
    }
    
    /**
     * The directory size.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SimpleAD, ADConnector
     *
     * @param type The directory size.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DirectoryType
     */
    public DirectoryDescription withType(DirectoryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * A <a>DirectoryVpcSettingsDescription</a> object that contains
     * additional information about a Simple AD directory. This member is
     * only present if the directory is a Simple AD directory.
     *
     * @return A <a>DirectoryVpcSettingsDescription</a> object that contains
     *         additional information about a Simple AD directory. This member is
     *         only present if the directory is a Simple AD directory.
     */
    public DirectoryVpcSettingsDescription getVpcSettings() {
        return vpcSettings;
    }
    
    /**
     * A <a>DirectoryVpcSettingsDescription</a> object that contains
     * additional information about a Simple AD directory. This member is
     * only present if the directory is a Simple AD directory.
     *
     * @param vpcSettings A <a>DirectoryVpcSettingsDescription</a> object that contains
     *         additional information about a Simple AD directory. This member is
     *         only present if the directory is a Simple AD directory.
     */
    public void setVpcSettings(DirectoryVpcSettingsDescription vpcSettings) {
        this.vpcSettings = vpcSettings;
    }
    
    /**
     * A <a>DirectoryVpcSettingsDescription</a> object that contains
     * additional information about a Simple AD directory. This member is
     * only present if the directory is a Simple AD directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSettings A <a>DirectoryVpcSettingsDescription</a> object that contains
     *         additional information about a Simple AD directory. This member is
     *         only present if the directory is a Simple AD directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withVpcSettings(DirectoryVpcSettingsDescription vpcSettings) {
        this.vpcSettings = vpcSettings;
        return this;
    }

    /**
     * A <a>DirectoryConnectSettingsDescription</a> object that contains
     * additional information about an AD Connector directory. This member is
     * only present if the directory is an AD Connector directory.
     *
     * @return A <a>DirectoryConnectSettingsDescription</a> object that contains
     *         additional information about an AD Connector directory. This member is
     *         only present if the directory is an AD Connector directory.
     */
    public DirectoryConnectSettingsDescription getConnectSettings() {
        return connectSettings;
    }
    
    /**
     * A <a>DirectoryConnectSettingsDescription</a> object that contains
     * additional information about an AD Connector directory. This member is
     * only present if the directory is an AD Connector directory.
     *
     * @param connectSettings A <a>DirectoryConnectSettingsDescription</a> object that contains
     *         additional information about an AD Connector directory. This member is
     *         only present if the directory is an AD Connector directory.
     */
    public void setConnectSettings(DirectoryConnectSettingsDescription connectSettings) {
        this.connectSettings = connectSettings;
    }
    
    /**
     * A <a>DirectoryConnectSettingsDescription</a> object that contains
     * additional information about an AD Connector directory. This member is
     * only present if the directory is an AD Connector directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectSettings A <a>DirectoryConnectSettingsDescription</a> object that contains
     *         additional information about an AD Connector directory. This member is
     *         only present if the directory is an AD Connector directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withConnectSettings(DirectoryConnectSettingsDescription connectSettings) {
        this.connectSettings = connectSettings;
        return this;
    }

    /**
     * A <a>RadiusSettings</a> object that contains information about the
     * RADIUS server configured for this directory.
     *
     * @return A <a>RadiusSettings</a> object that contains information about the
     *         RADIUS server configured for this directory.
     */
    public RadiusSettings getRadiusSettings() {
        return radiusSettings;
    }
    
    /**
     * A <a>RadiusSettings</a> object that contains information about the
     * RADIUS server configured for this directory.
     *
     * @param radiusSettings A <a>RadiusSettings</a> object that contains information about the
     *         RADIUS server configured for this directory.
     */
    public void setRadiusSettings(RadiusSettings radiusSettings) {
        this.radiusSettings = radiusSettings;
    }
    
    /**
     * A <a>RadiusSettings</a> object that contains information about the
     * RADIUS server configured for this directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param radiusSettings A <a>RadiusSettings</a> object that contains information about the
     *         RADIUS server configured for this directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withRadiusSettings(RadiusSettings radiusSettings) {
        this.radiusSettings = radiusSettings;
        return this;
    }

    /**
     * The status of the RADIUS MFA server connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @return The status of the RADIUS MFA server connection.
     *
     * @see RadiusStatus
     */
    public String getRadiusStatus() {
        return radiusStatus;
    }
    
    /**
     * The status of the RADIUS MFA server connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @param radiusStatus The status of the RADIUS MFA server connection.
     *
     * @see RadiusStatus
     */
    public void setRadiusStatus(String radiusStatus) {
        this.radiusStatus = radiusStatus;
    }
    
    /**
     * The status of the RADIUS MFA server connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @param radiusStatus The status of the RADIUS MFA server connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RadiusStatus
     */
    public DirectoryDescription withRadiusStatus(String radiusStatus) {
        this.radiusStatus = radiusStatus;
        return this;
    }

    /**
     * The status of the RADIUS MFA server connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @param radiusStatus The status of the RADIUS MFA server connection.
     *
     * @see RadiusStatus
     */
    public void setRadiusStatus(RadiusStatus radiusStatus) {
        this.radiusStatus = radiusStatus.toString();
    }
    
    /**
     * The status of the RADIUS MFA server connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Completed, Failed
     *
     * @param radiusStatus The status of the RADIUS MFA server connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RadiusStatus
     */
    public DirectoryDescription withRadiusStatus(RadiusStatus radiusStatus) {
        this.radiusStatus = radiusStatus.toString();
        return this;
    }

    /**
     * Additional information about the directory stage.
     *
     * @return Additional information about the directory stage.
     */
    public String getStageReason() {
        return stageReason;
    }
    
    /**
     * Additional information about the directory stage.
     *
     * @param stageReason Additional information about the directory stage.
     */
    public void setStageReason(String stageReason) {
        this.stageReason = stageReason;
    }
    
    /**
     * Additional information about the directory stage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stageReason Additional information about the directory stage.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withStageReason(String stageReason) {
        this.stageReason = stageReason;
        return this;
    }

    /**
     * Indicates if single-sign on is enabled for the directory. For more
     * information, see <a>EnableSso</a> and <a>DisableSso</a>.
     *
     * @return Indicates if single-sign on is enabled for the directory. For more
     *         information, see <a>EnableSso</a> and <a>DisableSso</a>.
     */
    public Boolean isSsoEnabled() {
        return ssoEnabled;
    }
    
    /**
     * Indicates if single-sign on is enabled for the directory. For more
     * information, see <a>EnableSso</a> and <a>DisableSso</a>.
     *
     * @param ssoEnabled Indicates if single-sign on is enabled for the directory. For more
     *         information, see <a>EnableSso</a> and <a>DisableSso</a>.
     */
    public void setSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
    }
    
    /**
     * Indicates if single-sign on is enabled for the directory. For more
     * information, see <a>EnableSso</a> and <a>DisableSso</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ssoEnabled Indicates if single-sign on is enabled for the directory. For more
     *         information, see <a>EnableSso</a> and <a>DisableSso</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DirectoryDescription withSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
        return this;
    }

    /**
     * Indicates if single-sign on is enabled for the directory. For more
     * information, see <a>EnableSso</a> and <a>DisableSso</a>.
     *
     * @return Indicates if single-sign on is enabled for the directory. For more
     *         information, see <a>EnableSso</a> and <a>DisableSso</a>.
     */
    public Boolean getSsoEnabled() {
        return ssoEnabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getShortName() != null) sb.append("ShortName: " + getShortName() + ",");
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getAlias() != null) sb.append("Alias: " + getAlias() + ",");
        if (getAccessUrl() != null) sb.append("AccessUrl: " + getAccessUrl() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDnsIpAddrs() != null) sb.append("DnsIpAddrs: " + getDnsIpAddrs() + ",");
        if (getStage() != null) sb.append("Stage: " + getStage() + ",");
        if (getLaunchTime() != null) sb.append("LaunchTime: " + getLaunchTime() + ",");
        if (getStageLastUpdatedDateTime() != null) sb.append("StageLastUpdatedDateTime: " + getStageLastUpdatedDateTime() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getVpcSettings() != null) sb.append("VpcSettings: " + getVpcSettings() + ",");
        if (getConnectSettings() != null) sb.append("ConnectSettings: " + getConnectSettings() + ",");
        if (getRadiusSettings() != null) sb.append("RadiusSettings: " + getRadiusSettings() + ",");
        if (getRadiusStatus() != null) sb.append("RadiusStatus: " + getRadiusStatus() + ",");
        if (getStageReason() != null) sb.append("StageReason: " + getStageReason() + ",");
        if (isSsoEnabled() != null) sb.append("SsoEnabled: " + isSsoEnabled() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isSsoEnabled() == null) ? 0 : isSsoEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DirectoryDescription == false) return false;
        DirectoryDescription other = (DirectoryDescription)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getShortName() == null ^ this.getShortName() == null) return false;
        if (other.getShortName() != null && other.getShortName().equals(this.getShortName()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getAlias() == null ^ this.getAlias() == null) return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false) return false; 
        if (other.getAccessUrl() == null ^ this.getAccessUrl() == null) return false;
        if (other.getAccessUrl() != null && other.getAccessUrl().equals(this.getAccessUrl()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDnsIpAddrs() == null ^ this.getDnsIpAddrs() == null) return false;
        if (other.getDnsIpAddrs() != null && other.getDnsIpAddrs().equals(this.getDnsIpAddrs()) == false) return false; 
        if (other.getStage() == null ^ this.getStage() == null) return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false) return false; 
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null) return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false) return false; 
        if (other.getStageLastUpdatedDateTime() == null ^ this.getStageLastUpdatedDateTime() == null) return false;
        if (other.getStageLastUpdatedDateTime() != null && other.getStageLastUpdatedDateTime().equals(this.getStageLastUpdatedDateTime()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getVpcSettings() == null ^ this.getVpcSettings() == null) return false;
        if (other.getVpcSettings() != null && other.getVpcSettings().equals(this.getVpcSettings()) == false) return false; 
        if (other.getConnectSettings() == null ^ this.getConnectSettings() == null) return false;
        if (other.getConnectSettings() != null && other.getConnectSettings().equals(this.getConnectSettings()) == false) return false; 
        if (other.getRadiusSettings() == null ^ this.getRadiusSettings() == null) return false;
        if (other.getRadiusSettings() != null && other.getRadiusSettings().equals(this.getRadiusSettings()) == false) return false; 
        if (other.getRadiusStatus() == null ^ this.getRadiusStatus() == null) return false;
        if (other.getRadiusStatus() != null && other.getRadiusStatus().equals(this.getRadiusStatus()) == false) return false; 
        if (other.getStageReason() == null ^ this.getStageReason() == null) return false;
        if (other.getStageReason() != null && other.getStageReason().equals(this.getStageReason()) == false) return false; 
        if (other.isSsoEnabled() == null ^ this.isSsoEnabled() == null) return false;
        if (other.isSsoEnabled() != null && other.isSsoEnabled().equals(this.isSsoEnabled()) == false) return false; 
        return true;
    }
    
    @Override
    public DirectoryDescription clone() {
        try {
            return (DirectoryDescription) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    