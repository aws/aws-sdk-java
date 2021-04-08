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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a tool. Tools are used in a simulation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/Tool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tool implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with the tool as it is running in the simulation. It
     * must have a graphical user interface. The default is <code>False</code>.
     * </p>
     */
    private Boolean streamUI;
    /**
     * <p>
     * The name of the tool.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Command-line arguments for the tool. It must include the tool executable name.
     * </p>
     */
    private String command;
    /**
     * <p>
     * Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is <code>False</code>.
     * </p>
     */
    private Boolean streamOutputToCloudWatch;
    /**
     * <p>
     * Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your tool to
     * be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * </p>
     */
    private String exitBehavior;

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with the tool as it is running in the simulation. It
     * must have a graphical user interface. The default is <code>False</code>.
     * </p>
     * 
     * @param streamUI
     *        Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     *        RoboMaker will configure a connection so you can interact with the tool as it is running in the
     *        simulation. It must have a graphical user interface. The default is <code>False</code>.
     */

    public void setStreamUI(Boolean streamUI) {
        this.streamUI = streamUI;
    }

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with the tool as it is running in the simulation. It
     * must have a graphical user interface. The default is <code>False</code>.
     * </p>
     * 
     * @return Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     *         RoboMaker will configure a connection so you can interact with the tool as it is running in the
     *         simulation. It must have a graphical user interface. The default is <code>False</code>.
     */

    public Boolean getStreamUI() {
        return this.streamUI;
    }

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with the tool as it is running in the simulation. It
     * must have a graphical user interface. The default is <code>False</code>.
     * </p>
     * 
     * @param streamUI
     *        Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     *        RoboMaker will configure a connection so you can interact with the tool as it is running in the
     *        simulation. It must have a graphical user interface. The default is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tool withStreamUI(Boolean streamUI) {
        setStreamUI(streamUI);
        return this;
    }

    /**
     * <p>
     * Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     * RoboMaker will configure a connection so you can interact with the tool as it is running in the simulation. It
     * must have a graphical user interface. The default is <code>False</code>.
     * </p>
     * 
     * @return Boolean indicating whether a streaming session will be configured for the tool. If <code>True</code>, AWS
     *         RoboMaker will configure a connection so you can interact with the tool as it is running in the
     *         simulation. It must have a graphical user interface. The default is <code>False</code>.
     */

    public Boolean isStreamUI() {
        return this.streamUI;
    }

    /**
     * <p>
     * The name of the tool.
     * </p>
     * 
     * @param name
     *        The name of the tool.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the tool.
     * </p>
     * 
     * @return The name of the tool.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the tool.
     * </p>
     * 
     * @param name
     *        The name of the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tool withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Command-line arguments for the tool. It must include the tool executable name.
     * </p>
     * 
     * @param command
     *        Command-line arguments for the tool. It must include the tool executable name.
     */

    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * <p>
     * Command-line arguments for the tool. It must include the tool executable name.
     * </p>
     * 
     * @return Command-line arguments for the tool. It must include the tool executable name.
     */

    public String getCommand() {
        return this.command;
    }

    /**
     * <p>
     * Command-line arguments for the tool. It must include the tool executable name.
     * </p>
     * 
     * @param command
     *        Command-line arguments for the tool. It must include the tool executable name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tool withCommand(String command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is <code>False</code>.
     * </p>
     * 
     * @param streamOutputToCloudWatch
     *        Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is
     *        <code>False</code>.
     */

    public void setStreamOutputToCloudWatch(Boolean streamOutputToCloudWatch) {
        this.streamOutputToCloudWatch = streamOutputToCloudWatch;
    }

    /**
     * <p>
     * Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is <code>False</code>.
     * </p>
     * 
     * @return Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is
     *         <code>False</code>.
     */

    public Boolean getStreamOutputToCloudWatch() {
        return this.streamOutputToCloudWatch;
    }

    /**
     * <p>
     * Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is <code>False</code>.
     * </p>
     * 
     * @param streamOutputToCloudWatch
     *        Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is
     *        <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tool withStreamOutputToCloudWatch(Boolean streamOutputToCloudWatch) {
        setStreamOutputToCloudWatch(streamOutputToCloudWatch);
        return this;
    }

    /**
     * <p>
     * Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is <code>False</code>.
     * </p>
     * 
     * @return Boolean indicating whether logs will be recorded in CloudWatch for the tool. The default is
     *         <code>False</code>.
     */

    public Boolean isStreamOutputToCloudWatch() {
        return this.streamOutputToCloudWatch;
    }

    /**
     * <p>
     * Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your tool to
     * be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * </p>
     * 
     * @param exitBehavior
     *        Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your
     *        tool to be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * @see ExitBehavior
     */

    public void setExitBehavior(String exitBehavior) {
        this.exitBehavior = exitBehavior;
    }

    /**
     * <p>
     * Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your tool to
     * be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * </p>
     * 
     * @return Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your
     *         tool to be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * @see ExitBehavior
     */

    public String getExitBehavior() {
        return this.exitBehavior;
    }

    /**
     * <p>
     * Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your tool to
     * be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * </p>
     * 
     * @param exitBehavior
     *        Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your
     *        tool to be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExitBehavior
     */

    public Tool withExitBehavior(String exitBehavior) {
        setExitBehavior(exitBehavior);
        return this;
    }

    /**
     * <p>
     * Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your tool to
     * be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * </p>
     * 
     * @param exitBehavior
     *        Exit behavior determines what happens when your tool quits running. <code>RESTART</code> will cause your
     *        tool to be restarted. <code>FAIL</code> will cause your job to exit. The default is <code>RESTART</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExitBehavior
     */

    public Tool withExitBehavior(ExitBehavior exitBehavior) {
        this.exitBehavior = exitBehavior.toString();
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
        if (getStreamUI() != null)
            sb.append("StreamUI: ").append(getStreamUI()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getStreamOutputToCloudWatch() != null)
            sb.append("StreamOutputToCloudWatch: ").append(getStreamOutputToCloudWatch()).append(",");
        if (getExitBehavior() != null)
            sb.append("ExitBehavior: ").append(getExitBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tool == false)
            return false;
        Tool other = (Tool) obj;
        if (other.getStreamUI() == null ^ this.getStreamUI() == null)
            return false;
        if (other.getStreamUI() != null && other.getStreamUI().equals(this.getStreamUI()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getStreamOutputToCloudWatch() == null ^ this.getStreamOutputToCloudWatch() == null)
            return false;
        if (other.getStreamOutputToCloudWatch() != null && other.getStreamOutputToCloudWatch().equals(this.getStreamOutputToCloudWatch()) == false)
            return false;
        if (other.getExitBehavior() == null ^ this.getExitBehavior() == null)
            return false;
        if (other.getExitBehavior() != null && other.getExitBehavior().equals(this.getExitBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamUI() == null) ? 0 : getStreamUI().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getStreamOutputToCloudWatch() == null) ? 0 : getStreamOutputToCloudWatch().hashCode());
        hashCode = prime * hashCode + ((getExitBehavior() == null) ? 0 : getExitBehavior().hashCode());
        return hashCode;
    }

    @Override
    public Tool clone() {
        try {
            return (Tool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.ToolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
