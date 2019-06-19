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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of instructions for launching server processes on each instance in a fleet. Server processes run either a
 * custom game build executable or a Realtime Servers script. Each instruction set identifies the location of the custom
 * game build executable or Realtime launch script, optional launch parameters, and the number of server processes with
 * this configuration to maintain concurrently on the instance. Server process configurations make up a fleet's
 * <code> <a>RuntimeConfiguration</a> </code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ServerProcess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerProcess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Location of the server executable in a custom game build or the name of the Realtime script file that contains
     * the <code>Init()</code> function. Game builds and Realtime scripts are installed on instances at the root:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Windows (for custom game builds only): <code>C:\game</code>. Example: "<code>C:\game\MyGame\server.exe</code>"
     * </p>
     * </li>
     * <li>
     * <p>
     * Linux: <code>/local/game</code>. Examples: "<code>/local/game/MyGame/server.exe</code>" or "
     * <code>/local/game/MyRealtimeScript.js</code>"
     * </p>
     * </li>
     * </ul>
     */
    private String launchPath;
    /**
     * <p>
     * Optional list of parameters to pass to the server executable or Realtime script on launch.
     * </p>
     */
    private String parameters;
    /**
     * <p>
     * Number of server processes using this configuration to run concurrently on an instance.
     * </p>
     */
    private Integer concurrentExecutions;

    /**
     * <p>
     * Location of the server executable in a custom game build or the name of the Realtime script file that contains
     * the <code>Init()</code> function. Game builds and Realtime scripts are installed on instances at the root:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Windows (for custom game builds only): <code>C:\game</code>. Example: "<code>C:\game\MyGame\server.exe</code>"
     * </p>
     * </li>
     * <li>
     * <p>
     * Linux: <code>/local/game</code>. Examples: "<code>/local/game/MyGame/server.exe</code>" or "
     * <code>/local/game/MyRealtimeScript.js</code>"
     * </p>
     * </li>
     * </ul>
     * 
     * @param launchPath
     *        Location of the server executable in a custom game build or the name of the Realtime script file that
     *        contains the <code>Init()</code> function. Game builds and Realtime scripts are installed on instances at
     *        the root: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Windows (for custom game builds only): <code>C:\game</code>. Example: "
     *        <code>C:\game\MyGame\server.exe</code>"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Linux: <code>/local/game</code>. Examples: "<code>/local/game/MyGame/server.exe</code>" or "
     *        <code>/local/game/MyRealtimeScript.js</code>"
     *        </p>
     *        </li>
     */

    public void setLaunchPath(String launchPath) {
        this.launchPath = launchPath;
    }

    /**
     * <p>
     * Location of the server executable in a custom game build or the name of the Realtime script file that contains
     * the <code>Init()</code> function. Game builds and Realtime scripts are installed on instances at the root:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Windows (for custom game builds only): <code>C:\game</code>. Example: "<code>C:\game\MyGame\server.exe</code>"
     * </p>
     * </li>
     * <li>
     * <p>
     * Linux: <code>/local/game</code>. Examples: "<code>/local/game/MyGame/server.exe</code>" or "
     * <code>/local/game/MyRealtimeScript.js</code>"
     * </p>
     * </li>
     * </ul>
     * 
     * @return Location of the server executable in a custom game build or the name of the Realtime script file that
     *         contains the <code>Init()</code> function. Game builds and Realtime scripts are installed on instances at
     *         the root: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Windows (for custom game builds only): <code>C:\game</code>. Example: "
     *         <code>C:\game\MyGame\server.exe</code>"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Linux: <code>/local/game</code>. Examples: "<code>/local/game/MyGame/server.exe</code>" or "
     *         <code>/local/game/MyRealtimeScript.js</code>"
     *         </p>
     *         </li>
     */

    public String getLaunchPath() {
        return this.launchPath;
    }

    /**
     * <p>
     * Location of the server executable in a custom game build or the name of the Realtime script file that contains
     * the <code>Init()</code> function. Game builds and Realtime scripts are installed on instances at the root:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Windows (for custom game builds only): <code>C:\game</code>. Example: "<code>C:\game\MyGame\server.exe</code>"
     * </p>
     * </li>
     * <li>
     * <p>
     * Linux: <code>/local/game</code>. Examples: "<code>/local/game/MyGame/server.exe</code>" or "
     * <code>/local/game/MyRealtimeScript.js</code>"
     * </p>
     * </li>
     * </ul>
     * 
     * @param launchPath
     *        Location of the server executable in a custom game build or the name of the Realtime script file that
     *        contains the <code>Init()</code> function. Game builds and Realtime scripts are installed on instances at
     *        the root: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Windows (for custom game builds only): <code>C:\game</code>. Example: "
     *        <code>C:\game\MyGame\server.exe</code>"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Linux: <code>/local/game</code>. Examples: "<code>/local/game/MyGame/server.exe</code>" or "
     *        <code>/local/game/MyRealtimeScript.js</code>"
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerProcess withLaunchPath(String launchPath) {
        setLaunchPath(launchPath);
        return this;
    }

    /**
     * <p>
     * Optional list of parameters to pass to the server executable or Realtime script on launch.
     * </p>
     * 
     * @param parameters
     *        Optional list of parameters to pass to the server executable or Realtime script on launch.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Optional list of parameters to pass to the server executable or Realtime script on launch.
     * </p>
     * 
     * @return Optional list of parameters to pass to the server executable or Realtime script on launch.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * Optional list of parameters to pass to the server executable or Realtime script on launch.
     * </p>
     * 
     * @param parameters
     *        Optional list of parameters to pass to the server executable or Realtime script on launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerProcess withParameters(String parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * Number of server processes using this configuration to run concurrently on an instance.
     * </p>
     * 
     * @param concurrentExecutions
     *        Number of server processes using this configuration to run concurrently on an instance.
     */

    public void setConcurrentExecutions(Integer concurrentExecutions) {
        this.concurrentExecutions = concurrentExecutions;
    }

    /**
     * <p>
     * Number of server processes using this configuration to run concurrently on an instance.
     * </p>
     * 
     * @return Number of server processes using this configuration to run concurrently on an instance.
     */

    public Integer getConcurrentExecutions() {
        return this.concurrentExecutions;
    }

    /**
     * <p>
     * Number of server processes using this configuration to run concurrently on an instance.
     * </p>
     * 
     * @param concurrentExecutions
     *        Number of server processes using this configuration to run concurrently on an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerProcess withConcurrentExecutions(Integer concurrentExecutions) {
        setConcurrentExecutions(concurrentExecutions);
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
        if (getLaunchPath() != null)
            sb.append("LaunchPath: ").append(getLaunchPath()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getConcurrentExecutions() != null)
            sb.append("ConcurrentExecutions: ").append(getConcurrentExecutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerProcess == false)
            return false;
        ServerProcess other = (ServerProcess) obj;
        if (other.getLaunchPath() == null ^ this.getLaunchPath() == null)
            return false;
        if (other.getLaunchPath() != null && other.getLaunchPath().equals(this.getLaunchPath()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getConcurrentExecutions() == null ^ this.getConcurrentExecutions() == null)
            return false;
        if (other.getConcurrentExecutions() != null && other.getConcurrentExecutions().equals(this.getConcurrentExecutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchPath() == null) ? 0 : getLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getConcurrentExecutions() == null) ? 0 : getConcurrentExecutions().hashCode());
        return hashCode;
    }

    @Override
    public ServerProcess clone() {
        try {
            return (ServerProcess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ServerProcessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
