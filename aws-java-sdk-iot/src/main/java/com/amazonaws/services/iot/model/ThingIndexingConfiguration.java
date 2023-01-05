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
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     * <i>thingIndexMode</i> must not be set to OFF.
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
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     * <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     * Detect.</a>
     * </p>
     */
    private String deviceDefenderIndexingMode;
    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     * <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     * service.</a>
     * </p>
     */
    private String namedShadowIndexingMode;
    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     */
    private java.util.List<Field> managedFields;
    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     */
    private java.util.List<Field> customFields;
    /**
     * <p>
     * Provides additional filters for specific data sources. Named shadow is the only data source that currently
     * supports and requires a filter. To add named shadows to your fleet indexing configuration, set
     * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify your shadow names in <code>filter</code>.
     * </p>
     */
    private IndexingFilter filter;

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
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     * <i>thingIndexMode</i> must not be set to OFF.
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
     *        <i>thingIndexMode</i> must not be set to OFF.
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
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     * <i>thingIndexMode</i> must not be set to OFF.
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
     *         <i>thingIndexMode</i> must not be set to OFF.
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
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     * <i>thingIndexMode</i> must not be set to OFF.
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
     *        <i>thingIndexMode</i> must not be set to OFF.
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
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     * <i>thingIndexMode</i> must not be set to OFF.
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
     *        <i>thingIndexMode</i> must not be set to OFF.
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
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     * <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     * Detect.</a>
     * </p>
     * 
     * @param deviceDefenderIndexingMode
     *        Device Defender indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     *        <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Device Defender indexing is disabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Device Defender violations, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     *        Detect.</a>
     * @see DeviceDefenderIndexingMode
     */

    public void setDeviceDefenderIndexingMode(String deviceDefenderIndexingMode) {
        this.deviceDefenderIndexingMode = deviceDefenderIndexingMode;
    }

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     * <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     * Detect.</a>
     * </p>
     * 
     * @return Device Defender indexing mode. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     *         <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Device Defender indexing is disabled.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about Device Defender violations, see <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     *         Detect.</a>
     * @see DeviceDefenderIndexingMode
     */

    public String getDeviceDefenderIndexingMode() {
        return this.deviceDefenderIndexingMode;
    }

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     * <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     * Detect.</a>
     * </p>
     * 
     * @param deviceDefenderIndexingMode
     *        Device Defender indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     *        <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Device Defender indexing is disabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Device Defender violations, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     *        Detect.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceDefenderIndexingMode
     */

    public ThingIndexingConfiguration withDeviceDefenderIndexingMode(String deviceDefenderIndexingMode) {
        setDeviceDefenderIndexingMode(deviceDefenderIndexingMode);
        return this;
    }

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     * <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     * Detect.</a>
     * </p>
     * 
     * @param deviceDefenderIndexingMode
     *        Device Defender indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        VIOLATIONS – Your thing index contains Device Defender violations. To enable Device Defender indexing,
     *        <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Device Defender indexing is disabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Device Defender violations, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html">Device Defender
     *        Detect.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceDefenderIndexingMode
     */

    public ThingIndexingConfiguration withDeviceDefenderIndexingMode(DeviceDefenderIndexingMode deviceDefenderIndexingMode) {
        this.deviceDefenderIndexingMode = deviceDefenderIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     * <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     * service.</a>
     * </p>
     * 
     * @param namedShadowIndexingMode
     *        Named shadow indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     *        <i>namedShadowIndexingMode</i> must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Named shadow indexing is disabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Shadows, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     *        service.</a>
     * @see NamedShadowIndexingMode
     */

    public void setNamedShadowIndexingMode(String namedShadowIndexingMode) {
        this.namedShadowIndexingMode = namedShadowIndexingMode;
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     * <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     * service.</a>
     * </p>
     * 
     * @return Named shadow indexing mode. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     *         <i>namedShadowIndexingMode</i> must not be set to OFF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Named shadow indexing is disabled.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about Shadows, see <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     *         service.</a>
     * @see NamedShadowIndexingMode
     */

    public String getNamedShadowIndexingMode() {
        return this.namedShadowIndexingMode;
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     * <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     * service.</a>
     * </p>
     * 
     * @param namedShadowIndexingMode
     *        Named shadow indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     *        <i>namedShadowIndexingMode</i> must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Named shadow indexing is disabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Shadows, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     *        service.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamedShadowIndexingMode
     */

    public ThingIndexingConfiguration withNamedShadowIndexingMode(String namedShadowIndexingMode) {
        setNamedShadowIndexingMode(namedShadowIndexingMode);
        return this;
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     * <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     * service.</a>
     * </p>
     * 
     * @param namedShadowIndexingMode
     *        Named shadow indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ON – Your thing index contains named shadow. To enable thing named shadow indexing,
     *        <i>namedShadowIndexingMode</i> must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Named shadow indexing is disabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about Shadows, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html">IoT Device Shadow
     *        service.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamedShadowIndexingMode
     */

    public ThingIndexingConfiguration withNamedShadowIndexingMode(NamedShadowIndexingMode namedShadowIndexingMode) {
        this.namedShadowIndexingMode = namedShadowIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     * 
     * @return Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     */

    public java.util.List<Field> getManagedFields() {
        return managedFields;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     * 
     * @param managedFields
     *        Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     */

    public void setManagedFields(java.util.Collection<Field> managedFields) {
        if (managedFields == null) {
            this.managedFields = null;
            return;
        }

        this.managedFields = new java.util.ArrayList<Field>(managedFields);
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedFields(java.util.Collection)} or {@link #withManagedFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param managedFields
     *        Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingIndexingConfiguration withManagedFields(Field... managedFields) {
        if (this.managedFields == null) {
            setManagedFields(new java.util.ArrayList<Field>(managedFields.length));
        }
        for (Field ele : managedFields) {
            this.managedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     * 
     * @param managedFields
     *        Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingIndexingConfiguration withManagedFields(java.util.Collection<Field> managedFields) {
        setManagedFields(managedFields);
        return this;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * 
     * @return Contains custom field names and their data type.
     */

    public java.util.List<Field> getCustomFields() {
        return customFields;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * 
     * @param customFields
     *        Contains custom field names and their data type.
     */

    public void setCustomFields(java.util.Collection<Field> customFields) {
        if (customFields == null) {
            this.customFields = null;
            return;
        }

        this.customFields = new java.util.ArrayList<Field>(customFields);
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomFields(java.util.Collection)} or {@link #withCustomFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customFields
     *        Contains custom field names and their data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingIndexingConfiguration withCustomFields(Field... customFields) {
        if (this.customFields == null) {
            setCustomFields(new java.util.ArrayList<Field>(customFields.length));
        }
        for (Field ele : customFields) {
            this.customFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * 
     * @param customFields
     *        Contains custom field names and their data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingIndexingConfiguration withCustomFields(java.util.Collection<Field> customFields) {
        setCustomFields(customFields);
        return this;
    }

    /**
     * <p>
     * Provides additional filters for specific data sources. Named shadow is the only data source that currently
     * supports and requires a filter. To add named shadows to your fleet indexing configuration, set
     * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify your shadow names in <code>filter</code>.
     * </p>
     * 
     * @param filter
     *        Provides additional filters for specific data sources. Named shadow is the only data source that currently
     *        supports and requires a filter. To add named shadows to your fleet indexing configuration, set
     *        <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify your shadow names in
     *        <code>filter</code>.
     */

    public void setFilter(IndexingFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Provides additional filters for specific data sources. Named shadow is the only data source that currently
     * supports and requires a filter. To add named shadows to your fleet indexing configuration, set
     * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify your shadow names in <code>filter</code>.
     * </p>
     * 
     * @return Provides additional filters for specific data sources. Named shadow is the only data source that
     *         currently supports and requires a filter. To add named shadows to your fleet indexing configuration, set
     *         <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify your shadow names in
     *         <code>filter</code>.
     */

    public IndexingFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Provides additional filters for specific data sources. Named shadow is the only data source that currently
     * supports and requires a filter. To add named shadows to your fleet indexing configuration, set
     * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify your shadow names in <code>filter</code>.
     * </p>
     * 
     * @param filter
     *        Provides additional filters for specific data sources. Named shadow is the only data source that currently
     *        supports and requires a filter. To add named shadows to your fleet indexing configuration, set
     *        <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify your shadow names in
     *        <code>filter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingIndexingConfiguration withFilter(IndexingFilter filter) {
        setFilter(filter);
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
            sb.append("ThingConnectivityIndexingMode: ").append(getThingConnectivityIndexingMode()).append(",");
        if (getDeviceDefenderIndexingMode() != null)
            sb.append("DeviceDefenderIndexingMode: ").append(getDeviceDefenderIndexingMode()).append(",");
        if (getNamedShadowIndexingMode() != null)
            sb.append("NamedShadowIndexingMode: ").append(getNamedShadowIndexingMode()).append(",");
        if (getManagedFields() != null)
            sb.append("ManagedFields: ").append(getManagedFields()).append(",");
        if (getCustomFields() != null)
            sb.append("CustomFields: ").append(getCustomFields()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
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
        if (other.getDeviceDefenderIndexingMode() == null ^ this.getDeviceDefenderIndexingMode() == null)
            return false;
        if (other.getDeviceDefenderIndexingMode() != null && other.getDeviceDefenderIndexingMode().equals(this.getDeviceDefenderIndexingMode()) == false)
            return false;
        if (other.getNamedShadowIndexingMode() == null ^ this.getNamedShadowIndexingMode() == null)
            return false;
        if (other.getNamedShadowIndexingMode() != null && other.getNamedShadowIndexingMode().equals(this.getNamedShadowIndexingMode()) == false)
            return false;
        if (other.getManagedFields() == null ^ this.getManagedFields() == null)
            return false;
        if (other.getManagedFields() != null && other.getManagedFields().equals(this.getManagedFields()) == false)
            return false;
        if (other.getCustomFields() == null ^ this.getCustomFields() == null)
            return false;
        if (other.getCustomFields() != null && other.getCustomFields().equals(this.getCustomFields()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingIndexingMode() == null) ? 0 : getThingIndexingMode().hashCode());
        hashCode = prime * hashCode + ((getThingConnectivityIndexingMode() == null) ? 0 : getThingConnectivityIndexingMode().hashCode());
        hashCode = prime * hashCode + ((getDeviceDefenderIndexingMode() == null) ? 0 : getDeviceDefenderIndexingMode().hashCode());
        hashCode = prime * hashCode + ((getNamedShadowIndexingMode() == null) ? 0 : getNamedShadowIndexingMode().hashCode());
        hashCode = prime * hashCode + ((getManagedFields() == null) ? 0 : getManagedFields().hashCode());
        hashCode = prime * hashCode + ((getCustomFields() == null) ? 0 : getCustomFields().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
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
