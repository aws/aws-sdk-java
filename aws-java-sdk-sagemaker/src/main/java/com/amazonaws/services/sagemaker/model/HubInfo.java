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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a hub.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HubInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HubInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the hub.
     * </p>
     */
    private String hubName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub.
     * </p>
     */
    private String hubArn;
    /**
     * <p>
     * The display name of the hub.
     * </p>
     */
    private String hubDisplayName;
    /**
     * <p>
     * A description of the hub.
     * </p>
     */
    private String hubDescription;
    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     */
    private java.util.List<String> hubSearchKeywords;
    /**
     * <p>
     * The status of the hub.
     * </p>
     */
    private String hubStatus;
    /**
     * <p>
     * The date and time that the hub was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the hub was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the hub.
     * </p>
     * 
     * @param hubName
     *        The name of the hub.
     */

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    /**
     * <p>
     * The name of the hub.
     * </p>
     * 
     * @return The name of the hub.
     */

    public String getHubName() {
        return this.hubName;
    }

    /**
     * <p>
     * The name of the hub.
     * </p>
     * 
     * @param hubName
     *        The name of the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubInfo withHubName(String hubName) {
        setHubName(hubName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub.
     * </p>
     * 
     * @param hubArn
     *        The Amazon Resource Name (ARN) of the hub.
     */

    public void setHubArn(String hubArn) {
        this.hubArn = hubArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hub.
     */

    public String getHubArn() {
        return this.hubArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hub.
     * </p>
     * 
     * @param hubArn
     *        The Amazon Resource Name (ARN) of the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubInfo withHubArn(String hubArn) {
        setHubArn(hubArn);
        return this;
    }

    /**
     * <p>
     * The display name of the hub.
     * </p>
     * 
     * @param hubDisplayName
     *        The display name of the hub.
     */

    public void setHubDisplayName(String hubDisplayName) {
        this.hubDisplayName = hubDisplayName;
    }

    /**
     * <p>
     * The display name of the hub.
     * </p>
     * 
     * @return The display name of the hub.
     */

    public String getHubDisplayName() {
        return this.hubDisplayName;
    }

    /**
     * <p>
     * The display name of the hub.
     * </p>
     * 
     * @param hubDisplayName
     *        The display name of the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubInfo withHubDisplayName(String hubDisplayName) {
        setHubDisplayName(hubDisplayName);
        return this;
    }

    /**
     * <p>
     * A description of the hub.
     * </p>
     * 
     * @param hubDescription
     *        A description of the hub.
     */

    public void setHubDescription(String hubDescription) {
        this.hubDescription = hubDescription;
    }

    /**
     * <p>
     * A description of the hub.
     * </p>
     * 
     * @return A description of the hub.
     */

    public String getHubDescription() {
        return this.hubDescription;
    }

    /**
     * <p>
     * A description of the hub.
     * </p>
     * 
     * @param hubDescription
     *        A description of the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubInfo withHubDescription(String hubDescription) {
        setHubDescription(hubDescription);
        return this;
    }

    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     * 
     * @return The searchable keywords for the hub.
     */

    public java.util.List<String> getHubSearchKeywords() {
        return hubSearchKeywords;
    }

    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     * 
     * @param hubSearchKeywords
     *        The searchable keywords for the hub.
     */

    public void setHubSearchKeywords(java.util.Collection<String> hubSearchKeywords) {
        if (hubSearchKeywords == null) {
            this.hubSearchKeywords = null;
            return;
        }

        this.hubSearchKeywords = new java.util.ArrayList<String>(hubSearchKeywords);
    }

    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHubSearchKeywords(java.util.Collection)} or {@link #withHubSearchKeywords(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param hubSearchKeywords
     *        The searchable keywords for the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubInfo withHubSearchKeywords(String... hubSearchKeywords) {
        if (this.hubSearchKeywords == null) {
            setHubSearchKeywords(new java.util.ArrayList<String>(hubSearchKeywords.length));
        }
        for (String ele : hubSearchKeywords) {
            this.hubSearchKeywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The searchable keywords for the hub.
     * </p>
     * 
     * @param hubSearchKeywords
     *        The searchable keywords for the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubInfo withHubSearchKeywords(java.util.Collection<String> hubSearchKeywords) {
        setHubSearchKeywords(hubSearchKeywords);
        return this;
    }

    /**
     * <p>
     * The status of the hub.
     * </p>
     * 
     * @param hubStatus
     *        The status of the hub.
     * @see HubStatus
     */

    public void setHubStatus(String hubStatus) {
        this.hubStatus = hubStatus;
    }

    /**
     * <p>
     * The status of the hub.
     * </p>
     * 
     * @return The status of the hub.
     * @see HubStatus
     */

    public String getHubStatus() {
        return this.hubStatus;
    }

    /**
     * <p>
     * The status of the hub.
     * </p>
     * 
     * @param hubStatus
     *        The status of the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubStatus
     */

    public HubInfo withHubStatus(String hubStatus) {
        setHubStatus(hubStatus);
        return this;
    }

    /**
     * <p>
     * The status of the hub.
     * </p>
     * 
     * @param hubStatus
     *        The status of the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubStatus
     */

    public HubInfo withHubStatus(HubStatus hubStatus) {
        this.hubStatus = hubStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the hub was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the hub was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the hub was created.
     * </p>
     * 
     * @return The date and time that the hub was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the hub was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the hub was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubInfo withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the hub was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the hub was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the hub was last modified.
     * </p>
     * 
     * @return The date and time that the hub was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the hub was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the hub was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubInfo withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getHubName() != null)
            sb.append("HubName: ").append(getHubName()).append(",");
        if (getHubArn() != null)
            sb.append("HubArn: ").append(getHubArn()).append(",");
        if (getHubDisplayName() != null)
            sb.append("HubDisplayName: ").append(getHubDisplayName()).append(",");
        if (getHubDescription() != null)
            sb.append("HubDescription: ").append(getHubDescription()).append(",");
        if (getHubSearchKeywords() != null)
            sb.append("HubSearchKeywords: ").append(getHubSearchKeywords()).append(",");
        if (getHubStatus() != null)
            sb.append("HubStatus: ").append(getHubStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HubInfo == false)
            return false;
        HubInfo other = (HubInfo) obj;
        if (other.getHubName() == null ^ this.getHubName() == null)
            return false;
        if (other.getHubName() != null && other.getHubName().equals(this.getHubName()) == false)
            return false;
        if (other.getHubArn() == null ^ this.getHubArn() == null)
            return false;
        if (other.getHubArn() != null && other.getHubArn().equals(this.getHubArn()) == false)
            return false;
        if (other.getHubDisplayName() == null ^ this.getHubDisplayName() == null)
            return false;
        if (other.getHubDisplayName() != null && other.getHubDisplayName().equals(this.getHubDisplayName()) == false)
            return false;
        if (other.getHubDescription() == null ^ this.getHubDescription() == null)
            return false;
        if (other.getHubDescription() != null && other.getHubDescription().equals(this.getHubDescription()) == false)
            return false;
        if (other.getHubSearchKeywords() == null ^ this.getHubSearchKeywords() == null)
            return false;
        if (other.getHubSearchKeywords() != null && other.getHubSearchKeywords().equals(this.getHubSearchKeywords()) == false)
            return false;
        if (other.getHubStatus() == null ^ this.getHubStatus() == null)
            return false;
        if (other.getHubStatus() != null && other.getHubStatus().equals(this.getHubStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHubName() == null) ? 0 : getHubName().hashCode());
        hashCode = prime * hashCode + ((getHubArn() == null) ? 0 : getHubArn().hashCode());
        hashCode = prime * hashCode + ((getHubDisplayName() == null) ? 0 : getHubDisplayName().hashCode());
        hashCode = prime * hashCode + ((getHubDescription() == null) ? 0 : getHubDescription().hashCode());
        hashCode = prime * hashCode + ((getHubSearchKeywords() == null) ? 0 : getHubSearchKeywords().hashCode());
        hashCode = prime * hashCode + ((getHubStatus() == null) ? 0 : getHubStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public HubInfo clone() {
        try {
            return (HubInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HubInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
