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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Program configuration parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/Program" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Program implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     */
    private java.util.List<AdBreak> adBreaks;
    /**
     * <p>
     * The ARN of the program.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the channel that the program belongs to.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The timestamp of when the program was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp of when the program was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The name of the program.
     * </p>
     */
    private String programName;
    /**
     * <p>
     * The name of the source location.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * 
     * @return The ad break configuration settings.
     */

    public java.util.List<AdBreak> getAdBreaks() {
        return adBreaks;
    }

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
     */

    public void setAdBreaks(java.util.Collection<AdBreak> adBreaks) {
        if (adBreaks == null) {
            this.adBreaks = null;
            return;
        }

        this.adBreaks = new java.util.ArrayList<AdBreak>(adBreaks);
    }

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdBreaks(java.util.Collection)} or {@link #withAdBreaks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withAdBreaks(AdBreak... adBreaks) {
        if (this.adBreaks == null) {
            setAdBreaks(new java.util.ArrayList<AdBreak>(adBreaks.length));
        }
        for (AdBreak ele : adBreaks) {
            this.adBreaks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withAdBreaks(java.util.Collection<AdBreak> adBreaks) {
        setAdBreaks(adBreaks);
        return this;
    }

    /**
     * <p>
     * The ARN of the program.
     * </p>
     * 
     * @param arn
     *        The ARN of the program.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the program.
     * </p>
     * 
     * @return The ARN of the program.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the program.
     * </p>
     * 
     * @param arn
     *        The ARN of the program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the channel that the program belongs to.
     * </p>
     * 
     * @param channelName
     *        The name of the channel that the program belongs to.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel that the program belongs to.
     * </p>
     * 
     * @return The name of the channel that the program belongs to.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel that the program belongs to.
     * </p>
     * 
     * @param channelName
     *        The name of the channel that the program belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the program was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the program was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp of when the program was created.
     * </p>
     * 
     * @return The timestamp of when the program was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp of when the program was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the program was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the program was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of when the program was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of when the program was last modified.
     * </p>
     * 
     * @return The timestamp of when the program was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of when the program was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of when the program was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The name of the program.
     * </p>
     * 
     * @param programName
     *        The name of the program.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * <p>
     * The name of the program.
     * </p>
     * 
     * @return The name of the program.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * <p>
     * The name of the program.
     * </p>
     * 
     * @param programName
     *        The name of the program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withProgramName(String programName) {
        setProgramName(programName);
        return this;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @return The name of the source location.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name that's used to refer to a VOD source.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @return The name that's used to refer to a VOD source.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name that's used to refer to a VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Program withVodSourceName(String vodSourceName) {
        setVodSourceName(vodSourceName);
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
        if (getAdBreaks() != null)
            sb.append("AdBreaks: ").append(getAdBreaks()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getProgramName() != null)
            sb.append("ProgramName: ").append(getProgramName()).append(",");
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName()).append(",");
        if (getVodSourceName() != null)
            sb.append("VodSourceName: ").append(getVodSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Program == false)
            return false;
        Program other = (Program) obj;
        if (other.getAdBreaks() == null ^ this.getAdBreaks() == null)
            return false;
        if (other.getAdBreaks() != null && other.getAdBreaks().equals(this.getAdBreaks()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null && other.getProgramName().equals(this.getProgramName()) == false)
            return false;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
            return false;
        if (other.getVodSourceName() == null ^ this.getVodSourceName() == null)
            return false;
        if (other.getVodSourceName() != null && other.getVodSourceName().equals(this.getVodSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdBreaks() == null) ? 0 : getAdBreaks().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public Program clone() {
        try {
            return (Program) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.ProgramMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
