/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Diagnostic information about executable scripts that are part of a
 * deployment.
 * </p>
 */
public class Diagnostics implements Serializable {

    /**
     * The associated error code: <ul> <li>Success: The specified script
     * ran.</li> <li>ScriptMissing: The specified script was not found in the
     * specified location.</li> <li>ScriptNotExecutable: The specified script
     * is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     * specified script did not finish running in the specified time
     * period.</li> <li>ScriptFailed: The specified script failed to run as
     * expected.</li> <li>UnknownError: The specified script did not run for
     * an unknown reason.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError
     */
    private String errorCode;

    /**
     * The name of the script.
     */
    private String scriptName;

    /**
     * The message associated with the error.
     */
    private String message;

    /**
     * The last portion of the associated diagnostic log.
     */
    private String logTail;

    /**
     * The associated error code: <ul> <li>Success: The specified script
     * ran.</li> <li>ScriptMissing: The specified script was not found in the
     * specified location.</li> <li>ScriptNotExecutable: The specified script
     * is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     * specified script did not finish running in the specified time
     * period.</li> <li>ScriptFailed: The specified script failed to run as
     * expected.</li> <li>UnknownError: The specified script did not run for
     * an unknown reason.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @return The associated error code: <ul> <li>Success: The specified script
     *         ran.</li> <li>ScriptMissing: The specified script was not found in the
     *         specified location.</li> <li>ScriptNotExecutable: The specified script
     *         is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     *         specified script did not finish running in the specified time
     *         period.</li> <li>ScriptFailed: The specified script failed to run as
     *         expected.</li> <li>UnknownError: The specified script did not run for
     *         an unknown reason.</li> </ul>
     *
     * @see LifecycleErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }
    
    /**
     * The associated error code: <ul> <li>Success: The specified script
     * ran.</li> <li>ScriptMissing: The specified script was not found in the
     * specified location.</li> <li>ScriptNotExecutable: The specified script
     * is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     * specified script did not finish running in the specified time
     * period.</li> <li>ScriptFailed: The specified script failed to run as
     * expected.</li> <li>UnknownError: The specified script did not run for
     * an unknown reason.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @param errorCode The associated error code: <ul> <li>Success: The specified script
     *         ran.</li> <li>ScriptMissing: The specified script was not found in the
     *         specified location.</li> <li>ScriptNotExecutable: The specified script
     *         is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     *         specified script did not finish running in the specified time
     *         period.</li> <li>ScriptFailed: The specified script failed to run as
     *         expected.</li> <li>UnknownError: The specified script did not run for
     *         an unknown reason.</li> </ul>
     *
     * @see LifecycleErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    /**
     * The associated error code: <ul> <li>Success: The specified script
     * ran.</li> <li>ScriptMissing: The specified script was not found in the
     * specified location.</li> <li>ScriptNotExecutable: The specified script
     * is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     * specified script did not finish running in the specified time
     * period.</li> <li>ScriptFailed: The specified script failed to run as
     * expected.</li> <li>UnknownError: The specified script did not run for
     * an unknown reason.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @param errorCode The associated error code: <ul> <li>Success: The specified script
     *         ran.</li> <li>ScriptMissing: The specified script was not found in the
     *         specified location.</li> <li>ScriptNotExecutable: The specified script
     *         is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     *         specified script did not finish running in the specified time
     *         period.</li> <li>ScriptFailed: The specified script failed to run as
     *         expected.</li> <li>UnknownError: The specified script did not run for
     *         an unknown reason.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LifecycleErrorCode
     */
    public Diagnostics withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * The associated error code: <ul> <li>Success: The specified script
     * ran.</li> <li>ScriptMissing: The specified script was not found in the
     * specified location.</li> <li>ScriptNotExecutable: The specified script
     * is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     * specified script did not finish running in the specified time
     * period.</li> <li>ScriptFailed: The specified script failed to run as
     * expected.</li> <li>UnknownError: The specified script did not run for
     * an unknown reason.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @param errorCode The associated error code: <ul> <li>Success: The specified script
     *         ran.</li> <li>ScriptMissing: The specified script was not found in the
     *         specified location.</li> <li>ScriptNotExecutable: The specified script
     *         is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     *         specified script did not finish running in the specified time
     *         period.</li> <li>ScriptFailed: The specified script failed to run as
     *         expected.</li> <li>UnknownError: The specified script did not run for
     *         an unknown reason.</li> </ul>
     *
     * @see LifecycleErrorCode
     */
    public void setErrorCode(LifecycleErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }
    
    /**
     * The associated error code: <ul> <li>Success: The specified script
     * ran.</li> <li>ScriptMissing: The specified script was not found in the
     * specified location.</li> <li>ScriptNotExecutable: The specified script
     * is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     * specified script did not finish running in the specified time
     * period.</li> <li>ScriptFailed: The specified script failed to run as
     * expected.</li> <li>UnknownError: The specified script did not run for
     * an unknown reason.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable, ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @param errorCode The associated error code: <ul> <li>Success: The specified script
     *         ran.</li> <li>ScriptMissing: The specified script was not found in the
     *         specified location.</li> <li>ScriptNotExecutable: The specified script
     *         is not a recognized executable file type.</li> <li>ScriptTimedOut: The
     *         specified script did not finish running in the specified time
     *         period.</li> <li>ScriptFailed: The specified script failed to run as
     *         expected.</li> <li>UnknownError: The specified script did not run for
     *         an unknown reason.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LifecycleErrorCode
     */
    public Diagnostics withErrorCode(LifecycleErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * The name of the script.
     *
     * @return The name of the script.
     */
    public String getScriptName() {
        return scriptName;
    }
    
    /**
     * The name of the script.
     *
     * @param scriptName The name of the script.
     */
    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }
    
    /**
     * The name of the script.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scriptName The name of the script.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Diagnostics withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * The message associated with the error.
     *
     * @return The message associated with the error.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The message associated with the error.
     *
     * @param message The message associated with the error.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The message associated with the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The message associated with the error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Diagnostics withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The last portion of the associated diagnostic log.
     *
     * @return The last portion of the associated diagnostic log.
     */
    public String getLogTail() {
        return logTail;
    }
    
    /**
     * The last portion of the associated diagnostic log.
     *
     * @param logTail The last portion of the associated diagnostic log.
     */
    public void setLogTail(String logTail) {
        this.logTail = logTail;
    }
    
    /**
     * The last portion of the associated diagnostic log.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logTail The last portion of the associated diagnostic log.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Diagnostics withLogTail(String logTail) {
        this.logTail = logTail;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getErrorCode() != null) sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getScriptName() != null) sb.append("ScriptName: " + getScriptName() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getLogTail() != null) sb.append("LogTail: " + getLogTail() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode()); 
        hashCode = prime * hashCode + ((getScriptName() == null) ? 0 : getScriptName().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getLogTail() == null) ? 0 : getLogTail().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Diagnostics == false) return false;
        Diagnostics other = (Diagnostics)obj;
        
        if (other.getErrorCode() == null ^ this.getErrorCode() == null) return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false) return false; 
        if (other.getScriptName() == null ^ this.getScriptName() == null) return false;
        if (other.getScriptName() != null && other.getScriptName().equals(this.getScriptName()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getLogTail() == null ^ this.getLogTail() == null) return false;
        if (other.getLogTail() != null && other.getLogTail().equals(this.getLogTail()) == false) return false; 
        return true;
    }
    
}
    