/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * Describes plugin details.
 */
public class CommandPlugin implements Serializable, Cloneable {

    /**
     * The name of the plugin. Must be one of the following: aws:updateAgent,
     * aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule,
     * aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     */
    private String name;
    /**
     * The status of this plugin. You can execute a document with multiple
     * plugins.
     */
    private String status;
    /** A numeric response code generated after executing the plugin. */
    private Integer responseCode;
    /** The time the plugin started executing. */
    private java.util.Date responseStartDateTime;
    /**
     * The time the plugin stopped executing. Could stop prematurely if, for
     * example, a cancel command was sent.
     */
    private java.util.Date responseFinishDateTime;
    /** Output of the plugin execution. */
    private String output;
    /**
     * The S3 bucket where the responses to the command executions should be
     * stored. This was requested when issuing the command.
     */
    private String outputS3BucketName;
    /**
     * The S3 directory path inside the bucket where the responses to the
     * command executions should be stored. This was requested when issuing the
     * command.
     */
    private String outputS3KeyPrefix;

    /**
     * The name of the plugin. Must be one of the following: aws:updateAgent,
     * aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule,
     * aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * 
     * @param name
     *        The name of the plugin. Must be one of the following:
     *        aws:updateAgent, aws:domainjoin, aws:applications,
     *        aws:runPowerShellScript, aws:psmodule, aws:cloudWatch,
     *        aws:runShellScript, or aws:updateSSMAgent.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the plugin. Must be one of the following: aws:updateAgent,
     * aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule,
     * aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * 
     * @return The name of the plugin. Must be one of the following:
     *         aws:updateAgent, aws:domainjoin, aws:applications,
     *         aws:runPowerShellScript, aws:psmodule, aws:cloudWatch,
     *         aws:runShellScript, or aws:updateSSMAgent.
     */
    public String getName() {
        return this.name;
    }

    /**
     * The name of the plugin. Must be one of the following: aws:updateAgent,
     * aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule,
     * aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * 
     * @param name
     *        The name of the plugin. Must be one of the following:
     *        aws:updateAgent, aws:domainjoin, aws:applications,
     *        aws:runPowerShellScript, aws:psmodule, aws:cloudWatch,
     *        aws:runShellScript, or aws:updateSSMAgent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The status of this plugin. You can execute a document with multiple
     * plugins.
     * 
     * @param status
     *        The status of this plugin. You can execute a document with
     *        multiple plugins.
     * @see CommandPluginStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The status of this plugin. You can execute a document with multiple
     * plugins.
     * 
     * @return The status of this plugin. You can execute a document with
     *         multiple plugins.
     * @see CommandPluginStatus
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * The status of this plugin. You can execute a document with multiple
     * plugins.
     * 
     * @param status
     *        The status of this plugin. You can execute a document with
     *        multiple plugins.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CommandPluginStatus
     */
    public CommandPlugin withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * The status of this plugin. You can execute a document with multiple
     * plugins.
     * 
     * @param status
     *        The status of this plugin. You can execute a document with
     *        multiple plugins.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CommandPluginStatus
     */
    public void setStatus(CommandPluginStatus status) {
        this.status = status.toString();
    }

