/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Entity that comprises information on monotonic values in the data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/MonotonicValues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonotonicValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether there is a potential data issue related to having monotonic values.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * </p>
     */
    private String monotonicity;

    /**
     * <p>
     * Indicates whether there is a potential data issue related to having monotonic values.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to having monotonic values.
     * @see StatisticalIssueStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to having monotonic values.
     * </p>
     * 
     * @return Indicates whether there is a potential data issue related to having monotonic values.
     * @see StatisticalIssueStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to having monotonic values.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to having monotonic values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticalIssueStatus
     */

    public MonotonicValues withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to having monotonic values.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to having monotonic values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticalIssueStatus
     */

    public MonotonicValues withStatus(StatisticalIssueStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * </p>
     * 
     * @param monotonicity
     *        Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * @see Monotonicity
     */

    public void setMonotonicity(String monotonicity) {
        this.monotonicity = monotonicity;
    }

    /**
     * <p>
     * Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * </p>
     * 
     * @return Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * @see Monotonicity
     */

    public String getMonotonicity() {
        return this.monotonicity;
    }

    /**
     * <p>
     * Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * </p>
     * 
     * @param monotonicity
     *        Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Monotonicity
     */

    public MonotonicValues withMonotonicity(String monotonicity) {
        setMonotonicity(monotonicity);
        return this;
    }

    /**
     * <p>
     * Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * </p>
     * 
     * @param monotonicity
     *        Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Monotonicity
     */

    public MonotonicValues withMonotonicity(Monotonicity monotonicity) {
        this.monotonicity = monotonicity.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMonotonicity() != null)
            sb.append("Monotonicity: ").append(getMonotonicity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonotonicValues == false)
            return false;
        MonotonicValues other = (MonotonicValues) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMonotonicity() == null ^ this.getMonotonicity() == null)
            return false;
        if (other.getMonotonicity() != null && other.getMonotonicity().equals(this.getMonotonicity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMonotonicity() == null) ? 0 : getMonotonicity().hashCode());
        return hashCode;
    }

    @Override
    public MonotonicValues clone() {
        try {
            return (MonotonicValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.MonotonicValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
