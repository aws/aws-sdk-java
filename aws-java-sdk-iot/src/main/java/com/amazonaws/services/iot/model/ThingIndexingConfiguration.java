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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The thing indexing configuration. For more information, see <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html">Managing Thing Indexing</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingIndexingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String thingIndexingMode;
    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String thingConnectivityIndexingMode;

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingIndexingMode
     *        Thing indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        REGISTRY – Your thing index contains registry data only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing indexing is disabled.
     *        </p>
     *        </li>
     * @see ThingIndexingMode
     */

    public void setThingIndexingMode(String thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Thing indexing mode. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         REGISTRY – Your thing index contains registry data only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Thing indexing is disabled.
     *         </p>
     *         </li>
     * @see ThingIndexingMode
     */

    public String getThingIndexingMode() {
        return this.thingIndexingMode;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingIndexingMode
     *        Thing indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        REGISTRY – Your thing index contains registry data only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing indexing is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingIndexingMode
     */

    public ThingIndexingConfiguration withThingIndexingMode(String thingIndexingMode) {
        setThingIndexingMode(thingIndexingMode);
        return this;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingIndexingMode
     *        Thing indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        REGISTRY – Your thing index contains registry data only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing indexing is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingIndexingMode
     */

    public ThingIndexingConfiguration withThingIndexingMode(ThingIndexingMode thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingConnectivityIndexingMode
     *        Thing connectivity indexing mode. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     *        thingIndexMode must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing connectivity status indexing is disabled.
     *        </p>
     *        </li>
     * @see ThingConnectivityIndexingMode
     */

    public void setThingConnectivityIndexingMode(String thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Thing connectivity indexing mode. Valid values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     *         thingIndexMode must not be set to OFF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Thing connectivity status indexing is disabled.
     *         </p>
     *         </li>
     * @see ThingConnectivityIndexingMode
     */

    public String getThingConnectivityIndexingMode() {
        return this.thingConnectivityIndexingMode;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingConnectivityIndexingMode
     *        Thing connectivity indexing mode. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     *        thingIndexMode must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing connectivity status indexing is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingConnectivityIndexingMode
     */

    public ThingIndexingConfiguration withThingConnectivityIndexingMode(String thingConnectivityIndexingMode) {
        setThingConnectivityIndexingMode(thingConnectivityIndexingMode);
        return this;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingConnectivityIndexingMode
     *        Thing connectivity indexing mode. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     *        thingIndexMode must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing connectivity status indexing is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingConnectivityIndexingMode
     */

    public ThingIndexingConfiguration withThingConnectivityIndexingMode(ThingConnectivityIndexingMode thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode.toString();
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
        if (getThingIndexingMode() != null)
            sb.append("ThingIndexingMode: ").append(getThingIndexingMode()).append(",");
        if (getThingConnectivityIndexingMode() != null)
            sb.append("ThingConnectivityIndexingMode: ").append(getThingConnectivityIndexingMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingIndexingConfiguration == false)
            return false;
        ThingIndexingConfiguration other = (ThingIndexingConfiguration) obj;
        if (other.getThingIndexingMode() == null ^ this.getThingIndexingMode() == null)
            return false;
        if (other.getThingIndexingMode() != null && other.getThingIndexingMode().equals(this.getThingIndexingMode()) == false)
            return false;
        if (other.getThingConnectivityIndexingMode() == null ^ this.getThingConnectivityIndexingMode() == null)
            return false;
        if (other.getThingConnectivityIndexingMode() != null
                && other.getThingConnectivityIndexingMode().equals(this.getThingConnectivityIndexingMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingIndexingMode() == null) ? 0 : getThingIndexingMode().hashCode());
        hashCode = prime * hashCode + ((getThingConnectivityIndexingMode() == null) ? 0 : getThingConnectivityIndexingMode().hashCode());
        return hashCode;
    }

    @Override
    public ThingIndexingConfiguration clone() {
        try {
            return (ThingIndexingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingIndexingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
