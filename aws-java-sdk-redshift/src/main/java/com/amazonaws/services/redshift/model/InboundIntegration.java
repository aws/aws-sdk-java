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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The content of an inbound integration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/InboundIntegration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InboundIntegration implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an inbound integration.
     * </p>
     */
    private String integrationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source of an inbound integration.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target of an inbound integration.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The status of an inbound integration.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if there is no
     * error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IntegrationError> errors;
    /**
     * <p>
     * The creation time of an inbound integration.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an inbound integration.
     * </p>
     * 
     * @param integrationArn
     *        The Amazon Resource Name (ARN) of an inbound integration.
     */

    public void setIntegrationArn(String integrationArn) {
        this.integrationArn = integrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an inbound integration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an inbound integration.
     */

    public String getIntegrationArn() {
        return this.integrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an inbound integration.
     * </p>
     * 
     * @param integrationArn
     *        The Amazon Resource Name (ARN) of an inbound integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundIntegration withIntegrationArn(String integrationArn) {
        setIntegrationArn(integrationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source of an inbound integration.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the source of an inbound integration.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source of an inbound integration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source of an inbound integration.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source of an inbound integration.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the source of an inbound integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundIntegration withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target of an inbound integration.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of the target of an inbound integration.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target of an inbound integration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target of an inbound integration.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target of an inbound integration.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of the target of an inbound integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundIntegration withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The status of an inbound integration.
     * </p>
     * 
     * @param status
     *        The status of an inbound integration.
     * @see ZeroETLIntegrationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an inbound integration.
     * </p>
     * 
     * @return The status of an inbound integration.
     * @see ZeroETLIntegrationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an inbound integration.
     * </p>
     * 
     * @param status
     *        The status of an inbound integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZeroETLIntegrationStatus
     */

    public InboundIntegration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an inbound integration.
     * </p>
     * 
     * @param status
     *        The status of an inbound integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZeroETLIntegrationStatus
     */

    public InboundIntegration withStatus(ZeroETLIntegrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if there is no
     * error.
     * </p>
     * 
     * @return The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if
     *         there is no error.
     */

    public java.util.List<IntegrationError> getErrors() {
        if (errors == null) {
            errors = new com.amazonaws.internal.SdkInternalList<IntegrationError>();
        }
        return errors;
    }

    /**
     * <p>
     * The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if there is no
     * error.
     * </p>
     * 
     * @param errors
     *        The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if
     *        there is no error.
     */

    public void setErrors(java.util.Collection<IntegrationError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new com.amazonaws.internal.SdkInternalList<IntegrationError>(errors);
    }

    /**
     * <p>
     * The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if there is no
     * error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if
     *        there is no error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundIntegration withErrors(IntegrationError... errors) {
        if (this.errors == null) {
            setErrors(new com.amazonaws.internal.SdkInternalList<IntegrationError>(errors.length));
        }
        for (IntegrationError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if there is no
     * error.
     * </p>
     * 
     * @param errors
     *        The outstanding errors of an inbound integration. Each item is an "IntegrationError". This is null if
     *        there is no error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundIntegration withErrors(java.util.Collection<IntegrationError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The creation time of an inbound integration.
     * </p>
     * 
     * @param createTime
     *        The creation time of an inbound integration.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation time of an inbound integration.
     * </p>
     * 
     * @return The creation time of an inbound integration.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The creation time of an inbound integration.
     * </p>
     * 
     * @param createTime
     *        The creation time of an inbound integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundIntegration withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
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
        if (getIntegrationArn() != null)
            sb.append("IntegrationArn: ").append(getIntegrationArn()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InboundIntegration == false)
            return false;
        InboundIntegration other = (InboundIntegration) obj;
        if (other.getIntegrationArn() == null ^ this.getIntegrationArn() == null)
            return false;
        if (other.getIntegrationArn() != null && other.getIntegrationArn().equals(this.getIntegrationArn()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegrationArn() == null) ? 0 : getIntegrationArn().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public InboundIntegration clone() {
        try {
            return (InboundIntegration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
