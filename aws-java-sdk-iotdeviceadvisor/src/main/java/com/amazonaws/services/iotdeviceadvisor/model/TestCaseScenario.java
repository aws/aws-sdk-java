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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides test case scenario.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TestCaseScenario" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseScenario implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides test case scenario ID.
     * </p>
     */
    private String testCaseScenarioId;
    /**
     * <p>
     * Provides test case scenario type. Type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Basic
     * </p>
     * </li>
     * </ul>
     */
    private String testCaseScenarioType;
    /**
     * <p>
     * Provides the test case scenario status. Status is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASS</code>: Test passed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAIL</code>: Test failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: Test has not started running but is scheduled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: Test is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERORR</code>: Test faced an error when running due to an internal issue.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Provides test case scenario failure result.
     * </p>
     */
    private String failure;
    /**
     * <p>
     * </p>
     */
    private String systemMessage;

    /**
     * <p>
     * Provides test case scenario ID.
     * </p>
     * 
     * @param testCaseScenarioId
     *        Provides test case scenario ID.
     */

    public void setTestCaseScenarioId(String testCaseScenarioId) {
        this.testCaseScenarioId = testCaseScenarioId;
    }

    /**
     * <p>
     * Provides test case scenario ID.
     * </p>
     * 
     * @return Provides test case scenario ID.
     */

    public String getTestCaseScenarioId() {
        return this.testCaseScenarioId;
    }

    /**
     * <p>
     * Provides test case scenario ID.
     * </p>
     * 
     * @param testCaseScenarioId
     *        Provides test case scenario ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseScenario withTestCaseScenarioId(String testCaseScenarioId) {
        setTestCaseScenarioId(testCaseScenarioId);
        return this;
    }

    /**
     * <p>
     * Provides test case scenario type. Type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Basic
     * </p>
     * </li>
     * </ul>
     * 
     * @param testCaseScenarioType
     *        Provides test case scenario type. Type is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Advanced
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Basic
     *        </p>
     *        </li>
     * @see TestCaseScenarioType
     */

    public void setTestCaseScenarioType(String testCaseScenarioType) {
        this.testCaseScenarioType = testCaseScenarioType;
    }

    /**
     * <p>
     * Provides test case scenario type. Type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Basic
     * </p>
     * </li>
     * </ul>
     * 
     * @return Provides test case scenario type. Type is one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Advanced
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Basic
     *         </p>
     *         </li>
     * @see TestCaseScenarioType
     */

    public String getTestCaseScenarioType() {
        return this.testCaseScenarioType;
    }

    /**
     * <p>
     * Provides test case scenario type. Type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Basic
     * </p>
     * </li>
     * </ul>
     * 
     * @param testCaseScenarioType
     *        Provides test case scenario type. Type is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Advanced
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Basic
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseScenarioType
     */

    public TestCaseScenario withTestCaseScenarioType(String testCaseScenarioType) {
        setTestCaseScenarioType(testCaseScenarioType);
        return this;
    }

    /**
     * <p>
     * Provides test case scenario type. Type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Advanced
     * </p>
     * </li>
     * <li>
     * <p>
     * Basic
     * </p>
     * </li>
     * </ul>
     * 
     * @param testCaseScenarioType
     *        Provides test case scenario type. Type is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Advanced
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Basic
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseScenarioType
     */

    public TestCaseScenario withTestCaseScenarioType(TestCaseScenarioType testCaseScenarioType) {
        this.testCaseScenarioType = testCaseScenarioType.toString();
        return this;
    }

    /**
     * <p>
     * Provides the test case scenario status. Status is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASS</code>: Test passed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAIL</code>: Test failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: Test has not started running but is scheduled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: Test is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERORR</code>: Test faced an error when running due to an internal issue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Provides the test case scenario status. Status is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASS</code>: Test passed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAIL</code>: Test failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: Test has not started running but is scheduled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: Test is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a suite
     *        run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERORR</code>: Test faced an error when running due to an internal issue.
     *        </p>
     *        </li>
     * @see TestCaseScenarioStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides the test case scenario status. Status is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASS</code>: Test passed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAIL</code>: Test failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: Test has not started running but is scheduled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: Test is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERORR</code>: Test faced an error when running due to an internal issue.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Provides the test case scenario status. Status is one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PASS</code>: Test passed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAIL</code>: Test failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code>: Test has not started running but is scheduled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code>: Test is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a
     *         suite run.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERORR</code>: Test faced an error when running due to an internal issue.
     *         </p>
     *         </li>
     * @see TestCaseScenarioStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Provides the test case scenario status. Status is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASS</code>: Test passed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAIL</code>: Test failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: Test has not started running but is scheduled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: Test is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERORR</code>: Test faced an error when running due to an internal issue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Provides the test case scenario status. Status is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASS</code>: Test passed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAIL</code>: Test failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: Test has not started running but is scheduled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: Test is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a suite
     *        run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERORR</code>: Test faced an error when running due to an internal issue.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseScenarioStatus
     */

    public TestCaseScenario withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Provides the test case scenario status. Status is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASS</code>: Test passed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAIL</code>: Test failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: Test has not started running but is scheduled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: Test is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERORR</code>: Test faced an error when running due to an internal issue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Provides the test case scenario status. Status is one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASS</code>: Test passed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAIL</code>: Test failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: Test has not started running but is scheduled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: Test is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code>: Test is performing cleanup steps. You will see this status only if you stop a suite
     *        run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> Test is stopped. You will see this status only if you stop a suite run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PASS_WITH_WARNINGS</code>: Test passed with warnings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERORR</code>: Test faced an error when running due to an internal issue.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseScenarioStatus
     */

    public TestCaseScenario withStatus(TestCaseScenarioStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides test case scenario failure result.
     * </p>
     * 
     * @param failure
     *        Provides test case scenario failure result.
     */

    public void setFailure(String failure) {
        this.failure = failure;
    }

    /**
     * <p>
     * Provides test case scenario failure result.
     * </p>
     * 
     * @return Provides test case scenario failure result.
     */

    public String getFailure() {
        return this.failure;
    }

    /**
     * <p>
     * Provides test case scenario failure result.
     * </p>
     * 
     * @param failure
     *        Provides test case scenario failure result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseScenario withFailure(String failure) {
        setFailure(failure);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param systemMessage
     */

    public void setSystemMessage(String systemMessage) {
        this.systemMessage = systemMessage;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getSystemMessage() {
        return this.systemMessage;
    }

    /**
     * <p>
     * </p>
     * 
     * @param systemMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseScenario withSystemMessage(String systemMessage) {
        setSystemMessage(systemMessage);
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
        if (getTestCaseScenarioId() != null)
            sb.append("TestCaseScenarioId: ").append(getTestCaseScenarioId()).append(",");
        if (getTestCaseScenarioType() != null)
            sb.append("TestCaseScenarioType: ").append(getTestCaseScenarioType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailure() != null)
            sb.append("Failure: ").append(getFailure()).append(",");
        if (getSystemMessage() != null)
            sb.append("SystemMessage: ").append(getSystemMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCaseScenario == false)
            return false;
        TestCaseScenario other = (TestCaseScenario) obj;
        if (other.getTestCaseScenarioId() == null ^ this.getTestCaseScenarioId() == null)
            return false;
        if (other.getTestCaseScenarioId() != null && other.getTestCaseScenarioId().equals(this.getTestCaseScenarioId()) == false)
            return false;
        if (other.getTestCaseScenarioType() == null ^ this.getTestCaseScenarioType() == null)
            return false;
        if (other.getTestCaseScenarioType() != null && other.getTestCaseScenarioType().equals(this.getTestCaseScenarioType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailure() == null ^ this.getFailure() == null)
            return false;
        if (other.getFailure() != null && other.getFailure().equals(this.getFailure()) == false)
            return false;
        if (other.getSystemMessage() == null ^ this.getSystemMessage() == null)
            return false;
        if (other.getSystemMessage() != null && other.getSystemMessage().equals(this.getSystemMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestCaseScenarioId() == null) ? 0 : getTestCaseScenarioId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseScenarioType() == null) ? 0 : getTestCaseScenarioType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailure() == null) ? 0 : getFailure().hashCode());
        hashCode = prime * hashCode + ((getSystemMessage() == null) ? 0 : getSystemMessage().hashCode());
        return hashCode;
    }

    @Override
    public TestCaseScenario clone() {
        try {
            return (TestCaseScenario) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.TestCaseScenarioMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
