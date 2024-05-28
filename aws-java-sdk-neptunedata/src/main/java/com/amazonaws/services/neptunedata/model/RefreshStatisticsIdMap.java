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
 * Statistics for <code>REFRESH</code> mode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/RefreshStatisticsIdMap" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshStatisticsIdMap implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the statistics generation run that is currently occurring.
     * </p>
     */
    private String statisticsId;

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

    public RefreshStatisticsIdMap withStatisticsId(String statisticsId) {
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

        if (obj instanceof RefreshStatisticsIdMap == false)
            return false;
        RefreshStatisticsIdMap other = (RefreshStatisticsIdMap) obj;
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

        hashCode = prime * hashCode + ((getStatisticsId() == null) ? 0 : getStatisticsId().hashCode());
        return hashCode;
    }

    @Override
    public RefreshStatisticsIdMap clone() {
        try {
            return (RefreshStatisticsIdMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.RefreshStatisticsIdMapMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
