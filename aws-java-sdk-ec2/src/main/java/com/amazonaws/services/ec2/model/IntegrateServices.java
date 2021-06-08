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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes service integrations with VPC Flow logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IntegrateServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntegrateServices implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the integration with Amazon Athena.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AthenaIntegration> athenaIntegrations;

    /**
     * <p>
     * Information about the integration with Amazon Athena.
     * </p>
     * 
     * @return Information about the integration with Amazon Athena.
     */

    public java.util.List<AthenaIntegration> getAthenaIntegrations() {
        if (athenaIntegrations == null) {
            athenaIntegrations = new com.amazonaws.internal.SdkInternalList<AthenaIntegration>();
        }
        return athenaIntegrations;
    }

    /**
     * <p>
     * Information about the integration with Amazon Athena.
     * </p>
     * 
     * @param athenaIntegrations
     *        Information about the integration with Amazon Athena.
     */

    public void setAthenaIntegrations(java.util.Collection<AthenaIntegration> athenaIntegrations) {
        if (athenaIntegrations == null) {
            this.athenaIntegrations = null;
            return;
        }

        this.athenaIntegrations = new com.amazonaws.internal.SdkInternalList<AthenaIntegration>(athenaIntegrations);
    }

    /**
     * <p>
     * Information about the integration with Amazon Athena.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAthenaIntegrations(java.util.Collection)} or {@link #withAthenaIntegrations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param athenaIntegrations
     *        Information about the integration with Amazon Athena.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegrateServices withAthenaIntegrations(AthenaIntegration... athenaIntegrations) {
        if (this.athenaIntegrations == null) {
            setAthenaIntegrations(new com.amazonaws.internal.SdkInternalList<AthenaIntegration>(athenaIntegrations.length));
        }
        for (AthenaIntegration ele : athenaIntegrations) {
            this.athenaIntegrations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the integration with Amazon Athena.
     * </p>
     * 
     * @param athenaIntegrations
     *        Information about the integration with Amazon Athena.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegrateServices withAthenaIntegrations(java.util.Collection<AthenaIntegration> athenaIntegrations) {
        setAthenaIntegrations(athenaIntegrations);
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
        if (getAthenaIntegrations() != null)
            sb.append("AthenaIntegrations: ").append(getAthenaIntegrations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntegrateServices == false)
            return false;
        IntegrateServices other = (IntegrateServices) obj;
        if (other.getAthenaIntegrations() == null ^ this.getAthenaIntegrations() == null)
            return false;
        if (other.getAthenaIntegrations() != null && other.getAthenaIntegrations().equals(this.getAthenaIntegrations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAthenaIntegrations() == null) ? 0 : getAthenaIntegrations().hashCode());
        return hashCode;
    }

    @Override
    public IntegrateServices clone() {
        try {
            return (IntegrateServices) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
