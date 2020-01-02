/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeTypeRegistration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTypeRegistrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     */
    private String progressStatus;
    /**
     * <p>
     * The description of the type registration request.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this will be
     * <code>null</code>.
     * </p>
     */
    private String typeArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of this specific version of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this will be
     * <code>null</code>.
     * </p>
     */
    private String typeVersionArn;

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * 
     * @param progressStatus
     *        The current status of the type registration request.
     * @see RegistrationStatus
     */

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * 
     * @return The current status of the type registration request.
     * @see RegistrationStatus
     */

    public String getProgressStatus() {
        return this.progressStatus;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * 
     * @param progressStatus
     *        The current status of the type registration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public DescribeTypeRegistrationResult withProgressStatus(String progressStatus) {
        setProgressStatus(progressStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * 
     * @param progressStatus
     *        The current status of the type registration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public DescribeTypeRegistrationResult withProgressStatus(RegistrationStatus progressStatus) {
        this.progressStatus = progressStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the type registration request.
     * </p>
     * 
     * @param description
     *        The description of the type registration request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the type registration request.
     * </p>
     * 
     * @return The description of the type registration request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the type registration request.
     * </p>
     * 
     * @param description
     *        The description of the type registration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeRegistrationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this will be
     * <code>null</code>.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) of the type being registered.</p>
     *        <p>
     *        For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this
     *        will be <code>null</code>.
     */

    public void setTypeArn(String typeArn) {
        this.typeArn = typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this will be
     * <code>null</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the type being registered.</p>
     *         <p>
     *         For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this
     *         will be <code>null</code>.
     */

    public String getTypeArn() {
        return this.typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this will be
     * <code>null</code>.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) of the type being registered.</p>
     *        <p>
     *        For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this
     *        will be <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeRegistrationResult withTypeArn(String typeArn) {
        setTypeArn(typeArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this specific version of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this will be
     * <code>null</code>.
     * </p>
     * 
     * @param typeVersionArn
     *        The Amazon Resource Name (ARN) of this specific version of the type being registered.</p>
     *        <p>
     *        For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this
     *        will be <code>null</code>.
     */

    public void setTypeVersionArn(String typeVersionArn) {
        this.typeVersionArn = typeVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this specific version of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this will be
     * <code>null</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this specific version of the type being registered.</p>
     *         <p>
     *         For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this
     *         will be <code>null</code>.
     */

    public String getTypeVersionArn() {
        return this.typeVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this specific version of the type being registered.
     * </p>
     * <p>
     * For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this will be
     * <code>null</code>.
     * </p>
     * 
     * @param typeVersionArn
     *        The Amazon Resource Name (ARN) of this specific version of the type being registered.</p>
     *        <p>
     *        For registration requests with a <code>ProgressStatus</code> of other than <code>COMPLETE</code>, this
     *        will be <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeRegistrationResult withTypeVersionArn(String typeVersionArn) {
        setTypeVersionArn(typeVersionArn);
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
        if (getProgressStatus() != null)
            sb.append("ProgressStatus: ").append(getProgressStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTypeArn() != null)
            sb.append("TypeArn: ").append(getTypeArn()).append(",");
        if (getTypeVersionArn() != null)
            sb.append("TypeVersionArn: ").append(getTypeVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTypeRegistrationResult == false)
            return false;
        DescribeTypeRegistrationResult other = (DescribeTypeRegistrationResult) obj;
        if (other.getProgressStatus() == null ^ this.getProgressStatus() == null)
            return false;
        if (other.getProgressStatus() != null && other.getProgressStatus().equals(this.getProgressStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getTypeVersionArn() == null ^ this.getTypeVersionArn() == null)
            return false;
        if (other.getTypeVersionArn() != null && other.getTypeVersionArn().equals(this.getTypeVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressStatus() == null) ? 0 : getProgressStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime * hashCode + ((getTypeVersionArn() == null) ? 0 : getTypeVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTypeRegistrationResult clone() {
        try {
            return (DescribeTypeRegistrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
