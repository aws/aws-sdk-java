/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details identifying the users with permissions to use the action type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionTypePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of AWS account IDs with access to use the action type in their pipelines.
     * </p>
     */
    private java.util.List<String> allowedAccounts;

    /**
     * <p>
     * A list of AWS account IDs with access to use the action type in their pipelines.
     * </p>
     * 
     * @return A list of AWS account IDs with access to use the action type in their pipelines.
     */

    public java.util.List<String> getAllowedAccounts() {
        return allowedAccounts;
    }

    /**
     * <p>
     * A list of AWS account IDs with access to use the action type in their pipelines.
     * </p>
     * 
     * @param allowedAccounts
     *        A list of AWS account IDs with access to use the action type in their pipelines.
     */

    public void setAllowedAccounts(java.util.Collection<String> allowedAccounts) {
        if (allowedAccounts == null) {
            this.allowedAccounts = null;
            return;
        }

        this.allowedAccounts = new java.util.ArrayList<String>(allowedAccounts);
    }

    /**
     * <p>
     * A list of AWS account IDs with access to use the action type in their pipelines.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedAccounts(java.util.Collection)} or {@link #withAllowedAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param allowedAccounts
     *        A list of AWS account IDs with access to use the action type in their pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypePermissions withAllowedAccounts(String... allowedAccounts) {
        if (this.allowedAccounts == null) {
            setAllowedAccounts(new java.util.ArrayList<String>(allowedAccounts.length));
        }
        for (String ele : allowedAccounts) {
            this.allowedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS account IDs with access to use the action type in their pipelines.
     * </p>
     * 
     * @param allowedAccounts
     *        A list of AWS account IDs with access to use the action type in their pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypePermissions withAllowedAccounts(java.util.Collection<String> allowedAccounts) {
        setAllowedAccounts(allowedAccounts);
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
        if (getAllowedAccounts() != null)
            sb.append("AllowedAccounts: ").append(getAllowedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionTypePermissions == false)
            return false;
        ActionTypePermissions other = (ActionTypePermissions) obj;
        if (other.getAllowedAccounts() == null ^ this.getAllowedAccounts() == null)
            return false;
        if (other.getAllowedAccounts() != null && other.getAllowedAccounts().equals(this.getAllowedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedAccounts() == null) ? 0 : getAllowedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public ActionTypePermissions clone() {
        try {
            return (ActionTypePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionTypePermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
