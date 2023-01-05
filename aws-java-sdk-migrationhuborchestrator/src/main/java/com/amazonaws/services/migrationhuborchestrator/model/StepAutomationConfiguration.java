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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The custom script to run tests on source or target environments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StepAutomationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepAutomationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket where the script is located.
     * </p>
     */
    private String scriptLocationS3Bucket;
    /**
     * <p>
     * The Amazon S3 key for the script location.
     * </p>
     */
    private PlatformScriptKey scriptLocationS3Key;
    /**
     * <p>
     * The command to run the script.
     * </p>
     */
    private PlatformCommand command;
    /**
     * <p>
     * The source or target environment.
     * </p>
     */
    private String runEnvironment;
    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     */
    private String targetType;

    /**
     * <p>
     * The Amazon S3 bucket where the script is located.
     * </p>
     * 
     * @param scriptLocationS3Bucket
     *        The Amazon S3 bucket where the script is located.
     */

    public void setScriptLocationS3Bucket(String scriptLocationS3Bucket) {
        this.scriptLocationS3Bucket = scriptLocationS3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the script is located.
     * </p>
     * 
     * @return The Amazon S3 bucket where the script is located.
     */

    public String getScriptLocationS3Bucket() {
        return this.scriptLocationS3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the script is located.
     * </p>
     * 
     * @param scriptLocationS3Bucket
     *        The Amazon S3 bucket where the script is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAutomationConfiguration withScriptLocationS3Bucket(String scriptLocationS3Bucket) {
        setScriptLocationS3Bucket(scriptLocationS3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key for the script location.
     * </p>
     * 
     * @param scriptLocationS3Key
     *        The Amazon S3 key for the script location.
     */

    public void setScriptLocationS3Key(PlatformScriptKey scriptLocationS3Key) {
        this.scriptLocationS3Key = scriptLocationS3Key;
    }

    /**
     * <p>
     * The Amazon S3 key for the script location.
     * </p>
     * 
     * @return The Amazon S3 key for the script location.
     */

    public PlatformScriptKey getScriptLocationS3Key() {
        return this.scriptLocationS3Key;
    }

    /**
     * <p>
     * The Amazon S3 key for the script location.
     * </p>
     * 
     * @param scriptLocationS3Key
     *        The Amazon S3 key for the script location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAutomationConfiguration withScriptLocationS3Key(PlatformScriptKey scriptLocationS3Key) {
        setScriptLocationS3Key(scriptLocationS3Key);
        return this;
    }

    /**
     * <p>
     * The command to run the script.
     * </p>
     * 
     * @param command
     *        The command to run the script.
     */

    public void setCommand(PlatformCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * The command to run the script.
     * </p>
     * 
     * @return The command to run the script.
     */

    public PlatformCommand getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The command to run the script.
     * </p>
     * 
     * @param command
     *        The command to run the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAutomationConfiguration withCommand(PlatformCommand command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The source or target environment.
     * </p>
     * 
     * @param runEnvironment
     *        The source or target environment.
     * @see RunEnvironment
     */

    public void setRunEnvironment(String runEnvironment) {
        this.runEnvironment = runEnvironment;
    }

    /**
     * <p>
     * The source or target environment.
     * </p>
     * 
     * @return The source or target environment.
     * @see RunEnvironment
     */

    public String getRunEnvironment() {
        return this.runEnvironment;
    }

    /**
     * <p>
     * The source or target environment.
     * </p>
     * 
     * @param runEnvironment
     *        The source or target environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunEnvironment
     */

    public StepAutomationConfiguration withRunEnvironment(String runEnvironment) {
        setRunEnvironment(runEnvironment);
        return this;
    }

    /**
     * <p>
     * The source or target environment.
     * </p>
     * 
     * @param runEnvironment
     *        The source or target environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunEnvironment
     */

    public StepAutomationConfiguration withRunEnvironment(RunEnvironment runEnvironment) {
        this.runEnvironment = runEnvironment.toString();
        return this;
    }

    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     * 
     * @param targetType
     *        The servers on which to run the script.
     * @see TargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     * 
     * @return The servers on which to run the script.
     * @see TargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     * 
     * @param targetType
     *        The servers on which to run the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public StepAutomationConfiguration withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     * 
     * @param targetType
     *        The servers on which to run the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public StepAutomationConfiguration withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
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
        if (getScriptLocationS3Bucket() != null)
            sb.append("ScriptLocationS3Bucket: ").append(getScriptLocationS3Bucket()).append(",");
        if (getScriptLocationS3Key() != null)
            sb.append("ScriptLocationS3Key: ").append(getScriptLocationS3Key()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getRunEnvironment() != null)
            sb.append("RunEnvironment: ").append(getRunEnvironment()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepAutomationConfiguration == false)
            return false;
        StepAutomationConfiguration other = (StepAutomationConfiguration) obj;
        if (other.getScriptLocationS3Bucket() == null ^ this.getScriptLocationS3Bucket() == null)
            return false;
        if (other.getScriptLocationS3Bucket() != null && other.getScriptLocationS3Bucket().equals(this.getScriptLocationS3Bucket()) == false)
            return false;
        if (other.getScriptLocationS3Key() == null ^ this.getScriptLocationS3Key() == null)
            return false;
        if (other.getScriptLocationS3Key() != null && other.getScriptLocationS3Key().equals(this.getScriptLocationS3Key()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getRunEnvironment() == null ^ this.getRunEnvironment() == null)
            return false;
        if (other.getRunEnvironment() != null && other.getRunEnvironment().equals(this.getRunEnvironment()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScriptLocationS3Bucket() == null) ? 0 : getScriptLocationS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getScriptLocationS3Key() == null) ? 0 : getScriptLocationS3Key().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getRunEnvironment() == null) ? 0 : getRunEnvironment().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public StepAutomationConfiguration clone() {
        try {
            return (StepAutomationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.StepAutomationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
