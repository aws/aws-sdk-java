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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Application policies describe what the certificate can be used for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ApplicationPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationPolicies implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Marks the application policy extension as critical.
     * </p>
     */
    private Boolean critical;
    /**
     * <p>
     * Application policies describe what the certificate can be used for.
     * </p>
     */
    private java.util.List<ApplicationPolicy> policies;

    /**
     * <p>
     * Marks the application policy extension as critical.
     * </p>
     * 
     * @param critical
     *        Marks the application policy extension as critical.
     */

    public void setCritical(Boolean critical) {
        this.critical = critical;
    }

    /**
     * <p>
     * Marks the application policy extension as critical.
     * </p>
     * 
     * @return Marks the application policy extension as critical.
     */

    public Boolean getCritical() {
        return this.critical;
    }

    /**
     * <p>
     * Marks the application policy extension as critical.
     * </p>
     * 
     * @param critical
     *        Marks the application policy extension as critical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicies withCritical(Boolean critical) {
        setCritical(critical);
        return this;
    }

    /**
     * <p>
     * Marks the application policy extension as critical.
     * </p>
     * 
     * @return Marks the application policy extension as critical.
     */

    public Boolean isCritical() {
        return this.critical;
    }

    /**
     * <p>
     * Application policies describe what the certificate can be used for.
     * </p>
     * 
     * @return Application policies describe what the certificate can be used for.
     */

    public java.util.List<ApplicationPolicy> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * Application policies describe what the certificate can be used for.
     * </p>
     * 
     * @param policies
     *        Application policies describe what the certificate can be used for.
     */

    public void setPolicies(java.util.Collection<ApplicationPolicy> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<ApplicationPolicy>(policies);
    }

    /**
     * <p>
     * Application policies describe what the certificate can be used for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        Application policies describe what the certificate can be used for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicies withPolicies(ApplicationPolicy... policies) {
        if (this.policies == null) {
            setPolicies(new java.util.ArrayList<ApplicationPolicy>(policies.length));
        }
        for (ApplicationPolicy ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Application policies describe what the certificate can be used for.
     * </p>
     * 
     * @param policies
     *        Application policies describe what the certificate can be used for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicies withPolicies(java.util.Collection<ApplicationPolicy> policies) {
        setPolicies(policies);
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
        if (getCritical() != null)
            sb.append("Critical: ").append(getCritical()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationPolicies == false)
            return false;
        ApplicationPolicies other = (ApplicationPolicies) obj;
        if (other.getCritical() == null ^ this.getCritical() == null)
            return false;
        if (other.getCritical() != null && other.getCritical().equals(this.getCritical()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCritical() == null) ? 0 : getCritical().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationPolicies clone() {
        try {
            return (ApplicationPolicies) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.ApplicationPoliciesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
