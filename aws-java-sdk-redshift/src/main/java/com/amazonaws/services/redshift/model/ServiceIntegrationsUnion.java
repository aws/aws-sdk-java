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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A list of service integrations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ServiceIntegrationsUnion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceIntegrationsUnion implements Serializable, Cloneable {

    /**
     * <p>
     * A list of scopes set up for Lake Formation integration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LakeFormationScopeUnion> lakeFormation;

    /**
     * <p>
     * A list of scopes set up for Lake Formation integration.
     * </p>
     * 
     * @return A list of scopes set up for Lake Formation integration.
     */

    public java.util.List<LakeFormationScopeUnion> getLakeFormation() {
        if (lakeFormation == null) {
            lakeFormation = new com.amazonaws.internal.SdkInternalList<LakeFormationScopeUnion>();
        }
        return lakeFormation;
    }

    /**
     * <p>
     * A list of scopes set up for Lake Formation integration.
     * </p>
     * 
     * @param lakeFormation
     *        A list of scopes set up for Lake Formation integration.
     */

    public void setLakeFormation(java.util.Collection<LakeFormationScopeUnion> lakeFormation) {
        if (lakeFormation == null) {
            this.lakeFormation = null;
            return;
        }

        this.lakeFormation = new com.amazonaws.internal.SdkInternalList<LakeFormationScopeUnion>(lakeFormation);
    }

    /**
     * <p>
     * A list of scopes set up for Lake Formation integration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLakeFormation(java.util.Collection)} or {@link #withLakeFormation(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param lakeFormation
     *        A list of scopes set up for Lake Formation integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceIntegrationsUnion withLakeFormation(LakeFormationScopeUnion... lakeFormation) {
        if (this.lakeFormation == null) {
            setLakeFormation(new com.amazonaws.internal.SdkInternalList<LakeFormationScopeUnion>(lakeFormation.length));
        }
        for (LakeFormationScopeUnion ele : lakeFormation) {
            this.lakeFormation.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of scopes set up for Lake Formation integration.
     * </p>
     * 
     * @param lakeFormation
     *        A list of scopes set up for Lake Formation integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceIntegrationsUnion withLakeFormation(java.util.Collection<LakeFormationScopeUnion> lakeFormation) {
        setLakeFormation(lakeFormation);
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
        if (getLakeFormation() != null)
            sb.append("LakeFormation: ").append(getLakeFormation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceIntegrationsUnion == false)
            return false;
        ServiceIntegrationsUnion other = (ServiceIntegrationsUnion) obj;
        if (other.getLakeFormation() == null ^ this.getLakeFormation() == null)
            return false;
        if (other.getLakeFormation() != null && other.getLakeFormation().equals(this.getLakeFormation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLakeFormation() == null) ? 0 : getLakeFormation().hashCode());
        return hashCode;
    }

    @Override
    public ServiceIntegrationsUnion clone() {
        try {
            return (ServiceIntegrationsUnion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
