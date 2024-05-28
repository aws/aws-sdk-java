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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information provided by DataSync Discovery about the resources in your on-premises storage system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ResourceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises
     * storage system.
     * </p>
     */
    private java.util.List<NetAppONTAPSVM> netAppONTAPSVMs;
    /**
     * <p>
     * The information that DataSync Discovery collects about volumes in your on-premises storage system.
     * </p>
     */
    private java.util.List<NetAppONTAPVolume> netAppONTAPVolumes;
    /**
     * <p>
     * The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     * </p>
     */
    private java.util.List<NetAppONTAPCluster> netAppONTAPClusters;

    /**
     * <p>
     * The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises
     * storage system.
     * </p>
     * 
     * @return The information that DataSync Discovery collects about storage virtual machines (SVMs) in your
     *         on-premises storage system.
     */

    public java.util.List<NetAppONTAPSVM> getNetAppONTAPSVMs() {
        return netAppONTAPSVMs;
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises
     * storage system.
     * </p>
     * 
     * @param netAppONTAPSVMs
     *        The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises
     *        storage system.
     */

    public void setNetAppONTAPSVMs(java.util.Collection<NetAppONTAPSVM> netAppONTAPSVMs) {
        if (netAppONTAPSVMs == null) {
            this.netAppONTAPSVMs = null;
            return;
        }

        this.netAppONTAPSVMs = new java.util.ArrayList<NetAppONTAPSVM>(netAppONTAPSVMs);
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises
     * storage system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetAppONTAPSVMs(java.util.Collection)} or {@link #withNetAppONTAPSVMs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param netAppONTAPSVMs
     *        The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises
     *        storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withNetAppONTAPSVMs(NetAppONTAPSVM... netAppONTAPSVMs) {
        if (this.netAppONTAPSVMs == null) {
            setNetAppONTAPSVMs(new java.util.ArrayList<NetAppONTAPSVM>(netAppONTAPSVMs.length));
        }
        for (NetAppONTAPSVM ele : netAppONTAPSVMs) {
            this.netAppONTAPSVMs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises
     * storage system.
     * </p>
     * 
     * @param netAppONTAPSVMs
     *        The information that DataSync Discovery collects about storage virtual machines (SVMs) in your on-premises
     *        storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withNetAppONTAPSVMs(java.util.Collection<NetAppONTAPSVM> netAppONTAPSVMs) {
        setNetAppONTAPSVMs(netAppONTAPSVMs);
        return this;
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about volumes in your on-premises storage system.
     * </p>
     * 
     * @return The information that DataSync Discovery collects about volumes in your on-premises storage system.
     */

    public java.util.List<NetAppONTAPVolume> getNetAppONTAPVolumes() {
        return netAppONTAPVolumes;
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about volumes in your on-premises storage system.
     * </p>
     * 
     * @param netAppONTAPVolumes
     *        The information that DataSync Discovery collects about volumes in your on-premises storage system.
     */

    public void setNetAppONTAPVolumes(java.util.Collection<NetAppONTAPVolume> netAppONTAPVolumes) {
        if (netAppONTAPVolumes == null) {
            this.netAppONTAPVolumes = null;
            return;
        }

        this.netAppONTAPVolumes = new java.util.ArrayList<NetAppONTAPVolume>(netAppONTAPVolumes);
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about volumes in your on-premises storage system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetAppONTAPVolumes(java.util.Collection)} or {@link #withNetAppONTAPVolumes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param netAppONTAPVolumes
     *        The information that DataSync Discovery collects about volumes in your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withNetAppONTAPVolumes(NetAppONTAPVolume... netAppONTAPVolumes) {
        if (this.netAppONTAPVolumes == null) {
            setNetAppONTAPVolumes(new java.util.ArrayList<NetAppONTAPVolume>(netAppONTAPVolumes.length));
        }
        for (NetAppONTAPVolume ele : netAppONTAPVolumes) {
            this.netAppONTAPVolumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about volumes in your on-premises storage system.
     * </p>
     * 
     * @param netAppONTAPVolumes
     *        The information that DataSync Discovery collects about volumes in your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withNetAppONTAPVolumes(java.util.Collection<NetAppONTAPVolume> netAppONTAPVolumes) {
        setNetAppONTAPVolumes(netAppONTAPVolumes);
        return this;
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     * </p>
     * 
     * @return The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     */

    public java.util.List<NetAppONTAPCluster> getNetAppONTAPClusters() {
        return netAppONTAPClusters;
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     * </p>
     * 
     * @param netAppONTAPClusters
     *        The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     */

    public void setNetAppONTAPClusters(java.util.Collection<NetAppONTAPCluster> netAppONTAPClusters) {
        if (netAppONTAPClusters == null) {
            this.netAppONTAPClusters = null;
            return;
        }

        this.netAppONTAPClusters = new java.util.ArrayList<NetAppONTAPCluster>(netAppONTAPClusters);
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetAppONTAPClusters(java.util.Collection)} or {@link #withNetAppONTAPClusters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param netAppONTAPClusters
     *        The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withNetAppONTAPClusters(NetAppONTAPCluster... netAppONTAPClusters) {
        if (this.netAppONTAPClusters == null) {
            setNetAppONTAPClusters(new java.util.ArrayList<NetAppONTAPCluster>(netAppONTAPClusters.length));
        }
        for (NetAppONTAPCluster ele : netAppONTAPClusters) {
            this.netAppONTAPClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     * </p>
     * 
     * @param netAppONTAPClusters
     *        The information that DataSync Discovery collects about the cluster in your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withNetAppONTAPClusters(java.util.Collection<NetAppONTAPCluster> netAppONTAPClusters) {
        setNetAppONTAPClusters(netAppONTAPClusters);
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
        if (getNetAppONTAPSVMs() != null)
            sb.append("NetAppONTAPSVMs: ").append(getNetAppONTAPSVMs()).append(",");
        if (getNetAppONTAPVolumes() != null)
            sb.append("NetAppONTAPVolumes: ").append(getNetAppONTAPVolumes()).append(",");
        if (getNetAppONTAPClusters() != null)
            sb.append("NetAppONTAPClusters: ").append(getNetAppONTAPClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;
        if (other.getNetAppONTAPSVMs() == null ^ this.getNetAppONTAPSVMs() == null)
            return false;
        if (other.getNetAppONTAPSVMs() != null && other.getNetAppONTAPSVMs().equals(this.getNetAppONTAPSVMs()) == false)
            return false;
        if (other.getNetAppONTAPVolumes() == null ^ this.getNetAppONTAPVolumes() == null)
            return false;
        if (other.getNetAppONTAPVolumes() != null && other.getNetAppONTAPVolumes().equals(this.getNetAppONTAPVolumes()) == false)
            return false;
        if (other.getNetAppONTAPClusters() == null ^ this.getNetAppONTAPClusters() == null)
            return false;
        if (other.getNetAppONTAPClusters() != null && other.getNetAppONTAPClusters().equals(this.getNetAppONTAPClusters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetAppONTAPSVMs() == null) ? 0 : getNetAppONTAPSVMs().hashCode());
        hashCode = prime * hashCode + ((getNetAppONTAPVolumes() == null) ? 0 : getNetAppONTAPVolumes().hashCode());
        hashCode = prime * hashCode + ((getNetAppONTAPClusters() == null) ? 0 : getNetAppONTAPClusters().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetails clone() {
        try {
            return (ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
