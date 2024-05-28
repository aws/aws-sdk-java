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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of objects containing <code>RuleArn</code>, <code>ErrorCode</code>, and <code>ErrorMessage</code>. This
 * parameter tells you which automation rules the request didn't process and why.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UnprocessedAutomationRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedAutomationRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the unprocessed automation rule.
     * </p>
     */
    private String ruleArn;
    /**
     * <p>
     * The error code associated with the unprocessed automation rule.
     * </p>
     */
    private Integer errorCode;
    /**
     * <p>
     * An error message describing why a request didn't process a specific rule.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the unprocessed automation rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) for the unprocessed automation rule.
     */

    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the unprocessed automation rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the unprocessed automation rule.
     */

    public String getRuleArn() {
        return this.ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the unprocessed automation rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) for the unprocessed automation rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAutomationRule withRuleArn(String ruleArn) {
        setRuleArn(ruleArn);
        return this;
    }

    /**
     * <p>
     * The error code associated with the unprocessed automation rule.
     * </p>
     * 
     * @param errorCode
     *        The error code associated with the unprocessed automation rule.
     */

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code associated with the unprocessed automation rule.
     * </p>
     * 
     * @return The error code associated with the unprocessed automation rule.
     */

    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code associated with the unprocessed automation rule.
     * </p>
     * 
     * @param errorCode
     *        The error code associated with the unprocessed automation rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAutomationRule withErrorCode(Integer errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error message describing why a request didn't process a specific rule.
     * </p>
     * 
     * @param errorMessage
     *        An error message describing why a request didn't process a specific rule.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message describing why a request didn't process a specific rule.
     * </p>
     * 
     * @return An error message describing why a request didn't process a specific rule.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message describing why a request didn't process a specific rule.
     * </p>
     * 
     * @param errorMessage
     *        An error message describing why a request didn't process a specific rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedAutomationRule withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getRuleArn() != null)
            sb.append("RuleArn: ").append(getRuleArn()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedAutomationRule == false)
            return false;
        UnprocessedAutomationRule other = (UnprocessedAutomationRule) obj;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedAutomationRule clone() {
        try {
            return (UnprocessedAutomationRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.UnprocessedAutomationRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
