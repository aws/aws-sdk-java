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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for an Clean Rooms protected query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for a protected query instance.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier for the membership.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The ARN of the membership.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The time at which the protected query was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The protected query SQL parameters.
     * </p>
     */
    private ProtectedQuerySQLParameters sqlParameters;
    /**
     * <p>
     * The status of the query.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Contains any details needed to write the query results.
     * </p>
     */
    private ProtectedQueryResultConfiguration resultConfiguration;
    /**
     * <p>
     * Statistics about protected query execution.
     * </p>
     */
    private ProtectedQueryStatistics statistics;
    /**
     * <p>
     * The result of the protected query.
     * </p>
     */
    private ProtectedQueryResult result;
    /**
     * <p>
     * An error thrown by the protected query.
     * </p>
     */
    private ProtectedQueryError error;
    /**
     * <p>
     * The sensitivity parameters of the differential privacy results of the protected query.
     * </p>
     */
    private DifferentialPrivacyParameters differentialPrivacy;

    /**
     * <p>
     * The identifier for a protected query instance.
     * </p>
     * 
     * @param id
     *        The identifier for a protected query instance.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for a protected query instance.
     * </p>
     * 
     * @return The identifier for a protected query instance.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for a protected query instance.
     * </p>
     * 
     * @param id
     *        The identifier for a protected query instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier for the membership.
     * </p>
     * 
     * @param membershipId
     *        The identifier for the membership.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The identifier for the membership.
     * </p>
     * 
     * @return The identifier for the membership.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The identifier for the membership.
     * </p>
     * 
     * @param membershipId
     *        The identifier for the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The ARN of the membership.
     * </p>
     * 
     * @param membershipArn
     *        The ARN of the membership.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The ARN of the membership.
     * </p>
     * 
     * @return The ARN of the membership.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The ARN of the membership.
     * </p>
     * 
     * @param membershipArn
     *        The ARN of the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The time at which the protected query was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the protected query was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the protected query was created.
     * </p>
     * 
     * @return The time at which the protected query was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the protected query was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the protected query was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The protected query SQL parameters.
     * </p>
     * 
     * @param sqlParameters
     *        The protected query SQL parameters.
     */

    public void setSqlParameters(ProtectedQuerySQLParameters sqlParameters) {
        this.sqlParameters = sqlParameters;
    }

    /**
     * <p>
     * The protected query SQL parameters.
     * </p>
     * 
     * @return The protected query SQL parameters.
     */

    public ProtectedQuerySQLParameters getSqlParameters() {
        return this.sqlParameters;
    }

    /**
     * <p>
     * The protected query SQL parameters.
     * </p>
     * 
     * @param sqlParameters
     *        The protected query SQL parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withSqlParameters(ProtectedQuerySQLParameters sqlParameters) {
        setSqlParameters(sqlParameters);
        return this;
    }

    /**
     * <p>
     * The status of the query.
     * </p>
     * 
     * @param status
     *        The status of the query.
     * @see ProtectedQueryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the query.
     * </p>
     * 
     * @return The status of the query.
     * @see ProtectedQueryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the query.
     * </p>
     * 
     * @param status
     *        The status of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedQueryStatus
     */

    public ProtectedQuery withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the query.
     * </p>
     * 
     * @param status
     *        The status of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedQueryStatus
     */

    public ProtectedQuery withStatus(ProtectedQueryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Contains any details needed to write the query results.
     * </p>
     * 
     * @param resultConfiguration
     *        Contains any details needed to write the query results.
     */

    public void setResultConfiguration(ProtectedQueryResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * Contains any details needed to write the query results.
     * </p>
     * 
     * @return Contains any details needed to write the query results.
     */

    public ProtectedQueryResultConfiguration getResultConfiguration() {
        return this.resultConfiguration;
    }

    /**
     * <p>
     * Contains any details needed to write the query results.
     * </p>
     * 
     * @param resultConfiguration
     *        Contains any details needed to write the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withResultConfiguration(ProtectedQueryResultConfiguration resultConfiguration) {
        setResultConfiguration(resultConfiguration);
        return this;
    }

    /**
     * <p>
     * Statistics about protected query execution.
     * </p>
     * 
     * @param statistics
     *        Statistics about protected query execution.
     */

    public void setStatistics(ProtectedQueryStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Statistics about protected query execution.
     * </p>
     * 
     * @return Statistics about protected query execution.
     */

    public ProtectedQueryStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Statistics about protected query execution.
     * </p>
     * 
     * @param statistics
     *        Statistics about protected query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withStatistics(ProtectedQueryStatistics statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The result of the protected query.
     * </p>
     * 
     * @param result
     *        The result of the protected query.
     */

    public void setResult(ProtectedQueryResult result) {
        this.result = result;
    }

    /**
     * <p>
     * The result of the protected query.
     * </p>
     * 
     * @return The result of the protected query.
     */

    public ProtectedQueryResult getResult() {
        return this.result;
    }

    /**
     * <p>
     * The result of the protected query.
     * </p>
     * 
     * @param result
     *        The result of the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withResult(ProtectedQueryResult result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * An error thrown by the protected query.
     * </p>
     * 
     * @param error
     *        An error thrown by the protected query.
     */

    public void setError(ProtectedQueryError error) {
        this.error = error;
    }

    /**
     * <p>
     * An error thrown by the protected query.
     * </p>
     * 
     * @return An error thrown by the protected query.
     */

    public ProtectedQueryError getError() {
        return this.error;
    }

    /**
     * <p>
     * An error thrown by the protected query.
     * </p>
     * 
     * @param error
     *        An error thrown by the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withError(ProtectedQueryError error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The sensitivity parameters of the differential privacy results of the protected query.
     * </p>
     * 
     * @param differentialPrivacy
     *        The sensitivity parameters of the differential privacy results of the protected query.
     */

    public void setDifferentialPrivacy(DifferentialPrivacyParameters differentialPrivacy) {
        this.differentialPrivacy = differentialPrivacy;
    }

    /**
     * <p>
     * The sensitivity parameters of the differential privacy results of the protected query.
     * </p>
     * 
     * @return The sensitivity parameters of the differential privacy results of the protected query.
     */

    public DifferentialPrivacyParameters getDifferentialPrivacy() {
        return this.differentialPrivacy;
    }

    /**
     * <p>
     * The sensitivity parameters of the differential privacy results of the protected query.
     * </p>
     * 
     * @param differentialPrivacy
     *        The sensitivity parameters of the differential privacy results of the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuery withDifferentialPrivacy(DifferentialPrivacyParameters differentialPrivacy) {
        setDifferentialPrivacy(differentialPrivacy);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getSqlParameters() != null)
            sb.append("SqlParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: ").append(getResultConfiguration()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getDifferentialPrivacy() != null)
            sb.append("DifferentialPrivacy: ").append(getDifferentialPrivacy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedQuery == false)
            return false;
        ProtectedQuery other = (ProtectedQuery) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getSqlParameters() == null ^ this.getSqlParameters() == null)
            return false;
        if (other.getSqlParameters() != null && other.getSqlParameters().equals(this.getSqlParameters()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getDifferentialPrivacy() == null ^ this.getDifferentialPrivacy() == null)
            return false;
        if (other.getDifferentialPrivacy() != null && other.getDifferentialPrivacy().equals(this.getDifferentialPrivacy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getSqlParameters() == null) ? 0 : getSqlParameters().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getDifferentialPrivacy() == null) ? 0 : getDifferentialPrivacy().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQuery clone() {
        try {
            return (ProtectedQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
