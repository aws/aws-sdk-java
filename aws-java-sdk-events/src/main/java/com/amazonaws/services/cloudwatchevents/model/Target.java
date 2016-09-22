/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;

/**
 * <p>
 * Targets are the resources that can be invoked when a rule is triggered. For example, AWS Lambda functions, Amazon
 * Kinesis streams, and built-in targets.
 * </p>
 * <p>
 * <b>Input</b> and <b>InputPath</b> are mutually-exclusive and optional parameters of a target. When a rule is
 * triggered due to a matched event, if for a target:
 * </p>
 * <ul>
 * <li>Neither <b>Input</b> nor <b>InputPath</b> is specified, then the entire event is passed to the target in JSON
 * form.</li>
 * <li><b>InputPath</b> is specified in the form of JSONPath (e.g. <b>$.detail</b>), then only the part of the event
 * specified in the path is passed to the target (e.g. only the detail part of the event is passed).</li>
 * <li><b>Input</b> is specified in the form of a valid JSON, then the matched event is overridden with this constant.</li>
 * </ul>
 */
public class Target implements Serializable, Cloneable {

    /**
     * <p>
     * The unique target assignment ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated of the target.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Valid JSON text passed to the target. For more information about JSON text, see <a
     * href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON) Data Interchange
     * Format</a>.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target.
     * For more information about JSON paths, see <a href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * </p>
     */
    private String inputPath;

    /**
     * <p>
     * The unique target assignment ID.
     * </p>
     * 
     * @param id
     *        The unique target assignment ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique target assignment ID.
     * </p>
     * 
     * @return The unique target assignment ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique target assignment ID.
     * </p>
     * 
     * @param id
     *        The unique target assignment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated of the target.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) associated of the target.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated of the target.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated of the target.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated of the target.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) associated of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Valid JSON text passed to the target. For more information about JSON text, see <a
     * href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON) Data Interchange
     * Format</a>.
     * </p>
     * 
     * @param input
     *        Valid JSON text passed to the target. For more information about JSON text, see <a
     *        href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON) Data Interchange
     *        Format</a>.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * Valid JSON text passed to the target. For more information about JSON text, see <a
     * href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON) Data Interchange
     * Format</a>.
     * </p>
     * 
     * @return Valid JSON text passed to the target. For more information about JSON text, see <a
     *         href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON) Data Interchange
     *         Format</a>.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * Valid JSON text passed to the target. For more information about JSON text, see <a
     * href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON) Data Interchange
     * Format</a>.
     * </p>
     * 
     * @param input
     *        Valid JSON text passed to the target. For more information about JSON text, see <a
     *        href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON) Data Interchange
     *        Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target.
     * For more information about JSON paths, see <a href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * </p>
     * 
     * @param inputPath
     *        The value of the JSONPath that is used for extracting part of the matched event when passing it to the
     *        target. For more information about JSON paths, see <a
     *        href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     */

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    /**
     * <p>
     * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target.
     * For more information about JSON paths, see <a href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * </p>
     * 
     * @return The value of the JSONPath that is used for extracting part of the matched event when passing it to the
     *         target. For more information about JSON paths, see <a
     *         href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     */

    public String getInputPath() {
        return this.inputPath;
    }

    /**
     * <p>
     * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target.
     * For more information about JSON paths, see <a href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * </p>
     * 
     * @param inputPath
     *        The value of the JSONPath that is used for extracting part of the matched event when passing it to the
     *        target. For more information about JSON paths, see <a
     *        href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withInputPath(String inputPath) {
        setInputPath(inputPath);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getInputPath() != null)
            sb.append("InputPath: " + getInputPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getInputPath() == null ^ this.getInputPath() == null)
            return false;
        if (other.getInputPath() != null && other.getInputPath().equals(this.getInputPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getInputPath() == null) ? 0 : getInputPath().hashCode());
        return hashCode;
    }

    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
