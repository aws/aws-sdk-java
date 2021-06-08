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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/LaunchProfileInitialization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchProfileInitialization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A LaunchProfileInitializationActiveDirectory resource.
     * </p>
     */
    private LaunchProfileInitializationActiveDirectory activeDirectory;
    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     */
    private java.util.List<String> ec2SecurityGroupIds;
    /**
     * <p>
     * The launch profile ID.
     * </p>
     */
    private String launchProfileId;
    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     */
    private String launchProfileProtocolVersion;
    /**
     * <p>
     * The launch purpose.
     * </p>
     */
    private String launchPurpose;
    /**
     * <p>
     * The name for the launch profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The platform of the launch platform, either WINDOWS or LINUX.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The system initializtion scripts.
     * </p>
     */
    private java.util.List<LaunchProfileInitializationScript> systemInitializationScripts;
    /**
     * <p>
     * The user initializtion scripts.
     * </p>
     */
    private java.util.List<LaunchProfileInitializationScript> userInitializationScripts;

    /**
     * <p>
     * A LaunchProfileInitializationActiveDirectory resource.
     * </p>
     * 
     * @param activeDirectory
     *        A LaunchProfileInitializationActiveDirectory resource.
     */

    public void setActiveDirectory(LaunchProfileInitializationActiveDirectory activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    /**
     * <p>
     * A LaunchProfileInitializationActiveDirectory resource.
     * </p>
     * 
     * @return A LaunchProfileInitializationActiveDirectory resource.
     */

    public LaunchProfileInitializationActiveDirectory getActiveDirectory() {
        return this.activeDirectory;
    }

    /**
     * <p>
     * A LaunchProfileInitializationActiveDirectory resource.
     * </p>
     * 
     * @param activeDirectory
     *        A LaunchProfileInitializationActiveDirectory resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withActiveDirectory(LaunchProfileInitializationActiveDirectory activeDirectory) {
        setActiveDirectory(activeDirectory);
        return this;
    }

    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     * 
     * @return The EC2 security groups that control access to the studio component.
     */

    public java.util.List<String> getEc2SecurityGroupIds() {
        return ec2SecurityGroupIds;
    }

    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     * 
     * @param ec2SecurityGroupIds
     *        The EC2 security groups that control access to the studio component.
     */

    public void setEc2SecurityGroupIds(java.util.Collection<String> ec2SecurityGroupIds) {
        if (ec2SecurityGroupIds == null) {
            this.ec2SecurityGroupIds = null;
            return;
        }

        this.ec2SecurityGroupIds = new java.util.ArrayList<String>(ec2SecurityGroupIds);
    }

    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2SecurityGroupIds(java.util.Collection)} or {@link #withEc2SecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ec2SecurityGroupIds
     *        The EC2 security groups that control access to the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withEc2SecurityGroupIds(String... ec2SecurityGroupIds) {
        if (this.ec2SecurityGroupIds == null) {
            setEc2SecurityGroupIds(new java.util.ArrayList<String>(ec2SecurityGroupIds.length));
        }
        for (String ele : ec2SecurityGroupIds) {
            this.ec2SecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 security groups that control access to the studio component.
     * </p>
     * 
     * @param ec2SecurityGroupIds
     *        The EC2 security groups that control access to the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withEc2SecurityGroupIds(java.util.Collection<String> ec2SecurityGroupIds) {
        setEc2SecurityGroupIds(ec2SecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The launch profile ID.
     * </p>
     * 
     * @param launchProfileId
     *        The launch profile ID.
     */

    public void setLaunchProfileId(String launchProfileId) {
        this.launchProfileId = launchProfileId;
    }

    /**
     * <p>
     * The launch profile ID.
     * </p>
     * 
     * @return The launch profile ID.
     */

    public String getLaunchProfileId() {
        return this.launchProfileId;
    }

    /**
     * <p>
     * The launch profile ID.
     * </p>
     * 
     * @param launchProfileId
     *        The launch profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withLaunchProfileId(String launchProfileId) {
        setLaunchProfileId(launchProfileId);
        return this;
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @param launchProfileProtocolVersion
     *        The version number of the protocol that is used by the launch profile. The only valid version is
     *        "2021-03-31".
     */

    public void setLaunchProfileProtocolVersion(String launchProfileProtocolVersion) {
        this.launchProfileProtocolVersion = launchProfileProtocolVersion;
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @return The version number of the protocol that is used by the launch profile. The only valid version is
     *         "2021-03-31".
     */

    public String getLaunchProfileProtocolVersion() {
        return this.launchProfileProtocolVersion;
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @param launchProfileProtocolVersion
     *        The version number of the protocol that is used by the launch profile. The only valid version is
     *        "2021-03-31".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withLaunchProfileProtocolVersion(String launchProfileProtocolVersion) {
        setLaunchProfileProtocolVersion(launchProfileProtocolVersion);
        return this;
    }

    /**
     * <p>
     * The launch purpose.
     * </p>
     * 
     * @param launchPurpose
     *        The launch purpose.
     */

    public void setLaunchPurpose(String launchPurpose) {
        this.launchPurpose = launchPurpose;
    }

    /**
     * <p>
     * The launch purpose.
     * </p>
     * 
     * @return The launch purpose.
     */

    public String getLaunchPurpose() {
        return this.launchPurpose;
    }

    /**
     * <p>
     * The launch purpose.
     * </p>
     * 
     * @param launchPurpose
     *        The launch purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withLaunchPurpose(String launchPurpose) {
        setLaunchPurpose(launchPurpose);
        return this;
    }

    /**
     * <p>
     * The name for the launch profile.
     * </p>
     * 
     * @param name
     *        The name for the launch profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the launch profile.
     * </p>
     * 
     * @return The name for the launch profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the launch profile.
     * </p>
     * 
     * @param name
     *        The name for the launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The platform of the launch platform, either WINDOWS or LINUX.
     * </p>
     * 
     * @param platform
     *        The platform of the launch platform, either WINDOWS or LINUX.
     * @see LaunchProfilePlatform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the launch platform, either WINDOWS or LINUX.
     * </p>
     * 
     * @return The platform of the launch platform, either WINDOWS or LINUX.
     * @see LaunchProfilePlatform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the launch platform, either WINDOWS or LINUX.
     * </p>
     * 
     * @param platform
     *        The platform of the launch platform, either WINDOWS or LINUX.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfilePlatform
     */

    public LaunchProfileInitialization withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the launch platform, either WINDOWS or LINUX.
     * </p>
     * 
     * @param platform
     *        The platform of the launch platform, either WINDOWS or LINUX.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfilePlatform
     */

    public LaunchProfileInitialization withPlatform(LaunchProfilePlatform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The system initializtion scripts.
     * </p>
     * 
     * @return The system initializtion scripts.
     */

    public java.util.List<LaunchProfileInitializationScript> getSystemInitializationScripts() {
        return systemInitializationScripts;
    }

    /**
     * <p>
     * The system initializtion scripts.
     * </p>
     * 
     * @param systemInitializationScripts
     *        The system initializtion scripts.
     */

    public void setSystemInitializationScripts(java.util.Collection<LaunchProfileInitializationScript> systemInitializationScripts) {
        if (systemInitializationScripts == null) {
            this.systemInitializationScripts = null;
            return;
        }

        this.systemInitializationScripts = new java.util.ArrayList<LaunchProfileInitializationScript>(systemInitializationScripts);
    }

    /**
     * <p>
     * The system initializtion scripts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSystemInitializationScripts(java.util.Collection)} or
     * {@link #withSystemInitializationScripts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param systemInitializationScripts
     *        The system initializtion scripts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withSystemInitializationScripts(LaunchProfileInitializationScript... systemInitializationScripts) {
        if (this.systemInitializationScripts == null) {
            setSystemInitializationScripts(new java.util.ArrayList<LaunchProfileInitializationScript>(systemInitializationScripts.length));
        }
        for (LaunchProfileInitializationScript ele : systemInitializationScripts) {
            this.systemInitializationScripts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The system initializtion scripts.
     * </p>
     * 
     * @param systemInitializationScripts
     *        The system initializtion scripts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withSystemInitializationScripts(java.util.Collection<LaunchProfileInitializationScript> systemInitializationScripts) {
        setSystemInitializationScripts(systemInitializationScripts);
        return this;
    }

    /**
     * <p>
     * The user initializtion scripts.
     * </p>
     * 
     * @return The user initializtion scripts.
     */

    public java.util.List<LaunchProfileInitializationScript> getUserInitializationScripts() {
        return userInitializationScripts;
    }

    /**
     * <p>
     * The user initializtion scripts.
     * </p>
     * 
     * @param userInitializationScripts
     *        The user initializtion scripts.
     */

    public void setUserInitializationScripts(java.util.Collection<LaunchProfileInitializationScript> userInitializationScripts) {
        if (userInitializationScripts == null) {
            this.userInitializationScripts = null;
            return;
        }

        this.userInitializationScripts = new java.util.ArrayList<LaunchProfileInitializationScript>(userInitializationScripts);
    }

    /**
     * <p>
     * The user initializtion scripts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserInitializationScripts(java.util.Collection)} or
     * {@link #withUserInitializationScripts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userInitializationScripts
     *        The user initializtion scripts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withUserInitializationScripts(LaunchProfileInitializationScript... userInitializationScripts) {
        if (this.userInitializationScripts == null) {
            setUserInitializationScripts(new java.util.ArrayList<LaunchProfileInitializationScript>(userInitializationScripts.length));
        }
        for (LaunchProfileInitializationScript ele : userInitializationScripts) {
            this.userInitializationScripts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user initializtion scripts.
     * </p>
     * 
     * @param userInitializationScripts
     *        The user initializtion scripts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitialization withUserInitializationScripts(java.util.Collection<LaunchProfileInitializationScript> userInitializationScripts) {
        setUserInitializationScripts(userInitializationScripts);
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
        if (getActiveDirectory() != null)
            sb.append("ActiveDirectory: ").append(getActiveDirectory()).append(",");
        if (getEc2SecurityGroupIds() != null)
            sb.append("Ec2SecurityGroupIds: ").append(getEc2SecurityGroupIds()).append(",");
        if (getLaunchProfileId() != null)
            sb.append("LaunchProfileId: ").append(getLaunchProfileId()).append(",");
        if (getLaunchProfileProtocolVersion() != null)
            sb.append("LaunchProfileProtocolVersion: ").append(getLaunchProfileProtocolVersion()).append(",");
        if (getLaunchPurpose() != null)
            sb.append("LaunchPurpose: ").append(getLaunchPurpose()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getSystemInitializationScripts() != null)
            sb.append("SystemInitializationScripts: ").append(getSystemInitializationScripts()).append(",");
        if (getUserInitializationScripts() != null)
            sb.append("UserInitializationScripts: ").append(getUserInitializationScripts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchProfileInitialization == false)
            return false;
        LaunchProfileInitialization other = (LaunchProfileInitialization) obj;
        if (other.getActiveDirectory() == null ^ this.getActiveDirectory() == null)
            return false;
        if (other.getActiveDirectory() != null && other.getActiveDirectory().equals(this.getActiveDirectory()) == false)
            return false;
        if (other.getEc2SecurityGroupIds() == null ^ this.getEc2SecurityGroupIds() == null)
            return false;
        if (other.getEc2SecurityGroupIds() != null && other.getEc2SecurityGroupIds().equals(this.getEc2SecurityGroupIds()) == false)
            return false;
        if (other.getLaunchProfileId() == null ^ this.getLaunchProfileId() == null)
            return false;
        if (other.getLaunchProfileId() != null && other.getLaunchProfileId().equals(this.getLaunchProfileId()) == false)
            return false;
        if (other.getLaunchProfileProtocolVersion() == null ^ this.getLaunchProfileProtocolVersion() == null)
            return false;
        if (other.getLaunchProfileProtocolVersion() != null && other.getLaunchProfileProtocolVersion().equals(this.getLaunchProfileProtocolVersion()) == false)
            return false;
        if (other.getLaunchPurpose() == null ^ this.getLaunchPurpose() == null)
            return false;
        if (other.getLaunchPurpose() != null && other.getLaunchPurpose().equals(this.getLaunchPurpose()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getSystemInitializationScripts() == null ^ this.getSystemInitializationScripts() == null)
            return false;
        if (other.getSystemInitializationScripts() != null && other.getSystemInitializationScripts().equals(this.getSystemInitializationScripts()) == false)
            return false;
        if (other.getUserInitializationScripts() == null ^ this.getUserInitializationScripts() == null)
            return false;
        if (other.getUserInitializationScripts() != null && other.getUserInitializationScripts().equals(this.getUserInitializationScripts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveDirectory() == null) ? 0 : getActiveDirectory().hashCode());
        hashCode = prime * hashCode + ((getEc2SecurityGroupIds() == null) ? 0 : getEc2SecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileId() == null) ? 0 : getLaunchProfileId().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileProtocolVersion() == null) ? 0 : getLaunchProfileProtocolVersion().hashCode());
        hashCode = prime * hashCode + ((getLaunchPurpose() == null) ? 0 : getLaunchPurpose().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getSystemInitializationScripts() == null) ? 0 : getSystemInitializationScripts().hashCode());
        hashCode = prime * hashCode + ((getUserInitializationScripts() == null) ? 0 : getUserInitializationScripts().hashCode());
        return hashCode;
    }

    @Override
    public LaunchProfileInitialization clone() {
        try {
            return (LaunchProfileInitialization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.LaunchProfileInitializationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
