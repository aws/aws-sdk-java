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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The epsilon and noise parameter values that were used for the differential privacy template.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DifferentialPrivacyTemplateParametersOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DifferentialPrivacyTemplateParametersOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The epsilon value that you specified.
     * </p>
     */
    private Integer epsilon;
    /**
     * <p>
     * Noise added per query is measured in terms of the number of users whose contributions you want to obscure. This
     * value governs the rate at which the privacy budget is depleted.
     * </p>
     */
    private Integer usersNoisePerQuery;

    /**
     * <p>
     * The epsilon value that you specified.
     * </p>
     * 
     * @param epsilon
     *        The epsilon value that you specified.
     */

    public void setEpsilon(Integer epsilon) {
        this.epsilon = epsilon;
    }

    /**
     * <p>
     * The epsilon value that you specified.
     * </p>
     * 
     * @return The epsilon value that you specified.
     */

    public Integer getEpsilon() {
        return this.epsilon;
    }

    /**
     * <p>
     * The epsilon value that you specified.
     * </p>
     * 
     * @param epsilon
     *        The epsilon value that you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyTemplateParametersOutput withEpsilon(Integer epsilon) {
        setEpsilon(epsilon);
        return this;
    }

    /**
     * <p>
     * Noise added per query is measured in terms of the number of users whose contributions you want to obscure. This
     * value governs the rate at which the privacy budget is depleted.
     * </p>
     * 
     * @param usersNoisePerQuery
     *        Noise added per query is measured in terms of the number of users whose contributions you want to obscure.
     *        This value governs the rate at which the privacy budget is depleted.
     */

    public void setUsersNoisePerQuery(Integer usersNoisePerQuery) {
        this.usersNoisePerQuery = usersNoisePerQuery;
    }

    /**
     * <p>
     * Noise added per query is measured in terms of the number of users whose contributions you want to obscure. This
     * value governs the rate at which the privacy budget is depleted.
     * </p>
     * 
     * @return Noise added per query is measured in terms of the number of users whose contributions you want to
     *         obscure. This value governs the rate at which the privacy budget is depleted.
     */

    public Integer getUsersNoisePerQuery() {
        return this.usersNoisePerQuery;
    }

    /**
     * <p>
     * Noise added per query is measured in terms of the number of users whose contributions you want to obscure. This
     * value governs the rate at which the privacy budget is depleted.
     * </p>
     * 
     * @param usersNoisePerQuery
     *        Noise added per query is measured in terms of the number of users whose contributions you want to obscure.
     *        This value governs the rate at which the privacy budget is depleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyTemplateParametersOutput withUsersNoisePerQuery(Integer usersNoisePerQuery) {
        setUsersNoisePerQuery(usersNoisePerQuery);
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
        if (getEpsilon() != null)
            sb.append("Epsilon: ").append(getEpsilon()).append(",");
        if (getUsersNoisePerQuery() != null)
            sb.append("UsersNoisePerQuery: ").append(getUsersNoisePerQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DifferentialPrivacyTemplateParametersOutput == false)
            return false;
        DifferentialPrivacyTemplateParametersOutput other = (DifferentialPrivacyTemplateParametersOutput) obj;
        if (other.getEpsilon() == null ^ this.getEpsilon() == null)
            return false;
        if (other.getEpsilon() != null && other.getEpsilon().equals(this.getEpsilon()) == false)
            return false;
        if (other.getUsersNoisePerQuery() == null ^ this.getUsersNoisePerQuery() == null)
            return false;
        if (other.getUsersNoisePerQuery() != null && other.getUsersNoisePerQuery().equals(this.getUsersNoisePerQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEpsilon() == null) ? 0 : getEpsilon().hashCode());
        hashCode = prime * hashCode + ((getUsersNoisePerQuery() == null) ? 0 : getUsersNoisePerQuery().hashCode());
        return hashCode;
    }

    @Override
    public DifferentialPrivacyTemplateParametersOutput clone() {
        try {
            return (DifferentialPrivacyTemplateParametersOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.DifferentialPrivacyTemplateParametersOutputMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
