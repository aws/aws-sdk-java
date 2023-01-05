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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the valid range of work unit IDs for querying the execution service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/WorkUnitRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkUnitRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the maximum work unit ID in the range. The maximum value is inclusive.
     * </p>
     */
    private Long workUnitIdMax;
    /**
     * <p>
     * Defines the minimum work unit ID in the range.
     * </p>
     */
    private Long workUnitIdMin;
    /**
     * <p>
     * A work token used to query the execution service.
     * </p>
     */
    private String workUnitToken;

    /**
     * <p>
     * Defines the maximum work unit ID in the range. The maximum value is inclusive.
     * </p>
     * 
     * @param workUnitIdMax
     *        Defines the maximum work unit ID in the range. The maximum value is inclusive.
     */

    public void setWorkUnitIdMax(Long workUnitIdMax) {
        this.workUnitIdMax = workUnitIdMax;
    }

    /**
     * <p>
     * Defines the maximum work unit ID in the range. The maximum value is inclusive.
     * </p>
     * 
     * @return Defines the maximum work unit ID in the range. The maximum value is inclusive.
     */

    public Long getWorkUnitIdMax() {
        return this.workUnitIdMax;
    }

    /**
     * <p>
     * Defines the maximum work unit ID in the range. The maximum value is inclusive.
     * </p>
     * 
     * @param workUnitIdMax
     *        Defines the maximum work unit ID in the range. The maximum value is inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkUnitRange withWorkUnitIdMax(Long workUnitIdMax) {
        setWorkUnitIdMax(workUnitIdMax);
        return this;
    }

    /**
     * <p>
     * Defines the minimum work unit ID in the range.
     * </p>
     * 
     * @param workUnitIdMin
     *        Defines the minimum work unit ID in the range.
     */

    public void setWorkUnitIdMin(Long workUnitIdMin) {
        this.workUnitIdMin = workUnitIdMin;
    }

    /**
     * <p>
     * Defines the minimum work unit ID in the range.
     * </p>
     * 
     * @return Defines the minimum work unit ID in the range.
     */

    public Long getWorkUnitIdMin() {
        return this.workUnitIdMin;
    }

    /**
     * <p>
     * Defines the minimum work unit ID in the range.
     * </p>
     * 
     * @param workUnitIdMin
     *        Defines the minimum work unit ID in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkUnitRange withWorkUnitIdMin(Long workUnitIdMin) {
        setWorkUnitIdMin(workUnitIdMin);
        return this;
    }

    /**
     * <p>
     * A work token used to query the execution service.
     * </p>
     * 
     * @param workUnitToken
     *        A work token used to query the execution service.
     */

    public void setWorkUnitToken(String workUnitToken) {
        this.workUnitToken = workUnitToken;
    }

    /**
     * <p>
     * A work token used to query the execution service.
     * </p>
     * 
     * @return A work token used to query the execution service.
     */

    public String getWorkUnitToken() {
        return this.workUnitToken;
    }

    /**
     * <p>
     * A work token used to query the execution service.
     * </p>
     * 
     * @param workUnitToken
     *        A work token used to query the execution service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkUnitRange withWorkUnitToken(String workUnitToken) {
        setWorkUnitToken(workUnitToken);
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
        if (getWorkUnitIdMax() != null)
            sb.append("WorkUnitIdMax: ").append(getWorkUnitIdMax()).append(",");
        if (getWorkUnitIdMin() != null)
            sb.append("WorkUnitIdMin: ").append(getWorkUnitIdMin()).append(",");
        if (getWorkUnitToken() != null)
            sb.append("WorkUnitToken: ").append(getWorkUnitToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkUnitRange == false)
            return false;
        WorkUnitRange other = (WorkUnitRange) obj;
        if (other.getWorkUnitIdMax() == null ^ this.getWorkUnitIdMax() == null)
            return false;
        if (other.getWorkUnitIdMax() != null && other.getWorkUnitIdMax().equals(this.getWorkUnitIdMax()) == false)
            return false;
        if (other.getWorkUnitIdMin() == null ^ this.getWorkUnitIdMin() == null)
            return false;
        if (other.getWorkUnitIdMin() != null && other.getWorkUnitIdMin().equals(this.getWorkUnitIdMin()) == false)
            return false;
        if (other.getWorkUnitToken() == null ^ this.getWorkUnitToken() == null)
            return false;
        if (other.getWorkUnitToken() != null && other.getWorkUnitToken().equals(this.getWorkUnitToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkUnitIdMax() == null) ? 0 : getWorkUnitIdMax().hashCode());
        hashCode = prime * hashCode + ((getWorkUnitIdMin() == null) ? 0 : getWorkUnitIdMin().hashCode());
        hashCode = prime * hashCode + ((getWorkUnitToken() == null) ? 0 : getWorkUnitToken().hashCode());
        return hashCode;
    }

    @Override
    public WorkUnitRange clone() {
        try {
            return (WorkUnitRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.WorkUnitRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
