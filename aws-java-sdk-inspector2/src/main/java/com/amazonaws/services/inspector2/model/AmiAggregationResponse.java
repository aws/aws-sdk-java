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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A response that contains the results of a finding aggregation by AMI.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AmiAggregationResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmiAggregationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID for the AMI.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The IDs of Amazon EC2 instances using this AMI.
     * </p>
     */
    private Long affectedInstances;
    /**
     * <p>
     * The ID of the AMI that findings were aggregated for.
     * </p>
     */
    private String ami;
    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     */
    private SeverityCounts severityCounts;

    /**
     * <p>
     * The Amazon Web Services account ID for the AMI.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the AMI.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the AMI.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the AMI.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the AMI.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiAggregationResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The IDs of Amazon EC2 instances using this AMI.
     * </p>
     * 
     * @param affectedInstances
     *        The IDs of Amazon EC2 instances using this AMI.
     */

    public void setAffectedInstances(Long affectedInstances) {
        this.affectedInstances = affectedInstances;
    }

    /**
     * <p>
     * The IDs of Amazon EC2 instances using this AMI.
     * </p>
     * 
     * @return The IDs of Amazon EC2 instances using this AMI.
     */

    public Long getAffectedInstances() {
        return this.affectedInstances;
    }

    /**
     * <p>
     * The IDs of Amazon EC2 instances using this AMI.
     * </p>
     * 
     * @param affectedInstances
     *        The IDs of Amazon EC2 instances using this AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiAggregationResponse withAffectedInstances(Long affectedInstances) {
        setAffectedInstances(affectedInstances);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI that findings were aggregated for.
     * </p>
     * 
     * @param ami
     *        The ID of the AMI that findings were aggregated for.
     */

    public void setAmi(String ami) {
        this.ami = ami;
    }

    /**
     * <p>
     * The ID of the AMI that findings were aggregated for.
     * </p>
     * 
     * @return The ID of the AMI that findings were aggregated for.
     */

    public String getAmi() {
        return this.ami;
    }

    /**
     * <p>
     * The ID of the AMI that findings were aggregated for.
     * </p>
     * 
     * @param ami
     *        The ID of the AMI that findings were aggregated for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiAggregationResponse withAmi(String ami) {
        setAmi(ami);
        return this;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that contains the count of matched findings per severity.
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @return An object that contains the count of matched findings per severity.
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * <p>
     * An object that contains the count of matched findings per severity.
     * </p>
     * 
     * @param severityCounts
     *        An object that contains the count of matched findings per severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiAggregationResponse withSeverityCounts(SeverityCounts severityCounts) {
        setSeverityCounts(severityCounts);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAffectedInstances() != null)
            sb.append("AffectedInstances: ").append(getAffectedInstances()).append(",");
        if (getAmi() != null)
            sb.append("Ami: ").append(getAmi()).append(",");
        if (getSeverityCounts() != null)
            sb.append("SeverityCounts: ").append(getSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmiAggregationResponse == false)
            return false;
        AmiAggregationResponse other = (AmiAggregationResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAffectedInstances() == null ^ this.getAffectedInstances() == null)
            return false;
        if (other.getAffectedInstances() != null && other.getAffectedInstances().equals(this.getAffectedInstances()) == false)
            return false;
        if (other.getAmi() == null ^ this.getAmi() == null)
            return false;
        if (other.getAmi() != null && other.getAmi().equals(this.getAmi()) == false)
            return false;
        if (other.getSeverityCounts() == null ^ this.getSeverityCounts() == null)
            return false;
        if (other.getSeverityCounts() != null && other.getSeverityCounts().equals(this.getSeverityCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAffectedInstances() == null) ? 0 : getAffectedInstances().hashCode());
        hashCode = prime * hashCode + ((getAmi() == null) ? 0 : getAmi().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public AmiAggregationResponse clone() {
        try {
            return (AmiAggregationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AmiAggregationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
