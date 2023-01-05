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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteRackPhysicalProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSiteRackPhysicalPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     */
    private String siteId;
    /**
     * <p>
     * The power draw, in kVA, available at the hardware placement position for the rack.
     * </p>
     */
    private String powerDrawKva;
    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * </ul>
     */
    private String powerPhase;
    /**
     * <p>
     * The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note the
     * correlation between <code>PowerPhase</code> and <code>PowerConnector</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>L6-30P</b> – (common in US); 30A; single phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String powerConnector;
    /**
     * <p>
     * Indicates whether the power feed comes above or below the rack.
     * </p>
     */
    private String powerFeedDrop;
    /**
     * <p>
     * The uplink speed the rack should support for the connection to the Region.
     * </p>
     */
    private String uplinkGbps;
    /**
     * <p>
     * Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the Outpost
     * network devices provide a variable number of uplinks. Specify the number of uplinks for each Outpost network
     * device that you intend to use to connect the rack to your network. Note the correlation between
     * <code>UplinkGbps</code> and <code>UplinkCount</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1Gbps - Uplinks available: 1, 2, 4, 6, 8
     * </p>
     * </li>
     * <li>
     * <p>
     * 10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     * </p>
     * </li>
     * <li>
     * <p>
     * 40 and 100 Gbps- Uplinks available: 1, 2, 4
     * </p>
     * </li>
     * </ul>
     */
    private String uplinkCount;
    /**
     * <p>
     * The type of fiber that you will use to attach the Outpost to your network.
     * </p>
     */
    private String fiberOpticCableType;
    /**
     * <p>
     * The type of optical standard that you will use to attach the Outpost to your network. This field is dependent on
     * uplink speed, fiber type, and distance to the upstream device. For more information about networking requirements
     * for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     * </p>
     * </li>
     * </ul>
     */
    private String opticalStandard;
    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * </p>
     */
    private String maximumSupportedWeightLbs;

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteId
     *        The ID or the Amazon Resource Name (ARN) of the site.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @return The ID or the Amazon Resource Name (ARN) of the site.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteId
     *        The ID or the Amazon Resource Name (ARN) of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSiteRackPhysicalPropertiesRequest withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * <p>
     * The power draw, in kVA, available at the hardware placement position for the rack.
     * </p>
     * 
     * @param powerDrawKva
     *        The power draw, in kVA, available at the hardware placement position for the rack.
     * @see PowerDrawKva
     */

    public void setPowerDrawKva(String powerDrawKva) {
        this.powerDrawKva = powerDrawKva;
    }

    /**
     * <p>
     * The power draw, in kVA, available at the hardware placement position for the rack.
     * </p>
     * 
     * @return The power draw, in kVA, available at the hardware placement position for the rack.
     * @see PowerDrawKva
     */

    public String getPowerDrawKva() {
        return this.powerDrawKva;
    }

    /**
     * <p>
     * The power draw, in kVA, available at the hardware placement position for the rack.
     * </p>
     * 
     * @param powerDrawKva
     *        The power draw, in kVA, available at the hardware placement position for the rack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerDrawKva
     */

    public UpdateSiteRackPhysicalPropertiesRequest withPowerDrawKva(String powerDrawKva) {
        setPowerDrawKva(powerDrawKva);
        return this;
    }

    /**
     * <p>
     * The power draw, in kVA, available at the hardware placement position for the rack.
     * </p>
     * 
     * @param powerDrawKva
     *        The power draw, in kVA, available at the hardware placement position for the rack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerDrawKva
     */

    public UpdateSiteRackPhysicalPropertiesRequest withPowerDrawKva(PowerDrawKva powerDrawKva) {
        this.powerDrawKva = powerDrawKva.toString();
        return this;
    }

    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * </ul>
     * 
     * @param powerPhase
     *        The power option that you can provide for hardware. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     *        </p>
     *        </li>
     * @see PowerPhase
     */

    public void setPowerPhase(String powerPhase) {
        this.powerPhase = powerPhase;
    }

    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * </ul>
     * 
     * @return The power option that you can provide for hardware. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     *         </p>
     *         </li>
     * @see PowerPhase
     */

    public String getPowerPhase() {
        return this.powerPhase;
    }

    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * </ul>
     * 
     * @param powerPhase
     *        The power option that you can provide for hardware. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerPhase
     */

    public UpdateSiteRackPhysicalPropertiesRequest withPowerPhase(String powerPhase) {
        setPowerPhase(powerPhase);
        return this;
    }

    /**
     * <p>
     * The power option that you can provide for hardware.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     * </p>
     * </li>
     * </ul>
     * 
     * @param powerPhase
     *        The power option that you can provide for hardware. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Single-phase AC feed: 200 V to 277 V, 50 Hz or 60 Hz
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Three-phase AC feed: 346 V to 480 V, 50 Hz or 60 Hz
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerPhase
     */

    public UpdateSiteRackPhysicalPropertiesRequest withPowerPhase(PowerPhase powerPhase) {
        this.powerPhase = powerPhase.toString();
        return this;
    }

    /**
     * <p>
     * The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note the
     * correlation between <code>PowerPhase</code> and <code>PowerConnector</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>L6-30P</b> – (common in US); 30A; single phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param powerConnector
     *        The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note
     *        the correlation between <code>PowerPhase</code> and <code>PowerConnector</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Single-phase AC feed
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>L6-30P</b> – (common in US); 30A; single phase
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Three-phase AC feed
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see PowerConnector
     */

    public void setPowerConnector(String powerConnector) {
        this.powerConnector = powerConnector;
    }

    /**
     * <p>
     * The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note the
     * correlation between <code>PowerPhase</code> and <code>PowerConnector</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>L6-30P</b> – (common in US); 30A; single phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note
     *         the correlation between <code>PowerPhase</code> and <code>PowerConnector</code>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Single-phase AC feed
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>L6-30P</b> – (common in US); 30A; single phase
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Three-phase AC feed
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see PowerConnector
     */

    public String getPowerConnector() {
        return this.powerConnector;
    }

    /**
     * <p>
     * The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note the
     * correlation between <code>PowerPhase</code> and <code>PowerConnector</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>L6-30P</b> – (common in US); 30A; single phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param powerConnector
     *        The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note
     *        the correlation between <code>PowerPhase</code> and <code>PowerConnector</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Single-phase AC feed
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>L6-30P</b> – (common in US); 30A; single phase
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Three-phase AC feed
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerConnector
     */

    public UpdateSiteRackPhysicalPropertiesRequest withPowerConnector(String powerConnector) {
        setPowerConnector(powerConnector);
        return this;
    }

    /**
     * <p>
     * The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note the
     * correlation between <code>PowerPhase</code> and <code>PowerConnector</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Single-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>L6-30P</b> – (common in US); 30A; single phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Three-phase AC feed
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param powerConnector
     *        The power connector that Amazon Web Services should plan to provide for connections to the hardware. Note
     *        the correlation between <code>PowerPhase</code> and <code>PowerConnector</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Single-phase AC feed
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>L6-30P</b> – (common in US); 30A; single phase
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IEC309 (blue)</b> – P+N+E, 6hr; 32 A; single phase
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Three-phase AC feed
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AH530P7W (red)</b> – 3P+N+E, 7hr; 30A; three phase
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AH532P6W (red)</b> – 3P+N+E, 6hr; 32A; three phase
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerConnector
     */

    public UpdateSiteRackPhysicalPropertiesRequest withPowerConnector(PowerConnector powerConnector) {
        this.powerConnector = powerConnector.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the power feed comes above or below the rack.
     * </p>
     * 
     * @param powerFeedDrop
     *        Indicates whether the power feed comes above or below the rack.
     * @see PowerFeedDrop
     */

    public void setPowerFeedDrop(String powerFeedDrop) {
        this.powerFeedDrop = powerFeedDrop;
    }

    /**
     * <p>
     * Indicates whether the power feed comes above or below the rack.
     * </p>
     * 
     * @return Indicates whether the power feed comes above or below the rack.
     * @see PowerFeedDrop
     */

    public String getPowerFeedDrop() {
        return this.powerFeedDrop;
    }

    /**
     * <p>
     * Indicates whether the power feed comes above or below the rack.
     * </p>
     * 
     * @param powerFeedDrop
     *        Indicates whether the power feed comes above or below the rack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerFeedDrop
     */

    public UpdateSiteRackPhysicalPropertiesRequest withPowerFeedDrop(String powerFeedDrop) {
        setPowerFeedDrop(powerFeedDrop);
        return this;
    }

    /**
     * <p>
     * Indicates whether the power feed comes above or below the rack.
     * </p>
     * 
     * @param powerFeedDrop
     *        Indicates whether the power feed comes above or below the rack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PowerFeedDrop
     */

    public UpdateSiteRackPhysicalPropertiesRequest withPowerFeedDrop(PowerFeedDrop powerFeedDrop) {
        this.powerFeedDrop = powerFeedDrop.toString();
        return this;
    }

    /**
     * <p>
     * The uplink speed the rack should support for the connection to the Region.
     * </p>
     * 
     * @param uplinkGbps
     *        The uplink speed the rack should support for the connection to the Region.
     * @see UplinkGbps
     */

    public void setUplinkGbps(String uplinkGbps) {
        this.uplinkGbps = uplinkGbps;
    }

    /**
     * <p>
     * The uplink speed the rack should support for the connection to the Region.
     * </p>
     * 
     * @return The uplink speed the rack should support for the connection to the Region.
     * @see UplinkGbps
     */

    public String getUplinkGbps() {
        return this.uplinkGbps;
    }

    /**
     * <p>
     * The uplink speed the rack should support for the connection to the Region.
     * </p>
     * 
     * @param uplinkGbps
     *        The uplink speed the rack should support for the connection to the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UplinkGbps
     */

    public UpdateSiteRackPhysicalPropertiesRequest withUplinkGbps(String uplinkGbps) {
        setUplinkGbps(uplinkGbps);
        return this;
    }

    /**
     * <p>
     * The uplink speed the rack should support for the connection to the Region.
     * </p>
     * 
     * @param uplinkGbps
     *        The uplink speed the rack should support for the connection to the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UplinkGbps
     */

    public UpdateSiteRackPhysicalPropertiesRequest withUplinkGbps(UplinkGbps uplinkGbps) {
        this.uplinkGbps = uplinkGbps.toString();
        return this;
    }

    /**
     * <p>
     * Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the Outpost
     * network devices provide a variable number of uplinks. Specify the number of uplinks for each Outpost network
     * device that you intend to use to connect the rack to your network. Note the correlation between
     * <code>UplinkGbps</code> and <code>UplinkCount</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1Gbps - Uplinks available: 1, 2, 4, 6, 8
     * </p>
     * </li>
     * <li>
     * <p>
     * 10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     * </p>
     * </li>
     * <li>
     * <p>
     * 40 and 100 Gbps- Uplinks available: 1, 2, 4
     * </p>
     * </li>
     * </ul>
     * 
     * @param uplinkCount
     *        Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the
     *        Outpost network devices provide a variable number of uplinks. Specify the number of uplinks for each
     *        Outpost network device that you intend to use to connect the rack to your network. Note the correlation
     *        between <code>UplinkGbps</code> and <code>UplinkCount</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1Gbps - Uplinks available: 1, 2, 4, 6, 8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        40 and 100 Gbps- Uplinks available: 1, 2, 4
     *        </p>
     *        </li>
     * @see UplinkCount
     */

    public void setUplinkCount(String uplinkCount) {
        this.uplinkCount = uplinkCount;
    }

    /**
     * <p>
     * Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the Outpost
     * network devices provide a variable number of uplinks. Specify the number of uplinks for each Outpost network
     * device that you intend to use to connect the rack to your network. Note the correlation between
     * <code>UplinkGbps</code> and <code>UplinkCount</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1Gbps - Uplinks available: 1, 2, 4, 6, 8
     * </p>
     * </li>
     * <li>
     * <p>
     * 10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     * </p>
     * </li>
     * <li>
     * <p>
     * 40 and 100 Gbps- Uplinks available: 1, 2, 4
     * </p>
     * </li>
     * </ul>
     * 
     * @return Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the
     *         Outpost network devices provide a variable number of uplinks. Specify the number of uplinks for each
     *         Outpost network device that you intend to use to connect the rack to your network. Note the correlation
     *         between <code>UplinkGbps</code> and <code>UplinkCount</code>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         1Gbps - Uplinks available: 1, 2, 4, 6, 8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         40 and 100 Gbps- Uplinks available: 1, 2, 4
     *         </p>
     *         </li>
     * @see UplinkCount
     */

    public String getUplinkCount() {
        return this.uplinkCount;
    }

    /**
     * <p>
     * Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the Outpost
     * network devices provide a variable number of uplinks. Specify the number of uplinks for each Outpost network
     * device that you intend to use to connect the rack to your network. Note the correlation between
     * <code>UplinkGbps</code> and <code>UplinkCount</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1Gbps - Uplinks available: 1, 2, 4, 6, 8
     * </p>
     * </li>
     * <li>
     * <p>
     * 10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     * </p>
     * </li>
     * <li>
     * <p>
     * 40 and 100 Gbps- Uplinks available: 1, 2, 4
     * </p>
     * </li>
     * </ul>
     * 
     * @param uplinkCount
     *        Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the
     *        Outpost network devices provide a variable number of uplinks. Specify the number of uplinks for each
     *        Outpost network device that you intend to use to connect the rack to your network. Note the correlation
     *        between <code>UplinkGbps</code> and <code>UplinkCount</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1Gbps - Uplinks available: 1, 2, 4, 6, 8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        40 and 100 Gbps- Uplinks available: 1, 2, 4
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UplinkCount
     */

    public UpdateSiteRackPhysicalPropertiesRequest withUplinkCount(String uplinkCount) {
        setUplinkCount(uplinkCount);
        return this;
    }

    /**
     * <p>
     * Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the Outpost
     * network devices provide a variable number of uplinks. Specify the number of uplinks for each Outpost network
     * device that you intend to use to connect the rack to your network. Note the correlation between
     * <code>UplinkGbps</code> and <code>UplinkCount</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1Gbps - Uplinks available: 1, 2, 4, 6, 8
     * </p>
     * </li>
     * <li>
     * <p>
     * 10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     * </p>
     * </li>
     * <li>
     * <p>
     * 40 and 100 Gbps- Uplinks available: 1, 2, 4
     * </p>
     * </li>
     * </ul>
     * 
     * @param uplinkCount
     *        Racks come with two Outpost network devices. Depending on the supported uplink speed at the site, the
     *        Outpost network devices provide a variable number of uplinks. Specify the number of uplinks for each
     *        Outpost network device that you intend to use to connect the rack to your network. Note the correlation
     *        between <code>UplinkGbps</code> and <code>UplinkCount</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        1Gbps - Uplinks available: 1, 2, 4, 6, 8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        10Gbps - Uplinks available: 1, 2, 4, 8, 12, 16
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        40 and 100 Gbps- Uplinks available: 1, 2, 4
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UplinkCount
     */

    public UpdateSiteRackPhysicalPropertiesRequest withUplinkCount(UplinkCount uplinkCount) {
        this.uplinkCount = uplinkCount.toString();
        return this;
    }

    /**
     * <p>
     * The type of fiber that you will use to attach the Outpost to your network.
     * </p>
     * 
     * @param fiberOpticCableType
     *        The type of fiber that you will use to attach the Outpost to your network.
     * @see FiberOpticCableType
     */

    public void setFiberOpticCableType(String fiberOpticCableType) {
        this.fiberOpticCableType = fiberOpticCableType;
    }

    /**
     * <p>
     * The type of fiber that you will use to attach the Outpost to your network.
     * </p>
     * 
     * @return The type of fiber that you will use to attach the Outpost to your network.
     * @see FiberOpticCableType
     */

    public String getFiberOpticCableType() {
        return this.fiberOpticCableType;
    }

    /**
     * <p>
     * The type of fiber that you will use to attach the Outpost to your network.
     * </p>
     * 
     * @param fiberOpticCableType
     *        The type of fiber that you will use to attach the Outpost to your network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FiberOpticCableType
     */

    public UpdateSiteRackPhysicalPropertiesRequest withFiberOpticCableType(String fiberOpticCableType) {
        setFiberOpticCableType(fiberOpticCableType);
        return this;
    }

    /**
     * <p>
     * The type of fiber that you will use to attach the Outpost to your network.
     * </p>
     * 
     * @param fiberOpticCableType
     *        The type of fiber that you will use to attach the Outpost to your network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FiberOpticCableType
     */

    public UpdateSiteRackPhysicalPropertiesRequest withFiberOpticCableType(FiberOpticCableType fiberOpticCableType) {
        this.fiberOpticCableType = fiberOpticCableType.toString();
        return this;
    }

    /**
     * <p>
     * The type of optical standard that you will use to attach the Outpost to your network. This field is dependent on
     * uplink speed, fiber type, and distance to the upstream device. For more information about networking requirements
     * for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     * </p>
     * </li>
     * </ul>
     * 
     * @param opticalStandard
     *        The type of optical standard that you will use to attach the Outpost to your network. This field is
     *        dependent on uplink speed, fiber type, and distance to the upstream device. For more information about
     *        networking requirements for racks, see <a href=
     *        "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     *        >Network</a> in the Amazon Web Services Outposts User Guide. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     *        </p>
     *        </li>
     * @see OpticalStandard
     */

    public void setOpticalStandard(String opticalStandard) {
        this.opticalStandard = opticalStandard;
    }

    /**
     * <p>
     * The type of optical standard that you will use to attach the Outpost to your network. This field is dependent on
     * uplink speed, fiber type, and distance to the upstream device. For more information about networking requirements
     * for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of optical standard that you will use to attach the Outpost to your network. This field is
     *         dependent on uplink speed, fiber type, and distance to the upstream device. For more information about
     *         networking requirements for racks, see <a href=
     *         "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     *         >Network</a> in the Amazon Web Services Outposts User Guide. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     *         </p>
     *         </li>
     * @see OpticalStandard
     */

    public String getOpticalStandard() {
        return this.opticalStandard;
    }

    /**
     * <p>
     * The type of optical standard that you will use to attach the Outpost to your network. This field is dependent on
     * uplink speed, fiber type, and distance to the upstream device. For more information about networking requirements
     * for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     * </p>
     * </li>
     * </ul>
     * 
     * @param opticalStandard
     *        The type of optical standard that you will use to attach the Outpost to your network. This field is
     *        dependent on uplink speed, fiber type, and distance to the upstream device. For more information about
     *        networking requirements for racks, see <a href=
     *        "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     *        >Network</a> in the Amazon Web Services Outposts User Guide. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpticalStandard
     */

    public UpdateSiteRackPhysicalPropertiesRequest withOpticalStandard(String opticalStandard) {
        setOpticalStandard(opticalStandard);
        return this;
    }

    /**
     * <p>
     * The type of optical standard that you will use to attach the Outpost to your network. This field is dependent on
     * uplink speed, fiber type, and distance to the upstream device. For more information about networking requirements
     * for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     * >Network</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     * </p>
     * </li>
     * </ul>
     * 
     * @param opticalStandard
     *        The type of optical standard that you will use to attach the Outpost to your network. This field is
     *        dependent on uplink speed, fiber type, and distance to the upstream device. For more information about
     *        networking requirements for racks, see <a href=
     *        "https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#facility-networking"
     *        >Network</a> in the Amazon Web Services Outposts User Guide. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_SR</code>: 10GBASE-SR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_IR</code>: 10GBASE-IR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_10GBASE_LR</code>: 10GBASE-LR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_SR</code>: 40GBASE-SR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_ESR</code>: 40GBASE-ESR
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_IR4_LR4L</code>: 40GBASE-IR (LR4L)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_40GBASE_LR4</code>: 40GBASE-LR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_SR4</code>: 100GBASE-SR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_CWDM4</code>: 100GBASE-CWDM4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100GBASE_LR4</code>: 100GBASE-LR4
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_100G_PSM4_MSA</code>: 100G PSM4 MSA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_1000BASE_LX</code>: 1000Base-LX
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIC_1000BASE_SX</code> : 1000Base-SX
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpticalStandard
     */

    public UpdateSiteRackPhysicalPropertiesRequest withOpticalStandard(OpticalStandard opticalStandard) {
        this.opticalStandard = opticalStandard.toString();
        return this;
    }

    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * </p>
     * 
     * @param maximumSupportedWeightLbs
     *        The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * @see MaximumSupportedWeightLbs
     */

    public void setMaximumSupportedWeightLbs(String maximumSupportedWeightLbs) {
        this.maximumSupportedWeightLbs = maximumSupportedWeightLbs;
    }

    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * </p>
     * 
     * @return The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * @see MaximumSupportedWeightLbs
     */

    public String getMaximumSupportedWeightLbs() {
        return this.maximumSupportedWeightLbs;
    }

    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * </p>
     * 
     * @param maximumSupportedWeightLbs
     *        The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumSupportedWeightLbs
     */

    public UpdateSiteRackPhysicalPropertiesRequest withMaximumSupportedWeightLbs(String maximumSupportedWeightLbs) {
        setMaximumSupportedWeightLbs(maximumSupportedWeightLbs);
        return this;
    }

    /**
     * <p>
     * The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * </p>
     * 
     * @param maximumSupportedWeightLbs
     *        The maximum rack weight that this site can support. <code>NO_LIMIT</code> is over 2000lbs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumSupportedWeightLbs
     */

    public UpdateSiteRackPhysicalPropertiesRequest withMaximumSupportedWeightLbs(MaximumSupportedWeightLbs maximumSupportedWeightLbs) {
        this.maximumSupportedWeightLbs = maximumSupportedWeightLbs.toString();
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
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId()).append(",");
        if (getPowerDrawKva() != null)
            sb.append("PowerDrawKva: ").append(getPowerDrawKva()).append(",");
        if (getPowerPhase() != null)
            sb.append("PowerPhase: ").append(getPowerPhase()).append(",");
        if (getPowerConnector() != null)
            sb.append("PowerConnector: ").append(getPowerConnector()).append(",");
        if (getPowerFeedDrop() != null)
            sb.append("PowerFeedDrop: ").append(getPowerFeedDrop()).append(",");
        if (getUplinkGbps() != null)
            sb.append("UplinkGbps: ").append(getUplinkGbps()).append(",");
        if (getUplinkCount() != null)
            sb.append("UplinkCount: ").append(getUplinkCount()).append(",");
        if (getFiberOpticCableType() != null)
            sb.append("FiberOpticCableType: ").append(getFiberOpticCableType()).append(",");
        if (getOpticalStandard() != null)
            sb.append("OpticalStandard: ").append(getOpticalStandard()).append(",");
        if (getMaximumSupportedWeightLbs() != null)
            sb.append("MaximumSupportedWeightLbs: ").append(getMaximumSupportedWeightLbs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSiteRackPhysicalPropertiesRequest == false)
            return false;
        UpdateSiteRackPhysicalPropertiesRequest other = (UpdateSiteRackPhysicalPropertiesRequest) obj;
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        if (other.getPowerDrawKva() == null ^ this.getPowerDrawKva() == null)
            return false;
        if (other.getPowerDrawKva() != null && other.getPowerDrawKva().equals(this.getPowerDrawKva()) == false)
            return false;
        if (other.getPowerPhase() == null ^ this.getPowerPhase() == null)
            return false;
        if (other.getPowerPhase() != null && other.getPowerPhase().equals(this.getPowerPhase()) == false)
            return false;
        if (other.getPowerConnector() == null ^ this.getPowerConnector() == null)
            return false;
        if (other.getPowerConnector() != null && other.getPowerConnector().equals(this.getPowerConnector()) == false)
            return false;
        if (other.getPowerFeedDrop() == null ^ this.getPowerFeedDrop() == null)
            return false;
        if (other.getPowerFeedDrop() != null && other.getPowerFeedDrop().equals(this.getPowerFeedDrop()) == false)
            return false;
        if (other.getUplinkGbps() == null ^ this.getUplinkGbps() == null)
            return false;
        if (other.getUplinkGbps() != null && other.getUplinkGbps().equals(this.getUplinkGbps()) == false)
            return false;
        if (other.getUplinkCount() == null ^ this.getUplinkCount() == null)
            return false;
        if (other.getUplinkCount() != null && other.getUplinkCount().equals(this.getUplinkCount()) == false)
            return false;
        if (other.getFiberOpticCableType() == null ^ this.getFiberOpticCableType() == null)
            return false;
        if (other.getFiberOpticCableType() != null && other.getFiberOpticCableType().equals(this.getFiberOpticCableType()) == false)
            return false;
        if (other.getOpticalStandard() == null ^ this.getOpticalStandard() == null)
            return false;
        if (other.getOpticalStandard() != null && other.getOpticalStandard().equals(this.getOpticalStandard()) == false)
            return false;
        if (other.getMaximumSupportedWeightLbs() == null ^ this.getMaximumSupportedWeightLbs() == null)
            return false;
        if (other.getMaximumSupportedWeightLbs() != null && other.getMaximumSupportedWeightLbs().equals(this.getMaximumSupportedWeightLbs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getPowerDrawKva() == null) ? 0 : getPowerDrawKva().hashCode());
        hashCode = prime * hashCode + ((getPowerPhase() == null) ? 0 : getPowerPhase().hashCode());
        hashCode = prime * hashCode + ((getPowerConnector() == null) ? 0 : getPowerConnector().hashCode());
        hashCode = prime * hashCode + ((getPowerFeedDrop() == null) ? 0 : getPowerFeedDrop().hashCode());
        hashCode = prime * hashCode + ((getUplinkGbps() == null) ? 0 : getUplinkGbps().hashCode());
        hashCode = prime * hashCode + ((getUplinkCount() == null) ? 0 : getUplinkCount().hashCode());
        hashCode = prime * hashCode + ((getFiberOpticCableType() == null) ? 0 : getFiberOpticCableType().hashCode());
        hashCode = prime * hashCode + ((getOpticalStandard() == null) ? 0 : getOpticalStandard().hashCode());
        hashCode = prime * hashCode + ((getMaximumSupportedWeightLbs() == null) ? 0 : getMaximumSupportedWeightLbs().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSiteRackPhysicalPropertiesRequest clone() {
        return (UpdateSiteRackPhysicalPropertiesRequest) super.clone();
    }

}
