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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * vCenter client.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/VcenterClient" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VcenterClient implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Arn of vCenter client.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Datacenter name of vCenter client.
     * </p>
     */
    private String datacenterName;
    /**
     * <p>
     * Hostname of vCenter client .
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * Last seen time of vCenter client.
     * </p>
     */
    private String lastSeenDatetime;
    /**
     * <p>
     * Tags for Source Server of vCenter client.
     * </p>
     */
    private java.util.Map<String, String> sourceServerTags;
    /**
     * <p>
     * Tags for vCenter client.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * ID of vCenter client.
     * </p>
     */
    private String vcenterClientID;
    /**
     * <p>
     * Vcenter UUID of vCenter client.
     * </p>
     */
    private String vcenterUUID;

    /**
     * <p>
     * Arn of vCenter client.
     * </p>
     * 
     * @param arn
     *        Arn of vCenter client.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Arn of vCenter client.
     * </p>
     * 
     * @return Arn of vCenter client.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Arn of vCenter client.
     * </p>
     * 
     * @param arn
     *        Arn of vCenter client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Datacenter name of vCenter client.
     * </p>
     * 
     * @param datacenterName
     *        Datacenter name of vCenter client.
     */

    public void setDatacenterName(String datacenterName) {
        this.datacenterName = datacenterName;
    }

    /**
     * <p>
     * Datacenter name of vCenter client.
     * </p>
     * 
     * @return Datacenter name of vCenter client.
     */

    public String getDatacenterName() {
        return this.datacenterName;
    }

    /**
     * <p>
     * Datacenter name of vCenter client.
     * </p>
     * 
     * @param datacenterName
     *        Datacenter name of vCenter client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient withDatacenterName(String datacenterName) {
        setDatacenterName(datacenterName);
        return this;
    }

    /**
     * <p>
     * Hostname of vCenter client .
     * </p>
     * 
     * @param hostname
     *        Hostname of vCenter client .
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * Hostname of vCenter client .
     * </p>
     * 
     * @return Hostname of vCenter client .
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * Hostname of vCenter client .
     * </p>
     * 
     * @param hostname
     *        Hostname of vCenter client .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * Last seen time of vCenter client.
     * </p>
     * 
     * @param lastSeenDatetime
     *        Last seen time of vCenter client.
     */

    public void setLastSeenDatetime(String lastSeenDatetime) {
        this.lastSeenDatetime = lastSeenDatetime;
    }

    /**
     * <p>
     * Last seen time of vCenter client.
     * </p>
     * 
     * @return Last seen time of vCenter client.
     */

    public String getLastSeenDatetime() {
        return this.lastSeenDatetime;
    }

    /**
     * <p>
     * Last seen time of vCenter client.
     * </p>
     * 
     * @param lastSeenDatetime
     *        Last seen time of vCenter client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient withLastSeenDatetime(String lastSeenDatetime) {
        setLastSeenDatetime(lastSeenDatetime);
        return this;
    }

    /**
     * <p>
     * Tags for Source Server of vCenter client.
     * </p>
     * 
     * @return Tags for Source Server of vCenter client.
     */

    public java.util.Map<String, String> getSourceServerTags() {
        return sourceServerTags;
    }

    /**
     * <p>
     * Tags for Source Server of vCenter client.
     * </p>
     * 
     * @param sourceServerTags
     *        Tags for Source Server of vCenter client.
     */

    public void setSourceServerTags(java.util.Map<String, String> sourceServerTags) {
        this.sourceServerTags = sourceServerTags;
    }

    /**
     * <p>
     * Tags for Source Server of vCenter client.
     * </p>
     * 
     * @param sourceServerTags
     *        Tags for Source Server of vCenter client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient withSourceServerTags(java.util.Map<String, String> sourceServerTags) {
        setSourceServerTags(sourceServerTags);
        return this;
    }

    /**
     * Add a single SourceServerTags entry
     *
     * @see VcenterClient#withSourceServerTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient addSourceServerTagsEntry(String key, String value) {
        if (null == this.sourceServerTags) {
            this.sourceServerTags = new java.util.HashMap<String, String>();
        }
        if (this.sourceServerTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sourceServerTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SourceServerTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient clearSourceServerTagsEntries() {
        this.sourceServerTags = null;
        return this;
    }

    /**
     * <p>
     * Tags for vCenter client.
     * </p>
     * 
     * @return Tags for vCenter client.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for vCenter client.
     * </p>
     * 
     * @param tags
     *        Tags for vCenter client.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for vCenter client.
     * </p>
     * 
     * @param tags
     *        Tags for vCenter client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see VcenterClient#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient addTagsEntry(String key, String value) {
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

    public VcenterClient clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * ID of vCenter client.
     * </p>
     * 
     * @param vcenterClientID
     *        ID of vCenter client.
     */

    public void setVcenterClientID(String vcenterClientID) {
        this.vcenterClientID = vcenterClientID;
    }

    /**
     * <p>
     * ID of vCenter client.
     * </p>
     * 
     * @return ID of vCenter client.
     */

    public String getVcenterClientID() {
        return this.vcenterClientID;
    }

    /**
     * <p>
     * ID of vCenter client.
     * </p>
     * 
     * @param vcenterClientID
     *        ID of vCenter client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient withVcenterClientID(String vcenterClientID) {
        setVcenterClientID(vcenterClientID);
        return this;
    }

    /**
     * <p>
     * Vcenter UUID of vCenter client.
     * </p>
     * 
     * @param vcenterUUID
     *        Vcenter UUID of vCenter client.
     */

    public void setVcenterUUID(String vcenterUUID) {
        this.vcenterUUID = vcenterUUID;
    }

    /**
     * <p>
     * Vcenter UUID of vCenter client.
     * </p>
     * 
     * @return Vcenter UUID of vCenter client.
     */

    public String getVcenterUUID() {
        return this.vcenterUUID;
    }

    /**
     * <p>
     * Vcenter UUID of vCenter client.
     * </p>
     * 
     * @param vcenterUUID
     *        Vcenter UUID of vCenter client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterClient withVcenterUUID(String vcenterUUID) {
        setVcenterUUID(vcenterUUID);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDatacenterName() != null)
            sb.append("DatacenterName: ").append(getDatacenterName()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getLastSeenDatetime() != null)
            sb.append("LastSeenDatetime: ").append(getLastSeenDatetime()).append(",");
        if (getSourceServerTags() != null)
            sb.append("SourceServerTags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getVcenterClientID() != null)
            sb.append("VcenterClientID: ").append(getVcenterClientID()).append(",");
        if (getVcenterUUID() != null)
            sb.append("VcenterUUID: ").append(getVcenterUUID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VcenterClient == false)
            return false;
        VcenterClient other = (VcenterClient) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDatacenterName() == null ^ this.getDatacenterName() == null)
            return false;
        if (other.getDatacenterName() != null && other.getDatacenterName().equals(this.getDatacenterName()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getLastSeenDatetime() == null ^ this.getLastSeenDatetime() == null)
            return false;
        if (other.getLastSeenDatetime() != null && other.getLastSeenDatetime().equals(this.getLastSeenDatetime()) == false)
            return false;
        if (other.getSourceServerTags() == null ^ this.getSourceServerTags() == null)
            return false;
        if (other.getSourceServerTags() != null && other.getSourceServerTags().equals(this.getSourceServerTags()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVcenterClientID() == null ^ this.getVcenterClientID() == null)
            return false;
        if (other.getVcenterClientID() != null && other.getVcenterClientID().equals(this.getVcenterClientID()) == false)
            return false;
        if (other.getVcenterUUID() == null ^ this.getVcenterUUID() == null)
            return false;
        if (other.getVcenterUUID() != null && other.getVcenterUUID().equals(this.getVcenterUUID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDatacenterName() == null) ? 0 : getDatacenterName().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getLastSeenDatetime() == null) ? 0 : getLastSeenDatetime().hashCode());
        hashCode = prime * hashCode + ((getSourceServerTags() == null) ? 0 : getSourceServerTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVcenterClientID() == null) ? 0 : getVcenterClientID().hashCode());
        hashCode = prime * hashCode + ((getVcenterUUID() == null) ? 0 : getVcenterUUID().hashCode());
        return hashCode;
    }

    @Override
    public VcenterClient clone() {
        try {
            return (VcenterClient) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.VcenterClientMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
