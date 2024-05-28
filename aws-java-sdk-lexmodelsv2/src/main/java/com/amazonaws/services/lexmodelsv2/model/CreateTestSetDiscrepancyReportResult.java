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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateTestSetDiscrepancyReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestSetDiscrepancyReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The unique identifier of the test set discrepancy report to describe.
     * </p>
     */
    private String testSetDiscrepancyReportId;
    /**
     * <p>
     * The creation date and time for the test set discrepancy report.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The test set Id for the test set discrepancy report.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The target bot for the test set discrepancy report.
     * </p>
     */
    private TestSetDiscrepancyReportResourceTarget target;

    /**
     * <p>
     * The unique identifier of the test set discrepancy report to describe.
     * </p>
     * 
     * @param testSetDiscrepancyReportId
     *        The unique identifier of the test set discrepancy report to describe.
     */

    public void setTestSetDiscrepancyReportId(String testSetDiscrepancyReportId) {
        this.testSetDiscrepancyReportId = testSetDiscrepancyReportId;
    }

    /**
     * <p>
     * The unique identifier of the test set discrepancy report to describe.
     * </p>
     * 
     * @return The unique identifier of the test set discrepancy report to describe.
     */

    public String getTestSetDiscrepancyReportId() {
        return this.testSetDiscrepancyReportId;
    }

    /**
     * <p>
     * The unique identifier of the test set discrepancy report to describe.
     * </p>
     * 
     * @param testSetDiscrepancyReportId
     *        The unique identifier of the test set discrepancy report to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSetDiscrepancyReportResult withTestSetDiscrepancyReportId(String testSetDiscrepancyReportId) {
        setTestSetDiscrepancyReportId(testSetDiscrepancyReportId);
        return this;
    }

    /**
     * <p>
     * The creation date and time for the test set discrepancy report.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time for the test set discrepancy report.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time for the test set discrepancy report.
     * </p>
     * 
     * @return The creation date and time for the test set discrepancy report.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time for the test set discrepancy report.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSetDiscrepancyReportResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The test set Id for the test set discrepancy report.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for the test set discrepancy report.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The test set Id for the test set discrepancy report.
     * </p>
     * 
     * @return The test set Id for the test set discrepancy report.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The test set Id for the test set discrepancy report.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSetDiscrepancyReportResult withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The target bot for the test set discrepancy report.
     * </p>
     * 
     * @param target
     *        The target bot for the test set discrepancy report.
     */

    public void setTarget(TestSetDiscrepancyReportResourceTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * The target bot for the test set discrepancy report.
     * </p>
     * 
     * @return The target bot for the test set discrepancy report.
     */

    public TestSetDiscrepancyReportResourceTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target bot for the test set discrepancy report.
     * </p>
     * 
     * @param target
     *        The target bot for the test set discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSetDiscrepancyReportResult withTarget(TestSetDiscrepancyReportResourceTarget target) {
        setTarget(target);
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
        if (getTestSetDiscrepancyReportId() != null)
            sb.append("TestSetDiscrepancyReportId: ").append(getTestSetDiscrepancyReportId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getTestSetId() != null)
            sb.append("TestSetId: ").append(getTestSetId()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTestSetDiscrepancyReportResult == false)
            return false;
        CreateTestSetDiscrepancyReportResult other = (CreateTestSetDiscrepancyReportResult) obj;
        if (other.getTestSetDiscrepancyReportId() == null ^ this.getTestSetDiscrepancyReportId() == null)
            return false;
        if (other.getTestSetDiscrepancyReportId() != null && other.getTestSetDiscrepancyReportId().equals(this.getTestSetDiscrepancyReportId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getTestSetId() == null ^ this.getTestSetId() == null)
            return false;
        if (other.getTestSetId() != null && other.getTestSetId().equals(this.getTestSetId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSetDiscrepancyReportId() == null) ? 0 : getTestSetDiscrepancyReportId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestSetDiscrepancyReportResult clone() {
        try {
            return (CreateTestSetDiscrepancyReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
