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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a large-scale assessment (LSA) analysis run by a Fleet Advisor collector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/FleetAdvisorLsaAnalysisResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetAdvisorLsaAnalysisResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an LSA analysis run by a Fleet Advisor collector.
     * </p>
     */
    private String lsaAnalysisId;
    /**
     * <p>
     * The status of an LSA analysis run by a Fleet Advisor collector.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of an LSA analysis run by a Fleet Advisor collector.
     * </p>
     * 
     * @param lsaAnalysisId
     *        The ID of an LSA analysis run by a Fleet Advisor collector.
     */

    public void setLsaAnalysisId(String lsaAnalysisId) {
        this.lsaAnalysisId = lsaAnalysisId;
    }

    /**
     * <p>
     * The ID of an LSA analysis run by a Fleet Advisor collector.
     * </p>
     * 
     * @return The ID of an LSA analysis run by a Fleet Advisor collector.
     */

    public String getLsaAnalysisId() {
        return this.lsaAnalysisId;
    }

    /**
     * <p>
     * The ID of an LSA analysis run by a Fleet Advisor collector.
     * </p>
     * 
     * @param lsaAnalysisId
     *        The ID of an LSA analysis run by a Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAdvisorLsaAnalysisResponse withLsaAnalysisId(String lsaAnalysisId) {
        setLsaAnalysisId(lsaAnalysisId);
        return this;
    }

    /**
     * <p>
     * The status of an LSA analysis run by a Fleet Advisor collector.
     * </p>
     * 
     * @param status
     *        The status of an LSA analysis run by a Fleet Advisor collector.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an LSA analysis run by a Fleet Advisor collector.
     * </p>
     * 
     * @return The status of an LSA analysis run by a Fleet Advisor collector.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an LSA analysis run by a Fleet Advisor collector.
     * </p>
     * 
     * @param status
     *        The status of an LSA analysis run by a Fleet Advisor collector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAdvisorLsaAnalysisResponse withStatus(String status) {
        setStatus(status);
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
        if (getLsaAnalysisId() != null)
            sb.append("LsaAnalysisId: ").append(getLsaAnalysisId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetAdvisorLsaAnalysisResponse == false)
            return false;
        FleetAdvisorLsaAnalysisResponse other = (FleetAdvisorLsaAnalysisResponse) obj;
        if (other.getLsaAnalysisId() == null ^ this.getLsaAnalysisId() == null)
            return false;
        if (other.getLsaAnalysisId() != null && other.getLsaAnalysisId().equals(this.getLsaAnalysisId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLsaAnalysisId() == null) ? 0 : getLsaAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public FleetAdvisorLsaAnalysisResponse clone() {
        try {
            return (FleetAdvisorLsaAnalysisResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.FleetAdvisorLsaAnalysisResponseMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
