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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateSimulationApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSimulationApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application information for the simulation application.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The sources of the simulation application.
     * </p>
     */
    private java.util.List<SourceConfig> sources;
    /**
     * <p>
     * The simulation software suite used by the simulation application.
     * </p>
     */
    private SimulationSoftwareSuite simulationSoftwareSuite;
    /**
     * <p>
     * Information about the robot software suite.
     * </p>
     */
    private RobotSoftwareSuite robotSoftwareSuite;
    /**
     * <p>
     * The rendering engine for the simulation application.
     * </p>
     */
    private RenderingEngine renderingEngine;
    /**
     * <p>
     * The revision id for the robot application.
     * </p>
     */
    private String currentRevisionId;

    /**
     * <p>
     * The application information for the simulation application.
     * </p>
     * 
     * @param application
     *        The application information for the simulation application.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The application information for the simulation application.
     * </p>
     * 
     * @return The application information for the simulation application.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The application information for the simulation application.
     * </p>
     * 
     * @param application
     *        The application information for the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSimulationApplicationRequest withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The sources of the simulation application.
     * </p>
     * 
     * @return The sources of the simulation application.
     */

    public java.util.List<SourceConfig> getSources() {
        return sources;
    }

    /**
     * <p>
     * The sources of the simulation application.
     * </p>
     * 
     * @param sources
     *        The sources of the simulation application.
     */

    public void setSources(java.util.Collection<SourceConfig> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<SourceConfig>(sources);
    }

    /**
     * <p>
     * The sources of the simulation application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The sources of the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSimulationApplicationRequest withSources(SourceConfig... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<SourceConfig>(sources.length));
        }
        for (SourceConfig ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sources of the simulation application.
     * </p>
     * 
     * @param sources
     *        The sources of the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSimulationApplicationRequest withSources(java.util.Collection<SourceConfig> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The simulation software suite used by the simulation application.
     * </p>
     * 
     * @param simulationSoftwareSuite
     *        The simulation software suite used by the simulation application.
     */

    public void setSimulationSoftwareSuite(SimulationSoftwareSuite simulationSoftwareSuite) {
        this.simulationSoftwareSuite = simulationSoftwareSuite;
    }

    /**
     * <p>
     * The simulation software suite used by the simulation application.
     * </p>
     * 
     * @return The simulation software suite used by the simulation application.
     */

    public SimulationSoftwareSuite getSimulationSoftwareSuite() {
        return this.simulationSoftwareSuite;
    }

    /**
     * <p>
     * The simulation software suite used by the simulation application.
     * </p>
     * 
     * @param simulationSoftwareSuite
     *        The simulation software suite used by the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSimulationApplicationRequest withSimulationSoftwareSuite(SimulationSoftwareSuite simulationSoftwareSuite) {
        setSimulationSoftwareSuite(simulationSoftwareSuite);
        return this;
    }

    /**
     * <p>
     * Information about the robot software suite.
     * </p>
     * 
     * @param robotSoftwareSuite
     *        Information about the robot software suite.
     */

    public void setRobotSoftwareSuite(RobotSoftwareSuite robotSoftwareSuite) {
        this.robotSoftwareSuite = robotSoftwareSuite;
    }

    /**
     * <p>
     * Information about the robot software suite.
     * </p>
     * 
     * @return Information about the robot software suite.
     */

    public RobotSoftwareSuite getRobotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }

    /**
     * <p>
     * Information about the robot software suite.
     * </p>
     * 
     * @param robotSoftwareSuite
     *        Information about the robot software suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSimulationApplicationRequest withRobotSoftwareSuite(RobotSoftwareSuite robotSoftwareSuite) {
        setRobotSoftwareSuite(robotSoftwareSuite);
        return this;
    }

    /**
     * <p>
     * The rendering engine for the simulation application.
     * </p>
     * 
     * @param renderingEngine
     *        The rendering engine for the simulation application.
     */

    public void setRenderingEngine(RenderingEngine renderingEngine) {
        this.renderingEngine = renderingEngine;
    }

    /**
     * <p>
     * The rendering engine for the simulation application.
     * </p>
     * 
     * @return The rendering engine for the simulation application.
     */

    public RenderingEngine getRenderingEngine() {
        return this.renderingEngine;
    }

    /**
     * <p>
     * The rendering engine for the simulation application.
     * </p>
     * 
     * @param renderingEngine
     *        The rendering engine for the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSimulationApplicationRequest withRenderingEngine(RenderingEngine renderingEngine) {
        setRenderingEngine(renderingEngine);
        return this;
    }

    /**
     * <p>
     * The revision id for the robot application.
     * </p>
     * 
     * @param currentRevisionId
     *        The revision id for the robot application.
     */

    public void setCurrentRevisionId(String currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
    }

    /**
     * <p>
     * The revision id for the robot application.
     * </p>
     * 
     * @return The revision id for the robot application.
     */

    public String getCurrentRevisionId() {
        return this.currentRevisionId;
    }

    /**
     * <p>
     * The revision id for the robot application.
     * </p>
     * 
     * @param currentRevisionId
     *        The revision id for the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSimulationApplicationRequest withCurrentRevisionId(String currentRevisionId) {
        setCurrentRevisionId(currentRevisionId);
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
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getSimulationSoftwareSuite() != null)
            sb.append("SimulationSoftwareSuite: ").append(getSimulationSoftwareSuite()).append(",");
        if (getRobotSoftwareSuite() != null)
            sb.append("RobotSoftwareSuite: ").append(getRobotSoftwareSuite()).append(",");
        if (getRenderingEngine() != null)
            sb.append("RenderingEngine: ").append(getRenderingEngine()).append(",");
        if (getCurrentRevisionId() != null)
            sb.append("CurrentRevisionId: ").append(getCurrentRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSimulationApplicationRequest == false)
            return false;
        UpdateSimulationApplicationRequest other = (UpdateSimulationApplicationRequest) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getSimulationSoftwareSuite() == null ^ this.getSimulationSoftwareSuite() == null)
            return false;
        if (other.getSimulationSoftwareSuite() != null && other.getSimulationSoftwareSuite().equals(this.getSimulationSoftwareSuite()) == false)
            return false;
        if (other.getRobotSoftwareSuite() == null ^ this.getRobotSoftwareSuite() == null)
            return false;
        if (other.getRobotSoftwareSuite() != null && other.getRobotSoftwareSuite().equals(this.getRobotSoftwareSuite()) == false)
            return false;
        if (other.getRenderingEngine() == null ^ this.getRenderingEngine() == null)
            return false;
        if (other.getRenderingEngine() != null && other.getRenderingEngine().equals(this.getRenderingEngine()) == false)
            return false;
        if (other.getCurrentRevisionId() == null ^ this.getCurrentRevisionId() == null)
            return false;
        if (other.getCurrentRevisionId() != null && other.getCurrentRevisionId().equals(this.getCurrentRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getSimulationSoftwareSuite() == null) ? 0 : getSimulationSoftwareSuite().hashCode());
        hashCode = prime * hashCode + ((getRobotSoftwareSuite() == null) ? 0 : getRobotSoftwareSuite().hashCode());
        hashCode = prime * hashCode + ((getRenderingEngine() == null) ? 0 : getRenderingEngine().hashCode());
        hashCode = prime * hashCode + ((getCurrentRevisionId() == null) ? 0 : getCurrentRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSimulationApplicationRequest clone() {
        return (UpdateSimulationApplicationRequest) super.clone();
    }

}
