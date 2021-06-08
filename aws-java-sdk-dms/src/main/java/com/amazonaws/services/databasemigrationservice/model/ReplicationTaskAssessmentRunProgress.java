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
 * The progress values reported by the <code>AssessmentProgress</code> response element.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReplicationTaskAssessmentRunProgress"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTaskAssessmentRunProgress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of individual assessments that are specified to run.
     * </p>
     */
    private Integer individualAssessmentCount;
    /**
     * <p>
     * The number of individual assessments that have completed, successfully or not.
     * </p>
     */
    private Integer individualAssessmentCompletedCount;

    /**
     * <p>
     * The number of individual assessments that are specified to run.
     * </p>
     * 
     * @param individualAssessmentCount
     *        The number of individual assessments that are specified to run.
     */

    public void setIndividualAssessmentCount(Integer individualAssessmentCount) {
        this.individualAssessmentCount = individualAssessmentCount;
    }

    /**
     * <p>
     * The number of individual assessments that are specified to run.
     * </p>
     * 
     * @return The number of individual assessments that are specified to run.
     */

    public Integer getIndividualAssessmentCount() {
        return this.individualAssessmentCount;
    }

    /**
     * <p>
     * The number of individual assessments that are specified to run.
     * </p>
     * 
     * @param individualAssessmentCount
     *        The number of individual assessments that are specified to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentRunProgress withIndividualAssessmentCount(Integer individualAssessmentCount) {
        setIndividualAssessmentCount(individualAssessmentCount);
        return this;
    }

    /**
     * <p>
     * The number of individual assessments that have completed, successfully or not.
     * </p>
     * 
     * @param individualAssessmentCompletedCount
     *        The number of individual assessments that have completed, successfully or not.
     */

    public void setIndividualAssessmentCompletedCount(Integer individualAssessmentCompletedCount) {
        this.individualAssessmentCompletedCount = individualAssessmentCompletedCount;
    }

    /**
     * <p>
     * The number of individual assessments that have completed, successfully or not.
     * </p>
     * 
     * @return The number of individual assessments that have completed, successfully or not.
     */

    public Integer getIndividualAssessmentCompletedCount() {
        return this.individualAssessmentCompletedCount;
    }

    /**
     * <p>
     * The number of individual assessments that have completed, successfully or not.
     * </p>
     * 
     * @param individualAssessmentCompletedCount
     *        The number of individual assessments that have completed, successfully or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentRunProgress withIndividualAssessmentCompletedCount(Integer individualAssessmentCompletedCount) {
        setIndividualAssessmentCompletedCount(individualAssessmentCompletedCount);
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
        if (getIndividualAssessmentCount() != null)
            sb.append("IndividualAssessmentCount: ").append(getIndividualAssessmentCount()).append(",");
        if (getIndividualAssessmentCompletedCount() != null)
            sb.append("IndividualAssessmentCompletedCount: ").append(getIndividualAssessmentCompletedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTaskAssessmentRunProgress == false)
            return false;
        ReplicationTaskAssessmentRunProgress other = (ReplicationTaskAssessmentRunProgress) obj;
        if (other.getIndividualAssessmentCount() == null ^ this.getIndividualAssessmentCount() == null)
            return false;
        if (other.getIndividualAssessmentCount() != null && other.getIndividualAssessmentCount().equals(this.getIndividualAssessmentCount()) == false)
            return false;
        if (other.getIndividualAssessmentCompletedCount() == null ^ this.getIndividualAssessmentCompletedCount() == null)
            return false;
        if (other.getIndividualAssessmentCompletedCount() != null
                && other.getIndividualAssessmentCompletedCount().equals(this.getIndividualAssessmentCompletedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndividualAssessmentCount() == null) ? 0 : getIndividualAssessmentCount().hashCode());
        hashCode = prime * hashCode + ((getIndividualAssessmentCompletedCount() == null) ? 0 : getIndividualAssessmentCompletedCount().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationTaskAssessmentRunProgress clone() {
        try {
            return (ReplicationTaskAssessmentRunProgress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ReplicationTaskAssessmentRunProgressMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
