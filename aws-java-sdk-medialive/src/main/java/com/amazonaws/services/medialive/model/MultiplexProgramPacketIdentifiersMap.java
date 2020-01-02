/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Packet identifiers map for a given Multiplex program.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MultiplexProgramPacketIdentifiersMap"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexProgramPacketIdentifiersMap implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Integer> audioPids;

    private java.util.List<Integer> dvbSubPids;

    private Integer dvbTeletextPid;

    private Integer etvPlatformPid;

    private Integer etvSignalPid;

    private java.util.List<Integer> klvDataPids;

    private Integer pcrPid;

    private Integer pmtPid;

    private Integer privateMetadataPid;

    private java.util.List<Integer> scte27Pids;

    private Integer scte35Pid;

    private Integer timedMetadataPid;

    private Integer videoPid;

    /**
     * @return
     */

    public java.util.List<Integer> getAudioPids() {
        return audioPids;
    }

    /**
     * @param audioPids
     */

    public void setAudioPids(java.util.Collection<Integer> audioPids) {
        if (audioPids == null) {
            this.audioPids = null;
            return;
        }

        this.audioPids = new java.util.ArrayList<Integer>(audioPids);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioPids(java.util.Collection)} or {@link #withAudioPids(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param audioPids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withAudioPids(Integer... audioPids) {
        if (this.audioPids == null) {
            setAudioPids(new java.util.ArrayList<Integer>(audioPids.length));
        }
        for (Integer ele : audioPids) {
            this.audioPids.add(ele);
        }
        return this;
    }

    /**
     * @param audioPids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withAudioPids(java.util.Collection<Integer> audioPids) {
        setAudioPids(audioPids);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Integer> getDvbSubPids() {
        return dvbSubPids;
    }

    /**
     * @param dvbSubPids
     */

    public void setDvbSubPids(java.util.Collection<Integer> dvbSubPids) {
        if (dvbSubPids == null) {
            this.dvbSubPids = null;
            return;
        }

        this.dvbSubPids = new java.util.ArrayList<Integer>(dvbSubPids);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDvbSubPids(java.util.Collection)} or {@link #withDvbSubPids(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dvbSubPids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withDvbSubPids(Integer... dvbSubPids) {
        if (this.dvbSubPids == null) {
            setDvbSubPids(new java.util.ArrayList<Integer>(dvbSubPids.length));
        }
        for (Integer ele : dvbSubPids) {
            this.dvbSubPids.add(ele);
        }
        return this;
    }

    /**
     * @param dvbSubPids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withDvbSubPids(java.util.Collection<Integer> dvbSubPids) {
        setDvbSubPids(dvbSubPids);
        return this;
    }

    /**
     * @param dvbTeletextPid
     */

    public void setDvbTeletextPid(Integer dvbTeletextPid) {
        this.dvbTeletextPid = dvbTeletextPid;
    }

    /**
     * @return
     */

    public Integer getDvbTeletextPid() {
        return this.dvbTeletextPid;
    }

    /**
     * @param dvbTeletextPid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withDvbTeletextPid(Integer dvbTeletextPid) {
        setDvbTeletextPid(dvbTeletextPid);
        return this;
    }

    /**
     * @param etvPlatformPid
     */

    public void setEtvPlatformPid(Integer etvPlatformPid) {
        this.etvPlatformPid = etvPlatformPid;
    }

    /**
     * @return
     */

    public Integer getEtvPlatformPid() {
        return this.etvPlatformPid;
    }

    /**
     * @param etvPlatformPid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withEtvPlatformPid(Integer etvPlatformPid) {
        setEtvPlatformPid(etvPlatformPid);
        return this;
    }

    /**
     * @param etvSignalPid
     */

    public void setEtvSignalPid(Integer etvSignalPid) {
        this.etvSignalPid = etvSignalPid;
    }

    /**
     * @return
     */

    public Integer getEtvSignalPid() {
        return this.etvSignalPid;
    }

    /**
     * @param etvSignalPid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withEtvSignalPid(Integer etvSignalPid) {
        setEtvSignalPid(etvSignalPid);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Integer> getKlvDataPids() {
        return klvDataPids;
    }

    /**
     * @param klvDataPids
     */

    public void setKlvDataPids(java.util.Collection<Integer> klvDataPids) {
        if (klvDataPids == null) {
            this.klvDataPids = null;
            return;
        }

        this.klvDataPids = new java.util.ArrayList<Integer>(klvDataPids);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKlvDataPids(java.util.Collection)} or {@link #withKlvDataPids(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param klvDataPids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withKlvDataPids(Integer... klvDataPids) {
        if (this.klvDataPids == null) {
            setKlvDataPids(new java.util.ArrayList<Integer>(klvDataPids.length));
        }
        for (Integer ele : klvDataPids) {
            this.klvDataPids.add(ele);
        }
        return this;
    }

    /**
     * @param klvDataPids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withKlvDataPids(java.util.Collection<Integer> klvDataPids) {
        setKlvDataPids(klvDataPids);
        return this;
    }

    /**
     * @param pcrPid
     */

    public void setPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * @return
     */

    public Integer getPcrPid() {
        return this.pcrPid;
    }

    /**
     * @param pcrPid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withPcrPid(Integer pcrPid) {
        setPcrPid(pcrPid);
        return this;
    }

    /**
     * @param pmtPid
     */

    public void setPmtPid(Integer pmtPid) {
        this.pmtPid = pmtPid;
    }

    /**
     * @return
     */

    public Integer getPmtPid() {
        return this.pmtPid;
    }

    /**
     * @param pmtPid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withPmtPid(Integer pmtPid) {
        setPmtPid(pmtPid);
        return this;
    }

    /**
     * @param privateMetadataPid
     */

    public void setPrivateMetadataPid(Integer privateMetadataPid) {
        this.privateMetadataPid = privateMetadataPid;
    }

    /**
     * @return
     */

    public Integer getPrivateMetadataPid() {
        return this.privateMetadataPid;
    }

    /**
     * @param privateMetadataPid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withPrivateMetadataPid(Integer privateMetadataPid) {
        setPrivateMetadataPid(privateMetadataPid);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Integer> getScte27Pids() {
        return scte27Pids;
    }

    /**
     * @param scte27Pids
     */

    public void setScte27Pids(java.util.Collection<Integer> scte27Pids) {
        if (scte27Pids == null) {
            this.scte27Pids = null;
            return;
        }

        this.scte27Pids = new java.util.ArrayList<Integer>(scte27Pids);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScte27Pids(java.util.Collection)} or {@link #withScte27Pids(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param scte27Pids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withScte27Pids(Integer... scte27Pids) {
        if (this.scte27Pids == null) {
            setScte27Pids(new java.util.ArrayList<Integer>(scte27Pids.length));
        }
        for (Integer ele : scte27Pids) {
            this.scte27Pids.add(ele);
        }
        return this;
    }

    /**
     * @param scte27Pids
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withScte27Pids(java.util.Collection<Integer> scte27Pids) {
        setScte27Pids(scte27Pids);
        return this;
    }

    /**
     * @param scte35Pid
     */

    public void setScte35Pid(Integer scte35Pid) {
        this.scte35Pid = scte35Pid;
    }

    /**
     * @return
     */

    public Integer getScte35Pid() {
        return this.scte35Pid;
    }

    /**
     * @param scte35Pid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withScte35Pid(Integer scte35Pid) {
        setScte35Pid(scte35Pid);
        return this;
    }

    /**
     * @param timedMetadataPid
     */

    public void setTimedMetadataPid(Integer timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
    }

    /**
     * @return
     */

    public Integer getTimedMetadataPid() {
        return this.timedMetadataPid;
    }

    /**
     * @param timedMetadataPid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withTimedMetadataPid(Integer timedMetadataPid) {
        setTimedMetadataPid(timedMetadataPid);
        return this;
    }

    /**
     * @param videoPid
     */

    public void setVideoPid(Integer videoPid) {
        this.videoPid = videoPid;
    }

    /**
     * @return
     */

    public Integer getVideoPid() {
        return this.videoPid;
    }

    /**
     * @param videoPid
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexProgramPacketIdentifiersMap withVideoPid(Integer videoPid) {
        setVideoPid(videoPid);
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
        if (getAudioPids() != null)
            sb.append("AudioPids: ").append(getAudioPids()).append(",");
        if (getDvbSubPids() != null)
            sb.append("DvbSubPids: ").append(getDvbSubPids()).append(",");
        if (getDvbTeletextPid() != null)
            sb.append("DvbTeletextPid: ").append(getDvbTeletextPid()).append(",");
        if (getEtvPlatformPid() != null)
            sb.append("EtvPlatformPid: ").append(getEtvPlatformPid()).append(",");
        if (getEtvSignalPid() != null)
            sb.append("EtvSignalPid: ").append(getEtvSignalPid()).append(",");
        if (getKlvDataPids() != null)
            sb.append("KlvDataPids: ").append(getKlvDataPids()).append(",");
        if (getPcrPid() != null)
            sb.append("PcrPid: ").append(getPcrPid()).append(",");
        if (getPmtPid() != null)
            sb.append("PmtPid: ").append(getPmtPid()).append(",");
        if (getPrivateMetadataPid() != null)
            sb.append("PrivateMetadataPid: ").append(getPrivateMetadataPid()).append(",");
        if (getScte27Pids() != null)
            sb.append("Scte27Pids: ").append(getScte27Pids()).append(",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: ").append(getScte35Pid()).append(",");
        if (getTimedMetadataPid() != null)
            sb.append("TimedMetadataPid: ").append(getTimedMetadataPid()).append(",");
        if (getVideoPid() != null)
            sb.append("VideoPid: ").append(getVideoPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexProgramPacketIdentifiersMap == false)
            return false;
        MultiplexProgramPacketIdentifiersMap other = (MultiplexProgramPacketIdentifiersMap) obj;
        if (other.getAudioPids() == null ^ this.getAudioPids() == null)
            return false;
        if (other.getAudioPids() != null && other.getAudioPids().equals(this.getAudioPids()) == false)
            return false;
        if (other.getDvbSubPids() == null ^ this.getDvbSubPids() == null)
            return false;
        if (other.getDvbSubPids() != null && other.getDvbSubPids().equals(this.getDvbSubPids()) == false)
            return false;
        if (other.getDvbTeletextPid() == null ^ this.getDvbTeletextPid() == null)
            return false;
        if (other.getDvbTeletextPid() != null && other.getDvbTeletextPid().equals(this.getDvbTeletextPid()) == false)
            return false;
        if (other.getEtvPlatformPid() == null ^ this.getEtvPlatformPid() == null)
            return false;
        if (other.getEtvPlatformPid() != null && other.getEtvPlatformPid().equals(this.getEtvPlatformPid()) == false)
            return false;
        if (other.getEtvSignalPid() == null ^ this.getEtvSignalPid() == null)
            return false;
        if (other.getEtvSignalPid() != null && other.getEtvSignalPid().equals(this.getEtvSignalPid()) == false)
            return false;
        if (other.getKlvDataPids() == null ^ this.getKlvDataPids() == null)
            return false;
        if (other.getKlvDataPids() != null && other.getKlvDataPids().equals(this.getKlvDataPids()) == false)
            return false;
        if (other.getPcrPid() == null ^ this.getPcrPid() == null)
            return false;
        if (other.getPcrPid() != null && other.getPcrPid().equals(this.getPcrPid()) == false)
            return false;
        if (other.getPmtPid() == null ^ this.getPmtPid() == null)
            return false;
        if (other.getPmtPid() != null && other.getPmtPid().equals(this.getPmtPid()) == false)
            return false;
        if (other.getPrivateMetadataPid() == null ^ this.getPrivateMetadataPid() == null)
            return false;
        if (other.getPrivateMetadataPid() != null && other.getPrivateMetadataPid().equals(this.getPrivateMetadataPid()) == false)
            return false;
        if (other.getScte27Pids() == null ^ this.getScte27Pids() == null)
            return false;
        if (other.getScte27Pids() != null && other.getScte27Pids().equals(this.getScte27Pids()) == false)
            return false;
        if (other.getScte35Pid() == null ^ this.getScte35Pid() == null)
            return false;
        if (other.getScte35Pid() != null && other.getScte35Pid().equals(this.getScte35Pid()) == false)
            return false;
        if (other.getTimedMetadataPid() == null ^ this.getTimedMetadataPid() == null)
            return false;
        if (other.getTimedMetadataPid() != null && other.getTimedMetadataPid().equals(this.getTimedMetadataPid()) == false)
            return false;
        if (other.getVideoPid() == null ^ this.getVideoPid() == null)
            return false;
        if (other.getVideoPid() != null && other.getVideoPid().equals(this.getVideoPid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioPids() == null) ? 0 : getAudioPids().hashCode());
        hashCode = prime * hashCode + ((getDvbSubPids() == null) ? 0 : getDvbSubPids().hashCode());
        hashCode = prime * hashCode + ((getDvbTeletextPid() == null) ? 0 : getDvbTeletextPid().hashCode());
        hashCode = prime * hashCode + ((getEtvPlatformPid() == null) ? 0 : getEtvPlatformPid().hashCode());
        hashCode = prime * hashCode + ((getEtvSignalPid() == null) ? 0 : getEtvSignalPid().hashCode());
        hashCode = prime * hashCode + ((getKlvDataPids() == null) ? 0 : getKlvDataPids().hashCode());
        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode + ((getPmtPid() == null) ? 0 : getPmtPid().hashCode());
        hashCode = prime * hashCode + ((getPrivateMetadataPid() == null) ? 0 : getPrivateMetadataPid().hashCode());
        hashCode = prime * hashCode + ((getScte27Pids() == null) ? 0 : getScte27Pids().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataPid() == null) ? 0 : getTimedMetadataPid().hashCode());
        hashCode = prime * hashCode + ((getVideoPid() == null) ? 0 : getVideoPid().hashCode());
        return hashCode;
    }

    @Override
    public MultiplexProgramPacketIdentifiersMap clone() {
        try {
            return (MultiplexProgramPacketIdentifiersMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MultiplexProgramPacketIdentifiersMapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