    /**
     * The status of this plugin. You can execute a document with multiple
     * plugins.
     * 
     * @param status
     *        The status of this plugin. You can execute a document with
     *        multiple plugins.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CommandPluginStatus
     */
    public CommandPlugin withStatus(CommandPluginStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * A numeric response code generated after executing the plugin.
     * 
     * @param responseCode
     *        A numeric response code generated after executing the plugin.
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * A numeric response code generated after executing the plugin.
     * 
     * @return A numeric response code generated after executing the plugin.
     */
    public Integer getResponseCode() {
        return this.responseCode;
    }

    /**
     * A numeric response code generated after executing the plugin.
     * 
     * @param responseCode
     *        A numeric response code generated after executing the plugin.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withResponseCode(Integer responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * The time the plugin started executing.
     * 
     * @param responseStartDateTime
     *        The time the plugin started executing.
     */
    public void setResponseStartDateTime(java.util.Date responseStartDateTime) {
        this.responseStartDateTime = responseStartDateTime;
    }

    /**
     * The time the plugin started executing.
     * 
     * @return The time the plugin started executing.
     */
    public java.util.Date getResponseStartDateTime() {
        return this.responseStartDateTime;
    }

    /**
     * The time the plugin started executing.
     * 
     * @param responseStartDateTime
     *        The time the plugin started executing.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withResponseStartDateTime(
            java.util.Date responseStartDateTime) {
        setResponseStartDateTime(responseStartDateTime);
        return this;
    }

    /**
     * The time the plugin stopped executing. Could stop prematurely if, for
     * example, a cancel command was sent.
     * 
     * @param responseFinishDateTime
     *        The time the plugin stopped executing. Could stop prematurely if,
     *        for example, a cancel command was sent.
     */
    public void setResponseFinishDateTime(java.util.Date responseFinishDateTime) {
        this.responseFinishDateTime = responseFinishDateTime;
    }

    /**
     * The time the plugin stopped executing. Could stop prematurely if, for
     * example, a cancel command was sent.
     * 
     * @return The time the plugin stopped executing. Could stop prematurely if,
     *         for example, a cancel command was sent.
     */
    public java.util.Date getResponseFinishDateTime() {
        return this.responseFinishDateTime;
    }

    /**
     * The time the plugin stopped executing. Could stop prematurely if, for
     * example, a cancel command was sent.
     * 
     * @param responseFinishDateTime
     *        The time the plugin stopped executing. Could stop prematurely if,
     *        for example, a cancel command was sent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withResponseFinishDateTime(
            java.util.Date responseFinishDateTime) {
        setResponseFinishDateTime(responseFinishDateTime);
        return this;
    }

    /**
     * Output of the plugin execution.
     * 
     * @param output
     *        Output of the plugin execution.
     */
    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * Output of the plugin execution.
     * 
     * @return Output of the plugin execution.
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * Output of the plugin execution.
     * 
     * @param output
     *        Output of the plugin execution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * The S3 bucket where the responses to the command executions should be
     * stored. This was requested when issuing the command.
     * 
     * @param outputS3BucketName
     *        The S3 bucket where the responses to the command executions should
     *        be stored. This was requested when issuing the command.
     */
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * The S3 bucket where the responses to the command executions should be
     * stored. This was requested when issuing the command.
     * 
     * @return The S3 bucket where the responses to the command executions
     *         should be stored. This was requested when issuing the command.
     */
    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * The S3 bucket where the responses to the command executions should be
     * stored. This was requested when issuing the command.
     * 
     * @param outputS3BucketName
     *        The S3 bucket where the responses to the command executions should
     *        be stored. This was requested when issuing the command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * The S3 directory path inside the bucket where the responses to the
     * command executions should be stored. This was requested when issuing the
     * command.
     * 
     * @param outputS3KeyPrefix
     *        The S3 directory path inside the bucket where the responses to the
     *        command executions should be stored. This was requested when
     *        issuing the command.
     */
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * The S3 directory path inside the bucket where the responses to the
     * command executions should be stored. This was requested when issuing the
     * command.
     * 
     * @return The S3 directory path inside the bucket where the responses to
     *         the command executions should be stored. This was requested when
     *         issuing the command.
     */
    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * The S3 directory path inside the bucket where the responses to the
     * command executions should be stored. This was requested when issuing the
     * command.
     * 
     * @param outputS3KeyPrefix
     *        The S3 directory path inside the bucket where the responses to the
     *        command executions should be stored. This was requested when
     *        issuing the command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: " + getResponseCode() + ",");
        if (getResponseStartDateTime() != null)
            sb.append("ResponseStartDateTime: " + getResponseStartDateTime()
                    + ",");
        if (getResponseFinishDateTime() != null)
            sb.append("ResponseFinishDateTime: " + getResponseFinishDateTime()
                    + ",");
        if (getOutput() != null)
            sb.append("Output: " + getOutput() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommandPlugin == false)
            return false;
        CommandPlugin other = (CommandPlugin) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null
                && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getResponseStartDateTime() == null
                ^ this.getResponseStartDateTime() == null)
            return false;
        if (other.getResponseStartDateTime() != null
                && other.getResponseStartDateTime().equals(
                        this.getResponseStartDateTime()) == false)
            return false;
        if (other.getResponseFinishDateTime() == null
                ^ this.getResponseFinishDateTime() == null)
            return false;
        if (other.getResponseFinishDateTime() != null
                && other.getResponseFinishDateTime().equals(
                        this.getResponseFinishDateTime()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null
                && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getOutputS3BucketName() == null
                ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null
                && other.getOutputS3BucketName().equals(
                        this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null
                ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null
                && other.getOutputS3KeyPrefix().equals(
                        this.getOutputS3KeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseCode() == null) ? 0 : getResponseCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseStartDateTime() == null) ? 0
                        : getResponseStartDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseFinishDateTime() == null) ? 0
                        : getResponseFinishDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputS3BucketName() == null) ? 0
                        : getOutputS3BucketName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputS3KeyPrefix() == null) ? 0
                        : getOutputS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public CommandPlugin clone() {
        try {
            return (CommandPlugin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}