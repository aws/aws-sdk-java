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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TestConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the identifier of the connector object that you are testing.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * Returns <code>OK</code> for successful test, or <code>ERROR</code> if the test fails.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Returns <code>Connection succeeded</code> if the test is successful. Or, returns a descriptive error message if
     * the test fails. The following list provides troubleshooting details, depending on the error message that you
     * receive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that your secret name aligns with the one in Transfer Role permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify the server URL in the connector configuration , and verify that the login credentials work successfully
     * outside of the connector.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify that the secret exists and is formatted correctly.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify that the trusted host key in the connector configuration matches the <code>ssh-keyscan</code> output.
     * </p>
     * </li>
     * </ul>
     */
    private String statusMessage;

    /**
     * <p>
     * Returns the identifier of the connector object that you are testing.
     * </p>
     * 
     * @param connectorId
     *        Returns the identifier of the connector object that you are testing.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * Returns the identifier of the connector object that you are testing.
     * </p>
     * 
     * @return Returns the identifier of the connector object that you are testing.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * Returns the identifier of the connector object that you are testing.
     * </p>
     * 
     * @param connectorId
     *        Returns the identifier of the connector object that you are testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConnectionResult withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * Returns <code>OK</code> for successful test, or <code>ERROR</code> if the test fails.
     * </p>
     * 
     * @param status
     *        Returns <code>OK</code> for successful test, or <code>ERROR</code> if the test fails.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Returns <code>OK</code> for successful test, or <code>ERROR</code> if the test fails.
     * </p>
     * 
     * @return Returns <code>OK</code> for successful test, or <code>ERROR</code> if the test fails.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Returns <code>OK</code> for successful test, or <code>ERROR</code> if the test fails.
     * </p>
     * 
     * @param status
     *        Returns <code>OK</code> for successful test, or <code>ERROR</code> if the test fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConnectionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Returns <code>Connection succeeded</code> if the test is successful. Or, returns a descriptive error message if
     * the test fails. The following list provides troubleshooting details, depending on the error message that you
     * receive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that your secret name aligns with the one in Transfer Role permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify the server URL in the connector configuration , and verify that the login credentials work successfully
     * outside of the connector.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify that the secret exists and is formatted correctly.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify that the trusted host key in the connector configuration matches the <code>ssh-keyscan</code> output.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusMessage
     *        Returns <code>Connection succeeded</code> if the test is successful. Or, returns a descriptive error
     *        message if the test fails. The following list provides troubleshooting details, depending on the error
     *        message that you receive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Verify that your secret name aligns with the one in Transfer Role permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Verify the server URL in the connector configuration , and verify that the login credentials work
     *        successfully outside of the connector.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Verify that the secret exists and is formatted correctly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Verify that the trusted host key in the connector configuration matches the <code>ssh-keyscan</code>
     *        output.
     *        </p>
     *        </li>
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Returns <code>Connection succeeded</code> if the test is successful. Or, returns a descriptive error message if
     * the test fails. The following list provides troubleshooting details, depending on the error message that you
     * receive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that your secret name aligns with the one in Transfer Role permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify the server URL in the connector configuration , and verify that the login credentials work successfully
     * outside of the connector.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify that the secret exists and is formatted correctly.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify that the trusted host key in the connector configuration matches the <code>ssh-keyscan</code> output.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Returns <code>Connection succeeded</code> if the test is successful. Or, returns a descriptive error
     *         message if the test fails. The following list provides troubleshooting details, depending on the error
     *         message that you receive.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Verify that your secret name aligns with the one in Transfer Role permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Verify the server URL in the connector configuration , and verify that the login credentials work
     *         successfully outside of the connector.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Verify that the secret exists and is formatted correctly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Verify that the trusted host key in the connector configuration matches the <code>ssh-keyscan</code>
     *         output.
     *         </p>
     *         </li>
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Returns <code>Connection succeeded</code> if the test is successful. Or, returns a descriptive error message if
     * the test fails. The following list provides troubleshooting details, depending on the error message that you
     * receive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that your secret name aligns with the one in Transfer Role permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify the server URL in the connector configuration , and verify that the login credentials work successfully
     * outside of the connector.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify that the secret exists and is formatted correctly.
     * </p>
     * </li>
     * <li>
     * <p>
     * Verify that the trusted host key in the connector configuration matches the <code>ssh-keyscan</code> output.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusMessage
     *        Returns <code>Connection succeeded</code> if the test is successful. Or, returns a descriptive error
     *        message if the test fails. The following list provides troubleshooting details, depending on the error
     *        message that you receive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Verify that your secret name aligns with the one in Transfer Role permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Verify the server URL in the connector configuration , and verify that the login credentials work
     *        successfully outside of the connector.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Verify that the secret exists and is formatted correctly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Verify that the trusted host key in the connector configuration matches the <code>ssh-keyscan</code>
     *        output.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConnectionResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestConnectionResult == false)
            return false;
        TestConnectionResult other = (TestConnectionResult) obj;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public TestConnectionResult clone() {
        try {
            return (TestConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
