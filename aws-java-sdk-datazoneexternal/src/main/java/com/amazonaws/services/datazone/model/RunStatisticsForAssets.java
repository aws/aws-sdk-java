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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The asset statistics from the data source run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RunStatisticsForAssets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunStatisticsForAssets implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>added</code> statistic for the data source run.
     * </p>
     */
    private Integer added;
    /**
     * <p>
     * The <code>failed</code> statistic for the data source run.
     * </p>
     */
    private Integer failed;
    /**
     * <p>
     * The <code>skipped</code> statistic for the data source run.
     * </p>
     */
    private Integer skipped;
    /**
     * <p>
     * The <code>unchanged</code> statistic for the data source run.
     * </p>
     */
    private Integer unchanged;
    /**
     * <p>
     * The <code>updated</code> statistic for the data source run.
     * </p>
     */
    private Integer updated;

    /**
     * <p>
     * The <code>added</code> statistic for the data source run.
     * </p>
     * 
     * @param added
     *        The <code>added</code> statistic for the data source run.
     */

    public void setAdded(Integer added) {
        this.added = added;
    }

    /**
     * <p>
     * The <code>added</code> statistic for the data source run.
     * </p>
     * 
     * @return The <code>added</code> statistic for the data source run.
     */

    public Integer getAdded() {
        return this.added;
    }

    /**
     * <p>
     * The <code>added</code> statistic for the data source run.
     * </p>
     * 
     * @param added
     *        The <code>added</code> statistic for the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunStatisticsForAssets withAdded(Integer added) {
        setAdded(added);
        return this;
    }

    /**
     * <p>
     * The <code>failed</code> statistic for the data source run.
     * </p>
     * 
     * @param failed
     *        The <code>failed</code> statistic for the data source run.
     */

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The <code>failed</code> statistic for the data source run.
     * </p>
     * 
     * @return The <code>failed</code> statistic for the data source run.
     */

    public Integer getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The <code>failed</code> statistic for the data source run.
     * </p>
     * 
     * @param failed
     *        The <code>failed</code> statistic for the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunStatisticsForAssets withFailed(Integer failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * The <code>skipped</code> statistic for the data source run.
     * </p>
     * 
     * @param skipped
     *        The <code>skipped</code> statistic for the data source run.
     */

    public void setSkipped(Integer skipped) {
        this.skipped = skipped;
    }

    /**
     * <p>
     * The <code>skipped</code> statistic for the data source run.
     * </p>
     * 
     * @return The <code>skipped</code> statistic for the data source run.
     */

    public Integer getSkipped() {
        return this.skipped;
    }

    /**
     * <p>
     * The <code>skipped</code> statistic for the data source run.
     * </p>
     * 
     * @param skipped
     *        The <code>skipped</code> statistic for the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunStatisticsForAssets withSkipped(Integer skipped) {
        setSkipped(skipped);
        return this;
    }

    /**
     * <p>
     * The <code>unchanged</code> statistic for the data source run.
     * </p>
     * 
     * @param unchanged
     *        The <code>unchanged</code> statistic for the data source run.
     */

    public void setUnchanged(Integer unchanged) {
        this.unchanged = unchanged;
    }

    /**
     * <p>
     * The <code>unchanged</code> statistic for the data source run.
     * </p>
     * 
     * @return The <code>unchanged</code> statistic for the data source run.
     */

    public Integer getUnchanged() {
        return this.unchanged;
    }

    /**
     * <p>
     * The <code>unchanged</code> statistic for the data source run.
     * </p>
     * 
     * @param unchanged
     *        The <code>unchanged</code> statistic for the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunStatisticsForAssets withUnchanged(Integer unchanged) {
        setUnchanged(unchanged);
        return this;
    }

    /**
     * <p>
     * The <code>updated</code> statistic for the data source run.
     * </p>
     * 
     * @param updated
     *        The <code>updated</code> statistic for the data source run.
     */

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    /**
     * <p>
     * The <code>updated</code> statistic for the data source run.
     * </p>
     * 
     * @return The <code>updated</code> statistic for the data source run.
     */

    public Integer getUpdated() {
        return this.updated;
    }

    /**
     * <p>
     * The <code>updated</code> statistic for the data source run.
     * </p>
     * 
     * @param updated
     *        The <code>updated</code> statistic for the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunStatisticsForAssets withUpdated(Integer updated) {
        setUpdated(updated);
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
        if (getAdded() != null)
            sb.append("Added: ").append(getAdded()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getSkipped() != null)
            sb.append("Skipped: ").append(getSkipped()).append(",");
        if (getUnchanged() != null)
            sb.append("Unchanged: ").append(getUnchanged()).append(",");
        if (getUpdated() != null)
            sb.append("Updated: ").append(getUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunStatisticsForAssets == false)
            return false;
        RunStatisticsForAssets other = (RunStatisticsForAssets) obj;
        if (other.getAdded() == null ^ this.getAdded() == null)
            return false;
        if (other.getAdded() != null && other.getAdded().equals(this.getAdded()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getSkipped() == null ^ this.getSkipped() == null)
            return false;
        if (other.getSkipped() != null && other.getSkipped().equals(this.getSkipped()) == false)
            return false;
        if (other.getUnchanged() == null ^ this.getUnchanged() == null)
            return false;
        if (other.getUnchanged() != null && other.getUnchanged().equals(this.getUnchanged()) == false)
            return false;
        if (other.getUpdated() == null ^ this.getUpdated() == null)
            return false;
        if (other.getUpdated() != null && other.getUpdated().equals(this.getUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdded() == null) ? 0 : getAdded().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getSkipped() == null) ? 0 : getSkipped().hashCode());
        hashCode = prime * hashCode + ((getUnchanged() == null) ? 0 : getUnchanged().hashCode());
        hashCode = prime * hashCode + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return hashCode;
    }

    @Override
    public RunStatisticsForAssets clone() {
        try {
            return (RunStatisticsForAssets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RunStatisticsForAssetsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
