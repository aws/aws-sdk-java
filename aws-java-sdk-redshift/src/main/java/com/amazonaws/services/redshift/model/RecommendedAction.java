/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The recommended action from the Amazon Redshift Advisor recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RecommendedAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendedAction implements Serializable, Cloneable {

    /**
     * <p>
     * The specific instruction about the command.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The database name to perform the action on. Only applicable if the type of command is SQL.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The command to run.
     * </p>
     */
    private String command;
    /**
     * <p>
     * The type of command.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The specific instruction about the command.
     * </p>
     * 
     * @param text
     *        The specific instruction about the command.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The specific instruction about the command.
     * </p>
     * 
     * @return The specific instruction about the command.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The specific instruction about the command.
     * </p>
     * 
     * @param text
     *        The specific instruction about the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The database name to perform the action on. Only applicable if the type of command is SQL.
     * </p>
     * 
     * @param database
     *        The database name to perform the action on. Only applicable if the type of command is SQL.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The database name to perform the action on. Only applicable if the type of command is SQL.
     * </p>
     * 
     * @return The database name to perform the action on. Only applicable if the type of command is SQL.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database name to perform the action on. Only applicable if the type of command is SQL.
     * </p>
     * 
     * @param database
     *        The database name to perform the action on. Only applicable if the type of command is SQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The command to run.
     * </p>
     * 
     * @param command
     *        The command to run.
     */

    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * <p>
     * The command to run.
     * </p>
     * 
     * @return The command to run.
     */

    public String getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The command to run.
     * </p>
     * 
     * @param command
     *        The command to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withCommand(String command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The type of command.
     * </p>
     * 
     * @param type
     *        The type of command.
     * @see RecommendedActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of command.
     * </p>
     * 
     * @return The type of command.
     * @see RecommendedActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of command.
     * </p>
     * 
     * @param type
     *        The type of command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendedActionType
     */

    public RecommendedAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of command.
     * </p>
     * 
     * @param type
     *        The type of command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendedActionType
     */

    public RecommendedAction withType(RecommendedActionType type) {
        this.type = type.toString();
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendedAction == false)
            return false;
        RecommendedAction other = (RecommendedAction) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RecommendedAction clone() {
        try {
            return (RecommendedAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
