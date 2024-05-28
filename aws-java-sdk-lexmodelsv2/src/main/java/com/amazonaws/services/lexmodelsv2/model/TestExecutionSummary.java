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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summarizes metadata about the test execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestExecutionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestExecutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the test execution.
     * </p>
     */
    private String testExecutionId;
    /**
     * <p>
     * The date and time at which the test execution was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time at which the test execution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The current status of the test execution.
     * </p>
     */
    private String testExecutionStatus;
    /**
     * <p>
     * The unique identifier of the test set used in the test execution.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The name of the test set used in the test execution.
     * </p>
     */
    private String testSetName;
    /**
     * <p>
     * Contains information about the bot used for the test execution..
     * </p>
     */
    private TestExecutionTarget target;
    /**
     * <p>
     * Specifies whether the API mode for the test execution is streaming or non-streaming.
     * </p>
     */
    private String apiMode;
    /**
     * <p>
     * Specifies whether the data used for the test execution is written or spoken.
     * </p>
     */
    private String testExecutionModality;

    /**
     * <p>
     * The unique identifier of the test execution.
     * </p>
     * 
     * @param testExecutionId
     *        The unique identifier of the test execution.
     */

    public void setTestExecutionId(String testExecutionId) {
        this.testExecutionId = testExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the test execution.
     * </p>
     * 
     * @return The unique identifier of the test execution.
     */

    public String getTestExecutionId() {
        return this.testExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the test execution.
     * </p>
     * 
     * @param testExecutionId
     *        The unique identifier of the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionSummary withTestExecutionId(String testExecutionId) {
        setTestExecutionId(testExecutionId);
        return this;
    }

    /**
     * <p>
     * The date and time at which the test execution was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time at which the test execution was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time at which the test execution was created.
     * </p>
     * 
     * @return The date and time at which the test execution was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time at which the test execution was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time at which the test execution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time at which the test execution was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time at which the test execution was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time at which the test execution was last updated.
     * </p>
     * 
     * @return The date and time at which the test execution was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time at which the test execution was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time at which the test execution was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The current status of the test execution.
     * </p>
     * 
     * @param testExecutionStatus
     *        The current status of the test execution.
     * @see TestExecutionStatus
     */

    public void setTestExecutionStatus(String testExecutionStatus) {
        this.testExecutionStatus = testExecutionStatus;
    }

    /**
     * <p>
     * The current status of the test execution.
     * </p>
     * 
     * @return The current status of the test execution.
     * @see TestExecutionStatus
     */

    public String getTestExecutionStatus() {
        return this.testExecutionStatus;
    }

    /**
     * <p>
     * The current status of the test execution.
     * </p>
     * 
     * @param testExecutionStatus
     *        The current status of the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionStatus
     */

    public TestExecutionSummary withTestExecutionStatus(String testExecutionStatus) {
        setTestExecutionStatus(testExecutionStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the test execution.
     * </p>
     * 
     * @param testExecutionStatus
     *        The current status of the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionStatus
     */

    public TestExecutionSummary withTestExecutionStatus(TestExecutionStatus testExecutionStatus) {
        this.testExecutionStatus = testExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the test set used in the test execution.
     * </p>
     * 
     * @param testSetId
     *        The unique identifier of the test set used in the test execution.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The unique identifier of the test set used in the test execution.
     * </p>
     * 
     * @return The unique identifier of the test set used in the test execution.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The unique identifier of the test set used in the test execution.
     * </p>
     * 
     * @param testSetId
     *        The unique identifier of the test set used in the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionSummary withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The name of the test set used in the test execution.
     * </p>
     * 
     * @param testSetName
     *        The name of the test set used in the test execution.
     */

    public void setTestSetName(String testSetName) {
        this.testSetName = testSetName;
    }

    /**
     * <p>
     * The name of the test set used in the test execution.
     * </p>
     * 
     * @return The name of the test set used in the test execution.
     */

    public String getTestSetName() {
        return this.testSetName;
    }

    /**
     * <p>
     * The name of the test set used in the test execution.
     * </p>
     * 
     * @param testSetName
     *        The name of the test set used in the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionSummary withTestSetName(String testSetName) {
        setTestSetName(testSetName);
        return this;
    }

    /**
     * <p>
     * Contains information about the bot used for the test execution..
     * </p>
     * 
     * @param target
     *        Contains information about the bot used for the test execution..
     */

    public void setTarget(TestExecutionTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Contains information about the bot used for the test execution..
     * </p>
     * 
     * @return Contains information about the bot used for the test execution..
     */

    public TestExecutionTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Contains information about the bot used for the test execution..
     * </p>
     * 
     * @param target
     *        Contains information about the bot used for the test execution..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionSummary withTarget(TestExecutionTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Specifies whether the API mode for the test execution is streaming or non-streaming.
     * </p>
     * 
     * @param apiMode
     *        Specifies whether the API mode for the test execution is streaming or non-streaming.
     * @see TestExecutionApiMode
     */

    public void setApiMode(String apiMode) {
        this.apiMode = apiMode;
    }

    /**
     * <p>
     * Specifies whether the API mode for the test execution is streaming or non-streaming.
     * </p>
     * 
     * @return Specifies whether the API mode for the test execution is streaming or non-streaming.
     * @see TestExecutionApiMode
     */

    public String getApiMode() {
        return this.apiMode;
    }

    /**
     * <p>
     * Specifies whether the API mode for the test execution is streaming or non-streaming.
     * </p>
     * 
     * @param apiMode
     *        Specifies whether the API mode for the test execution is streaming or non-streaming.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionApiMode
     */

    public TestExecutionSummary withApiMode(String apiMode) {
        setApiMode(apiMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether the API mode for the test execution is streaming or non-streaming.
     * </p>
     * 
     * @param apiMode
     *        Specifies whether the API mode for the test execution is streaming or non-streaming.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionApiMode
     */

    public TestExecutionSummary withApiMode(TestExecutionApiMode apiMode) {
        this.apiMode = apiMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the data used for the test execution is written or spoken.
     * </p>
     * 
     * @param testExecutionModality
     *        Specifies whether the data used for the test execution is written or spoken.
     * @see TestExecutionModality
     */

    public void setTestExecutionModality(String testExecutionModality) {
        this.testExecutionModality = testExecutionModality;
    }

    /**
     * <p>
     * Specifies whether the data used for the test execution is written or spoken.
     * </p>
     * 
     * @return Specifies whether the data used for the test execution is written or spoken.
     * @see TestExecutionModality
     */

    public String getTestExecutionModality() {
        return this.testExecutionModality;
    }

    /**
     * <p>
     * Specifies whether the data used for the test execution is written or spoken.
     * </p>
     * 
     * @param testExecutionModality
     *        Specifies whether the data used for the test execution is written or spoken.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionModality
     */

    public TestExecutionSummary withTestExecutionModality(String testExecutionModality) {
        setTestExecutionModality(testExecutionModality);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data used for the test execution is written or spoken.
     * </p>
     * 
     * @param testExecutionModality
     *        Specifies whether the data used for the test execution is written or spoken.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionModality
     */

    public TestExecutionSummary withTestExecutionModality(TestExecutionModality testExecutionModality) {
        this.testExecutionModality = testExecutionModality.toString();
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
        if (getTestExecutionId() != null)
            sb.append("TestExecutionId: ").append(getTestExecutionId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getTestExecutionStatus() != null)
            sb.append("TestExecutionStatus: ").append(getTestExecutionStatus()).append(",");
        if (getTestSetId() != null)
            sb.append("TestSetId: ").append(getTestSetId()).append(",");
        if (getTestSetName() != null)
            sb.append("TestSetName: ").append(getTestSetName()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getApiMode() != null)
            sb.append("ApiMode: ").append(getApiMode()).append(",");
        if (getTestExecutionModality() != null)
            sb.append("TestExecutionModality: ").append(getTestExecutionModality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestExecutionSummary == false)
            return false;
        TestExecutionSummary other = (TestExecutionSummary) obj;
        if (other.getTestExecutionId() == null ^ this.getTestExecutionId() == null)
            return false;
        if (other.getTestExecutionId() != null && other.getTestExecutionId().equals(this.getTestExecutionId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getTestExecutionStatus() == null ^ this.getTestExecutionStatus() == null)
            return false;
        if (other.getTestExecutionStatus() != null && other.getTestExecutionStatus().equals(this.getTestExecutionStatus()) == false)
            return false;
        if (other.getTestSetId() == null ^ this.getTestSetId() == null)
            return false;
        if (other.getTestSetId() != null && other.getTestSetId().equals(this.getTestSetId()) == false)
            return false;
        if (other.getTestSetName() == null ^ this.getTestSetName() == null)
            return false;
        if (other.getTestSetName() != null && other.getTestSetName().equals(this.getTestSetName()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getApiMode() == null ^ this.getApiMode() == null)
            return false;
        if (other.getApiMode() != null && other.getApiMode().equals(this.getApiMode()) == false)
            return false;
        if (other.getTestExecutionModality() == null ^ this.getTestExecutionModality() == null)
            return false;
        if (other.getTestExecutionModality() != null && other.getTestExecutionModality().equals(this.getTestExecutionModality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestExecutionId() == null) ? 0 : getTestExecutionId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getTestExecutionStatus() == null) ? 0 : getTestExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getTestSetId() == null) ? 0 : getTestSetId().hashCode());
        hashCode = prime * hashCode + ((getTestSetName() == null) ? 0 : getTestSetName().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getApiMode() == null) ? 0 : getApiMode().hashCode());
        hashCode = prime * hashCode + ((getTestExecutionModality() == null) ? 0 : getTestExecutionModality().hashCode());
        return hashCode;
    }

    @Override
    public TestExecutionSummary clone() {
        try {
            return (TestExecutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestExecutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
