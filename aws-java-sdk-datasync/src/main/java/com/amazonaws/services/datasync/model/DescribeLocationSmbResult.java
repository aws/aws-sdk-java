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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * DescribeLocationSmbResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationSmb" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationSmbResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource Name (ARN) of the SMB location that was described.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The URL of the source SBM location that was described.
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * The user who is logged on the SMB server.
     * </p>
     */
    private String user;
    /**
     * <p>
     * The name of the domain that the SMB server belongs to.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The mount options that are available for DataSync to use to access an SMB location.
     * </p>
     */
    private SmbMountOptions mountOptions;
    /**
     * <p>
     * The time that the SMB location was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon resource Name (ARN) of the SMB location that was described.
     * </p>
     * 
     * @param locationArn
     *        The Amazon resource Name (ARN) of the SMB location that was described.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon resource Name (ARN) of the SMB location that was described.
     * </p>
     * 
     * @return The Amazon resource Name (ARN) of the SMB location that was described.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon resource Name (ARN) of the SMB location that was described.
     * </p>
     * 
     * @param locationArn
     *        The Amazon resource Name (ARN) of the SMB location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationSmbResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The URL of the source SBM location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the source SBM location that was described.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URL of the source SBM location that was described.
     * </p>
     * 
     * @return The URL of the source SBM location that was described.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The URL of the source SBM location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the source SBM location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationSmbResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source SMB file system location that is created.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Name (ARN) of the source SMB file system location that is created.
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
     * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Name (ARN) of the source SMB file system location that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationSmbResult withAgentArns(String... agentArns) {
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
     * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Name (ARN) of the source SMB file system location that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationSmbResult withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * The user who is logged on the SMB server.
     * </p>
     * 
     * @param user
     *        The user who is logged on the SMB server.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user who is logged on the SMB server.
     * </p>
     * 
     * @return The user who is logged on the SMB server.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user who is logged on the SMB server.
     * </p>
     * 
     * @param user
     *        The user who is logged on the SMB server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationSmbResult withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The name of the domain that the SMB server belongs to.
     * </p>
     * 
     * @param domain
     *        The name of the domain that the SMB server belongs to.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that the SMB server belongs to.
     * </p>
     * 
     * @return The name of the domain that the SMB server belongs to.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that the SMB server belongs to.
     * </p>
     * 
     * @param domain
     *        The name of the domain that the SMB server belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationSmbResult withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The mount options that are available for DataSync to use to access an SMB location.
     * </p>
     * 
     * @param mountOptions
     *        The mount options that are available for DataSync to use to access an SMB location.
     */

    public void setMountOptions(SmbMountOptions mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * <p>
     * The mount options that are available for DataSync to use to access an SMB location.
     * </p>
     * 
     * @return The mount options that are available for DataSync to use to access an SMB location.
     */

    public SmbMountOptions getMountOptions() {
        return this.mountOptions;
    }

    /**
     * <p>
     * The mount options that are available for DataSync to use to access an SMB location.
     * </p>
     * 
     * @param mountOptions
     *        The mount options that are available for DataSync to use to access an SMB location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationSmbResult withMountOptions(SmbMountOptions mountOptions) {
        setMountOptions(mountOptions);
        return this;
    }

    /**
     * <p>
     * The time that the SMB location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the SMB location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the SMB location was created.
     * </p>
     * 
     * @return The time that the SMB location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the SMB location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the SMB location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationSmbResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getMountOptions() != null)
            sb.append("MountOptions: ").append(getMountOptions()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationSmbResult == false)
            return false;
        DescribeLocationSmbResult other = (DescribeLocationSmbResult) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getMountOptions() == null ^ this.getMountOptions() == null)
            return false;
        if (other.getMountOptions() != null && other.getMountOptions().equals(this.getMountOptions()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationSmbResult clone() {
        try {
            return (DescribeLocationSmbResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
