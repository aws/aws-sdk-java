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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Import task summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ImportTaskSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTaskSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Import task summary applications.
     * </p>
     */
    private ImportTaskSummaryApplications applications;
    /**
     * <p>
     * Import task summary servers.
     * </p>
     */
    private ImportTaskSummaryServers servers;
    /**
     * <p>
     * Import task summary waves.
     * </p>
     */
    private ImportTaskSummaryWaves waves;

    /**
     * <p>
     * Import task summary applications.
     * </p>
     * 
     * @param applications
     *        Import task summary applications.
     */

    public void setApplications(ImportTaskSummaryApplications applications) {
        this.applications = applications;
    }

    /**
     * <p>
     * Import task summary applications.
     * </p>
     * 
     * @return Import task summary applications.
     */

    public ImportTaskSummaryApplications getApplications() {
        return this.applications;
    }

    /**
     * <p>
     * Import task summary applications.
     * </p>
     * 
     * @param applications
     *        Import task summary applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTaskSummary withApplications(ImportTaskSummaryApplications applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * Import task summary servers.
     * </p>
     * 
     * @param servers
     *        Import task summary servers.
     */

    public void setServers(ImportTaskSummaryServers servers) {
        this.servers = servers;
    }

    /**
     * <p>
     * Import task summary servers.
     * </p>
     * 
     * @return Import task summary servers.
     */

    public ImportTaskSummaryServers getServers() {
        return this.servers;
    }

    /**
     * <p>
     * Import task summary servers.
     * </p>
     * 
     * @param servers
     *        Import task summary servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTaskSummary withServers(ImportTaskSummaryServers servers) {
        setServers(servers);
        return this;
    }

    /**
     * <p>
     * Import task summary waves.
     * </p>
     * 
     * @param waves
     *        Import task summary waves.
     */

    public void setWaves(ImportTaskSummaryWaves waves) {
        this.waves = waves;
    }

    /**
     * <p>
     * Import task summary waves.
     * </p>
     * 
     * @return Import task summary waves.
     */

    public ImportTaskSummaryWaves getWaves() {
        return this.waves;
    }

    /**
     * <p>
     * Import task summary waves.
     * </p>
     * 
     * @param waves
     *        Import task summary waves.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTaskSummary withWaves(ImportTaskSummaryWaves waves) {
        setWaves(waves);
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
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
        if (getServers() != null)
            sb.append("Servers: ").append(getServers()).append(",");
        if (getWaves() != null)
            sb.append("Waves: ").append(getWaves());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTaskSummary == false)
            return false;
        ImportTaskSummary other = (ImportTaskSummary) obj;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getServers() == null ^ this.getServers() == null)
            return false;
        if (other.getServers() != null && other.getServers().equals(this.getServers()) == false)
            return false;
        if (other.getWaves() == null ^ this.getWaves() == null)
            return false;
        if (other.getWaves() != null && other.getWaves().equals(this.getWaves()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getServers() == null) ? 0 : getServers().hashCode());
        hashCode = prime * hashCode + ((getWaves() == null) ? 0 : getWaves().hashCode());
        return hashCode;
    }

    @Override
    public ImportTaskSummary clone() {
        try {
            return (ImportTaskSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ImportTaskSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
