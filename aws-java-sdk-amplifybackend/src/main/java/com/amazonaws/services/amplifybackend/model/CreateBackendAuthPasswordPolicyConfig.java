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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The password policy configuration for the backend to your Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuthPasswordPolicyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendAuthPasswordPolicyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional constraints for the password used to access the backend of your Amplify project.
     * </p>
     */
    private java.util.List<String> additionalConstraints;
    /**
     * <p>
     * The minimum length of the password used to access the backend of your Amplify project.
     * </p>
     */
    private Double minimumLength;

    /**
     * <p>
     * Additional constraints for the password used to access the backend of your Amplify project.
     * </p>
     * 
     * @return Additional constraints for the password used to access the backend of your Amplify project.
     * @see AdditionalConstraintsElement
     */

    public java.util.List<String> getAdditionalConstraints() {
        return additionalConstraints;
    }

    /**
     * <p>
     * Additional constraints for the password used to access the backend of your Amplify project.
     * </p>
     * 
     * @param additionalConstraints
     *        Additional constraints for the password used to access the backend of your Amplify project.
     * @see AdditionalConstraintsElement
     */

    public void setAdditionalConstraints(java.util.Collection<String> additionalConstraints) {
        if (additionalConstraints == null) {
            this.additionalConstraints = null;
            return;
        }

        this.additionalConstraints = new java.util.ArrayList<String>(additionalConstraints);
    }

    /**
     * <p>
     * Additional constraints for the password used to access the backend of your Amplify project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalConstraints(java.util.Collection)} or
     * {@link #withAdditionalConstraints(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalConstraints
     *        Additional constraints for the password used to access the backend of your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalConstraintsElement
     */

    public CreateBackendAuthPasswordPolicyConfig withAdditionalConstraints(String... additionalConstraints) {
        if (this.additionalConstraints == null) {
            setAdditionalConstraints(new java.util.ArrayList<String>(additionalConstraints.length));
        }
        for (String ele : additionalConstraints) {
            this.additionalConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional constraints for the password used to access the backend of your Amplify project.
     * </p>
     * 
     * @param additionalConstraints
     *        Additional constraints for the password used to access the backend of your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalConstraintsElement
     */

    public CreateBackendAuthPasswordPolicyConfig withAdditionalConstraints(java.util.Collection<String> additionalConstraints) {
        setAdditionalConstraints(additionalConstraints);
        return this;
    }

    /**
     * <p>
     * Additional constraints for the password used to access the backend of your Amplify project.
     * </p>
     * 
     * @param additionalConstraints
     *        Additional constraints for the password used to access the backend of your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalConstraintsElement
     */

    public CreateBackendAuthPasswordPolicyConfig withAdditionalConstraints(AdditionalConstraintsElement... additionalConstraints) {
        java.util.ArrayList<String> additionalConstraintsCopy = new java.util.ArrayList<String>(additionalConstraints.length);
        for (AdditionalConstraintsElement value : additionalConstraints) {
            additionalConstraintsCopy.add(value.toString());
        }
        if (getAdditionalConstraints() == null) {
            setAdditionalConstraints(additionalConstraintsCopy);
        } else {
            getAdditionalConstraints().addAll(additionalConstraintsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum length of the password used to access the backend of your Amplify project.
     * </p>
     * 
     * @param minimumLength
     *        The minimum length of the password used to access the backend of your Amplify project.
     */

    public void setMinimumLength(Double minimumLength) {
        this.minimumLength = minimumLength;
    }

    /**
     * <p>
     * The minimum length of the password used to access the backend of your Amplify project.
     * </p>
     * 
     * @return The minimum length of the password used to access the backend of your Amplify project.
     */

    public Double getMinimumLength() {
        return this.minimumLength;
    }

    /**
     * <p>
     * The minimum length of the password used to access the backend of your Amplify project.
     * </p>
     * 
     * @param minimumLength
     *        The minimum length of the password used to access the backend of your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthPasswordPolicyConfig withMinimumLength(Double minimumLength) {
        setMinimumLength(minimumLength);
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
        if (getAdditionalConstraints() != null)
            sb.append("AdditionalConstraints: ").append(getAdditionalConstraints()).append(",");
        if (getMinimumLength() != null)
            sb.append("MinimumLength: ").append(getMinimumLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendAuthPasswordPolicyConfig == false)
            return false;
        CreateBackendAuthPasswordPolicyConfig other = (CreateBackendAuthPasswordPolicyConfig) obj;
        if (other.getAdditionalConstraints() == null ^ this.getAdditionalConstraints() == null)
            return false;
        if (other.getAdditionalConstraints() != null && other.getAdditionalConstraints().equals(this.getAdditionalConstraints()) == false)
            return false;
        if (other.getMinimumLength() == null ^ this.getMinimumLength() == null)
            return false;
        if (other.getMinimumLength() != null && other.getMinimumLength().equals(this.getMinimumLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalConstraints() == null) ? 0 : getAdditionalConstraints().hashCode());
        hashCode = prime * hashCode + ((getMinimumLength() == null) ? 0 : getMinimumLength().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendAuthPasswordPolicyConfig clone() {
        try {
            return (CreateBackendAuthPasswordPolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.CreateBackendAuthPasswordPolicyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
