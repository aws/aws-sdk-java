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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetSecurityControls"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetSecurityControlsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of security controls (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or
     * a mix of both parameters). The security control ID or Amazon Resource Name (ARN) is the same across standards.
     * </p>
     */
    private java.util.List<String> securityControlIds;

    /**
     * <p>
     * A list of security controls (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or
     * a mix of both parameters). The security control ID or Amazon Resource Name (ARN) is the same across standards.
     * </p>
     * 
     * @return A list of security controls (identified with <code>SecurityControlId</code>,
     *         <code>SecurityControlArn</code>, or a mix of both parameters). The security control ID or Amazon Resource
     *         Name (ARN) is the same across standards.
     */

    public java.util.List<String> getSecurityControlIds() {
        return securityControlIds;
    }

    /**
     * <p>
     * A list of security controls (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or
     * a mix of both parameters). The security control ID or Amazon Resource Name (ARN) is the same across standards.
     * </p>
     * 
     * @param securityControlIds
     *        A list of security controls (identified with <code>SecurityControlId</code>,
     *        <code>SecurityControlArn</code>, or a mix of both parameters). The security control ID or Amazon Resource
     *        Name (ARN) is the same across standards.
     */

    public void setSecurityControlIds(java.util.Collection<String> securityControlIds) {
        if (securityControlIds == null) {
            this.securityControlIds = null;
            return;
        }

        this.securityControlIds = new java.util.ArrayList<String>(securityControlIds);
    }

    /**
     * <p>
     * A list of security controls (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or
     * a mix of both parameters). The security control ID or Amazon Resource Name (ARN) is the same across standards.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityControlIds(java.util.Collection)} or {@link #withSecurityControlIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityControlIds
     *        A list of security controls (identified with <code>SecurityControlId</code>,
     *        <code>SecurityControlArn</code>, or a mix of both parameters). The security control ID or Amazon Resource
     *        Name (ARN) is the same across standards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecurityControlsRequest withSecurityControlIds(String... securityControlIds) {
        if (this.securityControlIds == null) {
            setSecurityControlIds(new java.util.ArrayList<String>(securityControlIds.length));
        }
        for (String ele : securityControlIds) {
            this.securityControlIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security controls (identified with <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or
     * a mix of both parameters). The security control ID or Amazon Resource Name (ARN) is the same across standards.
     * </p>
     * 
     * @param securityControlIds
     *        A list of security controls (identified with <code>SecurityControlId</code>,
     *        <code>SecurityControlArn</code>, or a mix of both parameters). The security control ID or Amazon Resource
     *        Name (ARN) is the same across standards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecurityControlsRequest withSecurityControlIds(java.util.Collection<String> securityControlIds) {
        setSecurityControlIds(securityControlIds);
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
        if (getSecurityControlIds() != null)
            sb.append("SecurityControlIds: ").append(getSecurityControlIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetSecurityControlsRequest == false)
            return false;
        BatchGetSecurityControlsRequest other = (BatchGetSecurityControlsRequest) obj;
        if (other.getSecurityControlIds() == null ^ this.getSecurityControlIds() == null)
            return false;
        if (other.getSecurityControlIds() != null && other.getSecurityControlIds().equals(this.getSecurityControlIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlIds() == null) ? 0 : getSecurityControlIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetSecurityControlsRequest clone() {
        return (BatchGetSecurityControlsRequest) super.clone();
    }

}
