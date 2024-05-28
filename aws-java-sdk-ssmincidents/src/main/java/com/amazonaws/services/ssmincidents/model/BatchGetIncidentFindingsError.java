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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an error returned for a <a>BatchGetIncidentFindings</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/BatchGetIncidentFindingsError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetIncidentFindingsError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code associated with an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The ID of a specified finding for which an error was returned for a <code>BatchGetIncidentFindings</code>
     * operation.
     * </p>
     */
    private String findingId;
    /**
     * <p>
     * The description for an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The code associated with an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * </p>
     * 
     * @param code
     *        The code associated with an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code associated with an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * </p>
     * 
     * @return The code associated with an error that was returned for a <code>BatchGetIncidentFindings</code>
     *         operation.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code associated with an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * </p>
     * 
     * @param code
     *        The code associated with an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The ID of a specified finding for which an error was returned for a <code>BatchGetIncidentFindings</code>
     * operation.
     * </p>
     * 
     * @param findingId
     *        The ID of a specified finding for which an error was returned for a <code>BatchGetIncidentFindings</code>
     *        operation.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * The ID of a specified finding for which an error was returned for a <code>BatchGetIncidentFindings</code>
     * operation.
     * </p>
     * 
     * @return The ID of a specified finding for which an error was returned for a <code>BatchGetIncidentFindings</code>
     *         operation.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * The ID of a specified finding for which an error was returned for a <code>BatchGetIncidentFindings</code>
     * operation.
     * </p>
     * 
     * @param findingId
     *        The ID of a specified finding for which an error was returned for a <code>BatchGetIncidentFindings</code>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsError withFindingId(String findingId) {
        setFindingId(findingId);
        return this;
    }

    /**
     * <p>
     * The description for an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * </p>
     * 
     * @param message
     *        The description for an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The description for an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * </p>
     * 
     * @return The description for an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The description for an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * </p>
     * 
     * @param message
     *        The description for an error that was returned for a <code>BatchGetIncidentFindings</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetIncidentFindingsError withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetIncidentFindingsError == false)
            return false;
        BatchGetIncidentFindingsError other = (BatchGetIncidentFindingsError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetIncidentFindingsError clone() {
        try {
            return (BatchGetIncidentFindingsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.BatchGetIncidentFindingsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
