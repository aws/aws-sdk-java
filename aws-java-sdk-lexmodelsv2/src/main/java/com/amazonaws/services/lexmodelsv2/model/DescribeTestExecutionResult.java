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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTestExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The execution Id for the test set execution.
     * </p>
     */
    private String testExecutionId;
    /**
     * <p>
     * The execution creation date and time for the test set execution.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time of the last update for the execution.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The test execution status for the test execution.
     * </p>
     */
    private String testExecutionStatus;
    /**
     * <p>
     * The test set Id for the test set execution.
     * </p>
     */
    private String testSetId;
    /**
     * <p>
     * The test set name of the test set execution.
     * </p>
     */
    private String testSetName;
    /**
     * <p>
     * The target bot for the test set execution details.
     * </p>
     */
    private TestExecutionTarget target;
    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For streaming,
     * <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     * <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * </p>
     */
    private String apiMode;
    /**
     * <p>
     * Indicates whether test set is audio or text.
     * </p>
     */
    private String testExecutionModality;
    /**
     * <p>
     * Reasons for the failure of the test set execution.
     * </p>
     */
    private java.util.List<String> failureReasons;

    /**
     * <p>
     * The execution Id for the test set execution.
     * </p>
     * 
     * @param testExecutionId
     *        The execution Id for the test set execution.
     */

    public void setTestExecutionId(String testExecutionId) {
        this.testExecutionId = testExecutionId;
    }

    /**
     * <p>
     * The execution Id for the test set execution.
     * </p>
     * 
     * @return The execution Id for the test set execution.
     */

    public String getTestExecutionId() {
        return this.testExecutionId;
    }

    /**
     * <p>
     * The execution Id for the test set execution.
     * </p>
     * 
     * @param testExecutionId
     *        The execution Id for the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestExecutionResult withTestExecutionId(String testExecutionId) {
        setTestExecutionId(testExecutionId);
        return this;
    }

    /**
     * <p>
     * The execution creation date and time for the test set execution.
     * </p>
     * 
     * @param creationDateTime
     *        The execution creation date and time for the test set execution.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The execution creation date and time for the test set execution.
     * </p>
     * 
     * @return The execution creation date and time for the test set execution.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The execution creation date and time for the test set execution.
     * </p>
     * 
     * @param creationDateTime
     *        The execution creation date and time for the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestExecutionResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the last update for the execution.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time of the last update for the execution.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time of the last update for the execution.
     * </p>
     * 
     * @return The date and time of the last update for the execution.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time of the last update for the execution.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time of the last update for the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestExecutionResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The test execution status for the test execution.
     * </p>
     * 
     * @param testExecutionStatus
     *        The test execution status for the test execution.
     * @see TestExecutionStatus
     */

    public void setTestExecutionStatus(String testExecutionStatus) {
        this.testExecutionStatus = testExecutionStatus;
    }

    /**
     * <p>
     * The test execution status for the test execution.
     * </p>
     * 
     * @return The test execution status for the test execution.
     * @see TestExecutionStatus
     */

    public String getTestExecutionStatus() {
        return this.testExecutionStatus;
    }

    /**
     * <p>
     * The test execution status for the test execution.
     * </p>
     * 
     * @param testExecutionStatus
     *        The test execution status for the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionStatus
     */

    public DescribeTestExecutionResult withTestExecutionStatus(String testExecutionStatus) {
        setTestExecutionStatus(testExecutionStatus);
        return this;
    }

    /**
     * <p>
     * The test execution status for the test execution.
     * </p>
     * 
     * @param testExecutionStatus
     *        The test execution status for the test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionStatus
     */

    public DescribeTestExecutionResult withTestExecutionStatus(TestExecutionStatus testExecutionStatus) {
        this.testExecutionStatus = testExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The test set Id for the test set execution.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for the test set execution.
     */

    public void setTestSetId(String testSetId) {
        this.testSetId = testSetId;
    }

    /**
     * <p>
     * The test set Id for the test set execution.
     * </p>
     * 
     * @return The test set Id for the test set execution.
     */

    public String getTestSetId() {
        return this.testSetId;
    }

    /**
     * <p>
     * The test set Id for the test set execution.
     * </p>
     * 
     * @param testSetId
     *        The test set Id for the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestExecutionResult withTestSetId(String testSetId) {
        setTestSetId(testSetId);
        return this;
    }

    /**
     * <p>
     * The test set name of the test set execution.
     * </p>
     * 
     * @param testSetName
     *        The test set name of the test set execution.
     */

    public void setTestSetName(String testSetName) {
        this.testSetName = testSetName;
    }

    /**
     * <p>
     * The test set name of the test set execution.
     * </p>
     * 
     * @return The test set name of the test set execution.
     */

    public String getTestSetName() {
        return this.testSetName;
    }

    /**
     * <p>
     * The test set name of the test set execution.
     * </p>
     * 
     * @param testSetName
     *        The test set name of the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestExecutionResult withTestSetName(String testSetName) {
        setTestSetName(testSetName);
        return this;
    }

    /**
     * <p>
     * The target bot for the test set execution details.
     * </p>
     * 
     * @param target
     *        The target bot for the test set execution details.
     */

    public void setTarget(TestExecutionTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * The target bot for the test set execution details.
     * </p>
     * 
     * @return The target bot for the test set execution details.
     */

    public TestExecutionTarget getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target bot for the test set execution details.
     * </p>
     * 
     * @param target
     *        The target bot for the test set execution details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestExecutionResult withTarget(TestExecutionTarget target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For streaming,
     * <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     * <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * </p>
     * 
     * @param apiMode
     *        Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For
     *        streaming, <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     *        <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * @see TestExecutionApiMode
     */

    public void setApiMode(String apiMode) {
        this.apiMode = apiMode;
    }

    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For streaming,
     * <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     * <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * </p>
     * 
     * @return Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For
     *         streaming, <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     *         <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * @see TestExecutionApiMode
     */

    public String getApiMode() {
        return this.apiMode;
    }

    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For streaming,
     * <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     * <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * </p>
     * 
     * @param apiMode
     *        Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For
     *        streaming, <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     *        <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionApiMode
     */

    public DescribeTestExecutionResult withApiMode(String apiMode) {
        setApiMode(apiMode);
        return this;
    }

    /**
     * <p>
     * Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For streaming,
     * <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     * <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * </p>
     * 
     * @param apiMode
     *        Indicates whether we use streaming or non-streaming APIs are used for the test set execution. For
     *        streaming, <code>StartConversation</code> Amazon Lex Runtime API is used. Whereas for non-streaming,
     *        <code>RecognizeUtterance</code> and <code>RecognizeText</code> Amazon Lex Runtime API is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionApiMode
     */

    public DescribeTestExecutionResult withApiMode(TestExecutionApiMode apiMode) {
        this.apiMode = apiMode.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether test set is audio or text.
     * </p>
     * 
     * @param testExecutionModality
     *        Indicates whether test set is audio or text.
     * @see TestExecutionModality
     */

    public void setTestExecutionModality(String testExecutionModality) {
        this.testExecutionModality = testExecutionModality;
    }

    /**
     * <p>
     * Indicates whether test set is audio or text.
     * </p>
     * 
     * @return Indicates whether test set is audio or text.
     * @see TestExecutionModality
     */

    public String getTestExecutionModality() {
        return this.testExecutionModality;
    }

    /**
     * <p>
     * Indicates whether test set is audio or text.
     * </p>
     * 
     * @param testExecutionModality
     *        Indicates whether test set is audio or text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionModality
     */

    public DescribeTestExecutionResult withTestExecutionModality(String testExecutionModality) {
        setTestExecutionModality(testExecutionModality);
        return this;
    }

    /**
     * <p>
     * Indicates whether test set is audio or text.
     * </p>
     * 
     * @param testExecutionModality
     *        Indicates whether test set is audio or text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestExecutionModality
     */

    public DescribeTestExecutionResult withTestExecutionModality(TestExecutionModality testExecutionModality) {
        this.testExecutionModality = testExecutionModality.toString();
        return this;
    }

    /**
     * <p>
     * Reasons for the failure of the test set execution.
     * </p>
     * 
     * @return Reasons for the failure of the test set execution.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * Reasons for the failure of the test set execution.
     * </p>
     * 
     * @param failureReasons
     *        Reasons for the failure of the test set execution.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * Reasons for the failure of the test set execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        Reasons for the failure of the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestExecutionResult withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Reasons for the failure of the test set execution.
     * </p>
     * 
     * @param failureReasons
     *        Reasons for the failure of the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTestExecutionResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
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
            sb.append("TestExecutionModality: ").append(getTestExecutionModality()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTestExecutionResult == false)
            return false;
        DescribeTestExecutionResult other = (DescribeTestExecutionResult) obj;
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
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
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
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTestExecutionResult clone() {
        try {
            return (DescribeTestExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
