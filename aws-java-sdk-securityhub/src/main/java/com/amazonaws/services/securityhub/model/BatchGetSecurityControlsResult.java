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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetSecurityControls"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetSecurityControlsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security control. The
     * same information is returned whether the request includes <code>SecurityControlId</code> or
     * <code>SecurityControlArn</code>.
     * </p>
     */
    private java.util.List<SecurityControl> securityControls;
    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) for which details cannot be returned.
     * </p>
     */
    private java.util.List<UnprocessedSecurityControl> unprocessedIds;

    /**
     * <p>
     * An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security control. The
     * same information is returned whether the request includes <code>SecurityControlId</code> or
     * <code>SecurityControlArn</code>.
     * </p>
     * 
     * @return An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security
     *         control. The same information is returned whether the request includes <code>SecurityControlId</code> or
     *         <code>SecurityControlArn</code>.
     */

    public java.util.List<SecurityControl> getSecurityControls() {
        return securityControls;
    }

    /**
     * <p>
     * An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security control. The
     * same information is returned whether the request includes <code>SecurityControlId</code> or
     * <code>SecurityControlArn</code>.
     * </p>
     * 
     * @param securityControls
     *        An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security
     *        control. The same information is returned whether the request includes <code>SecurityControlId</code> or
     *        <code>SecurityControlArn</code>.
     */

    public void setSecurityControls(java.util.Collection<SecurityControl> securityControls) {
        if (securityControls == null) {
            this.securityControls = null;
            return;
        }

        this.securityControls = new java.util.ArrayList<SecurityControl>(securityControls);
    }

    /**
     * <p>
     * An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security control. The
     * same information is returned whether the request includes <code>SecurityControlId</code> or
     * <code>SecurityControlArn</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityControls(java.util.Collection)} or {@link #withSecurityControls(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityControls
     *        An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security
     *        control. The same information is returned whether the request includes <code>SecurityControlId</code> or
     *        <code>SecurityControlArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecurityControlsResult withSecurityControls(SecurityControl... securityControls) {
        if (this.securityControls == null) {
            setSecurityControls(new java.util.ArrayList<SecurityControl>(securityControls.length));
        }
        for (SecurityControl ele : securityControls) {
            this.securityControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security control. The
     * same information is returned whether the request includes <code>SecurityControlId</code> or
     * <code>SecurityControlArn</code>.
     * </p>
     * 
     * @param securityControls
     *        An array that returns the identifier, Amazon Resource Name (ARN), and other details about a security
     *        control. The same information is returned whether the request includes <code>SecurityControlId</code> or
     *        <code>SecurityControlArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecurityControlsResult withSecurityControls(java.util.Collection<SecurityControl> securityControls) {
        setSecurityControls(securityControls);
        return this;
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) for which details cannot be returned.
     * </p>
     * 
     * @return A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *         mix of both parameters) for which details cannot be returned.
     */

    public java.util.List<UnprocessedSecurityControl> getUnprocessedIds() {
        return unprocessedIds;
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) for which details cannot be returned.
     * </p>
     * 
     * @param unprocessedIds
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) for which details cannot be returned.
     */

    public void setUnprocessedIds(java.util.Collection<UnprocessedSecurityControl> unprocessedIds) {
        if (unprocessedIds == null) {
            this.unprocessedIds = null;
            return;
        }

        this.unprocessedIds = new java.util.ArrayList<UnprocessedSecurityControl>(unprocessedIds);
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) for which details cannot be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedIds(java.util.Collection)} or {@link #withUnprocessedIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param unprocessedIds
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) for which details cannot be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecurityControlsResult withUnprocessedIds(UnprocessedSecurityControl... unprocessedIds) {
        if (this.unprocessedIds == null) {
            setUnprocessedIds(new java.util.ArrayList<UnprocessedSecurityControl>(unprocessedIds.length));
        }
        for (UnprocessedSecurityControl ele : unprocessedIds) {
            this.unprocessedIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of
     * both parameters) for which details cannot be returned.
     * </p>
     * 
     * @param unprocessedIds
     *        A security control (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a
     *        mix of both parameters) for which details cannot be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecurityControlsResult withUnprocessedIds(java.util.Collection<UnprocessedSecurityControl> unprocessedIds) {
        setUnprocessedIds(unprocessedIds);
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
        if (getSecurityControls() != null)
            sb.append("SecurityControls: ").append(getSecurityControls()).append(",");
        if (getUnprocessedIds() != null)
            sb.append("UnprocessedIds: ").append(getUnprocessedIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetSecurityControlsResult == false)
            return false;
        BatchGetSecurityControlsResult other = (BatchGetSecurityControlsResult) obj;
        if (other.getSecurityControls() == null ^ this.getSecurityControls() == null)
            return false;
        if (other.getSecurityControls() != null && other.getSecurityControls().equals(this.getSecurityControls()) == false)
            return false;
        if (other.getUnprocessedIds() == null ^ this.getUnprocessedIds() == null)
            return false;
        if (other.getUnprocessedIds() != null && other.getUnprocessedIds().equals(this.getUnprocessedIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControls() == null) ? 0 : getSecurityControls().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedIds() == null) ? 0 : getUnprocessedIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetSecurityControlsResult clone() {
        try {
            return (BatchGetSecurityControlsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
