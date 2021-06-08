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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics about the images in a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DatasetImageStats" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetImageStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     */
    private Integer total;
    /**
     * <p>
     * The total number of labeled images.
     * </p>
     */
    private Integer labeled;
    /**
     * <p>
     * The total number of images labeled as normal.
     * </p>
     */
    private Integer normal;
    /**
     * <p>
     * the total number of images labeled as an anomaly.
     * </p>
     */
    private Integer anomaly;

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * 
     * @param total
     *        The total number of images in the dataset.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * 
     * @return The total number of images in the dataset.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * 
     * @param total
     *        The total number of images in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImageStats withTotal(Integer total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The total number of labeled images.
     * </p>
     * 
     * @param labeled
     *        The total number of labeled images.
     */

    public void setLabeled(Integer labeled) {
        this.labeled = labeled;
    }

    /**
     * <p>
     * The total number of labeled images.
     * </p>
     * 
     * @return The total number of labeled images.
     */

    public Integer getLabeled() {
        return this.labeled;
    }

    /**
     * <p>
     * The total number of labeled images.
     * </p>
     * 
     * @param labeled
     *        The total number of labeled images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImageStats withLabeled(Integer labeled) {
        setLabeled(labeled);
        return this;
    }

    /**
     * <p>
     * The total number of images labeled as normal.
     * </p>
     * 
     * @param normal
     *        The total number of images labeled as normal.
     */

    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    /**
     * <p>
     * The total number of images labeled as normal.
     * </p>
     * 
     * @return The total number of images labeled as normal.
     */

    public Integer getNormal() {
        return this.normal;
    }

    /**
     * <p>
     * The total number of images labeled as normal.
     * </p>
     * 
     * @param normal
     *        The total number of images labeled as normal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImageStats withNormal(Integer normal) {
        setNormal(normal);
        return this;
    }

    /**
     * <p>
     * the total number of images labeled as an anomaly.
     * </p>
     * 
     * @param anomaly
     *        the total number of images labeled as an anomaly.
     */

    public void setAnomaly(Integer anomaly) {
        this.anomaly = anomaly;
    }

    /**
     * <p>
     * the total number of images labeled as an anomaly.
     * </p>
     * 
     * @return the total number of images labeled as an anomaly.
     */

    public Integer getAnomaly() {
        return this.anomaly;
    }

    /**
     * <p>
     * the total number of images labeled as an anomaly.
     * </p>
     * 
     * @param anomaly
     *        the total number of images labeled as an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImageStats withAnomaly(Integer anomaly) {
        setAnomaly(anomaly);
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getLabeled() != null)
            sb.append("Labeled: ").append(getLabeled()).append(",");
        if (getNormal() != null)
            sb.append("Normal: ").append(getNormal()).append(",");
        if (getAnomaly() != null)
            sb.append("Anomaly: ").append(getAnomaly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetImageStats == false)
            return false;
        DatasetImageStats other = (DatasetImageStats) obj;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getLabeled() == null ^ this.getLabeled() == null)
            return false;
        if (other.getLabeled() != null && other.getLabeled().equals(this.getLabeled()) == false)
            return false;
        if (other.getNormal() == null ^ this.getNormal() == null)
            return false;
        if (other.getNormal() != null && other.getNormal().equals(this.getNormal()) == false)
            return false;
        if (other.getAnomaly() == null ^ this.getAnomaly() == null)
            return false;
        if (other.getAnomaly() != null && other.getAnomaly().equals(this.getAnomaly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getLabeled() == null) ? 0 : getLabeled().hashCode());
        hashCode = prime * hashCode + ((getNormal() == null) ? 0 : getNormal().hashCode());
        hashCode = prime * hashCode + ((getAnomaly() == null) ? 0 : getAnomaly().hashCode());
        return hashCode;
    }

    @Override
    public DatasetImageStats clone() {
        try {
            return (DatasetImageStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.DatasetImageStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
