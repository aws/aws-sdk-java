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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details tactics, techniques, and procedures (TTPs) used in a potential security event. Tactics are based on <a
 * href="https://attack.mitre.org/matrices/enterprise/">MITRE ATT&amp;CK Matrix for Enterprise</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/TTPsObservedDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TTPsObservedDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tactic used, identified by the investigation.
     * </p>
     */
    private String tactic;
    /**
     * <p>
     * The technique used, identified by the investigation.
     * </p>
     */
    private String technique;
    /**
     * <p>
     * The procedure used, identified by the investigation.
     * </p>
     */
    private String procedure;
    /**
     * <p>
     * The IP address where the tactics, techniques, and procedure (TTP) was observed.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The name of the API where the tactics, techniques, and procedure (TTP) was observed.
     * </p>
     */
    private String aPIName;
    /**
     * <p>
     * The total number of successful API requests.
     * </p>
     */
    private Long aPISuccessCount;
    /**
     * <p>
     * The total number of failed API requests.
     * </p>
     */
    private Long aPIFailureCount;

    /**
     * <p>
     * The tactic used, identified by the investigation.
     * </p>
     * 
     * @param tactic
     *        The tactic used, identified by the investigation.
     */

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }

    /**
     * <p>
     * The tactic used, identified by the investigation.
     * </p>
     * 
     * @return The tactic used, identified by the investigation.
     */

    public String getTactic() {
        return this.tactic;
    }

    /**
     * <p>
     * The tactic used, identified by the investigation.
     * </p>
     * 
     * @param tactic
     *        The tactic used, identified by the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TTPsObservedDetail withTactic(String tactic) {
        setTactic(tactic);
        return this;
    }

    /**
     * <p>
     * The technique used, identified by the investigation.
     * </p>
     * 
     * @param technique
     *        The technique used, identified by the investigation.
     */

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    /**
     * <p>
     * The technique used, identified by the investigation.
     * </p>
     * 
     * @return The technique used, identified by the investigation.
     */

    public String getTechnique() {
        return this.technique;
    }

    /**
     * <p>
     * The technique used, identified by the investigation.
     * </p>
     * 
     * @param technique
     *        The technique used, identified by the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TTPsObservedDetail withTechnique(String technique) {
        setTechnique(technique);
        return this;
    }

    /**
     * <p>
     * The procedure used, identified by the investigation.
     * </p>
     * 
     * @param procedure
     *        The procedure used, identified by the investigation.
     */

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    /**
     * <p>
     * The procedure used, identified by the investigation.
     * </p>
     * 
     * @return The procedure used, identified by the investigation.
     */

    public String getProcedure() {
        return this.procedure;
    }

    /**
     * <p>
     * The procedure used, identified by the investigation.
     * </p>
     * 
     * @param procedure
     *        The procedure used, identified by the investigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TTPsObservedDetail withProcedure(String procedure) {
        setProcedure(procedure);
        return this;
    }

    /**
     * <p>
     * The IP address where the tactics, techniques, and procedure (TTP) was observed.
     * </p>
     * 
     * @param ipAddress
     *        The IP address where the tactics, techniques, and procedure (TTP) was observed.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address where the tactics, techniques, and procedure (TTP) was observed.
     * </p>
     * 
     * @return The IP address where the tactics, techniques, and procedure (TTP) was observed.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address where the tactics, techniques, and procedure (TTP) was observed.
     * </p>
     * 
     * @param ipAddress
     *        The IP address where the tactics, techniques, and procedure (TTP) was observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TTPsObservedDetail withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The name of the API where the tactics, techniques, and procedure (TTP) was observed.
     * </p>
     * 
     * @param aPIName
     *        The name of the API where the tactics, techniques, and procedure (TTP) was observed.
     */

    public void setAPIName(String aPIName) {
        this.aPIName = aPIName;
    }

    /**
     * <p>
     * The name of the API where the tactics, techniques, and procedure (TTP) was observed.
     * </p>
     * 
     * @return The name of the API where the tactics, techniques, and procedure (TTP) was observed.
     */

    public String getAPIName() {
        return this.aPIName;
    }

    /**
     * <p>
     * The name of the API where the tactics, techniques, and procedure (TTP) was observed.
     * </p>
     * 
     * @param aPIName
     *        The name of the API where the tactics, techniques, and procedure (TTP) was observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TTPsObservedDetail withAPIName(String aPIName) {
        setAPIName(aPIName);
        return this;
    }

    /**
     * <p>
     * The total number of successful API requests.
     * </p>
     * 
     * @param aPISuccessCount
     *        The total number of successful API requests.
     */

    public void setAPISuccessCount(Long aPISuccessCount) {
        this.aPISuccessCount = aPISuccessCount;
    }

    /**
     * <p>
     * The total number of successful API requests.
     * </p>
     * 
     * @return The total number of successful API requests.
     */

    public Long getAPISuccessCount() {
        return this.aPISuccessCount;
    }

    /**
     * <p>
     * The total number of successful API requests.
     * </p>
     * 
     * @param aPISuccessCount
     *        The total number of successful API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TTPsObservedDetail withAPISuccessCount(Long aPISuccessCount) {
        setAPISuccessCount(aPISuccessCount);
        return this;
    }

    /**
     * <p>
     * The total number of failed API requests.
     * </p>
     * 
     * @param aPIFailureCount
     *        The total number of failed API requests.
     */

    public void setAPIFailureCount(Long aPIFailureCount) {
        this.aPIFailureCount = aPIFailureCount;
    }

    /**
     * <p>
     * The total number of failed API requests.
     * </p>
     * 
     * @return The total number of failed API requests.
     */

    public Long getAPIFailureCount() {
        return this.aPIFailureCount;
    }

    /**
     * <p>
     * The total number of failed API requests.
     * </p>
     * 
     * @param aPIFailureCount
     *        The total number of failed API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TTPsObservedDetail withAPIFailureCount(Long aPIFailureCount) {
        setAPIFailureCount(aPIFailureCount);
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
        if (getTactic() != null)
            sb.append("Tactic: ").append(getTactic()).append(",");
        if (getTechnique() != null)
            sb.append("Technique: ").append(getTechnique()).append(",");
        if (getProcedure() != null)
            sb.append("Procedure: ").append(getProcedure()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getAPIName() != null)
            sb.append("APIName: ").append(getAPIName()).append(",");
        if (getAPISuccessCount() != null)
            sb.append("APISuccessCount: ").append(getAPISuccessCount()).append(",");
        if (getAPIFailureCount() != null)
            sb.append("APIFailureCount: ").append(getAPIFailureCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TTPsObservedDetail == false)
            return false;
        TTPsObservedDetail other = (TTPsObservedDetail) obj;
        if (other.getTactic() == null ^ this.getTactic() == null)
            return false;
        if (other.getTactic() != null && other.getTactic().equals(this.getTactic()) == false)
            return false;
        if (other.getTechnique() == null ^ this.getTechnique() == null)
            return false;
        if (other.getTechnique() != null && other.getTechnique().equals(this.getTechnique()) == false)
            return false;
        if (other.getProcedure() == null ^ this.getProcedure() == null)
            return false;
        if (other.getProcedure() != null && other.getProcedure().equals(this.getProcedure()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getAPIName() == null ^ this.getAPIName() == null)
            return false;
        if (other.getAPIName() != null && other.getAPIName().equals(this.getAPIName()) == false)
            return false;
        if (other.getAPISuccessCount() == null ^ this.getAPISuccessCount() == null)
            return false;
        if (other.getAPISuccessCount() != null && other.getAPISuccessCount().equals(this.getAPISuccessCount()) == false)
            return false;
        if (other.getAPIFailureCount() == null ^ this.getAPIFailureCount() == null)
            return false;
        if (other.getAPIFailureCount() != null && other.getAPIFailureCount().equals(this.getAPIFailureCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTactic() == null) ? 0 : getTactic().hashCode());
        hashCode = prime * hashCode + ((getTechnique() == null) ? 0 : getTechnique().hashCode());
        hashCode = prime * hashCode + ((getProcedure() == null) ? 0 : getProcedure().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getAPIName() == null) ? 0 : getAPIName().hashCode());
        hashCode = prime * hashCode + ((getAPISuccessCount() == null) ? 0 : getAPISuccessCount().hashCode());
        hashCode = prime * hashCode + ((getAPIFailureCount() == null) ? 0 : getAPIFailureCount().hashCode());
        return hashCode;
    }

    @Override
    public TTPsObservedDetail clone() {
        try {
            return (TTPsObservedDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.TTPsObservedDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
