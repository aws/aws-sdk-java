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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the server configured for source code analysis.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/RemoteSourceCodeAnalysisServerInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoteSourceCodeAnalysisServerInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the remote source code server was configured.
     * </p>
     */
    private String remoteSourceCodeAnalysisServerConfigurationTimestamp;

    /**
     * <p>
     * The time when the remote source code server was configured.
     * </p>
     * 
     * @param remoteSourceCodeAnalysisServerConfigurationTimestamp
     *        The time when the remote source code server was configured.
     */

    public void setRemoteSourceCodeAnalysisServerConfigurationTimestamp(String remoteSourceCodeAnalysisServerConfigurationTimestamp) {
        this.remoteSourceCodeAnalysisServerConfigurationTimestamp = remoteSourceCodeAnalysisServerConfigurationTimestamp;
    }

    /**
     * <p>
     * The time when the remote source code server was configured.
     * </p>
     * 
     * @return The time when the remote source code server was configured.
     */

    public String getRemoteSourceCodeAnalysisServerConfigurationTimestamp() {
        return this.remoteSourceCodeAnalysisServerConfigurationTimestamp;
    }

    /**
     * <p>
     * The time when the remote source code server was configured.
     * </p>
     * 
     * @param remoteSourceCodeAnalysisServerConfigurationTimestamp
     *        The time when the remote source code server was configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteSourceCodeAnalysisServerInfo withRemoteSourceCodeAnalysisServerConfigurationTimestamp(
            String remoteSourceCodeAnalysisServerConfigurationTimestamp) {
        setRemoteSourceCodeAnalysisServerConfigurationTimestamp(remoteSourceCodeAnalysisServerConfigurationTimestamp);
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
        if (getRemoteSourceCodeAnalysisServerConfigurationTimestamp() != null)
            sb.append("RemoteSourceCodeAnalysisServerConfigurationTimestamp: ").append(getRemoteSourceCodeAnalysisServerConfigurationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoteSourceCodeAnalysisServerInfo == false)
            return false;
        RemoteSourceCodeAnalysisServerInfo other = (RemoteSourceCodeAnalysisServerInfo) obj;
        if (other.getRemoteSourceCodeAnalysisServerConfigurationTimestamp() == null ^ this.getRemoteSourceCodeAnalysisServerConfigurationTimestamp() == null)
            return false;
        if (other.getRemoteSourceCodeAnalysisServerConfigurationTimestamp() != null
                && other.getRemoteSourceCodeAnalysisServerConfigurationTimestamp().equals(this.getRemoteSourceCodeAnalysisServerConfigurationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRemoteSourceCodeAnalysisServerConfigurationTimestamp() == null) ? 0 : getRemoteSourceCodeAnalysisServerConfigurationTimestamp()
                        .hashCode());
        return hashCode;
    }

    @Override
    public RemoteSourceCodeAnalysisServerInfo clone() {
        try {
            return (RemoteSourceCodeAnalysisServerInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.RemoteSourceCodeAnalysisServerInfoMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
