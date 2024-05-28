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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableBaselineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>EnabledBaseline</code> resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID (in UUID format) of the asynchronous <code>EnableBaseline</code> operation. This
     * <code>operationIdentifier</code> is used to track status through calls to the <code>GetBaselineOperation</code>
     * API.
     * </p>
     */
    private String operationIdentifier;

    /**
     * <p>
     * The ARN of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the <code>EnabledBaseline</code> resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @return The ARN of the <code>EnabledBaseline</code> resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the <code>EnabledBaseline</code> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableBaselineResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID (in UUID format) of the asynchronous <code>EnableBaseline</code> operation. This
     * <code>operationIdentifier</code> is used to track status through calls to the <code>GetBaselineOperation</code>
     * API.
     * </p>
     * 
     * @param operationIdentifier
     *        The ID (in UUID format) of the asynchronous <code>EnableBaseline</code> operation. This
     *        <code>operationIdentifier</code> is used to track status through calls to the
     *        <code>GetBaselineOperation</code> API.
     */

    public void setOperationIdentifier(String operationIdentifier) {
        this.operationIdentifier = operationIdentifier;
    }

    /**
     * <p>
     * The ID (in UUID format) of the asynchronous <code>EnableBaseline</code> operation. This
     * <code>operationIdentifier</code> is used to track status through calls to the <code>GetBaselineOperation</code>
     * API.
     * </p>
     * 
     * @return The ID (in UUID format) of the asynchronous <code>EnableBaseline</code> operation. This
     *         <code>operationIdentifier</code> is used to track status through calls to the
     *         <code>GetBaselineOperation</code> API.
     */

    public String getOperationIdentifier() {
        return this.operationIdentifier;
    }

    /**
     * <p>
     * The ID (in UUID format) of the asynchronous <code>EnableBaseline</code> operation. This
     * <code>operationIdentifier</code> is used to track status through calls to the <code>GetBaselineOperation</code>
     * API.
     * </p>
     * 
     * @param operationIdentifier
     *        The ID (in UUID format) of the asynchronous <code>EnableBaseline</code> operation. This
     *        <code>operationIdentifier</code> is used to track status through calls to the
     *        <code>GetBaselineOperation</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableBaselineResult withOperationIdentifier(String operationIdentifier) {
        setOperationIdentifier(operationIdentifier);
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
        if (getOperationIdentifier() != null)
            sb.append("OperationIdentifier: ").append(getOperationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableBaselineResult == false)
            return false;
        EnableBaselineResult other = (EnableBaselineResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getOperationIdentifier() == null ^ this.getOperationIdentifier() == null)
            return false;
        if (other.getOperationIdentifier() != null && other.getOperationIdentifier().equals(this.getOperationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getOperationIdentifier() == null) ? 0 : getOperationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EnableBaselineResult clone() {
        try {
            return (EnableBaselineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
