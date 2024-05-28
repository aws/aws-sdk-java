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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides lifecycle details of Amazon Security Lake object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeLifecycleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeLifecycleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides data expiration details of Amazon Security Lake object.
     * </p>
     */
    private DataLakeLifecycleExpiration expiration;
    /**
     * <p>
     * Provides data storage transition details of Amazon Security Lake object.
     * </p>
     */
    private java.util.List<DataLakeLifecycleTransition> transitions;

    /**
     * <p>
     * Provides data expiration details of Amazon Security Lake object.
     * </p>
     * 
     * @param expiration
     *        Provides data expiration details of Amazon Security Lake object.
     */

    public void setExpiration(DataLakeLifecycleExpiration expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * Provides data expiration details of Amazon Security Lake object.
     * </p>
     * 
     * @return Provides data expiration details of Amazon Security Lake object.
     */

    public DataLakeLifecycleExpiration getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * Provides data expiration details of Amazon Security Lake object.
     * </p>
     * 
     * @param expiration
     *        Provides data expiration details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeLifecycleConfiguration withExpiration(DataLakeLifecycleExpiration expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * <p>
     * Provides data storage transition details of Amazon Security Lake object.
     * </p>
     * 
     * @return Provides data storage transition details of Amazon Security Lake object.
     */

    public java.util.List<DataLakeLifecycleTransition> getTransitions() {
        return transitions;
    }

    /**
     * <p>
     * Provides data storage transition details of Amazon Security Lake object.
     * </p>
     * 
     * @param transitions
     *        Provides data storage transition details of Amazon Security Lake object.
     */

    public void setTransitions(java.util.Collection<DataLakeLifecycleTransition> transitions) {
        if (transitions == null) {
            this.transitions = null;
            return;
        }

        this.transitions = new java.util.ArrayList<DataLakeLifecycleTransition>(transitions);
    }

    /**
     * <p>
     * Provides data storage transition details of Amazon Security Lake object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitions(java.util.Collection)} or {@link #withTransitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param transitions
     *        Provides data storage transition details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeLifecycleConfiguration withTransitions(DataLakeLifecycleTransition... transitions) {
        if (this.transitions == null) {
            setTransitions(new java.util.ArrayList<DataLakeLifecycleTransition>(transitions.length));
        }
        for (DataLakeLifecycleTransition ele : transitions) {
            this.transitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides data storage transition details of Amazon Security Lake object.
     * </p>
     * 
     * @param transitions
     *        Provides data storage transition details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeLifecycleConfiguration withTransitions(java.util.Collection<DataLakeLifecycleTransition> transitions) {
        setTransitions(transitions);
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
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration()).append(",");
        if (getTransitions() != null)
            sb.append("Transitions: ").append(getTransitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeLifecycleConfiguration == false)
            return false;
        DataLakeLifecycleConfiguration other = (DataLakeLifecycleConfiguration) obj;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getTransitions() == null ^ this.getTransitions() == null)
            return false;
        if (other.getTransitions() != null && other.getTransitions().equals(this.getTransitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getTransitions() == null) ? 0 : getTransitions().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeLifecycleConfiguration clone() {
        try {
            return (DataLakeLifecycleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeLifecycleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
