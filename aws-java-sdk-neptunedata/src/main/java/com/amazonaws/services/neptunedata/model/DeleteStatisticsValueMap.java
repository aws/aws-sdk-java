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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The payload for DeleteStatistics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/DeleteStatisticsValueMap"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStatisticsValueMap implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the statistics.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * The ID of the statistics generation run that is currently occurring.
     * </p>
     */
    private String statisticsId;

    /**
     * <p>
     * The current status of the statistics.
     * </p>
     * 
     * @param active
     *        The current status of the statistics.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * The current status of the statistics.
     * </p>
     * 
     * @return The current status of the statistics.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * The current status of the statistics.
     * </p>
     * 
     * @param active
     *        The current status of the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStatisticsValueMap withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * The current status of the statistics.
     * </p>
     * 
     * @return The current status of the statistics.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * The ID of the statistics generation run that is currently occurring.
     * </p>
     * 
     * @param statisticsId
     *        The ID of the statistics generation run that is currently occurring.
     */

    public void setStatisticsId(String statisticsId) {
        this.statisticsId = statisticsId;
    }

    /**
     * <p>
     * The ID of the statistics generation run that is currently occurring.
     * </p>
     * 
     * @return The ID of the statistics generation run that is currently occurring.
     */

    public String getStatisticsId() {
        return this.statisticsId;
    }

    /**
     * <p>
     * The ID of the statistics generation run that is currently occurring.
     * </p>
     * 
     * @param statisticsId
     *        The ID of the statistics generation run that is currently occurring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStatisticsValueMap withStatisticsId(String statisticsId) {
        setStatisticsId(statisticsId);
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
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getStatisticsId() != null)
            sb.append("StatisticsId: ").append(getStatisticsId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStatisticsValueMap == false)
            return false;
        DeleteStatisticsValueMap other = (DeleteStatisticsValueMap) obj;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getStatisticsId() == null ^ this.getStatisticsId() == null)
            return false;
        if (other.getStatisticsId() != null && other.getStatisticsId().equals(this.getStatisticsId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getStatisticsId() == null) ? 0 : getStatisticsId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStatisticsValueMap clone() {
        try {
            return (DeleteStatisticsValueMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.DeleteStatisticsValueMapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
