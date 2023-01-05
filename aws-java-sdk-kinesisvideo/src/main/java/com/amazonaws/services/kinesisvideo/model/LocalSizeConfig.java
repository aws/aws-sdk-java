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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details that include the maximum size of the media (<code>MaxLocalMediaSizeInMB</code>) that you
 * want to store for a stream on the Edge Agent, as well as the strategy that should be used (
 * <code>StrategyOnFullSize</code>) when a stream's maximum size has been reached.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/LocalSizeConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalSizeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The overall maximum size of the media that you want to store for a stream on the Edge Agent.
     * </p>
     */
    private Integer maxLocalMediaSizeInMB;
    /**
     * <p>
     * The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     */
    private String strategyOnFullSize;

    /**
     * <p>
     * The overall maximum size of the media that you want to store for a stream on the Edge Agent.
     * </p>
     * 
     * @param maxLocalMediaSizeInMB
     *        The overall maximum size of the media that you want to store for a stream on the Edge Agent.
     */

    public void setMaxLocalMediaSizeInMB(Integer maxLocalMediaSizeInMB) {
        this.maxLocalMediaSizeInMB = maxLocalMediaSizeInMB;
    }

    /**
     * <p>
     * The overall maximum size of the media that you want to store for a stream on the Edge Agent.
     * </p>
     * 
     * @return The overall maximum size of the media that you want to store for a stream on the Edge Agent.
     */

    public Integer getMaxLocalMediaSizeInMB() {
        return this.maxLocalMediaSizeInMB;
    }

    /**
     * <p>
     * The overall maximum size of the media that you want to store for a stream on the Edge Agent.
     * </p>
     * 
     * @param maxLocalMediaSizeInMB
     *        The overall maximum size of the media that you want to store for a stream on the Edge Agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalSizeConfig withMaxLocalMediaSizeInMB(Integer maxLocalMediaSizeInMB) {
        setMaxLocalMediaSizeInMB(maxLocalMediaSizeInMB);
        return this;
    }

    /**
     * <p>
     * The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * 
     * @param strategyOnFullSize
     *        The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * @see StrategyOnFullSize
     */

    public void setStrategyOnFullSize(String strategyOnFullSize) {
        this.strategyOnFullSize = strategyOnFullSize;
    }

    /**
     * <p>
     * The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * 
     * @return The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * @see StrategyOnFullSize
     */

    public String getStrategyOnFullSize() {
        return this.strategyOnFullSize;
    }

    /**
     * <p>
     * The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * 
     * @param strategyOnFullSize
     *        The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StrategyOnFullSize
     */

    public LocalSizeConfig withStrategyOnFullSize(String strategyOnFullSize) {
        setStrategyOnFullSize(strategyOnFullSize);
        return this;
    }

    /**
     * <p>
     * The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * </p>
     * 
     * @param strategyOnFullSize
     *        The strategy to perform when a stream’s <code>MaxLocalMediaSizeInMB</code> limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StrategyOnFullSize
     */

    public LocalSizeConfig withStrategyOnFullSize(StrategyOnFullSize strategyOnFullSize) {
        this.strategyOnFullSize = strategyOnFullSize.toString();
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
        if (getMaxLocalMediaSizeInMB() != null)
            sb.append("MaxLocalMediaSizeInMB: ").append(getMaxLocalMediaSizeInMB()).append(",");
        if (getStrategyOnFullSize() != null)
            sb.append("StrategyOnFullSize: ").append(getStrategyOnFullSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalSizeConfig == false)
            return false;
        LocalSizeConfig other = (LocalSizeConfig) obj;
        if (other.getMaxLocalMediaSizeInMB() == null ^ this.getMaxLocalMediaSizeInMB() == null)
            return false;
        if (other.getMaxLocalMediaSizeInMB() != null && other.getMaxLocalMediaSizeInMB().equals(this.getMaxLocalMediaSizeInMB()) == false)
            return false;
        if (other.getStrategyOnFullSize() == null ^ this.getStrategyOnFullSize() == null)
            return false;
        if (other.getStrategyOnFullSize() != null && other.getStrategyOnFullSize().equals(this.getStrategyOnFullSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxLocalMediaSizeInMB() == null) ? 0 : getMaxLocalMediaSizeInMB().hashCode());
        hashCode = prime * hashCode + ((getStrategyOnFullSize() == null) ? 0 : getStrategyOnFullSize().hashCode());
        return hashCode;
    }

    @Override
    public LocalSizeConfig clone() {
        try {
            return (LocalSizeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.LocalSizeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
