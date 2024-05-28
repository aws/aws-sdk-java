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
 * Details of errors thrown by the call to retrieve multiple analysis templates within a collaboration by their
 * identifiers.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetCollaborationAnalysisTemplateError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCollaborationAnalysisTemplateError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An error code for the error.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A description of why the call failed.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the analysis template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the analysis template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateError withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An error code for the error.
     * </p>
     * 
     * @param code
     *        An error code for the error.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * An error code for the error.
     * </p>
     * 
     * @return An error code for the error.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * An error code for the error.
     * </p>
     * 
     * @param code
     *        An error code for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A description of why the call failed.
     * </p>
     * 
     * @param message
     *        A description of why the call failed.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of why the call failed.
     * </p>
     * 
     * @return A description of why the call failed.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of why the call failed.
     * </p>
     * 
     * @param message
     *        A description of why the call failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollaborationAnalysisTemplateError withMessage(String message) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
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

        if (obj instanceof BatchGetCollaborationAnalysisTemplateError == false)
            return false;
        BatchGetCollaborationAnalysisTemplateError other = (BatchGetCollaborationAnalysisTemplateError) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCollaborationAnalysisTemplateError clone() {
        try {
            return (BatchGetCollaborationAnalysisTemplateError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.BatchGetCollaborationAnalysisTemplateErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
