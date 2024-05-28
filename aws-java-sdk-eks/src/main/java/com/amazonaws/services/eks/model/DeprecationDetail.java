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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary information about deprecated resource usage for an insight check in the <code>UPGRADE_READINESS</code>
 * category.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeprecationDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprecationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The deprecated version of the resource.
     * </p>
     */
    private String usage;
    /**
     * <p>
     * The newer version of the resource to migrate to if applicable.
     * </p>
     */
    private String replacedWith;
    /**
     * <p>
     * The version of the software where the deprecated resource version will stop being served.
     * </p>
     */
    private String stopServingVersion;
    /**
     * <p>
     * The version of the software where the newer resource version became available to migrate to if applicable.
     * </p>
     */
    private String startServingReplacementVersion;
    /**
     * <p>
     * Details about Kubernetes clients using the deprecated resources.
     * </p>
     */
    private java.util.List<ClientStat> clientStats;

    /**
     * <p>
     * The deprecated version of the resource.
     * </p>
     * 
     * @param usage
     *        The deprecated version of the resource.
     */

    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * <p>
     * The deprecated version of the resource.
     * </p>
     * 
     * @return The deprecated version of the resource.
     */

    public String getUsage() {
        return this.usage;
    }

    /**
     * <p>
     * The deprecated version of the resource.
     * </p>
     * 
     * @param usage
     *        The deprecated version of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecationDetail withUsage(String usage) {
        setUsage(usage);
        return this;
    }

    /**
     * <p>
     * The newer version of the resource to migrate to if applicable.
     * </p>
     * 
     * @param replacedWith
     *        The newer version of the resource to migrate to if applicable.
     */

    public void setReplacedWith(String replacedWith) {
        this.replacedWith = replacedWith;
    }

    /**
     * <p>
     * The newer version of the resource to migrate to if applicable.
     * </p>
     * 
     * @return The newer version of the resource to migrate to if applicable.
     */

    public String getReplacedWith() {
        return this.replacedWith;
    }

    /**
     * <p>
     * The newer version of the resource to migrate to if applicable.
     * </p>
     * 
     * @param replacedWith
     *        The newer version of the resource to migrate to if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecationDetail withReplacedWith(String replacedWith) {
        setReplacedWith(replacedWith);
        return this;
    }

    /**
     * <p>
     * The version of the software where the deprecated resource version will stop being served.
     * </p>
     * 
     * @param stopServingVersion
     *        The version of the software where the deprecated resource version will stop being served.
     */

    public void setStopServingVersion(String stopServingVersion) {
        this.stopServingVersion = stopServingVersion;
    }

    /**
     * <p>
     * The version of the software where the deprecated resource version will stop being served.
     * </p>
     * 
     * @return The version of the software where the deprecated resource version will stop being served.
     */

    public String getStopServingVersion() {
        return this.stopServingVersion;
    }

    /**
     * <p>
     * The version of the software where the deprecated resource version will stop being served.
     * </p>
     * 
     * @param stopServingVersion
     *        The version of the software where the deprecated resource version will stop being served.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecationDetail withStopServingVersion(String stopServingVersion) {
        setStopServingVersion(stopServingVersion);
        return this;
    }

    /**
     * <p>
     * The version of the software where the newer resource version became available to migrate to if applicable.
     * </p>
     * 
     * @param startServingReplacementVersion
     *        The version of the software where the newer resource version became available to migrate to if applicable.
     */

    public void setStartServingReplacementVersion(String startServingReplacementVersion) {
        this.startServingReplacementVersion = startServingReplacementVersion;
    }

    /**
     * <p>
     * The version of the software where the newer resource version became available to migrate to if applicable.
     * </p>
     * 
     * @return The version of the software where the newer resource version became available to migrate to if
     *         applicable.
     */

    public String getStartServingReplacementVersion() {
        return this.startServingReplacementVersion;
    }

    /**
     * <p>
     * The version of the software where the newer resource version became available to migrate to if applicable.
     * </p>
     * 
     * @param startServingReplacementVersion
     *        The version of the software where the newer resource version became available to migrate to if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecationDetail withStartServingReplacementVersion(String startServingReplacementVersion) {
        setStartServingReplacementVersion(startServingReplacementVersion);
        return this;
    }

    /**
     * <p>
     * Details about Kubernetes clients using the deprecated resources.
     * </p>
     * 
     * @return Details about Kubernetes clients using the deprecated resources.
     */

    public java.util.List<ClientStat> getClientStats() {
        return clientStats;
    }

    /**
     * <p>
     * Details about Kubernetes clients using the deprecated resources.
     * </p>
     * 
     * @param clientStats
     *        Details about Kubernetes clients using the deprecated resources.
     */

    public void setClientStats(java.util.Collection<ClientStat> clientStats) {
        if (clientStats == null) {
            this.clientStats = null;
            return;
        }

        this.clientStats = new java.util.ArrayList<ClientStat>(clientStats);
    }

    /**
     * <p>
     * Details about Kubernetes clients using the deprecated resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientStats(java.util.Collection)} or {@link #withClientStats(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clientStats
     *        Details about Kubernetes clients using the deprecated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecationDetail withClientStats(ClientStat... clientStats) {
        if (this.clientStats == null) {
            setClientStats(new java.util.ArrayList<ClientStat>(clientStats.length));
        }
        for (ClientStat ele : clientStats) {
            this.clientStats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about Kubernetes clients using the deprecated resources.
     * </p>
     * 
     * @param clientStats
     *        Details about Kubernetes clients using the deprecated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecationDetail withClientStats(java.util.Collection<ClientStat> clientStats) {
        setClientStats(clientStats);
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
        if (getUsage() != null)
            sb.append("Usage: ").append(getUsage()).append(",");
        if (getReplacedWith() != null)
            sb.append("ReplacedWith: ").append(getReplacedWith()).append(",");
        if (getStopServingVersion() != null)
            sb.append("StopServingVersion: ").append(getStopServingVersion()).append(",");
        if (getStartServingReplacementVersion() != null)
            sb.append("StartServingReplacementVersion: ").append(getStartServingReplacementVersion()).append(",");
        if (getClientStats() != null)
            sb.append("ClientStats: ").append(getClientStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeprecationDetail == false)
            return false;
        DeprecationDetail other = (DeprecationDetail) obj;
        if (other.getUsage() == null ^ this.getUsage() == null)
            return false;
        if (other.getUsage() != null && other.getUsage().equals(this.getUsage()) == false)
            return false;
        if (other.getReplacedWith() == null ^ this.getReplacedWith() == null)
            return false;
        if (other.getReplacedWith() != null && other.getReplacedWith().equals(this.getReplacedWith()) == false)
            return false;
        if (other.getStopServingVersion() == null ^ this.getStopServingVersion() == null)
            return false;
        if (other.getStopServingVersion() != null && other.getStopServingVersion().equals(this.getStopServingVersion()) == false)
            return false;
        if (other.getStartServingReplacementVersion() == null ^ this.getStartServingReplacementVersion() == null)
            return false;
        if (other.getStartServingReplacementVersion() != null
                && other.getStartServingReplacementVersion().equals(this.getStartServingReplacementVersion()) == false)
            return false;
        if (other.getClientStats() == null ^ this.getClientStats() == null)
            return false;
        if (other.getClientStats() != null && other.getClientStats().equals(this.getClientStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsage() == null) ? 0 : getUsage().hashCode());
        hashCode = prime * hashCode + ((getReplacedWith() == null) ? 0 : getReplacedWith().hashCode());
        hashCode = prime * hashCode + ((getStopServingVersion() == null) ? 0 : getStopServingVersion().hashCode());
        hashCode = prime * hashCode + ((getStartServingReplacementVersion() == null) ? 0 : getStartServingReplacementVersion().hashCode());
        hashCode = prime * hashCode + ((getClientStats() == null) ? 0 : getClientStats().hashCode());
        return hashCode;
    }

    @Override
    public DeprecationDetail clone() {
        try {
            return (DeprecationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.DeprecationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
