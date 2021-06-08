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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about worlds that finished.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/FinishedWorldsSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FinishedWorldsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of finished worlds.
     * </p>
     */
    private Integer finishedCount;
    /**
     * <p>
     * A list of worlds that succeeded.
     * </p>
     */
    private java.util.List<String> succeededWorlds;
    /**
     * <p>
     * Information about worlds that failed.
     * </p>
     */
    private FailureSummary failureSummary;

    /**
     * <p>
     * The total number of finished worlds.
     * </p>
     * 
     * @param finishedCount
     *        The total number of finished worlds.
     */

    public void setFinishedCount(Integer finishedCount) {
        this.finishedCount = finishedCount;
    }

    /**
     * <p>
     * The total number of finished worlds.
     * </p>
     * 
     * @return The total number of finished worlds.
     */

    public Integer getFinishedCount() {
        return this.finishedCount;
    }

    /**
     * <p>
     * The total number of finished worlds.
     * </p>
     * 
     * @param finishedCount
     *        The total number of finished worlds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FinishedWorldsSummary withFinishedCount(Integer finishedCount) {
        setFinishedCount(finishedCount);
        return this;
    }

    /**
     * <p>
     * A list of worlds that succeeded.
     * </p>
     * 
     * @return A list of worlds that succeeded.
     */

    public java.util.List<String> getSucceededWorlds() {
        return succeededWorlds;
    }

    /**
     * <p>
     * A list of worlds that succeeded.
     * </p>
     * 
     * @param succeededWorlds
     *        A list of worlds that succeeded.
     */

    public void setSucceededWorlds(java.util.Collection<String> succeededWorlds) {
        if (succeededWorlds == null) {
            this.succeededWorlds = null;
            return;
        }

        this.succeededWorlds = new java.util.ArrayList<String>(succeededWorlds);
    }

    /**
     * <p>
     * A list of worlds that succeeded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSucceededWorlds(java.util.Collection)} or {@link #withSucceededWorlds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param succeededWorlds
     *        A list of worlds that succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FinishedWorldsSummary withSucceededWorlds(String... succeededWorlds) {
        if (this.succeededWorlds == null) {
            setSucceededWorlds(new java.util.ArrayList<String>(succeededWorlds.length));
        }
        for (String ele : succeededWorlds) {
            this.succeededWorlds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of worlds that succeeded.
     * </p>
     * 
     * @param succeededWorlds
     *        A list of worlds that succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FinishedWorldsSummary withSucceededWorlds(java.util.Collection<String> succeededWorlds) {
        setSucceededWorlds(succeededWorlds);
        return this;
    }

    /**
     * <p>
     * Information about worlds that failed.
     * </p>
     * 
     * @param failureSummary
     *        Information about worlds that failed.
     */

    public void setFailureSummary(FailureSummary failureSummary) {
        this.failureSummary = failureSummary;
    }

    /**
     * <p>
     * Information about worlds that failed.
     * </p>
     * 
     * @return Information about worlds that failed.
     */

    public FailureSummary getFailureSummary() {
        return this.failureSummary;
    }

    /**
     * <p>
     * Information about worlds that failed.
     * </p>
     * 
     * @param failureSummary
     *        Information about worlds that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FinishedWorldsSummary withFailureSummary(FailureSummary failureSummary) {
        setFailureSummary(failureSummary);
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
        if (getFinishedCount() != null)
            sb.append("FinishedCount: ").append(getFinishedCount()).append(",");
        if (getSucceededWorlds() != null)
            sb.append("SucceededWorlds: ").append(getSucceededWorlds()).append(",");
        if (getFailureSummary() != null)
            sb.append("FailureSummary: ").append(getFailureSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FinishedWorldsSummary == false)
            return false;
        FinishedWorldsSummary other = (FinishedWorldsSummary) obj;
        if (other.getFinishedCount() == null ^ this.getFinishedCount() == null)
            return false;
        if (other.getFinishedCount() != null && other.getFinishedCount().equals(this.getFinishedCount()) == false)
            return false;
        if (other.getSucceededWorlds() == null ^ this.getSucceededWorlds() == null)
            return false;
        if (other.getSucceededWorlds() != null && other.getSucceededWorlds().equals(this.getSucceededWorlds()) == false)
            return false;
        if (other.getFailureSummary() == null ^ this.getFailureSummary() == null)
            return false;
        if (other.getFailureSummary() != null && other.getFailureSummary().equals(this.getFailureSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinishedCount() == null) ? 0 : getFinishedCount().hashCode());
        hashCode = prime * hashCode + ((getSucceededWorlds() == null) ? 0 : getSucceededWorlds().hashCode());
        hashCode = prime * hashCode + ((getFailureSummary() == null) ? 0 : getFailureSummary().hashCode());
        return hashCode;
    }

    @Override
    public FinishedWorldsSummary clone() {
        try {
            return (FinishedWorldsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.FinishedWorldsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
