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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAccessScope"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationAccessScopeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the application with the access scope to delete.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * Specifies the name of the access scope to remove from the application.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * Specifies the ARN of the application with the access scope to delete.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application with the access scope to delete.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application with the access scope to delete.
     * </p>
     * 
     * @return Specifies the ARN of the application with the access scope to delete.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application with the access scope to delete.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application with the access scope to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationAccessScopeRequest withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the access scope to remove from the application.
     * </p>
     * 
     * @param scope
     *        Specifies the name of the access scope to remove from the application.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Specifies the name of the access scope to remove from the application.
     * </p>
     * 
     * @return Specifies the name of the access scope to remove from the application.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Specifies the name of the access scope to remove from the application.
     * </p>
     * 
     * @param scope
     *        Specifies the name of the access scope to remove from the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationAccessScopeRequest withScope(String scope) {
        setScope(scope);
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationAccessScopeRequest == false)
            return false;
        DeleteApplicationAccessScopeRequest other = (DeleteApplicationAccessScopeRequest) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationAccessScopeRequest clone() {
        return (DeleteApplicationAccessScopeRequest) super.clone();
    }

}
