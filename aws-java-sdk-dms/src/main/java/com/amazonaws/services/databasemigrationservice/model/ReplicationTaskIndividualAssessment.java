/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information that describes an individual assessment from a premigration assessment run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReplicationTaskIndividualAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTaskIndividualAssessment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of this individual assessment.
     * </p>
     */
    private String replicationTaskIndividualAssessmentArn;
    /**
     * <p>
     * ARN of the premigration assessment run that is created to run this individual assessment.
     * </p>
     */
    private String replicationTaskAssessmentRunArn;
    /**
     * <p>
     * Name of this individual assessment.
     * </p>
     */
    private String individualAssessmentName;
    /**
     * <p>
     * Individual assessment status.
     * </p>
     * <p>
     * This status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"cancelled"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"error"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"passed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"pending"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"running"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Date when this individual assessment was started as part of running the
     * <code>StartReplicationTaskAssessmentRun</code> operation.
     * </p>
     */
    private java.util.Date replicationTaskIndividualAssessmentStartDate;

    /**
     * <p>
     * Amazon Resource Name (ARN) of this individual assessment.
     * </p>
     * 
     * @param replicationTaskIndividualAssessmentArn
     *        Amazon Resource Name (ARN) of this individual assessment.
     */

    public void setReplicationTaskIndividualAssessmentArn(String replicationTaskIndividualAssessmentArn) {
        this.replicationTaskIndividualAssessmentArn = replicationTaskIndividualAssessmentArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of this individual assessment.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of this individual assessment.
     */

    public String getReplicationTaskIndividualAssessmentArn() {
        return this.replicationTaskIndividualAssessmentArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of this individual assessment.
     * </p>
     * 
     * @param replicationTaskIndividualAssessmentArn
     *        Amazon Resource Name (ARN) of this individual assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskIndividualAssessment withReplicationTaskIndividualAssessmentArn(String replicationTaskIndividualAssessmentArn) {
        setReplicationTaskIndividualAssessmentArn(replicationTaskIndividualAssessmentArn);
        return this;
    }

    /**
     * <p>
     * ARN of the premigration assessment run that is created to run this individual assessment.
     * </p>
     * 
     * @param replicationTaskAssessmentRunArn
     *        ARN of the premigration assessment run that is created to run this individual assessment.
     */

    public void setReplicationTaskAssessmentRunArn(String replicationTaskAssessmentRunArn) {
        this.replicationTaskAssessmentRunArn = replicationTaskAssessmentRunArn;
    }

    /**
     * <p>
     * ARN of the premigration assessment run that is created to run this individual assessment.
     * </p>
     * 
     * @return ARN of the premigration assessment run that is created to run this individual assessment.
     */

    public String getReplicationTaskAssessmentRunArn() {
        return this.replicationTaskAssessmentRunArn;
    }

    /**
     * <p>
     * ARN of the premigration assessment run that is created to run this individual assessment.
     * </p>
     * 
     * @param replicationTaskAssessmentRunArn
     *        ARN of the premigration assessment run that is created to run this individual assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskIndividualAssessment withReplicationTaskAssessmentRunArn(String replicationTaskAssessmentRunArn) {
        setReplicationTaskAssessmentRunArn(replicationTaskAssessmentRunArn);
        return this;
    }

    /**
     * <p>
     * Name of this individual assessment.
     * </p>
     * 
     * @param individualAssessmentName
     *        Name of this individual assessment.
     */

    public void setIndividualAssessmentName(String individualAssessmentName) {
        this.individualAssessmentName = individualAssessmentName;
    }

    /**
     * <p>
     * Name of this individual assessment.
     * </p>
     * 
     * @return Name of this individual assessment.
     */

    public String getIndividualAssessmentName() {
        return this.individualAssessmentName;
    }

    /**
     * <p>
     * Name of this individual assessment.
     * </p>
     * 
     * @param individualAssessmentName
     *        Name of this individual assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskIndividualAssessment withIndividualAssessmentName(String individualAssessmentName) {
        setIndividualAssessmentName(individualAssessmentName);
        return this;
    }

    /**
     * <p>
     * Individual assessment status.
     * </p>
     * <p>
     * This status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"cancelled"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"error"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"passed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"pending"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"running"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Individual assessment status.</p>
     *        <p>
     *        This status can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"cancelled"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"error"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"failed"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"passed"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"pending"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"running"</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Individual assessment status.
     * </p>
     * <p>
     * This status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"cancelled"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"error"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"passed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"pending"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"running"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Individual assessment status.</p>
     *         <p>
     *         This status can have one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"cancelled"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"error"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"failed"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"passed"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"pending"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"running"</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Individual assessment status.
     * </p>
     * <p>
     * This status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"cancelled"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"error"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"passed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"pending"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"running"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Individual assessment status.</p>
     *        <p>
     *        This status can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"cancelled"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"error"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"failed"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"passed"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"pending"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"running"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskIndividualAssessment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Date when this individual assessment was started as part of running the
     * <code>StartReplicationTaskAssessmentRun</code> operation.
     * </p>
     * 
     * @param replicationTaskIndividualAssessmentStartDate
     *        Date when this individual assessment was started as part of running the
     *        <code>StartReplicationTaskAssessmentRun</code> operation.
     */

    public void setReplicationTaskIndividualAssessmentStartDate(java.util.Date replicationTaskIndividualAssessmentStartDate) {
        this.replicationTaskIndividualAssessmentStartDate = replicationTaskIndividualAssessmentStartDate;
    }

    /**
     * <p>
     * Date when this individual assessment was started as part of running the
     * <code>StartReplicationTaskAssessmentRun</code> operation.
     * </p>
     * 
     * @return Date when this individual assessment was started as part of running the
     *         <code>StartReplicationTaskAssessmentRun</code> operation.
     */

    public java.util.Date getReplicationTaskIndividualAssessmentStartDate() {
        return this.replicationTaskIndividualAssessmentStartDate;
    }

    /**
     * <p>
     * Date when this individual assessment was started as part of running the
     * <code>StartReplicationTaskAssessmentRun</code> operation.
     * </p>
     * 
     * @param replicationTaskIndividualAssessmentStartDate
     *        Date when this individual assessment was started as part of running the
     *        <code>StartReplicationTaskAssessmentRun</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskIndividualAssessment withReplicationTaskIndividualAssessmentStartDate(java.util.Date replicationTaskIndividualAssessmentStartDate) {
        setReplicationTaskIndividualAssessmentStartDate(replicationTaskIndividualAssessmentStartDate);
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
        if (getReplicationTaskIndividualAssessmentArn() != null)
            sb.append("ReplicationTaskIndividualAssessmentArn: ").append(getReplicationTaskIndividualAssessmentArn()).append(",");
        if (getReplicationTaskAssessmentRunArn() != null)
            sb.append("ReplicationTaskAssessmentRunArn: ").append(getReplicationTaskAssessmentRunArn()).append(",");
        if (getIndividualAssessmentName() != null)
            sb.append("IndividualAssessmentName: ").append(getIndividualAssessmentName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReplicationTaskIndividualAssessmentStartDate() != null)
            sb.append("ReplicationTaskIndividualAssessmentStartDate: ").append(getReplicationTaskIndividualAssessmentStartDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTaskIndividualAssessment == false)
            return false;
        ReplicationTaskIndividualAssessment other = (ReplicationTaskIndividualAssessment) obj;
        if (other.getReplicationTaskIndividualAssessmentArn() == null ^ this.getReplicationTaskIndividualAssessmentArn() == null)
            return false;
        if (other.getReplicationTaskIndividualAssessmentArn() != null
                && other.getReplicationTaskIndividualAssessmentArn().equals(this.getReplicationTaskIndividualAssessmentArn()) == false)
            return false;
        if (other.getReplicationTaskAssessmentRunArn() == null ^ this.getReplicationTaskAssessmentRunArn() == null)
            return false;
        if (other.getReplicationTaskAssessmentRunArn() != null
                && other.getReplicationTaskAssessmentRunArn().equals(this.getReplicationTaskAssessmentRunArn()) == false)
            return false;
        if (other.getIndividualAssessmentName() == null ^ this.getIndividualAssessmentName() == null)
            return false;
        if (other.getIndividualAssessmentName() != null && other.getIndividualAssessmentName().equals(this.getIndividualAssessmentName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReplicationTaskIndividualAssessmentStartDate() == null ^ this.getReplicationTaskIndividualAssessmentStartDate() == null)
            return false;
        if (other.getReplicationTaskIndividualAssessmentStartDate() != null
                && other.getReplicationTaskIndividualAssessmentStartDate().equals(this.getReplicationTaskIndividualAssessmentStartDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskIndividualAssessmentArn() == null) ? 0 : getReplicationTaskIndividualAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskAssessmentRunArn() == null) ? 0 : getReplicationTaskAssessmentRunArn().hashCode());
        hashCode = prime * hashCode + ((getIndividualAssessmentName() == null) ? 0 : getIndividualAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationTaskIndividualAssessmentStartDate() == null) ? 0 : getReplicationTaskIndividualAssessmentStartDate().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationTaskIndividualAssessment clone() {
        try {
            return (ReplicationTaskIndividualAssessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ReplicationTaskIndividualAssessmentMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
