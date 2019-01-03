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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides counts for human-labeled tasks in the labeling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelCountersForWorkteam" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelCountersForWorkteam implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of data objects labeled by a human worker.
     * </p>
     */
    private Integer humanLabeled;
    /**
     * <p>
     * The total number of data objects that need to be labeled by a human worker.
     * </p>
     */
    private Integer pendingHuman;
    /**
     * <p>
     * The total number of tasks in the labeling job.
     * </p>
     */
    private Integer total;

    /**
     * <p>
     * The total number of data objects labeled by a human worker.
     * </p>
     * 
     * @param humanLabeled
     *        The total number of data objects labeled by a human worker.
     */

    public void setHumanLabeled(Integer humanLabeled) {
        this.humanLabeled = humanLabeled;
    }

    /**
     * <p>
     * The total number of data objects labeled by a human worker.
     * </p>
     * 
     * @return The total number of data objects labeled by a human worker.
     */

    public Integer getHumanLabeled() {
        return this.humanLabeled;
    }

    /**
     * <p>
     * The total number of data objects labeled by a human worker.
     * </p>
     * 
     * @param humanLabeled
     *        The total number of data objects labeled by a human worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelCountersForWorkteam withHumanLabeled(Integer humanLabeled) {
        setHumanLabeled(humanLabeled);
        return this;
    }

    /**
     * <p>
     * The total number of data objects that need to be labeled by a human worker.
     * </p>
     * 
     * @param pendingHuman
     *        The total number of data objects that need to be labeled by a human worker.
     */

    public void setPendingHuman(Integer pendingHuman) {
        this.pendingHuman = pendingHuman;
    }

    /**
     * <p>
     * The total number of data objects that need to be labeled by a human worker.
     * </p>
     * 
     * @return The total number of data objects that need to be labeled by a human worker.
     */

    public Integer getPendingHuman() {
        return this.pendingHuman;
    }

    /**
     * <p>
     * The total number of data objects that need to be labeled by a human worker.
     * </p>
     * 
     * @param pendingHuman
     *        The total number of data objects that need to be labeled by a human worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelCountersForWorkteam withPendingHuman(Integer pendingHuman) {
        setPendingHuman(pendingHuman);
        return this;
    }

    /**
     * <p>
     * The total number of tasks in the labeling job.
     * </p>
     * 
     * @param total
     *        The total number of tasks in the labeling job.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of tasks in the labeling job.
     * </p>
     * 
     * @return The total number of tasks in the labeling job.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of tasks in the labeling job.
     * </p>
     * 
     * @param total
     *        The total number of tasks in the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelCountersForWorkteam withTotal(Integer total) {
        setTotal(total);
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
        if (getHumanLabeled() != null)
            sb.append("HumanLabeled: ").append(getHumanLabeled()).append(",");
        if (getPendingHuman() != null)
            sb.append("PendingHuman: ").append(getPendingHuman()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelCountersForWorkteam == false)
            return false;
        LabelCountersForWorkteam other = (LabelCountersForWorkteam) obj;
        if (other.getHumanLabeled() == null ^ this.getHumanLabeled() == null)
            return false;
        if (other.getHumanLabeled() != null && other.getHumanLabeled().equals(this.getHumanLabeled()) == false)
            return false;
        if (other.getPendingHuman() == null ^ this.getPendingHuman() == null)
            return false;
        if (other.getPendingHuman() != null && other.getPendingHuman().equals(this.getPendingHuman()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanLabeled() == null) ? 0 : getHumanLabeled().hashCode());
        hashCode = prime * hashCode + ((getPendingHuman() == null) ? 0 : getPendingHuman().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public LabelCountersForWorkteam clone() {
        try {
            return (LabelCountersForWorkteam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelCountersForWorkteamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
