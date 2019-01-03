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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DestinationBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationBackup implements Serializable, Cloneable, StructuredPojo {

    private java.util.Date createTimestamp;

    private String sourceRegion;

    private String sourceBackup;

    private String sourceCluster;

    /**
     * @param createTimestamp
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @param createTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationBackup withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * @param sourceRegion
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * @return
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @param sourceRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationBackup withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * @param sourceBackup
     */

    public void setSourceBackup(String sourceBackup) {
        this.sourceBackup = sourceBackup;
    }

    /**
     * @return
     */

    public String getSourceBackup() {
        return this.sourceBackup;
    }

    /**
     * @param sourceBackup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationBackup withSourceBackup(String sourceBackup) {
        setSourceBackup(sourceBackup);
        return this;
    }

    /**
     * @param sourceCluster
     */

    public void setSourceCluster(String sourceCluster) {
        this.sourceCluster = sourceCluster;
    }

    /**
     * @return
     */

    public String getSourceCluster() {
        return this.sourceCluster;
    }

    /**
     * @param sourceCluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationBackup withSourceCluster(String sourceCluster) {
        setSourceCluster(sourceCluster);
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
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getSourceBackup() != null)
            sb.append("SourceBackup: ").append(getSourceBackup()).append(",");
        if (getSourceCluster() != null)
            sb.append("SourceCluster: ").append(getSourceCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationBackup == false)
            return false;
        DestinationBackup other = (DestinationBackup) obj;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceBackup() == null ^ this.getSourceBackup() == null)
            return false;
        if (other.getSourceBackup() != null && other.getSourceBackup().equals(this.getSourceBackup()) == false)
            return false;
        if (other.getSourceCluster() == null ^ this.getSourceCluster() == null)
            return false;
        if (other.getSourceCluster() != null && other.getSourceCluster().equals(this.getSourceCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceBackup() == null) ? 0 : getSourceBackup().hashCode());
        hashCode = prime * hashCode + ((getSourceCluster() == null) ? 0 : getSourceCluster().hashCode());
        return hashCode;
    }

    @Override
    public DestinationBackup clone() {
        try {
            return (DestinationBackup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudhsmv2.model.transform.DestinationBackupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
