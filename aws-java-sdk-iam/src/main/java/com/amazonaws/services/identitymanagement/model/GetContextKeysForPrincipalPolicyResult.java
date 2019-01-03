/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>GetContextKeysForPrincipalPolicy</a> or <a>GetContextKeysForCustomPolicy</a>
 * request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetContextKeysForPrincipalPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContextKeysForPrincipalPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> contextKeyNames;

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     * 
     * @return The list of context keys that are referenced in the input policies.
     */

    public java.util.List<String> getContextKeyNames() {
        if (contextKeyNames == null) {
            contextKeyNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return contextKeyNames;
    }

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     * 
     * @param contextKeyNames
     *        The list of context keys that are referenced in the input policies.
     */

    public void setContextKeyNames(java.util.Collection<String> contextKeyNames) {
        if (contextKeyNames == null) {
            this.contextKeyNames = null;
            return;
        }

        this.contextKeyNames = new com.amazonaws.internal.SdkInternalList<String>(contextKeyNames);
    }

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContextKeyNames(java.util.Collection)} or {@link #withContextKeyNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param contextKeyNames
     *        The list of context keys that are referenced in the input policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContextKeysForPrincipalPolicyResult withContextKeyNames(String... contextKeyNames) {
        if (this.contextKeyNames == null) {
            setContextKeyNames(new com.amazonaws.internal.SdkInternalList<String>(contextKeyNames.length));
        }
        for (String ele : contextKeyNames) {
            this.contextKeyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     * 
     * @param contextKeyNames
     *        The list of context keys that are referenced in the input policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContextKeysForPrincipalPolicyResult withContextKeyNames(java.util.Collection<String> contextKeyNames) {
        setContextKeyNames(contextKeyNames);
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
        if (getContextKeyNames() != null)
            sb.append("ContextKeyNames: ").append(getContextKeyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContextKeysForPrincipalPolicyResult == false)
            return false;
        GetContextKeysForPrincipalPolicyResult other = (GetContextKeysForPrincipalPolicyResult) obj;
        if (other.getContextKeyNames() == null ^ this.getContextKeyNames() == null)
            return false;
        if (other.getContextKeyNames() != null && other.getContextKeyNames().equals(this.getContextKeyNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContextKeyNames() == null) ? 0 : getContextKeyNames().hashCode());
        return hashCode;
    }

    @Override
    public GetContextKeysForPrincipalPolicyResult clone() {
        try {
            return (GetContextKeysForPrincipalPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
